package com.truenet.android.p198a;

/* renamed from: com.truenet.android.a.a */
public final class C5572a {
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090 A[SYNTHETIC, Splitter:B:30:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ab A[SYNTHETIC, Splitter:B:41:0x00ab] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m23739a(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r6, @org.jetbrains.annotations.NotNull java.lang.String r7) {
        /*
            java.lang.String r0 = "receiver$0"
            p000a.p001a.p003b.p005b.C0032h.m45b(r6, r0)
            java.lang.String r0 = "url"
            p000a.p001a.p003b.p005b.C0032h.m45b(r7, r0)
            r0 = 0
            r1 = r0
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{ Throwable -> 0x00a8, all -> 0x008a }
            r3.<init>(r7)     // Catch:{ Throwable -> 0x00a8, all -> 0x008a }
            java.net.URLConnection r7 = r3.openConnection()     // Catch:{ Throwable -> 0x00a8, all -> 0x008a }
            if (r7 != 0) goto L_0x0024
            a.a.h r7 = new a.a.h     // Catch:{ Throwable -> 0x00a8, all -> 0x008a }
            java.lang.String r3 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            r7.<init>(r3)     // Catch:{ Throwable -> 0x00a8, all -> 0x008a }
            throw r7     // Catch:{ Throwable -> 0x00a8, all -> 0x008a }
        L_0x0024:
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ Throwable -> 0x00a8, all -> 0x008a }
            r1 = 1
            r7.setDoOutput(r1)     // Catch:{ Throwable -> 0x00a9, all -> 0x0086 }
            java.lang.String r3 = "PUT"
            r7.setRequestMethod(r3)     // Catch:{ Throwable -> 0x00a9, all -> 0x0086 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "image/jpeg"
            r7.setRequestProperty(r3, r4)     // Catch:{ Throwable -> 0x00a9, all -> 0x0086 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x00a9, all -> 0x0086 }
            r3.<init>()     // Catch:{ Throwable -> 0x00a9, all -> 0x0086 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Throwable -> 0x0084, all -> 0x0082 }
            r4 = 100
            r5 = r3
            java.io.OutputStream r5 = (java.io.OutputStream) r5     // Catch:{ Throwable -> 0x0084, all -> 0x0082 }
            r6.compress(r0, r4, r5)     // Catch:{ Throwable -> 0x0084, all -> 0x0082 }
            byte[] r0 = r3.toByteArray()     // Catch:{ Throwable -> 0x0084, all -> 0x0082 }
            int r4 = r0.length     // Catch:{ Throwable -> 0x0084, all -> 0x0082 }
            r7.setFixedLengthStreamingMode(r4)     // Catch:{ Throwable -> 0x0084, all -> 0x0082 }
            java.io.OutputStream r4 = r7.getOutputStream()     // Catch:{ Throwable -> 0x0084, all -> 0x0082 }
            r4.write(r0)     // Catch:{ Throwable -> 0x0084, all -> 0x0082 }
            java.io.OutputStream r0 = r7.getOutputStream()     // Catch:{ Throwable -> 0x0084, all -> 0x0082 }
            r0.flush()     // Catch:{ Throwable -> 0x0084, all -> 0x0082 }
            r0 = 299(0x12b, float:4.19E-43)
            r4 = 200(0xc8, float:2.8E-43)
            int r5 = r7.getResponseCode()     // Catch:{ Throwable -> 0x0084, all -> 0x0082 }
            if (r4 <= r5) goto L_0x0066
            goto L_0x0069
        L_0x0066:
            if (r0 < r5) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r1 = r2
        L_0x006a:
            r3.close()     // Catch:{ Throwable -> 0x006e }
            goto L_0x007c
        L_0x006e:
            r0 = move-exception
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getCanonicalName()
            java.lang.String r2 = "stream closed with error!"
            android.util.Log.e(r6, r2, r0)
        L_0x007c:
            if (r7 == 0) goto L_0x0081
            r7.disconnect()
        L_0x0081:
            return r1
        L_0x0082:
            r0 = move-exception
            goto L_0x008e
        L_0x0084:
            r0 = r3
            goto L_0x00a9
        L_0x0086:
            r1 = move-exception
            r3 = r0
            r0 = r1
            goto L_0x008e
        L_0x008a:
            r7 = move-exception
            r3 = r0
            r0 = r7
            r7 = r1
        L_0x008e:
            if (r3 == 0) goto L_0x00a2
            r3.close()     // Catch:{ Throwable -> 0x0094 }
            goto L_0x00a2
        L_0x0094:
            r1 = move-exception
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getCanonicalName()
            java.lang.String r2 = "stream closed with error!"
            android.util.Log.e(r6, r2, r1)
        L_0x00a2:
            if (r7 == 0) goto L_0x00a7
            r7.disconnect()
        L_0x00a7:
            throw r0
        L_0x00a8:
            r7 = r1
        L_0x00a9:
            if (r0 == 0) goto L_0x00bd
            r0.close()     // Catch:{ Throwable -> 0x00af }
            goto L_0x00bd
        L_0x00af:
            r0 = move-exception
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getCanonicalName()
            java.lang.String r1 = "stream closed with error!"
            android.util.Log.e(r6, r1, r0)
        L_0x00bd:
            if (r7 == 0) goto L_0x00c2
            r7.disconnect()
        L_0x00c2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.truenet.android.p198a.C5572a.m23739a(android.graphics.Bitmap, java.lang.String):boolean");
    }
}
