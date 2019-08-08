package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.ci */
final class C3344ci extends C3312bg {

    /* renamed from: a */
    private final /* synthetic */ Dialog f9679a;

    /* renamed from: b */
    private final /* synthetic */ C3343ch f9680b;

    C3344ci(C3343ch chVar, Dialog dialog) {
        this.f9680b = chVar;
        this.f9679a = dialog;
    }

    /* renamed from: a */
    public final void mo13206a() {
        this.f9680b.f9677a.mo13283h();
        if (this.f9679a.isShowing()) {
            this.f9679a.dismiss();
        }
    }
}
