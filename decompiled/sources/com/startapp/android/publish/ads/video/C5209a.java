package com.startapp.android.publish.ads.video;

import android.content.Context;
import android.util.Pair;
import com.startapp.android.publish.ads.video.C5284h.C5285a;
import com.startapp.android.publish.adsCommon.C5286Ad.AdType;
import com.startapp.android.publish.adsCommon.Utils.C5301d;
import com.startapp.android.publish.adsCommon.Utils.C5302e;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.android.publish.common.model.GetAdRequest;

/* renamed from: com.startapp.android.publish.ads.video.a */
/* compiled from: StartAppSDK */
public class C5209a extends GetAdRequest {

    /* renamed from: a */
    private VideoRequestType f16722a;

    /* renamed from: b */
    private VideoRequestMode f16723b = VideoRequestMode.INTERSTITIAL;

    public void fillAdPreferences(Context context, AdPreferences adPreferences, Placement placement, Pair<String, String> pair) {
        super.fillAdPreferences(context, adPreferences, placement, pair);
        m22298a(context);
        m22297a();
    }

    /* renamed from: a */
    private void m22297a() {
        if (getType() == AdType.REWARDED_VIDEO) {
            this.f16723b = VideoRequestMode.REWARDED;
        }
        if (getType() == AdType.VIDEO) {
            this.f16723b = VideoRequestMode.INTERSTITIAL;
        }
    }

    /* renamed from: a */
    private void m22298a(Context context) {
        if (getType() != null) {
            if (getType() == AdType.NON_VIDEO) {
                this.f16722a = VideoRequestType.DISABLED;
            } else if (getType() == AdType.VIDEO_NO_VAST) {
                this.f16722a = VideoRequestType.FORCED_NONVAST;
            } else if (isAdTypeVideo()) {
                this.f16722a = VideoRequestType.FORCED;
            }
        } else if (C5284h.m22593a(context) != C5285a.ELIGIBLE) {
            this.f16722a = VideoRequestType.DISABLED;
        } else if (!C5307i.m22674a(2)) {
            this.f16722a = VideoRequestType.FORCED;
        } else {
            this.f16722a = VideoRequestType.ENABLED;
        }
    }

    public C5302e getNameValueMap() {
        C5302e nameValueMap = super.getNameValueMap();
        if (nameValueMap == null) {
            nameValueMap = new C5301d();
        }
        nameValueMap.mo19624a("video", (Object) this.f16722a, false);
        nameValueMap.mo19624a("videoMode", (Object) this.f16723b, false);
        return nameValueMap;
    }
}
