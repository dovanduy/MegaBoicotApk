package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.firebase.iid.al */
final /* synthetic */ class C4974al implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f16203a = new C4974al();

    private C4974al() {
    }

    public final Thread newThread(Runnable runnable) {
        return C4973ak.m21638a(runnable);
    }
}
