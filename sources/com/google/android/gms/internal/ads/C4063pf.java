package com.google.android.gms.internal.ads;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.pf */
final class C4063pf implements Runnable {

    /* renamed from: a */
    private C4046op f13766a;

    /* renamed from: b */
    private boolean f13767b = false;

    C4063pf(C4046op opVar) {
        this.f13766a = opVar;
    }

    /* renamed from: c */
    private final void m17628c() {
        C3909jn.f13411a.removeCallbacks(this);
        C3909jn.f13411a.postDelayed(this, 250);
    }

    /* renamed from: a */
    public final void mo15817a() {
        this.f13767b = true;
    }

    /* renamed from: b */
    public final void mo15818b() {
        this.f13767b = false;
        m17628c();
    }

    public final void run() {
        if (!this.f13767b) {
            this.f13766a.mo15761o();
            m17628c();
        }
    }
}
