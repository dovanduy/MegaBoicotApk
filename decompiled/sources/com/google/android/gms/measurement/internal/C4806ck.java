package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ck */
final class C4806ck implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f15624a;

    /* renamed from: b */
    private final /* synthetic */ C4798cc f15625b;

    C4806ck(C4798cc ccVar, boolean z) {
        this.f15625b = ccVar;
        this.f15624a = z;
    }

    public final void run() {
        boolean C = this.f15625b.f15564q.mo17230C();
        boolean B = this.f15625b.f15564q.mo17229B();
        this.f15625b.f15564q.mo17239a(this.f15624a);
        if (B == this.f15624a) {
            this.f15625b.f15564q.mo17158r().mo17759x().mo17764a("Default data collection state already set to", Boolean.valueOf(this.f15624a));
        }
        if (this.f15625b.f15564q.mo17230C() == C || this.f15625b.f15564q.mo17230C() != this.f15625b.f15564q.mo17229B()) {
            this.f15625b.f15564q.mo17158r().mo17756k().mo17765a("Default data collection is different than actual status", Boolean.valueOf(this.f15624a), Boolean.valueOf(C));
        }
        this.f15625b.m20584C();
    }
}
