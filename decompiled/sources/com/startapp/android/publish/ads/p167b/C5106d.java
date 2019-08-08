package com.startapp.android.publish.ads.p167b;

import android.content.Context;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;

/* renamed from: com.startapp.android.publish.ads.b.d */
/* compiled from: StartAppSDK */
public class C5106d extends C5105c {
    private static final long serialVersionUID = 1;

    public C5106d(Context context) {
        super(context, Placement.INAPP_OVERLAY);
    }

    public void loadAds(AdPreferences adPreferences, AdEventListener adEventListener) {
        new C5103a(this.context, this, adPreferences, adEventListener).mo19820c();
    }
}
