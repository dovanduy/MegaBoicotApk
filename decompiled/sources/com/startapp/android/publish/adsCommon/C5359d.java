package com.startapp.android.publish.adsCommon;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Pair;
import com.startapp.android.publish.adsCommon.C5286Ad.AdState;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.adListeners.C5326b;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.android.publish.common.model.GetAdRequest;
import com.startapp.common.C5554g;
import com.startapp.common.C5554g.C5558a;
import com.startapp.common.p193a.C5518g;

/* renamed from: com.startapp.android.publish.adsCommon.d */
/* compiled from: StartAppSDK */
public abstract class C5359d {

    /* renamed from: a */
    protected final Context f17183a;
    /* access modifiers changed from: protected */

    /* renamed from: b */
    public final C5286Ad f17184b;

    /* renamed from: c */
    protected final AdPreferences f17185c;
    /* access modifiers changed from: protected */

    /* renamed from: d */
    public final AdEventListener f17186d;

    /* renamed from: e */
    protected Placement f17187e;

    /* renamed from: f */
    protected String f17188f = null;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo18692a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract Object mo18693e();

    public C5359d(Context context, C5286Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, Placement placement) {
        this.f17183a = context;
        this.f17184b = ad;
        this.f17185c = adPreferences;
        this.f17186d = new C5326b(adEventListener);
        this.f17187e = placement;
    }

    /* renamed from: c */
    public void mo19820c() {
        C5554g.m23702a(C5558a.HIGH, (Runnable) new Runnable() {
            public void run() {
                Process.setThreadPriority(10);
                final Boolean d = C5359d.this.mo19821d();
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        C5359d.this.mo18691a(d);
                    }
                });
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Boolean mo19821d() {
        return Boolean.valueOf(mo18692a(mo18693e()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18691a(Boolean bool) {
        mo19254b(bool);
        if (!bool.booleanValue()) {
            this.f17184b.setErrorMessage(this.f17188f);
            this.f17186d.onFailedToReceiveAd(this.f17184b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo19254b(Boolean bool) {
        this.f17184b.setState(bool.booleanValue() ? AdState.READY : AdState.UN_INITIALIZED);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public GetAdRequest mo18905a() {
        return mo19819b(new GetAdRequest());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public GetAdRequest mo19819b(GetAdRequest getAdRequest) {
        Pair d = C5416l.m23127d(this.f17183a);
        try {
            getAdRequest.fillAdPreferences(this.f17183a, this.f17185c, this.f17187e, d);
            if (!C5344b.m22784a().mo19752D()) {
                C5518g.m23561a(6, "forceExternal - check - request - metadata false disabletwoclicks");
                if (C5349c.m22870a(this.f17183a, this.f17187e)) {
                    getAdRequest.setDisableTwoClicks(true);
                }
            }
            try {
                getAdRequest.fillApplicationDetails(this.f17183a, this.f17185c, false);
            } catch (Exception e) {
                C5378f.m23016a(this.f17183a, C5376d.EXCEPTION, "BaseService.GetAdRequest - fillApplicationDetails failed", e.getMessage(), "");
            }
            return getAdRequest;
        } catch (Exception unused) {
            C5416l.m23119a(d);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Placement mo19822f() {
        return this.f17187e;
    }
}
