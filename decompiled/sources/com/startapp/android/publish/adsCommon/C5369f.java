package com.startapp.android.publish.adsCommon;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.startapp.android.publish.adsCommon.StartAppAd.AdMode;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.common.p193a.C5518g;

/* renamed from: com.startapp.android.publish.adsCommon.f */
/* compiled from: StartAppSDK */
public class C5369f {

    /* renamed from: a */
    protected StartAppAd f17197a;

    /* renamed from: b */
    private boolean f17198b;

    /* renamed from: c */
    private AutoInterstitialPreferences f17199c;

    /* renamed from: d */
    private long f17200d;

    /* renamed from: e */
    private int f17201e;

    /* renamed from: com.startapp.android.publish.adsCommon.f$a */
    /* compiled from: StartAppSDK */
    private static class C5371a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C5369f f17203a = new C5369f();
    }

    private C5369f() {
        this.f17198b = false;
        this.f17199c = null;
        this.f17200d = -1;
        this.f17201e = -1;
        this.f17197a = null;
    }

    /* renamed from: a */
    public static C5369f m22965a() {
        return C5371a.f17203a;
    }

    /* renamed from: b */
    public void mo19866b() {
        this.f17198b = true;
    }

    /* renamed from: c */
    public void mo19867c() {
        this.f17198b = false;
    }

    /* renamed from: a */
    public void mo19865a(AutoInterstitialPreferences autoInterstitialPreferences) {
        this.f17199c = autoInterstitialPreferences;
        this.f17200d = -1;
        this.f17201e = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo19868d() {
        this.f17200d = System.currentTimeMillis();
        this.f17201e = 0;
    }

    /* renamed from: e */
    private boolean m22968e() {
        return this.f17198b && C5344b.m22784a().mo19757I();
    }

    /* renamed from: f */
    private boolean m22969f() {
        if (this.f17199c == null) {
            this.f17199c = new AutoInterstitialPreferences();
        }
        boolean z = this.f17200d <= 0 || System.currentTimeMillis() >= this.f17200d + ((long) (this.f17199c.getSecondsBetweenAds() * AdError.NETWORK_ERROR_CODE));
        boolean z2 = this.f17201e <= 0 || this.f17201e >= this.f17199c.getActivitiesBetweenAds();
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m22966a(Activity activity) {
        String str = "com.startapp.android.publish.";
        String name = activity.getClass().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("adsCommon.activities.OverlayActivity");
        if (!name.startsWith(sb.toString())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("adsCommon.activities.FullScreenActivity");
            if (!name.startsWith(sb2.toString())) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append("ads.list3d.List3DActivity");
                if (!name.startsWith(sb3.toString())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    private boolean m22967b(Activity activity) {
        return activity.getClass().getName().equals(C5427m.m23145a().mo20013g());
    }

    /* renamed from: a */
    public void mo19864a(Context context) {
        if (m22968e() && m22969f()) {
            if (this.f17197a == null) {
                this.f17197a = new StartAppAd(context);
            }
            this.f17197a.loadAd(AdMode.AUTOMATIC, new AdPreferences().setAi(Boolean.valueOf(true)), new AdEventListener() {
                public void onReceiveAd(C5286Ad ad) {
                    if (C5369f.this.f17197a.showAd()) {
                        C5518g.m23563a("InterActivityAdManager", 3, "ShowInterActivityAd");
                        C5369f.this.mo19868d();
                    }
                }

                public void onFailedToReceiveAd(C5286Ad ad) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("FailedToShowInterActivityAd, error: [");
                    sb.append(ad.errorMessage);
                    sb.append("]");
                    C5518g.m23563a("InterActivityAdManager", 3, sb.toString());
                }
            });
        }
    }

    /* renamed from: a */
    public void mo19863a(Activity activity, Bundle bundle) {
        if (bundle == null && !m22966a(activity) && !m22967b(activity)) {
            this.f17201e++;
            mo19864a((Context) activity);
        }
    }
}
