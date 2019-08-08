package com.facebook.ads.internal.adapters;

import com.facebook.ads.AdError;

public interface InterstitialAdapterListener {
    void onInterstitialActivityDestroyed();

    void onInterstitialAdClicked(C1628g gVar, String str, boolean z);

    void onInterstitialAdDismissed(C1628g gVar);

    void onInterstitialAdDisplayed(C1628g gVar);

    void onInterstitialAdLoaded(C1628g gVar);

    void onInterstitialError(C1628g gVar, AdError adError);

    void onInterstitialLoggingImpression(C1628g gVar);
}
