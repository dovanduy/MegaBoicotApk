package com.startapp.android.publish.adsCommon;

import android.app.Activity;
import android.content.Context;
import com.startapp.android.publish.common.metaData.MetaDataRequest.C5474a;

public class StartAppSDK {
    public static void init(Activity activity, String str) {
        init(activity, str, new SDKAdPreferences());
    }

    public static void init(Activity activity, String str, String str2) {
        init(activity, str, str2, new SDKAdPreferences());
    }

    public static void init(Activity activity, String str, SDKAdPreferences sDKAdPreferences) {
        C5427m.m23145a().mo19989a((Context) activity, (String) null, str, sDKAdPreferences, true);
    }

    public static void init(Activity activity, String str, String str2, SDKAdPreferences sDKAdPreferences) {
        C5427m.m23145a().mo19989a((Context) activity, str, str2, sDKAdPreferences, true);
    }

    public static void init(Activity activity, String str, boolean z) {
        init(activity, str, new SDKAdPreferences(), z);
    }

    public static void init(Activity activity, String str, String str2, boolean z) {
        init(activity, str, str2, new SDKAdPreferences(), z);
    }

    public static void init(Activity activity, String str, SDKAdPreferences sDKAdPreferences, boolean z) {
        C5427m.m23145a().mo19989a((Context) activity, (String) null, str, sDKAdPreferences, z);
    }

    public static void init(Activity activity, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z) {
        C5427m.m23145a().mo19989a((Context) activity, str, str2, sDKAdPreferences, z);
    }

    @Deprecated
    public static void init(Context context, String str, String str2) {
        init(context, str, str2, new SDKAdPreferences());
    }

    @Deprecated
    public static void init(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences) {
        C5427m.m23145a().mo19989a(context, str, str2, sDKAdPreferences, true);
    }

    @Deprecated
    public static void init(Context context, String str, boolean z) {
        init(context, (String) null, str, z);
    }

    @Deprecated
    public static void init(Context context, String str, String str2, boolean z) {
        init(context, str, str2, new SDKAdPreferences(), z);
    }

    @Deprecated
    public static void init(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z) {
        C5427m.m23145a().mo19989a(context, str, str2, sDKAdPreferences, z);
    }

    public static void inAppPurchaseMade(Context context) {
        inAppPurchaseMade(context, 0.0d);
    }

    public static void inAppPurchaseMade(Context context, double d) {
        C5414k.m23099b(context, "payingUser", Boolean.valueOf(true));
        C5414k.m23100b(context, "inAppPurchaseAmount", Float.valueOf((float) (((double) C5414k.m23093a(context, "inAppPurchaseAmount", Float.valueOf(0.0f)).floatValue()) + d)));
        C5427m.m23145a().mo19986a(context, C5474a.IN_APP_PURCHASE);
    }

    public static void startNewSession(Context context) {
        C5427m.m23145a().mo19986a(context, C5474a.CUSTOM);
    }

    public static void addWrapper(Context context, String str, String str2) {
        C5427m.m23145a().mo19988a(context, str, str2);
    }

    public static void enableReturnAds(boolean z) {
        C5427m.m23145a().mo20008e(z);
    }

    private static void pauseServices(Context context) {
        C5427m.m23145a().mo19985a(context);
        C5427m.m23145a().mo19995b(context);
    }

    private static void resumeServices(Context context) {
        C5427m.m23145a().mo19999c(context);
        C5427m.m23145a().mo20003d(context);
    }

    public static void setUserConsent(Context context, String str, long j, boolean z) {
        C5427m.m23145a().mo19987a(context, str, j, z, true);
    }
}
