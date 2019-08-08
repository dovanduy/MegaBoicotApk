package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.eb */
abstract class C4851eb extends C4850ea {

    /* renamed from: b */
    private boolean f15745b;

    C4851eb(C4852ec ecVar) {
        super(ecVar);
        this.f15744a.mo17434a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo17212e();

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final boolean mo17429j() {
        return this.f15745b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo17430k() {
        if (!mo17429j()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: v */
    public final void mo17431v() {
        if (this.f15745b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo17212e();
        this.f15744a.mo17461o();
        this.f15745b = true;
    }
}
