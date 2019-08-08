package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cx */
final class C3729cx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3721cp f12823a;

    C3729cx(C3721cp cpVar) {
        this.f12823a = cpVar;
    }

    public final void run() {
        synchronized (this.f12823a.f12808d) {
            if (this.f12823a.f12805a != null) {
                this.f12823a.mo12688e_();
                this.f12823a.m16491a(2, "Timed out waiting for ad response.");
            }
        }
    }
}
