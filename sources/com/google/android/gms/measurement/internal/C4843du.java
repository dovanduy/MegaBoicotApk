package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.du */
final class C4843du extends C4879fb {

    /* renamed from: a */
    private final /* synthetic */ C4840dr f15730a;

    C4843du(C4840dr drVar, C4789bu buVar) {
        this.f15730a = drVar;
        super(buVar);
    }

    /* renamed from: a */
    public final void mo17374a() {
        C4840dr drVar = this.f15730a;
        drVar.mo17144d();
        drVar.mo17158r().mo17759x().mo17763a("Current session is expired, remove the session number and Id");
        if (drVar.mo17160t().mo17661p(drVar.mo17147g().mo17730x())) {
            drVar.mo17146f().mo17320a("auto", "_sid", (Object) null, drVar.mo17153m().mo13694a());
        }
        if (drVar.mo17160t().mo17662q(drVar.mo17147g().mo17730x())) {
            drVar.mo17146f().mo17320a("auto", "_sno", (Object) null, drVar.mo17153m().mo13694a());
        }
    }
}
