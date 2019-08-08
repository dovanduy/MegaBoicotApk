package com.google.ads.mediation;

import android.app.Activity;
import com.google.ads.mediation.C2784e;
import com.google.ads.mediation.C2787f;

@Deprecated
public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends C2787f, SERVER_PARAMETERS extends C2784e> extends C2775b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    void requestInterstitialAd(C2783d dVar, Activity activity, SERVER_PARAMETERS server_parameters, C2774a aVar, ADDITIONAL_PARAMETERS additional_parameters);

    void showInterstitial();
}
