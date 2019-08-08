package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.u */
public final class C4648u extends C4625gk<C4648u> {

    /* renamed from: f */
    private static volatile C4648u[] f15151f;

    /* renamed from: a */
    public C4649v[] f15152a;

    /* renamed from: b */
    public String f15153b;

    /* renamed from: c */
    public Long f15154c;

    /* renamed from: d */
    public Long f15155d;

    /* renamed from: e */
    public Integer f15156e;

    /* renamed from: a */
    public static C4648u[] m20157a() {
        if (f15151f == null) {
            synchronized (C4629go.f15075b) {
                if (f15151f == null) {
                    f15151f = new C4648u[0];
                }
            }
        }
        return f15151f;
    }

    public C4648u() {
        this.f15152a = C4649v.m20161a();
        this.f15153b = null;
        this.f15154c = null;
        this.f15155d = null;
        this.f15156e = null;
        this.f15061L = null;
        this.f15077M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4648u)) {
            return false;
        }
        C4648u uVar = (C4648u) obj;
        if (!C4629go.m20098a((Object[]) this.f15152a, (Object[]) uVar.f15152a)) {
            return false;
        }
        if (this.f15153b == null) {
            if (uVar.f15153b != null) {
                return false;
            }
        } else if (!this.f15153b.equals(uVar.f15153b)) {
            return false;
        }
        if (this.f15154c == null) {
            if (uVar.f15154c != null) {
                return false;
            }
        } else if (!this.f15154c.equals(uVar.f15154c)) {
            return false;
        }
        if (this.f15155d == null) {
            if (uVar.f15155d != null) {
                return false;
            }
        } else if (!this.f15155d.equals(uVar.f15155d)) {
            return false;
        }
        if (this.f15156e == null) {
            if (uVar.f15156e != null) {
                return false;
            }
        } else if (!this.f15156e.equals(uVar.f15156e)) {
            return false;
        }
        if (this.f15061L == null || this.f15061L.mo16856b()) {
            return uVar.f15061L == null || uVar.f15061L.mo16856b();
        }
        return this.f15061L.equals(uVar.f15061L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((527 + getClass().getName().hashCode()) * 31) + C4629go.m20094a((Object[]) this.f15152a)) * 31) + (this.f15153b == null ? 0 : this.f15153b.hashCode())) * 31) + (this.f15154c == null ? 0 : this.f15154c.hashCode())) * 31) + (this.f15155d == null ? 0 : this.f15155d.hashCode())) * 31) + (this.f15156e == null ? 0 : this.f15156e.hashCode())) * 31;
        if (this.f15061L != null && !this.f15061L.mo16856b()) {
            i = this.f15061L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo16327a(C4623gi giVar) throws IOException {
        if (this.f15152a != null && this.f15152a.length > 0) {
            for (C4649v vVar : this.f15152a) {
                if (vVar != null) {
                    giVar.mo16836a(1, (C4631gq) vVar);
                }
            }
        }
        if (this.f15153b != null) {
            giVar.mo16837a(2, this.f15153b);
        }
        if (this.f15154c != null) {
            giVar.mo16840b(3, this.f15154c.longValue());
        }
        if (this.f15155d != null) {
            giVar.mo16840b(4, this.f15155d.longValue());
        }
        if (this.f15156e != null) {
            giVar.mo16833a(5, this.f15156e.intValue());
        }
        super.mo16327a(giVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16328b() {
        int b = super.mo16328b();
        if (this.f15152a != null && this.f15152a.length > 0) {
            for (C4649v vVar : this.f15152a) {
                if (vVar != null) {
                    b += C4623gi.m20051b(1, (C4631gq) vVar);
                }
            }
        }
        if (this.f15153b != null) {
            b += C4623gi.m20052b(2, this.f15153b);
        }
        if (this.f15154c != null) {
            b += C4623gi.m20055c(3, this.f15154c.longValue());
        }
        if (this.f15155d != null) {
            b += C4623gi.m20055c(4, this.f15155d.longValue());
        }
        return this.f15156e != null ? b + C4623gi.m20050b(5, this.f15156e.intValue()) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C4631gq mo16326a(C4622gh ghVar) throws IOException {
        while (true) {
            int a = ghVar.mo16811a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                int a2 = C4634gt.m20112a(ghVar, 10);
                int length = this.f15152a == null ? 0 : this.f15152a.length;
                C4649v[] vVarArr = new C4649v[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f15152a, 0, vVarArr, 0, length);
                }
                while (length < vVarArr.length - 1) {
                    vVarArr[length] = new C4649v();
                    ghVar.mo16814a((C4631gq) vVarArr[length]);
                    ghVar.mo16811a();
                    length++;
                }
                vVarArr[length] = new C4649v();
                ghVar.mo16814a((C4631gq) vVarArr[length]);
                this.f15152a = vVarArr;
            } else if (a == 18) {
                this.f15153b = ghVar.mo16821c();
            } else if (a == 24) {
                this.f15154c = Long.valueOf(ghVar.mo16824e());
            } else if (a == 32) {
                this.f15155d = Long.valueOf(ghVar.mo16824e());
            } else if (a == 40) {
                this.f15156e = Integer.valueOf(ghVar.mo16822d());
            } else if (!super.mo16844a(ghVar, a)) {
                return this;
            }
        }
    }
}
