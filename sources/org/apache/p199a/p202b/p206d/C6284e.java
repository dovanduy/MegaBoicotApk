package org.apache.p199a.p202b.p206d;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6559p;
import org.apache.p199a.p200a.C6248a;
import org.apache.p199a.p200a.C6253e;
import org.apache.p199a.p200a.C6254f;
import org.apache.p199a.p200a.C6255g;
import org.apache.p199a.p200a.C6256h;
import org.apache.p199a.p208c.C6338m;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.b.d.e */
/* compiled from: RequestProxyAuthentication */
public class C6284e implements C6559p {

    /* renamed from: a */
    private final Log f20824a = LogFactory.getLog(getClass());

    /* renamed from: a */
    public void mo22453a(C6558o oVar, C6539e eVar) throws C6547k, IOException {
        C6301c cVar;
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else if (!oVar.mo22908a("Proxy-Authorization")) {
            C6338m mVar = (C6338m) eVar.mo22777a("http.connection");
            if (mVar == null) {
                this.f20824a.debug("HTTP connection not set in the context");
            } else if (!mVar.mo22555l().mo22492e()) {
                C6253e eVar2 = (C6253e) eVar.mo22777a("http.auth.proxy-scope");
                if (eVar2 == null) {
                    this.f20824a.debug("Proxy auth state not set in the context");
                    return;
                }
                C6248a c = eVar2.mo22407c();
                if (c != null) {
                    C6256h d = eVar2.mo22408d();
                    if (d == null) {
                        this.f20824a.debug("User credentials not available");
                        return;
                    }
                    if (eVar2.mo22409e() != null || !c.mo22393c()) {
                        try {
                            if (c instanceof C6255g) {
                                cVar = ((C6255g) c).mo22411a(d, oVar, eVar);
                            } else {
                                cVar = c.mo22390a(d, oVar);
                            }
                            oVar.mo22905a(cVar);
                        } catch (C6254f e) {
                            if (this.f20824a.isErrorEnabled()) {
                                Log log = this.f20824a;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Proxy authentication error: ");
                                sb.append(e.getMessage());
                                log.error(sb.toString());
                            }
                        }
                    }
                }
            }
        }
    }
}
