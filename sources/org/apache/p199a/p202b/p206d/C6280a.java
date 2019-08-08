package org.apache.p199a.p202b.p206d;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6555l;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6559p;
import org.apache.p199a.C6568y;
import org.apache.p199a.p202b.C6288e;
import org.apache.p199a.p202b.p204b.C6276g;
import org.apache.p199a.p202b.p205c.C6278a;
import org.apache.p199a.p208c.C6338m;
import org.apache.p199a.p214d.C6343b;
import org.apache.p199a.p214d.C6346e;
import org.apache.p199a.p214d.C6349h;
import org.apache.p199a.p214d.C6351j;
import org.apache.p199a.p214d.C6354m;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.b.d.a */
/* compiled from: RequestAddCookies */
public class C6280a implements C6559p {

    /* renamed from: a */
    private final Log f20821a = LogFactory.getLog(getClass());

    /* renamed from: a */
    public void mo22453a(C6558o oVar, C6539e eVar) throws C6547k, IOException {
        URI uri;
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else if (!oVar.mo22451g().mo22426a().equalsIgnoreCase("CONNECT")) {
            C6288e eVar2 = (C6288e) eVar.mo22777a("http.cookie-store");
            if (eVar2 == null) {
                this.f20821a.debug("Cookie store not specified in HTTP context");
                return;
            }
            C6351j jVar = (C6351j) eVar.mo22777a("http.cookiespec-registry");
            if (jVar == null) {
                this.f20821a.debug("CookieSpec registry not specified in HTTP context");
                return;
            }
            C6555l lVar = (C6555l) eVar.mo22777a("http.target_host");
            if (lVar == null) {
                this.f20821a.debug("Target host not set in the context");
                return;
            }
            C6338m mVar = (C6338m) eVar.mo22777a("http.connection");
            if (mVar == null) {
                this.f20821a.debug("HTTP connection not set in the context");
                return;
            }
            String c = C6278a.m24884c(oVar.mo22915f());
            if (this.f20821a.isDebugEnabled()) {
                Log log = this.f20821a;
                StringBuilder sb = new StringBuilder();
                sb.append("CookieSpec selected: ");
                sb.append(c);
                log.debug(sb.toString());
            }
            if (oVar instanceof C6276g) {
                uri = ((C6276g) oVar).mo22452h();
            } else {
                try {
                    uri = new URI(oVar.mo22451g().mo22428c());
                } catch (URISyntaxException e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid request URI: ");
                    sb2.append(oVar.mo22451g().mo22428c());
                    throw new C6568y(sb2.toString(), e);
                }
            }
            String a = lVar.mo23058a();
            int b = lVar.mo23059b();
            boolean z = false;
            if (b < 0) {
                if (mVar.mo22555l().mo22489c() == 1) {
                    b = mVar.mo22783h();
                } else {
                    String c2 = lVar.mo23060c();
                    b = c2.equalsIgnoreCase("http") ? 80 : c2.equalsIgnoreCase("https") ? 443 : 0;
                }
            }
            C6346e eVar3 = new C6346e(a, b, uri.getPath(), mVar.mo22554k());
            C6349h a2 = jVar.mo22602a(c, oVar.mo22915f());
            ArrayList<C6343b> arrayList = new ArrayList<>(eVar2.mo22455a());
            ArrayList<C6343b> arrayList2 = new ArrayList<>();
            Date date = new Date();
            for (C6343b bVar : arrayList) {
                if (!bVar.mo22576a(date)) {
                    if (a2.mo22600b(bVar, eVar3)) {
                        if (this.f20821a.isDebugEnabled()) {
                            Log log2 = this.f20821a;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Cookie ");
                            sb3.append(bVar);
                            sb3.append(" match ");
                            sb3.append(eVar3);
                            log2.debug(sb3.toString());
                        }
                        arrayList2.add(bVar);
                    }
                } else if (this.f20821a.isDebugEnabled()) {
                    Log log3 = this.f20821a;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Cookie ");
                    sb4.append(bVar);
                    sb4.append(" expired");
                    log3.debug(sb4.toString());
                }
            }
            if (!arrayList2.isEmpty()) {
                for (C6301c a3 : a2.mo22596a(arrayList2)) {
                    oVar.mo22905a(a3);
                }
            }
            int a4 = a2.mo22595a();
            if (a4 > 0) {
                for (C6343b bVar2 : arrayList2) {
                    if (a4 != bVar2.mo22582g() || !(bVar2 instanceof C6354m)) {
                        z = true;
                    }
                }
                if (z) {
                    C6301c b2 = a2.mo22599b();
                    if (b2 != null) {
                        oVar.mo22905a(b2);
                    }
                }
            }
            eVar.mo22778a("http.cookie-spec", a2);
            eVar.mo22778a("http.cookie-origin", eVar3);
        }
    }
}
