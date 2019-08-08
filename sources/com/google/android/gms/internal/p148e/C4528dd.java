package com.google.android.gms.internal.p148e;

/* renamed from: com.google.android.gms.internal.e.dd */
public enum C4528dd {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, Integer.valueOf(0)),
    LONG(Long.TYPE, Long.class, Long.valueOf(0)),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.valueOf(false)),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C4469bj.class, C4469bj.class, C4469bj.f14699a),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    

    /* renamed from: k */
    private final Class<?> f14880k;

    /* renamed from: l */
    private final Class<?> f14881l;

    /* renamed from: m */
    private final Object f14882m;

    private C4528dd(Class<?> cls, Class<?> cls2, Object obj) {
        this.f14880k = cls;
        this.f14881l = cls2;
        this.f14882m = obj;
    }

    /* renamed from: a */
    public final Class<?> mo16633a() {
        return this.f14881l;
    }
}
