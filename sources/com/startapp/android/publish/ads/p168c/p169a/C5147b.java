package com.startapp.android.publish.ads.p168c.p169a;

import android.content.Context;
import com.startapp.android.publish.ads.p167b.C5105c;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;

/* renamed from: com.startapp.android.publish.ads.c.a.b */
/* compiled from: StartAppSDK */
public class C5147b extends C5105c {
    private static final long serialVersionUID = 1;

    public C5147b(Context context) {
        super(context, Placement.INAPP_OFFER_WALL);
    }

    /* access modifiers changed from: protected */
    public void loadAds(AdPreferences adPreferences, AdEventListener adEventListener) {
        new C5146a(this.context, this, adPreferences, adEventListener).mo19820c();
    }
}
