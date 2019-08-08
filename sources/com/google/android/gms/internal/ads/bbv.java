package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final class bbv implements Callable<bbr> {

    /* renamed from: a */
    private final /* synthetic */ bbo f12635a;

    /* renamed from: b */
    private final /* synthetic */ bbu f12636b;

    bbv(bbu bbu, bbo bbo) {
        this.f12636b = bbu;
        this.f12635a = bbo;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final bbr call() throws Exception {
        synchronized (this.f12636b.f12628i) {
            if (this.f12636b.f12629j) {
                return null;
            }
            return this.f12635a.mo15070a(this.f12636b.f12625f, this.f12636b.f12626g);
        }
    }
}
