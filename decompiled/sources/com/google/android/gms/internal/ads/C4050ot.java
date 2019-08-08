package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ot */
final class C4050ot implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f13690a;

    /* renamed from: b */
    private final /* synthetic */ C4046op f13691b;

    C4050ot(C4046op opVar, boolean z) {
        this.f13691b = opVar;
        this.f13690a = z;
    }

    public final void run() {
        this.f13691b.m17547a("windowVisibilityChanged", "isVisible", String.valueOf(this.f13690a));
    }
}
