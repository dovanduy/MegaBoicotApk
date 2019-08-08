package com.facebook.ads.internal.adapters;

import android.view.View;
import com.facebook.ads.AdError;

public interface BannerAdapterListener {
    void onBannerAdClicked(C1618e eVar);

    void onBannerAdLoaded(C1618e eVar, View view);

    void onBannerError(C1618e eVar, AdError adError);

    void onBannerLoggingImpression(C1618e eVar);
}
