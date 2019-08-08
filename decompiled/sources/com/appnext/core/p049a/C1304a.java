package com.appnext.core.p049a;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appnext.core.a.a */
public final class C1304a {

    /* renamed from: lP */
    private HashMap<String, String> f4122lP;

    /* renamed from: lQ */
    private HashMap<String, HashMap<String, String>> f4123lQ = new HashMap<>();

    public C1304a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4122lP = m5590d(jSONObject.getJSONObject(C1305b.f4125lS));
            this.f4123lQ.put(C1305b.f4126lT, m5590d(jSONObject.getJSONObject(C1305b.f4126lT)));
            this.f4123lQ.put(C1305b.f4127lU, m5590d(jSONObject.getJSONObject(C1305b.f4127lU)));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: t */
    public final String mo6202t(String str, String str2) {
        if (this.f4123lQ.containsKey(str)) {
            return (String) ((HashMap) this.f4123lQ.get(str)).get(str2);
        }
        return null;
    }

    /* renamed from: O */
    public final String mo6201O(String str) {
        return (String) this.f4122lP.get(str);
    }

    /* renamed from: d */
    private static HashMap<String, String> m5590d(JSONObject jSONObject) throws JSONException {
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            hashMap.put(str, jSONObject.getString(str));
        }
        return hashMap;
    }
}
