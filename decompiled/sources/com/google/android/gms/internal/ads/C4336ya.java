package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* renamed from: com.google.android.gms.internal.ads.ya */
public final class C4336ya implements C4178tm {

    /* renamed from: a */
    private static final byte[] f14221a = new byte[0];

    /* renamed from: b */
    private final ECPrivateKey f14222b;

    /* renamed from: c */
    private final C4338yc f14223c;

    /* renamed from: d */
    private final String f14224d;

    /* renamed from: e */
    private final byte[] f14225e;

    /* renamed from: f */
    private final C4344yi f14226f;

    /* renamed from: g */
    private final C4334xz f14227g;

    public C4336ya(ECPrivateKey eCPrivateKey, byte[] bArr, String str, C4344yi yiVar, C4334xz xzVar) throws GeneralSecurityException {
        this.f14222b = eCPrivateKey;
        this.f14223c = new C4338yc(eCPrivateKey);
        this.f14225e = bArr;
        this.f14224d = str;
        this.f14226f = yiVar;
        this.f14227g = xzVar;
    }
}
