package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cv */
final class C4817cv implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f15651a;

    /* renamed from: b */
    private final /* synthetic */ zzk f15652b;

    /* renamed from: c */
    private final /* synthetic */ C4815ct f15653c;

    C4817cv(C4815ct ctVar, AtomicReference atomicReference, zzk zzk) {
        this.f15653c = ctVar;
        this.f15651a = atomicReference;
        this.f15652b = zzk;
    }

    public final void run() {
        synchronized (this.f15651a) {
            try {
                C4884i d = this.f15653c.f15644b;
                if (d == null) {
                    this.f15653c.mo17158r().mo17761y_().mo17763a("Failed to get app instance id");
                    this.f15651a.notify();
                    return;
                }
                this.f15651a.set(d.mo17276c(this.f15652b));
                String str = (String) this.f15651a.get();
                if (str != null) {
                    this.f15653c.mo17146f().mo17316a(str);
                    this.f15653c.mo17159s().f15393j.mo17193a(str);
                }
                this.f15653c.m20696I();
                this.f15651a.notify();
            } catch (RemoteException e) {
                try {
                    this.f15653c.mo17158r().mo17761y_().mo17764a("Failed to get app instance id", e);
                    this.f15651a.notify();
                } catch (Throwable th) {
                    this.f15651a.notify();
                    throw th;
                }
            }
        }
    }
}
