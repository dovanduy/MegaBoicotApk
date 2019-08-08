package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.th */
public final class C4173th extends ByteArrayOutputStream {

    /* renamed from: a */
    private final C3898jc f14076a;

    public C4173th(C3898jc jcVar, int i) {
        this.f14076a = jcVar;
        this.buf = this.f14076a.mo15479a(Math.max(i, 256));
    }

    /* renamed from: a */
    private final void m18178a(int i) {
        if (this.count + i > this.buf.length) {
            byte[] a = this.f14076a.mo15479a((this.count + i) << 1);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f14076a.mo15478a(this.buf);
            this.buf = a;
        }
    }

    public final void close() throws IOException {
        this.f14076a.mo15478a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f14076a.mo15478a(this.buf);
    }

    public final synchronized void write(int i) {
        m18178a(1);
        super.write(i);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m18178a(i2);
        super.write(bArr, i, i2);
    }
}
