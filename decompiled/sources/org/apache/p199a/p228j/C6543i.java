package org.apache.p199a.p228j;

import java.io.IOException;
import org.apache.p199a.C6527i;
import org.apache.p199a.C6534j;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6559p;
import org.apache.p199a.C6563t;
import org.apache.p199a.C6568y;
import org.apache.p199a.C6569z;

/* renamed from: org.apache.a.j.i */
/* compiled from: RequestContent */
public class C6543i implements C6559p {
    /* renamed from: a */
    public void mo22453a(C6558o oVar, C6539e eVar) throws C6547k, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (oVar instanceof C6534j) {
            if (oVar.mo22908a("Transfer-Encoding")) {
                throw new C6568y("Transfer-encoding header already present");
            } else if (oVar.mo22908a("Content-Length")) {
                throw new C6568y("Content-Length header already present");
            } else {
                C6569z b = oVar.mo22451g().mo22427b();
                C6527i b2 = ((C6534j) oVar).mo22446b();
                if (b2 == null) {
                    oVar.mo22904a("Content-Length", "0");
                    return;
                }
                if (!b2.mo22619b() && b2.mo22650c() >= 0) {
                    oVar.mo22904a("Content-Length", Long.toString(b2.mo22650c()));
                } else if (b.mo23073c(C6563t.f21277b)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Chunked transfer encoding not allowed for ");
                    stringBuffer.append(b);
                    throw new C6568y(stringBuffer.toString());
                } else {
                    oVar.mo22904a("Transfer-Encoding", "chunked");
                }
                if (b2.mo22620d() != null && !oVar.mo22908a("Content-Type")) {
                    oVar.mo22905a(b2.mo22620d());
                }
                if (b2.mo22621e() != null && !oVar.mo22908a("Content-Encoding")) {
                    oVar.mo22905a(b2.mo22621e());
                }
            }
        }
    }
}
