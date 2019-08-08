package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.mx */
final /* synthetic */ class C4000mx implements Runnable {

    /* renamed from: a */
    private final C4019np f13592a;

    C4000mx(C4019np npVar) {
        this.f13592a = npVar;
    }

    public final void run() {
        this.f13592a.mo15685a(new TimeoutException());
    }
}
