package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.ads.za */
abstract class C4363za implements C4357yv {

    /* renamed from: a */
    static final int[] f14268a = m18703a(ByteBuffer.wrap(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107}));

    /* renamed from: b */
    final C4356yu f14269b;

    /* renamed from: c */
    private final int f14270c;

    C4363za(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f14269b = C4356yu.m18690a(bArr);
        this.f14270c = i;
    }

    /* renamed from: a */
    static int m18702a(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    /* renamed from: a */
    static int[] m18703a(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract int mo16212a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract ByteBuffer mo16213a(byte[] bArr, int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16222a(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - mo16212a() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] a = C4360yy.m18699a(mo16212a());
        byteBuffer.put(a);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int remaining = wrap.remaining();
        int i = (remaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer a2 = mo16213a(a, this.f14270c + i2);
            if (i2 == i - 1) {
                C4331xw.m18655a(byteBuffer, wrap, a2, remaining % 64);
            } else {
                C4331xw.m18655a(byteBuffer, wrap, a2, 64);
            }
        }
    }

    /* renamed from: a */
    public final byte[] mo16211a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        mo16212a();
        if (length > 2147483635) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(mo16212a() + bArr.length);
        mo16222a(allocate, bArr);
        return allocate.array();
    }
}
