package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.asz;

/* renamed from: com.google.android.gms.ads.internal.ah */
final class C3010ah implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ asz f8766a;

    /* renamed from: b */
    private final /* synthetic */ C3006ad f8767b;

    C3010ah(C3006ad adVar, asz asz) {
        this.f8767b = adVar;
        this.f8766a = asz;
    }

    public final void run() {
        try {
            if (this.f8767b.f8733e.f8873r != null) {
                this.f8767b.f8733e.f8873r.mo14887a(this.f8766a);
                this.f8767b.mo12471a(this.f8766a.mo14769j());
            }
        } catch (RemoteException e) {
            C3900je.m17434d("#007 Could not call remote method.", e);
        }
    }
}
