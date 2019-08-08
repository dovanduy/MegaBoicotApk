package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import javax.annotation.Nullable;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ni */
final class C4012ni<V> extends FutureTask<V> implements C4008ne<V> {

    /* renamed from: a */
    private final C4010ng f13616a = new C4010ng();

    C4012ni(Runnable runnable, @Nullable V v) {
        super(runnable, v);
    }

    C4012ni(Callable<V> callable) {
        super(callable);
    }

    /* renamed from: a */
    public final void mo15658a(Runnable runnable, Executor executor) {
        this.f13616a.mo15673a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public final void done() {
        this.f13616a.mo15672a();
    }
}
