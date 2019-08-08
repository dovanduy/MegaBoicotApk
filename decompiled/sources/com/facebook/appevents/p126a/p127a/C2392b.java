package com.facebook.appevents.p126a.p127a;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.a.a.b */
/* compiled from: ParameterComponent */
public final class C2392b {

    /* renamed from: a */
    public final String f7595a;

    /* renamed from: b */
    public final String f7596b;

    /* renamed from: c */
    public final List<C2393c> f7597c;

    /* renamed from: d */
    public final String f7598d;

    public C2392b(JSONObject jSONObject) throws JSONException {
        this.f7595a = jSONObject.getString("name");
        this.f7596b = jSONObject.optString("value");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new C2393c(optJSONArray.getJSONObject(i)));
            }
        }
        this.f7597c = arrayList;
        this.f7598d = jSONObject.optString("path_type", "absolute");
    }
}
