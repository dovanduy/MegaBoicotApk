package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.na */
final /* synthetic */ class C4004na implements Runnable {

    /* renamed from: a */
    private final C4019np f13601a;

    /* renamed from: b */
    private final C4008ne f13602b;

    C4004na(C4019np npVar, C4008ne neVar) {
        this.f13601a = npVar;
        this.f13602b = neVar;
    }

    public final void run() {
        Throwable e;
        C4019np npVar = this.f13601a;
        try {
            npVar.mo15686b(this.f13602b.get());
        } catch (ExecutionException e2) {
            e = e2.getCause();
            npVar.mo15685a(e);
        } catch (InterruptedException e3) {
            e = e3;
            Thread.currentThread().interrupt();
            npVar.mo15685a(e);
        } catch (Exception e4) {
            npVar.mo15685a(e4);
        }
    }
}
