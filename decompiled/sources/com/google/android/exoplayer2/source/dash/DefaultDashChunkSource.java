package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper;
import com.google.android.exoplayer2.source.chunk.ChunkHolder;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.google.android.exoplayer2.source.chunk.ContainerMediaChunk;
import com.google.android.exoplayer2.source.chunk.InitializationChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.SingleSampleMediaChunk;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DefaultDashChunkSource implements DashChunkSource {
    private final int[] adaptationSetIndices;
    private final DataSource dataSource;
    private final long elapsedRealtimeOffsetMs;
    private IOException fatalError;
    private long liveEdgeTimeUs = C2793C.TIME_UNSET;
    private DashManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final int maxSegmentsPerLoad;
    private boolean missingLastSegment;
    private int periodIndex;
    private final PlayerTrackEmsgHandler playerTrackEmsgHandler;
    protected final RepresentationHolder[] representationHolders;
    private final TrackSelection trackSelection;
    private final int trackType;

    public static final class Factory implements com.google.android.exoplayer2.source.dash.DashChunkSource.Factory {
        private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
        private final int maxSegmentsPerLoad;

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory) {
            this(factory, 1);
        }

        public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory, int i) {
            this.dataSourceFactory = factory;
            this.maxSegmentsPerLoad = i;
        }

        public DashChunkSource createDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, int i, int[] iArr, TrackSelection trackSelection, int i2, long j, boolean z, boolean z2, PlayerTrackEmsgHandler playerTrackEmsgHandler) {
            DefaultDashChunkSource defaultDashChunkSource = new DefaultDashChunkSource(loaderErrorThrower, dashManifest, i, iArr, trackSelection, i2, this.dataSourceFactory.createDataSource(), j, this.maxSegmentsPerLoad, z, z2, playerTrackEmsgHandler);
            return defaultDashChunkSource;
        }
    }

    protected static final class RepresentationHolder {
        final ChunkExtractorWrapper extractorWrapper;
        private long periodDurationUs;
        public Representation representation;
        public DashSegmentIndex segmentIndex;
        private long segmentNumShift;

        /* JADX WARNING: type inference failed for: r9v4, types: [com.google.android.exoplayer2.extractor.Extractor] */
        /* JADX WARNING: type inference failed for: r9v12, types: [com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor] */
        /* JADX WARNING: type inference failed for: r9v13, types: [com.google.android.exoplayer2.extractor.rawcc.RawCcExtractor] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        RepresentationHolder(long r9, int r11, com.google.android.exoplayer2.source.dash.manifest.Representation r12, boolean r13, boolean r14, com.google.android.exoplayer2.extractor.TrackOutput r15) {
            /*
                r8 = this;
                r8.<init>()
                r8.periodDurationUs = r9
                r8.representation = r12
                com.google.android.exoplayer2.Format r9 = r12.format
                java.lang.String r9 = r9.containerMimeType
                boolean r10 = mimeTypeIsRawText(r9)
                r0 = 0
                if (r10 == 0) goto L_0x0015
                r8.extractorWrapper = r0
                goto L_0x005f
            L_0x0015:
                java.lang.String r10 = "application/x-rawcc"
                boolean r10 = r10.equals(r9)
                if (r10 == 0) goto L_0x0025
                com.google.android.exoplayer2.extractor.rawcc.RawCcExtractor r9 = new com.google.android.exoplayer2.extractor.rawcc.RawCcExtractor
                com.google.android.exoplayer2.Format r10 = r12.format
                r9.<init>(r10)
                goto L_0x0056
            L_0x0025:
                boolean r9 = mimeTypeIsWebm(r9)
                if (r9 == 0) goto L_0x0032
                com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r9 = new com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor
                r10 = 1
                r9.<init>(r10)
                goto L_0x0056
            L_0x0032:
                r9 = 0
                if (r13 == 0) goto L_0x0038
                r10 = 4
                r2 = r10
                goto L_0x0039
            L_0x0038:
                r2 = r9
            L_0x0039:
                if (r14 == 0) goto L_0x0047
                java.lang.String r10 = "application/cea-608"
                com.google.android.exoplayer2.Format r9 = com.google.android.exoplayer2.Format.createTextSampleFormat(r0, r10, r9, r0)
                java.util.List r9 = java.util.Collections.singletonList(r9)
            L_0x0045:
                r6 = r9
                goto L_0x004c
            L_0x0047:
                java.util.List r9 = java.util.Collections.emptyList()
                goto L_0x0045
            L_0x004c:
                com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor r9 = new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor
                r3 = 0
                r4 = 0
                r5 = 0
                r1 = r9
                r7 = r15
                r1.<init>(r2, r3, r4, r5, r6, r7)
            L_0x0056:
                com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper r10 = new com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper
                com.google.android.exoplayer2.Format r13 = r12.format
                r10.<init>(r9, r11, r13)
                r8.extractorWrapper = r10
            L_0x005f:
                com.google.android.exoplayer2.source.dash.DashSegmentIndex r9 = r12.getIndex()
                r8.segmentIndex = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.RepresentationHolder.<init>(long, int, com.google.android.exoplayer2.source.dash.manifest.Representation, boolean, boolean, com.google.android.exoplayer2.extractor.TrackOutput):void");
        }

        /* access modifiers changed from: 0000 */
        public void updateRepresentation(long j, Representation representation2) throws BehindLiveWindowException {
            DashSegmentIndex index = this.representation.getIndex();
            DashSegmentIndex index2 = representation2.getIndex();
            this.periodDurationUs = j;
            this.representation = representation2;
            if (index != null) {
                this.segmentIndex = index2;
                if (index.isExplicit()) {
                    int segmentCount = index.getSegmentCount(this.periodDurationUs);
                    if (segmentCount != 0) {
                        long firstSegmentNum = (index.getFirstSegmentNum() + ((long) segmentCount)) - 1;
                        long timeUs = index.getTimeUs(firstSegmentNum) + index.getDurationUs(firstSegmentNum, this.periodDurationUs);
                        long firstSegmentNum2 = index2.getFirstSegmentNum();
                        long timeUs2 = index2.getTimeUs(firstSegmentNum2);
                        if (timeUs == timeUs2) {
                            this.segmentNumShift += (firstSegmentNum + 1) - firstSegmentNum2;
                        } else if (timeUs < timeUs2) {
                            throw new BehindLiveWindowException();
                        } else {
                            this.segmentNumShift += index.getSegmentNum(timeUs2, this.periodDurationUs) - firstSegmentNum2;
                        }
                    }
                }
            }
        }

        public long getFirstSegmentNum() {
            return this.segmentIndex.getFirstSegmentNum() + this.segmentNumShift;
        }

        public int getSegmentCount() {
            return this.segmentIndex.getSegmentCount(this.periodDurationUs);
        }

        public long getSegmentStartTimeUs(long j) {
            return this.segmentIndex.getTimeUs(j - this.segmentNumShift);
        }

        public long getSegmentEndTimeUs(long j) {
            return getSegmentStartTimeUs(j) + this.segmentIndex.getDurationUs(j - this.segmentNumShift, this.periodDurationUs);
        }

        public long getSegmentNum(long j) {
            return this.segmentIndex.getSegmentNum(j, this.periodDurationUs) + this.segmentNumShift;
        }

        public RangedUri getSegmentUrl(long j) {
            return this.segmentIndex.getSegmentUrl(j - this.segmentNumShift);
        }

        private static boolean mimeTypeIsWebm(String str) {
            return str.startsWith(MimeTypes.VIDEO_WEBM) || str.startsWith(MimeTypes.AUDIO_WEBM) || str.startsWith(MimeTypes.APPLICATION_WEBM);
        }

        private static boolean mimeTypeIsRawText(String str) {
            return MimeTypes.isText(str) || MimeTypes.APPLICATION_TTML.equals(str);
        }
    }

    public DefaultDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, int i, int[] iArr, TrackSelection trackSelection2, int i2, DataSource dataSource2, long j, int i3, boolean z, boolean z2, PlayerTrackEmsgHandler playerTrackEmsgHandler2) {
        TrackSelection trackSelection3 = trackSelection2;
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.manifest = dashManifest;
        this.adaptationSetIndices = iArr;
        this.trackSelection = trackSelection3;
        int i4 = i2;
        this.trackType = i4;
        this.dataSource = dataSource2;
        this.periodIndex = i;
        this.elapsedRealtimeOffsetMs = j;
        this.maxSegmentsPerLoad = i3;
        PlayerTrackEmsgHandler playerTrackEmsgHandler3 = playerTrackEmsgHandler2;
        this.playerTrackEmsgHandler = playerTrackEmsgHandler3;
        long periodDurationUs = dashManifest.getPeriodDurationUs(i);
        ArrayList representations = getRepresentations();
        this.representationHolders = new RepresentationHolder[trackSelection2.length()];
        for (int i5 = 0; i5 < this.representationHolders.length; i5++) {
            Representation representation = (Representation) representations.get(trackSelection3.getIndexInTrackGroup(i5));
            RepresentationHolder[] representationHolderArr = this.representationHolders;
            RepresentationHolder representationHolder = new RepresentationHolder(periodDurationUs, i4, representation, z, z2, playerTrackEmsgHandler3);
            representationHolderArr[i5] = representationHolder;
        }
    }

    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        RepresentationHolder[] representationHolderArr = this.representationHolders;
        int length = representationHolderArr.length;
        for (int i = 0; i < length; i++) {
            RepresentationHolder representationHolder = representationHolderArr[i];
            if (representationHolder.segmentIndex != null) {
                long segmentNum = representationHolder.getSegmentNum(j);
                long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(segmentNum);
                return Util.resolveSeekPositionUs(j, seekParameters, segmentStartTimeUs, (segmentStartTimeUs >= j || segmentNum >= ((long) (representationHolder.getSegmentCount() + -1))) ? segmentStartTimeUs : representationHolder.getSegmentStartTimeUs(segmentNum + 1));
            }
        }
        return j;
    }

    public void updateManifest(DashManifest dashManifest, int i) {
        try {
            this.manifest = dashManifest;
            this.periodIndex = i;
            long periodDurationUs = this.manifest.getPeriodDurationUs(this.periodIndex);
            ArrayList representations = getRepresentations();
            for (int i2 = 0; i2 < this.representationHolders.length; i2++) {
                this.representationHolders[i2].updateRepresentation(periodDurationUs, (Representation) representations.get(this.trackSelection.getIndexInTrackGroup(i2)));
            }
        } catch (BehindLiveWindowException e) {
            this.fatalError = e;
        }
    }

    public void maybeThrowError() throws IOException {
        if (this.fatalError != null) {
            throw this.fatalError;
        }
        this.manifestLoaderErrorThrower.maybeThrowError();
    }

    public int getPreferredQueueSize(long j, List<? extends MediaChunk> list) {
        if (this.fatalError != null || this.trackSelection.length() < 2) {
            return list.size();
        }
        return this.trackSelection.evaluateQueueSize(j, list);
    }

    public void getNextChunk(MediaChunk mediaChunk, long j, long j2, ChunkHolder chunkHolder) {
        long j3;
        long nextChunkIndex;
        boolean z;
        long j4 = j;
        long j5 = j2;
        ChunkHolder chunkHolder2 = chunkHolder;
        if (this.fatalError == null) {
            long j6 = j5 - j4;
            long resolveTimeToLiveEdgeUs = resolveTimeToLiveEdgeUs(j4);
            long msToUs = C2793C.msToUs(this.manifest.availabilityStartTimeMs) + C2793C.msToUs(this.manifest.getPeriod(this.periodIndex).startMs) + j5;
            if (this.playerTrackEmsgHandler == null || !this.playerTrackEmsgHandler.maybeRefreshManifestBeforeLoadingNextChunk(msToUs)) {
                this.trackSelection.updateSelectedTrack(j4, j6, resolveTimeToLiveEdgeUs);
                RepresentationHolder representationHolder = this.representationHolders[this.trackSelection.getSelectedIndex()];
                if (representationHolder.extractorWrapper != null) {
                    Representation representation = representationHolder.representation;
                    RangedUri initializationUri = representationHolder.extractorWrapper.getSampleFormats() == null ? representation.getInitializationUri() : null;
                    RangedUri indexUri = representationHolder.segmentIndex == null ? representation.getIndexUri() : null;
                    if (!(initializationUri == null && indexUri == null)) {
                        chunkHolder2.chunk = newInitializationChunk(representationHolder, this.dataSource, this.trackSelection.getSelectedFormat(), this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), initializationUri, indexUri);
                        return;
                    }
                }
                int segmentCount = representationHolder.getSegmentCount();
                if (segmentCount == 0) {
                    chunkHolder2.endOfStream = !this.manifest.dynamic || this.periodIndex < this.manifest.getPeriodCount() - 1;
                    return;
                }
                long firstSegmentNum = representationHolder.getFirstSegmentNum();
                if (segmentCount == -1) {
                    long nowUnixTimeUs = (getNowUnixTimeUs() - C2793C.msToUs(this.manifest.availabilityStartTimeMs)) - C2793C.msToUs(this.manifest.getPeriod(this.periodIndex).startMs);
                    if (this.manifest.timeShiftBufferDepthMs != C2793C.TIME_UNSET) {
                        firstSegmentNum = Math.max(firstSegmentNum, representationHolder.getSegmentNum(nowUnixTimeUs - C2793C.msToUs(this.manifest.timeShiftBufferDepthMs)));
                    }
                    j3 = representationHolder.getSegmentNum(nowUnixTimeUs) - 1;
                } else {
                    j3 = (firstSegmentNum + ((long) segmentCount)) - 1;
                }
                long j7 = firstSegmentNum;
                updateLiveEdgeTimeUs(representationHolder, j3);
                if (mediaChunk == null) {
                    nextChunkIndex = Util.constrainValue(representationHolder.getSegmentNum(j5), j7, j3);
                } else {
                    nextChunkIndex = mediaChunk.getNextChunkIndex();
                    if (nextChunkIndex < j7) {
                        this.fatalError = new BehindLiveWindowException();
                        return;
                    }
                }
                long j8 = nextChunkIndex;
                if (j8 > j3 || (this.missingLastSegment && j8 >= j3)) {
                    if (this.manifest.dynamic) {
                        z = true;
                        if (this.periodIndex >= this.manifest.getPeriodCount() - 1) {
                            z = false;
                        }
                    } else {
                        z = true;
                    }
                    chunkHolder2.endOfStream = z;
                    return;
                }
                chunkHolder2.chunk = newMediaChunk(representationHolder, this.dataSource, this.trackType, this.trackSelection.getSelectedFormat(), this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), j8, (int) Math.min((long) this.maxSegmentsPerLoad, (j3 - j8) + 1), mediaChunk == null ? j5 : C2793C.TIME_UNSET);
            }
        }
    }

    public void onChunkLoadCompleted(Chunk chunk) {
        if (chunk instanceof InitializationChunk) {
            RepresentationHolder representationHolder = this.representationHolders[this.trackSelection.indexOf(((InitializationChunk) chunk).trackFormat)];
            if (representationHolder.segmentIndex == null) {
                SeekMap seekMap = representationHolder.extractorWrapper.getSeekMap();
                if (seekMap != null) {
                    representationHolder.segmentIndex = new DashWrappingSegmentIndex((ChunkIndex) seekMap, representationHolder.representation.presentationTimeOffsetUs);
                }
            }
        }
        if (this.playerTrackEmsgHandler != null) {
            this.playerTrackEmsgHandler.onChunkLoadCompleted(chunk);
        }
    }

    public boolean onChunkLoadError(Chunk chunk, boolean z, Exception exc) {
        if (!z) {
            return false;
        }
        if (this.playerTrackEmsgHandler != null && this.playerTrackEmsgHandler.maybeRefreshManifestOnLoadingError(chunk)) {
            return true;
        }
        if (!this.manifest.dynamic && (chunk instanceof MediaChunk) && (exc instanceof InvalidResponseCodeException) && ((InvalidResponseCodeException) exc).responseCode == 404) {
            RepresentationHolder representationHolder = this.representationHolders[this.trackSelection.indexOf(chunk.trackFormat)];
            int segmentCount = representationHolder.getSegmentCount();
            if (!(segmentCount == -1 || segmentCount == 0)) {
                if (((MediaChunk) chunk).getNextChunkIndex() > (representationHolder.getFirstSegmentNum() + ((long) segmentCount)) - 1) {
                    this.missingLastSegment = true;
                    return true;
                }
            }
        }
        return ChunkedTrackBlacklistUtil.maybeBlacklistTrack(this.trackSelection, this.trackSelection.indexOf(chunk.trackFormat), exc);
    }

    private ArrayList<Representation> getRepresentations() {
        List<AdaptationSet> list = this.manifest.getPeriod(this.periodIndex).adaptationSets;
        ArrayList<Representation> arrayList = new ArrayList<>();
        for (int i : this.adaptationSetIndices) {
            arrayList.addAll(((AdaptationSet) list.get(i)).representations);
        }
        return arrayList;
    }

    private void updateLiveEdgeTimeUs(RepresentationHolder representationHolder, long j) {
        this.liveEdgeTimeUs = this.manifest.dynamic ? representationHolder.getSegmentEndTimeUs(j) : C2793C.TIME_UNSET;
    }

    private long getNowUnixTimeUs() {
        if (this.elapsedRealtimeOffsetMs != 0) {
            return (SystemClock.elapsedRealtime() + this.elapsedRealtimeOffsetMs) * 1000;
        }
        return System.currentTimeMillis() * 1000;
    }

    private long resolveTimeToLiveEdgeUs(long j) {
        if (this.manifest.dynamic && this.liveEdgeTimeUs != C2793C.TIME_UNSET) {
            return this.liveEdgeTimeUs - j;
        }
        return C2793C.TIME_UNSET;
    }

    protected static Chunk newInitializationChunk(RepresentationHolder representationHolder, DataSource dataSource2, Format format, int i, Object obj, RangedUri rangedUri, RangedUri rangedUri2) {
        String str = representationHolder.representation.baseUrl;
        if (rangedUri != null) {
            rangedUri2 = rangedUri.attemptMerge(rangedUri2, str);
            if (rangedUri2 == null) {
                rangedUri2 = rangedUri;
            }
        }
        DataSpec dataSpec = new DataSpec(rangedUri2.resolveUri(str), rangedUri2.start, rangedUri2.length, representationHolder.representation.getCacheKey());
        InitializationChunk initializationChunk = new InitializationChunk(dataSource2, dataSpec, format, i, obj, representationHolder.extractorWrapper);
        return initializationChunk;
    }

    protected static Chunk newMediaChunk(RepresentationHolder representationHolder, DataSource dataSource2, int i, Format format, int i2, Object obj, long j, int i3, long j2) {
        RepresentationHolder representationHolder2 = representationHolder;
        long j3 = j;
        Representation representation = representationHolder2.representation;
        long segmentStartTimeUs = representationHolder2.getSegmentStartTimeUs(j3);
        RangedUri segmentUrl = representationHolder2.getSegmentUrl(j3);
        String str = representation.baseUrl;
        if (representationHolder2.extractorWrapper == null) {
            long segmentEndTimeUs = representationHolder2.getSegmentEndTimeUs(j3);
            Uri resolveUri = segmentUrl.resolveUri(str);
            long j4 = segmentUrl.start;
            DataSpec dataSpec = new DataSpec(resolveUri, j4, segmentUrl.length, representation.getCacheKey());
            SingleSampleMediaChunk singleSampleMediaChunk = new SingleSampleMediaChunk(dataSource2, dataSpec, format, i2, obj, segmentStartTimeUs, segmentEndTimeUs, j3, i, format);
            return singleSampleMediaChunk;
        }
        int i4 = 1;
        RangedUri rangedUri = segmentUrl;
        int i5 = 1;
        int i6 = i3;
        while (i4 < i6) {
            RangedUri attemptMerge = rangedUri.attemptMerge(representationHolder2.getSegmentUrl(j3 + ((long) i4)), str);
            if (attemptMerge == null) {
                break;
            }
            i5++;
            i4++;
            rangedUri = attemptMerge;
        }
        int i7 = i5;
        long segmentEndTimeUs2 = representationHolder2.getSegmentEndTimeUs((j3 + ((long) i5)) - 1);
        Uri resolveUri2 = rangedUri.resolveUri(str);
        long j5 = rangedUri.start;
        DataSpec dataSpec2 = new DataSpec(resolveUri2, j5, rangedUri.length, representation.getCacheKey());
        long j6 = -representation.presentationTimeOffsetUs;
        long j7 = j6;
        ContainerMediaChunk containerMediaChunk = new ContainerMediaChunk(dataSource2, dataSpec2, format, i2, obj, segmentStartTimeUs, segmentEndTimeUs2, j2, j3, i7, j7, representationHolder2.extractorWrapper);
        return containerMediaChunk;
    }
}
