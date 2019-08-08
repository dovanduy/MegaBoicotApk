package com.google.android.gms.common.util.p142a;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.p146c.C4421e;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.util.a.a */
public class C3546a implements Executor {

    /* renamed from: a */
    private final Handler f10167a;

    public C3546a(Looper looper) {
        this.f10167a = new C4421e(looper);
    }

    public void execute(Runnable runnable) {
        this.f10167a.post(runnable);
    }
}
