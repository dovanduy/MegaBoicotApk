package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.ave;
import com.google.android.gms.internal.ads.avs;

/* renamed from: com.google.android.gms.ads.internal.al */
final class C3014al implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ave f8775a;

    /* renamed from: b */
    private final /* synthetic */ C3006ad f8776b;

    C3014al(C3006ad adVar, ave ave) {
        this.f8776b = adVar;
        this.f8775a = ave;
    }

    public final void run() {
        try {
            ((avs) this.f8776b.f8733e.f8877v.get(this.f8775a.mo14771l())).mo14915a(this.f8775a);
        } catch (RemoteException e) {
            C3900je.m17434d("#007 Could not call remote method.", e);
        }
    }
}
