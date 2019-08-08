package org.apache.p199a.p218f.p224f;

import java.io.IOException;
import java.io.InputStream;
import org.apache.p199a.p225g.C6498a;
import org.apache.p199a.p225g.C6503f;

/* renamed from: org.apache.a.f.f.l */
/* compiled from: IdentityInputStream */
public class C6493l extends InputStream {

    /* renamed from: a */
    private final C6503f f21197a;

    /* renamed from: b */
    private boolean f21198b = false;

    public C6493l(C6503f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        this.f21197a = fVar;
    }

    public int available() throws IOException {
        if (this.f21197a instanceof C6498a) {
            return ((C6498a) this.f21197a).mo22862e();
        }
        return 0;
    }

    public void close() throws IOException {
        this.f21198b = true;
    }

    public int read() throws IOException {
        if (this.f21198b) {
            return -1;
        }
        return this.f21197a.mo22805a();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f21198b) {
            return -1;
        }
        return this.f21197a.mo22807a(bArr, i, i2);
    }
}
