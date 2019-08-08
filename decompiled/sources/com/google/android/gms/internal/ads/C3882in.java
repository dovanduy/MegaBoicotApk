package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.appnext.base.p046b.C1244c;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.in */
public final class C3882in {

    /* renamed from: a */
    private final long f13315a;

    /* renamed from: b */
    private final List<String> f13316b = new ArrayList();

    /* renamed from: c */
    private final List<String> f13317c = new ArrayList();

    /* renamed from: d */
    private final Map<String, bbk> f13318d = new HashMap();

    /* renamed from: e */
    private String f13319e;

    /* renamed from: f */
    private String f13320f;

    /* renamed from: g */
    private boolean f13321g;

    public C3882in(String str, long j) {
        this.f13321g = false;
        this.f13320f = str;
        this.f13315a = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt(C1244c.STATUS, -1) != 1) {
                    this.f13321g = false;
                    C3900je.m17435e("App settings could not be fetched successfully.");
                    return;
                }
                this.f13321g = true;
                this.f13319e = jSONObject.optString("app_id");
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("format");
                        String optString2 = jSONObject2.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.f13317c.add(optString2);
                                } else if ("rewarded".equalsIgnoreCase(optString)) {
                                    JSONObject optJSONObject = jSONObject2.optJSONObject("mediation_config");
                                    if (optJSONObject != null) {
                                        this.f13318d.put(optString2, new bbk(optJSONObject));
                                    }
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        this.f13316b.add(optJSONArray2.optString(i2));
                    }
                }
            } catch (JSONException e) {
                C3900je.m17432c("Exception occurred while processing app setting json", e);
                C3025aw.m10921i().mo15436a((Throwable) e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    /* renamed from: a */
    public final long mo15426a() {
        return this.f13315a;
    }

    /* renamed from: b */
    public final boolean mo15427b() {
        return this.f13321g;
    }

    /* renamed from: c */
    public final String mo15428c() {
        return this.f13320f;
    }

    /* renamed from: d */
    public final String mo15429d() {
        return this.f13319e;
    }

    /* renamed from: e */
    public final Map<String, bbk> mo15430e() {
        return this.f13318d;
    }
}
