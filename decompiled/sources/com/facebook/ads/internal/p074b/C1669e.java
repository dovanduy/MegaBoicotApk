package com.facebook.ads.internal.p074b;

import android.content.Context;
import android.support.p017v4.content.C0362f;
import android.support.p028v7.widget.RecyclerView;
import android.util.Log;
import com.facebook.ads.AdSettings.IntegrationErrorMode;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.C1782a;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Locale;

/* renamed from: com.facebook.ads.internal.b.e */
public class C1669e {
    /* renamed from: a */
    public static IntegrationErrorMode m6978a(Context context) {
        IntegrationErrorMode integrationErrorMode = (IntegrationErrorMode) AdInternalSettings.f5731a.getSerializable("SRL_INTEGRATION_ERROR_MODE_KEY");
        if (integrationErrorMode == null) {
            integrationErrorMode = IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
        }
        if (integrationErrorMode != IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE) {
            return integrationErrorMode;
        }
        return !((context.getApplicationInfo().flags & 2) != 0) ? IntegrationErrorMode.INTEGRATION_ERROR_CALLBACK_MODE : integrationErrorMode;
    }

    /* renamed from: a */
    public static C1782a m6979a(Context context, Integer... numArr) {
        String str;
        Class cls;
        if (C1795a.m7435aa(context)) {
            return null;
        }
        IntegrationErrorMode a = m6978a(context);
        String format = String.format(Locale.US, AdErrorType.MISSING_DEPENDENCIES_ERROR.getDefaultErrorMessage(), new Object[]{AudienceNetworkAds.TAG});
        switch (a) {
            case INTEGRATION_ERROR_CRASH_DEBUG_MODE:
            case INTEGRATION_ERROR_CALLBACK_MODE:
                boolean z = true;
                for (Integer intValue : numArr) {
                    switch (intValue.intValue()) {
                        case 0:
                            str = "android.support.v4.content.LocalBroadcastManager";
                            cls = C0362f.class;
                            break;
                        case 1:
                            str = "android.support.v7.widget.RecyclerView";
                            cls = RecyclerView.class;
                            break;
                    }
                    try {
                        Class.forName(cls.getName());
                    } catch (Throwable unused) {
                        String str2 = AudienceNetworkAds.TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Dependency not found: ");
                        sb.append(str);
                        Log.e(str2, sb.toString());
                        int i = C2373b.f7516r;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Missing dependency class: ");
                        sb2.append(str);
                        C2370a.m9146a(context, "api", i, new Exception(sb2.toString()));
                        z = false;
                    }
                }
                if (z) {
                    return null;
                }
                switch (a) {
                    case INTEGRATION_ERROR_CRASH_DEBUG_MODE:
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(format);
                        sb3.append(". You can change Integration Error mode by setting AdSettings.setIntegrationErrorMode()");
                        throw new RuntimeException(sb3.toString());
                    case INTEGRATION_ERROR_CALLBACK_MODE:
                        C1782a a2 = C1782a.m7381a(AdErrorType.MISSING_DEPENDENCIES_ERROR, format);
                        Log.e(AudienceNetworkAds.TAG, format);
                        C2370a.m9146a(context, "api", C2373b.f7516r, new Exception(format));
                        return a2;
                    default:
                        return null;
                }
            default:
                Log.e(AudienceNetworkAds.TAG, format);
                return null;
        }
    }
}
