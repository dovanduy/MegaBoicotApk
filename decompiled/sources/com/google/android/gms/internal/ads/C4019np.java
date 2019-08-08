package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C3025aw;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.np */
public class C4019np<T> implements C4008ne<T> {

    /* renamed from: a */
    private final Object f13624a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private T f13625b;
    @GuardedBy("mLock")

    /* renamed from: c */
    private Throwable f13626c;
    @GuardedBy("mLock")

    /* renamed from: d */
    private boolean f13627d;
    @GuardedBy("mLock")

    /* renamed from: e */
    private boolean f13628e;

    /* renamed from: f */
    private final C4010ng f13629f = new C4010ng();

    @GuardedBy("mLock")
    /* renamed from: a */
    private final boolean mo15684a() {
        return this.f13626c != null || this.f13627d;
    }

    /* renamed from: a */
    public final void mo15658a(Runnable runnable, Executor executor) {
        this.f13629f.mo15673a(runnable, executor);
    }

    /* renamed from: a */
    public final void mo15685a(Throwable th) {
        synchronized (this.f13624a) {
            if (!this.f13628e) {
                if (mo15684a()) {
                    C3025aw.m10921i().mo15439b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
                    return;
                }
                this.f13626c = th;
                this.f13624a.notifyAll();
                this.f13629f.mo15672a();
            }
        }
    }

    /* renamed from: b */
    public final void mo15686b(T t) {
        synchronized (this.f13624a) {
            if (!this.f13628e) {
                if (mo15684a()) {
                    C3025aw.m10921i().mo15439b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
                    return;
                }
                this.f13627d = true;
                this.f13625b = t;
                this.f13624a.notifyAll();
                this.f13629f.mo15672a();
            }
        }
    }

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.f13624a) {
            if (mo15684a()) {
                return false;
            }
            this.f13628e = true;
            this.f13627d = true;
            this.f13624a.notifyAll();
            this.f13629f.mo15672a();
            return true;
        }
    }

    public T get() throws CancellationException, ExecutionException, InterruptedException {
        T t;
        synchronized (this.f13624a) {
            if (!mo15684a()) {
                try {
                    this.f13624a.wait();
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f13626c != null) {
                throw new ExecutionException(this.f13626c);
            } else if (this.f13628e) {
                throw new CancellationException("SettableFuture was cancelled.");
            } else {
                t = this.f13625b;
            }
        }
        return t;
    }

    public T get(long j, TimeUnit timeUnit) throws CancellationException, ExecutionException, InterruptedException, TimeoutException {
        T t;
        synchronized (this.f13624a) {
            if (!mo15684a()) {
                try {
                    long millis = timeUnit.toMillis(j);
                    if (millis != 0) {
                        this.f13624a.wait(millis);
                    }
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f13626c != null) {
                throw new ExecutionException(this.f13626c);
            } else if (!this.f13627d) {
                throw new TimeoutException("SettableFuture timed out.");
            } else if (this.f13628e) {
                throw new CancellationException("SettableFuture was cancelled.");
            } else {
                t = this.f13625b;
            }
        }
        return t;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.f13624a) {
            z = this.f13628e;
        }
        return z;
    }

    public boolean isDone() {
        boolean a;
        synchronized (this.f13624a) {
            a = mo15684a();
        }
        return a;
    }
}
