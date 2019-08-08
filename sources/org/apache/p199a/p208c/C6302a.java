package org.apache.p199a.p208c;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.p199a.C6527i;
import org.apache.p199a.p215e.C6374e;
import org.apache.p199a.p229k.C6551d;

/* renamed from: org.apache.a.c.a */
/* compiled from: BasicManagedEntity */
public class C6302a extends C6374e implements C6334i, C6336k {

    /* renamed from: a */
    protected C6339n f20828a;

    /* renamed from: b */
    protected final boolean f20829b;

    /* renamed from: a */
    public boolean mo22469a() {
        return false;
    }

    public C6302a(C6527i iVar, C6339n nVar, boolean z) {
        super(iVar);
        if (nVar == null) {
            throw new IllegalArgumentException("Connection may not be null.");
        }
        this.f20828a = nVar;
        this.f20829b = z;
    }

    /* renamed from: f */
    public InputStream mo22473f() throws IOException {
        return new C6335j(this.f20921c.mo22473f(), this);
    }

    /* renamed from: l */
    private void m24921l() throws IOException {
        if (this.f20828a != null) {
            try {
                if (this.f20829b) {
                    C6551d.m25958a(this.f20921c);
                    this.f20828a.mo22563n();
                }
            } finally {
                mo22477k();
            }
        }
    }

    @Deprecated
    /* renamed from: h */
    public void mo22474h() throws IOException {
        m24921l();
    }

    /* renamed from: a */
    public void mo22468a(OutputStream outputStream) throws IOException {
        super.mo22468a(outputStream);
        m24921l();
    }

    /* renamed from: i */
    public void mo22475i() throws IOException {
        m24921l();
    }

    /* renamed from: j */
    public void mo22476j() throws IOException {
        if (this.f20828a != null) {
            try {
                this.f20828a.mo22476j();
            } finally {
                this.f20828a = null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public boolean mo22470a(InputStream inputStream) throws IOException {
        try {
            if (this.f20829b && this.f20828a != null) {
                inputStream.close();
                this.f20828a.mo22563n();
            }
            mo22477k();
            return false;
        } catch (Throwable th) {
            mo22477k();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public boolean mo22471b(InputStream inputStream) throws IOException {
        try {
            if (this.f20829b && this.f20828a != null) {
                inputStream.close();
                this.f20828a.mo22563n();
            }
            mo22477k();
            return false;
        } catch (Throwable th) {
            mo22477k();
            throw th;
        }
    }

    /* renamed from: c */
    public boolean mo22472c(InputStream inputStream) throws IOException {
        if (this.f20828a != null) {
            this.f20828a.mo22476j();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo22477k() throws IOException {
        if (this.f20828a != null) {
            try {
                this.f20828a.mo22475i();
            } finally {
                this.f20828a = null;
            }
        }
    }
}
