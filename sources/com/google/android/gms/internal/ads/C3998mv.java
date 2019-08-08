package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mv */
final /* synthetic */ class C3998mv implements Runnable {

    /* renamed from: a */
    private final C4019np f13586a;

    /* renamed from: b */
    private final C3992mp f13587b;

    /* renamed from: c */
    private final C4008ne f13588c;

    C3998mv(C4019np npVar, C3992mp mpVar, C4008ne neVar) {
        this.f13586a = npVar;
        this.f13587b = mpVar;
        this.f13588c = neVar;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.np r0 = r3.f13586a
            com.google.android.gms.internal.ads.mp r1 = r3.f13587b
            com.google.android.gms.internal.ads.ne r2 = r3.f13588c
            java.lang.Object r2 = r2.get()     // Catch:{ CancellationException -> 0x0030, ExecutionException -> 0x0023, InterruptedException -> 0x0017, Exception -> 0x0012 }
            java.lang.Object r1 = r1.mo15190a(r2)     // Catch:{ CancellationException -> 0x0030, ExecutionException -> 0x0023, InterruptedException -> 0x0017, Exception -> 0x0012 }
            r0.mo15686b(r1)     // Catch:{ CancellationException -> 0x0030, ExecutionException -> 0x0023, InterruptedException -> 0x0017, Exception -> 0x0012 }
            return
        L_0x0012:
            r1 = move-exception
            r0.mo15685a(r1)
            return
        L_0x0017:
            r1 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            r0.mo15685a(r1)
            return
        L_0x0023:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()
            if (r2 != 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            r0.mo15685a(r1)
            return
        L_0x0030:
            r1 = 1
            r0.cancel(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3998mv.run():void");
    }
}
