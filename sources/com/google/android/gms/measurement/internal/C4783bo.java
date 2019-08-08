package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bo */
final class C4783bo implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzfv f15552a;

    /* renamed from: b */
    private final /* synthetic */ zzk f15553b;

    /* renamed from: c */
    private final /* synthetic */ C4766ay f15554c;

    C4783bo(C4766ay ayVar, zzfv zzfv, zzk zzk) {
        this.f15554c = ayVar;
        this.f15552a = zzfv;
        this.f15553b = zzk;
    }

    public final void run() {
        this.f15554c.f15501a.mo17460l();
        this.f15554c.f15501a.mo17437a(this.f15552a, this.f15553b);
    }
}
