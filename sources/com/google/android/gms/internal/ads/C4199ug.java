package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ug */
public final class C4199ug implements C4172tg {

    /* renamed from: a */
    private static final byte[] f14096a = new byte[0];

    /* renamed from: b */
    private final C4293wy f14097b;

    /* renamed from: c */
    private final C4172tg f14098c;

    public C4199ug(C4293wy wyVar, C4172tg tgVar) {
        this.f14097b = wyVar;
        this.f14098c = tgVar;
    }

    /* renamed from: a */
    public final byte[] mo16071a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] i = C4188tw.m18209b(this.f14097b).mo14068i();
        byte[] a = this.f14098c.mo16071a(i, f14096a);
        byte[] a2 = ((C4172tg) C4188tw.m18205a(this.f14097b.mo16171a(), i)).mo16071a(bArr, bArr2);
        return ByteBuffer.allocate(4 + a.length + a2.length).putInt(a.length).put(a).put(a2).array();
    }
}
