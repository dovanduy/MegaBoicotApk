package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C3115k;

final class beb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AdOverlayInfoParcel f12712a;

    /* renamed from: b */
    private final /* synthetic */ zzzv f12713b;

    beb(zzzv zzzv, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f12713b = zzzv;
        this.f12712a = adOverlayInfoParcel;
    }

    public final void run() {
        C3025aw.m10915c();
        C3115k.m11206a(this.f12713b.f14580a, this.f12712a, true);
    }
}
