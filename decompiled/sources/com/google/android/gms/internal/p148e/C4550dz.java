package com.google.android.gms.internal.p148e;

/* renamed from: com.google.android.gms.internal.e.dz */
final class C4550dz {

    /* renamed from: a */
    private static final C4548dx f14907a = m19540c();

    /* renamed from: b */
    private static final C4548dx f14908b = new C4549dy();

    /* renamed from: a */
    static C4548dx m19538a() {
        return f14907a;
    }

    /* renamed from: b */
    static C4548dx m19539b() {
        return f14908b;
    }

    /* renamed from: c */
    private static C4548dx m19540c() {
        try {
            return (C4548dx) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
