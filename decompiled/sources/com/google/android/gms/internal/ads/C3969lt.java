package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.util.C3566r;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.lt */
final class C3969lt implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ Context f13520a;

    C3969lt(C3968ls lsVar, Context context) {
        this.f13520a = context;
    }

    public final /* synthetic */ Object call() throws Exception {
        SharedPreferences sharedPreferences = this.f13520a.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            C3900je.m17043a("User agent is not initialized on Google Play Services. Initializing.");
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f13520a);
            C3566r.m12778a(this.f13520a, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
            return defaultUserAgent;
        }
        C3900je.m17043a("User agent is already initialized on Google Play Services.");
        return string;
    }
}
