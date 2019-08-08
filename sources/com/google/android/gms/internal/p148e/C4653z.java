package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.z */
public final class C4653z extends C4625gk<C4653z> {

    /* renamed from: c */
    private static volatile C4653z[] f15210c;

    /* renamed from: a */
    public Integer f15211a;

    /* renamed from: b */
    public long[] f15212b;

    /* renamed from: a */
    public static C4653z[] m20175a() {
        if (f15210c == null) {
            synchronized (C4629go.f15075b) {
                if (f15210c == null) {
                    f15210c = new C4653z[0];
                }
            }
        }
        return f15210c;
    }

    public C4653z() {
        this.f15211a = null;
        this.f15212b = C4634gt.f15081b;
        this.f15061L = null;
        this.f15077M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4653z)) {
            return false;
        }
        C4653z zVar = (C4653z) obj;
        if (this.f15211a == null) {
            if (zVar.f15211a != null) {
                return false;
            }
        } else if (!this.f15211a.equals(zVar.f15211a)) {
            return false;
        }
        if (!C4629go.m20097a(this.f15212b, zVar.f15212b)) {
            return false;
        }
        if (this.f15061L == null || this.f15061L.mo16856b()) {
            return zVar.f15061L == null || zVar.f15061L.mo16856b();
        }
        return this.f15061L.equals(zVar.f15061L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((527 + getClass().getName().hashCode()) * 31) + (this.f15211a == null ? 0 : this.f15211a.hashCode())) * 31) + C4629go.m20093a(this.f15212b)) * 31;
        if (this.f15061L != null && !this.f15061L.mo16856b()) {
            i = this.f15061L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo16327a(C4623gi giVar) throws IOException {
        if (this.f15211a != null) {
            giVar.mo16833a(1, this.f15211a.intValue());
        }
        if (this.f15212b != null && this.f15212b.length > 0) {
            for (long b : this.f15212b) {
                giVar.mo16840b(2, b);
            }
        }
        super.mo16327a(giVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16328b() {
        int b = super.mo16328b();
        if (this.f15211a != null) {
            b += C4623gi.m20050b(1, this.f15211a.intValue());
        }
        if (this.f15212b == null || this.f15212b.length <= 0) {
            return b;
        }
        int i = 0;
        for (long a : this.f15212b) {
            i += C4623gi.m20043a(a);
        }
        return b + i + (1 * this.f15212b.length);
    }

    /* renamed from: a */
    public final /* synthetic */ C4631gq mo16326a(C4622gh ghVar) throws IOException {
        while (true) {
            int a = ghVar.mo16811a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f15211a = Integer.valueOf(ghVar.mo16822d());
            } else if (a == 16) {
                int a2 = C4634gt.m20112a(ghVar, 16);
                int length = this.f15212b == null ? 0 : this.f15212b.length;
                long[] jArr = new long[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f15212b, 0, jArr, 0, length);
                }
                while (length < jArr.length - 1) {
                    jArr[length] = ghVar.mo16824e();
                    ghVar.mo16811a();
                    length++;
                }
                jArr[length] = ghVar.mo16824e();
                this.f15212b = jArr;
            } else if (a == 18) {
                int c = ghVar.mo16820c(ghVar.mo16822d());
                int i = ghVar.mo16829i();
                int i2 = 0;
                while (ghVar.mo16828h() > 0) {
                    ghVar.mo16824e();
                    i2++;
                }
                ghVar.mo16825e(i);
                int length2 = this.f15212b == null ? 0 : this.f15212b.length;
                long[] jArr2 = new long[(i2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f15212b, 0, jArr2, 0, length2);
                }
                while (length2 < jArr2.length) {
                    jArr2[length2] = ghVar.mo16824e();
                    length2++;
                }
                this.f15212b = jArr2;
                ghVar.mo16823d(c);
            } else if (!super.mo16844a(ghVar, a)) {
                return this;
            }
        }
    }
}
