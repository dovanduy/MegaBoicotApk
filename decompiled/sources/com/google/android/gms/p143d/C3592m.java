package com.google.android.gms.p143d;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.d.m */
final class C3592m<TResult, TContinuationResult> implements C3578b, C3580d, C3581e<TContinuationResult>, C3602w<TResult> {

    /* renamed from: a */
    private final Executor f10216a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3576a<TResult, C3583g<TContinuationResult>> f10217b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3605z<TContinuationResult> f10218c;

    public C3592m(Executor executor, C3576a<TResult, C3583g<TContinuationResult>> aVar, C3605z<TContinuationResult> zVar) {
        this.f10216a = executor;
        this.f10217b = aVar;
        this.f10218c = zVar;
    }

    /* renamed from: a */
    public final void mo13728a(C3583g<TResult> gVar) {
        this.f10216a.execute(new C3593n(this, gVar));
    }

    /* renamed from: a */
    public final void mo13707a(TContinuationResult tcontinuationresult) {
        this.f10218c.mo13739a(tcontinuationresult);
    }

    /* renamed from: a */
    public final void mo13706a(Exception exc) {
        this.f10218c.mo13738a(exc);
    }

    /* renamed from: a */
    public final void mo13705a() {
        this.f10218c.mo13742f();
    }
}
