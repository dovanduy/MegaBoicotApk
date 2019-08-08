package com.startapp.android.publish.ads.banner;

import com.startapp.android.publish.adsCommon.Utils.C5301d;
import com.startapp.android.publish.adsCommon.Utils.C5302e;
import com.startapp.android.publish.common.model.GetAdRequest;

/* renamed from: com.startapp.android.publish.ads.banner.a */
/* compiled from: StartAppSDK */
public class C5111a extends GetAdRequest {

    /* renamed from: a */
    private boolean f16483a;

    /* renamed from: b */
    private int f16484b;

    /* renamed from: a */
    public void mo18846a(boolean z) {
        this.f16483a = z;
    }

    /* renamed from: a */
    public boolean mo18847a() {
        return this.f16483a;
    }

    /* renamed from: b */
    public int mo18848b() {
        return this.f16484b;
    }

    /* renamed from: a */
    public void mo18845a(int i) {
        this.f16484b = i;
    }

    public C5302e getNameValueMap() {
        C5302e nameValueMap = super.getNameValueMap();
        if (nameValueMap == null) {
            nameValueMap = new C5301d();
        }
        m22028a(nameValueMap);
        return nameValueMap;
    }

    /* renamed from: a */
    private void m22028a(C5302e eVar) {
        eVar.mo19624a("fixedSize", (Object) Boolean.valueOf(mo18847a()), false);
        eVar.mo19624a("bnrt", (Object) Integer.valueOf(mo18848b()), false);
    }
}
