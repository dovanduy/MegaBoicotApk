package com.facebook.ads.internal.p115w.p124i;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.util.Log;
import android.view.Window;
import com.facebook.ads.internal.p115w.p117b.C2345z;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.w.i.b */
public class C2375b {

    /* renamed from: a */
    private static final String f7526a = "b";

    /* renamed from: a */
    public static Map<String, String> m9155a(Context context) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        if (context == null) {
            Log.v(f7526a, "Null context in window interactive check.");
            return hashMap;
        }
        try {
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            hashMap.put("kgr", String.valueOf(keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode()));
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    int i = window.getAttributes().flags;
                    hashMap.put("wt", Integer.toString(window.getAttributes().type));
                    hashMap.put("wfdkg", (4194304 & i) > 0 ? "1" : "0");
                    hashMap.put("wfswl", (524288 & i) > 0 ? "1" : "0");
                    return hashMap;
                }
                str = f7526a;
                str2 = "Invalid window in window interactive check, assuming interactive.";
            } else {
                str = f7526a;
                str2 = "Invalid Activity context in window interactive check, assuming interactive.";
            }
            Log.v(str, str2);
            return hashMap;
        } catch (Exception e) {
            Log.e(f7526a, "Exception in window info check", e);
            C2370a.m9149b(context, "risky", C2373b.f7473H, e);
            return hashMap;
        }
    }

    /* renamed from: b */
    public static boolean m9156b(Context context) {
        return !C2345z.m9096b(m9155a(context));
    }
}
