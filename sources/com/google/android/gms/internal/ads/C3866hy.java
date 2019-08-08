package com.google.android.gms.internal.ads;

import android.content.Context;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.hy */
public final class C3866hy implements akk {

    /* renamed from: a */
    private final Context f13224a;

    /* renamed from: b */
    private final Object f13225b;

    /* renamed from: c */
    private String f13226c;

    /* renamed from: d */
    private boolean f13227d;

    public C3866hy(Context context, String str) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f13224a = context;
        this.f13226c = str;
        this.f13227d = false;
        this.f13225b = new Object();
    }

    /* renamed from: a */
    public final void mo14431a(akj akj) {
        mo15384a(akj.f11271a);
    }

    /* renamed from: a */
    public final void mo15383a(String str) {
        this.f13226c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15384a(boolean r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.hz r0 = com.google.android.gms.ads.internal.C3025aw.m10908B()
            android.content.Context r1 = r3.f13224a
            boolean r0 = r0.mo15388a(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r0 = r3.f13225b
            monitor-enter(r0)
            boolean r1 = r3.f13227d     // Catch:{ all -> 0x003f }
            if (r1 != r4) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0016:
            r3.f13227d = r4     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r3.f13226c     // Catch:{ all -> 0x003f }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0022:
            boolean r4 = r3.f13227d     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0032
            com.google.android.gms.internal.ads.hz r4 = com.google.android.gms.ads.internal.C3025aw.m10908B()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f13224a     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f13226c     // Catch:{ all -> 0x003f }
            r4.mo15385a(r1, r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0032:
            com.google.android.gms.internal.ads.hz r4 = com.google.android.gms.ads.internal.C3025aw.m10908B()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f13224a     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f13226c     // Catch:{ all -> 0x003f }
            r4.mo15389b(r1, r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3866hy.mo15384a(boolean):void");
    }
}
