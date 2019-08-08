package com.startapp.common;

import android.os.Build.VERSION;
import com.startapp.common.p193a.C5518g;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.startapp.common.g */
/* compiled from: StartAppSDK */
public final class C5554g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f17631a = "g";

    /* renamed from: b */
    private static final int f17632b = (VERSION.SDK_INT < 22 ? 10 : 20);

    /* renamed from: c */
    private static final int f17633c = (VERSION.SDK_INT < 22 ? 4 : 8);

    /* renamed from: d */
    private static final ThreadFactory f17634d = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f17640a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("highPriorityThreadFactory #");
            sb.append(this.f17640a.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    };

    /* renamed from: e */
    private static final ThreadFactory f17635e = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f17641a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("defaultPriorityThreadFactory #");
            sb.append(this.f17641a.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    };

    /* renamed from: f */
    private static final RejectedExecutionHandler f17636f = new RejectedExecutionHandler() {
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            String a = C5554g.f17631a;
            StringBuilder sb = new StringBuilder();
            sb.append("ThreadPoolExecutor rejected execution! ");
            sb.append(threadPoolExecutor);
            C5518g.m23563a(a, 6, sb.toString());
        }
    };

    /* renamed from: g */
    private static final Executor f17637g;

    /* renamed from: h */
    private static final Executor f17638h;

    /* renamed from: i */
    private static final ScheduledExecutorService f17639i = new ScheduledThreadPoolExecutor(1);

    /* renamed from: com.startapp.common.g$a */
    /* compiled from: StartAppSDK */
    public enum C5558a {
        DEFAULT,
        HIGH
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f17632b, f17632b, 20, TimeUnit.SECONDS, new LinkedBlockingQueue(), f17634d, f17636f);
        f17637g = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(f17633c, f17633c, 20, TimeUnit.SECONDS, new LinkedBlockingQueue(), f17635e, f17636f);
        f17638h = threadPoolExecutor2;
    }

    /* renamed from: a */
    public static ScheduledFuture<?> m23701a(Runnable runnable, long j) {
        return f17639i.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public static void m23702a(C5558a aVar, Runnable runnable) {
        Executor executor;
        try {
            if (aVar.equals(C5558a.HIGH)) {
                executor = f17637g;
            } else {
                executor = f17638h;
            }
            executor.execute(runnable);
        } catch (Exception unused) {
            String str = f17631a;
            StringBuilder sb = new StringBuilder();
            sb.append("executeWithPriority failed to execute! ");
            sb.append(null);
            C5518g.m23563a(str, 6, sb.toString());
        }
    }
}
