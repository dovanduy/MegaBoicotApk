package com.startapp.android.publish.ads.banner;

import android.content.Context;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.common.p193a.C5515e;
import com.startapp.common.p196c.C5548f;
import java.io.Serializable;

/* renamed from: com.startapp.android.publish.ads.banner.c */
/* compiled from: StartAppSDK */
public class C5144c implements Serializable {

    /* renamed from: a */
    private static Object f16534a = new Object();

    /* renamed from: b */
    private static volatile C5144c f16535b = new C5144c();
    private static final long serialVersionUID = 1;
    @C5548f(mo20534a = true)
    private BannerOptions BannerOptions = new BannerOptions();
    private String bannerMetadataUpdateVersion = AdsConstants.f17011h;

    /* renamed from: a */
    public static C5144c m22086a() {
        return f16535b;
    }

    /* renamed from: b */
    public BannerOptions mo18952b() {
        return this.BannerOptions;
    }

    /* renamed from: c */
    public BannerOptions mo18953c() {
        return new BannerOptions(this.BannerOptions);
    }

    /* renamed from: a */
    public static void m22088a(Context context, C5144c cVar) {
        synchronized (f16534a) {
            cVar.bannerMetadataUpdateVersion = AdsConstants.f17011h;
            f16535b = cVar;
            C5515e.m23546a(context, "StartappBannerMetadata", (Serializable) cVar);
        }
    }

    /* renamed from: a */
    public static void m22087a(Context context) {
        C5144c cVar = (C5144c) C5515e.m23542a(context, "StartappBannerMetadata", C5144c.class);
        C5144c cVar2 = new C5144c();
        if (cVar != null) {
            boolean a = C5307i.m22678a(cVar, cVar2);
            if (!cVar.m22089d() && a) {
                C5378f.m23016a(context, C5376d.METADATA_NULL, "BannerMetaData", "", "");
            }
            f16535b = cVar;
            return;
        }
        f16535b = cVar2;
    }

    /* renamed from: d */
    private boolean m22089d() {
        return !AdsConstants.f17011h.equals(this.bannerMetadataUpdateVersion);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5144c cVar = (C5144c) obj;
        if (!C5307i.m22682b(this.BannerOptions, cVar.BannerOptions) || !C5307i.m22682b(this.bannerMetadataUpdateVersion, cVar.bannerMetadataUpdateVersion)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5307i.m22652a(this.BannerOptions, this.bannerMetadataUpdateVersion);
    }
}
