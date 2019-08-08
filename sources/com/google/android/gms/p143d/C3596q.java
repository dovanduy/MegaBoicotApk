package com.google.android.gms.p143d;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.d.q */
final class C3596q<TResult> implements C3602w<TResult> {

    /* renamed from: a */
    private final Executor f10225a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f10226b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C3579c<TResult> f10227c;

    public C3596q(Executor executor, C3579c<TResult> cVar) {
        this.f10225a = executor;
        this.f10227c = cVar;
    }

    /* renamed from: a */
    public final void mo13728a(C3583g<TResult> gVar) {
        synchronized (this.f10226b) {
            if (this.f10227c != null) {
                this.f10225a.execute(new C3597r(this, gVar));
            }
        }
    }
}
