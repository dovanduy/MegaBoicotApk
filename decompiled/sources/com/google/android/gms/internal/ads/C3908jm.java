package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.jm */
final class C3908jm implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f13409a = new AtomicInteger(1);

    /* renamed from: b */
    private final /* synthetic */ String f13410b;

    C3908jm(String str) {
        this.f13410b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f13410b;
        int andIncrement = this.f13409a.getAndIncrement();
        StringBuilder sb = new StringBuilder(23 + String.valueOf(str).length());
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
