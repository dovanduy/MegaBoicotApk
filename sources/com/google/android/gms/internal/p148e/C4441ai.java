package com.google.android.gms.internal.p148e;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.e.ai */
final class C4441ai extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ C4439ag f14662a;

    C4441ai(C4439ag agVar, Handler handler) {
        this.f14662a = agVar;
        super(null);
    }

    public final void onChange(boolean z) {
        this.f14662a.mo16341b();
    }
}
