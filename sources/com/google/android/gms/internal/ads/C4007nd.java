package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.nd */
final class C4007nd<T> implements C4008ne<T> {

    /* renamed from: a */
    private final T f13607a;

    /* renamed from: b */
    private final C4010ng f13608b = new C4010ng();

    C4007nd(T t) {
        this.f13607a = t;
        this.f13608b.mo15672a();
    }

    /* renamed from: a */
    public final void mo15658a(Runnable runnable, Executor executor) {
        this.f13608b.mo15673a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final T get() {
        return this.f13607a;
    }

    public final T get(long j, TimeUnit timeUnit) {
        return this.f13607a;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }
}
