package com.google.android.gms.ads.internal.gmsg;

import com.appnext.base.p046b.C1245d;
import com.google.android.gms.internal.ads.C4089qe;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.ab */
final class C3064ab implements C3067ae<C4089qe> {
    C3064ab() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C4089qe qeVar = (C4089qe) obj;
        String str = (String) map.get(C1245d.f3959jb);
        if ("pause".equals(str)) {
            qeVar.mo12502j_();
            return;
        }
        if ("resume".equals(str)) {
            qeVar.mo12503k_();
        }
    }
}
