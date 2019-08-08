package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.pdf417.PDF417ResultMetadata;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;

final class DecodedBitStreamParser {

    /* renamed from: AL */
    private static final int f16313AL = 28;

    /* renamed from: AS */
    private static final int f16314AS = 27;
    private static final int BEGIN_MACRO_PDF417_CONTROL_BLOCK = 928;
    private static final int BEGIN_MACRO_PDF417_OPTIONAL_FIELD = 923;
    private static final int BYTE_COMPACTION_MODE_LATCH = 901;
    private static final int BYTE_COMPACTION_MODE_LATCH_6 = 924;
    private static final Charset DEFAULT_ENCODING = Charset.forName("ISO-8859-1");
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final BigInteger[] EXP900;

    /* renamed from: LL */
    private static final int f16315LL = 27;
    private static final int MACRO_PDF417_TERMINATOR = 922;
    private static final int MAX_NUMERIC_CODEWORDS = 15;
    private static final char[] MIXED_CHARS = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: ML */
    private static final int f16316ML = 28;
    private static final int MODE_SHIFT_TO_BYTE_COMPACTION_MODE = 913;
    private static final int NUMBER_OF_SEQUENCE_CODEWORDS = 2;
    private static final int NUMERIC_COMPACTION_MODE_LATCH = 902;
    private static final int PAL = 29;

    /* renamed from: PL */
    private static final int f16317PL = 25;

    /* renamed from: PS */
    private static final int f16318PS = 29;
    private static final char[] PUNCT_CHARS = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    private static final int TEXT_COMPACTION_MODE_LATCH = 900;

    private enum Mode {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        EXP900 = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        EXP900[1] = valueOf;
        for (int i = 2; i < EXP900.length; i++) {
            EXP900[i] = EXP900[i - 1].multiply(valueOf);
        }
    }

    private DecodedBitStreamParser() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        r1 = byteCompaction(r2, r7, r3, r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.zxing.common.DecoderResult decode(int[] r7, java.lang.String r8) throws com.google.zxing.FormatException {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 2
            r2 = 1
            int r3 = r7.length
            int r3 = r3 << r2
            r0.<init>(r3)
            java.nio.charset.Charset r3 = DEFAULT_ENCODING
            r2 = r7[r2]
            com.google.zxing.pdf417.PDF417ResultMetadata r4 = new com.google.zxing.pdf417.PDF417ResultMetadata
            r4.<init>()
        L_0x0012:
            r5 = 0
            r5 = r7[r5]
            if (r1 >= r5) goto L_0x0072
            r5 = 913(0x391, float:1.28E-42)
            if (r2 == r5) goto L_0x0059
            switch(r2) {
                case 900: goto L_0x0054;
                case 901: goto L_0x004f;
                case 902: goto L_0x004a;
                default: goto L_0x001e;
            }
        L_0x001e:
            switch(r2) {
                case 922: goto L_0x0045;
                case 923: goto L_0x0045;
                case 924: goto L_0x004f;
                case 925: goto L_0x0042;
                case 926: goto L_0x003f;
                case 927: goto L_0x002d;
                case 928: goto L_0x0028;
                default: goto L_0x0021;
            }
        L_0x0021:
            int r1 = r1 + -1
            int r1 = textCompaction(r7, r1, r0)
            goto L_0x0062
        L_0x0028:
            int r1 = decodeMacroBlock(r7, r1, r4)
            goto L_0x0062
        L_0x002d:
            int r2 = r1 + 1
            r1 = r7[r1]
            com.google.zxing.common.CharacterSetECI r1 = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByValue(r1)
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            r3 = r1
            goto L_0x0061
        L_0x003f:
            int r1 = r1 + 2
            goto L_0x0062
        L_0x0042:
            int r1 = r1 + 1
            goto L_0x0062
        L_0x0045:
            com.google.zxing.FormatException r7 = com.google.zxing.FormatException.getFormatInstance()
            throw r7
        L_0x004a:
            int r1 = numericCompaction(r7, r1, r0)
            goto L_0x0062
        L_0x004f:
            int r1 = byteCompaction(r2, r7, r3, r1, r0)
            goto L_0x0062
        L_0x0054:
            int r1 = textCompaction(r7, r1, r0)
            goto L_0x0062
        L_0x0059:
            int r2 = r1 + 1
            r1 = r7[r1]
            char r1 = (char) r1
            r0.append(r1)
        L_0x0061:
            r1 = r2
        L_0x0062:
            int r2 = r7.length
            if (r1 >= r2) goto L_0x006d
            int r2 = r1 + 1
            r1 = r7[r1]
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0012
        L_0x006d:
            com.google.zxing.FormatException r7 = com.google.zxing.FormatException.getFormatInstance()
            throw r7
        L_0x0072:
            int r7 = r0.length()
            if (r7 != 0) goto L_0x007d
            com.google.zxing.FormatException r7 = com.google.zxing.FormatException.getFormatInstance()
            throw r7
        L_0x007d:
            com.google.zxing.common.DecoderResult r7 = new com.google.zxing.common.DecoderResult
            java.lang.String r0 = r0.toString()
            r1 = 0
            r7.<init>(r1, r0, r1, r8)
            r7.setOther(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.DecodedBitStreamParser.decode(int[], java.lang.String):com.google.zxing.common.DecoderResult");
    }

    private static int decodeMacroBlock(int[] iArr, int i, PDF417ResultMetadata pDF417ResultMetadata) throws FormatException {
        if (i + 2 > iArr[0]) {
            throw FormatException.getFormatInstance();
        }
        int[] iArr2 = new int[2];
        int i2 = i;
        int i3 = 0;
        while (i3 < 2) {
            iArr2[i3] = iArr[i2];
            i3++;
            i2++;
        }
        pDF417ResultMetadata.setSegmentIndex(Integer.parseInt(decodeBase900toBase10(iArr2, 2)));
        StringBuilder sb = new StringBuilder();
        int textCompaction = textCompaction(iArr, i2, sb);
        pDF417ResultMetadata.setFileId(sb.toString());
        if (iArr[textCompaction] == BEGIN_MACRO_PDF417_OPTIONAL_FIELD) {
            int i4 = textCompaction + 1;
            int[] iArr3 = new int[(iArr[0] - i4)];
            boolean z = false;
            int i5 = 0;
            while (i4 < iArr[0] && !z) {
                int i6 = i4 + 1;
                int i7 = iArr[i4];
                if (i7 < TEXT_COMPACTION_MODE_LATCH) {
                    int i8 = i5 + 1;
                    iArr3[i5] = i7;
                    i4 = i6;
                    i5 = i8;
                } else if (i7 != MACRO_PDF417_TERMINATOR) {
                    throw FormatException.getFormatInstance();
                } else {
                    pDF417ResultMetadata.setLastSegment(true);
                    i4 = i6 + 1;
                    z = true;
                }
            }
            pDF417ResultMetadata.setOptionalData(Arrays.copyOf(iArr3, i5));
            return i4;
        } else if (iArr[textCompaction] != MACRO_PDF417_TERMINATOR) {
            return textCompaction;
        } else {
            pDF417ResultMetadata.setLastSegment(true);
            return textCompaction + 1;
        }
    }

    private static int textCompaction(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[((iArr[0] - i) << 1)];
        int[] iArr3 = new int[((iArr[0] - i) << 1)];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i4 < TEXT_COMPACTION_MODE_LATCH) {
                iArr2[i2] = i4 / 30;
                iArr2[i2 + 1] = i4 % 30;
                i2 += 2;
            } else if (i4 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                if (i4 != 928) {
                    switch (i4) {
                        case TEXT_COMPACTION_MODE_LATCH /*900*/:
                            int i5 = i2 + 1;
                            iArr2[i2] = TEXT_COMPACTION_MODE_LATCH;
                            i2 = i5;
                            break;
                        case BYTE_COMPACTION_MODE_LATCH /*901*/:
                        case NUMERIC_COMPACTION_MODE_LATCH /*902*/:
                            break;
                        default:
                            switch (i4) {
                                case MACRO_PDF417_TERMINATOR /*922*/:
                                case BEGIN_MACRO_PDF417_OPTIONAL_FIELD /*923*/:
                                case BYTE_COMPACTION_MODE_LATCH_6 /*924*/:
                                    break;
                            }
                    }
                }
                i = i3 - 1;
                z = true;
            } else {
                iArr2[i2] = MODE_SHIFT_TO_BYTE_COMPACTION_MODE;
                i = i3 + 1;
                iArr3[i2] = iArr[i3];
                i2++;
            }
            i = i3;
        }
        decodeTextCompaction(iArr2, iArr3, i2, sb);
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b4, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d6, code lost:
        r3 = ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f5, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f6, code lost:
        if (r3 == 0) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f8, code lost:
        r0.append(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00fb, code lost:
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void decodeTextCompaction(int[] r15, int[] r16, int r17, java.lang.StringBuilder r18) {
        /*
            r0 = r18
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r2 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            r4 = r1
            r5 = r2
            r2 = 0
            r1 = r17
        L_0x000b:
            if (r2 >= r1) goto L_0x00ff
            r6 = r15[r2]
            int[] r7 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.C50311.f16319x45bba1d
            int r8 = r4.ordinal()
            r7 = r7[r8]
            r8 = 28
            r9 = 27
            r10 = 32
            r11 = 913(0x391, float:1.28E-42)
            r12 = 900(0x384, float:1.261E-42)
            r13 = 26
            r3 = 29
            switch(r7) {
                case 1: goto L_0x00ce;
                case 2: goto L_0x00a7;
                case 3: goto L_0x0075;
                case 4: goto L_0x0059;
                case 5: goto L_0x0044;
                case 6: goto L_0x002a;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x00f5
        L_0x002a:
            if (r6 >= r3) goto L_0x0031
            char[] r3 = PUNCT_CHARS
            char r3 = r3[r6]
            goto L_0x0049
        L_0x0031:
            if (r6 != r3) goto L_0x0036
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r3 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            goto L_0x0083
        L_0x0036:
            if (r6 != r11) goto L_0x003f
            r3 = r16[r2]
            char r3 = (char) r3
            r0.append(r3)
            goto L_0x0056
        L_0x003f:
            if (r6 != r12) goto L_0x0056
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r3 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            goto L_0x0083
        L_0x0044:
            if (r6 >= r13) goto L_0x004c
            int r6 = r6 + 65
            char r3 = (char) r6
        L_0x0049:
            r4 = r5
            goto L_0x00f6
        L_0x004c:
            if (r6 != r13) goto L_0x0051
            r4 = r5
            goto L_0x00d6
        L_0x0051:
            if (r6 != r12) goto L_0x0056
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r3 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            goto L_0x0083
        L_0x0056:
            r4 = r5
            goto L_0x00f5
        L_0x0059:
            if (r6 >= r3) goto L_0x0061
            char[] r3 = PUNCT_CHARS
            char r3 = r3[r6]
            goto L_0x00f6
        L_0x0061:
            if (r6 != r3) goto L_0x0066
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r3 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            goto L_0x0083
        L_0x0066:
            if (r6 != r11) goto L_0x0070
            r3 = r16[r2]
            char r3 = (char) r3
            r0.append(r3)
            goto L_0x00f5
        L_0x0070:
            if (r6 != r12) goto L_0x00f5
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r3 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            goto L_0x0083
        L_0x0075:
            r7 = 25
            if (r6 >= r7) goto L_0x007f
            char[] r3 = MIXED_CHARS
            char r3 = r3[r6]
            goto L_0x00f6
        L_0x007f:
            if (r6 != r7) goto L_0x0086
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r3 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.PUNCT
        L_0x0083:
            r4 = r3
            goto L_0x00f5
        L_0x0086:
            if (r6 != r13) goto L_0x0089
            goto L_0x00d6
        L_0x0089:
            if (r6 != r9) goto L_0x008e
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r3 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.LOWER
            goto L_0x0083
        L_0x008e:
            if (r6 != r8) goto L_0x0093
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r3 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            goto L_0x0083
        L_0x0093:
            if (r6 != r3) goto L_0x0098
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r3 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.PUNCT_SHIFT
            goto L_0x00b4
        L_0x0098:
            if (r6 != r11) goto L_0x00a2
            r3 = r16[r2]
            char r3 = (char) r3
            r0.append(r3)
            goto L_0x00f5
        L_0x00a2:
            if (r6 != r12) goto L_0x00f5
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r3 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            goto L_0x0083
        L_0x00a7:
            if (r6 >= r13) goto L_0x00ad
            int r6 = r6 + 97
            char r3 = (char) r6
            goto L_0x00f6
        L_0x00ad:
            if (r6 != r13) goto L_0x00b0
            goto L_0x00d6
        L_0x00b0:
            if (r6 != r9) goto L_0x00b6
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r3 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA_SHIFT
        L_0x00b4:
            r5 = r4
            goto L_0x0083
        L_0x00b6:
            if (r6 != r8) goto L_0x00bb
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r3 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.MIXED
            goto L_0x0083
        L_0x00bb:
            if (r6 != r3) goto L_0x00c0
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r3 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.PUNCT_SHIFT
            goto L_0x00b4
        L_0x00c0:
            if (r6 != r11) goto L_0x00c9
            r3 = r16[r2]
            char r3 = (char) r3
            r0.append(r3)
            goto L_0x00f5
        L_0x00c9:
            if (r6 != r12) goto L_0x00f5
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r3 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            goto L_0x0083
        L_0x00ce:
            if (r6 >= r13) goto L_0x00d4
            int r6 = r6 + 65
            char r3 = (char) r6
            goto L_0x00f6
        L_0x00d4:
            if (r6 != r13) goto L_0x00d8
        L_0x00d6:
            r3 = r10
            goto L_0x00f6
        L_0x00d8:
            if (r6 != r9) goto L_0x00dd
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r3 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.LOWER
            goto L_0x0083
        L_0x00dd:
            if (r6 != r8) goto L_0x00e2
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r3 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.MIXED
            goto L_0x0083
        L_0x00e2:
            if (r6 != r3) goto L_0x00e7
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r3 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.PUNCT_SHIFT
            goto L_0x00b4
        L_0x00e7:
            if (r6 != r11) goto L_0x00f0
            r3 = r16[r2]
            char r3 = (char) r3
            r0.append(r3)
            goto L_0x00f5
        L_0x00f0:
            if (r6 != r12) goto L_0x00f5
            com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r3 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA
            goto L_0x0083
        L_0x00f5:
            r3 = 0
        L_0x00f6:
            if (r3 == 0) goto L_0x00fb
            r0.append(r3)
        L_0x00fb:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.DecodedBitStreamParser.decodeTextCompaction(int[], int[], int, java.lang.StringBuilder):void");
    }

    private static int byteCompaction(int i, int[] iArr, Charset charset, int i2, StringBuilder sb) {
        int i3;
        char c;
        char c2;
        int i4;
        int i5 = i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i6 = MACRO_PDF417_TERMINATOR;
        int i7 = BEGIN_MACRO_PDF417_OPTIONAL_FIELD;
        int i8 = 928;
        int i9 = NUMERIC_COMPACTION_MODE_LATCH;
        long j = 900;
        if (i5 == BYTE_COMPACTION_MODE_LATCH) {
            int[] iArr2 = new int[6];
            int i10 = i2 + 1;
            int i11 = iArr[i2];
            int i12 = 0;
            i3 = i10;
            long j2 = 0;
            boolean z = false;
            while (i3 < iArr[0] && !z) {
                int i13 = i12 + 1;
                iArr2[i12] = i11;
                long j3 = (j2 * j) + ((long) i11);
                int i14 = i3 + 1;
                int i15 = iArr[i3];
                if (i15 == TEXT_COMPACTION_MODE_LATCH || i15 == BYTE_COMPACTION_MODE_LATCH || i15 == NUMERIC_COMPACTION_MODE_LATCH || i15 == BYTE_COMPACTION_MODE_LATCH_6 || i15 == 928 || i15 == i7 || i15 == i6) {
                    int i16 = i14 - 1;
                    i12 = i13;
                    j2 = j3;
                    z = true;
                    i7 = BEGIN_MACRO_PDF417_OPTIONAL_FIELD;
                    j = 900;
                    i11 = i15;
                    i3 = i16;
                    i6 = MACRO_PDF417_TERMINATOR;
                } else if (i13 % 5 != 0 || i13 <= 0) {
                    i12 = i13;
                    j2 = j3;
                    i6 = MACRO_PDF417_TERMINATOR;
                    i7 = BEGIN_MACRO_PDF417_OPTIONAL_FIELD;
                    i11 = i15;
                    i3 = i14;
                    j = 900;
                } else {
                    int i17 = 0;
                    while (i17 < 6) {
                        byteArrayOutputStream.write((byte) ((int) (j3 >> ((5 - i17) * 8))));
                        i17++;
                        i6 = MACRO_PDF417_TERMINATOR;
                        i7 = BEGIN_MACRO_PDF417_OPTIONAL_FIELD;
                    }
                    i11 = i15;
                    i3 = i14;
                    i12 = 0;
                    j = 900;
                    j2 = 0;
                }
            }
            if (i3 != iArr[0] || i11 >= TEXT_COMPACTION_MODE_LATCH) {
                i4 = i12;
            } else {
                i4 = i12 + 1;
                iArr2[i12] = i11;
            }
            for (int i18 = 0; i18 < i4; i18++) {
                byteArrayOutputStream.write((byte) iArr2[i18]);
            }
        } else if (i5 == BYTE_COMPACTION_MODE_LATCH_6) {
            int i19 = i2;
            boolean z2 = false;
            int i20 = 0;
            long j4 = 0;
            while (i3 < iArr[0] && !z2) {
                int i21 = i3 + 1;
                int i22 = iArr[i3];
                if (i22 < TEXT_COMPACTION_MODE_LATCH) {
                    i20++;
                    i19 = i21;
                    j4 = (j4 * 900) + ((long) i22);
                    c = 924;
                } else {
                    if (i22 == TEXT_COMPACTION_MODE_LATCH || i22 == BYTE_COMPACTION_MODE_LATCH || i22 == i9) {
                        c = 924;
                    } else {
                        c = 924;
                        if (!(i22 == BYTE_COMPACTION_MODE_LATCH_6 || i22 == i8)) {
                            if (i22 != BEGIN_MACRO_PDF417_OPTIONAL_FIELD) {
                                if (i22 != MACRO_PDF417_TERMINATOR) {
                                    i19 = i21;
                                }
                                i19 = i21 - 1;
                                z2 = true;
                            }
                            i19 = i21 - 1;
                            z2 = true;
                        }
                    }
                    i19 = i21 - 1;
                    z2 = true;
                }
                if (i20 % 5 != 0 || i20 <= 0) {
                    c2 = 6;
                } else {
                    c2 = 6;
                    for (int i23 = 0; i23 < 6; i23++) {
                        byteArrayOutputStream.write((byte) ((int) (j4 >> ((5 - i23) * 8))));
                    }
                    i20 = 0;
                    j4 = 0;
                }
                char c3 = c2;
                char c4 = c;
                i8 = 928;
                i9 = NUMERIC_COMPACTION_MODE_LATCH;
            }
        } else {
            i3 = i2;
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i3;
    }

    private static int numericCompaction(int[] iArr, int i, StringBuilder sb) throws FormatException {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i3 == iArr[0]) {
                z = true;
            }
            if (i4 < TEXT_COMPACTION_MODE_LATCH) {
                iArr2[i2] = i4;
                i2++;
            } else if (i4 == TEXT_COMPACTION_MODE_LATCH || i4 == BYTE_COMPACTION_MODE_LATCH || i4 == BYTE_COMPACTION_MODE_LATCH_6 || i4 == 928 || i4 == BEGIN_MACRO_PDF417_OPTIONAL_FIELD || i4 == MACRO_PDF417_TERMINATOR) {
                i3--;
                z = true;
            }
            if ((i2 % 15 == 0 || i4 == NUMERIC_COMPACTION_MODE_LATCH || z) && i2 > 0) {
                sb.append(decodeBase900toBase10(iArr2, i2));
                i2 = 0;
            }
            i = i3;
        }
        return i;
    }

    private static String decodeBase900toBase10(int[] iArr, int i) throws FormatException {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(EXP900[(i - i2) - 1].multiply(BigInteger.valueOf((long) iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw FormatException.getFormatInstance();
    }
}
