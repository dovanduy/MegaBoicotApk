package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.util.Map;

final /* synthetic */ class azd implements Runnable {

    /* renamed from: a */
    private final azc f12437a;

    /* renamed from: b */
    private final C3067ae f12438b;

    /* renamed from: c */
    private final Map f12439c;

    azd(azc azc, C3067ae aeVar, Map map) {
        this.f12437a = azc;
        this.f12438b = aeVar;
        this.f12439c = map;
    }

    public final void run() {
        azc azc = this.f12437a;
        this.f12438b.zza(azc.mo15000o(), this.f12439c);
    }
}
