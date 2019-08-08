package com.facebook.ads.internal.p087n;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.p115w.p121f.C2362a;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.n.c */
public class C1770c {

    /* renamed from: a */
    private static AtomicBoolean f5557a;

    /* renamed from: a */
    public static String m7345a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            String a = C2362a.m9137a(context);
            if (a == null) {
                a = "Unknown";
            }
            jSONObject.put("process_name", a);
            jSONObject.put("is_ads_process", AdInternalSettings.f5734d);
            jSONObject.put("client_supports", m7346b(context.getApplicationContext()));
        } catch (Exception e) {
            C2370a.m9149b(context, "generic", C2373b.f7469D, e);
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public static boolean m7346b(Context context) {
        AtomicBoolean atomicBoolean;
        if (AdInternalSettings.f5733c) {
            return false;
        }
        if (f5557a != null) {
            return f5557a.get();
        }
        Context applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            Log.w(AudienceNetworkAds.TAG, "Multi-process support won't work because application Context is not Application instance.");
            C2370a.m9146a(context, "ipc", C2373b.f7496ad, new Exception("ApplicationContext is not Application."));
            atomicBoolean = new AtomicBoolean(false);
        } else if (C2362a.f7435a || ((Application) applicationContext).getClass().equals(Application.class)) {
            f5557a = new AtomicBoolean(true);
            return true;
        } else {
            Log.e(AudienceNetworkAds.TAG, "You are using custom Application class and don't call AudienceNetworkAds.isInAdsProcess(). Multi-process support will be disabled. Please call AudienceNetworkAds.isInAdsProcess() if you want to support multi-process mode.");
            C2370a.m9146a(context, "ipc", C2373b.f7497ae, new Exception("No AudienceNetworkAds.isInAdsProcess() call."));
            atomicBoolean = new AtomicBoolean(false);
        }
        f5557a = atomicBoolean;
        return false;
    }
}
