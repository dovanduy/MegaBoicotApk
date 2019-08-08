package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cd */
final class C4799cd implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicReference f15593a;

    /* renamed from: b */
    private final /* synthetic */ C4798cc f15594b;

    public final void run() {
        synchronized (this.f15593a) {
            try {
                this.f15593a.set(Boolean.valueOf(this.f15594b.mo17160t().mo17652h(this.f15594b.mo17147g().mo17730x())));
                this.f15593a.notify();
            } catch (Throwable th) {
                this.f15593a.notify();
                throw th;
            }
        }
    }
}
