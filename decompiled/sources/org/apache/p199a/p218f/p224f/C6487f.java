package org.apache.p199a.p218f.p224f;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.p199a.p225g.C6504g;

/* renamed from: org.apache.a.f.f.f */
/* compiled from: ChunkedOutputStream */
public class C6487f extends OutputStream {

    /* renamed from: a */
    private final C6504g f21181a;

    /* renamed from: b */
    private byte[] f21182b;

    /* renamed from: c */
    private int f21183c;

    /* renamed from: d */
    private boolean f21184d;

    /* renamed from: e */
    private boolean f21185e;

    public C6487f(C6504g gVar, int i) throws IOException {
        this.f21183c = 0;
        this.f21184d = false;
        this.f21185e = false;
        this.f21182b = new byte[i];
        this.f21181a = gVar;
    }

    public C6487f(C6504g gVar) throws IOException {
        this(gVar, 2048);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22874a() throws IOException {
        if (this.f21183c > 0) {
            this.f21181a.mo22813a(Integer.toHexString(this.f21183c));
            this.f21181a.mo22815a(this.f21182b, 0, this.f21183c);
            this.f21181a.mo22813a("");
            this.f21183c = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22875a(byte[] bArr, int i, int i2) throws IOException {
        this.f21181a.mo22813a(Integer.toHexString(this.f21183c + i2));
        this.f21181a.mo22815a(this.f21182b, 0, this.f21183c);
        this.f21181a.mo22815a(bArr, i, i2);
        this.f21181a.mo22813a("");
        this.f21183c = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22876b() throws IOException {
        this.f21181a.mo22813a("0");
        this.f21181a.mo22813a("");
    }

    /* renamed from: c */
    public void mo22877c() throws IOException {
        if (!this.f21184d) {
            mo22874a();
            mo22876b();
            this.f21184d = true;
        }
    }

    public void write(int i) throws IOException {
        if (this.f21185e) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.f21182b[this.f21183c] = (byte) i;
        this.f21183c++;
        if (this.f21183c == this.f21182b.length) {
            mo22874a();
        }
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f21185e) {
            throw new IOException("Attempted write to closed stream.");
        } else if (i2 >= this.f21182b.length - this.f21183c) {
            mo22875a(bArr, i, i2);
        } else {
            System.arraycopy(bArr, i, this.f21182b, this.f21183c, i2);
            this.f21183c += i2;
        }
    }

    public void flush() throws IOException {
        mo22874a();
        this.f21181a.mo22811a();
    }

    public void close() throws IOException {
        if (!this.f21185e) {
            this.f21185e = true;
            mo22877c();
            this.f21181a.mo22811a();
        }
    }
}
