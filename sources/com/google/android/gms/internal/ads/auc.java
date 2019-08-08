package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

final class auc implements ati {

    /* renamed from: a */
    private final /* synthetic */ View f12263a;

    /* renamed from: b */
    private final /* synthetic */ aua f12264b;

    auc(aua aua, View view) {
        this.f12264b = aua;
        this.f12263a = view;
    }

    /* renamed from: a */
    public final void mo14806a() {
        if (this.f12264b.m15342a(aua.f12250a)) {
            this.f12264b.onClick(this.f12263a);
        }
    }

    /* renamed from: a */
    public final void mo14807a(MotionEvent motionEvent) {
        this.f12264b.onTouch(null, motionEvent);
    }
}
