package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C3025aw;

/* renamed from: com.google.android.gms.internal.ads.iq */
final class C3885iq extends C3894iz {

    /* renamed from: a */
    private final /* synthetic */ C3883io f13339a;

    C3885iq(C3883io ioVar) {
        this.f13339a = ioVar;
    }

    /* renamed from: a */
    public final void mo12687a() {
        arw arw = new arw(this.f13339a.f13327f, this.f13339a.f13328g.f14505a);
        synchronized (this.f13339a.f13322a) {
            try {
                C3025aw.m10926n();
                arz.m15038a(this.f13339a.f13329h, arw);
            } catch (IllegalArgumentException e) {
                C3900je.m17432c("Cannot config CSI reporter.", e);
            }
        }
    }

    /* renamed from: e_ */
    public final void mo12688e_() {
    }
}
