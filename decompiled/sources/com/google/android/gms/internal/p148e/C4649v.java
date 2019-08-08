package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.v */
public final class C4649v extends C4625gk<C4649v> {

    /* renamed from: e */
    private static volatile C4649v[] f15157e;

    /* renamed from: a */
    public String f15158a;

    /* renamed from: b */
    public String f15159b;

    /* renamed from: c */
    public Long f15160c;

    /* renamed from: d */
    public Double f15161d;

    /* renamed from: f */
    private Float f15162f;

    /* renamed from: a */
    public static C4649v[] m20161a() {
        if (f15157e == null) {
            synchronized (C4629go.f15075b) {
                if (f15157e == null) {
                    f15157e = new C4649v[0];
                }
            }
        }
        return f15157e;
    }

    public C4649v() {
        this.f15158a = null;
        this.f15159b = null;
        this.f15160c = null;
        this.f15162f = null;
        this.f15161d = null;
        this.f15061L = null;
        this.f15077M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4649v)) {
            return false;
        }
        C4649v vVar = (C4649v) obj;
        if (this.f15158a == null) {
            if (vVar.f15158a != null) {
                return false;
            }
        } else if (!this.f15158a.equals(vVar.f15158a)) {
            return false;
        }
        if (this.f15159b == null) {
            if (vVar.f15159b != null) {
                return false;
            }
        } else if (!this.f15159b.equals(vVar.f15159b)) {
            return false;
        }
        if (this.f15160c == null) {
            if (vVar.f15160c != null) {
                return false;
            }
        } else if (!this.f15160c.equals(vVar.f15160c)) {
            return false;
        }
        if (this.f15162f == null) {
            if (vVar.f15162f != null) {
                return false;
            }
        } else if (!this.f15162f.equals(vVar.f15162f)) {
            return false;
        }
        if (this.f15161d == null) {
            if (vVar.f15161d != null) {
                return false;
            }
        } else if (!this.f15161d.equals(vVar.f15161d)) {
            return false;
        }
        if (this.f15061L == null || this.f15061L.mo16856b()) {
            return vVar.f15061L == null || vVar.f15061L.mo16856b();
        }
        return this.f15061L.equals(vVar.f15061L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((527 + getClass().getName().hashCode()) * 31) + (this.f15158a == null ? 0 : this.f15158a.hashCode())) * 31) + (this.f15159b == null ? 0 : this.f15159b.hashCode())) * 31) + (this.f15160c == null ? 0 : this.f15160c.hashCode())) * 31) + (this.f15162f == null ? 0 : this.f15162f.hashCode())) * 31) + (this.f15161d == null ? 0 : this.f15161d.hashCode())) * 31;
        if (this.f15061L != null && !this.f15061L.mo16856b()) {
            i = this.f15061L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo16327a(C4623gi giVar) throws IOException {
        if (this.f15158a != null) {
            giVar.mo16837a(1, this.f15158a);
        }
        if (this.f15159b != null) {
            giVar.mo16837a(2, this.f15159b);
        }
        if (this.f15160c != null) {
            giVar.mo16840b(3, this.f15160c.longValue());
        }
        if (this.f15162f != null) {
            giVar.mo16832a(4, this.f15162f.floatValue());
        }
        if (this.f15161d != null) {
            giVar.mo16831a(5, this.f15161d.doubleValue());
        }
        super.mo16327a(giVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16328b() {
        int b = super.mo16328b();
        if (this.f15158a != null) {
            b += C4623gi.m20052b(1, this.f15158a);
        }
        if (this.f15159b != null) {
            b += C4623gi.m20052b(2, this.f15159b);
        }
        if (this.f15160c != null) {
            b += C4623gi.m20055c(3, this.f15160c.longValue());
        }
        if (this.f15162f != null) {
            this.f15162f.floatValue();
            b += C4623gi.m20049b(4) + 4;
        }
        if (this.f15161d == null) {
            return b;
        }
        this.f15161d.doubleValue();
        return b + C4623gi.m20049b(5) + 8;
    }

    /* renamed from: a */
    public final /* synthetic */ C4631gq mo16326a(C4622gh ghVar) throws IOException {
        while (true) {
            int a = ghVar.mo16811a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f15158a = ghVar.mo16821c();
            } else if (a == 18) {
                this.f15159b = ghVar.mo16821c();
            } else if (a == 24) {
                this.f15160c = Long.valueOf(ghVar.mo16824e());
            } else if (a == 37) {
                this.f15162f = Float.valueOf(Float.intBitsToFloat(ghVar.mo16826f()));
            } else if (a == 41) {
                this.f15161d = Double.valueOf(Double.longBitsToDouble(ghVar.mo16827g()));
            } else if (!super.mo16844a(ghVar, a)) {
                return this;
            }
        }
    }
}
