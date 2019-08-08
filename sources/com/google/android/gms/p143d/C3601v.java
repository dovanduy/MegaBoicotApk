package com.google.android.gms.p143d;

/* renamed from: com.google.android.gms.d.v */
final class C3601v implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3583g f10238a;

    /* renamed from: b */
    private final /* synthetic */ C3600u f10239b;

    C3601v(C3600u uVar, C3583g gVar) {
        this.f10239b = uVar;
        this.f10238a = gVar;
    }

    public final void run() {
        synchronized (this.f10239b.f10236b) {
            if (this.f10239b.f10237c != null) {
                this.f10239b.f10237c.mo13707a(this.f10238a.mo13718d());
            }
        }
    }
}
