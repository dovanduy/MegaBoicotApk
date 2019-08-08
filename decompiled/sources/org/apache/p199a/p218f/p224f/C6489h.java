package org.apache.p199a.p218f.p224f;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.p199a.p225g.C6504g;

/* renamed from: org.apache.a.f.f.h */
/* compiled from: ContentLengthOutputStream */
public class C6489h extends OutputStream {

    /* renamed from: a */
    private final C6504g f21190a;

    /* renamed from: b */
    private final long f21191b;

    /* renamed from: c */
    private long f21192c = 0;

    /* renamed from: d */
    private boolean f21193d = false;

    public C6489h(C6504g gVar, long j) {
        if (gVar == null) {
            throw new IllegalArgumentException("Session output buffer may not be null");
        } else if (j < 0) {
            throw new IllegalArgumentException("Content length may not be negative");
        } else {
            this.f21190a = gVar;
            this.f21191b = j;
        }
    }

    public void close() throws IOException {
        if (!this.f21193d) {
            this.f21193d = true;
            this.f21190a.mo22811a();
        }
    }

    public void flush() throws IOException {
        this.f21190a.mo22811a();
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f21193d) {
            throw new IOException("Attempted write to closed stream.");
        } else if (this.f21192c < this.f21191b) {
            long j = this.f21191b - this.f21192c;
            if (((long) i2) > j) {
                i2 = (int) j;
            }
            this.f21190a.mo22815a(bArr, i, i2);
            this.f21192c += (long) i2;
        }
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(int i) throws IOException {
        if (this.f21193d) {
            throw new IOException("Attempted write to closed stream.");
        } else if (this.f21192c < this.f21191b) {
            this.f21190a.mo22812a(i);
            this.f21192c++;
        }
    }
}
