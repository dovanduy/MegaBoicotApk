package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class GenericMultipleBarcodeReader implements MultipleBarcodeReader {
    private static final int MAX_DEPTH = 4;
    private static final int MIN_DIMENSION_TO_RECUR = 100;
    private final Reader delegate;

    public GenericMultipleBarcodeReader(Reader reader) {
        this.delegate = reader;
    }

    public Result[] decodeMultiple(BinaryBitmap binaryBitmap) throws NotFoundException {
        return decodeMultiple(binaryBitmap, null);
    }

    public Result[] decodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        doDecodeMultiple(binaryBitmap, map, arrayList, 0, 0, 0);
        if (!arrayList.isEmpty()) {
            return (Result[]) arrayList.toArray(new Result[arrayList.size()]);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private void doDecodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, List<Result> list, int i, int i2, int i3) {
        boolean z;
        List<Result> list2;
        float f;
        int i4;
        float f2;
        float f3;
        int i5;
        int i6;
        BinaryBitmap binaryBitmap2 = binaryBitmap;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        if (i9 <= 4) {
            try {
                Map<DecodeHintType, ?> map2 = map;
                Result decode = this.delegate.decode(binaryBitmap2, map2);
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Result) it.next()).getText().equals(decode.getText())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    list2 = list;
                    list2.add(translateResultPoints(decode, i7, i8));
                } else {
                    list2 = list;
                }
                ResultPoint[] resultPoints = decode.getResultPoints();
                if (resultPoints != null && resultPoints.length != 0) {
                    int width = binaryBitmap.getWidth();
                    int height = binaryBitmap.getHeight();
                    float f4 = (float) width;
                    float f5 = (float) height;
                    int length = resultPoints.length;
                    float f6 = 0.0f;
                    float f7 = 0.0f;
                    float f8 = f5;
                    float f9 = f4;
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = length;
                        ResultPoint resultPoint = resultPoints[i10];
                        if (resultPoint != null) {
                            float x = resultPoint.getX();
                            float y = resultPoint.getY();
                            if (x < f9) {
                                f9 = x;
                            }
                            if (y < f8) {
                                f8 = y;
                            }
                            if (x > f6) {
                                f6 = x;
                            }
                            if (y > f7) {
                                f7 = y;
                            }
                        }
                        i10++;
                        length = i11;
                    }
                    if (f9 > 100.0f) {
                        f2 = f7;
                        f3 = f8;
                        i4 = height;
                        f = f6;
                        i5 = width;
                        doDecodeMultiple(binaryBitmap2.crop(0, 0, (int) f9, height), map2, list2, i7, i8, i9 + 1);
                    } else {
                        i4 = height;
                        f = f6;
                        f2 = f7;
                        f3 = f8;
                        i5 = width;
                    }
                    if (f3 > 100.0f) {
                        doDecodeMultiple(binaryBitmap2.crop(0, 0, i5, (int) f3), map2, list2, i7, i8, i9 + 1);
                    }
                    if (f < ((float) (i5 - 100))) {
                        int i12 = (int) f;
                        i6 = i4;
                        BinaryBitmap crop = binaryBitmap2.crop(i12, 0, i5 - i12, i6);
                        doDecodeMultiple(crop, map2, list2, i7 + i12, i8, i9 + 1);
                    } else {
                        i6 = i4;
                    }
                    if (f2 < ((float) (i6 - 100))) {
                        int i13 = (int) f2;
                        BinaryBitmap crop2 = binaryBitmap2.crop(0, i13, i5, i6 - i13);
                        doDecodeMultiple(crop2, map2, list2, i7, i8 + i13, i9 + 1);
                    }
                }
            } catch (ReaderException unused) {
            }
        }
    }

    private static Result translateResultPoints(Result result, int i, int i2) {
        ResultPoint[] resultPoints = result.getResultPoints();
        if (resultPoints == null) {
            return result;
        }
        ResultPoint[] resultPointArr = new ResultPoint[resultPoints.length];
        for (int i3 = 0; i3 < resultPoints.length; i3++) {
            ResultPoint resultPoint = resultPoints[i3];
            if (resultPoint != null) {
                resultPointArr[i3] = new ResultPoint(resultPoint.getX() + ((float) i), resultPoint.getY() + ((float) i2));
            }
        }
        Result result2 = new Result(result.getText(), result.getRawBytes(), result.getNumBits(), resultPointArr, result.getBarcodeFormat(), result.getTimestamp());
        result2.putAllMetadata(result.getResultMetadata());
        return result2;
    }
}
