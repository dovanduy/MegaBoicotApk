package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.C2764a.C2765a;

final class bdf implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C2765a f12689a;

    /* renamed from: b */
    private final /* synthetic */ bde f12690b;

    bdf(bde bde, C2765a aVar) {
        this.f12690b = bde;
        this.f12689a = aVar;
    }

    public final void run() {
        try {
            this.f12690b.f12688a.mo15057a(bdi.m16366a(this.f12689a));
        } catch (RemoteException e) {
            C3987mk.m17434d("#007 Could not call remote method.", e);
        }
    }
}
