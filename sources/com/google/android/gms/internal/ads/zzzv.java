package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.C0163c;
import android.support.customtabs.C0163c.C0164a;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.mediation.C3143a;
import com.google.android.gms.ads.mediation.C3155d;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.common.util.C3563o;

@C3718cm
public final class zzzv implements MediationInterstitialAdapter {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Activity f14580a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3155d f14581b;

    /* renamed from: c */
    private Uri f14582c;

    public final void onDestroy() {
        C3987mk.m17429b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        C3987mk.m17429b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        C3987mk.m17429b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public final void requestInterstitialAd(Context context, C3155d dVar, Bundle bundle, C3143a aVar, Bundle bundle2) {
        this.f14581b = dVar;
        if (this.f14581b == null) {
            C3987mk.m17435e("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            C3987mk.m17435e("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f14581b.mo12737a(this, 0);
        } else {
            if (!(C3563o.m12764c() && ass.m15081a(context))) {
                C3987mk.m17435e("Default browser does not support custom tabs. Bailing out.");
                this.f14581b.mo12737a(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                C3987mk.m17435e("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f14581b.mo12737a(this, 0);
                return;
            }
            this.f14580a = (Activity) context;
            this.f14582c = Uri.parse(string);
            this.f14581b.mo12736a(this);
        }
    }

    public final void showInterstitial() {
        C0163c a = new C0164a().mo351a();
        a.f234a.setData(this.f14582c);
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(new zzc(a.f234a), null, new bea(this), null, new zzang(0, 0, false));
        C3909jn.f13411a.post(new beb(this, adOverlayInfoParcel));
        C3025aw.m10921i().mo15443f();
    }
}
