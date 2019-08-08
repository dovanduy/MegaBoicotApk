package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zr */
final class C4381zr {

    /* renamed from: a */
    private static final Class<?> f14357a = m18738a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f14358b = (m18738a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    private static <T> Class<T> m18738a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m18739a() {
        return f14357a != null && !f14358b;
    }

    /* renamed from: b */
    static Class<?> m18740b() {
        return f14357a;
    }
}
