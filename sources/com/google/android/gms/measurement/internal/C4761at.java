package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3513t;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.google.android.gms.measurement.internal.at */
final class C4761at implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f15457a;

    /* renamed from: b */
    private final /* synthetic */ C4759ar f15458b;

    public C4761at(C4759ar arVar, String str) {
        this.f15458b = arVar;
        C3513t.m12625a(str);
        this.f15457a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f15458b.mo17158r().mo17761y_().mo17764a(this.f15457a, th);
    }
}
