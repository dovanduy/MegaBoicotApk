package org.apache.p199a.p200a;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.p199a.p227i.C6531d;

/* renamed from: org.apache.a.a.c */
/* compiled from: AuthSchemeRegistry */
public final class C6251c {

    /* renamed from: a */
    private final ConcurrentHashMap<String, C6250b> f20797a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public void mo22397a(String str, C6250b bVar) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        } else if (bVar == null) {
            throw new IllegalArgumentException("Authentication scheme factory may not be null");
        } else {
            this.f20797a.put(str.toLowerCase(Locale.ENGLISH), bVar);
        }
    }

    /* renamed from: a */
    public C6248a mo22396a(String str, C6531d dVar) throws IllegalStateException {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        C6250b bVar = (C6250b) this.f20797a.get(str.toLowerCase(Locale.ENGLISH));
        if (bVar != null) {
            return bVar.mo22395a(dVar);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported authentication scheme: ");
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }
}
