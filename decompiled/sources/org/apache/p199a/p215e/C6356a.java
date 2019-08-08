package org.apache.p199a.p215e;

import java.io.IOException;
import org.apache.p199a.C6301c;
import org.apache.p199a.C6527i;
import org.apache.p199a.p226h.C6507b;

/* renamed from: org.apache.a.e.a */
/* compiled from: AbstractHttpEntity */
public abstract class C6356a implements C6527i {

    /* renamed from: a */
    protected C6301c f20880a;

    /* renamed from: b */
    protected C6301c f20881b;

    /* renamed from: c */
    protected boolean f20882c;

    /* renamed from: h */
    public void mo22474h() throws IOException {
    }

    protected C6356a() {
    }

    /* renamed from: d */
    public C6301c mo22620d() {
        return this.f20880a;
    }

    /* renamed from: e */
    public C6301c mo22621e() {
        return this.f20881b;
    }

    /* renamed from: b */
    public boolean mo22619b() {
        return this.f20882c;
    }

    /* renamed from: a */
    public void mo22616a(C6301c cVar) {
        this.f20880a = cVar;
    }

    /* renamed from: a */
    public void mo22615a(String str) {
        mo22616a((C6301c) str != null ? new C6507b("Content-Type", str) : null);
    }

    /* renamed from: b */
    public void mo22618b(C6301c cVar) {
        this.f20881b = cVar;
    }

    /* renamed from: a */
    public void mo22617a(boolean z) {
        this.f20882c = z;
    }
}
