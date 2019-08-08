package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.q */
public final class C4644q extends C4625gk<C4644q> {

    /* renamed from: a */
    public Long f15132a;

    /* renamed from: b */
    public String f15133b;

    /* renamed from: c */
    public C4645r[] f15134c;

    /* renamed from: d */
    public C4643p[] f15135d;

    /* renamed from: e */
    public C4637j[] f15136e;

    /* renamed from: f */
    private Integer f15137f;

    /* renamed from: g */
    private String f15138g;

    /* renamed from: h */
    private Boolean f15139h;

    public C4644q() {
        this.f15132a = null;
        this.f15133b = null;
        this.f15137f = null;
        this.f15134c = C4645r.m20145a();
        this.f15135d = C4643p.m20138a();
        this.f15136e = C4637j.m20114a();
        this.f15138g = null;
        this.f15139h = null;
        this.f15061L = null;
        this.f15077M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4644q)) {
            return false;
        }
        C4644q qVar = (C4644q) obj;
        if (this.f15132a == null) {
            if (qVar.f15132a != null) {
                return false;
            }
        } else if (!this.f15132a.equals(qVar.f15132a)) {
            return false;
        }
        if (this.f15133b == null) {
            if (qVar.f15133b != null) {
                return false;
            }
        } else if (!this.f15133b.equals(qVar.f15133b)) {
            return false;
        }
        if (this.f15137f == null) {
            if (qVar.f15137f != null) {
                return false;
            }
        } else if (!this.f15137f.equals(qVar.f15137f)) {
            return false;
        }
        if (!C4629go.m20098a((Object[]) this.f15134c, (Object[]) qVar.f15134c) || !C4629go.m20098a((Object[]) this.f15135d, (Object[]) qVar.f15135d) || !C4629go.m20098a((Object[]) this.f15136e, (Object[]) qVar.f15136e)) {
            return false;
        }
        if (this.f15138g == null) {
            if (qVar.f15138g != null) {
                return false;
            }
        } else if (!this.f15138g.equals(qVar.f15138g)) {
            return false;
        }
        if (this.f15139h == null) {
            if (qVar.f15139h != null) {
                return false;
            }
        } else if (!this.f15139h.equals(qVar.f15139h)) {
            return false;
        }
        if (this.f15061L == null || this.f15061L.mo16856b()) {
            return qVar.f15061L == null || qVar.f15061L.mo16856b();
        }
        return this.f15061L.equals(qVar.f15061L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((((527 + getClass().getName().hashCode()) * 31) + (this.f15132a == null ? 0 : this.f15132a.hashCode())) * 31) + (this.f15133b == null ? 0 : this.f15133b.hashCode())) * 31) + (this.f15137f == null ? 0 : this.f15137f.hashCode())) * 31) + C4629go.m20094a((Object[]) this.f15134c)) * 31) + C4629go.m20094a((Object[]) this.f15135d)) * 31) + C4629go.m20094a((Object[]) this.f15136e)) * 31) + (this.f15138g == null ? 0 : this.f15138g.hashCode())) * 31) + (this.f15139h == null ? 0 : this.f15139h.hashCode())) * 31;
        if (this.f15061L != null && !this.f15061L.mo16856b()) {
            i = this.f15061L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo16327a(C4623gi giVar) throws IOException {
        if (this.f15132a != null) {
            giVar.mo16840b(1, this.f15132a.longValue());
        }
        if (this.f15133b != null) {
            giVar.mo16837a(2, this.f15133b);
        }
        if (this.f15137f != null) {
            giVar.mo16833a(3, this.f15137f.intValue());
        }
        if (this.f15134c != null && this.f15134c.length > 0) {
            for (C4645r rVar : this.f15134c) {
                if (rVar != null) {
                    giVar.mo16836a(4, (C4631gq) rVar);
                }
            }
        }
        if (this.f15135d != null && this.f15135d.length > 0) {
            for (C4643p pVar : this.f15135d) {
                if (pVar != null) {
                    giVar.mo16836a(5, (C4631gq) pVar);
                }
            }
        }
        if (this.f15136e != null && this.f15136e.length > 0) {
            for (C4637j jVar : this.f15136e) {
                if (jVar != null) {
                    giVar.mo16836a(6, (C4631gq) jVar);
                }
            }
        }
        if (this.f15138g != null) {
            giVar.mo16837a(7, this.f15138g);
        }
        if (this.f15139h != null) {
            giVar.mo16838a(8, this.f15139h.booleanValue());
        }
        super.mo16327a(giVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16328b() {
        int b = super.mo16328b();
        if (this.f15132a != null) {
            b += C4623gi.m20055c(1, this.f15132a.longValue());
        }
        if (this.f15133b != null) {
            b += C4623gi.m20052b(2, this.f15133b);
        }
        if (this.f15137f != null) {
            b += C4623gi.m20050b(3, this.f15137f.intValue());
        }
        if (this.f15134c != null && this.f15134c.length > 0) {
            int i = b;
            for (C4645r rVar : this.f15134c) {
                if (rVar != null) {
                    i += C4623gi.m20051b(4, (C4631gq) rVar);
                }
            }
            b = i;
        }
        if (this.f15135d != null && this.f15135d.length > 0) {
            int i2 = b;
            for (C4643p pVar : this.f15135d) {
                if (pVar != null) {
                    i2 += C4623gi.m20051b(5, (C4631gq) pVar);
                }
            }
            b = i2;
        }
        if (this.f15136e != null && this.f15136e.length > 0) {
            for (C4637j jVar : this.f15136e) {
                if (jVar != null) {
                    b += C4623gi.m20051b(6, (C4631gq) jVar);
                }
            }
        }
        if (this.f15138g != null) {
            b += C4623gi.m20052b(7, this.f15138g);
        }
        if (this.f15139h == null) {
            return b;
        }
        this.f15139h.booleanValue();
        return b + C4623gi.m20049b(8) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C4631gq mo16326a(C4622gh ghVar) throws IOException {
        while (true) {
            int a = ghVar.mo16811a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f15132a = Long.valueOf(ghVar.mo16824e());
            } else if (a == 18) {
                this.f15133b = ghVar.mo16821c();
            } else if (a == 24) {
                this.f15137f = Integer.valueOf(ghVar.mo16822d());
            } else if (a == 34) {
                int a2 = C4634gt.m20112a(ghVar, 34);
                int length = this.f15134c == null ? 0 : this.f15134c.length;
                C4645r[] rVarArr = new C4645r[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f15134c, 0, rVarArr, 0, length);
                }
                while (length < rVarArr.length - 1) {
                    rVarArr[length] = new C4645r();
                    ghVar.mo16814a((C4631gq) rVarArr[length]);
                    ghVar.mo16811a();
                    length++;
                }
                rVarArr[length] = new C4645r();
                ghVar.mo16814a((C4631gq) rVarArr[length]);
                this.f15134c = rVarArr;
            } else if (a == 42) {
                int a3 = C4634gt.m20112a(ghVar, 42);
                int length2 = this.f15135d == null ? 0 : this.f15135d.length;
                C4643p[] pVarArr = new C4643p[(a3 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f15135d, 0, pVarArr, 0, length2);
                }
                while (length2 < pVarArr.length - 1) {
                    pVarArr[length2] = new C4643p();
                    ghVar.mo16814a((C4631gq) pVarArr[length2]);
                    ghVar.mo16811a();
                    length2++;
                }
                pVarArr[length2] = new C4643p();
                ghVar.mo16814a((C4631gq) pVarArr[length2]);
                this.f15135d = pVarArr;
            } else if (a == 50) {
                int a4 = C4634gt.m20112a(ghVar, 50);
                int length3 = this.f15136e == null ? 0 : this.f15136e.length;
                C4637j[] jVarArr = new C4637j[(a4 + length3)];
                if (length3 != 0) {
                    System.arraycopy(this.f15136e, 0, jVarArr, 0, length3);
                }
                while (length3 < jVarArr.length - 1) {
                    jVarArr[length3] = new C4637j();
                    ghVar.mo16814a((C4631gq) jVarArr[length3]);
                    ghVar.mo16811a();
                    length3++;
                }
                jVarArr[length3] = new C4637j();
                ghVar.mo16814a((C4631gq) jVarArr[length3]);
                this.f15136e = jVarArr;
            } else if (a == 58) {
                this.f15138g = ghVar.mo16821c();
            } else if (a == 64) {
                this.f15139h = Boolean.valueOf(ghVar.mo16818b());
            } else if (!super.mo16844a(ghVar, a)) {
                return this;
            }
        }
    }
}
