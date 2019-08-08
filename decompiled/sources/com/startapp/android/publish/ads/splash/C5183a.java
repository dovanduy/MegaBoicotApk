package com.startapp.android.publish.ads.splash;

import android.content.Context;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.android.publish.html.C5489a;

/* renamed from: com.startapp.android.publish.ads.splash.a */
/* compiled from: StartAppSDK */
public class C5183a extends C5489a {
    public C5183a(Context context, C5184b bVar, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, bVar, adPreferences, adEventListener, Placement.INAPP_SPLASH, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18691a(Boolean bool) {
        super.mo18691a(bool);
        mo20436a(bool.booleanValue());
    }
}
