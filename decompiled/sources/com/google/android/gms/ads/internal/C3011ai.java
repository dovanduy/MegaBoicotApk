package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.atg;

/* renamed from: com.google.android.gms.ads.internal.ai */
final class C3011ai implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ atg f8768a;

    /* renamed from: b */
    private final /* synthetic */ C3006ad f8769b;

    C3011ai(C3006ad adVar, atg atg) {
        this.f8769b = adVar;
        this.f8768a = atg;
    }

    public final void run() {
        try {
            if (this.f8769b.f8733e.f8875t != null) {
                this.f8769b.f8733e.f8875t.mo14917a(this.f8768a);
                this.f8769b.mo12471a(this.f8768a.mo14822n());
            }
        } catch (RemoteException e) {
            C3900je.m17434d("#007 Could not call remote method.", e);
        }
    }
}
