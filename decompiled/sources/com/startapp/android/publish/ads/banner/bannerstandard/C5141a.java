package com.startapp.android.publish.ads.banner.bannerstandard;

import android.content.Context;
import com.startapp.android.publish.adsCommon.C5364e;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;

/* renamed from: com.startapp.android.publish.ads.banner.bannerstandard.a */
/* compiled from: StartAppSDK */
public class C5141a extends C5364e {
    private static final long serialVersionUID = 1;
    private int bannerType;
    private boolean fixedSize;
    private int offset = 0;

    public C5141a(Context context, int i) {
        super(context, Placement.INAPP_BANNER);
        this.offset = i;
    }

    /* access modifiers changed from: protected */
    public void loadAds(AdPreferences adPreferences, AdEventListener adEventListener) {
        C5142b bVar = new C5142b(this.context, this, this.offset, adPreferences, adEventListener);
        bVar.mo19820c();
        this.offset++;
    }

    /* renamed from: a */
    public int mo18767a() {
        return this.offset;
    }

    /* renamed from: a */
    public void mo18949a(boolean z) {
        this.fixedSize = z;
    }

    /* renamed from: b */
    public boolean mo18950b() {
        return this.fixedSize;
    }

    /* renamed from: c */
    public int mo18951c() {
        return this.bannerType;
    }

    /* renamed from: a */
    public void mo18948a(int i) {
        this.bannerType = i;
    }
}
