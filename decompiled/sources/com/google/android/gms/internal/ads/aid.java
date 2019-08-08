package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

public final class aid extends aiy {

    /* renamed from: d */
    private static volatile afw f11132d;

    /* renamed from: e */
    private static final Object f11133e = new Object();

    /* renamed from: f */
    private C4274wk f11134f = null;

    public aid(ahn ahn, String str, String str2, C4378zo zoVar, int i, int i2, C4274wk wkVar) {
        super(ahn, str, str2, zoVar, i, 27);
        this.f11134f = wkVar;
    }

    /* renamed from: c */
    private final String m14184c() {
        try {
            if (this.f11164a.mo14316l() != null) {
                this.f11164a.mo14316l().get();
            }
            C4378zo k = this.f11164a.mo14315k();
            if (!(k == null || k.f14342n == null)) {
                return k.f14342n;
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14345a() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.afw r0 = f11132d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.afw r0 = f11132d
            java.lang.String r0 = r0.f10766a
            boolean r0 = com.google.android.gms.internal.ads.ahv.m14164b(r0)
            if (r0 != 0) goto L_0x002b
            com.google.android.gms.internal.ads.afw r0 = f11132d
            java.lang.String r0 = r0.f10766a
            java.lang.String r3 = "E"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x002b
            com.google.android.gms.internal.ads.afw r0 = f11132d
            java.lang.String r0 = r0.f10766a
            java.lang.String r3 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r0 = r2
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = f11133e
            monitor-enter(r0)
            com.google.android.gms.internal.ads.wk r3 = r9.f11134f     // Catch:{ all -> 0x00de }
            r3 = 0
            boolean r4 = com.google.android.gms.internal.ads.ahv.m14164b(r3)     // Catch:{ all -> 0x00de }
            r5 = 3
            r6 = 2
            if (r4 != 0) goto L_0x003e
            r4 = 4
            goto L_0x0081
        L_0x003e:
            com.google.android.gms.internal.ads.wk r4 = r9.f11134f     // Catch:{ all -> 0x00de }
            com.google.android.gms.internal.ads.ahv.m14164b(r3)     // Catch:{ all -> 0x00de }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x00de }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00de }
            if (r4 == 0) goto L_0x0080
            com.google.android.gms.internal.ads.ahn r4 = r9.f11164a     // Catch:{ all -> 0x00de }
            boolean r4 = r4.mo14313i()     // Catch:{ all -> 0x00de }
            if (r4 == 0) goto L_0x007b
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.aru.f11843bO     // Catch:{ all -> 0x00de }
            com.google.android.gms.internal.ads.ars r7 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x00de }
            java.lang.Object r4 = r7.mo14695a(r4)     // Catch:{ all -> 0x00de }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x00de }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00de }
            if (r4 == 0) goto L_0x007b
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.aru.f11844bP     // Catch:{ all -> 0x00de }
            com.google.android.gms.internal.ads.ars r7 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x00de }
            java.lang.Object r4 = r7.mo14695a(r4)     // Catch:{ all -> 0x00de }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x00de }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00de }
            if (r4 == 0) goto L_0x007b
            r4 = r1
            goto L_0x007c
        L_0x007b:
            r4 = r2
        L_0x007c:
            if (r4 == 0) goto L_0x0080
            r4 = r5
            goto L_0x0081
        L_0x0080:
            r4 = r6
        L_0x0081:
            java.lang.reflect.Method r7 = r9.f11166c     // Catch:{ all -> 0x00de }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00de }
            com.google.android.gms.internal.ads.ahn r8 = r9.f11164a     // Catch:{ all -> 0x00de }
            android.content.Context r8 = r8.mo14301a()     // Catch:{ all -> 0x00de }
            r5[r2] = r8     // Catch:{ all -> 0x00de }
            if (r4 != r6) goto L_0x0090
            r2 = r1
        L_0x0090:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x00de }
            r5[r1] = r2     // Catch:{ all -> 0x00de }
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.aru.f11837bI     // Catch:{ all -> 0x00de }
            com.google.android.gms.internal.ads.ars r2 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x00de }
            java.lang.Object r1 = r2.mo14695a(r1)     // Catch:{ all -> 0x00de }
            r5[r6] = r1     // Catch:{ all -> 0x00de }
            java.lang.Object r1 = r7.invoke(r3, r5)     // Catch:{ all -> 0x00de }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00de }
            com.google.android.gms.internal.ads.afw r2 = new com.google.android.gms.internal.ads.afw     // Catch:{ all -> 0x00de }
            r2.<init>(r1)     // Catch:{ all -> 0x00de }
            f11132d = r2     // Catch:{ all -> 0x00de }
            java.lang.String r1 = r2.f10766a     // Catch:{ all -> 0x00de }
            boolean r1 = com.google.android.gms.internal.ads.ahv.m14164b(r1)     // Catch:{ all -> 0x00de }
            if (r1 != 0) goto L_0x00c3
            com.google.android.gms.internal.ads.afw r1 = f11132d     // Catch:{ all -> 0x00de }
            java.lang.String r1 = r1.f10766a     // Catch:{ all -> 0x00de }
            java.lang.String r2 = "E"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x00de }
            if (r1 == 0) goto L_0x00dc
        L_0x00c3:
            switch(r4) {
                case 3: goto L_0x00ce;
                case 4: goto L_0x00c7;
                default: goto L_0x00c6;
            }     // Catch:{ all -> 0x00de }
        L_0x00c6:
            goto L_0x00dc
        L_0x00c7:
            com.google.android.gms.internal.ads.afw r1 = f11132d     // Catch:{ all -> 0x00de }
            java.lang.String r2 = r3.f14195a     // Catch:{ all -> 0x00de }
            r1.f10766a = r2     // Catch:{ all -> 0x00de }
            goto L_0x00dc
        L_0x00ce:
            java.lang.String r1 = r9.m14184c()     // Catch:{ all -> 0x00de }
            boolean r2 = com.google.android.gms.internal.ads.ahv.m14164b(r1)     // Catch:{ all -> 0x00de }
            if (r2 != 0) goto L_0x00dc
            com.google.android.gms.internal.ads.afw r2 = f11132d     // Catch:{ all -> 0x00de }
            r2.f10766a = r1     // Catch:{ all -> 0x00de }
        L_0x00dc:
            monitor-exit(r0)     // Catch:{ all -> 0x00de }
            goto L_0x00e1
        L_0x00de:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00de }
            throw r1
        L_0x00e1:
            com.google.android.gms.internal.ads.zo r0 = r9.f11165b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.afw r1 = f11132d     // Catch:{ all -> 0x0116 }
            if (r1 == 0) goto L_0x0114
            com.google.android.gms.internal.ads.zo r1 = r9.f11165b     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.afw r2 = f11132d     // Catch:{ all -> 0x0116 }
            java.lang.String r2 = r2.f10766a     // Catch:{ all -> 0x0116 }
            r1.f14342n = r2     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.zo r1 = r9.f11165b     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.afw r2 = f11132d     // Catch:{ all -> 0x0116 }
            long r2 = r2.f10767b     // Catch:{ all -> 0x0116 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0116 }
            r1.f14348t = r2     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.zo r1 = r9.f11165b     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.afw r2 = f11132d     // Catch:{ all -> 0x0116 }
            java.lang.String r2 = r2.f10768c     // Catch:{ all -> 0x0116 }
            r1.f14347s = r2     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.zo r1 = r9.f11165b     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.afw r2 = f11132d     // Catch:{ all -> 0x0116 }
            java.lang.String r2 = r2.f10769d     // Catch:{ all -> 0x0116 }
            r1.f14288C = r2     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.zo r1 = r9.f11165b     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.afw r2 = f11132d     // Catch:{ all -> 0x0116 }
            java.lang.String r2 = r2.f10770e     // Catch:{ all -> 0x0116 }
            r1.f14289D = r2     // Catch:{ all -> 0x0116 }
        L_0x0114:
            monitor-exit(r0)     // Catch:{ all -> 0x0116 }
            return
        L_0x0116:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0116 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aid.mo14345a():void");
    }
}
