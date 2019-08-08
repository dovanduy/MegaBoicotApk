package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.n */
public final class C4641n extends C4625gk<C4641n> {

    /* renamed from: f */
    private static volatile C4641n[] f15117f;

    /* renamed from: a */
    public Integer f15118a;

    /* renamed from: b */
    public String f15119b;

    /* renamed from: c */
    public C4639l f15120c;

    /* renamed from: d */
    public Boolean f15121d;

    /* renamed from: e */
    public Boolean f15122e;

    /* renamed from: a */
    public static C4641n[] m20130a() {
        if (f15117f == null) {
            synchronized (C4629go.f15075b) {
                if (f15117f == null) {
                    f15117f = new C4641n[0];
                }
            }
        }
        return f15117f;
    }

    public C4641n() {
        this.f15118a = null;
        this.f15119b = null;
        this.f15120c = null;
        this.f15121d = null;
        this.f15122e = null;
        this.f15061L = null;
        this.f15077M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4641n)) {
            return false;
        }
        C4641n nVar = (C4641n) obj;
        if (this.f15118a == null) {
            if (nVar.f15118a != null) {
                return false;
            }
        } else if (!this.f15118a.equals(nVar.f15118a)) {
            return false;
        }
        if (this.f15119b == null) {
            if (nVar.f15119b != null) {
                return false;
            }
        } else if (!this.f15119b.equals(nVar.f15119b)) {
            return false;
        }
        if (this.f15120c == null) {
            if (nVar.f15120c != null) {
                return false;
            }
        } else if (!this.f15120c.equals(nVar.f15120c)) {
            return false;
        }
        if (this.f15121d == null) {
            if (nVar.f15121d != null) {
                return false;
            }
        } else if (!this.f15121d.equals(nVar.f15121d)) {
            return false;
        }
        if (this.f15122e == null) {
            if (nVar.f15122e != null) {
                return false;
            }
        } else if (!this.f15122e.equals(nVar.f15122e)) {
            return false;
        }
        if (this.f15061L == null || this.f15061L.mo16856b()) {
            return nVar.f15061L == null || nVar.f15061L.mo16856b();
        }
        return this.f15061L.equals(nVar.f15061L);
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = ((((527 + getClass().getName().hashCode()) * 31) + (this.f15118a == null ? 0 : this.f15118a.hashCode())) * 31) + (this.f15119b == null ? 0 : this.f15119b.hashCode());
        C4639l lVar = this.f15120c;
        int i3 = hashCode * 31;
        if (lVar == null) {
            i = 0;
        } else {
            i = lVar.hashCode();
        }
        int hashCode2 = (((((i3 + i) * 31) + (this.f15121d == null ? 0 : this.f15121d.hashCode())) * 31) + (this.f15122e == null ? 0 : this.f15122e.hashCode())) * 31;
        if (this.f15061L != null && !this.f15061L.mo16856b()) {
            i2 = this.f15061L.hashCode();
        }
        return hashCode2 + i2;
    }

    /* renamed from: a */
    public final void mo16327a(C4623gi giVar) throws IOException {
        if (this.f15118a != null) {
            giVar.mo16833a(1, this.f15118a.intValue());
        }
        if (this.f15119b != null) {
            giVar.mo16837a(2, this.f15119b);
        }
        if (this.f15120c != null) {
            giVar.mo16836a(3, (C4631gq) this.f15120c);
        }
        if (this.f15121d != null) {
            giVar.mo16838a(4, this.f15121d.booleanValue());
        }
        if (this.f15122e != null) {
            giVar.mo16838a(5, this.f15122e.booleanValue());
        }
        super.mo16327a(giVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16328b() {
        int b = super.mo16328b();
        if (this.f15118a != null) {
            b += C4623gi.m20050b(1, this.f15118a.intValue());
        }
        if (this.f15119b != null) {
            b += C4623gi.m20052b(2, this.f15119b);
        }
        if (this.f15120c != null) {
            b += C4623gi.m20051b(3, (C4631gq) this.f15120c);
        }
        if (this.f15121d != null) {
            this.f15121d.booleanValue();
            b += C4623gi.m20049b(4) + 1;
        }
        if (this.f15122e == null) {
            return b;
        }
        this.f15122e.booleanValue();
        return b + C4623gi.m20049b(5) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C4631gq mo16326a(C4622gh ghVar) throws IOException {
        while (true) {
            int a = ghVar.mo16811a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f15118a = Integer.valueOf(ghVar.mo16822d());
            } else if (a == 18) {
                this.f15119b = ghVar.mo16821c();
            } else if (a == 26) {
                if (this.f15120c == null) {
                    this.f15120c = new C4639l();
                }
                ghVar.mo16814a((C4631gq) this.f15120c);
            } else if (a == 32) {
                this.f15121d = Boolean.valueOf(ghVar.mo16818b());
            } else if (a == 40) {
                this.f15122e = Boolean.valueOf(ghVar.mo16818b());
            } else if (!super.mo16844a(ghVar, a)) {
                return this;
            }
        }
    }
}
