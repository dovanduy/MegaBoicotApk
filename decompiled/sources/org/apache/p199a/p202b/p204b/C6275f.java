package org.apache.p199a.p202b.p204b;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.p199a.C6262ab;
import org.apache.p199a.C6569z;
import org.apache.p199a.p202b.p207e.C6289a;
import org.apache.p199a.p208c.C6329e;
import org.apache.p199a.p208c.C6334i;
import org.apache.p199a.p226h.C6506a;
import org.apache.p199a.p226h.C6518m;
import org.apache.p199a.p226h.C6522q;
import org.apache.p199a.p227i.C6531d;
import org.apache.p199a.p227i.C6532e;

/* renamed from: org.apache.a.b.b.f */
/* compiled from: HttpRequestBase */
public abstract class C6275f extends C6506a implements Cloneable, C6270a, C6276g {

    /* renamed from: c */
    private Lock f20816c = new ReentrantLock();

    /* renamed from: d */
    private boolean f20817d;

    /* renamed from: e */
    private URI f20818e;

    /* renamed from: f */
    private C6329e f20819f;

    /* renamed from: g */
    private C6334i f20820g;

    /* renamed from: E_ */
    public abstract String mo22448E_();

    /* renamed from: c */
    public C6569z mo22450c() {
        return C6532e.m25882b(mo22915f());
    }

    /* renamed from: h */
    public URI mo22452h() {
        return this.f20818e;
    }

    /* renamed from: g */
    public C6262ab mo22451g() {
        String E_ = mo22448E_();
        C6569z c = mo22450c();
        URI h = mo22452h();
        String aSCIIString = h != null ? h.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.length() == 0) {
            aSCIIString = "/";
        }
        return new C6518m(E_, aSCIIString, c);
    }

    /* renamed from: a */
    public void mo22449a(URI uri) {
        this.f20818e = uri;
    }

    /* renamed from: a */
    public void mo22442a(C6329e eVar) throws IOException {
        this.f20816c.lock();
        try {
            if (this.f20817d) {
                throw new IOException("Request already aborted");
            }
            this.f20820g = null;
            this.f20819f = eVar;
        } finally {
            this.f20816c.unlock();
        }
    }

    /* renamed from: a */
    public void mo22443a(C6334i iVar) throws IOException {
        this.f20816c.lock();
        try {
            if (this.f20817d) {
                throw new IOException("Request already aborted");
            }
            this.f20819f = null;
            this.f20820g = iVar;
        } finally {
            this.f20816c.unlock();
        }
    }

    public Object clone() throws CloneNotSupportedException {
        C6275f fVar = (C6275f) super.clone();
        fVar.f20816c = new ReentrantLock();
        fVar.f20817d = false;
        fVar.f20820g = null;
        fVar.f20819f = null;
        fVar.f21204a = (C6522q) C6289a.m24899a(this.f21204a);
        fVar.f21205b = (C6531d) C6289a.m24899a(this.f21205b);
        return fVar;
    }
}
