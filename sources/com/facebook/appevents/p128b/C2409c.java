package com.facebook.appevents.p128b;

import android.content.Context;
import com.facebook.C2757u;
import com.facebook.appevents.C2436g;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2499b;
import com.facebook.internal.C2563u;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.b.c */
/* compiled from: AppEventsLoggerUtility */
public class C2409c {

    /* renamed from: a */
    private static final Map<C2411a, String> f7653a = new HashMap<C2411a, String>() {
        {
            put(C2411a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL");
            put(C2411a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS");
        }
    };

    /* renamed from: com.facebook.appevents.b.c$a */
    /* compiled from: AppEventsLoggerUtility */
    public enum C2411a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    /* renamed from: a */
    public static JSONObject m9251a(C2411a aVar, C2499b bVar, String str, boolean z, Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f7653a.get(aVar));
        String e = C2436g.m9329e();
        if (e != null) {
            jSONObject.put("app_user_id", e);
        }
        C2479ad.m9451a(jSONObject, bVar, str, z);
        try {
            C2479ad.m9450a(jSONObject, context);
        } catch (Exception e2) {
            C2563u.m9722a(C2757u.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e2.toString());
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
