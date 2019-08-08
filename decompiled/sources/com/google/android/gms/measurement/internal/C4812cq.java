package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.cq */
final class C4812cq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f15637a;

    /* renamed from: b */
    private final /* synthetic */ C4810co f15638b;

    /* renamed from: c */
    private final /* synthetic */ C4810co f15639c;

    /* renamed from: d */
    private final /* synthetic */ C4811cp f15640d;

    C4812cq(C4811cp cpVar, boolean z, C4810co coVar, C4810co coVar2) {
        this.f15640d = cpVar;
        this.f15637a = z;
        this.f15638b = coVar;
        this.f15639c = coVar2;
    }

    public final void run() {
        boolean z;
        boolean z2 = false;
        if (this.f15640d.mo17160t().mo17665t(this.f15640d.mo17147g().mo17730x())) {
            z = this.f15637a && this.f15640d.f15631a != null;
            if (z) {
                this.f15640d.m20650a(this.f15640d.f15631a, true);
            }
        } else {
            if (this.f15637a && this.f15640d.f15631a != null) {
                this.f15640d.m20650a(this.f15640d.f15631a, true);
            }
            z = false;
        }
        if (this.f15638b == null || this.f15638b.f15629c != this.f15639c.f15629c || !C4862el.m20976c(this.f15638b.f15628b, this.f15639c.f15628b) || !C4862el.m20976c(this.f15638b.f15627a, this.f15639c.f15627a)) {
            z2 = true;
        }
        if (z2) {
            Bundle bundle = new Bundle();
            C4811cp.m20649a(this.f15639c, bundle, true);
            if (this.f15638b != null) {
                if (this.f15638b.f15627a != null) {
                    bundle.putString("_pn", this.f15638b.f15627a);
                }
                bundle.putString("_pc", this.f15638b.f15628b);
                bundle.putLong("_pi", this.f15638b.f15629c);
            }
            if (this.f15640d.mo17160t().mo17665t(this.f15640d.mo17147g().mo17730x()) && z) {
                long y = this.f15640d.mo17151k().mo17418y();
                if (y > 0) {
                    this.f15640d.mo17156p().mo17490a(bundle, y);
                }
            }
            this.f15640d.mo17146f().mo17326b("auto", "_vs", bundle);
        }
        this.f15640d.f15631a = this.f15639c;
        this.f15640d.mo17148h().mo17362a(this.f15639c);
    }
}
