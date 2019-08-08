package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.overlay.C3107c;
import com.google.android.gms.internal.ads.C3900je;
import com.google.android.gms.internal.ads.C4089qe;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.w */
final class C3093w implements C3067ae<C4089qe> {
    C3093w() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C4089qe qeVar = (C4089qe) obj;
        C3107c r = qeVar.mo15909r();
        if (r != null) {
            r.mo12660a();
            return;
        }
        C3107c s = qeVar.mo15910s();
        if (s != null) {
            s.mo12660a();
        } else {
            C3900je.m17435e("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
