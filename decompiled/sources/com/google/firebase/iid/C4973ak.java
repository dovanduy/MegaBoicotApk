package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.ak */
final class C4973ak {

    /* renamed from: a */
    private static final Executor f16202a = C4975am.f16204a;

    /* renamed from: a */
    static Executor m21639a() {
        return f16202a;
    }

    /* renamed from: b */
    static Executor m21640b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), C4974al.f16203a);
        return threadPoolExecutor;
    }

    /* renamed from: a */
    static final /* synthetic */ Thread m21638a(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
