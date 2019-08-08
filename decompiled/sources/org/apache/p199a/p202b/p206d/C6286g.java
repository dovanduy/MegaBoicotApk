package org.apache.p199a.p202b.p206d;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6555l;
import org.apache.p199a.C6560q;
import org.apache.p199a.C6562s;
import org.apache.p199a.p200a.C6248a;
import org.apache.p199a.p200a.C6253e;
import org.apache.p199a.p202b.C6267a;
import org.apache.p199a.p218f.p220b.C6404c;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.b.d.g */
/* compiled from: ResponseAuthCache */
public class C6286g implements C6562s {

    /* renamed from: a */
    private final Log f20826a = LogFactory.getLog(getClass());

    /* renamed from: a */
    public void mo22454a(C6560q qVar, C6539e eVar) throws C6547k, IOException {
        if (qVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else {
            C6267a aVar = (C6267a) eVar.mo22777a("http.auth.auth-cache");
            C6555l lVar = (C6555l) eVar.mo22777a("http.target_host");
            C6253e eVar2 = (C6253e) eVar.mo22777a("http.auth.target-scope");
            if (!(lVar == null || eVar2 == null || !m24893a(eVar2))) {
                if (aVar == null) {
                    aVar = new C6404c();
                    eVar.mo22778a("http.auth.auth-cache", aVar);
                }
                m24892a(aVar, lVar, eVar2);
            }
            C6555l lVar2 = (C6555l) eVar.mo22777a("http.proxy_host");
            C6253e eVar3 = (C6253e) eVar.mo22777a("http.auth.proxy-scope");
            if (lVar2 != null && eVar3 != null && m24893a(eVar3)) {
                if (aVar == null) {
                    aVar = new C6404c();
                    eVar.mo22778a("http.auth.auth-cache", aVar);
                }
                m24892a(aVar, lVar2, eVar3);
            }
        }
    }

    /* renamed from: a */
    private boolean m24893a(C6253e eVar) {
        C6248a c = eVar.mo22407c();
        boolean z = false;
        if (c == null || !c.mo22394d()) {
            return false;
        }
        String a = c.mo22389a();
        if (a.equalsIgnoreCase("Basic") || a.equalsIgnoreCase("Digest")) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private void m24892a(C6267a aVar, C6555l lVar, C6253e eVar) {
        C6248a c = eVar.mo22407c();
        if (eVar.mo22409e() == null) {
            return;
        }
        if (eVar.mo22408d() != null) {
            if (this.f20826a.isDebugEnabled()) {
                Log log = this.f20826a;
                StringBuilder sb = new StringBuilder();
                sb.append("Caching '");
                sb.append(c.mo22389a());
                sb.append("' auth scheme for ");
                sb.append(lVar);
                log.debug(sb.toString());
            }
            aVar.mo22437a(lVar, c);
            return;
        }
        aVar.mo22438b(lVar);
    }
}
