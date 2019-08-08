package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.Util;

final class FixedSampleSizeRechunker {
    private static final int MAX_SAMPLE_SIZE = 8192;

    public static final class Results {
        public final long duration;
        public final int[] flags;
        public final int maximumSize;
        public final long[] offsets;
        public final int[] sizes;
        public final long[] timestamps;

        private Results(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.offsets = jArr;
            this.sizes = iArr;
            this.maximumSize = i;
            this.timestamps = jArr2;
            this.flags = iArr2;
            this.duration = j;
        }
    }

    public static Results rechunk(int i, long[] jArr, int[] iArr, long j) {
        int[] iArr2 = iArr;
        int i2 = MAX_SAMPLE_SIZE / i;
        int i3 = 0;
        int i4 = 0;
        for (int ceilDivide : iArr2) {
            i4 += Util.ceilDivide(ceilDivide, i2);
        }
        long[] jArr2 = new long[i4];
        int[] iArr3 = new int[i4];
        long[] jArr3 = new long[i4];
        int[] iArr4 = new int[i4];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i3 < iArr2.length) {
            int i8 = iArr2[i3];
            long j2 = jArr[i3];
            while (i8 > 0) {
                int min = Math.min(i2, i8);
                jArr2[i6] = j2;
                iArr3[i6] = i * min;
                i7 = Math.max(i7, iArr3[i6]);
                jArr3[i6] = ((long) i5) * j;
                iArr4[i6] = 1;
                i5 += min;
                i8 -= min;
                i6++;
                j2 += (long) iArr3[i6];
                int[] iArr5 = iArr;
            }
            i3++;
            iArr2 = iArr;
        }
        Results results = new Results(jArr2, iArr3, i7, jArr3, iArr4, j * ((long) i5));
        return results;
    }

    private FixedSampleSizeRechunker() {
    }
}
