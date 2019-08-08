package com.startapp.android.publish.ads.banner.banner3d;

import android.content.Context;
import com.startapp.android.publish.ads.banner.C5111a;
import com.startapp.android.publish.ads.banner.C5144c;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.android.publish.common.model.GetAdRequest;
import com.startapp.android.publish.p165a.C5078a;

/* renamed from: com.startapp.android.publish.ads.banner.banner3d.c */
/* compiled from: StartAppSDK */
public class C5124c extends C5078a {

    /* renamed from: g */
    private int f16509g = 0;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18690a(C5286Ad ad) {
    }

    public C5124c(Context context, C5119a aVar, int i, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, aVar, adPreferences, adEventListener, Placement.INAPP_BANNER);
        this.f16509g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public GetAdRequest mo18905a() {
        C5119a aVar = (C5119a) this.f17184b;
        C5111a aVar2 = new C5111a();
        mo19819b((GetAdRequest) aVar2);
        aVar2.setAdsNumber(C5144c.m22086a().mo18952b().mo18829f());
        aVar2.setOffset(this.f16509g);
        aVar2.mo18846a(aVar.mo18896b());
        return aVar2;
    }
}
