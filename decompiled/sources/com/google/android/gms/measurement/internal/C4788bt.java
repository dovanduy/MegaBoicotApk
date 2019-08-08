package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.bt */
abstract class C4788bt extends C4787bs {

    /* renamed from: a */
    private boolean f15565a;

    C4788bt(C4764aw awVar) {
        super(awVar);
        this.f15564q.mo17237a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo17176e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo17177f() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public final boolean mo17303z() {
        return this.f15565a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo17300A() {
        if (!mo17303z()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: B */
    public final void mo17301B() {
        if (this.f15565a) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo17176e()) {
            this.f15564q.mo17234G();
            this.f15565a = true;
        }
    }

    /* renamed from: C */
    public final void mo17302C() {
        if (this.f15565a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo17177f();
        this.f15564q.mo17234G();
        this.f15565a = true;
    }
}
