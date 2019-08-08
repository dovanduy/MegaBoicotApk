package com.startapp.android.publish.ads.p167b;

import android.content.Context;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.cache.C5446d;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;

/* renamed from: com.startapp.android.publish.ads.b.e */
/* compiled from: StartAppSDK */
public class C5107e extends C5105c {
    private static final long serialVersionUID = 1;

    public C5107e(Context context) {
        super(context, Placement.INAPP_RETURN);
    }

    /* access modifiers changed from: protected */
    public void loadAds(AdPreferences adPreferences, AdEventListener adEventListener) {
        new C5104b(this.context, this, adPreferences, adEventListener).mo19820c();
    }

    /* access modifiers changed from: protected */
    public long getFallbackAdCacheTtl() {
        return C5446d.m23293a().mo20103b().getReturnAdCacheTTL();
    }
}
