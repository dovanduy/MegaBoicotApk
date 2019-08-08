package com.facebook.ads.internal.p075c.p076a;

import android.os.Bundle;
import com.appnext.base.p046b.C1245d;
import com.facebook.ads.AdError;
import com.facebook.ads.C1514Ad;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.internal.p075c.C1689d;
import com.facebook.ads.internal.p078e.C1708a;

/* renamed from: com.facebook.ads.internal.c.a.b */
public final class C1683b extends C1682a implements InterstitialAdExtendedListener {

    /* renamed from: c */
    private final C1689d f5266c;

    public C1683b(String str, C1684c cVar, C1689d dVar) {
        super(str, cVar);
        this.f5266c = dVar;
    }

    public void onAdClicked(C1514Ad ad) {
        this.f5265b.mo7395a(C1245d.f3947iP, this.f5264a, null);
    }

    public void onAdLoaded(C1514Ad ad) {
        Bundle bundle = new Bundle();
        bundle.putLong("LONG_INVALIDATION_TIME_KEY", this.f5266c.mo7408b());
        this.f5265b.mo7395a(1020, this.f5264a, bundle);
    }

    public void onError(C1514Ad ad, AdError adError) {
        Bundle bundle = new Bundle();
        bundle.putString("STR_ERROR_MESSAGE_KEY", adError.getErrorMessage());
        bundle.putInt("INT_ERROR_CODE_KEY", adError.getErrorCode());
        this.f5265b.mo7395a(1023, this.f5264a, bundle);
    }

    public void onInterstitialActivityDestroyed() {
        this.f5265b.mo7395a(1026, this.f5264a, null);
        C1708a.m7114a().mo7464c(this.f5264a);
    }

    public void onInterstitialDismissed(C1514Ad ad) {
        this.f5265b.mo7395a(1022, this.f5264a, null);
    }

    public void onInterstitialDisplayed(C1514Ad ad) {
        this.f5265b.mo7395a(1021, this.f5264a, null);
    }

    public void onLoggingImpression(C1514Ad ad) {
        this.f5265b.mo7395a(1025, this.f5264a, null);
    }
}
