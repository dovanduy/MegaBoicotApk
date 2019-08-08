package com.facebook.ads.internal.adapters;

import android.content.Intent;
import android.os.Bundle;
import com.appnext.base.p042a.p045c.C1234a;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.p070a.C1565d;
import com.facebook.ads.internal.p070a.C1566e;
import com.facebook.ads.internal.p070a.C1566e.C1567a;
import com.facebook.ads.internal.p088o.C1776c;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.l */
public class C1645l implements C1567a {

    /* renamed from: a */
    private final String f5144a;

    /* renamed from: b */
    private final String f5145b;

    /* renamed from: c */
    private final C1565d f5146c;

    /* renamed from: d */
    private final Collection<String> f5147d;

    /* renamed from: e */
    private final Map<String, String> f5148e;

    /* renamed from: f */
    private final String f5149f;

    /* renamed from: g */
    private final int f5150g;

    /* renamed from: h */
    private final int f5151h;

    /* renamed from: i */
    private final int f5152i;

    /* renamed from: j */
    private final String f5153j;

    private C1645l(String str, String str2, C1565d dVar, Collection<String> collection, Map<String, String> map, String str3, int i, int i2, int i3, String str4) {
        this.f5144a = str;
        this.f5145b = str2;
        this.f5146c = dVar;
        this.f5147d = collection;
        this.f5148e = map;
        this.f5149f = str3;
        this.f5150g = i;
        this.f5151h = i2;
        this.f5152i = i3;
        this.f5153j = str4;
    }

    /* renamed from: a */
    public static C1645l m6881a(Bundle bundle) {
        C1645l lVar = new C1645l(C1776c.m7367a(bundle.getByteArray("markup")), null, C1565d.NONE, null, null, bundle.getString("request_id"), bundle.getInt("viewability_check_initial_delay"), bundle.getInt("viewability_check_interval"), bundle.getInt("skip_after_seconds", 0), bundle.getString(C1234a.f3911gK));
        return lVar;
    }

    /* renamed from: a */
    public static C1645l m6882a(JSONObject jSONObject) {
        JSONArray jSONArray = null;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("markup");
        String optString2 = jSONObject.optString("activation_command");
        String optString3 = jSONObject.optString("request_id");
        String a = C2323k.m9047a(jSONObject, C1234a.f3911gK);
        C1565d a2 = C1565d.m6496a(jSONObject.optString("invalidation_behavior"));
        try {
            jSONArray = new JSONArray(jSONObject.optString("detection_strings"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Collection a3 = C1566e.m6497a(jSONArray);
        JSONObject optJSONObject = jSONObject.optJSONObject(TtmlNode.TAG_METADATA);
        HashMap hashMap = new HashMap();
        if (optJSONObject != null) {
            Iterator keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                hashMap.put(str, optJSONObject.optString(str));
            }
        }
        int i = AdError.NETWORK_ERROR_CODE;
        int parseInt = hashMap.containsKey("viewability_check_initial_delay") ? Integer.parseInt((String) hashMap.get("viewability_check_initial_delay")) : 0;
        if (hashMap.containsKey("viewability_check_interval")) {
            i = Integer.parseInt((String) hashMap.get("viewability_check_interval"));
        }
        C1645l lVar = new C1645l(optString, optString2, a2, a3, hashMap, optString3, parseInt, i, hashMap.containsKey("skip_after_seconds") ? Integer.parseInt((String) hashMap.get("skip_after_seconds")) : 0, a);
        return lVar;
    }

    /* renamed from: b */
    public static C1645l m6883b(Intent intent) {
        C1645l lVar = new C1645l(C1776c.m7367a(intent.getByteArrayExtra("markup")), intent.getStringExtra("activation_command"), C1565d.NONE, null, null, intent.getStringExtra("request_id"), intent.getIntExtra("viewability_check_initial_delay", 0), intent.getIntExtra("viewability_check_interval", AdError.NETWORK_ERROR_CODE), intent.getIntExtra(AudienceNetworkActivity.SKIP_DELAY_SECONDS_KEY, 0), intent.getStringExtra(C1234a.f3911gK));
        return lVar;
    }

    /* renamed from: a */
    public C1565d mo7060a() {
        return this.f5146c;
    }

    /* renamed from: a */
    public void mo7320a(Intent intent) {
        intent.putExtra("markup", C1776c.m7368a(this.f5144a));
        intent.putExtra("activation_command", this.f5145b);
        intent.putExtra("request_id", this.f5149f);
        intent.putExtra("viewability_check_initial_delay", this.f5150g);
        intent.putExtra("viewability_check_interval", this.f5151h);
        intent.putExtra(AudienceNetworkActivity.SKIP_DELAY_SECONDS_KEY, this.f5152i);
        intent.putExtra(C1234a.f3911gK, this.f5153j);
    }

    /* renamed from: b */
    public Collection<String> mo7061b() {
        return this.f5147d;
    }

    /* renamed from: c */
    public String mo7321c() {
        return this.f5144a;
    }

    /* renamed from: d */
    public String mo7322d() {
        return this.f5145b;
    }

    /* renamed from: e */
    public Map<String, String> mo7323e() {
        return this.f5148e;
    }

    /* renamed from: f */
    public int mo7324f() {
        return this.f5150g;
    }

    /* renamed from: g */
    public int mo7325g() {
        return this.f5151h;
    }

    public String getClientToken() {
        return this.f5153j;
    }

    /* renamed from: h */
    public Bundle mo7326h() {
        Bundle bundle = new Bundle();
        bundle.putByteArray("markup", C1776c.m7368a(this.f5144a));
        bundle.putString("request_id", this.f5149f);
        bundle.putInt("viewability_check_initial_delay", this.f5150g);
        bundle.putInt("viewability_check_interval", this.f5151h);
        bundle.putInt("skip_after_seconds", this.f5152i);
        bundle.putString(C1234a.f3911gK, this.f5153j);
        return bundle;
    }
}
