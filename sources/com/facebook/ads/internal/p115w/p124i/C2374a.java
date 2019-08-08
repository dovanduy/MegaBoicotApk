package com.facebook.ads.internal.p115w.p124i;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.util.Log;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;

/* renamed from: com.facebook.ads.internal.w.i.a */
public class C2374a {

    /* renamed from: a */
    private static final String f7525a = "a";

    /* renamed from: a */
    public static boolean m9153a(Context context) {
        return m9154b(context) && C2375b.m9156b(context);
    }

    /* renamed from: b */
    public static boolean m9154b(Context context) {
        if (context == null) {
            Log.v(f7525a, "Invalid context in screen interactive check, assuming interactive.");
            return true;
        }
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            return VERSION.SDK_INT >= 20 ? powerManager.isInteractive() : powerManager.isScreenOn();
        } catch (Exception e) {
            Log.e(f7525a, "Exception in screen interactive check, assuming interactive.", e);
            C2370a.m9149b(context, "risky", C2373b.f7472G, e);
            return true;
        }
    }
}
