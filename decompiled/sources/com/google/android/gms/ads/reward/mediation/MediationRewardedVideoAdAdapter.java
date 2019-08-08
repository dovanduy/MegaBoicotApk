package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.C3143a;
import com.google.android.gms.ads.mediation.C3144b;

public interface MediationRewardedVideoAdAdapter extends C3144b {
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";

    void initialize(Context context, C3143a aVar, String str, C3169a aVar2, Bundle bundle, Bundle bundle2);

    boolean isInitialized();

    void loadAd(C3143a aVar, Bundle bundle, Bundle bundle2);

    void showVideo();
}
