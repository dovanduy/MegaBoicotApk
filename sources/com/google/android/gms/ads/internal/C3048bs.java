package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.ave;
import com.google.android.gms.internal.ads.avs;

/* renamed from: com.google.android.gms.ads.internal.bs */
final class C3048bs implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ave f8917a;

    /* renamed from: b */
    private final /* synthetic */ C3043bn f8918b;

    C3048bs(C3043bn bnVar, ave ave) {
        this.f8918b = bnVar;
        this.f8917a = ave;
    }

    public final void run() {
        try {
            ((avs) this.f8918b.f8733e.f8877v.get(this.f8917a.mo14771l())).mo14915a(this.f8917a);
        } catch (RemoteException e) {
            C3900je.m17434d("#007 Could not call remote method.", e);
        }
    }
}
