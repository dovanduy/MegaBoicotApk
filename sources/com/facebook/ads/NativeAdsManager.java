package com.facebook.ads;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.ads.NativeAdBase.MediaCacheFlag;
import com.facebook.ads.internal.C1558a;
import com.facebook.ads.internal.C1558a.C1560a;
import com.facebook.ads.internal.adapters.C1637i;
import com.facebook.ads.internal.p081h.C1723a;
import com.facebook.ads.internal.p081h.C1724b;
import com.facebook.ads.internal.protocol.C1782a;
import com.facebook.ads.internal.protocol.C1787e;
import java.util.ArrayList;
import java.util.List;

public class NativeAdsManager {

    /* renamed from: a */
    private static final String f4751a = "NativeAdsManager";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f4752b;

    /* renamed from: c */
    private final String f4753c;

    /* renamed from: d */
    private final int f4754d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final List<NativeAd> f4755e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f4756f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Listener f4757g;

    /* renamed from: h */
    private String f4758h;

    /* renamed from: i */
    private C1558a f4759i;

    /* renamed from: j */
    private boolean f4760j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f4761k;

    public interface Listener {
        void onAdError(AdError adError);

        void onAdsLoaded();
    }

    public NativeAdsManager(Context context, String str, int i) {
        if (context == null) {
            throw new IllegalArgumentException("context can not be null");
        }
        this.f4752b = context;
        this.f4753c = str;
        this.f4754d = Math.max(i, 0);
        this.f4755e = new ArrayList(i);
        this.f4756f = -1;
        this.f4761k = false;
        this.f4760j = false;
        try {
            CookieManager.getInstance();
            if (VERSION.SDK_INT < 21) {
                CookieSyncManager.createInstance(context);
            }
        } catch (Exception e) {
            Log.w(f4751a, "Failed to initialize CookieManager.", e);
        }
    }

    public void disableAutoRefresh() {
        this.f4760j = true;
        if (this.f4759i != null) {
            this.f4759i.mo7052c();
        }
    }

    public int getUniqueNativeAdCount() {
        return this.f4755e.size();
    }

    public boolean isLoaded() {
        return this.f4761k;
    }

    public void loadAds() {
        loadAds(MediaCacheFlag.ALL);
    }

    public void loadAds(final MediaCacheFlag mediaCacheFlag) {
        C1787e eVar = C1787e.NATIVE_UNKNOWN;
        int i = this.f4754d;
        if (this.f4759i != null) {
            this.f4759i.mo7051b();
        }
        C1558a aVar = new C1558a(this.f4752b, this.f4753c, eVar, null, i);
        this.f4759i = aVar;
        if (this.f4760j) {
            this.f4759i.mo7052c();
        }
        this.f4759i.mo7050a(this.f4758h);
        this.f4759i.mo7047a((C1560a) new C1560a() {
            /* renamed from: a */
            public void mo7014a(C1782a aVar) {
                if (NativeAdsManager.this.f4757g != null) {
                    NativeAdsManager.this.f4757g.onAdError(AdError.getAdErrorFromWrapper(aVar));
                }
            }

            /* renamed from: a */
            public void mo7015a(final List<C1637i> list) {
                C1724b bVar = new C1724b(NativeAdsManager.this.f4752b);
                for (C1637i iVar : list) {
                    if (mediaCacheFlag.equals(MediaCacheFlag.ALL)) {
                        if (iVar.mo7300l() != null) {
                            bVar.mo7494a(iVar.mo7300l().mo7780a(), iVar.mo7300l().mo7782c(), iVar.mo7300l().mo7781b());
                        }
                        if (iVar.mo7301m() != null) {
                            bVar.mo7494a(iVar.mo7301m().mo7780a(), iVar.mo7301m().mo7782c(), iVar.mo7301m().mo7781b());
                        }
                        if (!TextUtils.isEmpty(iVar.mo7308t())) {
                            bVar.mo7493a(iVar.mo7308t());
                        }
                    }
                }
                bVar.mo7492a((C1723a) new C1723a() {
                    /* renamed from: c */
                    private void m6458c() {
                        NativeAdsManager.this.f4761k = true;
                        NativeAdsManager.this.f4755e.clear();
                        NativeAdsManager.this.f4756f = 0;
                        for (C1637i nativeAd : list) {
                            NativeAdsManager.this.f4755e.add(new NativeAd(NativeAdsManager.this.f4752b, nativeAd, null));
                        }
                        if (NativeAdsManager.this.f4757g != null) {
                            NativeAdsManager.this.f4757g.onAdsLoaded();
                        }
                    }

                    /* renamed from: a */
                    public void mo7016a() {
                        m6458c();
                    }

                    /* renamed from: b */
                    public void mo7017b() {
                        m6458c();
                    }
                });
            }
        });
        this.f4759i.mo7046a();
    }

    public NativeAd nextNativeAd() {
        if (this.f4755e.size() == 0) {
            return null;
        }
        int i = this.f4756f;
        this.f4756f = i + 1;
        NativeAd nativeAd = (NativeAd) this.f4755e.get(i % this.f4755e.size());
        return i >= this.f4755e.size() ? new NativeAd((NativeAdBase) nativeAd) : nativeAd;
    }

    public void setExtraHints(String str) {
        this.f4758h = str;
    }

    public void setListener(Listener listener) {
        this.f4757g = listener;
    }
}
