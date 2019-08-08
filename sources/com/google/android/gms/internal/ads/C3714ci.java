package com.google.android.gms.internal.ads;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.google.android.gms.internal.ads.ci */
final class C3714ci implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final /* synthetic */ UncaughtExceptionHandler f12801a;

    /* renamed from: b */
    private final /* synthetic */ C3712cg f12802b;

    C3714ci(C3712cg cgVar, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f12802b = cgVar;
        this.f12801a = uncaughtExceptionHandler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        if (r2.f12801a == null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r2.f12801a != null) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r2.f12801a.uncaughtException(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            com.google.android.gms.internal.ads.cg r0 = r2.f12802b     // Catch:{ Throwable -> 0x0011 }
            r0.mo15220a(r3, r4)     // Catch:{ Throwable -> 0x0011 }
            java.lang.Thread$UncaughtExceptionHandler r0 = r2.f12801a
            if (r0 == 0) goto L_0x001b
        L_0x0009:
            java.lang.Thread$UncaughtExceptionHandler r0 = r2.f12801a
            r0.uncaughtException(r3, r4)
            return
        L_0x000f:
            r0 = move-exception
            goto L_0x001c
        L_0x0011:
            java.lang.String r0 = "AdMob exception reporter failed reporting the exception."
            com.google.android.gms.internal.ads.C3987mk.m17431c(r0)     // Catch:{ all -> 0x000f }
            java.lang.Thread$UncaughtExceptionHandler r0 = r2.f12801a
            if (r0 == 0) goto L_0x001b
            goto L_0x0009
        L_0x001b:
            return
        L_0x001c:
            java.lang.Thread$UncaughtExceptionHandler r1 = r2.f12801a
            if (r1 == 0) goto L_0x0025
            java.lang.Thread$UncaughtExceptionHandler r1 = r2.f12801a
            r1.uncaughtException(r3, r4)
        L_0x0025:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3714ci.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
