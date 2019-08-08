package com.startapp.android.publish.p165a;

import android.content.Context;
import android.content.Intent;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.AdsConstants.AdApiType;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.C5359d;
import com.startapp.android.publish.adsCommon.C5395h;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.p178b.C5348c;
import com.startapp.android.publish.adsCommon.p191k.C5415a;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.android.publish.common.model.GetAdRequest;
import com.startapp.android.publish.common.model.GetAdResponse;
import com.startapp.common.C5523b;
import com.startapp.common.C5552e;
import com.startapp.common.p193a.C5518g;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.startapp.android.publish.a.a */
/* compiled from: StartAppSDK */
public abstract class C5078a extends C5359d {

    /* renamed from: g */
    private int f16422g = 0;

    /* renamed from: h */
    private Set<String> f16423h = new HashSet();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18690a(C5286Ad ad);

    public C5078a(Context context, C5286Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, Placement placement) {
        super(context, ad, adPreferences, adEventListener, placement);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Object mo18693e() {
        GetAdRequest a = mo18905a();
        if (a == null) {
            return null;
        }
        if (this.f16423h.size() == 0) {
            this.f16423h.add(this.f17183a.getPackageName());
        }
        boolean z = false;
        if (this.f16422g > 0) {
            a.setEngInclude(false);
        }
        a.setPackageExclude(this.f16423h);
        if (this.f16422g == 0) {
            z = true;
        }
        a.setEngInclude(z);
        try {
            return (GetAdResponse) C5415a.m23104a(this.f17183a, AdsConstants.m22605a(AdApiType.JSON, mo19822f()), a, null, GetAdResponse.class);
        } catch (C5552e e) {
            C5518g.m23564a("AppPresence", 6, "Unable to handle GetAdsSetService command!!!!", e);
            this.f17188f = e.getMessage();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18692a(Object obj) {
        GetAdResponse getAdResponse = (GetAdResponse) obj;
        boolean z = false;
        if (obj == null) {
            this.f17188f = "Empty Response";
            C5518g.m23563a("AppPresence", 6, "Error Empty Response");
            return false;
        } else if (!getAdResponse.isValidResponse()) {
            this.f17188f = getAdResponse.getErrorMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("Error msg = [");
            sb.append(this.f17188f);
            sb.append("]");
            C5518g.m23563a("AppPresence", 6, sb.toString());
            return false;
        } else {
            C5395h hVar = (C5395h) this.f17184b;
            List a = C5348c.m22841a(this.f17183a, getAdResponse.getAdsDetails(), this.f16422g, this.f16423h);
            hVar.mo19939a(a);
            hVar.setAdInfoOverride(getAdResponse.getAdInfoOverride());
            if (getAdResponse.getAdsDetails() != null && getAdResponse.getAdsDetails().size() > 0) {
                z = true;
            }
            if (!z) {
                this.f17188f = "Empty Response";
            } else if (a.size() == 0 && this.f16422g == 0) {
                C5518g.m23563a("AppPresence", 3, "Packages exists - another request");
                return m21891b();
            }
            return z;
        }
    }

    /* renamed from: b */
    private boolean m21891b() {
        this.f16422g++;
        return mo19821d().booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18691a(Boolean bool) {
        super.mo18691a(bool);
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f17184b.hashCode());
        intent.putExtra("adResult", bool);
        C5523b.m23588a(this.f17183a).mo20506a(intent);
        if (bool.booleanValue()) {
            mo18690a((C5286Ad) (C5395h) this.f17184b);
            this.f17186d.onReceiveAd(this.f17184b);
        }
    }
}
