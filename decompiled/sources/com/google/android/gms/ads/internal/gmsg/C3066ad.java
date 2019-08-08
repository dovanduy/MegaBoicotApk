package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C4089qe;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.ad */
final class C3066ad implements C3067ae<C4089qe> {
    C3066ad() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C4089qe qeVar = (C4089qe) obj;
        if (map.keySet().contains(TtmlNode.START)) {
            qeVar.mo15889e(true);
        }
        if (map.keySet().contains("stop")) {
            qeVar.mo15889e(false);
        }
    }
}
