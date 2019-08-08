package org.apache.p199a.p218f.p221c;

import java.io.IOException;
import org.apache.p199a.C6555l;
import org.apache.p199a.p208c.C6320d;
import org.apache.p199a.p208c.C6340o;
import org.apache.p199a.p208c.p210b.C6306b;
import org.apache.p199a.p208c.p210b.C6312f;
import org.apache.p199a.p227i.C6531d;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.f.c.b */
/* compiled from: AbstractPoolEntry */
public abstract class C6424b {

    /* renamed from: a */
    protected final C6320d f21061a;

    /* renamed from: b */
    protected final C6340o f21062b;

    /* renamed from: c */
    protected volatile C6306b f21063c;

    /* renamed from: d */
    protected volatile Object f21064d;

    /* renamed from: e */
    protected volatile C6312f f21065e;

    protected C6424b(C6320d dVar, C6306b bVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("Connection operator may not be null");
        }
        this.f21061a = dVar;
        this.f21062b = dVar.mo22528a();
        this.f21063c = bVar;
        this.f21065e = null;
    }

    /* renamed from: a */
    public void mo22791a(Object obj) {
        this.f21064d = obj;
    }

    /* renamed from: a */
    public void mo22792a(C6306b bVar, C6539e eVar, C6531d dVar) throws IOException {
        if (bVar == null) {
            throw new IllegalArgumentException("Route must not be null.");
        } else if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (this.f21065e == null || !this.f21065e.mo22505d()) {
            this.f21065e = new C6312f(bVar);
            C6555l d = bVar.mo22491d();
            this.f21061a.mo22529a(this.f21062b, d != null ? d : bVar.mo22486a(), bVar.mo22488b(), eVar, dVar);
            C6312f fVar = this.f21065e;
            if (fVar == null) {
                throw new IOException("Request aborted");
            } else if (d == null) {
                fVar.mo22500a(this.f21062b.mo22567i());
            } else {
                fVar.mo22499a(d, this.f21062b.mo22567i());
            }
        } else {
            throw new IllegalStateException("Connection already open.");
        }
    }

    /* renamed from: a */
    public void mo22795a(boolean z, C6531d dVar) throws IOException {
        if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (this.f21065e == null || !this.f21065e.mo22505d()) {
            throw new IllegalStateException("Connection not open.");
        } else if (this.f21065e.mo22492e()) {
            throw new IllegalStateException("Connection is already tunnelled.");
        } else {
            this.f21062b.mo22565a(null, this.f21065e.mo22486a(), z, dVar);
            this.f21065e.mo22502b(z);
        }
    }

    /* renamed from: a */
    public void mo22794a(C6555l lVar, boolean z, C6531d dVar) throws IOException {
        if (lVar == null) {
            throw new IllegalArgumentException("Next proxy must not be null.");
        } else if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (this.f21065e == null || !this.f21065e.mo22505d()) {
            throw new IllegalStateException("Connection not open.");
        } else {
            this.f21062b.mo22565a(null, lVar, z, dVar);
            this.f21065e.mo22501b(lVar, z);
        }
    }

    /* renamed from: a */
    public void mo22793a(C6539e eVar, C6531d dVar) throws IOException {
        if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (this.f21065e == null || !this.f21065e.mo22505d()) {
            throw new IllegalStateException("Connection not open.");
        } else if (!this.f21065e.mo22492e()) {
            throw new IllegalStateException("Protocol layering without a tunnel not supported.");
        } else if (this.f21065e.mo22494f()) {
            throw new IllegalStateException("Multiple protocol layering not supported.");
        } else {
            this.f21061a.mo22530a(this.f21062b, this.f21065e.mo22486a(), eVar, dVar);
            this.f21065e.mo22503c(this.f21062b.mo22567i());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22790a() {
        this.f21065e = null;
        this.f21064d = null;
    }
}
