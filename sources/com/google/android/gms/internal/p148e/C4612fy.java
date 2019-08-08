package com.google.android.gms.internal.p148e;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.e.fy */
final class C4612fy extends C4609fv {
    C4612fy() {
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ab, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d6, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16804a(int r12, byte[] r13, int r14, int r15) {
        /*
            r11 = this;
            r12 = r14 | r15
            r0 = 2
            r1 = 3
            r2 = 0
            int r3 = r13.length
            int r3 = r3 - r15
            r12 = r12 | r3
            if (r12 >= 0) goto L_0x002c
            java.lang.ArrayIndexOutOfBoundsException r12 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r3 = "Array length=%d, index=%d, limit=%d"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4 = 1
            int r13 = r13.length
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r1[r2] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            r1[r4] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            r1[r0] = r13
            java.lang.String r13 = java.lang.String.format(r3, r1)
            r12.<init>(r13)
            throw r12
        L_0x002c:
            long r3 = (long) r14
            long r14 = (long) r15
            long r5 = r14 - r3
            int r12 = (int) r5
            r14 = 16
            r5 = 1
            if (r12 >= r14) goto L_0x0039
            r14 = r2
            goto L_0x004b
        L_0x0039:
            r14 = r2
            r7 = r3
        L_0x003b:
            if (r14 >= r12) goto L_0x004a
            long r9 = r7 + r5
            byte r15 = com.google.android.gms.internal.p148e.C4601fr.m19840a(r13, r7)
            if (r15 >= 0) goto L_0x0046
            goto L_0x004b
        L_0x0046:
            int r14 = r14 + 1
            r7 = r9
            goto L_0x003b
        L_0x004a:
            r14 = r12
        L_0x004b:
            int r12 = r12 - r14
            long r14 = (long) r14
            long r7 = r3 + r14
        L_0x004f:
            r14 = r2
        L_0x0050:
            if (r12 <= 0) goto L_0x0061
            long r14 = r7 + r5
            byte r3 = com.google.android.gms.internal.p148e.C4601fr.m19840a(r13, r7)
            if (r3 < 0) goto L_0x005f
            int r12 = r12 + -1
            r7 = r14
            r14 = r3
            goto L_0x0050
        L_0x005f:
            r7 = r14
            r14 = r3
        L_0x0061:
            if (r12 != 0) goto L_0x0064
            return r2
        L_0x0064:
            int r12 = r12 + -1
            r15 = -32
            r3 = -65
            r4 = -1
            if (r14 >= r15) goto L_0x0082
            if (r12 != 0) goto L_0x0070
            return r14
        L_0x0070:
            int r12 = r12 + -1
            r15 = -62
            if (r14 < r15) goto L_0x0081
            long r14 = r7 + r5
            byte r7 = com.google.android.gms.internal.p148e.C4601fr.m19840a(r13, r7)
            if (r7 <= r3) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r7 = r14
            goto L_0x004f
        L_0x0081:
            return r4
        L_0x0082:
            r9 = -16
            if (r14 >= r9) goto L_0x00ac
            if (r12 >= r0) goto L_0x008d
            int r12 = m19969a(r13, r14, r7, r12)
            return r12
        L_0x008d:
            int r12 = r12 + -2
            long r9 = r7 + r5
            byte r7 = com.google.android.gms.internal.p148e.C4601fr.m19840a(r13, r7)
            if (r7 > r3) goto L_0x00ab
            r8 = -96
            if (r14 != r15) goto L_0x009d
            if (r7 < r8) goto L_0x00ab
        L_0x009d:
            r15 = -19
            if (r14 != r15) goto L_0x00a3
            if (r7 >= r8) goto L_0x00ab
        L_0x00a3:
            long r7 = r9 + r5
            byte r14 = com.google.android.gms.internal.p148e.C4601fr.m19840a(r13, r9)
            if (r14 <= r3) goto L_0x004f
        L_0x00ab:
            return r4
        L_0x00ac:
            if (r12 >= r1) goto L_0x00b3
            int r12 = m19969a(r13, r14, r7, r12)
            return r12
        L_0x00b3:
            int r12 = r12 + -3
            long r9 = r7 + r5
            byte r15 = com.google.android.gms.internal.p148e.C4601fr.m19840a(r13, r7)
            if (r15 > r3) goto L_0x00d6
            int r14 = r14 << 28
            int r15 = r15 + 112
            int r14 = r14 + r15
            int r14 = r14 >> 30
            if (r14 != 0) goto L_0x00d6
            long r14 = r9 + r5
            byte r7 = com.google.android.gms.internal.p148e.C4601fr.m19840a(r13, r9)
            if (r7 > r3) goto L_0x00d6
            long r7 = r14 + r5
            byte r14 = com.google.android.gms.internal.p148e.C4601fr.m19840a(r13, r14)
            if (r14 <= r3) goto L_0x004f
        L_0x00d6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p148e.C4612fy.mo16804a(int, byte[], int, int):int");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo16808b(byte[] bArr, int i, int i2) throws C4526db {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (r13 < i3) {
            byte a = C4601fr.m19840a(bArr, (long) r13);
            if (!C4608fu.m19955d(a)) {
                break;
            }
            i = r13 + 1;
            int i5 = i4 + 1;
            C4608fu.m19952b(a, cArr, i4);
            i4 = i5;
        }
        int i6 = i4;
        while (r13 < i3) {
            int i7 = r13 + 1;
            byte a2 = C4601fr.m19840a(bArr, (long) r13);
            if (C4608fu.m19955d(a2)) {
                int i8 = i6 + 1;
                C4608fu.m19952b(a2, cArr, i6);
                while (i7 < i3) {
                    byte a3 = C4601fr.m19840a(bArr, (long) i7);
                    if (!C4608fu.m19955d(a3)) {
                        break;
                    }
                    i7++;
                    int i9 = i8 + 1;
                    C4608fu.m19952b(a3, cArr, i8);
                    i8 = i9;
                }
                r13 = i7;
                i6 = i8;
            } else if (C4608fu.m19956e(a2)) {
                if (i7 >= i3) {
                    throw C4526db.m19465h();
                }
                int i10 = i7 + 1;
                int i11 = i6 + 1;
                C4608fu.m19951b(a2, C4601fr.m19840a(bArr, (long) i7), cArr, i6);
                r13 = i10;
                i6 = i11;
            } else if (C4608fu.m19957f(a2)) {
                if (i7 >= i3 - 1) {
                    throw C4526db.m19465h();
                }
                int i12 = i7 + 1;
                int i13 = i12 + 1;
                int i14 = i6 + 1;
                C4608fu.m19950b(a2, C4601fr.m19840a(bArr, (long) i7), C4601fr.m19840a(bArr, (long) i12), cArr, i6);
                r13 = i13;
                i6 = i14;
            } else if (i7 >= i3 - 2) {
                throw C4526db.m19465h();
            } else {
                int i15 = i7 + 1;
                byte a4 = C4601fr.m19840a(bArr, (long) i7);
                int i16 = i15 + 1;
                int i17 = i16 + 1;
                int i18 = i6 + 1;
                C4608fu.m19949b(a2, a4, C4601fr.m19840a(bArr, (long) i15), C4601fr.m19840a(bArr, (long) i16), cArr, i6);
                r13 = i17;
                i6 = i18 + 1;
            }
        }
        return new String(cArr, 0, i6);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo16805a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        CharSequence charSequence2 = charSequence;
        byte[] bArr2 = bArr;
        int i3 = i;
        int i4 = i2;
        long j2 = (long) i3;
        long j3 = j2 + ((long) i4);
        int length = charSequence.length();
        if (length > i4 || bArr2.length - i4 < i3) {
            char charAt = charSequence2.charAt(length - 1);
            int i5 = i3 + i4;
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt);
            sb.append(" at index ");
            sb.append(i5);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i6 = 0;
        while (i6 < length) {
            char charAt2 = charSequence2.charAt(i6);
            if (charAt2 >= 128) {
                break;
            }
            long j4 = j + 1;
            C4601fr.m19853a(bArr2, j, (byte) charAt2);
            i6++;
            j2 = j4;
        }
        if (i6 == length) {
            return (int) j;
        }
        while (i6 < length) {
            char charAt3 = charSequence2.charAt(i6);
            if (charAt3 < 128 && j < j3) {
                long j5 = j + 1;
                C4601fr.m19853a(bArr2, j, (byte) charAt3);
                j = j5;
            } else if (charAt3 < 2048 && j <= j3 - 2) {
                long j6 = j + 1;
                C4601fr.m19853a(bArr2, j, (byte) (960 | (charAt3 >>> 6)));
                j = j6 + 1;
                C4601fr.m19853a(bArr2, j6, (byte) ((charAt3 & '?') | 128));
            } else if ((charAt3 < 55296 || 57343 < charAt3) && j <= j3 - 3) {
                long j7 = j + 1;
                C4601fr.m19853a(bArr2, j, (byte) (480 | (charAt3 >>> 12)));
                long j8 = j7 + 1;
                C4601fr.m19853a(bArr2, j7, (byte) (((charAt3 >>> 6) & 63) | 128));
                long j9 = j8 + 1;
                C4601fr.m19853a(bArr2, j8, (byte) ((charAt3 & '?') | 128));
                j = j9;
            } else if (j <= j3 - 4) {
                int i7 = i6 + 1;
                if (i7 != length) {
                    char charAt4 = charSequence2.charAt(i7);
                    if (Character.isSurrogatePair(charAt3, charAt4)) {
                        int codePoint = Character.toCodePoint(charAt3, charAt4);
                        long j10 = j + 1;
                        C4601fr.m19853a(bArr2, j, (byte) (240 | (codePoint >>> 18)));
                        long j11 = j10 + 1;
                        C4601fr.m19853a(bArr2, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                        long j12 = j11 + 1;
                        C4601fr.m19853a(bArr2, j11, (byte) (((codePoint >>> 6) & 63) | 128));
                        j = j12 + 1;
                        C4601fr.m19853a(bArr2, j12, (byte) ((codePoint & 63) | 128));
                        i6 = i7;
                    }
                } else {
                    i7 = i6;
                }
                throw new C4611fx(i7 - 1, length);
            } else {
                if (55296 <= charAt3 && charAt3 <= 57343) {
                    int i8 = i6 + 1;
                    if (i8 == length || !Character.isSurrogatePair(charAt3, charSequence2.charAt(i8))) {
                        throw new C4611fx(i6, length);
                    }
                }
                StringBuilder sb2 = new StringBuilder(46);
                sb2.append("Failed writing ");
                sb2.append(charAt3);
                sb2.append(" at index ");
                sb2.append(j);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
            i6++;
        }
        return (int) j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16806a(CharSequence charSequence, ByteBuffer byteBuffer) {
        long j;
        long j2;
        CharSequence charSequence2 = charSequence;
        ByteBuffer byteBuffer2 = byteBuffer;
        long a = C4601fr.m19842a(byteBuffer);
        long position = a + ((long) byteBuffer.position());
        long limit = a + ((long) byteBuffer.limit());
        int length = charSequence.length();
        if (((long) length) > limit - position) {
            char charAt = charSequence2.charAt(length - 1);
            int limit2 = byteBuffer.limit();
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt);
            sb.append(" at index ");
            sb.append(limit2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i = 0;
        while (i < length) {
            char charAt2 = charSequence2.charAt(i);
            if (charAt2 >= 128) {
                break;
            }
            long j3 = j + 1;
            C4601fr.m19845a(j, (byte) charAt2);
            i++;
            position = j3;
        }
        if (i == length) {
            byteBuffer2.position((int) (j - a));
            return;
        }
        while (i < length) {
            char charAt3 = charSequence2.charAt(i);
            if (charAt3 < 128 && j < limit) {
                long j4 = j + 1;
                C4601fr.m19845a(j, (byte) charAt3);
                j2 = a;
                j = j4;
            } else if (charAt3 >= 2048 || j > limit - 2) {
                j2 = a;
                if ((charAt3 < 55296 || 57343 < charAt3) && j <= limit - 3) {
                    long j5 = j + 1;
                    C4601fr.m19845a(j, (byte) (480 | (charAt3 >>> 12)));
                    long j6 = j5 + 1;
                    C4601fr.m19845a(j5, (byte) (((charAt3 >>> 6) & 63) | 128));
                    long j7 = j6 + 1;
                    C4601fr.m19845a(j6, (byte) (('?' & charAt3) | 128));
                    j = j7;
                } else if (j <= limit - 4) {
                    int i2 = i + 1;
                    if (i2 != length) {
                        char charAt4 = charSequence2.charAt(i2);
                        if (Character.isSurrogatePair(charAt3, charAt4)) {
                            int codePoint = Character.toCodePoint(charAt3, charAt4);
                            long j8 = j + 1;
                            C4601fr.m19845a(j, (byte) (240 | (codePoint >>> 18)));
                            long j9 = j8 + 1;
                            C4601fr.m19845a(j8, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j10 = j9 + 1;
                            C4601fr.m19845a(j9, (byte) (((codePoint >>> 6) & 63) | 128));
                            long j11 = j10 + 1;
                            C4601fr.m19845a(j10, (byte) ((codePoint & 63) | 128));
                            j = j11;
                            i = i2;
                        }
                    } else {
                        i2 = i;
                    }
                    throw new C4611fx(i2 - 1, length);
                } else {
                    if (55296 <= charAt3 && charAt3 <= 57343) {
                        int i3 = i + 1;
                        if (i3 == length || !Character.isSurrogatePair(charAt3, charSequence2.charAt(i3))) {
                            throw new C4611fx(i, length);
                        }
                    }
                    StringBuilder sb2 = new StringBuilder(46);
                    sb2.append("Failed writing ");
                    sb2.append(charAt3);
                    sb2.append(" at index ");
                    sb2.append(j);
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
            } else {
                j2 = a;
                long j12 = j + 1;
                C4601fr.m19845a(j, (byte) (960 | (charAt3 >>> 6)));
                j = j12 + 1;
                C4601fr.m19845a(j12, (byte) (('?' & charAt3) | 128));
            }
            i++;
            a = j2;
            ByteBuffer byteBuffer3 = byteBuffer;
        }
        byteBuffer.position((int) (j - a));
    }

    /* renamed from: a */
    private static int m19969a(byte[] bArr, int i, long j, int i2) {
        switch (i2) {
            case 0:
                return C4607ft.m19938b(i);
            case 1:
                return C4607ft.m19939b(i, C4601fr.m19840a(bArr, j));
            case 2:
                return C4607ft.m19940b(i, (int) C4601fr.m19840a(bArr, j), (int) C4601fr.m19840a(bArr, j + 1));
            default:
                throw new AssertionError();
        }
    }
}
