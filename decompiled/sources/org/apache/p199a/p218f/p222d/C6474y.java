package org.apache.p199a.p218f.p222d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.p199a.C6301c;
import org.apache.p199a.p214d.C6342a;
import org.apache.p199a.p214d.C6343b;
import org.apache.p199a.p214d.C6346e;
import org.apache.p199a.p214d.C6347f;
import org.apache.p199a.p214d.C6348g;
import org.apache.p199a.p214d.C6352k;
import org.apache.p199a.p226h.C6521p;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.f.d.y */
/* compiled from: RFC2109Spec */
public class C6474y extends C6462o {

    /* renamed from: a */
    private static final C6347f f21134a = new C6347f();

    /* renamed from: b */
    private static final String[] f21135b = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};

    /* renamed from: c */
    private final String[] f21136c;

    /* renamed from: d */
    private final boolean f21137d;

    /* renamed from: a */
    public int mo22595a() {
        return 1;
    }

    /* renamed from: b */
    public C6301c mo22599b() {
        return null;
    }

    public String toString() {
        return "rfc2109";
    }

    public C6474y(String[] strArr, boolean z) {
        if (strArr != null) {
            this.f21136c = (String[]) strArr.clone();
        } else {
            this.f21136c = f21135b;
        }
        this.f21137d = z;
        mo22837a("version", new C6441aa());
        mo22837a("path", new C6456i());
        mo22837a("domain", new C6473x());
        mo22837a("max-age", new C6455h());
        mo22837a("secure", new C6457j());
        mo22837a("comment", new C6452e());
        mo22837a("expires", new C6454g(this.f21136c));
    }

    public C6474y() {
        this(null, false);
    }

    /* renamed from: a */
    public List<C6343b> mo22597a(C6301c cVar, C6346e eVar) throws C6352k {
        if (cVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else if (cVar.mo22465c().equalsIgnoreCase("Set-Cookie")) {
            return mo22833a(cVar.mo22467e(), eVar);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized cookie header '");
            sb.append(cVar.toString());
            sb.append("'");
            throw new C6352k(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo22598a(C6343b bVar, C6346e eVar) throws C6352k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        String a = bVar.mo22575a();
        if (a.indexOf(32) != -1) {
            throw new C6348g("Cookie name may not contain blanks");
        } else if (a.startsWith("$")) {
            throw new C6348g("Cookie name may not start with $");
        } else {
            super.mo22598a(bVar, eVar);
        }
    }

    /* renamed from: a */
    public List<C6301c> mo22596a(List<C6343b> list) {
        if (list == null) {
            throw new IllegalArgumentException("List of cookies may not be null");
        } else if (list.isEmpty()) {
            throw new IllegalArgumentException("List of cookies may not be empty");
        } else {
            if (list.size() > 1) {
                List<C6343b> arrayList = new ArrayList<>(list);
                Collections.sort(arrayList, f21134a);
                list = arrayList;
            }
            if (this.f21137d) {
                return m25637b(list);
            }
            return m25638c(list);
        }
    }

    /* renamed from: b */
    private List<C6301c> m25637b(List<C6343b> list) {
        int i = Integer.MAX_VALUE;
        for (C6343b bVar : list) {
            if (bVar.mo22582g() < i) {
                i = bVar.mo22582g();
            }
        }
        C6549b bVar2 = new C6549b(40 * list.size());
        bVar2.mo23044a("Cookie");
        bVar2.mo23044a(": ");
        bVar2.mo23044a("$Version=");
        bVar2.mo23044a(Integer.toString(i));
        for (C6343b bVar3 : list) {
            bVar2.mo23044a("; ");
            mo22834a(bVar2, bVar3, i);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new C6521p(bVar2));
        return arrayList;
    }

    /* renamed from: c */
    private List<C6301c> m25638c(List<C6343b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C6343b bVar : list) {
            int g = bVar.mo22582g();
            C6549b bVar2 = new C6549b(40);
            bVar2.mo23044a("Cookie: ");
            bVar2.mo23044a("$Version=");
            bVar2.mo23044a(Integer.toString(g));
            bVar2.mo23044a("; ");
            mo22834a(bVar2, bVar, g);
            arrayList.add(new C6521p(bVar2));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22848a(C6549b bVar, String str, String str2, int i) {
        bVar.mo23044a(str);
        bVar.mo23044a("=");
        if (str2 == null) {
            return;
        }
        if (i > 0) {
            bVar.mo23042a('\"');
            bVar.mo23044a(str2);
            bVar.mo23042a('\"');
            return;
        }
        bVar.mo23044a(str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22834a(C6549b bVar, C6343b bVar2, int i) {
        mo22848a(bVar, bVar2.mo22575a(), bVar2.mo22577b(), i);
        if (bVar2.mo22579d() != null && (bVar2 instanceof C6342a) && ((C6342a) bVar2).mo22574b("path")) {
            bVar.mo23044a("; ");
            mo22848a(bVar, "$Path", bVar2.mo22579d(), i);
        }
        if (bVar2.mo22578c() != null && (bVar2 instanceof C6342a) && ((C6342a) bVar2).mo22574b("domain")) {
            bVar.mo23044a("; ");
            mo22848a(bVar, "$Domain", bVar2.mo22578c(), i);
        }
    }
}
