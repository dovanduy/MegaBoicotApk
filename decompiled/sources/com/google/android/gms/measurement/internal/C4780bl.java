package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bl */
final class C4780bl implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ zzag f15543a;

    /* renamed from: b */
    private final /* synthetic */ String f15544b;

    /* renamed from: c */
    private final /* synthetic */ C4766ay f15545c;

    C4780bl(C4766ay ayVar, zzag zzag, String str) {
        this.f15545c = ayVar;
        this.f15543a = zzag;
        this.f15544b = str;
    }

    public final void run() {
        this.f15545c.f15501a.mo17460l();
        this.f15545c.f15501a.mo17436a(this.f15543a, this.f15544b);
    }
}
