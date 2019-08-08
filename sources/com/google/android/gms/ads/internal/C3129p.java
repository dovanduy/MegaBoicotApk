package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3894iz;
import com.google.android.gms.internal.ads.C3909jn;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.p */
final class C3129p extends C3894iz {

    /* renamed from: a */
    final /* synthetic */ C3102m f9130a;

    /* renamed from: b */
    private final int f9131b;

    public C3129p(C3102m mVar, int i) {
        this.f9130a = mVar;
        this.f9131b = i;
    }

    /* renamed from: a */
    public final void mo12687a() {
        zzaq zzaq = new zzaq(this.f9130a.f8733e.f8848J, this.f9130a.mo12648J(), this.f9130a.f9053m, this.f9130a.f9054n, this.f9130a.f8733e.f8848J ? this.f9131b : -1, this.f9130a.f9055o, this.f9130a.f8733e.f8865j.f13257L, this.f9130a.f8733e.f8865j.f13260O);
        int requestedOrientation = this.f9130a.f8733e.f8865j.f13266b.getRequestedOrientation();
        if (requestedOrientation == -1) {
            requestedOrientation = this.f9130a.f8733e.f8865j.f13272h;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this.f9130a, this.f9130a, this.f9130a, this.f9130a.f8733e.f8865j.f13266b, requestedOrientation, this.f9130a.f8733e.f8860e, this.f9130a.f8733e.f8865j.f13246A, zzaq);
        C3909jn.f13411a.post(new C3130q(this, adOverlayInfoParcel));
    }

    /* renamed from: e_ */
    public final void mo12688e_() {
    }
}
