package com.facebook.ads.internal.p115w.p117b;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.internal.settings.AdInternalSettings;

/* renamed from: com.facebook.ads.internal.w.b.c */
public class C2308c {
    /* renamed from: a */
    public static void m9019a() {
        try {
            Class.forName("android.os.AsyncTask");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m9020a(Context context, String str) {
        if (AdInternalSettings.isTestMode(context)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" (displayed for test ads only)");
            Log.d("FBAudienceNetworkLog", sb.toString());
        }
    }
}
