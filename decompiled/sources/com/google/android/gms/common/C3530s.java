package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.s */
abstract class C3530s extends C3528q {

    /* renamed from: b */
    private static final WeakReference<byte[]> f10101b = new WeakReference<>(null);

    /* renamed from: a */
    private WeakReference<byte[]> f10102a = f10101b;

    C3530s(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract byte[] mo13632d();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final byte[] mo13629c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f10102a.get();
            if (bArr == null) {
                bArr = mo13632d();
                this.f10102a = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
