package org.apache.p199a.p215e;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.p199a.C6527i;
import org.apache.p199a.p229k.C6551d;

/* renamed from: org.apache.a.e.c */
/* compiled from: BufferedHttpEntity */
public class C6372c extends C6374e {

    /* renamed from: a */
    private final byte[] f20920a;

    /* renamed from: a */
    public boolean mo22469a() {
        return true;
    }

    public C6372c(C6527i iVar) throws IOException {
        super(iVar);
        if (!iVar.mo22469a() || iVar.mo22650c() < 0) {
            this.f20920a = C6551d.m25959b(iVar);
        } else {
            this.f20920a = null;
        }
    }

    /* renamed from: c */
    public long mo22650c() {
        if (this.f20920a != null) {
            return (long) this.f20920a.length;
        }
        return this.f20921c.mo22650c();
    }

    /* renamed from: f */
    public InputStream mo22473f() throws IOException {
        if (this.f20920a != null) {
            return new ByteArrayInputStream(this.f20920a);
        }
        return this.f20921c.mo22473f();
    }

    /* renamed from: b */
    public boolean mo22619b() {
        return this.f20920a == null && this.f20921c.mo22619b();
    }

    /* renamed from: a */
    public void mo22468a(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        } else if (this.f20920a != null) {
            outputStream.write(this.f20920a);
        } else {
            this.f20921c.mo22468a(outputStream);
        }
    }

    /* renamed from: g */
    public boolean mo22651g() {
        return this.f20920a == null && this.f20921c.mo22651g();
    }
}
