package org.apache.p199a.p218f.p222d;

import java.util.ArrayList;
import java.util.List;
import org.apache.p199a.C6266b;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6341d;
import org.apache.p199a.p214d.C6343b;
import org.apache.p199a.p214d.C6346e;
import org.apache.p199a.p214d.C6352k;
import org.apache.p199a.p226h.C6521p;
import org.apache.p199a.p226h.C6526u;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.f.d.v */
/* compiled from: NetscapeDraftSpec */
public class C6471v extends C6462o {

    /* renamed from: a */
    private final String[] f21133a;

    /* renamed from: a */
    public int mo22595a() {
        return 0;
    }

    /* renamed from: b */
    public C6301c mo22599b() {
        return null;
    }

    public String toString() {
        return "netscape";
    }

    public C6471v(String[] strArr) {
        if (strArr != null) {
            this.f21133a = (String[]) strArr.clone();
        } else {
            this.f21133a = new String[]{"EEE, dd-MMM-yy HH:mm:ss z"};
        }
        mo22837a("path", new C6456i());
        mo22837a("domain", new C6469t());
        mo22837a("max-age", new C6455h());
        mo22837a("secure", new C6457j());
        mo22837a("comment", new C6452e());
        mo22837a("expires", new C6454g(this.f21133a));
    }

    public C6471v() {
        this(null);
    }

    /* renamed from: a */
    public List<C6343b> mo22597a(C6301c cVar, C6346e eVar) throws C6352k {
        C6526u uVar;
        C6549b bVar;
        if (cVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else if (!cVar.mo22465c().equalsIgnoreCase("Set-Cookie")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized cookie header '");
            sb.append(cVar.toString());
            sb.append("'");
            throw new C6352k(sb.toString());
        } else {
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
            return mo22833a(new C6341d[]{uVar2.mo22846a(bVar, uVar)}, eVar);
        }
    }

    /* renamed from: a */
    public List<C6301c> mo22596a(List<C6343b> list) {
        if (list == null) {
            throw new IllegalArgumentException("List of cookies may not be null");
        } else if (list.isEmpty()) {
            throw new IllegalArgumentException("List of cookies may not be empty");
        } else {
            C6549b bVar = new C6549b(20 * list.size());
            bVar.mo23044a("Cookie");
            bVar.mo23044a(": ");
            for (int i = 0; i < list.size(); i++) {
                C6343b bVar2 = (C6343b) list.get(i);
                if (i > 0) {
                    bVar.mo23044a("; ");
                }
                bVar.mo23044a(bVar2.mo22575a());
                String b = bVar2.mo22577b();
                if (b != null) {
                    bVar.mo23044a("=");
                    bVar.mo23044a(b);
                }
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new C6521p(bVar));
            return arrayList;
        }
    }
}
