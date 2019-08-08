package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.k */
public final class C4638k extends C4625gk<C4638k> {

    /* renamed from: g */
    private static volatile C4638k[] f15099g;

    /* renamed from: a */
    public Integer f15100a;

    /* renamed from: b */
    public String f15101b;

    /* renamed from: c */
    public C4639l[] f15102c;

    /* renamed from: d */
    public C4640m f15103d;

    /* renamed from: e */
    public Boolean f15104e;

    /* renamed from: f */
    public Boolean f15105f;

    /* renamed from: h */
    private Boolean f15106h;

    /* renamed from: a */
    public static C4638k[] m20118a() {
        if (f15099g == null) {
            synchronized (C4629go.f15075b) {
                if (f15099g == null) {
                    f15099g = new C4638k[0];
                }
            }
        }
        return f15099g;
    }

    public C4638k() {
        this.f15100a = null;
        this.f15101b = null;
        this.f15102c = C4639l.m20122a();
        this.f15106h = null;
        this.f15103d = null;
        this.f15104e = null;
        this.f15105f = null;
        this.f15061L = null;
        this.f15077M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4638k)) {
            return false;
        }
        C4638k kVar = (C4638k) obj;
        if (this.f15100a == null) {
            if (kVar.f15100a != null) {
                return false;
            }
        } else if (!this.f15100a.equals(kVar.f15100a)) {
            return false;
        }
        if (this.f15101b == null) {
            if (kVar.f15101b != null) {
                return false;
            }
        } else if (!this.f15101b.equals(kVar.f15101b)) {
            return false;
        }
        if (!C4629go.m20098a((Object[]) this.f15102c, (Object[]) kVar.f15102c)) {
            return false;
        }
        if (this.f15106h == null) {
            if (kVar.f15106h != null) {
                return false;
            }
        } else if (!this.f15106h.equals(kVar.f15106h)) {
            return false;
        }
        if (this.f15103d == null) {
            if (kVar.f15103d != null) {
                return false;
            }
        } else if (!this.f15103d.equals(kVar.f15103d)) {
            return false;
        }
        if (this.f15104e == null) {
            if (kVar.f15104e != null) {
                return false;
            }
        } else if (!this.f15104e.equals(kVar.f15104e)) {
            return false;
        }
        if (this.f15105f == null) {
            if (kVar.f15105f != null) {
                return false;
            }
        } else if (!this.f15105f.equals(kVar.f15105f)) {
            return false;
        }
        if (this.f15061L == null || this.f15061L.mo16856b()) {
            return kVar.f15061L == null || kVar.f15061L.mo16856b();
        }
        return this.f15061L.equals(kVar.f15061L);
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = ((((((((527 + getClass().getName().hashCode()) * 31) + (this.f15100a == null ? 0 : this.f15100a.hashCode())) * 31) + (this.f15101b == null ? 0 : this.f15101b.hashCode())) * 31) + C4629go.m20094a((Object[]) this.f15102c)) * 31) + (this.f15106h == null ? 0 : this.f15106h.hashCode());
        C4640m mVar = this.f15103d;
        int i3 = hashCode * 31;
        if (mVar == null) {
            i = 0;
        } else {
            i = mVar.hashCode();
        }
        int hashCode2 = (((((i3 + i) * 31) + (this.f15104e == null ? 0 : this.f15104e.hashCode())) * 31) + (this.f15105f == null ? 0 : this.f15105f.hashCode())) * 31;
        if (this.f15061L != null && !this.f15061L.mo16856b()) {
            i2 = this.f15061L.hashCode();
        }
        return hashCode2 + i2;
    }

    /* renamed from: a */
    public final void mo16327a(C4623gi giVar) throws IOException {
        if (this.f15100a != null) {
            giVar.mo16833a(1, this.f15100a.intValue());
        }
        if (this.f15101b != null) {
            giVar.mo16837a(2, this.f15101b);
        }
        if (this.f15102c != null && this.f15102c.length > 0) {
            for (C4639l lVar : this.f15102c) {
                if (lVar != null) {
                    giVar.mo16836a(3, (C4631gq) lVar);
                }
            }
        }
        if (this.f15106h != null) {
            giVar.mo16838a(4, this.f15106h.booleanValue());
        }
        if (this.f15103d != null) {
            giVar.mo16836a(5, (C4631gq) this.f15103d);
        }
        if (this.f15104e != null) {
            giVar.mo16838a(6, this.f15104e.booleanValue());
        }
        if (this.f15105f != null) {
            giVar.mo16838a(7, this.f15105f.booleanValue());
        }
        super.mo16327a(giVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16328b() {
        int b = super.mo16328b();
        if (this.f15100a != null) {
            b += C4623gi.m20050b(1, this.f15100a.intValue());
        }
        if (this.f15101b != null) {
            b += C4623gi.m20052b(2, this.f15101b);
        }
        if (this.f15102c != null && this.f15102c.length > 0) {
            for (C4639l lVar : this.f15102c) {
                if (lVar != null) {
                    b += C4623gi.m20051b(3, (C4631gq) lVar);
                }
            }
        }
        if (this.f15106h != null) {
            this.f15106h.booleanValue();
            b += C4623gi.m20049b(4) + 1;
        }
        if (this.f15103d != null) {
            b += C4623gi.m20051b(5, (C4631gq) this.f15103d);
        }
        if (this.f15104e != null) {
            this.f15104e.booleanValue();
            b += C4623gi.m20049b(6) + 1;
        }
        if (this.f15105f == null) {
            return b;
        }
        this.f15105f.booleanValue();
        return b + C4623gi.m20049b(7) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C4631gq mo16326a(C4622gh ghVar) throws IOException {
        while (true) {
            int a = ghVar.mo16811a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f15100a = Integer.valueOf(ghVar.mo16822d());
            } else if (a == 18) {
                this.f15101b = ghVar.mo16821c();
            } else if (a == 26) {
                int a2 = C4634gt.m20112a(ghVar, 26);
                int length = this.f15102c == null ? 0 : this.f15102c.length;
                C4639l[] lVarArr = new C4639l[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f15102c, 0, lVarArr, 0, length);
                }
                while (length < lVarArr.length - 1) {
                    lVarArr[length] = new C4639l();
                    ghVar.mo16814a((C4631gq) lVarArr[length]);
                    ghVar.mo16811a();
                    length++;
                }
                lVarArr[length] = new C4639l();
                ghVar.mo16814a((C4631gq) lVarArr[length]);
                this.f15102c = lVarArr;
            } else if (a == 32) {
                this.f15106h = Boolean.valueOf(ghVar.mo16818b());
            } else if (a == 42) {
                if (this.f15103d == null) {
                    this.f15103d = new C4640m();
                }
                ghVar.mo16814a((C4631gq) this.f15103d);
            } else if (a == 48) {
                this.f15104e = Boolean.valueOf(ghVar.mo16818b());
            } else if (a == 56) {
                this.f15105f = Boolean.valueOf(ghVar.mo16818b());
            } else if (!super.mo16844a(ghVar, a)) {
                return this;
            }
        }
    }
}
