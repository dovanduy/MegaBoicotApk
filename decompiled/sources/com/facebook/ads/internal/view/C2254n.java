package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.BackButtonInterceptor;
import com.facebook.ads.internal.adapters.p072b.C1600k;
import com.facebook.ads.internal.adapters.p072b.C1601l;
import com.facebook.ads.internal.p081h.C1724b;
import com.facebook.ads.internal.p088o.C1777d;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import com.facebook.ads.internal.p115w.p117b.C2341w;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p125x.C2376a;
import com.facebook.ads.internal.p125x.C2376a.C2377a;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.C2289u.C2291a;
import com.facebook.ads.internal.view.component.p102a.C2004c;
import com.facebook.ads.internal.view.component.p102a.C2005d;
import com.facebook.ads.internal.view.component.p102a.C2006e;
import com.facebook.ads.internal.view.component.p102a.C2006e.C2008a;
import com.facebook.ads.internal.view.component.p102a.C2010g;
import com.facebook.ads.internal.view.component.p102a.C2018l;
import com.facebook.ads.internal.view.p110i.C2110a;
import com.facebook.ads.internal.view.p110i.C2119b;
import com.facebook.ads.internal.view.p110i.C2159c;
import com.facebook.ads.internal.view.p110i.p111a.C2116a;
import com.facebook.ads.internal.view.p110i.p111a.C2117b;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import com.facebook.ads.internal.view.p110i.p112b.C2136d;
import com.facebook.ads.internal.view.p110i.p112b.C2137e;
import com.facebook.ads.internal.view.p110i.p112b.C2138f;
import com.facebook.ads.internal.view.p110i.p112b.C2141i;
import com.facebook.ads.internal.view.p110i.p112b.C2142j;
import com.facebook.ads.internal.view.p110i.p112b.C2143k;
import com.facebook.ads.internal.view.p110i.p112b.C2144l;
import com.facebook.ads.internal.view.p110i.p112b.C2145m;
import com.facebook.ads.internal.view.p110i.p112b.C2146n;
import com.facebook.ads.internal.view.p110i.p113c.C2180d;
import com.facebook.ads.internal.view.p110i.p113c.C2180d.C2188a;
import com.facebook.ads.internal.view.p110i.p113c.C2191f;
import com.facebook.ads.internal.view.p110i.p113c.C2194g;
import com.facebook.ads.internal.view.p110i.p113c.C2211k;
import com.facebook.ads.internal.view.p110i.p113c.C2213l;
import com.facebook.ads.internal.view.p110i.p113c.C2224o;
import com.facebook.ads.internal.view.p110i.p114d.C2240d;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.view.n */
public class C2254n extends C2264o {

    /* renamed from: A */
    private boolean f7089A = false;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f7090B = false;

    /* renamed from: d */
    private final BackButtonInterceptor f7091d = new BackButtonInterceptor() {
        public boolean interceptBackButton() {
            return (C2254n.this.f7111x != null ? C2254n.this.f7111x.mo8200c() : false) || !C2254n.this.f7124b.mo8358a();
        }
    };

    /* renamed from: e */
    private final C2138f f7092e = new C2138f() {
        /* renamed from: a */
        public void mo6895a(C2137e eVar) {
            if (C2254n.this.getAudienceNetworkListener() != null) {
                C2254n.this.getAudienceNetworkListener().mo6796a("videoInterstitalEvent", (C1777d) eVar);
            }
            if (!C2254n.this.f7112y) {
                C2254n.this.f7097j.mo8388g();
                C2254n.this.f7097j.mo8407l();
                C2254n.this.f7112y = true;
            }
            if (C2254n.this.f7109v != null) {
                C2254n.this.f7109v.finish();
            }
        }
    };

    /* renamed from: f */
    private final C2144l f7093f = new C2144l() {
        /* renamed from: a */
        public void mo6895a(C2143k kVar) {
            if (C2254n.this.getAudienceNetworkListener() != null) {
                C2254n.this.getAudienceNetworkListener().mo6796a("videoInterstitalEvent", (C1777d) kVar);
            }
        }
    };

    /* renamed from: g */
    private final C2142j f7094g = new C2142j() {
        /* renamed from: a */
        public void mo6895a(C2141i iVar) {
            if (C2254n.this.getAudienceNetworkListener() != null) {
                C2254n.this.getAudienceNetworkListener().mo6796a("videoInterstitalEvent", (C1777d) iVar);
            }
        }
    };

    /* renamed from: h */
    private final C2136d f7095h = new C2136d() {
        /* renamed from: a */
        public void mo6895a(C2135c cVar) {
            C2254n.this.f7106s.set(true);
            if (C2254n.this.getAudienceNetworkListener() != null) {
                C2254n.this.getAudienceNetworkListener().mo6796a("videoInterstitalEvent", (C1777d) cVar);
            }
        }
    };

    /* renamed from: i */
    private final C2146n f7096i = new C2146n() {
        /* renamed from: a */
        public void mo6895a(C2145m mVar) {
            C2254n.this.f7090B = true;
            if (!C2254n.this.f7112y) {
                C2254n.this.f7107t.set(C2254n.this.f7097j.mo8406k());
                C2254n.this.m8876a();
            }
            if (C2254n.this.getAudienceNetworkListener() != null) {
                C2254n.this.getAudienceNetworkListener().mo6796a("videoInterstitalEvent", (C1777d) mVar);
            }
            C2254n.this.f7102o.mo8777a();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C2110a f7097j = new C2110a(getContext());

    /* renamed from: k */
    private final C2224o f7098k;

    /* renamed from: l */
    private final C2191f f7099l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1600k f7100m;

    /* renamed from: n */
    private final C1601l f7101n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C2376a f7102o;

    /* renamed from: p */
    private final C2377a f7103p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C2341w f7104q = new C2341w();

    /* renamed from: r */
    private final C1724b f7105r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final AtomicBoolean f7106s = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final AtomicBoolean f7107t = new AtomicBoolean(false);

    /* renamed from: u */
    private final C2159c f7108u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public AudienceNetworkActivity f7109v;

    /* renamed from: w */
    private C2116a f7110w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C2018l f7111x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f7112y = false;

    /* renamed from: z */
    private boolean f7113z = false;

    public C2254n(Context context, C1802c cVar, C1600k kVar, C1724b bVar, C1911a aVar) {
        super(context, cVar, aVar);
        this.f7097j.setVideoProgressReportIntervalMs(kVar.mo7194h());
        C2342x.m9081a((View) this.f7097j);
        C2342x.m9082a((View) this.f7097j, 0);
        this.f7100m = kVar;
        this.f7101n = (C1601l) this.f7100m.mo7190d().get(0);
        this.f7105r = bVar;
        this.f7098k = new C2224o(getContext());
        this.f7099l = new C2191f(context);
        this.f7097j.getEventBus().mo7626a((T[]) new C1779f[]{this.f7093f, this.f7094g, this.f7095h, this.f7092e, this.f7096i});
        setupPlugins(this.f7101n);
        this.f7103p = new C2377a() {
            /* renamed from: a */
            public void mo7108a() {
                if (!C2254n.this.f7104q.mo8740b()) {
                    C2254n.this.f7104q.mo8737a();
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(C2254n.this.f7100m.mo7189c())) {
                        C2254n.this.f7102o.mo8779a((Map<String, String>) hashMap);
                        hashMap.put("touch", C2323k.m9046a(C2254n.this.f7104q.mo8743e()));
                        C2254n.this.mo8646a(hashMap);
                        C2254n.this.f7123a.mo7686a(C2254n.this.f7100m.mo7189c(), hashMap);
                        if (C2254n.this.getAudienceNetworkListener() != null) {
                            C2254n.this.getAudienceNetworkListener().mo6795a("com.facebook.ads.interstitial.impression.logged");
                        }
                    }
                }
            }
        };
        this.f7102o = new C2376a(this, 1, this.f7103p);
        this.f7102o.mo8778a(kVar.mo7192f());
        this.f7102o.mo8780b(kVar.mo7193g());
        this.f7108u = new C2119b(getContext(), this.f7123a, this.f7097j, this.f7100m.mo7189c());
        C2110a aVar2 = this.f7097j;
        String a = this.f7101n.mo7198c().mo7126a();
        String str = "";
        if (!(this.f7105r == null || a == null)) {
            str = this.f7105r.mo7496c(a);
        }
        if (!TextUtils.isEmpty(str)) {
            a = str;
        }
        aVar2.setVideoURI(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8876a() {
        this.f7099l.setVisibility(this.f7107t.get() ? 0 : 8);
    }

    private void setUpContent(int i) {
        C2008a aVar = new C2008a(getContext(), this.f7123a, getAudienceNetworkListener(), this.f7100m, this.f7097j, this.f7102o, this.f7104q);
        C2006e a = aVar.mo8191a(C2098i.f6694a).mo8195b(i).mo8193a(this.f7098k).mo8192a((View) this.f7099l).mo8194a();
        C2004c a2 = C2005d.m8222a(a);
        m8876a();
        this.f7111x = C2010g.m8254a(a, C2342x.f7368a.heightPixels - a2.getExactMediaHeightIfAvailable(), C2342x.f7368a.widthPixels - a2.getExactMediaWidthIfAvailable(), this.f7089A);
        mo8645a(a2, this.f7111x, this.f7111x != null ? new C2291a() {
            /* renamed from: a */
            public void mo8634a() {
                if (C2254n.this.f7097j.mo8408m() && !C2254n.this.f7097j.mo8409n()) {
                    C2254n.this.f7097j.mo8380a(C2116a.AUTO_STARTED);
                }
                C2254n.this.f7111x.mo8199b();
            }

            /* renamed from: b */
            public void mo8635b() {
                C2254n.this.f7111x.mo8196a();
                C2254n.this.f7097j.mo8383a(false);
            }
        } : null, a2.getExactMediaHeightIfAvailable(), C2342x.f7368a.widthPixels - a2.getExactMediaWidthIfAvailable(), a2.mo8144a(), i);
    }

    private void setupPlugins(C1601l lVar) {
        this.f7097j.mo8385d();
        this.f7097j.mo8381a((C2117b) this.f7098k);
        this.f7097j.mo8381a((C2117b) this.f7099l);
        if (!TextUtils.isEmpty(lVar.mo7198c().mo7133g())) {
            C2194g gVar = new C2194g(getContext());
            this.f7097j.mo8381a((C2117b) gVar);
            gVar.setImage(lVar.mo7198c().mo7133g());
        }
        C2213l lVar2 = new C2213l(getContext(), true);
        this.f7097j.mo8381a((C2117b) lVar2);
        this.f7097j.mo8381a((C2117b) new C2180d(lVar2, lVar.mo7198c().mo7131e() ? C2188a.FADE_OUT_ON_PLAY : C2188a.VISIBLE, true));
        this.f7097j.mo8381a((C2117b) new C2211k(getContext()));
        this.f7097j.mo8381a((C2117b) this.f7124b);
    }

    /* renamed from: a */
    public void mo7268a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        super.mo8644a(audienceNetworkActivity, this.f7100m);
        this.f7109v = audienceNetworkActivity;
        setUpContent(audienceNetworkActivity.getResources().getConfiguration().orientation);
        this.f7109v.addBackButtonInterceptor(this.f7091d);
        C1601l lVar = (C1601l) this.f7100m.mo7190d().get(0);
        this.f7097j.setVolume(lVar.mo7198c().mo7132f() ? 0.0f : 1.0f);
        if (lVar.mo7198c().mo7131e()) {
            this.f7097j.mo8380a(C2116a.AUTO_STARTED);
        }
        if (lVar.mo7198c().mo7129c() > 0) {
            postDelayed(new Runnable() {
                public void run() {
                    if (!C2254n.this.f7090B) {
                        C2254n.this.f7124b.mo8357a(true);
                    }
                }
            }, (long) C1795a.m7438ad(getContext()));
        }
    }

    /* renamed from: a */
    public void mo7270a(Bundle bundle) {
    }

    /* renamed from: a_ */
    public void mo7271a_(boolean z) {
        if (this.f7111x != null) {
            this.f7111x.mo8202e();
        }
        if (!this.f7112y && !this.f7097j.mo8408m()) {
            this.f7110w = this.f7097j.getVideoStartReason();
            this.f7113z = z;
            this.f7097j.mo8383a(false);
        }
    }

    /* renamed from: b */
    public void mo7272b(boolean z) {
        if (this.f7111x != null) {
            this.f7111x.mo8203f();
        }
        if (!this.f7112y && !this.f7097j.mo8409n() && !((this.f7097j.getState() == C2240d.PREPARED && this.f7097j.getVideoStartReason() == C2116a.NOT_STARTED) || this.f7097j.getState() == C2240d.PLAYBACK_COMPLETED || this.f7110w == null || (this.f7113z && !z))) {
            this.f7097j.mo8380a(this.f7110w);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        removeAllViews();
        C2342x.m9091b(this.f7097j);
        C2342x.m9091b(this.f7098k);
        C2342x.m9091b(this.f7099l);
        if (this.f7111x != null) {
            C2342x.m9091b(this.f7111x);
            this.f7089A = this.f7111x.mo8201d();
        }
        setUpContent(configuration.orientation);
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        if (!this.f7112y) {
            if (!this.f7106s.get()) {
                this.f7097j.mo8387f();
            }
            if (this.f7100m != null && !TextUtils.isEmpty(this.f7100m.mo7189c())) {
                HashMap hashMap = new HashMap();
                this.f7102o.mo8779a((Map<String, String>) hashMap);
                hashMap.put("touch", C2323k.m9046a(this.f7104q.mo8743e()));
                this.f7123a.mo7699l(this.f7100m.mo7189c(), hashMap);
            }
            this.f7097j.mo8388g();
            this.f7097j.mo8407l();
            this.f7112y = true;
        }
        if (this.f7111x != null) {
            this.f7111x.mo8204g();
        }
        this.f7102o.mo8782c();
        this.f7109v = null;
        super.onDestroy();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f7104q.mo8738a(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
