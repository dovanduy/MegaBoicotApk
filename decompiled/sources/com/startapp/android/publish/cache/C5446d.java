package com.startapp.android.publish.cache;

import android.content.Context;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.common.p193a.C5515e;
import com.startapp.common.p196c.C5548f;
import java.io.Serializable;

/* renamed from: com.startapp.android.publish.cache.d */
/* compiled from: StartAppSDK */
public class C5446d implements Serializable {

    /* renamed from: a */
    private static volatile C5446d f17399a = new C5446d();
    private static final long serialVersionUID = 1;
    @C5548f(mo20534a = true)
    private ACMConfig ACM = new ACMConfig();
    private String cacheMetaDataUpdateVersion = AdsConstants.f17011h;
    private float sendCacheSizeProb = 20.0f;

    /* renamed from: a */
    public static C5446d m23293a() {
        return f17399a;
    }

    /* renamed from: b */
    public ACMConfig mo20103b() {
        return this.ACM;
    }

    /* renamed from: a */
    public static void m23295a(Context context, C5446d dVar) {
        dVar.cacheMetaDataUpdateVersion = AdsConstants.f17011h;
        f17399a = dVar;
        C5515e.m23546a(context, "StartappCacheMetadata", (Serializable) dVar);
    }

    /* renamed from: a */
    public static void m23294a(Context context) {
        C5446d dVar = (C5446d) C5515e.m23542a(context, "StartappCacheMetadata", C5446d.class);
        C5446d dVar2 = new C5446d();
        if (dVar != null) {
            boolean a = C5307i.m22678a(dVar, dVar2);
            if (!dVar.m23296d() && a) {
                C5378f.m23016a(context, C5376d.METADATA_NULL, "CacheMetaData", "", "");
            }
            f17399a = dVar;
            return;
        }
        f17399a = dVar2;
    }

    /* renamed from: d */
    private boolean m23296d() {
        return !AdsConstants.f17011h.equals(this.cacheMetaDataUpdateVersion);
    }

    /* renamed from: c */
    public float mo20104c() {
        return this.sendCacheSizeProb;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5446d dVar = (C5446d) obj;
        if (Float.compare(dVar.sendCacheSizeProb, this.sendCacheSizeProb) != 0 || !C5307i.m22682b(this.ACM, dVar.ACM) || !C5307i.m22682b(this.cacheMetaDataUpdateVersion, dVar.cacheMetaDataUpdateVersion)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5307i.m22652a(this.ACM, Float.valueOf(this.sendCacheSizeProb), this.cacheMetaDataUpdateVersion);
    }
}
