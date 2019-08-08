package org.apache.p199a.p218f.p220b;

import java.io.IOException;
import java.net.URI;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.p199a.C6247a;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6555l;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6559p;
import org.apache.p199a.C6560q;
import org.apache.p199a.C6562s;
import org.apache.p199a.p200a.C6250b;
import org.apache.p199a.p200a.C6251c;
import org.apache.p199a.p202b.C6269b;
import org.apache.p199a.p202b.C6279d;
import org.apache.p199a.p202b.C6288e;
import org.apache.p199a.p202b.C6292f;
import org.apache.p199a.p202b.C6293g;
import org.apache.p199a.p202b.C6294h;
import org.apache.p199a.p202b.C6298l;
import org.apache.p199a.p202b.C6299m;
import org.apache.p199a.p202b.C6300n;
import org.apache.p199a.p202b.p204b.C6276g;
import org.apache.p199a.p202b.p207e.C6290b;
import org.apache.p199a.p208c.C6304b;
import org.apache.p199a.p208c.C6313c;
import org.apache.p199a.p208c.C6332g;
import org.apache.p199a.p208c.p210b.C6308d;
import org.apache.p199a.p208c.p211c.C6318e;
import org.apache.p199a.p214d.C6350i;
import org.apache.p199a.p214d.C6351j;
import org.apache.p199a.p218f.C6401b;
import org.apache.p199a.p218f.p219a.C6380c;
import org.apache.p199a.p218f.p219a.C6382e;
import org.apache.p199a.p218f.p219a.C6394j;
import org.apache.p199a.p218f.p219a.C6397l;
import org.apache.p199a.p218f.p221c.C6429g;
import org.apache.p199a.p218f.p221c.C6433k;
import org.apache.p199a.p218f.p221c.C6434l;
import org.apache.p199a.p218f.p222d.C6447ag;
import org.apache.p199a.p218f.p222d.C6459l;
import org.apache.p199a.p218f.p222d.C6461n;
import org.apache.p199a.p218f.p222d.C6468s;
import org.apache.p199a.p218f.p222d.C6472w;
import org.apache.p199a.p218f.p222d.C6475z;
import org.apache.p199a.p227i.C6531d;
import org.apache.p199a.p228j.C6535a;
import org.apache.p199a.p228j.C6536b;
import org.apache.p199a.p228j.C6537c;
import org.apache.p199a.p228j.C6539e;
import org.apache.p199a.p228j.C6540f;
import org.apache.p199a.p228j.C6541g;
import org.apache.p199a.p228j.C6542h;

/* renamed from: org.apache.a.f.b.b */
/* compiled from: AbstractHttpClient */
public abstract class C6403b implements C6293g {

    /* renamed from: a */
    private final Log f20993a = LogFactory.getLog(getClass());

    /* renamed from: b */
    private C6531d f20994b;

    /* renamed from: c */
    private C6541g f20995c;

    /* renamed from: d */
    private C6304b f20996d;

    /* renamed from: e */
    private C6247a f20997e;

    /* renamed from: f */
    private C6332g f20998f;

    /* renamed from: g */
    private C6351j f20999g;

    /* renamed from: h */
    private C6251c f21000h;

    /* renamed from: i */
    private C6536b f21001i;

    /* renamed from: j */
    private C6542h f21002j;

    /* renamed from: k */
    private C6294h f21003k;

    /* renamed from: l */
    private C6298l f21004l;

    /* renamed from: m */
    private C6269b f21005m;

    /* renamed from: n */
    private C6269b f21006n;

    /* renamed from: o */
    private C6288e f21007o;

    /* renamed from: p */
    private C6292f f21008p;

    /* renamed from: q */
    private C6308d f21009q;

    /* renamed from: r */
    private C6300n f21010r;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C6531d mo22723b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C6536b mo22724c();

    protected C6403b(C6304b bVar, C6531d dVar) {
        this.f20994b = dVar;
        this.f20996d = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C6539e mo22725d() {
        C6535a aVar = new C6535a();
        aVar.mo22778a("http.scheme-registry", mo22458a().mo22478a());
        aVar.mo22778a("http.authscheme-registry", mo22741t());
        aVar.mo22778a("http.cookiespec-registry", mo22742u());
        aVar.mo22778a("http.cookie-store", mo22714B());
        aVar.mo22778a("http.auth.credentials-provider", mo22715C());
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C6304b mo22726e() {
        C6313c cVar;
        C6318e a = C6433k.m25505a();
        C6531d r = mo22739r();
        String str = (String) r.mo22751a("http.connection-manager.factory-class-name");
        if (str != null) {
            try {
                cVar = (C6313c) Class.forName(str).newInstance();
            } catch (ClassNotFoundException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid class name: ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            } catch (IllegalAccessException e) {
                throw new IllegalAccessError(e.getMessage());
            } catch (InstantiationException e2) {
                throw new InstantiationError(e2.getMessage());
            }
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.mo22510a(r, a);
        }
        return new C6434l(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C6251c mo22727f() {
        C6251c cVar = new C6251c();
        cVar.mo22397a("Basic", (C6250b) new C6380c());
        cVar.mo22397a("Digest", (C6250b) new C6382e());
        cVar.mo22397a("NTLM", (C6250b) new C6394j());
        cVar.mo22397a("negotiate", (C6250b) new C6397l());
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C6351j mo22728g() {
        C6351j jVar = new C6351j();
        jVar.mo22603a("best-match", (C6350i) new C6459l());
        jVar.mo22603a("compatibility", (C6350i) new C6461n());
        jVar.mo22603a("netscape", (C6350i) new C6472w());
        jVar.mo22603a("rfc2109", (C6350i) new C6475z());
        jVar.mo22603a("rfc2965", (C6350i) new C6447ag());
        jVar.mo22603a("ignoreCookies", (C6350i) new C6468s());
        return jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C6541g mo22729h() {
        return new C6541g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C6247a mo22730i() {
        return new C6401b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C6332g mo22731j() {
        return new C6408g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C6294h mo22732k() {
        return new C6410i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C6269b mo22733l() {
        return new C6414m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C6269b mo22734m() {
        return new C6411j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C6288e mo22735n() {
        return new C6405d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C6292f mo22736o() {
        return new C6406e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C6308d mo22737p() {
        return new C6429g(mo22458a().mo22478a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public C6300n mo22738q() {
        return new C6415n();
    }

    /* renamed from: r */
    public final synchronized C6531d mo22739r() {
        if (this.f20994b == null) {
            this.f20994b = mo22723b();
        }
        return this.f20994b;
    }

    /* renamed from: a */
    public final synchronized C6304b mo22458a() {
        if (this.f20996d == null) {
            this.f20996d = mo22726e();
        }
        return this.f20996d;
    }

    /* renamed from: s */
    public final synchronized C6541g mo22740s() {
        if (this.f20995c == null) {
            this.f20995c = mo22729h();
        }
        return this.f20995c;
    }

    /* renamed from: t */
    public final synchronized C6251c mo22741t() {
        if (this.f21000h == null) {
            this.f21000h = mo22727f();
        }
        return this.f21000h;
    }

    /* renamed from: u */
    public final synchronized C6351j mo22742u() {
        if (this.f20999g == null) {
            this.f20999g = mo22728g();
        }
        return this.f20999g;
    }

    /* renamed from: v */
    public final synchronized C6247a mo22743v() {
        if (this.f20997e == null) {
            this.f20997e = mo22730i();
        }
        return this.f20997e;
    }

    /* renamed from: w */
    public final synchronized C6332g mo22744w() {
        if (this.f20998f == null) {
            this.f20998f = mo22731j();
        }
        return this.f20998f;
    }

    /* renamed from: x */
    public final synchronized C6294h mo22745x() {
        if (this.f21003k == null) {
            this.f21003k = mo22732k();
        }
        return this.f21003k;
    }

    /* renamed from: y */
    public final synchronized C6298l mo22746y() {
        if (this.f21004l == null) {
            this.f21004l = new C6412k();
        }
        return this.f21004l;
    }

    /* renamed from: z */
    public final synchronized C6269b mo22747z() {
        if (this.f21005m == null) {
            this.f21005m = mo22733l();
        }
        return this.f21005m;
    }

    /* renamed from: A */
    public final synchronized C6269b mo22713A() {
        if (this.f21006n == null) {
            this.f21006n = mo22734m();
        }
        return this.f21006n;
    }

    /* renamed from: B */
    public final synchronized C6288e mo22714B() {
        if (this.f21007o == null) {
            this.f21007o = mo22735n();
        }
        return this.f21007o;
    }

    /* renamed from: C */
    public final synchronized C6292f mo22715C() {
        if (this.f21008p == null) {
            this.f21008p = mo22736o();
        }
        return this.f21008p;
    }

    /* renamed from: D */
    public final synchronized C6308d mo22716D() {
        if (this.f21009q == null) {
            this.f21009q = mo22737p();
        }
        return this.f21009q;
    }

    /* renamed from: E */
    public final synchronized C6300n mo22717E() {
        if (this.f21010r == null) {
            this.f21010r = mo22738q();
        }
        return this.f21010r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final synchronized C6536b mo22718F() {
        if (this.f21001i == null) {
            this.f21001i = mo22724c();
        }
        return this.f21001i;
    }

    /* renamed from: G */
    private final synchronized C6540f m25323G() {
        if (this.f21002j == null) {
            C6536b F = mo22718F();
            int a = F.mo23009a();
            C6559p[] pVarArr = new C6559p[a];
            for (int i = 0; i < a; i++) {
                pVarArr[i] = F.mo23010a(i);
            }
            int b = F.mo23014b();
            C6562s[] sVarArr = new C6562s[b];
            for (int i2 = 0; i2 < b; i2++) {
                sVarArr[i2] = F.mo23015b(i2);
            }
            this.f21002j = new C6542h(pVarArr, sVarArr);
        }
        return this.f21002j;
    }

    /* renamed from: a */
    public final C6560q mo22459a(C6276g gVar) throws IOException, C6279d {
        return mo22721a(gVar, null);
    }

    /* renamed from: a */
    public final C6560q mo22721a(C6276g gVar, C6539e eVar) throws IOException, C6279d {
        if (gVar != null) {
            return mo22722a(m25324b(gVar), gVar, eVar);
        }
        throw new IllegalArgumentException("Request must not be null.");
    }

    /* renamed from: b */
    private static C6555l m25324b(C6276g gVar) throws C6279d {
        URI h = gVar.mo22452h();
        if (!h.isAbsolute()) {
            return null;
        }
        C6555l a = C6290b.m24905a(h);
        if (a != null) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("URI does not specify a valid host name: ");
        sb.append(h);
        throw new C6279d(sb.toString());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final C6560q mo22722a(C6555l lVar, C6558o oVar, C6539e eVar) throws IOException, C6279d {
        C6539e eVar2;
        C6539e eVar3;
        C6299m a;
        C6558o oVar2 = oVar;
        C6539e eVar4 = eVar;
        if (oVar2 == null) {
            throw new IllegalArgumentException("Request must not be null.");
        }
        synchronized (this) {
            try {
                C6539e d = mo22725d();
                if (eVar4 == null) {
                    eVar2 = d;
                } else {
                    eVar2 = new C6537c(eVar4, d);
                }
                C6541g s = mo22740s();
                C6304b a2 = mo22458a();
                C6247a v = mo22743v();
                C6332g w = mo22744w();
                C6308d D = mo22716D();
                C6540f G = m25323G();
                C6294h x = mo22745x();
                C6298l y = mo22746y();
                C6269b z = mo22747z();
                C6269b A = mo22713A();
                C6300n E = mo22717E();
                C6531d a3 = mo22720a(oVar2);
                eVar3 = eVar2;
                a = mo22719a(s, a2, v, w, D, G, x, y, z, A, E, a3);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        try {
            return a.mo22463a(lVar, oVar, eVar3);
        } catch (C6547k e) {
            throw new C6279d((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6299m mo22719a(C6541g gVar, C6304b bVar, C6247a aVar, C6332g gVar2, C6308d dVar, C6540f fVar, C6294h hVar, C6298l lVar, C6269b bVar2, C6269b bVar3, C6300n nVar, C6531d dVar2) {
        C6413l lVar2 = new C6413l(this.f20993a, gVar, bVar, aVar, gVar2, dVar, fVar, hVar, lVar, bVar2, bVar3, nVar, dVar2);
        return lVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6531d mo22720a(C6558o oVar) {
        return new C6407f(null, mo22739r(), oVar.mo22915f(), null);
    }
}
