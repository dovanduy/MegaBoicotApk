package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zk */
public final class C4374zk {

    /* renamed from: a */
    private final byte[] f14283a = new byte[256];

    /* renamed from: b */
    private int f14284b;

    /* renamed from: c */
    private int f14285c;

    public C4374zk(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f14283a[i] = (byte) i;
        }
        byte b = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            b = (b + this.f14283a[i2] + bArr[i2 % bArr.length]) & 255;
            byte b2 = this.f14283a[i2];
            this.f14283a[i2] = this.f14283a[b];
            this.f14283a[b] = b2;
        }
        this.f14284b = 0;
        this.f14285c = 0;
    }

    /* renamed from: a */
    public final void mo16227a(byte[] bArr) {
        int i = this.f14284b;
        int i2 = this.f14285c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.f14283a[i]) & 255;
            byte b = this.f14283a[i];
            this.f14283a[i] = this.f14283a[i2];
            this.f14283a[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f14283a[(this.f14283a[i] + this.f14283a[i2]) & 255]);
        }
        this.f14284b = i;
        this.f14285c = i2;
    }
}
