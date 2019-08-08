package com.google.android.gms.p143d;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.d.o */
final class C3594o<TResult> implements C3602w<TResult> {

    /* renamed from: a */
    private final Executor f10221a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f10222b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C3578b f10223c;

    public C3594o(Executor executor, C3578b bVar) {
        this.f10221a = executor;
        this.f10223c = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1.f10221a.execute(new com.google.android.gms.p143d.C3595p(r1));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13728a(com.google.android.gms.p143d.C3583g r2) {
        /*
            r1 = this;
            boolean r2 = r2.mo13717c()
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r1.f10222b
            monitor-enter(r2)
            com.google.android.gms.d.b r0 = r1.f10223c     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r2 = r1.f10221a
            com.google.android.gms.d.p r0 = new com.google.android.gms.d.p
            r0.<init>(r1)
            r2.execute(r0)
            goto L_0x001e
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            throw r0
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.p143d.C3594o.mo13728a(com.google.android.gms.d.g):void");
    }
}
