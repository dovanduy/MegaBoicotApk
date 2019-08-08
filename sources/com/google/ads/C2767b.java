package com.google.ads;

import com.google.android.gms.ads.C2973d;

@Deprecated
/* renamed from: com.google.ads.b */
public final class C2767b {

    /* renamed from: a */
    public static final C2767b f8591a = new C2767b(-1, -2, "mb");

    /* renamed from: b */
    public static final C2767b f8592b = new C2767b(320, 50, "mb");

    /* renamed from: c */
    public static final C2767b f8593c = new C2767b(300, 250, "as");

    /* renamed from: d */
    public static final C2767b f8594d = new C2767b(468, 60, "as");

    /* renamed from: e */
    public static final C2767b f8595e = new C2767b(728, 90, "as");

    /* renamed from: f */
    public static final C2767b f8596f = new C2767b(160, 600, "as");

    /* renamed from: g */
    private final C2973d f8597g;

    private C2767b(int i, int i2, String str) {
        this(new C2973d(i, i2));
    }

    public C2767b(C2973d dVar) {
        this.f8597g = dVar;
    }

    /* renamed from: a */
    public final int mo9616a() {
        return this.f8597g.mo12214b();
    }

    /* renamed from: b */
    public final int mo9617b() {
        return this.f8597g.mo12212a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2767b)) {
            return false;
        }
        return this.f8597g.equals(((C2767b) obj).f8597g);
    }

    public final int hashCode() {
        return this.f8597g.hashCode();
    }

    public final String toString() {
        return this.f8597g.toString();
    }
}
