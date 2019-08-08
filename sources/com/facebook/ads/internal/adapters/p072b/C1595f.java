package com.facebook.ads.internal.adapters.p072b;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.b.f */
public class C1595f extends C1585a {

    /* renamed from: a */
    private C1596g f4901a;

    /* renamed from: b */
    private C1587c f4902b;

    /* renamed from: c */
    private List<C1608q> f4903c;

    /* renamed from: d */
    private String f4904d;

    /* renamed from: e */
    private String f4905e;

    /* renamed from: f */
    private String f4906f;

    private C1595f(C1596g gVar, Map<String, String> map, C1587c cVar, List<C1608q> list) {
        this.f4901a = gVar;
        this.f4902b = cVar;
        this.f4903c = list;
        this.f4904d = map.containsKey("background_color") ? (String) map.get("background_color") : "#FF23272F";
        this.f4906f = map.containsKey("timer_text_color") ? (String) map.get("timer_text_color") : "#FFFFFF";
        this.f4905e = map.containsKey("title_text_color") ? (String) map.get("title_text_color") : "#FFFFFF";
    }

    /* renamed from: a */
    public static C1595f m6626a(JSONObject jSONObject) {
        C1596g a = C1596g.m6636a(jSONObject.optJSONObject("translations"));
        JSONObject optJSONObject = jSONObject.optJSONObject(TtmlNode.TAG_LAYOUT);
        HashMap hashMap = new HashMap();
        if (optJSONObject != null) {
            m6627a(optJSONObject, hashMap, "background_color");
            m6627a(optJSONObject, hashMap, "timer_text_color");
            m6627a(optJSONObject, hashMap, "title_text_color");
        }
        C1587c a2 = C1587c.m6568a(jSONObject.optJSONObject("ad_config"));
        JSONArray optJSONArray = jSONObject.optJSONArray("choosable_ads");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                C1608q a3 = C1608q.m6709a(optJSONArray.optJSONObject(i));
                a3.mo7228a(true);
                arrayList.add(a3);
            }
        }
        return new C1595f(a, hashMap, a2, arrayList);
    }

    /* renamed from: a */
    private static void m6627a(JSONObject jSONObject, HashMap<String, String> hashMap, String str) {
        String optString = jSONObject.optString(str);
        if (!TextUtils.isEmpty(optString)) {
            hashMap.put(str, optString);
        }
    }

    /* renamed from: a */
    public String mo7113a() {
        if (this.f4903c.isEmpty()) {
            return null;
        }
        return ((C1608q) this.f4903c.get(0)).mo7113a();
    }

    /* renamed from: b */
    public void mo7117b(String str) {
        super.mo7117b(str);
        for (C1608q b : this.f4903c) {
            b.mo7117b(str);
        }
    }

    /* renamed from: e */
    public C1596g mo7162e() {
        return this.f4901a;
    }

    /* renamed from: f */
    public String mo7163f() {
        return this.f4904d;
    }

    /* renamed from: g */
    public String mo7164g() {
        return this.f4906f;
    }

    /* renamed from: h */
    public String mo7165h() {
        return this.f4905e;
    }

    /* renamed from: i */
    public C1587c mo7166i() {
        return this.f4902b;
    }

    /* renamed from: j */
    public List<C1608q> mo7167j() {
        return this.f4903c;
    }
}
