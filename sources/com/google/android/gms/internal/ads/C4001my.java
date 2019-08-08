package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.my */
final /* synthetic */ class C4001my implements Runnable {

    /* renamed from: a */
    private final Future f13593a;

    C4001my(Future future) {
        this.f13593a = future;
    }

    public final void run() {
        Future future = this.f13593a;
        if (!future.isDone()) {
            future.cancel(true);
        }
    }
}
