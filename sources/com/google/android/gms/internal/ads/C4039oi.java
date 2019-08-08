package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oi */
final class C4039oi implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f13663a;

    /* renamed from: b */
    private final /* synthetic */ int f13664b;

    /* renamed from: c */
    private final /* synthetic */ C4032ob f13665c;

    C4039oi(C4032ob obVar, int i, int i2) {
        this.f13665c = obVar;
        this.f13663a = i;
        this.f13664b = i2;
    }

    public final void run() {
        if (this.f13665c.f13654r != null) {
            this.f13665c.f13654r.mo15738a(this.f13663a, this.f13664b);
        }
    }
}
