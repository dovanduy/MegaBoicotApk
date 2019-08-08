package com.facebook.ads.internal.p095v.p097b;

import android.util.Log;
import java.lang.Thread.State;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.v.b.k */
class C1902k {

    /* renamed from: a */
    private final C1907n f5986a;

    /* renamed from: b */
    private final C1875a f5987b;

    /* renamed from: c */
    private final Object f5988c = new Object();

    /* renamed from: d */
    private final Object f5989d = new Object();

    /* renamed from: e */
    private final AtomicInteger f5990e;

    /* renamed from: f */
    private volatile Thread f5991f;

    /* renamed from: g */
    private volatile boolean f5992g;

    /* renamed from: h */
    private volatile int f5993h = -1;

    /* renamed from: com.facebook.ads.internal.v.b.k$a */
    private class C1904a implements Runnable {
        private C1904a() {
        }

        public void run() {
            C1902k.m7937a(C1902k.this);
        }
    }

    public C1902k(C1907n nVar, C1875a aVar) {
        this.f5986a = (C1907n) C1901j.m7935a(nVar);
        this.f5987b = (C1875a) C1901j.m7935a(aVar);
        this.f5990e = new AtomicInteger();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        r2 = r2 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0042, code lost:
        r0 = r9.f5989d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0044, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0049, code lost:
        if (r9.m7940c() != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0057, code lost:
        if (r9.f5987b.mo7910a() != r9.f5986a.mo7942a()) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        r9.f5987b.mo7914c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005e, code lost:
        monitor-exit(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m7937a(com.facebook.ads.internal.p095v.p097b.C1902k r9) {
        /*
            r0 = -1
            r1 = 0
            com.facebook.ads.internal.v.b.a r2 = r9.f5987b     // Catch:{ Throwable -> 0x007a, all -> 0x0074 }
            int r2 = r2.mo7910a()     // Catch:{ Throwable -> 0x007a, all -> 0x0074 }
            com.facebook.ads.internal.v.b.n r1 = r9.f5986a     // Catch:{ Throwable -> 0x006e, all -> 0x0069 }
            r1.mo7944a(r2)     // Catch:{ Throwable -> 0x006e, all -> 0x0069 }
            com.facebook.ads.internal.v.b.n r1 = r9.f5986a     // Catch:{ Throwable -> 0x006e, all -> 0x0069 }
            int r1 = r1.mo7942a()     // Catch:{ Throwable -> 0x006e, all -> 0x0069 }
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r3]     // Catch:{ Throwable -> 0x0065, all -> 0x0063 }
        L_0x0017:
            com.facebook.ads.internal.v.b.n r4 = r9.f5986a     // Catch:{ Throwable -> 0x0065, all -> 0x0063 }
            int r4 = r4.mo7943a(r3)     // Catch:{ Throwable -> 0x0065, all -> 0x0063 }
            if (r4 == r0) goto L_0x0042
            java.lang.Object r5 = r9.f5989d     // Catch:{ Throwable -> 0x0065, all -> 0x0063 }
            monitor-enter(r5)     // Catch:{ Throwable -> 0x0065, all -> 0x0063 }
            boolean r6 = r9.m7940c()     // Catch:{ all -> 0x003f }
            if (r6 == 0) goto L_0x0032
            monitor-exit(r5)     // Catch:{ all -> 0x003f }
        L_0x0029:
            r9.m7941d()
            long r2 = (long) r2
            long r0 = (long) r1
            r9.m7939b(r2, r0)
            return
        L_0x0032:
            com.facebook.ads.internal.v.b.a r6 = r9.f5987b     // Catch:{ all -> 0x003f }
            r6.mo7912a(r3, r4)     // Catch:{ all -> 0x003f }
            monitor-exit(r5)     // Catch:{ all -> 0x003f }
            int r2 = r2 + r4
            long r4 = (long) r2
            long r6 = (long) r1
            r9.m7939b(r4, r6)     // Catch:{ Throwable -> 0x0065, all -> 0x0063 }
            goto L_0x0017
        L_0x003f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ Throwable -> 0x0065, all -> 0x0063 }
        L_0x0042:
            java.lang.Object r0 = r9.f5989d     // Catch:{ Throwable -> 0x0065, all -> 0x0063 }
            monitor-enter(r0)     // Catch:{ Throwable -> 0x0065, all -> 0x0063 }
            boolean r3 = r9.m7940c()     // Catch:{ all -> 0x0060 }
            if (r3 != 0) goto L_0x005e
            com.facebook.ads.internal.v.b.a r3 = r9.f5987b     // Catch:{ all -> 0x0060 }
            int r3 = r3.mo7910a()     // Catch:{ all -> 0x0060 }
            com.facebook.ads.internal.v.b.n r4 = r9.f5986a     // Catch:{ all -> 0x0060 }
            int r4 = r4.mo7942a()     // Catch:{ all -> 0x0060 }
            if (r3 != r4) goto L_0x005e
            com.facebook.ads.internal.v.b.a r3 = r9.f5987b     // Catch:{ all -> 0x0060 }
            r3.mo7914c()     // Catch:{ all -> 0x0060 }
        L_0x005e:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            goto L_0x0029
        L_0x0060:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r3     // Catch:{ Throwable -> 0x0065, all -> 0x0063 }
        L_0x0063:
            r0 = move-exception
            goto L_0x0093
        L_0x0065:
            r0 = move-exception
            r8 = r2
            r2 = r1
            goto L_0x0072
        L_0x0069:
            r1 = move-exception
            r8 = r1
            r1 = r0
            r0 = r8
            goto L_0x0093
        L_0x006e:
            r1 = move-exception
            r8 = r2
            r2 = r0
            r0 = r1
        L_0x0072:
            r1 = r8
            goto L_0x007e
        L_0x0074:
            r2 = move-exception
            r8 = r1
            r1 = r0
            r0 = r2
            r2 = r8
            goto L_0x0093
        L_0x007a:
            r2 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
        L_0x007e:
            java.util.concurrent.atomic.AtomicInteger r3 = r9.f5990e     // Catch:{ all -> 0x008f }
            r3.incrementAndGet()     // Catch:{ all -> 0x008f }
            r9.mo7951a(r0)     // Catch:{ all -> 0x008f }
            r9.m7941d()
            long r0 = (long) r1
            long r2 = (long) r2
            r9.m7939b(r0, r2)
            return
        L_0x008f:
            r0 = move-exception
            r8 = r2
            r2 = r1
            r1 = r8
        L_0x0093:
            r9.m7941d()
            long r2 = (long) r2
            long r4 = (long) r1
            r9.m7939b(r2, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p095v.p097b.C1902k.m7937a(com.facebook.ads.internal.v.b.k):void");
    }

    /* renamed from: b */
    private synchronized void m7938b() {
        boolean z = (this.f5991f == null || this.f5991f.getState() == State.TERMINATED) ? false : true;
        if (!this.f5992g && !this.f5987b.mo7915d() && !z) {
            C1904a aVar = new C1904a();
            StringBuilder sb = new StringBuilder();
            sb.append("Source reader for ");
            sb.append(this.f5986a);
            this.f5991f = new Thread(aVar, sb.toString());
            this.f5991f.start();
        }
    }

    /* renamed from: b */
    private void m7939b(long j, long j2) {
        mo7950a(j, j2);
        synchronized (this.f5988c) {
            this.f5988c.notifyAll();
        }
    }

    /* renamed from: c */
    private boolean m7940c() {
        return Thread.currentThread().isInterrupted() || this.f5992g;
    }

    /* renamed from: d */
    private void m7941d() {
        try {
            this.f5986a.mo7945b();
        } catch (C1905l | IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error closing source ");
            sb.append(this.f5986a);
            mo7951a((Throwable) new C1905l(sb.toString(), e));
        }
    }

    /* renamed from: a */
    public int mo7948a(byte[] bArr, long j, int i) {
        String str = "Buffer must be not null!";
        if (bArr == null) {
            throw new NullPointerException(str);
        }
        C1901j.m7936a(j >= 0, "Data offset must be positive!");
        C1901j.m7936a(i >= 0 && i <= bArr.length, "Length must be in range [0..buffer.length]");
        while (!this.f5987b.mo7915d() && ((long) this.f5987b.mo7910a()) < j + ((long) i) && !this.f5992g) {
            m7938b();
            synchronized (this.f5988c) {
                try {
                    this.f5988c.wait(1000);
                } catch (InterruptedException e) {
                    throw new C1905l("Waiting source data is interrupted!", e);
                }
            }
            int i2 = this.f5990e.get();
            if (i2 >= 1) {
                this.f5990e.set(0);
                StringBuilder sb = new StringBuilder();
                sb.append("Error reading source ");
                sb.append(i2);
                sb.append(" times");
                throw new C1905l(sb.toString());
            }
        }
        int a = this.f5987b.mo7911a(bArr, j, i);
        if (this.f5987b.mo7915d() && this.f5993h != 100) {
            this.f5993h = 100;
            mo7926a(100);
        }
        return a;
    }

    /* renamed from: a */
    public void mo7949a() {
        synchronized (this.f5989d) {
            String str = "ProxyCache";
            StringBuilder sb = new StringBuilder();
            sb.append("Shutdown proxy for ");
            sb.append(this.f5986a);
            Log.d(str, sb.toString());
            try {
                this.f5992g = true;
                if (this.f5991f != null) {
                    this.f5991f.interrupt();
                }
                this.f5987b.mo7913b();
            } catch (C1905l e) {
                mo7951a((Throwable) e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7926a(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7950a(long j, long j2) {
        boolean z = false;
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)) == 0 ? 100 : (int) ((j * 100) / j2);
        boolean z2 = i != this.f5993h;
        if (j2 >= 0) {
            z = true;
        }
        if (z && z2) {
            mo7926a(i);
        }
        this.f5993h = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7951a(Throwable th) {
        if (th instanceof C1900i) {
            Log.d("ProxyCache", "ProxyCache is interrupted");
        } else {
            Log.e("ProxyCache", "ProxyCache error", th);
        }
    }
}
