package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ek */
public final class C3771ek implements C3067ae<Object> {
    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("request_id");
        String str2 = "Invalid request: ";
        String valueOf = String.valueOf((String) map.get("errors"));
        C3900je.m17435e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        C3763ec.f12926f.mo12616b(str);
    }
}
