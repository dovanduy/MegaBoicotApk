package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bg */
final class C4775bg implements Callable<List<C4861ek>> {

    /* renamed from: a */
    private final /* synthetic */ String f15526a;

    /* renamed from: b */
    private final /* synthetic */ String f15527b;

    /* renamed from: c */
    private final /* synthetic */ String f15528c;

    /* renamed from: d */
    private final /* synthetic */ C4766ay f15529d;

    C4775bg(C4766ay ayVar, String str, String str2, String str3) {
        this.f15529d = ayVar;
        this.f15526a = str;
        this.f15527b = str2;
        this.f15528c = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f15529d.f15501a.mo17460l();
        return this.f15529d.f15501a.mo17451d().mo17682a(this.f15526a, this.f15527b, this.f15528c);
    }
}
