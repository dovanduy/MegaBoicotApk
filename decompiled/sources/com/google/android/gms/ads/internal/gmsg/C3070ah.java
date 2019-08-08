package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3900je;
import java.util.Map;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.gmsg.ah */
public final class C3070ah implements C3067ae<Object> {

    /* renamed from: a */
    private final C3071ai f8957a;

    public C3070ah(C3071ai aiVar) {
        this.f8957a = aiVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            C3900je.m17430b("Fail to parse float", e);
        }
        this.f8957a.mo12613a(equals);
        this.f8957a.mo12614a(equals2, f);
    }
}
