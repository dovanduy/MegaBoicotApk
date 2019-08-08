package com.facebook.internal;

import com.facebook.FacebookRequestError.C1495a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.h */
/* compiled from: FacebookRequestErrorClassification */
public final class C2520h {

    /* renamed from: g */
    private static C2520h f7902g;

    /* renamed from: a */
    private final Map<Integer, Set<Integer>> f7903a;

    /* renamed from: b */
    private final Map<Integer, Set<Integer>> f7904b;

    /* renamed from: c */
    private final Map<Integer, Set<Integer>> f7905c;

    /* renamed from: d */
    private final String f7906d;

    /* renamed from: e */
    private final String f7907e;

    /* renamed from: f */
    private final String f7908f;

    C2520h(Map<Integer, Set<Integer>> map, Map<Integer, Set<Integer>> map2, Map<Integer, Set<Integer>> map3, String str, String str2, String str3) {
        this.f7903a = map;
        this.f7904b = map2;
        this.f7905c = map3;
        this.f7906d = str;
        this.f7907e = str2;
        this.f7908f = str3;
    }

    /* renamed from: a */
    public String mo8993a(C1495a aVar) {
        switch (aVar) {
            case OTHER:
                return this.f7906d;
            case LOGIN_RECOVERABLE:
                return this.f7908f;
            case TRANSIENT:
                return this.f7907e;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public C1495a mo8992a(int i, int i2, boolean z) {
        if (z) {
            return C1495a.TRANSIENT;
        }
        if (this.f7903a != null && this.f7903a.containsKey(Integer.valueOf(i))) {
            Set set = (Set) this.f7903a.get(Integer.valueOf(i));
            if (set == null || set.contains(Integer.valueOf(i2))) {
                return C1495a.OTHER;
            }
        }
        if (this.f7905c != null && this.f7905c.containsKey(Integer.valueOf(i))) {
            Set set2 = (Set) this.f7905c.get(Integer.valueOf(i));
            if (set2 == null || set2.contains(Integer.valueOf(i2))) {
                return C1495a.LOGIN_RECOVERABLE;
            }
        }
        if (this.f7904b != null && this.f7904b.containsKey(Integer.valueOf(i))) {
            Set set3 = (Set) this.f7904b.get(Integer.valueOf(i));
            if (set3 == null || set3.contains(Integer.valueOf(i2))) {
                return C1495a.TRANSIENT;
            }
        }
        return C1495a.OTHER;
    }

    /* renamed from: a */
    public static synchronized C2520h m9605a() {
        C2520h hVar;
        synchronized (C2520h.class) {
            if (f7902g == null) {
                f7902g = m9608b();
            }
            hVar = f7902g;
        }
        return hVar;
    }

    /* renamed from: b */
    private static C2520h m9608b() {
        C2520h hVar = new C2520h(null, new HashMap<Integer, Set<Integer>>() {
            {
                put(Integer.valueOf(2), null);
                put(Integer.valueOf(4), null);
                put(Integer.valueOf(9), null);
                put(Integer.valueOf(17), null);
                put(Integer.valueOf(341), null);
            }
        }, new HashMap<Integer, Set<Integer>>() {
            {
                put(Integer.valueOf(102), null);
                put(Integer.valueOf(190), null);
                put(Integer.valueOf(412), null);
            }
        }, null, null, null);
        return hVar;
    }

    /* renamed from: a */
    private static Map<Integer, Set<Integer>> m9607a(JSONObject jSONObject) {
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("code");
                if (optInt != 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            int optInt2 = optJSONArray2.optInt(i2);
                            if (optInt2 != 0) {
                                hashSet.add(Integer.valueOf(optInt2));
                            }
                        }
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static C2520h m9606a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("name");
                if (optString != null) {
                    if (optString.equalsIgnoreCase("other")) {
                        str = optJSONObject.optString("recovery_message", null);
                        map = m9607a(optJSONObject);
                    } else if (optString.equalsIgnoreCase("transient")) {
                        str2 = optJSONObject.optString("recovery_message", null);
                        map2 = m9607a(optJSONObject);
                    } else if (optString.equalsIgnoreCase("login_recoverable")) {
                        str3 = optJSONObject.optString("recovery_message", null);
                        map3 = m9607a(optJSONObject);
                    }
                }
            }
        }
        C2520h hVar = new C2520h(map, map2, map3, str, str2, str3);
        return hVar;
    }
}
