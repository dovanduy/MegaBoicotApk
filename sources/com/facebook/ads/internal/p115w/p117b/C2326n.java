package com.facebook.ads.internal.p115w.p117b;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.facebook.ads.internal.w.b.n */
public class C2326n implements ThreadFactory {

    /* renamed from: a */
    protected final AtomicLong f7316a = new AtomicLong();

    /* renamed from: b */
    private int f7317b = Thread.currentThread().getPriority();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo8727a() {
        return String.format(Locale.US, "com.facebook.ads thread-%d %tF %<tT", new Object[]{Long.valueOf(this.f7316a.incrementAndGet()), Long.valueOf(System.currentTimeMillis())});
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(null, runnable, mo8727a(), 0);
        thread.setPriority(this.f7317b);
        return thread;
    }
}
