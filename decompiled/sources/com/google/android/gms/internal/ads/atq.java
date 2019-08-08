package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class atq implements C3067ae<Object> {

    /* renamed from: a */
    private final WeakReference<atm> f12213a;

    /* renamed from: b */
    private final String f12214b;

    public atq(atm atm, String str) {
        this.f12213a = new WeakReference<>(atm);
        this.f12214b = str;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("ads_id");
        String str2 = (String) map.get("eventName");
        if (!TextUtils.isEmpty(str) && this.f12214b.equals(str)) {
            try {
                Integer.parseInt((String) map.get("eventType"));
            } catch (Exception e) {
                C3900je.m17430b("Parse Scion log event type error", e);
            }
            if ("_ai".equals(str2)) {
                atm atm = (atm) this.f12213a.get();
                if (atm != null) {
                    atm.mo14863y();
                }
                return;
            }
            if ("_ac".equals(str2)) {
                atm atm2 = (atm) this.f12213a.get();
                if (atm2 != null) {
                    atm2.mo14864z();
                }
            }
        }
    }
}
