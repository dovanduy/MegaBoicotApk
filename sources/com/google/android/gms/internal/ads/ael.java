package com.google.android.gms.internal.ads;

public enum ael {
    DOUBLE(aeq.DOUBLE, 1),
    FLOAT(aeq.FLOAT, 5),
    INT64(aeq.LONG, 0),
    UINT64(aeq.LONG, 0),
    INT32(aeq.INT, 0),
    FIXED64(aeq.LONG, 1),
    FIXED32(aeq.INT, 5),
    BOOL(aeq.BOOLEAN, 0),
    STRING(aeq.STRING, 2),
    GROUP(aeq.MESSAGE, 3),
    MESSAGE(aeq.MESSAGE, 2),
    BYTES(aeq.BYTE_STRING, 2),
    UINT32(aeq.INT, 0),
    ENUM(aeq.ENUM, 0),
    SFIXED32(aeq.INT, 5),
    SFIXED64(aeq.LONG, 1),
    SINT32(aeq.INT, 0),
    SINT64(aeq.LONG, 0);
    

    /* renamed from: s */
    private final aeq f10648s;

    /* renamed from: t */
    private final int f10649t;

    private ael(aeq aeq, int i) {
        this.f10648s = aeq;
        this.f10649t = i;
    }

    /* renamed from: a */
    public final aeq mo14215a() {
        return this.f10648s;
    }

    /* renamed from: b */
    public final int mo14216b() {
        return this.f10649t;
    }
}
