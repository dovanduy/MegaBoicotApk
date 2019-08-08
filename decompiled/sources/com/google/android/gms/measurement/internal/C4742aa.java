package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3513t;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.aa */
final class C4742aa implements Runnable {

    /* renamed from: a */
    private final URL f15372a;

    /* renamed from: b */
    private final byte[] f15373b;

    /* renamed from: c */
    private final C4899x f15374c;

    /* renamed from: d */
    private final String f15375d;

    /* renamed from: e */
    private final Map<String, String> f15376e;

    /* renamed from: f */
    private final /* synthetic */ C4897v f15377f;

    public C4742aa(C4897v vVar, String str, URL url, byte[] bArr, Map<String, String> map, C4899x xVar) {
        this.f15377f = vVar;
        C3513t.m12627a(str);
        C3513t.m12625a(url);
        C3513t.m12625a(xVar);
        this.f15372a = url;
        this.f15373b = bArr;
        this.f15374c = xVar;
        this.f15375d = str;
        this.f15376e = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c5 A[SYNTHETIC, Splitter:B:43:0x00c5] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0102 A[SYNTHETIC, Splitter:B:56:0x0102] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            com.google.android.gms.measurement.internal.v r0 = r12.f15377f
            r0.mo17143c()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.v r2 = r12.f15377f     // Catch:{ IOException -> 0x00fb, all -> 0x00bf }
            java.net.URL r3 = r12.f15372a     // Catch:{ IOException -> 0x00fb, all -> 0x00bf }
            java.net.HttpURLConnection r2 = r2.mo17767a(r3)     // Catch:{ IOException -> 0x00fb, all -> 0x00bf }
            java.util.Map<java.lang.String, java.lang.String> r3 = r12.f15376e     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            if (r3 == 0) goto L_0x0039
            java.util.Map<java.lang.String, java.lang.String> r3 = r12.f15376e     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
        L_0x001d:
            boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            r2.addRequestProperty(r5, r4)     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            goto L_0x001d
        L_0x0039:
            byte[] r3 = r12.f15373b     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            if (r3 == 0) goto L_0x0086
            com.google.android.gms.measurement.internal.v r3 = r12.f15377f     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            com.google.android.gms.measurement.internal.ei r3 = r3.mo17214g()     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            byte[] r4 = r12.f15373b     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            byte[] r3 = r3.mo17478b(r4)     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            com.google.android.gms.measurement.internal.v r4 = r12.f15377f     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo17158r()     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo17759x()     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            java.lang.String r5 = "Uploading data. size"
            int r6 = r3.length     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            r4.mo17764a(r5, r6)     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            r4 = 1
            r2.setDoOutput(r4)     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r5 = "gzip"
            r2.addRequestProperty(r4, r5)     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            int r4 = r3.length     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            r2.setFixedLengthStreamingMode(r4)     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            r2.connect()     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            java.io.OutputStream r4 = r2.getOutputStream()     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            r4.write(r3)     // Catch:{ IOException -> 0x007f, all -> 0x007a }
            r4.close()     // Catch:{ IOException -> 0x007f, all -> 0x007a }
            goto L_0x0086
        L_0x007a:
            r3 = move-exception
            r10 = r0
            r7 = r1
            r0 = r4
            goto L_0x00c3
        L_0x007f:
            r3 = move-exception
            r10 = r0
            r7 = r1
            r8 = r3
            r0 = r4
            goto L_0x0100
        L_0x0086:
            int r7 = r2.getResponseCode()     // Catch:{ IOException -> 0x00bc, all -> 0x00b9 }
            java.util.Map r10 = r2.getHeaderFields()     // Catch:{ IOException -> 0x00b6, all -> 0x00b3 }
            com.google.android.gms.measurement.internal.v r1 = r12.f15377f     // Catch:{ IOException -> 0x00b1, all -> 0x00af }
            byte[] r9 = com.google.android.gms.measurement.internal.C4897v.m21399a(r2)     // Catch:{ IOException -> 0x00b1, all -> 0x00af }
            if (r2 == 0) goto L_0x0099
            r2.disconnect()
        L_0x0099:
            com.google.android.gms.measurement.internal.v r0 = r12.f15377f
            com.google.android.gms.measurement.internal.ar r0 = r0.mo17157q()
            com.google.android.gms.measurement.internal.y r1 = new com.google.android.gms.measurement.internal.y
            java.lang.String r5 = r12.f15375d
            com.google.android.gms.measurement.internal.x r6 = r12.f15374c
            r8 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.mo17219a(r1)
            return
        L_0x00af:
            r3 = move-exception
            goto L_0x00c3
        L_0x00b1:
            r3 = move-exception
            goto L_0x00ff
        L_0x00b3:
            r3 = move-exception
            r10 = r0
            goto L_0x00c3
        L_0x00b6:
            r3 = move-exception
            r10 = r0
            goto L_0x00ff
        L_0x00b9:
            r3 = move-exception
            r10 = r0
            goto L_0x00c2
        L_0x00bc:
            r3 = move-exception
            r10 = r0
            goto L_0x00fe
        L_0x00bf:
            r3 = move-exception
            r2 = r0
            r10 = r2
        L_0x00c2:
            r7 = r1
        L_0x00c3:
            if (r0 == 0) goto L_0x00df
            r0.close()     // Catch:{ IOException -> 0x00c9 }
            goto L_0x00df
        L_0x00c9:
            r0 = move-exception
            com.google.android.gms.measurement.internal.v r1 = r12.f15377f
            com.google.android.gms.measurement.internal.r r1 = r1.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17761y_()
            java.lang.String r4 = "Error closing HTTP compressed POST connection output stream. appId"
            java.lang.String r5 = r12.f15375d
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4893r.m21360a(r5)
            r1.mo17765a(r4, r5, r0)
        L_0x00df:
            if (r2 == 0) goto L_0x00e4
            r2.disconnect()
        L_0x00e4:
            com.google.android.gms.measurement.internal.v r0 = r12.f15377f
            com.google.android.gms.measurement.internal.ar r0 = r0.mo17157q()
            com.google.android.gms.measurement.internal.y r1 = new com.google.android.gms.measurement.internal.y
            java.lang.String r5 = r12.f15375d
            com.google.android.gms.measurement.internal.x r6 = r12.f15374c
            r8 = 0
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.mo17219a(r1)
            throw r3
        L_0x00fb:
            r3 = move-exception
            r2 = r0
            r10 = r2
        L_0x00fe:
            r7 = r1
        L_0x00ff:
            r8 = r3
        L_0x0100:
            if (r0 == 0) goto L_0x011c
            r0.close()     // Catch:{ IOException -> 0x0106 }
            goto L_0x011c
        L_0x0106:
            r0 = move-exception
            com.google.android.gms.measurement.internal.v r1 = r12.f15377f
            com.google.android.gms.measurement.internal.r r1 = r1.mo17158r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo17761y_()
            java.lang.String r3 = "Error closing HTTP compressed POST connection output stream. appId"
            java.lang.String r4 = r12.f15375d
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4893r.m21360a(r4)
            r1.mo17765a(r3, r4, r0)
        L_0x011c:
            if (r2 == 0) goto L_0x0121
            r2.disconnect()
        L_0x0121:
            com.google.android.gms.measurement.internal.v r0 = r12.f15377f
            com.google.android.gms.measurement.internal.ar r0 = r0.mo17157q()
            com.google.android.gms.measurement.internal.y r1 = new com.google.android.gms.measurement.internal.y
            java.lang.String r5 = r12.f15375d
            com.google.android.gms.measurement.internal.x r6 = r12.f15374c
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.mo17219a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4742aa.run():void");
    }
}
