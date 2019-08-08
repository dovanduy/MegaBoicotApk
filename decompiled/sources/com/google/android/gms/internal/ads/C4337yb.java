package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.android.gms.internal.ads.yb */
public final class C4337yb implements C4179tn {

    /* renamed from: a */
    private static final byte[] f14228a = new byte[0];

    /* renamed from: b */
    private final C4339yd f14229b;

    /* renamed from: c */
    private final String f14230c;

    /* renamed from: d */
    private final byte[] f14231d;

    /* renamed from: e */
    private final C4344yi f14232e;

    /* renamed from: f */
    private final C4334xz f14233f;

    public C4337yb(ECPublicKey eCPublicKey, byte[] bArr, String str, C4344yi yiVar, C4334xz xzVar) throws GeneralSecurityException {
        C4341yf.m18673a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f14229b = new C4339yd(eCPublicKey);
        this.f14231d = bArr;
        this.f14230c = str;
        this.f14232e = yiVar;
        this.f14233f = xzVar;
    }

    /* renamed from: a */
    public final byte[] mo16077a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        C4340ye a = this.f14229b.mo16215a(this.f14230c, this.f14231d, bArr2, this.f14233f.mo16095a(), this.f14232e);
        byte[] a2 = this.f14233f.mo16096a(a.mo16217b()).mo16071a(bArr, f14228a);
        byte[] a3 = a.mo16216a();
        return ByteBuffer.allocate(a3.length + a2.length).put(a3).put(a2).array();
    }
}
