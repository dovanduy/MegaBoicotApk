package com.google.android.gms.internal.ads;

final class aip implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ avm f11147a;

    /* renamed from: b */
    private final /* synthetic */ aho f11148b;

    aip(aho aho, avm avm) {
        this.f11148b = aho;
        this.f11147a = avm;
    }

    public final void run() {
        try {
            this.f11148b.f11078c.put(this.f11147a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
