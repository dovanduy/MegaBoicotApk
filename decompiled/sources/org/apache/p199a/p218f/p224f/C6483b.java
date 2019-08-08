package org.apache.p199a.p218f.p224f;

import java.io.IOException;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6376f;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6557n;
import org.apache.p199a.p225g.C6501d;
import org.apache.p199a.p225g.C6504g;
import org.apache.p199a.p226h.C6514i;
import org.apache.p199a.p226h.C6524s;
import org.apache.p199a.p227i.C6531d;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.f.f.b */
/* compiled from: AbstractMessageWriter */
public abstract class C6483b implements C6501d {

    /* renamed from: a */
    protected final C6504g f21153a;

    /* renamed from: b */
    protected final C6549b f21154b;

    /* renamed from: c */
    protected final C6524s f21155c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo22858a(C6557n nVar) throws IOException;

    public C6483b(C6504g gVar, C6524s sVar, C6531d dVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        this.f21153a = gVar;
        this.f21154b = new C6549b(128);
        if (sVar == null) {
            sVar = C6514i.f21226a;
        }
        this.f21155c = sVar;
    }

    /* renamed from: b */
    public void mo22859b(C6557n nVar) throws IOException, C6547k {
        if (nVar == null) {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
        mo22858a(nVar);
        C6376f e = nVar.mo22914e();
        while (e.hasNext()) {
            this.f21153a.mo22814a(this.f21155c.mo22945a(this.f21154b, (C6301c) e.next()));
        }
        this.f21154b.mo23041a();
        this.f21153a.mo22814a(this.f21154b);
    }
}
