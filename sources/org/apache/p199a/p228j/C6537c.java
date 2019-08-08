package org.apache.p199a.p228j;

/* renamed from: org.apache.a.j.c */
/* compiled from: DefaultedHttpContext */
public final class C6537c implements C6539e {

    /* renamed from: a */
    private final C6539e f21257a;

    /* renamed from: b */
    private final C6539e f21258b;

    public C6537c(C6539e eVar, C6539e eVar2) {
        if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        this.f21257a = eVar;
        this.f21258b = eVar2;
    }

    /* renamed from: a */
    public Object mo22777a(String str) {
        Object a = this.f21257a.mo22777a(str);
        return a == null ? this.f21258b.mo22777a(str) : a;
    }

    /* renamed from: a */
    public void mo22778a(String str, Object obj) {
        this.f21257a.mo22778a(str, obj);
    }
}
