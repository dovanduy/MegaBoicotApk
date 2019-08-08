package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.j */
public final class C4637j extends C4625gk<C4637j> {

    /* renamed from: d */
    private static volatile C4637j[] f15093d;

    /* renamed from: a */
    public Integer f15094a;

    /* renamed from: b */
    public C4641n[] f15095b;

    /* renamed from: c */
    public C4638k[] f15096c;

    /* renamed from: e */
    private Boolean f15097e;

    /* renamed from: f */
    private Boolean f15098f;

    /* renamed from: a */
    public static C4637j[] m20114a() {
        if (f15093d == null) {
            synchronized (C4629go.f15075b) {
                if (f15093d == null) {
                    f15093d = new C4637j[0];
                }
            }
        }
        return f15093d;
    }

    public C4637j() {
        this.f15094a = null;
        this.f15095b = C4641n.m20130a();
        this.f15096c = C4638k.m20118a();
        this.f15097e = null;
        this.f15098f = null;
        this.f15061L = null;
        this.f15077M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4637j)) {
            return false;
        }
        C4637j jVar = (C4637j) obj;
        if (this.f15094a == null) {
            if (jVar.f15094a != null) {
                return false;
            }
        } else if (!this.f15094a.equals(jVar.f15094a)) {
            return false;
        }
        if (!C4629go.m20098a((Object[]) this.f15095b, (Object[]) jVar.f15095b) || !C4629go.m20098a((Object[]) this.f15096c, (Object[]) jVar.f15096c)) {
            return false;
        }
        if (this.f15097e == null) {
            if (jVar.f15097e != null) {
                return false;
            }
        } else if (!this.f15097e.equals(jVar.f15097e)) {
            return false;
        }
        if (this.f15098f == null) {
            if (jVar.f15098f != null) {
                return false;
            }
        } else if (!this.f15098f.equals(jVar.f15098f)) {
            return false;
        }
        if (this.f15061L == null || this.f15061L.mo16856b()) {
            return jVar.f15061L == null || jVar.f15061L.mo16856b();
        }
        return this.f15061L.equals(jVar.f15061L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((527 + getClass().getName().hashCode()) * 31) + (this.f15094a == null ? 0 : this.f15094a.hashCode())) * 31) + C4629go.m20094a((Object[]) this.f15095b)) * 31) + C4629go.m20094a((Object[]) this.f15096c)) * 31) + (this.f15097e == null ? 0 : this.f15097e.hashCode())) * 31) + (this.f15098f == null ? 0 : this.f15098f.hashCode())) * 31;
        if (this.f15061L != null && !this.f15061L.mo16856b()) {
            i = this.f15061L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo16327a(C4623gi giVar) throws IOException {
        if (this.f15094a != null) {
            giVar.mo16833a(1, this.f15094a.intValue());
        }
        if (this.f15095b != null && this.f15095b.length > 0) {
            for (C4641n nVar : this.f15095b) {
                if (nVar != null) {
                    giVar.mo16836a(2, (C4631gq) nVar);
                }
            }
        }
        if (this.f15096c != null && this.f15096c.length > 0) {
            for (C4638k kVar : this.f15096c) {
                if (kVar != null) {
                    giVar.mo16836a(3, (C4631gq) kVar);
                }
            }
        }
        if (this.f15097e != null) {
            giVar.mo16838a(4, this.f15097e.booleanValue());
        }
        if (this.f15098f != null) {
            giVar.mo16838a(5, this.f15098f.booleanValue());
        }
        super.mo16327a(giVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16328b() {
        int b = super.mo16328b();
        if (this.f15094a != null) {
            b += C4623gi.m20050b(1, this.f15094a.intValue());
        }
        if (this.f15095b != null && this.f15095b.length > 0) {
            int i = b;
            for (C4641n nVar : this.f15095b) {
                if (nVar != null) {
                    i += C4623gi.m20051b(2, (C4631gq) nVar);
                }
            }
            b = i;
        }
        if (this.f15096c != null && this.f15096c.length > 0) {
            for (C4638k kVar : this.f15096c) {
                if (kVar != null) {
                    b += C4623gi.m20051b(3, (C4631gq) kVar);
                }
            }
        }
        if (this.f15097e != null) {
            this.f15097e.booleanValue();
            b += C4623gi.m20049b(4) + 1;
        }
        if (this.f15098f == null) {
            return b;
        }
        this.f15098f.booleanValue();
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
                this.f15094a = Integer.valueOf(ghVar.mo16822d());
            } else if (a == 18) {
                int a2 = C4634gt.m20112a(ghVar, 18);
                int length = this.f15095b == null ? 0 : this.f15095b.length;
                C4641n[] nVarArr = new C4641n[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f15095b, 0, nVarArr, 0, length);
                }
                while (length < nVarArr.length - 1) {
                    nVarArr[length] = new C4641n();
                    ghVar.mo16814a((C4631gq) nVarArr[length]);
                    ghVar.mo16811a();
                    length++;
                }
                nVarArr[length] = new C4641n();
                ghVar.mo16814a((C4631gq) nVarArr[length]);
                this.f15095b = nVarArr;
            } else if (a == 26) {
                int a3 = C4634gt.m20112a(ghVar, 26);
                int length2 = this.f15096c == null ? 0 : this.f15096c.length;
                C4638k[] kVarArr = new C4638k[(a3 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f15096c, 0, kVarArr, 0, length2);
                }
                while (length2 < kVarArr.length - 1) {
                    kVarArr[length2] = new C4638k();
                    ghVar.mo16814a((C4631gq) kVarArr[length2]);
                    ghVar.mo16811a();
                    length2++;
                }
                kVarArr[length2] = new C4638k();
                ghVar.mo16814a((C4631gq) kVarArr[length2]);
                this.f15096c = kVarArr;
            } else if (a == 32) {
                this.f15097e = Boolean.valueOf(ghVar.mo16818b());
            } else if (a == 40) {
                this.f15098f = Boolean.valueOf(ghVar.mo16818b());
            } else if (!super.mo16844a(ghVar, a)) {
                return this;
            }
        }
    }
}
