package org.apache.p199a.p218f.p224f;

import java.io.IOException;
import java.io.InputStream;
import org.apache.p199a.p225g.C6498a;
import org.apache.p199a.p225g.C6503f;

/* renamed from: org.apache.a.f.f.g */
/* compiled from: ContentLengthInputStream */
public class C6488g extends InputStream {

    /* renamed from: a */
    private long f21186a;

    /* renamed from: b */
    private long f21187b = 0;

    /* renamed from: c */
    private boolean f21188c = false;

    /* renamed from: d */
    private C6503f f21189d = null;

    public C6488g(C6503f fVar, long j) {
        if (fVar == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        } else if (j < 0) {
            throw new IllegalArgumentException("Content length may not be negative");
        } else {
            this.f21189d = fVar;
            this.f21186a = j;
        }
    }

    public void close() throws IOException {
        if (!this.f21188c) {
            try {
                do {
                } while (read(new byte[2048]) >= 0);
            } finally {
                this.f21188c = true;
            }
        }
    }

    public int available() throws IOException {
        if (this.f21189d instanceof C6498a) {
            return Math.min(((C6498a) this.f21189d).mo22862e(), (int) (this.f21186a - this.f21187b));
        }
        return 0;
    }

    public int read() throws IOException {
        if (this.f21188c) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.f21187b >= this.f21186a) {
            return -1;
        } else {
            this.f21187b++;
            return this.f21189d.mo22805a();
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f21188c) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.f21187b >= this.f21186a) {
            return -1;
        } else {
            if (this.f21187b + ((long) i2) > this.f21186a) {
                i2 = (int) (this.f21186a - this.f21187b);
            }
            int a = this.f21189d.mo22807a(bArr, i, i2);
            this.f21187b += (long) a;
            return a;
        }
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public long skip(long j) throws IOException {
        if (j <= 0) {
            return 0;
        }
        byte[] bArr = new byte[2048];
        long min = Math.min(j, this.f21186a - this.f21187b);
        long j2 = 0;
        while (min > 0) {
            int read = read(bArr, 0, (int) Math.min(2048, min));
            if (read == -1) {
                break;
            }
            long j3 = (long) read;
            min -= j3;
            j2 += j3;
        }
        return j2;
    }
}
