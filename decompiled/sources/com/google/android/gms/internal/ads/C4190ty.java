package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ty */
final class C4190ty implements C4174ti<C4172tg> {
    /* renamed from: a */
    public final C4180to<C4172tg> mo16076a(String str, String str2, int i) throws GeneralSecurityException {
        C4180to<C4172tg> toVar;
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if ((lowerCase.hashCode() == 2989895 && lowerCase.equals("aead")) ? false : true) {
            throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
        }
        switch (str.hashCode()) {
            case 360753376:
                if (str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    c = 3;
                    break;
                }
                break;
            case 1215885937:
                if (str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    c = 0;
                    break;
                }
                break;
            case 1469984853:
                if (str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    c = 4;
                    break;
                }
                break;
            case 1797113348:
                if (str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    c = 1;
                    break;
                }
                break;
            case 1855890991:
                if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    c = 2;
                    break;
                }
                break;
            case 2079211877:
                if (str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                toVar = new C4193ua<>();
                break;
            case 1:
                toVar = new C4195uc<>();
                break;
            case 2:
                toVar = new C4196ud<>();
                break;
            case 3:
                toVar = new C4197ue<>();
                break;
            case 4:
                toVar = new C4198uf<>();
                break;
            case 5:
                toVar = new C4200uh<>();
                break;
            default:
                throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", new Object[]{str}));
        }
        if (toVar.mo16078a() >= i) {
            return toVar;
        }
        throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
    }
}
