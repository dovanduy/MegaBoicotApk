package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.am */
final class C3657am implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3878ij f11397a;

    /* renamed from: b */
    private final /* synthetic */ C3655ak f11398b;

    C3657am(C3655ak akVar, C3878ij ijVar) {
        this.f11398b = akVar;
        this.f11397a = ijVar;
    }

    public final void run() {
        synchronized (this.f11398b.f11244c) {
            C3655ak akVar = this.f11398b;
            akVar.f11242a.mo12428b(this.f11397a);
        }
    }
}
