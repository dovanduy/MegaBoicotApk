package com.startapp.android.publish.adsCommon.adListeners;

import com.startapp.android.publish.adsCommon.C5286Ad;

/* compiled from: StartAppSDK */
public interface AdEventListener {
    void onFailedToReceiveAd(C5286Ad ad);

    void onReceiveAd(C5286Ad ad);
}
