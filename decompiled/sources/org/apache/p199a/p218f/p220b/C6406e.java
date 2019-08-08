package org.apache.p199a.p218f.p220b;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.p199a.p200a.C6252d;
import org.apache.p199a.p200a.C6256h;
import org.apache.p199a.p202b.C6292f;

/* renamed from: org.apache.a.f.b.e */
/* compiled from: BasicCredentialsProvider */
public class C6406e implements C6292f {

    /* renamed from: a */
    private final ConcurrentHashMap<C6252d, C6256h> f21013a = new ConcurrentHashMap<>();

    /* renamed from: a */
    private static C6256h m25367a(Map<C6252d, C6256h> map, C6252d dVar) {
        C6256h hVar = (C6256h) map.get(dVar);
        if (hVar != null) {
            return hVar;
        }
        int i = -1;
        C6252d dVar2 = null;
        for (C6252d dVar3 : map.keySet()) {
            int a = dVar.mo22398a(dVar3);
            if (a > i) {
                dVar2 = dVar3;
                i = a;
            }
        }
        return dVar2 != null ? (C6256h) map.get(dVar2) : hVar;
    }

    /* renamed from: a */
    public C6256h mo22457a(C6252d dVar) {
        if (dVar != null) {
            return m25367a(this.f21013a, dVar);
        }
        throw new IllegalArgumentException("Authentication scope may not be null");
    }

    public String toString() {
        return this.f21013a.toString();
    }
}
