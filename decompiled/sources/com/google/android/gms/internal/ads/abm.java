package com.google.android.gms.internal.ads;

public enum abm {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, Integer.valueOf(0)),
    LONG(Long.TYPE, Long.class, Long.valueOf(0)),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.valueOf(false)),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C4386zw.class, C4386zw.class, C4386zw.f14365a),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    

    /* renamed from: k */
    private final Class<?> f10452k;

    /* renamed from: l */
    private final Class<?> f10453l;

    /* renamed from: m */
    private final Object f10454m;

    private abm(Class<?> cls, Class<?> cls2, Object obj) {
        this.f10452k = cls;
        this.f10453l = cls2;
        this.f10454m = obj;
    }

    /* renamed from: a */
    public final Class<?> mo14009a() {
        return this.f10453l;
    }
}
