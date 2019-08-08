package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eh */
final class C3768eh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3763ec f12941a;

    C3768eh(C3763ec ecVar) {
        this.f12941a = ecVar;
    }

    public final void run() {
        if (this.f12941a.f12932l != null) {
            this.f12941a.f12932l.mo15037c();
            this.f12941a.f12932l = null;
        }
    }
}
