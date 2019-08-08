package com.facebook.ads.internal.p093t;

import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.t.g */
public class C1834g {

    /* renamed from: a */
    private final String f5828a;

    /* renamed from: b */
    private final int f5829b;

    /* renamed from: c */
    private final int f5830c;

    public C1834g(String str, int i, int i2) {
        this.f5828a = str;
        this.f5829b = i;
        this.f5830c = i2;
    }

    /* renamed from: a */
    public static C1834g m7705a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("url");
        if (optString == null) {
            return null;
        }
        return new C1834g(optString, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }

    /* renamed from: a */
    public String mo7780a() {
        return this.f5828a;
    }

    /* renamed from: b */
    public int mo7781b() {
        return this.f5829b;
    }

    /* renamed from: c */
    public int mo7782c() {
        return this.f5830c;
    }
}
