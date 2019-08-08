package com.google.android.gms.internal.ads;

final class aoo implements Runnable {

    /* renamed from: a */
    private final avm f11635a;

    /* renamed from: b */
    private final bbm f11636b;

    /* renamed from: c */
    private final Runnable f11637c;

    public aoo(C3661amr amr, avm avm, bbm bbm, Runnable runnable) {
        this.f11635a = avm;
        this.f11636b = bbm;
        this.f11637c = runnable;
    }

    public final void run() {
        this.f11635a.mo14906g();
        if (this.f11636b.f12585c == null) {
            this.f11635a.mo14896a(this.f11636b.f12583a);
        } else {
            this.f11635a.mo14895a(this.f11636b.f12585c);
        }
        if (this.f11636b.f12586d) {
            this.f11635a.mo14899b("intermediate-response");
        } else {
            this.f11635a.mo14901c("done");
        }
        if (this.f11637c != null) {
            this.f11637c.run();
        }
    }
}
