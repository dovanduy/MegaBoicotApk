package org.apache.p199a.p218f.p221c;

import java.io.IOException;
import org.apache.p199a.C6555l;
import org.apache.p199a.p208c.C6304b;
import org.apache.p199a.p208c.C6340o;
import org.apache.p199a.p208c.p210b.C6306b;
import org.apache.p199a.p227i.C6531d;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.f.c.c */
/* compiled from: AbstractPooledConnAdapter */
public abstract class C6425c extends C6423a {

    /* renamed from: a */
    protected volatile C6424b f21066a;

    protected C6425c(C6304b bVar, C6424b bVar2) {
        super(bVar, bVar2.f21062b);
        this.f21066a = bVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public C6424b mo22799u() {
        return this.f21066a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22796a(C6424b bVar) {
        if (mo22787r() || bVar == null) {
            throw new C6426d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public synchronized void mo22784o() {
        this.f21066a = null;
        super.mo22784o();
    }

    /* renamed from: l */
    public C6306b mo22555l() {
        C6424b u = mo22799u();
        mo22796a(u);
        if (u.f21065e == null) {
            return null;
        }
        return u.f21065e.mo22507h();
    }

    /* renamed from: a */
    public void mo22559a(C6306b bVar, C6539e eVar, C6531d dVar) throws IOException {
        C6424b u = mo22799u();
        mo22796a(u);
        u.mo22792a(bVar, eVar, dVar);
    }

    /* renamed from: a */
    public void mo22562a(boolean z, C6531d dVar) throws IOException {
        C6424b u = mo22799u();
        mo22796a(u);
        u.mo22795a(z, dVar);
    }

    /* renamed from: a */
    public void mo22561a(C6555l lVar, boolean z, C6531d dVar) throws IOException {
        C6424b u = mo22799u();
        mo22796a(u);
        u.mo22794a(lVar, z, dVar);
    }

    /* renamed from: a */
    public void mo22560a(C6539e eVar, C6531d dVar) throws IOException {
        C6424b u = mo22799u();
        mo22796a(u);
        u.mo22793a(eVar, dVar);
    }

    /* renamed from: c */
    public void mo22797c() throws IOException {
        C6424b u = mo22799u();
        if (u != null) {
            u.mo22790a();
        }
        C6340o p = mo22785p();
        if (p != null) {
            p.mo22797c();
        }
    }

    /* renamed from: f */
    public void mo22798f() throws IOException {
        C6424b u = mo22799u();
        if (u != null) {
            u.mo22790a();
        }
        C6340o p = mo22785p();
        if (p != null) {
            p.mo22798f();
        }
    }

    /* renamed from: a */
    public void mo22558a(Object obj) {
        C6424b u = mo22799u();
        mo22796a(u);
        u.mo22791a(obj);
    }
}
