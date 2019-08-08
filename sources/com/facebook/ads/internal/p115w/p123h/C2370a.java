package com.facebook.ads.internal.p115w.p123h;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.p082i.C1736a;
import com.facebook.ads.internal.p084k.C1756e;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.ads.internal.w.h.a */
public class C2370a {

    /* renamed from: a */
    public static C2372a f7458a = null;

    /* renamed from: b */
    static Executor f7459b = Executors.newSingleThreadExecutor();

    /* renamed from: c */
    public static boolean f7460c = false;

    /* renamed from: d */
    private static final Set<Integer> f7461d = new HashSet();

    /* renamed from: com.facebook.ads.internal.w.h.a$a */
    public interface C2372a {
        /* renamed from: a */
        Map<String, String> mo7617a();

        /* renamed from: b */
        boolean mo7618b();
    }

    /* renamed from: a */
    public static void m9146a(Context context, String str, int i, Exception exc) {
        boolean z = false;
        try {
            synchronized (f7461d) {
                if (!f7461d.contains(Integer.valueOf(i))) {
                    f7461d.add(Integer.valueOf(i));
                    z = true;
                }
            }
            if (z) {
                if (m9148a(context, str, i, Math.random())) {
                    m9150c(context, str, i, exc);
                }
            }
        } catch (Throwable th) {
            m9147a(th);
        }
    }

    /* renamed from: a */
    public static void m9147a(Throwable th) {
        Log.e(AudienceNetworkAds.TAG, "Exception during logging debug event.", th);
        if (f7460c) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    static boolean m9148a(Context context, String str, int i, double d) {
        double u;
        double d2;
        Set s = C1795a.m7460s(context);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(i);
        if (s.contains(sb.toString())) {
            u = (double) (C1795a.m7462u(context) * C1795a.m7461t(context));
            d2 = 10000.0d;
        } else {
            u = (double) C1795a.m7462u(context);
            d2 = 100.0d;
        }
        return d >= 1.0d - (u / d2);
    }

    /* renamed from: b */
    public static void m9149b(Context context, String str, int i, Exception exc) {
        if (context == null) {
            try {
                m9147a(new RuntimeException("Can't log Debug Event. Context is null."));
            } catch (Throwable th) {
                m9147a(th);
            }
        } else {
            C1736a.m7216a(context);
            if (f7460c) {
                StringBuilder sb = new StringBuilder();
                sb.append("Debug crash because of event with subtype = ");
                sb.append(str);
                sb.append(", subtypeCode = ");
                sb.append(i);
                String sb2 = sb.toString();
                if (!AdInternalSettings.f5734d || i != C2373b.f7493aa) {
                    throw new RuntimeException(sb2, exc);
                }
            }
            if (m9148a(context, str, i, Math.random())) {
                m9150c(context, str, i, exc);
            }
        }
    }

    /* renamed from: c */
    private static void m9150c(final Context context, final String str, final int i, final Exception exc) {
        if (f7458a != null && f7458a.mo7618b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Debug Event with subtype = ");
            sb.append(str);
            sb.append(", subtypeCode = ");
            sb.append(i);
            Log.e(AudienceNetworkAds.TAG, sb.toString(), exc);
        }
        f7459b.execute(new Runnable() {
            public void run() {
                Map map;
                try {
                    if (C2370a.f7458a != null) {
                        map = C2370a.f7458a.mo7617a();
                    } else if (C2370a.f7460c) {
                        throw new RuntimeException("Debug crash because sEnvironmentDataProvider not injected", exc);
                    } else {
                        map = new HashMap();
                    }
                    map.put("subtype", str);
                    map.put("subtype_code", String.valueOf(i));
                    C1756e.m7278a(exc, context, map);
                } catch (Throwable th) {
                    C2370a.m9147a(th);
                }
            }
        });
    }
}
