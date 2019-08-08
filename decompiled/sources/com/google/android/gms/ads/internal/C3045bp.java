package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.atg;

/* renamed from: com.google.android.gms.ads.internal.bp */
final class C3045bp implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ atg f8911a;

    /* renamed from: b */
    private final /* synthetic */ C3043bn f8912b;

    C3045bp(C3043bn bnVar, atg atg) {
        this.f8912b = bnVar;
        this.f8911a = atg;
    }

    public final void run() {
        try {
            if (this.f8912b.f8733e.f8875t != null) {
                this.f8912b.f8733e.f8875t.mo14917a(this.f8911a);
                this.f8912b.mo12577a(this.f8911a.mo14822n());
            }
        } catch (RemoteException e) {
            C3900je.m17434d("#007 Could not call remote method.", e);
        }
    }
}
