package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C3025aw;

/* renamed from: com.google.android.gms.internal.ads.ir */
final class C3886ir {

    /* renamed from: a */
    private final Object f13340a;

    /* renamed from: b */
    private volatile int f13341b;

    /* renamed from: c */
    private volatile long f13342c;

    private C3886ir() {
        this.f13340a = new Object();
        this.f13341b = C3887is.f13343a;
        this.f13342c = 0;
    }

    /* synthetic */ C3886ir(C3885iq iqVar) {
        this();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m17004a(int r5, int r6) {
        /*
            r4 = this;
            r4.m17005d()
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.C3025aw.m10924l()
            long r0 = r0.mo13694a()
            java.lang.Object r2 = r4.f13340a
            monitor-enter(r2)
            int r3 = r4.f13341b     // Catch:{ all -> 0x0020 }
            if (r3 == r5) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            return
        L_0x0014:
            r4.f13341b = r6     // Catch:{ all -> 0x0020 }
            int r5 = r4.f13341b     // Catch:{ all -> 0x0020 }
            int r6 = com.google.android.gms.internal.ads.C3887is.f13345c     // Catch:{ all -> 0x0020 }
            if (r5 != r6) goto L_0x001e
            r4.f13342c = r0     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3886ir.m17004a(int, int):void");
    }

    /* renamed from: d */
    private final void m17005d() {
        long a = C3025aw.m10924l().mo13694a();
        synchronized (this.f13340a) {
            if (this.f13341b == C3887is.f13345c) {
                if (this.f13342c + ((Long) aoq.m14620f().mo14695a(aru.f11969di)).longValue() <= a) {
                    this.f13341b = C3887is.f13343a;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo15454a(boolean z) {
        int i;
        int i2;
        if (z) {
            i = C3887is.f13343a;
            i2 = C3887is.f13344b;
        } else {
            i = C3887is.f13344b;
            i2 = C3887is.f13343a;
        }
        m17004a(i, i2);
    }

    /* renamed from: a */
    public final boolean mo15455a() {
        m17005d();
        return this.f13341b == C3887is.f13344b;
    }

    /* renamed from: b */
    public final boolean mo15456b() {
        m17005d();
        return this.f13341b == C3887is.f13345c;
    }

    /* renamed from: c */
    public final void mo15457c() {
        m17004a(C3887is.f13344b, C3887is.f13345c);
    }
}
