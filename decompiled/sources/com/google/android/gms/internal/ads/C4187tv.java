package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.tv */
public final class C4187tv<P> {

    /* renamed from: a */
    private final P f14084a;

    /* renamed from: b */
    private final byte[] f14085b;

    /* renamed from: c */
    private final C4291ww f14086c;

    /* renamed from: d */
    private final C4323xp f14087d;

    public C4187tv(P p, byte[] bArr, C4291ww wwVar, C4323xp xpVar) {
        this.f14084a = p;
        this.f14085b = Arrays.copyOf(bArr, bArr.length);
        this.f14086c = wwVar;
        this.f14087d = xpVar;
    }

    /* renamed from: a */
    public final P mo16092a() {
        return this.f14084a;
    }

    /* renamed from: b */
    public final byte[] mo16093b() {
        if (this.f14085b == null) {
            return null;
        }
        return Arrays.copyOf(this.f14085b, this.f14085b.length);
    }
}
