package com.google.android.gms.internal.ads;

final class azx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bah f12489a;

    /* renamed from: b */
    private final /* synthetic */ aze f12490b;

    /* renamed from: c */
    private final /* synthetic */ azq f12491c;

    azx(azq azq, bah bah, aze aze) {
        this.f12491c = azq;
        this.f12489a = bah;
        this.f12490b = aze;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.azq r0 = r3.f12491c
            java.lang.Object r0 = r0.f12464a
            monitor-enter(r0)
            com.google.android.gms.internal.ads.bah r1 = r3.f12489a     // Catch:{ all -> 0x0036 }
            int r1 = r1.mo15694b()     // Catch:{ all -> 0x0036 }
            r2 = -1
            if (r1 == r2) goto L_0x0034
            com.google.android.gms.internal.ads.bah r1 = r3.f12489a     // Catch:{ all -> 0x0036 }
            int r1 = r1.mo15694b()     // Catch:{ all -> 0x0036 }
            r2 = 1
            if (r1 != r2) goto L_0x001a
            goto L_0x0034
        L_0x001a:
            com.google.android.gms.internal.ads.bah r1 = r3.f12489a     // Catch:{ all -> 0x0036 }
            r1.mo15693a()     // Catch:{ all -> 0x0036 }
            java.util.concurrent.Executor r1 = com.google.android.gms.internal.ads.C4014nk.f13617a     // Catch:{ all -> 0x0036 }
            com.google.android.gms.internal.ads.aze r2 = r3.f12490b     // Catch:{ all -> 0x0036 }
            r2.getClass()     // Catch:{ all -> 0x0036 }
            java.lang.Runnable r2 = com.google.android.gms.internal.ads.azy.m15857a(r2)     // Catch:{ all -> 0x0036 }
            r1.execute(r2)     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.internal.ads.C3900je.m17043a(r1)     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return
        L_0x0036:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azx.run():void");
    }
}
