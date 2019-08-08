package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C3900je;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.y */
final class C3095y implements C3067ae<Object> {
    C3095y() {
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = "Received log message: ";
        String valueOf = String.valueOf((String) map.get("string"));
        C3900je.m17433d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
