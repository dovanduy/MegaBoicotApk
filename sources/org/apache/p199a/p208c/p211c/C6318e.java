package org.apache.p199a.p208c.p211c;

import java.util.concurrent.ConcurrentHashMap;
import org.apache.p199a.C6555l;

/* renamed from: org.apache.a.c.c.e */
/* compiled from: SchemeRegistry */
public final class C6318e {

    /* renamed from: a */
    private final ConcurrentHashMap<String, C6317d> f20858a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final C6317d mo22524a(String str) {
        C6317d b = mo22527b(str);
        if (b != null) {
            return b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Scheme '");
        sb.append(str);
        sb.append("' not registered.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final C6317d mo22526a(C6555l lVar) {
        if (lVar != null) {
            return mo22524a(lVar.mo23060c());
        }
        throw new IllegalArgumentException("Host must not be null.");
    }

    /* renamed from: b */
    public final C6317d mo22527b(String str) {
        if (str != null) {
            return (C6317d) this.f20858a.get(str);
        }
        throw new IllegalArgumentException("Name must not be null.");
    }

    /* renamed from: a */
    public final C6317d mo22525a(C6317d dVar) {
        if (dVar != null) {
            return (C6317d) this.f20858a.put(dVar.mo22519c(), dVar);
        }
        throw new IllegalArgumentException("Scheme must not be null.");
    }
}
