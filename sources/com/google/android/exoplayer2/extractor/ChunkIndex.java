package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.SeekMap.SeekPoints;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

public final class ChunkIndex implements SeekMap {
    private final long durationUs;
    public final long[] durationsUs;
    public final int length;
    public final long[] offsets;
    public final int[] sizes;
    public final long[] timesUs;

    public boolean isSeekable() {
        return true;
    }

    public ChunkIndex(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.sizes = iArr;
        this.offsets = jArr;
        this.durationsUs = jArr2;
        this.timesUs = jArr3;
        this.length = iArr.length;
        if (this.length > 0) {
            this.durationUs = jArr2[this.length - 1] + jArr3[this.length - 1];
        } else {
            this.durationUs = 0;
        }
    }

    public int getChunkIndex(long j) {
        return Util.binarySearchFloor(this.timesUs, j, true, true);
    }

    public long getDurationUs() {
        return this.durationUs;
    }

    public SeekPoints getSeekPoints(long j) {
        int chunkIndex = getChunkIndex(j);
        SeekPoint seekPoint = new SeekPoint(this.timesUs[chunkIndex], this.offsets[chunkIndex]);
        if (seekPoint.timeUs >= j || chunkIndex == this.length - 1) {
            return new SeekPoints(seekPoint);
        }
        int i = chunkIndex + 1;
        return new SeekPoints(seekPoint, new SeekPoint(this.timesUs[i], this.offsets[i]));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChunkIndex(length=");
        sb.append(this.length);
        sb.append(", sizes=");
        sb.append(Arrays.toString(this.sizes));
        sb.append(", offsets=");
        sb.append(Arrays.toString(this.offsets));
        sb.append(", timeUs=");
        sb.append(Arrays.toString(this.timesUs));
        sb.append(", durationsUs=");
        sb.append(Arrays.toString(this.durationsUs));
        sb.append(")");
        return sb.toString();
    }
}
