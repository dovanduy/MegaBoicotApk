package com.facebook.appevents;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: com.facebook.appevents.k */
/* compiled from: PersistedEvents */
class C2443k implements Serializable {

    /* renamed from: a */
    private HashMap<C2382a, List<C2422c>> f7727a = new HashMap<>();

    /* renamed from: com.facebook.appevents.k$a */
    /* compiled from: PersistedEvents */
    static class C2445a implements Serializable {

        /* renamed from: a */
        private final HashMap<C2382a, List<C2422c>> f7728a;

        private C2445a(HashMap<C2382a, List<C2422c>> hashMap) {
            this.f7728a = hashMap;
        }

        private Object readResolve() {
            return new C2443k(this.f7728a);
        }
    }

    public C2443k() {
    }

    public C2443k(HashMap<C2382a, List<C2422c>> hashMap) {
        this.f7727a.putAll(hashMap);
    }

    /* renamed from: a */
    public Set<C2382a> mo8861a() {
        return this.f7727a.keySet();
    }

    /* renamed from: a */
    public List<C2422c> mo8860a(C2382a aVar) {
        return (List) this.f7727a.get(aVar);
    }

    /* renamed from: b */
    public boolean mo8863b(C2382a aVar) {
        return this.f7727a.containsKey(aVar);
    }

    /* renamed from: a */
    public void mo8862a(C2382a aVar, List<C2422c> list) {
        if (!this.f7727a.containsKey(aVar)) {
            this.f7727a.put(aVar, list);
        } else {
            ((List) this.f7727a.get(aVar)).addAll(list);
        }
    }

    private Object writeReplace() {
        return new C2445a(this.f7727a);
    }
}
