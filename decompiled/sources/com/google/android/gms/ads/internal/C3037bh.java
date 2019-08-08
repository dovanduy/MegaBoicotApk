package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C3878ij;
import com.google.android.gms.internal.ads.C3879ik;

/* renamed from: com.google.android.gms.ads.internal.bh */
final class C3037bh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3879ik f8896a;

    /* renamed from: b */
    private final /* synthetic */ C3035bf f8897b;

    C3037bh(C3035bf bfVar, C3879ik ikVar) {
        this.f8897b = bfVar;
        this.f8896a = ikVar;
    }

    public final void run() {
        C3035bf bfVar = this.f8897b;
        C3878ij ijVar = new C3878ij(this.f8896a, null, null, null, null, null, null, null);
        bfVar.mo12428b(ijVar);
    }
}
