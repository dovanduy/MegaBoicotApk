package com.google.android.exoplayer2.source.hls;

import android.os.Handler;
import android.util.Log;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.hls.HlsChunkSource.HlsChunkHolder;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.ReleaseCallback;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

final class HlsSampleStreamWrapper implements ExtractorOutput, UpstreamFormatChangedListener, SequenceableLoader, com.google.android.exoplayer2.upstream.Loader.Callback<Chunk>, ReleaseCallback {
    private static final int PRIMARY_TYPE_AUDIO = 2;
    private static final int PRIMARY_TYPE_NONE = 0;
    private static final int PRIMARY_TYPE_TEXT = 1;
    private static final int PRIMARY_TYPE_VIDEO = 3;
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_FATAL = -2;
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_NON_FATAL = -3;
    public static final int SAMPLE_QUEUE_INDEX_PENDING = -1;
    private static final String TAG = "HlsSampleStreamWrapper";
    private final Allocator allocator;
    private int audioSampleQueueIndex = -1;
    private boolean audioSampleQueueMappingDone;
    private final Callback callback;
    private final HlsChunkSource chunkSource;
    private int chunkUid;
    private Format downstreamTrackFormat;
    private int enabledTrackGroupCount;
    private final EventDispatcher eventDispatcher;
    private final Handler handler = new Handler();
    private boolean haveAudioVideoSampleQueues;
    private final ArrayList<HlsSampleStream> hlsSampleStreams = new ArrayList<>();
    private long lastSeekPositionUs;
    private final Loader loader = new Loader("Loader:HlsSampleStreamWrapper");
    private boolean loadingFinished;
    private final Runnable maybeFinishPrepareRunnable = new Runnable() {
        public void run() {
            HlsSampleStreamWrapper.this.maybeFinishPrepare();
        }
    };
    private final ArrayList<HlsMediaChunk> mediaChunks = new ArrayList<>();
    private final int minLoadableRetryCount;
    private final Format muxedAudioFormat;
    private final HlsChunkHolder nextChunkHolder = new HlsChunkHolder();
    private final Runnable onTracksEndedRunnable = new Runnable() {
        public void run() {
            HlsSampleStreamWrapper.this.onTracksEnded();
        }
    };
    private TrackGroupArray optionalTrackGroups;
    private long pendingResetPositionUs;
    private boolean pendingResetUpstreamFormats;
    private boolean prepared;
    private int primaryTrackGroupIndex;
    private boolean released;
    private long sampleOffsetUs;
    private boolean[] sampleQueueIsAudioVideoFlags = new boolean[0];
    private int[] sampleQueueTrackIds = new int[0];
    private SampleQueue[] sampleQueues = new SampleQueue[0];
    private boolean sampleQueuesBuilt;
    private boolean[] sampleQueuesEnabledStates = new boolean[0];
    private boolean seenFirstTrackSelection;
    private int[] trackGroupToSampleQueueIndex;
    private TrackGroupArray trackGroups;
    private final int trackType;
    private boolean tracksEnded;
    private int videoSampleQueueIndex = -1;
    private boolean videoSampleQueueMappingDone;

    public interface Callback extends com.google.android.exoplayer2.source.SequenceableLoader.Callback<HlsSampleStreamWrapper> {
        void onPlaylistRefreshRequired(HlsUrl hlsUrl);

        void onPrepared();
    }

    public void reevaluateBuffer(long j) {
    }

    public void seekMap(SeekMap seekMap) {
    }

    public HlsSampleStreamWrapper(int i, Callback callback2, HlsChunkSource hlsChunkSource, Allocator allocator2, long j, Format format, int i2, EventDispatcher eventDispatcher2) {
        this.trackType = i;
        this.callback = callback2;
        this.chunkSource = hlsChunkSource;
        this.allocator = allocator2;
        this.muxedAudioFormat = format;
        this.minLoadableRetryCount = i2;
        this.eventDispatcher = eventDispatcher2;
        this.lastSeekPositionUs = j;
        this.pendingResetPositionUs = j;
    }

    public void continuePreparing() {
        if (!this.prepared) {
            continueLoading(this.lastSeekPositionUs);
        }
    }

    public void prepareWithMasterPlaylistInfo(TrackGroupArray trackGroupArray, int i, TrackGroupArray trackGroupArray2) {
        this.prepared = true;
        this.trackGroups = trackGroupArray;
        this.optionalTrackGroups = trackGroupArray2;
        this.primaryTrackGroupIndex = i;
        this.callback.onPrepared();
    }

    public void maybeThrowPrepareError() throws IOException {
        maybeThrowError();
    }

    public TrackGroupArray getTrackGroups() {
        return this.trackGroups;
    }

    public int bindSampleQueueToSampleStream(int i) {
        int i2 = this.trackGroupToSampleQueueIndex[i];
        int i3 = -2;
        if (i2 == -1) {
            if (this.optionalTrackGroups.indexOf(this.trackGroups.get(i)) != -1) {
                i3 = -3;
            }
            return i3;
        } else if (this.sampleQueuesEnabledStates[i2]) {
            return -2;
        } else {
            this.sampleQueuesEnabledStates[i2] = true;
            return i2;
        }
    }

    public void unbindSampleQueue(int i) {
        int i2 = this.trackGroupToSampleQueueIndex[i];
        Assertions.checkState(this.sampleQueuesEnabledStates[i2]);
        this.sampleQueuesEnabledStates[i2] = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean selectTracks(com.google.android.exoplayer2.trackselection.TrackSelection[] r20, boolean[] r21, com.google.android.exoplayer2.source.SampleStream[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            r11 = r24
            boolean r4 = r0.prepared
            com.google.android.exoplayer2.util.Assertions.checkState(r4)
            int r4 = r0.enabledTrackGroupCount
            r13 = 0
            r5 = r13
        L_0x0011:
            r6 = 0
            r14 = 1
            int r7 = r1.length
            if (r5 >= r7) goto L_0x0033
            r7 = r2[r5]
            if (r7 == 0) goto L_0x0030
            r7 = r1[r5]
            if (r7 == 0) goto L_0x0022
            boolean r8 = r21[r5]
            if (r8 != 0) goto L_0x0030
        L_0x0022:
            int r8 = r0.enabledTrackGroupCount
            int r8 = r8 - r14
            r0.enabledTrackGroupCount = r8
            r8 = r2[r5]
            com.google.android.exoplayer2.source.hls.HlsSampleStream r8 = (com.google.android.exoplayer2.source.hls.HlsSampleStream) r8
            r8.unbindSampleQueue()
            r2[r5] = r6
        L_0x0030:
            int r5 = r5 + 1
            goto L_0x0011
        L_0x0033:
            if (r26 != 0) goto L_0x0045
            boolean r5 = r0.seenFirstTrackSelection
            if (r5 == 0) goto L_0x003c
            if (r4 != 0) goto L_0x0043
            goto L_0x0045
        L_0x003c:
            long r4 = r0.lastSeekPositionUs
            int r7 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r4 = r13
            goto L_0x0046
        L_0x0045:
            r4 = r14
        L_0x0046:
            com.google.android.exoplayer2.source.hls.HlsChunkSource r5 = r0.chunkSource
            com.google.android.exoplayer2.trackselection.TrackSelection r5 = r5.getTrackSelection()
            r16 = r4
            r9 = r5
            r4 = r13
        L_0x0050:
            int r7 = r1.length
            if (r4 >= r7) goto L_0x00b0
            r7 = r2[r4]
            if (r7 != 0) goto L_0x00ad
            r7 = r1[r4]
            if (r7 == 0) goto L_0x00ad
            int r7 = r0.enabledTrackGroupCount
            int r7 = r7 + r14
            r0.enabledTrackGroupCount = r7
            r7 = r1[r4]
            com.google.android.exoplayer2.source.TrackGroupArray r8 = r0.trackGroups
            com.google.android.exoplayer2.source.TrackGroup r10 = r7.getTrackGroup()
            int r8 = r8.indexOf(r10)
            int r10 = r0.primaryTrackGroupIndex
            if (r8 != r10) goto L_0x0076
            com.google.android.exoplayer2.source.hls.HlsChunkSource r9 = r0.chunkSource
            r9.selectTracks(r7)
            r9 = r7
        L_0x0076:
            com.google.android.exoplayer2.source.hls.HlsSampleStream r7 = new com.google.android.exoplayer2.source.hls.HlsSampleStream
            r7.<init>(r0, r8)
            r2[r4] = r7
            r23[r4] = r14
            int[] r7 = r0.trackGroupToSampleQueueIndex
            if (r7 == 0) goto L_0x008a
            r7 = r2[r4]
            com.google.android.exoplayer2.source.hls.HlsSampleStream r7 = (com.google.android.exoplayer2.source.hls.HlsSampleStream) r7
            r7.bindSampleQueue()
        L_0x008a:
            boolean r7 = r0.sampleQueuesBuilt
            if (r7 == 0) goto L_0x00ad
            if (r16 != 0) goto L_0x00ad
            com.google.android.exoplayer2.source.SampleQueue[] r7 = r0.sampleQueues
            int[] r10 = r0.trackGroupToSampleQueueIndex
            r8 = r10[r8]
            r7 = r7[r8]
            r7.rewind()
            int r8 = r7.advanceTo(r11, r14, r14)
            r10 = -1
            if (r8 != r10) goto L_0x00ab
            int r7 = r7.getReadIndex()
            if (r7 == 0) goto L_0x00ab
            r16 = r14
            goto L_0x00ad
        L_0x00ab:
            r16 = r13
        L_0x00ad:
            int r4 = r4 + 1
            goto L_0x0050
        L_0x00b0:
            int r1 = r0.enabledTrackGroupCount
            if (r1 != 0) goto L_0x00e5
            com.google.android.exoplayer2.source.hls.HlsChunkSource r1 = r0.chunkSource
            r1.reset()
            r0.downstreamTrackFormat = r6
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r1 = r0.mediaChunks
            r1.clear()
            com.google.android.exoplayer2.upstream.Loader r1 = r0.loader
            boolean r1 = r1.isLoading()
            if (r1 == 0) goto L_0x00e0
            boolean r1 = r0.sampleQueuesBuilt
            if (r1 == 0) goto L_0x00d9
            com.google.android.exoplayer2.source.SampleQueue[] r1 = r0.sampleQueues
            int r3 = r1.length
        L_0x00cf:
            if (r13 >= r3) goto L_0x00d9
            r4 = r1[r13]
            r4.discardToEnd()
            int r13 = r13 + 1
            goto L_0x00cf
        L_0x00d9:
            com.google.android.exoplayer2.upstream.Loader r1 = r0.loader
            r1.cancelLoading()
            goto L_0x0141
        L_0x00e0:
            r19.resetSampleQueues()
            goto L_0x0141
        L_0x00e5:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.HlsMediaChunk> r1 = r0.mediaChunks
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x012e
            boolean r1 = com.google.android.exoplayer2.util.Util.areEqual(r9, r5)
            if (r1 != 0) goto L_0x012e
            boolean r1 = r0.seenFirstTrackSelection
            if (r1 != 0) goto L_0x0125
            r4 = 0
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00fe
            long r4 = -r11
        L_0x00fe:
            r7 = r4
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = r9
            r5 = r11
            r1 = r9
            r9 = r17
            r4.updateSelectedTrack(r5, r7, r9)
            com.google.android.exoplayer2.source.hls.HlsChunkSource r4 = r0.chunkSource
            com.google.android.exoplayer2.source.TrackGroup r4 = r4.getTrackGroup()
            com.google.android.exoplayer2.source.hls.HlsMediaChunk r5 = r19.getLastMediaChunk()
            com.google.android.exoplayer2.Format r5 = r5.trackFormat
            int r4 = r4.indexOf(r5)
            int r1 = r1.getSelectedIndexInTrackGroup()
            if (r1 == r4) goto L_0x0123
            goto L_0x0125
        L_0x0123:
            r1 = r13
            goto L_0x0126
        L_0x0125:
            r1 = r14
        L_0x0126:
            if (r1 == 0) goto L_0x012e
            r0.pendingResetUpstreamFormats = r14
            r15 = r14
            r16 = r15
            goto L_0x0130
        L_0x012e:
            r15 = r26
        L_0x0130:
            if (r16 == 0) goto L_0x0141
            r0.seekToUs(r11, r15)
        L_0x0135:
            int r1 = r2.length
            if (r13 >= r1) goto L_0x0141
            r1 = r2[r13]
            if (r1 == 0) goto L_0x013e
            r23[r13] = r14
        L_0x013e:
            int r13 = r13 + 1
            goto L_0x0135
        L_0x0141:
            r0.updateSampleStreams(r2)
            r0.seenFirstTrackSelection = r14
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.selectTracks(com.google.android.exoplayer2.trackselection.TrackSelection[], boolean[], com.google.android.exoplayer2.source.SampleStream[], boolean[], long, boolean):boolean");
    }

    public void discardBuffer(long j, boolean z) {
        if (this.sampleQueuesBuilt) {
            int length = this.sampleQueues.length;
            for (int i = 0; i < length; i++) {
                this.sampleQueues[i].discardTo(j, z, this.sampleQueuesEnabledStates[i]);
            }
        }
    }

    public boolean seekToUs(long j, boolean z) {
        this.lastSeekPositionUs = j;
        if (this.sampleQueuesBuilt && !z && !isPendingReset() && seekInsideBufferUs(j)) {
            return false;
        }
        this.pendingResetPositionUs = j;
        this.loadingFinished = false;
        this.mediaChunks.clear();
        if (this.loader.isLoading()) {
            this.loader.cancelLoading();
        } else {
            resetSampleQueues();
        }
        return true;
    }

    public void release() {
        if (this.prepared) {
            for (SampleQueue discardToEnd : this.sampleQueues) {
                discardToEnd.discardToEnd();
            }
        }
        this.loader.release(this);
        this.handler.removeCallbacksAndMessages(null);
        this.released = true;
        this.hlsSampleStreams.clear();
    }

    public void onLoaderReleased() {
        resetSampleQueues();
    }

    public void setIsTimestampMaster(boolean z) {
        this.chunkSource.setIsTimestampMaster(z);
    }

    public boolean onPlaylistError(HlsUrl hlsUrl, boolean z) {
        return this.chunkSource.onPlaylistError(hlsUrl, z);
    }

    public boolean isReady(int i) {
        return this.loadingFinished || (!isPendingReset() && this.sampleQueues[i].hasNextSample());
    }

    public void maybeThrowError() throws IOException {
        this.loader.maybeThrowError();
        this.chunkSource.maybeThrowError();
    }

    public int readData(int i, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z) {
        if (isPendingReset()) {
            return -3;
        }
        if (!this.mediaChunks.isEmpty()) {
            int i2 = 0;
            while (i2 < this.mediaChunks.size() - 1 && finishedReadingChunk((HlsMediaChunk) this.mediaChunks.get(i2))) {
                i2++;
            }
            if (i2 > 0) {
                Util.removeRange(this.mediaChunks, 0, i2);
            }
            HlsMediaChunk hlsMediaChunk = (HlsMediaChunk) this.mediaChunks.get(0);
            Format format = hlsMediaChunk.trackFormat;
            if (!format.equals(this.downstreamTrackFormat)) {
                this.eventDispatcher.downstreamFormatChanged(this.trackType, format, hlsMediaChunk.trackSelectionReason, hlsMediaChunk.trackSelectionData, hlsMediaChunk.startTimeUs);
            }
            this.downstreamTrackFormat = format;
        }
        return this.sampleQueues[i].read(formatHolder, decoderInputBuffer, z, this.loadingFinished, this.lastSeekPositionUs);
    }

    public int skipData(int i, long j) {
        if (isPendingReset()) {
            return 0;
        }
        SampleQueue sampleQueue = this.sampleQueues[i];
        if (this.loadingFinished && j > sampleQueue.getLargestQueuedTimestampUs()) {
            return sampleQueue.advanceToEnd();
        }
        int advanceTo = sampleQueue.advanceTo(j, true, true);
        if (advanceTo == -1) {
            advanceTo = 0;
        }
        return advanceTo;
    }

    public long getBufferedPositionUs() {
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        long j = this.lastSeekPositionUs;
        HlsMediaChunk lastMediaChunk = getLastMediaChunk();
        if (!lastMediaChunk.isLoadCompleted()) {
            lastMediaChunk = this.mediaChunks.size() > 1 ? (HlsMediaChunk) this.mediaChunks.get(this.mediaChunks.size() - 2) : null;
        }
        if (lastMediaChunk != null) {
            j = Math.max(j, lastMediaChunk.endTimeUs);
        }
        if (this.sampleQueuesBuilt) {
            for (SampleQueue largestQueuedTimestampUs : this.sampleQueues) {
                j = Math.max(j, largestQueuedTimestampUs.getLargestQueuedTimestampUs());
            }
        }
        return j;
    }

    public long getNextLoadPositionUs() {
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        return this.loadingFinished ? Long.MIN_VALUE : getLastMediaChunk().endTimeUs;
    }

    public boolean continueLoading(long j) {
        HlsMediaChunk lastMediaChunk;
        long j2;
        if (this.loadingFinished || this.loader.isLoading()) {
            return false;
        }
        if (isPendingReset()) {
            lastMediaChunk = null;
            j2 = this.pendingResetPositionUs;
        } else {
            lastMediaChunk = getLastMediaChunk();
            j2 = lastMediaChunk.endTimeUs;
        }
        this.chunkSource.getNextChunk(lastMediaChunk, j, j2, this.nextChunkHolder);
        boolean z = this.nextChunkHolder.endOfStream;
        Chunk chunk = this.nextChunkHolder.chunk;
        HlsUrl hlsUrl = this.nextChunkHolder.playlist;
        this.nextChunkHolder.clear();
        if (z) {
            this.pendingResetPositionUs = C2793C.TIME_UNSET;
            this.loadingFinished = true;
            return true;
        } else if (chunk == null) {
            if (hlsUrl != null) {
                this.callback.onPlaylistRefreshRequired(hlsUrl);
            }
            return false;
        } else {
            if (isMediaChunk(chunk)) {
                this.pendingResetPositionUs = C2793C.TIME_UNSET;
                HlsMediaChunk hlsMediaChunk = (HlsMediaChunk) chunk;
                hlsMediaChunk.init(this);
                this.mediaChunks.add(hlsMediaChunk);
            }
            long startLoading = this.loader.startLoading(chunk, this, this.minLoadableRetryCount);
            this.eventDispatcher.loadStarted(chunk.dataSpec, chunk.type, this.trackType, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs, startLoading);
            return true;
        }
    }

    public void onLoadCompleted(Chunk chunk, long j, long j2) {
        Chunk chunk2 = chunk;
        this.chunkSource.onChunkLoadCompleted(chunk2);
        this.eventDispatcher.loadCompleted(chunk2.dataSpec, chunk2.type, this.trackType, chunk2.trackFormat, chunk2.trackSelectionReason, chunk2.trackSelectionData, chunk2.startTimeUs, chunk2.endTimeUs, j, j2, chunk.bytesLoaded());
        if (!this.prepared) {
            continueLoading(this.lastSeekPositionUs);
        } else {
            this.callback.onContinueLoadingRequested(this);
        }
    }

    public void onLoadCanceled(Chunk chunk, long j, long j2, boolean z) {
        Chunk chunk2 = chunk;
        EventDispatcher eventDispatcher2 = this.eventDispatcher;
        DataSpec dataSpec = chunk2.dataSpec;
        int i = chunk2.type;
        int i2 = this.trackType;
        Format format = chunk2.trackFormat;
        int i3 = chunk2.trackSelectionReason;
        Object obj = chunk2.trackSelectionData;
        long j3 = chunk2.startTimeUs;
        long j4 = chunk2.endTimeUs;
        eventDispatcher2.loadCanceled(dataSpec, i, i2, format, i3, obj, j3, j4, j, j2, chunk.bytesLoaded());
        if (!z) {
            resetSampleQueues();
            if (this.enabledTrackGroupCount > 0) {
                this.callback.onContinueLoadingRequested(this);
            }
        }
    }

    public int onLoadError(Chunk chunk, long j, long j2, IOException iOException) {
        boolean z;
        Chunk chunk2 = chunk;
        IOException iOException2 = iOException;
        long bytesLoaded = chunk.bytesLoaded();
        boolean isMediaChunk = isMediaChunk(chunk);
        int i = 0;
        if (this.chunkSource.onChunkLoadError(chunk2, !isMediaChunk || bytesLoaded == 0, iOException2)) {
            if (isMediaChunk) {
                Assertions.checkState(((HlsMediaChunk) this.mediaChunks.remove(this.mediaChunks.size() - 1)) == chunk2);
                if (this.mediaChunks.isEmpty()) {
                    this.pendingResetPositionUs = this.lastSeekPositionUs;
                }
            }
            z = true;
        } else {
            z = false;
        }
        this.eventDispatcher.loadError(chunk2.dataSpec, chunk2.type, this.trackType, chunk2.trackFormat, chunk2.trackSelectionReason, chunk2.trackSelectionData, chunk2.startTimeUs, chunk2.endTimeUs, j, j2, chunk.bytesLoaded(), iOException, z);
        if (z) {
            if (!this.prepared) {
                continueLoading(this.lastSeekPositionUs);
            } else {
                this.callback.onContinueLoadingRequested(this);
            }
            return 2;
        }
        if (iOException instanceof ParserException) {
            i = 3;
        }
        return i;
    }

    public void init(int i, boolean z, boolean z2) {
        if (!z2) {
            this.audioSampleQueueMappingDone = false;
            this.videoSampleQueueMappingDone = false;
        }
        this.chunkUid = i;
        for (SampleQueue sourceId : this.sampleQueues) {
            sourceId.sourceId(i);
        }
        if (z) {
            for (SampleQueue splice : this.sampleQueues) {
                splice.splice();
            }
        }
    }

    public TrackOutput track(int i, int i2) {
        TrackOutput trackOutput;
        TrackOutput trackOutput2;
        boolean z = false;
        int length = this.sampleQueues.length;
        if (i2 == 1) {
            if (this.audioSampleQueueIndex != -1) {
                if (this.audioSampleQueueMappingDone) {
                    if (this.sampleQueueTrackIds[this.audioSampleQueueIndex] == i) {
                        trackOutput2 = this.sampleQueues[this.audioSampleQueueIndex];
                    } else {
                        trackOutput2 = createDummyTrackOutput(i, i2);
                    }
                    return trackOutput2;
                }
                this.audioSampleQueueMappingDone = true;
                this.sampleQueueTrackIds[this.audioSampleQueueIndex] = i;
                return this.sampleQueues[this.audioSampleQueueIndex];
            } else if (this.tracksEnded) {
                return createDummyTrackOutput(i, i2);
            }
        } else if (i2 != 2) {
            for (int i3 = 0; i3 < length; i3++) {
                if (this.sampleQueueTrackIds[i3] == i) {
                    return this.sampleQueues[i3];
                }
            }
            if (this.tracksEnded) {
                return createDummyTrackOutput(i, i2);
            }
        } else if (this.videoSampleQueueIndex != -1) {
            if (this.videoSampleQueueMappingDone) {
                if (this.sampleQueueTrackIds[this.videoSampleQueueIndex] == i) {
                    trackOutput = this.sampleQueues[this.videoSampleQueueIndex];
                } else {
                    trackOutput = createDummyTrackOutput(i, i2);
                }
                return trackOutput;
            }
            this.videoSampleQueueMappingDone = true;
            this.sampleQueueTrackIds[this.videoSampleQueueIndex] = i;
            return this.sampleQueues[this.videoSampleQueueIndex];
        } else if (this.tracksEnded) {
            return createDummyTrackOutput(i, i2);
        }
        SampleQueue sampleQueue = new SampleQueue(this.allocator);
        sampleQueue.sourceId(this.chunkUid);
        sampleQueue.setSampleOffsetUs(this.sampleOffsetUs);
        sampleQueue.setUpstreamFormatChangeListener(this);
        int i4 = length + 1;
        this.sampleQueueTrackIds = Arrays.copyOf(this.sampleQueueTrackIds, i4);
        this.sampleQueueTrackIds[length] = i;
        this.sampleQueues = (SampleQueue[]) Arrays.copyOf(this.sampleQueues, i4);
        this.sampleQueues[length] = sampleQueue;
        this.sampleQueueIsAudioVideoFlags = Arrays.copyOf(this.sampleQueueIsAudioVideoFlags, i4);
        boolean[] zArr = this.sampleQueueIsAudioVideoFlags;
        if (i2 == 1 || i2 == 2) {
            z = true;
        }
        zArr[length] = z;
        this.haveAudioVideoSampleQueues |= this.sampleQueueIsAudioVideoFlags[length];
        if (i2 == 1) {
            this.audioSampleQueueMappingDone = true;
            this.audioSampleQueueIndex = length;
        } else if (i2 == 2) {
            this.videoSampleQueueMappingDone = true;
            this.videoSampleQueueIndex = length;
        }
        this.sampleQueuesEnabledStates = Arrays.copyOf(this.sampleQueuesEnabledStates, i4);
        return sampleQueue;
    }

    public void endTracks() {
        this.tracksEnded = true;
        this.handler.post(this.onTracksEndedRunnable);
    }

    public void onUpstreamFormatChanged(Format format) {
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    public void setSampleOffsetUs(long j) {
        this.sampleOffsetUs = j;
        for (SampleQueue sampleOffsetUs2 : this.sampleQueues) {
            sampleOffsetUs2.setSampleOffsetUs(j);
        }
    }

    private void updateSampleStreams(SampleStream[] sampleStreamArr) {
        this.hlsSampleStreams.clear();
        for (HlsSampleStream hlsSampleStream : sampleStreamArr) {
            if (hlsSampleStream != null) {
                this.hlsSampleStreams.add(hlsSampleStream);
            }
        }
    }

    private boolean finishedReadingChunk(HlsMediaChunk hlsMediaChunk) {
        int i = hlsMediaChunk.uid;
        int length = this.sampleQueues.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.sampleQueuesEnabledStates[i2] && this.sampleQueues[i2].peekSourceId() == i) {
                return false;
            }
        }
        return true;
    }

    private void resetSampleQueues() {
        for (SampleQueue reset : this.sampleQueues) {
            reset.reset(this.pendingResetUpstreamFormats);
        }
        this.pendingResetUpstreamFormats = false;
    }

    /* access modifiers changed from: private */
    public void onTracksEnded() {
        this.sampleQueuesBuilt = true;
        maybeFinishPrepare();
    }

    /* access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (!this.released && this.trackGroupToSampleQueueIndex == null && this.sampleQueuesBuilt) {
            SampleQueue[] sampleQueueArr = this.sampleQueues;
            int length = sampleQueueArr.length;
            int i = 0;
            while (i < length) {
                if (sampleQueueArr[i].getUpstreamFormat() != null) {
                    i++;
                } else {
                    return;
                }
            }
            if (this.trackGroups != null) {
                mapSampleQueuesToMatchTrackGroups();
            } else {
                buildTracksFromSampleStreams();
                this.prepared = true;
                this.callback.onPrepared();
            }
        }
    }

    private void mapSampleQueuesToMatchTrackGroups() {
        int i = this.trackGroups.length;
        this.trackGroupToSampleQueueIndex = new int[i];
        Arrays.fill(this.trackGroupToSampleQueueIndex, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.sampleQueues.length) {
                    break;
                } else if (formatsMatch(this.sampleQueues[i3].getUpstreamFormat(), this.trackGroups.get(i2).getFormat(0))) {
                    this.trackGroupToSampleQueueIndex[i2] = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        Iterator it = this.hlsSampleStreams.iterator();
        while (it.hasNext()) {
            ((HlsSampleStream) it.next()).bindSampleQueue();
        }
    }

    private void buildTracksFromSampleStreams() {
        boolean z = false;
        int length = this.sampleQueues.length;
        int i = -1;
        int i2 = 0;
        char c = 0;
        while (true) {
            char c2 = 3;
            if (i2 >= length) {
                break;
            }
            String str = this.sampleQueues[i2].getUpstreamFormat().sampleMimeType;
            if (!MimeTypes.isVideo(str)) {
                c2 = MimeTypes.isAudio(str) ? 2 : MimeTypes.isText(str) ? (char) 1 : 0;
            }
            if (c2 > c) {
                i = i2;
                c = c2;
            } else if (c2 == c && i != -1) {
                i = -1;
            }
            i2++;
        }
        TrackGroup trackGroup = this.chunkSource.getTrackGroup();
        int i3 = trackGroup.length;
        this.primaryTrackGroupIndex = -1;
        this.trackGroupToSampleQueueIndex = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            this.trackGroupToSampleQueueIndex[i4] = i4;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        for (int i5 = 0; i5 < length; i5++) {
            Format upstreamFormat = this.sampleQueues[i5].getUpstreamFormat();
            if (i5 == i) {
                Format[] formatArr = new Format[i3];
                for (int i6 = 0; i6 < i3; i6++) {
                    formatArr[i6] = deriveFormat(trackGroup.getFormat(i6), upstreamFormat, true);
                }
                trackGroupArr[i5] = new TrackGroup(formatArr);
                this.primaryTrackGroupIndex = i5;
            } else {
                trackGroupArr[i5] = new TrackGroup(deriveFormat((c != 3 || !MimeTypes.isAudio(upstreamFormat.sampleMimeType)) ? null : this.muxedAudioFormat, upstreamFormat, false));
            }
        }
        this.trackGroups = new TrackGroupArray(trackGroupArr);
        if (this.optionalTrackGroups == null) {
            z = true;
        }
        Assertions.checkState(z);
        this.optionalTrackGroups = TrackGroupArray.EMPTY;
    }

    private HlsMediaChunk getLastMediaChunk() {
        return (HlsMediaChunk) this.mediaChunks.get(this.mediaChunks.size() - 1);
    }

    private boolean isPendingReset() {
        return this.pendingResetPositionUs != C2793C.TIME_UNSET;
    }

    private boolean seekInsideBufferUs(long j) {
        int length = this.sampleQueues.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            SampleQueue sampleQueue = this.sampleQueues[i];
            sampleQueue.rewind();
            if (sampleQueue.advanceTo(j, true, false) == -1) {
                z = false;
            }
            if (z || (!this.sampleQueueIsAudioVideoFlags[i] && this.haveAudioVideoSampleQueues)) {
                i++;
            }
        }
        return false;
    }

    private static Format deriveFormat(Format format, Format format2, boolean z) {
        if (format == null) {
            return format2;
        }
        int i = z ? format.bitrate : -1;
        String codecsOfType = Util.getCodecsOfType(format.codecs, MimeTypes.getTrackType(format2.sampleMimeType));
        String mediaMimeType = MimeTypes.getMediaMimeType(codecsOfType);
        if (mediaMimeType == null) {
            mediaMimeType = format2.sampleMimeType;
        }
        return format2.copyWithContainerInfo(format.f8626id, mediaMimeType, codecsOfType, i, format.width, format.height, format.selectionFlags, format.language);
    }

    private static boolean isMediaChunk(Chunk chunk) {
        return chunk instanceof HlsMediaChunk;
    }

    private static boolean formatsMatch(Format format, Format format2) {
        String str = format.sampleMimeType;
        String str2 = format2.sampleMimeType;
        int trackType2 = MimeTypes.getTrackType(str);
        boolean z = false;
        if (trackType2 != 3) {
            if (trackType2 == MimeTypes.getTrackType(str2)) {
                z = true;
            }
            return z;
        } else if (!Util.areEqual(str, str2)) {
            return false;
        } else {
            if (!MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str)) {
                return true;
            }
            if (format.accessibilityChannel == format2.accessibilityChannel) {
                z = true;
            }
            return z;
        }
    }

    private static DummyTrackOutput createDummyTrackOutput(int i, int i2) {
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Unmapped track with id ");
        sb.append(i);
        sb.append(" of type ");
        sb.append(i2);
        Log.w(str, sb.toString());
        return new DummyTrackOutput();
    }
}
