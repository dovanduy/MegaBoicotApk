package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C3025aw;

/* renamed from: com.google.android.gms.internal.ads.kz */
final class C3948kz implements C3991mo<Throwable, T> {

    /* renamed from: a */
    private final /* synthetic */ C3953ld f13485a;

    C3948kz(C3946kx kxVar, C3953ld ldVar) {
        this.f13485a = ldVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C4008ne mo12596a(Object obj) throws Exception {
        Throwable th = (Throwable) obj;
        C3900je.m17430b("Error occurred while dispatching http response in getter.", th);
        C3025aw.m10921i().mo15436a(th, "HttpGetter.deliverResponse.1");
        return C3996mt.m17448a(this.f13485a.mo15195a());
    }
}
