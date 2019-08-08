package com.facebook.appevents.p126a.p127a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.a.a.a */
/* compiled from: EventBinding */
public class C2389a {

    /* renamed from: a */
    private final String f7579a;

    /* renamed from: b */
    private final C2391b f7580b;

    /* renamed from: c */
    private final C2390a f7581c;

    /* renamed from: d */
    private final String f7582d;

    /* renamed from: e */
    private final List<C2393c> f7583e;

    /* renamed from: f */
    private final List<C2392b> f7584f;

    /* renamed from: g */
    private final String f7585g;

    /* renamed from: h */
    private final String f7586h;

    /* renamed from: i */
    private final String f7587i;

    /* renamed from: com.facebook.appevents.a.a.a$a */
    /* compiled from: EventBinding */
    public enum C2390a {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* renamed from: com.facebook.appevents.a.a.a$b */
    /* compiled from: EventBinding */
    public enum C2391b {
        MANUAL,
        INFERENCE
    }

    public C2389a(String str, C2391b bVar, C2390a aVar, String str2, List<C2393c> list, List<C2392b> list2, String str3, String str4, String str5) {
        this.f7579a = str;
        this.f7580b = bVar;
        this.f7581c = aVar;
        this.f7582d = str2;
        this.f7583e = list;
        this.f7584f = list2;
        this.f7585g = str3;
        this.f7586h = str4;
        this.f7587i = str5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010 A[Catch:{ JSONException -> 0x001e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.facebook.appevents.p126a.p127a.C2389a> m9201a(org.json.JSONArray r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            if (r4 == 0) goto L_0x000d
            int r2 = r4.length()     // Catch:{ JSONException -> 0x001e }
            goto L_0x000e
        L_0x000d:
            r2 = r1
        L_0x000e:
            if (r1 >= r2) goto L_0x001e
            org.json.JSONObject r3 = r4.getJSONObject(r1)     // Catch:{ JSONException -> 0x001e }
            com.facebook.appevents.a.a.a r3 = m9200a(r3)     // Catch:{ JSONException -> 0x001e }
            r0.add(r3)     // Catch:{ JSONException -> 0x001e }
            int r1 = r1 + 1
            goto L_0x000e
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.p126a.p127a.C2389a.m9201a(org.json.JSONArray):java.util.List");
    }

    /* renamed from: a */
    public static C2389a m9200a(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("event_name");
        C2391b valueOf = C2391b.valueOf(jSONObject.getString("method").toUpperCase());
        C2390a valueOf2 = C2390a.valueOf(jSONObject.getString("event_type").toUpperCase());
        String string2 = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new C2393c(jSONArray.getJSONObject(i)));
        }
        String optString = jSONObject.optString("path_type", "absolute");
        JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                arrayList2.add(new C2392b(optJSONArray.getJSONObject(i2)));
            }
        }
        C2389a aVar = new C2389a(string, valueOf, valueOf2, string2, arrayList, arrayList2, jSONObject.optString("component_id"), optString, jSONObject.optString("activity_name"));
        return aVar;
    }

    /* renamed from: a */
    public List<C2393c> mo8796a() {
        return Collections.unmodifiableList(this.f7583e);
    }

    /* renamed from: b */
    public List<C2392b> mo8797b() {
        return Collections.unmodifiableList(this.f7584f);
    }

    /* renamed from: c */
    public String mo8798c() {
        return this.f7579a;
    }

    /* renamed from: d */
    public C2390a mo8799d() {
        return this.f7581c;
    }

    /* renamed from: e */
    public String mo8800e() {
        return this.f7587i;
    }
}
