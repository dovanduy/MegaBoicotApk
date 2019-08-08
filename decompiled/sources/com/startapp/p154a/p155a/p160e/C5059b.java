package com.startapp.p154a.p155a.p160e;

/* renamed from: com.startapp.a.a.e.b */
/* compiled from: StartAppSDK */
public class C5059b {

    /* renamed from: a */
    private final C5060c f16378a = new C5060c();

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0058 A[SYNTHETIC, Splitter:B:32:0x0058] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo18665a(com.startapp.p154a.p155a.p156a.C5044c r12) {
        /*
            r11 = this;
            int r0 = r12.mo18640b()
            int r1 = r12.mo18641c()
            r2 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x004d }
            r3.<init>()     // Catch:{ Exception -> 0x004d }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            r4 = 0
            r5 = r0
            r0 = r4
        L_0x0016:
            if (r0 >= r1) goto L_0x0035
            long[] r6 = r12.mo18639a(r0)     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            r7 = r5
            r5 = r4
        L_0x001e:
            r8 = 4096(0x1000, float:5.74E-42)
            if (r5 >= r8) goto L_0x0031
            int r8 = r7 + -1
            if (r7 <= 0) goto L_0x002f
            r9 = r6[r5]     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            r2.writeLong(r9)     // Catch:{ Exception -> 0x0048, all -> 0x0045 }
            int r5 = r5 + 1
            r7 = r8
            goto L_0x001e
        L_0x002f:
            r5 = r8
            goto L_0x0032
        L_0x0031:
            r5 = r7
        L_0x0032:
            int r0 = r0 + 1
            goto L_0x0016
        L_0x0035:
            if (r3 == 0) goto L_0x003a
            r3.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            com.startapp.a.a.e.c r12 = r11.f16378a
            byte[] r0 = r3.toByteArray()
            java.lang.String r12 = r12.mo18666a(r0)
            return r12
        L_0x0045:
            r12 = move-exception
            r2 = r3
            goto L_0x0056
        L_0x0048:
            r12 = move-exception
            r2 = r3
            goto L_0x004e
        L_0x004b:
            r12 = move-exception
            goto L_0x0056
        L_0x004d:
            r12 = move-exception
        L_0x004e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "problem serializing bitSet"
            r0.<init>(r1, r12)     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ all -> 0x004b }
        L_0x0056:
            if (r2 == 0) goto L_0x005b
            r2.close()     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.p154a.p155a.p160e.C5059b.mo18665a(com.startapp.a.a.a.c):java.lang.String");
    }
}
