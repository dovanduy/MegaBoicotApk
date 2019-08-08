package org.apache.p199a.p218f.p224f;

import java.io.IOException;
import java.io.InputStream;
import org.apache.p199a.C6265ae;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6547k;
import org.apache.p199a.C6564u;
import org.apache.p199a.p225g.C6498a;
import org.apache.p199a.p225g.C6503f;
import org.apache.p199a.p229k.C6549b;
import org.apache.p199a.p229k.C6552e;

/* renamed from: org.apache.a.f.f.e */
/* compiled from: ChunkedInputStream */
public class C6486e extends InputStream {

    /* renamed from: a */
    private final C6503f f21173a;

    /* renamed from: b */
    private final C6549b f21174b;

    /* renamed from: c */
    private int f21175c;

    /* renamed from: d */
    private int f21176d;

    /* renamed from: e */
    private int f21177e;

    /* renamed from: f */
    private boolean f21178f = false;

    /* renamed from: g */
    private boolean f21179g = false;

    /* renamed from: h */
    private C6301c[] f21180h = new C6301c[0];

    public C6486e(C6503f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        this.f21173a = fVar;
        this.f21177e = 0;
        this.f21174b = new C6549b(16);
        this.f21175c = 1;
    }

    public int available() throws IOException {
        if (this.f21173a instanceof C6498a) {
            return Math.min(((C6498a) this.f21173a).mo22862e(), this.f21176d - this.f21177e);
        }
        return 0;
    }

    public int read() throws IOException {
        if (this.f21179g) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.f21178f) {
            return -1;
        } else {
            if (this.f21175c != 2) {
                m25696a();
                if (this.f21178f) {
                    return -1;
                }
            }
            int a = this.f21173a.mo22805a();
            if (a != -1) {
                this.f21177e++;
                if (this.f21177e >= this.f21176d) {
                    this.f21175c = 3;
                }
            }
            return a;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f21179g) {
            throw new IOException("Attempted read from closed stream.");
        } else if (this.f21178f) {
            return -1;
        } else {
            if (this.f21175c != 2) {
                m25696a();
                if (this.f21178f) {
                    return -1;
                }
            }
            int a = this.f21173a.mo22807a(bArr, i, Math.min(i2, this.f21176d - this.f21177e));
            if (a != -1) {
                this.f21177e += a;
                if (this.f21177e >= this.f21176d) {
                    this.f21175c = 3;
                }
                return a;
            }
            this.f21178f = true;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Truncated chunk ( expected size: ");
            stringBuffer.append(this.f21176d);
            stringBuffer.append("; actual size: ");
            stringBuffer.append(this.f21177e);
            stringBuffer.append(")");
            throw new C6265ae(stringBuffer.toString());
        }
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    private void m25696a() throws IOException {
        this.f21176d = m25697b();
        if (this.f21176d < 0) {
            throw new C6564u("Negative chunk size");
        }
        this.f21175c = 2;
        this.f21177e = 0;
        if (this.f21176d == 0) {
            this.f21178f = true;
            m25698c();
        }
    }

    /* renamed from: b */
    private int m25697b() throws IOException {
        int i = this.f21175c;
        if (i != 1) {
            if (i != 3) {
                throw new IllegalStateException("Inconsistent codec state");
            }
            this.f21174b.mo23041a();
            if (this.f21173a.mo22806a(this.f21174b) == -1) {
                return 0;
            }
            if (!this.f21174b.mo23054d()) {
                throw new C6564u("Unexpected content at the end of chunk");
            }
            this.f21175c = 1;
        }
        this.f21174b.mo23041a();
        if (this.f21173a.mo22806a(this.f21174b) == -1) {
            return 0;
        }
        int c = this.f21174b.mo23053c(59);
        if (c < 0) {
            c = this.f21174b.mo23052c();
        }
        try {
            return Integer.parseInt(this.f21174b.mo23049b(0, c), 16);
        } catch (NumberFormatException unused) {
            throw new C6564u("Bad chunk header");
        }
    }

    /* renamed from: c */
    private void m25698c() throws IOException {
        try {
            this.f21180h = C6482a.m25667a(this.f21173a, -1, -1, null);
        } catch (C6547k e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid footer: ");
            stringBuffer.append(e.getMessage());
            C6564u uVar = new C6564u(stringBuffer.toString());
            C6552e.m25964a(uVar, e);
            throw uVar;
        }
    }

    public void close() throws IOException {
        if (!this.f21179g) {
            try {
                if (!this.f21178f) {
                    do {
                    } while (read(new byte[2048]) >= 0);
                }
            } finally {
                this.f21178f = true;
                this.f21179g = true;
            }
        }
    }
}
