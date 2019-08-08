package com.google.android.gms.internal.p148e;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.e.gq */
public abstract class C4631gq {

    /* renamed from: M */
    protected volatile int f15077M = -1;

    /* renamed from: a */
    public abstract C4631gq mo16326a(C4622gh ghVar) throws IOException;

    /* renamed from: a */
    public void mo16327a(C4623gi giVar) throws IOException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo16328b() {
        return 0;
    }

    /* renamed from: d */
    public final int mo16866d() {
        if (this.f15077M < 0) {
            mo16867e();
        }
        return this.f15077M;
    }

    /* renamed from: e */
    public final int mo16867e() {
        int b = mo16328b();
        this.f15077M = b;
        return b;
    }

    public String toString() {
        return C4632gr.m20109a(this);
    }

    /* renamed from: c */
    public C4631gq clone() throws CloneNotSupportedException {
        return (C4631gq) super.clone();
    }
}
