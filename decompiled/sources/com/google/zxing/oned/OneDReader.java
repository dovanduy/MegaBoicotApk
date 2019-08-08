package com.google.zxing.oned;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public abstract class OneDReader implements Reader {
    public abstract Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException;

    public void reset() {
    }

    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, FormatException {
        return decode(binaryBitmap, null);
    }

    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        try {
            return doDecode(binaryBitmap, map);
        } catch (NotFoundException e) {
            if (!(map != null && map.containsKey(DecodeHintType.TRY_HARDER)) || !binaryBitmap.isRotateSupported()) {
                throw e;
            }
            BinaryBitmap rotateCounterClockwise = binaryBitmap.rotateCounterClockwise();
            Result doDecode = doDecode(rotateCounterClockwise, map);
            Map resultMetadata = doDecode.getResultMetadata();
            int i = 270;
            if (resultMetadata != null && resultMetadata.containsKey(ResultMetadataType.ORIENTATION)) {
                i = (270 + ((Integer) resultMetadata.get(ResultMetadataType.ORIENTATION)).intValue()) % 360;
            }
            doDecode.putMetadata(ResultMetadataType.ORIENTATION, Integer.valueOf(i));
            ResultPoint[] resultPoints = doDecode.getResultPoints();
            if (resultPoints != null) {
                int height = rotateCounterClockwise.getHeight();
                for (int i2 = 0; i2 < resultPoints.length; i2++) {
                    resultPoints[i2] = new ResultPoint((((float) height) - resultPoints[i2].getY()) - 1.0f, resultPoints[i2].getX());
                }
            }
            return doDecode;
        }
    }

    private Result doDecode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Map<DecodeHintType, ?> map2 = map;
        int width = binaryBitmap.getWidth();
        int height = binaryBitmap.getHeight();
        BitArray bitArray = new BitArray(width);
        int i7 = height >> 1;
        int i8 = 1;
        boolean z = map2 != null && map2.containsKey(DecodeHintType.TRY_HARDER);
        int max = Math.max(1, height >> (z ? 8 : 5));
        int i9 = z ? height : 15;
        Map<DecodeHintType, ?> map3 = map2;
        int i10 = 0;
        while (i10 < i9) {
            int i11 = i10 + 1;
            int i12 = i11 / 2;
            if (((i10 & 1) == 0 ? i8 : 0) == 0) {
                i12 = -i12;
            }
            int i13 = (i12 * max) + i7;
            if (i13 < 0 || i13 >= height) {
                break;
            }
            try {
                BitArray blackRow = binaryBitmap.getBlackRow(i13, bitArray);
                int i14 = 0;
                while (i14 < 2) {
                    if (i14 == i8) {
                        blackRow.reverse();
                        if (map3 != null && map3.containsKey(DecodeHintType.NEED_RESULT_POINT_CALLBACK)) {
                            EnumMap enumMap = new EnumMap(DecodeHintType.class);
                            enumMap.putAll(map3);
                            enumMap.remove(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
                            map3 = enumMap;
                        }
                    }
                    try {
                        Result decodeRow = decodeRow(i13, blackRow, map3);
                        if (i14 == i8) {
                            try {
                                decodeRow.putMetadata(ResultMetadataType.ORIENTATION, Integer.valueOf(180));
                                ResultPoint[] resultPoints = decodeRow.getResultPoints();
                                if (resultPoints != null) {
                                    float f = (float) width;
                                    i5 = width;
                                    try {
                                        i4 = height;
                                    } catch (ReaderException unused) {
                                        i4 = height;
                                        i6 = 1;
                                        i14++;
                                        i8 = i6;
                                        width = i5;
                                        height = i4;
                                        BinaryBitmap binaryBitmap2 = binaryBitmap;
                                    }
                                    try {
                                        resultPoints[0] = new ResultPoint((f - resultPoints[0].getX()) - 1.0f, resultPoints[0].getY());
                                        i6 = 1;
                                        try {
                                            resultPoints[1] = new ResultPoint((f - resultPoints[1].getX()) - 1.0f, resultPoints[1].getY());
                                        } catch (ReaderException unused2) {
                                            continue;
                                        }
                                    } catch (ReaderException unused3) {
                                        i6 = 1;
                                        i14++;
                                        i8 = i6;
                                        width = i5;
                                        height = i4;
                                        BinaryBitmap binaryBitmap22 = binaryBitmap;
                                    }
                                }
                            } catch (ReaderException unused4) {
                                i5 = width;
                                i4 = height;
                                i6 = 1;
                                i14++;
                                i8 = i6;
                                width = i5;
                                height = i4;
                                BinaryBitmap binaryBitmap222 = binaryBitmap;
                            }
                        }
                        return decodeRow;
                    } catch (ReaderException unused5) {
                        i5 = width;
                        i4 = height;
                        i6 = i8;
                        i14++;
                        i8 = i6;
                        width = i5;
                        height = i4;
                        BinaryBitmap binaryBitmap2222 = binaryBitmap;
                    }
                }
                i2 = width;
                i = height;
                i3 = i8;
                bitArray = blackRow;
            } catch (NotFoundException unused6) {
                i2 = width;
                i = height;
                i3 = i8;
            }
            i8 = i3;
            i10 = i11;
            width = i2;
            height = i;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    protected static void recordPattern(BitArray bitArray, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        Arrays.fill(iArr, 0, length, 0);
        int size = bitArray.getSize();
        if (i >= size) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z = !bitArray.get(i);
        int i2 = 0;
        while (i < size) {
            if (!(bitArray.get(i) ^ z)) {
                i2++;
                if (i2 == length) {
                    break;
                }
                iArr[i2] = 1;
                z = !z;
            } else {
                iArr[i2] = iArr[i2] + 1;
            }
            i++;
        }
        if (i2 == length) {
            return;
        }
        if (i2 != length - 1 || i != size) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    protected static void recordPatternInReverse(BitArray bitArray, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean z = bitArray.get(i);
        while (i > 0 && length >= 0) {
            i--;
            if (bitArray.get(i) != z) {
                length--;
                z = !z;
            }
        }
        if (length >= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        recordPattern(bitArray, i + 1, iArr);
    }

    protected static float patternMatchVariance(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) iArr[i4];
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }
}
