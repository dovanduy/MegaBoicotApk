package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.C3102m;

final class ayi {

    /* renamed from: a */
    C3102m f12390a;

    /* renamed from: b */
    zzjj f12391b;

    /* renamed from: c */
    axb f12392c;

    /* renamed from: d */
    long f12393d;

    /* renamed from: e */
    boolean f12394e;

    /* renamed from: f */
    boolean f12395f;

    /* renamed from: g */
    private final /* synthetic */ ayh f12396g;

    ayi(ayh ayh, axa axa) {
        this.f12396g = ayh;
        this.f12390a = axa.mo14933b(ayh.f12387c);
        this.f12392c = new axb();
        axb axb = this.f12392c;
        C3102m mVar = this.f12390a;
        mVar.mo12406a((aow) new axc(axb));
        mVar.mo12408a((apq) new axl(axb));
        mVar.mo12411a((aso) new axn(axb));
        mVar.mo12405a((aot) new axp(axb));
        mVar.mo12413a((C3822gh) new axr(axb));
    }

    ayi(ayh ayh, axa axa, zzjj zzjj) {
        this(ayh, axa);
        this.f12391b = zzjj;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo14974a() {
        if (this.f12394e) {
            return false;
        }
        this.f12395f = this.f12390a.mo12431b(ayf.m15705b(this.f12391b != null ? this.f12391b : this.f12396g.f12386b));
        this.f12394e = true;
        this.f12393d = C3025aw.m10924l().mo13694a();
        return true;
    }
}
