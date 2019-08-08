package org.apache.p199a.p218f.p220b;

import java.security.Principal;
import javax.net.ssl.SSLSession;
import org.apache.p199a.p200a.C6248a;
import org.apache.p199a.p200a.C6253e;
import org.apache.p199a.p200a.C6256h;
import org.apache.p199a.p202b.C6300n;
import org.apache.p199a.p208c.C6338m;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.f.b.n */
/* compiled from: DefaultUserTokenHandler */
public class C6415n implements C6300n {
    /* renamed from: a */
    public Object mo22464a(C6539e eVar) {
        Principal principal;
        C6253e eVar2 = (C6253e) eVar.mo22777a("http.auth.target-scope");
        if (eVar2 != null) {
            principal = m25402a(eVar2);
            if (principal == null) {
                principal = m25402a((C6253e) eVar.mo22777a("http.auth.proxy-scope"));
            }
        } else {
            principal = null;
        }
        if (principal != null) {
            return principal;
        }
        C6338m mVar = (C6338m) eVar.mo22777a("http.connection");
        if (!mVar.mo22781d()) {
            return principal;
        }
        SSLSession m = mVar.mo22556m();
        return m != null ? m.getLocalPrincipal() : principal;
    }

    /* renamed from: a */
    private static Principal m25402a(C6253e eVar) {
        C6248a c = eVar.mo22407c();
        if (c != null && c.mo22394d() && c.mo22393c()) {
            C6256h d = eVar.mo22408d();
            if (d != null) {
                return d.mo22412a();
            }
        }
        return null;
    }
}
