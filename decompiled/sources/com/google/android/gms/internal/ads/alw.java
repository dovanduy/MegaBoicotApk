package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C3025aw;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
public final class alw {

    /* renamed from: a */
    private final Runnable f11389a = new alx(this);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f11390b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public amc f11391c;
    @GuardedBy("mLock")

    /* renamed from: d */
    private Context f11392d;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: e */
    public amf f11393e;

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m14411b() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f11390b
            monitor-enter(r0)
            android.content.Context r1 = r6.f11392d     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.internal.ads.amc r1 = r6.f11391c     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x000c
            goto L_0x002e
        L_0x000c:
            com.google.android.gms.internal.ads.alz r1 = new com.google.android.gms.internal.ads.alz     // Catch:{ all -> 0x0030 }
            r1.<init>(r6)     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.ama r2 = new com.google.android.gms.internal.ads.ama     // Catch:{ all -> 0x0030 }
            r2.<init>(r6)     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.amc r3 = new com.google.android.gms.internal.ads.amc     // Catch:{ all -> 0x0030 }
            android.content.Context r4 = r6.f11392d     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.ll r5 = com.google.android.gms.ads.internal.C3025aw.m10932t()     // Catch:{ all -> 0x0030 }
            android.os.Looper r5 = r5.mo15603a()     // Catch:{ all -> 0x0030 }
            r3.<init>(r4, r5, r1, r2)     // Catch:{ all -> 0x0030 }
            r6.f11391c = r3     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.amc r1 = r6.f11391c     // Catch:{ all -> 0x0030 }
            r1.mo13551q()     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.alw.m14411b():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m14414c() {
        synchronized (this.f11390b) {
            if (this.f11391c != null) {
                if (this.f11391c.mo13542h() || this.f11391c.mo13543i()) {
                    this.f11391c.mo13541g();
                }
                this.f11391c = null;
                this.f11393e = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* renamed from: a */
    public final zzhi mo14506a(zzhl zzhl) {
        synchronized (this.f11390b) {
            if (this.f11393e == null) {
                zzhi zzhi = new zzhi();
                return zzhi;
            }
            try {
                zzhi a = this.f11393e.mo14516a(zzhl);
                return a;
            } catch (RemoteException e) {
                C3900je.m17430b("Unable to call into cache service.", e);
                return new zzhi();
            }
        }
    }

    /* renamed from: a */
    public final void mo14507a() {
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11887cF)).booleanValue()) {
            synchronized (this.f11390b) {
                m14411b();
                C3025aw.m10917e();
                C3909jn.f13411a.removeCallbacks(this.f11389a);
                C3025aw.m10917e();
                C3909jn.f13411a.postDelayed(this.f11389a, ((Long) aoq.m14620f().mo14695a(aru.f11888cG)).longValue());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14508a(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.f11390b
            monitor-enter(r0)
            android.content.Context r1 = r2.f11392d     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.f11392d = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.aru.f11886cE     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.ars r1 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo14695a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.m14411b()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.aru.f11885cD     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.ars r1 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo14695a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.aly r3 = new com.google.android.gms.internal.ads.aly     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.aky r1 = com.google.android.gms.ads.internal.C3025aw.m10920h()     // Catch:{ all -> 0x0048 }
            r1.mo14462a(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.alw.mo14508a(android.content.Context):void");
    }
}
