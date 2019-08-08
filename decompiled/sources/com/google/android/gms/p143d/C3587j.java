package com.google.android.gms.p143d;

import com.google.android.gms.common.internal.C3513t;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.d.j */
public final class C3587j {

    /* renamed from: com.google.android.gms.d.j$a */
    private static final class C3588a implements C3589b {

        /* renamed from: a */
        private final CountDownLatch f10210a;

        private C3588a() {
            this.f10210a = new CountDownLatch(1);
        }

        /* renamed from: a */
        public final void mo13707a(Object obj) {
            this.f10210a.countDown();
        }

        /* renamed from: a */
        public final void mo13706a(Exception exc) {
            this.f10210a.countDown();
        }

        /* renamed from: a */
        public final void mo13705a() {
            this.f10210a.countDown();
        }

        /* renamed from: b */
        public final void mo13727b() throws InterruptedException {
            this.f10210a.await();
        }

        /* renamed from: a */
        public final boolean mo13726a(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f10210a.await(j, timeUnit);
        }

        /* synthetic */ C3588a(C3577aa aaVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.d.j$b */
    interface C3589b extends C3578b, C3580d, C3581e<Object> {
    }

    /* renamed from: a */
    public static <TResult> C3583g<TResult> m12817a(TResult tresult) {
        C3605z zVar = new C3605z();
        zVar.mo13739a(tresult);
        return zVar;
    }

    /* renamed from: a */
    public static <TResult> C3583g<TResult> m12816a(Exception exc) {
        C3605z zVar = new C3605z();
        zVar.mo13738a(exc);
        return zVar;
    }

    /* renamed from: a */
    public static <TResult> TResult m12818a(C3583g<TResult> gVar) throws ExecutionException, InterruptedException {
        C3513t.m12629a();
        C3513t.m12626a(gVar, (Object) "Task must not be null");
        if (gVar.mo13714a()) {
            return m12821b(gVar);
        }
        C3588a aVar = new C3588a(null);
        m12820a(gVar, aVar);
        aVar.mo13727b();
        return m12821b(gVar);
    }

    /* renamed from: a */
    public static <TResult> TResult m12819a(C3583g<TResult> gVar, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C3513t.m12629a();
        C3513t.m12626a(gVar, (Object) "Task must not be null");
        C3513t.m12626a(timeUnit, (Object) "TimeUnit must not be null");
        if (gVar.mo13714a()) {
            return m12821b(gVar);
        }
        C3588a aVar = new C3588a(null);
        m12820a(gVar, aVar);
        if (aVar.mo13726a(j, timeUnit)) {
            return m12821b(gVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: b */
    private static <TResult> TResult m12821b(C3583g<TResult> gVar) throws ExecutionException {
        if (gVar.mo13716b()) {
            return gVar.mo13718d();
        }
        if (gVar.mo13717c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(gVar.mo13719e());
    }

    /* renamed from: a */
    private static void m12820a(C3583g<?> gVar, C3589b bVar) {
        gVar.mo13712a(C3585i.f10208b, (C3581e<? super TResult>) bVar);
        gVar.mo13711a(C3585i.f10208b, (C3580d) bVar);
        gVar.mo13709a(C3585i.f10208b, (C3578b) bVar);
    }
}
