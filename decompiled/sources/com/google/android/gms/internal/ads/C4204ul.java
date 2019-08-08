package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4325xr.C4326a;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ul */
public final class C4204ul {

    /* renamed from: a */
    public static final C4325xr f14101a = ((C4325xr) ((C4326a) C4325xr.m18643b().mo13993a(C4191tz.f14093a)).mo16209a(C4175tj.m18180a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).mo16209a(C4175tj.m18180a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).mo16210a("TINK_HYBRID_1_0_0").mo13995c());

    /* renamed from: b */
    private static final C4325xr f14102b = ((C4325xr) ((C4326a) C4325xr.m18643b().mo13993a(f14101a)).mo16210a("TINK_HYBRID_1_1_0").mo13995c());

    static {
        try {
            C4188tw.m18206a("TinkHybridEncrypt", (C4174ti<P>) new C4206un<P>());
            C4188tw.m18206a("TinkHybridDecrypt", (C4174ti<P>) new C4205um<P>());
            C4191tz.m18215a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
