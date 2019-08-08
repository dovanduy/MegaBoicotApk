package com.facebook.ads;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.p087n.C1767a;
import com.facebook.ads.internal.p115w.p117b.C2324l;
import com.facebook.ads.internal.p115w.p121f.C2362a;

public final class AudienceNetworkAds {
    public static final String TAG = "FBAudienceNetwork";

    private AudienceNetworkAds() {
    }

    public static void initialize(Context context) {
        C2324l.m9048a(context, "Context can not be null.");
        C1767a.m7337a(context);
    }

    public static boolean isInAdsProcess(Context context) {
        C2324l.m9048a(context, "Context can not be null.");
        C2362a.f7435a = true;
        String a = C2362a.m9137a(context);
        return !TextUtils.isEmpty(a) && a.endsWith(":adnw");
    }
}
