package com.google.android.gms.internal.p148e;

/* renamed from: com.google.android.gms.internal.e.ck */
final class C4503ck {

    /* renamed from: a */
    private static final C4501ci<?> f14760a = new C4502cj();

    /* renamed from: b */
    private static final C4501ci<?> f14761b = m19367c();

    /* renamed from: c */
    private static C4501ci<?> m19367c() {
        try {
            return (C4501ci) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static C4501ci<?> m19365a() {
        return f14760a;
    }

    /* renamed from: b */
    static C4501ci<?> m19366b() {
        if (f14761b != null) {
            return f14761b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
