package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yu */
public final class C4356yu {

    /* renamed from: a */
    private final byte[] f14262a;

    private C4356yu(byte[] bArr, int i, int i2) {
        this.f14262a = new byte[i2];
        System.arraycopy(bArr, 0, this.f14262a, 0, i2);
    }

    /* renamed from: a */
    public static C4356yu m18690a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new C4356yu(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final byte[] mo16220a() {
        byte[] bArr = new byte[this.f14262a.length];
        System.arraycopy(this.f14262a, 0, bArr, 0, this.f14262a.length);
        return bArr;
    }
}
