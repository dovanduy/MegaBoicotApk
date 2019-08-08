package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.cv */
final class C3357cv implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ LifecycleCallback f9728a;

    /* renamed from: b */
    private final /* synthetic */ String f9729b;

    /* renamed from: c */
    private final /* synthetic */ C3356cu f9730c;

    C3357cv(C3356cu cuVar, LifecycleCallback lifecycleCallback, String str) {
        this.f9730c = cuVar;
        this.f9728a = lifecycleCallback;
        this.f9729b = str;
    }

    public final void run() {
        if (this.f9730c.f9726c > 0) {
            this.f9728a.mo13172a(this.f9730c.f9727d != null ? this.f9730c.f9727d.getBundle(this.f9729b) : null);
        }
        if (this.f9730c.f9726c >= 2) {
            this.f9728a.mo13174b();
        }
        if (this.f9730c.f9726c >= 3) {
            this.f9728a.mo13176c();
        }
        if (this.f9730c.f9726c >= 4) {
            this.f9728a.mo13177d();
        }
        if (this.f9730c.f9726c >= 5) {
            this.f9728a.mo13178e();
        }
    }
}
