package com.google.android.gms.internal.ads;

public final class bbm<T> {

    /* renamed from: a */
    public final T f12583a;

    /* renamed from: b */
    public final agn f12584b;

    /* renamed from: c */
    public final C3738df f12585c;

    /* renamed from: d */
    public boolean f12586d;

    private bbm(C3738df dfVar) {
        this.f12586d = false;
        this.f12583a = null;
        this.f12584b = null;
        this.f12585c = dfVar;
    }

    private bbm(T t, agn agn) {
        this.f12586d = false;
        this.f12583a = t;
        this.f12584b = agn;
        this.f12585c = null;
    }

    /* renamed from: a */
    public static <T> bbm<T> m15926a(C3738df dfVar) {
        return new bbm<>(dfVar);
    }

    /* renamed from: a */
    public static <T> bbm<T> m15927a(T t, agn agn) {
        return new bbm<>(t, agn);
    }
}
