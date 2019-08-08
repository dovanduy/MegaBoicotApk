package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C3025aw;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.lo */
public final class C3964lo {

    /* renamed from: a */
    private long f13514a;
    @GuardedBy("mLock")

    /* renamed from: b */
    private long f13515b = Long.MIN_VALUE;

    /* renamed from: c */
    private Object f13516c = new Object();

    public C3964lo(long j) {
        this.f13514a = j;
    }

    /* renamed from: a */
    public final boolean mo15608a() {
        synchronized (this.f13516c) {
            long b = C3025aw.m10924l().mo13695b();
            if (this.f13515b + this.f13514a > b) {
                return false;
            }
            this.f13515b = b;
            return true;
        }
    }
}
