package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.asz;

/* renamed from: com.google.android.gms.ads.internal.bq */
final class C3046bq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ asz f8913a;

    /* renamed from: b */
    private final /* synthetic */ C3043bn f8914b;

    C3046bq(C3043bn bnVar, asz asz) {
        this.f8914b = bnVar;
        this.f8913a = asz;
    }

    public final void run() {
        try {
            if (this.f8914b.f8733e.f8873r != null) {
                this.f8914b.f8733e.f8873r.mo14887a(this.f8913a);
                this.f8914b.mo12577a(this.f8913a.mo14769j());
            }
        } catch (RemoteException e) {
            C3900je.m17434d("#007 Could not call remote method.", e);
        }
    }
}
