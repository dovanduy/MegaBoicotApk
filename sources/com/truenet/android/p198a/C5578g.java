package com.truenet.android.p198a;

import java.io.BufferedReader;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.p003b.p004a.C0022a;
import p000a.p001a.p003b.p005b.C0033i;
import p000a.p001a.p003b.p005b.C0037m.C0038a;

/* renamed from: com.truenet.android.a.g */
public final class C5578g {

    /* renamed from: com.truenet.android.a.g$a */
    static final class C5579a extends C0033i implements C0022a<String> {

        /* renamed from: a */
        final /* synthetic */ C0038a f17673a;

        /* renamed from: b */
        final /* synthetic */ BufferedReader f17674b;

        C5579a(C0038a aVar, BufferedReader bufferedReader) {
            this.f17673a = aVar;
            this.f17674b = bufferedReader;
            super(0);
        }

        @Nullable
        /* renamed from: b */
        public final String mo45a() {
            this.f17673a.f11a = this.f17674b.readLine();
            return (String) this.f17673a.f11a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b A[SYNTHETIC, Splitter:B:33:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b6 A[SYNTHETIC, Splitter:B:44:0x00b6] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ca  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m23750a(@org.jetbrains.annotations.NotNull java.net.URL r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.Nullable android.content.Context r7) {
        /*
            java.lang.String r0 = "receiver$0"
            p000a.p001a.p003b.p005b.C0032h.m45b(r5, r0)
            java.lang.String r0 = "data"
            p000a.p001a.p003b.p005b.C0032h.m45b(r6, r0)
            r0 = 0
            r1 = r0
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            java.io.BufferedOutputStream r0 = (java.io.BufferedOutputStream) r0
            r2 = 0
            java.net.URLConnection r3 = r5.openConnection()     // Catch:{ Throwable -> 0x00b3, all -> 0x0097 }
            if (r3 != 0) goto L_0x001f
            a.a.h r6 = new a.a.h     // Catch:{ Throwable -> 0x00b3, all -> 0x0097 }
            java.lang.String r7 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            r6.<init>(r7)     // Catch:{ Throwable -> 0x00b3, all -> 0x0097 }
            throw r6     // Catch:{ Throwable -> 0x00b3, all -> 0x0097 }
        L_0x001f:
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Throwable -> 0x00b3, all -> 0x0097 }
            java.lang.String r1 = "Cache-Control"
            java.lang.String r4 = "no-cache"
            r3.setRequestProperty(r1, r4)     // Catch:{ Throwable -> 0x00b4, all -> 0x0095 }
            if (r7 == 0) goto L_0x0035
            java.lang.String r1 = "User-Agent"
            com.truenet.android.a.i$a r4 = com.truenet.android.p198a.C5581i.f17675a     // Catch:{ Throwable -> 0x00b4, all -> 0x0095 }
            java.lang.String r7 = r4.mo20685a(r7)     // Catch:{ Throwable -> 0x00b4, all -> 0x0095 }
            r3.setRequestProperty(r1, r7)     // Catch:{ Throwable -> 0x00b4, all -> 0x0095 }
        L_0x0035:
            java.lang.String r7 = "PUT"
            r3.setRequestMethod(r7)     // Catch:{ Throwable -> 0x00b4, all -> 0x0095 }
            r7 = 1
            r3.setDoOutput(r7)     // Catch:{ Throwable -> 0x00b4, all -> 0x0095 }
            java.lang.String r1 = "Content-Type"
            java.lang.String r4 = "text/html"
            r3.setRequestProperty(r1, r4)     // Catch:{ Throwable -> 0x00b4, all -> 0x0095 }
            java.nio.charset.Charset r1 = p000a.p001a.p008e.C0054a.f14a     // Catch:{ Throwable -> 0x00b4, all -> 0x0095 }
            byte[] r6 = r6.getBytes(r1)     // Catch:{ Throwable -> 0x00b4, all -> 0x0095 }
            java.lang.String r1 = "(this as java.lang.String).getBytes(charset)"
            p000a.p001a.p003b.p005b.C0032h.m42a(r6, r1)     // Catch:{ Throwable -> 0x00b4, all -> 0x0095 }
            int r1 = r6.length     // Catch:{ Throwable -> 0x00b4, all -> 0x0095 }
            r3.setFixedLengthStreamingMode(r1)     // Catch:{ Throwable -> 0x00b4, all -> 0x0095 }
            r1 = 50000(0xc350, float:7.0065E-41)
            r3.setConnectTimeout(r1)     // Catch:{ Throwable -> 0x00b4, all -> 0x0095 }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ Throwable -> 0x00b4, all -> 0x0095 }
            java.io.OutputStream r4 = r3.getOutputStream()     // Catch:{ Throwable -> 0x00b4, all -> 0x0095 }
            r1.<init>(r4)     // Catch:{ Throwable -> 0x00b4, all -> 0x0095 }
            r1.write(r6)     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            r1.flush()     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            r6 = 299(0x12b, float:4.19E-43)
            r0 = 200(0xc8, float:2.8E-43)
            int r4 = r3.getResponseCode()     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            if (r0 <= r4) goto L_0x0074
            goto L_0x0077
        L_0x0074:
            if (r6 < r4) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r7 = r2
        L_0x0078:
            r1.close()     // Catch:{ Throwable -> 0x007c }
            goto L_0x008a
        L_0x007c:
            r6 = move-exception
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.String r0 = "stream closed with error!"
            android.util.Log.e(r5, r0, r6)
        L_0x008a:
            if (r3 == 0) goto L_0x008f
            r3.disconnect()
        L_0x008f:
            return r7
        L_0x0090:
            r6 = move-exception
            r0 = r1
            goto L_0x0099
        L_0x0093:
            r0 = r1
            goto L_0x00b4
        L_0x0095:
            r6 = move-exception
            goto L_0x0099
        L_0x0097:
            r6 = move-exception
            r3 = r1
        L_0x0099:
            if (r0 == 0) goto L_0x00ad
            r0.close()     // Catch:{ Throwable -> 0x009f }
            goto L_0x00ad
        L_0x009f:
            r7 = move-exception
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.String r0 = "stream closed with error!"
            android.util.Log.e(r5, r0, r7)
        L_0x00ad:
            if (r3 == 0) goto L_0x00b2
            r3.disconnect()
        L_0x00b2:
            throw r6
        L_0x00b3:
            r3 = r1
        L_0x00b4:
            if (r0 == 0) goto L_0x00c8
            r0.close()     // Catch:{ Throwable -> 0x00ba }
            goto L_0x00c8
        L_0x00ba:
            r6 = move-exception
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.String r7 = "stream closed with error!"
            android.util.Log.e(r5, r7, r6)
        L_0x00c8:
            if (r3 == 0) goto L_0x00cd
            r3.disconnect()
        L_0x00cd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.truenet.android.p198a.C5578g.m23750a(java.net.URL, java.lang.String, android.content.Context):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e9 A[SYNTHETIC, Splitter:B:45:0x00e9] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f1 A[Catch:{ Throwable -> 0x00ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010b A[SYNTHETIC, Splitter:B:59:0x010b] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0113 A[Catch:{ Throwable -> 0x010f }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0126  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m23751b(@org.jetbrains.annotations.NotNull java.net.URL r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.Nullable android.content.Context r8) {
        /*
            java.lang.String r0 = "receiver$0"
            p000a.p001a.p003b.p005b.C0032h.m45b(r6, r0)
            java.lang.String r0 = "data"
            p000a.p001a.p003b.p005b.C0032h.m45b(r7, r0)
            r0 = 0
            r1 = r0
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            r2 = r0
            java.io.BufferedOutputStream r2 = (java.io.BufferedOutputStream) r2
            r3 = r0
            java.io.BufferedInputStream r3 = (java.io.BufferedInputStream) r3
            java.net.URLConnection r4 = r6.openConnection()     // Catch:{ Throwable -> 0x0108, all -> 0x00e5 }
            if (r4 != 0) goto L_0x0022
            a.a.h r7 = new a.a.h     // Catch:{ Throwable -> 0x0108, all -> 0x00e5 }
            java.lang.String r8 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            r7.<init>(r8)     // Catch:{ Throwable -> 0x0108, all -> 0x00e5 }
            throw r7     // Catch:{ Throwable -> 0x0108, all -> 0x00e5 }
        L_0x0022:
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Throwable -> 0x0108, all -> 0x00e5 }
            java.lang.String r1 = "Cache-Control"
            java.lang.String r5 = "no-cache"
            r4.setRequestProperty(r1, r5)     // Catch:{ Throwable -> 0x0109, all -> 0x00e3 }
            if (r8 == 0) goto L_0x0038
            java.lang.String r1 = "User-Agent"
            com.truenet.android.a.i$a r5 = com.truenet.android.p198a.C5581i.f17675a     // Catch:{ Throwable -> 0x0109, all -> 0x00e3 }
            java.lang.String r8 = r5.mo20685a(r8)     // Catch:{ Throwable -> 0x0109, all -> 0x00e3 }
            r4.setRequestProperty(r1, r8)     // Catch:{ Throwable -> 0x0109, all -> 0x00e3 }
        L_0x0038:
            java.lang.String r8 = "POST"
            r4.setRequestMethod(r8)     // Catch:{ Throwable -> 0x0109, all -> 0x00e3 }
            r8 = 1
            r4.setDoOutput(r8)     // Catch:{ Throwable -> 0x0109, all -> 0x00e3 }
            r4.setDoInput(r8)     // Catch:{ Throwable -> 0x0109, all -> 0x00e3 }
            java.nio.charset.Charset r8 = p000a.p001a.p008e.C0054a.f14a     // Catch:{ Throwable -> 0x0109, all -> 0x00e3 }
            byte[] r7 = r7.getBytes(r8)     // Catch:{ Throwable -> 0x0109, all -> 0x00e3 }
            java.lang.String r8 = "(this as java.lang.String).getBytes(charset)"
            p000a.p001a.p003b.p005b.C0032h.m42a(r7, r8)     // Catch:{ Throwable -> 0x0109, all -> 0x00e3 }
            int r8 = r7.length     // Catch:{ Throwable -> 0x0109, all -> 0x00e3 }
            r4.setFixedLengthStreamingMode(r8)     // Catch:{ Throwable -> 0x0109, all -> 0x00e3 }
            java.lang.String r8 = "Content-Type"
            java.lang.String r1 = "application/json"
            r4.setRequestProperty(r8, r1)     // Catch:{ Throwable -> 0x0109, all -> 0x00e3 }
            r8 = 50000(0xc350, float:7.0065E-41)
            r4.setConnectTimeout(r8)     // Catch:{ Throwable -> 0x0109, all -> 0x00e3 }
            java.io.BufferedOutputStream r8 = new java.io.BufferedOutputStream     // Catch:{ Throwable -> 0x0109, all -> 0x00e3 }
            java.io.OutputStream r1 = r4.getOutputStream()     // Catch:{ Throwable -> 0x0109, all -> 0x00e3 }
            r8.<init>(r1)     // Catch:{ Throwable -> 0x0109, all -> 0x00e3 }
            r8.write(r7)     // Catch:{ Throwable -> 0x00e1, all -> 0x00de }
            r8.flush()     // Catch:{ Throwable -> 0x00e1, all -> 0x00de }
            int r7 = r4.getResponseCode()     // Catch:{ Throwable -> 0x00e1, all -> 0x00de }
            r1 = 200(0xc8, float:2.8E-43)
            if (r7 != r1) goto L_0x00bf
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00e1, all -> 0x00de }
            r7.<init>()     // Catch:{ Throwable -> 0x00e1, all -> 0x00de }
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ Throwable -> 0x00e1, all -> 0x00de }
            java.io.InputStream r2 = r4.getInputStream()     // Catch:{ Throwable -> 0x00e1, all -> 0x00de }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x00e1, all -> 0x00de }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x00bc, all -> 0x00b8 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x00bc, all -> 0x00b8 }
            r5 = r1
            java.io.InputStream r5 = (java.io.InputStream) r5     // Catch:{ Throwable -> 0x00bc, all -> 0x00b8 }
            r3.<init>(r5)     // Catch:{ Throwable -> 0x00bc, all -> 0x00b8 }
            java.io.Reader r3 = (java.io.Reader) r3     // Catch:{ Throwable -> 0x00bc, all -> 0x00b8 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x00bc, all -> 0x00b8 }
            a.a.b.b.m$a r3 = new a.a.b.b.m$a     // Catch:{ Throwable -> 0x00bc, all -> 0x00b8 }
            r3.<init>()     // Catch:{ Throwable -> 0x00bc, all -> 0x00b8 }
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x00bc, all -> 0x00b8 }
            r3.f11a = r5     // Catch:{ Throwable -> 0x00bc, all -> 0x00b8 }
        L_0x009e:
            com.truenet.android.a.g$a r5 = new com.truenet.android.a.g$a     // Catch:{ Throwable -> 0x00bc, all -> 0x00b8 }
            r5.<init>(r3, r2)     // Catch:{ Throwable -> 0x00bc, all -> 0x00b8 }
            a.a.b.a.a r5 = (p000a.p001a.p003b.p004a.C0022a) r5     // Catch:{ Throwable -> 0x00bc, all -> 0x00b8 }
            java.lang.Object r5 = r5.mo45a()     // Catch:{ Throwable -> 0x00bc, all -> 0x00b8 }
            if (r5 == 0) goto L_0x00b3
            T r5 = r3.f11a     // Catch:{ Throwable -> 0x00bc, all -> 0x00b8 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x00bc, all -> 0x00b8 }
            r7.append(r5)     // Catch:{ Throwable -> 0x00bc, all -> 0x00b8 }
            goto L_0x009e
        L_0x00b3:
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x00bc, all -> 0x00b8 }
            goto L_0x00c1
        L_0x00b8:
            r7 = move-exception
            r2 = r8
            r3 = r1
            goto L_0x00e7
        L_0x00bc:
            r2 = r8
            r3 = r1
            goto L_0x0109
        L_0x00bf:
            r7 = r0
            r1 = r3
        L_0x00c1:
            r8.close()     // Catch:{ Throwable -> 0x00ca }
            if (r1 == 0) goto L_0x00d8
            r1.close()     // Catch:{ Throwable -> 0x00ca }
            goto L_0x00d8
        L_0x00ca:
            r8 = move-exception
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getCanonicalName()
            java.lang.String r0 = "stream closed with error!"
            android.util.Log.e(r6, r0, r8)
        L_0x00d8:
            if (r4 == 0) goto L_0x00dd
            r4.disconnect()
        L_0x00dd:
            return r7
        L_0x00de:
            r7 = move-exception
            r2 = r8
            goto L_0x00e7
        L_0x00e1:
            r2 = r8
            goto L_0x0109
        L_0x00e3:
            r7 = move-exception
            goto L_0x00e7
        L_0x00e5:
            r7 = move-exception
            r4 = r1
        L_0x00e7:
            if (r2 == 0) goto L_0x00ef
            r2.close()     // Catch:{ Throwable -> 0x00ed }
            goto L_0x00ef
        L_0x00ed:
            r8 = move-exception
            goto L_0x00f5
        L_0x00ef:
            if (r3 == 0) goto L_0x0102
            r3.close()     // Catch:{ Throwable -> 0x00ed }
            goto L_0x0102
        L_0x00f5:
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getCanonicalName()
            java.lang.String r0 = "stream closed with error!"
            android.util.Log.e(r6, r0, r8)
        L_0x0102:
            if (r4 == 0) goto L_0x0107
            r4.disconnect()
        L_0x0107:
            throw r7
        L_0x0108:
            r4 = r1
        L_0x0109:
            if (r2 == 0) goto L_0x0111
            r2.close()     // Catch:{ Throwable -> 0x010f }
            goto L_0x0111
        L_0x010f:
            r7 = move-exception
            goto L_0x0117
        L_0x0111:
            if (r3 == 0) goto L_0x0124
            r3.close()     // Catch:{ Throwable -> 0x010f }
            goto L_0x0124
        L_0x0117:
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getCanonicalName()
            java.lang.String r8 = "stream closed with error!"
            android.util.Log.e(r6, r8, r7)
        L_0x0124:
            if (r4 == 0) goto L_0x0129
            r4.disconnect()
        L_0x0129:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.truenet.android.p198a.C5578g.m23751b(java.net.URL, java.lang.String, android.content.Context):java.lang.String");
    }
}
