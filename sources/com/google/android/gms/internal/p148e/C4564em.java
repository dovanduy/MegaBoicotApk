package com.google.android.gms.internal.p148e;

/* renamed from: com.google.android.gms.internal.e.em */
final class C4564em {

    /* renamed from: a */
    private static final C4562ek f14932a = m19616c();

    /* renamed from: b */
    private static final C4562ek f14933b = new C4563el();

    /* renamed from: a */
    static C4562ek m19614a() {
        return f14932a;
    }

    /* renamed from: b */
    static C4562ek m19615b() {
        return f14933b;
    }

    /* renamed from: c */
    private static C4562ek m19616c() {
        try {
            return (C4562ek) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
