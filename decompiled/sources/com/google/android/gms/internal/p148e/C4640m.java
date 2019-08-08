package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.m */
public final class C4640m extends C4625gk<C4640m> {

    /* renamed from: a */
    public Integer f15112a;

    /* renamed from: b */
    public Boolean f15113b;

    /* renamed from: c */
    public String f15114c;

    /* renamed from: d */
    public String f15115d;

    /* renamed from: e */
    public String f15116e;

    public C4640m() {
        this.f15112a = null;
        this.f15113b = null;
        this.f15114c = null;
        this.f15115d = null;
        this.f15116e = null;
        this.f15061L = null;
        this.f15077M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4640m)) {
            return false;
        }
        C4640m mVar = (C4640m) obj;
        if (this.f15112a == null) {
            if (mVar.f15112a != null) {
                return false;
            }
        } else if (!this.f15112a.equals(mVar.f15112a)) {
            return false;
        }
        if (this.f15113b == null) {
            if (mVar.f15113b != null) {
                return false;
            }
        } else if (!this.f15113b.equals(mVar.f15113b)) {
            return false;
        }
        if (this.f15114c == null) {
            if (mVar.f15114c != null) {
                return false;
            }
        } else if (!this.f15114c.equals(mVar.f15114c)) {
            return false;
        }
        if (this.f15115d == null) {
            if (mVar.f15115d != null) {
                return false;
            }
        } else if (!this.f15115d.equals(mVar.f15115d)) {
            return false;
        }
        if (this.f15116e == null) {
            if (mVar.f15116e != null) {
                return false;
            }
        } else if (!this.f15116e.equals(mVar.f15116e)) {
            return false;
        }
        if (this.f15061L == null || this.f15061L.mo16856b()) {
            return mVar.f15061L == null || mVar.f15061L.mo16856b();
        }
        return this.f15061L.equals(mVar.f15061L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((527 + getClass().getName().hashCode()) * 31) + (this.f15112a == null ? 0 : this.f15112a.intValue())) * 31) + (this.f15113b == null ? 0 : this.f15113b.hashCode())) * 31) + (this.f15114c == null ? 0 : this.f15114c.hashCode())) * 31) + (this.f15115d == null ? 0 : this.f15115d.hashCode())) * 31) + (this.f15116e == null ? 0 : this.f15116e.hashCode())) * 31;
        if (this.f15061L != null && !this.f15061L.mo16856b()) {
            i = this.f15061L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo16327a(C4623gi giVar) throws IOException {
        if (this.f15112a != null) {
            giVar.mo16833a(1, this.f15112a.intValue());
        }
        if (this.f15113b != null) {
            giVar.mo16838a(2, this.f15113b.booleanValue());
        }
        if (this.f15114c != null) {
            giVar.mo16837a(3, this.f15114c);
        }
        if (this.f15115d != null) {
            giVar.mo16837a(4, this.f15115d);
        }
        if (this.f15116e != null) {
            giVar.mo16837a(5, this.f15116e);
        }
        super.mo16327a(giVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16328b() {
        int b = super.mo16328b();
        if (this.f15112a != null) {
            b += C4623gi.m20050b(1, this.f15112a.intValue());
        }
        if (this.f15113b != null) {
            this.f15113b.booleanValue();
            b += C4623gi.m20049b(2) + 1;
        }
        if (this.f15114c != null) {
            b += C4623gi.m20052b(3, this.f15114c);
        }
        if (this.f15115d != null) {
            b += C4623gi.m20052b(4, this.f15115d);
        }
        return this.f15116e != null ? b + C4623gi.m20052b(5, this.f15116e) : b;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C4640m mo16326a(C4622gh ghVar) throws IOException {
        int d;
        while (true) {
            int a = ghVar.mo16811a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                try {
                    d = ghVar.mo16822d();
                    if (d < 0 || d > 4) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(d);
                        sb.append(" is not a valid enum ComparisonType");
                    } else {
                        this.f15112a = Integer.valueOf(d);
                    }
                } catch (IllegalArgumentException unused) {
                    ghVar.mo16825e(ghVar.mo16829i());
                    mo16844a(ghVar, a);
                }
            } else if (a == 16) {
                this.f15113b = Boolean.valueOf(ghVar.mo16818b());
            } else if (a == 26) {
                this.f15114c = ghVar.mo16821c();
            } else if (a == 34) {
                this.f15115d = ghVar.mo16821c();
            } else if (a == 42) {
                this.f15116e = ghVar.mo16821c();
            } else if (!super.mo16844a(ghVar, a)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(d);
        sb2.append(" is not a valid enum ComparisonType");
        throw new IllegalArgumentException(sb2.toString());
    }
}
