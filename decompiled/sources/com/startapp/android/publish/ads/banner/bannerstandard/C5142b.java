package com.startapp.android.publish.ads.banner.bannerstandard;

import android.content.Context;
import com.startapp.android.publish.ads.banner.C5111a;
import com.startapp.android.publish.ads.banner.C5144c;
import com.startapp.android.publish.adsCommon.C5364e;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.android.publish.common.model.GetAdRequest;
import com.startapp.android.publish.html.C5489a;
import com.startapp.common.p193a.C5518g;

/* renamed from: com.startapp.android.publish.ads.banner.bannerstandard.b */
/* compiled from: StartAppSDK */
public class C5142b extends C5489a {

    /* renamed from: i */
    private int f16533i = 0;

    public C5142b(Context context, C5364e eVar, int i, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, eVar, adPreferences, adEventListener, Placement.INAPP_BANNER, false);
        this.f16533i = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public GetAdRequest mo18905a() {
        C5141a aVar = (C5141a) this.f17184b;
        C5111a aVar2 = new C5111a();
        mo19819b((GetAdRequest) aVar2);
        aVar2.setWidth(aVar.mo19849h());
        aVar2.setHeight(aVar.mo19851j());
        aVar2.setOffset(this.f16533i);
        aVar2.setAdsNumber(C5144c.m22086a().mo18952b().mo18830g());
        aVar2.mo18846a(aVar.mo18950b());
        aVar2.mo18845a(aVar.mo18951c());
        return aVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18691a(Boolean bool) {
        super.mo18691a(bool);
        mo20436a(bool.booleanValue());
        StringBuilder sb = new StringBuilder();
        sb.append("Html onPostExecute, result=[");
        sb.append(bool);
        sb.append("]");
        C5518g.m23561a(4, sb.toString());
    }
}
