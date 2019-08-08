package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.nb */
final /* synthetic */ class C4005nb implements Runnable {

    /* renamed from: a */
    private final C4008ne f13603a;

    /* renamed from: b */
    private final Future f13604b;

    C4005nb(C4008ne neVar, Future future) {
        this.f13603a = neVar;
        this.f13604b = future;
    }

    public final void run() {
        C4008ne neVar = this.f13603a;
        Future future = this.f13604b;
        if (neVar.isCancelled()) {
            future.cancel(true);
        }
    }
}
