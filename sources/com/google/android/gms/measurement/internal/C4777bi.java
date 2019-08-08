package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bi */
final class C4777bi implements Callable<List<zzo>> {

    /* renamed from: a */
    private final /* synthetic */ String f15534a;

    /* renamed from: b */
    private final /* synthetic */ String f15535b;

    /* renamed from: c */
    private final /* synthetic */ String f15536c;

    /* renamed from: d */
    private final /* synthetic */ C4766ay f15537d;

    C4777bi(C4766ay ayVar, String str, String str2, String str3) {
        this.f15537d = ayVar;
        this.f15534a = str;
        this.f15535b = str2;
        this.f15536c = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f15537d.f15501a.mo17460l();
        return this.f15537d.f15501a.mo17451d().mo17694b(this.f15534a, this.f15535b, this.f15536c);
    }
}
