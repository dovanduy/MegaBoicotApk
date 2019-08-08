package org.apache.p199a.p218f.p224f;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.p199a.p225g.C6504g;

/* renamed from: org.apache.a.f.f.m */
/* compiled from: IdentityOutputStream */
public class C6494m extends OutputStream {

    /* renamed from: a */
    private final C6504g f21199a;

    /* renamed from: b */
    private boolean f21200b = false;

    public C6494m(C6504g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("Session output buffer may not be null");
        }
        this.f21199a = gVar;
    }

    public void close() throws IOException {
        if (!this.f21200b) {
            this.f21200b = true;
            this.f21199a.mo22811a();
        }
    }

    public void flush() throws IOException {
        this.f21199a.mo22811a();
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f21200b) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.f21199a.mo22815a(bArr, i, i2);
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(int i) throws IOException {
        if (this.f21200b) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.f21199a.mo22812a(i);
    }
}
