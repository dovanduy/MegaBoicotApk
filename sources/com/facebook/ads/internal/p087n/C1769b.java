package com.facebook.ads.internal.p087n;

import android.content.Context;
import android.os.Build;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.n.b */
class C1769b {

    /* renamed from: a */
    private static final String f5555a = "b";

    /* renamed from: b */
    private static final AtomicBoolean f5556b = new AtomicBoolean();

    C1769b() {
    }

    /* renamed from: a */
    static String m7342a(Context context) {
        JSONObject jSONObject = new JSONObject();
        m7343a(jSONObject, "is_emu", String.valueOf(Build.FINGERPRINT.contains("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT)));
        m7343a(jSONObject, "apk_size", String.valueOf(m7344b(context)));
        return jSONObject.toString();
    }

    /* renamed from: a */
    private static void m7343a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    private static long m7344b(Context context) {
        try {
            return new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).publicSourceDir).length();
        } catch (Exception e) {
            if (f5556b.compareAndSet(false, true)) {
                C2370a.m9149b(context, "generic", C2373b.f7468C, e);
            }
            return -1;
        }
    }
}
