package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.cn */
final class C3349cn implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3348cm f9698a;

    C3349cn(C3348cm cmVar) {
        this.f9698a = cmVar;
    }

    public final void run() {
        this.f9698a.f9696m.lock();
        try {
            this.f9698a.m11947e();
        } finally {
            this.f9698a.f9696m.unlock();
        }
    }
}
