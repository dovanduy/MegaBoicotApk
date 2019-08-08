package com.google.android.gms.internal.p148e;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.e.ad */
public class C4436ad {

    /* renamed from: a */
    public static final Uri f14639a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Pattern f14640b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: c */
    public static final Pattern f14641c = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: d */
    private static final Uri f14642d = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final AtomicBoolean f14643e = new AtomicBoolean();

    /* renamed from: f */
    private static HashMap<String, String> f14644f;

    /* renamed from: g */
    private static final HashMap<String, Boolean> f14645g = new HashMap<>();

    /* renamed from: h */
    private static final HashMap<String, Integer> f14646h = new HashMap<>();

    /* renamed from: i */
    private static final HashMap<String, Long> f14647i = new HashMap<>();

    /* renamed from: j */
    private static final HashMap<String, Float> f14648j = new HashMap<>();

    /* renamed from: k */
    private static Object f14649k;

    /* renamed from: l */
    private static boolean f14650l;

    /* renamed from: m */
    private static String[] f14651m = new String[0];

    /* renamed from: a */
    private static void m18874a(ContentResolver contentResolver) {
        if (f14644f == null) {
            f14643e.set(false);
            f14644f = new HashMap<>();
            f14649k = new Object();
            f14650l = false;
            contentResolver.registerContentObserver(f14639a, true, new C4437ae(null));
            return;
        }
        if (f14643e.getAndSet(false)) {
            f14644f.clear();
            f14645g.clear();
            f14646h.clear();
            f14647i.clear();
            f14648j.clear();
            f14649k = new Object();
            f14650l = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        r13 = r13.query(f14639a, null, null, new java.lang.String[]{r14}, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        if (r13 != null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0074, code lost:
        if (r13 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0076, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007e, code lost:
        if (r13.moveToFirst() != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0080, code lost:
        m18875a(r0, r14, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r15 = r13.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r15 == null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0093, code lost:
        if (r15.equals(null) == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0095, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0096, code lost:
        m18875a(r0, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0099, code lost:
        if (r15 == null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009c, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009d, code lost:
        if (r13 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009f, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a2, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a3, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a4, code lost:
        if (r13 != null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a6, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a9, code lost:
        throw r14;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m18871a(android.content.ContentResolver r13, java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.Class<com.google.android.gms.internal.e.ad> r15 = com.google.android.gms.internal.p148e.C4436ad.class
            monitor-enter(r15)
            m18874a(r13)     // Catch:{ all -> 0x00aa }
            java.lang.Object r0 = f14649k     // Catch:{ all -> 0x00aa }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f14644f     // Catch:{ all -> 0x00aa }
            boolean r1 = r1.containsKey(r14)     // Catch:{ all -> 0x00aa }
            r2 = 0
            if (r1 == 0) goto L_0x001f
            java.util.HashMap<java.lang.String, java.lang.String> r13 = f14644f     // Catch:{ all -> 0x00aa }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00aa }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00aa }
            if (r13 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r13 = r2
        L_0x001d:
            monitor-exit(r15)     // Catch:{ all -> 0x00aa }
            return r13
        L_0x001f:
            java.lang.String[] r1 = f14651m     // Catch:{ all -> 0x00aa }
            int r3 = r1.length     // Catch:{ all -> 0x00aa }
            r4 = 0
            r5 = r4
        L_0x0024:
            r6 = 1
            if (r5 >= r3) goto L_0x0063
            r7 = r1[r5]     // Catch:{ all -> 0x00aa }
            boolean r7 = r14.startsWith(r7)     // Catch:{ all -> 0x00aa }
            if (r7 == 0) goto L_0x0060
            boolean r0 = f14650l     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x003b
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f14644f     // Catch:{ all -> 0x00aa }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x005e
        L_0x003b:
            java.lang.String[] r0 = f14651m     // Catch:{ all -> 0x00aa }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f14644f     // Catch:{ all -> 0x00aa }
            java.util.Map r13 = m18872a(r13, r0)     // Catch:{ all -> 0x00aa }
            r1.putAll(r13)     // Catch:{ all -> 0x00aa }
            f14650l = r6     // Catch:{ all -> 0x00aa }
            java.util.HashMap<java.lang.String, java.lang.String> r13 = f14644f     // Catch:{ all -> 0x00aa }
            boolean r13 = r13.containsKey(r14)     // Catch:{ all -> 0x00aa }
            if (r13 == 0) goto L_0x005e
            java.util.HashMap<java.lang.String, java.lang.String> r13 = f14644f     // Catch:{ all -> 0x00aa }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00aa }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00aa }
            if (r13 == 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r13 = r2
        L_0x005c:
            monitor-exit(r15)     // Catch:{ all -> 0x00aa }
            return r13
        L_0x005e:
            monitor-exit(r15)     // Catch:{ all -> 0x00aa }
            return r2
        L_0x0060:
            int r5 = r5 + 1
            goto L_0x0024
        L_0x0063:
            monitor-exit(r15)     // Catch:{ all -> 0x00aa }
            android.net.Uri r8 = f14639a
            r9 = 0
            r10 = 0
            java.lang.String[] r11 = new java.lang.String[r6]
            r11[r4] = r14
            r12 = 0
            r7 = r13
            android.database.Cursor r13 = r7.query(r8, r9, r10, r11, r12)
            if (r13 != 0) goto L_0x007a
            if (r13 == 0) goto L_0x0079
            r13.close()
        L_0x0079:
            return r2
        L_0x007a:
            boolean r15 = r13.moveToFirst()     // Catch:{ all -> 0x00a3 }
            if (r15 != 0) goto L_0x0089
            m18875a(r0, r14, r2)     // Catch:{ all -> 0x00a3 }
            if (r13 == 0) goto L_0x0088
            r13.close()
        L_0x0088:
            return r2
        L_0x0089:
            java.lang.String r15 = r13.getString(r6)     // Catch:{ all -> 0x00a3 }
            if (r15 == 0) goto L_0x0096
            boolean r1 = r15.equals(r2)     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x0096
            r15 = r2
        L_0x0096:
            m18875a(r0, r14, r15)     // Catch:{ all -> 0x00a3 }
            if (r15 == 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r15 = r2
        L_0x009d:
            if (r13 == 0) goto L_0x00a2
            r13.close()
        L_0x00a2:
            return r15
        L_0x00a3:
            r14 = move-exception
            if (r13 == 0) goto L_0x00a9
            r13.close()
        L_0x00a9:
            throw r14
        L_0x00aa:
            r13 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00aa }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p148e.C4436ad.m18871a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static void m18875a(Object obj, String str, String str2) {
        synchronized (C4436ad.class) {
            if (obj == f14649k) {
                f14644f.put(str, str2);
            }
        }
    }

    /* renamed from: a */
    private static Map<String, String> m18872a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f14642d, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }
}
