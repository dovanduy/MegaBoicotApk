package com.google.android.gms.internal.ads;

final class ath implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ atg f12185a;

    ath(atg atg) {
        this.f12185a = atg;
    }

    public final void run() {
        if (this.f12185a.f12184q != null) {
            this.f12185a.f12184q.mo14846i();
            this.f12185a.f12184q.mo14845h();
            this.f12185a.f12184q.mo14848k();
        }
        this.f12185a.f12184q = null;
    }
}
