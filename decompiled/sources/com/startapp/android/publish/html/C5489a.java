package com.startapp.android.publish.html;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.AdsConstants.AdApiType;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.C5359d;
import com.startapp.android.publish.adsCommon.C5364e;
import com.startapp.android.publish.adsCommon.C5416l;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.Utils.C5307i.C5312a;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.p178b.C5345a;
import com.startapp.android.publish.adsCommon.p178b.C5346b;
import com.startapp.android.publish.adsCommon.p178b.C5348c;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.adsCommon.p191k.C5415a;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.android.publish.common.model.GetAdRequest;
import com.startapp.common.C5523b;
import com.startapp.common.C5552e;
import com.startapp.common.p193a.C5518g;
import com.startapp.common.p193a.C5519h.C5520a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.startapp.android.publish.html.a */
/* compiled from: StartAppSDK */
public abstract class C5489a extends C5359d {

    /* renamed from: g */
    protected Set<String> f17488g = new HashSet();

    /* renamed from: h */
    protected GetAdRequest f17489h;

    /* renamed from: i */
    private Set<String> f17490i = new HashSet();

    /* renamed from: j */
    private List<C5345a> f17491j = new ArrayList();

    /* renamed from: k */
    private int f17492k = 0;

    /* renamed from: l */
    private boolean f17493l;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo19252a(GetAdRequest getAdRequest) {
        return getAdRequest != null;
    }

    public C5489a(Context context, C5286Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, Placement placement, boolean z) {
        super(context, ad, adPreferences, adEventListener, placement);
        this.f17493l = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Object mo18693e() {
        this.f17489h = mo18905a();
        if (!mo19252a(this.f17489h)) {
            return null;
        }
        if (this.f17490i.size() == 0) {
            this.f17490i.add(this.f17183a.getPackageName());
        }
        this.f17489h.setPackageExclude(this.f17490i);
        this.f17489h.setCampaignExclude(this.f17488g);
        if (this.f17492k > 0) {
            this.f17489h.setEngInclude(false);
            if (MetaData.getInstance().getSimpleTokenConfig().mo20294b(this.f17183a)) {
                C5416l.m23122b(this.f17183a);
            }
        }
        try {
            return C5415a.m23105a(this.f17183a, AdsConstants.m22605a(AdApiType.HTML, mo19822f()), this.f17489h, null);
        } catch (C5552e e) {
            if (!MetaData.getInstance().getInvalidNetworkCodesInfoEvents().contains(Integer.valueOf(e.mo20546a()))) {
                C5378f.m23016a(this.f17183a, C5376d.EXCEPTION, "BaseHtmlService.sendCommand - network failure", e.getMessage(), "");
            }
            C5518g.m23564a("BaseHtmlService", 6, "Unable to handle GetHtmlAdService command!!!!", e);
            this.f17188f = e.getMessage();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18692a(Object obj) {
        C5518g.m23563a("BaseHtmlService", 4, "Handle Html Response");
        try {
            this.f17491j = new ArrayList();
            String a = ((C5520a) obj).mo20491a();
            if (TextUtils.isEmpty(a)) {
                if (this.f17188f == null) {
                    if (this.f17489h == null || !this.f17489h.isAdTypeVideo()) {
                        this.f17188f = "Empty Ad";
                    } else {
                        this.f17188f = "Video isn't available";
                    }
                }
                return false;
            }
            List a2 = C5348c.m22843a(a, this.f17492k);
            if (C5344b.m22784a().mo19753E() ? C5348c.m22840a(this.f17183a, a2, this.f17492k, this.f17490i, this.f17491j).booleanValue() : false) {
                return mo20438g();
            }
            ((C5364e) this.f17184b).mo19837a(a2);
            return mo20437a(a);
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18691a(Boolean bool) {
        super.mo18691a(bool);
        StringBuilder sb = new StringBuilder();
        sb.append("Html onPostExecute, result=[");
        sb.append(bool);
        sb.append("]");
        C5518g.m23563a("BaseHtmlService", 4, sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo19254b(Boolean bool) {
        super.mo19254b(bool);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20436a(boolean z) {
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f17184b.hashCode());
        intent.putExtra("adResult", z);
        C5523b.m23588a(this.f17183a).mo20506a(intent);
        if (!z || this.f17184b == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Html onPostExecute failed error=[");
            sb.append(this.f17188f);
            sb.append("]");
            C5518g.m23563a("BaseHtmlService", 6, sb.toString());
        } else if (this.f17493l) {
            C5307i.m22665a(this.f17183a, ((C5364e) this.f17184b).mo19847f(), (C5312a) new C5312a() {
                /* renamed from: a */
                public void mo19638a() {
                    C5489a.this.f17186d.onReceiveAd(C5489a.this.f17184b);
                }

                /* renamed from: a */
                public void mo19639a(String str) {
                    C5489a.this.f17184b.setErrorMessage(str);
                    C5489a.this.f17186d.onFailedToReceiveAd(C5489a.this.f17184b);
                }
            });
        } else if (z) {
            this.f17186d.onReceiveAd(this.f17184b);
        } else {
            this.f17186d.onFailedToReceiveAd(this.f17184b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo20437a(String str) {
        ((C5364e) this.f17184b).mo19362b(str);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo20438g() {
        C5518g.m23563a("BaseHtmlService", 3, "At least one package is present. sending another request to AdPlatform");
        this.f17492k++;
        new C5346b(this.f17183a, this.f17491j).mo19799a();
        return mo19821d().booleanValue();
    }
}
