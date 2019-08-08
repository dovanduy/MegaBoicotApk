package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class aqy implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ aqx f11723a;

    aqy(aqx aqx) {
        this.f11723a = aqx;
    }

    public final void run() {
        if (this.f11723a.f11722a != null) {
            try {
                this.f11723a.f11722a.mo14530a(1);
            } catch (RemoteException e) {
                C3987mk.m17432c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
