package com.facebook.ads.internal.p094u;

import android.text.TextUtils;
import com.appnext.base.p046b.C1245d;
import com.facebook.ads.internal.p086m.C1762a;
import com.facebook.ads.internal.p086m.C1764c;
import com.facebook.ads.internal.p086m.C1765d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.u.d */
public class C1850d {

    /* renamed from: a */
    private static C1850d f5891a = new C1850d();

    /* renamed from: a */
    public static synchronized C1850d m7780a() {
        C1850d dVar;
        synchronized (C1850d.class) {
            dVar = f5891a;
        }
        return dVar;
    }

    /* renamed from: a */
    private C1853f m7781a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONArray("placements").getJSONObject(0);
        C1764c cVar = new C1764c(C1765d.m7324a(jSONObject2.getJSONObject("definition")), jSONObject2.optString("feature_config"), jSONObject2.optString("ad_reporting_config"));
        if (jSONObject2.has("ads")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("ads");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                cVar.mo7597a(new C1762a(jSONObject3.optString("adapter"), jSONObject3.optString("data_model_type"), jSONObject3.optJSONObject("data"), jSONObject3.optJSONArray("trackers")));
            }
        }
        return new C1853f(cVar, jSONObject.optString("server_request_id"), jSONObject.optString("server_response"), jSONObject.optString("an_validation_uuid"));
    }

    /* renamed from: b */
    private C1854g m7782b(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONArray("placements").getJSONObject(0);
            return new C1854g(jSONObject.optString("message", ""), jSONObject.optInt("code", 0), new C1764c(C1765d.m7324a(jSONObject2.getJSONObject("definition")), jSONObject2.optString("feature_config"), jSONObject2.optString("ad_reporting_config")));
        } catch (JSONException unused) {
            return m7783c(jSONObject);
        }
    }

    /* renamed from: c */
    private C1854g m7783c(JSONObject jSONObject) {
        return new C1854g(jSONObject.optString("message", ""), jSONObject.optInt("code", 0), null);
    }

    /* renamed from: a */
    public C1851e mo7828a(String str) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(C1245d.f3961jd);
            char c = 65535;
            int hashCode = optString.hashCode();
            if (hashCode != 96432) {
                if (hashCode == 96784904 && optString.equals("error")) {
                    c = 1;
                }
            } else if (optString.equals("ads")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    return m7781a(jSONObject);
                case 1:
                    return m7782b(jSONObject);
                default:
                    JSONObject optJSONObject = jSONObject.optJSONObject("error");
                    if (optJSONObject != null) {
                        return m7783c(optJSONObject);
                    }
                    break;
            }
        }
        return new C1851e(C1852a.UNKNOWN);
    }
}
