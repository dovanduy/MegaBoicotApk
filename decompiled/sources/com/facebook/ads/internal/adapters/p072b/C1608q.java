package com.facebook.ads.internal.adapters.p072b;

import android.text.TextUtils;
import com.appnext.base.p042a.p045c.C1234a;
import com.appnext.core.C1286Ad;
import com.facebook.ads.internal.adapters.p072b.C1591e.C1594b;
import com.facebook.ads.internal.adapters.p072b.C1602m.C1604a;
import com.facebook.ads.internal.p088o.C1776c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.b.q */
public class C1608q extends C1585a {

    /* renamed from: a */
    private final String f4973a;

    /* renamed from: b */
    private final C1602m f4974b;

    /* renamed from: c */
    private final C1591e f4975c;

    /* renamed from: d */
    private final C1598i f4976d;

    /* renamed from: e */
    private final C1586b f4977e;

    /* renamed from: f */
    private final C1588d f4978f;

    /* renamed from: g */
    private final C1599j f4979g;

    /* renamed from: h */
    private final String f4980h;

    /* renamed from: i */
    private boolean f4981i;

    private C1608q(String str, C1602m mVar, C1591e eVar, C1598i iVar, C1586b bVar, C1588d dVar, C1599j jVar, String str2) {
        this.f4973a = str;
        this.f4974b = mVar;
        this.f4975c = eVar;
        this.f4976d = iVar;
        this.f4977e = bVar;
        this.f4978f = dVar;
        this.f4979g = jVar;
        this.f4980h = str2;
    }

    /* renamed from: a */
    public static C1608q m6709a(JSONObject jSONObject) {
        C1604a c = new C1604a().mo7204a(jSONObject.optString("advertiser_name")).mo7206b(jSONObject.optJSONObject("icon") != null ? jSONObject.optJSONObject("icon").optString("url") : "").mo7207c(jSONObject.optString("ad_choices_link_url"));
        JSONObject optJSONObject = jSONObject.optJSONObject("generic_text");
        C1602m a = c.mo7208d(optJSONObject == null ? "Sponsored" : optJSONObject.optString("sponsored", "Sponsored")).mo7205a();
        C1591e a2 = new C1594b().mo7154a(jSONObject.optString("title")).mo7156b(jSONObject.optString("subtitle")).mo7157c(jSONObject.optString(TtmlNode.TAG_BODY)).mo7158d(jSONObject.optString("rating_value")).mo7159e(jSONObject.optString("category")).mo7160f(jSONObject.optString("destination_title")).mo7161g(jSONObject.optString("ad_creative_type")).mo7155a();
        C1598i iVar = new C1598i(jSONObject.optString("fbad_command"), jSONObject.optString("call_to_action"));
        JSONObject optJSONObject2 = jSONObject.optJSONObject(TtmlNode.TAG_LAYOUT);
        JSONObject jSONObject2 = null;
        C1597h a3 = C1597h.m6639a(optJSONObject2 != null ? optJSONObject2.optJSONObject(C1286Ad.ORIENTATION_PORTRAIT) : null);
        if (optJSONObject2 != null) {
            jSONObject2 = optJSONObject2.optJSONObject(C1286Ad.ORIENTATION_LANDSCAPE);
        }
        C1608q qVar = new C1608q(jSONObject.optString("request_id"), a, a2, iVar, new C1586b(a3, C1597h.m6639a(jSONObject2)), new C1590a().mo7139a(jSONObject.optString("video_url")).mo7143b(jSONObject.optJSONObject("image") != null ? jSONObject.optJSONObject("image").optString("url") : "").mo7137a(jSONObject.optInt("skippable_seconds")).mo7142b(jSONObject.optInt("video_duration_sec")).mo7138a(C1605n.m6686a(jSONObject)).mo7141a(), new C1599j(C1776c.m7368a(jSONObject.optString("end_card_markup")), jSONObject.optString("activation_command"), m6710a(jSONObject.optJSONArray("end_card_images"))), jSONObject.optString(C1234a.f3911gK));
        return qVar;
    }

    /* renamed from: a */
    private static List<String> m6710a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                arrayList.add(optString);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public String mo7113a() {
        return this.f4980h;
    }

    /* renamed from: a */
    public void mo7115a(String str) {
        super.mo7115a(str);
        this.f4979g.mo7181a(str);
    }

    /* renamed from: a */
    public void mo7228a(boolean z) {
        this.f4981i = z;
    }

    /* renamed from: c */
    public void mo7229c(String str) {
        this.f4978f.mo7127a(str);
    }

    /* renamed from: e */
    public String mo7230e() {
        return this.f4973a;
    }

    /* renamed from: f */
    public C1602m mo7231f() {
        return this.f4974b;
    }

    /* renamed from: g */
    public C1591e mo7232g() {
        return this.f4975c;
    }

    /* renamed from: h */
    public C1598i mo7233h() {
        return this.f4976d;
    }

    /* renamed from: i */
    public C1586b mo7234i() {
        return this.f4977e;
    }

    /* renamed from: j */
    public C1588d mo7235j() {
        return this.f4978f;
    }

    /* renamed from: k */
    public C1599j mo7236k() {
        return this.f4979g;
    }

    /* renamed from: l */
    public boolean mo7237l() {
        return this.f4981i;
    }
}
