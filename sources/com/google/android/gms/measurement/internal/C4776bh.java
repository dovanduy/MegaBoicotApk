package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bh */
final class C4776bh implements Callable<List<zzo>> {

    /* renamed from: a */
    private final /* synthetic */ zzk f15530a;

    /* renamed from: b */
    private final /* synthetic */ String f15531b;

    /* renamed from: c */
    private final /* synthetic */ String f15532c;

    /* renamed from: d */
    private final /* synthetic */ C4766ay f15533d;

    C4776bh(C4766ay ayVar, zzk zzk, String str, String str2) {
        this.f15533d = ayVar;
        this.f15530a = zzk;
        this.f15531b = str;
        this.f15532c = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f15533d.f15501a.mo17460l();
        return this.f15533d.f15501a.mo17451d().mo17694b(this.f15530a.f16003a, this.f15531b, this.f15532c);
    }
}
