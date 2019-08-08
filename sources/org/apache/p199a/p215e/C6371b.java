package org.apache.p199a.p215e;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: org.apache.a.e.b */
/* compiled from: BasicHttpEntity */
public class C6371b extends C6356a {

    /* renamed from: d */
    private InputStream f20918d;

    /* renamed from: e */
    private long f20919e = -1;

    /* renamed from: a */
    public boolean mo22469a() {
        return false;
    }

    /* renamed from: c */
    public long mo22650c() {
        return this.f20919e;
    }

    /* renamed from: f */
    public InputStream mo22473f() throws IllegalStateException {
        if (this.f20918d != null) {
            return this.f20918d;
        }
        throw new IllegalStateException("Content has not been provided");
    }

    /* renamed from: a */
    public void mo22653a(long j) {
        this.f20919e = j;
    }

    /* renamed from: a */
    public void mo22654a(InputStream inputStream) {
        this.f20918d = inputStream;
    }

    /* renamed from: a */
    public void mo22468a(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        InputStream f = mo22473f();
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int read = f.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
        } finally {
            f.close();
        }
    }

    /* renamed from: g */
    public boolean mo22651g() {
        return this.f20918d != null;
    }

    /* renamed from: h */
    public void mo22474h() throws IOException {
        if (this.f20918d != null) {
            this.f20918d.close();
        }
    }
}
