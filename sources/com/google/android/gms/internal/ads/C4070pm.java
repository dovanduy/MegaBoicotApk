package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C3025aw;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.pm */
public final class C4070pm extends C3894iz {

    /* renamed from: a */
    final C4061pd f13779a;

    /* renamed from: b */
    final C4073pp f13780b;

    /* renamed from: c */
    private final String f13781c;

    C4070pm(C4061pd pdVar, C4073pp ppVar, String str) {
        this.f13779a = pdVar;
        this.f13780b = ppVar;
        this.f13781c = str;
        C3025aw.m10938z().mo15833a(this);
    }

    /* renamed from: a */
    public final void mo12687a() {
        try {
            this.f13780b.mo15838a(this.f13781c);
        } finally {
            C3909jn.f13411a.post(new C4071pn(this));
        }
    }

    /* renamed from: e_ */
    public final void mo12688e_() {
        this.f13780b.mo15839b();
    }
}
