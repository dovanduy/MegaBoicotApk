package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.yj */
public final class C4345yj implements C4172tg {

    /* renamed from: a */
    private final C4357yv f14247a;

    /* renamed from: b */
    private final C4184ts f14248b;

    /* renamed from: c */
    private final int f14249c;

    public C4345yj(C4357yv yvVar, C4184ts tsVar, int i) {
        this.f14247a = yvVar;
        this.f14248b = tsVar;
        this.f14249c = i;
    }

    /* renamed from: a */
    public final byte[] mo16071a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] a = this.f14247a.mo16211a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(8 * ((long) bArr2.length)).array(), 8);
        return C4331xw.m18656a(a, this.f14248b.mo16088a(C4331xw.m18656a(bArr2, a, copyOf)));
    }
}
