package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C3132s;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.internal.ads.av */
final class C3673av implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f12277a;

    /* renamed from: b */
    private final /* synthetic */ C3672au f12278b;

    C3673av(C3672au auVar, CountDownLatch countDownLatch) {
        this.f12278b = auVar;
        this.f12277a = countDownLatch;
    }

    public final void run() {
        synchronized (this.f12278b.f11245d) {
            this.f12278b.f12249m = C3132s.m11240a(this.f12278b.f12248l, this.f12278b.f12243g, this.f12277a);
        }
    }
}
