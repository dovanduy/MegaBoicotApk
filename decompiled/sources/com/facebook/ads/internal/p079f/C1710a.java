package com.facebook.ads.internal.p079f;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p115w.p121f.C2362a;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.f.a */
public class C1710a {

    /* renamed from: a */
    private static final String[] f5357a = {"hide_ad", "hide_ad_description", "hide_ad_follow_up_heading", "hide_ad_options", "report_ad", "report_ad_description", "report_ad_follow_up_heading", "report_ad_options", "manage_ad_preferences", "finished_hide_ad", "finished_report_ad", "finished_description", "why_am_i_seeing_this", "ad_choices_uri", "manage_ad_preferences_uri"};

    /* renamed from: b */
    private static C1710a f5358b;

    /* renamed from: c */
    private final SharedPreferences f5359c;

    private C1710a(Context context) {
        this.f5359c = context.getApplicationContext().getSharedPreferences(C2362a.m9138a("com.facebook.ads.AD_REPORTING_CONFIG", context), 0);
    }

    /* renamed from: a */
    public static long m7125a(Context context) {
        return m7145o(context).f5359c.getLong("last_updated_timestamp", 0);
    }

    /* renamed from: a */
    private String m7126a(String str, String str2) {
        String string = this.f5359c.getString(str, str2);
        return (string == null || string.equals("null")) ? str2 : string;
    }

    /* renamed from: a */
    private static List<C1713c> m7127a(String str) {
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase("null")) {
            return new ArrayList();
        }
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i);
            C1713c cVar = new C1713c(jSONObject.getInt("option_value"), jSONObject.getString("option_text"), jSONObject.optString("children_heading"));
            for (C1713c a : m7127a(jSONObject.optString("children_options"))) {
                cVar.mo7478a(a);
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m7128a() {
        Editor edit = this.f5359c.edit();
        edit.putLong("last_updated_timestamp", 0);
        edit.apply();
    }

    /* renamed from: a */
    public static void m7129a(Context context, String str) {
        String[] strArr;
        Map b = m7132b(context, str);
        if (b != null && b.size() == f5357a.length) {
            Editor edit = m7145o(context).f5359c.edit();
            for (String str2 : f5357a) {
                edit.putString(str2, (String) b.get(str2));
            }
            edit.putLong("last_updated_timestamp", System.currentTimeMillis());
            edit.apply();
        }
    }

    /* renamed from: a */
    public static boolean m7130a(Context context, boolean z) {
        return (z ? C1795a.m7421O(context) : C1795a.m7422P(context)) && m7125a(context) > 0;
    }

    /* renamed from: b */
    public static String m7131b(Context context) {
        return m7145o(context).m7126a("hide_ad", "Hide Ad");
    }

    /* renamed from: b */
    private static Map<String, String> m7132b(Context context, String str) {
        String[] strArr;
        if (str == null || str.isEmpty() || str.equals("[]")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            for (String str2 : f5357a) {
                if (!jSONObject.has(str2)) {
                    return null;
                }
                hashMap.put(str2, jSONObject.getString(str2));
            }
            if (m7127a(jSONObject.getString("report_ad_options")).size() == 0) {
                C2370a.m9149b(context, "reporting", C2373b.f7478M, new Exception("No report ad options"));
                return null;
            } else if (m7127a(jSONObject.getString("hide_ad_options")).size() != 0) {
                return hashMap;
            } else {
                C2370a.m9149b(context, "reporting", C2373b.f7480O, new Exception("No hide ad options"));
                return null;
            }
        } catch (JSONException e) {
            C2370a.m9149b(context, "reporting", C2373b.f7477L, e);
            return null;
        }
    }

    /* renamed from: c */
    public static String m7133c(Context context) {
        return m7145o(context).m7126a("hide_ad_description", "See fewer ads like this");
    }

    /* renamed from: d */
    public static C1713c m7134d(Context context) {
        C1713c cVar = new C1713c(m7145o(context).m7126a("hide_ad_follow_up_heading", "Help us understand what is happening. Why don't you want to see this?"));
        try {
            for (C1713c a : m7127a(m7145o(context).m7126a("hide_ad_options", ""))) {
                cVar.mo7478a(a);
            }
        } catch (JSONException e) {
            m7145o(context).m7128a();
            C2370a.m9149b(context, "reporting", C2373b.f7481P, e);
        }
        return cVar;
    }

    /* renamed from: e */
    public static String m7135e(Context context) {
        return m7145o(context).m7126a("report_ad", "Report Ad");
    }

    /* renamed from: f */
    public static String m7136f(Context context) {
        return m7145o(context).m7126a("report_ad_description", " Mark ad as offensive or inappropriate");
    }

    /* renamed from: g */
    public static C1713c m7137g(Context context) {
        C1713c cVar = new C1713c(m7145o(context).m7126a("report_ad_follow_up_heading", "Help us understand what is happening. Why is this inappropriate?"));
        try {
            for (C1713c a : m7127a(m7145o(context).m7126a("report_ad_options", ""))) {
                cVar.mo7478a(a);
            }
        } catch (JSONException e) {
            m7145o(context).m7128a();
            C2370a.m9149b(context, "reporting", C2373b.f7479N, e);
        }
        return cVar;
    }

    /* renamed from: h */
    public static String m7138h(Context context) {
        return m7145o(context).m7126a("manage_ad_preferences", "Manage ad preferences");
    }

    /* renamed from: i */
    public static String m7139i(Context context) {
        return m7145o(context).m7126a("finished_hide_ad", "Ad hidden.");
    }

    /* renamed from: j */
    public static String m7140j(Context context) {
        return m7145o(context).m7126a("finished_report_ad", "Ad reported.");
    }

    /* renamed from: k */
    public static String m7141k(Context context) {
        return m7145o(context).m7126a("finished_description", "Your submission is now being reviewed.");
    }

    /* renamed from: l */
    public static String m7142l(Context context) {
        return m7145o(context).m7126a("why_am_i_seeing_this", "Why am I seeing this?");
    }

    /* renamed from: m */
    public static String m7143m(Context context) {
        return m7145o(context).m7126a("ad_choices_uri", "");
    }

    /* renamed from: n */
    public static String m7144n(Context context) {
        return m7145o(context).m7126a("manage_ad_preferences_uri", "");
    }

    /* renamed from: o */
    private static C1710a m7145o(Context context) {
        if (f5358b == null) {
            synchronized (C1710a.class) {
                if (f5358b == null) {
                    f5358b = new C1710a(context);
                }
            }
        }
        return f5358b;
    }
}
