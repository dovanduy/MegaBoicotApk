package com.facebook.ads.internal.p075c;

import android.util.Log;
import android.view.View;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.C1577a;
import com.facebook.ads.internal.p074b.C1659a;
import com.facebook.ads.internal.p074b.C1671f;
import com.facebook.ads.internal.p075c.p076a.C1683b;
import com.facebook.ads.internal.p075c.p076a.C1684c;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1782a;
import com.facebook.ads.internal.protocol.C1783b;
import com.facebook.ads.internal.protocol.C1786d;
import com.facebook.ads.internal.protocol.C1788f;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.internal.c.d */
public class C1689d implements C1688c {

    /* renamed from: a */
    private static final String f5276a = "d";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1671f f5277b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f5278c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f5279d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1698g f5280e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final InterstitialAdExtendedListener f5281f;

    public C1689d(C1698g gVar, C1684c cVar, String str) {
        this.f5280e = gVar;
        this.f5281f = new C1683b(str, cVar, this);
    }

    /* renamed from: a */
    public void mo7406a() {
        if (this.f5277b != null) {
            this.f5277b.mo7375a((C1577a) new C1577a() {
            });
            this.f5277b.mo7376a(true);
            this.f5277b = null;
            this.f5278c = false;
            this.f5279d = false;
        }
    }

    /* renamed from: a */
    public void mo7407a(EnumSet<CacheFlag> enumSet, String str) {
        if (!this.f5278c && this.f5277b != null) {
            Log.w(f5276a, "An ad load is already in progress. You should wait for adLoaded() to be called");
        }
        this.f5278c = false;
        if (this.f5279d) {
            C2370a.m9149b(this.f5280e.f5295a, "api", C2373b.f7504f, new C1783b(AdErrorType.NO_ADAPTER_ON_LOAD, "Interstitial load called while showing interstitial."));
            this.f5281f.onError(this.f5280e.mo7422a(), new AdError(AdErrorType.LOAD_CALLED_WHILE_SHOWING_AD.getErrorCode(), AdErrorType.LOAD_CALLED_WHILE_SHOWING_AD.getDefaultErrorMessage()));
            return;
        }
        if (this.f5277b != null) {
            this.f5277b.mo7375a((C1577a) new C1577a() {
            });
            this.f5277b.mo7382f();
            this.f5277b = null;
        }
        C1659a aVar = new C1659a(this.f5280e.f5296b, C1788f.m7393a(this.f5280e.f5295a.getResources().getDisplayMetrics()), AdPlacementType.INTERSTITIAL, C1786d.INTERSTITIAL, 1, enumSet);
        aVar.mo7368a(this.f5280e.f5298d);
        this.f5277b = new C1671f(this.f5280e.f5295a, aVar);
        this.f5277b.mo7375a((C1577a) new C1577a() {
            /* renamed from: a */
            public void mo6775a() {
                C1689d.this.f5281f.onAdClicked(C1689d.this.f5280e.mo7422a());
            }

            /* renamed from: a */
            public void mo6776a(View view) {
            }

            /* renamed from: a */
            public void mo6777a(AdAdapter adAdapter) {
                C1689d.this.f5278c = true;
                C1689d.this.f5281f.onAdLoaded(C1689d.this.f5280e.mo7422a());
            }

            /* renamed from: a */
            public void mo6778a(C1782a aVar) {
                C1689d.this.f5281f.onError(C1689d.this.f5280e.mo7422a(), AdError.getAdErrorFromWrapper(aVar));
            }

            /* renamed from: b */
            public void mo6779b() {
                C1689d.this.f5281f.onLoggingImpression(C1689d.this.f5280e.mo7422a());
            }

            /* renamed from: d */
            public void mo7097d() {
                C1689d.this.f5279d = false;
                if (C1689d.this.f5277b != null) {
                    C1689d.this.f5277b.mo7375a((C1577a) new C1577a() {
                    });
                    C1689d.this.f5277b.mo7382f();
                    C1689d.this.f5277b = null;
                }
                C1689d.this.f5281f.onInterstitialDismissed(C1689d.this.f5280e.mo7422a());
            }

            /* renamed from: e */
            public void mo7098e() {
                C1689d.this.f5281f.onInterstitialDisplayed(C1689d.this.f5280e.mo7422a());
            }

            /* renamed from: f */
            public void mo7099f() {
                C1689d.this.f5279d = false;
                C1689d.this.f5281f.onInterstitialActivityDestroyed();
            }
        });
        this.f5277b.mo7378b(str);
    }

    /* renamed from: b */
    public long mo7408b() {
        if (this.f5277b != null) {
            return this.f5277b.mo7384h();
        }
        return -1;
    }

    /* renamed from: c */
    public boolean mo7409c() {
        return this.f5277b == null || this.f5277b.mo7383g();
    }

    /* renamed from: d */
    public boolean mo7410d() {
        return this.f5278c;
    }

    /* renamed from: e */
    public boolean mo7411e() {
        if (this.f5278c) {
            if (this.f5277b == null) {
                C2370a.m9149b(this.f5280e.f5295a, "api", C2373b.f7505g, new C1783b(AdErrorType.INTERSTITIAL_CONTROLLER_IS_NULL, AdErrorType.INTERSTITIAL_CONTROLLER_IS_NULL.getDefaultErrorMessage()));
            } else {
                this.f5277b.mo7381e();
                this.f5279d = true;
                this.f5278c = false;
                return true;
            }
        }
        this.f5281f.onError(this.f5280e.mo7422a(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
        return false;
    }
}
