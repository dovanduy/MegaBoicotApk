package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C2649m;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C1503b;
import com.facebook.appevents.p128b.C2412d;
import com.facebook.appevents.p128b.C2414e;
import com.facebook.internal.C2512d.C2513a;
import com.facebook.internal.C2512d.C2514b;
import com.facebook.internal.C2527k.C2528a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.l */
/* compiled from: FetchedAppSettingsManager */
public final class C2529l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f7933a = C2529l.class.getCanonicalName();

    /* renamed from: b */
    private static final String[] f7934b = {"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "gdpv4_chrome_custom_tabs_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url"};

    /* renamed from: c */
    private static Map<String, C2527k> f7935c = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static AtomicBoolean f7936d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static boolean f7937e = false;

    /* renamed from: a */
    public static void m9636a() {
        final Context f = C2649m.m10133f();
        final String j = C2649m.m10137j();
        boolean compareAndSet = f7936d.compareAndSet(false, true);
        if (!C2479ad.m9456a(j) && !f7935c.containsKey(j) && compareAndSet) {
            final String format = String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[]{j});
            C2649m.m10131d().execute(new Runnable() {
                public void run() {
                    JSONObject jSONObject;
                    SharedPreferences sharedPreferences = f.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                    C2527k kVar = null;
                    String string = sharedPreferences.getString(format, null);
                    if (!C2479ad.m9456a(string)) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException e) {
                            C2479ad.m9447a("FacebookSDK", (Exception) e);
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            kVar = C2529l.m9639b(j, jSONObject);
                        }
                    }
                    JSONObject b = C2529l.m9644c(j);
                    if (b != null) {
                        C2529l.m9639b(j, b);
                        sharedPreferences.edit().putString(format, b.toString()).apply();
                    }
                    if (kVar != null) {
                        String l = kVar.mo9006l();
                        if (!C2529l.f7937e && l != null && l.length() > 0) {
                            C2529l.f7937e = true;
                            Log.w(C2529l.f7933a, l);
                        }
                    }
                    C2412d.m9253a();
                    C2529l.m9641b(f);
                    C2529l.f7936d.set(false);
                }
            });
        }
    }

    /* renamed from: a */
    public static C2527k m9632a(String str) {
        if (str != null) {
            return (C2527k) f7935c.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public static C2527k m9634a(String str, boolean z) {
        if (!z && f7935c.containsKey(str)) {
            return (C2527k) f7935c.get(str);
        }
        JSONObject c = m9644c(str);
        if (c == null) {
            return null;
        }
        return m9639b(str, c);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C2527k m9639b(String str, JSONObject jSONObject) {
        C2520h a;
        JSONObject jSONObject2 = jSONObject;
        JSONArray optJSONArray = jSONObject2.optJSONArray("android_sdk_error_categories");
        if (optJSONArray == null) {
            a = C2520h.m9605a();
        } else {
            a = C2520h.m9606a(optJSONArray);
        }
        C2520h hVar = a;
        int optInt = jSONObject2.optInt("app_events_feature_bitmask", 0);
        C2527k kVar = new C2527k(jSONObject2.optBoolean("supports_implicit_sdk_logging", false), jSONObject2.optString("gdpv4_nux_content", ""), jSONObject2.optBoolean("gdpv4_nux_enabled", false), jSONObject2.optBoolean("gdpv4_chrome_custom_tabs_enabled", false), jSONObject2.optInt("app_events_session_timeout", C2414e.m9259a()), C2477ab.m9414a(jSONObject2.optLong("seamless_login")), m9635a(jSONObject2.optJSONObject("android_dialog_configs")), (optInt & 8) != 0, hVar, jSONObject2.optString("smart_login_bookmark_icon_url"), jSONObject2.optString("smart_login_menu_icon_url"), (optInt & 16) != 0, (optInt & 32) != 0, jSONObject2.optJSONArray("auto_event_mapping_android"), jSONObject2.optString("sdk_update_message"));
        f7935c.put(str, kVar);
        return kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static JSONObject m9644c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", new ArrayList(Arrays.asList(f7934b))));
        GraphRequest a = GraphRequest.m6206a((AccessToken) null, str, (C1503b) null);
        a.mo6678a(true);
        a.mo6672a(bundle);
        return a.mo6686i().mo9371b();
    }

    /* renamed from: a */
    private static Map<String, Map<String, C2528a>> m9635a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C2528a a = C2528a.m9628a(optJSONArray.optJSONObject(i));
                    if (a != null) {
                        String a2 = a.mo9007a();
                        Map map = (Map) hashMap.get(a2);
                        if (map == null) {
                            map = new HashMap();
                            hashMap.put(a2, map);
                        }
                        map.put(a.mo9008b(), a);
                    }
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m9641b(final Context context) {
        C2512d.m9586a(C2514b.InAppPurchase.mo8989a(), new C2513a() {
            /* renamed from: a */
            public boolean mo8988a(final int i, final Intent intent) {
                C2649m.m10131d().execute(new Runnable() {
                    public void run() {
                        C2412d.m9255a(context, i, intent);
                    }
                });
                return true;
            }
        });
    }
}
