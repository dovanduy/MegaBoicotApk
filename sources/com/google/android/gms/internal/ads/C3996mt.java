package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C3025aw;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.mt */
public final class C3996mt {
    /* renamed from: a */
    public static <T> C4006nc<T> m17447a(Throwable th) {
        return new C4006nc<>(th);
    }

    /* renamed from: a */
    public static <T> C4007nd<T> m17448a(T t) {
        return new C4007nd<>(t);
    }

    /* renamed from: a */
    public static <V> C4008ne<V> m17449a(C4008ne<V> neVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C4019np npVar = new C4019np();
        m17457a((C4008ne<A>) npVar, (Future<B>) neVar);
        ScheduledFuture schedule = scheduledExecutorService.schedule(new C4000mx(npVar), j, timeUnit);
        m17456a(neVar, npVar);
        npVar.mo15658a(new C4001my(schedule), C4014nk.f13618b);
        return npVar;
    }

    /* renamed from: a */
    public static <A, B> C4008ne<B> m17450a(C4008ne<A> neVar, C3991mo<? super A, ? extends B> moVar, Executor executor) {
        C4019np npVar = new C4019np();
        neVar.mo15658a(new C3999mw(npVar, moVar, neVar), executor);
        m17457a((C4008ne<A>) npVar, (Future<B>) neVar);
        return npVar;
    }

    /* renamed from: a */
    public static <A, B> C4008ne<B> m17451a(C4008ne<A> neVar, C3992mp<A, B> mpVar, Executor executor) {
        C4019np npVar = new C4019np();
        neVar.mo15658a(new C3998mv(npVar, mpVar, neVar), executor);
        m17457a((C4008ne<A>) npVar, (Future<B>) neVar);
        return npVar;
    }

    /* renamed from: a */
    public static <V, X extends Throwable> C4008ne<V> m17452a(C4008ne<? extends V> neVar, Class<X> cls, C3991mo<? super X, ? extends V> moVar, Executor executor) {
        C4019np npVar = new C4019np();
        m17457a((C4008ne<A>) npVar, (Future<B>) neVar);
        C4002mz mzVar = new C4002mz(npVar, neVar, cls, moVar, executor);
        neVar.mo15658a(mzVar, C4014nk.f13618b);
        return npVar;
    }

    /* renamed from: a */
    public static <T> T m17453a(Future<T> future, T t) {
        try {
            return future.get(((Long) aoq.m14620f().mo14695a(aru.f11880bz)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            future.cancel(true);
            C3900je.m17432c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            C3025aw.m10921i().mo15439b(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            e = e2;
            future.cancel(true);
            C3900je.m17430b("Error waiting for future.", e);
            C3025aw.m10921i().mo15439b(e, "Futures.resolveFuture");
            return t;
        }
    }

    /* renamed from: a */
    public static <T> T m17454a(Future<T> future, T t, long j, TimeUnit timeUnit) {
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            e = e;
            future.cancel(true);
            C3900je.m17432c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            C3025aw.m10921i().mo15436a(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            e = e2;
            future.cancel(true);
            C3900je.m17430b("Error waiting for future.", e);
            C3025aw.m10921i().mo15436a(e, "Futures.resolveFuture");
            return t;
        }
    }

    /* renamed from: a */
    public static <V> void m17455a(C4008ne<V> neVar, C3993mq<V> mqVar, Executor executor) {
        neVar.mo15658a(new C3997mu(mqVar, neVar), executor);
    }

    /* renamed from: a */
    private static <V> void m17456a(C4008ne<? extends V> neVar, C4019np<V> npVar) {
        m17457a((C4008ne<A>) npVar, (Future<B>) neVar);
        neVar.mo15658a(new C4004na(npVar, neVar), C4014nk.f13618b);
    }

    /* renamed from: a */
    private static <A, B> void m17457a(C4008ne<A> neVar, Future<B> future) {
        neVar.mo15658a(new C4005nb(neVar, future), C4014nk.f13618b);
    }

    /* renamed from: a */
    static final /* synthetic */ void m17458a(C4019np npVar, C3991mo moVar, C4008ne neVar) {
        if (!npVar.isCancelled()) {
            try {
                m17456a(moVar.mo12596a(neVar.get()), npVar);
            } catch (CancellationException unused) {
                npVar.cancel(true);
            } catch (ExecutionException e) {
                npVar.mo15685a(e.getCause());
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                npVar.mo15685a(e2);
            } catch (Exception e3) {
                npVar.mo15685a(e3);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void m17459a(com.google.android.gms.internal.ads.C4019np r1, com.google.android.gms.internal.ads.C4008ne r2, java.lang.Class r3, com.google.android.gms.internal.ads.C3991mo r4, java.util.concurrent.Executor r5) {
        /*
            java.lang.Object r2 = r2.get()     // Catch:{ ExecutionException -> 0x0013, InterruptedException -> 0x000a, Exception -> 0x0008 }
            r1.mo15686b(r2)     // Catch:{ ExecutionException -> 0x0013, InterruptedException -> 0x000a, Exception -> 0x0008 }
            return
        L_0x0008:
            r2 = move-exception
            goto L_0x0018
        L_0x000a:
            r2 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0018
        L_0x0013:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()
        L_0x0018:
            boolean r3 = r3.isInstance(r2)
            if (r3 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.nd r2 = m17448a((T) r2)
            com.google.android.gms.internal.ads.ne r2 = m17450a(r2, r4, r5)
            m17456a(r2, r1)
            return
        L_0x002a:
            r1.mo15685a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3996mt.m17459a(com.google.android.gms.internal.ads.np, com.google.android.gms.internal.ads.ne, java.lang.Class, com.google.android.gms.internal.ads.mo, java.util.concurrent.Executor):void");
    }
}
