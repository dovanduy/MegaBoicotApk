package com.startapp.android.publish.ads.p168c.p170b;

import android.content.Context;
import com.startapp.android.publish.ads.list3d.C5168e;
import com.startapp.android.publish.ads.list3d.C5169f;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.android.publish.common.model.GetAdRequest;
import com.startapp.android.publish.p165a.C5078a;
import java.util.List;

/* renamed from: com.startapp.android.publish.ads.c.b.a */
/* compiled from: StartAppSDK */
public class C5148a extends C5078a {
    public C5148a(Context context, C5149b bVar, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, bVar, adPreferences, adEventListener, Placement.INAPP_OFFER_WALL);
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
    public void mo18690a(C5286Ad ad) {
        C5149b bVar = (C5149b) ad;
        List<AdDetails> d = bVar.mo19940d();
        C5168e a = C5169f.m22203a().mo19078a(bVar.mo18894a());
        a.mo19068a();
        if (d != null) {
            for (AdDetails a2 : d) {
                a.mo19071a(a2);
            }
        }
    }
}
