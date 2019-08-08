package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C3266f;
import com.google.android.gms.common.api.C3270g;
import com.google.android.gms.common.api.C3270g.C3271a;
import com.google.android.gms.common.api.C3274i;
import com.google.android.gms.common.api.C3391k;
import com.google.android.gms.common.api.C3392l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3497n;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.p145b.C4415f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends C3391k> extends C3270g<R> {

    /* renamed from: a */
    static final ThreadLocal<Boolean> f9508a = new C3345cj();

    /* renamed from: b */
    private final Object f9509b;

    /* renamed from: c */
    private final C3275a<R> f9510c;

    /* renamed from: d */
    private final WeakReference<C3266f> f9511d;

    /* renamed from: e */
    private final CountDownLatch f9512e;

    /* renamed from: f */
    private final ArrayList<C3271a> f9513f;

    /* renamed from: g */
    private C3392l<? super R> f9514g;

    /* renamed from: h */
    private final AtomicReference<C3330by> f9515h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public R f9516i;

    /* renamed from: j */
    private Status f9517j;

    /* renamed from: k */
    private volatile boolean f9518k;

    /* renamed from: l */
    private boolean f9519l;

    /* renamed from: m */
    private boolean f9520m;
    @KeepName
    private C3276b mResultGuardian;

    /* renamed from: n */
    private C3497n f9521n;

    /* renamed from: o */
    private volatile C3324bs<R> f9522o;

    /* renamed from: p */
    private boolean f9523p;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class C3275a<R extends C3391k> extends C4415f {
        public C3275a() {
            this(Looper.getMainLooper());
        }

        public C3275a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo13167a(C3392l<? super R> lVar, R r) {
            sendMessage(obtainMessage(1, new Pair(lVar, r)));
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Pair pair = (Pair) message.obj;
                    C3392l lVar = (C3392l) pair.first;
                    C3391k kVar = (C3391k) pair.second;
                    try {
                        lVar.onResult(kVar);
                        return;
                    } catch (RuntimeException e) {
                        BasePendingResult.m11689c(kVar);
                        throw e;
                    }
                case 2:
                    ((BasePendingResult) message.obj).mo13163c(Status.f9458d);
                    return;
                default:
                    int i = message.what;
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i);
                    Log.wtf("BasePendingResult", sb.toString(), new Exception());
                    return;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    private final class C3276b {
        private C3276b() {
        }

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            BasePendingResult.m11689c(BasePendingResult.this.f9516i);
            super.finalize();
        }

        /* synthetic */ C3276b(BasePendingResult basePendingResult, C3345cj cjVar) {
            this();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f9509b = new Object();
        this.f9512e = new CountDownLatch(1);
        this.f9513f = new ArrayList<>();
        this.f9515h = new AtomicReference<>();
        this.f9523p = false;
        this.f9510c = new C3275a<>(Looper.getMainLooper());
        this.f9511d = new WeakReference<>(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo13021a(Status status);

    /* renamed from: c */
    public final Integer mo13158c() {
        return null;
    }

    protected BasePendingResult(C3266f fVar) {
        this.f9509b = new Object();
        this.f9512e = new CountDownLatch(1);
        this.f9513f = new ArrayList<>();
        this.f9515h = new AtomicReference<>();
        this.f9523p = false;
        this.f9510c = new C3275a<>(fVar != null ? fVar.mo13138c() : Looper.getMainLooper());
        this.f9511d = new WeakReference<>(fVar);
    }

    /* renamed from: f */
    public final boolean mo13164f() {
        return this.f9512e.getCount() == 0;
    }

    /* renamed from: a */
    public final R mo13153a(long j, TimeUnit timeUnit) {
        if (j > 0) {
            C3513t.m12638c("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        C3513t.m12632a(!this.f9518k, (Object) "Result has already been consumed.");
        if (this.f9522o != null) {
            z = false;
        }
        C3513t.m12632a(z, (Object) "Cannot await if then() has been called.");
        try {
            if (!this.f9512e.await(j, timeUnit)) {
                mo13163c(Status.f9458d);
            }
        } catch (InterruptedException unused) {
            mo13163c(Status.f9456b);
        }
        C3513t.m12632a(mo13164f(), (Object) "Result is not ready.");
        return mo13270d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13156a(com.google.android.gms.common.api.C3392l<? super R> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f9509b
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000c
            r5 = 0
            r4.f9514g = r5     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x000a:
            r5 = move-exception
            goto L_0x003c
        L_0x000c:
            boolean r1 = r4.f9518k     // Catch:{ all -> 0x000a }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.C3513t.m12632a(r1, r3)     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.internal.bs<R> r1 = r4.f9522o     // Catch:{ all -> 0x000a }
            if (r1 != 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.C3513t.m12632a(r2, r1)     // Catch:{ all -> 0x000a }
            boolean r1 = r4.mo13157b()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0028
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x0028:
            boolean r1 = r4.mo13164f()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0038
            com.google.android.gms.common.api.internal.BasePendingResult$a<R> r1 = r4.f9510c     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.k r2 = r4.mo13270d()     // Catch:{ all -> 0x000a }
            r1.mo13167a(r5, r2)     // Catch:{ all -> 0x000a }
            goto L_0x003a
        L_0x0038:
            r4.f9514g = r5     // Catch:{ all -> 0x000a }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo13156a(com.google.android.gms.common.api.l):void");
    }

    /* renamed from: a */
    public final void mo13155a(C3271a aVar) {
        C3513t.m12636b(aVar != null, "Callback cannot be null.");
        synchronized (this.f9509b) {
            if (mo13164f()) {
                aVar.mo13159a(this.f9517j);
            } else {
                this.f9513f.add(aVar);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13154a() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f9509b
            monitor-enter(r0)
            boolean r1 = r2.f9519l     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2.f9518k     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x000c
            goto L_0x0028
        L_0x000c:
            com.google.android.gms.common.internal.n r1 = r2.f9521n     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0015
            com.google.android.gms.common.internal.n r1 = r2.f9521n     // Catch:{ RemoteException -> 0x0015 }
            r1.mo13609a()     // Catch:{ RemoteException -> 0x0015 }
        L_0x0015:
            R r1 = r2.f9516i     // Catch:{ all -> 0x002a }
            m11689c(r1)     // Catch:{ all -> 0x002a }
            r1 = 1
            r2.f9519l = r1     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f9459e     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.k r1 = r2.mo13021a(r1)     // Catch:{ all -> 0x002a }
            r2.mo13266a((R) r1)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo13154a():void");
    }

    /* renamed from: g */
    public final boolean mo13165g() {
        boolean b;
        synchronized (this.f9509b) {
            if (((C3266f) this.f9511d.get()) == null || !this.f9523p) {
                mo13154a();
            }
            b = mo13157b();
        }
        return b;
    }

    /* renamed from: b */
    public boolean mo13157b() {
        boolean z;
        synchronized (this.f9509b) {
            z = this.f9519l;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo13162b(R r) {
        synchronized (this.f9509b) {
            if (this.f9520m || this.f9519l) {
                m11689c((C3391k) r);
                return;
            }
            mo13164f();
            C3513t.m12632a(!mo13164f(), (Object) "Results have already been set");
            C3513t.m12632a(!this.f9518k, (Object) "Result has already been consumed");
            mo13266a(r);
        }
    }

    /* renamed from: c */
    public final void mo13163c(Status status) {
        synchronized (this.f9509b) {
            if (!mo13164f()) {
                mo13162b(mo13021a(status));
                this.f9520m = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo13161a(C3330by byVar) {
        this.f9515h.set(byVar);
    }

    /* renamed from: h */
    public final void mo13166h() {
        this.f9523p = this.f9523p || ((Boolean) f9508a.get()).booleanValue();
    }

    /* renamed from: d */
    private final R mo13270d() {
        R r;
        synchronized (this.f9509b) {
            C3513t.m12632a(!this.f9518k, (Object) "Result has already been consumed.");
            C3513t.m12632a(mo13164f(), (Object) "Result is not ready.");
            r = this.f9516i;
            this.f9516i = null;
            this.f9514g = null;
            this.f9518k = true;
        }
        C3330by byVar = (C3330by) this.f9515h.getAndSet(null);
        if (byVar != null) {
            byVar.mo13263a(this);
        }
        return r;
    }

    /* renamed from: a */
    private final void mo13266a(R r) {
        this.f9516i = r;
        this.f9521n = null;
        this.f9512e.countDown();
        this.f9517j = this.f9516i.mo12984b();
        if (this.f9519l) {
            this.f9514g = null;
        } else if (this.f9514g != null) {
            this.f9510c.removeMessages(2);
            this.f9510c.mo13167a(this.f9514g, mo13270d());
        } else if (this.f9516i instanceof C3274i) {
            this.mResultGuardian = new C3276b(this, null);
        }
        ArrayList arrayList = this.f9513f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C3271a) obj).mo13159a(this.f9517j);
        }
        this.f9513f.clear();
    }

    /* renamed from: c */
    public static void m11689c(C3391k kVar) {
        if (kVar instanceof C3274i) {
            try {
                ((C3274i) kVar).mo13160a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(kVar);
                StringBuilder sb = new StringBuilder(18 + String.valueOf(valueOf).length());
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }
}
