package com.google.firebase.analytics.connector;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.analytics.connector.c */
final /* synthetic */ class C4924c implements Executor {

    /* renamed from: a */
    static final Executor f16071a = new C4924c();

    private C4924c() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
