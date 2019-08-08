package com.startapp.android.publish.ads.banner.banner3d;

import android.content.Context;
import com.startapp.android.publish.adsCommon.C5395h;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;

/* renamed from: com.startapp.android.publish.ads.banner.banner3d.a */
/* compiled from: StartAppSDK */
public class C5119a extends C5395h {
    private static final long serialVersionUID = 1;
    private boolean fixedSize;
    private int offset;

    public C5119a(Context context, int i) {
        super(context, Placement.INAPP_BANNER);
        this.offset = i;
    }

    /* access modifiers changed from: protected */
    public void loadAds(AdPreferences adPreferences, AdEventListener adEventListener) {
        C5124c cVar = new C5124c(this.context, this, this.offset, adPreferences, adEventListener);
        cVar.mo19820c();
        this.offset++;
    }

    /* renamed from: a */
    public int mo18894a() {
        return this.offset;
    }

    /* renamed from: a */
    public void mo18895a(boolean z) {
        this.fixedSize = z;
    }

    /* renamed from: b */
    public boolean mo18896b() {
        return this.fixedSize;
    }
}
