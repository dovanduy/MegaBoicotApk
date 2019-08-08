package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.p132ts.TsExtractor;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.xu */
public final class C4329xu implements C4172tg {

    /* renamed from: a */
    private final byte[] f14215a;

    /* renamed from: b */
    private final byte[] f14216b;

    /* renamed from: c */
    private final SecretKeySpec f14217c;

    /* renamed from: d */
    private final int f14218d;

    public C4329xu(byte[] bArr, int i) throws GeneralSecurityException {
        if (i == 12 || i == 16) {
            this.f14218d = i;
            this.f14217c = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.f14217c);
            this.f14215a = m18651a(instance.doFinal(new byte[16]));
            this.f14216b = m18651a(this.f14215a);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    /* renamed from: a */
    private final byte[] m18650a(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2;
        byte[] b;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            b = m18652b(bArr3, this.f14215a);
        } else {
            byte[] doFinal = cipher.doFinal(bArr3);
            byte[] bArr4 = doFinal;
            int i4 = 0;
            while (i3 - i4 > 16) {
                for (int i5 = 0; i5 < 16; i5++) {
                    bArr4[i5] = (byte) (bArr4[i5] ^ bArr[(i2 + i4) + i5]);
                }
                bArr4 = cipher.doFinal(bArr4);
                i4 += 16;
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
            if (copyOfRange.length == 16) {
                bArr2 = m18652b(copyOfRange, this.f14215a);
            } else {
                byte[] copyOf = Arrays.copyOf(this.f14216b, 16);
                for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                    copyOf[i6] = (byte) (copyOf[i6] ^ copyOfRange[i6]);
                }
                copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
                bArr2 = copyOf;
            }
            b = m18652b(bArr4, bArr2);
        }
        return cipher.doFinal(b);
    }

    /* renamed from: a */
    private static byte[] m18651a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i2 < 15) {
            int i3 = i2 + 1;
            bArr2[i2] = (byte) ((bArr[i2] << 1) ^ ((bArr[i3] & 255) >>> 7));
            i2 = i3;
        }
        int i4 = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i = TsExtractor.TS_STREAM_TYPE_E_AC3;
        }
        bArr2[15] = (byte) (i4 ^ i);
        return bArr2;
    }

    /* renamed from: b */
    private static byte[] m18652b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: a */
    public final byte[] mo16071a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = bArr;
        if (bArr3.length > (Integer.MAX_VALUE - this.f14218d) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr4 = new byte[(this.f14218d + bArr3.length + 16)];
        byte[] a = C4360yy.m18699a(this.f14218d);
        System.arraycopy(a, 0, bArr4, 0, this.f14218d);
        Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
        instance.init(1, this.f14217c);
        byte[] a2 = m18650a(instance, 0, a, 0, a.length);
        byte[] bArr5 = bArr2 == null ? new byte[0] : bArr2;
        byte[] a3 = m18650a(instance, 1, bArr5, 0, bArr5.length);
        Cipher instance2 = Cipher.getInstance("AES/CTR/NOPADDING");
        instance2.init(1, this.f14217c, new IvParameterSpec(a2));
        instance2.doFinal(bArr3, 0, bArr3.length, bArr4, this.f14218d);
        byte[] a4 = m18650a(instance, 2, bArr4, this.f14218d, bArr3.length);
        int length = bArr3.length + this.f14218d;
        for (int i = 0; i < 16; i++) {
            bArr4[length + i] = (byte) ((a3[i] ^ a2[i]) ^ a4[i]);
        }
        return bArr4;
    }
}
