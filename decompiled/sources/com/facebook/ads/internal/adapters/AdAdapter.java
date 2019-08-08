package com.facebook.ads.internal.adapters;

import com.facebook.ads.internal.protocol.AdPlacementType;

public interface AdAdapter {
    String getClientToken();

    AdPlacementType getPlacementType();

    void onDestroy();
}
