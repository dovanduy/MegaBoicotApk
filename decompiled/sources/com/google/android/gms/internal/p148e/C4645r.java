package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.r */
public final class C4645r extends C4625gk<C4645r> {

    /* renamed from: c */
    private static volatile C4645r[] f15140c;

    /* renamed from: a */
    public String f15141a;

    /* renamed from: b */
    public String f15142b;

    /* renamed from: a */
    public static C4645r[] m20145a() {
        if (f15140c == null) {
            synchronized (C4629go.f15075b) {
                if (f15140c == null) {
                    f15140c = new C4645r[0];
                }
            }
        }
        return f15140c;
    }

    public C4645r() {
        this.f15141a = null;
        this.f15142b = null;
        this.f15061L = null;
        this.f15077M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4645r)) {
            return false;
        }
        C4645r rVar = (C4645r) obj;
        if (this.f15141a == null) {
            if (rVar.f15141a != null) {
                return false;
            }
        } else if (!this.f15141a.equals(rVar.f15141a)) {
            return false;
        }
        if (this.f15142b == null) {
            if (rVar.f15142b != null) {
                return false;
            }
        } else if (!this.f15142b.equals(rVar.f15142b)) {
            return false;
        }
        if (this.f15061L == null || this.f15061L.mo16856b()) {
            return rVar.f15061L == null || rVar.f15061L.mo16856b();
        }
        return this.f15061L.equals(rVar.f15061L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((527 + getClass().getName().hashCode()) * 31) + (this.f15141a == null ? 0 : this.f15141a.hashCode())) * 31) + (this.f15142b == null ? 0 : this.f15142b.hashCode())) * 31;
        if (this.f15061L != null && !this.f15061L.mo16856b()) {
            i = this.f15061L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo16327a(C4623gi giVar) throws IOException {
        if (this.f15141a != null) {
            giVar.mo16837a(1, this.f15141a);
        }
        if (this.f15142b != null) {
            giVar.mo16837a(2, this.f15142b);
        }
        super.mo16327a(giVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16328b() {
        int b = super.mo16328b();
        if (this.f15141a != null) {
            b += C4623gi.m20052b(1, this.f15141a);
        }
        return this.f15142b != null ? b + C4623gi.m20052b(2, this.f15142b) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C4631gq mo16326a(C4622gh ghVar) throws IOException {
        while (true) {
            int a = ghVar.mo16811a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f15141a = ghVar.mo16821c();
            } else if (a == 18) {
                this.f15142b = ghVar.mo16821c();
            } else if (!super.mo16844a(ghVar, a)) {
                return this;
            }
        }
    }
}
