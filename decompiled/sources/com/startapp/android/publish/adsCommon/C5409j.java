package com.startapp.android.publish.adsCommon;

import android.content.Context;
import com.startapp.android.publish.adsCommon.Utils.C5301d;
import com.startapp.android.publish.adsCommon.Utils.C5302e;
import com.startapp.android.publish.adsCommon.p189i.C5405a;
import com.startapp.android.publish.adsCommon.p189i.C5408b;
import com.startapp.common.p193a.C5509c;

/* renamed from: com.startapp.android.publish.adsCommon.j */
/* compiled from: StartAppSDK */
public class C5409j extends BaseRequest {

    /* renamed from: a */
    private C5408b f17293a;

    /* renamed from: b */
    private String f17294b;

    public C5409j(Context context) {
        this.f17293a = C5405a.m23074a(context);
        this.f17294b = C5509c.m23534j(context);
    }

    public C5302e getNameValueMap() {
        C5302e nameValueMap = super.getNameValueMap();
        if (nameValueMap == null) {
            nameValueMap = new C5301d();
        }
        nameValueMap.mo19624a("placement", (Object) "INAPP_DOWNLOAD", true);
        if (this.f17293a != null) {
            nameValueMap.mo19624a("install_referrer", (Object) this.f17293a.mo19957a(), true);
            nameValueMap.mo19624a("referrer_click_timestamp_seconds", (Object) Long.valueOf(this.f17293a.mo19958b()), true);
            nameValueMap.mo19624a("install_begin_timestamp_seconds", (Object) Long.valueOf(this.f17293a.mo19959c()), true);
        }
        nameValueMap.mo19624a("apkSig", (Object) this.f17294b, true);
        return nameValueMap;
    }
}
