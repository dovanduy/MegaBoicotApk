package com.facebook.ads.internal.p084k;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p115w.p117b.C2327o;
import com.facebook.ads.internal.p115w.p117b.C2332s;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.k.c */
public class C1754c implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final UncaughtExceptionHandler f5494a;

    /* renamed from: b */
    private final Context f5495b;

    /* renamed from: c */
    private final Map<String, String> f5496c;

    public C1754c(UncaughtExceptionHandler uncaughtExceptionHandler, Context context, Map<String, String> map) {
        this.f5494a = uncaughtExceptionHandler;
        if (context == null) {
            throw new IllegalArgumentException("Missing Context");
        }
        this.f5495b = context.getApplicationContext();
        this.f5496c = map;
    }

    /* renamed from: a */
    private static void m7272a() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            String a = C2332s.m9057a(th);
            if (a != null && a.contains(BuildConfig.APPLICATION_ID)) {
                Map a2 = new C1753b(a, this.f5496c).mo7570a();
                a2.put("subtype", "crash");
                a2.put("subtype_code", "0");
                C1756e.m7281a(new C1755d(C2327o.m9053b(), C2327o.m9054c(), a2), this.f5495b);
            }
        } catch (Exception unused) {
        }
        if (C1795a.m7430X(this.f5495b) && AdInternalSettings.f5734d) {
            try {
                Log.e(AudienceNetworkAds.TAG, "Facebook Audience Network process crashed with exception: ", th);
            } catch (Throwable unused2) {
            }
        } else if (this.f5494a != null) {
            this.f5494a.uncaughtException(thread, th);
            return;
        }
        m7272a();
    }
}
