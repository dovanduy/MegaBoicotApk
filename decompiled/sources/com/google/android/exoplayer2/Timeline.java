package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup;
import com.google.android.exoplayer2.util.Assertions;

public abstract class Timeline {
    public static final Timeline EMPTY = new Timeline() {
        public int getIndexOfPeriod(Object obj) {
            return -1;
        }

        public int getPeriodCount() {
            return 0;
        }

        public int getWindowCount() {
            return 0;
        }

        public Window getWindow(int i, Window window, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        public Period getPeriod(int i, Period period, boolean z) {
            throw new IndexOutOfBoundsException();
        }
    };

    public static final class Period {
        private AdPlaybackState adPlaybackState;
        public long durationUs;

        /* renamed from: id */
        public Object f8628id;
        private long positionInWindowUs;
        public Object uid;
        public int windowIndex;

        public Period set(Object obj, Object obj2, int i, long j, long j2) {
            return set(obj, obj2, i, j, j2, AdPlaybackState.NONE);
        }

        public Period set(Object obj, Object obj2, int i, long j, long j2, AdPlaybackState adPlaybackState2) {
            this.f8628id = obj;
            this.uid = obj2;
            this.windowIndex = i;
            this.durationUs = j;
            this.positionInWindowUs = j2;
            this.adPlaybackState = adPlaybackState2;
            return this;
        }

        public long getDurationMs() {
            return C2793C.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public long getPositionInWindowMs() {
            return C2793C.usToMs(this.positionInWindowUs);
        }

        public long getPositionInWindowUs() {
            return this.positionInWindowUs;
        }

        public int getAdGroupCount() {
            return this.adPlaybackState.adGroupCount;
        }

        public long getAdGroupTimeUs(int i) {
            return this.adPlaybackState.adGroupTimesUs[i];
        }

        public int getFirstAdIndexToPlay(int i) {
            return this.adPlaybackState.adGroups[i].getFirstAdIndexToPlay();
        }

        public int getNextAdIndexToPlay(int i, int i2) {
            return this.adPlaybackState.adGroups[i].getNextAdIndexToPlay(i2);
        }

        public boolean hasPlayedAdGroup(int i) {
            return !this.adPlaybackState.adGroups[i].hasUnplayedAds();
        }

        public int getAdGroupIndexForPositionUs(long j) {
            return this.adPlaybackState.getAdGroupIndexForPositionUs(j);
        }

        public int getAdGroupIndexAfterPositionUs(long j) {
            return this.adPlaybackState.getAdGroupIndexAfterPositionUs(j);
        }

        public int getAdCountInAdGroup(int i) {
            return this.adPlaybackState.adGroups[i].count;
        }

        public boolean isAdAvailable(int i, int i2) {
            AdGroup adGroup = this.adPlaybackState.adGroups[i];
            return (adGroup.count == -1 || adGroup.states[i2] == 0) ? false : true;
        }

        public long getAdDurationUs(int i, int i2) {
            AdGroup adGroup = this.adPlaybackState.adGroups[i];
            return adGroup.count != -1 ? adGroup.durationsUs[i2] : C2793C.TIME_UNSET;
        }

        public long getAdResumePositionUs() {
            return this.adPlaybackState.adResumePositionUs;
        }
    }

    public static final class Window {
        public long defaultPositionUs;
        public long durationUs;
        public int firstPeriodIndex;
        public boolean isDynamic;
        public boolean isSeekable;
        public int lastPeriodIndex;
        public long positionInFirstPeriodUs;
        public long presentationStartTimeMs;
        public Object tag;
        public long windowStartTimeMs;

        public Window set(Object obj, long j, long j2, boolean z, boolean z2, long j3, long j4, int i, int i2, long j5) {
            this.tag = obj;
            this.presentationStartTimeMs = j;
            this.windowStartTimeMs = j2;
            this.isSeekable = z;
            this.isDynamic = z2;
            this.defaultPositionUs = j3;
            this.durationUs = j4;
            this.firstPeriodIndex = i;
            this.lastPeriodIndex = i2;
            this.positionInFirstPeriodUs = j5;
            return this;
        }

        public long getDefaultPositionMs() {
            return C2793C.usToMs(this.defaultPositionUs);
        }

        public long getDefaultPositionUs() {
            return this.defaultPositionUs;
        }

        public long getDurationMs() {
            return C2793C.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public long getPositionInFirstPeriodMs() {
            return C2793C.usToMs(this.positionInFirstPeriodUs);
        }

        public long getPositionInFirstPeriodUs() {
            return this.positionInFirstPeriodUs;
        }
    }

    public abstract int getIndexOfPeriod(Object obj);

    public abstract Period getPeriod(int i, Period period, boolean z);

    public abstract int getPeriodCount();

    public abstract Window getWindow(int i, Window window, boolean z, long j);

    public abstract int getWindowCount();

    public final boolean isEmpty() {
        return getWindowCount() == 0;
    }

    public int getNextWindowIndex(int i, int i2, boolean z) {
        int i3;
        switch (i2) {
            case 0:
                return i == getLastWindowIndex(z) ? -1 : i + 1;
            case 1:
                return i;
            case 2:
                if (i == getLastWindowIndex(z)) {
                    i3 = getFirstWindowIndex(z);
                } else {
                    i3 = i + 1;
                }
                return i3;
            default:
                throw new IllegalStateException();
        }
    }

    public int getPreviousWindowIndex(int i, int i2, boolean z) {
        int i3;
        switch (i2) {
            case 0:
                return i == getFirstWindowIndex(z) ? -1 : i - 1;
            case 1:
                return i;
            case 2:
                if (i == getFirstWindowIndex(z)) {
                    i3 = getLastWindowIndex(z);
                } else {
                    i3 = i - 1;
                }
                return i3;
            default:
                throw new IllegalStateException();
        }
    }

    public int getLastWindowIndex(boolean z) {
        if (isEmpty()) {
            return -1;
        }
        return getWindowCount() - 1;
    }

    public int getFirstWindowIndex(boolean z) {
        return isEmpty() ? -1 : 0;
    }

    public final Window getWindow(int i, Window window) {
        return getWindow(i, window, false);
    }

    public final Window getWindow(int i, Window window, boolean z) {
        return getWindow(i, window, z, 0);
    }

    public final int getNextPeriodIndex(int i, Period period, Window window, int i2, boolean z) {
        int i3 = getPeriod(i, period).windowIndex;
        if (getWindow(i3, window).lastPeriodIndex != i) {
            return i + 1;
        }
        int nextWindowIndex = getNextWindowIndex(i3, i2, z);
        if (nextWindowIndex == -1) {
            return -1;
        }
        return getWindow(nextWindowIndex, window).firstPeriodIndex;
    }

    public final boolean isLastPeriod(int i, Period period, Window window, int i2, boolean z) {
        return getNextPeriodIndex(i, period, window, i2, z) == -1;
    }

    public final Pair<Integer, Long> getPeriodPosition(Window window, Period period, int i, long j) {
        return getPeriodPosition(window, period, i, j, 0);
    }

    public final Pair<Integer, Long> getPeriodPosition(Window window, Period period, int i, long j, long j2) {
        Assertions.checkIndex(i, 0, getWindowCount());
        getWindow(i, window, false, j2);
        if (j == C2793C.TIME_UNSET) {
            j = window.getDefaultPositionUs();
            if (j == C2793C.TIME_UNSET) {
                return null;
            }
        }
        int i2 = window.firstPeriodIndex;
        long positionInFirstPeriodUs = window.getPositionInFirstPeriodUs() + j;
        long durationUs = getPeriod(i2, period).getDurationUs();
        while (durationUs != C2793C.TIME_UNSET && positionInFirstPeriodUs >= durationUs && i2 < window.lastPeriodIndex) {
            long j3 = positionInFirstPeriodUs - durationUs;
            i2++;
            durationUs = getPeriod(i2, period).getDurationUs();
            positionInFirstPeriodUs = j3;
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(positionInFirstPeriodUs));
    }

    public final Period getPeriod(int i, Period period) {
        return getPeriod(i, period, false);
    }
}
