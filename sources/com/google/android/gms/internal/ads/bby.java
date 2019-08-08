package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class bby implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bbr f12654a;

    bby(bbx bbx, bbr bbr) {
        this.f12654a = bbr;
    }

    public final void run() {
        try {
            this.f12654a.f12615c.mo15096c();
        } catch (RemoteException e) {
            C3900je.m17432c("Could not destroy mediation adapter.", e);
        }
    }
}
