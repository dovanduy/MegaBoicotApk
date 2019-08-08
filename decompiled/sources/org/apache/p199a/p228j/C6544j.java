package org.apache.p199a.p228j;

import java.io.IOException;
import org.apache.p199a.C6527i;
import org.apache.p199a.C6534j;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6559p;
import org.apache.p199a.C6563t;
import org.apache.p199a.C6569z;
import org.apache.p199a.p227i.C6532e;

/* renamed from: org.apache.a.j.j */
/* compiled from: RequestExpectContinue */
public class C6544j implements C6559p {
    /* renamed from: a */
    public void mo22453a(C6558o oVar, C6539e eVar) throws C6547k, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (oVar instanceof C6534j) {
            C6527i b = ((C6534j) oVar).mo22446b();
            if (b != null && b.mo22650c() != 0) {
                C6569z b2 = oVar.mo22451g().mo22427b();
                if (C6532e.m25885d(oVar.mo22915f()) && !b2.mo23073c(C6563t.f21277b)) {
                    oVar.mo22904a("Expect", "100-continue");
                }
            }
        }
    }
}
