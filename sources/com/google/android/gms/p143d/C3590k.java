package com.google.android.gms.p143d;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.d.k */
final class C3590k<TResult, TContinuationResult> implements C3602w<TResult> {

    /* renamed from: a */
    private final Executor f10211a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3576a<TResult, TContinuationResult> f10212b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3605z<TContinuationResult> f10213c;

    public C3590k(Executor executor, C3576a<TResult, TContinuationResult> aVar, C3605z<TContinuationResult> zVar) {
        this.f10211a = executor;
        this.f10212b = aVar;
        this.f10213c = zVar;
    }

    /* renamed from: a */
    public final void mo13728a(C3583g<TResult> gVar) {
        this.f10211a.execute(new C3591l(this, gVar));
    }
}
