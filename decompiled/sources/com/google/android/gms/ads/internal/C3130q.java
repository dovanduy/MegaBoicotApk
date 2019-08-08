package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C3115k;

/* renamed from: com.google.android.gms.ads.internal.q */
final class C3130q implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AdOverlayInfoParcel f9132a;

    /* renamed from: b */
    private final /* synthetic */ C3129p f9133b;

    C3130q(C3129p pVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f9133b = pVar;
        this.f9132a = adOverlayInfoParcel;
    }

    public final void run() {
        C3025aw.m10915c();
        C3115k.m11206a(this.f9133b.f9130a.f8733e.f8858c, this.f9132a, true);
    }
}
