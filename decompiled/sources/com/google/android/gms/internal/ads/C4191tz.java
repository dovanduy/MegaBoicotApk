package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4325xr.C4326a;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.tz */
public final class C4191tz {

    /* renamed from: a */
    public static final C4325xr f14093a = ((C4325xr) ((C4326a) C4325xr.m18643b().mo13993a(C4215uw.f14114a)).mo16209a(C4175tj.m18180a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).mo16209a(C4175tj.m18180a("TinkAead", "Aead", "AesEaxKey", 0, true)).mo16209a(C4175tj.m18180a("TinkAead", "Aead", "AesGcmKey", 0, true)).mo16209a(C4175tj.m18180a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).mo16209a(C4175tj.m18180a("TinkAead", "Aead", "KmsAeadKey", 0, true)).mo16209a(C4175tj.m18180a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).mo16210a("TINK_AEAD_1_0_0").mo13995c());

    /* renamed from: b */
    private static final C4325xr f14094b = ((C4325xr) ((C4326a) C4325xr.m18643b().mo13993a(f14093a)).mo16210a("TINK_AEAD_1_1_0").mo13995c());

    static {
        try {
            m18215a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m18215a() throws GeneralSecurityException {
        C4188tw.m18206a("TinkAead", (C4174ti<P>) new C4190ty<P>());
        C4215uw.m18306a();
    }
}
