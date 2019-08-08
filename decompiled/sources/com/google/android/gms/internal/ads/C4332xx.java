package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.ads.xx */
final class C4332xx extends C4363za {

    /* renamed from: c */
    private static final byte[] f14220c = new byte[16];

    C4332xx(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* renamed from: a */
    private static void m18657a(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = m18702a(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = m18702a(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = m18702a(iArr[i] ^ iArr[i4], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = m18702a(iArr[i2] ^ iArr[i3], 7);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo16212a() {
        return 12;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final ByteBuffer mo16213a(byte[] bArr, int i) {
        int i2 = 16;
        int[] iArr = new int[16];
        int i3 = 13;
        int i4 = 4;
        System.arraycopy(C4363za.f14268a, 0, iArr, 0, f14268a.length);
        int[] a = m18703a(ByteBuffer.wrap(this.f14269b.mo16220a()));
        System.arraycopy(a, 0, iArr, 4, a.length);
        iArr[12] = i;
        System.arraycopy(m18703a(ByteBuffer.wrap(bArr)), 0, iArr, 13, 3);
        int[] iArr2 = (int[]) iArr.clone();
        int i5 = 0;
        while (i5 < 10) {
            m18657a(iArr2, 0, i4, 8, 12);
            m18657a(iArr2, 1, 5, 9, i3);
            m18657a(iArr2, 2, 6, 10, 14);
            m18657a(iArr2, 3, 7, 11, 15);
            m18657a(iArr2, 0, 5, 10, 15);
            m18657a(iArr2, 1, 6, 11, 12);
            m18657a(iArr2, 2, 7, 8, 13);
            m18657a(iArr2, 3, 4, 9, 14);
            i5++;
            i4 = 4;
            i3 = 13;
            i2 = 16;
        }
        int i6 = 0;
        for (int i7 = i2; i6 < i7; i7 = 16) {
            iArr[i6] = iArr[i6] + iArr2[i6];
            i6++;
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(iArr, 0, 16);
        return order;
    }
}
