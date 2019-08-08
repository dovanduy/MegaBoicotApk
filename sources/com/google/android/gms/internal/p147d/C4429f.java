package com.google.android.gms.internal.p147d;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.d.f */
final class C4429f extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f14623a;

    public C4429f(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.f14623a = System.identityHashCode(th);
    }

    public final int hashCode() {
        return this.f14623a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C4429f fVar = (C4429f) obj;
        return this.f14623a == fVar.f14623a && get() == fVar.get();
    }
}
