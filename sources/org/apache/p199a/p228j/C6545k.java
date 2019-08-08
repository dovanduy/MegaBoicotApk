package org.apache.p199a.p228j;

import java.io.IOException;
import java.net.InetAddress;
import org.apache.p199a.C6505h;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6555l;
import org.apache.p199a.C6556m;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6559p;
import org.apache.p199a.C6563t;
import org.apache.p199a.C6568y;
import org.apache.p199a.C6569z;

/* renamed from: org.apache.a.j.k */
/* compiled from: RequestTargetHost */
public class C6545k implements C6559p {
    /* renamed from: a */
    public void mo22453a(C6558o oVar, C6539e eVar) throws C6547k, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else {
            C6569z b = oVar.mo22451g().mo22427b();
            if ((!oVar.mo22451g().mo22426a().equalsIgnoreCase("CONNECT") || !b.mo23073c(C6563t.f21277b)) && !oVar.mo22908a("Host")) {
                C6555l lVar = (C6555l) eVar.mo22777a("http.target_host");
                if (lVar == null) {
                    C6505h hVar = (C6505h) eVar.mo22777a("http.connection");
                    if (hVar instanceof C6556m) {
                        C6556m mVar = (C6556m) hVar;
                        InetAddress g = mVar.mo22782g();
                        int h = mVar.mo22783h();
                        if (g != null) {
                            lVar = new C6555l(g.getHostName(), h);
                        }
                    }
                    if (lVar == null) {
                        if (!b.mo23073c(C6563t.f21277b)) {
                            throw new C6568y("Target host missing");
                        }
                        return;
                    }
                }
                oVar.mo22904a("Host", lVar.mo23063e());
            }
        }
    }
}
