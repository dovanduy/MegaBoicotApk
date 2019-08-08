package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C4014nk;

/* renamed from: com.google.android.gms.ads.internal.z */
final /* synthetic */ class C3139z implements Runnable {

    /* renamed from: a */
    private final C3138y f9151a;

    /* renamed from: b */
    private final Runnable f9152b;

    C3139z(C3138y yVar, Runnable runnable) {
        this.f9151a = yVar;
        this.f9152b = runnable;
    }

    public final void run() {
        C4014nk.f13617a.execute(new C3004ab(this.f9151a, this.f9152b));
    }
}
