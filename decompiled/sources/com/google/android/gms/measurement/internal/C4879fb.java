package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.internal.p148e.C4524d;

/* renamed from: com.google.android.gms.measurement.internal.fb */
abstract class C4879fb {

    /* renamed from: b */
    private static volatile Handler f15844b;

    /* renamed from: a */
    private final C4789bu f15845a;

    /* renamed from: c */
    private final Runnable f15846c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile long f15847d;

    C4879fb(C4789bu buVar) {
        C3513t.m12625a(buVar);
        this.f15845a = buVar;
        this.f15846c = new C4880fc(this, buVar);
    }

    /* renamed from: a */
    public abstract void mo17374a();

    /* renamed from: a */
    public final void mo17718a(long j) {
        mo17720c();
        if (j >= 0) {
            this.f15847d = this.f15845a.mo17153m().mo13694a();
            if (!m21214d().postDelayed(this.f15846c, j)) {
                this.f15845a.mo17158r().mo17761y_().mo17764a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: b */
    public final boolean mo17719b() {
        return this.f15847d != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo17720c() {
        this.f15847d = 0;
        m21214d().removeCallbacks(this.f15846c);
    }

    /* renamed from: d */
    private final Handler m21214d() {
        Handler handler;
        if (f15844b != null) {
            return f15844b;
        }
        synchronized (C4879fb.class) {
            if (f15844b == null) {
                f15844b = new C4524d(this.f15845a.mo17154n().getMainLooper());
            }
            handler = f15844b;
        }
        return handler;
    }
}
