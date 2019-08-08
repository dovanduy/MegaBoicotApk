package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cy */
final class C3730cy implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4021nr f12824a;

    /* renamed from: b */
    private final /* synthetic */ C3721cp f12825b;

    C3730cy(C3721cp cpVar, C4021nr nrVar) {
        this.f12825b = cpVar;
        this.f12824a = nrVar;
    }

    public final void run() {
        synchronized (this.f12825b.f12808d) {
            this.f12825b.f12805a = this.f12825b.mo15226a(this.f12825b.f12807c.f12895j, this.f12824a);
            if (this.f12825b.f12805a == null) {
                this.f12825b.m16491a(0, "Could not start the ad request service.");
                C3909jn.f13411a.removeCallbacks(this.f12825b.f12813i);
            }
        }
    }
}
