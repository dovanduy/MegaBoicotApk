package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.yw */
public final class C4358yw implements C4184ts {

    /* renamed from: a */
    private Mac f14263a;

    /* renamed from: b */
    private final int f14264b;

    /* renamed from: c */
    private final String f14265c;

    /* renamed from: d */
    private final Key f14266d;

    public C4358yw(String str, Key key, int i) throws GeneralSecurityException {
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1823053428) {
            if (hashCode != 392315118) {
                if (hashCode == 392317873 && str.equals("HMACSHA512")) {
                    c = 2;
                }
            } else if (str.equals("HMACSHA256")) {
                c = 1;
            }
        } else if (str.equals("HMACSHA1")) {
            c = 0;
        }
        switch (c) {
            case 0:
                if (i > 20) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
                break;
            case 1:
                if (i > 32) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
                break;
            case 2:
                if (i > 64) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
                break;
            default:
                String str2 = "unknown Hmac algorithm: ";
                String valueOf = String.valueOf(str);
                throw new NoSuchAlgorithmException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        this.f14265c = str;
        this.f14264b = i;
        this.f14266d = key;
        this.f14263a = (Mac) C4346yk.f14251b.mo16218a(str);
        this.f14263a.init(key);
    }

    /* renamed from: a */
    public final byte[] mo16088a(byte[] bArr) throws GeneralSecurityException {
        Mac mac;
        try {
            mac = (Mac) this.f14263a.clone();
        } catch (CloneNotSupportedException unused) {
            mac = (Mac) C4346yk.f14251b.mo16218a(this.f14265c);
            mac.init(this.f14266d);
        }
        mac.update(bArr);
        byte[] bArr2 = new byte[this.f14264b];
        System.arraycopy(mac.doFinal(), 0, bArr2, 0, this.f14264b);
        return bArr2;
    }
}
