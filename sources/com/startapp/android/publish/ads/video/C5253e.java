package com.startapp.android.publish.ads.video;

import android.content.Context;
import com.startapp.android.publish.ads.p167b.C5105c;
import com.startapp.android.publish.ads.splash.SplashConfig.Orientation;
import com.startapp.android.publish.ads.video.p173c.p174a.C5246e;
import com.startapp.android.publish.ads.video.p173c.p174a.p175a.C5236b;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.common.p196c.C5544b;

/* renamed from: com.startapp.android.publish.ads.video.e */
/* compiled from: StartAppSDK */
public class C5253e extends C5105c {
    private static final long serialVersionUID = 1;
    private VideoAdDetails videoAdDetails = null;

    public C5253e(Context context) {
        super(context, Placement.INAPP_OVERLAY);
    }

    /* access modifiers changed from: protected */
    public void loadAds(AdPreferences adPreferences, AdEventListener adEventListener) {
        new C5212b(this.context, this, adPreferences, adEventListener).mo19820c();
    }

    /* renamed from: b */
    public void mo19362b(String str) {
        super.mo19362b(str);
        m22486f(mo19834a(str, "@videoJson@"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18767a() {
        return this.videoAdDetails != null;
    }

    /* renamed from: d */
    public VideoAdDetails mo19363d() {
        return this.videoAdDetails;
    }

    /* renamed from: a */
    public void mo19361a(C5246e eVar, boolean z) {
        if (eVar != null) {
            this.videoAdDetails = new VideoAdDetails(eVar, z);
            C5236b g = eVar.mo19352g();
            if (g == null) {
                return;
            }
            if (g.mo19321d().intValue() > g.mo19323e().intValue()) {
                mo19836a(Orientation.LANDSCAPE);
            } else {
                mo19836a(Orientation.PORTRAIT);
            }
        }
    }

    /* renamed from: e */
    public void mo19364e() {
        this.videoAdDetails = null;
    }

    /* renamed from: f */
    private void m22486f(String str) {
        if (str != null) {
            this.videoAdDetails = (VideoAdDetails) C5544b.m23666a(str, VideoAdDetails.class);
        }
    }
}
