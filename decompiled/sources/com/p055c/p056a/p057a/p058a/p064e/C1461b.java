package com.p055c.p056a.p057a.p058a.p064e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.e.b */
public class C1461b {

    /* renamed from: a */
    static float f4441a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f4442b;

    /* renamed from: c */
    private static String[] f4443c = {"x", "y", "width", "height"};

    /* renamed from: com.c.a.a.a.e.b$a */
    private static class C1462a {

        /* renamed from: a */
        final float f4444a;

        /* renamed from: b */
        final float f4445b;

        C1462a(float f, float f2) {
            this.f4444a = f;
            this.f4445b = f2;
        }
    }

    /* renamed from: a */
    static float m6049a(int i) {
        return ((float) i) / f4441a;
    }

    /* renamed from: a */
    public static JSONObject m6050a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m6049a(i));
            jSONObject.put("y", (double) m6049a(i2));
            jSONObject.put("width", (double) m6049a(i3));
            jSONObject.put("height", (double) m6049a(i4));
            return jSONObject;
        } catch (JSONException e) {
            C1463c.m6065a("Error with creating viewStateObject", e);
            return jSONObject;
        }
    }

    /* renamed from: a */
    public static void m6051a(Context context) {
        if (context != null) {
            f4441a = context.getResources().getDisplayMetrics().density;
            f4442b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m6052a(JSONObject jSONObject) {
        C1462a b = m6058b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f4444a);
            jSONObject.put("height", (double) b.f4445b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m6053a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C1463c.m6065a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m6054a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("JSONException during JSONObject.put for name [");
            sb.append(str);
            sb.append("]");
            C1463c.m6065a(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public static void m6055a(JSONObject jSONObject, List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
        } catch (JSONException e) {
            C1463c.m6065a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m6056a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static boolean m6057a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null) {
            return false;
        }
        return jSONArray.length() == jSONArray2.length();
    }

    /* renamed from: b */
    private static C1462a m6058b(JSONObject jSONObject) {
        float f;
        float f2 = 0.0f;
        if (VERSION.SDK_INT < 17) {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                float f3 = 0.0f;
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("x");
                        double optDouble2 = optJSONObject.optDouble("y");
                        double optDouble3 = optJSONObject.optDouble("width");
                        double optDouble4 = optJSONObject.optDouble("height");
                        f2 = Math.max(f2, (float) (optDouble + optDouble3));
                        f3 = Math.max(f3, (float) (optDouble2 + optDouble4));
                    }
                }
                f = f3;
                return new C1462a(f2, f);
            }
        } else if (f4442b != null) {
            Point point = new Point(0, 0);
            f4442b.getDefaultDisplay().getRealSize(point);
            f2 = m6049a(point.x);
            f = m6049a(point.y);
            return new C1462a(f2, f);
        }
        f = 0.0f;
        return new C1462a(f2, f);
    }

    /* renamed from: b */
    public static boolean m6059b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return m6060c(jSONObject, jSONObject2) && m6061d(jSONObject, jSONObject2) && m6062e(jSONObject, jSONObject2) && m6063f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m6060c(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f4443c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m6061d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m6062e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m6057a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m6063f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m6057a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m6059b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
