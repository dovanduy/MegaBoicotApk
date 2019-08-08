package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C3513t;

public final class bah extends C4025nv<aze> {

    /* renamed from: a */
    private final Object f12506a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3941ks<aze> f12507b;

    /* renamed from: c */
    private boolean f12508c;

    /* renamed from: d */
    private int f12509d;

    public bah(C3941ks<aze> ksVar) {
        this.f12507b = ksVar;
        this.f12508c = false;
        this.f12509d = 0;
    }

    /* renamed from: f */
    private final void m15871f() {
        synchronized (this.f12506a) {
            C3513t.m12631a(this.f12509d >= 0);
            if (!this.f12508c || this.f12509d != 0) {
                C3900je.m17043a("There are still references to the engine. Not destroying.");
            } else {
                C3900je.m17043a("No reference is left (including root). Cleaning up engine.");
                mo15691a(new bak(this), new C4023nt());
            }
        }
    }

    /* renamed from: c */
    public final bad mo15038c() {
        bad bad = new bad(this);
        synchronized (this.f12506a) {
            mo15691a(new bai(this, bad), new baj(this, bad));
            C3513t.m12631a(this.f12509d >= 0);
            this.f12509d++;
        }
        return bad;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo15039d() {
        synchronized (this.f12506a) {
            C3513t.m12631a(this.f12509d > 0);
            C3900je.m17043a("Releasing 1 reference for JS Engine");
            this.f12509d--;
            m15871f();
        }
    }

    /* renamed from: e */
    public final void mo15040e() {
        synchronized (this.f12506a) {
            C3513t.m12631a(this.f12509d >= 0);
            C3900je.m17043a("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f12508c = true;
            m15871f();
        }
    }
}
