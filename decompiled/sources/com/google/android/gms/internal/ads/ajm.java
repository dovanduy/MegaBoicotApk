package com.google.android.gms.internal.ads;

import android.database.ContentObserver;
import android.os.Handler;

final class ajm extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ ajj f11214a;

    public ajm(ajj ajj, Handler handler) {
        this.f11214a = ajj;
        super(handler);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        this.f11214a.mo14383a();
    }
}
