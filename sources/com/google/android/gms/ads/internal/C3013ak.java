package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3878ij;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.atd;
import com.google.android.gms.internal.ads.avs;

/* renamed from: com.google.android.gms.ads.internal.ak */
final class C3013ak implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f8772a;

    /* renamed from: b */
    private final /* synthetic */ C3878ij f8773b;

    /* renamed from: c */
    private final /* synthetic */ C3006ad f8774c;

    C3013ak(C3006ad adVar, String str, C3878ij ijVar) {
        this.f8774c = adVar;
        this.f8772a = str;
        this.f8773b = ijVar;
    }

    public final void run() {
        try {
            ((avs) this.f8774c.f8733e.f8877v.get(this.f8772a)).mo14915a((atd) this.f8773b.f13248C);
        } catch (RemoteException e) {
            C3900je.m17434d("#007 Could not call remote method.", e);
        }
    }
}
