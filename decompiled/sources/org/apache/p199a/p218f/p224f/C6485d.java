package org.apache.p199a.p218f.p224f;

import com.google.android.exoplayer2.C2793C;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.p199a.p225g.C6498a;
import org.apache.p199a.p225g.C6502e;
import org.apache.p199a.p225g.C6504g;
import org.apache.p199a.p227i.C6531d;
import org.apache.p199a.p227i.C6532e;
import org.apache.p199a.p229k.C6548a;
import org.apache.p199a.p229k.C6549b;

/* renamed from: org.apache.a.f.f.d */
/* compiled from: AbstractSessionOutputBuffer */
public abstract class C6485d implements C6498a, C6504g {

    /* renamed from: a */
    private static final byte[] f21166a = {13, 10};

    /* renamed from: b */
    private OutputStream f21167b;

    /* renamed from: c */
    private C6548a f21168c;

    /* renamed from: d */
    private String f21169d = C2793C.ASCII_NAME;

    /* renamed from: e */
    private boolean f21170e = true;

    /* renamed from: f */
    private int f21171f = 512;

    /* renamed from: g */
    private C6492k f21172g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22865a(OutputStream outputStream, int i, C6531d dVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        } else if (i <= 0) {
            throw new IllegalArgumentException("Buffer size may not be negative or zero");
        } else if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else {
            this.f21167b = outputStream;
            this.f21168c = new C6548a(i);
            this.f21169d = C6532e.m25879a(dVar);
            this.f21170e = this.f21169d.equalsIgnoreCase(C2793C.ASCII_NAME) || this.f21169d.equalsIgnoreCase("ASCII");
            this.f21171f = dVar.mo23001a("http.connection.min-chunk-limit", 512);
            this.f21172g = mo22867c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C6492k mo22867c() {
        return new C6492k();
    }

    /* renamed from: e */
    public int mo22862e() {
        return this.f21168c.mo23034d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo22868d() throws IOException {
        int d = this.f21168c.mo23034d();
        if (d > 0) {
            this.f21167b.write(this.f21168c.mo23035e(), 0, d);
            this.f21168c.mo23025a();
            this.f21172g.mo22894a((long) d);
        }
    }

    /* renamed from: a */
    public void mo22811a() throws IOException {
        mo22868d();
        this.f21167b.flush();
    }

    /* renamed from: a */
    public void mo22815a(byte[] bArr, int i, int i2) throws IOException {
        if (bArr != null) {
            if (i2 > this.f21171f || i2 > this.f21168c.mo23032c()) {
                mo22868d();
                this.f21167b.write(bArr, i, i2);
                this.f21172g.mo22894a((long) i2);
            } else {
                if (i2 > this.f21168c.mo23032c() - this.f21168c.mo23034d()) {
                    mo22868d();
                }
                this.f21168c.mo23028a(bArr, i, i2);
            }
        }
    }

    /* renamed from: a */
    public void mo22866a(byte[] bArr) throws IOException {
        if (bArr != null) {
            mo22815a(bArr, 0, bArr.length);
        }
    }

    /* renamed from: a */
    public void mo22812a(int i) throws IOException {
        if (this.f21168c.mo23037g()) {
            mo22868d();
        }
        this.f21168c.mo23026a(i);
    }

    /* renamed from: a */
    public void mo22813a(String str) throws IOException {
        if (str != null) {
            if (str.length() > 0) {
                mo22866a(str.getBytes(this.f21169d));
            }
            mo22866a(f21166a);
        }
    }

    /* renamed from: a */
    public void mo22814a(C6549b bVar) throws IOException {
        if (bVar != null) {
            if (this.f21170e) {
                int i = 0;
                int c = bVar.mo23052c();
                while (c > 0) {
                    int min = Math.min(this.f21168c.mo23032c() - this.f21168c.mo23034d(), c);
                    if (min > 0) {
                        this.f21168c.mo23027a(bVar, i, min);
                    }
                    if (this.f21168c.mo23037g()) {
                        mo22868d();
                    }
                    i += min;
                    c -= min;
                }
            } else {
                mo22866a(bVar.toString().getBytes(this.f21169d));
            }
            mo22866a(f21166a);
        }
    }

    /* renamed from: b */
    public C6502e mo22816b() {
        return this.f21172g;
    }
}
