package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.cz */
final class C4821cz implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzk f15659a;

    /* renamed from: b */
    private final /* synthetic */ C4815ct f15660b;

    C4821cz(C4815ct ctVar, zzk zzk) {
        this.f15660b = ctVar;
        this.f15659a = zzk;
    }

    public final void run() {
        C4884i d = this.f15660b.f15644b;
        if (d == null) {
            this.f15660b.mo17158r().mo17761y_().mo17763a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            d.mo17275b(this.f15659a);
            this.f15660b.m20696I();
        } catch (RemoteException e) {
            this.f15660b.mo17158r().mo17761y_().mo17764a("Failed to send measurementEnabled to the service", e);
        }
    }
}
