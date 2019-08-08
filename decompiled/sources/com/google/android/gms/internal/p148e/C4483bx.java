package com.google.android.gms.internal.p148e;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.e.bx */
final class C4483bx extends C4481bv {

    /* renamed from: d */
    private final byte[] f14716d;

    /* renamed from: e */
    private final boolean f14717e;

    /* renamed from: f */
    private int f14718f;

    /* renamed from: g */
    private int f14719g;

    /* renamed from: h */
    private int f14720h;

    /* renamed from: i */
    private int f14721i;

    /* renamed from: j */
    private int f14722j;

    /* renamed from: k */
    private int f14723k;

    private C4483bx(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f14723k = Integer.MAX_VALUE;
        this.f14716d = bArr;
        this.f14718f = i2 + i;
        this.f14720h = i;
        this.f14721i = this.f14720h;
        this.f14717e = z;
    }

    /* renamed from: a */
    public final int mo16412a() throws IOException {
        if (mo16438t()) {
            this.f14722j = 0;
            return 0;
        }
        this.f14722j = m19028v();
        if ((this.f14722j >>> 3) != 0) {
            return this.f14722j;
        }
        throw new C4526db("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public final void mo16414a(int i) throws C4526db {
        if (this.f14722j != i) {
            throw C4526db.m19461d();
        }
    }

    /* renamed from: b */
    public final boolean mo16416b(int i) throws IOException {
        int a;
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.f14718f - this.f14720h >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.f14716d;
                        int i3 = this.f14720h;
                        this.f14720h = i3 + 1;
                        if (bArr[i3] < 0) {
                            i2++;
                        }
                    }
                    throw C4526db.m19460c();
                }
                while (i2 < 10) {
                    if (m19027A() < 0) {
                        i2++;
                    }
                }
                throw C4526db.m19460c();
                return true;
            case 1:
                mo16424f(8);
                return true;
            case 2:
                mo16424f(m19028v());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                mo16424f(4);
                return true;
            default:
                throw C4526db.m19462e();
        }
        do {
            a = mo16412a();
            if (a != 0) {
            }
            mo16414a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo16416b(a));
        mo16414a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: b */
    public final double mo16415b() throws IOException {
        return Double.longBitsToDouble(m19031y());
    }

    /* renamed from: c */
    public final float mo16417c() throws IOException {
        return Float.intBitsToFloat(m19030x());
    }

    /* renamed from: d */
    public final long mo16420d() throws IOException {
        return m19029w();
    }

    /* renamed from: e */
    public final long mo16421e() throws IOException {
        return m19029w();
    }

    /* renamed from: f */
    public final int mo16423f() throws IOException {
        return m19028v();
    }

    /* renamed from: g */
    public final long mo16425g() throws IOException {
        return m19031y();
    }

    /* renamed from: h */
    public final int mo16426h() throws IOException {
        return m19030x();
    }

    /* renamed from: i */
    public final boolean mo16427i() throws IOException {
        return m19029w() != 0;
    }

    /* renamed from: j */
    public final String mo16428j() throws IOException {
        int v = m19028v();
        if (v > 0 && v <= this.f14718f - this.f14720h) {
            String str = new String(this.f14716d, this.f14720h, v, C4520cw.f14862a);
            this.f14720h += v;
            return str;
        } else if (v == 0) {
            return "";
        } else {
            if (v < 0) {
                throw C4526db.m19459b();
            }
            throw C4526db.m19458a();
        }
    }

    /* renamed from: k */
    public final String mo16429k() throws IOException {
        int v = m19028v();
        if (v > 0 && v <= this.f14718f - this.f14720h) {
            String b = C4607ft.m19941b(this.f14716d, this.f14720h, v);
            this.f14720h += v;
            return b;
        } else if (v == 0) {
            return "";
        } else {
            if (v <= 0) {
                throw C4526db.m19459b();
            }
            throw C4526db.m19458a();
        }
    }

    /* renamed from: a */
    public final <T extends C4554ec> T mo16413a(C4565en<T> enVar, C4499ch chVar) throws IOException {
        int v = m19028v();
        if (this.f14711a >= this.f14712b) {
            throw C4526db.m19463f();
        }
        int d = mo16419d(v);
        this.f14711a++;
        T t = (C4554ec) enVar.mo16623a(this, chVar);
        mo16414a(0);
        this.f14711a--;
        mo16422e(d);
        return t;
    }

    /* renamed from: l */
    public final C4469bj mo16430l() throws IOException {
        byte[] bArr;
        int v = m19028v();
        if (v > 0 && v <= this.f14718f - this.f14720h) {
            C4469bj a = C4469bj.m18961a(this.f14716d, this.f14720h, v);
            this.f14720h += v;
            return a;
        } else if (v == 0) {
            return C4469bj.f14699a;
        } else {
            if (v > 0 && v <= this.f14718f - this.f14720h) {
                int i = this.f14720h;
                this.f14720h += v;
                bArr = Arrays.copyOfRange(this.f14716d, i, this.f14720h);
            } else if (v > 0) {
                throw C4526db.m19458a();
            } else if (v == 0) {
                bArr = C4520cw.f14863b;
            } else {
                throw C4526db.m19459b();
            }
            return C4469bj.m18960a(bArr);
        }
    }

    /* renamed from: m */
    public final int mo16431m() throws IOException {
        return m19028v();
    }

    /* renamed from: n */
    public final int mo16432n() throws IOException {
        return m19028v();
    }

    /* renamed from: o */
    public final int mo16433o() throws IOException {
        return m19030x();
    }

    /* renamed from: p */
    public final long mo16434p() throws IOException {
        return m19031y();
    }

    /* renamed from: q */
    public final int mo16435q() throws IOException {
        int v = m19028v();
        return (-(v & 1)) ^ (v >>> 1);
    }

    /* renamed from: r */
    public final long mo16436r() throws IOException {
        long w = m19029w();
        return (w >>> 1) ^ (-(w & 1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r1[r2] >= 0) goto L_0x006a;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m19028v() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f14720h
            int r1 = r5.f14718f
            if (r1 == r0) goto L_0x006d
            byte[] r1 = r5.f14716d
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0011
            r5.f14720h = r2
            return r0
        L_0x0011:
            int r3 = r5.f14718f
            int r3 = r3 - r2
            r4 = 9
            if (r3 < r4) goto L_0x006d
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x0024
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x006a
        L_0x0024:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r3 = r3 << 14
            r0 = r0 ^ r3
            if (r0 < 0) goto L_0x0031
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002f:
            r3 = r2
            goto L_0x006a
        L_0x0031:
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x003f
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L_0x006a
        L_0x003f:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r4 = r3 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r3 >= 0) goto L_0x002f
            int r3 = r2 + 1
            byte r2 = r1[r2]
            if (r2 >= 0) goto L_0x006a
            int r2 = r3 + 1
            byte r3 = r1[r3]
            if (r3 >= 0) goto L_0x002f
            int r3 = r2 + 1
            byte r2 = r1[r2]
            if (r2 >= 0) goto L_0x006a
            int r2 = r3 + 1
            byte r3 = r1[r3]
            if (r3 >= 0) goto L_0x002f
            int r3 = r2 + 1
            byte r1 = r1[r2]
            if (r1 < 0) goto L_0x006d
        L_0x006a:
            r5.f14720h = r3
            return r0
        L_0x006d:
            long r0 = r5.mo16437s()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p148e.C4483bx.m19028v():int");
    }

    /* renamed from: w */
    private final long m19029w() throws IOException {
        long j;
        int i;
        long j2;
        long j3;
        long j4;
        int i2 = this.f14720h;
        if (this.f14718f != i2) {
            byte[] bArr = this.f14716d;
            int i3 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f14720h = i3;
                return (long) b;
            } else if (this.f14718f - i3 >= 9) {
                int i4 = i3 + 1;
                byte b2 = b ^ (bArr[i3] << 7);
                if (b2 < 0) {
                    j3 = (long) (b2 ^ Byte.MIN_VALUE);
                } else {
                    int i5 = i4 + 1;
                    byte b3 = b2 ^ (bArr[i4] << 14);
                    if (b3 >= 0) {
                        j4 = (long) (b3 ^ 16256);
                        i = i5;
                        j = j4;
                        this.f14720h = i;
                        return j;
                    }
                    i4 = i5 + 1;
                    byte b4 = b3 ^ (bArr[i5] << 21);
                    if (b4 < 0) {
                        j3 = (long) (b4 ^ -2080896);
                    } else {
                        long j5 = (long) b4;
                        int i6 = i4 + 1;
                        long j6 = j5 ^ (((long) bArr[i4]) << 28);
                        if (j6 >= 0) {
                            j2 = j6 ^ 266354560;
                        } else {
                            int i7 = i6 + 1;
                            long j7 = j6 ^ (((long) bArr[i6]) << 35);
                            if (j7 < 0) {
                                j = j7 ^ -34093383808L;
                            } else {
                                i6 = i7 + 1;
                                long j8 = j7 ^ (((long) bArr[i7]) << 42);
                                if (j8 >= 0) {
                                    j2 = j8 ^ 4363953127296L;
                                } else {
                                    i7 = i6 + 1;
                                    long j9 = j8 ^ (((long) bArr[i6]) << 49);
                                    if (j9 < 0) {
                                        j = j9 ^ -558586000294016L;
                                    } else {
                                        int i8 = i7 + 1;
                                        long j10 = (j9 ^ (((long) bArr[i7]) << 56)) ^ 71499008037633920L;
                                        if (j10 < 0) {
                                            int i9 = i8 + 1;
                                            if (((long) bArr[i8]) >= 0) {
                                                i8 = i9;
                                            }
                                        }
                                        j = j10;
                                        this.f14720h = i;
                                        return j;
                                    }
                                }
                            }
                            i = i7;
                            this.f14720h = i;
                            return j;
                        }
                        j = j2;
                        this.f14720h = i;
                        return j;
                    }
                }
                j4 = j3;
                i = i4;
                j = j4;
                this.f14720h = i;
                return j;
            }
        }
        return mo16437s();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final long mo16437s() throws IOException {
        long j = 0;
        int i = 0;
        while (i < 64) {
            byte A = m19027A();
            long j2 = j | (((long) (A & Byte.MAX_VALUE)) << i);
            if ((A & 128) == 0) {
                return j2;
            }
            i += 7;
            j = j2;
        }
        throw C4526db.m19460c();
    }

    /* renamed from: x */
    private final int m19030x() throws IOException {
        int i = this.f14720h;
        if (this.f14718f - i < 4) {
            throw C4526db.m19458a();
        }
        byte[] bArr = this.f14716d;
        this.f14720h = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: y */
    private final long m19031y() throws IOException {
        int i = this.f14720h;
        if (this.f14718f - i < 8) {
            throw C4526db.m19458a();
        }
        byte[] bArr = this.f14716d;
        this.f14720h = i + 8;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* renamed from: d */
    public final int mo16419d(int i) throws C4526db {
        if (i < 0) {
            throw C4526db.m19459b();
        }
        int u = i + mo16439u();
        int i2 = this.f14723k;
        if (u > i2) {
            throw C4526db.m19458a();
        }
        this.f14723k = u;
        m19032z();
        return i2;
    }

    /* renamed from: z */
    private final void m19032z() {
        this.f14718f += this.f14719g;
        int i = this.f14718f - this.f14721i;
        if (i > this.f14723k) {
            this.f14719g = i - this.f14723k;
            this.f14718f -= this.f14719g;
            return;
        }
        this.f14719g = 0;
    }

    /* renamed from: e */
    public final void mo16422e(int i) {
        this.f14723k = i;
        m19032z();
    }

    /* renamed from: t */
    public final boolean mo16438t() throws IOException {
        return this.f14720h == this.f14718f;
    }

    /* renamed from: u */
    public final int mo16439u() {
        return this.f14720h - this.f14721i;
    }

    /* renamed from: A */
    private final byte m19027A() throws IOException {
        if (this.f14720h == this.f14718f) {
            throw C4526db.m19458a();
        }
        byte[] bArr = this.f14716d;
        int i = this.f14720h;
        this.f14720h = i + 1;
        return bArr[i];
    }

    /* renamed from: f */
    public final void mo16424f(int i) throws IOException {
        if (i >= 0 && i <= this.f14718f - this.f14720h) {
            this.f14720h += i;
        } else if (i < 0) {
            throw C4526db.m19459b();
        } else {
            throw C4526db.m19458a();
        }
    }
}
