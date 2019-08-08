package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.jl */
public final class C3907jl {

    /* renamed from: a */
    public static final C4013nj f13407a;

    /* renamed from: b */
    private static final C4013nj f13408b;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), m17120a("Default"));
        f13407a = C4014nk.m17475a(threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), m17120a("Loader"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        f13408b = C4014nk.m17475a(threadPoolExecutor2);
    }

    /* renamed from: a */
    public static C4008ne<?> m17118a(Runnable runnable) {
        return f13407a.mo15637a(runnable);
    }

    /* renamed from: a */
    public static <T> C4008ne<T> m17119a(Callable<T> callable) {
        return f13407a.mo15638a(callable);
    }

    /* renamed from: a */
    private static ThreadFactory m17120a(String str) {
        return new C3908jm(str);
    }

    /* renamed from: b */
    public static C4008ne<?> m17121b(Runnable runnable) {
        return f13408b.mo15637a(runnable);
    }
}
