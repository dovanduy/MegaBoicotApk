package org.apache.p199a.p218f.p220b;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6527i;
import org.apache.p199a.C6534j;
import org.apache.p199a.C6568y;
import org.apache.p199a.p215e.C6374e;

/* renamed from: org.apache.a.f.b.o */
/* compiled from: EntityEnclosingRequestWrapper */
public class C6416o extends C6419q implements C6534j {

    /* renamed from: c */
    private C6527i f21042c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f21043d;

    /* renamed from: org.apache.a.f.b.o$a */
    /* compiled from: EntityEnclosingRequestWrapper */
    class C6417a extends C6374e {
        C6417a(C6527i iVar) {
            super(iVar);
        }

        @Deprecated
        /* renamed from: h */
        public void mo22474h() throws IOException {
            C6416o.this.f21043d = true;
            super.mo22474h();
        }

        /* renamed from: f */
        public InputStream mo22473f() throws IOException {
            C6416o.this.f21043d = true;
            return super.mo22473f();
        }

        /* renamed from: a */
        public void mo22468a(OutputStream outputStream) throws IOException {
            C6416o.this.f21043d = true;
            super.mo22468a(outputStream);
        }
    }

    public C6416o(C6534j jVar) throws C6568y {
        super(jVar);
        mo22763a(jVar.mo22446b());
    }

    /* renamed from: b */
    public C6527i mo22446b() {
        return this.f21042c;
    }

    /* renamed from: a */
    public void mo22763a(C6527i iVar) {
        this.f21042c = iVar != null ? new C6417a(iVar) : null;
        this.f21043d = false;
    }

    /* renamed from: a */
    public boolean mo22445a() {
        C6301c c = mo22911c("Expect");
        return c != null && "100-continue".equalsIgnoreCase(c.mo22466d());
    }

    /* renamed from: i */
    public boolean mo22764i() {
        return this.f21042c == null || this.f21042c.mo22469a() || !this.f21043d;
    }
}
