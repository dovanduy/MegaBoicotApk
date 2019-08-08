package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4286wt.C4288b;
import com.google.android.gms.internal.ads.C4300xc.C4302b;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.tt */
public final class C4185tt {
    @Deprecated
    /* renamed from: a */
    public static final C4181tp m18194a(byte[] bArr) throws GeneralSecurityException {
        try {
            C4300xc a = C4300xc.m18561a(bArr);
            for (C4302b bVar : a.mo16184b()) {
                if (bVar.mo16187b().mo16167c() == C4288b.UNKNOWN_KEYMATERIAL || bVar.mo16187b().mo16167c() == C4288b.SYMMETRIC) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                } else if (bVar.mo16187b().mo16167c() == C4288b.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return C4181tp.m18188a(a);
        } catch (abk unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
