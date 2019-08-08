package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bf */
final class C4774bf implements Callable<List<C4861ek>> {

    /* renamed from: a */
    private final /* synthetic */ zzk f15522a;

    /* renamed from: b */
    private final /* synthetic */ String f15523b;

    /* renamed from: c */
    private final /* synthetic */ String f15524c;

    /* renamed from: d */
    private final /* synthetic */ C4766ay f15525d;

    C4774bf(C4766ay ayVar, zzk zzk, String str, String str2) {
        this.f15525d = ayVar;
        this.f15522a = zzk;
        this.f15523b = str;
        this.f15524c = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f15525d.f15501a.mo17460l();
        return this.f15525d.f15501a.mo17451d().mo17682a(this.f15522a.f16003a, this.f15523b, this.f15524c);
    }
}
