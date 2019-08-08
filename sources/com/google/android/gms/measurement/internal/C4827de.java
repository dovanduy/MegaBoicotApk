package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.de */
final class C4827de implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f15696a;

    /* renamed from: b */
    private final /* synthetic */ zzfv f15697b;

    /* renamed from: c */
    private final /* synthetic */ zzk f15698c;

    /* renamed from: d */
    private final /* synthetic */ C4815ct f15699d;

    C4827de(C4815ct ctVar, boolean z, zzfv zzfv, zzk zzk) {
        this.f15699d = ctVar;
        this.f15696a = z;
        this.f15697b = zzfv;
        this.f15698c = zzk;
    }

    public final void run() {
        C4884i d = this.f15699d.f15644b;
        if (d == null) {
            this.f15699d.mo17158r().mo17761y_().mo17763a("Discarding data. Failed to set user attribute");
            return;
        }
        this.f15699d.mo17364a(d, this.f15696a ? null : this.f15697b, this.f15698c);
        this.f15699d.m20696I();
    }
}
