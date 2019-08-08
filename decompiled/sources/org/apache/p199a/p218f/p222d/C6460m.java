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

/* renamed from: org.apache.a.f.d.m */
/* compiled from: BrowserCompatSpec */
public class C6460m extends C6462o {
    @Deprecated

    /* renamed from: a */
    protected static final String[] f21125a = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};

    /* renamed from: b */
    private static final String[] f21126b = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};

    /* renamed from: c */
    private final String[] f21127c;

    /* renamed from: a */
    public int mo22595a() {
        return 0;
    }

    /* renamed from: b */
    public C6301c mo22599b() {
        return null;
    }

    public String toString() {
        return "compatibility";
    }

    public C6460m(String[] strArr) {
        if (strArr != null) {
            this.f21127c = (String[]) strArr.clone();
        } else {
            this.f21127c = f21126b;
        }
        mo22837a("path", new C6456i());
        mo22837a("domain", new C6453f());
        mo22837a("max-age", new C6455h());
        mo22837a("secure", new C6457j());
        mo22837a("comment", new C6452e());
        mo22837a("expires", new C6454g(this.f21127c));
    }

    public C6460m() {
        this(null);
    }

    /* renamed from: a */
    public List<C6343b> mo22597a(C6301c cVar, C6346e eVar) throws C6352k {
        C6341d[] dVarArr;
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
                dVarArr = new C6341d[]{uVar2.mo22846a(bVar, uVar)};
            } else {
                dVarArr = e;
            }
            return mo22833a(dVarArr, eVar);
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
                bVar.mo23044a("=");
                String b = bVar2.mo22577b();
                if (b != null) {
                    bVar.mo23044a(b);
                }
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new C6521p(bVar));
            return arrayList;
        }
    }
}
