package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.C3513t;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.ll */
public final class C3961ll {

    /* renamed from: a */
    private HandlerThread f13506a = null;

    /* renamed from: b */
    private Handler f13507b = null;

    /* renamed from: c */
    private int f13508c = 0;

    /* renamed from: d */
    private final Object f13509d = new Object();

    /* renamed from: a */
    public final Looper mo15603a() {
        Looper looper;
        synchronized (this.f13509d) {
            if (this.f13508c != 0) {
                C3513t.m12626a(this.f13506a, (Object) "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f13506a == null) {
                C3900je.m17043a("Starting the looper thread.");
                this.f13506a = new HandlerThread("LooperProvider");
                this.f13506a.start();
                this.f13507b = new Handler(this.f13506a.getLooper());
                C3900je.m17043a("Looper thread started.");
            } else {
                C3900je.m17043a("Resuming the looper thread");
                this.f13509d.notifyAll();
            }
            this.f13508c++;
            looper = this.f13506a.getLooper();
        }
        return looper;
    }

    /* renamed from: b */
    public final Handler mo15604b() {
        return this.f13507b;
    }
}
