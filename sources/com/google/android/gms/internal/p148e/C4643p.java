package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.p */
public final class C4643p extends C4625gk<C4643p> {

    /* renamed from: e */
    private static volatile C4643p[] f15127e;

    /* renamed from: a */
    public String f15128a;

    /* renamed from: b */
    public Boolean f15129b;

    /* renamed from: c */
    public Boolean f15130c;

    /* renamed from: d */
    public Integer f15131d;

    /* renamed from: a */
    public static C4643p[] m20138a() {
        if (f15127e == null) {
            synchronized (C4629go.f15075b) {
                if (f15127e == null) {
                    f15127e = new C4643p[0];
                }
            }
        }
        return f15127e;
    }

    public C4643p() {
        this.f15128a = null;
        this.f15129b = null;
        this.f15130c = null;
        this.f15131d = null;
        this.f15061L = null;
        this.f15077M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4643p)) {
            return false;
        }
        C4643p pVar = (C4643p) obj;
        if (this.f15128a == null) {
            if (pVar.f15128a != null) {
                return false;
            }
        } else if (!this.f15128a.equals(pVar.f15128a)) {
            return false;
        }
        if (this.f15129b == null) {
            if (pVar.f15129b != null) {
                return false;
            }
        } else if (!this.f15129b.equals(pVar.f15129b)) {
            return false;
        }
        if (this.f15130c == null) {
            if (pVar.f15130c != null) {
                return false;
            }
        } else if (!this.f15130c.equals(pVar.f15130c)) {
            return false;
        }
        if (this.f15131d == null) {
            if (pVar.f15131d != null) {
                return false;
            }
        } else if (!this.f15131d.equals(pVar.f15131d)) {
            return false;
        }
        if (this.f15061L == null || this.f15061L.mo16856b()) {
            return pVar.f15061L == null || pVar.f15061L.mo16856b();
        }
        return this.f15061L.equals(pVar.f15061L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((527 + getClass().getName().hashCode()) * 31) + (this.f15128a == null ? 0 : this.f15128a.hashCode())) * 31) + (this.f15129b == null ? 0 : this.f15129b.hashCode())) * 31) + (this.f15130c == null ? 0 : this.f15130c.hashCode())) * 31) + (this.f15131d == null ? 0 : this.f15131d.hashCode())) * 31;
        if (this.f15061L != null && !this.f15061L.mo16856b()) {
            i = this.f15061L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo16327a(C4623gi giVar) throws IOException {
        if (this.f15128a != null) {
            giVar.mo16837a(1, this.f15128a);
        }
        if (this.f15129b != null) {
            giVar.mo16838a(2, this.f15129b.booleanValue());
        }
        if (this.f15130c != null) {
            giVar.mo16838a(3, this.f15130c.booleanValue());
        }
        if (this.f15131d != null) {
            giVar.mo16833a(4, this.f15131d.intValue());
        }
        super.mo16327a(giVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16328b() {
        int b = super.mo16328b();
        if (this.f15128a != null) {
            b += C4623gi.m20052b(1, this.f15128a);
        }
        if (this.f15129b != null) {
            this.f15129b.booleanValue();
            b += C4623gi.m20049b(2) + 1;
        }
        if (this.f15130c != null) {
            this.f15130c.booleanValue();
            b += C4623gi.m20049b(3) + 1;
        }
        return this.f15131d != null ? b + C4623gi.m20050b(4, this.f15131d.intValue()) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C4631gq mo16326a(C4622gh ghVar) throws IOException {
        while (true) {
            int a = ghVar.mo16811a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f15128a = ghVar.mo16821c();
            } else if (a == 16) {
                this.f15129b = Boolean.valueOf(ghVar.mo16818b());
            } else if (a == 24) {
                this.f15130c = Boolean.valueOf(ghVar.mo16818b());
            } else if (a == 32) {
                this.f15131d = Integer.valueOf(ghVar.mo16822d());
            } else if (!super.mo16844a(ghVar, a)) {
                return this;
            }
        }
    }
}
