package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4325xr.C4326a;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.uw */
public final class C4215uw {

    /* renamed from: a */
    public static final C4325xr f14114a = ((C4325xr) C4325xr.m18643b().mo16210a("TINK_MAC_1_0_0").mo16209a(C4175tj.m18180a("TinkMac", "Mac", "HmacKey", 0, true)).mo13995c());

    /* renamed from: b */
    private static final C4325xr f14115b = ((C4325xr) ((C4326a) C4325xr.m18643b().mo13993a(f14114a)).mo16210a("TINK_MAC_1_1_0").mo13995c());

    static {
        try {
            m18306a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m18306a() throws GeneralSecurityException {
        C4188tw.m18206a("TinkMac", (C4174ti<P>) new C4214uv<P>());
    }
}
