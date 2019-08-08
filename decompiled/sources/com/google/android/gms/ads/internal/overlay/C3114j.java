package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.gms.ads.internal.overlay.j */
final class C3114j implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Drawable f9109a;

    /* renamed from: b */
    private final /* synthetic */ C3113i f9110b;

    C3114j(C3113i iVar, Drawable drawable) {
        this.f9110b = iVar;
        this.f9109a = drawable;
    }

    public final void run() {
        this.f9110b.f9108a.f9080a.getWindow().setBackgroundDrawable(this.f9109a);
    }
}
