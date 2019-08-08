package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.er */
final class C3778er implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Future f12976a;

    C3778er(C3775eo eoVar, Future future) {
        this.f12976a = future;
    }

    public final void run() {
        if (!this.f12976a.isDone()) {
            this.f12976a.cancel(true);
        }
    }
}
