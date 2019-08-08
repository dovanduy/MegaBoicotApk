package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C3718cm;
import com.google.android.gms.internal.ads.C3900je;
import java.util.Map;

@C3718cm
/* renamed from: com.google.android.gms.ads.internal.gmsg.l */
public final class C3082l implements C3067ae<Object> {

    /* renamed from: a */
    private final C3083m f8981a;

    public C3082l(C3083m mVar) {
        this.f8981a = mVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("name");
        if (str == null) {
            C3900je.m17435e("App event with no name parameter.");
        } else {
            this.f8981a.mo12422a(str, (String) map.get("info"));
        }
    }
}
