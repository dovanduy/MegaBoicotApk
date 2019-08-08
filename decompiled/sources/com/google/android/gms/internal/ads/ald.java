package com.google.android.gms.internal.ads;

import android.view.View;

final class ald implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ View f11346a;

    /* renamed from: b */
    private final /* synthetic */ alc f11347b;

    ald(alc alc, View view) {
        this.f11347b = alc;
        this.f11346a = view;
    }

    public final void run() {
        this.f11347b.mo14479a(this.f11346a);
    }
}
