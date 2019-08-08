package org.apache.p199a.p218f.p219a;

import org.apache.commons.p230a.p231a.C6570a;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6558o;
import org.apache.p199a.p200a.C6254f;
import org.apache.p199a.p200a.C6256h;
import org.apache.p199a.p200a.C6258j;
import org.apache.p199a.p200a.p201a.C6249a;
import org.apache.p199a.p226h.C6521p;
import org.apache.p199a.p229k.C6549b;
import org.apache.p199a.p229k.C6550c;

/* renamed from: org.apache.a.f.a.b */
/* compiled from: BasicScheme */
public class C6379b extends C6398m {

    /* renamed from: a */
    private boolean f20932a = false;

    /* renamed from: a */
    public String mo22389a() {
        return "basic";
    }

    /* renamed from: c */
    public boolean mo22393c() {
        return false;
    }

    /* renamed from: a */
    public void mo22391a(C6301c cVar) throws C6258j {
        super.mo22391a(cVar);
        this.f20932a = true;
    }

    /* renamed from: d */
    public boolean mo22394d() {
        return this.f20932a;
    }

    /* renamed from: a */
    public C6301c mo22390a(C6256h hVar, C6558o oVar) throws C6254f {
        if (hVar == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        } else if (oVar != null) {
            return m25212a(hVar, C6249a.m24827a(oVar.mo22915f()), mo22677e());
        } else {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
    }

    /* renamed from: a */
    public static C6301c m25212a(C6256h hVar, String str, boolean z) {
        if (hVar == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("charset may not be null");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(hVar.mo22412a().getName());
            sb.append(":");
            sb.append(hVar.mo22413b() == null ? "null" : hVar.mo22413b());
            byte[] a = C6570a.m26012a(C6550c.m25956a(sb.toString(), str));
            C6549b bVar = new C6549b(32);
            if (z) {
                bVar.mo23044a("Proxy-Authorization");
            } else {
                bVar.mo23044a("Authorization");
            }
            bVar.mo23044a(": Basic ");
            bVar.mo23047a(a, 0, a.length);
            return new C6521p(bVar);
        }
    }
}
