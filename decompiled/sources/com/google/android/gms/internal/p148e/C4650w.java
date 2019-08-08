package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.w */
public final class C4650w extends C4625gk<C4650w> {

    /* renamed from: a */
    public C4651x[] f15163a;

    public C4650w() {
        this.f15163a = C4651x.m20168a();
        this.f15061L = null;
        this.f15077M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4650w)) {
            return false;
        }
        C4650w wVar = (C4650w) obj;
        if (!C4629go.m20098a((Object[]) this.f15163a, (Object[]) wVar.f15163a)) {
            return false;
        }
        if (this.f15061L == null || this.f15061L.mo16856b()) {
            return wVar.f15061L == null || wVar.f15061L.mo16856b();
        }
        return this.f15061L.equals(wVar.f15061L);
    }

    public final int hashCode() {
        return ((((527 + getClass().getName().hashCode()) * 31) + C4629go.m20094a((Object[]) this.f15163a)) * 31) + ((this.f15061L == null || this.f15061L.mo16856b()) ? 0 : this.f15061L.hashCode());
    }

    /* renamed from: a */
    public final void mo16327a(C4623gi giVar) throws IOException {
        if (this.f15163a != null && this.f15163a.length > 0) {
            for (C4651x xVar : this.f15163a) {
                if (xVar != null) {
                    giVar.mo16836a(1, (C4631gq) xVar);
                }
            }
        }
        super.mo16327a(giVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16328b() {
        int b = super.mo16328b();
        if (this.f15163a != null && this.f15163a.length > 0) {
            for (C4651x xVar : this.f15163a) {
                if (xVar != null) {
                    b += C4623gi.m20051b(1, (C4631gq) xVar);
                }
            }
        }
        return b;
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
                int length = this.f15163a == null ? 0 : this.f15163a.length;
                C4651x[] xVarArr = new C4651x[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f15163a, 0, xVarArr, 0, length);
                }
                while (length < xVarArr.length - 1) {
                    xVarArr[length] = new C4651x();
                    ghVar.mo16814a((C4631gq) xVarArr[length]);
                    ghVar.mo16811a();
                    length++;
                }
                xVarArr[length] = new C4651x();
                ghVar.mo16814a((C4631gq) xVarArr[length]);
                this.f15163a = xVarArr;
            } else if (!super.mo16844a(ghVar, a)) {
                return this;
            }
        }
    }
}
