package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.c */
/* compiled from: BundleJSONConverter */
public class C2503c {

    /* renamed from: a */
    private static final Map<Class<?>, C2511a> f7878a = new HashMap();

    /* renamed from: com.facebook.internal.c$a */
    /* compiled from: BundleJSONConverter */
    public interface C2511a {
        /* renamed from: a */
        void mo8985a(Bundle bundle, String str, Object obj) throws JSONException;

        /* renamed from: a */
        void mo8986a(JSONObject jSONObject, String str, Object obj) throws JSONException;
    }

    static {
        f7878a.put(Boolean.class, new C2511a() {
            /* renamed from: a */
            public void mo8985a(Bundle bundle, String str, Object obj) throws JSONException {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            }

            /* renamed from: a */
            public void mo8986a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                jSONObject.put(str, obj);
            }
        });
        f7878a.put(Integer.class, new C2511a() {
            /* renamed from: a */
            public void mo8985a(Bundle bundle, String str, Object obj) throws JSONException {
                bundle.putInt(str, ((Integer) obj).intValue());
            }

            /* renamed from: a */
            public void mo8986a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                jSONObject.put(str, obj);
            }
        });
        f7878a.put(Long.class, new C2511a() {
            /* renamed from: a */
            public void mo8985a(Bundle bundle, String str, Object obj) throws JSONException {
                bundle.putLong(str, ((Long) obj).longValue());
            }

            /* renamed from: a */
            public void mo8986a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                jSONObject.put(str, obj);
            }
        });
        f7878a.put(Double.class, new C2511a() {
            /* renamed from: a */
            public void mo8985a(Bundle bundle, String str, Object obj) throws JSONException {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            }

            /* renamed from: a */
            public void mo8986a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                jSONObject.put(str, obj);
            }
        });
        f7878a.put(String.class, new C2511a() {
            /* renamed from: a */
            public void mo8985a(Bundle bundle, String str, Object obj) throws JSONException {
                bundle.putString(str, (String) obj);
            }

            /* renamed from: a */
            public void mo8986a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                jSONObject.put(str, obj);
            }
        });
        f7878a.put(String[].class, new C2511a() {
            /* renamed from: a */
            public void mo8985a(Bundle bundle, String str, Object obj) throws JSONException {
                throw new IllegalArgumentException("Unexpected type from JSON");
            }

            /* renamed from: a */
            public void mo8986a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                JSONArray jSONArray = new JSONArray();
                for (String put : (String[]) obj) {
                    jSONArray.put(put);
                }
                jSONObject.put(str, jSONArray);
            }
        });
        f7878a.put(JSONArray.class, new C2511a() {
            /* renamed from: a */
            public void mo8985a(Bundle bundle, String str, Object obj) throws JSONException {
                JSONArray jSONArray = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                if (jSONArray.length() == 0) {
                    bundle.putStringArrayList(str, arrayList);
                    return;
                }
                int i = 0;
                while (i < jSONArray.length()) {
                    Object obj2 = jSONArray.get(i);
                    if (obj2 instanceof String) {
                        arrayList.add((String) obj2);
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected type in an array: ");
                        sb.append(obj2.getClass());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                bundle.putStringArrayList(str, arrayList);
            }

            /* renamed from: a */
            public void mo8986a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
            }
        });
    }

    /* renamed from: a */
    public static JSONObject m9568a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    for (String put : (List) obj) {
                        jSONArray.put(put);
                    }
                    jSONObject.put(str, jSONArray);
                } else if (obj instanceof Bundle) {
                    jSONObject.put(str, m9568a((Bundle) obj));
                } else {
                    C2511a aVar = (C2511a) f7878a.get(obj.getClass());
                    if (aVar == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported type: ");
                        sb.append(obj.getClass());
                        throw new IllegalArgumentException(sb.toString());
                    }
                    aVar.mo8986a(jSONObject, str, obj);
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static Bundle m9567a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if (!(obj == null || obj == JSONObject.NULL)) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(str, m9567a((JSONObject) obj));
                } else {
                    C2511a aVar = (C2511a) f7878a.get(obj.getClass());
                    if (aVar == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported type: ");
                        sb.append(obj.getClass());
                        throw new IllegalArgumentException(sb.toString());
                    }
                    aVar.mo8985a(bundle, str, obj);
                }
            }
        }
        return bundle;
    }
}
