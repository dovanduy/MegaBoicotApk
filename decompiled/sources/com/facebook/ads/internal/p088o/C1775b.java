package com.facebook.ads.internal.p088o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.o.b */
public class C1775b {

    /* renamed from: a */
    private static final List<C1774a> f5574a = new ArrayList();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r0 = new org.json.JSONArray();
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r1.hasNext() == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r0.put(((com.facebook.ads.internal.p088o.C1774a) r1.next()).mo7624a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        return r0.toString();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m7364a() {
        /*
            java.util.List<com.facebook.ads.internal.o.a> r0 = f5574a
            monitor-enter(r0)
            java.util.List<com.facebook.ads.internal.o.a> r1 = f5574a     // Catch:{ all -> 0x003e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x000f
            java.lang.String r1 = ""
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            return r1
        L_0x000f:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x003e }
            java.util.List<com.facebook.ads.internal.o.a> r2 = f5574a     // Catch:{ all -> 0x003e }
            r1.<init>(r2)     // Catch:{ all -> 0x003e }
            java.util.List<com.facebook.ads.internal.o.a> r2 = f5574a     // Catch:{ all -> 0x003e }
            r2.clear()     // Catch:{ all -> 0x003e }
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0025:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r1.next()
            com.facebook.ads.internal.o.a r2 = (com.facebook.ads.internal.p088o.C1774a) r2
            org.json.JSONObject r2 = r2.mo7624a()
            r0.put(r2)
            goto L_0x0025
        L_0x0039:
            java.lang.String r0 = r0.toString()
            return r0
        L_0x003e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p088o.C1775b.m7364a():java.lang.String");
    }

    /* renamed from: a */
    public static void m7365a(C1774a aVar) {
        synchronized (f5574a) {
            f5574a.add(aVar);
        }
    }
}
