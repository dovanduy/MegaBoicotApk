package com.google.android.gms.p143d;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.d.s */
final class C3598s<TResult> implements C3602w<TResult> {

    /* renamed from: a */
    private final Executor f10230a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f10231b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C3580d f10232c;

    public C3598s(Executor executor, C3580d dVar) {
        this.f10230a = executor;
        this.f10232c = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        r2.f10230a.execute(new com.google.android.gms.p143d.C3599t(r2, r3));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13728a(com.google.android.gms.p143d.C3583g<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo13716b()
            if (r0 != 0) goto L_0x0024
            boolean r0 = r3.mo13717c()
            if (r0 != 0) goto L_0x0024
            java.lang.Object r0 = r2.f10231b
            monitor-enter(r0)
            com.google.android.gms.d.d r1 = r2.f10232c     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            java.util.concurrent.Executor r0 = r2.f10230a
            com.google.android.gms.d.t r1 = new com.google.android.gms.d.t
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x0024
        L_0x0021:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r3
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.p143d.C3598s.mo13728a(com.google.android.gms.d.g):void");
    }
}
