package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class aes {

    /* renamed from: a */
    private final byte[] f10661a;

    /* renamed from: b */
    private final int f10662b;

    /* renamed from: c */
    private final int f10663c;

    /* renamed from: d */
    private int f10664d;

    /* renamed from: e */
    private int f10665e;

    /* renamed from: f */
    private int f10666f;

    /* renamed from: g */
    private int f10667g;

    /* renamed from: h */
    private int f10668h = Integer.MAX_VALUE;

    /* renamed from: i */
    private int f10669i;

    /* renamed from: j */
    private int f10670j = 64;

    /* renamed from: k */
    private int f10671k = 67108864;

    private aes(byte[] bArr, int i, int i2) {
        this.f10661a = bArr;
        this.f10662b = i;
        int i3 = i2 + i;
        this.f10664d = i3;
        this.f10663c = i3;
        this.f10666f = i;
    }

    /* renamed from: a */
    public static aes m13901a(byte[] bArr, int i, int i2) {
        return new aes(bArr, 0, i2);
    }

    /* renamed from: f */
    private final void m13902f(int i) throws IOException {
        if (i < 0) {
            throw afb.m13972b();
        } else if (this.f10666f + i > this.f10668h) {
            m13902f(this.f10668h - this.f10666f);
            throw afb.m13971a();
        } else if (i <= this.f10664d - this.f10666f) {
            this.f10666f += i;
        } else {
            throw afb.m13971a();
        }
    }

    /* renamed from: k */
    private final void m13903k() {
        this.f10664d += this.f10665e;
        int i = this.f10664d;
        if (i > this.f10668h) {
            this.f10665e = i - this.f10668h;
            this.f10664d -= this.f10665e;
            return;
        }
        this.f10665e = 0;
    }

    /* renamed from: l */
    private final byte m13904l() throws IOException {
        if (this.f10666f == this.f10664d) {
            throw afb.m13971a();
        }
        byte[] bArr = this.f10661a;
        int i = this.f10666f;
        this.f10666f = i + 1;
        return bArr[i];
    }

    /* renamed from: a */
    public final int mo14217a() throws IOException {
        if (this.f10666f == this.f10664d) {
            this.f10667g = 0;
            return 0;
        }
        this.f10667g = mo14231g();
        if (this.f10667g != 0) {
            return this.f10667g;
        }
        throw new afb("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public final void mo14218a(int i) throws afb {
        if (this.f10667g != i) {
            throw new afb("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: a */
    public final void mo14219a(afc afc) throws IOException {
        int g = mo14231g();
        if (this.f10669i >= this.f10670j) {
            throw new afb("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int c = mo14225c(g);
        this.f10669i++;
        afc.mo13937a(this);
        mo14218a(0);
        this.f10669i--;
        mo14226d(c);
    }

    /* renamed from: a */
    public final byte[] mo14220a(int i, int i2) {
        if (i2 == 0) {
            return aff.f10696e;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f10661a, this.f10662b + i, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: b */
    public final long mo14221b() throws IOException {
        return mo14232h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo14222b(int i, int i2) {
        if (i > this.f10666f - this.f10662b) {
            int i3 = this.f10666f - this.f10662b;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        } else if (i < 0) {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            this.f10666f = this.f10662b + i;
            this.f10667g = i2;
        }
    }

    /* renamed from: b */
    public final boolean mo14223b(int i) throws IOException {
        int a;
        switch (i & 7) {
            case 0:
                mo14231g();
                return true;
            case 1:
                m13904l();
                m13904l();
                m13904l();
                m13904l();
                m13904l();
                m13904l();
                m13904l();
                m13904l();
                return true;
            case 2:
                m13902f(mo14231g());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m13904l();
                m13904l();
                m13904l();
                m13904l();
                return true;
            default:
                throw new afb("Protocol message tag had invalid wire type.");
        }
        do {
            a = mo14217a();
            if (a != 0) {
            }
            mo14218a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo14223b(a));
        mo14218a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: c */
    public final int mo14224c() throws IOException {
        return mo14231g();
    }

    /* renamed from: c */
    public final int mo14225c(int i) throws afb {
        if (i < 0) {
            throw afb.m13972b();
        }
        int i2 = i + this.f10666f;
        int i3 = this.f10668h;
        if (i2 > i3) {
            throw afb.m13971a();
        }
        this.f10668h = i2;
        m13903k();
        return i3;
    }

    /* renamed from: d */
    public final void mo14226d(int i) {
        this.f10668h = i;
        m13903k();
    }

    /* renamed from: d */
    public final boolean mo14227d() throws IOException {
        return mo14231g() != 0;
    }

    /* renamed from: e */
    public final String mo14228e() throws IOException {
        int g = mo14231g();
        if (g < 0) {
            throw afb.m13972b();
        } else if (g > this.f10664d - this.f10666f) {
            throw afb.m13971a();
        } else {
            String str = new String(this.f10661a, this.f10666f, g, afa.f10686a);
            this.f10666f += g;
            return str;
        }
    }

    /* renamed from: e */
    public final void mo14229e(int i) {
        mo14222b(i, this.f10667g);
    }

    /* renamed from: f */
    public final byte[] mo14230f() throws IOException {
        int g = mo14231g();
        if (g < 0) {
            throw afb.m13972b();
        } else if (g == 0) {
            return aff.f10696e;
        } else {
            if (g > this.f10664d - this.f10666f) {
                throw afb.m13971a();
            }
            byte[] bArr = new byte[g];
            System.arraycopy(this.f10661a, this.f10666f, bArr, 0, g);
            this.f10666f += g;
            return bArr;
        }
    }

    /* renamed from: g */
    public final int mo14231g() throws IOException {
        int i;
        byte l = m13904l();
        if (l >= 0) {
            return l;
        }
        byte b = l & Byte.MAX_VALUE;
        byte l2 = m13904l();
        if (l2 >= 0) {
            i = l2 << 7;
        } else {
            b |= (l2 & Byte.MAX_VALUE) << 7;
            byte l3 = m13904l();
            if (l3 >= 0) {
                i = l3 << 14;
            } else {
                b |= (l3 & Byte.MAX_VALUE) << 14;
                byte l4 = m13904l();
                if (l4 >= 0) {
                    i = l4 << 21;
                } else {
                    byte b2 = b | ((l4 & Byte.MAX_VALUE) << 21);
                    byte l5 = m13904l();
                    byte b3 = b2 | (l5 << 28);
                    if (l5 >= 0) {
                        return b3;
                    }
                    for (int i2 = 0; i2 < 5; i2++) {
                        if (m13904l() >= 0) {
                            return b3;
                        }
                    }
                    throw afb.m13973c();
                }
            }
        }
        return b | i;
    }

    /* renamed from: h */
    public final long mo14232h() throws IOException {
        int i = 0;
        long j = 0;
        while (i < 64) {
            byte l = m13904l();
            long j2 = j | (((long) (l & Byte.MAX_VALUE)) << i);
            if ((l & 128) == 0) {
                return j2;
            }
            i += 7;
            j = j2;
        }
        throw afb.m13973c();
    }

    /* renamed from: i */
    public final int mo14233i() {
        if (this.f10668h == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f10668h - this.f10666f;
    }

    /* renamed from: j */
    public final int mo14234j() {
        return this.f10666f - this.f10662b;
    }
}
