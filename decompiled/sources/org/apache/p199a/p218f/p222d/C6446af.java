package org.apache.p199a.p218f.p222d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6341d;
import org.apache.p199a.C6565v;
import org.apache.p199a.p214d.C6342a;
import org.apache.p199a.p214d.C6343b;
import org.apache.p199a.p214d.C6344c;
import org.apache.p199a.p214d.C6346e;
import org.apache.p199a.p214d.C6352k;
import org.apache.p199a.p214d.C6353l;
import org.apache.p199a.p226h.C6521p;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.f.d.af */
/* compiled from: RFC2965Spec */
public class C6446af extends C6474y {
    /* renamed from: a */
    public int mo22595a() {
        return 1;
    }

    public String toString() {
        return "rfc2965";
    }

    public C6446af() {
        this(null, false);
    }

    public C6446af(String[] strArr, boolean z) {
        super(strArr, z);
        mo22837a("domain", new C6444ad());
        mo22837a("port", new C6445ae());
        mo22837a("commenturl", new C6442ab());
        mo22837a("discard", new C6443ac());
        mo22837a("version", new C6448ah());
    }

    /* renamed from: a */
    public List<C6343b> mo22597a(C6301c cVar, C6346e eVar) throws C6352k {
        if (cVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else if (!cVar.mo22465c().equalsIgnoreCase("Set-Cookie2")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized cookie header '");
            sb.append(cVar.toString());
            sb.append("'");
            throw new C6352k(sb.toString());
        } else {
            return m25546b(cVar.mo22467e(), m25547c(eVar));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C6343b> mo22833a(C6341d[] dVarArr, C6346e eVar) throws C6352k {
        return m25546b(dVarArr, m25547c(eVar));
    }

    /* renamed from: b */
    private List<C6343b> m25546b(C6341d[] dVarArr, C6346e eVar) throws C6352k {
        ArrayList arrayList = new ArrayList(dVarArr.length);
        for (C6341d dVar : dVarArr) {
            String a = dVar.mo22569a();
            String b = dVar.mo22571b();
            if (a == null || a.length() == 0) {
                throw new C6352k("Cookie name may not be empty");
            }
            C6451d dVar2 = new C6451d(a, b);
            dVar2.mo22609e(m25610a(eVar));
            dVar2.mo22608d(m25611b(eVar));
            dVar2.mo22610a(new int[]{eVar.mo22590c()});
            C6565v[] c = dVar.mo22572c();
            HashMap hashMap = new HashMap(c.length);
            for (int length = c.length - 1; length >= 0; length--) {
                C6565v vVar = c[length];
                hashMap.put(vVar.mo22961a().toLowerCase(Locale.ENGLISH), vVar);
            }
            for (Entry value : hashMap.entrySet()) {
                C6565v vVar2 = (C6565v) value.getValue();
                String lowerCase = vVar2.mo22961a().toLowerCase(Locale.ENGLISH);
                dVar2.mo22839a(lowerCase, vVar2.mo22962b());
                C6344c a2 = mo22836a(lowerCase);
                if (a2 != null) {
                    a2.mo22584a((C6353l) dVar2, vVar2.mo22962b());
                }
            }
            arrayList.add(dVar2);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo22598a(C6343b bVar, C6346e eVar) throws C6352k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else {
            super.mo22598a(bVar, m25547c(eVar));
        }
    }

    /* renamed from: b */
    public boolean mo22600b(C6343b bVar, C6346e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            return super.mo22600b(bVar, m25547c(eVar));
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22834a(C6549b bVar, C6343b bVar2, int i) {
        super.mo22834a(bVar, bVar2, i);
        if (bVar2 instanceof C6342a) {
            String a = ((C6342a) bVar2).mo22573a("port");
            if (a != null) {
                bVar.mo23044a("; $Port");
                bVar.mo23044a("=\"");
                if (a.trim().length() > 0) {
                    int[] e = bVar2.mo22580e();
                    if (e != null) {
                        int length = e.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            if (i2 > 0) {
                                bVar.mo23044a(",");
                            }
                            bVar.mo23044a(Integer.toString(e[i2]));
                        }
                    }
                }
                bVar.mo23044a("\"");
            }
        }
    }

    /* renamed from: c */
    private static C6346e m25547c(C6346e eVar) {
        String a = eVar.mo22588a();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= a.length()) {
                z = true;
                break;
            }
            char charAt = a.charAt(i);
            if (charAt == '.' || charAt == ':') {
                break;
            }
            i++;
        }
        if (!z) {
            return eVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(".local");
        return new C6346e(sb.toString(), eVar.mo22590c(), eVar.mo22589b(), eVar.mo22591d());
    }

    /* renamed from: b */
    public C6301c mo22599b() {
        C6549b bVar = new C6549b(40);
        bVar.mo23044a("Cookie2");
        bVar.mo23044a(": ");
        bVar.mo23044a("$Version=");
        bVar.mo23044a(Integer.toString(mo22595a()));
        return new C6521p(bVar);
    }
}
