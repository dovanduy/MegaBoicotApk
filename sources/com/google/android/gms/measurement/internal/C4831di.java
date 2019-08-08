package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.di */
final class C4831di implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4884i f15707a;

    /* renamed from: b */
    private final /* synthetic */ C4828df f15708b;

    C4831di(C4828df dfVar, C4884i iVar) {
        this.f15708b = dfVar;
        this.f15707a = iVar;
    }

    public final void run() {
        synchronized (this.f15708b) {
            this.f15708b.f15701b = false;
            if (!this.f15708b.f15700a.mo17371x()) {
                this.f15708b.f15700a.mo17158r().mo17758w().mo17763a("Connected to remote service");
                this.f15708b.f15700a.mo17363a(this.f15707a);
            }
        }
    }
}
