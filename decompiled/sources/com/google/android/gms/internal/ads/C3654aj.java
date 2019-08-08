package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aj */
final class C3654aj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3653ai f11174a;

    C3654aj(C3653ai aiVar) {
        this.f11174a = aiVar;
    }

    public final void run() {
        if (this.f11174a.f11127h.get()) {
            C3900je.m17431c("Timed out waiting for WebView to finish loading.");
            this.f11174a.mo14343b();
        }
    }
}
