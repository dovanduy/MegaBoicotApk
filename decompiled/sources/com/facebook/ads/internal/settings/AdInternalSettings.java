package com.facebook.ads.internal.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p115w.p121f.C2362a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

public class AdInternalSettings {

    /* renamed from: a */
    public static Bundle f5731a = new Bundle();

    /* renamed from: b */
    public static boolean f5732b = false;

    /* renamed from: c */
    public static boolean f5733c = false;

    /* renamed from: d */
    public static boolean f5734d = false;

    /* renamed from: e */
    public static int f5735e = 0;

    /* renamed from: f */
    public static int f5736f = 0;

    /* renamed from: g */
    private static final String f5737g = "AdInternalSettings";

    /* renamed from: h */
    private static final Collection<String> f5738h = new HashSet();

    /* renamed from: i */
    private static volatile boolean f5739i = false;

    static {
        f5738h.add("sdk");
        f5738h.add("google_sdk");
        f5738h.add("vbox86p");
        f5738h.add("vbox86tp");
    }

    /* renamed from: a */
    private static ArrayList<String> m7579a() {
        ArrayList<String> stringArrayList = f5731a.getStringArrayList("LIST_TEST_DEVICES_KEY");
        if (stringArrayList != null) {
            return stringArrayList;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        f5731a.putStringArrayList("LIST_TEST_DEVICES_KEY", arrayList);
        return arrayList;
    }

    public static void addTestDevice(String str) {
        m7579a().add(str);
    }

    public static void addTestDevices(Collection<String> collection) {
        m7579a().addAll(collection);
    }

    public static void clearTestDevices() {
        m7579a().clear();
    }

    public static String getMediationService() {
        return f5731a.getString("STR_MEDIATION_SERVICE_KEY", null);
    }

    public static String getUrlPrefix() {
        return f5731a.getString("STR_URL_PREFIX_KEY", null);
    }

    public static boolean isDebugBuild() {
        return f5731a.getBoolean("BOOL_DEBUG_BUILD_KEY", false);
    }

    public static boolean isExplicitTestMode() {
        return f5731a.getBoolean("BOOL_EXPLICIT_TEST_MODE_KEY", false);
    }

    public static boolean isTestMode(Context context) {
        if (f5731a.getBoolean("BOOL_DEBUG_BUILD_KEY", false) || isExplicitTestMode() || f5738h.contains(Build.PRODUCT)) {
            return true;
        }
        String string = f5731a.getString("STR_DEVICE_ID_HASH_KEY", null);
        if (string == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(C2362a.m9138a("FBAdPrefs", context), 0);
            string = sharedPreferences.getString("deviceIdHash", null);
            if (TextUtils.isEmpty(string)) {
                string = UUID.randomUUID().toString();
                sharedPreferences.edit().putString("deviceIdHash", string).apply();
            }
            f5731a.putString("STR_DEVICE_ID_HASH_KEY", string);
        }
        if (m7579a().contains(string)) {
            return true;
        }
        if (f5739i) {
            return false;
        }
        f5739i = true;
        String str = f5737g;
        StringBuilder sb = new StringBuilder();
        sb.append("Test mode device hash: ");
        sb.append(string);
        Log.d(str, sb.toString());
        String str2 = f5737g;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("When testing your app with Facebook's ad units you must specify the device hashed ID to ensure the delivery of test ads, add the following code before loading an ad: AdSettings.addTestDevice(\"");
        sb2.append(string);
        sb2.append("\");");
        Log.d(str2, sb2.toString());
        return false;
    }

    public static boolean isVideoAutoplay() {
        return f5731a.getBoolean("BOOL_VIDEO_AUTOPLAY_KEY");
    }

    public static boolean isVideoAutoplayOnMobile() {
        return f5731a.getBoolean("BOOL_AUTOPLAY_ON_MOBILE_KEY", false);
    }

    public static boolean isVisibleAnimation() {
        return f5731a.getBoolean("BOOL_VISIBLE_ANIMATION_KEY", false);
    }

    public static void setDebugBuild(boolean z) {
        f5731a.putBoolean("BOOL_DEBUG_BUILD_KEY", z);
    }

    public static void setMediationService(String str) {
        f5731a.putString("STR_MEDIATION_SERVICE_KEY", str);
    }

    public static void setTestMode(boolean z) {
        f5731a.putBoolean("BOOL_EXPLICIT_TEST_MODE_KEY", z);
    }

    public static void setUrlPrefix(String str) {
        f5731a.putString("STR_URL_PREFIX_KEY", str);
    }

    public static void setVideoAutoplay(boolean z) {
        f5731a.putBoolean("BOOL_VIDEO_AUTOPLAY_KEY", z);
    }

    public static void setVideoAutoplayOnMobile(boolean z) {
        f5731a.putBoolean("BOOL_AUTOPLAY_ON_MOBILE_KEY", z);
    }

    public static void setVisibleAnimation(boolean z) {
        f5731a.putBoolean("BOOL_VISIBLE_ANIMATION_KEY", z);
    }
}
