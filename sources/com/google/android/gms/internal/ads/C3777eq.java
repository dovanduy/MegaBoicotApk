package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.C3025aw;

/* renamed from: com.google.android.gms.internal.ads.eq */
final class C3777eq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzaef f12973a;

    /* renamed from: b */
    private final /* synthetic */ C3752dt f12974b;

    /* renamed from: c */
    private final /* synthetic */ C3775eo f12975c;

    C3777eq(C3775eo eoVar, zzaef zzaef, C3752dt dtVar) {
        this.f12975c = eoVar;
        this.f12973a = zzaef;
        this.f12974b = dtVar;
    }

    public final void run() {
        zzaej zzaej;
        try {
            zzaej = this.f12975c.mo15250a(this.f12973a);
        } catch (Exception e) {
            C3025aw.m10921i().mo15436a((Throwable) e, "AdRequestServiceImpl.loadAdAsync");
            C3900je.m17432c("Could not fetch ad response due to an Exception.", e);
            zzaej = null;
        }
        if (zzaej == null) {
            zzaej = new zzaej(0);
        }
        try {
            this.f12974b.mo15245a(zzaej);
        } catch (RemoteException e2) {
            C3900je.m17432c("Fail to forward ad response.", e2);
        }
    }
}
