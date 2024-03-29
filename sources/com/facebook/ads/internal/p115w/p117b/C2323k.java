package com.facebook.ads.internal.p115w.p117b;

import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.w.b.k */
public class C2323k {
    /* renamed from: a */
    public static String m9046a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                try {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static String m9047a(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString(str, null);
        if ("null".equals(optString)) {
            return null;
        }
        return optString;
    }
}
