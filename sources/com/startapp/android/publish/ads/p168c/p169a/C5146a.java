package com.startapp.android.publish.ads.p168c.p169a;

import android.content.Context;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.android.publish.common.model.GetAdRequest;
import com.startapp.android.publish.html.C5489a;

/* renamed from: com.startapp.android.publish.ads.c.a.a */
/* compiled from: StartAppSDK */
public class C5146a extends C5489a {
    public C5146a(Context context, C5147b bVar, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, bVar, adPreferences, adEventListener, Placement.INAPP_OFFER_WALL, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public GetAdRequest mo18905a() {
        GetAdRequest a = super.mo18905a();
        if (a == null) {
            return null;
        }
        a.setAdsNumber(C5344b.m22784a().mo19770g());
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18691a(Boolean bool) {
        super.mo18691a(bool);
        mo20436a(bool.booleanValue());
    }
}
