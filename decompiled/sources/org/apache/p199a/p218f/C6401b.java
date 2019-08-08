package org.apache.p199a.p218f;

import org.apache.p199a.C6247a;
import org.apache.p199a.C6264ad;
import org.apache.p199a.C6376f;
import org.apache.p199a.C6505h;
import org.apache.p199a.C6527i;
import org.apache.p199a.C6560q;
import org.apache.p199a.C6563t;
import org.apache.p199a.C6567x;
import org.apache.p199a.C6569z;
import org.apache.p199a.p226h.C6520o;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.f.b */
/* compiled from: DefaultConnectionReuseStrategy */
public class C6401b implements C6247a {
    /* renamed from: a */
    public boolean mo22388a(C6560q qVar, C6539e eVar) {
        if (qVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null.");
        } else if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null.");
        } else {
            C6505h hVar = (C6505h) eVar.mo22777a("http.connection");
            if (hVar != null && !hVar.mo22781d()) {
                return false;
            }
            C6527i b = qVar.mo22939b();
            C6569z a = qVar.mo22937a().mo22429a();
            if (b != null && b.mo22650c() < 0 && (!b.mo22619b() || a.mo23073c(C6563t.f21277b))) {
                return false;
            }
            C6376f d = qVar.mo22912d("Connection");
            if (!d.hasNext()) {
                d = qVar.mo22912d("Proxy-Connection");
            }
            if (d.hasNext()) {
                try {
                    C6264ad a2 = mo22709a(d);
                    boolean z = false;
                    while (a2.hasNext()) {
                        String a3 = a2.mo22432a();
                        if ("Close".equalsIgnoreCase(a3)) {
                            return false;
                        }
                        if ("Keep-Alive".equalsIgnoreCase(a3)) {
                            z = true;
                        }
                    }
                    if (z) {
                        return true;
                    }
                } catch (C6567x unused) {
                    return false;
                }
            }
            return !a.mo23073c(C6563t.f21277b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6264ad mo22709a(C6376f fVar) {
        return new C6520o(fVar);
    }
}
