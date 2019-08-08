package com.startapp.android.publish.ads.splash;

import android.content.Context;
import com.startapp.android.publish.ads.p167b.C5105c;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;

/* renamed from: com.startapp.android.publish.ads.splash.b */
/* compiled from: StartAppSDK */
public class C5184b extends C5105c {
    private static final long serialVersionUID = 1;

    public C5184b(Context context) {
        super(context, Placement.INAPP_OVERLAY);
    }

    @Deprecated
    public boolean load(AdPreferences adPreferences, AdEventListener adEventListener) {
        return super.load(adPreferences, adEventListener, false);
    }

    /* access modifiers changed from: protected */
    public void loadAds(AdPreferences adPreferences, AdEventListener adEventListener) {
        new C5183a(this.context, this, adPreferences, adEventListener).mo19820c();
    }
}
