package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.nc */
final class C4006nc<T> implements C4008ne<T> {

    /* renamed from: a */
    private final Throwable f13605a;

    /* renamed from: b */
    private final C4010ng f13606b = new C4010ng();

    C4006nc(Throwable th) {
        this.f13605a = th;
        this.f13606b.mo15672a();
    }

    /* renamed from: a */
    public final void mo15658a(Runnable runnable, Executor executor) {
        this.f13606b.mo15673a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final T get() throws ExecutionException {
        throw new ExecutionException(this.f13605a);
    }

    public final T get(long j, TimeUnit timeUnit) throws ExecutionException {
        throw new ExecutionException(this.f13605a);
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }
}
