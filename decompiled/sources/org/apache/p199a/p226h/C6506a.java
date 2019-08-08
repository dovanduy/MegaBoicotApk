package org.apache.p199a.p226h;

import org.apache.p199a.C6301c;
import org.apache.p199a.C6376f;
import org.apache.p199a.C6557n;
import org.apache.p199a.p227i.C6529b;
import org.apache.p199a.p227i.C6531d;

/* renamed from: org.apache.a.h.a */
/* compiled from: AbstractHttpMessage */
public abstract class C6506a implements C6557n {

    /* renamed from: a */
    protected C6522q f21204a;

    /* renamed from: b */
    protected C6531d f21205b;

    protected C6506a(C6531d dVar) {
        this.f21204a = new C6522q();
        this.f21205b = dVar;
    }

    protected C6506a() {
        this(null);
    }

    /* renamed from: a */
    public boolean mo22908a(String str) {
        return this.f21204a.mo22992c(str);
    }

    /* renamed from: b */
    public C6301c[] mo22910b(String str) {
        return this.f21204a.mo22987a(str);
    }

    /* renamed from: c */
    public C6301c mo22911c(String str) {
        return this.f21204a.mo22988b(str);
    }

    /* renamed from: d */
    public C6301c[] mo22913d() {
        return this.f21204a.mo22990b();
    }

    /* renamed from: a */
    public void mo22905a(C6301c cVar) {
        this.f21204a.mo22985a(cVar);
    }

    /* renamed from: a */
    public void mo22904a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Header name may not be null");
        }
        this.f21204a.mo22985a((C6301c) new C6507b(str, str2));
    }

    /* renamed from: b */
    public void mo22909b(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Header name may not be null");
        }
        this.f21204a.mo22989b((C6301c) new C6507b(str, str2));
    }

    /* renamed from: a */
    public void mo22907a(C6301c[] cVarArr) {
        this.f21204a.mo22986a(cVarArr);
    }

    /* renamed from: e */
    public C6376f mo22914e() {
        return this.f21204a.mo22991c();
    }

    /* renamed from: d */
    public C6376f mo22912d(String str) {
        return this.f21204a.mo22994d(str);
    }

    /* renamed from: f */
    public C6531d mo22915f() {
        if (this.f21205b == null) {
            this.f21205b = new C6529b();
        }
        return this.f21205b;
    }

    /* renamed from: a */
    public void mo22906a(C6531d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.f21205b = dVar;
    }
}
