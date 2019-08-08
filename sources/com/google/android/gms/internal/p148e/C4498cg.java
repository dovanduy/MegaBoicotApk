package com.google.android.gms.internal.p148e;

/* renamed from: com.google.android.gms.internal.e.cg */
final class C4498cg {

    /* renamed from: a */
    private static final Class<?> f14752a = m19339c();

    /* renamed from: c */
    private static Class<?> m19339c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C4499ch m19336a() {
        if (f14752a != null) {
            try {
                return m19337a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C4499ch.f14753a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.p148e.C4499ch m19338b() {
        /*
            java.lang.Class<?> r0 = f14752a
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "loadGeneratedRegistry"
            com.google.android.gms.internal.e.ch r0 = m19337a(r0)     // Catch:{ Exception -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 != 0) goto L_0x0012
            com.google.android.gms.internal.e.ch r0 = com.google.android.gms.internal.p148e.C4499ch.m19342c()
        L_0x0012:
            if (r0 != 0) goto L_0x0018
            com.google.android.gms.internal.e.ch r0 = m19336a()
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p148e.C4498cg.m19338b():com.google.android.gms.internal.e.ch");
    }

    /* renamed from: a */
    private static final C4499ch m19337a(String str) throws Exception {
        return (C4499ch) f14752a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
