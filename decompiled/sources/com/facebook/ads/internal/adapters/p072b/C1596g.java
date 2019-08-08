package com.facebook.ads.internal.adapters.p072b;

import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.b.g */
public class C1596g implements Serializable {
    private static final long serialVersionUID = 4559450202335985006L;

    /* renamed from: a */
    private final String f4907a;

    /* renamed from: b */
    private final String f4908b;

    private C1596g() {
        this.f4907a = "";
        this.f4908b = "";
    }

    private C1596g(String str, String str2) {
        this.f4907a = str;
        this.f4908b = str2;
    }

    /* renamed from: a */
    static C1596g m6636a(JSONObject jSONObject) {
        return jSONObject == null ? new C1596g() : new C1596g(jSONObject.optString("timer_text"), jSONObject.optString("title_text"));
    }

    /* renamed from: a */
    public String mo7168a() {
        return this.f4908b;
    }

    /* renamed from: a */
    public String mo7169a(String str) {
        return TextUtils.isEmpty(str) ? this.f4907a : this.f4907a.replace("[fb_sec]", str);
    }
}
