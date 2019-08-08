package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4286wt.C4288b;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ue */
final class C4197ue implements C4180to<C4172tg> {
    C4197ue() {
    }

    /* renamed from: b */
    private static C4248vs m18246b() throws GeneralSecurityException {
        return (C4248vs) C4248vs.m18405c().mo16130a(0).mo16131a(C4386zw.m18762a(C4360yy.m18699a(32))).mo13995c();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C4172tg mo16080a(C4386zw zwVar) throws GeneralSecurityException {
        try {
            C4248vs a = C4248vs.m18400a(zwVar);
            if (!(a instanceof C4248vs)) {
                throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
            }
            C4248vs vsVar = a;
            C4366zd.m18712a(vsVar.mo16128a(), 0);
            if (vsVar.mo16129b().mo13769a() == 32) {
                return new C4333xy(vsVar.mo16129b().mo16234b());
            }
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        } catch (abk e) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", e);
        }
    }

    /* renamed from: a */
    public final int mo16078a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo16079a(acl acl) throws GeneralSecurityException {
        if (!(acl instanceof C4248vs)) {
            throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
        }
        C4248vs vsVar = (C4248vs) acl;
        C4366zd.m18712a(vsVar.mo16128a(), 0);
        if (vsVar.mo16129b().mo13769a() == 32) {
            return new C4333xy(vsVar.mo16129b().mo16234b());
        }
        throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
    }

    /* renamed from: b */
    public final acl mo16081b(acl acl) throws GeneralSecurityException {
        return m18246b();
    }

    /* renamed from: b */
    public final acl mo16082b(C4386zw zwVar) throws GeneralSecurityException {
        return m18246b();
    }

    /* renamed from: c */
    public final C4286wt mo16083c(C4386zw zwVar) throws GeneralSecurityException {
        return (C4286wt) C4286wt.m18516d().mo16170a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").mo16169a(m18246b().mo14067h()).mo16168a(C4288b.SYMMETRIC).mo13995c();
    }
}
