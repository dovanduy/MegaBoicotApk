package com.facebook.ads.internal.p087n;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.p082i.C1736a;
import com.facebook.ads.internal.p084k.C1754c;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p115w.p116a.C2305b;
import com.facebook.ads.internal.p115w.p117b.C2306a;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2370a.C2372a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.n.a */
public final class C1767a {

    /* renamed from: a */
    private static boolean f5553a;

    /* renamed from: a */
    public static synchronized void m7337a(Context context) {
        synchronized (C1767a.class) {
            if (C1736a.m7215a() == null) {
                Context applicationContext = context.getApplicationContext();
                C1736a.m7216a(applicationContext);
                m7339c(applicationContext);
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m7338b(Context context) {
        synchronized (C1767a.class) {
            Context a = C1736a.m7215a();
            if (a == null) {
                a = context.getApplicationContext();
                C1736a.m7216a(a);
                m7339c(a);
                Log.e(AudienceNetworkAds.TAG, "You don't call AudienceNetworkAds.initialize(). Some functionality may not work properly.");
                C2370a.m9146a(a, "api", C2373b.f7514p, new Exception("initialize() not called."));
            }
            if (!f5553a) {
                if (C1795a.m7457p(a)) {
                    try {
                        Thread.setDefaultUncaughtExceptionHandler(new C1754c(Thread.getDefaultUncaughtExceptionHandler(), a, C1771d.m7355b(a)));
                    } catch (SecurityException e) {
                        Log.e(AudienceNetworkAds.TAG, "No permissions to set the default uncaught exception handler", e);
                    }
                }
                f5553a = true;
            }
        }
    }

    /* renamed from: c */
    private static synchronized void m7339c(final Context context) {
        synchronized (C1767a.class) {
            if (C2370a.f7458a == null) {
                C2370a.f7458a = new C2372a() {
                    /* renamed from: a */
                    public Map<String, String> mo7617a() {
                        return C1771d.m7355b(context);
                    }

                    /* renamed from: b */
                    public boolean mo7618b() {
                        return C2306a.m9015a();
                    }
                };
            }
            C2305b.m9013a(context);
        }
    }
}
