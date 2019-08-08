package com.startapp.android.publish.ads.splash;

import android.content.Context;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.common.p193a.C5515e;
import com.startapp.common.p196c.C5548f;
import java.io.Serializable;

/* renamed from: com.startapp.android.publish.ads.splash.f */
/* compiled from: StartAppSDK */
public class C5194f implements Serializable {

    /* renamed from: a */
    private static volatile C5194f f16694a = new C5194f();

    /* renamed from: b */
    private static Object f16695b = new Object();
    private static final long serialVersionUID = 1;
    @C5548f(mo20534a = true)
    private SplashConfig SplashConfig = new SplashConfig();
    private String splashMetadataUpdateVersion = AdsConstants.f17011h;

    /* renamed from: a */
    public SplashConfig mo19203a() {
        return this.SplashConfig;
    }

    /* renamed from: b */
    public static C5194f m22266b() {
        return f16694a;
    }

    /* renamed from: a */
    public static void m22265a(Context context, C5194f fVar) {
        synchronized (f16695b) {
            fVar.splashMetadataUpdateVersion = AdsConstants.f17011h;
            f16694a = fVar;
            C5515e.m23546a(context, "StartappSplashMetadata", (Serializable) fVar);
        }
    }

    /* renamed from: a */
    public static void m22264a(Context context) {
        C5194f fVar = (C5194f) C5515e.m23542a(context, "StartappSplashMetadata", C5194f.class);
        C5194f fVar2 = new C5194f();
        if (fVar != null) {
            boolean a = C5307i.m22678a(fVar, fVar2);
            if (!fVar.m22267c() && a) {
                C5378f.m23016a(context, C5376d.METADATA_NULL, "SplashMetaData", "", "");
            }
            f16694a = fVar;
            return;
        }
        f16694a = fVar2;
    }

    /* renamed from: c */
    private boolean m22267c() {
        return !AdsConstants.f17011h.equals(this.splashMetadataUpdateVersion);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5194f fVar = (C5194f) obj;
        if (!C5307i.m22682b(this.SplashConfig, fVar.SplashConfig) || !C5307i.m22682b(this.splashMetadataUpdateVersion, fVar.splashMetadataUpdateVersion)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5307i.m22652a(this.SplashConfig, this.splashMetadataUpdateVersion);
    }
}
