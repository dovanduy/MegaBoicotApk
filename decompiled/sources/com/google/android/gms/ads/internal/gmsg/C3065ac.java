package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C4089qe;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.ac */
final class C3065ac implements C3067ae<C4089qe> {
    C3065ac() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C4089qe qeVar = (C4089qe) obj;
        if (map.keySet().contains(TtmlNode.START)) {
            qeVar.mo15919v().mo15948h();
        } else if (map.keySet().contains("stop")) {
            qeVar.mo15919v().mo15949i();
        } else {
            if (map.keySet().contains("cancel")) {
                qeVar.mo15919v().mo15950j();
            }
        }
    }
}
