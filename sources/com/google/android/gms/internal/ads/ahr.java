package com.google.android.gms.internal.ads;

final class ahr implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f11085a;

    /* renamed from: b */
    private final /* synthetic */ boolean f11086b;

    /* renamed from: c */
    private final /* synthetic */ ahn f11087c;

    ahr(ahn ahn, int i, boolean z) {
        this.f11087c = ahn;
        this.f11085a = i;
        this.f11086b = z;
    }

    public final void run() {
        C4378zo b = this.f11087c.mo14305b(this.f11085a, this.f11086b);
        this.f11087c.f11066k = b;
        if (ahn.m14129b(this.f11085a, b)) {
            this.f11087c.mo14303a(this.f11085a + 1, this.f11086b);
        }
    }
}
