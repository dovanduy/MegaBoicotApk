package com.startapp.android.publish.adsCommon;

import com.appnext.ads.fullscreen.RewardedVideo;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.common.p196c.C5548f;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.android.publish.adsCommon.n */
/* compiled from: StartAppSDK */
public class C5433n implements Serializable {
    private static final long serialVersionUID = 1;
    @C5548f(mo20535b = C5434a.class)
    private C5434a backMode = C5434a.DISABLED;
    private int maxCachedVideos = 3;
    private int maxTimeForCachingIndicator = 10;
    private int maxVastCampaignExclude = 10;
    private int maxVastLevels = 7;
    private long minAvailableStorageRequired = 20;
    private int minTimeForCachingIndicator = 1;
    private int nativePlayerProbability = 100;
    private boolean progressive = false;
    private int progressiveBufferInPercentage = 20;
    private int progressiveInitialBufferInPercentage = 5;
    private int progressiveMinBufferToPlayFromCache = 30;
    private int rewardGrantPercentage = 100;
    private String soundMode = RewardedVideo.VIDEO_MODE_DEFAULT;
    private int vastMediaPicker = 0;
    private int vastPreferredBitrate = 0;
    private int vastRetryTimeout = 60000;
    private int vastTimeout = 30000;
    private int videoErrorsThreshold = 2;
    private boolean videoFallback = false;

    /* renamed from: com.startapp.android.publish.adsCommon.n$a */
    /* compiled from: StartAppSDK */
    public enum C5434a {
        DISABLED,
        SKIP,
        CLOSE,
        BOTH
    }

    /* renamed from: a */
    public C5434a mo20032a() {
        return this.backMode;
    }

    /* renamed from: b */
    public int mo20033b() {
        return this.maxCachedVideos;
    }

    /* renamed from: c */
    public long mo20034c() {
        return this.minAvailableStorageRequired;
    }

    /* renamed from: d */
    public int mo20035d() {
        return this.rewardGrantPercentage;
    }

    /* renamed from: e */
    public int mo20036e() {
        return this.videoErrorsThreshold;
    }

    /* renamed from: f */
    public long mo20038f() {
        return TimeUnit.SECONDS.toMillis((long) this.minTimeForCachingIndicator);
    }

    /* renamed from: g */
    public long mo20039g() {
        return TimeUnit.SECONDS.toMillis((long) this.maxTimeForCachingIndicator);
    }

    /* renamed from: h */
    public boolean mo20040h() {
        return this.videoFallback;
    }

    /* renamed from: i */
    public boolean mo20042i() {
        return this.progressive;
    }

    /* renamed from: j */
    public int mo20043j() {
        return this.progressiveBufferInPercentage;
    }

    /* renamed from: k */
    public int mo20044k() {
        return this.progressiveInitialBufferInPercentage;
    }

    /* renamed from: l */
    public int mo20045l() {
        return this.progressiveMinBufferToPlayFromCache;
    }

    /* renamed from: m */
    public String mo20046m() {
        return this.soundMode;
    }

    /* renamed from: n */
    public int mo20047n() {
        return this.maxVastLevels;
    }

    /* renamed from: o */
    public int mo20048o() {
        return this.vastTimeout;
    }

    /* renamed from: p */
    public int mo20049p() {
        return this.vastRetryTimeout;
    }

    /* renamed from: q */
    public int mo20050q() {
        return this.maxVastCampaignExclude;
    }

    /* renamed from: r */
    public int mo20051r() {
        return this.vastMediaPicker;
    }

    /* renamed from: s */
    public int mo20052s() {
        return this.vastPreferredBitrate;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5433n nVar = (C5433n) obj;
        if (!(this.maxCachedVideos == nVar.maxCachedVideos && this.minAvailableStorageRequired == nVar.minAvailableStorageRequired && this.rewardGrantPercentage == nVar.rewardGrantPercentage && this.videoErrorsThreshold == nVar.videoErrorsThreshold && this.nativePlayerProbability == nVar.nativePlayerProbability && this.minTimeForCachingIndicator == nVar.minTimeForCachingIndicator && this.maxTimeForCachingIndicator == nVar.maxTimeForCachingIndicator && this.videoFallback == nVar.videoFallback && this.progressive == nVar.progressive && this.progressiveBufferInPercentage == nVar.progressiveBufferInPercentage && this.progressiveInitialBufferInPercentage == nVar.progressiveInitialBufferInPercentage && this.progressiveMinBufferToPlayFromCache == nVar.progressiveMinBufferToPlayFromCache && this.maxVastLevels == nVar.maxVastLevels && this.vastTimeout == nVar.vastTimeout && this.vastRetryTimeout == nVar.vastRetryTimeout && this.maxVastCampaignExclude == nVar.maxVastCampaignExclude && this.vastMediaPicker == nVar.vastMediaPicker && this.vastPreferredBitrate == nVar.vastPreferredBitrate && this.backMode == nVar.backMode && C5307i.m22682b(this.soundMode, nVar.soundMode))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5307i.m22652a(Integer.valueOf(this.maxCachedVideos), Long.valueOf(this.minAvailableStorageRequired), Integer.valueOf(this.rewardGrantPercentage), Integer.valueOf(this.videoErrorsThreshold), this.backMode, Integer.valueOf(this.nativePlayerProbability), Integer.valueOf(this.minTimeForCachingIndicator), Integer.valueOf(this.maxTimeForCachingIndicator), Boolean.valueOf(this.videoFallback), Boolean.valueOf(this.progressive), Integer.valueOf(this.progressiveBufferInPercentage), Integer.valueOf(this.progressiveInitialBufferInPercentage), Integer.valueOf(this.progressiveMinBufferToPlayFromCache), this.soundMode, Integer.valueOf(this.maxVastLevels), Integer.valueOf(this.vastTimeout), Integer.valueOf(this.vastRetryTimeout), Integer.valueOf(this.maxVastCampaignExclude), Integer.valueOf(this.vastMediaPicker), Integer.valueOf(this.vastPreferredBitrate));
    }
}
