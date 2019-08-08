package com.google.android.gms.internal.ads;

final class bbw implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4008ne f12637a;

    /* renamed from: b */
    private final /* synthetic */ bbu f12638b;

    bbw(bbu bbu, C4008ne neVar) {
        this.f12638b = bbu;
        this.f12637a = neVar;
    }

    public final void run() {
        for (C4008ne neVar : this.f12638b.f12630k.keySet()) {
            if (neVar != this.f12637a) {
                ((bbo) this.f12638b.f12630k.get(neVar)).mo15071a();
            }
        }
    }
}
