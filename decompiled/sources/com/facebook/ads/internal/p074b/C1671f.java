package com.facebook.ads.internal.p074b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.C1628g;
import com.facebook.ads.internal.adapters.InterstitialAdapterListener;
import com.facebook.ads.internal.p086m.C1762a;
import com.facebook.ads.internal.p086m.C1764c;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.C1782a;
import com.facebook.ads.internal.protocol.C1783b;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.b.f */
public class C1671f extends C1663c {
    public C1671f(Context context, C1659a aVar) {
        super(context, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7370a() {
        ((C1628g) this.f5221f).mo7267a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7371a(AdAdapter adAdapter, C1764c cVar, C1762a aVar, Map<String, Object> map) {
        final C1628g gVar = (C1628g) adAdapter;
        final C16721 r8 = new Runnable() {
            public void run() {
                C1671f.this.mo7374a((AdAdapter) gVar);
                if (C1795a.m7437ac(C1671f.this.f5217b)) {
                    C1671f.this.f5220e = null;
                    C1671f.this.f5218c.mo6778a(new C1782a(AdErrorType.INTERSTITIAL_AD_TIMEOUT, ""));
                    return;
                }
                C1671f.this.mo7385i();
            }
        };
        mo7386j().postDelayed(r8, (long) cVar.mo7596a().mo7614j());
        gVar.mo7266a(this.f5217b, new InterstitialAdapterListener() {
            public void onInterstitialActivityDestroyed() {
                C1671f.this.f5218c.mo7099f();
            }

            public void onInterstitialAdClicked(C1628g gVar, String str, boolean z) {
                C1671f.this.f5218c.mo6775a();
                boolean z2 = !TextUtils.isEmpty(str);
                if (z && z2) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    if (!(C1671f.this.f5217b instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    intent.setData(Uri.parse(str));
                    C1671f.this.f5217b.startActivity(intent);
                }
            }

            public void onInterstitialAdDismissed(C1628g gVar) {
                C1671f.this.f5218c.mo7097d();
            }

            public void onInterstitialAdDisplayed(C1628g gVar) {
                C1671f.this.f5218c.mo7098e();
            }

            public void onInterstitialAdLoaded(C1628g gVar) {
                if (gVar == C1671f.this.f5220e) {
                    if (gVar == null) {
                        C2370a.m9149b(C1671f.this.f5217b, "api", C2373b.f7500b, new C1783b(AdErrorType.NO_ADAPTER_ON_LOAD, "Adapter is null on loadInterstitialAd"));
                        onInterstitialError(gVar, AdError.internalError(AdError.INTERNAL_ERROR_2004));
                        return;
                    }
                    C1671f.this.mo7386j().removeCallbacks(r8);
                    C1671f.this.f5221f = gVar;
                    C1671f.this.f5218c.mo6777a((AdAdapter) gVar);
                }
            }

            public void onInterstitialError(C1628g gVar, AdError adError) {
                if (gVar == C1671f.this.f5220e) {
                    C1671f.this.mo7386j().removeCallbacks(r8);
                    C1671f.this.mo7374a((AdAdapter) gVar);
                    if (!C1795a.m7437ac(C1671f.this.f5217b)) {
                        C1671f.this.mo7385i();
                    }
                    C1671f.this.f5218c.mo6778a(new C1782a(adError.getErrorCode(), adError.getErrorMessage()));
                }
            }

            public void onInterstitialLoggingImpression(C1628g gVar) {
                C1671f.this.f5218c.mo6779b();
            }
        }, map, this.f5222g, this.f5223h.f5201d, this.f5223h.f5202e);
    }
}
