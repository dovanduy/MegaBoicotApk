package com.facebook.ads.internal.p070a;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.a.g */
public class C1569g {

    /* renamed from: a */
    private final String f4817a;

    /* renamed from: b */
    private final String f4818b;

    /* renamed from: c */
    private final String f4819c;

    /* renamed from: d */
    private final List<String> f4820d;

    /* renamed from: e */
    private final String f4821e;

    /* renamed from: f */
    private final String f4822f;

    private C1569g(String str, String str2, String str3, List<String> list, String str4, String str5) {
        this.f4817a = str;
        this.f4818b = str2;
        this.f4819c = str3;
        this.f4820d = list;
        this.f4821e = str4;
        this.f4822f = str5;
    }

    /* renamed from: a */
    public static C1569g m6510a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("package");
        String optString2 = jSONObject.optString("appsite");
        String optString3 = jSONObject.optString("appsite_url");
        JSONArray optJSONArray = jSONObject.optJSONArray("key_hashes");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i));
            }
        }
        C1569g gVar = new C1569g(optString, optString2, optString3, arrayList, jSONObject.optString("market_uri"), jSONObject.optString("fallback_url"));
        return gVar;
    }

    /* renamed from: a */
    public String mo7066a() {
        return this.f4817a;
    }

    /* renamed from: b */
    public String mo7067b() {
        return this.f4818b;
    }

    /* renamed from: c */
    public String mo7068c() {
        return this.f4819c;
    }
}
