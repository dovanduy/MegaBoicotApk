package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class aqw implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ aqv f11721a;

    aqw(aqv aqv) {
        this.f11721a = aqv;
    }

    public final void run() {
        if (this.f11721a.f11720a.f11719a != null) {
            try {
                this.f11721a.f11720a.f11719a.mo14530a(1);
            } catch (RemoteException e) {
                C3987mk.m17432c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
