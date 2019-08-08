package com.startapp.android.publish.ads.p168c.p170b;

import android.content.Context;
import android.content.Intent;
import com.startapp.android.publish.ads.list3d.C5169f;
import com.startapp.android.publish.ads.list3d.List3DActivity;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.C5286Ad.AdState;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.android.publish.adsCommon.C5382g;
import com.startapp.android.publish.adsCommon.C5395h;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import java.util.UUID;

/* renamed from: com.startapp.android.publish.ads.c.b.b */
/* compiled from: StartAppSDK */
public class C5149b extends C5395h implements C5382g {

    /* renamed from: a */
    private static String f16537a = null;
    private static final long serialVersionUID = 1;
    private final String uuid = UUID.randomUUID().toString();

    public C5149b(Context context) {
        super(context, Placement.INAPP_OFFER_WALL);
        if (f16537a == null) {
            f16537a = C5307i.m22684c(context);
        }
    }

    /* access modifiers changed from: protected */
    public void loadAds(AdPreferences adPreferences, AdEventListener adEventListener) {
        new C5148a(this.context, this, adPreferences, adEventListener).mo19820c();
    }

    /* renamed from: a */
    public boolean mo18768a(String str) {
        C5169f.m22203a().mo19078a(this.uuid).mo19074b(C5349c.m22847a());
        boolean a = this.activityExtra != null ? this.activityExtra.mo19641a() : false;
        if (hasAdCacheTtlPassed()) {
            setNotDisplayedReason(NotDisplayedReason.AD_EXPIRED);
            return false;
        }
        Intent intent = new Intent(this.context, List3DActivity.class);
        intent.putExtra("adInfoOverride", getAdInfoOverride());
        intent.putExtra("fullscreen", a);
        intent.putExtra("adTag", str);
        intent.putExtra("lastLoadTime", getLastLoadTime());
        intent.putExtra("adCacheTtl", getAdCacheTtl());
        intent.putExtra("position", C5349c.m22873b());
        intent.putExtra("listModelUuid", this.uuid);
        intent.addFlags(343932928);
        this.context.startActivity(intent);
        if (!AdsConstants.OVERRIDE_NETWORK.booleanValue()) {
            setState(AdState.UN_INITIALIZED);
        }
        return true;
    }

    /* renamed from: a_ */
    public String mo18769a_() {
        return f16537a;
    }

    /* renamed from: a */
    public String mo18894a() {
        return this.uuid;
    }

    public Long getLastLoadTime() {
        return super.getLastLoadTime();
    }

    public Long getAdCacheTtl() {
        return super.getAdCacheTtl();
    }

    public boolean hasAdCacheTtlPassed() {
        return super.hasAdCacheTtlPassed();
    }

    public boolean getVideoCancelCallBack() {
        return super.getVideoCancelCallBack();
    }

    public void setVideoCancelCallBack(boolean z) {
        super.setVideoCancelCallBack(z);
    }
}
