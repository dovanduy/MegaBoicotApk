package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C3025aw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3718cm
public final class bbj {

    /* renamed from: a */
    public final String f12542a;

    /* renamed from: b */
    public final String f12543b;

    /* renamed from: c */
    public final List<String> f12544c;

    /* renamed from: d */
    public final String f12545d;

    /* renamed from: e */
    public final String f12546e;

    /* renamed from: f */
    public final List<String> f12547f;

    /* renamed from: g */
    public final List<String> f12548g;

    /* renamed from: h */
    public final List<String> f12549h;

    /* renamed from: i */
    public final List<String> f12550i;

    /* renamed from: j */
    public final List<String> f12551j;

    /* renamed from: k */
    public final String f12552k;

    /* renamed from: l */
    public final List<String> f12553l;

    /* renamed from: m */
    public final List<String> f12554m;

    /* renamed from: n */
    public final List<String> f12555n;

    /* renamed from: o */
    public final String f12556o;

    /* renamed from: p */
    public final String f12557p;

    /* renamed from: q */
    public final String f12558q;

    /* renamed from: r */
    public final List<String> f12559r;

    /* renamed from: s */
    public final String f12560s;

    /* renamed from: t */
    public final long f12561t;

    /* renamed from: u */
    private final String f12562u;

    public bbj(String str, String str2, List<String> list, String str3, String str4, List<String> list2, List<String> list3, List<String> list4, List<String> list5, String str5, String str6, List<String> list6, List<String> list7, List<String> list8, String str7, String str8, String str9, List<String> list9, String str10, List<String> list10, String str11, long j) {
        this.f12542a = str;
        this.f12543b = null;
        this.f12544c = list;
        this.f12545d = null;
        this.f12546e = null;
        this.f12547f = list2;
        this.f12548g = list3;
        this.f12549h = list4;
        this.f12550i = list5;
        this.f12552k = str5;
        this.f12553l = list6;
        this.f12554m = list7;
        this.f12555n = list8;
        this.f12556o = null;
        this.f12557p = null;
        this.f12558q = null;
        this.f12559r = null;
        this.f12560s = null;
        this.f12551j = list10;
        this.f12562u = null;
        this.f12561t = -1;
    }

    public bbj(JSONObject jSONObject) throws JSONException {
        List<String> list;
        this.f12543b = jSONObject.optString(TtmlNode.ATTR_ID);
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f12544c = Collections.unmodifiableList(arrayList);
        this.f12545d = jSONObject.optString("allocation_id", null);
        C3025aw.m10936x();
        this.f12547f = bbt.m15969a(jSONObject, "clickurl");
        C3025aw.m10936x();
        this.f12548g = bbt.m15969a(jSONObject, "imp_urls");
        C3025aw.m10936x();
        this.f12549h = bbt.m15969a(jSONObject, "downloaded_imp_urls");
        C3025aw.m10936x();
        this.f12551j = bbt.m15969a(jSONObject, "fill_urls");
        C3025aw.m10936x();
        this.f12553l = bbt.m15969a(jSONObject, "video_start_urls");
        C3025aw.m10936x();
        this.f12555n = bbt.m15969a(jSONObject, "video_complete_urls");
        C3025aw.m10936x();
        List<String> a = bbt.m15969a(jSONObject, "video_reward_urls");
        if (!((Boolean) aoq.m14620f().mo14695a(aru.f11825ax)).booleanValue()) {
            a = this.f12555n;
        }
        this.f12554m = a;
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            C3025aw.m10936x();
            list = bbt.m15969a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.f12550i = list;
        this.f12542a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f12552k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f12546e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.f12556o = jSONObject.optString("html_template", null);
        this.f12557p = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.f12558q = optJSONObject3 != null ? optJSONObject3.toString() : null;
        C3025aw.m10936x();
        this.f12559r = bbt.m15969a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f12560s = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.f12562u = jSONObject.optString("response_type", null);
        this.f12561t = jSONObject.optLong("ad_network_timeout_millis", -1);
    }

    /* renamed from: a */
    public final boolean mo15054a() {
        return "banner".equalsIgnoreCase(this.f12562u);
    }

    /* renamed from: b */
    public final boolean mo15055b() {
        return "native".equalsIgnoreCase(this.f12562u);
    }
}
