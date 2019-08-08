package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C2579j;
import com.facebook.C2649m;
import com.facebook.C2757u;
import com.facebook.appevents.p128b.C2402a;
import com.facebook.internal.C2479ad;
import com.facebook.internal.C2484ae;
import com.facebook.internal.C2529l;
import com.facebook.internal.C2563u;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: com.facebook.appevents.g */
/* compiled from: AppEventsLogger */
public class C2436g {

    /* renamed from: a */
    private static final String f7700a = C2436g.class.getCanonicalName();

    /* renamed from: d */
    private static ScheduledThreadPoolExecutor f7701d;

    /* renamed from: e */
    private static C2439a f7702e = C2439a.AUTO;

    /* renamed from: f */
    private static Object f7703f = new Object();

    /* renamed from: g */
    private static String f7704g;

    /* renamed from: h */
    private static boolean f7705h;

    /* renamed from: i */
    private static String f7706i;

    /* renamed from: b */
    private final String f7707b;

    /* renamed from: c */
    private final C2382a f7708c;

    /* renamed from: com.facebook.appevents.g$a */
    /* compiled from: AppEventsLogger */
    public enum C2439a {
        AUTO,
        EXPLICIT_ONLY
    }

    /* renamed from: a */
    public static void m9319a(Application application, String str) {
        if (!C2649m.m10124a()) {
            throw new C2579j("The Facebook sdk must be initialized before calling activateApp");
        }
        C2400b.m9226a();
        if (str == null) {
            str = C2649m.m10137j();
        }
        C2649m.m10123a((Context) application, str);
        C2402a.m9234a(application, str);
    }

    /* renamed from: a */
    public static void m9321a(Context context, String str) {
        if (C2649m.m10139l()) {
            f7701d.execute(new Runnable(new C2436g(context, str, (AccessToken) null)) {

                /* renamed from: a */
                final /* synthetic */ C2436g f7709a;

                {
                    this.f7709a = r1;
                }

                public void run() {
                    Bundle bundle = new Bundle();
                    try {
                        Class.forName("com.facebook.core.Core");
                        bundle.putInt("core_lib_included", 1);
                    } catch (ClassNotFoundException unused) {
                    }
                    try {
                        Class.forName("com.facebook.login.Login");
                        bundle.putInt("login_lib_included", 1);
                    } catch (ClassNotFoundException unused2) {
                    }
                    try {
                        Class.forName("com.facebook.share.Share");
                        bundle.putInt("share_lib_included", 1);
                    } catch (ClassNotFoundException unused3) {
                    }
                    try {
                        Class.forName("com.facebook.places.Places");
                        bundle.putInt("places_lib_included", 1);
                    } catch (ClassNotFoundException unused4) {
                    }
                    try {
                        Class.forName("com.facebook.messenger.Messenger");
                        bundle.putInt("messenger_lib_included", 1);
                    } catch (ClassNotFoundException unused5) {
                    }
                    try {
                        Class.forName("com.facebook.applinks.AppLinks");
                        bundle.putInt("applinks_lib_included", 1);
                    } catch (ClassNotFoundException unused6) {
                    }
                    try {
                        Class.forName("com.facebook.all.All");
                        bundle.putInt("all_lib_included", 1);
                    } catch (ClassNotFoundException unused7) {
                    }
                    this.f7709a.mo8855a("fb_sdk_initialize", (Double) null, bundle);
                }
            });
        }
    }

    /* renamed from: a */
    public static C2436g m9318a(Context context) {
        return new C2436g(context, (String) null, (AccessToken) null);
    }

    /* renamed from: b */
    public static C2436g m9325b(Context context, String str) {
        return new C2436g(context, str, (AccessToken) null);
    }

    /* renamed from: a */
    public static C2439a m9317a() {
        C2439a aVar;
        synchronized (f7703f) {
            aVar = f7702e;
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo8854a(String str, Bundle bundle) {
        m9323a(str, null, bundle, false, C2402a.m9231a());
    }

    /* renamed from: a */
    public void mo8853a(String str, double d, Bundle bundle) {
        m9323a(str, Double.valueOf(d), bundle, false, C2402a.m9231a());
    }

    /* renamed from: a */
    public void mo8856a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        m9324a(bigDecimal, currency, bundle, true);
    }

    /* renamed from: a */
    private void m9324a(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (bigDecimal == null) {
            m9322a("purchaseAmount cannot be null");
        } else if (currency == null) {
            m9322a("currency cannot be null");
        } else {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            m9323a("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z, C2402a.m9231a());
            m9330f();
        }
    }

    /* renamed from: b */
    public void mo8857b() {
        C2427e.m9304a(C2440h.EXPLICIT);
    }

    /* renamed from: c */
    public static void m9327c() {
        C2427e.m9301a();
    }

    /* renamed from: d */
    static String m9328d() {
        String str;
        synchronized (f7703f) {
            str = f7706i;
        }
        return str;
    }

    /* renamed from: e */
    public static String m9329e() {
        return C2400b.m9227b();
    }

    /* renamed from: a */
    public void mo8855a(String str, Double d, Bundle bundle) {
        m9323a(str, d, bundle, true, C2402a.m9231a());
    }

    private C2436g(Context context, String str, AccessToken accessToken) {
        this(C2479ad.m9466c(context), str, accessToken);
    }

    protected C2436g(String str, String str2, AccessToken accessToken) {
        C2484ae.m9487a();
        this.f7707b = str;
        if (accessToken == null) {
            accessToken = AccessToken.m6161a();
        }
        if (!AccessToken.m6168b() || (str2 != null && !str2.equals(accessToken.mo6623j()))) {
            if (str2 == null) {
                str2 = C2479ad.m9426a(C2649m.m10133f());
            }
            this.f7708c = new C2382a(null, str2);
        } else {
            this.f7708c = new C2382a(accessToken);
        }
        m9332h();
    }

    /* renamed from: h */
    private static void m9332h() {
        synchronized (f7703f) {
            if (f7701d == null) {
                f7701d = new ScheduledThreadPoolExecutor(1);
                f7701d.scheduleAtFixedRate(new Runnable() {
                    public void run() {
                        HashSet<String> hashSet = new HashSet<>();
                        for (C2382a b : C2427e.m9305b()) {
                            hashSet.add(b.mo8791b());
                        }
                        for (String a : hashSet) {
                            C2529l.m9634a(a, true);
                        }
                    }
                }, 0, 86400, TimeUnit.SECONDS);
            }
        }
    }

    /* renamed from: a */
    private void m9323a(String str, Double d, Bundle bundle, boolean z, UUID uuid) {
        try {
            C2422c cVar = new C2422c(this.f7707b, str, d, bundle, z, uuid);
            m9320a(C2649m.m10133f(), cVar, this.f7708c);
        } catch (JSONException e) {
            C2563u.m9722a(C2757u.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e.toString());
        } catch (C2579j e2) {
            C2563u.m9722a(C2757u.APP_EVENTS, "AppEvents", "Invalid app event: %s", e2.toString());
        }
    }

    /* renamed from: a */
    private static void m9320a(Context context, C2422c cVar, C2382a aVar) {
        C2427e.m9303a(aVar, cVar);
        if (!cVar.mo8838b() && !f7705h) {
            if (cVar.mo8837a() == "fb_mobile_activate_app") {
                f7705h = true;
            } else {
                C2563u.m9721a(C2757u.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }
    }

    /* renamed from: f */
    static void m9330f() {
        if (m9317a() != C2439a.EXPLICIT_ONLY) {
            C2427e.m9304a(C2440h.EAGER_FLUSHING_EVENT);
        }
    }

    /* renamed from: a */
    private static void m9322a(String str) {
        C2563u.m9721a(C2757u.DEVELOPER_ERRORS, "AppEvents", str);
    }

    /* renamed from: g */
    static Executor m9331g() {
        if (f7701d == null) {
            m9332h();
        }
        return f7701d;
    }

    /* renamed from: b */
    public static String m9326b(Context context) {
        if (f7704g == null) {
            synchronized (f7703f) {
                if (f7704g == null) {
                    f7704g = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    if (f7704g == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("XZ");
                        sb.append(UUID.randomUUID().toString());
                        f7704g = sb.toString();
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", f7704g).apply();
                    }
                }
            }
        }
        return f7704g;
    }
}
