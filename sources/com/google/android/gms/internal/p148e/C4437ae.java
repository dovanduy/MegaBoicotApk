package com.google.android.gms.internal.p148e;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.e.ae */
final class C4437ae extends ContentObserver {
    C4437ae(Handler handler) {
        super(null);
    }

    public final void onChange(boolean z) {
        C4436ad.f14643e.set(true);
    }
}
