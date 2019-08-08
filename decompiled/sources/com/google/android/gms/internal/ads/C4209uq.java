package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.ads.uq */
final class C4209uq {
    /* renamed from: a */
    public static C4343yh m18291a(C4272wi wiVar) throws GeneralSecurityException {
        switch (C4210ur.f14106b[wiVar.ordinal()]) {
            case 1:
                return C4343yh.NIST_P256;
            case 2:
                return C4343yh.NIST_P384;
            case 3:
                return C4343yh.NIST_P521;
            default:
                String valueOf = String.valueOf(wiVar);
                StringBuilder sb = new StringBuilder(20 + String.valueOf(valueOf).length());
                sb.append("unknown curve type: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
        }
    }

    /* renamed from: a */
    public static C4344yi m18292a(C4251vu vuVar) throws GeneralSecurityException {
        switch (C4210ur.f14107c[vuVar.ordinal()]) {
            case 1:
                return C4344yi.UNCOMPRESSED;
            case 2:
                return C4344yi.COMPRESSED;
            default:
                String valueOf = String.valueOf(vuVar);
                StringBuilder sb = new StringBuilder(22 + String.valueOf(valueOf).length());
                sb.append("unknown point format: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
        }
    }

    /* renamed from: a */
    public static String m18293a(C4275wl wlVar) throws NoSuchAlgorithmException {
        switch (C4210ur.f14105a[wlVar.ordinal()]) {
            case 1:
                return "HmacSha1";
            case 2:
                return "HmacSha256";
            case 3:
                return "HmacSha512";
            default:
                String valueOf = String.valueOf(wlVar);
                StringBuilder sb = new StringBuilder(27 + String.valueOf(valueOf).length());
                sb.append("hash unsupported for HMAC: ");
                sb.append(valueOf);
                throw new NoSuchAlgorithmException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m18294a(C4260wa waVar) throws GeneralSecurityException {
        C4341yf.m18671a(m18291a(waVar.mo16135a().mo16152a()));
        m18293a(waVar.mo16135a().mo16153b());
        if (waVar.mo16137c() == C4251vu.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        C4188tw.m18203a(waVar.mo16136b().mo16132a());
    }
}
