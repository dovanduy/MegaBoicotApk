package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.z */
/* compiled from: ProfileInformationCache */
class C2578z {

    /* renamed from: a */
    private static final ConcurrentHashMap<String, JSONObject> f8043a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static JSONObject m9792a(String str) {
        return (JSONObject) f8043a.get(str);
    }

    /* renamed from: a */
    public static void m9793a(String str, JSONObject jSONObject) {
        f8043a.put(str, jSONObject);
    }
}
