package com.google.android.gms.internal.ads;

final class aaq {

    /* renamed from: a */
    private static final Class<?> f10328a = m13214b();

    /* renamed from: a */
    public static aar m13213a() {
        if (f10328a != null) {
            try {
                return (aar) f10328a.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return aar.f10329a;
    }

    /* renamed from: b */
    private static Class<?> m13214b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
