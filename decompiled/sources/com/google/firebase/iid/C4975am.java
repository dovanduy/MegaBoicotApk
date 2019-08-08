package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.am */
final /* synthetic */ class C4975am implements Executor {

    /* renamed from: a */
    static final Executor f16204a = new C4975am();

    private C4975am() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
