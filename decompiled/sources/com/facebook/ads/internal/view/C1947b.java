package com.facebook.ads.internal.view;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.BackButtonInterceptor;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p120e.C2355b;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.p100b.C1951a;
import com.facebook.ads.internal.view.p100b.C1951a.C1955a;
import com.facebook.ads.internal.view.p100b.C1956b;
import com.facebook.ads.internal.view.p100b.C1957c.C1959a;
import com.facebook.ads.internal.view.p100b.C1962f;
import com.facebook.ads.internal.view.p100b.C1962f.C1963a;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.b */
public class C1947b implements C1910a {

    /* renamed from: a */
    private static final String f6111a = "b";

    /* renamed from: b */
    private final AudienceNetworkActivity f6112b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1951a f6113c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1962f f6114d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1956b f6115e;

    /* renamed from: f */
    private final C1802c f6116f;

    /* renamed from: g */
    private final BackButtonInterceptor f6117g = new BackButtonInterceptor() {
        public boolean interceptBackButton() {
            if (!C1947b.this.f6114d.canGoBack()) {
                return false;
            }
            C1947b.this.f6114d.goBack();
            return true;
        }
    };

    /* renamed from: h */
    private String f6118h;

    /* renamed from: i */
    private String f6119i;

    /* renamed from: j */
    private long f6120j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f6121k = true;

    /* renamed from: l */
    private long f6122l = -1;

    /* renamed from: m */
    private boolean f6123m = true;

    public C1947b(final AudienceNetworkActivity audienceNetworkActivity, C1802c cVar, C1911a aVar) {
        this.f6112b = audienceNetworkActivity;
        this.f6116f = cVar;
        int i = (int) (2.0f * C2342x.f7369b);
        this.f6113c = new C1951a(audienceNetworkActivity);
        this.f6113c.setId(View.generateViewId());
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.f6113c.setLayoutParams(layoutParams);
        this.f6113c.setListener(new C1955a() {
            /* renamed from: a */
            public void mo8013a() {
                audienceNetworkActivity.finish();
            }
        });
        aVar.mo6793a((View) this.f6113c);
        this.f6114d = new C1962f(audienceNetworkActivity);
        LayoutParams layoutParams2 = new LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.f6113c.getId());
        layoutParams2.addRule(12);
        this.f6114d.setLayoutParams(layoutParams2);
        this.f6114d.setListener(new C1963a() {
            /* renamed from: a */
            public void mo8014a(int i) {
                if (C1947b.this.f6121k) {
                    C1947b.this.f6115e.setProgress(i);
                }
            }

            /* renamed from: a */
            public void mo8015a(String str) {
                C1947b.this.f6121k = true;
                C1947b.this.f6113c.setUrl(str);
            }

            /* renamed from: b */
            public void mo8016b(String str) {
                C1947b.this.f6113c.setTitle(str);
            }

            /* renamed from: c */
            public void mo8017c(String str) {
                C1947b.this.f6115e.setProgress(100);
                C1947b.this.f6121k = false;
            }
        });
        aVar.mo6793a((View) this.f6114d);
        this.f6115e = new C1956b(audienceNetworkActivity, null, 16842872);
        LayoutParams layoutParams3 = new LayoutParams(-1, i);
        layoutParams3.addRule(3, this.f6113c.getId());
        this.f6115e.setLayoutParams(layoutParams3);
        this.f6115e.setProgress(0);
        aVar.mo6793a((View) this.f6115e);
        audienceNetworkActivity.addBackButtonInterceptor(this.f6117g);
    }

    /* renamed from: a */
    public void mo7268a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        long j;
        if (this.f6122l < 0) {
            this.f6122l = System.currentTimeMillis();
        }
        if (bundle == null) {
            this.f6118h = intent.getStringExtra(AudienceNetworkActivity.BROWSER_URL);
            this.f6119i = intent.getStringExtra(AudienceNetworkActivity.CLIENT_TOKEN);
            j = intent.getLongExtra(AudienceNetworkActivity.HANDLER_TIME, -1);
        } else {
            this.f6118h = bundle.getString(AudienceNetworkActivity.BROWSER_URL);
            this.f6119i = bundle.getString(AudienceNetworkActivity.CLIENT_TOKEN);
            j = bundle.getLong(AudienceNetworkActivity.HANDLER_TIME, -1);
        }
        this.f6120j = j;
        String str = this.f6118h != null ? this.f6118h : "about:blank";
        this.f6113c.setUrl(str);
        this.f6114d.loadUrl(str);
    }

    /* renamed from: a */
    public void mo7270a(Bundle bundle) {
        bundle.putString(AudienceNetworkActivity.BROWSER_URL, this.f6118h);
    }

    /* renamed from: a_ */
    public void mo7271a_(boolean z) {
        this.f6114d.onPause();
        if (this.f6123m) {
            this.f6123m = false;
            this.f6116f.mo7694g(this.f6119i, new C1959a(this.f6114d.getFirstUrl()).mo8028a(this.f6120j).mo8030b(this.f6122l).mo8031c(this.f6114d.getResponseEndMs()).mo8032d(this.f6114d.getDomContentLoadedMs()).mo8033e(this.f6114d.getScrollReadyMs()).mo8034f(this.f6114d.getLoadFinishMs()).mo8035g(System.currentTimeMillis()).mo8029a().mo8027a());
        }
    }

    /* renamed from: b */
    public void mo7272b(boolean z) {
        this.f6114d.onResume();
    }

    public void onDestroy() {
        this.f6112b.removeBackButtonInterceptor(this.f6117g);
        C2355b.m9114a(this.f6114d);
        this.f6114d.destroy();
    }

    public void setListener(C1911a aVar) {
    }
}
