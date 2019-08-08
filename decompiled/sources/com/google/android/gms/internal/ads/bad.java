package com.google.android.gms.internal.ads;

public final class bad extends C4025nv<ban> {

    /* renamed from: a */
    private final Object f12501a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final bah f12502b;

    /* renamed from: c */
    private boolean f12503c;

    public bad(bah bah) {
        this.f12502b = bah;
    }

    /* renamed from: c */
    public final void mo15037c() {
        synchronized (this.f12501a) {
            if (!this.f12503c) {
                this.f12503c = true;
                mo15691a(new bae(this), new C4023nt());
                mo15691a(new baf(this), new bag(this));
            }
        }
    }
}
