package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.cw */
final class C4818cw implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzk f15654a;

    /* renamed from: b */
    private final /* synthetic */ C4815ct f15655b;

    C4818cw(C4815ct ctVar, zzk zzk) {
        this.f15655b = ctVar;
        this.f15654a = zzk;
    }

    public final void run() {
        C4884i d = this.f15655b.f15644b;
        if (d == null) {
            this.f15655b.mo17158r().mo17761y_().mo17763a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            d.mo17270a(this.f15654a);
            this.f15655b.mo17364a(d, null, this.f15654a);
            this.f15655b.m20696I();
        } catch (RemoteException e) {
            this.f15655b.mo17158r().mo17761y_().mo17764a("Failed to send app launch to the service", e);
        }
    }
}
