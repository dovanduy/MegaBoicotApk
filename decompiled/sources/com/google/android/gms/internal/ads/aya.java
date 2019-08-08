package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class aya implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ayb f12371a;

    /* renamed from: b */
    private final /* synthetic */ ayc f12372b;

    aya(axb axb, ayb ayb, ayc ayc) {
        this.f12371a = ayb;
        this.f12372b = ayc;
    }

    public final void run() {
        try {
            this.f12371a.mo14936a(this.f12372b);
        } catch (RemoteException e) {
            C3900je.m17432c("Could not propagate interstitial ad event.", e);
        }
    }
}
