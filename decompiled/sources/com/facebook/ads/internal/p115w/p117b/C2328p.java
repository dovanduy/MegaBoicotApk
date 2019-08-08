package com.facebook.ads.internal.p115w.p117b;

import android.os.AsyncTask;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.w.b.p */
public class C2328p implements Executor {

    /* renamed from: a */
    public static final Executor f7322a = new C2328p("ASYNC_TASK", 32);

    /* renamed from: b */
    public static final Executor f7323b = new C2328p("DB", 0);

    /* renamed from: c */
    private ThreadPoolExecutor f7324c;

    /* renamed from: d */
    private Executor f7325d = AsyncTask.THREAD_POOL_EXECUTOR;

    /* renamed from: e */
    private final int f7326e;

    C2328p(final String str, int i) {
        this.f7326e = i;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(Math.max(2, Math.min(availableProcessors - 1, 4)), (availableProcessors * 2) + 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() {

            /* renamed from: c */
            private final AtomicInteger f7329c = new AtomicInteger(1);

            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, String.format(Locale.US, "FAN:%s #%d", new Object[]{str, Integer.valueOf(this.f7329c.getAndIncrement())}));
            }
        });
        this.f7324c = threadPoolExecutor;
        this.f7324c.allowCoreThreadTimeOut(true);
    }

    public void execute(Runnable runnable) {
        if (!(this.f7325d instanceof ThreadPoolExecutor) || ((ThreadPoolExecutor) this.f7325d).getQueue().size() >= this.f7326e) {
            this.f7324c.execute(runnable);
        } else {
            this.f7325d.execute(runnable);
        }
    }
}
