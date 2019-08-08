package com.facebook.ads.internal.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.BackButtonInterceptor;
import com.facebook.ads.internal.adapters.C1609c;
import com.facebook.ads.internal.adapters.C1654r;
import com.facebook.ads.internal.adapters.p072b.C1586b;
import com.facebook.ads.internal.adapters.p072b.C1605n;
import com.facebook.ads.internal.adapters.p072b.C1608q;
import com.facebook.ads.internal.p088o.C1777d;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import com.facebook.ads.internal.p115w.p117b.C2328p;
import com.facebook.ads.internal.p115w.p117b.C2341w;
import com.facebook.ads.internal.p115w.p120e.C2358e;
import com.facebook.ads.internal.p115w.p120e.C2358e.C2359a;
import com.facebook.ads.internal.p115w.p120e.C2360f;
import com.facebook.ads.internal.p125x.C2376a;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.component.C1983a;
import com.facebook.ads.internal.view.p101c.C1967a;
import com.facebook.ads.internal.view.p107f.C2069b;
import com.facebook.ads.internal.view.p107f.C2069b.C2076c;
import com.facebook.ads.internal.view.p110i.p112b.C2133aa;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@TargetApi(16)
/* renamed from: com.facebook.ads.internal.view.r */
public class C2272r extends RelativeLayout implements C1910a, C2076c {

    /* renamed from: a */
    private final C1802c f7150a;

    /* renamed from: b */
    private final C1608q f7151b;

    /* renamed from: c */
    private final C1605n f7152c;

    /* renamed from: d */
    private final C1586b f7153d;

    /* renamed from: e */
    private int f7154e;

    /* renamed from: f */
    private Context f7155f;

    /* renamed from: g */
    private AudienceNetworkActivity f7156g;

    /* renamed from: h */
    private C1911a f7157h;

    /* renamed from: i */
    private Executor f7158i = C2328p.f7322a;

    /* renamed from: j */
    private final BackButtonInterceptor f7159j = new BackButtonInterceptor() {
        public boolean interceptBackButton() {
            return !C2272r.this.f7162m;
        }
    };

    /* renamed from: k */
    private boolean f7160k;

    /* renamed from: l */
    private C2069b f7161l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f7162m;

    /* renamed from: n */
    private C1654r f7163n;

    /* renamed from: com.facebook.ads.internal.view.r$a */
    private static class C2276a implements C2359a {

        /* renamed from: a */
        final WeakReference<C1911a> f7167a;

        private C2276a(WeakReference<C1911a> weakReference) {
            this.f7167a = weakReference;
        }

        /* renamed from: a */
        public void mo8347a() {
            if (this.f7167a.get() != null) {
                ((C1911a) this.f7167a.get()).mo6795a(C2133aa.REWARD_SERVER_FAILED.mo8442a());
            }
        }

        /* renamed from: a */
        public void mo8348a(C2360f fVar) {
            C1911a aVar;
            C2133aa aaVar;
            if (this.f7167a.get() != null) {
                if (fVar == null || !fVar.mo8766a()) {
                    aVar = (C1911a) this.f7167a.get();
                    aaVar = C2133aa.REWARD_SERVER_FAILED;
                } else {
                    aVar = (C1911a) this.f7167a.get();
                    aaVar = C2133aa.REWARD_SERVER_SUCCESS;
                }
                aVar.mo6795a(aaVar.mo8442a());
            }
        }
    }

    public C2272r(Context context, C1802c cVar, C1911a aVar, C1608q qVar) {
        super(context);
        this.f7155f = context;
        this.f7157h = aVar;
        this.f7150a = cVar;
        this.f7151b = qVar;
        this.f7152c = qVar.mo7235j().mo7136j();
        this.f7153d = qVar.mo7234i();
    }

    /* renamed from: a */
    private C1983a m8931a(C1967a aVar) {
        C1983a aVar2 = new C1983a(this.f7155f, true, false, C2133aa.REWARDED_VIDEO_AD_CLICK.mo8442a(), this.f7153d.mo7120a(), this.f7150a, this.f7157h, aVar.getViewabilityChecker(), aVar.getTouchDataRecorder());
        return aVar2;
    }

    /* renamed from: b */
    static /* synthetic */ void m8933b(C2272r rVar) {
        if (rVar.f7157h != null) {
            rVar.f7157h.mo6795a(C2133aa.REWARDED_VIDEO_IMPRESSION.mo8442a());
        }
    }

    /* renamed from: a */
    public void mo8316a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r11.setRequestedOrientation(r9);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7268a(android.content.Intent r9, android.os.Bundle r10, com.facebook.ads.AudienceNetworkActivity r11) {
        /*
            r8 = this;
            com.facebook.ads.internal.view.a$a r9 = r8.f7157h
            if (r9 == 0) goto L_0x0054
            android.content.Context r9 = r8.f7155f
            if (r9 != 0) goto L_0x0009
            return
        L_0x0009:
            r8.f7156g = r11
            com.facebook.ads.AudienceNetworkActivity r9 = r8.f7156g
            com.facebook.ads.AudienceNetworkActivity$BackButtonInterceptor r10 = r8.f7159j
            r9.addBackButtonInterceptor(r10)
            int r9 = r11.getRequestedOrientation()
            r8.f7154e = r9
            int[] r9 = com.facebook.ads.internal.view.C2272r.C22753.f7166a
            com.facebook.ads.internal.adapters.b.n r10 = r8.f7152c
            com.facebook.ads.internal.view.c.f r10 = r10.mo7215f()
            int r10 = r10.ordinal()
            r9 = r9[r10]
            switch(r9) {
                case 1: goto L_0x002e;
                case 2: goto L_0x002c;
                case 3: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0032
        L_0x002a:
            r9 = -1
            goto L_0x002f
        L_0x002c:
            r9 = 0
            goto L_0x002f
        L_0x002e:
            r9 = 1
        L_0x002f:
            r11.setRequestedOrientation(r9)
        L_0x0032:
            com.facebook.ads.internal.view.f.b r9 = new com.facebook.ads.internal.view.f.b
            android.content.Context r1 = r8.f7155f
            com.facebook.ads.internal.adapters.b.q r10 = r8.f7151b
            com.facebook.ads.internal.adapters.b.o r2 = com.facebook.ads.internal.adapters.p072b.C1606o.m6700a(r10)
            com.facebook.ads.internal.s.c r3 = r8.f7150a
            com.facebook.ads.internal.view.a$a r4 = r8.f7157h
            r6 = 1
            r7 = 0
            r0 = r9
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f7161l = r9
            r8.addView(r9)
            com.facebook.ads.internal.view.a$a r10 = r8.f7157h
            r10.mo6793a(r8)
            r9.mo8308c()
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.C2272r.mo7268a(android.content.Intent, android.os.Bundle, com.facebook.ads.AudienceNetworkActivity):void");
    }

    /* renamed from: a */
    public void mo7270a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo8317a(C2376a aVar, C2341w wVar) {
        if (this.f7163n == null) {
            C1654r rVar = new C1654r(getContext(), this.f7150a, aVar, wVar, new C1609c() {
                /* renamed from: a */
                public void mo7238a() {
                    C2272r.m8933b(C2272r.this);
                }
            });
            this.f7163n = rVar;
            this.f7163n.mo7347a(this.f7151b);
        }
        this.f7163n.mo7111a();
    }

    /* renamed from: a */
    public void mo8318a(boolean z) {
        this.f7160k = true;
        C1967a adWebView = this.f7161l.getAdWebView();
        if (adWebView != null) {
            C1983a a = m8931a(adWebView);
            a.mo8132a(this.f7151b.mo7233h(), this.f7151b.mo7113a(), (Map<String, String>) new HashMap<String,String>(), z);
            a.performClick();
        }
    }

    /* renamed from: a_ */
    public void mo7271a_(boolean z) {
        this.f7161l.mo8310e();
    }

    /* renamed from: b */
    public void mo8319b() {
        this.f7162m = true;
        String a = this.f7151b.mo7236k().mo7180a();
        if (this.f7155f != null || !TextUtils.isEmpty(a)) {
            C2358e eVar = new C2358e(this.f7155f, new HashMap());
            eVar.mo8761a((C2359a) new C2276a(new WeakReference(this.f7157h)));
            eVar.executeOnExecutor(this.f7158i, new String[]{a});
        }
        if (this.f7157h != null) {
            this.f7157h.mo6796a(C2133aa.REWARDED_VIDEO_COMPLETE.mo8442a(), (C1777d) new C2135c(0, 0));
        }
        C1967a adWebView = this.f7161l.getAdWebView();
        if (this.f7160k && adWebView != null) {
            m8931a(adWebView).mo8133b(this.f7151b.mo7233h(), this.f7151b.mo7113a(), new HashMap());
        }
    }

    /* renamed from: b */
    public void mo7272b(boolean z) {
        this.f7161l.mo8309d();
    }

    /* renamed from: c */
    public void mo8320c() {
        if (this.f7157h != null) {
            this.f7157h.mo6795a(C2133aa.REWARDED_VIDEO_END_ACTIVITY.mo8442a());
        }
    }

    /* renamed from: d */
    public void mo8321d() {
        if (this.f7157h != null) {
            this.f7157h.mo6795a(C2133aa.REWARDED_VIDEO_ERROR.mo8442a());
        }
    }

    public void onDestroy() {
        if (this.f7156g != null) {
            this.f7156g.removeBackButtonInterceptor(this.f7159j);
            this.f7156g.setRequestedOrientation(this.f7154e);
        }
        C1967a adWebView = this.f7161l.getAdWebView();
        if (adWebView != null && !TextUtils.isEmpty(this.f7151b.mo7113a())) {
            HashMap hashMap = new HashMap();
            adWebView.getViewabilityChecker().mo8779a((Map<String, String>) hashMap);
            hashMap.put("touch", C2323k.m9046a(adWebView.getTouchDataRecorder().mo8743e()));
            this.f7150a.mo7699l(this.f7151b.mo7113a(), hashMap);
        }
        this.f7161l.mo8311f();
        this.f7157h = null;
        this.f7156g = null;
        this.f7155f = null;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f7161l.getAdWebView() != null) {
            if (z) {
                mo7272b(false);
            } else {
                mo7271a_(false);
            }
        }
    }

    public void setListener(C1911a aVar) {
        this.f7157h = aVar;
    }
}
