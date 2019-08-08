package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4286wt.C4288b;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.uf */
final class C4198uf implements C4180to<C4172tg> {
    C4198uf() {
    }

    /* renamed from: c */
    private static C4172tg m18254c(acl acl) throws GeneralSecurityException {
        if (!(acl instanceof C4310xg)) {
            throw new GeneralSecurityException("expected KmsAeadKey proto");
        }
        C4310xg xgVar = (C4310xg) acl;
        C4366zd.m18712a(xgVar.mo16197a(), 0);
        String a = xgVar.mo16198b().mo16201a();
        return C4183tr.m18192a(a).mo16087b(a);
    }

    /* renamed from: d */
    private static C4172tg m18255d(C4386zw zwVar) throws GeneralSecurityException {
        try {
            return m18254c((acl) C4310xg.m18598a(zwVar));
        } catch (abk e) {
            throw new GeneralSecurityException("expected KmsAeadKey proto", e);
        }
    }

    /* renamed from: a */
    public final int mo16078a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo16079a(acl acl) throws GeneralSecurityException {
        return m18254c(acl);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo16080a(C4386zw zwVar) throws GeneralSecurityException {
        return m18255d(zwVar);
    }

    /* renamed from: b */
    public final acl mo16081b(acl acl) throws GeneralSecurityException {
        if (!(acl instanceof C4313xi)) {
            throw new GeneralSecurityException("expected KmsAeadKeyFormat proto");
        }
        return C4310xg.m18603c().mo16200a((C4313xi) acl).mo16199a(0).mo13995c();
    }

    /* renamed from: b */
    public final acl mo16082b(C4386zw zwVar) throws GeneralSecurityException {
        try {
            return mo16081b((acl) C4313xi.m18610a(zwVar));
        } catch (abk e) {
            throw new GeneralSecurityException("expected serialized KmsAeadKeyFormat proto", e);
        }
    }

    /* renamed from: c */
    public final C4286wt mo16083c(C4386zw zwVar) throws GeneralSecurityException {
        return (C4286wt) C4286wt.m18516d().mo16170a("type.googleapis.com/google.crypto.tink.KmsAeadKey").mo16169a(((C4310xg) mo16082b(zwVar)).mo14067h()).mo16168a(C4288b.REMOTE).mo13995c();
    }
}
