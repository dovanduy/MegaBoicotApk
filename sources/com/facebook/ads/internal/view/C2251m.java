package com.facebook.ads.internal.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.BackButtonInterceptor;
import com.facebook.ads.internal.adapters.p072b.C1600k;
import com.facebook.ads.internal.adapters.p072b.C1601l;
import com.facebook.ads.internal.adapters.p072b.C1606o;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import com.facebook.ads.internal.p115w.p117b.C2341w;
import com.facebook.ads.internal.p125x.C2376a;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.component.C1983a;
import com.facebook.ads.internal.view.p101c.C1967a;
import com.facebook.ads.internal.view.p107f.C2069b;
import com.facebook.ads.internal.view.p107f.C2069b.C2076c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.m */
public class C2251m extends C2264o {

    /* renamed from: d */
    private final C1600k f7079d;

    /* renamed from: e */
    private final BackButtonInterceptor f7080e = new BackButtonInterceptor() {
        public boolean interceptBackButton() {
            return !C2251m.this.f7082g;
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2069b f7081f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f7082g;

    /* renamed from: com.facebook.ads.internal.view.m$a */
    private static class C2253a implements C2076c {

        /* renamed from: a */
        private final WeakReference<Activity> f7084a;

        /* renamed from: b */
        private final WeakReference<C2251m> f7085b;

        /* renamed from: c */
        private final C1600k f7086c;

        /* renamed from: d */
        private final C1802c f7087d;

        /* renamed from: e */
        private final WeakReference<C1911a> f7088e;

        C2253a(Activity activity, C2251m mVar, C1600k kVar, C1802c cVar, C1911a aVar) {
            this.f7084a = new WeakReference<>(activity);
            this.f7085b = new WeakReference<>(mVar);
            this.f7086c = kVar;
            this.f7087d = cVar;
            this.f7088e = new WeakReference<>(aVar);
        }

        /* renamed from: e */
        private void m8868e() {
            if (this.f7084a.get() != null) {
                ((Activity) this.f7084a.get()).finish();
            }
        }

        /* renamed from: a */
        public void mo8316a() {
        }

        /* renamed from: a */
        public void mo8317a(C2376a aVar, C2341w wVar) {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(this.f7086c.mo7189c())) {
                aVar.mo8779a((Map<String, String>) hashMap);
                hashMap.put("touch", C2323k.m9046a(wVar.mo8743e()));
                this.f7087d.mo7686a(this.f7086c.mo7189c(), hashMap);
                if (this.f7088e.get() != null) {
                    ((C1911a) this.f7088e.get()).mo6795a("com.facebook.ads.interstitial.impression.logged");
                }
            }
        }

        /* renamed from: a */
        public void mo8318a(boolean z) {
            if (this.f7085b.get() != null && ((C2251m) this.f7085b.get()).f7081f.getAdWebView() != null && this.f7088e.get() != null) {
                C1967a adWebView = ((C2251m) this.f7085b.get()).f7081f.getAdWebView();
                C1983a aVar = new C1983a(((C2251m) this.f7085b.get()).getContext(), true, false, "com.facebook.ads.interstitial.clicked", this.f7086c.mo7188b().mo7120a(), this.f7087d, (C1911a) this.f7088e.get(), adWebView.getViewabilityChecker(), adWebView.getTouchDataRecorder());
                aVar.mo8132a(((C1601l) this.f7086c.mo7190d().get(0)).mo7197b(), this.f7086c.mo7189c(), (Map<String, String>) new HashMap<String,String>(), z);
                aVar.performClick();
            }
        }

        /* renamed from: b */
        public void mo8319b() {
            if (this.f7085b.get() != null) {
                ((C2251m) this.f7085b.get()).f7082g = true;
            }
        }

        /* renamed from: c */
        public void mo8320c() {
            m8868e();
        }

        /* renamed from: d */
        public void mo8321d() {
            if (this.f7088e.get() != null) {
                ((C1911a) this.f7088e.get()).mo6795a("com.facebook.ads.interstitial.error");
            }
            m8868e();
        }
    }

    public C2251m(Context context, C1802c cVar, C1600k kVar, C1911a aVar) {
        super(context, cVar, aVar);
        this.f7079d = kVar;
    }

    /* renamed from: a */
    public void mo7268a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        AudienceNetworkActivity audienceNetworkActivity2 = audienceNetworkActivity;
        super.mo8644a(audienceNetworkActivity2, this.f7079d);
        audienceNetworkActivity2.addBackButtonInterceptor(this.f7080e);
        C1606o a = C1606o.m6699a(this.f7079d);
        boolean z = a.mo7226f().mo7129c() > 0;
        C1802c adEventManager = getAdEventManager();
        C1911a audienceNetworkListener = getAudienceNetworkListener();
        C2253a aVar = new C2253a(audienceNetworkActivity2, this, this.f7079d, getAdEventManager(), getAudienceNetworkListener());
        C2069b bVar = r7;
        C2069b bVar2 = new C2069b(audienceNetworkActivity2, a, adEventManager, audienceNetworkListener, aVar, z, true);
        this.f7081f = bVar;
        mo8643a(this.f7081f, true, 1);
        this.f7124b.setVisibility(8);
        this.f7081f.mo8308c();
    }

    /* renamed from: a */
    public void mo7270a(Bundle bundle) {
    }

    /* renamed from: a_ */
    public void mo7271a_(boolean z) {
        this.f7081f.mo8310e();
    }

    /* renamed from: b */
    public void mo7272b(boolean z) {
        this.f7081f.mo8309d();
    }

    public void onDestroy() {
        super.onDestroy();
        if (!TextUtils.isEmpty(this.f7079d.mo7189c())) {
            C1967a adWebView = this.f7081f.getAdWebView();
            C2341w wVar = null;
            C2376a viewabilityChecker = adWebView != null ? adWebView.getViewabilityChecker() : null;
            if (adWebView != null) {
                wVar = adWebView.getTouchDataRecorder();
            }
            HashMap hashMap = new HashMap();
            if (viewabilityChecker != null) {
                viewabilityChecker.mo8779a((Map<String, String>) hashMap);
                hashMap.put("touch", C2323k.m9046a(wVar.mo8743e()));
            }
            this.f7123a.mo7699l(this.f7079d.mo7189c(), hashMap);
        }
        this.f7081f.mo8311f();
    }
}
