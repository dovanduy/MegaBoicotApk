package com.facebook.ads.internal.view.p101c;

/* renamed from: com.facebook.ads.internal.view.c.f */
public enum C1982f {
    UNSPECIFIED(0),
    PORTRAIT(1),
    LANDSCAPE(2);
    

    /* renamed from: d */
    private int f6261d;

    private C1982f(int i) {
        this.f6261d = i;
    }

    /* renamed from: a */
    public static C1982f m8155a(int i) {
        C1982f[] values;
        for (C1982f fVar : values()) {
            if (fVar.f6261d == i) {
                return fVar;
            }
        }
        return PORTRAIT;
    }

    /* renamed from: a */
    public int mo8123a() {
        return this.f6261d;
    }
}
