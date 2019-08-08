package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.nf */
final class C4009nf extends FilterInputStream {

    /* renamed from: a */
    private final long f13609a;

    /* renamed from: b */
    private long f13610b;

    C4009nf(InputStream inputStream, long j) {
        super(inputStream);
        this.f13609a = j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo15669a() {
        return this.f13609a - this.f13610b;
    }

    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.f13610b++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f13610b += (long) read;
        }
        return read;
    }
}
