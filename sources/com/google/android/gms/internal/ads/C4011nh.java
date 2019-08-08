package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.nh */
final /* synthetic */ class C4011nh implements Runnable {

    /* renamed from: a */
    private final Executor f13614a;

    /* renamed from: b */
    private final Runnable f13615b;

    C4011nh(Executor executor, Runnable runnable) {
        this.f13614a = executor;
        this.f13615b = runnable;
    }

    public final void run() {
        this.f13614a.execute(this.f13615b);
    }
}
