package org.apache.p199a.p202b.p206d;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6376f;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6560q;
import org.apache.p199a.C6562s;
import org.apache.p199a.p202b.C6288e;
import org.apache.p199a.p214d.C6343b;
import org.apache.p199a.p214d.C6346e;
import org.apache.p199a.p214d.C6349h;
import org.apache.p199a.p214d.C6352k;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.b.d.h */
/* compiled from: ResponseProcessCookies */
public class C6287h implements C6562s {

    /* renamed from: a */
    private final Log f20827a = LogFactory.getLog(getClass());

    /* renamed from: a */
    public void mo22454a(C6560q qVar, C6539e eVar) throws C6547k, IOException {
        if (qVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else {
            C6349h hVar = (C6349h) eVar.mo22777a("http.cookie-spec");
            if (hVar == null) {
                this.f20827a.debug("Cookie spec not specified in HTTP context");
                return;
            }
            C6288e eVar2 = (C6288e) eVar.mo22777a("http.cookie-store");
            if (eVar2 == null) {
                this.f20827a.debug("Cookie store not specified in HTTP context");
                return;
            }
            C6346e eVar3 = (C6346e) eVar.mo22777a("http.cookie-origin");
            if (eVar3 == null) {
                this.f20827a.debug("Cookie origin not specified in HTTP context");
                return;
            }
            m24895a(qVar.mo22912d("Set-Cookie"), hVar, eVar3, eVar2);
            if (hVar.mo22595a() > 0) {
                m24895a(qVar.mo22912d("Set-Cookie2"), hVar, eVar3, eVar2);
            }
        }
    }

    /* renamed from: a */
    private void m24895a(C6376f fVar, C6349h hVar, C6346e eVar, C6288e eVar2) {
        while (fVar.hasNext()) {
            C6301c a = fVar.mo22657a();
            try {
                for (C6343b bVar : hVar.mo22597a(a, eVar)) {
                    try {
                        hVar.mo22598a(bVar, eVar);
                        eVar2.mo22456a(bVar);
                        if (this.f20827a.isDebugEnabled()) {
                            Log log = this.f20827a;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Cookie accepted: \"");
                            sb.append(bVar);
                            sb.append("\". ");
                            log.debug(sb.toString());
                        }
                    } catch (C6352k e) {
                        if (this.f20827a.isWarnEnabled()) {
                            Log log2 = this.f20827a;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Cookie rejected: \"");
                            sb2.append(bVar);
                            sb2.append("\". ");
                            sb2.append(e.getMessage());
                            log2.warn(sb2.toString());
                        }
                    }
                }
            } catch (C6352k e2) {
                if (this.f20827a.isWarnEnabled()) {
                    Log log3 = this.f20827a;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid cookie header: \"");
                    sb3.append(a);
                    sb3.append("\". ");
                    sb3.append(e2.getMessage());
                    log3.warn(sb3.toString());
                }
            }
        }
    }
}
