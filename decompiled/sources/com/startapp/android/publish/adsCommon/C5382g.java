package com.startapp.android.publish.adsCommon;

import android.content.Context;
import com.startapp.android.publish.adsCommon.C5286Ad.AdState;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;

/* renamed from: com.startapp.android.publish.adsCommon.g */
/* compiled from: StartAppSDK */
public interface C5382g {
    /* renamed from: a */
    boolean mo18768a(String str);

    /* renamed from: a_ */
    String mo18769a_();

    Long getAdCacheTtl();

    Long getLastLoadTime();

    AdState getState();

    boolean getVideoCancelCallBack();

    boolean hasAdCacheTtlPassed();

    boolean isBelowMinCPM();

    boolean isReady();

    boolean load(AdPreferences adPreferences, AdEventListener adEventListener);

    void setActivityExtra(C5313a aVar);

    void setContext(Context context);

    void setVideoCancelCallBack(boolean z);
}
