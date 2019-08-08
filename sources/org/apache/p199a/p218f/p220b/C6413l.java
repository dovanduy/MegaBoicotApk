package org.apache.p199a.p218f.p220b;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.p199a.C6247a;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6497g;
import org.apache.p199a.C6534j;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6555l;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6560q;
import org.apache.p199a.C6568y;
import org.apache.p199a.p200a.C6248a;
import org.apache.p199a.p200a.C6252d;
import org.apache.p199a.p200a.C6253e;
import org.apache.p199a.p200a.C6254f;
import org.apache.p199a.p200a.C6256h;
import org.apache.p199a.p200a.C6258j;
import org.apache.p199a.p202b.C6269b;
import org.apache.p199a.p202b.C6292f;
import org.apache.p199a.p202b.C6294h;
import org.apache.p199a.p202b.C6295i;
import org.apache.p199a.p202b.C6296j;
import org.apache.p199a.p202b.C6297k;
import org.apache.p199a.p202b.C6298l;
import org.apache.p199a.p202b.C6299m;
import org.apache.p199a.p202b.C6300n;
import org.apache.p199a.p202b.p204b.C6270a;
import org.apache.p199a.p202b.p204b.C6276g;
import org.apache.p199a.p202b.p205c.C6278a;
import org.apache.p199a.p202b.p207e.C6290b;
import org.apache.p199a.p208c.C6302a;
import org.apache.p199a.p208c.C6304b;
import org.apache.p199a.p208c.C6329e;
import org.apache.p199a.p208c.C6332g;
import org.apache.p199a.p208c.C6334i;
import org.apache.p199a.p208c.C6339n;
import org.apache.p199a.p208c.p210b.C6305a;
import org.apache.p199a.p208c.p210b.C6306b;
import org.apache.p199a.p208c.p210b.C6308d;
import org.apache.p199a.p218f.p221c.C6426d;
import org.apache.p199a.p226h.C6512g;
import org.apache.p199a.p227i.C6530c;
import org.apache.p199a.p227i.C6531d;
import org.apache.p199a.p227i.C6532e;
import org.apache.p199a.p228j.C6539e;
import org.apache.p199a.p228j.C6540f;
import org.apache.p199a.p228j.C6541g;
import org.apache.p199a.p229k.C6551d;

/* renamed from: org.apache.a.f.b.l */
/* compiled from: DefaultRequestDirector */
public class C6413l implements C6299m {

    /* renamed from: a */
    protected final C6304b f21021a;

    /* renamed from: b */
    protected final C6308d f21022b;

    /* renamed from: c */
    protected final C6247a f21023c;

    /* renamed from: d */
    protected final C6332g f21024d;

    /* renamed from: e */
    protected final C6541g f21025e;

    /* renamed from: f */
    protected final C6540f f21026f;

    /* renamed from: g */
    protected final C6294h f21027g;
    @Deprecated

    /* renamed from: h */
    protected final C6297k f21028h = null;

    /* renamed from: i */
    protected final C6298l f21029i;

    /* renamed from: j */
    protected final C6269b f21030j;

    /* renamed from: k */
    protected final C6269b f21031k;

    /* renamed from: l */
    protected final C6300n f21032l;

    /* renamed from: m */
    protected final C6531d f21033m;

    /* renamed from: n */
    protected C6339n f21034n;

    /* renamed from: o */
    protected final C6253e f21035o;

    /* renamed from: p */
    protected final C6253e f21036p;

    /* renamed from: q */
    private final Log f21037q;

    /* renamed from: r */
    private int f21038r;

    /* renamed from: s */
    private int f21039s;

    /* renamed from: t */
    private int f21040t;

    /* renamed from: u */
    private C6555l f21041u;

    public C6413l(Log log, C6541g gVar, C6304b bVar, C6247a aVar, C6332g gVar2, C6308d dVar, C6540f fVar, C6294h hVar, C6298l lVar, C6269b bVar2, C6269b bVar3, C6300n nVar, C6531d dVar2) {
        if (log == null) {
            throw new IllegalArgumentException("Log may not be null.");
        } else if (gVar == null) {
            throw new IllegalArgumentException("Request executor may not be null.");
        } else if (bVar == null) {
            throw new IllegalArgumentException("Client connection manager may not be null.");
        } else if (aVar == null) {
            throw new IllegalArgumentException("Connection reuse strategy may not be null.");
        } else if (gVar2 == null) {
            throw new IllegalArgumentException("Connection keep alive strategy may not be null.");
        } else if (dVar == null) {
            throw new IllegalArgumentException("Route planner may not be null.");
        } else if (fVar == null) {
            throw new IllegalArgumentException("HTTP protocol processor may not be null.");
        } else if (hVar == null) {
            throw new IllegalArgumentException("HTTP request retry handler may not be null.");
        } else if (lVar == null) {
            throw new IllegalArgumentException("Redirect strategy may not be null.");
        } else if (bVar2 == null) {
            throw new IllegalArgumentException("Target authentication handler may not be null.");
        } else if (bVar3 == null) {
            throw new IllegalArgumentException("Proxy authentication handler may not be null.");
        } else if (nVar == null) {
            throw new IllegalArgumentException("User token handler may not be null.");
        } else if (dVar2 == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else {
            this.f21037q = log;
            this.f21025e = gVar;
            this.f21021a = bVar;
            this.f21023c = aVar;
            this.f21024d = gVar2;
            this.f21022b = dVar;
            this.f21026f = fVar;
            this.f21027g = hVar;
            this.f21029i = lVar;
            this.f21030j = bVar2;
            this.f21031k = bVar3;
            this.f21032l = nVar;
            this.f21033m = dVar2;
            this.f21034n = null;
            this.f21038r = 0;
            this.f21039s = 0;
            this.f21040t = this.f21033m.mo23001a("http.protocol.max-redirects", 100);
            this.f21035o = new C6253e();
            this.f21036p = new C6253e();
        }
    }

    /* renamed from: a */
    private C6419q m25384a(C6558o oVar) throws C6568y {
        if (oVar instanceof C6534j) {
            return new C6416o((C6534j) oVar);
        }
        return new C6419q(oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22758a(C6419q qVar, C6306b bVar) throws C6568y {
        try {
            URI h = qVar.mo22452h();
            if (bVar.mo22491d() == null || bVar.mo22492e()) {
                if (h.isAbsolute()) {
                    qVar.mo22767a(C6290b.m24903a(h, (C6555l) null));
                }
            } else if (!h.isAbsolute()) {
                qVar.mo22767a(C6290b.m24903a(h, bVar.mo22486a()));
            }
        } catch (URISyntaxException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid URI: ");
            sb.append(qVar.mo22451g().mo22428c());
            throw new C6568y(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public C6560q mo22463a(C6555l lVar, C6558o oVar, C6539e eVar) throws C6547k, IOException {
        String str;
        C6419q a = m25384a(oVar);
        a.mo22906a(this.f21033m);
        C6306b b = mo22760b(lVar, a, eVar);
        this.f21041u = (C6555l) oVar.mo22915f().mo22751a("http.virtual-host");
        C6420r rVar = new C6420r(a, b);
        long f = (long) C6530c.m25869f(this.f21033m);
        C6560q qVar = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                C6419q a2 = rVar.mo22772a();
                C6306b b2 = rVar.mo22773b();
                Object a3 = eVar.mo22777a("http.user-token");
                if (this.f21034n == null) {
                    C6329e a4 = this.f21021a.mo22479a(b2, a3);
                    if (oVar instanceof C6270a) {
                        ((C6270a) oVar).mo22442a(a4);
                    }
                    this.f21034n = a4.mo22543a(f, TimeUnit.MILLISECONDS);
                    if (C6530c.m25870g(this.f21033m) && this.f21034n.mo22781d()) {
                        this.f21037q.debug("Stale connection check");
                        if (this.f21034n.mo22669e()) {
                            this.f21037q.debug("Stale connection detected");
                            this.f21034n.mo22797c();
                        }
                    }
                }
                if (oVar instanceof C6270a) {
                    ((C6270a) oVar).mo22443a((C6334i) this.f21034n);
                }
                try {
                    m25387a(rVar, eVar);
                    a2.mo22768j();
                    mo22758a(a2, b2);
                    C6555l lVar2 = this.f21041u;
                    if (lVar2 == null) {
                        lVar2 = b2.mo22486a();
                    }
                    C6555l d = b2.mo22491d();
                    eVar.mo22778a("http.target_host", lVar2);
                    eVar.mo22778a("http.proxy_host", d);
                    eVar.mo22778a("http.connection", this.f21034n);
                    eVar.mo22778a("http.auth.target-scope", this.f21035o);
                    eVar.mo22778a("http.auth.proxy-scope", this.f21036p);
                    this.f21025e.mo23020a((C6558o) a2, this.f21026f, eVar);
                    qVar = m25388b(rVar, eVar);
                    if (qVar != null) {
                        qVar.mo22906a(this.f21033m);
                        this.f21025e.mo23021a(qVar, this.f21026f, eVar);
                        z2 = this.f21023c.mo22388a(qVar, eVar);
                        if (z2) {
                            long a5 = this.f21024d.mo22544a(qVar, eVar);
                            if (this.f21037q.isDebugEnabled()) {
                                if (a5 > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("for ");
                                    sb.append(a5);
                                    sb.append(" ");
                                    sb.append(TimeUnit.MILLISECONDS);
                                    str = sb.toString();
                                } else {
                                    str = "indefinitely";
                                }
                                Log log = this.f21037q;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Connection can be kept alive ");
                                sb2.append(str);
                                log.debug(sb2.toString());
                            }
                            this.f21034n.mo22557a(a5, TimeUnit.MILLISECONDS);
                        }
                        C6420r a6 = mo22755a(rVar, qVar, eVar);
                        if (a6 == null) {
                            z = true;
                        } else {
                            if (z2) {
                                C6551d.m25958a(qVar.mo22939b());
                                this.f21034n.mo22563n();
                            } else {
                                this.f21034n.mo22797c();
                            }
                            if (!a6.mo22773b().equals(rVar.mo22773b())) {
                                mo22756a();
                            }
                            rVar = a6;
                        }
                        if (this.f21034n != null && a3 == null) {
                            Object a7 = this.f21032l.mo22464a(eVar);
                            eVar.mo22778a("http.user-token", a7);
                            if (a7 != null) {
                                this.f21034n.mo22558a(a7);
                            }
                        }
                    }
                } catch (C6421s e) {
                    if (this.f21037q.isDebugEnabled()) {
                        this.f21037q.debug(e.getMessage());
                    }
                    qVar = e.mo22774a();
                }
            } catch (InterruptedException e2) {
                InterruptedIOException interruptedIOException = new InterruptedIOException();
                interruptedIOException.initCause(e2);
                throw interruptedIOException;
            } catch (C6426d e3) {
                InterruptedIOException interruptedIOException2 = new InterruptedIOException("Connection has been shut down");
                interruptedIOException2.initCause(e3);
                throw interruptedIOException2;
            } catch (C6547k e4) {
                m25389b();
                throw e4;
            } catch (IOException e5) {
                m25389b();
                throw e5;
            } catch (RuntimeException e6) {
                m25389b();
                throw e6;
            }
        }
        if (!(qVar == null || qVar.mo22939b() == null)) {
            if (qVar.mo22939b().mo22651g()) {
                qVar.mo22938a(new C6302a(qVar.mo22939b(), this.f21034n, z2));
                return qVar;
            }
        }
        if (z2) {
            this.f21034n.mo22563n();
        }
        mo22756a();
        return qVar;
    }

    /* renamed from: a */
    private void m25387a(C6420r rVar, C6539e eVar) throws C6547k, IOException {
        C6306b b = rVar.mo22773b();
        int i = 0;
        while (true) {
            i++;
            try {
                if (!this.f21034n.mo22781d()) {
                    this.f21034n.mo22559a(b, eVar, this.f21033m);
                } else {
                    this.f21034n.mo22780b(C6530c.m25860a(this.f21033m));
                }
                mo22757a(b, eVar);
                return;
            } catch (IOException e) {
                try {
                    this.f21034n.mo22797c();
                } catch (IOException unused) {
                }
                if (this.f21027g.mo22460a(e, i, eVar)) {
                    if (this.f21037q.isInfoEnabled()) {
                        Log log = this.f21037q;
                        StringBuilder sb = new StringBuilder();
                        sb.append("I/O exception (");
                        sb.append(e.getClass().getName());
                        sb.append(") caught when connecting to the target host: ");
                        sb.append(e.getMessage());
                        log.info(sb.toString());
                    }
                    if (this.f21037q.isDebugEnabled()) {
                        this.f21037q.debug(e.getMessage(), e);
                    }
                    this.f21037q.info("Retrying connect");
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: b */
    private C6560q m25388b(C6420r rVar, C6539e eVar) throws C6547k, IOException {
        C6419q a = rVar.mo22772a();
        C6306b b = rVar.mo22773b();
        IOException e = null;
        while (true) {
            this.f21038r++;
            a.mo22771m();
            if (!a.mo22764i()) {
                this.f21037q.debug("Cannot retry non-repeatable request");
                if (e != null) {
                    throw new C6295i("Cannot retry request with a non-repeatable request entity.  The cause lists the reason the original request failed.", e);
                }
                throw new C6295i("Cannot retry request with a non-repeatable request entity.");
            }
            try {
                if (!this.f21034n.mo22781d()) {
                    if (!b.mo22492e()) {
                        this.f21037q.debug("Reopening the direct connection.");
                        this.f21034n.mo22559a(b, eVar, this.f21033m);
                    } else {
                        this.f21037q.debug("Proxied connection. Need to start over.");
                        return null;
                    }
                }
                if (this.f21037q.isDebugEnabled()) {
                    Log log = this.f21037q;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Attempt ");
                    sb.append(this.f21038r);
                    sb.append(" to execute request");
                    log.debug(sb.toString());
                }
                return this.f21025e.mo23019a((C6558o) a, (C6497g) this.f21034n, eVar);
            } catch (IOException e2) {
                e = e2;
                this.f21037q.debug("Closing the connection.");
                try {
                    this.f21034n.mo22797c();
                } catch (IOException unused) {
                }
                if (this.f21027g.mo22460a(e, a.mo22770l(), eVar)) {
                    if (this.f21037q.isInfoEnabled()) {
                        Log log2 = this.f21037q;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("I/O exception (");
                        sb2.append(e.getClass().getName());
                        sb2.append(") caught when processing request: ");
                        sb2.append(e.getMessage());
                        log2.info(sb2.toString());
                    }
                    if (this.f21037q.isDebugEnabled()) {
                        this.f21037q.debug(e.getMessage(), e);
                    }
                    this.f21037q.info("Retrying request");
                } else {
                    throw e;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22756a() {
        try {
            this.f21034n.mo22475i();
        } catch (IOException e) {
            this.f21037q.debug("IOException releasing connection", e);
        }
        this.f21034n = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C6306b mo22760b(C6555l lVar, C6558o oVar, C6539e eVar) throws C6547k {
        if (lVar == null) {
            lVar = (C6555l) oVar.mo22915f().mo22751a("http.default-host");
        }
        if (lVar != null) {
            return this.f21022b.mo22498a(lVar, oVar, eVar);
        }
        throw new IllegalStateException("Target host must not be null, or set in parameters.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22757a(C6306b bVar, C6539e eVar) throws C6547k, IOException {
        int a;
        C6305a aVar = new C6305a();
        do {
            C6306b l = this.f21034n.mo22555l();
            a = aVar.mo22483a(bVar, l);
            switch (a) {
                case -1:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to establish route: planned = ");
                    sb.append(bVar);
                    sb.append("; current = ");
                    sb.append(l);
                    throw new C6547k(sb.toString());
                case 0:
                    break;
                case 1:
                case 2:
                    this.f21034n.mo22559a(bVar, eVar, this.f21033m);
                    continue;
                case 3:
                    boolean b = mo22761b(bVar, eVar);
                    this.f21037q.debug("Tunnel to target created.");
                    this.f21034n.mo22562a(b, this.f21033m);
                    continue;
                case 4:
                    int c = l.mo22489c() - 1;
                    boolean a2 = mo22759a(bVar, c, eVar);
                    this.f21037q.debug("Tunnel to proxy created.");
                    this.f21034n.mo22561a(bVar.mo22487a(c), a2, this.f21033m);
                    continue;
                case 5:
                    this.f21034n.mo22560a(eVar, this.f21033m);
                    continue;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown step indicator ");
                    sb2.append(a);
                    sb2.append(" from RouteDirector.");
                    throw new IllegalStateException(sb2.toString());
            }
        } while (a > 0);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0166  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo22761b(org.apache.p199a.p208c.p210b.C6306b r18, org.apache.p199a.p228j.C6539e r19) throws org.apache.p199a.C6547k, java.io.IOException {
        /*
            r17 = this;
            r7 = r17
            r8 = r19
            org.apache.a.l r9 = r18.mo22491d()
            org.apache.a.l r10 = r18.mo22486a()
            r11 = 0
            r12 = 0
            r2 = r11
            r1 = r12
        L_0x0010:
            if (r1 != 0) goto L_0x012b
            org.apache.a.c.n r1 = r7.f21034n
            boolean r1 = r1.mo22781d()
            if (r1 != 0) goto L_0x0024
            org.apache.a.c.n r1 = r7.f21034n
            org.apache.a.i.d r2 = r7.f21033m
            r14 = r18
            r1.mo22559a(r14, r8, r2)
            goto L_0x0026
        L_0x0024:
            r14 = r18
        L_0x0026:
            org.apache.a.o r1 = r17.mo22762c(r18, r19)
            org.apache.a.i.d r2 = r7.f21033m
            r1.mo22906a(r2)
            java.lang.String r2 = "http.target_host"
            r8.mo22778a(r2, r10)
            java.lang.String r2 = "http.proxy_host"
            r8.mo22778a(r2, r9)
            java.lang.String r2 = "http.connection"
            org.apache.a.c.n r3 = r7.f21034n
            r8.mo22778a(r2, r3)
            java.lang.String r2 = "http.auth.target-scope"
            org.apache.a.a.e r3 = r7.f21035o
            r8.mo22778a(r2, r3)
            java.lang.String r2 = "http.auth.proxy-scope"
            org.apache.a.a.e r3 = r7.f21036p
            r8.mo22778a(r2, r3)
            java.lang.String r2 = "http.request"
            r8.mo22778a(r2, r1)
            org.apache.a.j.g r2 = r7.f21025e
            org.apache.a.j.f r3 = r7.f21026f
            r2.mo23020a(r1, r3, r8)
            org.apache.a.j.g r2 = r7.f21025e
            org.apache.a.c.n r3 = r7.f21034n
            org.apache.a.q r15 = r2.mo23019a(r1, r3, r8)
            org.apache.a.i.d r1 = r7.f21033m
            r15.mo22906a(r1)
            org.apache.a.j.g r1 = r7.f21025e
            org.apache.a.j.f r2 = r7.f21026f
            r1.mo23021a(r15, r2, r8)
            org.apache.a.ac r1 = r15.mo22937a()
            int r1 = r1.mo22430b()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 >= r2) goto L_0x0095
            org.apache.a.k r1 = new org.apache.a.k
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected response to CONNECT request: "
            r2.append(r3)
            org.apache.a.ac r3 = r15.mo22937a()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0095:
            java.lang.String r1 = "http.auth.credentials-provider"
            java.lang.Object r1 = r8.mo22777a(r1)
            r6 = r1
            org.apache.a.b.f r6 = (org.apache.p199a.p202b.C6292f) r6
            if (r6 == 0) goto L_0x0127
            org.apache.a.i.d r1 = r7.f21033m
            boolean r1 = org.apache.p199a.p202b.p205c.C6278a.m24883b(r1)
            if (r1 == 0) goto L_0x0127
            org.apache.a.b.b r1 = r7.f21031k
            boolean r1 = r1.mo22440a(r15, r8)
            if (r1 == 0) goto L_0x0122
            org.apache.commons.logging.Log r1 = r7.f21037q
            java.lang.String r2 = "Proxy requested authentication"
            r1.debug(r2)
            org.apache.a.b.b r1 = r7.f21031k
            java.util.Map r2 = r1.mo22441b(r15, r8)
            org.apache.a.a.e r3 = r7.f21036p     // Catch:{ f -> 0x00cb }
            org.apache.a.b.b r4 = r7.f21031k     // Catch:{ f -> 0x00cb }
            r1 = r7
            r5 = r15
            r13 = r6
            r6 = r8
            r1.m25385a(r2, r3, r4, r5, r6)     // Catch:{ f -> 0x00c9 }
            goto L_0x00f1
        L_0x00c9:
            r0 = move-exception
            goto L_0x00cd
        L_0x00cb:
            r0 = move-exception
            r13 = r6
        L_0x00cd:
            r1 = r0
            org.apache.commons.logging.Log r2 = r7.f21037q
            boolean r2 = r2.isWarnEnabled()
            if (r2 == 0) goto L_0x00f1
            org.apache.commons.logging.Log r2 = r7.f21037q
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Authentication error: "
            r3.append(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.warn(r1)
            goto L_0x012c
        L_0x00f1:
            org.apache.a.a.e r1 = r7.f21036p
            r7.m25386a(r1, r9, r13)
            org.apache.a.a.e r1 = r7.f21036p
            org.apache.a.a.h r1 = r1.mo22408d()
            if (r1 == 0) goto L_0x011d
            org.apache.a.a r1 = r7.f21023c
            boolean r1 = r1.mo22388a(r15, r8)
            if (r1 == 0) goto L_0x0115
            org.apache.commons.logging.Log r1 = r7.f21037q
            java.lang.String r2 = "Connection kept alive"
            r1.debug(r2)
            org.apache.a.i r1 = r15.mo22939b()
            org.apache.p199a.p229k.C6551d.m25958a(r1)
            goto L_0x011a
        L_0x0115:
            org.apache.a.c.n r1 = r7.f21034n
            r1.mo22797c()
        L_0x011a:
            r16 = r12
            goto L_0x011f
        L_0x011d:
            r16 = 1
        L_0x011f:
            r1 = r16
            goto L_0x0128
        L_0x0122:
            org.apache.a.a.e r1 = r7.f21036p
            r1.mo22404a(r11)
        L_0x0127:
            r1 = 1
        L_0x0128:
            r2 = r15
            goto L_0x0010
        L_0x012b:
            r15 = r2
        L_0x012c:
            org.apache.a.ac r1 = r15.mo22937a()
            int r1 = r1.mo22430b()
            r2 = 299(0x12b, float:4.19E-43)
            if (r1 <= r2) goto L_0x0166
            org.apache.a.i r1 = r15.mo22939b()
            if (r1 == 0) goto L_0x0146
            org.apache.a.e.c r2 = new org.apache.a.e.c
            r2.<init>(r1)
            r15.mo22938a(r2)
        L_0x0146:
            org.apache.a.c.n r1 = r7.f21034n
            r1.mo22797c()
            org.apache.a.f.b.s r1 = new org.apache.a.f.b.s
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CONNECT refused by proxy: "
            r2.append(r3)
            org.apache.a.ac r3 = r15.mo22937a()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r15)
            throw r1
        L_0x0166:
            org.apache.a.c.n r1 = r7.f21034n
            r1.mo22563n()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.p199a.p218f.p220b.C6413l.mo22761b(org.apache.a.c.b.b, org.apache.a.j.e):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo22759a(C6306b bVar, int i, C6539e eVar) throws C6547k, IOException {
        throw new C6547k("Proxy chains are not supported.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C6558o mo22762c(C6306b bVar, C6539e eVar) {
        C6555l a = bVar.mo22486a();
        String a2 = a.mo23058a();
        int b = a.mo23059b();
        if (b < 0) {
            b = this.f21021a.mo22478a().mo22524a(a.mo23060c()).mo22516a();
        }
        StringBuilder sb = new StringBuilder(a2.length() + 6);
        sb.append(a2);
        sb.append(':');
        sb.append(Integer.toString(b));
        return new C6512g("CONNECT", sb.toString(), C6532e.m25882b(this.f21033m));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C6420r mo22755a(C6420r rVar, C6560q qVar, C6539e eVar) throws C6547k, IOException {
        C6306b b = rVar.mo22773b();
        C6419q a = rVar.mo22772a();
        C6531d f = a.mo22915f();
        if (!C6278a.m24882a(f) || !this.f21029i.mo22461a(a, qVar, eVar)) {
            C6292f fVar = (C6292f) eVar.mo22777a("http.auth.credentials-provider");
            if (fVar != null && C6278a.m24883b(f)) {
                if (this.f21030j.mo22440a(qVar, eVar)) {
                    C6555l lVar = (C6555l) eVar.mo22777a("http.target_host");
                    if (lVar == null) {
                        lVar = b.mo22486a();
                    }
                    this.f21037q.debug("Target requested authentication");
                    try {
                        m25385a(this.f21030j.mo22441b(qVar, eVar), this.f21035o, this.f21030j, qVar, eVar);
                    } catch (C6254f e) {
                        if (this.f21037q.isWarnEnabled()) {
                            Log log = this.f21037q;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Authentication error: ");
                            sb.append(e.getMessage());
                            log.warn(sb.toString());
                            return null;
                        }
                    }
                    m25386a(this.f21035o, lVar, fVar);
                    if (this.f21035o.mo22408d() != null) {
                        return rVar;
                    }
                    return null;
                }
                this.f21035o.mo22404a((C6252d) null);
                if (this.f21031k.mo22440a(qVar, eVar)) {
                    C6555l d = b.mo22491d();
                    this.f21037q.debug("Proxy requested authentication");
                    try {
                        m25385a(this.f21031k.mo22441b(qVar, eVar), this.f21036p, this.f21031k, qVar, eVar);
                    } catch (C6254f e2) {
                        if (this.f21037q.isWarnEnabled()) {
                            Log log2 = this.f21037q;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Authentication error: ");
                            sb2.append(e2.getMessage());
                            log2.warn(sb2.toString());
                            return null;
                        }
                    }
                    m25386a(this.f21036p, d, fVar);
                    if (this.f21036p.mo22408d() != null) {
                        return rVar;
                    }
                    return null;
                }
                this.f21036p.mo22404a((C6252d) null);
            }
            return null;
        } else if (this.f21039s >= this.f21040t) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Maximum redirects (");
            sb3.append(this.f21040t);
            sb3.append(") exceeded");
            throw new C6296j(sb3.toString());
        } else {
            this.f21039s++;
            this.f21041u = null;
            C6276g b2 = this.f21029i.mo22462b(a, qVar, eVar);
            b2.mo22907a(a.mo22769k().mo22913d());
            URI h = b2.mo22452h();
            if (h.getHost() == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Redirect URI does not specify a valid host name: ");
                sb4.append(h);
                throw new C6568y(sb4.toString());
            }
            C6555l lVar2 = new C6555l(h.getHost(), h.getPort(), h.getScheme());
            this.f21035o.mo22404a((C6252d) null);
            this.f21036p.mo22404a((C6252d) null);
            if (!b.mo22486a().equals(lVar2)) {
                this.f21035o.mo22402a();
                C6248a c = this.f21036p.mo22407c();
                if (c != null && c.mo22393c()) {
                    this.f21036p.mo22402a();
                }
            }
            C6419q a2 = m25384a(b2);
            a2.mo22906a(f);
            C6306b b3 = mo22760b(lVar2, a2, eVar);
            C6420r rVar2 = new C6420r(a2, b3);
            if (this.f21037q.isDebugEnabled()) {
                Log log3 = this.f21037q;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Redirecting to '");
                sb5.append(h);
                sb5.append("' via ");
                sb5.append(b3);
                log3.debug(sb5.toString());
            }
            return rVar2;
        }
    }

    /* renamed from: b */
    private void m25389b() {
        C6339n nVar = this.f21034n;
        if (nVar != null) {
            this.f21034n = null;
            try {
                nVar.mo22476j();
            } catch (IOException e) {
                if (this.f21037q.isDebugEnabled()) {
                    this.f21037q.debug(e.getMessage(), e);
                }
            }
            try {
                nVar.mo22475i();
            } catch (IOException e2) {
                this.f21037q.debug("Error releasing connection", e2);
            }
        }
    }

    /* renamed from: a */
    private void m25385a(Map<String, C6301c> map, C6253e eVar, C6269b bVar, C6560q qVar, C6539e eVar2) throws C6258j, C6254f {
        C6248a c = eVar.mo22407c();
        if (c == null) {
            c = bVar.mo22439a(map, qVar, eVar2);
            eVar.mo22403a(c);
        }
        String a = c.mo22389a();
        C6301c cVar = (C6301c) map.get(a.toLowerCase(Locale.ENGLISH));
        if (cVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(" authorization challenge expected, but not found");
            throw new C6254f(sb.toString());
        }
        c.mo22391a(cVar);
        this.f21037q.debug("Authorization challenge processed");
    }

    /* renamed from: a */
    private void m25386a(C6253e eVar, C6555l lVar, C6292f fVar) {
        if (eVar.mo22406b()) {
            String a = lVar.mo23058a();
            int b = lVar.mo23059b();
            if (b < 0) {
                b = this.f21021a.mo22478a().mo22526a(lVar).mo22516a();
            }
            C6248a c = eVar.mo22407c();
            C6252d dVar = new C6252d(a, b, c.mo22392b(), c.mo22389a());
            if (this.f21037q.isDebugEnabled()) {
                Log log = this.f21037q;
                StringBuilder sb = new StringBuilder();
                sb.append("Authentication scope: ");
                sb.append(dVar);
                log.debug(sb.toString());
            }
            C6256h d = eVar.mo22408d();
            if (d == null) {
                d = fVar.mo22457a(dVar);
                if (this.f21037q.isDebugEnabled()) {
                    if (d != null) {
                        this.f21037q.debug("Found credentials");
                    } else {
                        this.f21037q.debug("Credentials not found");
                    }
                }
            } else if (c.mo22394d()) {
                this.f21037q.debug("Authentication failed");
                d = null;
            }
            eVar.mo22404a(dVar);
            eVar.mo22405a(d);
        }
    }
}
