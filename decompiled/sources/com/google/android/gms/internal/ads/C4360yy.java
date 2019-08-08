package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.ads.yy */
public final class C4360yy {

    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f14267a = new C4361yz();

    /* renamed from: a */
    public static byte[] m18699a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f14267a.get()).nextBytes(bArr);
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static SecureRandom m18700b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
