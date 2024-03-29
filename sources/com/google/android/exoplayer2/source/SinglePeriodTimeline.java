package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.Period;
import com.google.android.exoplayer2.Timeline.Window;
import com.google.android.exoplayer2.util.Assertions;

public final class SinglePeriodTimeline extends Timeline {
    private static final Object UID = new Object();
    private final boolean isDynamic;
    private final boolean isSeekable;
    private final long periodDurationUs;
    private final long presentationStartTimeMs;
    private final Object tag;
    private final long windowDefaultStartPositionUs;
    private final long windowDurationUs;
    private final long windowPositionInPeriodUs;
    private final long windowStartTimeMs;

    public int getPeriodCount() {
        return 1;
    }

    public int getWindowCount() {
        return 1;
    }

    public SinglePeriodTimeline(long j, boolean z, boolean z2) {
        this(j, z, z2, null);
    }

    public SinglePeriodTimeline(long j, boolean z, boolean z2, Object obj) {
        this(j, j, 0, 0, z, z2, obj);
    }

    public SinglePeriodTimeline(long j, long j2, long j3, long j4, boolean z, boolean z2, Object obj) {
        this(C2793C.TIME_UNSET, C2793C.TIME_UNSET, j, j2, j3, j4, z, z2, obj);
    }

    public SinglePeriodTimeline(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, Object obj) {
        this.presentationStartTimeMs = j;
        this.windowStartTimeMs = j2;
        this.periodDurationUs = j3;
        this.windowDurationUs = j4;
        this.windowPositionInPeriodUs = j5;
        this.windowDefaultStartPositionUs = j6;
        this.isSeekable = z;
        this.isDynamic = z2;
        this.tag = obj;
    }

    public Window getWindow(int i, Window window, boolean z, long j) {
        long j2;
        Assertions.checkIndex(i, 0, 1);
        Object obj = z ? this.tag : null;
        long j3 = this.windowDefaultStartPositionUs;
        if (!this.isDynamic || j == 0) {
            j2 = j3;
        } else {
            if (this.windowDurationUs != C2793C.TIME_UNSET) {
                long j4 = j3 + j;
                if (j4 <= this.windowDurationUs) {
                    j2 = j4;
                }
            }
            j2 = -9223372036854775807L;
        }
        return window.set(obj, this.presentationStartTimeMs, this.windowStartTimeMs, this.isSeekable, this.isDynamic, j2, this.windowDurationUs, 0, 0, this.windowPositionInPeriodUs);
    }

    public Period getPeriod(int i, Period period, boolean z) {
        Assertions.checkIndex(i, 0, 1);
        return period.set(null, z ? UID : null, 0, this.periodDurationUs, -this.windowPositionInPeriodUs);
    }

    public int getIndexOfPeriod(Object obj) {
        return UID.equals(obj) ? 0 : -1;
    }
}
