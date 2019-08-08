package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4286wt.C4288b;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.ua */
class C4193ua implements C4180to<C4172tg> {

    /* renamed from: a */
    private static final Logger f14095a = Logger.getLogger(C4193ua.class.getName());

    C4193ua() throws GeneralSecurityException {
        C4188tw.m18207a("type.googleapis.com/google.crypto.tink.AesCtrKey", (C4180to<P>) new C4194ub<P>());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C4172tg mo16080a(C4386zw zwVar) throws GeneralSecurityException {
        try {
            C4216ux a = C4216ux.m18307a(zwVar);
            if (!(a instanceof C4216ux)) {
                throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
            }
            C4216ux uxVar = a;
            C4366zd.m18712a(uxVar.mo16097a(), 0);
            return new C4345yj((C4357yv) C4188tw.m18211b("type.googleapis.com/google.crypto.tink.AesCtrKey", uxVar.mo16098b()), (C4184ts) C4188tw.m18211b("type.googleapis.com/google.crypto.tink.HmacKey", uxVar.mo16099c()), uxVar.mo16099c().mo16156b().mo16164b());
        } catch (abk e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", e);
        }
    }

    /* renamed from: a */
    public final int mo16078a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo16079a(acl acl) throws GeneralSecurityException {
        if (!(acl instanceof C4216ux)) {
            throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
        }
        C4216ux uxVar = (C4216ux) acl;
        C4366zd.m18712a(uxVar.mo16097a(), 0);
        return new C4345yj((C4357yv) C4188tw.m18211b("type.googleapis.com/google.crypto.tink.AesCtrKey", uxVar.mo16098b()), (C4184ts) C4188tw.m18211b("type.googleapis.com/google.crypto.tink.HmacKey", uxVar.mo16099c()), uxVar.mo16099c().mo16156b().mo16164b());
    }

    /* renamed from: b */
    public final acl mo16081b(acl acl) throws GeneralSecurityException {
        if (!(acl instanceof C4219uz)) {
            throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
        }
        C4219uz uzVar = (C4219uz) acl;
        C4223vb vbVar = (C4223vb) C4188tw.m18200a("type.googleapis.com/google.crypto.tink.AesCtrKey", (acl) uzVar.mo16103a());
        return C4216ux.m18314d().mo16101a(vbVar).mo16102a((C4277wn) C4188tw.m18200a("type.googleapis.com/google.crypto.tink.HmacKey", (acl) uzVar.mo16104b())).mo16100a(0).mo13995c();
    }

    /* renamed from: b */
    public final acl mo16082b(C4386zw zwVar) throws GeneralSecurityException {
        try {
            return mo16081b((acl) C4219uz.m18323a(zwVar));
        } catch (abk e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", e);
        }
    }

    /* renamed from: c */
    public final C4286wt mo16083c(C4386zw zwVar) throws GeneralSecurityException {
        return (C4286wt) C4286wt.m18516d().mo16170a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").mo16169a(((C4216ux) mo16082b(zwVar)).mo14067h()).mo16168a(C4288b.SYMMETRIC).mo13995c();
    }
}
