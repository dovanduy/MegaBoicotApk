package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.o */
public final class C4642o extends C4625gk<C4642o> {

    /* renamed from: a */
    public Integer f15123a;

    /* renamed from: b */
    public String f15124b;

    /* renamed from: c */
    public Boolean f15125c;

    /* renamed from: d */
    public String[] f15126d;

    public C4642o() {
        this.f15123a = null;
        this.f15124b = null;
        this.f15125c = null;
        this.f15126d = C4634gt.f15082c;
        this.f15061L = null;
        this.f15077M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4642o)) {
            return false;
        }
        C4642o oVar = (C4642o) obj;
        if (this.f15123a == null) {
            if (oVar.f15123a != null) {
                return false;
            }
        } else if (!this.f15123a.equals(oVar.f15123a)) {
            return false;
        }
        if (this.f15124b == null) {
            if (oVar.f15124b != null) {
                return false;
            }
        } else if (!this.f15124b.equals(oVar.f15124b)) {
            return false;
        }
        if (this.f15125c == null) {
            if (oVar.f15125c != null) {
                return false;
            }
        } else if (!this.f15125c.equals(oVar.f15125c)) {
            return false;
        }
        if (!C4629go.m20098a((Object[]) this.f15126d, (Object[]) oVar.f15126d)) {
            return false;
        }
        if (this.f15061L == null || this.f15061L.mo16856b()) {
            return oVar.f15061L == null || oVar.f15061L.mo16856b();
        }
        return this.f15061L.equals(oVar.f15061L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((527 + getClass().getName().hashCode()) * 31) + (this.f15123a == null ? 0 : this.f15123a.intValue())) * 31) + (this.f15124b == null ? 0 : this.f15124b.hashCode())) * 31) + (this.f15125c == null ? 0 : this.f15125c.hashCode())) * 31) + C4629go.m20094a((Object[]) this.f15126d)) * 31;
        if (this.f15061L != null && !this.f15061L.mo16856b()) {
            i = this.f15061L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo16327a(C4623gi giVar) throws IOException {
        if (this.f15123a != null) {
            giVar.mo16833a(1, this.f15123a.intValue());
        }
        if (this.f15124b != null) {
            giVar.mo16837a(2, this.f15124b);
        }
        if (this.f15125c != null) {
            giVar.mo16838a(3, this.f15125c.booleanValue());
        }
        if (this.f15126d != null && this.f15126d.length > 0) {
            for (String str : this.f15126d) {
                if (str != null) {
                    giVar.mo16837a(4, str);
                }
            }
        }
        super.mo16327a(giVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo16328b() {
        int b = super.mo16328b();
        if (this.f15123a != null) {
            b += C4623gi.m20050b(1, this.f15123a.intValue());
        }
        if (this.f15124b != null) {
            b += C4623gi.m20052b(2, this.f15124b);
        }
        if (this.f15125c != null) {
            this.f15125c.booleanValue();
            b += C4623gi.m20049b(3) + 1;
        }
        if (this.f15126d == null || this.f15126d.length <= 0) {
            return b;
        }
        int i = 0;
        int i2 = 0;
        for (String str : this.f15126d) {
            if (str != null) {
                i2++;
                i += C4623gi.m20045a(str);
            }
        }
        return b + i + (1 * i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C4642o mo16326a(C4622gh ghVar) throws IOException {
        int d;
        while (true) {
            int a = ghVar.mo16811a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                try {
                    d = ghVar.mo16822d();
                    if (d < 0 || d > 6) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append(d);
                        sb.append(" is not a valid enum MatchType");
                    } else {
                        this.f15123a = Integer.valueOf(d);
                    }
                } catch (IllegalArgumentException unused) {
                    ghVar.mo16825e(ghVar.mo16829i());
                    mo16844a(ghVar, a);
                }
            } else if (a == 18) {
                this.f15124b = ghVar.mo16821c();
            } else if (a == 24) {
                this.f15125c = Boolean.valueOf(ghVar.mo16818b());
            } else if (a == 34) {
                int a2 = C4634gt.m20112a(ghVar, 34);
                int length = this.f15126d == null ? 0 : this.f15126d.length;
                String[] strArr = new String[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f15126d, 0, strArr, 0, length);
                }
                while (length < strArr.length - 1) {
                    strArr[length] = ghVar.mo16821c();
                    ghVar.mo16811a();
                    length++;
                }
                strArr[length] = ghVar.mo16821c();
                this.f15126d = strArr;
            } else if (!super.mo16844a(ghVar, a)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append(d);
        sb2.append(" is not a valid enum MatchType");
        throw new IllegalArgumentException(sb2.toString());
    }
}
