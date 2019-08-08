package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.av */
abstract class C3299av {

    /* renamed from: a */
    private final C3297at f9595a;

    protected C3299av(C3297at atVar) {
        this.f9595a = atVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13182a();

    /* renamed from: a */
    public final void mo13224a(C3298au auVar) {
        auVar.f9585f.lock();
        try {
            if (auVar.f9593n == this.f9595a) {
                mo13182a();
                auVar.f9585f.unlock();
            }
        } finally {
            auVar.f9585f.unlock();
        }
    }
}
