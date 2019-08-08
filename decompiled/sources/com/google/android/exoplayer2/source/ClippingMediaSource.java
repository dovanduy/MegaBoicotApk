package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.Period;
import com.google.android.exoplayer2.Timeline.Window;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public final class ClippingMediaSource extends CompositeMediaSource<Void> {
    private final boolean allowDynamicClippingUpdates;
    private IllegalClippingException clippingError;
    private ClippingTimeline clippingTimeline;
    private final boolean enableInitialDiscontinuity;
    private final long endUs;
    private Object manifest;
    private final ArrayList<ClippingMediaPeriod> mediaPeriods;
    private final MediaSource mediaSource;
    private long periodEndUs;
    private long periodStartUs;
    private final boolean relativeToDefaultPosition;
    private final long startUs;
    private final Window window;

    private static final class ClippingTimeline extends ForwardingTimeline {
        private final long durationUs;
        private final long endUs;
        private final boolean isDynamic;
        private final long startUs;

        public ClippingTimeline(Timeline timeline, long j, long j2) throws IllegalClippingException {
            super(timeline);
            boolean z = true;
            if (timeline.getPeriodCount() != 1) {
                throw new IllegalClippingException(0);
            }
            Window window = timeline.getWindow(0, new Window(), false);
            long max = Math.max(0, j);
            long max2 = j2 == Long.MIN_VALUE ? window.durationUs : Math.max(0, j2);
            if (window.durationUs != C2793C.TIME_UNSET) {
                if (max2 > window.durationUs) {
                    max2 = window.durationUs;
                }
                if (max != 0 && !window.isSeekable) {
                    throw new IllegalClippingException(1);
                } else if (max > max2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.startUs = max;
            this.endUs = max2;
            this.durationUs = max2 == C2793C.TIME_UNSET ? -9223372036854775807L : max2 - max;
            if (!window.isDynamic || (max2 != C2793C.TIME_UNSET && (window.durationUs == C2793C.TIME_UNSET || max2 != window.durationUs))) {
                z = false;
            }
            this.isDynamic = z;
        }

        public Window getWindow(int i, Window window, boolean z, long j) {
            long j2;
            this.timeline.getWindow(0, window, z, 0);
            window.positionInFirstPeriodUs += this.startUs;
            window.durationUs = this.durationUs;
            window.isDynamic = this.isDynamic;
            if (window.defaultPositionUs != C2793C.TIME_UNSET) {
                window.defaultPositionUs = Math.max(window.defaultPositionUs, this.startUs);
                if (this.endUs == C2793C.TIME_UNSET) {
                    j2 = window.defaultPositionUs;
                } else {
                    j2 = Math.min(window.defaultPositionUs, this.endUs);
                }
                window.defaultPositionUs = j2;
                window.defaultPositionUs -= this.startUs;
            }
            long usToMs = C2793C.usToMs(this.startUs);
            if (window.presentationStartTimeMs != C2793C.TIME_UNSET) {
                window.presentationStartTimeMs += usToMs;
            }
            if (window.windowStartTimeMs != C2793C.TIME_UNSET) {
                window.windowStartTimeMs += usToMs;
            }
            return window;
        }

        public Period getPeriod(int i, Period period, boolean z) {
            this.timeline.getPeriod(0, period, z);
            long positionInWindowUs = period.getPositionInWindowUs() - this.startUs;
            long j = this.durationUs;
            long j2 = C2793C.TIME_UNSET;
            if (j != C2793C.TIME_UNSET) {
                j2 = this.durationUs - positionInWindowUs;
            }
            return period.set(period.f8628id, period.uid, 0, j2, positionInWindowUs);
        }
    }

    public static final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        private static String getReasonDescription(int i) {
            switch (i) {
                case 0:
                    return "invalid period count";
                case 1:
                    return "not seekable to start";
                case 2:
                    return "start exceeds end";
                default:
                    return "unknown";
            }
        }

        public IllegalClippingException(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal clipping: ");
            sb.append(getReasonDescription(i));
            super(sb.toString());
            this.reason = i;
        }
    }

    public ClippingMediaSource(MediaSource mediaSource2, long j, long j2) {
        this(mediaSource2, j, j2, true, false, false);
    }

    @Deprecated
    public ClippingMediaSource(MediaSource mediaSource2, long j, long j2, boolean z) {
        this(mediaSource2, j, j2, z, false, false);
    }

    public ClippingMediaSource(MediaSource mediaSource2, long j) {
        this(mediaSource2, 0, j, true, false, true);
    }

    public ClippingMediaSource(MediaSource mediaSource2, long j, long j2, boolean z, boolean z2, boolean z3) {
        Assertions.checkArgument(j >= 0);
        this.mediaSource = (MediaSource) Assertions.checkNotNull(mediaSource2);
        this.startUs = j;
        this.endUs = j2;
        this.enableInitialDiscontinuity = z;
        this.allowDynamicClippingUpdates = z2;
        this.relativeToDefaultPosition = z3;
        this.mediaPeriods = new ArrayList<>();
        this.window = new Window();
    }

    public void prepareSourceInternal(ExoPlayer exoPlayer, boolean z) {
        super.prepareSourceInternal(exoPlayer, z);
        prepareChildSource(null, this.mediaSource);
    }

    public void maybeThrowSourceInfoRefreshError() throws IOException {
        if (this.clippingError != null) {
            throw this.clippingError;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    public MediaPeriod createPeriod(MediaPeriodId mediaPeriodId, Allocator allocator) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator), this.enableInitialDiscontinuity, this.periodStartUs, this.periodEndUs);
        this.mediaPeriods.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    public void releasePeriod(MediaPeriod mediaPeriod) {
        Assertions.checkState(this.mediaPeriods.remove(mediaPeriod));
        this.mediaSource.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
        if (this.mediaPeriods.isEmpty() && !this.allowDynamicClippingUpdates) {
            refreshClippedTimeline(this.clippingTimeline.timeline);
        }
    }

    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.clippingError = null;
        this.clippingTimeline = null;
    }

    /* access modifiers changed from: protected */
    public void onChildSourceInfoRefreshed(Void voidR, MediaSource mediaSource2, Timeline timeline, Object obj) {
        if (this.clippingError == null) {
            this.manifest = obj;
            refreshClippedTimeline(timeline);
        }
    }

    private void refreshClippedTimeline(Timeline timeline) {
        long j;
        long j2;
        Timeline timeline2 = timeline;
        timeline2.getWindow(0, this.window);
        long positionInFirstPeriodUs = this.window.getPositionInFirstPeriodUs();
        long j3 = Long.MIN_VALUE;
        if (this.clippingTimeline == null || this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            long j4 = this.startUs;
            long j5 = this.endUs;
            if (this.relativeToDefaultPosition) {
                long defaultPositionUs = this.window.getDefaultPositionUs();
                j2 = j4 + defaultPositionUs;
                j5 += defaultPositionUs;
            } else {
                j2 = j4;
            }
            this.periodStartUs = positionInFirstPeriodUs + j2;
            if (this.endUs != Long.MIN_VALUE) {
                j3 = positionInFirstPeriodUs + j5;
            }
            this.periodEndUs = j3;
            int size = this.mediaPeriods.size();
            for (int i = 0; i < size; i++) {
                ((ClippingMediaPeriod) this.mediaPeriods.get(i)).updateClipping(this.periodStartUs, this.periodEndUs);
            }
            j3 = j5;
            j = j2;
        } else {
            long j6 = this.periodStartUs - positionInFirstPeriodUs;
            if (this.endUs != Long.MIN_VALUE) {
                j3 = this.periodEndUs - positionInFirstPeriodUs;
            }
            j = j6;
        }
        try {
            ClippingTimeline clippingTimeline2 = new ClippingTimeline(timeline2, j, j3);
            this.clippingTimeline = clippingTimeline2;
            refreshSourceInfo(this.clippingTimeline, this.manifest);
        } catch (IllegalClippingException e) {
            this.clippingError = e;
        }
    }

    /* access modifiers changed from: protected */
    public long getMediaTimeForChildMediaTime(Void voidR, long j) {
        if (j == C2793C.TIME_UNSET) {
            return C2793C.TIME_UNSET;
        }
        long usToMs = C2793C.usToMs(this.startUs);
        long max = Math.max(0, j - usToMs);
        if (this.endUs != Long.MIN_VALUE) {
            max = Math.min(C2793C.usToMs(this.endUs) - usToMs, max);
        }
        return max;
    }
}
