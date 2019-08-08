package org.apache.p199a.p228j;

import java.io.IOException;
import java.net.ProtocolException;
import org.apache.p199a.C6497g;
import org.apache.p199a.C6534j;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6560q;
import org.apache.p199a.C6563t;
import org.apache.p199a.C6569z;

/* renamed from: org.apache.a.j.g */
/* compiled from: HttpRequestExecutor */
public class C6541g {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo23022a(C6558o oVar, C6560q qVar) {
        boolean z = false;
        if ("HEAD".equalsIgnoreCase(oVar.mo22451g().mo22426a())) {
            return false;
        }
        int b = qVar.mo22937a().mo22430b();
        if (!(b < 200 || b == 204 || b == 304 || b == 205)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public C6560q mo23019a(C6558o oVar, C6497g gVar, C6539e eVar) throws IOException, C6547k {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (gVar == null) {
            throw new IllegalArgumentException("Client connection may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else {
            try {
                C6560q b = mo23023b(oVar, gVar, eVar);
                return b == null ? mo23024c(oVar, gVar, eVar) : b;
            } catch (IOException e) {
                m25908a(gVar);
                throw e;
            } catch (C6547k e2) {
                m25908a(gVar);
                throw e2;
            } catch (RuntimeException e3) {
                m25908a(gVar);
                throw e3;
            }
        }
    }

    /* renamed from: a */
    private static final void m25908a(C6497g gVar) {
        try {
            gVar.mo22797c();
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public void mo23020a(C6558o oVar, C6540f fVar, C6539e eVar) throws C6547k, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (fVar == null) {
            throw new IllegalArgumentException("HTTP processor may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else {
            eVar.mo22778a("http.request", oVar);
            fVar.mo22453a(oVar, eVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C6560q mo23023b(C6558o oVar, C6497g gVar, C6539e eVar) throws IOException, C6547k {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (gVar == null) {
            throw new IllegalArgumentException("HTTP connection may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else {
            eVar.mo22778a("http.connection", gVar);
            eVar.mo22778a("http.request_sent", Boolean.FALSE);
            gVar.mo22665a(oVar);
            C6560q qVar = null;
            if (oVar instanceof C6534j) {
                boolean z = true;
                C6569z b = oVar.mo22451g().mo22427b();
                C6534j jVar = (C6534j) oVar;
                if (jVar.mo22445a() && !b.mo23073c(C6563t.f21277b)) {
                    gVar.mo22668b();
                    if (gVar.mo22667a(oVar.mo22915f().mo23001a("http.protocol.wait-for-continue", 2000))) {
                        C6560q a = gVar.mo22662a();
                        if (mo23022a(oVar, a)) {
                            gVar.mo22666a(a);
                        }
                        int b2 = a.mo22937a().mo22430b();
                        if (b2 >= 200) {
                            z = false;
                            qVar = a;
                        } else if (b2 != 100) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("Unexpected response: ");
                            stringBuffer.append(a.mo22937a());
                            throw new ProtocolException(stringBuffer.toString());
                        }
                    }
                }
                if (z) {
                    gVar.mo22664a(jVar);
                }
            }
            gVar.mo22668b();
            eVar.mo22778a("http.request_sent", Boolean.TRUE);
            return qVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C6560q mo23024c(C6558o oVar, C6497g gVar, C6539e eVar) throws C6547k, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (gVar == null) {
            throw new IllegalArgumentException("HTTP connection may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else {
            C6560q qVar = null;
            int i = 0;
            while (true) {
                if (qVar != null && i >= 200) {
                    return qVar;
                }
                qVar = gVar.mo22662a();
                if (mo23022a(oVar, qVar)) {
                    gVar.mo22666a(qVar);
                }
                i = qVar.mo22937a().mo22430b();
            }
        }
    }

    /* renamed from: a */
    public void mo23021a(C6560q qVar, C6540f fVar, C6539e eVar) throws C6547k, IOException {
        if (qVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        } else if (fVar == null) {
            throw new IllegalArgumentException("HTTP processor may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else {
            eVar.mo22778a("http.response", qVar);
            fVar.mo22454a(qVar, eVar);
        }
    }
}
