package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C3878ij;
import com.google.android.gms.internal.ads.C3879ik;

/* renamed from: com.google.android.gms.ads.internal.ae */
final class C3007ae implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3879ik f8755a;

    /* renamed from: b */
    private final /* synthetic */ C3006ad f8756b;

    C3007ae(C3006ad adVar, C3879ik ikVar) {
        this.f8756b = adVar;
        this.f8755a = ikVar;
    }

    public final void run() {
        C3006ad adVar = this.f8756b;
        C3878ij ijVar = new C3878ij(this.f8755a, null, null, null, null, null, null, null);
        adVar.mo12428b(ijVar);
    }
}
