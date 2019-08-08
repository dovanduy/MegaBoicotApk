package org.apache.p199a.p218f.p220b;

import java.util.HashMap;
import org.apache.p199a.C6555l;
import org.apache.p199a.p200a.C6248a;
import org.apache.p199a.p202b.C6267a;

/* renamed from: org.apache.a.f.b.c */
/* compiled from: BasicAuthCache */
public class C6404c implements C6267a {

    /* renamed from: a */
    private final HashMap<C6555l, C6248a> f21011a = new HashMap<>();

    /* renamed from: a */
    public void mo22437a(C6555l lVar, C6248a aVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("HTTP host may not be null");
        }
        this.f21011a.put(lVar, aVar);
    }

    /* renamed from: a */
    public C6248a mo22436a(C6555l lVar) {
        if (lVar != null) {
            return (C6248a) this.f21011a.get(lVar);
        }
        throw new IllegalArgumentException("HTTP host may not be null");
    }

    /* renamed from: b */
    public void mo22438b(C6555l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("HTTP host may not be null");
        }
        this.f21011a.remove(lVar);
    }

    public String toString() {
        return this.f21011a.toString();
    }
}
