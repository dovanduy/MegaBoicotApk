package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ed */
final class C3764ed implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3879ik f12934a;

    /* renamed from: b */
    private final /* synthetic */ C3763ec f12935b;

    C3764ed(C3763ec ecVar, C3879ik ikVar) {
        this.f12935b = ecVar;
        this.f12934a = ikVar;
    }

    public final void run() {
        this.f12935b.f12928h.mo12414a(this.f12934a);
        if (this.f12935b.f12932l != null) {
            this.f12935b.f12932l.mo15037c();
            this.f12935b.f12932l = null;
        }
    }
}
