package org.apache.p199a.p218f.p220b;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6555l;
import org.apache.p199a.C6558o;
import org.apache.p199a.C6560q;
import org.apache.p199a.C6568y;
import org.apache.p199a.p202b.C6277c;
import org.apache.p199a.p202b.C6298l;
import org.apache.p199a.p202b.p204b.C6272c;
import org.apache.p199a.p202b.p204b.C6273d;
import org.apache.p199a.p202b.p204b.C6276g;
import org.apache.p199a.p202b.p207e.C6290b;
import org.apache.p199a.p227i.C6531d;
import org.apache.p199a.p228j.C6539e;

/* renamed from: org.apache.a.f.b.k */
/* compiled from: DefaultRedirectStrategy */
public class C6412k implements C6298l {

    /* renamed from: a */
    private final Log f21020a = LogFactory.getLog(getClass());

    /* renamed from: a */
    public boolean mo22461a(C6558o oVar, C6560q qVar, C6539e eVar) throws C6568y {
        if (qVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        int b = qVar.mo22937a().mo22430b();
        String a = oVar.mo22451g().mo22426a();
        C6301c c = qVar.mo22911c("location");
        boolean z = true;
        if (b != 307) {
            switch (b) {
                case 301:
                    break;
                case 302:
                    if ((!a.equalsIgnoreCase("GET") && !a.equalsIgnoreCase("HEAD")) || c == null) {
                        z = false;
                    }
                    return z;
                case 303:
                    return true;
                default:
                    return false;
            }
        }
        if (!a.equalsIgnoreCase("GET") && !a.equalsIgnoreCase("HEAD")) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public URI mo22754c(C6558o oVar, C6560q qVar, C6539e eVar) throws C6568y {
        URI uri;
        if (qVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        C6301c c = qVar.mo22911c("location");
        if (c == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Received redirect response ");
            sb.append(qVar.mo22937a());
            sb.append(" but no location header");
            throw new C6568y(sb.toString());
        }
        String d = c.mo22466d();
        if (this.f21020a.isDebugEnabled()) {
            Log log = this.f21020a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Redirect requested to location '");
            sb2.append(d);
            sb2.append("'");
            log.debug(sb2.toString());
        }
        URI a = mo22753a(d);
        C6531d f = qVar.mo22915f();
        if (!a.isAbsolute()) {
            if (f.mo23005b("http.protocol.reject-relative-redirect")) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Relative redirect location '");
                sb3.append(a);
                sb3.append("' not allowed");
                throw new C6568y(sb3.toString());
            }
            C6555l lVar = (C6555l) eVar.mo22777a("http.target_host");
            if (lVar == null) {
                throw new IllegalStateException("Target host not available in the HTTP context");
            }
            try {
                a = C6290b.m24902a(C6290b.m24904a(new URI(oVar.mo22451g().mo22428c()), lVar, true), a);
            } catch (URISyntaxException e) {
                throw new C6568y(e.getMessage(), e);
            }
        }
        if (f.mo23006c("http.protocol.allow-circular-redirects")) {
            C6418p pVar = (C6418p) eVar.mo22777a("http.protocol.redirect-locations");
            if (pVar == null) {
                pVar = new C6418p();
                eVar.mo22778a("http.protocol.redirect-locations", pVar);
            }
            if (a.getFragment() != null) {
                try {
                    uri = C6290b.m24904a(a, new C6555l(a.getHost(), a.getPort(), a.getScheme()), true);
                } catch (URISyntaxException e2) {
                    throw new C6568y(e2.getMessage(), e2);
                }
            } else {
                uri = a;
            }
            if (pVar.mo22765a(uri)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Circular redirect to '");
                sb4.append(uri);
                sb4.append("'");
                throw new C6277c(sb4.toString());
            }
            pVar.mo22766b(uri);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public URI mo22753a(String str) throws C6568y {
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid redirect URI: ");
            sb.append(str);
            throw new C6568y(sb.toString(), e);
        }
    }

    /* renamed from: b */
    public C6276g mo22462b(C6558o oVar, C6560q qVar, C6539e eVar) throws C6568y {
        URI c = mo22754c(oVar, qVar, eVar);
        if (oVar.mo22451g().mo22426a().equalsIgnoreCase("HEAD")) {
            return new C6273d(c);
        }
        return new C6272c(c);
    }
}
