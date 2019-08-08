package com.google.android.gms.internal.ads;

final class atf implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ atd f12167a;

    atf(atd atd) {
        this.f12167a = atd;
    }

    public final void run() {
        if (this.f12167a.f12165h != null) {
            this.f12167a.f12165h.mo14846i();
            this.f12167a.f12165h.mo14845h();
        }
        this.f12167a.f12165h = null;
    }
}
