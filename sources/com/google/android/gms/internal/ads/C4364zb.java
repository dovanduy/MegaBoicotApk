package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.ads.zb */
abstract class C4364zb implements C4172tg {

    /* renamed from: a */
    private final byte[] f14271a;

    /* renamed from: b */
    private final C4363za f14272b;

    /* renamed from: c */
    private final C4363za f14273c;

    C4364zb(byte[] bArr) throws InvalidKeyException {
        this.f14271a = (byte[]) bArr.clone();
        this.f14272b = mo16214a(bArr, 1);
        this.f14273c = mo16214a(bArr, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C4363za mo16214a(byte[] bArr, int i) throws InvalidKeyException;

    /* renamed from: a */
    public byte[] mo16071a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        this.f14272b.mo16212a();
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + this.f14272b.mo16212a() + 16);
        if (allocate.remaining() < bArr.length + this.f14272b.mo16212a() + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = allocate.position();
        this.f14272b.mo16222a(allocate, bArr);
        allocate.position(position);
        byte[] bArr3 = new byte[this.f14272b.mo16212a()];
        allocate.get(bArr3);
        allocate.limit(allocate.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        this.f14273c.mo16213a(bArr3, 0).get(bArr4);
        int length2 = bArr2.length % 16 == 0 ? bArr2.length : (bArr2.length + 16) - (bArr2.length % 16);
        int remaining = allocate.remaining();
        int i = remaining % 16;
        int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length2;
        ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr2);
        order.position(length2);
        order.put(allocate);
        order.position(i2);
        order.putLong((long) bArr2.length);
        order.putLong((long) remaining);
        byte[] a = C4359yx.m18697a(bArr4, order.array());
        allocate.limit(allocate.limit() + 16);
        allocate.put(a);
        return allocate.array();
    }
}
