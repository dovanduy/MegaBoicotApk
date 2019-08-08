package org.apache.p199a.p208c.p209a;

import java.net.InetAddress;
import org.apache.p199a.C6555l;
import org.apache.p199a.p208c.p210b.C6306b;
import org.apache.p199a.p227i.C6531d;

/* renamed from: org.apache.a.c.a.a */
/* compiled from: ConnRouteParams */
public class C6303a {

    /* renamed from: a */
    public static final C6555l f20830a = new C6555l("127.0.0.255", 0, "no-host");

    /* renamed from: b */
    public static final C6306b f20831b = new C6306b(f20830a);

    /* renamed from: a */
    public static C6555l m24932a(C6531d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        C6555l lVar = (C6555l) dVar.mo22751a("http.route.default-proxy");
        if (lVar == null || !f20830a.equals(lVar)) {
            return lVar;
        }
        return null;
    }

    /* renamed from: b */
    public static C6306b m24933b(C6531d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        C6306b bVar = (C6306b) dVar.mo22751a("http.route.forced-route");
        if (bVar == null || !f20831b.equals(bVar)) {
            return bVar;
        }
        return null;
    }

    /* renamed from: c */
    public static InetAddress m24934c(C6531d dVar) {
        if (dVar != null) {
            return (InetAddress) dVar.mo22751a("http.route.local-address");
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }
}
