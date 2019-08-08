package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class ahp implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f11083a = Executors.defaultThreadFactory();

    ahp() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f11083a.newThread(runnable);
        newThread.setName(String.valueOf(newThread.getName()).concat(":"));
        return newThread;
    }
}
