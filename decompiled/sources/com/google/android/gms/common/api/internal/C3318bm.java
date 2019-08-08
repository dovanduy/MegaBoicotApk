package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.p142a.C3548c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.internal.bm */
public final class C3318bm {

    /* renamed from: a */
    private static final ExecutorService f9618a;

    /* renamed from: a */
    public static ExecutorService m11838a() {
        return f9618a;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C3548c("GAC_Transform"));
        f9618a = threadPoolExecutor;
    }
}
