package com.google.android.gms.internal.ads;

final class azz implements C4024nu<aze> {

    /* renamed from: a */
    private final /* synthetic */ bah f12493a;

    /* renamed from: b */
    private final /* synthetic */ azq f12494b;

    azz(azq azq, bah bah) {
        this.f12494b = azq;
        this.f12493a = bah;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14411a(Object obj) {
        synchronized (this.f12494b.f12464a) {
            this.f12494b.f12471h = 0;
            if (!(this.f12494b.f12470g == null || this.f12493a == this.f12494b.f12470g)) {
                C3900je.m17043a("New JS engine is loaded, marking previous one as destroyable.");
                this.f12494b.f12470g.mo15040e();
            }
            this.f12494b.f12470g = this.f12493a;
        }
    }
}
