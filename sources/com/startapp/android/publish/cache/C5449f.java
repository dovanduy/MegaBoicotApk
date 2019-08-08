package com.startapp.android.publish.cache;

import com.startapp.android.publish.adsCommon.C5382g;
import com.startapp.android.publish.adsCommon.C5427m;
import com.startapp.common.p193a.C5518g;

/* renamed from: com.startapp.android.publish.cache.f */
/* compiled from: StartAppSDK */
public class C5449f extends C5447e {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo20098e() {
        return "CacheTTLReloadTimer";
    }

    public C5449f(C5450g gVar) {
        super(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo20096c() {
        return C5427m.m23145a().mo19991a(this.f17400a.mo20121c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public long mo20097d() {
        C5382g b = this.f17400a.mo20119b();
        if (b == null) {
            C5518g.m23563a("CacheTTLReloadTimer", 3, "Missing ad");
            return -1;
        }
        Long adCacheTtl = b.getAdCacheTtl();
        Long lastLoadTime = b.getLastLoadTime();
        if (adCacheTtl == null || lastLoadTime == null) {
            C5518g.m23563a("CacheTTLReloadTimer", 3, "Missing TTL or last loading time");
            return -1;
        }
        long longValue = adCacheTtl.longValue() - (System.currentTimeMillis() - lastLoadTime.longValue());
        long j = 0;
        if (longValue >= 0) {
            j = longValue;
        }
        return j;
    }
}
