package com.google.android.gms.p143d;

/* renamed from: com.google.android.gms.d.p */
final class C3595p implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3594o f10224a;

    C3595p(C3594o oVar) {
        this.f10224a = oVar;
    }

    public final void run() {
        synchronized (this.f10224a.f10222b) {
            if (this.f10224a.f10223c != null) {
                this.f10224a.f10223c.mo13705a();
            }
        }
    }
}
