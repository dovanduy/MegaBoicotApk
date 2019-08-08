package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4223vb.C4224a;
import com.google.android.gms.internal.ads.C4242vo.C4243a;
import com.google.android.gms.internal.ads.C4277wn.C4278a;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.us */
final class C4211us implements C4334xz {

    /* renamed from: a */
    private final String f14108a;

    /* renamed from: b */
    private final int f14109b;

    /* renamed from: c */
    private C4242vo f14110c;

    /* renamed from: d */
    private C4216ux f14111d;

    /* renamed from: e */
    private int f14112e;

    C4211us(C4293wy wyVar) throws GeneralSecurityException {
        this.f14108a = wyVar.mo16171a();
        if (this.f14108a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                C4245vq a = C4245vq.m18396a(wyVar.mo16172b());
                this.f14110c = (C4242vo) C4188tw.m18209b(wyVar);
                this.f14109b = a.mo16127a();
            } catch (abk e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (this.f14108a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                C4219uz a2 = C4219uz.m18323a(wyVar.mo16172b());
                this.f14111d = (C4216ux) C4188tw.m18209b(wyVar);
                this.f14112e = a2.mo16103a().mo16112b();
                this.f14109b = this.f14112e + a2.mo16104b().mo16162b();
            } catch (abk e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        } else {
            String str = "unsupported AEAD DEM key type: ";
            String valueOf = String.valueOf(this.f14108a);
            throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    /* renamed from: a */
    public final int mo16095a() {
        return this.f14109b;
    }

    /* renamed from: a */
    public final C4172tg mo16096a(byte[] bArr) throws GeneralSecurityException {
        acl acl;
        if (bArr.length != this.f14109b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.f14108a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            acl = (C4242vo) ((C4243a) C4242vo.m18389c().mo13993a(this.f14110c)).mo16126a(C4386zw.m18763a(bArr, 0, this.f14109b)).mo13995c();
        } else if (this.f14108a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f14112e);
            C4277wn wnVar = (C4277wn) ((C4278a) C4277wn.m18489d().mo13993a(this.f14111d.mo16099c())).mo16160a(C4386zw.m18762a(Arrays.copyOfRange(bArr, this.f14112e, this.f14109b))).mo13995c();
            acl = (C4216ux) C4216ux.m18314d().mo16100a(this.f14111d.mo16097a()).mo16101a((C4223vb) ((C4224a) C4223vb.m18336d().mo13993a(this.f14111d.mo16098b())).mo16110a(C4386zw.m18762a(copyOfRange)).mo13995c()).mo16102a(wnVar).mo13995c();
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
        return (C4172tg) C4188tw.m18211b(this.f14108a, acl);
    }
}
