package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qs */
final class C4103qs implements C3067ae<C4089qe> {

    /* renamed from: a */
    private final /* synthetic */ C4102qr f13916a;

    C4103qs(C4102qr qrVar) {
        this.f13916a = qrVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f13916a) {
                        if (this.f13916a.f13874B != parseInt) {
                            this.f13916a.f13874B = parseInt;
                            this.f13916a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    C3900je.m17432c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
