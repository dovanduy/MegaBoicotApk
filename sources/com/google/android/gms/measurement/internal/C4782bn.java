package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bn */
final class C4782bn implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzfv f15549a;

    /* renamed from: b */
    private final /* synthetic */ zzk f15550b;

    /* renamed from: c */
    private final /* synthetic */ C4766ay f15551c;

    C4782bn(C4766ay ayVar, zzfv zzfv, zzk zzk) {
        this.f15551c = ayVar;
        this.f15549a = zzfv;
        this.f15550b = zzk;
    }

    public final void run() {
        this.f15551c.f15501a.mo17460l();
        this.f15551c.f15501a.mo17445b(this.f15549a, this.f15550b);
    }
}
