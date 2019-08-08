package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4286wt.C4288b;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.ut */
final class C4212ut implements C4180to<C4184ts> {
    C4212ut() {
    }

    /* renamed from: a */
    private static void m18297a(C4283wr wrVar) throws GeneralSecurityException {
        if (wrVar.mo16164b() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        switch (wrVar.mo16163a()) {
            case SHA1:
                if (wrVar.mo16164b() > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            case SHA256:
                if (wrVar.mo16164b() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            case SHA512:
                if (wrVar.mo16164b() > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            default:
                throw new GeneralSecurityException("unknown hash type");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C4184ts mo16080a(C4386zw zwVar) throws GeneralSecurityException {
        C4358yw ywVar;
        try {
            C4277wn a = C4277wn.m18482a(zwVar);
            if (!(a instanceof C4277wn)) {
                throw new GeneralSecurityException("expected HmacKey proto");
            }
            C4277wn wnVar = a;
            C4366zd.m18712a(wnVar.mo16155a(), 0);
            if (wnVar.mo16157c().mo13769a() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            m18297a(wnVar.mo16156b());
            C4275wl a2 = wnVar.mo16156b().mo16163a();
            SecretKeySpec secretKeySpec = new SecretKeySpec(wnVar.mo16157c().mo16234b(), "HMAC");
            int b = wnVar.mo16156b().mo16164b();
            switch (a2) {
                case SHA1:
                    ywVar = new C4358yw("HMACSHA1", secretKeySpec, b);
                    break;
                case SHA256:
                    ywVar = new C4358yw("HMACSHA256", secretKeySpec, b);
                    break;
                case SHA512:
                    ywVar = new C4358yw("HMACSHA512", secretKeySpec, b);
                    break;
                default:
                    throw new GeneralSecurityException("unknown hash");
            }
            return ywVar;
        } catch (abk e) {
            throw new GeneralSecurityException("expected serialized HmacKey proto", e);
        }
    }

    /* renamed from: a */
    public final int mo16078a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo16079a(acl acl) throws GeneralSecurityException {
        if (!(acl instanceof C4277wn)) {
            throw new GeneralSecurityException("expected HmacKey proto");
        }
        C4277wn wnVar = (C4277wn) acl;
        C4366zd.m18712a(wnVar.mo16155a(), 0);
        if (wnVar.mo16157c().mo13769a() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m18297a(wnVar.mo16156b());
        C4275wl a = wnVar.mo16156b().mo16163a();
        SecretKeySpec secretKeySpec = new SecretKeySpec(wnVar.mo16157c().mo16234b(), "HMAC");
        int b = wnVar.mo16156b().mo16164b();
        switch (a) {
            case SHA1:
                return new C4358yw("HMACSHA1", secretKeySpec, b);
            case SHA256:
                return new C4358yw("HMACSHA256", secretKeySpec, b);
            case SHA512:
                return new C4358yw("HMACSHA512", secretKeySpec, b);
            default:
                throw new GeneralSecurityException("unknown hash");
        }
    }

    /* renamed from: b */
    public final acl mo16081b(acl acl) throws GeneralSecurityException {
        if (!(acl instanceof C4280wp)) {
            throw new GeneralSecurityException("expected HmacKeyFormat proto");
        }
        C4280wp wpVar = (C4280wp) acl;
        if (wpVar.mo16162b() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m18297a(wpVar.mo16161a());
        return C4277wn.m18489d().mo16158a(0).mo16159a(wpVar.mo16161a()).mo16160a(C4386zw.m18762a(C4360yy.m18699a(wpVar.mo16162b()))).mo13995c();
    }

    /* renamed from: b */
    public final acl mo16082b(C4386zw zwVar) throws GeneralSecurityException {
        try {
            return mo16081b((acl) C4280wp.m18499a(zwVar));
        } catch (abk e) {
            throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", e);
        }
    }

    /* renamed from: c */
    public final C4286wt mo16083c(C4386zw zwVar) throws GeneralSecurityException {
        return (C4286wt) C4286wt.m18516d().mo16170a("type.googleapis.com/google.crypto.tink.HmacKey").mo16169a(((C4277wn) mo16082b(zwVar)).mo14067h()).mo16168a(C4288b.SYMMETRIC).mo13995c();
    }
}
