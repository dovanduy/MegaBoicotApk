package com.google.android.gms.ads.internal;

import android.os.Handler;

/* renamed from: com.google.android.gms.ads.internal.ao */
public final class C3017ao {

    /* renamed from: a */
    private final Handler f8785a;

    public C3017ao(Handler handler) {
        this.f8785a = handler;
    }

    /* renamed from: a */
    public final void mo12500a(Runnable runnable) {
        this.f8785a.removeCallbacks(runnable);
    }

    /* renamed from: a */
    public final boolean mo12501a(Runnable runnable, long j) {
        return this.f8785a.postDelayed(runnable, j);
    }
}
