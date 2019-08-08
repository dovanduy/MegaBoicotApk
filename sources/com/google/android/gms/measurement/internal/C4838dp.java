package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dp */
final class C4838dp implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4852ec f15720a;

    /* renamed from: b */
    private final /* synthetic */ Runnable f15721b;

    C4838dp(C4834dl dlVar, C4852ec ecVar, Runnable runnable) {
        this.f15720a = ecVar;
        this.f15721b = runnable;
    }

    public final void run() {
        this.f15720a.mo17460l();
        this.f15720a.mo17441a(this.f15721b);
        this.f15720a.mo17459k();
    }
}
