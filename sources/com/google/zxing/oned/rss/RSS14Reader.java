package com.google.zxing.oned.rss;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class RSS14Reader extends AbstractRSSReader {
    private static final int[][] FINDER_PATTERNS = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    private static final int[] INSIDE_GSUM = {0, 336, 1036, 1516};
    private static final int[] INSIDE_ODD_TOTAL_SUBSET = {4, 20, 48, 81};
    private static final int[] INSIDE_ODD_WIDEST = {2, 4, 6, 8};
    private static final int[] OUTSIDE_EVEN_TOTAL_SUBSET = {1, 10, 34, 70, 126};
    private static final int[] OUTSIDE_GSUM = {0, 161, 961, 2015, 2715};
    private static final int[] OUTSIDE_ODD_WIDEST = {8, 6, 4, 3, 1};
    private final List<Pair> possibleLeftPairs = new ArrayList();
    private final List<Pair> possibleRightPairs = new ArrayList();

    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
        addOrTally(this.possibleLeftPairs, decodePair(bitArray, false, i, map));
        bitArray.reverse();
        addOrTally(this.possibleRightPairs, decodePair(bitArray, true, i, map));
        bitArray.reverse();
        for (Pair pair : this.possibleLeftPairs) {
            if (pair.getCount() > 1) {
                for (Pair pair2 : this.possibleRightPairs) {
                    if (pair2.getCount() > 1 && checkChecksum(pair, pair2)) {
                        return constructResult(pair, pair2);
                    }
                }
                continue;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static void addOrTally(Collection<Pair> collection, Pair pair) {
        if (pair != null) {
            boolean z = false;
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair pair2 = (Pair) it.next();
                if (pair2.getValue() == pair.getValue()) {
                    pair2.incrementCount();
                    z = true;
                    break;
                }
            }
            if (!z) {
                collection.add(pair);
            }
        }
    }

    public void reset() {
        this.possibleLeftPairs.clear();
        this.possibleRightPairs.clear();
    }

    private static Result constructResult(Pair pair, Pair pair2) {
        String valueOf = String.valueOf((4537077 * ((long) pair.getValue())) + ((long) pair2.getValue()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        ResultPoint[] resultPoints = pair.getFinderPattern().getResultPoints();
        ResultPoint[] resultPoints2 = pair2.getFinderPattern().getResultPoints();
        return new Result(String.valueOf(sb.toString()), null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_14);
    }

    private static boolean checkChecksum(Pair pair, Pair pair2) {
        int checksumPortion = (pair.getChecksumPortion() + (16 * pair2.getChecksumPortion())) % 79;
        int value = (9 * pair.getFinderPattern().getValue()) + pair2.getFinderPattern().getValue();
        if (value > 72) {
            value--;
        }
        if (value > 8) {
            value--;
        }
        return checksumPortion == value;
    }

    private Pair decodePair(BitArray bitArray, boolean z, int i, Map<DecodeHintType, ?> map) {
        ResultPointCallback resultPointCallback;
        try {
            int[] findFinderPattern = findFinderPattern(bitArray, 0, z);
            FinderPattern parseFoundFinderPattern = parseFoundFinderPattern(bitArray, i, z, findFinderPattern);
            if (map == null) {
                resultPointCallback = null;
            } else {
                resultPointCallback = (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            }
            if (resultPointCallback != null) {
                float f = ((float) (findFinderPattern[0] + findFinderPattern[1])) / 2.0f;
                if (z) {
                    f = ((float) (bitArray.getSize() - 1)) - f;
                }
                resultPointCallback.foundPossibleResultPoint(new ResultPoint(f, (float) i));
            }
            DataCharacter decodeDataCharacter = decodeDataCharacter(bitArray, parseFoundFinderPattern, true);
            DataCharacter decodeDataCharacter2 = decodeDataCharacter(bitArray, parseFoundFinderPattern, false);
            return new Pair((1597 * decodeDataCharacter.getValue()) + decodeDataCharacter2.getValue(), decodeDataCharacter.getChecksumPortion() + (4 * decodeDataCharacter2.getChecksumPortion()), parseFoundFinderPattern);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private DataCharacter decodeDataCharacter(BitArray bitArray, FinderPattern finderPattern, boolean z) throws NotFoundException {
        BitArray bitArray2 = bitArray;
        boolean z2 = z;
        int[] dataCharacterCounters = getDataCharacterCounters();
        dataCharacterCounters[0] = 0;
        dataCharacterCounters[1] = 0;
        dataCharacterCounters[2] = 0;
        dataCharacterCounters[3] = 0;
        dataCharacterCounters[4] = 0;
        dataCharacterCounters[5] = 0;
        dataCharacterCounters[6] = 0;
        dataCharacterCounters[7] = 0;
        if (z2) {
            recordPatternInReverse(bitArray2, finderPattern.getStartEnd()[0], dataCharacterCounters);
        } else {
            recordPattern(bitArray2, finderPattern.getStartEnd()[1] + 1, dataCharacterCounters);
            int i = 0;
            for (int length = dataCharacterCounters.length - 1; i < length; length--) {
                int i2 = dataCharacterCounters[i];
                dataCharacterCounters[i] = dataCharacterCounters[length];
                dataCharacterCounters[length] = i2;
                i++;
            }
        }
        int i3 = z2 ? 16 : 15;
        float sum = ((float) MathUtils.sum(dataCharacterCounters)) / ((float) i3);
        int[] oddCounts = getOddCounts();
        int[] evenCounts = getEvenCounts();
        float[] oddRoundingErrors = getOddRoundingErrors();
        float[] evenRoundingErrors = getEvenRoundingErrors();
        for (int i4 = 0; i4 < dataCharacterCounters.length; i4++) {
            float f = ((float) dataCharacterCounters[i4]) / sum;
            int i5 = (int) (0.5f + f);
            if (i5 <= 0) {
                i5 = 1;
            } else if (i5 > 8) {
                i5 = 8;
            }
            int i6 = i4 / 2;
            if ((i4 & 1) == 0) {
                oddCounts[i6] = i5;
                oddRoundingErrors[i6] = f - ((float) i5);
            } else {
                evenCounts[i6] = i5;
                evenRoundingErrors[i6] = f - ((float) i5);
            }
        }
        adjustOddEvenCounts(z2, i3);
        int i7 = 0;
        int i8 = 0;
        for (int length2 = oddCounts.length - 1; length2 >= 0; length2--) {
            i7 = (i7 * 9) + oddCounts[length2];
            i8 += oddCounts[length2];
        }
        int i9 = 0;
        int i10 = 0;
        for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
            i9 = (i9 * 9) + evenCounts[length3];
            i10 += evenCounts[length3];
        }
        int i11 = i7 + (3 * i9);
        if (z2) {
            if ((i8 & 1) != 0 || i8 > 12 || i8 < 4) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i12 = (12 - i8) / 2;
            int i13 = OUTSIDE_ODD_WIDEST[i12];
            int i14 = 9 - i13;
            return new DataCharacter((RSSUtils.getRSSvalue(oddCounts, i13, false) * OUTSIDE_EVEN_TOTAL_SUBSET[i12]) + RSSUtils.getRSSvalue(evenCounts, i14, true) + OUTSIDE_GSUM[i12], i11);
        } else if ((i10 & 1) != 0 || i10 > 10 || i10 < 4) {
            throw NotFoundException.getNotFoundInstance();
        } else {
            int i15 = (10 - i10) / 2;
            int i16 = INSIDE_ODD_WIDEST[i15];
            return new DataCharacter((RSSUtils.getRSSvalue(evenCounts, 9 - i16, false) * INSIDE_ODD_TOTAL_SUBSET[i15]) + RSSUtils.getRSSvalue(oddCounts, i16, true) + INSIDE_GSUM[i15], i11);
        }
    }

    private int[] findFinderPattern(BitArray bitArray, int i, boolean z) throws NotFoundException {
        int[] decodeFinderCounters = getDecodeFinderCounters();
        decodeFinderCounters[0] = 0;
        decodeFinderCounters[1] = 0;
        decodeFinderCounters[2] = 0;
        decodeFinderCounters[3] = 0;
        int size = bitArray.getSize();
        boolean z2 = false;
        while (i < size) {
            z2 = !bitArray.get(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = i;
        int i3 = 0;
        while (i < size) {
            if (bitArray.get(i) ^ z2) {
                decodeFinderCounters[i3] = decodeFinderCounters[i3] + 1;
            } else {
                if (i3 != 3) {
                    i3++;
                } else if (isFinderPattern(decodeFinderCounters)) {
                    return new int[]{i2, i};
                } else {
                    i2 += decodeFinderCounters[0] + decodeFinderCounters[1];
                    decodeFinderCounters[0] = decodeFinderCounters[2];
                    decodeFinderCounters[1] = decodeFinderCounters[3];
                    decodeFinderCounters[2] = 0;
                    decodeFinderCounters[3] = 0;
                    i3--;
                }
                decodeFinderCounters[i3] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private FinderPattern parseFoundFinderPattern(BitArray bitArray, int i, boolean z, int[] iArr) throws NotFoundException {
        int i2;
        int i3;
        boolean z2 = bitArray.get(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && (bitArray.get(i4) ^ z2)) {
            i4--;
        }
        int i5 = i4 + 1;
        int i6 = iArr[0] - i5;
        int[] decodeFinderCounters = getDecodeFinderCounters();
        System.arraycopy(decodeFinderCounters, 0, decodeFinderCounters, 1, decodeFinderCounters.length - 1);
        decodeFinderCounters[0] = i6;
        int parseFinderValue = parseFinderValue(decodeFinderCounters, FINDER_PATTERNS);
        int i7 = iArr[1];
        if (z) {
            i2 = (bitArray.getSize() - 1) - i7;
            i3 = (bitArray.getSize() - 1) - i5;
        } else {
            i2 = i7;
            i3 = i5;
        }
        FinderPattern finderPattern = new FinderPattern(parseFinderValue, new int[]{i5, iArr[1]}, i3, i2, i);
        return finderPattern;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void adjustOddEvenCounts(boolean r10, int r11) throws com.google.zxing.NotFoundException {
        /*
            r9 = this;
            int[] r0 = r9.getOddCounts()
            int r0 = com.google.zxing.common.detector.MathUtils.sum(r0)
            int[] r1 = r9.getEvenCounts()
            int r1 = com.google.zxing.common.detector.MathUtils.sum(r1)
            r2 = 4
            r3 = 0
            r4 = 1
            if (r10 == 0) goto L_0x0036
            r5 = 12
            if (r0 <= r5) goto L_0x001c
            r6 = r3
            r7 = r4
            goto L_0x0023
        L_0x001c:
            if (r0 >= r2) goto L_0x0021
            r7 = r3
            r6 = r4
            goto L_0x0023
        L_0x0021:
            r6 = r3
            r7 = r6
        L_0x0023:
            if (r1 <= r5) goto L_0x002a
            r2 = r3
            r5 = r6
            r6 = r7
        L_0x0028:
            r7 = r4
            goto L_0x0052
        L_0x002a:
            if (r1 >= r2) goto L_0x0031
            r2 = r4
            r5 = r6
            r6 = r7
            r7 = r3
            goto L_0x0052
        L_0x0031:
            r2 = r3
            r5 = r6
            r6 = r7
        L_0x0034:
            r7 = r2
            goto L_0x0052
        L_0x0036:
            r5 = 11
            if (r0 <= r5) goto L_0x003d
            r5 = r3
            r6 = r4
            goto L_0x0045
        L_0x003d:
            r5 = 5
            if (r0 >= r5) goto L_0x0043
            r6 = r3
            r5 = r4
            goto L_0x0045
        L_0x0043:
            r5 = r3
            r6 = r5
        L_0x0045:
            r7 = 10
            if (r1 <= r7) goto L_0x004b
            r2 = r3
            goto L_0x0028
        L_0x004b:
            if (r1 >= r2) goto L_0x0050
            r7 = r3
            r2 = r4
            goto L_0x0052
        L_0x0050:
            r2 = r3
            goto L_0x0034
        L_0x0052:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r10) goto L_0x005b
            r10 = r4
            goto L_0x005c
        L_0x005b:
            r10 = r3
        L_0x005c:
            r11 = r1 & 1
            if (r11 != r4) goto L_0x0061
            r3 = r4
        L_0x0061:
            if (r8 != r4) goto L_0x0077
            if (r10 == 0) goto L_0x006e
            if (r3 == 0) goto L_0x006c
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x006c:
            r6 = r4
            goto L_0x00a8
        L_0x006e:
            if (r3 != 0) goto L_0x0075
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x0075:
            r7 = r4
            goto L_0x00a8
        L_0x0077:
            r11 = -1
            if (r8 != r11) goto L_0x008e
            if (r10 == 0) goto L_0x0085
            if (r3 == 0) goto L_0x0083
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x0083:
            r5 = r4
            goto L_0x00a8
        L_0x0085:
            if (r3 != 0) goto L_0x008c
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x008c:
            r2 = r4
            goto L_0x00a8
        L_0x008e:
            if (r8 != 0) goto L_0x00eb
            if (r10 == 0) goto L_0x00a1
            if (r3 != 0) goto L_0x0099
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x0099:
            if (r0 >= r1) goto L_0x009e
            r5 = r4
            r7 = r5
            goto L_0x00a8
        L_0x009e:
            r2 = r4
            r6 = r2
            goto L_0x00a8
        L_0x00a1:
            if (r3 == 0) goto L_0x00a8
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x00a8:
            if (r5 == 0) goto L_0x00bc
            if (r6 == 0) goto L_0x00b1
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x00b1:
            int[] r10 = r9.getOddCounts()
            float[] r11 = r9.getOddRoundingErrors()
            increment(r10, r11)
        L_0x00bc:
            if (r6 == 0) goto L_0x00c9
            int[] r10 = r9.getOddCounts()
            float[] r11 = r9.getOddRoundingErrors()
            decrement(r10, r11)
        L_0x00c9:
            if (r2 == 0) goto L_0x00dd
            if (r7 == 0) goto L_0x00d2
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        L_0x00d2:
            int[] r10 = r9.getEvenCounts()
            float[] r11 = r9.getOddRoundingErrors()
            increment(r10, r11)
        L_0x00dd:
            if (r7 == 0) goto L_0x00ea
            int[] r10 = r9.getEvenCounts()
            float[] r11 = r9.getEvenRoundingErrors()
            decrement(r10, r11)
        L_0x00ea:
            return
        L_0x00eb:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.rss.RSS14Reader.adjustOddEvenCounts(boolean, int):void");
    }
}
