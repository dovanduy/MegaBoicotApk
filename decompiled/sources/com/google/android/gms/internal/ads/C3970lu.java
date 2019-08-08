package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.lu */
final class C3970lu implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ Context f13521a;

    /* renamed from: b */
    private final /* synthetic */ Context f13522b;

    C3970lu(C3968ls lsVar, Context context, Context context2) {
        this.f13521a = context;
        this.f13522b = context2;
    }

    public final /* synthetic */ Object call() throws Exception {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.f13521a != null) {
            C3900je.m17043a("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f13521a.getSharedPreferences("admob_user_agent", 0);
        } else {
            C3900je.m17043a("Attempting to read user agent from local cache.");
            sharedPreferences = this.f13522b.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            C3900je.m17043a("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f13522b);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                C3900je.m17043a("Persisting user agent.");
            }
        }
        return string;
    }
}
