package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.atb;

/* renamed from: com.google.android.gms.ads.internal.aj */
final class C3012aj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ atb f8770a;

    /* renamed from: b */
    private final /* synthetic */ C3006ad f8771b;

    C3012aj(C3006ad adVar, atb atb) {
        this.f8771b = adVar;
        this.f8770a = atb;
    }

    public final void run() {
        try {
            if (this.f8771b.f8733e.f8874s != null) {
                this.f8771b.f8733e.f8874s.mo14888a(this.f8770a);
                this.f8771b.mo12471a(this.f8770a.mo14791j());
            }
        } catch (RemoteException e) {
            C3900je.m17434d("#007 Could not call remote method.", e);
        }
    }
}
