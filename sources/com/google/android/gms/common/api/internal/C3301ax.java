package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.p142a.C3548c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.gms.common.api.internal.ax */
public final class C3301ax {

    /* renamed from: a */
    private static final ExecutorService f9597a = Executors.newFixedThreadPool(2, new C3548c("GAC_Executor"));

    /* renamed from: a */
    public static ExecutorService m11806a() {
        return f9597a;
    }
}
