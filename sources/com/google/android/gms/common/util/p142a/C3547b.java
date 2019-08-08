package com.google.android.gms.common.util.p142a;

import com.google.android.gms.common.internal.C3513t;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.common.util.a.b */
public class C3547b implements ThreadFactory {

    /* renamed from: a */
    private final String f10168a;

    /* renamed from: b */
    private final int f10169b;

    /* renamed from: c */
    private final ThreadFactory f10170c;

    public C3547b(String str) {
        this(str, 0);
    }

    private C3547b(String str, int i) {
        this.f10170c = Executors.defaultThreadFactory();
        this.f10168a = (String) C3513t.m12626a(str, (Object) "Name must not be null");
        this.f10169b = 0;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f10170c.newThread(new C3549d(runnable, 0));
        newThread.setName(this.f10168a);
        return newThread;
    }
}
