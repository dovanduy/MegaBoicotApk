package com.google.firebase.components;

import com.google.firebase.p149a.C4920c;
import com.google.firebase.p150b.C4934a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.s */
/* compiled from: com.google.firebase:firebase-common@@16.0.2 */
final class C4957s extends C4947i {

    /* renamed from: a */
    private final Set<Class<?>> f16145a;

    /* renamed from: b */
    private final Set<Class<?>> f16146b;

    /* renamed from: c */
    private final Set<Class<?>> f16147c;

    /* renamed from: d */
    private final C4940b f16148d;

    /* renamed from: com.google.firebase.components.s$a */
    /* compiled from: com.google.firebase:firebase-common@@16.0.2 */
    static class C4958a implements C4920c {

        /* renamed from: a */
        private final Set<Class<?>> f16149a;

        /* renamed from: b */
        private final C4920c f16150b;

        public C4958a(Set<Class<?>> set, C4920c cVar) {
            this.f16149a = set;
            this.f16150b = cVar;
        }
    }

    C4957s(C4937a<?> aVar, C4940b bVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C4943e eVar : aVar.mo17849b()) {
            if (eVar.mo17865c()) {
                hashSet.add(eVar.mo17863a());
            } else {
                hashSet2.add(eVar.mo17863a());
            }
        }
        if (!aVar.mo17851d().isEmpty()) {
            hashSet.add(C4920c.class);
        }
        this.f16145a = Collections.unmodifiableSet(hashSet);
        this.f16146b = Collections.unmodifiableSet(hashSet2);
        this.f16147c = aVar.mo17851d();
        this.f16148d = bVar;
    }

    /* renamed from: a */
    public final <T> T mo17861a(Class<T> cls) {
        if (!this.f16145a.contains(cls)) {
            throw new IllegalArgumentException(String.format("Requesting %s is not allowed.", new Object[]{cls}));
        }
        T a = this.f16148d.mo17861a(cls);
        if (!cls.equals(C4920c.class)) {
            return a;
        }
        return new C4958a(this.f16147c, (C4920c) a);
    }

    /* renamed from: b */
    public final <T> C4934a<T> mo17862b(Class<T> cls) {
        if (this.f16146b.contains(cls)) {
            return this.f16148d.mo17862b(cls);
        }
        throw new IllegalArgumentException(String.format("Requesting Provider<%s> is not allowed.", new Object[]{cls}));
    }
}
