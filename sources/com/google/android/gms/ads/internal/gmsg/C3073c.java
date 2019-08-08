package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.internal.ads.C3718cm;
import java.util.Map;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.gmsg.c */
public final class C3073c implements C3067ae<Object> {

    /* renamed from: a */
    private final Context f8959a;

    public C3073c(Context context) {
        this.f8959a = context;
    }

    public final void zza(Object obj, Map<String, String> map) {
        if (C3025aw.m10908B().mo15388a(this.f8959a)) {
            C3025aw.m10908B().mo15386a(this.f8959a, (String) map.get("eventName"), (String) map.get("eventId"));
        }
    }
}
