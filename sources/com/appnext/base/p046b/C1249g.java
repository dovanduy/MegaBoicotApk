package com.appnext.base.p046b;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: com.appnext.base.b.g */
public class C1249g {

    /* renamed from: jo */
    private static C1249g f3972jo;
    private static Context mContext;

    /* renamed from: jp */
    private Handler f3973jp;

    /* renamed from: jq */
    private Handler f3974jq;

    /* renamed from: jr */
    private HandlerThread f3975jr;

    public C1249g() {
        try {
            this.f3973jp = new Handler(Looper.getMainLooper());
            this.f3975jr = new HandlerThread("ExecutesManagerWorkerThread");
            this.f3975jr.start();
            this.f3974jq = new Handler(this.f3975jr.getLooper());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ch */
    public static C1249g m5286ch() {
        if (f3972jo == null) {
            synchronized (C1249g.class) {
                if (f3972jo == null) {
                    f3972jo = new C1249g();
                }
            }
        }
        return f3972jo;
    }

    /* renamed from: a */
    public final void mo5953a(Runnable runnable) {
        if (runnable != null) {
            try {
                this.f3973jp.post(runnable);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo5954a(Runnable runnable, long j) {
        if (runnable != null) {
            try {
                this.f3973jp.postDelayed(runnable, j);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo5955b(Runnable runnable) {
        try {
            this.f3974jq.post(runnable);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo5956b(Runnable runnable, long j) {
        if (runnable != null) {
            try {
                this.f3974jq.postDelayed(runnable, j);
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            this.f3974jq.removeCallbacks(null);
            this.f3975jr.quit();
            super.finalize();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
