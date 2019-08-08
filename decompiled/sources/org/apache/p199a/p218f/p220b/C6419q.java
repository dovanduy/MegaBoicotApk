package org.apache.p199a.p218f.p220b;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.p199a.C6262ab;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6568y;
import org.apache.p199a.C6569z;
import org.apache.p199a.p202b.p204b.C6276g;
import org.apache.p199a.p226h.C6506a;
import org.apache.p199a.p226h.C6518m;
import org.apache.p199a.p227i.C6532e;

/* renamed from: org.apache.a.f.b.q */
/* compiled from: RequestWrapper */
public class C6419q extends C6506a implements C6276g {

    /* renamed from: c */
    private final C6558o f21047c;

    /* renamed from: d */
    private URI f21048d;

    /* renamed from: e */
    private String f21049e;

    /* renamed from: f */
    private C6569z f21050f;

    /* renamed from: g */
    private int f21051g;

    /* renamed from: i */
    public boolean mo22764i() {
        return true;
    }

    public C6419q(C6558o oVar) throws C6568y {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        this.f21047c = oVar;
        mo22906a(oVar.mo22915f());
        mo22907a(oVar.mo22913d());
        if (oVar instanceof C6276g) {
            C6276g gVar = (C6276g) oVar;
            this.f21048d = gVar.mo22452h();
            this.f21049e = gVar.mo22448E_();
            this.f21050f = null;
        } else {
            C6262ab g = oVar.mo22451g();
            try {
                this.f21048d = new URI(g.mo22428c());
                this.f21049e = g.mo22426a();
                this.f21050f = oVar.mo22450c();
            } catch (URISyntaxException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid request URI: ");
                sb.append(g.mo22428c());
                throw new C6568y(sb.toString(), e);
            }
        }
        this.f21051g = 0;
    }

    /* renamed from: j */
    public void mo22768j() {
        this.f21204a.mo22984a();
        mo22907a(this.f21047c.mo22913d());
    }

    /* renamed from: E_ */
    public String mo22448E_() {
        return this.f21049e;
    }

    /* renamed from: c */
    public C6569z mo22450c() {
        if (this.f21050f == null) {
            this.f21050f = C6532e.m25882b(mo22915f());
        }
        return this.f21050f;
    }

    /* renamed from: h */
    public URI mo22452h() {
        return this.f21048d;
    }

    /* renamed from: a */
    public void mo22767a(URI uri) {
        this.f21048d = uri;
    }

    /* renamed from: g */
    public C6262ab mo22451g() {
        String E_ = mo22448E_();
        C6569z c = mo22450c();
        String aSCIIString = this.f21048d != null ? this.f21048d.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.length() == 0) {
            aSCIIString = "/";
        }
        return new C6518m(E_, aSCIIString, c);
    }

    /* renamed from: k */
    public C6558o mo22769k() {
        return this.f21047c;
    }

    /* renamed from: l */
    public int mo22770l() {
        return this.f21051g;
    }

    /* renamed from: m */
    public void mo22771m() {
        this.f21051g++;
    }
}
