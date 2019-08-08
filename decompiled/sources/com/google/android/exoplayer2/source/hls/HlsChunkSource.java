package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.google.android.exoplayer2.source.chunk.DataChunk;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.trackselection.BaseTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

class HlsChunkSource {
    private final DataSource encryptionDataSource;
    private byte[] encryptionIv;
    private String encryptionIvString;
    private byte[] encryptionKey;
    private Uri encryptionKeyUri;
    private HlsUrl expectedPlaylistUrl;
    private final HlsExtractorFactory extractorFactory;
    private IOException fatalError;
    private boolean independentSegments;
    private boolean isTimestampMaster;
    private long liveEdgeInPeriodTimeUs = C2793C.TIME_UNSET;
    private final DataSource mediaDataSource;
    private final List<Format> muxedCaptionFormats;
    private final HlsPlaylistTracker playlistTracker;
    private byte[] scratchSpace;
    private boolean seenExpectedPlaylistError;
    private final TimestampAdjusterProvider timestampAdjusterProvider;
    private final TrackGroup trackGroup;
    private TrackSelection trackSelection;
    private final HlsUrl[] variants;

    private static final class EncryptionKeyChunk extends DataChunk {

        /* renamed from: iv */
        public final String f8650iv;
        private byte[] result;

        public EncryptionKeyChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i, Object obj, byte[] bArr, String str) {
            super(dataSource, dataSpec, 3, format, i, obj, bArr);
            this.f8650iv = str;
        }

        /* access modifiers changed from: protected */
        public void consume(byte[] bArr, int i) throws IOException {
            this.result = Arrays.copyOf(bArr, i);
        }

        public byte[] getResult() {
            return this.result;
        }
    }

    public static final class HlsChunkHolder {
        public Chunk chunk;
        public boolean endOfStream;
        public HlsUrl playlist;

        public HlsChunkHolder() {
            clear();
        }

        public void clear() {
            this.chunk = null;
            this.endOfStream = false;
            this.playlist = null;
        }
    }

    private static final class InitializationTrackSelection extends BaseTrackSelection {
        private int selectedIndex;

        public Object getSelectionData() {
            return null;
        }

        public int getSelectionReason() {
            return 0;
        }

        public InitializationTrackSelection(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
            this.selectedIndex = indexOf(trackGroup.getFormat(0));
        }

        public void updateSelectedTrack(long j, long j2, long j3) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (isBlacklisted(this.selectedIndex, elapsedRealtime)) {
                for (int i = this.length - 1; i >= 0; i--) {
                    if (!isBlacklisted(i, elapsedRealtime)) {
                        this.selectedIndex = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        public int getSelectedIndex() {
            return this.selectedIndex;
        }
    }

    public HlsChunkSource(HlsExtractorFactory hlsExtractorFactory, HlsPlaylistTracker hlsPlaylistTracker, HlsUrl[] hlsUrlArr, HlsDataSourceFactory hlsDataSourceFactory, TimestampAdjusterProvider timestampAdjusterProvider2, List<Format> list) {
        this.extractorFactory = hlsExtractorFactory;
        this.playlistTracker = hlsPlaylistTracker;
        this.variants = hlsUrlArr;
        this.timestampAdjusterProvider = timestampAdjusterProvider2;
        this.muxedCaptionFormats = list;
        Format[] formatArr = new Format[hlsUrlArr.length];
        int[] iArr = new int[hlsUrlArr.length];
        for (int i = 0; i < hlsUrlArr.length; i++) {
            formatArr[i] = hlsUrlArr[i].format;
            iArr[i] = i;
        }
        this.mediaDataSource = hlsDataSourceFactory.createDataSource(1);
        this.encryptionDataSource = hlsDataSourceFactory.createDataSource(3);
        this.trackGroup = new TrackGroup(formatArr);
        this.trackSelection = new InitializationTrackSelection(this.trackGroup, iArr);
    }

    public void maybeThrowError() throws IOException {
        if (this.fatalError != null) {
            throw this.fatalError;
        } else if (this.expectedPlaylistUrl != null && this.seenExpectedPlaylistError) {
            this.playlistTracker.maybeThrowPlaylistRefreshError(this.expectedPlaylistUrl);
        }
    }

    public TrackGroup getTrackGroup() {
        return this.trackGroup;
    }

    public void selectTracks(TrackSelection trackSelection2) {
        this.trackSelection = trackSelection2;
    }

    public TrackSelection getTrackSelection() {
        return this.trackSelection;
    }

    public void reset() {
        this.fatalError = null;
    }

    public void setIsTimestampMaster(boolean z) {
        this.isTimestampMaster = z;
    }

    public void getNextChunk(HlsMediaChunk hlsMediaChunk, long j, long j2, HlsChunkHolder hlsChunkHolder) {
        int indexOf;
        long j3;
        long j4;
        long j5;
        HlsUrl hlsUrl;
        long j6;
        HlsMediaPlaylist hlsMediaPlaylist;
        HlsMediaChunk hlsMediaChunk2 = hlsMediaChunk;
        long j7 = j;
        HlsChunkHolder hlsChunkHolder2 = hlsChunkHolder;
        if (hlsMediaChunk2 == null) {
            indexOf = -1;
        } else {
            indexOf = this.trackGroup.indexOf(hlsMediaChunk2.trackFormat);
        }
        int i = indexOf;
        long j8 = j2 - j7;
        long resolveTimeToLiveEdgeUs = resolveTimeToLiveEdgeUs(j7);
        if (hlsMediaChunk2 == null || this.independentSegments) {
            j3 = resolveTimeToLiveEdgeUs;
            j4 = j8;
        } else {
            long durationUs = hlsMediaChunk.getDurationUs();
            long max = Math.max(0, j8 - durationUs);
            if (resolveTimeToLiveEdgeUs != C2793C.TIME_UNSET) {
                j4 = max;
                j3 = Math.max(0, resolveTimeToLiveEdgeUs - durationUs);
            } else {
                j4 = max;
                j3 = resolveTimeToLiveEdgeUs;
            }
        }
        this.trackSelection.updateSelectedTrack(j7, j4, j3);
        int selectedIndexInTrackGroup = this.trackSelection.getSelectedIndexInTrackGroup();
        boolean z = i != selectedIndexInTrackGroup;
        HlsUrl hlsUrl2 = this.variants[selectedIndexInTrackGroup];
        if (!this.playlistTracker.isSnapshotValid(hlsUrl2)) {
            hlsChunkHolder2.playlist = hlsUrl2;
            this.seenExpectedPlaylistError &= this.expectedPlaylistUrl == hlsUrl2;
            this.expectedPlaylistUrl = hlsUrl2;
            return;
        }
        HlsMediaPlaylist playlistSnapshot = this.playlistTracker.getPlaylistSnapshot(hlsUrl2);
        this.independentSegments = playlistSnapshot.hasIndependentSegmentsTag;
        updateLiveEdgeTimeUs(playlistSnapshot);
        long initialStartTimeUs = playlistSnapshot.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
        if (hlsMediaChunk2 == null || z) {
            long j9 = initialStartTimeUs + playlistSnapshot.durationUs;
            long j10 = (hlsMediaChunk2 == null || this.independentSegments) ? j2 : hlsMediaChunk2.startTimeUs;
            if (playlistSnapshot.hasEndTag || j10 < j9) {
                long binarySearchFloor = ((long) Util.binarySearchFloor(playlistSnapshot.segments, Long.valueOf(j10 - initialStartTimeUs), true, !this.playlistTracker.isLive() || hlsMediaChunk2 == null)) + playlistSnapshot.mediaSequence;
                if (binarySearchFloor >= playlistSnapshot.mediaSequence || hlsMediaChunk2 == null) {
                    i = selectedIndexInTrackGroup;
                    hlsMediaPlaylist = playlistSnapshot;
                    j6 = binarySearchFloor;
                } else {
                    hlsUrl2 = this.variants[i];
                    hlsMediaPlaylist = this.playlistTracker.getPlaylistSnapshot(hlsUrl2);
                    long initialStartTimeUs2 = hlsMediaPlaylist.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
                    j6 = hlsMediaChunk.getNextChunkIndex();
                    initialStartTimeUs = initialStartTimeUs2;
                }
            } else {
                i = selectedIndexInTrackGroup;
                hlsMediaPlaylist = playlistSnapshot;
                j6 = playlistSnapshot.mediaSequence + ((long) playlistSnapshot.segments.size());
            }
            hlsUrl = hlsUrl2;
            j5 = j6;
            playlistSnapshot = hlsMediaPlaylist;
        } else {
            j5 = hlsMediaChunk.getNextChunkIndex();
            hlsUrl = hlsUrl2;
            i = selectedIndexInTrackGroup;
        }
        if (j5 < playlistSnapshot.mediaSequence) {
            this.fatalError = new BehindLiveWindowException();
            return;
        }
        int i2 = (int) (j5 - playlistSnapshot.mediaSequence);
        if (i2 >= playlistSnapshot.segments.size()) {
            if (playlistSnapshot.hasEndTag) {
                hlsChunkHolder2.endOfStream = true;
            } else {
                boolean z2 = true;
                hlsChunkHolder2.playlist = hlsUrl;
                boolean z3 = this.seenExpectedPlaylistError;
                if (this.expectedPlaylistUrl != hlsUrl) {
                    z2 = false;
                }
                this.seenExpectedPlaylistError = z2 & z3;
                this.expectedPlaylistUrl = hlsUrl;
            }
            return;
        }
        this.seenExpectedPlaylistError = false;
        DataSpec dataSpec = null;
        this.expectedPlaylistUrl = null;
        Segment segment = (Segment) playlistSnapshot.segments.get(i2);
        if (segment.fullSegmentEncryptionKeyUri != null) {
            Uri resolveToUri = UriUtil.resolveToUri(playlistSnapshot.baseUri, segment.fullSegmentEncryptionKeyUri);
            if (!resolveToUri.equals(this.encryptionKeyUri)) {
                hlsChunkHolder2.chunk = newEncryptionKeyChunk(resolveToUri, segment.encryptionIV, i, this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData());
                return;
            } else if (!Util.areEqual(segment.encryptionIV, this.encryptionIvString)) {
                setEncryptionData(resolveToUri, segment.encryptionIV, this.encryptionKey);
            }
        } else {
            clearEncryptionData();
        }
        Segment segment2 = segment.initializationSegment;
        if (segment2 != null) {
            dataSpec = new DataSpec(UriUtil.resolveToUri(playlistSnapshot.baseUri, segment2.url), segment2.byterangeOffset, segment2.byterangeLength, null);
        }
        DataSpec dataSpec2 = dataSpec;
        long j11 = initialStartTimeUs + segment.relativeStartTimeUs;
        int i3 = playlistSnapshot.discontinuitySequence + segment.relativeDiscontinuitySequence;
        TimestampAdjuster adjuster = this.timestampAdjusterProvider.getAdjuster(i3);
        DataSpec dataSpec3 = new DataSpec(UriUtil.resolveToUri(playlistSnapshot.baseUri, segment.url), segment.byterangeOffset, segment.byterangeLength, null);
        HlsExtractorFactory hlsExtractorFactory = this.extractorFactory;
        DataSource dataSource = this.mediaDataSource;
        List<Format> list = this.muxedCaptionFormats;
        int selectionReason = this.trackSelection.getSelectionReason();
        Object selectionData = this.trackSelection.getSelectionData();
        int i4 = selectionReason;
        long j12 = j11 + segment.durationUs;
        boolean z4 = segment.hasGapTag;
        boolean z5 = this.isTimestampMaster;
        DrmInitData drmInitData = playlistSnapshot.drmInitData;
        byte[] bArr = this.encryptionKey;
        byte[] bArr2 = this.encryptionIv;
        HlsChunkHolder hlsChunkHolder3 = hlsChunkHolder;
        HlsMediaChunk hlsMediaChunk3 = new HlsMediaChunk(hlsExtractorFactory, dataSource, dataSpec3, dataSpec2, hlsUrl, list, i4, selectionData, j11, j12, j5, i3, z4, z5, adjuster, hlsMediaChunk2, drmInitData, bArr, bArr2);
        hlsChunkHolder3.chunk = hlsMediaChunk3;
    }

    public void onChunkLoadCompleted(Chunk chunk) {
        if (chunk instanceof EncryptionKeyChunk) {
            EncryptionKeyChunk encryptionKeyChunk = (EncryptionKeyChunk) chunk;
            this.scratchSpace = encryptionKeyChunk.getDataHolder();
            setEncryptionData(encryptionKeyChunk.dataSpec.uri, encryptionKeyChunk.f8650iv, encryptionKeyChunk.getResult());
        }
    }

    public boolean onChunkLoadError(Chunk chunk, boolean z, IOException iOException) {
        return z && ChunkedTrackBlacklistUtil.maybeBlacklistTrack(this.trackSelection, this.trackSelection.indexOf(this.trackGroup.indexOf(chunk.trackFormat)), iOException);
    }

    public boolean onPlaylistError(HlsUrl hlsUrl, boolean z) {
        int indexOf = this.trackGroup.indexOf(hlsUrl.format);
        boolean z2 = true;
        if (indexOf == -1) {
            return true;
        }
        int indexOf2 = this.trackSelection.indexOf(indexOf);
        if (indexOf2 == -1) {
            return true;
        }
        this.seenExpectedPlaylistError = (this.expectedPlaylistUrl == hlsUrl) | this.seenExpectedPlaylistError;
        if (z && !this.trackSelection.blacklist(indexOf2, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS)) {
            z2 = false;
        }
        return z2;
    }

    private long resolveTimeToLiveEdgeUs(long j) {
        if (this.liveEdgeInPeriodTimeUs != C2793C.TIME_UNSET) {
            return this.liveEdgeInPeriodTimeUs - j;
        }
        return C2793C.TIME_UNSET;
    }

    private void updateLiveEdgeTimeUs(HlsMediaPlaylist hlsMediaPlaylist) {
        long j;
        if (hlsMediaPlaylist.hasEndTag) {
            j = C2793C.TIME_UNSET;
        } else {
            j = hlsMediaPlaylist.getEndTimeUs() - this.playlistTracker.getInitialStartTimeUs();
        }
        this.liveEdgeInPeriodTimeUs = j;
    }

    private EncryptionKeyChunk newEncryptionKeyChunk(Uri uri, String str, int i, int i2, Object obj) {
        DataSpec dataSpec = new DataSpec(uri, 0, -1, null, 1);
        EncryptionKeyChunk encryptionKeyChunk = new EncryptionKeyChunk(this.encryptionDataSource, dataSpec, this.variants[i].format, i2, obj, this.scratchSpace, str);
        return encryptionKeyChunk;
    }

    private void setEncryptionData(Uri uri, String str, byte[] bArr) {
        byte[] byteArray = new BigInteger(Util.toLowerInvariant(str).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr2, (bArr2.length - byteArray.length) + length, byteArray.length - length);
        this.encryptionKeyUri = uri;
        this.encryptionKey = bArr;
        this.encryptionIvString = str;
        this.encryptionIv = bArr2;
    }

    private void clearEncryptionData() {
        this.encryptionKeyUri = null;
        this.encryptionKey = null;
        this.encryptionIvString = null;
        this.encryptionIv = null;
    }
}
