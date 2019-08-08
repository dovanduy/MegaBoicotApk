package com.startapp.android.publish.ads.p166a;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import com.startapp.android.publish.ads.splash.C5195g;
import com.startapp.android.publish.ads.video.C5254f;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.adinformation.C5330b;
import com.startapp.android.publish.adsCommon.adinformation.C5330b.C5338b;
import com.startapp.android.publish.adsCommon.adinformation.C5339c;
import com.startapp.android.publish.cache.C5436a;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.android.publish.inappbrowser.C5492a;
import com.startapp.common.C5523b;
import com.startapp.common.p193a.C5518g;

/* renamed from: com.startapp.android.publish.ads.a.b */
/* compiled from: StartAppSDK */
public abstract class C5082b {

    /* renamed from: a */
    protected C5330b f16425a = null;

    /* renamed from: b */
    protected Placement f16426b;

    /* renamed from: c */
    protected boolean f16427c = false;

    /* renamed from: d */
    private Intent f16428d;

    /* renamed from: e */
    private Activity f16429e;

    /* renamed from: f */
    private BroadcastReceiver f16430f = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            C5082b.this.mo18723p();
        }
    };

    /* renamed from: g */
    private String[] f16431g;

    /* renamed from: h */
    private boolean[] f16432h;

    /* renamed from: i */
    private boolean[] f16433i = {true};

    /* renamed from: j */
    private String f16434j;

    /* renamed from: k */
    private String[] f16435k;

    /* renamed from: l */
    private String[] f16436l;

    /* renamed from: m */
    private String[] f16437m;

    /* renamed from: n */
    private C5286Ad f16438n;

    /* renamed from: o */
    private String f16439o;

    /* renamed from: p */
    private boolean f16440p;

    /* renamed from: q */
    private C5339c f16441q;

    /* renamed from: r */
    private String f16442r;

    /* renamed from: s */
    private Long f16443s;

    /* renamed from: t */
    private Boolean[] f16444t = null;

    /* renamed from: a */
    public void mo18696a(Configuration configuration) {
    }

    /* renamed from: a */
    public boolean mo18704a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public void mo18707b(Bundle bundle) {
    }

    /* renamed from: c */
    public void mo18710c(Bundle bundle) {
    }

    /* renamed from: r */
    public boolean mo18725r() {
        return false;
    }

    /* renamed from: t */
    public void mo18727t() {
    }

    /* renamed from: u */
    public abstract void mo18728u();

    /* renamed from: a */
    public static C5082b m21897a(Activity activity, Intent intent, Placement placement) {
        C5082b bVar = null;
        switch (placement) {
            case INAPP_OFFER_WALL:
                if (C5307i.m22674a(128) || C5307i.m22674a(64)) {
                    bVar = new C5100e();
                    break;
                }
            case INAPP_RETURN:
            case INAPP_OVERLAY:
                if (!C5307i.m22674a(4) || !intent.getBooleanExtra("videoAd", false)) {
                    if (!intent.getBooleanExtra("mraidAd", false)) {
                        bVar = new C5101f();
                        break;
                    } else {
                        bVar = new C5094d();
                        break;
                    }
                } else {
                    bVar = new C5254f();
                    break;
                }
                break;
            case INAPP_SPLASH:
                if (C5307i.m22674a(8)) {
                    bVar = new C5195g();
                    break;
                }
                break;
            case INAPP_FULL_SCREEN:
            case INAPP_BROWSER:
                if (C5307i.m22674a(256)) {
                    Uri data = intent.getData();
                    if (data != null) {
                        bVar = new C5492a(data.toString());
                        break;
                    } else {
                        return null;
                    }
                }
                break;
            default:
                bVar = new C5081a();
                break;
        }
        bVar.m21899a(intent);
        bVar.m21898a(activity);
        bVar.m21907c(intent.getStringExtra("position"));
        bVar.m21906b(intent.getStringArrayExtra("tracking"));
        bVar.m21908c(intent.getStringArrayExtra("trackingClickUrl"));
        bVar.m21909d(intent.getStringArrayExtra("packageNames"));
        bVar.m21904a(intent.getStringArrayExtra("closingUrl"));
        bVar.mo18702a(intent.getBooleanArrayExtra("smartRedirect"));
        bVar.mo18708b(intent.getBooleanArrayExtra("browserEnabled"));
        String stringExtra = intent.getStringExtra("htmlUuid");
        if (stringExtra != null) {
            if (AdsConstants.OVERRIDE_NETWORK.booleanValue()) {
                bVar.mo18700a(C5436a.m23246a().mo20081b(stringExtra));
            } else {
                bVar.mo18700a(C5436a.m23246a().mo20086c(stringExtra));
            }
        }
        bVar.mo19386a(intent.getBooleanExtra("isSplash", false));
        bVar.m21900a((C5339c) intent.getSerializableExtra("adInfoOverride"));
        bVar.mo18743b(intent.getStringExtra("adTag"));
        bVar.m21901a(placement);
        bVar.m21904a(intent.getStringArrayExtra("closingUrl"));
        if (bVar.mo18711d() == null) {
            bVar.mo18702a(new boolean[]{true});
        }
        if (bVar.mo18712e() == null) {
            bVar.mo18708b(new boolean[]{true});
        }
        bVar.mo18699a((C5286Ad) intent.getSerializableExtra("ad"));
        long longExtra = intent.getLongExtra("delayImpressionSeconds", -1);
        if (longExtra != -1) {
            bVar.m21902a(Long.valueOf(longExtra));
        }
        bVar.mo18701a((Boolean[]) intent.getSerializableExtra("sendRedirectHops"));
        StringBuilder sb = new StringBuilder();
        sb.append("Placement=[");
        sb.append(bVar.mo18718k());
        sb.append("]");
        C5518g.m23563a("GenericMode", 3, sb.toString());
        return bVar;
    }

    /* renamed from: a */
    private void m21904a(String[] strArr) {
        this.f16431g = strArr;
    }

    /* renamed from: a */
    private void m21899a(Intent intent) {
        this.f16428d = intent;
    }

    /* renamed from: a */
    private void m21901a(Placement placement) {
        this.f16426b = placement;
    }

    /* renamed from: a */
    private void mo19386a(boolean z) {
        this.f16440p = z;
    }

    /* renamed from: b */
    private void mo18743b(String str) {
        this.f16442r = str;
    }

    /* renamed from: a */
    public Intent mo18695a() {
        return this.f16428d;
    }

    /* renamed from: a */
    private void m21898a(Activity activity) {
        this.f16429e = activity;
    }

    /* renamed from: a */
    private void m21900a(C5339c cVar) {
        this.f16441q = cVar;
    }

    /* renamed from: b */
    public Activity mo18705b() {
        return this.f16429e;
    }

    /* renamed from: c */
    public void mo18709c() {
        this.f16427c = true;
    }

    /* renamed from: c */
    private void m21907c(String str) {
        this.f16434j = str;
    }

    /* renamed from: b */
    private void m21906b(String[] strArr) {
        this.f16435k = strArr;
    }

    /* renamed from: c */
    private void m21908c(String[] strArr) {
        this.f16436l = strArr;
    }

    /* renamed from: d */
    private void m21909d(String[] strArr) {
        this.f16437m = strArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18700a(String str) {
        this.f16439o = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18702a(boolean[] zArr) {
        this.f16432h = zArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean[] mo18711d() {
        return this.f16432h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18708b(boolean[] zArr) {
        this.f16433i = zArr;
    }

    /* renamed from: e */
    public boolean[] mo18712e() {
        return this.f16433i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18703a(int i) {
        if (this.f16433i == null || i < 0 || i >= this.f16433i.length) {
            return true;
        }
        return this.f16433i[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo18713f() {
        return this.f16439o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo18714g() {
        return this.f16434j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String[] mo18715h() {
        return this.f16435k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String[] mo18716i() {
        return this.f16436l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String[] mo18717j() {
        return this.f16437m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public Placement mo18718k() {
        return this.f16426b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public String[] mo18719l() {
        return this.f16431g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C5339c mo18720m() {
        return this.f16441q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public String mo18721n() {
        return this.f16442r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18698a(RelativeLayout relativeLayout) {
        this.f16425a = new C5330b(mo18705b(), C5338b.LARGE, mo18718k(), mo18720m());
        this.f16425a.mo19713a(relativeLayout);
    }

    /* renamed from: o */
    public Long mo18722o() {
        return this.f16443s;
    }

    /* renamed from: a */
    private void m21902a(Long l) {
        this.f16443s = l;
    }

    /* renamed from: b */
    public Boolean mo18706b(int i) {
        if (this.f16444t == null || i < 0 || i >= this.f16444t.length) {
            return null;
        }
        return this.f16444t[i];
    }

    /* renamed from: a */
    public void mo18701a(Boolean[] boolArr) {
        this.f16444t = boolArr;
    }

    /* renamed from: p */
    public void mo18723p() {
        mo18705b().runOnUiThread(new Runnable() {
            public void run() {
                C5082b.this.mo18705b().finish();
            }
        });
    }

    /* renamed from: q */
    public void mo18724q() {
        C5523b.m23588a((Context) mo18705b()).mo20506a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
    }

    /* renamed from: a */
    public void mo18697a(Bundle bundle) {
        C5523b.m23588a((Context) mo18705b()).mo20505a(this.f16430f, new IntentFilter("com.startapp.android.CloseAdActivity"));
    }

    /* renamed from: s */
    public void mo18726s() {
        mo18723p();
    }

    /* renamed from: v */
    public void mo18729v() {
        if (this.f16430f != null) {
            C5523b.m23588a((Context) mo18705b()).mo20504a(this.f16430f);
        }
        this.f16430f = null;
    }

    /* renamed from: w */
    public C5286Ad mo18730w() {
        return this.f16438n;
    }

    /* renamed from: a */
    public void mo18699a(C5286Ad ad) {
        this.f16438n = ad;
    }
}
