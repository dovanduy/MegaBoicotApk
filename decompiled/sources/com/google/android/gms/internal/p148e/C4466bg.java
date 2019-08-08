package com.google.android.gms.internal.p148e;

/* renamed from: com.google.android.gms.internal.e.bg */
final class C4466bg {

    /* renamed from: a */
    private static final Class<?> f14694a = m18949a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f14695b = (m18949a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    static boolean m18950a() {
        return f14694a != null && !f14695b;
    }

    /* renamed from: b */
    static Class<?> m18951b() {
        return f14694a;
    }

    /* renamed from: a */
    private static <T> Class<T> m18949a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
