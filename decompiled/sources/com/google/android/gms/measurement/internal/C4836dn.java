package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.dn */
abstract class C4836dn extends C4813cr {

    /* renamed from: a */
    private boolean f15716a;

    C4836dn(C4764aw awVar) {
        super(awVar);
        this.f15564q.mo17238a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract boolean mo17328v();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo17411w() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public final boolean mo17407D() {
        return this.f15716a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo17408E() {
        if (!mo17407D()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: F */
    public final void mo17409F() {
        if (this.f15716a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo17328v()) {
            this.f15564q.mo17234G();
            this.f15716a = true;
        }
    }

    /* renamed from: G */
    public final void mo17410G() {
        if (this.f15716a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo17411w();
        this.f15564q.mo17234G();
        this.f15716a = true;
    }
}
