package org.apache.p199a.p218f.p222d;

import java.util.List;
import org.apache.p199a.C6266b;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6341d;
import org.apache.p199a.p214d.C6343b;
import org.apache.p199a.p214d.C6346e;
import org.apache.p199a.p214d.C6349h;
import org.apache.p199a.p214d.C6352k;
import org.apache.p199a.p214d.C6354m;
import org.apache.p199a.p226h.C6526u;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.f.d.k */
/* compiled from: BestMatchSpec */
public class C6458k implements C6349h {

    /* renamed from: a */
    private final String[] f21120a;

    /* renamed from: b */
    private final boolean f21121b;

    /* renamed from: c */
    private C6446af f21122c;

    /* renamed from: d */
    private C6474y f21123d;

    /* renamed from: e */
    private C6460m f21124e;

    public String toString() {
        return "best-match";
    }

    public C6458k(String[] strArr, boolean z) {
        String[] strArr2;
        if (strArr == null) {
            strArr2 = null;
        } else {
            strArr2 = (String[]) strArr.clone();
        }
        this.f21120a = strArr2;
        this.f21121b = z;
    }

    public C6458k() {
        this(null, false);
    }

    /* renamed from: c */
    private C6446af m25595c() {
        if (this.f21122c == null) {
            this.f21122c = new C6446af(this.f21120a, this.f21121b);
        }
        return this.f21122c;
    }

    /* renamed from: d */
    private C6474y m25596d() {
        if (this.f21123d == null) {
            this.f21123d = new C6474y(this.f21120a, this.f21121b);
        }
        return this.f21123d;
    }

    /* renamed from: e */
    private C6460m m25597e() {
        if (this.f21124e == null) {
            this.f21124e = new C6460m(this.f21120a);
        }
        return this.f21124e;
    }

    /* renamed from: a */
    public List<C6343b> mo22597a(C6301c cVar, C6346e eVar) throws C6352k {
        C6526u uVar;
        C6549b bVar;
        if (cVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else {
            C6341d[] e = cVar.mo22467e();
            boolean z = false;
            boolean z2 = false;
            for (C6341d dVar : e) {
                if (dVar.mo22570a("version") != null) {
                    z2 = true;
                }
                if (dVar.mo22570a("expires") != null) {
                    z = true;
                }
            }
            if (z || !z2) {
                C6470u uVar2 = C6470u.f21132a;
                if (cVar instanceof C6266b) {
                    C6266b bVar2 = (C6266b) cVar;
                    bVar = bVar2.mo22434a();
                    uVar = new C6526u(bVar2.mo22435b(), bVar.mo23052c());
                } else {
                    String d = cVar.mo22466d();
                    if (d == null) {
                        throw new C6352k("Header value is null");
                    }
                    bVar = new C6549b(d.length());
                    bVar.mo23044a(d);
                    uVar = new C6526u(0, bVar.mo23052c());
                }
                return m25597e().mo22833a(new C6341d[]{uVar2.mo22846a(bVar, uVar)}, eVar);
            } else if ("Set-Cookie2".equals(cVar.mo22465c())) {
                return m25595c().mo22833a(e, eVar);
            } else {
                return m25596d().mo22833a(e, eVar);
            }
        }
    }

    /* renamed from: a */
    public void mo22598a(C6343b bVar, C6346e eVar) throws C6352k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else if (bVar.mo22582g() <= 0) {
            m25597e().mo22598a(bVar, eVar);
        } else if (bVar instanceof C6354m) {
            m25595c().mo22598a(bVar, eVar);
        } else {
            m25596d().mo22598a(bVar, eVar);
        }
    }

    /* renamed from: b */
    public boolean mo22600b(C6343b bVar, C6346e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else if (bVar.mo22582g() <= 0) {
            return m25597e().mo22600b(bVar, eVar);
        } else {
            if (bVar instanceof C6354m) {
                return m25595c().mo22600b(bVar, eVar);
            }
            return m25596d().mo22600b(bVar, eVar);
        }
    }

    /* renamed from: a */
    public List<C6301c> mo22596a(List<C6343b> list) {
        if (list == null) {
            throw new IllegalArgumentException("List of cookie may not be null");
        }
        int i = Integer.MAX_VALUE;
        boolean z = true;
        for (C6343b bVar : list) {
            if (!(bVar instanceof C6354m)) {
                z = false;
            }
            if (bVar.mo22582g() < i) {
                i = bVar.mo22582g();
            }
        }
        if (i <= 0) {
            return m25597e().mo22596a(list);
        }
        if (z) {
            return m25595c().mo22596a(list);
        }
        return m25596d().mo22596a(list);
    }

    /* renamed from: a */
    public int mo22595a() {
        return m25595c().mo22595a();
    }

    /* renamed from: b */
    public C6301c mo22599b() {
        return m25595c().mo22599b();
    }
}
