package org.apache.p199a.p226h;

import java.util.NoSuchElementException;
import org.apache.p199a.C6266b;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6341d;
import org.apache.p199a.C6355e;
import org.apache.p199a.C6376f;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.h.d */
/* compiled from: BasicHeaderElementIterator */
public class C6509d implements C6355e {

    /* renamed from: a */
    private final C6376f f21211a;

    /* renamed from: b */
    private final C6523r f21212b;

    /* renamed from: c */
    private C6341d f21213c;

    /* renamed from: d */
    private C6549b f21214d;

    /* renamed from: e */
    private C6526u f21215e;

    public C6509d(C6376f fVar, C6523r rVar) {
        this.f21213c = null;
        this.f21214d = null;
        this.f21215e = null;
        if (fVar == null) {
            throw new IllegalArgumentException("Header iterator may not be null");
        } else if (rVar == null) {
            throw new IllegalArgumentException("Parser may not be null");
        } else {
            this.f21211a = fVar;
            this.f21212b = rVar;
        }
    }

    public C6509d(C6376f fVar) {
        this(fVar, C6511f.f21217a);
    }

    /* renamed from: b */
    private void m25756b() {
        this.f21215e = null;
        this.f21214d = null;
        while (this.f21211a.hasNext()) {
            C6301c a = this.f21211a.mo22657a();
            if (a instanceof C6266b) {
                C6266b bVar = (C6266b) a;
                this.f21214d = bVar.mo22434a();
                this.f21215e = new C6526u(0, this.f21214d.mo23052c());
                this.f21215e.mo22997a(bVar.mo22435b());
                return;
            }
            String d = a.mo22466d();
            if (d != null) {
                this.f21214d = new C6549b(d.length());
                this.f21214d.mo23044a(d);
                this.f21215e = new C6526u(0, this.f21214d.mo23052c());
                return;
            }
        }
    }

    /* renamed from: c */
    private void m25757c() {
        C6341d b;
        loop0:
        while (true) {
            if (this.f21211a.hasNext() || this.f21215e != null) {
                if (this.f21215e == null || this.f21215e.mo22999c()) {
                    m25756b();
                }
                if (this.f21215e != null) {
                    while (!this.f21215e.mo22999c()) {
                        b = this.f21212b.mo22933b(this.f21214d, this.f21215e);
                        if (b.mo22569a().length() == 0) {
                            if (b.mo22571b() != null) {
                                break loop0;
                            }
                        } else {
                            break loop0;
                        }
                    }
                    if (this.f21215e.mo22999c()) {
                        this.f21215e = null;
                        this.f21214d = null;
                    }
                }
            } else {
                return;
            }
        }
        this.f21213c = b;
    }

    public boolean hasNext() {
        if (this.f21213c == null) {
            m25757c();
        }
        return this.f21213c != null;
    }

    /* renamed from: a */
    public C6341d mo22613a() throws NoSuchElementException {
        if (this.f21213c == null) {
            m25757c();
        }
        if (this.f21213c == null) {
            throw new NoSuchElementException("No more header elements available");
        }
        C6341d dVar = this.f21213c;
        this.f21213c = null;
        return dVar;
    }

    public final Object next() throws NoSuchElementException {
        return mo22613a();
    }

    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
