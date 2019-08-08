package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.xv */
public final class C4330xv implements C4172tg {

    /* renamed from: a */
    private final SecretKey f14219a;

    public C4330xv(byte[] bArr) {
        this.f14219a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: a */
    public final byte[] mo16071a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
        byte[] a = C4360yy.m18699a(12);
        System.arraycopy(a, 0, bArr3, 0, 12);
        Cipher cipher = (Cipher) C4346yk.f14250a.mo16218a("AES/GCM/NoPadding");
        cipher.init(1, this.f14219a, new GCMParameterSpec(128, a));
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        return bArr3;
    }
}
