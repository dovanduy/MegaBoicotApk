package com.google.android.gms.common.util.p142a;

import android.os.Process;

/* renamed from: com.google.android.gms.common.util.a.d */
final class C3549d implements Runnable {

    /* renamed from: a */
    private final Runnable f10175a;

    /* renamed from: b */
    private final int f10176b;

    public C3549d(Runnable runnable, int i) {
        this.f10175a = runnable;
        this.f10176b = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f10176b);
        this.f10175a.run();
    }
}
