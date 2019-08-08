package com.google.android.gms.p143d;

/* renamed from: com.google.android.gms.d.t */
final class C3599t implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3583g f10233a;

    /* renamed from: b */
    private final /* synthetic */ C3598s f10234b;

    C3599t(C3598s sVar, C3583g gVar) {
        this.f10234b = sVar;
        this.f10233a = gVar;
    }

    public final void run() {
        synchronized (this.f10234b.f10231b) {
            if (this.f10234b.f10232c != null) {
                this.f10234b.f10232c.mo13706a(this.f10233a.mo13719e());
            }
        }
    }
}
