package com.google.android.gms.internal.p148e;

/* renamed from: com.google.android.gms.internal.e.br */
final class C4477br {

    /* renamed from: a */
    private final C4487ca f14708a;

    /* renamed from: b */
    private final byte[] f14709b;

    private C4477br(int i) {
        this.f14709b = new byte[i];
        this.f14708a = C4487ca.m19115a(this.f14709b);
    }

    /* renamed from: a */
    public final C4469bj mo16409a() {
        if (this.f14708a.mo16503b() == 0) {
            return new C4479bt(this.f14709b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* renamed from: b */
    public final C4487ca mo16410b() {
        return this.f14708a;
    }

    /* synthetic */ C4477br(int i, C4470bk bkVar) {
        this(i);
    }
}
