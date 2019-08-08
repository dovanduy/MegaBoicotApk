package com.facebook.ads.internal.adapters.p072b;

import com.facebook.ads.internal.view.p101c.C1982f;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.b.n */
public class C1605n implements Serializable {

    /* renamed from: a */
    private static final C1982f f4949a = C1982f.PORTRAIT;

    /* renamed from: b */
    private static final C1607p f4950b = C1607p.FILE_PRECACHE;
    private static final long serialVersionUID = -5352540123250859603L;

    /* renamed from: c */
    private final String f4951c;

    /* renamed from: d */
    private final String f4952d;

    /* renamed from: e */
    private final int f4953e;

    /* renamed from: f */
    private final String f4954f;

    /* renamed from: g */
    private final String f4955g;

    /* renamed from: h */
    private final int f4956h;

    /* renamed from: i */
    private final boolean f4957i;

    /* renamed from: j */
    private final boolean f4958j;

    /* renamed from: k */
    private final C1982f f4959k;

    /* renamed from: l */
    private final C1607p f4960l;

    /* renamed from: m */
    private String f4961m;

    private C1605n(String str, String str2, int i, String str3, String str4, C1982f fVar, int i2, boolean z, boolean z2, C1607p pVar) {
        this.f4951c = str;
        this.f4952d = str2;
        this.f4953e = i;
        this.f4954f = str3;
        this.f4955g = str4;
        this.f4959k = fVar;
        this.f4956h = i2;
        this.f4957i = z;
        this.f4958j = z2;
        this.f4960l = pVar;
    }

    /* renamed from: a */
    public static C1605n m6686a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("playable_data");
        if (optJSONObject == null) {
            return null;
        }
        C1607p a = C1607p.m6708a(optJSONObject.optString("precaching_method", f4950b.name()));
        String optString = optJSONObject.optString("uri");
        String optString2 = optJSONObject.optString("intro_card_icon_url");
        int optInt = jSONObject.has("skippable_seconds") ? jSONObject.optInt("skippable_seconds") : jSONObject.optInt("unskippable_seconds", 0);
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("generic_text");
        String optString3 = optJSONObject2 == null ? "Rewarded Play" : optJSONObject2.optString("rewarded_play_text", "Rewarded Play");
        JSONObject optJSONObject3 = optJSONObject.optJSONObject("generic_text");
        C1605n nVar = new C1605n(optString, optString2, optInt, optString3, optJSONObject3 == null ? "Play Store will automatically open in [secs]s" : optJSONObject3.optString("delay_click_text", "Play Store will automatically open in [secs]s"), C1982f.m8155a(optJSONObject.optInt("orientation", f4949a.mo8123a())), optJSONObject.optInt("web_view_timeout_in_milliseconds", 5000), optJSONObject.optBoolean("enable_intro_card", true), optJSONObject.optBoolean("enable_end_card"), a);
        return nVar;
    }

    /* renamed from: a */
    public String mo7209a() {
        return this.f4951c;
    }

    /* renamed from: a */
    public void mo7210a(String str) {
        this.f4961m = str;
    }

    /* renamed from: b */
    public String mo7211b() {
        return this.f4952d;
    }

    /* renamed from: c */
    public int mo7212c() {
        return this.f4953e;
    }

    /* renamed from: d */
    public String mo7213d() {
        return this.f4954f;
    }

    /* renamed from: e */
    public String mo7214e() {
        return this.f4955g;
    }

    /* renamed from: f */
    public C1982f mo7215f() {
        return this.f4959k;
    }

    /* renamed from: g */
    public int mo7216g() {
        return this.f4956h;
    }

    /* renamed from: h */
    public boolean mo7217h() {
        return this.f4957i;
    }

    /* renamed from: i */
    public boolean mo7218i() {
        return this.f4958j;
    }

    /* renamed from: j */
    public String mo7219j() {
        return this.f4961m;
    }

    /* renamed from: k */
    public C1607p mo7220k() {
        return this.f4960l;
    }
}
