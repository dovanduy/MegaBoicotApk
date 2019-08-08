package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.p088o.C1777d;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.p105e.C2056b;
import com.facebook.ads.internal.view.p110i.C2110a;
import com.facebook.ads.internal.view.p110i.C2119b;
import com.facebook.ads.internal.view.p110i.p111a.C2116a;
import com.facebook.ads.internal.view.p110i.p111a.C2117b;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import com.facebook.ads.internal.view.p110i.p112b.C2136d;
import com.facebook.ads.internal.view.p110i.p112b.C2137e;
import com.facebook.ads.internal.view.p110i.p112b.C2138f;
import com.facebook.ads.internal.view.p110i.p112b.C2139g;
import com.facebook.ads.internal.view.p110i.p112b.C2140h;
import com.facebook.ads.internal.view.p110i.p112b.C2141i;
import com.facebook.ads.internal.view.p110i.p112b.C2142j;
import com.facebook.ads.internal.view.p110i.p112b.C2143k;
import com.facebook.ads.internal.view.p110i.p112b.C2144l;
import com.facebook.ads.internal.view.p110i.p112b.C2149q;
import com.facebook.ads.internal.view.p110i.p113c.C2172b;

/* renamed from: com.facebook.ads.internal.view.z */
public class C2297z implements C1910a {

    /* renamed from: a */
    private final C2144l f7236a = new C2144l() {
        /* renamed from: a */
        public void mo6895a(C2143k kVar) {
            C2297z.this.f7243h.mo6796a("videoInterstitalEvent", (C1777d) kVar);
        }
    };

    /* renamed from: b */
    private final C2142j f7237b = new C2142j() {
        /* renamed from: a */
        public void mo6895a(C2141i iVar) {
            C2297z.this.f7243h.mo6796a("videoInterstitalEvent", (C1777d) iVar);
        }
    };

    /* renamed from: c */
    private final C2136d f7238c = new C2136d() {
        /* renamed from: a */
        public void mo6895a(C2135c cVar) {
            C2297z.this.f7243h.mo6796a("videoInterstitalEvent", (C1777d) cVar);
        }
    };

    /* renamed from: d */
    private final C2138f f7239d = new C2138f() {
        /* renamed from: a */
        public void mo6895a(C2137e eVar) {
            C2297z.this.f7240e.finish();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AudienceNetworkActivity f7240e;

    /* renamed from: f */
    private final C1802c f7241f;

    /* renamed from: g */
    private final C2110a f7242g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1911a f7243h;

    /* renamed from: i */
    private C2119b f7244i;

    /* renamed from: j */
    private int f7245j;

    public C2297z(final AudienceNetworkActivity audienceNetworkActivity, C1802c cVar, C1911a aVar) {
        this.f7240e = audienceNetworkActivity;
        this.f7241f = cVar;
        this.f7242g = new C2110a(audienceNetworkActivity);
        this.f7242g.mo8381a((C2117b) new C2172b(audienceNetworkActivity));
        this.f7242g.getEventBus().mo7626a((T[]) new C1779f[]{this.f7236a, this.f7237b, this.f7238c, this.f7239d});
        this.f7243h = aVar;
        this.f7242g.setIsFullScreen(true);
        this.f7242g.setVolume(1.0f);
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(15);
        this.f7242g.setLayoutParams(layoutParams);
        aVar.mo6793a((View) this.f7242g);
        C2078g gVar = new C2078g(audienceNetworkActivity);
        gVar.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                audienceNetworkActivity.finish();
            }
        });
        aVar.mo6793a((View) gVar);
    }

    /* renamed from: a */
    public void mo8698a(int i) {
        this.f7242g.setVideoProgressReportIntervalMs(i);
    }

    /* renamed from: a */
    public void mo7268a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        String stringExtra = intent.getStringExtra("useNativeCtaButton");
        if (stringExtra != null && !stringExtra.isEmpty()) {
            C2056b bVar = new C2056b(audienceNetworkActivity, stringExtra);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            int i = (int) (16.0f * C2342x.f7369b);
            layoutParams.setMargins(i, i, i, i);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            bVar.setLayoutParams(layoutParams);
            bVar.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    C2297z.this.f7243h.mo6795a("performCtaClick");
                }
            });
            this.f7243h.mo6793a((View) bVar);
        }
        this.f7245j = intent.getIntExtra(AudienceNetworkActivity.VIDEO_SEEK_TIME, 0);
        C2119b bVar2 = new C2119b((Context) audienceNetworkActivity, this.f7241f, this.f7242g, intent.getStringExtra(AudienceNetworkActivity.CLIENT_TOKEN), intent.getBundleExtra(AudienceNetworkActivity.VIDEO_LOGGER));
        this.f7244i = bVar2;
        this.f7242g.setVideoMPD(intent.getStringExtra(AudienceNetworkActivity.VIDEO_MPD));
        this.f7242g.setVideoURI(intent.getStringExtra(AudienceNetworkActivity.VIDEO_URL));
        if (this.f7245j > 0) {
            this.f7242g.mo8378a(this.f7245j);
        }
        if (intent.getBooleanExtra(AudienceNetworkActivity.AUTOPLAY, false)) {
            this.f7242g.mo8380a(C2116a.USER_STARTED);
        }
    }

    /* renamed from: a */
    public void mo7270a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo8699a(View view) {
        this.f7242g.setControlsAnchorView(view);
    }

    /* renamed from: a_ */
    public void mo7271a_(boolean z) {
        this.f7243h.mo6796a("videoInterstitalEvent", (C1777d) new C2139g());
        this.f7242g.mo8386e();
    }

    /* renamed from: b */
    public void mo7272b(boolean z) {
        this.f7243h.mo6796a("videoInterstitalEvent", (C1777d) new C2140h());
        this.f7242g.mo8380a(C2116a.USER_STARTED);
    }

    public void onDestroy() {
        this.f7243h.mo6796a("videoInterstitalEvent", (C1777d) new C2149q(this.f7245j, this.f7242g.getCurrentPositionInMillis()));
        this.f7244i.mo8452b(this.f7242g.getCurrentPositionInMillis());
        this.f7242g.mo8388g();
        this.f7242g.mo8407l();
    }

    public void setListener(C1911a aVar) {
    }
}
