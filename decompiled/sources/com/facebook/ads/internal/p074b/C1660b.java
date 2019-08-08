package com.facebook.ads.internal.p074b;

import android.content.Context;
import android.view.View;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.BannerAdapterListener;
import com.facebook.ads.internal.adapters.C1618e;
import com.facebook.ads.internal.p086m.C1762a;
import com.facebook.ads.internal.p086m.C1764c;
import com.facebook.ads.internal.protocol.C1782a;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.b.b */
public class C1660b extends C1663c {
    public C1660b(Context context, C1659a aVar) {
        super(context, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7370a() {
        if (this.f5219d != null) {
            this.f5218c.mo6776a(this.f5219d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7371a(AdAdapter adAdapter, C1764c cVar, C1762a aVar, Map<String, Object> map) {
        final C1618e eVar = (C1618e) adAdapter;
        final C16611 r7 = new Runnable() {
            public void run() {
                C1660b.this.mo7374a((AdAdapter) eVar);
                C1660b.this.mo7385i();
            }
        };
        mo7386j().postDelayed(r7, (long) cVar.mo7596a().mo7614j());
        eVar.mo7247a(this.f5217b, this.f5222g, this.f5223h.f5200c, new BannerAdapterListener() {
            public void onBannerAdClicked(C1618e eVar) {
                C1660b.this.f5218c.mo6775a();
            }

            public void onBannerAdLoaded(C1618e eVar, View view) {
                if (eVar == C1660b.this.f5220e) {
                    C1660b.this.mo7386j().removeCallbacks(r7);
                    AdAdapter adAdapter = C1660b.this.f5221f;
                    C1660b.this.f5221f = eVar;
                    C1660b.this.f5219d = view;
                    if (!C1660b.this.f5216a) {
                        C1660b.this.f5218c.mo6777a((AdAdapter) eVar);
                        return;
                    }
                    C1660b.this.f5218c.mo6776a(view);
                    C1660b.this.mo7374a(adAdapter);
                }
            }

            public void onBannerError(C1618e eVar, AdError adError) {
                if (eVar == C1660b.this.f5220e) {
                    C1660b.this.mo7386j().removeCallbacks(r7);
                    C1660b.this.mo7374a((AdAdapter) eVar);
                    C1660b.this.mo7385i();
                }
            }

            public void onBannerLoggingImpression(C1618e eVar) {
                C1660b.this.f5218c.mo6779b();
            }
        }, map);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7372a(String str) {
        C1782a a = C1669e.m6979a(this.f5217b, Integer.valueOf(0));
        if (a != null) {
            mo7048a(a);
        } else {
            super.mo7372a(str);
        }
    }
}
