package org.apache.p199a.p214d;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.p199a.p227i.C6531d;

/* renamed from: org.apache.a.d.j */
/* compiled from: CookieSpecRegistry */
public final class C6351j {

    /* renamed from: a */
    private final ConcurrentHashMap<String, C6350i> f20879a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public void mo22603a(String str, C6350i iVar) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        } else if (iVar == null) {
            throw new IllegalArgumentException("Cookie spec factory may not be null");
        } else {
            this.f20879a.put(str.toLowerCase(Locale.ENGLISH), iVar);
        }
    }

    /* renamed from: a */
    public C6349h mo22602a(String str, C6531d dVar) throws IllegalStateException {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        C6350i iVar = (C6350i) this.f20879a.get(str.toLowerCase(Locale.ENGLISH));
        if (iVar != null) {
            return iVar.mo22601a(dVar);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported cookie spec: ");
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }
}
