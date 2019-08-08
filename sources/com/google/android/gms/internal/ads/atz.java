package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

final class atz implements ati {

    /* renamed from: a */
    private final /* synthetic */ View f12241a;

    /* renamed from: b */
    private final /* synthetic */ aty f12242b;

    atz(aty aty, View view) {
        this.f12242b = aty;
        this.f12241a = view;
    }

    /* renamed from: a */
    public final void mo14806a() {
        this.f12242b.onClick(this.f12241a);
    }

    /* renamed from: a */
    public final void mo14807a(MotionEvent motionEvent) {
        this.f12242b.onTouch(null, motionEvent);
    }
}
