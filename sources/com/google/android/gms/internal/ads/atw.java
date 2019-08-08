package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.C3067ae;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class atw implements C3067ae<Object> {

    /* renamed from: a */
    private final /* synthetic */ C3695bq f12226a;

    /* renamed from: b */
    private final /* synthetic */ atr f12227b;

    atw(atr atr, C3695bq bqVar) {
        this.f12227b = atr;
        this.f12226a = bqVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            jSONObject.put(TtmlNode.ATTR_ID, this.f12227b.f12216b);
            this.f12226a.mo15207a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            C3900je.m17430b("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
