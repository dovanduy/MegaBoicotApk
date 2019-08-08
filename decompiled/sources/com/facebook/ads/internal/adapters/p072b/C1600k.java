package com.facebook.ads.internal.adapters.p072b;

import android.content.Context;
import com.appnext.base.p042a.p045c.C1234a;
import com.appnext.core.C1286Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.adapters.p072b.C1602m.C1604a;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.b.k */
public class C1600k implements Serializable {
    private static final long serialVersionUID = 8751287062553772011L;

    /* renamed from: a */
    private final C1602m f4928a;

    /* renamed from: b */
    private final C1586b f4929b;

    /* renamed from: c */
    private final List<C1601l> f4930c;

    /* renamed from: d */
    private final int f4931d;

    /* renamed from: e */
    private final int f4932e;

    /* renamed from: f */
    private final String f4933f;

    /* renamed from: g */
    private final String f4934g;

    /* renamed from: h */
    private int f4935h = 200;

    /* renamed from: i */
    private String f4936i;

    private C1600k(C1602m mVar, C1586b bVar, List<C1601l> list, String str, String str2, int i, int i2) {
        this.f4928a = mVar;
        this.f4929b = bVar;
        this.f4930c = list;
        this.f4933f = str;
        this.f4934g = str2;
        this.f4931d = i;
        this.f4932e = i2;
    }

    /* renamed from: a */
    public static C1600k m6656a(JSONObject jSONObject, Context context) {
        C1604a c = new C1604a().mo7204a(jSONObject.optString("title")).mo7206b(jSONObject.optJSONObject("icon") != null ? jSONObject.optJSONObject("icon").optString("url") : "").mo7207c(jSONObject.optString("ad_choices_link_url"));
        JSONObject optJSONObject = jSONObject.optJSONObject("generic_text");
        C1602m a = c.mo7208d(optJSONObject == null ? "Sponsored" : optJSONObject.optString("sponsored", "Sponsored")).mo7205a();
        JSONObject optJSONObject2 = jSONObject.optJSONObject(TtmlNode.TAG_LAYOUT);
        JSONObject jSONObject2 = null;
        C1597h a2 = C1597h.m6639a(optJSONObject2 != null ? optJSONObject2.optJSONObject(C1286Ad.ORIENTATION_PORTRAIT) : null);
        if (optJSONObject2 != null) {
            jSONObject2 = optJSONObject2.optJSONObject(C1286Ad.ORIENTATION_LANDSCAPE);
        }
        C1586b bVar = new C1586b(a2, C1597h.m6639a(jSONObject2));
        int optInt = jSONObject.optInt("viewability_check_initial_delay", 0);
        int optInt2 = jSONObject.optInt("viewability_check_interval", AdError.NETWORK_ERROR_CODE);
        String optString = jSONObject.optString(C1234a.f3911gK);
        String optString2 = jSONObject.optString("request_id", "");
        JSONArray optJSONArray = jSONObject.optJSONArray("carousel");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            arrayList.add(C1601l.m6668a(jSONObject));
        } else {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(C1601l.m6668a(optJSONArray.getJSONObject(i)));
                } catch (JSONException e) {
                    C2370a.m9149b(context, "parsing", C2373b.f7476K, e);
                    e.printStackTrace();
                }
            }
        }
        C1600k kVar = new C1600k(a, bVar, arrayList, optString, optString2, optInt, optInt2);
        return kVar;
    }

    /* renamed from: a */
    public C1602m mo7185a() {
        return this.f4928a;
    }

    /* renamed from: a */
    public void mo7186a(int i) {
        this.f4935h = i;
    }

    /* renamed from: a */
    public void mo7187a(String str) {
        this.f4936i = str;
    }

    /* renamed from: b */
    public C1586b mo7188b() {
        return this.f4929b;
    }

    /* renamed from: c */
    public String mo7189c() {
        return this.f4933f;
    }

    /* renamed from: d */
    public List<C1601l> mo7190d() {
        return Collections.unmodifiableList(this.f4930c);
    }

    /* renamed from: e */
    public String mo7191e() {
        return this.f4934g;
    }

    /* renamed from: f */
    public int mo7192f() {
        return this.f4931d;
    }

    /* renamed from: g */
    public int mo7193g() {
        return this.f4932e;
    }

    /* renamed from: h */
    public int mo7194h() {
        return this.f4935h;
    }

    /* renamed from: i */
    public String mo7195i() {
        return this.f4936i;
    }
}
