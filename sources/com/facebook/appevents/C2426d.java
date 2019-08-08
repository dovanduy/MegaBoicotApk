package com.facebook.appevents;

import android.content.Context;
import com.facebook.C2649m;
import com.facebook.internal.C2499b;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.facebook.appevents.d */
/* compiled from: AppEventCollection */
class C2426d {

    /* renamed from: a */
    private final HashMap<C2382a, C2446l> f7684a = new HashMap<>();

    /* renamed from: a */
    public synchronized void mo8845a(C2443k kVar) {
        if (kVar != null) {
            for (C2382a aVar : kVar.mo8861a()) {
                C2446l b = m9291b(aVar);
                for (C2422c a : kVar.mo8860a(aVar)) {
                    b.mo8866a(a);
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo8844a(C2382a aVar, C2422c cVar) {
        m9291b(aVar).mo8866a(cVar);
    }

    /* renamed from: a */
    public synchronized Set<C2382a> mo8843a() {
        return this.f7684a.keySet();
    }

    /* renamed from: a */
    public synchronized C2446l mo8842a(C2382a aVar) {
        return (C2446l) this.f7684a.get(aVar);
    }

    /* renamed from: b */
    public synchronized int mo8846b() {
        int i;
        i = 0;
        for (C2446l a : this.f7684a.values()) {
            i += a.mo8864a();
        }
        return i;
    }

    /* renamed from: b */
    private synchronized C2446l m9291b(C2382a aVar) {
        C2446l lVar;
        lVar = (C2446l) this.f7684a.get(aVar);
        if (lVar == null) {
            Context f = C2649m.m10133f();
            lVar = new C2446l(C2499b.m9554a(f), C2436g.m9326b(f));
        }
        this.f7684a.put(aVar, lVar);
        return lVar;
    }
}
