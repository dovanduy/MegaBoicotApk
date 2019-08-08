package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: com.google.android.gms.internal.ads.rw */
final class C4134rw implements OnAttachStateChangeListener {

    /* renamed from: a */
    private final /* synthetic */ C3862hu f13984a;

    /* renamed from: b */
    private final /* synthetic */ C4131rt f13985b;

    C4134rw(C4131rt rtVar, C3862hu huVar) {
        this.f13985b = rtVar;
        this.f13984a = huVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f13985b.m17985a(view, this.f13984a, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
