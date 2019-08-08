package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.BackButtonInterceptor;
import com.facebook.ads.internal.adapters.p072b.C1600k;
import com.facebook.ads.internal.adapters.p072b.C1601l;
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
import com.facebook.ads.internal.view.p101c.C1980d;
import com.facebook.ads.internal.view.p101c.C1981e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.l */
public class C2246l extends C2264o {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1600k f7069d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2376a f7070e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2341w f7071f = new C2341w();

    /* renamed from: g */
    private final C2377a f7072g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C2018l f7073h;

    /* renamed from: i */
    private boolean f7074i = false;

    public C2246l(Context context, C1600k kVar, C1802c cVar, C1911a aVar) {
        super(context, cVar, aVar);
        this.f7069d = kVar;
        this.f7072g = new C2377a() {
            /* renamed from: a */
            public void mo7108a() {
                if (!C2246l.this.f7071f.mo8740b()) {
                    C2246l.this.f7071f.mo8737a();
                    HashMap hashMap = new HashMap();
                    C2246l.this.f7070e.mo8779a((Map<String, String>) hashMap);
                    hashMap.put("touch", C2323k.m9046a(C2246l.this.f7071f.mo8743e()));
                    C2246l.this.mo8646a(hashMap);
                    C2246l.this.f7123a.mo7686a(C2246l.this.f7069d.mo7189c(), hashMap);
                    if (C2246l.this.getAudienceNetworkListener() != null) {
                        C2246l.this.getAudienceNetworkListener().mo6795a("com.facebook.ads.interstitial.impression.logged");
                    }
                }
            }
        };
        this.f7070e = new C2376a(this, 100, this.f7072g);
        this.f7070e.mo8778a(kVar.mo7192f());
    }

    private void setUpContent(int i) {
        C1601l lVar = (C1601l) this.f7069d.mo7190d().get(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ScaleType.CENTER);
        imageView.setAdjustViewBounds(true);
        C1980d a = new C1980d(imageView).mo8115a(lVar.mo7198c().mo7135i(), lVar.mo7198c().mo7134h());
        a.mo8116a((C1981e) new C1981e() {
            /* renamed from: a */
            public void mo6849a(boolean z) {
                if (z) {
                    C2246l.this.f7070e.mo8777a();
                }
            }
        });
        a.mo8118a(lVar.mo7198c().mo7133g());
        C2008a aVar = new C2008a(getContext(), this.f7123a, getAudienceNetworkListener(), this.f7069d, imageView, this.f7070e, this.f7071f);
        C2006e a2 = aVar.mo8191a(C2098i.f6694a).mo8195b(i).mo8194a();
        C2004c a3 = C2005d.m8222a(a2);
        this.f7073h = C2010g.m8254a(a2, C2342x.f7368a.heightPixels - a3.getExactMediaHeightIfAvailable(), C2342x.f7368a.widthPixels - a3.getExactMediaWidthIfAvailable(), this.f7074i);
        mo8645a(a3, this.f7073h, this.f7073h != null ? new C2291a() {
            /* renamed from: a */
            public void mo8634a() {
                C2246l.this.f7073h.mo8199b();
            }

            /* renamed from: b */
            public void mo8635b() {
                C2246l.this.f7073h.mo8196a();
            }
        } : null, a3.getExactMediaHeightIfAvailable(), C2342x.f7368a.widthPixels - a3.getExactMediaWidthIfAvailable(), a3.mo8144a(), i);
    }

    /* renamed from: a */
    public void mo7268a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        super.mo8644a(audienceNetworkActivity, this.f7069d);
        audienceNetworkActivity.addBackButtonInterceptor(new BackButtonInterceptor() {
            public boolean interceptBackButton() {
                return C2246l.this.f7073h != null && C2246l.this.f7073h.mo8200c();
            }
        });
        setUpContent(audienceNetworkActivity.getResources().getConfiguration().orientation);
    }

    /* renamed from: a */
    public void mo7270a(Bundle bundle) {
    }

    /* renamed from: a_ */
    public void mo7271a_(boolean z) {
        if (this.f7073h != null) {
            this.f7073h.mo8202e();
        }
    }

    /* renamed from: b */
    public void mo7272b(boolean z) {
        if (this.f7073h != null) {
            this.f7073h.mo8203f();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        removeAllViews();
        if (this.f7073h != null) {
            C2342x.m9091b(this.f7073h);
            this.f7074i = this.f7073h.mo8201d();
        }
        setUpContent(configuration.orientation);
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        if (this.f7069d != null && !TextUtils.isEmpty(this.f7069d.mo7189c())) {
            HashMap hashMap = new HashMap();
            this.f7070e.mo8779a((Map<String, String>) hashMap);
            hashMap.put("touch", C2323k.m9046a(this.f7071f.mo8743e()));
            this.f7123a.mo7699l(this.f7069d.mo7189c(), hashMap);
        }
        this.f7070e.mo8782c();
        if (this.f7073h != null) {
            this.f7073h.mo8204g();
        }
        super.onDestroy();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f7071f.mo8738a(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
