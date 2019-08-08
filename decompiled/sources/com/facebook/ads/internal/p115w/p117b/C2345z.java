package com.facebook.ads.internal.p115w.p117b;

import android.app.KeyguardManager;
import android.content.Context;
import android.util.Log;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.w.b.z */
public class C2345z {

    /* renamed from: a */
    private static final String f7376a = "z";

    /* renamed from: a */
    public static boolean m9094a(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }

    /* renamed from: a */
    public static boolean m9095a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            Log.v(f7376a, "Invalid Window info in window interactive check, assuming is not a Lockscreen.");
            return false;
        }
        String str = (String) map.get("wfdkg");
        String str2 = (String) map.get("wfswl");
        String str3 = (String) map.get("kgr");
        return str != null && str.equals("1") && str2 != null && str2.equals("1") && str3 != null && str3.equals("true");
    }

    /* renamed from: b */
    public static boolean m9096b(Map<String, String> map) {
        boolean z = false;
        if (map == null || map.isEmpty()) {
            Log.v(f7376a, "Invalid Window info in window interactive check, assuming not obstructed by Keyguard.");
            return false;
        }
        String str = (String) map.get("wfdkg");
        String str2 = (String) map.get("wfswl");
        if ((str != null && str.equals("1")) || (str2 != null && str2.equals("1"))) {
            return false;
        }
        String str3 = (String) map.get("kgr");
        if (str3 != null && str3.equals("true")) {
            z = true;
        }
        return z;
    }
}
