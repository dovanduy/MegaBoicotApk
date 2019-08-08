package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.zg */
final class C4370zg {

    /* renamed from: a */
    private final ConcurrentHashMap<C4371zh, List<Throwable>> f14279a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f14280b = new ReferenceQueue<>();

    C4370zg() {
    }

    /* renamed from: a */
    public final List<Throwable> mo16224a(Throwable th, boolean z) {
        while (true) {
            Reference poll = this.f14280b.poll();
            if (poll != null) {
                this.f14279a.remove(poll);
            } else {
                return (List) this.f14279a.get(new C4371zh(th, null));
            }
        }
    }
}
