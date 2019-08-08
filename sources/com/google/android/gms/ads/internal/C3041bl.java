package com.google.android.gms.ads.internal;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.google.android.gms.ads.internal.bl */
final class C3041bl implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C3050bu f8905a;

    /* renamed from: b */
    private final /* synthetic */ C3038bi f8906b;

    C3041bl(C3038bi biVar, C3050bu buVar) {
        this.f8906b = biVar;
        this.f8905a = buVar;
    }

    public final void onClick(View view) {
        this.f8905a.mo12585a();
        if (this.f8906b.f8899b != null) {
            this.f8906b.f8899b.mo15373c();
        }
    }
}
