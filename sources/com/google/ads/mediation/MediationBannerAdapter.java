package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.C2767b;
import com.google.ads.mediation.C2784e;
import com.google.ads.mediation.C2787f;

@Deprecated
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends C2787f, SERVER_PARAMETERS extends C2784e> extends C2775b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    View getBannerView();

    void requestBannerAd(C2776c cVar, Activity activity, SERVER_PARAMETERS server_parameters, C2767b bVar, C2774a aVar, ADDITIONAL_PARAMETERS additional_parameters);
}
