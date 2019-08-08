package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.C2973d;

public interface MediationBannerAdapter extends C3144b {
    View getBannerView();

    void requestBannerAd(Context context, C3146c cVar, Bundle bundle, C2973d dVar, C3143a aVar, Bundle bundle2);
}
