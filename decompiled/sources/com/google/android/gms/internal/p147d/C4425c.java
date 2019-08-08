package com.google.android.gms.internal.p147d;

/* renamed from: com.google.android.gms.internal.d.c */
public final class C4425c {

    /* renamed from: a */
    private static final C4427d f14618a;

    /* renamed from: b */
    private static final int f14619b;

    /* renamed from: com.google.android.gms.internal.d.c$a */
    static final class C4426a extends C4427d {
        C4426a() {
        }

        /* renamed from: a */
        public final void mo16322a(Throwable th, Throwable th2) {
        }
    }

    /* renamed from: a */
    public static void m18851a(Throwable th, Throwable th2) {
        f14618a.mo16322a(th, th2);
    }

    /* renamed from: a */
    private static Integer m18850a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = m18850a()     // Catch:{ Throwable -> 0x002c }
            if (r1 == 0) goto L_0x0017
            int r2 = r1.intValue()     // Catch:{ Throwable -> 0x0015 }
            r3 = 19
            if (r2 < r3) goto L_0x0017
            com.google.android.gms.internal.d.h r2 = new com.google.android.gms.internal.d.h     // Catch:{ Throwable -> 0x0015 }
            r2.<init>()     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0064
        L_0x0015:
            r2 = move-exception
            goto L_0x002e
        L_0x0017:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch:{ Throwable -> 0x0015 }
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x0026
            com.google.android.gms.internal.d.g r2 = new com.google.android.gms.internal.d.g     // Catch:{ Throwable -> 0x0015 }
            r2.<init>()     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0064
        L_0x0026:
            com.google.android.gms.internal.d.c$a r2 = new com.google.android.gms.internal.d.c$a     // Catch:{ Throwable -> 0x0015 }
            r2.<init>()     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0064
        L_0x002c:
            r2 = move-exception
            r1 = 0
        L_0x002e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.d.c$a> r4 = com.google.android.gms.internal.p147d.C4425c.C4426a.class
            java.lang.String r4 = r4.getName()
            r5 = 132(0x84, float:1.85E-43)
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r6 = r6.length()
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "An error has occured when initializing the try-with-resources desuguring strategy. The default strategy "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = "will be used. The error is: "
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.println(r4)
            java.io.PrintStream r3 = java.lang.System.err
            r2.printStackTrace(r3)
            com.google.android.gms.internal.d.c$a r2 = new com.google.android.gms.internal.d.c$a
            r2.<init>()
        L_0x0064:
            f14618a = r2
            if (r1 != 0) goto L_0x0069
            goto L_0x006d
        L_0x0069:
            int r0 = r1.intValue()
        L_0x006d:
            f14619b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p147d.C4425c.<clinit>():void");
    }
}
