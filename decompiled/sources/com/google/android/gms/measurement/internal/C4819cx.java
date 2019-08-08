package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.cx */
final class C4819cx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4810co f15656a;

    /* renamed from: b */
    private final /* synthetic */ C4815ct f15657b;

    C4819cx(C4815ct ctVar, C4810co coVar) {
        this.f15657b = ctVar;
        this.f15656a = coVar;
    }

    public final void run() {
        C4884i d = this.f15657b.f15644b;
        if (d == null) {
            this.f15657b.mo17158r().mo17761y_().mo17763a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f15656a == null) {
                d.mo17266a(0, (String) null, (String) null, this.f15657b.mo17154n().getPackageName());
            } else {
                d.mo17266a(this.f15656a.f15629c, this.f15656a.f15627a, this.f15656a.f15628b, this.f15657b.mo17154n().getPackageName());
            }
            this.f15657b.m20696I();
        } catch (RemoteException e) {
            this.f15657b.mo17158r().mo17761y_().mo17764a("Failed to send current screen to the service", e);
        }
    }
}
