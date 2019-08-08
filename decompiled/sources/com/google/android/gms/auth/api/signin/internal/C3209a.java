package com.google.android.gms.auth.api.signin.internal;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
public class C3209a {

    /* renamed from: a */
    private static int f9409a = 31;

    /* renamed from: b */
    private int f9410b = 1;

    /* renamed from: a */
    public C3209a mo12999a(Object obj) {
        this.f9410b = (f9409a * this.f9410b) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: a */
    public final C3209a mo13000a(boolean z) {
        this.f9410b = (f9409a * this.f9410b) + (z ? 1 : 0);
        return this;
    }

    /* renamed from: a */
    public int mo12998a() {
        return this.f9410b;
    }
}
