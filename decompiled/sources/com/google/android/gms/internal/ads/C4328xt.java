package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.xt */
public final class C4328xt implements C4357yv {

    /* renamed from: a */
    private final SecretKeySpec f14212a;

    /* renamed from: b */
    private final int f14213b;

    /* renamed from: c */
    private final int f14214c = ((Cipher) C4346yk.f14250a.mo16218a("AES/CTR/NoPadding")).getBlockSize();

    public C4328xt(byte[] bArr, int i) throws GeneralSecurityException {
        this.f14212a = new SecretKeySpec(bArr, "AES");
        if (i < 12 || i > this.f14214c) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f14213b = i;
    }

    /* renamed from: a */
    public final byte[] mo16211a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length > Integer.MAX_VALUE - this.f14213b) {
            int i = Integer.MAX_VALUE - this.f14213b;
            StringBuilder sb = new StringBuilder(43);
            sb.append("plaintext length can not exceed ");
            sb.append(i);
            throw new GeneralSecurityException(sb.toString());
        }
        byte[] bArr2 = new byte[(this.f14213b + bArr.length)];
        byte[] a = C4360yy.m18699a(this.f14213b);
        System.arraycopy(a, 0, bArr2, 0, this.f14213b);
        int length = bArr.length;
        int i2 = this.f14213b;
        Cipher cipher = (Cipher) C4346yk.f14250a.mo16218a("AES/CTR/NoPadding");
        byte[] bArr3 = new byte[this.f14214c];
        System.arraycopy(a, 0, bArr3, 0, this.f14213b);
        cipher.init(1, this.f14212a, new IvParameterSpec(bArr3));
        if (cipher.doFinal(bArr, 0, length, bArr2, i2) == length) {
            return bArr2;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
