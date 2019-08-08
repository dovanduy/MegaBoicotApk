package com.startapp.p154a.p155a.p158c;

/* renamed from: com.startapp.a.a.c.a */
/* compiled from: StartAppSDK */
public class C5046a extends C5047b {

    /* renamed from: a */
    static final byte[] f16338a = {13, 10};

    /* renamed from: d */
    private static final byte[] f16339d = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: e */
    private static final byte[] f16340e = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: f */
    private static final byte[] f16341f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* renamed from: g */
    private final byte[] f16342g;

    /* renamed from: h */
    private final byte[] f16343h;

    /* renamed from: i */
    private final byte[] f16344i;

    /* renamed from: j */
    private final int f16345j;

    /* renamed from: k */
    private final int f16346k;

    public C5046a() {
        this(0);
    }

    public C5046a(boolean z) {
        this(76, f16338a, z);
    }

    public C5046a(int i) {
        this(i, f16338a);
    }

    public C5046a(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public C5046a(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr == null ? 0 : bArr.length);
        this.f16343h = f16341f;
        if (bArr == null) {
            this.f16346k = 4;
            this.f16344i = null;
        } else if (mo18651c(bArr)) {
            String a = C5052f.m21825a(bArr);
            StringBuilder sb = new StringBuilder();
            sb.append("lineSeparator must not contain base64 characters: [");
            sb.append(a);
            sb.append("]");
            throw new IllegalArgumentException(sb.toString());
        } else if (i > 0) {
            this.f16346k = 4 + bArr.length;
            this.f16344i = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.f16344i, 0, bArr.length);
        } else {
            this.f16346k = 4;
            this.f16344i = null;
        }
        this.f16345j = this.f16346k - 1;
        this.f16342g = z ? f16340e : f16339d;
    }

    /* JADX WARNING: type inference failed for: r2v38 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v2, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18644a(byte[] r8, int r9, int r10, com.startapp.p154a.p155a.p158c.C5047b.C5048a r11) {
        /*
            r7 = this;
            boolean r0 = r11.f16357f
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1 = 1
            if (r10 >= 0) goto L_0x00df
            r11.f16357f = r1
            int r8 = r11.f16359h
            if (r8 != 0) goto L_0x0014
            int r8 = r7.f16349c
            if (r8 != 0) goto L_0x0014
            return
        L_0x0014:
            int r8 = r7.f16346k
            byte[] r8 = r7.mo18648a(r8, r11)
            int r9 = r11.f16355d
            int r10 = r11.f16359h
            r1 = 61
            switch(r10) {
                case 0: goto L_0x00bb;
                case 1: goto L_0x0081;
                case 2: goto L_0x003c;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Impossible modulus "
            r9.append(r10)
            int r10 = r11.f16359h
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x003c:
            int r10 = r11.f16355d
            int r2 = r10 + 1
            r11.f16355d = r2
            byte[] r2 = r7.f16342g
            int r3 = r11.f16352a
            int r3 = r3 >> 10
            r3 = r3 & 63
            byte r2 = r2[r3]
            r8[r10] = r2
            int r10 = r11.f16355d
            int r2 = r10 + 1
            r11.f16355d = r2
            byte[] r2 = r7.f16342g
            int r3 = r11.f16352a
            int r3 = r3 >> 4
            r3 = r3 & 63
            byte r2 = r2[r3]
            r8[r10] = r2
            int r10 = r11.f16355d
            int r2 = r10 + 1
            r11.f16355d = r2
            byte[] r2 = r7.f16342g
            int r3 = r11.f16352a
            int r3 = r3 << 2
            r3 = r3 & 63
            byte r2 = r2[r3]
            r8[r10] = r2
            byte[] r10 = r7.f16342g
            byte[] r2 = f16339d
            if (r10 != r2) goto L_0x00bb
            int r10 = r11.f16355d
            int r2 = r10 + 1
            r11.f16355d = r2
            r8[r10] = r1
            goto L_0x00bb
        L_0x0081:
            int r10 = r11.f16355d
            int r2 = r10 + 1
            r11.f16355d = r2
            byte[] r2 = r7.f16342g
            int r3 = r11.f16352a
            int r3 = r3 >> 2
            r3 = r3 & 63
            byte r2 = r2[r3]
            r8[r10] = r2
            int r10 = r11.f16355d
            int r2 = r10 + 1
            r11.f16355d = r2
            byte[] r2 = r7.f16342g
            int r3 = r11.f16352a
            int r3 = r3 << 4
            r3 = r3 & 63
            byte r2 = r2[r3]
            r8[r10] = r2
            byte[] r10 = r7.f16342g
            byte[] r2 = f16339d
            if (r10 != r2) goto L_0x00bb
            int r10 = r11.f16355d
            int r2 = r10 + 1
            r11.f16355d = r2
            r8[r10] = r1
            int r10 = r11.f16355d
            int r2 = r10 + 1
            r11.f16355d = r2
            r8[r10] = r1
        L_0x00bb:
            int r10 = r11.f16358g
            int r1 = r11.f16355d
            int r1 = r1 - r9
            int r10 = r10 + r1
            r11.f16358g = r10
            int r9 = r7.f16349c
            if (r9 <= 0) goto L_0x0172
            int r9 = r11.f16358g
            if (r9 <= 0) goto L_0x0172
            byte[] r9 = r7.f16344i
            int r10 = r11.f16355d
            byte[] r1 = r7.f16344i
            int r1 = r1.length
            java.lang.System.arraycopy(r9, r0, r8, r10, r1)
            int r8 = r11.f16355d
            byte[] r9 = r7.f16344i
            int r9 = r9.length
            int r8 = r8 + r9
            r11.f16355d = r8
            goto L_0x0172
        L_0x00df:
            r2 = r9
            r9 = r0
        L_0x00e1:
            if (r9 >= r10) goto L_0x0172
            int r3 = r7.f16346k
            byte[] r3 = r7.mo18648a(r3, r11)
            int r4 = r11.f16359h
            int r4 = r4 + r1
            int r4 = r4 % 3
            r11.f16359h = r4
            int r4 = r2 + 1
            byte r2 = r8[r2]
            if (r2 >= 0) goto L_0x00f8
            int r2 = r2 + 256
        L_0x00f8:
            int r5 = r11.f16352a
            int r5 = r5 << 8
            int r5 = r5 + r2
            r11.f16352a = r5
            int r2 = r11.f16359h
            if (r2 != 0) goto L_0x016d
            int r2 = r11.f16355d
            int r5 = r2 + 1
            r11.f16355d = r5
            byte[] r5 = r7.f16342g
            int r6 = r11.f16352a
            int r6 = r6 >> 18
            r6 = r6 & 63
            byte r5 = r5[r6]
            r3[r2] = r5
            int r2 = r11.f16355d
            int r5 = r2 + 1
            r11.f16355d = r5
            byte[] r5 = r7.f16342g
            int r6 = r11.f16352a
            int r6 = r6 >> 12
            r6 = r6 & 63
            byte r5 = r5[r6]
            r3[r2] = r5
            int r2 = r11.f16355d
            int r5 = r2 + 1
            r11.f16355d = r5
            byte[] r5 = r7.f16342g
            int r6 = r11.f16352a
            int r6 = r6 >> 6
            r6 = r6 & 63
            byte r5 = r5[r6]
            r3[r2] = r5
            int r2 = r11.f16355d
            int r5 = r2 + 1
            r11.f16355d = r5
            byte[] r5 = r7.f16342g
            int r6 = r11.f16352a
            r6 = r6 & 63
            byte r5 = r5[r6]
            r3[r2] = r5
            int r2 = r11.f16358g
            int r2 = r2 + 4
            r11.f16358g = r2
            int r2 = r7.f16349c
            if (r2 <= 0) goto L_0x016d
            int r2 = r7.f16349c
            int r5 = r11.f16358g
            if (r2 > r5) goto L_0x016d
            byte[] r2 = r7.f16344i
            int r5 = r11.f16355d
            byte[] r6 = r7.f16344i
            int r6 = r6.length
            java.lang.System.arraycopy(r2, r0, r3, r5, r6)
            int r2 = r11.f16355d
            byte[] r3 = r7.f16344i
            int r3 = r3.length
            int r2 = r2 + r3
            r11.f16355d = r2
            r11.f16358g = r0
        L_0x016d:
            int r9 = r9 + 1
            r2 = r4
            goto L_0x00e1
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.p154a.p155a.p158c.C5046a.mo18644a(byte[], int, int, com.startapp.a.a.c.b$a):void");
    }

    /* renamed from: a */
    public static String m21807a(byte[] bArr) {
        return C5052f.m21825a(m21808a(bArr, false));
    }

    /* renamed from: a */
    public static byte[] m21808a(byte[] bArr, boolean z) {
        return m21809a(bArr, z, false);
    }

    /* renamed from: a */
    public static byte[] m21809a(byte[] bArr, boolean z, boolean z2) {
        return m21810a(bArr, z, z2, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static byte[] m21810a(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        C5046a aVar = z ? new C5046a(z2) : new C5046a(0, f16338a, z2);
        long d = aVar.mo18652d(bArr);
        if (d <= ((long) i)) {
            return aVar.mo18650b(bArr);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input array too big, the output array would be bigger (");
        sb.append(d);
        sb.append(") than the specified maximum size of ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18645a(byte b) {
        return b >= 0 && b < this.f16343h.length && this.f16343h[b] != -1;
    }
}
