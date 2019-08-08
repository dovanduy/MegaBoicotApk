package com.facebook.ads;

public interface AdListener {
    void onAdClicked(C1514Ad ad);

    void onAdLoaded(C1514Ad ad);

    void onError(C1514Ad ad, AdError adError);

    void onLoggingImpression(C1514Ad ad);
}
