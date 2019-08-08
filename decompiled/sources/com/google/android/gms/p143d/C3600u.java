package com.google.android.gms.p143d;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.d.u */
final class C3600u<TResult> implements C3602w<TResult> {

    /* renamed from: a */
    private final Executor f10235a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f10236b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C3581e<? super TResult> f10237c;

    public C3600u(Executor executor, C3581e<? super TResult> eVar) {
        this.f10235a = executor;
        this.f10237c = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2.f10235a.execute(new com.google.android.gms.p143d.C3601v(r2, r3));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13728a(com.google.android.gms.p143d.C3583g<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo13716b()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r2.f10236b
            monitor-enter(r0)
            com.google.android.gms.d.e<? super TResult> r1 = r2.f10237c     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r0 = r2.f10235a
            com.google.android.gms.d.v r1 = new com.google.android.gms.d.v
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x001e
        L_0x001b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.p143d.C3600u.mo13728a(com.google.android.gms.d.g):void");
    }
}
