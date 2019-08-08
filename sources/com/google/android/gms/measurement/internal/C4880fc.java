package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.fc */
final class C4880fc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4789bu f15848a;

    /* renamed from: b */
    private final /* synthetic */ C4879fb f15849b;

    C4880fc(C4879fb fbVar, C4789bu buVar) {
        this.f15849b = fbVar;
        this.f15848a = buVar;
    }

    public final void run() {
        this.f15848a.mo17161u();
        if (C4868er.m21094a()) {
            this.f15848a.mo17157q().mo17219a((Runnable) this);
            return;
        }
        boolean b = this.f15849b.mo17719b();
        this.f15849b.f15847d = 0;
        if (b) {
            this.f15849b.mo17374a();
        }
    }
}
