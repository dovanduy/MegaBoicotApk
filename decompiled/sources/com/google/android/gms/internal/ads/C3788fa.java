package com.google.android.gms.internal.ads;

import com.appnext.base.p046b.C1245d;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.fa */
public final class C3788fa {

    /* renamed from: a */
    private final List<String> f13032a;

    /* renamed from: b */
    private final String f13033b;

    /* renamed from: c */
    private final String f13034c;

    /* renamed from: d */
    private final String f13035d;

    /* renamed from: e */
    private final boolean f13036e;

    /* renamed from: f */
    private final String f13037f;

    /* renamed from: g */
    private final String f13038g;

    /* renamed from: h */
    private String f13039h;

    /* renamed from: i */
    private final int f13040i;

    /* renamed from: j */
    private final boolean f13041j;

    /* renamed from: k */
    private final JSONObject f13042k;

    public C3788fa(int i, Map<String, String> map) {
        this.f13039h = (String) map.get("url");
        this.f13033b = (String) map.get("base_uri");
        this.f13034c = (String) map.get("post_parameters");
        this.f13036e = m16607b((String) map.get("drt_include"));
        this.f13037f = (String) map.get("request_id");
        this.f13035d = (String) map.get(C1245d.f3961jd);
        this.f13032a = m16608c((String) map.get("errors"));
        this.f13040i = i;
        this.f13038g = (String) map.get("fetched_ad");
        this.f13041j = m16607b((String) map.get("render_test_ad_label"));
        this.f13042k = new JSONObject();
    }

    public C3788fa(JSONObject jSONObject) {
        this.f13039h = jSONObject.optString("url");
        this.f13033b = jSONObject.optString("base_uri");
        this.f13034c = jSONObject.optString("post_parameters");
        this.f13036e = m16607b(jSONObject.optString("drt_include"));
        this.f13037f = jSONObject.optString("request_id");
        this.f13035d = jSONObject.optString(C1245d.f3961jd);
        this.f13032a = m16608c(jSONObject.optString("errors"));
        int i = 1;
        if (jSONObject.optInt("valid", 0) == 1) {
            i = -2;
        }
        this.f13040i = i;
        this.f13038g = jSONObject.optString("fetched_ad");
        this.f13041j = jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        this.f13042k = optJSONObject;
    }

    /* renamed from: b */
    private static boolean m16607b(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    /* renamed from: c */
    private static List<String> m16608c(String str) {
        if (str == null) {
            return null;
        }
        return Arrays.asList(str.split(","));
    }

    /* renamed from: a */
    public final int mo15276a() {
        return this.f13040i;
    }

    /* renamed from: a */
    public final void mo15277a(String str) {
        this.f13039h = str;
    }

    /* renamed from: b */
    public final List<String> mo15278b() {
        return this.f13032a;
    }

    /* renamed from: c */
    public final String mo15279c() {
        return this.f13033b;
    }

    /* renamed from: d */
    public final String mo15280d() {
        return this.f13034c;
    }

    /* renamed from: e */
    public final String mo15281e() {
        return this.f13039h;
    }

    /* renamed from: f */
    public final String mo15282f() {
        return this.f13035d;
    }

    /* renamed from: g */
    public final boolean mo15283g() {
        return this.f13036e;
    }

    /* renamed from: h */
    public final String mo15284h() {
        return this.f13037f;
    }

    /* renamed from: i */
    public final String mo15285i() {
        return this.f13038g;
    }

    /* renamed from: j */
    public final boolean mo15286j() {
        return this.f13041j;
    }
}
