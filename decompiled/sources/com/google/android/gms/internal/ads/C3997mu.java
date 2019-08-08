package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.mu */
final /* synthetic */ class C3997mu implements Runnable {

    /* renamed from: a */
    private final C3993mq f13584a;

    /* renamed from: b */
    private final C4008ne f13585b;

    C3997mu(C3993mq mqVar, C4008ne neVar) {
        this.f13584a = mqVar;
        this.f13585b = neVar;
    }

    public final void run() {
        Throwable e;
        C3993mq mqVar = this.f13584a;
        try {
            mqVar.mo15218a(this.f13585b.get());
        } catch (ExecutionException e2) {
            e = e2.getCause();
            mqVar.mo15219a(e);
        } catch (InterruptedException e3) {
            e = e3;
            Thread.currentThread().interrupt();
            mqVar.mo15219a(e);
        } catch (Exception e4) {
            e = e4;
            mqVar.mo15219a(e);
        }
    }
}
