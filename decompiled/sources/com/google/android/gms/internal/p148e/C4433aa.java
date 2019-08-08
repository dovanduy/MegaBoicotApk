package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.aa */
public final class C4433aa extends C4625gk<C4433aa> {

    /* renamed from: f */
    private static volatile C4433aa[] f14629f;

    /* renamed from: a */
    public Long f14630a;

    /* renamed from: b */
    public String f14631b;

    /* renamed from: c */
    public String f14632c;

    /* renamed from: d */
    public Long f14633d;

    /* renamed from: e */
    public Double f14634e;

    /* renamed from: g */
    private Float f14635g;

    /* renamed from: a */
    public static C4433aa[] m18863a() {
        if (f14629f == null) {
            synchronized (C4629go.f15075b) {
                if (f14629f == null) {
                    f14629f = new C4433aa[0];
                }
            }
        }
        return f14629f;
    }

    public C4433aa() {
        this.f14630a = null;
        this.f14631b = null;
        this.f14632c = null;
        this.f14633d = null;
        this.f14635g = null;
        this.f14634e = null;
        this.f15061L = null;
        this.f15077M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4433aa)) {
            return false;
        }
        C4433aa aaVar = (C4433aa) obj;
        if (this.f14630a == null) {
            if (aaVar.f14630a != null) {
                return false;
            }
        } else if (!this.f14630a.equals(aaVar.f14630a)) {
            return false;
        }
        if (this.f14631b == null) {
            if (aaVar.f14631b != null) {
                return false;
            }
        } else if (!this.f14631b.equals(aaVar.f14631b)) {
            return false;
        }
        if (this.f14632c == null) {
            if (aaVar.f14632c != null) {
                return false;
            }
        } else if (!this.f14632c.equals(aaVar.f14632c)) {
            return false;
        }
        if (this.f14633d == null) {
            if (aaVar.f14633d != null) {
                return false;
            }
        } else if (!this.f14633d.equals(aaVar.f14633d)) {
            return false;
        }
        if (this.f14635g == null) {
            if (aaVar.f14635g != null) {
                return false;
            }
        } else if (!this.f14635g.equals(aaVar.f14635g)) {
            return false;
        }
        if (this.f14634e == null) {
            if (aaVar.f14634e != null) {
                return false;
            }
        } else if (!this.f14634e.equals(aaVar.f14634e)) {
            return false;
        }
        if (this.f15061L == null || this.f15061L.mo16856b()) {
            return aaVar.f15061L == null || aaVar.f15061L.mo16856b();
        }
        return this.f15061L.equals(aaVar.f15061L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((527 + getClass().getName().hashCode()) * 31) + (this.f14630a == null ? 0 : this.f14630a.hashCode())) * 31) + (this.f14631b == null ? 0 : this.f14631b.hashCode())) * 31) + (this.f14632c == null ? 0 : this.f14632c.hashCode())) * 31) + (this.f14633d == null ? 0 : this.f14633d.hashCode())) * 31) + (this.f14635g == null ? 0 : this.f14635g.hashCode())) * 31) + (this.f14634e == null ? 0 : this.f14634e.hashCode())) * 31;
        if (this.f15061L != null && !this.f15061L.mo16856b()) {
            i = this.f15061L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo16327a(C4623gi giVar) throws IOException {
        if (this.f14630a != null) {
            giVar.mo16840b(1, this.f14630a.longValue());
        }
        if (this.f14631b != null) {
            giVar.mo16837a(2, this.f14631b);
        }
        if (this.f14632c != null) {
            giVar.mo16837a(3, this.f14632c);
        }
        if (this.f14633d != null) {
            giVar.mo16840b(4, this.f14633d.longValue());
        }
        if (this.f14635g != null) {
            giVar.mo16832a(5, this.f14635g.floatValue());
        }
        if (this.f14634e != null) {
            giVar.mo16831a(6, this.f14634e.doubleValue());
        }
        super.mo16327a(giVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16328b() {
        int b = super.mo16328b();
        if (this.f14630a != null) {
            b += C4623gi.m20055c(1, this.f14630a.longValue());
        }
        if (this.f14631b != null) {
            b += C4623gi.m20052b(2, this.f14631b);
        }
        if (this.f14632c != null) {
            b += C4623gi.m20052b(3, this.f14632c);
        }
        if (this.f14633d != null) {
            b += C4623gi.m20055c(4, this.f14633d.longValue());
        }
        if (this.f14635g != null) {
            this.f14635g.floatValue();
            b += C4623gi.m20049b(5) + 4;
        }
        if (this.f14634e == null) {
            return b;
        }
        this.f14634e.doubleValue();
        return b + C4623gi.m20049b(6) + 8;
    }

    /* renamed from: a */
    public final /* synthetic */ C4631gq mo16326a(C4622gh ghVar) throws IOException {
        while (true) {
            int a = ghVar.mo16811a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f14630a = Long.valueOf(ghVar.mo16824e());
            } else if (a == 18) {
                this.f14631b = ghVar.mo16821c();
            } else if (a == 26) {
                this.f14632c = ghVar.mo16821c();
            } else if (a == 32) {
                this.f14633d = Long.valueOf(ghVar.mo16824e());
            } else if (a == 45) {
                this.f14635g = Float.valueOf(Float.intBitsToFloat(ghVar.mo16826f()));
            } else if (a == 49) {
                this.f14634e = Double.valueOf(Double.longBitsToDouble(ghVar.mo16827g()));
            } else if (!super.mo16844a(ghVar, a)) {
                return this;
            }
        }
    }
}
