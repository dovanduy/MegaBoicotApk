package com.startapp.android.publish.adsCommon;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.startapp.android.publish.ads.banner.C5144c;
import com.startapp.android.publish.ads.p167b.C5107e;
import com.startapp.android.publish.ads.splash.C5194f;
import com.startapp.android.publish.ads.splash.SplashConfig;
import com.startapp.android.publish.adsCommon.AdsConstants.ServiceApiType;
import com.startapp.android.publish.adsCommon.Utils.C5297b;
import com.startapp.android.publish.adsCommon.Utils.C5305g;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.activities.FullScreenActivity;
import com.startapp.android.publish.adsCommon.adinformation.C5329a;
import com.startapp.android.publish.adsCommon.p177a.C5314a;
import com.startapp.android.publish.adsCommon.p177a.C5315b;
import com.startapp.android.publish.adsCommon.p177a.C5319f;
import com.startapp.android.publish.adsCommon.p181e.C5365a;
import com.startapp.android.publish.adsCommon.p182f.C5374c;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.adsCommon.p191k.C5415a;
import com.startapp.android.publish.cache.C5436a;
import com.startapp.android.publish.cache.C5445c;
import com.startapp.android.publish.cache.C5446d;
import com.startapp.android.publish.common.metaData.C5481d;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.metaData.MetaDataRequest.C5474a;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.common.C5540c;
import com.startapp.common.C5554g;
import com.startapp.common.C5554g.C5558a;
import com.startapp.common.Constants;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5515e;
import com.startapp.common.p193a.C5518g;
import com.startapp.common.p193a.C5522i;
import com.startapp.common.p197d.C5550a;
import com.truenet.android.TrueNetSDK;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.android.publish.adsCommon.m */
/* compiled from: StartAppSDK */
public class C5427m {

    /* renamed from: a */
    private SDKAdPreferences f17334a;

    /* renamed from: b */
    private boolean f17335b;

    /* renamed from: c */
    private boolean f17336c;

    /* renamed from: d */
    private boolean f17337d;

    /* renamed from: e */
    private boolean f17338e;

    /* renamed from: f */
    private boolean f17339f;

    /* renamed from: g */
    private long f17340g;

    /* renamed from: h */
    private Application f17341h;

    /* renamed from: i */
    private HashMap<Integer, Integer> f17342i;

    /* renamed from: j */
    private Object f17343j;

    /* renamed from: k */
    private Activity f17344k;

    /* renamed from: l */
    private boolean f17345l;

    /* renamed from: m */
    private String f17346m;

    /* renamed from: n */
    private boolean f17347n;

    /* renamed from: o */
    private boolean f17348o;

    /* renamed from: p */
    private boolean f17349p;

    /* renamed from: q */
    private boolean f17350q;

    /* renamed from: r */
    private Map<String, String> f17351r;

    /* renamed from: s */
    private Bundle f17352s;

    /* renamed from: t */
    private C5445c f17353t;

    /* renamed from: u */
    private boolean f17354u;

    /* renamed from: v */
    private boolean f17355v;

    /* renamed from: w */
    private boolean f17356w;

    /* renamed from: x */
    private boolean f17357x;

    /* renamed from: y */
    private C5382g f17358y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f17359z;

    /* renamed from: com.startapp.android.publish.adsCommon.m$a */
    /* compiled from: StartAppSDK */
    private static class C5432a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C5427m f17366a = new C5427m();
    }

    /* renamed from: b */
    public void mo19994b(Activity activity, Bundle bundle) {
    }

    private C5427m() {
        this.f17335b = C5307i.m22674a(512);
        this.f17337d = false;
        this.f17338e = false;
        this.f17339f = false;
        this.f17341h = null;
        this.f17342i = new HashMap<>();
        this.f17345l = false;
        this.f17347n = false;
        this.f17348o = true;
        this.f17349p = false;
        this.f17350q = false;
        this.f17352s = null;
        this.f17353t = null;
        this.f17355v = false;
        this.f17356w = false;
        this.f17357x = false;
        this.f17358y = null;
        this.f17359z = false;
    }

    /* renamed from: a */
    public static C5427m m23145a() {
        return C5432a.f17366a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19989a(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z) {
        Context context2;
        try {
            if (C5307i.m22674a(2) && !C5307i.m22676a(context, FullScreenActivity.class)) {
                Log.w("StartAppSDKInternal", "FullScreenActivity is missing from AndroidManifest.xml");
            }
            if (context instanceof Activity) {
                this.f17346m = context.getClass().getName();
            }
            context2 = context.getApplicationContext();
            try {
                C5365a.m22955a(context2);
            } catch (Exception e) {
                try {
                    C5378f.m23016a(context2, C5376d.EXCEPTION, "init AdsExceptionHandler", e.getMessage(), "");
                } catch (Exception e2) {
                    e = e2;
                    C5378f.m23016a(context2, C5376d.EXCEPTION, "StartAppSDKInternal.intialize - unexpected error occurd", e.getMessage(), "");
                }
            }
            mo19996b(!C5307i.m22689f(context2));
            m23169p(context2);
            if (!this.f17345l) {
                C5540c.m23648b(context2);
                C5297b.m22615a(context2);
                m23163j(context2);
                C5416l.m23116a(context2);
                this.f17345l = true;
                if (TextUtils.isEmpty(str2)) {
                    Log.e("StartAppSDK", "The appId wasn't set");
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Initialize StartAppSDK with DevID:[");
                sb.append(str);
                sb.append("], AppID:[");
                sb.append(str2);
                sb.append("]");
                C5518g.m23563a("StartAppSDKInternal", 3, sb.toString());
                C5307i.m22666a(context2, str, str2);
                this.f17334a = sDKAdPreferences;
                C5515e.m23555b(context2, "shared_prefs_sdk_ad_prefs", (Serializable) sDKAdPreferences);
                C5550a.m23689b(context2);
                m23166m(context2);
                m23164k(context2);
                m23150a(context2, z);
                if (this.f17335b) {
                    m23165l(context2);
                }
                mo19986a(context2, C5474a.LAUNCH);
                m23171q(context2);
            }
            m23162i(context2);
            mo20010f(context2);
        } catch (Exception e3) {
            e = e3;
            context2 = context;
            C5378f.m23016a(context2, C5376d.EXCEPTION, "StartAppSDKInternal.intialize - unexpected error occurd", e.getMessage(), "");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo19985a(Context context) {
        C5414k.m23099b(context, "periodicInfoEventPaused", Boolean.valueOf(true));
        C5297b.m22614a(786564404);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo19995b(Context context) {
        C5414k.m23099b(context, "periodicMetadataPaused", Boolean.valueOf(true));
        C5297b.m22614a(586482792);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo19999c(Context context) {
        C5414k.m23099b(context, "periodicInfoEventPaused", Boolean.valueOf(false));
        C5297b.m22617a(context, C5414k.m23095a(context, "periodicInfoEventTriggerTime", Long.valueOf(C5297b.m22619b(context))).longValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo20003d(Context context) {
        C5414k.m23099b(context, "periodicMetadataPaused", Boolean.valueOf(false));
        C5297b.m22618a(context, Long.valueOf(C5414k.m23095a(context, "periodicMetadataTriggerTime", Long.valueOf(C5297b.m22613a())).longValue()));
    }

    /* renamed from: i */
    private void m23162i(final Context context) {
        C5414k.m23099b(context, "periodicInfoEventPaused", Boolean.valueOf(false));
        C5414k.m23099b(context, "periodicMetadataPaused", Boolean.valueOf(false));
        C54281 r0 = new C5481d() {
            /* renamed from: a */
            public void mo19192a(boolean z) {
                if (MetaData.getInstance().isUserAgentEnabled()) {
                    C5427m.this.m23148a(context, TimeUnit.SECONDS.toMillis(MetaData.getInstance().getUserAgentDelayInSeconds()));
                }
                C5297b.m22620c(context);
                C5297b.m22621d(context);
                C5427m.this.mo20007e(context);
                if (VERSION.SDK_INT <= 8) {
                    return;
                }
                if (MetaData.getInstance().getTrueNetEnabled()) {
                    if (!C5427m.this.f17359z) {
                        C5427m.this.f17359z = true;
                        TrueNetSDK.with(context, C5414k.m23096a(context, "shared_prefs_appId", (String) null));
                    }
                    TrueNetSDK.enable(context, true);
                } else if (C5427m.this.f17359z) {
                    TrueNetSDK.enable(context, false);
                }
            }

            /* renamed from: a */
            public void mo19191a() {
                C5518g.m23563a("StartAppSDKInternal", 3, "setPeriodicAlarms: onFailedLoadingMeta");
                if (MetaData.getInstance().isUserAgentEnabled()) {
                    C5427m.this.m23148a(context, TimeUnit.SECONDS.toMillis(10));
                }
            }
        };
        if (MetaData.getInstance().isReady()) {
            r0.mo19192a(false);
        } else {
            MetaData.getInstance().addMetaDataListener(r0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo20007e(Context context) {
        C5374c cVar = new C5374c(context, false);
        cVar.mo19888c().mo19883c(AdsConstants.f17013j);
        cVar.mo19886a();
        if (mo20009e()) {
            C5378f.m23016a(context, C5376d.GENERAL, "packagingType", AdsConstants.f17013j, "");
        }
    }

    /* renamed from: j */
    private void m23163j(Context context) {
        MetaData.init(context);
        if (!C5307i.m22673a()) {
            C5344b.m22785a(context);
            if (C5307i.m22674a(16) || C5307i.m22674a(32)) {
                C5144c.m22087a(context);
            }
            if (C5307i.m22674a(8)) {
                C5194f.m22264a(context);
            }
            if (this.f17335b) {
                C5446d.m23294a(context);
            }
            if (C5307i.m22687e()) {
                C5329a.m22735a(context);
            }
        }
    }

    /* renamed from: k */
    private void m23164k(Context context) {
        Integer a = C5414k.m23094a(context, "shared_prefs_app_version_id", Integer.valueOf(-1));
        int d = C5509c.m23528d(context);
        if (a.intValue() > 0 && d > a.intValue()) {
            this.f17350q = true;
        }
        C5414k.m23101b(context, "shared_prefs_app_version_id", Integer.valueOf(d));
    }

    /* renamed from: l */
    private void m23165l(Context context) {
        if (this.f17350q || !C5446d.m23293a().mo20103b().isLocalCache()) {
            C5518g.m23563a("StartAppSDKInternal", 3, "App version changed or disabled in meta - deleting existing cache");
            C5436a.m23246a().mo20083b(context);
        } else if (this.f17336c) {
            C5436a.m23246a().mo20077a(context);
        }
        m23168o(context);
        C5436a.m23246a().mo20087c(context);
    }

    /* renamed from: a */
    private void m23150a(Context context, boolean z) {
        m23161g(false);
        m23159f(false);
        if (!C5509c.m23525b() || !C5307i.m22674a(2)) {
            C5518g.m23563a("StartAppSDKInternal", 6, "Cannot activate return interstitials, cache to disk, ttl reload - api lower than 14");
            return;
        }
        m23161g(z);
        m23159f(true);
        StringBuilder sb = new StringBuilder();
        sb.append("Return Ads: [");
        sb.append(z);
        sb.append("]");
        C5518g.m23563a("StartAppSDKInternal", 3, sb.toString());
    }

    /* renamed from: m */
    private void m23166m(final Context context) {
        if (C5414k.m23092a(context, "shared_prefs_first_init", Boolean.valueOf(true)).booleanValue()) {
            C5414k.m23101b(context, "totalSessions", Integer.valueOf(0));
            C5414k.m23102b(context, "firstSessionTime", Long.valueOf(System.currentTimeMillis()));
            C5518g.m23563a("StartAppSDKInternal", 3, "Sending Download Event");
            C5554g.m23702a(C5558a.DEFAULT, (Runnable) new Runnable() {
                public void run() {
                    try {
                        C5409j jVar = new C5409j(context);
                        AdPreferences adPreferences = new AdPreferences();
                        C5307i.m22664a(context, adPreferences);
                        jVar.fillApplicationDetails(context, adPreferences);
                        C5415a.m23105a(context, AdsConstants.m22606a(ServiceApiType.DOWNLOAD), jVar, null);
                        C5414k.m23099b(context, "shared_prefs_first_init", Boolean.valueOf(false));
                    } catch (Exception e) {
                        C5518g.m23562a(6, "Error occured while sending download event", (Throwable) e);
                        C5378f.m23016a(context, C5376d.EXCEPTION, "StartAppSDKInternal.handleDownloadEvent", e.getMessage(), "");
                    }
                }
            });
        }
    }

    /* renamed from: f */
    public void mo20010f(Context context) {
        if (C5509c.m23525b()) {
            if (context instanceof Activity) {
                this.f17344k = (Activity) context;
                this.f17341h = this.f17344k.getApplication();
            } else if (context.getApplicationContext() instanceof Application) {
                this.f17341h = (Application) context.getApplicationContext();
            } else {
                C5518g.m23563a("StartAppSDKInternal", 6, "Cannot register activity life cycle callbacks - context is not an Activity");
                return;
            }
            try {
                if (!(this.f17343j == null || this.f17341h == null)) {
                    m23147a(this.f17341h, this.f17343j);
                    C5518g.m23563a("StartAppSDKInternal", 3, "Unregistered LifeCycle Callbacks");
                }
            } catch (Exception unused) {
            }
            C5518g.m23563a("StartAppSDKInternal", 3, "Registring LifeCycle Callbacks");
            this.f17343j = m23146a(this.f17341h);
        } else {
            C5518g.m23563a("StartAppSDKInternal", 6, "Cannot register activity life cycle callbacks - api lower than 14");
        }
    }

    /* renamed from: a */
    public void mo19984a(Activity activity, Bundle bundle) {
        if (bundle == null && this.f17346m != null && activity.getClass().getName().equals(this.f17346m)) {
            this.f17345l = false;
        }
        this.f17352s = bundle;
    }

    /* renamed from: a */
    public void mo19983a(Activity activity) {
        StringBuilder sb = new StringBuilder();
        sb.append("onActivityStarted [");
        sb.append(activity.getClass().getName());
        sb.append("]");
        C5518g.m23563a("StartAppSDKInternal", 3, sb.toString());
        if (C5307i.m22674a(8) && !C5344b.m22784a().mo19790z() && !this.f17356w && !mo19997b("MoPub") && !mo19997b("AdMob") && !this.f17357x && activity.getClass().getName().equals(this.f17346m) && !mo20016i() && this.f17342i.size() == 0) {
            StartAppAd.showSplash(activity, this.f17352s, new SplashConfig(), new AdPreferences(), null, false);
        }
        this.f17357x = true;
        if (this.f17337d) {
            m23160g(activity);
        }
        this.f17339f = false;
        this.f17337d = false;
        if (((Integer) this.f17342i.get(Integer.valueOf(activity.hashCode()))) == null) {
            this.f17342i.put(Integer.valueOf(activity.hashCode()), Integer.valueOf(new Integer(0).intValue() + 1));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Activity Added:[");
            sb2.append(activity.getClass().getName());
            sb2.append("]");
            C5518g.m23563a("StartAppSDKInternal", 3, sb2.toString());
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Activity [");
        sb3.append(activity.getClass().getName());
        sb3.append("] already exists");
        C5518g.m23563a("StartAppSDKInternal", 3, sb3.toString());
    }

    /* renamed from: b */
    public void mo19993b(Activity activity) {
        if (this.f17335b && this.f17338e) {
            this.f17338e = false;
            C5436a.m23246a().mo20082b();
        }
        if (this.f17347n) {
            this.f17347n = false;
            C5416l.m23124c(activity.getApplicationContext());
        }
        this.f17344k = activity;
    }

    /* renamed from: b */
    public void mo19992b() {
        this.f17347n = true;
        this.f17338e = true;
    }

    /* renamed from: c */
    public boolean mo20001c() {
        return this.f17349p;
    }

    /* renamed from: a */
    public void mo19990a(boolean z) {
        this.f17349p = z;
    }

    /* renamed from: d */
    public boolean mo20005d() {
        return this.f17348o;
    }

    /* renamed from: b */
    public void mo19996b(boolean z) {
        this.f17348o = z;
    }

    /* renamed from: e */
    public boolean mo20009e() {
        return this.f17350q;
    }

    /* renamed from: c */
    public void mo19998c(Activity activity) {
        this.f17340g = System.currentTimeMillis();
        this.f17344k = null;
    }

    /* renamed from: d */
    public void mo20002d(Activity activity) {
        StringBuilder sb = new StringBuilder();
        sb.append("onActivityStopped [");
        sb.append(activity.getClass().getName());
        sb.append("]");
        C5518g.m23563a("StartAppSDKInternal", 3, sb.toString());
        Integer num = (Integer) this.f17342i.get(Integer.valueOf(activity.hashCode()));
        if (num != null) {
            Integer valueOf = Integer.valueOf(num.intValue() - 1);
            if (valueOf.intValue() == 0) {
                this.f17342i.remove(Integer.valueOf(activity.hashCode()));
            } else {
                this.f17342i.put(Integer.valueOf(activity.hashCode()), valueOf);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Activity removed:[");
            sb2.append(activity.getClass().getName());
            sb2.append("]");
            C5518g.m23563a("StartAppSDKInternal", 3, sb2.toString());
            if (this.f17342i.size() == 0) {
                if (!this.f17339f) {
                    m23158f(activity);
                }
                if (this.f17335b) {
                    C5436a.m23246a().mo20078a(activity.getApplicationContext(), this.f17339f);
                    this.f17338e = true;
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Activity hadn't been found:[");
        sb3.append(activity.getClass().getName());
        sb3.append("]");
        C5518g.m23563a("StartAppSDKInternal", 3, sb3.toString());
    }

    /* renamed from: e */
    public void mo20006e(Activity activity) {
        if (activity.getClass().getName().equals(this.f17346m)) {
            this.f17357x = false;
        }
        if (this.f17342i.size() == 0) {
            this.f17337d = false;
        }
    }

    /* renamed from: f */
    public boolean mo20011f() {
        if (this.f17344k != null) {
            return this.f17344k.isTaskRoot();
        }
        return true;
    }

    /* renamed from: g */
    public String mo20013g() {
        return this.f17346m;
    }

    /* renamed from: h */
    public boolean mo20015h() {
        return this.f17354u;
    }

    /* renamed from: i */
    public boolean mo20016i() {
        return this.f17355v;
    }

    /* renamed from: c */
    public void mo20000c(boolean z) {
        this.f17355v = z;
    }

    @Deprecated
    /* renamed from: j */
    public void mo20017j() {
        mo20004d(false);
    }

    /* renamed from: d */
    public void mo20004d(boolean z) {
        this.f17356w = !z;
        if (!z) {
            C5436a.m23246a().mo20079a(Placement.INAPP_SPLASH);
        }
    }

    /* renamed from: k */
    public boolean mo20018k() {
        return !this.f17356w;
    }

    /* renamed from: l */
    public boolean mo20019l() {
        return this.f17336c && !this.f17337d && !this.f17339f;
    }

    /* renamed from: a */
    public boolean mo19991a(Placement placement) {
        boolean z = false;
        if (!this.f17336c || this.f17339f) {
            return false;
        }
        if (!this.f17337d) {
            return true;
        }
        if (placement == Placement.INAPP_RETURN && C5446d.m23293a().mo20103b().shouldReturnAdLoadInBg()) {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    private void m23159f(boolean z) {
        this.f17336c = z;
    }

    /* renamed from: g */
    private void m23161g(boolean z) {
        this.f17354u = z;
    }

    /* renamed from: m */
    public void mo20020m() {
        this.f17337d = false;
        this.f17339f = true;
    }

    /* renamed from: n */
    public boolean mo20021n() {
        return this.f17336c && this.f17337d;
    }

    /* renamed from: a */
    public void mo19988a(Context context, String str, String str2) {
        if (this.f17351r == null) {
            this.f17351r = new TreeMap();
        }
        this.f17351r.put(str, str2);
        m23167n(context);
    }

    /* renamed from: n */
    private void m23167n(Context context) {
        C5414k.m23097a(context, "sharedPrefsWrappers", this.f17351r);
    }

    /* renamed from: a */
    public String mo19982a(String str) {
        if (this.f17351r == null) {
            return null;
        }
        return (String) this.f17351r.get(str);
    }

    /* renamed from: o */
    public Map<String, String> mo20022o() {
        return this.f17351r;
    }

    /* renamed from: b */
    public boolean mo19997b(String str) {
        return mo19982a(str) != null;
    }

    /* renamed from: g */
    public SDKAdPreferences mo20012g(Context context) {
        if (this.f17334a == null) {
            SDKAdPreferences sDKAdPreferences = (SDKAdPreferences) C5515e.m23542a(context, "shared_prefs_sdk_ad_prefs", SDKAdPreferences.class);
            if (sDKAdPreferences == null) {
                this.f17334a = new SDKAdPreferences();
            } else {
                this.f17334a = sDKAdPreferences;
            }
        }
        return this.f17334a;
    }

    /* renamed from: f */
    private void m23158f(Activity activity) {
        this.f17337d = true;
        m23168o(activity);
        if (C5540c.m23644a() != null) {
            C5540c.m23644a().mo20524a(activity);
        }
    }

    /* renamed from: g */
    private void m23160g(Activity activity) {
        if (MetaData.getInstance().canShowAd() && mo20015h() && !C5344b.m22784a().mo19789y() && !C5307i.m22673a() && !mo20001c() && m23172q()) {
            this.f17358y = C5436a.m23246a().mo20067a(this.f17353t);
            if (this.f17358y != null && this.f17358y.isReady()) {
                C5319f a = C5344b.m22784a().mo19754F().mo19655a(Placement.INAPP_RETURN, null);
                if (!a.mo19660a()) {
                    C5349c.m22864a((Context) activity, ((C5107e) this.f17358y).mo19853l(), (String) null, a.mo19662c());
                    if (Constants.m23468a().booleanValue()) {
                        C5522i.m23586a().mo20502a(activity, a.mo19661b());
                    }
                } else if (this.f17358y.mo18768a(null)) {
                    C5315b.m22698a().mo19649a(new C5314a(Placement.INAPP_RETURN, null));
                }
            }
        }
        if (m23174r()) {
            mo19986a((Context) activity, C5474a.APP_IDLE);
        }
    }

    /* renamed from: q */
    private boolean m23172q() {
        return System.currentTimeMillis() - this.f17340g > C5344b.m22784a().mo19788x();
    }

    /* renamed from: r */
    private boolean m23174r() {
        return System.currentTimeMillis() - this.f17340g > MetaData.getInstance().getSessionMaxBackgroundTime();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19986a(Context context, C5474a aVar) {
        C5305g.m22636d().mo19628a(context, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo20008e(boolean z) {
        boolean z2 = z && C5509c.m23525b();
        m23161g(z2);
        if (!z2) {
            C5436a.m23246a().mo20079a(Placement.INAPP_RETURN);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19987a(Context context, String str, long j, boolean z, boolean z2) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "1" : "0");
            sb.append(z2 ? "M" : "A");
            C5378f.m23016a(context, C5376d.USER_CONSENT, str, sb.toString(), "");
            if (str.toLowerCase().equals("pas")) {
                C5414k.m23103b(context, "USER_CONSENT_PERSONALIZED_ADS_SERVING", z ? "1" : "0");
                C5305g.m22636d().mo19628a(context, C5474a.PAS);
                return;
            }
            return;
        }
        C5518g.m23563a("StartAppSDKInternal", 6, "setUserConsent: empty consentType");
    }

    /* renamed from: h */
    public void mo20014h(Context context) {
        m23155b(context, "android.permission.ACCESS_FINE_LOCATION", "USER_CONSENT_FINE_LOCATION");
        m23155b(context, "android.permission.ACCESS_COARSE_LOCATION", "USER_CONSENT_COARSE_LOCATION");
    }

    /* renamed from: b */
    private void m23155b(Context context, String str, String str2) {
        boolean booleanValue = C5414k.m23092a(context, str2, Boolean.valueOf(false)).booleanValue();
        boolean a = C5509c.m23516a(context, str);
        if (booleanValue != a) {
            C5414k.m23099b(context, str2, Boolean.valueOf(a));
            mo19987a(context, str, System.currentTimeMillis(), a, false);
        }
    }

    /* renamed from: o */
    private void m23168o(Context context) {
        m23149a(context, new AdPreferences());
    }

    /* renamed from: a */
    private void m23149a(Context context, AdPreferences adPreferences) {
        if (mo20015h() && !C5344b.m22784a().mo19789y()) {
            this.f17353t = C5436a.m23246a().mo20072a(context, adPreferences);
        }
    }

    /* renamed from: p */
    private static void m23169p(Context context) {
        TreeMap treeMap = new TreeMap();
        if (m23177u()) {
            treeMap.put("Cordova", C5307i.m22679b());
        }
        if (m23175s()) {
            treeMap.put("AdMob", m23157d("com.startapp.android.mediation.admob"));
        }
        if (m23176t()) {
            treeMap.put("MoPub", m23157d("com.mopub.mobileads"));
        }
        if (m23178v() && !m23145a().mo20022o().containsKey("B4A")) {
            treeMap.put("MoPub", "0");
        }
        if (!treeMap.isEmpty()) {
            C5414k.m23097a(context, "sharedPrefsWrappers", (Map<String, String>) treeMap);
        }
    }

    /* renamed from: s */
    private static boolean m23175s() {
        return m23156c("com.startapp.android.mediation.admob.StartAppCustomEvent");
    }

    /* renamed from: t */
    private static boolean m23176t() {
        return m23156c("com.mopub.mobileads.StartAppCustomEventInterstitial");
    }

    /* renamed from: p */
    public static boolean m23170p() {
        return m23145a().mo19982a("Unity") != null;
    }

    /* renamed from: u */
    private static boolean m23177u() {
        return m23156c("org.apache.cordova.CordovaPlugin");
    }

    /* renamed from: v */
    private static boolean m23178v() {
        return m23156c("anywheresoftware.b4a.BA");
    }

    /* renamed from: c */
    private static boolean m23156c(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    /* renamed from: d */
    private static String m23157d(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".StartAppConstants");
            return (String) Class.forName(sb.toString()).getField("WRAPPER_VERSION").get(null);
        } catch (Exception unused) {
            return "0";
        }
    }

    @TargetApi(14)
    /* renamed from: a */
    public static Object m23146a(Application application) {
        C54303 r0 = new ActivityLifecycleCallbacks() {
            public void onActivityStopped(Activity activity) {
                StringBuilder sb = new StringBuilder();
                sb.append("onActivityStopped [");
                sb.append(activity.getClass().getName());
                sb.append("]");
                C5518g.m23563a("StartAppSDKInternal", 3, sb.toString());
                C5427m.m23145a().mo20002d(activity);
            }

            public void onActivityStarted(Activity activity) {
                StringBuilder sb = new StringBuilder();
                sb.append("onActivityStarted [");
                sb.append(activity.getClass().getName());
                sb.append("]");
                C5518g.m23563a("StartAppSDKInternal", 3, sb.toString());
                C5427m.m23145a().mo19983a(activity);
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                StringBuilder sb = new StringBuilder();
                sb.append("onActivitySaveInstanceState [");
                sb.append(activity.getClass().getName());
                sb.append("]");
                C5518g.m23563a("StartAppSDKInternal", 3, sb.toString());
                C5427m.m23145a().mo19994b(activity, bundle);
            }

            public void onActivityResumed(Activity activity) {
                StringBuilder sb = new StringBuilder();
                sb.append("onActivityResumed [");
                sb.append(activity.getClass().getName());
                sb.append("]");
                C5518g.m23563a("StartAppSDKInternal", 3, sb.toString());
                C5427m.m23145a().mo19993b(activity);
            }

            public void onActivityPaused(Activity activity) {
                StringBuilder sb = new StringBuilder();
                sb.append("onActivityPaused [");
                sb.append(activity.getClass().getName());
                sb.append("]");
                C5518g.m23563a("StartAppSDKInternal", 3, sb.toString());
                C5427m.m23145a().mo19998c(activity);
            }

            public void onActivityDestroyed(Activity activity) {
                StringBuilder sb = new StringBuilder();
                sb.append("onActivityDestroyed [");
                sb.append(activity.getClass().getName());
                sb.append("]");
                C5518g.m23563a("StartAppSDKInternal", 3, sb.toString());
                C5427m.m23145a().mo20006e(activity);
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
                StringBuilder sb = new StringBuilder();
                sb.append("onActivityCreated [");
                sb.append(activity.getClass().getName());
                sb.append(", ");
                sb.append(bundle);
                sb.append("]");
                C5518g.m23563a("StartAppSDKInternal", 3, sb.toString());
                C5427m.m23145a().mo19984a(activity, bundle);
                if (C5307i.m22674a(2)) {
                    C5369f.m22965a().mo19863a(activity, bundle);
                }
            }
        };
        application.registerActivityLifecycleCallbacks(r0);
        return r0;
    }

    @TargetApi(14)
    /* renamed from: a */
    public static void m23147a(Application application, Object obj) {
        application.unregisterActivityLifecycleCallbacks((ActivityLifecycleCallbacks) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m23148a(final Context context, long j) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public void run() {
                try {
                    C5414k.m23103b(context, "User-Agent", new WebView(context).getSettings().getUserAgentString());
                } catch (Exception e) {
                    C5378f.m23016a(context, C5376d.EXCEPTION, "NetworkUtils.saveUserAgent - Webview failed", e.getMessage(), "");
                }
            }
        }, j);
    }

    /* renamed from: q */
    private void m23171q(Context context) {
        String r = m23173r(context);
        boolean z = false;
        if (VERSION.SDK_INT < 18 || r == null) {
            C5414k.m23099b(context, "chromeTabs", Boolean.valueOf(false));
            return;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        intent.setPackage(r);
        List queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            z = true;
        }
        C5414k.m23099b(context, "chromeTabs", Boolean.valueOf(z));
    }

    /* renamed from: r */
    private static String m23173r(Context context) {
        String str;
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            if (arrayList.size() == 1) {
                str = (String) arrayList.get(0);
            } else if (!TextUtils.isEmpty(str2) && !m23152a(context, intent) && arrayList.contains(str2)) {
                return str2;
            } else {
                if (!arrayList.contains("com.android.chrome")) {
                    return null;
                }
                str = "com.android.chrome";
            }
            return str;
        } catch (Exception unused) {
            C5518g.m23563a("StartAppSDKInternal", 6, "Exception inside getPackageNameToUse");
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m23152a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (queryIntentActivities != null) {
                if (queryIntentActivities.size() != 0) {
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        IntentFilter intentFilter = resolveInfo.filter;
                        if (intentFilter != null) {
                            if (intentFilter.countDataAuthorities() == 0) {
                                continue;
                            } else if (intentFilter.countDataPaths() != 0) {
                                if (resolveInfo.activityInfo != null) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (RuntimeException unused) {
            C5518g.m23563a("StartAppSDKInternal", 6, "Runtime exception while getting specialized handlers");
        }
    }
}
