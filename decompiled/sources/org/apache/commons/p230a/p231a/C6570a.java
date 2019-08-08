package org.apache.commons.p230a.p231a;

/* renamed from: org.apache.commons.a.a.a */
/* compiled from: Base64 */
public class C6570a {

    /* renamed from: a */
    static final byte[] f21282a = {13, 10};

    /* renamed from: b */
    private static final byte[] f21283b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: c */
    private static final byte[] f21284c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: d */
    private static final byte[] f21285d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* renamed from: e */
    private final byte[] f21286e;

    /* renamed from: f */
    private final int f21287f;

    /* renamed from: g */
    private final byte[] f21288g;

    /* renamed from: h */
    private final int f21289h;

    /* renamed from: i */
    private final int f21290i;

    /* renamed from: j */
    private byte[] f21291j;

    /* renamed from: k */
    private int f21292k;

    /* renamed from: l */
    private int f21293l;

    /* renamed from: m */
    private int f21294m;

    /* renamed from: n */
    private int f21295n;

    /* renamed from: o */
    private boolean f21296o;

    /* renamed from: p */
    private int f21297p;

    public C6570a() {
        this(false);
    }

    public C6570a(boolean z) {
        this(76, f21282a, z);
    }

    public C6570a(int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            bArr = f21282a;
            i = 0;
        }
        this.f21287f = i > 0 ? (i / 4) * 4 : 0;
        this.f21288g = new byte[bArr.length];
        System.arraycopy(bArr, 0, this.f21288g, 0, bArr.length);
        if (i > 0) {
            this.f21290i = 4 + bArr.length;
        } else {
            this.f21290i = 4;
        }
        this.f21289h = this.f21290i - 1;
        if (m26019e(bArr)) {
            String a = C6571b.m26029a(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lineSeperator must not contain base64 characters: [");
            stringBuffer.append(a);
            stringBuffer.append("]");
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        this.f21286e = z ? f21284c : f21283b;
    }

    /* renamed from: a */
    public boolean mo23079a() {
        return this.f21286e == f21284c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo23080b() {
        if (this.f21291j != null) {
            return this.f21292k - this.f21293l;
        }
        return 0;
    }

    /* renamed from: c */
    private void m26016c() {
        if (this.f21291j == null) {
            this.f21291j = new byte[8192];
            this.f21292k = 0;
            this.f21293l = 0;
            return;
        }
        byte[] bArr = new byte[(this.f21291j.length * 2)];
        System.arraycopy(this.f21291j, 0, bArr, 0, this.f21291j.length);
        this.f21291j = bArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo23078a(byte[] bArr, int i, int i2) {
        if (this.f21291j != null) {
            int min = Math.min(mo23080b(), i2);
            if (this.f21291j != bArr) {
                System.arraycopy(this.f21291j, this.f21293l, bArr, i, min);
                this.f21293l += min;
                if (this.f21293l >= this.f21292k) {
                    this.f21291j = null;
                }
            } else {
                this.f21291j = null;
            }
            return min;
        }
        return this.f21296o ? -1 : 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo23081b(byte[] bArr, int i, int i2) {
        if (bArr != null && bArr.length == i2) {
            this.f21291j = bArr;
            this.f21292k = i;
            this.f21293l = i;
        }
    }

    /* JADX WARNING: type inference failed for: r2v33 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v2, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23083c(byte[] r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f21296o
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1 = 1
            if (r10 >= 0) goto L_0x00d2
            r7.f21296o = r1
            byte[] r8 = r7.f21291j
            if (r8 == 0) goto L_0x0019
            byte[] r8 = r7.f21291j
            int r8 = r8.length
            int r9 = r7.f21292k
            int r8 = r8 - r9
            int r9 = r7.f21290i
            if (r8 >= r9) goto L_0x001c
        L_0x0019:
            r7.m26016c()
        L_0x001c:
            int r8 = r7.f21295n
            r9 = 61
            switch(r8) {
                case 1: goto L_0x0072;
                case 2: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x00b4
        L_0x0025:
            byte[] r8 = r7.f21291j
            int r10 = r7.f21292k
            int r1 = r10 + 1
            r7.f21292k = r1
            byte[] r1 = r7.f21286e
            int r2 = r7.f21297p
            int r2 = r2 >> 10
            r2 = r2 & 63
            byte r1 = r1[r2]
            r8[r10] = r1
            byte[] r8 = r7.f21291j
            int r10 = r7.f21292k
            int r1 = r10 + 1
            r7.f21292k = r1
            byte[] r1 = r7.f21286e
            int r2 = r7.f21297p
            int r2 = r2 >> 4
            r2 = r2 & 63
            byte r1 = r1[r2]
            r8[r10] = r1
            byte[] r8 = r7.f21291j
            int r10 = r7.f21292k
            int r1 = r10 + 1
            r7.f21292k = r1
            byte[] r1 = r7.f21286e
            int r2 = r7.f21297p
            int r2 = r2 << 2
            r2 = r2 & 63
            byte r1 = r1[r2]
            r8[r10] = r1
            byte[] r8 = r7.f21286e
            byte[] r10 = f21283b
            if (r8 != r10) goto L_0x00b4
            byte[] r8 = r7.f21291j
            int r10 = r7.f21292k
            int r1 = r10 + 1
            r7.f21292k = r1
            r8[r10] = r9
            goto L_0x00b4
        L_0x0072:
            byte[] r8 = r7.f21291j
            int r10 = r7.f21292k
            int r1 = r10 + 1
            r7.f21292k = r1
            byte[] r1 = r7.f21286e
            int r2 = r7.f21297p
            int r2 = r2 >> 2
            r2 = r2 & 63
            byte r1 = r1[r2]
            r8[r10] = r1
            byte[] r8 = r7.f21291j
            int r10 = r7.f21292k
            int r1 = r10 + 1
            r7.f21292k = r1
            byte[] r1 = r7.f21286e
            int r2 = r7.f21297p
            int r2 = r2 << 4
            r2 = r2 & 63
            byte r1 = r1[r2]
            r8[r10] = r1
            byte[] r8 = r7.f21286e
            byte[] r10 = f21283b
            if (r8 != r10) goto L_0x00b4
            byte[] r8 = r7.f21291j
            int r10 = r7.f21292k
            int r1 = r10 + 1
            r7.f21292k = r1
            r8[r10] = r9
            byte[] r8 = r7.f21291j
            int r10 = r7.f21292k
            int r1 = r10 + 1
            r7.f21292k = r1
            r8[r10] = r9
        L_0x00b4:
            int r8 = r7.f21287f
            if (r8 <= 0) goto L_0x017c
            int r8 = r7.f21292k
            if (r8 <= 0) goto L_0x017c
            byte[] r8 = r7.f21288g
            byte[] r9 = r7.f21291j
            int r10 = r7.f21292k
            byte[] r1 = r7.f21288g
            int r1 = r1.length
            java.lang.System.arraycopy(r8, r0, r9, r10, r1)
            int r8 = r7.f21292k
            byte[] r9 = r7.f21288g
            int r9 = r9.length
            int r8 = r8 + r9
            r7.f21292k = r8
            goto L_0x017c
        L_0x00d2:
            r2 = r9
            r9 = r0
        L_0x00d4:
            if (r9 >= r10) goto L_0x017c
            byte[] r3 = r7.f21291j
            if (r3 == 0) goto L_0x00e4
            byte[] r3 = r7.f21291j
            int r3 = r3.length
            int r4 = r7.f21292k
            int r3 = r3 - r4
            int r4 = r7.f21290i
            if (r3 >= r4) goto L_0x00e7
        L_0x00e4:
            r7.m26016c()
        L_0x00e7:
            int r3 = r7.f21295n
            int r3 = r3 + r1
            r7.f21295n = r3
            int r3 = r3 % 3
            r7.f21295n = r3
            int r3 = r2 + 1
            byte r2 = r8[r2]
            if (r2 >= 0) goto L_0x00f8
            int r2 = r2 + 256
        L_0x00f8:
            int r4 = r7.f21297p
            int r4 = r4 << 8
            int r4 = r4 + r2
            r7.f21297p = r4
            int r2 = r7.f21295n
            if (r2 != 0) goto L_0x0177
            byte[] r2 = r7.f21291j
            int r4 = r7.f21292k
            int r5 = r4 + 1
            r7.f21292k = r5
            byte[] r5 = r7.f21286e
            int r6 = r7.f21297p
            int r6 = r6 >> 18
            r6 = r6 & 63
            byte r5 = r5[r6]
            r2[r4] = r5
            byte[] r2 = r7.f21291j
            int r4 = r7.f21292k
            int r5 = r4 + 1
            r7.f21292k = r5
            byte[] r5 = r7.f21286e
            int r6 = r7.f21297p
            int r6 = r6 >> 12
            r6 = r6 & 63
            byte r5 = r5[r6]
            r2[r4] = r5
            byte[] r2 = r7.f21291j
            int r4 = r7.f21292k
            int r5 = r4 + 1
            r7.f21292k = r5
            byte[] r5 = r7.f21286e
            int r6 = r7.f21297p
            int r6 = r6 >> 6
            r6 = r6 & 63
            byte r5 = r5[r6]
            r2[r4] = r5
            byte[] r2 = r7.f21291j
            int r4 = r7.f21292k
            int r5 = r4 + 1
            r7.f21292k = r5
            byte[] r5 = r7.f21286e
            int r6 = r7.f21297p
            r6 = r6 & 63
            byte r5 = r5[r6]
            r2[r4] = r5
            int r2 = r7.f21294m
            int r2 = r2 + 4
            r7.f21294m = r2
            int r2 = r7.f21287f
            if (r2 <= 0) goto L_0x0177
            int r2 = r7.f21287f
            int r4 = r7.f21294m
            if (r2 > r4) goto L_0x0177
            byte[] r2 = r7.f21288g
            byte[] r4 = r7.f21291j
            int r5 = r7.f21292k
            byte[] r6 = r7.f21288g
            int r6 = r6.length
            java.lang.System.arraycopy(r2, r0, r4, r5, r6)
            int r2 = r7.f21292k
            byte[] r4 = r7.f21288g
            int r4 = r4.length
            int r2 = r2 + r4
            r7.f21292k = r2
            r7.f21294m = r0
        L_0x0177:
            int r9 = r9 + 1
            r2 = r3
            goto L_0x00d4
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p230a.p231a.C6570a.mo23083c(byte[], int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo23084d(byte[] bArr, int i, int i2) {
        if (!this.f21296o) {
            if (i2 < 0) {
                this.f21296o = true;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                if (this.f21291j == null || this.f21291j.length - this.f21292k < this.f21289h) {
                    m26016c();
                }
                int i4 = i + 1;
                byte b = bArr[i];
                if (b == 61) {
                    this.f21296o = true;
                    break;
                }
                if (b >= 0 && b < f21285d.length) {
                    byte b2 = f21285d[b];
                    if (b2 >= 0) {
                        int i5 = this.f21295n + 1;
                        this.f21295n = i5;
                        this.f21295n = i5 % 4;
                        this.f21297p = (this.f21297p << 6) + b2;
                        if (this.f21295n == 0) {
                            byte[] bArr2 = this.f21291j;
                            int i6 = this.f21292k;
                            this.f21292k = i6 + 1;
                            bArr2[i6] = (byte) ((this.f21297p >> 16) & 255);
                            byte[] bArr3 = this.f21291j;
                            int i7 = this.f21292k;
                            this.f21292k = i7 + 1;
                            bArr3[i7] = (byte) ((this.f21297p >> 8) & 255);
                            byte[] bArr4 = this.f21291j;
                            int i8 = this.f21292k;
                            this.f21292k = i8 + 1;
                            bArr4[i8] = (byte) (this.f21297p & 255);
                        }
                    }
                }
                i3++;
                i = i4;
            }
            if (this.f21296o && this.f21295n != 0) {
                this.f21297p <<= 6;
                switch (this.f21295n) {
                    case 2:
                        this.f21297p <<= 6;
                        byte[] bArr5 = this.f21291j;
                        int i9 = this.f21292k;
                        this.f21292k = i9 + 1;
                        bArr5[i9] = (byte) ((this.f21297p >> 16) & 255);
                        break;
                    case 3:
                        byte[] bArr6 = this.f21291j;
                        int i10 = this.f21292k;
                        this.f21292k = i10 + 1;
                        bArr6[i10] = (byte) ((this.f21297p >> 16) & 255);
                        byte[] bArr7 = this.f21291j;
                        int i11 = this.f21292k;
                        this.f21292k = i11 + 1;
                        bArr7[i11] = (byte) ((this.f21297p >> 8) & 255);
                        break;
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m26011a(byte b) {
        return b == 61 || (b >= 0 && b < f21285d.length && f21285d[b] != -1);
    }

    /* renamed from: e */
    private static boolean m26019e(byte[] bArr) {
        for (byte a : bArr) {
            if (m26011a(a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static byte[] m26012a(byte[] bArr) {
        return m26013a(bArr, false);
    }

    /* renamed from: b */
    public byte[] mo23082b(byte[] bArr) {
        m26018d();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[((int) ((long) ((bArr.length * 3) / 4)))];
        mo23081b(bArr2, 0, bArr2.length);
        mo23084d(bArr, 0, bArr.length);
        mo23084d(bArr, 0, -1);
        byte[] bArr3 = new byte[this.f21292k];
        mo23078a(bArr3, 0, bArr3.length);
        return bArr3;
    }

    /* renamed from: a */
    public static byte[] m26013a(byte[] bArr, boolean z) {
        return m26014a(bArr, z, false);
    }

    /* renamed from: a */
    public static byte[] m26014a(byte[] bArr, boolean z, boolean z2) {
        return m26015a(bArr, z, z2, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static byte[] m26015a(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        long a = m26010a(bArr, 76, f21282a);
        if (a > ((long) i)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Input array too big, the output array would be bigger (");
            stringBuffer.append(a);
            stringBuffer.append(") than the specified maxium size of ");
            stringBuffer.append(i);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        return (z ? new C6570a(z2) : new C6570a(0, f21282a, z2)).mo23085d(bArr);
    }

    /* renamed from: c */
    public static byte[] m26017c(byte[] bArr) {
        return new C6570a().mo23082b(bArr);
    }

    /* renamed from: d */
    public byte[] mo23085d(byte[] bArr) {
        byte[] bArr2;
        m26018d();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        byte[] bArr3 = new byte[((int) m26010a(bArr, this.f21287f, this.f21288g))];
        mo23081b(bArr3, 0, bArr3.length);
        mo23083c(bArr, 0, bArr.length);
        mo23083c(bArr, 0, -1);
        if (this.f21291j != bArr3) {
            mo23078a(bArr3, 0, bArr3.length);
        }
        if (!mo23079a() || this.f21292k >= bArr3.length) {
            bArr2 = bArr3;
        } else {
            bArr2 = new byte[this.f21292k];
            System.arraycopy(bArr3, 0, bArr2, 0, this.f21292k);
        }
        return bArr2;
    }

    /* renamed from: a */
    private static long m26010a(byte[] bArr, int i, byte[] bArr2) {
        int i2 = (i / 4) * 4;
        long length = (long) ((bArr.length * 4) / 3);
        long j = length % 4;
        long j2 = j != 0 ? length + (4 - j) : length;
        if (i2 <= 0) {
            return j2;
        }
        long j3 = (long) i2;
        long length2 = j2 + ((j2 / j3) * ((long) bArr2.length));
        return !(((j2 % j3) > 0 ? 1 : ((j2 % j3) == 0 ? 0 : -1)) == 0) ? length2 + ((long) bArr2.length) : length2;
    }

    /* renamed from: d */
    private void m26018d() {
        this.f21291j = null;
        this.f21292k = 0;
        this.f21293l = 0;
        this.f21294m = 0;
        this.f21295n = 0;
        this.f21296o = false;
    }
}
