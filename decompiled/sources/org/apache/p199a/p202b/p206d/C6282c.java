package org.apache.p199a.p202b.p206d;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6559p;
import org.apache.p199a.p208c.C6338m;
import org.apache.p199a.p208c.p210b.C6306b;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.b.d.c */
/* compiled from: RequestClientConnControl */
public class C6282c implements C6559p {

    /* renamed from: a */
    private final Log f20823a = LogFactory.getLog(getClass());

    /* renamed from: a */
    public void mo22453a(C6558o oVar, C6539e eVar) throws C6547k, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (oVar.mo22451g().mo22426a().equalsIgnoreCase("CONNECT")) {
            oVar.mo22909b("Proxy-Connection", "Keep-Alive");
        } else {
            C6338m mVar = (C6338m) eVar.mo22777a("http.connection");
            if (mVar == null) {
                this.f20823a.debug("HTTP connection not set in the context");
                return;
            }
            C6306b l = mVar.mo22555l();
            if ((l.mo22489c() == 1 || l.mo22492e()) && !oVar.mo22908a("Connection")) {
                oVar.mo22904a("Connection", "Keep-Alive");
            }
            if (l.mo22489c() == 2 && !l.mo22492e() && !oVar.mo22908a("Proxy-Connection")) {
                oVar.mo22904a("Proxy-Connection", "Keep-Alive");
            }
        }
    }
}
