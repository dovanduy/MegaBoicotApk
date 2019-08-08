package com.google.android.gms.internal.ads;

final class ata implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ asz f12142a;

    ata(asz asz) {
        this.f12142a = asz;
    }

    public final void run() {
        if (this.f12142a.f12138p != null) {
            this.f12142a.f12138p.mo14846i();
            this.f12142a.f12138p.mo14845h();
            this.f12142a.f12138p.mo14848k();
        }
        this.f12142a.f12138p = null;
    }
}
