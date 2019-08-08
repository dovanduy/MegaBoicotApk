package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4286wt.C4288b;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ub */
final class C4194ub implements C4180to<C4357yv> {
    C4194ub() {
    }

    /* renamed from: a */
    private static void m18224a(C4229vf vfVar) throws GeneralSecurityException {
        if (vfVar.mo16113a() < 12 || vfVar.mo16113a() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C4328xt mo16080a(C4386zw zwVar) throws GeneralSecurityException {
        try {
            C4223vb a = C4223vb.m18329a(zwVar);
            if (!(a instanceof C4223vb)) {
                throw new GeneralSecurityException("expected AesCtrKey proto");
            }
            C4223vb vbVar = a;
            C4366zd.m18712a(vbVar.mo16105a(), 0);
            C4366zd.m18711a(vbVar.mo16107c().mo13769a());
            m18224a(vbVar.mo16106b());
            return new C4328xt(vbVar.mo16107c().mo16234b(), vbVar.mo16106b().mo16113a());
        } catch (abk e) {
            throw new GeneralSecurityException("expected serialized AesCtrKey proto", e);
        }
    }

    /* renamed from: a */
    public final int mo16078a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo16079a(acl acl) throws GeneralSecurityException {
        if (!(acl instanceof C4223vb)) {
            throw new GeneralSecurityException("expected AesCtrKey proto");
        }
        C4223vb vbVar = (C4223vb) acl;
        C4366zd.m18712a(vbVar.mo16105a(), 0);
        C4366zd.m18711a(vbVar.mo16107c().mo13769a());
        m18224a(vbVar.mo16106b());
        return new C4328xt(vbVar.mo16107c().mo16234b(), vbVar.mo16106b().mo16113a());
    }

    /* renamed from: b */
    public final acl mo16081b(acl acl) throws GeneralSecurityException {
        if (!(acl instanceof C4226vd)) {
            throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
        }
        C4226vd vdVar = (C4226vd) acl;
        C4366zd.m18711a(vdVar.mo16112b());
        m18224a(vdVar.mo16111a());
        return C4223vb.m18336d().mo16109a(vdVar.mo16111a()).mo16110a(C4386zw.m18762a(C4360yy.m18699a(vdVar.mo16112b()))).mo16108a(0).mo13995c();
    }

    /* renamed from: b */
    public final acl mo16082b(C4386zw zwVar) throws GeneralSecurityException {
        try {
            return mo16081b((acl) C4226vd.m18346a(zwVar));
        } catch (abk e) {
            throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", e);
        }
    }

    /* renamed from: c */
    public final C4286wt mo16083c(C4386zw zwVar) throws GeneralSecurityException {
        return (C4286wt) C4286wt.m18516d().mo16170a("type.googleapis.com/google.crypto.tink.AesCtrKey").mo16169a(((C4223vb) mo16082b(zwVar)).mo14067h()).mo16168a(C4288b.SYMMETRIC).mo13995c();
    }
}
