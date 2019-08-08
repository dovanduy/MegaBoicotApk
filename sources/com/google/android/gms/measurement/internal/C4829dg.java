package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dg */
final class C4829dg implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4884i f15703a;

    /* renamed from: b */
    private final /* synthetic */ C4828df f15704b;

    C4829dg(C4828df dfVar, C4884i iVar) {
        this.f15704b = dfVar;
        this.f15703a = iVar;
    }

    public final void run() {
        synchronized (this.f15704b) {
            this.f15704b.f15701b = false;
            if (!this.f15704b.f15700a.mo17371x()) {
                this.f15704b.f15700a.mo17158r().mo17759x().mo17763a("Connected to service");
                this.f15704b.f15700a.mo17363a(this.f15703a);
            }
        }
    }
}
