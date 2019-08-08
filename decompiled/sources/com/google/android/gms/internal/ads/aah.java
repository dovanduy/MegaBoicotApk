package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

final class aah extends aaf {

    /* renamed from: d */
    private final byte[] f10282d;

    /* renamed from: e */
    private final boolean f10283e;

    /* renamed from: f */
    private int f10284f;

    /* renamed from: g */
    private int f10285g;

    /* renamed from: h */
    private int f10286h;

    /* renamed from: i */
    private int f10287i;

    /* renamed from: j */
    private int f10288j;

    /* renamed from: k */
    private int f10289k;

    private aah(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f10289k = Integer.MAX_VALUE;
        this.f10282d = bArr;
        this.f10284f = i2 + i;
        this.f10286h = i;
        this.f10287i = this.f10286h;
        this.f10283e = z;
    }

    /* renamed from: A */
    private final byte m12969A() throws IOException {
        if (this.f10286h == this.f10284f) {
            throw abk.m13332a();
        }
        byte[] bArr = this.f10282d;
        int i = this.f10286h;
        this.f10286h = i + 1;
        return bArr[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r1[r2] >= 0) goto L_0x006a;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m12970v() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f10286h
            int r1 = r5.f10284f
            if (r1 == r0) goto L_0x006d
            byte[] r1 = r5.f10282d
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0011
            r5.f10286h = r2
            return r0
        L_0x0011:
            int r3 = r5.f10284f
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
            r5.f10286h = r3
            return r0
        L_0x006d:
            long r0 = r5.mo13802s()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aah.m12970v():int");
    }

    /* renamed from: w */
    private final long m12971w() throws IOException {
        long j;
        int i;
        long j2;
        long j3;
        byte b;
        long j4;
        int i2 = this.f10286h;
        if (this.f10284f != i2) {
            byte[] bArr = this.f10282d;
            int i3 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.f10286h = i3;
                return (long) b2;
            } else if (this.f10284f - i3 >= 9) {
                int i4 = i3 + 1;
                byte b3 = b2 ^ (bArr[i3] << 7);
                if (b3 < 0) {
                    b = b3 ^ Byte.MIN_VALUE;
                } else {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << 14);
                    if (b4 >= 0) {
                        j4 = (long) (b4 ^ 16256);
                        i = i5;
                        j = j4;
                        this.f10286h = i;
                        return j;
                    }
                    i4 = i5 + 1;
                    byte b5 = b4 ^ (bArr[i5] << 21);
                    if (b5 < 0) {
                        b = b5 ^ -2080896;
                    } else {
                        long j5 = (long) b5;
                        int i6 = i4 + 1;
                        long j6 = j5 ^ (((long) bArr[i4]) << 28);
                        if (j6 >= 0) {
                            j3 = 266354560;
                        } else {
                            int i7 = i6 + 1;
                            long j7 = j6 ^ (((long) bArr[i6]) << 35);
                            if (j7 < 0) {
                                j2 = -34093383808L;
                            } else {
                                i6 = i7 + 1;
                                j6 = j7 ^ (((long) bArr[i7]) << 42);
                                if (j6 >= 0) {
                                    j3 = 4363953127296L;
                                } else {
                                    i7 = i6 + 1;
                                    j7 = j6 ^ (((long) bArr[i6]) << 49);
                                    if (j7 < 0) {
                                        j2 = -558586000294016L;
                                    } else {
                                        int i8 = i7 + 1;
                                        long j8 = (j7 ^ (((long) bArr[i7]) << 56)) ^ 71499008037633920L;
                                        if (j8 < 0) {
                                            int i9 = i8 + 1;
                                            if (((long) bArr[i8]) >= 0) {
                                                i8 = i9;
                                            }
                                        }
                                        j = j8;
                                        this.f10286h = i;
                                        return j;
                                    }
                                }
                            }
                            j = j7 ^ j2;
                            i = i7;
                            this.f10286h = i;
                            return j;
                        }
                        j = j6 ^ j3;
                        this.f10286h = i;
                        return j;
                    }
                }
                j4 = (long) b;
                i = i4;
                j = j4;
                this.f10286h = i;
                return j;
            }
        }
        return mo13802s();
    }

    /* renamed from: x */
    private final int m12972x() throws IOException {
        int i = this.f10286h;
        if (this.f10284f - i < 4) {
            throw abk.m13332a();
        }
        byte[] bArr = this.f10282d;
        this.f10286h = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: y */
    private final long m12973y() throws IOException {
        int i = this.f10286h;
        if (this.f10284f - i < 8) {
            throw abk.m13332a();
        }
        byte[] bArr = this.f10282d;
        this.f10286h = i + 8;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* renamed from: z */
    private final void m12974z() {
        this.f10284f += this.f10285g;
        int i = this.f10284f - this.f10287i;
        if (i > this.f10289k) {
            this.f10285g = i - this.f10289k;
            this.f10284f -= this.f10285g;
            return;
        }
        this.f10285g = 0;
    }

    /* renamed from: a */
    public final int mo13779a() throws IOException {
        if (mo13803t()) {
            this.f10288j = 0;
            return 0;
        }
        this.f10288j = m12970v();
        if ((this.f10288j >>> 3) != 0) {
            return this.f10288j;
        }
        throw abk.m13335d();
    }

    /* renamed from: a */
    public final void mo13780a(int i) throws abk {
        if (this.f10288j != i) {
            throw abk.m13336e();
        }
    }

    /* renamed from: b */
    public final double mo13781b() throws IOException {
        return Double.longBitsToDouble(m12973y());
    }

    /* renamed from: b */
    public final boolean mo13782b(int i) throws IOException {
        int a;
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.f10284f - this.f10286h >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.f10282d;
                        int i3 = this.f10286h;
                        this.f10286h = i3 + 1;
                        if (bArr[i3] < 0) {
                            i2++;
                        }
                    }
                    throw abk.m13334c();
                }
                while (i2 < 10) {
                    if (m12969A() < 0) {
                        i2++;
                    }
                }
                throw abk.m13334c();
                return true;
            case 1:
                mo13788e(8);
                return true;
            case 2:
                mo13788e(m12970v());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                mo13788e(4);
                return true;
            default:
                throw abk.m13337f();
        }
        do {
            a = mo13779a();
            if (a != 0) {
            }
            mo13780a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo13782b(a));
        mo13780a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: c */
    public final float mo13783c() throws IOException {
        return Float.intBitsToFloat(m12972x());
    }

    /* renamed from: c */
    public final int mo13784c(int i) throws abk {
        if (i < 0) {
            throw abk.m13333b();
        }
        int u = i + mo13804u();
        int i2 = this.f10289k;
        if (u > i2) {
            throw abk.m13332a();
        }
        this.f10289k = u;
        m12974z();
        return i2;
    }

    /* renamed from: d */
    public final long mo13785d() throws IOException {
        return m12971w();
    }

    /* renamed from: d */
    public final void mo13786d(int i) {
        this.f10289k = i;
        m12974z();
    }

    /* renamed from: e */
    public final long mo13787e() throws IOException {
        return m12971w();
    }

    /* renamed from: e */
    public final void mo13788e(int i) throws IOException {
        if (i >= 0 && i <= this.f10284f - this.f10286h) {
            this.f10286h += i;
        } else if (i < 0) {
            throw abk.m13333b();
        } else {
            throw abk.m13332a();
        }
    }

    /* renamed from: f */
    public final int mo13789f() throws IOException {
        return m12970v();
    }

    /* renamed from: g */
    public final long mo13790g() throws IOException {
        return m12973y();
    }

    /* renamed from: h */
    public final int mo13791h() throws IOException {
        return m12972x();
    }

    /* renamed from: i */
    public final boolean mo13792i() throws IOException {
        return m12971w() != 0;
    }

    /* renamed from: j */
    public final String mo13793j() throws IOException {
        int v = m12970v();
        if (v > 0 && v <= this.f10284f - this.f10286h) {
            String str = new String(this.f10282d, this.f10286h, v, abg.f10435a);
            this.f10286h += v;
            return str;
        } else if (v == 0) {
            return "";
        } else {
            if (v < 0) {
                throw abk.m13333b();
            }
            throw abk.m13332a();
        }
    }

    /* renamed from: k */
    public final String mo13794k() throws IOException {
        int v = m12970v();
        if (v <= 0 || v > this.f10284f - this.f10286h) {
            if (v == 0) {
                return "";
            }
            if (v <= 0) {
                throw abk.m13333b();
            }
            throw abk.m13332a();
        } else if (!aef.m13844a(this.f10282d, this.f10286h, this.f10286h + v)) {
            throw abk.m13339h();
        } else {
            int i = this.f10286h;
            this.f10286h += v;
            return new String(this.f10282d, i, v, abg.f10435a);
        }
    }

    /* renamed from: l */
    public final C4386zw mo13795l() throws IOException {
        byte[] bArr;
        int v = m12970v();
        if (v > 0 && v <= this.f10284f - this.f10286h) {
            C4386zw a = C4386zw.m18763a(this.f10282d, this.f10286h, v);
            this.f10286h += v;
            return a;
        } else if (v == 0) {
            return C4386zw.f14365a;
        } else {
            if (v > 0 && v <= this.f10284f - this.f10286h) {
                int i = this.f10286h;
                this.f10286h += v;
                bArr = Arrays.copyOfRange(this.f10282d, i, this.f10286h);
            } else if (v > 0) {
                throw abk.m13332a();
            } else if (v == 0) {
                bArr = abg.f10436b;
            } else {
                throw abk.m13333b();
            }
            return C4386zw.m18766b(bArr);
        }
    }

    /* renamed from: m */
    public final int mo13796m() throws IOException {
        return m12970v();
    }

    /* renamed from: n */
    public final int mo13797n() throws IOException {
        return m12970v();
    }

    /* renamed from: o */
    public final int mo13798o() throws IOException {
        return m12972x();
    }

    /* renamed from: p */
    public final long mo13799p() throws IOException {
        return m12973y();
    }

    /* renamed from: q */
    public final int mo13800q() throws IOException {
        return m12942f(m12970v());
    }

    /* renamed from: r */
    public final long mo13801r() throws IOException {
        return m12940a(m12971w());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final long mo13802s() throws IOException {
        long j = 0;
        int i = 0;
        while (i < 64) {
            byte A = m12969A();
            long j2 = j | (((long) (A & Byte.MAX_VALUE)) << i);
            if ((A & 128) == 0) {
                return j2;
            }
            i += 7;
            j = j2;
        }
        throw abk.m13334c();
    }

    /* renamed from: t */
    public final boolean mo13803t() throws IOException {
        return this.f10286h == this.f10284f;
    }

    /* renamed from: u */
    public final int mo13804u() {
        return this.f10286h - this.f10287i;
    }
}
