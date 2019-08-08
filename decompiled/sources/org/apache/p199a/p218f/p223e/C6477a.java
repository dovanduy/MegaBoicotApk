package org.apache.p199a.p218f.p223e;

import java.io.IOException;
import java.io.InputStream;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6527i;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6557n;
import org.apache.p199a.p215e.C6371b;
import org.apache.p199a.p215e.C6373d;
import org.apache.p199a.p218f.p224f.C6486e;
import org.apache.p199a.p218f.p224f.C6488g;
import org.apache.p199a.p218f.p224f.C6493l;
import org.apache.p199a.p225g.C6503f;

/* renamed from: org.apache.a.f.e.a */
/* compiled from: EntityDeserializer */
public class C6477a {

    /* renamed from: a */
    private final C6373d f21142a;

    public C6477a(C6373d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("Content length strategy may not be null");
        }
        this.f21142a = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6371b mo22851a(C6503f fVar, C6557n nVar) throws C6547k, IOException {
        C6371b bVar = new C6371b();
        long a = this.f21142a.mo22655a(nVar);
        if (a == -2) {
            bVar.mo22617a(true);
            bVar.mo22653a(-1);
            bVar.mo22654a((InputStream) new C6486e(fVar));
        } else if (a == -1) {
            bVar.mo22617a(false);
            bVar.mo22653a(-1);
            bVar.mo22654a((InputStream) new C6493l(fVar));
        } else {
            bVar.mo22617a(false);
            bVar.mo22653a(a);
            bVar.mo22654a((InputStream) new C6488g(fVar, a));
        }
        C6301c c = nVar.mo22911c("Content-Type");
        if (c != null) {
            bVar.mo22616a(c);
        }
        C6301c c2 = nVar.mo22911c("Content-Encoding");
        if (c2 != null) {
            bVar.mo22618b(c2);
        }
        return bVar;
    }

    /* renamed from: b */
    public C6527i mo22852b(C6503f fVar, C6557n nVar) throws C6547k, IOException {
        if (fVar == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        } else if (nVar != null) {
            return mo22851a(fVar, nVar);
        } else {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
    }
}
