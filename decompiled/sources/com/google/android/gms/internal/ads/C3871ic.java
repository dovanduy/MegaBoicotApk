package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.ic */
final class C3871ic implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f13243a = new AtomicInteger(1);

    C3871ic(C3867hz hzVar) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f13243a.getAndIncrement();
        StringBuilder sb = new StringBuilder(42);
        sb.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
