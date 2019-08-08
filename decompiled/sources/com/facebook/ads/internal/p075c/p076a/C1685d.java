package com.facebook.ads.internal.p075c.p076a;

import android.os.Bundle;
import com.facebook.ads.AdError;
import com.facebook.ads.C1514Ad;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.p075c.C1694e;
import com.facebook.ads.internal.p075c.C1702j;

/* renamed from: com.facebook.ads.internal.c.a.d */
public class C1685d extends C1682a implements S2SRewardedVideoAdExtendedListener {

    /* renamed from: c */
    private final C1694e f5267c;

    /* renamed from: d */
    private final C1702j f5268d;

    public C1685d(String str, C1684c cVar, C1694e eVar, C1702j jVar) {
        super(str, cVar);
        this.f5267c = eVar;
        this.f5268d = jVar;
    }

    public void onAdClicked(C1514Ad ad) {
        this.f5265b.mo7395a(2104, this.f5264a, null);
    }

    public void onAdLoaded(C1514Ad ad) {
        Bundle bundle = new Bundle();
        bundle.putLong("LONG_INVALIDATION_TIME_KEY", this.f5267c.mo7415b());
        bundle.putInt("INT_RV_VIDEO_DURATION_KEY", this.f5268d.f5321h);
        this.f5265b.mo7395a(AdError.BROKEN_MEDIA_ERROR_CODE, this.f5264a, bundle);
    }

    public void onError(C1514Ad ad, AdError adError) {
        Bundle bundle = new Bundle();
        bundle.putString("STR_ERROR_MESSAGE_KEY", adError.getErrorMessage());
        bundle.putInt("INT_ERROR_CODE_KEY", adError.getErrorCode());
        this.f5265b.mo7395a(2103, this.f5264a, bundle);
    }

    public void onLoggingImpression(C1514Ad ad) {
        this.f5265b.mo7395a(2105, this.f5264a, null);
    }

    public void onRewardServerFailed() {
        this.f5265b.mo7395a(2109, this.f5264a, null);
    }

    public void onRewardServerSuccess() {
        this.f5265b.mo7395a(2108, this.f5264a, null);
    }

    public void onRewardedVideoActivityDestroyed() {
        this.f5265b.mo7395a(2106, this.f5264a, null);
    }

    public void onRewardedVideoClosed() {
        this.f5265b.mo7395a(2110, this.f5264a, null);
    }

    public void onRewardedVideoCompleted() {
        this.f5265b.mo7395a(2107, this.f5264a, null);
    }
}
