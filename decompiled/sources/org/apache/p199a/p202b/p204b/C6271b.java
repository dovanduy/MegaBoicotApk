package org.apache.p199a.p202b.p204b;

import org.apache.p199a.C6301c;
import org.apache.p199a.C6527i;
import org.apache.p199a.C6534j;
import org.apache.p199a.p202b.p207e.C6289a;

/* renamed from: org.apache.a.b.b.b */
/* compiled from: HttpEntityEnclosingRequestBase */
public abstract class C6271b extends C6275f implements C6534j {

    /* renamed from: c */
    private C6527i f20815c;

    /* renamed from: b */
    public C6527i mo22446b() {
        return this.f20815c;
    }

    /* renamed from: a */
    public void mo22444a(C6527i iVar) {
        this.f20815c = iVar;
    }

    /* renamed from: a */
    public boolean mo22445a() {
        C6301c c = mo22911c("Expect");
        return c != null && "100-continue".equalsIgnoreCase(c.mo22466d());
    }

    public Object clone() throws CloneNotSupportedException {
        C6271b bVar = (C6271b) super.clone();
        if (this.f20815c != null) {
            bVar.f20815c = (C6527i) C6289a.m24899a(this.f20815c);
        }
        return bVar;
    }
}
