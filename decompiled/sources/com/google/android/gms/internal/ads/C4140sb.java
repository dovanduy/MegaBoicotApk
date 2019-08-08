package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.sb */
final class C4140sb implements C3067ae<C4089qe> {

    /* renamed from: a */
    private final /* synthetic */ C4139sa f14034a;

    C4140sb(C4139sa saVar) {
        this.f14034a = saVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f14034a) {
                        if (this.f14034a.f14029v != parseInt) {
                            this.f14034a.f14029v = parseInt;
                            this.f14034a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    C3900je.m17432c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
