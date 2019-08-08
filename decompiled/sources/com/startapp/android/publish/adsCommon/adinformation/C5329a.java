package com.startapp.android.publish.adsCommon.adinformation;

import android.content.Context;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.common.p193a.C5515e;
import com.startapp.common.p196c.C5548f;
import java.io.Serializable;

/* renamed from: com.startapp.android.publish.adsCommon.adinformation.a */
/* compiled from: StartAppSDK */
public class C5329a implements Serializable {

    /* renamed from: a */
    private static volatile C5329a f17090a = new C5329a();

    /* renamed from: b */
    private static Object f17091b = new Object();
    private static final long serialVersionUID = 1;
    @C5548f(mo20534a = true)
    private AdInformationConfig AdInformation = AdInformationConfig.m22718a();
    private String adInformationMetadataUpdateVersion = AdsConstants.f17011h;

    public C5329a() {
        mo19707a().mo19692g();
    }

    /* renamed from: a */
    public AdInformationConfig mo19707a() {
        return this.AdInformation;
    }

    /* renamed from: a */
    public static void m22735a(Context context) {
        C5329a aVar = (C5329a) C5515e.m23542a(context, "StartappAdInfoMetadata", C5329a.class);
        C5329a aVar2 = new C5329a();
        if (aVar != null) {
            boolean a = C5307i.m22678a(aVar, aVar2);
            if (!aVar.m22739f() && a) {
                C5378f.m23016a(context, C5376d.METADATA_NULL, "AdInformationMetaData", "", "");
            }
            aVar.m22738e();
            f17090a = aVar;
        } else {
            f17090a = aVar2;
        }
        m22737b().mo19707a().mo19692g();
    }

    /* renamed from: e */
    private void m22738e() {
        this.AdInformation.mo19697k();
    }

    /* renamed from: b */
    public static C5329a m22737b() {
        return f17090a;
    }

    /* renamed from: a */
    public static void m22736a(Context context, C5329a aVar) {
        synchronized (f17091b) {
            aVar.adInformationMetadataUpdateVersion = AdsConstants.f17011h;
            f17090a = aVar;
            AdInformationConfig.m22719a(m22737b().AdInformation);
            m22737b().mo19707a().mo19692g();
            C5515e.m23546a(context, "StartappAdInfoMetadata", (Serializable) aVar);
        }
    }

    /* renamed from: c */
    public String mo19708c() {
        return this.AdInformation.mo19686b();
    }

    /* renamed from: d */
    public String mo19709d() {
        return this.AdInformation.mo19687c();
    }

    /* renamed from: f */
    private boolean m22739f() {
        return !AdsConstants.f17011h.equals(this.adInformationMetadataUpdateVersion);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5329a aVar = (C5329a) obj;
        if (!C5307i.m22682b(this.AdInformation, aVar.AdInformation) || !C5307i.m22682b(this.adInformationMetadataUpdateVersion, aVar.adInformationMetadataUpdateVersion)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5307i.m22652a(this.AdInformation, this.adInformationMetadataUpdateVersion);
    }
}
