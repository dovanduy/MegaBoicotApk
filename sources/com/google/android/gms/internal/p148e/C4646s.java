package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.s */
public final class C4646s extends C4625gk<C4646s> {

    /* renamed from: e */
    private static volatile C4646s[] f15143e;

    /* renamed from: a */
    public Integer f15144a;

    /* renamed from: b */
    public C4652y f15145b;

    /* renamed from: c */
    public C4652y f15146c;

    /* renamed from: d */
    public Boolean f15147d;

    /* renamed from: a */
    public static C4646s[] m20149a() {
        if (f15143e == null) {
            synchronized (C4629go.f15075b) {
                if (f15143e == null) {
                    f15143e = new C4646s[0];
                }
            }
        }
        return f15143e;
    }

    public C4646s() {
        this.f15144a = null;
        this.f15145b = null;
        this.f15146c = null;
        this.f15147d = null;
        this.f15061L = null;
        this.f15077M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4646s)) {
            return false;
        }
        C4646s sVar = (C4646s) obj;
        if (this.f15144a == null) {
            if (sVar.f15144a != null) {
                return false;
            }
        } else if (!this.f15144a.equals(sVar.f15144a)) {
            return false;
        }
        if (this.f15145b == null) {
            if (sVar.f15145b != null) {
                return false;
            }
        } else if (!this.f15145b.equals(sVar.f15145b)) {
            return false;
        }
        if (this.f15146c == null) {
            if (sVar.f15146c != null) {
                return false;
            }
        } else if (!this.f15146c.equals(sVar.f15146c)) {
            return false;
        }
        if (this.f15147d == null) {
            if (sVar.f15147d != null) {
                return false;
            }
        } else if (!this.f15147d.equals(sVar.f15147d)) {
            return false;
        }
        if (this.f15061L == null || this.f15061L.mo16856b()) {
            return sVar.f15061L == null || sVar.f15061L.mo16856b();
        }
        return this.f15061L.equals(sVar.f15061L);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        int hashCode = ((527 + getClass().getName().hashCode()) * 31) + (this.f15144a == null ? 0 : this.f15144a.hashCode());
        C4652y yVar = this.f15145b;
        int i4 = hashCode * 31;
        if (yVar == null) {
            i = 0;
        } else {
            i = yVar.hashCode();
        }
        int i5 = i4 + i;
        C4652y yVar2 = this.f15146c;
        int i6 = i5 * 31;
        if (yVar2 == null) {
            i2 = 0;
        } else {
            i2 = yVar2.hashCode();
        }
        int hashCode2 = (((i6 + i2) * 31) + (this.f15147d == null ? 0 : this.f15147d.hashCode())) * 31;
        if (this.f15061L != null && !this.f15061L.mo16856b()) {
            i3 = this.f15061L.hashCode();
        }
        return hashCode2 + i3;
    }

    /* renamed from: a */
    public final void mo16327a(C4623gi giVar) throws IOException {
        if (this.f15144a != null) {
            giVar.mo16833a(1, this.f15144a.intValue());
        }
        if (this.f15145b != null) {
            giVar.mo16836a(2, (C4631gq) this.f15145b);
        }
        if (this.f15146c != null) {
            giVar.mo16836a(3, (C4631gq) this.f15146c);
        }
        if (this.f15147d != null) {
            giVar.mo16838a(4, this.f15147d.booleanValue());
        }
        super.mo16327a(giVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16328b() {
        int b = super.mo16328b();
        if (this.f15144a != null) {
            b += C4623gi.m20050b(1, this.f15144a.intValue());
        }
        if (this.f15145b != null) {
            b += C4623gi.m20051b(2, (C4631gq) this.f15145b);
        }
        if (this.f15146c != null) {
            b += C4623gi.m20051b(3, (C4631gq) this.f15146c);
        }
        if (this.f15147d == null) {
            return b;
        }
        this.f15147d.booleanValue();
        return b + C4623gi.m20049b(4) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C4631gq mo16326a(C4622gh ghVar) throws IOException {
        while (true) {
            int a = ghVar.mo16811a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f15144a = Integer.valueOf(ghVar.mo16822d());
            } else if (a == 18) {
                if (this.f15145b == null) {
                    this.f15145b = new C4652y();
                }
                ghVar.mo16814a((C4631gq) this.f15145b);
            } else if (a == 26) {
                if (this.f15146c == null) {
                    this.f15146c = new C4652y();
                }
                ghVar.mo16814a((C4631gq) this.f15146c);
            } else if (a == 32) {
                this.f15147d = Boolean.valueOf(ghVar.mo16818b());
            } else if (!super.mo16844a(ghVar, a)) {
                return this;
            }
        }
    }
}
