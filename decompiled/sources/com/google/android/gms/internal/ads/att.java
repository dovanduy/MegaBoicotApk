package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class att implements C4125rn {

    /* renamed from: a */
    private final ats f12219a;

    /* renamed from: b */
    private final Map f12220b;

    /* renamed from: c */
    private final C3695bq f12221c;

    att(ats ats, Map map, C3695bq bqVar) {
        this.f12219a = ats;
        this.f12220b = map;
        this.f12221c = bqVar;
    }

    /* renamed from: a */
    public final void mo12684a(boolean z) {
        ats ats = this.f12219a;
        Map map = this.f12220b;
        C3695bq bqVar = this.f12221c;
        ats.f12217a.f12216b = (String) map.get(TtmlNode.ATTR_ID);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("messageType", "htmlLoaded");
            jSONObject.put(TtmlNode.ATTR_ID, ats.f12217a.f12216b);
            bqVar.mo15207a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            C3900je.m17430b("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
