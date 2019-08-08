package org.apache.p199a.p218f.p221c;

import java.net.InetAddress;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6555l;
import org.apache.p199a.C6558o;
import org.apache.p199a.p208c.p209a.C6303a;
import org.apache.p199a.p208c.p210b.C6306b;
import org.apache.p199a.p208c.p210b.C6308d;
import org.apache.p199a.p208c.p211c.C6318e;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.f.c.g */
/* compiled from: DefaultHttpRoutePlanner */
public class C6429g implements C6308d {

    /* renamed from: a */
    protected final C6318e f21077a;

    public C6429g(C6318e eVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("SchemeRegistry must not be null.");
        }
        this.f21077a = eVar;
    }

    /* renamed from: a */
    public C6306b mo22498a(C6555l lVar, C6558o oVar, C6539e eVar) throws C6547k {
        C6306b bVar;
        if (oVar == null) {
            throw new IllegalStateException("Request must not be null.");
        }
        C6306b b = C6303a.m24933b(oVar.mo22915f());
        if (b != null) {
            return b;
        }
        if (lVar == null) {
            throw new IllegalStateException("Target host must not be null.");
        }
        InetAddress c = C6303a.m24934c(oVar.mo22915f());
        C6555l a = C6303a.m24932a(oVar.mo22915f());
        boolean d = this.f21077a.mo22524a(lVar.mo23060c()).mo22520d();
        if (a == null) {
            bVar = new C6306b(lVar, c, d);
        } else {
            bVar = new C6306b(lVar, c, a, d);
        }
        return bVar;
    }
}
