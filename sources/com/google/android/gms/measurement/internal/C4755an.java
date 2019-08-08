package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.an */
final class C4755an implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4764aw f15431a;

    /* renamed from: b */
    private final /* synthetic */ C4893r f15432b;

    C4755an(C4754am amVar, C4764aw awVar, C4893r rVar) {
        this.f15431a = awVar;
        this.f15432b = rVar;
    }

    public final void run() {
        if (this.f15431a.mo17244f() == null) {
            this.f15432b.mo17761y_().mo17763a("Install Referrer Reporter is null");
            return;
        }
        C4751aj f = this.f15431a.mo17244f();
        f.f15424a.mo17232E();
        f.mo17195a(f.f15424a.mo17154n().getPackageName());
    }
}
