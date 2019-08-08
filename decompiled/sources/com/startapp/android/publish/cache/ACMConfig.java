package com.startapp.android.publish.cache;

import com.startapp.android.publish.adsCommon.StartAppAd.AdMode;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.common.p196c.C5548f;
import java.io.Serializable;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: StartAppSDK */
public class ACMConfig implements Serializable {
    public static final int DEFAULT_CACHE_SIZE = 7;
    private static final long serialVersionUID = 1;
    private long adCacheTTL = 3600;
    @C5548f(mo20535b = EnumSet.class, mo20536c = AdMode.class)
    private Set<AdMode> autoLoad = EnumSet.of(AdMode.FULLPAGE);
    @C5548f(mo20534a = true)
    private FailuresHandler failuresHandler = new FailuresHandler();
    private boolean localCache = true;
    private int maxCacheSize = 7;
    private long returnAdCacheTTL = 3600;
    private boolean returnAdShouldLoadInBg = true;

    public long getAdCacheTtl() {
        return TimeUnit.SECONDS.toMillis(this.adCacheTTL);
    }

    public long getReturnAdCacheTTL() {
        return TimeUnit.SECONDS.toMillis(this.returnAdCacheTTL);
    }

    public Set<AdMode> getAutoLoad() {
        return this.autoLoad;
    }

    public boolean isLocalCache() {
        return this.localCache;
    }

    public boolean shouldReturnAdLoadInBg() {
        return this.returnAdShouldLoadInBg;
    }

    public FailuresHandler getFailuresHandler() {
        return this.failuresHandler;
    }

    public int getMaxCacheSize() {
        return this.maxCacheSize;
    }

    public void setMaxCacheSize(int i) {
        this.maxCacheSize = i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ACMConfig aCMConfig = (ACMConfig) obj;
        if (!(this.adCacheTTL == aCMConfig.adCacheTTL && this.returnAdCacheTTL == aCMConfig.returnAdCacheTTL && this.localCache == aCMConfig.localCache && this.returnAdShouldLoadInBg == aCMConfig.returnAdShouldLoadInBg && this.maxCacheSize == aCMConfig.maxCacheSize && C5307i.m22682b(this.autoLoad, aCMConfig.autoLoad) && C5307i.m22682b(this.failuresHandler, aCMConfig.failuresHandler))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5307i.m22652a(Long.valueOf(this.adCacheTTL), Long.valueOf(this.returnAdCacheTTL), this.autoLoad, Boolean.valueOf(this.localCache), Boolean.valueOf(this.returnAdShouldLoadInBg), this.failuresHandler, Integer.valueOf(this.maxCacheSize));
    }
}
