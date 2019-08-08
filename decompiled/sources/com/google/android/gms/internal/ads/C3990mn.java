package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableFuture;
import javax.annotation.Nullable;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.mn */
public abstract class C3990mn extends AbstractExecutorService implements C4013nj {
    /* renamed from: a */
    public final C4008ne<?> submit(Runnable runnable) throws RejectedExecutionException {
        return (C4008ne) super.submit(runnable);
    }

    /* renamed from: a */
    public final <T> C4008ne<T> submit(Callable<T> callable) throws RejectedExecutionException {
        return (C4008ne) super.submit(callable);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C4012ni(runnable, t);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new C4012ni(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, @Nullable Object obj) {
        return (C4008ne) super.submit(runnable, obj);
    }
}
