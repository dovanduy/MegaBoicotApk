package com.startapp.android.publish.ads.p167b;

import android.content.Context;
import com.startapp.android.publish.adsCommon.C5364e;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.android.publish.html.C5489a;

/* renamed from: com.startapp.android.publish.ads.b.b */
/* compiled from: StartAppSDK */
public class C5104b extends C5489a {
    public C5104b(Context context, C5364e eVar, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, eVar, adPreferences, adEventListener, Placement.INAPP_RETURN, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18691a(Boolean bool) {
        super.mo18691a(bool);
        mo20436a(bool.booleanValue());
    }
}
