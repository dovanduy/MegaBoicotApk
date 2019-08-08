package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3894iz;
import com.google.android.gms.internal.ads.C3909jn;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.overlay.i */
final class C3113i extends C3894iz {

    /* renamed from: a */
    final /* synthetic */ C3107c f9108a;

    private C3113i(C3107c cVar) {
        this.f9108a = cVar;
    }

    /* synthetic */ C3113i(C3107c cVar, C3109e eVar) {
        this(cVar);
    }

    /* renamed from: a */
    public final void mo12687a() {
        Bitmap a = C3025aw.m10937y().mo15606a(Integer.valueOf(this.f9108a.f9081b.f9077o.f9157e));
        if (a != null) {
            C3909jn.f13411a.post(new C3114j(this, C3025aw.m10919g().mo15534a(this.f9108a.f9080a, a, this.f9108a.f9081b.f9077o.f9155c, this.f9108a.f9081b.f9077o.f9156d)));
        }
    }

    /* renamed from: e_ */
    public final void mo12688e_() {
    }
}
