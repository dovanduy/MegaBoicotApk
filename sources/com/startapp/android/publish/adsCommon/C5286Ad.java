package com.startapp.android.publish.adsCommon;

import android.content.Context;
import com.startapp.android.publish.adsCommon.Utils.C5305g;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.adListeners.C5326b;
import com.startapp.android.publish.adsCommon.adinformation.C5339c;
import com.startapp.android.publish.cache.C5446d;
import com.startapp.android.publish.common.metaData.C5481d;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import java.io.Serializable;

/* renamed from: com.startapp.android.publish.adsCommon.Ad */
/* compiled from: StartAppSDK */
public abstract class C5286Ad implements Serializable {
    private static boolean init = false;
    private static final long serialVersionUID = 1;
    protected C5313a activityExtra;
    protected Long adCacheTtl = null;
    private C5339c adInfoOverride;
    protected boolean belowMinCPM = false;
    protected transient Context context;
    protected String errorMessage = null;
    protected Serializable extraData = null;
    private Long lastLoadTime = null;
    private NotDisplayedReason notDisplayedReason;
    protected Placement placement;
    private AdState state = AdState.UN_INITIALIZED;
    private AdType type;
    private boolean videoCancelCallBack;

    /* renamed from: com.startapp.android.publish.adsCommon.Ad$AdState */
    /* compiled from: StartAppSDK */
    public enum AdState {
        UN_INITIALIZED,
        PROCESSING,
        READY
    }

    /* renamed from: com.startapp.android.publish.adsCommon.Ad$AdType */
    /* compiled from: StartAppSDK */
    public enum AdType {
        INTERSTITIAL,
        RICH_TEXT,
        VIDEO,
        REWARDED_VIDEO,
        NON_VIDEO,
        VIDEO_NO_VAST
    }

    /* access modifiers changed from: protected */
    public abstract void loadAds(AdPreferences adPreferences, AdEventListener adEventListener);

    @Deprecated
    public boolean show() {
        return false;
    }

    public C5286Ad(Context context2, Placement placement2) {
        this.context = context2;
        this.placement = placement2;
        if (C5307i.m22687e()) {
            this.adInfoOverride = C5339c.m22758a();
        }
    }

    public Serializable getExtraData() {
        return this.extraData;
    }

    public Context getContext() {
        return this.context;
    }

    public void setContext(Context context2) {
        this.context = context2;
    }

    public void setActivityExtra(C5313a aVar) {
        this.activityExtra = aVar;
    }

    public void setExtraData(Serializable serializable) {
        this.extraData = serializable;
    }

    public AdState getState() {
        return this.state;
    }

    public boolean isBelowMinCPM() {
        return this.belowMinCPM;
    }

    public void setState(AdState adState) {
        this.state = adState;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public C5339c getAdInfoOverride() {
        return this.adInfoOverride;
    }

    public void setAdInfoOverride(C5339c cVar) {
        this.adInfoOverride = cVar;
    }

    /* access modifiers changed from: protected */
    public Placement getPlacement() {
        return this.placement;
    }

    /* access modifiers changed from: protected */
    public void setPlacement(Placement placement2) {
        this.placement = placement2;
    }

    @Deprecated
    public boolean load() {
        return load(new AdPreferences(), null);
    }

    @Deprecated
    public boolean load(AdEventListener adEventListener) {
        return load(new AdPreferences(), adEventListener);
    }

    @Deprecated
    public boolean load(AdPreferences adPreferences) {
        return load(adPreferences, null);
    }

    @Deprecated
    public boolean load(AdPreferences adPreferences, AdEventListener adEventListener) {
        return load(adPreferences, adEventListener, true);
    }

    /* access modifiers changed from: protected */
    public boolean load(final AdPreferences adPreferences, AdEventListener adEventListener, boolean z) {
        String str;
        boolean z2;
        final C5326b bVar = new C5326b(adEventListener);
        final C52871 r10 = new AdEventListener() {
            public void onReceiveAd(C5286Ad ad) {
                C5286Ad.this.setLastLoadTime(Long.valueOf(System.currentTimeMillis()));
                bVar.onReceiveAd(ad);
            }

            public void onFailedToReceiveAd(C5286Ad ad) {
                bVar.onFailedToReceiveAd(ad);
            }
        };
        if (!init) {
            C5416l.m23124c(this.context);
            init = true;
        }
        C5307i.m22664a(this.context, adPreferences);
        String str2 = "";
        if (adPreferences.getProductId() == null || "".equals(adPreferences.getProductId())) {
            str = "app ID was not set.";
            z2 = true;
        } else {
            str = str2;
            z2 = false;
        }
        if (this.state != AdState.UN_INITIALIZED) {
            str = "load() was already called.";
            z2 = true;
        }
        if (!C5307i.m22675a(this.context)) {
            str = "network not available.";
            z2 = true;
        }
        if (!canShowAd()) {
            str = "serving ads disabled";
            z2 = true;
        }
        if (z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ad wasn't loaded: ");
            sb.append(str);
            setErrorMessage(sb.toString());
            r10.onFailedToReceiveAd(this);
            return false;
        }
        setState(AdState.PROCESSING);
        C52882 r7 = new C5481d() {
            /* renamed from: a */
            public void mo19192a(boolean z) {
                C5286Ad.this.loadAds(adPreferences, r10);
            }

            /* renamed from: a */
            public void mo19191a() {
                C5286Ad.this.loadAds(adPreferences, r10);
            }
        };
        if (adPreferences.getType() != null) {
            setType(adPreferences.getType());
        }
        MetaData.getInstance().loadFromServer(this.context, adPreferences, C5305g.m22636d().mo19630c(), z, r7);
        return true;
    }

    public boolean isReady() {
        return this.state == AdState.READY && !hasAdCacheTtlPassed();
    }

    public NotDisplayedReason getNotDisplayedReason() {
        return this.notDisplayedReason;
    }

    /* access modifiers changed from: protected */
    public void setNotDisplayedReason(NotDisplayedReason notDisplayedReason2) {
        this.notDisplayedReason = notDisplayedReason2;
    }

    /* access modifiers changed from: protected */
    public Long getAdCacheTtl() {
        long fallbackAdCacheTtl = getFallbackAdCacheTtl();
        if (this.adCacheTtl != null) {
            fallbackAdCacheTtl = Math.min(this.adCacheTtl.longValue(), fallbackAdCacheTtl);
        }
        return Long.valueOf(fallbackAdCacheTtl);
    }

    /* access modifiers changed from: protected */
    public long getFallbackAdCacheTtl() {
        return C5446d.m23293a().mo20103b().getAdCacheTtl();
    }

    /* access modifiers changed from: protected */
    public Long getLastLoadTime() {
        return this.lastLoadTime;
    }

    /* access modifiers changed from: private */
    public void setLastLoadTime(Long l) {
        this.lastLoadTime = l;
    }

    /* access modifiers changed from: protected */
    public boolean hasAdCacheTtlPassed() {
        boolean z = false;
        if (this.lastLoadTime == null) {
            return false;
        }
        if (System.currentTimeMillis() - this.lastLoadTime.longValue() > getAdCacheTtl().longValue()) {
            z = true;
        }
        return z;
    }

    private void setType(AdType adType) {
        this.type = adType;
    }

    public AdType getType() {
        return this.type;
    }

    /* access modifiers changed from: protected */
    public boolean getVideoCancelCallBack() {
        return this.videoCancelCallBack;
    }

    /* access modifiers changed from: protected */
    public void setVideoCancelCallBack(boolean z) {
        this.videoCancelCallBack = z;
    }

    /* access modifiers changed from: protected */
    public boolean canShowAd() {
        return MetaData.getInstance().canShowAd();
    }
}
