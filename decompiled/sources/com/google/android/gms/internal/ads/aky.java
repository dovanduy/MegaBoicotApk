package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.util.C3563o;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@C3718cm
public final class aky {

    /* renamed from: a */
    private final Object f11315a = new Object();
    @GuardedBy("mActivityTrackerLock")

    /* renamed from: b */
    private akz f11316b = null;
    @GuardedBy("mActivityTrackerLock")

    /* renamed from: c */
    private boolean f11317c = false;

    /* renamed from: a */
    public final Activity mo14460a() {
        synchronized (this.f11315a) {
            if (!C3563o.m12763b()) {
                return null;
            }
            if (this.f11316b == null) {
                return null;
            }
            Activity a = this.f11316b.mo14464a();
            return a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14461a(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f11315a
            monitor-enter(r0)
            boolean r1 = r4.f11317c     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x004e
            boolean r1 = com.google.android.gms.common.util.C3563o.m12763b()     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return
        L_0x000f:
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.aru.f11782aG     // Catch:{ all -> 0x0050 }
            com.google.android.gms.internal.ads.ars r2 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x0050 }
            java.lang.Object r1 = r2.mo14695a(r1)     // Catch:{ all -> 0x0050 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0050 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x0023
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return
        L_0x0023:
            r1 = 0
            android.content.Context r2 = r5.getApplicationContext()     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x002b
            r2 = r5
        L_0x002b:
            boolean r3 = r2 instanceof android.app.Application     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x0032
            r1 = r2
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x0050 }
        L_0x0032:
            if (r1 != 0) goto L_0x003b
            java.lang.String r5 = "Can not cast Context to Application"
            com.google.android.gms.internal.ads.C3900je.m17435e(r5)     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return
        L_0x003b:
            com.google.android.gms.internal.ads.akz r2 = r4.f11316b     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x0046
            com.google.android.gms.internal.ads.akz r2 = new com.google.android.gms.internal.ads.akz     // Catch:{ all -> 0x0050 }
            r2.<init>()     // Catch:{ all -> 0x0050 }
            r4.f11316b = r2     // Catch:{ all -> 0x0050 }
        L_0x0046:
            com.google.android.gms.internal.ads.akz r2 = r4.f11316b     // Catch:{ all -> 0x0050 }
            r2.mo14465a(r1, r5)     // Catch:{ all -> 0x0050 }
            r5 = 1
            r4.f11317c = r5     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return
        L_0x0050:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aky.mo14461a(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo14462a(alb alb) {
        synchronized (this.f11315a) {
            if (C3563o.m12763b()) {
                if (((Boolean) aoq.m14620f().mo14695a(aru.f11782aG)).booleanValue()) {
                    if (this.f11316b == null) {
                        this.f11316b = new akz();
                    }
                    this.f11316b.mo14466a(alb);
                }
            }
        }
    }

    /* renamed from: b */
    public final Context mo14463b() {
        synchronized (this.f11315a) {
            if (!C3563o.m12763b()) {
                return null;
            }
            if (this.f11316b == null) {
                return null;
            }
            Context b = this.f11316b.mo14467b();
            return b;
        }
    }
}
