package org.apache.p199a.p202b.p205c;

import org.apache.p199a.p227i.C6531d;

/* renamed from: org.apache.a.b.c.a */
/* compiled from: HttpClientParams */
public class C6278a {
    /* renamed from: a */
    public static boolean m24882a(C6531d dVar) {
        if (dVar != null) {
            return dVar.mo23002a("http.protocol.handle-redirects", true);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: b */
    public static boolean m24883b(C6531d dVar) {
        if (dVar != null) {
            return dVar.mo23002a("http.protocol.handle-authentication", true);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: c */
    public static String m24884c(C6531d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        String str = (String) dVar.mo22751a("http.protocol.cookie-policy");
        return str == null ? "best-match" : str;
    }
}
