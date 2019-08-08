package com.google.android.gms.internal.p148e;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.e.ep */
final class C4567ep {

    /* renamed from: a */
    private static final C4567ep f14934a = new C4567ep();

    /* renamed from: b */
    private final C4572eu f14935b = new C4542dr();

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, C4571et<?>> f14936c = new ConcurrentHashMap();

    /* renamed from: a */
    public static C4567ep m19618a() {
        return f14934a;
    }

    /* renamed from: a */
    public final <T> C4571et<T> mo16695a(Class<T> cls) {
        C4520cw.m19448a(cls, "messageType");
        C4571et<T> etVar = (C4571et) this.f14936c.get(cls);
        if (etVar != null) {
            return etVar;
        }
        C4571et<T> a = this.f14935b.mo16661a(cls);
        C4520cw.m19448a(cls, "messageType");
        C4520cw.m19448a(a, "schema");
        C4571et etVar2 = (C4571et) this.f14936c.putIfAbsent(cls, a);
        return etVar2 != null ? etVar2 : a;
    }

    /* renamed from: a */
    public final <T> C4571et<T> mo16696a(T t) {
        return mo16695a(t.getClass());
    }

    private C4567ep() {
    }
}
