package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.atb;

/* renamed from: com.google.android.gms.ads.internal.br */
final class C3047br implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ atb f8915a;

    /* renamed from: b */
    private final /* synthetic */ C3043bn f8916b;

    C3047br(C3043bn bnVar, atb atb) {
        this.f8916b = bnVar;
        this.f8915a = atb;
    }

    public final void run() {
        try {
            if (this.f8916b.f8733e.f8874s != null) {
                this.f8916b.f8733e.f8874s.mo14888a(this.f8915a);
                this.f8916b.mo12577a(this.f8915a.mo14791j());
            }
        } catch (RemoteException e) {
            C3900je.m17434d("#007 Could not call remote method.", e);
        }
    }
}
