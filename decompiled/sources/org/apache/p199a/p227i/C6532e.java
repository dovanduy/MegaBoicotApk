package org.apache.p199a.p227i;

import com.google.android.exoplayer2.C2793C;
import org.apache.p199a.C6563t;
import org.apache.p199a.C6569z;

/* renamed from: org.apache.a.i.e */
/* compiled from: HttpProtocolParams */
public final class C6532e {
    /* renamed from: a */
    public static String m25879a(C6531d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        String str = (String) dVar.mo22751a("http.protocol.element-charset");
        return str == null ? C2793C.ASCII_NAME : str;
    }

    /* renamed from: a */
    public static void m25880a(C6531d dVar, String str) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        dVar.mo22752a("http.protocol.content-charset", (Object) str);
    }

    /* renamed from: b */
    public static C6569z m25882b(C6531d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        Object a = dVar.mo22751a("http.protocol.version");
        if (a == null) {
            return C6563t.f21278c;
        }
        return (C6569z) a;
    }

    /* renamed from: a */
    public static void m25881a(C6531d dVar, C6569z zVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        dVar.mo22752a("http.protocol.version", (Object) zVar);
    }

    /* renamed from: c */
    public static String m25884c(C6531d dVar) {
        if (dVar != null) {
            return (String) dVar.mo22751a("http.useragent");
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: b */
    public static void m25883b(C6531d dVar, String str) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        dVar.mo22752a("http.useragent", (Object) str);
    }

    /* renamed from: d */
    public static boolean m25885d(C6531d dVar) {
        if (dVar != null) {
            return dVar.mo23002a("http.protocol.expect-continue", false);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}
