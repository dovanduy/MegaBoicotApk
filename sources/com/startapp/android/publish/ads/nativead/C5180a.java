package com.startapp.android.publish.ads.nativead;

import android.content.Context;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.android.publish.common.model.GetAdRequest;
import com.startapp.android.publish.p165a.C5078a;

/* renamed from: com.startapp.android.publish.ads.nativead.a */
/* compiled from: StartAppSDK */
public class C5180a extends C5078a {

    /* renamed from: g */
    private NativeAdPreferences f16666g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18690a(C5286Ad ad) {
    }

    public C5180a(Context context, C5286Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, NativeAdPreferences nativeAdPreferences) {
        super(context, ad, adPreferences, adEventListener, Placement.INAPP_NATIVE);
        this.f16666g = nativeAdPreferences;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public GetAdRequest mo18905a() {
        GetAdRequest a = super.mo18905a();
        if (a == null) {
            return null;
        }
        a.setAdsNumber(this.f16666g.getAdsNumber());
        if (this.f16666g.getImageSize() != null) {
            a.setWidth(this.f16666g.getImageSize().getWidth());
            a.setHeight(this.f16666g.getImageSize().getHeight());
        } else {
            int primaryImageSize = this.f16666g.getPrimaryImageSize();
            if (primaryImageSize == -1) {
                primaryImageSize = 2;
            }
            a.setPrimaryImg(Integer.toString(primaryImageSize));
            int secondaryImageSize = this.f16666g.getSecondaryImageSize();
            if (secondaryImageSize == -1) {
                secondaryImageSize = 2;
            }
            a.setMoreImg(Integer.toString(secondaryImageSize));
        }
        if (this.f16666g.isContentAd()) {
            a.setContentAd(this.f16666g.isContentAd());
        }
        return a;
    }
}
