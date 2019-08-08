package com.google.android.gms.internal.p147d;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.d.e */
final class C4428e {

    /* renamed from: a */
    private final ConcurrentHashMap<C4429f, List<Throwable>> f14621a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f14622b = new ReferenceQueue<>();

    C4428e() {
    }

    /* renamed from: a */
    public final List<Throwable> mo16323a(Throwable th, boolean z) {
        Reference poll = this.f14622b.poll();
        while (poll != null) {
            this.f14621a.remove(poll);
            poll = this.f14622b.poll();
        }
        List<Throwable> list = (List) this.f14621a.get(new C4429f(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.f14621a.putIfAbsent(new C4429f(th, this.f14622b), vector);
        return list2 == null ? vector : list2;
    }
}
