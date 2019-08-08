package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.uk */
final class C4203uk implements C4180to<C4179tn> {
    C4203uk() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C4179tn mo16080a(C4386zw zwVar) throws GeneralSecurityException {
        try {
            C4266we a = C4266we.m18446a(zwVar);
            if (!(a instanceof C4266we)) {
                throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
            }
            C4266we weVar = a;
            C4366zd.m18712a(weVar.mo16144a(), 0);
            C4209uq.m18294a(weVar.mo16145b());
            C4260wa b = weVar.mo16145b();
            C4269wg a2 = b.mo16135a();
            C4337yb ybVar = new C4337yb(C4341yf.m18670a(C4209uq.m18291a(a2.mo16152a()), weVar.mo16146c().mo16234b(), weVar.mo16147d().mo16234b()), a2.mo16154c().mo16234b(), C4209uq.m18293a(a2.mo16153b()), C4209uq.m18292a(b.mo16137c()), new C4211us(b.mo16136b().mo16132a()));
            return ybVar;
        } catch (abk e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPublicKey proto", e);
        }
    }

    /* renamed from: a */
    public final int mo16078a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo16079a(acl acl) throws GeneralSecurityException {
        if (!(acl instanceof C4266we)) {
            throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
        }
        C4266we weVar = (C4266we) acl;
        C4366zd.m18712a(weVar.mo16144a(), 0);
        C4209uq.m18294a(weVar.mo16145b());
        C4260wa b = weVar.mo16145b();
        C4269wg a = b.mo16135a();
        C4337yb ybVar = new C4337yb(C4341yf.m18670a(C4209uq.m18291a(a.mo16152a()), weVar.mo16146c().mo16234b(), weVar.mo16147d().mo16234b()), a.mo16154c().mo16234b(), C4209uq.m18293a(a.mo16153b()), C4209uq.m18292a(b.mo16137c()), new C4211us(b.mo16136b().mo16132a()));
        return ybVar;
    }

    /* renamed from: b */
    public final acl mo16081b(acl acl) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }

    /* renamed from: b */
    public final acl mo16082b(C4386zw zwVar) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }

    /* renamed from: c */
    public final C4286wt mo16083c(C4386zw zwVar) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }
}
