package org.apache.p199a.p228j;

import java.io.IOException;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6559p;
import org.apache.p199a.p227i.C6532e;

/* renamed from: org.apache.a.j.l */
/* compiled from: RequestUserAgent */
public class C6546l implements C6559p {
    /* renamed from: a */
    public void mo22453a(C6558o oVar, C6539e eVar) throws C6547k, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (!oVar.mo22908a("User-Agent")) {
            String c = C6532e.m25884c(oVar.mo22915f());
            if (c != null) {
                oVar.mo22904a("User-Agent", c);
            }
        }
    }
}
