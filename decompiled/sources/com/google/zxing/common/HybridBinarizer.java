package com.google.zxing.common;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;

public final class HybridBinarizer extends GlobalHistogramBinarizer {
    private static final int BLOCK_SIZE = 8;
    private static final int BLOCK_SIZE_MASK = 7;
    private static final int BLOCK_SIZE_POWER = 3;
    private static final int MINIMUM_DIMENSION = 40;
    private static final int MIN_DYNAMIC_RANGE = 24;
    private BitMatrix matrix;

    private static int cap(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public HybridBinarizer(LuminanceSource luminanceSource) {
        super(luminanceSource);
    }

    public BitMatrix getBlackMatrix() throws NotFoundException {
        if (this.matrix != null) {
            return this.matrix;
        }
        LuminanceSource luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        int height = luminanceSource.getHeight();
        if (width < 40 || height < 40) {
            this.matrix = super.getBlackMatrix();
        } else {
            byte[] matrix2 = luminanceSource.getMatrix();
            int i = width >> 3;
            if ((width & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = height >> 3;
            if ((height & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] calculateBlackPoints = calculateBlackPoints(matrix2, i2, i4, width, height);
            BitMatrix bitMatrix = new BitMatrix(width, height);
            calculateThresholdForBlock(matrix2, i2, i4, width, height, calculateBlackPoints, bitMatrix);
            this.matrix = bitMatrix;
        }
        return this.matrix;
    }

    public Binarizer createBinarizer(LuminanceSource luminanceSource) {
        return new HybridBinarizer(luminanceSource);
    }

    private static void calculateThresholdForBlock(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, BitMatrix bitMatrix) {
        int i5 = i;
        int i6 = i2;
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = i7 << 3;
            int i9 = i4 - 8;
            if (i8 > i9) {
                i8 = i9;
            }
            for (int i10 = 0; i10 < i5; i10++) {
                int i11 = i10 << 3;
                int i12 = i3 - 8;
                if (i11 <= i12) {
                    i12 = i11;
                }
                int cap = cap(i10, 2, i5 - 3);
                int cap2 = cap(i7, 2, i6 - 3);
                int i13 = 0;
                for (int i14 = -2; i14 <= 2; i14++) {
                    int[] iArr2 = iArr[cap2 + i14];
                    i13 += iArr2[cap - 2] + iArr2[cap - 1] + iArr2[cap] + iArr2[cap + 1] + iArr2[cap + 2];
                }
                thresholdBlock(bArr, i12, i8, i13 / 25, i3, bitMatrix);
            }
        }
    }

    private static void thresholdBlock(byte[] bArr, int i, int i2, int i3, int i4, BitMatrix bitMatrix) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    bitMatrix.set(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    private static int[][] calculateBlackPoints(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{i6, i5});
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = i7 << 3;
            int i9 = 8;
            int i10 = i4 - 8;
            if (i8 <= i10) {
                i10 = i8;
            }
            int i11 = 0;
            while (i11 < i5) {
                int i12 = i11 << 3;
                int i13 = i3 - 8;
                if (i12 > i13) {
                    i12 = i13;
                }
                byte b = 255;
                int i14 = (i10 * i3) + i12;
                int i15 = 0;
                int i16 = 0;
                byte b2 = 0;
                while (i15 < i9) {
                    byte b3 = b2;
                    int i17 = i16;
                    int i18 = 0;
                    while (i18 < i9) {
                        byte b4 = bArr[i14 + i18] & 255;
                        i17 += b4;
                        if (b4 < b) {
                            b = b4;
                        }
                        if (b4 > b3) {
                            b3 = b4;
                        }
                        i18++;
                        i9 = 8;
                    }
                    if (b3 - b <= 24) {
                        i16 = i17;
                        i15++;
                        i14 += i3;
                        b2 = b3;
                        i9 = 8;
                    }
                    while (true) {
                        i15++;
                        i14 += i3;
                        if (i15 >= 8) {
                            break;
                        }
                        int i19 = 0;
                        for (int i20 = 8; i19 < i20; i20 = 8) {
                            i17 += bArr[i14 + i19] & 255;
                            i19++;
                        }
                    }
                    i16 = i17;
                    i15++;
                    i14 += i3;
                    b2 = b3;
                    i9 = 8;
                }
                int i21 = i16 >> 6;
                if (b2 - b <= 24) {
                    i21 = b / 2;
                    if (i7 > 0 && i11 > 0) {
                        int i22 = i7 - 1;
                        int i23 = i11 - 1;
                        int i24 = ((iArr[i22][i11] + (2 * iArr[i7][i23])) + iArr[i22][i23]) / 4;
                        if (b < i24) {
                            i21 = i24;
                        }
                    }
                }
                iArr[i7][i11] = i21;
                i11++;
                i9 = 8;
            }
        }
        return iArr;
    }
}
