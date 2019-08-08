package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

public final class HlsMediaPlaylist extends HlsPlaylist {
    public static final int PLAYLIST_TYPE_EVENT = 2;
    public static final int PLAYLIST_TYPE_UNKNOWN = 0;
    public static final int PLAYLIST_TYPE_VOD = 1;
    public final int discontinuitySequence;
    public final DrmInitData drmInitData;
    public final long durationUs;
    public final boolean hasDiscontinuitySequence;
    public final boolean hasEndTag;
    public final boolean hasIndependentSegmentsTag;
    public final boolean hasProgramDateTime;
    public final long mediaSequence;
    public final int playlistType;
    public final List<Segment> segments;
    public final long startOffsetUs;
    public final long startTimeUs;
    public final long targetDurationUs;
    public final int version;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaylistType {
    }

    public static final class Segment implements Comparable<Long> {
        public final long byterangeLength;
        public final long byterangeOffset;
        public final long durationUs;
        public final String encryptionIV;
        public final String fullSegmentEncryptionKeyUri;
        public final boolean hasGapTag;
        public final Segment initializationSegment;
        public final int relativeDiscontinuitySequence;
        public final long relativeStartTimeUs;
        public final String url;

        public Segment(String str, long j, long j2) {
            this(str, null, 0, -1, C2793C.TIME_UNSET, null, null, j, j2, false);
        }

        public Segment(String str, Segment segment, long j, int i, long j2, String str2, String str3, long j3, long j4, boolean z) {
            this.url = str;
            this.initializationSegment = segment;
            this.durationUs = j;
            this.relativeDiscontinuitySequence = i;
            this.relativeStartTimeUs = j2;
            this.fullSegmentEncryptionKeyUri = str2;
            this.encryptionIV = str3;
            this.byterangeOffset = j3;
            this.byterangeLength = j4;
            this.hasGapTag = z;
        }

        public int compareTo(Long l) {
            if (this.relativeStartTimeUs > l.longValue()) {
                return 1;
            }
            return this.relativeStartTimeUs < l.longValue() ? -1 : 0;
        }
    }

    public HlsMediaPlaylist copy(List<RenditionKey> list) {
        return this;
    }

    public HlsMediaPlaylist(int i, String str, List<String> list, long j, long j2, boolean z, int i2, long j3, int i3, long j4, boolean z2, boolean z3, boolean z4, DrmInitData drmInitData2, List<Segment> list2) {
        super(str, list);
        this.playlistType = i;
        this.startTimeUs = j2;
        this.hasDiscontinuitySequence = z;
        this.discontinuitySequence = i2;
        this.mediaSequence = j3;
        this.version = i3;
        this.targetDurationUs = j4;
        this.hasIndependentSegmentsTag = z2;
        this.hasEndTag = z3;
        this.hasProgramDateTime = z4;
        this.drmInitData = drmInitData2;
        this.segments = Collections.unmodifiableList(list2);
        if (!list2.isEmpty()) {
            Segment segment = (Segment) list2.get(list2.size() - 1);
            this.durationUs = segment.relativeStartTimeUs + segment.durationUs;
        } else {
            this.durationUs = 0;
        }
        long j5 = j == C2793C.TIME_UNSET ? -9223372036854775807L : j >= 0 ? j : this.durationUs + j;
        this.startOffsetUs = j5;
    }

    public boolean isNewerThan(HlsMediaPlaylist hlsMediaPlaylist) {
        boolean z = true;
        if (hlsMediaPlaylist == null || this.mediaSequence > hlsMediaPlaylist.mediaSequence) {
            return true;
        }
        if (this.mediaSequence < hlsMediaPlaylist.mediaSequence) {
            return false;
        }
        int size = this.segments.size();
        int size2 = hlsMediaPlaylist.segments.size();
        if (size <= size2 && (size != size2 || !this.hasEndTag || hlsMediaPlaylist.hasEndTag)) {
            z = false;
        }
        return z;
    }

    public long getEndTimeUs() {
        return this.startTimeUs + this.durationUs;
    }

    public HlsMediaPlaylist copyWith(long j, int i) {
        int i2 = this.playlistType;
        String str = this.baseUri;
        List list = this.tags;
        long j2 = this.startOffsetUs;
        long j3 = this.mediaSequence;
        int i3 = this.version;
        long j4 = this.targetDurationUs;
        boolean z = this.hasIndependentSegmentsTag;
        boolean z2 = this.hasEndTag;
        boolean z3 = this.hasProgramDateTime;
        long j5 = j;
        boolean z4 = z2;
        boolean z5 = z;
        int i4 = i;
        HlsMediaPlaylist hlsMediaPlaylist = new HlsMediaPlaylist(i2, str, list, j2, j5, true, i4, j3, i3, j4, z5, z4, z3, this.drmInitData, this.segments);
        return hlsMediaPlaylist;
    }

    public HlsMediaPlaylist copyWithEndTag() {
        if (this.hasEndTag) {
            return this;
        }
        int i = this.playlistType;
        String str = this.baseUri;
        List list = this.tags;
        long j = this.startOffsetUs;
        long j2 = this.startTimeUs;
        boolean z = this.hasDiscontinuitySequence;
        int i2 = this.discontinuitySequence;
        long j3 = this.mediaSequence;
        int i3 = this.version;
        long j4 = this.targetDurationUs;
        boolean z2 = this.hasIndependentSegmentsTag;
        long j5 = j4;
        boolean z3 = this.hasProgramDateTime;
        DrmInitData drmInitData2 = this.drmInitData;
        long j6 = j5;
        int i4 = i3;
        long j7 = j6;
        HlsMediaPlaylist hlsMediaPlaylist = new HlsMediaPlaylist(i, str, list, j, j2, z, i2, j3, i4, j7, z2, true, z3, drmInitData2, this.segments);
        return hlsMediaPlaylist;
    }
}
