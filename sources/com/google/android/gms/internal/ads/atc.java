package com.google.android.gms.internal.ads;

final class atc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ atb f12157a;

    atc(atb atb) {
        this.f12157a = atb;
    }

    public final void run() {
        if (this.f12157a.f12156n != null) {
            this.f12157a.f12156n.mo14846i();
            this.f12157a.f12156n.mo14845h();
            this.f12157a.f12156n.mo14848k();
        }
        this.f12157a.f12156n = null;
    }
}
