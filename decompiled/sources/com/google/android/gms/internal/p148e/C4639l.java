package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.l */
public final class C4639l extends C4625gk<C4639l> {

    /* renamed from: e */
    private static volatile C4639l[] f15107e;

    /* renamed from: a */
    public C4642o f15108a;

    /* renamed from: b */
    public C4640m f15109b;

    /* renamed from: c */
    public Boolean f15110c;

    /* renamed from: d */
    public String f15111d;

    /* renamed from: a */
    public static C4639l[] m20122a() {
        if (f15107e == null) {
            synchronized (C4629go.f15075b) {
                if (f15107e == null) {
                    f15107e = new C4639l[0];
                }
            }
        }
        return f15107e;
    }

    public C4639l() {
        this.f15108a = null;
        this.f15109b = null;
        this.f15110c = null;
        this.f15111d = null;
        this.f15061L = null;
        this.f15077M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4639l)) {
            return false;
        }
        C4639l lVar = (C4639l) obj;
        if (this.f15108a == null) {
            if (lVar.f15108a != null) {
                return false;
            }
        } else if (!this.f15108a.equals(lVar.f15108a)) {
            return false;
        }
        if (this.f15109b == null) {
            if (lVar.f15109b != null) {
                return false;
            }
        } else if (!this.f15109b.equals(lVar.f15109b)) {
            return false;
        }
        if (this.f15110c == null) {
            if (lVar.f15110c != null) {
                return false;
            }
        } else if (!this.f15110c.equals(lVar.f15110c)) {
            return false;
        }
        if (this.f15111d == null) {
            if (lVar.f15111d != null) {
                return false;
            }
        } else if (!this.f15111d.equals(lVar.f15111d)) {
            return false;
        }
        if (this.f15061L == null || this.f15061L.mo16856b()) {
            return lVar.f15061L == null || lVar.f15061L.mo16856b();
        }
        return this.f15061L.equals(lVar.f15061L);
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = 527 + getClass().getName().hashCode();
        C4642o oVar = this.f15108a;
        int i3 = hashCode * 31;
        int i4 = 0;
        if (oVar == null) {
            i = 0;
        } else {
            i = oVar.hashCode();
        }
        int i5 = i3 + i;
        C4640m mVar = this.f15109b;
        int i6 = i5 * 31;
        if (mVar == null) {
            i2 = 0;
        } else {
            i2 = mVar.hashCode();
        }
        int hashCode2 = (((((i6 + i2) * 31) + (this.f15110c == null ? 0 : this.f15110c.hashCode())) * 31) + (this.f15111d == null ? 0 : this.f15111d.hashCode())) * 31;
        if (this.f15061L != null && !this.f15061L.mo16856b()) {
            i4 = this.f15061L.hashCode();
        }
        return hashCode2 + i4;
    }

    /* renamed from: a */
    public final void mo16327a(C4623gi giVar) throws IOException {
        if (this.f15108a != null) {
            giVar.mo16836a(1, (C4631gq) this.f15108a);
        }
        if (this.f15109b != null) {
            giVar.mo16836a(2, (C4631gq) this.f15109b);
        }
        if (this.f15110c != null) {
            giVar.mo16838a(3, this.f15110c.booleanValue());
        }
        if (this.f15111d != null) {
            giVar.mo16837a(4, this.f15111d);
        }
        super.mo16327a(giVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16328b() {
        int b = super.mo16328b();
        if (this.f15108a != null) {
            b += C4623gi.m20051b(1, (C4631gq) this.f15108a);
        }
        if (this.f15109b != null) {
            b += C4623gi.m20051b(2, (C4631gq) this.f15109b);
        }
        if (this.f15110c != null) {
            this.f15110c.booleanValue();
            b += C4623gi.m20049b(3) + 1;
        }
        return this.f15111d != null ? b + C4623gi.m20052b(4, this.f15111d) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C4631gq mo16326a(C4622gh ghVar) throws IOException {
        while (true) {
            int a = ghVar.mo16811a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                if (this.f15108a == null) {
                    this.f15108a = new C4642o();
                }
                ghVar.mo16814a((C4631gq) this.f15108a);
            } else if (a == 18) {
                if (this.f15109b == null) {
                    this.f15109b = new C4640m();
                }
                ghVar.mo16814a((C4631gq) this.f15109b);
            } else if (a == 24) {
                this.f15110c = Boolean.valueOf(ghVar.mo16818b());
            } else if (a == 34) {
                this.f15111d = ghVar.mo16821c();
            } else if (!super.mo16844a(ghVar, a)) {
                return this;
            }
        }
    }
}
