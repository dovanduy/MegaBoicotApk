package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.gh */
public final class C4622gh {

    /* renamed from: a */
    private final byte[] f15046a;

    /* renamed from: b */
    private final int f15047b;

    /* renamed from: c */
    private final int f15048c;

    /* renamed from: d */
    private int f15049d;

    /* renamed from: e */
    private int f15050e;

    /* renamed from: f */
    private int f15051f;

    /* renamed from: g */
    private int f15052g;

    /* renamed from: h */
    private int f15053h = Integer.MAX_VALUE;

    /* renamed from: i */
    private int f15054i;

    /* renamed from: j */
    private int f15055j = 64;

    /* renamed from: k */
    private int f15056k = 67108864;

    /* renamed from: l */
    private C4481bv f15057l;

    /* renamed from: a */
    public static C4622gh m20017a(byte[] bArr) {
        return m20018a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C4622gh m20018a(byte[] bArr, int i, int i2) {
        return new C4622gh(bArr, 0, i2);
    }

    /* renamed from: a */
    public final int mo16811a() throws IOException {
        if (this.f15051f == this.f15049d) {
            this.f15052g = 0;
            return 0;
        }
        this.f15052g = mo16822d();
        if (this.f15052g != 0) {
            return this.f15052g;
        }
        throw new C4630gp("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: a */
    public final void mo16813a(int i) throws C4630gp {
        if (this.f15052g != i) {
            throw new C4630gp("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: b */
    public final boolean mo16819b(int i) throws IOException {
        int a;
        switch (i & 7) {
            case 0:
                mo16822d();
                return true;
            case 1:
                mo16827g();
                return true;
            case 2:
                m20019f(mo16822d());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                mo16826f();
                return true;
            default:
                throw new C4630gp("Protocol message tag had invalid wire type.");
        }
        do {
            a = mo16811a();
            if (a != 0) {
            }
            mo16813a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo16819b(a));
        mo16813a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: b */
    public final boolean mo16818b() throws IOException {
        return mo16822d() != 0;
    }

    /* renamed from: c */
    public final String mo16821c() throws IOException {
        int d = mo16822d();
        if (d < 0) {
            throw C4630gp.m20100b();
        } else if (d > this.f15049d - this.f15051f) {
            throw C4630gp.m20099a();
        } else {
            String str = new String(this.f15046a, this.f15051f, d, C4629go.f15074a);
            this.f15051f += d;
            return str;
        }
    }

    /* renamed from: a */
    public final void mo16815a(C4631gq gqVar, int i) throws IOException {
        if (this.f15054i >= this.f15055j) {
            throw C4630gp.m20102d();
        }
        this.f15054i++;
        gqVar.mo16326a(this);
        mo16813a((i << 3) | 4);
        this.f15054i--;
    }

    /* renamed from: a */
    public final void mo16814a(C4631gq gqVar) throws IOException {
        int d = mo16822d();
        if (this.f15054i >= this.f15055j) {
            throw C4630gp.m20102d();
        }
        int c = mo16820c(d);
        this.f15054i++;
        gqVar.mo16326a(this);
        mo16813a(0);
        this.f15054i--;
        mo16823d(c);
    }

    /* renamed from: d */
    public final int mo16822d() throws IOException {
        byte b;
        byte l = m20022l();
        if (l >= 0) {
            return l;
        }
        byte b2 = l & Byte.MAX_VALUE;
        byte l2 = m20022l();
        if (l2 >= 0) {
            b = b2 | (l2 << 7);
        } else {
            byte b3 = b2 | ((l2 & Byte.MAX_VALUE) << 7);
            byte l3 = m20022l();
            if (l3 >= 0) {
                b = b3 | (l3 << 14);
            } else {
                byte b4 = b3 | ((l3 & Byte.MAX_VALUE) << 14);
                byte l4 = m20022l();
                if (l4 >= 0) {
                    b = b4 | (l4 << 21);
                } else {
                    byte b5 = b4 | ((l4 & Byte.MAX_VALUE) << 21);
                    byte l5 = m20022l();
                    b = b5 | (l5 << 28);
                    if (l5 < 0) {
                        for (int i = 0; i < 5; i++) {
                            if (m20022l() >= 0) {
                                return b;
                            }
                        }
                        throw C4630gp.m20101c();
                    }
                }
            }
        }
        return b;
    }

    /* renamed from: e */
    public final long mo16824e() throws IOException {
        int i = 0;
        long j = 0;
        while (i < 64) {
            byte l = m20022l();
            long j2 = j | (((long) (l & Byte.MAX_VALUE)) << i);
            if ((l & 128) == 0) {
                return j2;
            }
            i += 7;
            j = j2;
        }
        throw C4630gp.m20101c();
    }

    /* renamed from: f */
    public final int mo16826f() throws IOException {
        return (m20022l() & 255) | ((m20022l() & 255) << 8) | ((m20022l() & 255) << 16) | ((m20022l() & 255) << 24);
    }

    /* renamed from: g */
    public final long mo16827g() throws IOException {
        return (((long) m20022l()) & 255) | ((((long) m20022l()) & 255) << 8) | ((((long) m20022l()) & 255) << 16) | ((((long) m20022l()) & 255) << 24) | ((((long) m20022l()) & 255) << 32) | ((((long) m20022l()) & 255) << 40) | ((((long) m20022l()) & 255) << 48) | ((((long) m20022l()) & 255) << 56);
    }

    private C4622gh(byte[] bArr, int i, int i2) {
        this.f15046a = bArr;
        this.f15047b = i;
        int i3 = i2 + i;
        this.f15049d = i3;
        this.f15048c = i3;
        this.f15051f = i;
    }

    /* renamed from: j */
    private final C4481bv m20020j() throws IOException {
        if (this.f15057l == null) {
            this.f15057l = C4481bv.m18997a(this.f15046a, this.f15047b, this.f15048c);
        }
        int u = this.f15057l.mo16439u();
        int i = this.f15051f - this.f15047b;
        if (u > i) {
            throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[]{Integer.valueOf(u), Integer.valueOf(i)}));
        }
        this.f15057l.mo16424f(i - u);
        this.f15057l.mo16418c(this.f15055j - this.f15054i);
        return this.f15057l;
    }

    /* renamed from: a */
    public final <T extends C4513cu<T, ?>> T mo16812a(C4565en<T> enVar) throws IOException {
        try {
            T t = (C4513cu) m20020j().mo16413a(enVar, C4499ch.m19341b());
            mo16819b(this.f15052g);
            return t;
        } catch (C4526db e) {
            throw new C4630gp("", e);
        }
    }

    /* renamed from: c */
    public final int mo16820c(int i) throws C4630gp {
        if (i < 0) {
            throw C4630gp.m20100b();
        }
        int i2 = i + this.f15051f;
        int i3 = this.f15053h;
        if (i2 > i3) {
            throw C4630gp.m20099a();
        }
        this.f15053h = i2;
        m20021k();
        return i3;
    }

    /* renamed from: k */
    private final void m20021k() {
        this.f15049d += this.f15050e;
        int i = this.f15049d;
        if (i > this.f15053h) {
            this.f15050e = i - this.f15053h;
            this.f15049d -= this.f15050e;
            return;
        }
        this.f15050e = 0;
    }

    /* renamed from: d */
    public final void mo16823d(int i) {
        this.f15053h = i;
        m20021k();
    }

    /* renamed from: h */
    public final int mo16828h() {
        if (this.f15053h == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f15053h - this.f15051f;
    }

    /* renamed from: i */
    public final int mo16829i() {
        return this.f15051f - this.f15047b;
    }

    /* renamed from: a */
    public final byte[] mo16816a(int i, int i2) {
        if (i2 == 0) {
            return C4634gt.f15083d;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f15046a, this.f15047b + i, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: e */
    public final void mo16825e(int i) {
        mo16817b(i, this.f15052g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo16817b(int i, int i2) {
        if (i > this.f15051f - this.f15047b) {
            int i3 = this.f15051f - this.f15047b;
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
            this.f15051f = this.f15047b + i;
            this.f15052g = i2;
        }
    }

    /* renamed from: l */
    private final byte m20022l() throws IOException {
        if (this.f15051f == this.f15049d) {
            throw C4630gp.m20099a();
        }
        byte[] bArr = this.f15046a;
        int i = this.f15051f;
        this.f15051f = i + 1;
        return bArr[i];
    }

    /* renamed from: f */
    private final void m20019f(int i) throws IOException {
        if (i < 0) {
            throw C4630gp.m20100b();
        } else if (this.f15051f + i > this.f15053h) {
            m20019f(this.f15053h - this.f15051f);
            throw C4630gp.m20099a();
        } else if (i <= this.f15049d - this.f15051f) {
            this.f15051f += i;
        } else {
            throw C4630gp.m20099a();
        }
    }
}
