package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.util.C3553e;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.ar */
public final class C4759ar extends C4788bt {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final AtomicLong f15447j = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4763av f15448a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4763av f15449b;

    /* renamed from: c */
    private final PriorityBlockingQueue<C4762au<?>> f15450c = new PriorityBlockingQueue<>();

    /* renamed from: d */
    private final BlockingQueue<C4762au<?>> f15451d = new LinkedBlockingQueue();

    /* renamed from: e */
    private final UncaughtExceptionHandler f15452e = new C4761at(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: f */
    private final UncaughtExceptionHandler f15453f = new C4761at(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f15454g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Semaphore f15455h = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile boolean f15456i;

    C4759ar(C4764aw awVar) {
        super(awVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo17176e() {
        return false;
    }

    /* renamed from: d */
    public final void mo17144d() {
        if (Thread.currentThread() != this.f15448a) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: c */
    public final void mo17143c() {
        if (Thread.currentThread() != this.f15449b) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: g */
    public final boolean mo17222g() {
        return Thread.currentThread() == this.f15448a;
    }

    /* renamed from: a */
    public final <V> Future<V> mo17218a(Callable<V> callable) throws IllegalStateException {
        mo17300A();
        C3513t.m12625a(callable);
        C4762au auVar = new C4762au(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f15448a) {
            if (!this.f15450c.isEmpty()) {
                mo17158r().mo17754i().mo17763a("Callable skipped the worker queue.");
            }
            auVar.run();
        } else {
            m20441a(auVar);
        }
        return auVar;
    }

    /* renamed from: b */
    public final <V> Future<V> mo17220b(Callable<V> callable) throws IllegalStateException {
        mo17300A();
        C3513t.m12625a(callable);
        C4762au auVar = new C4762au(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f15448a) {
            auVar.run();
        } else {
            m20441a(auVar);
        }
        return auVar;
    }

    /* renamed from: a */
    public final void mo17219a(Runnable runnable) throws IllegalStateException {
        mo17300A();
        C3513t.m12625a(runnable);
        m20441a(new C4762au<>(this, runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: a */
    private final void m20441a(C4762au<?> auVar) {
        synchronized (this.f15454g) {
            this.f15450c.add(auVar);
            if (this.f15448a == null) {
                this.f15448a = new C4763av(this, "Measurement Worker", this.f15450c);
                this.f15448a.setUncaughtExceptionHandler(this.f15452e);
                this.f15448a.start();
            } else {
                this.f15448a.mo17226a();
            }
        }
    }

    /* renamed from: b */
    public final void mo17221b(Runnable runnable) throws IllegalStateException {
        mo17300A();
        C3513t.m12625a(runnable);
        C4762au auVar = new C4762au(this, runnable, false, "Task exception on network thread");
        synchronized (this.f15454g) {
            this.f15451d.add(auVar);
            if (this.f15449b == null) {
                this.f15449b = new C4763av(this, "Measurement Network", this.f15451d);
                this.f15449b.setUncaughtExceptionHandler(this.f15453f);
                this.f15449b.start();
            } else {
                this.f15449b.mo17226a();
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo17138a() {
        super.mo17138a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17141b() {
        super.mo17141b();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C4768b mo17152l() {
        return super.mo17152l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C3553e mo17153m() {
        return super.mo17153m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo17154n() {
        return super.mo17154n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C4891p mo17155o() {
        return super.mo17155o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C4862el mo17156p() {
        return super.mo17156p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C4759ar mo17157q() {
        return super.mo17157q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C4893r mo17158r() {
        return super.mo17158r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4745ad mo17159s() {
        return super.mo17159s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C4870et mo17160t() {
        return super.mo17160t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C4868er mo17161u() {
        return super.mo17161u();
    }
}
