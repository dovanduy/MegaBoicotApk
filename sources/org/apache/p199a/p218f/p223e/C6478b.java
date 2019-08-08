package org.apache.p199a.p218f.p223e;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.p199a.C6527i;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6557n;
import org.apache.p199a.p215e.C6373d;
import org.apache.p199a.p218f.p224f.C6487f;
import org.apache.p199a.p218f.p224f.C6489h;
import org.apache.p199a.p218f.p224f.C6494m;
import org.apache.p199a.p225g.C6504g;

/* renamed from: org.apache.a.f.e.b */
/* compiled from: EntitySerializer */
public class C6478b {

    /* renamed from: a */
    private final C6373d f21143a;

    public C6478b(C6373d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("Content length strategy may not be null");
        }
        this.f21143a = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public OutputStream mo22853a(C6504g gVar, C6557n nVar) throws C6547k, IOException {
        long a = this.f21143a.mo22655a(nVar);
        if (a == -2) {
            return new C6487f(gVar);
        }
        if (a == -1) {
            return new C6494m(gVar);
        }
        return new C6489h(gVar, a);
    }

    /* renamed from: a */
    public void mo22854a(C6504g gVar, C6557n nVar, C6527i iVar) throws C6547k, IOException {
        if (gVar == null) {
            throw new IllegalArgumentException("Session output buffer may not be null");
        } else if (nVar == null) {
            throw new IllegalArgumentException("HTTP message may not be null");
        } else if (iVar == null) {
            throw new IllegalArgumentException("HTTP entity may not be null");
        } else {
            OutputStream a = mo22853a(gVar, nVar);
            iVar.mo22468a(a);
            a.close();
        }
    }
}
