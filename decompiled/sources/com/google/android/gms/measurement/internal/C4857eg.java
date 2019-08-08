package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.eg */
final class C4857eg implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ zzk f15781a;

    /* renamed from: b */
    private final /* synthetic */ C4852ec f15782b;

    C4857eg(C4852ec ecVar, zzk zzk) {
        this.f15782b = ecVar;
        this.f15781a = zzk;
    }

    public final /* synthetic */ Object call() throws Exception {
        C4864en enVar;
        if (this.f15782b.mo17444b().mo17655j(this.f15781a.f16003a)) {
            enVar = this.f15782b.m20870e(this.f15781a);
        } else {
            enVar = this.f15782b.mo17451d().mo17693b(this.f15781a.f16003a);
        }
        if (enVar != null) {
            return enVar.mo17527c();
        }
        this.f15782b.mo17158r().mo17754i().mo17763a("App info was null when attempting to get app instance id");
        return null;
    }
}
