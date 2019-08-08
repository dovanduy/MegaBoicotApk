package com.facebook.ads.internal.p081h;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.facebook.ads.internal.h.c */
public class C1730c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f5413a = "c";

    /* renamed from: b */
    private static C1730c f5414b;

    /* renamed from: c */
    private final Future<C1732a> f5415c;

    /* renamed from: com.facebook.ads.internal.h.c$a */
    private static class C1732a {

        /* renamed from: a */
        private static final Map<String, File> f5418a = new HashMap();

        /* renamed from: b */
        private final Context f5419b;

        C1732a(Context context) {
            this.f5419b = context;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo7510a(String str) {
            File file = (File) f5418a.get(str);
            if (file == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("file://");
            sb.append(file.getPath());
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0084 A[SYNTHETIC, Splitter:B:31:0x0084] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0095 A[SYNTHETIC, Splitter:B:38:0x0095] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo7511b(java.lang.String r8) {
            /*
                r7 = this;
                r0 = 0
                android.content.Context r1 = r7.f5419b     // Catch:{ l | IOException -> 0x0077 }
                java.io.File r1 = com.facebook.ads.internal.p095v.p097b.C1908o.m7955a(r1)     // Catch:{ l | IOException -> 0x0077 }
                com.facebook.ads.internal.v.b.a.f r2 = new com.facebook.ads.internal.v.b.a.f     // Catch:{ l | IOException -> 0x0077 }
                r2.<init>()     // Catch:{ l | IOException -> 0x0077 }
                java.lang.String r2 = r2.mo7917a(r8)     // Catch:{ l | IOException -> 0x0077 }
                java.io.File r3 = new java.io.File     // Catch:{ l | IOException -> 0x0077 }
                r3.<init>(r1, r2)     // Catch:{ l | IOException -> 0x0077 }
                com.facebook.ads.internal.v.b.a.b r1 = new com.facebook.ads.internal.v.b.a.b     // Catch:{ l | IOException -> 0x0077 }
                com.facebook.ads.internal.v.b.a.g r2 = new com.facebook.ads.internal.v.b.a.g     // Catch:{ l | IOException -> 0x0077 }
                r4 = 67108864(0x4000000, double:3.31561842E-316)
                r2.<init>(r4)     // Catch:{ l | IOException -> 0x0077 }
                r1.<init>(r3, r2)     // Catch:{ l | IOException -> 0x0077 }
                boolean r2 = r1.mo7915d()     // Catch:{ l | IOException -> 0x0077 }
                r4 = 1
                if (r2 == 0) goto L_0x0032
                java.util.Map<java.lang.String, java.io.File> r2 = f5418a     // Catch:{ l | IOException -> 0x0077 }
                r2.put(r8, r3)     // Catch:{ l | IOException -> 0x0077 }
                r1.mo7913b()     // Catch:{ l | IOException -> 0x0077 }
                return r4
            L_0x0032:
                java.net.URL r2 = new java.net.URL     // Catch:{ l | IOException -> 0x0077 }
                r2.<init>(r8)     // Catch:{ l | IOException -> 0x0077 }
                java.net.URLConnection r2 = r2.openConnection()     // Catch:{ l | IOException -> 0x0077 }
                r2.connect()     // Catch:{ l | IOException -> 0x0077 }
                java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ l | IOException -> 0x0077 }
                java.io.InputStream r2 = r2.getInputStream()     // Catch:{ l | IOException -> 0x0077 }
                r5.<init>(r2)     // Catch:{ l | IOException -> 0x0077 }
                r0 = 8192(0x2000, float:1.14794E-41)
                byte[] r0 = new byte[r0]     // Catch:{ l | IOException -> 0x0072, all -> 0x006f }
            L_0x004b:
                int r2 = r5.read(r0)     // Catch:{ l | IOException -> 0x0072, all -> 0x006f }
                r6 = -1
                if (r2 == r6) goto L_0x0056
                r1.mo7912a(r0, r2)     // Catch:{ l | IOException -> 0x0072, all -> 0x006f }
                goto L_0x004b
            L_0x0056:
                r1.mo7914c()     // Catch:{ l | IOException -> 0x0072, all -> 0x006f }
                java.util.Map<java.lang.String, java.io.File> r0 = f5418a     // Catch:{ l | IOException -> 0x0072, all -> 0x006f }
                r0.put(r8, r3)     // Catch:{ l | IOException -> 0x0072, all -> 0x006f }
                if (r5 == 0) goto L_0x006e
                r5.close()     // Catch:{ IOException -> 0x0064 }
                return r4
            L_0x0064:
                r8 = move-exception
                java.lang.String r0 = com.facebook.ads.internal.p081h.C1730c.f5413a
                java.lang.String r1 = "Error closing the file"
                android.util.Log.e(r0, r1, r8)
            L_0x006e:
                return r4
            L_0x006f:
                r8 = move-exception
                r0 = r5
                goto L_0x0093
            L_0x0072:
                r8 = move-exception
                r0 = r5
                goto L_0x0078
            L_0x0075:
                r8 = move-exception
                goto L_0x0093
            L_0x0077:
                r8 = move-exception
            L_0x0078:
                java.lang.String r1 = com.facebook.ads.internal.p081h.C1730c.f5413a     // Catch:{ all -> 0x0075 }
                java.lang.String r2 = "Error caching the file"
                android.util.Log.e(r1, r2, r8)     // Catch:{ all -> 0x0075 }
                r8 = 0
                if (r0 == 0) goto L_0x0092
                r0.close()     // Catch:{ IOException -> 0x0088 }
                return r8
            L_0x0088:
                r0 = move-exception
                java.lang.String r1 = com.facebook.ads.internal.p081h.C1730c.f5413a
                java.lang.String r2 = "Error closing the file"
                android.util.Log.e(r1, r2, r0)
            L_0x0092:
                return r8
            L_0x0093:
                if (r0 == 0) goto L_0x00a3
                r0.close()     // Catch:{ IOException -> 0x0099 }
                goto L_0x00a3
            L_0x0099:
                r0 = move-exception
                java.lang.String r1 = com.facebook.ads.internal.p081h.C1730c.f5413a
                java.lang.String r2 = "Error closing the file"
                android.util.Log.e(r1, r2, r0)
            L_0x00a3:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p081h.C1730c.C1732a.mo7511b(java.lang.String):boolean");
        }
    }

    private C1730c(final Context context) {
        this.f5415c = Executors.newSingleThreadExecutor().submit(new Callable<C1732a>() {
            /* renamed from: a */
            public C1732a call() {
                return new C1732a(context);
            }
        });
    }

    /* renamed from: a */
    public static C1730c m7193a(Context context) {
        if (f5414b == null) {
            synchronized (C1734e.class) {
                if (f5414b == null) {
                    f5414b = new C1730c(context.getApplicationContext());
                }
            }
        }
        return f5414b;
    }

    /* renamed from: b */
    private C1732a m7195b() {
        try {
            return (C1732a) this.f5415c.get(500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e(f5413a, "Timed out waiting for cache server.", e);
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo7506a(String str) {
        C1732a b = m7195b();
        return b != null && b.mo7511b(str);
    }

    /* renamed from: b */
    public String mo7507b(String str) {
        C1732a b = m7195b();
        if (b == null) {
            return null;
        }
        return b.mo7510a(str);
    }
}
