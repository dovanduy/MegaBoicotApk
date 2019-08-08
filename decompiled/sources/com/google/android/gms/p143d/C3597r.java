package com.google.android.gms.p143d;

/* renamed from: com.google.android.gms.d.r */
final class C3597r implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3583g f10228a;

    /* renamed from: b */
    private final /* synthetic */ C3596q f10229b;

    C3597r(C3596q qVar, C3583g gVar) {
        this.f10229b = qVar;
        this.f10228a = gVar;
    }

    public final void run() {
        synchronized (this.f10229b.f10226b) {
            if (this.f10229b.f10227c != null) {
                this.f10229b.f10227c.mo13295a(this.f10228a);
            }
        }
    }
}
