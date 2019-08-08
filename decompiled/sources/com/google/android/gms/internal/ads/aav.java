package com.google.android.gms.internal.ads;

final class aav {

    /* renamed from: a */
    private static final aat<?> f10335a = new aau();

    /* renamed from: b */
    private static final aat<?> f10336b = m13242c();

    /* renamed from: a */
    static aat<?> m13240a() {
        return f10335a;
    }

    /* renamed from: b */
    static aat<?> m13241b() {
        if (f10336b != null) {
            return f10336b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: c */
    private static aat<?> m13242c() {
        try {
            return (aat) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
