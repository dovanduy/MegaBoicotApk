package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.dn */
public final class C3746dn extends C3753du {

    /* renamed from: a */
    private final WeakReference<C3735dc> f12912a;

    public C3746dn(C3735dc dcVar) {
        this.f12912a = new WeakReference<>(dcVar);
    }

    /* renamed from: a */
    public final void mo15245a(zzaej zzaej) {
        C3735dc dcVar = (C3735dc) this.f12912a.get();
        if (dcVar != null) {
            dcVar.mo15228a(zzaej);
        }
    }
}
