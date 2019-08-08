package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.nl */
final class C4015nl implements Executor {

    /* renamed from: a */
    private final Handler f13621a = new C3901jf(Looper.getMainLooper());

    C4015nl() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                C3025aw.m10917e();
                C3909jn.m17140a(C3025aw.m10921i().mo15450m(), th);
                throw th;
            }
        } else {
            this.f13621a.post(runnable);
        }
    }
}
