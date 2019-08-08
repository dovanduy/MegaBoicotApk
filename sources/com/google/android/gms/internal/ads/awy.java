package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

final /* synthetic */ class awy implements Runnable {

    /* renamed from: a */
    private final C4019np f12334a;

    /* renamed from: b */
    private final Future f12335b;

    awy(C4019np npVar, Future future) {
        this.f12334a = npVar;
        this.f12335b = future;
    }

    public final void run() {
        C4019np npVar = this.f12334a;
        Future future = this.f12335b;
        if (npVar.isCancelled()) {
            future.cancel(true);
        }
    }
}
