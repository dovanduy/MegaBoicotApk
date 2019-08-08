package org.apache.p199a.p202b.p206d;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6555l;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6559p;
import org.apache.p199a.p200a.C6248a;
import org.apache.p199a.p200a.C6252d;
import org.apache.p199a.p200a.C6253e;
import org.apache.p199a.p200a.C6256h;
import org.apache.p199a.p202b.C6267a;
import org.apache.p199a.p202b.C6292f;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.b.d.b */
/* compiled from: RequestAuthCache */
public class C6281b implements C6559p {

    /* renamed from: a */
    private final Log f20822a = LogFactory.getLog(getClass());

    /* renamed from: a */
    public void mo22453a(C6558o oVar, C6539e eVar) throws C6547k, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else {
            C6267a aVar = (C6267a) eVar.mo22777a("http.auth.auth-cache");
            if (aVar == null) {
                this.f20822a.debug("Auth cache not set in the context");
                return;
            }
            C6292f fVar = (C6292f) eVar.mo22777a("http.auth.credentials-provider");
            if (fVar == null) {
                this.f20822a.debug("Credentials provider not set in the context");
                return;
            }
            C6555l lVar = (C6555l) eVar.mo22777a("http.target_host");
            C6253e eVar2 = (C6253e) eVar.mo22777a("http.auth.target-scope");
            if (!(lVar == null || eVar2 == null || eVar2.mo22407c() != null)) {
                C6248a a = aVar.mo22436a(lVar);
                if (a != null) {
                    m24886a(lVar, a, eVar2, fVar);
                }
            }
            C6555l lVar2 = (C6555l) eVar.mo22777a("http.proxy_host");
            C6253e eVar3 = (C6253e) eVar.mo22777a("http.auth.proxy-scope");
            if (!(lVar2 == null || eVar3 == null || eVar3.mo22407c() != null)) {
                C6248a a2 = aVar.mo22436a(lVar2);
                if (a2 != null) {
                    m24886a(lVar2, a2, eVar3, fVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m24886a(C6555l lVar, C6248a aVar, C6253e eVar, C6292f fVar) {
        String a = aVar.mo22389a();
        if (this.f20822a.isDebugEnabled()) {
            Log log = this.f20822a;
            StringBuilder sb = new StringBuilder();
            sb.append("Re-using cached '");
            sb.append(a);
            sb.append("' auth scheme for ");
            sb.append(lVar);
            log.debug(sb.toString());
        }
        C6256h a2 = fVar.mo22457a(new C6252d(lVar.mo23058a(), lVar.mo23059b(), C6252d.f20799b, a));
        if (a2 != null) {
            eVar.mo22403a(aVar);
            eVar.mo22405a(a2);
            return;
        }
        this.f20822a.debug("No credentials for preemptive authentication");
    }
}
