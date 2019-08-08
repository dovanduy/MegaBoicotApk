package com.google.android.gms.p143d;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.d.i */
public final class C3585i {

    /* renamed from: a */
    public static final Executor f10207a = new C3586a();

    /* renamed from: b */
    static final Executor f10208b = new C3604y();

    /* renamed from: com.google.android.gms.d.i$a */
    private static final class C3586a implements Executor {

        /* renamed from: a */
        private final Handler f10209a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f10209a.post(runnable);
        }
    }
}
