package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4286wt.C4288b;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ud */
final class C4196ud implements C4180to<C4172tg> {
    C4196ud() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C4172tg mo16080a(C4386zw zwVar) throws GeneralSecurityException {
        try {
            C4242vo a = C4242vo.m18384a(zwVar);
            if (!(a instanceof C4242vo)) {
                throw new GeneralSecurityException("expected AesGcmKey proto");
            }
            C4242vo voVar = a;
            C4366zd.m18712a(voVar.mo16123a(), 0);
            C4366zd.m18711a(voVar.mo16124b().mo13769a());
            return new C4330xv(voVar.mo16124b().mo16234b());
        } catch (abk unused) {
            throw new GeneralSecurityException("expected AesGcmKey proto");
        }
    }

    /* renamed from: a */
    public final int mo16078a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo16079a(acl acl) throws GeneralSecurityException {
        if (!(acl instanceof C4242vo)) {
            throw new GeneralSecurityException("expected AesGcmKey proto");
        }
        C4242vo voVar = (C4242vo) acl;
        C4366zd.m18712a(voVar.mo16123a(), 0);
        C4366zd.m18711a(voVar.mo16124b().mo13769a());
        return new C4330xv(voVar.mo16124b().mo16234b());
    }

    /* renamed from: b */
    public final acl mo16081b(acl acl) throws GeneralSecurityException {
        if (!(acl instanceof C4245vq)) {
            throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
        }
        C4245vq vqVar = (C4245vq) acl;
        C4366zd.m18711a(vqVar.mo16127a());
        return C4242vo.m18389c().mo16126a(C4386zw.m18762a(C4360yy.m18699a(vqVar.mo16127a()))).mo16125a(0).mo13995c();
    }

    /* renamed from: b */
    public final acl mo16082b(C4386zw zwVar) throws GeneralSecurityException {
        try {
            return mo16081b((acl) C4245vq.m18396a(zwVar));
        } catch (abk e) {
            throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", e);
        }
    }

    /* renamed from: c */
    public final C4286wt mo16083c(C4386zw zwVar) throws GeneralSecurityException {
        return (C4286wt) C4286wt.m18516d().mo16170a("type.googleapis.com/google.crypto.tink.AesGcmKey").mo16169a(((C4242vo) mo16082b(zwVar)).mo14067h()).mo16168a(C4288b.SYMMETRIC).mo13995c();
    }
}
