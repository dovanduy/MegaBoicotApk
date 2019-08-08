package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bk */
final class C4779bk implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzag f15540a;

    /* renamed from: b */
    private final /* synthetic */ zzk f15541b;

    /* renamed from: c */
    private final /* synthetic */ C4766ay f15542c;

    C4779bk(C4766ay ayVar, zzag zzag, zzk zzk) {
        this.f15542c = ayVar;
        this.f15540a = zzag;
        this.f15541b = zzk;
    }

    public final void run() {
        zzag b = this.f15542c.mo17274b(this.f15540a, this.f15541b);
        this.f15542c.f15501a.mo17460l();
        this.f15542c.f15501a.mo17435a(b, this.f15541b);
    }
}
