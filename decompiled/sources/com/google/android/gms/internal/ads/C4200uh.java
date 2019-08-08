package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4286wt.C4288b;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.uh */
final class C4200uh implements C4180to<C4172tg> {
    C4200uh() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C4172tg mo16080a(C4386zw zwVar) throws GeneralSecurityException {
        try {
            C4316xk a = C4316xk.m18615a(zwVar);
            if (!(a instanceof C4316xk)) {
                throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
            }
            C4316xk xkVar = a;
            C4366zd.m18712a(xkVar.mo16202a(), 0);
            String a2 = xkVar.mo16203b().mo16206a();
            return new C4199ug(xkVar.mo16203b().mo16207b(), C4183tr.m18192a(a2).mo16087b(a2));
        } catch (abk e) {
            throw new GeneralSecurityException("expected serialized KmSEnvelopeAeadKey proto", e);
        }
    }

    /* renamed from: a */
    public final int mo16078a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo16079a(acl acl) throws GeneralSecurityException {
        if (!(acl instanceof C4316xk)) {
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
        }
        C4316xk xkVar = (C4316xk) acl;
        C4366zd.m18712a(xkVar.mo16202a(), 0);
        String a = xkVar.mo16203b().mo16206a();
        return new C4199ug(xkVar.mo16203b().mo16207b(), C4183tr.m18192a(a).mo16087b(a));
    }

    /* renamed from: b */
    public final acl mo16081b(acl acl) throws GeneralSecurityException {
        if (!(acl instanceof C4320xn)) {
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
        }
        return C4316xk.m18620c().mo16205a((C4320xn) acl).mo16204a(0).mo13995c();
    }

    /* renamed from: b */
    public final acl mo16082b(C4386zw zwVar) throws GeneralSecurityException {
        try {
            return mo16081b((acl) C4320xn.m18630a(zwVar));
        } catch (abk e) {
            throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", e);
        }
    }

    /* renamed from: c */
    public final C4286wt mo16083c(C4386zw zwVar) throws GeneralSecurityException {
        return (C4286wt) C4286wt.m18516d().mo16170a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").mo16169a(((C4316xk) mo16082b(zwVar)).mo14067h()).mo16168a(C4288b.REMOTE).mo13995c();
    }
}
