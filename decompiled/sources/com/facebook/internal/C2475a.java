package com.facebook.internal;

import java.util.UUID;

/* renamed from: com.facebook.internal.a */
/* compiled from: AppCall */
public class C2475a {

    /* renamed from: a */
    private static C2475a f7792a;

    /* renamed from: b */
    private UUID f7793b;

    /* renamed from: c */
    private int f7794c;

    /* renamed from: a */
    public static C2475a m9405a() {
        return f7792a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.facebook.internal.C2475a m9406a(java.util.UUID r4, int r5) {
        /*
            java.lang.Class<com.facebook.internal.a> r0 = com.facebook.internal.C2475a.class
            monitor-enter(r0)
            com.facebook.internal.a r1 = m9405a()     // Catch:{ all -> 0x0022 }
            r2 = 0
            if (r1 == 0) goto L_0x0020
            java.util.UUID r3 = r1.mo8920b()     // Catch:{ all -> 0x0022 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0022 }
            if (r4 == 0) goto L_0x0020
            int r4 = r1.mo8921c()     // Catch:{ all -> 0x0022 }
            if (r4 == r5) goto L_0x001b
            goto L_0x0020
        L_0x001b:
            m9407a(r2)     // Catch:{ all -> 0x0022 }
            monitor-exit(r0)
            return r1
        L_0x0020:
            monitor-exit(r0)
            return r2
        L_0x0022:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2475a.m9406a(java.util.UUID, int):com.facebook.internal.a");
    }

    /* renamed from: a */
    private static synchronized boolean m9407a(C2475a aVar) {
        boolean z;
        synchronized (C2475a.class) {
            C2475a a = m9405a();
            f7792a = aVar;
            z = a != null;
        }
        return z;
    }

    /* renamed from: b */
    public UUID mo8920b() {
        return this.f7793b;
    }

    /* renamed from: c */
    public int mo8921c() {
        return this.f7794c;
    }
}
