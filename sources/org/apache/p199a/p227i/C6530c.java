package org.apache.p199a.p227i;

/* renamed from: org.apache.a.i.c */
/* compiled from: HttpConnectionParams */
public final class C6530c {
    /* renamed from: a */
    public static int m25860a(C6531d dVar) {
        if (dVar != null) {
            return dVar.mo23001a("http.socket.timeout", 0);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: a */
    public static void m25861a(C6531d dVar, int i) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        dVar.mo23003b("http.socket.timeout", i);
    }

    /* renamed from: b */
    public static boolean m25864b(C6531d dVar) {
        if (dVar != null) {
            return dVar.mo23002a("http.socket.reuseaddr", false);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: c */
    public static boolean m25866c(C6531d dVar) {
        if (dVar != null) {
            return dVar.mo23002a("http.tcp.nodelay", true);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: a */
    public static void m25862a(C6531d dVar, boolean z) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        dVar.mo23004b("http.tcp.nodelay", z);
    }

    /* renamed from: d */
    public static int m25867d(C6531d dVar) {
        if (dVar != null) {
            return dVar.mo23001a("http.socket.buffer-size", -1);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: b */
    public static void m25863b(C6531d dVar, int i) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        dVar.mo23003b("http.socket.buffer-size", i);
    }

    /* renamed from: e */
    public static int m25868e(C6531d dVar) {
        if (dVar != null) {
            return dVar.mo23001a("http.socket.linger", -1);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: f */
    public static int m25869f(C6531d dVar) {
        if (dVar != null) {
            return dVar.mo23001a("http.connection.timeout", 0);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: c */
    public static void m25865c(C6531d dVar, int i) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        dVar.mo23003b("http.connection.timeout", i);
    }

    /* renamed from: g */
    public static boolean m25870g(C6531d dVar) {
        if (dVar != null) {
            return dVar.mo23002a("http.connection.stalecheck", true);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}
