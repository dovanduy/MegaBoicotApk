package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ef */
final class C3766ef implements C4024nu<ban> {

    /* renamed from: a */
    private final /* synthetic */ C3765ee f12939a;

    C3766ef(C3765ee eeVar) {
        this.f12939a = eeVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14411a(Object obj) {
        try {
            ((ban) obj).mo14994b("AFMA_getAdapterLessMediationAd", this.f12939a.f12936a);
        } catch (Exception e) {
            C3900je.m17430b("Error requesting an ad url", e);
            C3763ec.f12926f.mo12616b(this.f12939a.f12937b);
        }
    }
}
