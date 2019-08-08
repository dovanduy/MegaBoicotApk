package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.t */
public final class C4647t extends C4625gk<C4647t> {

    /* renamed from: c */
    private static volatile C4647t[] f15148c;

    /* renamed from: a */
    public Integer f15149a;

    /* renamed from: b */
    public Long f15150b;

    /* renamed from: a */
    public static C4647t[] m20153a() {
        if (f15148c == null) {
            synchronized (C4629go.f15075b) {
                if (f15148c == null) {
                    f15148c = new C4647t[0];
                }
            }
        }
        return f15148c;
    }

    public C4647t() {
        this.f15149a = null;
        this.f15150b = null;
        this.f15061L = null;
        this.f15077M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4647t)) {
            return false;
        }
        C4647t tVar = (C4647t) obj;
        if (this.f15149a == null) {
            if (tVar.f15149a != null) {
                return false;
            }
        } else if (!this.f15149a.equals(tVar.f15149a)) {
            return false;
        }
        if (this.f15150b == null) {
            if (tVar.f15150b != null) {
                return false;
            }
        } else if (!this.f15150b.equals(tVar.f15150b)) {
            return false;
        }
        if (this.f15061L == null || this.f15061L.mo16856b()) {
            return tVar.f15061L == null || tVar.f15061L.mo16856b();
        }
        return this.f15061L.equals(tVar.f15061L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((527 + getClass().getName().hashCode()) * 31) + (this.f15149a == null ? 0 : this.f15149a.hashCode())) * 31) + (this.f15150b == null ? 0 : this.f15150b.hashCode())) * 31;
        if (this.f15061L != null && !this.f15061L.mo16856b()) {
            i = this.f15061L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo16327a(C4623gi giVar) throws IOException {
        if (this.f15149a != null) {
            giVar.mo16833a(1, this.f15149a.intValue());
        }
        if (this.f15150b != null) {
            giVar.mo16840b(2, this.f15150b.longValue());
        }
        super.mo16327a(giVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16328b() {
        int b = super.mo16328b();
        if (this.f15149a != null) {
            b += C4623gi.m20050b(1, this.f15149a.intValue());
        }
        return this.f15150b != null ? b + C4623gi.m20055c(2, this.f15150b.longValue()) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C4631gq mo16326a(C4622gh ghVar) throws IOException {
        while (true) {
            int a = ghVar.mo16811a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f15149a = Integer.valueOf(ghVar.mo16822d());
            } else if (a == 16) {
                this.f15150b = Long.valueOf(ghVar.mo16824e());
            } else if (!super.mo16844a(ghVar, a)) {
                return this;
            }
        }
    }
}
