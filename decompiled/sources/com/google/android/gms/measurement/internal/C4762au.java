package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3513t;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.measurement.internal.au */
final class C4762au<V> extends FutureTask<V> implements Comparable<C4762au> {

    /* renamed from: a */
    final boolean f15459a;

    /* renamed from: b */
    private final long f15460b = C4759ar.f15447j.getAndIncrement();

    /* renamed from: c */
    private final String f15461c;

    /* renamed from: d */
    private final /* synthetic */ C4759ar f15462d;

    C4762au(C4759ar arVar, Callable<V> callable, boolean z, String str) {
        this.f15462d = arVar;
        super(callable);
        C3513t.m12625a(str);
        this.f15461c = str;
        this.f15459a = z;
        if (this.f15460b == Long.MAX_VALUE) {
            arVar.mo17158r().mo17761y_().mo17763a("Tasks index overflow");
        }
    }

    C4762au(C4759ar arVar, Runnable runnable, boolean z, String str) {
        this.f15462d = arVar;
        super(runnable, null);
        C3513t.m12625a(str);
        this.f15461c = str;
        this.f15459a = false;
        if (this.f15460b == Long.MAX_VALUE) {
            arVar.mo17158r().mo17761y_().mo17763a("Tasks index overflow");
        }
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f15462d.mo17158r().mo17761y_().mo17764a(this.f15461c, th);
        if (th instanceof C4760as) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C4762au auVar = (C4762au) obj;
        if (this.f15459a != auVar.f15459a) {
            return this.f15459a ? -1 : 1;
        }
        if (this.f15460b < auVar.f15460b) {
            return -1;
        }
        if (this.f15460b > auVar.f15460b) {
            return 1;
        }
        this.f15462d.mo17158r().mo17752g().mo17764a("Two tasks share the same index. index", Long.valueOf(this.f15460b));
        return 0;
    }
}
