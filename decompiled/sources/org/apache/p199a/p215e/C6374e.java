package org.apache.p199a.p215e;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6527i;

/* renamed from: org.apache.a.e.e */
/* compiled from: HttpEntityWrapper */
public class C6374e implements C6527i {

    /* renamed from: c */
    protected C6527i f20921c;

    public C6374e(C6527i iVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("wrapped entity must not be null");
        }
        this.f20921c = iVar;
    }

    /* renamed from: a */
    public boolean mo22469a() {
        return this.f20921c.mo22469a();
    }

    /* renamed from: b */
    public boolean mo22619b() {
        return this.f20921c.mo22619b();
    }

    /* renamed from: c */
    public long mo22650c() {
        return this.f20921c.mo22650c();
    }

    /* renamed from: d */
    public C6301c mo22620d() {
        return this.f20921c.mo22620d();
    }

    /* renamed from: e */
    public C6301c mo22621e() {
        return this.f20921c.mo22621e();
    }

    /* renamed from: f */
    public InputStream mo22473f() throws IOException {
        return this.f20921c.mo22473f();
    }

    /* renamed from: a */
    public void mo22468a(OutputStream outputStream) throws IOException {
        this.f20921c.mo22468a(outputStream);
    }

    /* renamed from: g */
    public boolean mo22651g() {
        return this.f20921c.mo22651g();
    }

    /* renamed from: h */
    public void mo22474h() throws IOException {
        this.f20921c.mo22474h();
    }
}
