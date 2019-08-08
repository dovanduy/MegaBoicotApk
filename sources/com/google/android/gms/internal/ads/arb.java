package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class arb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ara f11728a;

    arb(ara ara) {
        this.f11728a = ara;
    }

    public final void run() {
        if (this.f11728a.f11727a != null) {
            try {
                this.f11728a.f11727a.mo14938a(1);
            } catch (RemoteException e) {
                C3987mk.m17432c("Could not notify onRewardedVideoAdFailedToLoad event.", e);
            }
        }
    }
}
