package com.google.android.gms.internal.ads;

final class baa implements C4022ns {

    /* renamed from: a */
    private final /* synthetic */ bah f12497a;

    /* renamed from: b */
    private final /* synthetic */ azq f12498b;

    baa(azq azq, bah bah) {
        this.f12498b = azq;
        this.f12497a = bah;
    }

    /* renamed from: a */
    public final void mo14412a() {
        synchronized (this.f12498b.f12464a) {
            this.f12498b.f12471h = 1;
            C3900je.m17043a("Failed loading new engine. Marking new engine destroyable.");
            this.f12497a.mo15040e();
        }
    }
}
