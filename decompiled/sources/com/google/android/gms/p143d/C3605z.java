package com.google.android.gms.p143d;

import com.google.android.gms.common.internal.C3513t;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.d.z */
final class C3605z<TResult> extends C3583g<TResult> {

    /* renamed from: a */
    private final Object f10243a = new Object();

    /* renamed from: b */
    private final C3603x<TResult> f10244b = new C3603x<>();
    @GuardedBy("mLock")

    /* renamed from: c */
    private boolean f10245c;

    /* renamed from: d */
    private volatile boolean f10246d;
    @GuardedBy("mLock")

    /* renamed from: e */
    private TResult f10247e;
    @GuardedBy("mLock")

    /* renamed from: f */
    private Exception f10248f;

    C3605z() {
    }

    /* renamed from: a */
    public final boolean mo13714a() {
        boolean z;
        synchronized (this.f10243a) {
            z = this.f10245c;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo13717c() {
        return this.f10246d;
    }

    /* renamed from: b */
    public final boolean mo13716b() {
        boolean z;
        synchronized (this.f10243a) {
            z = this.f10245c && !this.f10246d && this.f10248f == null;
        }
        return z;
    }

    /* renamed from: d */
    public final TResult mo13718d() {
        TResult tresult;
        synchronized (this.f10243a) {
            m12851g();
            m12853i();
            if (this.f10248f != null) {
                throw new C3582f(this.f10248f);
            }
            tresult = this.f10247e;
        }
        return tresult;
    }

    /* renamed from: a */
    public final <X extends Throwable> TResult mo13713a(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f10243a) {
            m12851g();
            m12853i();
            if (cls.isInstance(this.f10248f)) {
                throw ((Throwable) cls.cast(this.f10248f));
            } else if (this.f10248f != null) {
                throw new C3582f(this.f10248f);
            } else {
                tresult = this.f10247e;
            }
        }
        return tresult;
    }

    /* renamed from: e */
    public final Exception mo13719e() {
        Exception exc;
        synchronized (this.f10243a) {
            exc = this.f10248f;
        }
        return exc;
    }

    /* renamed from: a */
    public final C3583g<TResult> mo13712a(Executor executor, C3581e<? super TResult> eVar) {
        this.f10244b.mo13736a((C3602w<TResult>) new C3600u<TResult>(executor, eVar));
        m12854j();
        return this;
    }

    /* renamed from: a */
    public final C3583g<TResult> mo13711a(Executor executor, C3580d dVar) {
        this.f10244b.mo13736a((C3602w<TResult>) new C3598s<TResult>(executor, dVar));
        m12854j();
        return this;
    }

    /* renamed from: a */
    public final C3583g<TResult> mo13710a(Executor executor, C3579c<TResult> cVar) {
        this.f10244b.mo13736a((C3602w<TResult>) new C3596q<TResult>(executor, cVar));
        m12854j();
        return this;
    }

    /* renamed from: a */
    public final <TContinuationResult> C3583g<TContinuationResult> mo13708a(Executor executor, C3576a<TResult, TContinuationResult> aVar) {
        C3605z zVar = new C3605z();
        this.f10244b.mo13736a((C3602w<TResult>) new C3590k<TResult>(executor, aVar, zVar));
        m12854j();
        return zVar;
    }

    /* renamed from: a */
    public final C3583g<TResult> mo13709a(Executor executor, C3578b bVar) {
        this.f10244b.mo13736a((C3602w<TResult>) new C3594o<TResult>(executor, bVar));
        m12854j();
        return this;
    }

    /* renamed from: b */
    public final <TContinuationResult> C3583g<TContinuationResult> mo13715b(Executor executor, C3576a<TResult, C3583g<TContinuationResult>> aVar) {
        C3605z zVar = new C3605z();
        this.f10244b.mo13736a((C3602w<TResult>) new C3592m<TResult>(executor, aVar, zVar));
        m12854j();
        return zVar;
    }

    /* renamed from: a */
    public final void mo13739a(TResult tresult) {
        synchronized (this.f10243a) {
            m12852h();
            this.f10245c = true;
            this.f10247e = tresult;
        }
        this.f10244b.mo13735a((C3583g<TResult>) this);
    }

    /* renamed from: b */
    public final boolean mo13741b(TResult tresult) {
        synchronized (this.f10243a) {
            if (this.f10245c) {
                return false;
            }
            this.f10245c = true;
            this.f10247e = tresult;
            this.f10244b.mo13735a((C3583g<TResult>) this);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo13738a(Exception exc) {
        C3513t.m12626a(exc, (Object) "Exception must not be null");
        synchronized (this.f10243a) {
            m12852h();
            this.f10245c = true;
            this.f10248f = exc;
        }
        this.f10244b.mo13735a((C3583g<TResult>) this);
    }

    /* renamed from: b */
    public final boolean mo13740b(Exception exc) {
        C3513t.m12626a(exc, (Object) "Exception must not be null");
        synchronized (this.f10243a) {
            if (this.f10245c) {
                return false;
            }
            this.f10245c = true;
            this.f10248f = exc;
            this.f10244b.mo13735a((C3583g<TResult>) this);
            return true;
        }
    }

    /* renamed from: f */
    public final boolean mo13742f() {
        synchronized (this.f10243a) {
            if (this.f10245c) {
                return false;
            }
            this.f10245c = true;
            this.f10246d = true;
            this.f10244b.mo13735a((C3583g<TResult>) this);
            return true;
        }
    }

    @GuardedBy("mLock")
    /* renamed from: g */
    private final void m12851g() {
        C3513t.m12632a(this.f10245c, (Object) "Task is not yet complete");
    }

    @GuardedBy("mLock")
    /* renamed from: h */
    private final void m12852h() {
        C3513t.m12632a(!this.f10245c, (Object) "Task is already complete");
    }

    @GuardedBy("mLock")
    /* renamed from: i */
    private final void m12853i() {
        if (this.f10246d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: j */
    private final void m12854j() {
        synchronized (this.f10243a) {
            if (this.f10245c) {
                this.f10244b.mo13735a((C3583g<TResult>) this);
            }
        }
    }
}
