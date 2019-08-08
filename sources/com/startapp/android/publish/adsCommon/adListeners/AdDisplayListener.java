package com.startapp.android.publish.adsCommon.adListeners;

import com.startapp.android.publish.adsCommon.C5286Ad;

/* compiled from: StartAppSDK */
public interface AdDisplayListener {

    /* compiled from: StartAppSDK */
    public enum NotDisplayedReason {
        NETWORK_PROBLEM,
        AD_RULES,
        AD_NOT_READY,
        AD_EXPIRED,
        VIDEO_BACK,
        VIDEO_ERROR,
        INTERNAL_ERROR,
        AD_NOT_READY_VIDEO_FALLBACK,
        APP_IN_BACKGROUND,
        AD_CLOSED_TOO_QUICKLY,
        SERVING_ADS_DISABLED
    }

    void adClicked(C5286Ad ad);

    void adDisplayed(C5286Ad ad);

    void adHidden(C5286Ad ad);

    void adNotDisplayed(C5286Ad ad);
}
