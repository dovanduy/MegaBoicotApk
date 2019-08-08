package org.apache.p199a.p218f.p219a;

import org.apache.p199a.C6266b;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6558o;
import org.apache.p199a.p200a.C6254f;
import org.apache.p199a.p200a.C6255g;
import org.apache.p199a.p200a.C6256h;
import org.apache.p199a.p200a.C6258j;
import org.apache.p199a.p228j.C6538d;
import org.apache.p199a.p228j.C6539e;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.f.a.a */
/* compiled from: AuthSchemeBase */
public abstract class C6378a implements C6255g {

    /* renamed from: a */
    private boolean f20931a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo22676a(C6549b bVar, int i, int i2) throws C6258j;

    /* renamed from: a */
    public void mo22391a(C6301c cVar) throws C6258j {
        C6549b bVar;
        if (cVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        }
        String c = cVar.mo22465c();
        int i = 0;
        if (c.equalsIgnoreCase("WWW-Authenticate")) {
            this.f20931a = false;
        } else if (c.equalsIgnoreCase("Proxy-Authenticate")) {
            this.f20931a = true;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected header name: ");
            sb.append(c);
            throw new C6258j(sb.toString());
        }
        if (cVar instanceof C6266b) {
            C6266b bVar2 = (C6266b) cVar;
            bVar = bVar2.mo22434a();
            i = bVar2.mo22435b();
        } else {
            String d = cVar.mo22466d();
            if (d == null) {
                throw new C6258j("Header value is null");
            }
            bVar = new C6549b(d.length());
            bVar.mo23044a(d);
        }
        while (i < bVar.mo23052c() && C6538d.m25905a(bVar.mo23038a(i))) {
            i++;
        }
        int i2 = i;
        while (i2 < bVar.mo23052c() && !C6538d.m25905a(bVar.mo23038a(i2))) {
            i2++;
        }
        String a = bVar.mo23040a(i, i2);
        if (!a.equalsIgnoreCase(mo22389a())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid scheme identifier: ");
            sb2.append(a);
            throw new C6258j(sb2.toString());
        }
        mo22676a(bVar, i2, bVar.mo23052c());
    }

    /* renamed from: a */
    public C6301c mo22411a(C6256h hVar, C6558o oVar, C6539e eVar) throws C6254f {
        return mo22390a(hVar, oVar);
    }

    /* renamed from: e */
    public boolean mo22677e() {
        return this.f20931a;
    }

    public String toString() {
        return mo22389a();
    }
}
