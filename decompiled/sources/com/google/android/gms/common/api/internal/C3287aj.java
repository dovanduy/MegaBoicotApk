package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.aj */
abstract class C3287aj implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3389z f9541a;

    private C3287aj(C3389z zVar) {
        this.f9541a = zVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13181a();

    public void run() {
        this.f9541a.f9810b.lock();
        try {
            if (!Thread.interrupted()) {
                mo13181a();
                this.f9541a.f9810b.unlock();
            }
        } catch (RuntimeException e) {
            this.f9541a.f9809a.mo13212a(e);
        } finally {
            this.f9541a.f9810b.unlock();
        }
    }

    /* synthetic */ C3287aj(C3389z zVar, C3278aa aaVar) {
        this(zVar);
    }
}
