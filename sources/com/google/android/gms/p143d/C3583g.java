package com.google.android.gms.p143d;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.d.g */
public abstract class C3583g<TResult> {
    /* renamed from: a */
    public abstract C3583g<TResult> mo13711a(Executor executor, C3580d dVar);

    /* renamed from: a */
    public abstract C3583g<TResult> mo13712a(Executor executor, C3581e<? super TResult> eVar);

    /* renamed from: a */
    public abstract <X extends Throwable> TResult mo13713a(Class<X> cls) throws Throwable;

    /* renamed from: a */
    public abstract boolean mo13714a();

    /* renamed from: b */
    public abstract boolean mo13716b();

    /* renamed from: c */
    public abstract boolean mo13717c();

    /* renamed from: d */
    public abstract TResult mo13718d();

    /* renamed from: e */
    public abstract Exception mo13719e();

    /* renamed from: a */
    public C3583g<TResult> mo13710a(Executor executor, C3579c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: a */
    public C3583g<TResult> mo13709a(Executor executor, C3578b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: a */
    public <TContinuationResult> C3583g<TContinuationResult> mo13708a(Executor executor, C3576a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: b */
    public <TContinuationResult> C3583g<TContinuationResult> mo13715b(Executor executor, C3576a<TResult, C3583g<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }
}
