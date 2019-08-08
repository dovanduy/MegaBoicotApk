package com.facebook.ads.internal.p075c;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardData;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.C1577a;
import com.facebook.ads.internal.adapters.C1655s;
import com.facebook.ads.internal.p074b.C1659a;
import com.facebook.ads.internal.p074b.C1677h;
import com.facebook.ads.internal.p075c.p076a.C1684c;
import com.facebook.ads.internal.p075c.p076a.C1685d;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1782a;
import com.facebook.ads.internal.protocol.C1786d;
import com.facebook.ads.internal.protocol.C1787e;

/* renamed from: com.facebook.ads.internal.c.e */
public class C1694e implements C1688c {

    /* renamed from: a */
    private static final String f5286a = "e";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1702j f5287b;

    /* renamed from: c */
    private C1677h f5288c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f5289d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final S2SRewardedVideoAdExtendedListener f5290e;

    public C1694e(C1702j jVar, C1684c cVar, String str) {
        this.f5287b = jVar;
        this.f5290e = new C1685d(str, cVar, this, jVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7041a(boolean z) {
        if (this.f5288c != null) {
            this.f5288c.mo7375a((C1577a) new C1577a() {
            });
            this.f5288c.mo7376a(z);
            this.f5288c = null;
        }
    }

    /* renamed from: a */
    public void mo7406a() {
        m7041a(true);
    }

    /* renamed from: a */
    public void mo7412a(RewardData rewardData) {
        this.f5287b.f5318e = rewardData;
        if (this.f5289d) {
            this.f5288c.mo7392a(rewardData);
        }
    }

    /* renamed from: a */
    public void mo7413a(String str, boolean z) {
        try {
            if (!this.f5289d && this.f5288c != null) {
                Log.w(f5286a, "An ad load is already in progress. You should wait for adLoaded() to be called");
            }
            m7041a(false);
            this.f5289d = false;
            C1659a aVar = new C1659a(this.f5287b.f5315b, C1787e.REWARDED_VIDEO, AdPlacementType.REWARDED_VIDEO, C1786d.INTERSTITIAL, 1);
            aVar.mo7369a(z);
            aVar.mo7368a(this.f5287b.f5317d);
            this.f5288c = new C1677h(this.f5287b.f5314a, aVar);
            this.f5288c.mo7375a((C1577a) new C1577a() {
                /* renamed from: a */
                public void mo6775a() {
                    C1694e.this.f5290e.onAdClicked(C1694e.this.f5287b.mo7436a());
                }

                /* renamed from: a */
                public void mo6777a(AdAdapter adAdapter) {
                    C1655s sVar = (C1655s) adAdapter;
                    if (C1694e.this.f5287b.f5318e != null) {
                        sVar.mo7349a(C1694e.this.f5287b.f5318e);
                    }
                    C1694e.this.f5287b.f5321h = sVar.mo7316a();
                    C1694e.this.f5289d = true;
                    C1694e.this.f5290e.onAdLoaded(C1694e.this.f5287b.mo7436a());
                }

                /* renamed from: a */
                public void mo6778a(C1782a aVar) {
                    C1694e.this.m7041a(true);
                    C1694e.this.f5290e.onError(C1694e.this.f5287b.mo7436a(), AdError.getAdErrorFromWrapper(aVar));
                }

                /* renamed from: b */
                public void mo6779b() {
                    C1694e.this.f5290e.onLoggingImpression(C1694e.this.f5287b.mo7436a());
                }

                /* renamed from: g */
                public void mo7100g() {
                    C1694e.this.f5290e.onRewardedVideoCompleted();
                }

                /* renamed from: h */
                public void mo7101h() {
                    C1694e.this.f5290e.onRewardedVideoClosed();
                }

                /* renamed from: i */
                public void mo7102i() {
                    C1694e.this.f5290e.onRewardServerFailed();
                }

                /* renamed from: j */
                public void mo7103j() {
                    C1694e.this.f5290e.onRewardServerSuccess();
                }

                /* renamed from: k */
                public void mo7104k() {
                    C1694e.this.f5290e.onRewardedVideoActivityDestroyed();
                }
            });
            this.f5288c.mo7378b(str);
        } catch (Exception e) {
            Log.e(f5286a, "Error loading rewarded video ad", e);
            C2370a.m9149b(this.f5287b.f5314a, "api", C2373b.f7507i, e);
            this.f5290e.onError(this.f5287b.mo7436a(), AdError.internalError(AdError.INTERNAL_ERROR_2004));
        }
    }

    /* renamed from: a */
    public boolean mo7414a(int i) {
        if (!this.f5289d) {
            this.f5290e.onError(this.f5287b.mo7436a(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            return false;
        } else if (this.f5288c != null) {
            this.f5288c.f5223h.mo7366a(i);
            this.f5288c.mo7381e();
            this.f5289d = false;
            return true;
        } else {
            this.f5289d = false;
            return false;
        }
    }

    /* renamed from: b */
    public long mo7415b() {
        if (this.f5288c != null) {
            return this.f5288c.mo7384h();
        }
        return -1;
    }

    /* renamed from: c */
    public boolean mo7416c() {
        return this.f5288c == null || this.f5288c.mo7383g();
    }

    /* renamed from: d */
    public boolean mo7417d() {
        return this.f5289d;
    }
}
