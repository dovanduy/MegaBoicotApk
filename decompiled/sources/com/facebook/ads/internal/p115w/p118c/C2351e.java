package com.facebook.ads.internal.p115w.p118c;

import java.io.BufferedInputStream;
import java.io.InputStream;

/* renamed from: com.facebook.ads.internal.w.c.e */
public class C2351e extends BufferedInputStream {

    /* renamed from: a */
    private int f7413a;

    /* renamed from: b */
    private boolean f7414b;

    /* renamed from: c */
    private int f7415c = Integer.MAX_VALUE;

    public C2351e(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    public boolean mo8750a() {
        return this.f7414b;
    }

    public synchronized void mark(int i) {
        this.f7415c = i;
        super.mark(i);
    }

    public int read() {
        if (this.f7413a + 1 > this.f7415c) {
            this.f7414b = true;
            return -1;
        }
        this.f7413a++;
        return super.read();
    }

    public int read(byte[] bArr) {
        if (this.f7413a + bArr.length <= this.f7415c) {
            return super.read(bArr);
        }
        this.f7414b = true;
        return -1;
    }

    public synchronized int read(byte[] bArr, int i, int i2) {
        if (this.f7413a + i2 > this.f7415c) {
            this.f7414b = true;
            return -1;
        }
        int read = super.read(bArr, i, i2);
        this.f7413a += read;
        return read;
    }

    public synchronized void reset() {
        this.f7415c = Integer.MAX_VALUE;
        super.reset();
    }

    public synchronized long skip(long j) {
        if (((long) this.f7413a) + j > ((long) this.f7415c)) {
            this.f7414b = true;
            return 0;
        }
        this.f7413a = (int) (((long) this.f7413a) + j);
        return super.skip(j);
    }
}
