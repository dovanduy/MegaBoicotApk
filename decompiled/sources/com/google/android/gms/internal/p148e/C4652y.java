package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.y */
public final class C4652y extends C4625gk<C4652y> {

    /* renamed from: a */
    public long[] f15206a;

    /* renamed from: b */
    public long[] f15207b;

    /* renamed from: c */
    public C4647t[] f15208c;

    /* renamed from: d */
    public C4653z[] f15209d;

    public C4652y() {
        this.f15206a = C4634gt.f15081b;
        this.f15207b = C4634gt.f15081b;
        this.f15208c = C4647t.m20153a();
        this.f15209d = C4653z.m20175a();
        this.f15061L = null;
        this.f15077M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4652y)) {
            return false;
        }
        C4652y yVar = (C4652y) obj;
        if (!C4629go.m20097a(this.f15206a, yVar.f15206a) || !C4629go.m20097a(this.f15207b, yVar.f15207b) || !C4629go.m20098a((Object[]) this.f15208c, (Object[]) yVar.f15208c) || !C4629go.m20098a((Object[]) this.f15209d, (Object[]) yVar.f15209d)) {
            return false;
        }
        if (this.f15061L == null || this.f15061L.mo16856b()) {
            return yVar.f15061L == null || yVar.f15061L.mo16856b();
        }
        return this.f15061L.equals(yVar.f15061L);
    }

    public final int hashCode() {
        return ((((((((((527 + getClass().getName().hashCode()) * 31) + C4629go.m20093a(this.f15206a)) * 31) + C4629go.m20093a(this.f15207b)) * 31) + C4629go.m20094a((Object[]) this.f15208c)) * 31) + C4629go.m20094a((Object[]) this.f15209d)) * 31) + ((this.f15061L == null || this.f15061L.mo16856b()) ? 0 : this.f15061L.hashCode());
    }

    /* renamed from: a */
    public final void mo16327a(C4623gi giVar) throws IOException {
        if (this.f15206a != null && this.f15206a.length > 0) {
            for (long a : this.f15206a) {
                giVar.mo16834a(1, a);
            }
        }
        if (this.f15207b != null && this.f15207b.length > 0) {
            for (long a2 : this.f15207b) {
                giVar.mo16834a(2, a2);
            }
        }
        if (this.f15208c != null && this.f15208c.length > 0) {
            for (C4647t tVar : this.f15208c) {
                if (tVar != null) {
                    giVar.mo16836a(3, (C4631gq) tVar);
                }
            }
        }
        if (this.f15209d != null && this.f15209d.length > 0) {
            for (C4653z zVar : this.f15209d) {
                if (zVar != null) {
                    giVar.mo16836a(4, (C4631gq) zVar);
                }
            }
        }
        super.mo16327a(giVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16328b() {
        int b = super.mo16328b();
        if (this.f15206a != null && this.f15206a.length > 0) {
            int i = 0;
            for (long a : this.f15206a) {
                i += C4623gi.m20043a(a);
            }
            b = b + i + (this.f15206a.length * 1);
        }
        if (this.f15207b != null && this.f15207b.length > 0) {
            int i2 = 0;
            for (long a2 : this.f15207b) {
                i2 += C4623gi.m20043a(a2);
            }
            b = b + i2 + (1 * this.f15207b.length);
        }
        if (this.f15208c != null && this.f15208c.length > 0) {
            int i3 = b;
            for (C4647t tVar : this.f15208c) {
                if (tVar != null) {
                    i3 += C4623gi.m20051b(3, (C4631gq) tVar);
                }
            }
            b = i3;
        }
        if (this.f15209d != null && this.f15209d.length > 0) {
            for (C4653z zVar : this.f15209d) {
                if (zVar != null) {
                    b += C4623gi.m20051b(4, (C4631gq) zVar);
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
            if (a == 8) {
                int a2 = C4634gt.m20112a(ghVar, 8);
                int length = this.f15206a == null ? 0 : this.f15206a.length;
                long[] jArr = new long[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f15206a, 0, jArr, 0, length);
                }
                while (length < jArr.length - 1) {
                    jArr[length] = ghVar.mo16824e();
                    ghVar.mo16811a();
                    length++;
                }
                jArr[length] = ghVar.mo16824e();
                this.f15206a = jArr;
            } else if (a == 10) {
                int c = ghVar.mo16820c(ghVar.mo16822d());
                int i = ghVar.mo16829i();
                int i2 = 0;
                while (ghVar.mo16828h() > 0) {
                    ghVar.mo16824e();
                    i2++;
                }
                ghVar.mo16825e(i);
                int length2 = this.f15206a == null ? 0 : this.f15206a.length;
                long[] jArr2 = new long[(i2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f15206a, 0, jArr2, 0, length2);
                }
                while (length2 < jArr2.length) {
                    jArr2[length2] = ghVar.mo16824e();
                    length2++;
                }
                this.f15206a = jArr2;
                ghVar.mo16823d(c);
            } else if (a == 16) {
                int a3 = C4634gt.m20112a(ghVar, 16);
                int length3 = this.f15207b == null ? 0 : this.f15207b.length;
                long[] jArr3 = new long[(a3 + length3)];
                if (length3 != 0) {
                    System.arraycopy(this.f15207b, 0, jArr3, 0, length3);
                }
                while (length3 < jArr3.length - 1) {
                    jArr3[length3] = ghVar.mo16824e();
                    ghVar.mo16811a();
                    length3++;
                }
                jArr3[length3] = ghVar.mo16824e();
                this.f15207b = jArr3;
            } else if (a == 18) {
                int c2 = ghVar.mo16820c(ghVar.mo16822d());
                int i3 = ghVar.mo16829i();
                int i4 = 0;
                while (ghVar.mo16828h() > 0) {
                    ghVar.mo16824e();
                    i4++;
                }
                ghVar.mo16825e(i3);
                int length4 = this.f15207b == null ? 0 : this.f15207b.length;
                long[] jArr4 = new long[(i4 + length4)];
                if (length4 != 0) {
                    System.arraycopy(this.f15207b, 0, jArr4, 0, length4);
                }
                while (length4 < jArr4.length) {
                    jArr4[length4] = ghVar.mo16824e();
                    length4++;
                }
                this.f15207b = jArr4;
                ghVar.mo16823d(c2);
            } else if (a == 26) {
                int a4 = C4634gt.m20112a(ghVar, 26);
                int length5 = this.f15208c == null ? 0 : this.f15208c.length;
                C4647t[] tVarArr = new C4647t[(a4 + length5)];
                if (length5 != 0) {
                    System.arraycopy(this.f15208c, 0, tVarArr, 0, length5);
                }
                while (length5 < tVarArr.length - 1) {
                    tVarArr[length5] = new C4647t();
                    ghVar.mo16814a((C4631gq) tVarArr[length5]);
                    ghVar.mo16811a();
                    length5++;
                }
                tVarArr[length5] = new C4647t();
                ghVar.mo16814a((C4631gq) tVarArr[length5]);
                this.f15208c = tVarArr;
            } else if (a == 34) {
                int a5 = C4634gt.m20112a(ghVar, 34);
                int length6 = this.f15209d == null ? 0 : this.f15209d.length;
                C4653z[] zVarArr = new C4653z[(a5 + length6)];
                if (length6 != 0) {
                    System.arraycopy(this.f15209d, 0, zVarArr, 0, length6);
                }
                while (length6 < zVarArr.length - 1) {
                    zVarArr[length6] = new C4653z();
                    ghVar.mo16814a((C4631gq) zVarArr[length6]);
                    ghVar.mo16811a();
                    length6++;
                }
                zVarArr[length6] = new C4653z();
                ghVar.mo16814a((C4631gq) zVarArr[length6]);
                this.f15209d = zVarArr;
            } else if (!super.mo16844a(ghVar, a)) {
                return this;
            }
        }
    }
}
