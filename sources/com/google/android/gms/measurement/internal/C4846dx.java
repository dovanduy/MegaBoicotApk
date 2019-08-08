package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3513t;
import com.google.android.gms.common.util.C3553e;

/* renamed from: com.google.android.gms.measurement.internal.dx */
final class C4846dx {

    /* renamed from: a */
    private final C3553e f15735a;

    /* renamed from: b */
    private long f15736b;

    public C4846dx(C3553e eVar) {
        C3513t.m12625a(eVar);
        this.f15735a = eVar;
    }

    /* renamed from: a */
    public final void mo17421a() {
        this.f15736b = this.f15735a.mo13695b();
    }

    /* renamed from: b */
    public final void mo17423b() {
        this.f15736b = 0;
    }

    /* renamed from: a */
    public final boolean mo17422a(long j) {
        if (this.f15736b != 0 && this.f15735a.mo13695b() - this.f15736b < 3600000) {
            return false;
        }
        return true;
    }
}
