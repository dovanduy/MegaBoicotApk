package com.google.android.gms.internal.p148e;

/* renamed from: com.google.android.gms.internal.e.ga */
public enum C4615ga {
    DOUBLE(C4620gf.DOUBLE, 1),
    FLOAT(C4620gf.FLOAT, 5),
    INT64(C4620gf.LONG, 0),
    UINT64(C4620gf.LONG, 0),
    INT32(C4620gf.INT, 0),
    FIXED64(C4620gf.LONG, 1),
    FIXED32(C4620gf.INT, 5),
    BOOL(C4620gf.BOOLEAN, 0),
    STRING(C4620gf.STRING, 2),
    GROUP(C4620gf.MESSAGE, 3),
    MESSAGE(C4620gf.MESSAGE, 2),
    BYTES(C4620gf.BYTE_STRING, 2),
    UINT32(C4620gf.INT, 0),
    ENUM(C4620gf.ENUM, 0),
    SFIXED32(C4620gf.INT, 5),
    SFIXED64(C4620gf.LONG, 1),
    SINT32(C4620gf.INT, 0),
    SINT64(C4620gf.LONG, 0);
    

    /* renamed from: s */
    private final C4620gf f15033s;

    /* renamed from: t */
    private final int f15034t;

    private C4615ga(C4620gf gfVar, int i) {
        this.f15033s = gfVar;
        this.f15034t = i;
    }

    /* renamed from: a */
    public final C4620gf mo16809a() {
        return this.f15033s;
    }

    /* renamed from: b */
    public final int mo16810b() {
        return this.f15034t;
    }
}
