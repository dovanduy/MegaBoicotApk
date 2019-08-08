package org.apache.p199a.p202b.p206d;

import java.io.IOException;
import java.util.Collection;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6559p;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.b.d.d */
/* compiled from: RequestDefaultHeaders */
public class C6283d implements C6559p {
    /* renamed from: a */
    public void mo22453a(C6558o oVar, C6539e eVar) throws C6547k, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (!oVar.mo22451g().mo22426a().equalsIgnoreCase("CONNECT")) {
            Collection<C6301c> collection = (Collection) oVar.mo22915f().mo22751a("http.default-headers");
            if (collection != null) {
                for (C6301c a : collection) {
                    oVar.mo22905a(a);
                }
            }
        }
    }
}
