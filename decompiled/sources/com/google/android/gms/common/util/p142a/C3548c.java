package com.google.android.gms.common.util.p142a;

import com.google.android.gms.common.internal.C3513t;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.util.a.c */
public class C3548c implements ThreadFactory {

    /* renamed from: a */
    private final String f10171a;

    /* renamed from: b */
    private final int f10172b;

    /* renamed from: c */
    private final AtomicInteger f10173c;

    /* renamed from: d */
    private final ThreadFactory f10174d;

    public C3548c(String str) {
        this(str, 0);
    }

    private C3548c(String str, int i) {
        this.f10173c = new AtomicInteger();
        this.f10174d = Executors.defaultThreadFactory();
        this.f10171a = (String) C3513t.m12626a(str, (Object) "Name must not be null");
        this.f10172b = 0;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f10174d.newThread(new C3549d(runnable, 0));
        String str = this.f10171a;
        int andIncrement = this.f10173c.getAndIncrement();
        StringBuilder sb = new StringBuilder(13 + String.valueOf(str).length());
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
