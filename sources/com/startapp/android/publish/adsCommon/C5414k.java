package com.startapp.android.publish.adsCommon;

import android.content.Context;
import android.content.SharedPreferences;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.android.publish.adsCommon.k */
/* compiled from: StartAppSDK */
public class C5414k {

    /* renamed from: a */
    private static SharedPreferences f17306a;

    /* renamed from: a */
    public static SharedPreferences m23091a(Context context) {
        if (f17306a == null) {
            f17306a = context.getApplicationContext().getSharedPreferences("com.startapp.android.publish", 0);
        }
        return f17306a;
    }

    /* renamed from: a */
    public static Boolean m23092a(Context context, String str, Boolean bool) {
        return Boolean.valueOf(m23091a(context).getBoolean(str, bool.booleanValue()));
    }

    /* renamed from: b */
    public static void m23099b(Context context, String str, Boolean bool) {
        C5307i.m22667a(m23091a(context).edit().putBoolean(str, bool.booleanValue()));
    }

    /* renamed from: a */
    public static String m23096a(Context context, String str, String str2) {
        return m23091a(context).getString(str, str2);
    }

    /* renamed from: b */
    public static void m23103b(Context context, String str, String str2) {
        C5307i.m22667a(m23091a(context).edit().putString(str, str2));
    }

    /* renamed from: a */
    public static Integer m23094a(Context context, String str, Integer num) {
        return Integer.valueOf(m23091a(context).getInt(str, num.intValue()));
    }

    /* renamed from: b */
    public static void m23101b(Context context, String str, Integer num) {
        C5307i.m22667a(m23091a(context).edit().putInt(str, num.intValue()));
    }

    /* renamed from: a */
    public static Float m23093a(Context context, String str, Float f) {
        return Float.valueOf(m23091a(context).getFloat(str, f.floatValue()));
    }

    /* renamed from: b */
    public static void m23100b(Context context, String str, Float f) {
        C5307i.m22667a(m23091a(context).edit().putFloat(str, f.floatValue()));
    }

    /* renamed from: a */
    public static Long m23095a(Context context, String str, Long l) {
        return Long.valueOf(m23091a(context).getLong(str, l.longValue()));
    }

    /* renamed from: b */
    public static void m23102b(Context context, String str, Long l) {
        C5307i.m22667a(m23091a(context).edit().putLong(str, l.longValue()));
    }

    /* renamed from: a */
    public static void m23097a(Context context, String str, Map<String, String> map) {
        m23103b(context, str, new JSONObject(map).toString());
    }

    /* renamed from: b */
    public static Map<String, String> m23098b(Context context, String str, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(m23091a(context).getString(str, null));
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                map.put(str2, (String) jSONObject.get(str2));
            }
            return map;
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
        return map;
    }
}
