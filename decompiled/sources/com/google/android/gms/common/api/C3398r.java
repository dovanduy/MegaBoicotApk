package com.google.android.gms.common.api;

import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.r */
public abstract class C3398r {
    @GuardedBy("sLock")

    /* renamed from: a */
    private static final Map<Object, C3398r> f9833a = new WeakHashMap();

    /* renamed from: b */
    private static final Object f9834b = new Object();

    /* renamed from: a */
    public abstract void mo13380a(int i);
}
