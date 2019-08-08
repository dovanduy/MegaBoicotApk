package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: com.google.android.gms.internal.ads.qj */
final class C4094qj implements OnAttachStateChangeListener {

    /* renamed from: a */
    private final /* synthetic */ C3862hu f13850a;

    /* renamed from: b */
    private final /* synthetic */ C4090qf f13851b;

    C4094qj(C4090qf qfVar, C3862hu huVar) {
        this.f13851b = qfVar;
        this.f13850a = huVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f13851b.m17716a(view, this.f13850a, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
