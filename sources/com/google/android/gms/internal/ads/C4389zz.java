package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zz */
final class C4389zz extends aad {

    /* renamed from: c */
    private final int f14371c;

    /* renamed from: d */
    private final int f14372d;

    C4389zz(byte[] bArr, int i, int i2) {
        super(bArr);
        m18764b(i, i + i2, bArr.length);
        this.f14371c = i;
        this.f14372d = i2;
    }

    /* renamed from: a */
    public final byte mo13768a(int i) {
        int a = mo13769a();
        if (((a - (i + 1)) | i) >= 0) {
            return this.f10275b[this.f14371c + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(a);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* renamed from: a */
    public final int mo13769a() {
        return this.f14372d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13774a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f10275b, mo13778g(), bArr, 0, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo13778g() {
        return this.f14371c;
    }
}
