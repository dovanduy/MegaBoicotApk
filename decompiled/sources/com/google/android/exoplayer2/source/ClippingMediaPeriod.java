package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.MediaPeriod.Callback;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

public final class ClippingMediaPeriod implements MediaPeriod, Callback {
    private Callback callback;
    long endUs;
    public final MediaPeriod mediaPeriod;
    private long pendingInitialDiscontinuityPositionUs;
    private ClippingSampleStream[] sampleStreams = new ClippingSampleStream[0];
    long startUs;

    private final class ClippingSampleStream implements SampleStream {
        public final SampleStream childStream;
        private boolean sentEos;

        public ClippingSampleStream(SampleStream sampleStream) {
            this.childStream = sampleStream;
        }

        public void clearSentEos() {
            this.sentEos = false;
        }

        public boolean isReady() {
            return !ClippingMediaPeriod.this.isPendingInitialDiscontinuity() && this.childStream.isReady();
        }

        public void maybeThrowError() throws IOException {
            this.childStream.maybeThrowError();
        }

        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z) {
            if (ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            if (this.sentEos) {
                decoderInputBuffer.setFlags(4);
                return -4;
            }
            int readData = this.childStream.readData(formatHolder, decoderInputBuffer, z);
            if (readData == -5) {
                Format format = formatHolder.format;
                if (!(format.encoderDelay == 0 && format.encoderPadding == 0)) {
                    int i = 0;
                    int i2 = ClippingMediaPeriod.this.startUs != 0 ? 0 : format.encoderDelay;
                    if (ClippingMediaPeriod.this.endUs == Long.MIN_VALUE) {
                        i = format.encoderPadding;
                    }
                    formatHolder.format = format.copyWithGaplessInfo(i2, i);
                }
                return -5;
            } else if (ClippingMediaPeriod.this.endUs == Long.MIN_VALUE || ((readData != -4 || decoderInputBuffer.timeUs < ClippingMediaPeriod.this.endUs) && (readData != -3 || ClippingMediaPeriod.this.getBufferedPositionUs() != Long.MIN_VALUE))) {
                return readData;
            } else {
                decoderInputBuffer.clear();
                decoderInputBuffer.setFlags(4);
                this.sentEos = true;
                return -4;
            }
        }

        public int skipData(long j) {
            if (ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            return this.childStream.skipData(j);
        }
    }

    public ClippingMediaPeriod(MediaPeriod mediaPeriod2, boolean z, long j, long j2) {
        this.mediaPeriod = mediaPeriod2;
        this.pendingInitialDiscontinuityPositionUs = z ? j : C2793C.TIME_UNSET;
        this.startUs = j;
        this.endUs = j2;
    }

    public void updateClipping(long j, long j2) {
        this.startUs = j;
        this.endUs = j2;
    }

    public void prepare(Callback callback2, long j) {
        this.callback = callback2;
        this.mediaPeriod.prepare(this, j);
    }

    public void maybeThrowPrepareError() throws IOException {
        this.mediaPeriod.maybeThrowPrepareError();
    }

    public TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    public long selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        SampleStream[] sampleStreamArr2 = sampleStreamArr;
        this.sampleStreams = new ClippingSampleStream[sampleStreamArr2.length];
        SampleStream[] sampleStreamArr3 = new SampleStream[sampleStreamArr2.length];
        int i = 0;
        while (true) {
            SampleStream sampleStream = null;
            if (i >= sampleStreamArr2.length) {
                break;
            }
            this.sampleStreams[i] = (ClippingSampleStream) sampleStreamArr2[i];
            if (this.sampleStreams[i] != null) {
                sampleStream = this.sampleStreams[i].childStream;
            }
            sampleStreamArr3[i] = sampleStream;
            i++;
        }
        long selectTracks = this.mediaPeriod.selectTracks(trackSelectionArr, zArr, sampleStreamArr3, zArr2, j);
        this.pendingInitialDiscontinuityPositionUs = (!isPendingInitialDiscontinuity() || j != this.startUs || !shouldKeepInitialDiscontinuity(this.startUs, trackSelectionArr)) ? C2793C.TIME_UNSET : selectTracks;
        Assertions.checkState(selectTracks == j || (selectTracks >= this.startUs && (this.endUs == Long.MIN_VALUE || selectTracks <= this.endUs)));
        for (int i2 = 0; i2 < sampleStreamArr2.length; i2++) {
            if (sampleStreamArr3[i2] == null) {
                this.sampleStreams[i2] = null;
            } else if (sampleStreamArr2[i2] == null || this.sampleStreams[i2].childStream != sampleStreamArr3[i2]) {
                this.sampleStreams[i2] = new ClippingSampleStream(sampleStreamArr3[i2]);
            }
            sampleStreamArr2[i2] = this.sampleStreams[i2];
        }
        return selectTracks;
    }

    public void discardBuffer(long j, boolean z) {
        this.mediaPeriod.discardBuffer(j, z);
    }

    public void reevaluateBuffer(long j) {
        this.mediaPeriod.reevaluateBuffer(j);
    }

    public long readDiscontinuity() {
        if (isPendingInitialDiscontinuity()) {
            long j = this.pendingInitialDiscontinuityPositionUs;
            this.pendingInitialDiscontinuityPositionUs = C2793C.TIME_UNSET;
            long readDiscontinuity = readDiscontinuity();
            if (readDiscontinuity != C2793C.TIME_UNSET) {
                j = readDiscontinuity;
            }
            return j;
        }
        long readDiscontinuity2 = this.mediaPeriod.readDiscontinuity();
        if (readDiscontinuity2 == C2793C.TIME_UNSET) {
            return C2793C.TIME_UNSET;
        }
        boolean z = false;
        Assertions.checkState(readDiscontinuity2 >= this.startUs);
        if (this.endUs == Long.MIN_VALUE || readDiscontinuity2 <= this.endUs) {
            z = true;
        }
        Assertions.checkState(z);
        return readDiscontinuity2;
    }

    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE || (this.endUs != Long.MIN_VALUE && bufferedPositionUs >= this.endUs)) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs;
    }

    public long seekToUs(long j) {
        ClippingSampleStream[] clippingSampleStreamArr;
        this.pendingInitialDiscontinuityPositionUs = C2793C.TIME_UNSET;
        boolean z = false;
        for (ClippingSampleStream clippingSampleStream : this.sampleStreams) {
            if (clippingSampleStream != null) {
                clippingSampleStream.clearSentEos();
            }
        }
        long seekToUs = this.mediaPeriod.seekToUs(j);
        if (seekToUs == j || (seekToUs >= this.startUs && (this.endUs == Long.MIN_VALUE || seekToUs <= this.endUs))) {
            z = true;
        }
        Assertions.checkState(z);
        return seekToUs;
    }

    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        if (j == this.startUs) {
            return this.startUs;
        }
        return this.mediaPeriod.getAdjustedSeekPositionUs(j, clipSeekParameters(j, seekParameters));
    }

    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE || (this.endUs != Long.MIN_VALUE && nextLoadPositionUs >= this.endUs)) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs;
    }

    public boolean continueLoading(long j) {
        return this.mediaPeriod.continueLoading(j);
    }

    public void onPrepared(MediaPeriod mediaPeriod2) {
        this.callback.onPrepared(this);
    }

    public void onContinueLoadingRequested(MediaPeriod mediaPeriod2) {
        this.callback.onContinueLoadingRequested(this);
    }

    /* access modifiers changed from: 0000 */
    public boolean isPendingInitialDiscontinuity() {
        return this.pendingInitialDiscontinuityPositionUs != C2793C.TIME_UNSET;
    }

    private SeekParameters clipSeekParameters(long j, SeekParameters seekParameters) {
        long constrainValue = Util.constrainValue(seekParameters.toleranceBeforeUs, 0, j - this.startUs);
        long constrainValue2 = Util.constrainValue(seekParameters.toleranceAfterUs, 0, this.endUs == Long.MIN_VALUE ? Long.MAX_VALUE : this.endUs - j);
        if (constrainValue == seekParameters.toleranceBeforeUs && constrainValue2 == seekParameters.toleranceAfterUs) {
            return seekParameters;
        }
        return new SeekParameters(constrainValue, constrainValue2);
    }

    private static boolean shouldKeepInitialDiscontinuity(long j, TrackSelection[] trackSelectionArr) {
        if (j != 0) {
            for (TrackSelection trackSelection : trackSelectionArr) {
                if (trackSelection != null && !MimeTypes.isAudio(trackSelection.getSelectedFormat().sampleMimeType)) {
                    return true;
                }
            }
        }
        return false;
    }
}
