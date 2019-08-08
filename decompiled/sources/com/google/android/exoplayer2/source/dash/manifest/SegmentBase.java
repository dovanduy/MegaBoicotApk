package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.util.Util;
import java.util.List;

public abstract class SegmentBase {
    final RangedUri initialization;
    final long presentationTimeOffset;
    final long timescale;

    public static abstract class MultiSegmentBase extends SegmentBase {
        final long duration;
        final List<SegmentTimelineElement> segmentTimeline;
        final long startNumber;

        public abstract int getSegmentCount(long j);

        public abstract RangedUri getSegmentUrl(Representation representation, long j);

        public MultiSegmentBase(RangedUri rangedUri, long j, long j2, long j3, long j4, List<SegmentTimelineElement> list) {
            super(rangedUri, j, j2);
            this.startNumber = j3;
            this.duration = j4;
            this.segmentTimeline = list;
        }

        public long getSegmentNum(long j, long j2) {
            long firstSegmentNum = getFirstSegmentNum();
            long segmentCount = (long) getSegmentCount(j2);
            if (segmentCount == 0) {
                return firstSegmentNum;
            }
            if (this.segmentTimeline == null) {
                long j3 = this.startNumber + (j / ((this.duration * 1000000) / this.timescale));
                if (j3 >= firstSegmentNum) {
                    if (segmentCount == -1) {
                        firstSegmentNum = j3;
                    } else {
                        firstSegmentNum = Math.min(j3, (firstSegmentNum + segmentCount) - 1);
                    }
                }
                return firstSegmentNum;
            }
            long j4 = (firstSegmentNum + segmentCount) - 1;
            long j5 = firstSegmentNum;
            while (j5 <= j4) {
                long j6 = j5 + ((j4 - j5) / 2);
                long segmentTimeUs = getSegmentTimeUs(j6);
                if (segmentTimeUs < j) {
                    j5 = j6 + 1;
                } else if (segmentTimeUs <= j) {
                    return j6;
                } else {
                    j4 = j6 - 1;
                }
            }
            if (j5 != firstSegmentNum) {
                j5 = j4;
            }
            return j5;
        }

        public final long getSegmentDurationUs(long j, long j2) {
            if (this.segmentTimeline != null) {
                return (((SegmentTimelineElement) this.segmentTimeline.get((int) (j - this.startNumber))).duration * 1000000) / this.timescale;
            }
            int segmentCount = getSegmentCount(j2);
            return (segmentCount == -1 || j != (getFirstSegmentNum() + ((long) segmentCount)) - 1) ? (this.duration * 1000000) / this.timescale : j2 - getSegmentTimeUs(j);
        }

        public final long getSegmentTimeUs(long j) {
            long j2;
            if (this.segmentTimeline != null) {
                j2 = ((SegmentTimelineElement) this.segmentTimeline.get((int) (j - this.startNumber))).startTime - this.presentationTimeOffset;
            } else {
                j2 = (j - this.startNumber) * this.duration;
            }
            return Util.scaleLargeTimestamp(j2, 1000000, this.timescale);
        }

        public long getFirstSegmentNum() {
            return this.startNumber;
        }

        public boolean isExplicit() {
            return this.segmentTimeline != null;
        }
    }

    public static class SegmentList extends MultiSegmentBase {
        final List<RangedUri> mediaSegments;

        public boolean isExplicit() {
            return true;
        }

        public SegmentList(RangedUri rangedUri, long j, long j2, long j3, long j4, List<SegmentTimelineElement> list, List<RangedUri> list2) {
            super(rangedUri, j, j2, j3, j4, list);
            this.mediaSegments = list2;
        }

        public RangedUri getSegmentUrl(Representation representation, long j) {
            return (RangedUri) this.mediaSegments.get((int) (j - this.startNumber));
        }

        public int getSegmentCount(long j) {
            return this.mediaSegments.size();
        }
    }

    public static class SegmentTemplate extends MultiSegmentBase {
        final UrlTemplate initializationTemplate;
        final UrlTemplate mediaTemplate;

        public SegmentTemplate(RangedUri rangedUri, long j, long j2, long j3, long j4, List<SegmentTimelineElement> list, UrlTemplate urlTemplate, UrlTemplate urlTemplate2) {
            super(rangedUri, j, j2, j3, j4, list);
            this.initializationTemplate = urlTemplate;
            this.mediaTemplate = urlTemplate2;
        }

        public RangedUri getInitialization(Representation representation) {
            if (this.initializationTemplate == null) {
                return super.getInitialization(representation);
            }
            RangedUri rangedUri = new RangedUri(this.initializationTemplate.buildUri(representation.format.f8626id, 0, representation.format.bitrate, 0), 0, -1);
            return rangedUri;
        }

        public RangedUri getSegmentUrl(Representation representation, long j) {
            long j2;
            Representation representation2 = representation;
            if (this.segmentTimeline != null) {
                j2 = ((SegmentTimelineElement) this.segmentTimeline.get((int) (j - this.startNumber))).startTime;
            } else {
                j2 = (j - this.startNumber) * this.duration;
            }
            RangedUri rangedUri = new RangedUri(this.mediaTemplate.buildUri(representation2.format.f8626id, j, representation2.format.bitrate, j2), 0, -1);
            return rangedUri;
        }

        public int getSegmentCount(long j) {
            if (this.segmentTimeline != null) {
                return this.segmentTimeline.size();
            }
            if (j != C2793C.TIME_UNSET) {
                return (int) Util.ceilDivide(j, (this.duration * 1000000) / this.timescale);
            }
            return -1;
        }
    }

    public static class SegmentTimelineElement {
        final long duration;
        final long startTime;

        public SegmentTimelineElement(long j, long j2) {
            this.startTime = j;
            this.duration = j2;
        }
    }

    public static class SingleSegmentBase extends SegmentBase {
        final long indexLength;
        final long indexStart;

        public SingleSegmentBase(RangedUri rangedUri, long j, long j2, long j3, long j4) {
            super(rangedUri, j, j2);
            this.indexStart = j3;
            this.indexLength = j4;
        }

        public SingleSegmentBase() {
            this(null, 1, 0, 0, 0);
        }

        public RangedUri getIndex() {
            if (this.indexLength <= 0) {
                return null;
            }
            RangedUri rangedUri = new RangedUri(null, this.indexStart, this.indexLength);
            return rangedUri;
        }
    }

    public SegmentBase(RangedUri rangedUri, long j, long j2) {
        this.initialization = rangedUri;
        this.timescale = j;
        this.presentationTimeOffset = j2;
    }

    public RangedUri getInitialization(Representation representation) {
        return this.initialization;
    }

    public long getPresentationTimeOffsetUs() {
        return Util.scaleLargeTimestamp(this.presentationTimeOffset, 1000000, this.timescale);
    }
}
