package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bm */
final class C4781bm implements Callable<byte[]> {

    /* renamed from: a */
    private final /* synthetic */ zzag f15546a;

    /* renamed from: b */
    private final /* synthetic */ String f15547b;

    /* renamed from: c */
    private final /* synthetic */ C4766ay f15548c;

    C4781bm(C4766ay ayVar, zzag zzag, String str) {
        this.f15548c = ayVar;
        this.f15546a = zzag;
        this.f15547b = str;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f15548c.f15501a.mo17460l();
        return this.f15548c.f15501a.mo17454f().mo17347a(this.f15546a, this.f15547b);
    }
}
