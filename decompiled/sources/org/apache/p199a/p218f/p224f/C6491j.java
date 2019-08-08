package org.apache.p199a.p218f.p224f;

import java.io.IOException;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6557n;
import org.apache.p199a.C6561r;
import org.apache.p199a.C6566w;
import org.apache.p199a.C6567x;
import org.apache.p199a.p225g.C6503f;
import org.apache.p199a.p226h.C6525t;
import org.apache.p199a.p226h.C6526u;
import org.apache.p199a.p227i.C6531d;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.f.f.j */
/* compiled from: HttpResponseParser */
public class C6491j extends C6482a {

    /* renamed from: b */
    private final C6561r f21194b;

    /* renamed from: c */
    private final C6549b f21195c;

    public C6491j(C6503f fVar, C6525t tVar, C6561r rVar, C6531d dVar) {
        super(fVar, tVar, dVar);
        if (rVar == null) {
            throw new IllegalArgumentException("Response factory may not be null");
        }
        this.f21194b = rVar;
        this.f21195c = new C6549b(128);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6557n mo22804a(C6503f fVar) throws IOException, C6547k, C6567x {
        this.f21195c.mo23041a();
        if (fVar.mo22806a(this.f21195c) == -1) {
            throw new C6566w("The target server failed to respond");
        }
        return this.f21194b.mo22776a(this.f21146a.mo22955c(this.f21195c, new C6526u(0, this.f21195c.mo23052c())), null);
    }
}
