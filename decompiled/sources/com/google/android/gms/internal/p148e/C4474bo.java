package com.google.android.gms.internal.p148e;

/* renamed from: com.google.android.gms.internal.e.bo */
final class C4474bo extends C4479bt {

    /* renamed from: c */
    private final int f14706c;

    /* renamed from: d */
    private final int f14707d;

    C4474bo(byte[] bArr, int i, int i2) {
        super(bArr);
        m18963b(i, i + i2, bArr.length);
        this.f14706c = i;
        this.f14707d = i2;
    }

    /* renamed from: a */
    public final byte mo16388a(int i) {
        int a = mo16389a();
        if (((a - (i + 1)) | i) >= 0) {
            return this.f14710b[this.f14706c + i];
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

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final byte mo16394b(int i) {
        return this.f14710b[this.f14706c + i];
    }

    /* renamed from: a */
    public final int mo16389a() {
        return this.f14707d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo16408e() {
        return this.f14706c;
    }
}
