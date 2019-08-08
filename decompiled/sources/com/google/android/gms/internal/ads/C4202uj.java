package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4286wt.C4288b;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;

/* renamed from: com.google.android.gms.internal.ads.uj */
final class C4202uj implements C4180to<C4178tm> {
    C4202uj() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C4178tm mo16080a(C4386zw zwVar) throws GeneralSecurityException {
        try {
            C4263wc a = C4263wc.m18430a(zwVar);
            if (!(a instanceof C4263wc)) {
                throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
            }
            C4263wc wcVar = a;
            C4366zd.m18712a(wcVar.mo16138a(), 0);
            C4209uq.m18294a(wcVar.mo16139b().mo16145b());
            C4260wa b = wcVar.mo16139b().mo16145b();
            C4269wg a2 = b.mo16135a();
            C4343yh a3 = C4209uq.m18291a(a2.mo16152a());
            byte[] b2 = wcVar.mo16140c().mo16234b();
            C4336ya yaVar = new C4336ya((ECPrivateKey) ((KeyFactory) C4346yk.f14254e.mo16218a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, b2), C4341yf.m18671a(a3))), a2.mo16154c().mo16234b(), C4209uq.m18293a(a2.mo16153b()), C4209uq.m18292a(b.mo16137c()), new C4211us(b.mo16136b().mo16132a()));
            return yaVar;
        } catch (abk e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPrivateKey proto", e);
        }
    }

    /* renamed from: a */
    public final int mo16078a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo16079a(acl acl) throws GeneralSecurityException {
        if (!(acl instanceof C4263wc)) {
            throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
        }
        C4263wc wcVar = (C4263wc) acl;
        C4366zd.m18712a(wcVar.mo16138a(), 0);
        C4209uq.m18294a(wcVar.mo16139b().mo16145b());
        C4260wa b = wcVar.mo16139b().mo16145b();
        C4269wg a = b.mo16135a();
        C4343yh a2 = C4209uq.m18291a(a.mo16152a());
        byte[] b2 = wcVar.mo16140c().mo16234b();
        C4336ya yaVar = new C4336ya((ECPrivateKey) ((KeyFactory) C4346yk.f14254e.mo16218a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, b2), C4341yf.m18671a(a2))), a.mo16154c().mo16234b(), C4209uq.m18293a(a.mo16153b()), C4209uq.m18292a(b.mo16137c()), new C4211us(b.mo16136b().mo16132a()));
        return yaVar;
    }

    /* renamed from: b */
    public final acl mo16081b(acl acl) throws GeneralSecurityException {
        if (!(acl instanceof C4256vy)) {
            throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
        }
        C4256vy vyVar = (C4256vy) acl;
        C4209uq.m18294a(vyVar.mo16133a());
        KeyPair a = C4341yf.m18669a(C4341yf.m18671a(C4209uq.m18291a(vyVar.mo16133a().mo16135a().mo16152a())));
        ECPublicKey eCPublicKey = (ECPublicKey) a.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) a.getPrivate();
        ECPoint w = eCPublicKey.getW();
        return C4263wc.m18437d().mo16141a(0).mo16142a((C4266we) C4266we.m18455e().mo16148a(0).mo16149a(vyVar.mo16133a()).mo16150a(C4386zw.m18762a(w.getAffineX().toByteArray())).mo16151b(C4386zw.m18762a(w.getAffineY().toByteArray())).mo13995c()).mo16143a(C4386zw.m18762a(eCPrivateKey.getS().toByteArray())).mo13995c();
    }

    /* renamed from: b */
    public final acl mo16082b(C4386zw zwVar) throws GeneralSecurityException {
        try {
            return mo16081b((acl) C4256vy.m18419a(zwVar));
        } catch (abk e) {
            throw new GeneralSecurityException("invalid EciesAeadHkdf key format", e);
        }
    }

    /* renamed from: c */
    public final C4286wt mo16083c(C4386zw zwVar) throws GeneralSecurityException {
        return (C4286wt) C4286wt.m18516d().mo16170a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").mo16169a(((C4263wc) mo16082b(zwVar)).mo14067h()).mo16168a(C4288b.ASYMMETRIC_PRIVATE).mo13995c();
    }
}
