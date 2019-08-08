package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.cx */
final class C3359cx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ LifecycleCallback f9735a;

    /* renamed from: b */
    private final /* synthetic */ String f9736b;

    /* renamed from: c */
    private final /* synthetic */ C3358cw f9737c;

    C3359cx(C3358cw cwVar, LifecycleCallback lifecycleCallback, String str) {
        this.f9737c = cwVar;
        this.f9735a = lifecycleCallback;
        this.f9736b = str;
    }

    public final void run() {
        if (this.f9737c.f9733c > 0) {
            this.f9735a.mo13172a(this.f9737c.f9734d != null ? this.f9737c.f9734d.getBundle(this.f9736b) : null);
        }
        if (this.f9737c.f9733c >= 2) {
            this.f9735a.mo13174b();
        }
        if (this.f9737c.f9733c >= 3) {
            this.f9735a.mo13176c();
        }
        if (this.f9737c.f9733c >= 4) {
            this.f9735a.mo13177d();
        }
        if (this.f9737c.f9733c >= 5) {
            this.f9735a.mo13178e();
        }
    }
}
