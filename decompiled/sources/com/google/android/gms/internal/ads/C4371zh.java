package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.zh */
final class C4371zh extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f14281a;

    public C4371zh(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, null);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.f14281a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C4371zh zhVar = (C4371zh) obj;
        return this.f14281a == zhVar.f14281a && get() == zhVar.get();
    }

    public final int hashCode() {
        return this.f14281a;
    }
}
