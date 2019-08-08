package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

final class ans implements Executor {

    /* renamed from: a */
    private final /* synthetic */ Handler f11566a;

    ans(C3661amr amr, Handler handler) {
        this.f11566a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f11566a.post(runnable);
    }
}
