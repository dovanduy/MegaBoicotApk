package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.offline.FilterableManifest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DashManifest implements FilterableManifest<DashManifest, RepresentationKey> {
    public final long availabilityStartTimeMs;
    public final long durationMs;
    public final boolean dynamic;
    public final Uri location;
    public final long minBufferTimeMs;
    public final long minUpdatePeriodMs;
    private final List<Period> periods;
    public final long publishTimeMs;
    public final long suggestedPresentationDelayMs;
    public final long timeShiftBufferDepthMs;
    public final UtcTimingElement utcTiming;

    public DashManifest(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, UtcTimingElement utcTimingElement, Uri uri, List<Period> list) {
        this.availabilityStartTimeMs = j;
        this.durationMs = j2;
        this.minBufferTimeMs = j3;
        this.dynamic = z;
        this.minUpdatePeriodMs = j4;
        this.timeShiftBufferDepthMs = j5;
        this.suggestedPresentationDelayMs = j6;
        this.publishTimeMs = j7;
        this.utcTiming = utcTimingElement;
        this.location = uri;
        this.periods = list == null ? Collections.emptyList() : list;
    }

    public final int getPeriodCount() {
        return this.periods.size();
    }

    public final Period getPeriod(int i) {
        return (Period) this.periods.get(i);
    }

    public final long getPeriodDurationMs(int i) {
        if (i != this.periods.size() - 1) {
            return ((Period) this.periods.get(i + 1)).startMs - ((Period) this.periods.get(i)).startMs;
        }
        if (this.durationMs == C2793C.TIME_UNSET) {
            return C2793C.TIME_UNSET;
        }
        return this.durationMs - ((Period) this.periods.get(i)).startMs;
    }

    public final long getPeriodDurationUs(int i) {
        return C2793C.msToUs(getPeriodDurationMs(i));
    }

    public final DashManifest copy(List<RepresentationKey> list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new RepresentationKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            int periodCount = getPeriodCount();
            j = C2793C.TIME_UNSET;
            if (i >= periodCount) {
                break;
            }
            if (((RepresentationKey) linkedList.peek()).periodIndex != i) {
                long periodDurationMs = getPeriodDurationMs(i);
                if (periodDurationMs != C2793C.TIME_UNSET) {
                    j2 += periodDurationMs;
                }
            } else {
                Period period = getPeriod(i);
                ArrayList copyAdaptationSets = copyAdaptationSets(period.adaptationSets, linkedList);
                Period period2 = new Period(period.f8649id, period.startMs - j2, copyAdaptationSets, period.eventStreams);
                arrayList.add(period2);
            }
            i++;
        }
        if (this.durationMs != C2793C.TIME_UNSET) {
            j = this.durationMs - j2;
        }
        long j3 = this.availabilityStartTimeMs;
        long j4 = this.minBufferTimeMs;
        boolean z = this.dynamic;
        long j5 = this.minUpdatePeriodMs;
        long j6 = this.timeShiftBufferDepthMs;
        ArrayList arrayList2 = arrayList;
        long j7 = this.suggestedPresentationDelayMs;
        long j8 = this.publishTimeMs;
        long j9 = j8;
        DashManifest dashManifest = new DashManifest(j3, j, j4, z, j5, j6, j7, j9, this.utcTiming, this.location, arrayList2);
        return dashManifest;
    }

    private static ArrayList<AdaptationSet> copyAdaptationSets(List<AdaptationSet> list, LinkedList<RepresentationKey> linkedList) {
        RepresentationKey representationKey = (RepresentationKey) linkedList.poll();
        int i = representationKey.periodIndex;
        ArrayList<AdaptationSet> arrayList = new ArrayList<>();
        do {
            int i2 = representationKey.adaptationSetIndex;
            AdaptationSet adaptationSet = (AdaptationSet) list.get(i2);
            List<Representation> list2 = adaptationSet.representations;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add((Representation) list2.get(representationKey.representationIndex));
                representationKey = (RepresentationKey) linkedList.poll();
                if (representationKey.periodIndex != i) {
                    break;
                }
            } while (representationKey.adaptationSetIndex == i2);
            AdaptationSet adaptationSet2 = new AdaptationSet(adaptationSet.f8647id, adaptationSet.type, arrayList2, adaptationSet.accessibilityDescriptors, adaptationSet.supplementalProperties);
            arrayList.add(adaptationSet2);
        } while (representationKey.periodIndex == i);
        linkedList.addFirst(representationKey);
        return arrayList;
    }
}
