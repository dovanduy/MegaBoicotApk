package com.startapp.android.publish.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.android.publish.ads.list3d.C5168e;
import com.startapp.android.publish.ads.list3d.C5169f;
import com.startapp.android.publish.ads.p167b.C5105c;
import com.startapp.android.publish.ads.p168c.p170b.C5149b;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.C5364e;
import com.startapp.android.publish.adsCommon.C5382g;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.Utils.C5307i.C5312a;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.p178b.C5345a;
import com.startapp.android.publish.adsCommon.p178b.C5346b;
import com.startapp.android.publish.adsCommon.p178b.C5348c;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.common.C5554g;
import com.startapp.common.C5554g.C5558a;
import com.startapp.common.p193a.C5515e;
import com.startapp.common.p193a.C5518g;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.startapp.android.publish.cache.i */
/* compiled from: StartAppSDK */
public class C5457i {

    /* renamed from: com.startapp.android.publish.cache.i$a */
    /* compiled from: StartAppSDK */
    protected interface C5465a {
        /* renamed from: a */
        void mo20133a(C5382g gVar);
    }

    /* renamed from: com.startapp.android.publish.cache.i$b */
    /* compiled from: StartAppSDK */
    protected static class C5466b implements Serializable {
        private static final long serialVersionUID = 1;
        protected AdPreferences adPreferences;
        private int numberOfLoadedAd;
        protected Placement placement;

        protected C5466b(Placement placement2, AdPreferences adPreferences2) {
            this.placement = placement2;
            this.adPreferences = adPreferences2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Placement mo20146a() {
            return this.placement;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public AdPreferences mo20148b() {
            return this.adPreferences;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo20149c() {
            return this.numberOfLoadedAd;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo20147a(int i) {
            this.numberOfLoadedAd = i;
        }
    }

    /* renamed from: com.startapp.android.publish.cache.i$c */
    /* compiled from: StartAppSDK */
    protected interface C5467c {
        /* renamed from: a */
        void mo20090a(List<C5466b> list);
    }

    /* renamed from: com.startapp.android.publish.cache.i$d */
    /* compiled from: StartAppSDK */
    protected static class C5468d implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: ad */
        private C5382g f17443ad;
        private String html;

        protected C5468d(C5382g gVar) {
            m23375a(gVar);
            m23376c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C5382g mo20150a() {
            return this.f17443ad;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo20151b() {
            return this.html;
        }

        /* renamed from: a */
        private void m23375a(C5382g gVar) {
            this.f17443ad = gVar;
        }

        /* renamed from: c */
        private void m23376c() {
            if (this.f17443ad != null && (this.f17443ad instanceof C5364e)) {
                this.html = ((C5364e) this.f17443ad).mo19847f();
            }
        }
    }

    /* renamed from: com.startapp.android.publish.cache.i$e */
    /* compiled from: StartAppSDK */
    protected interface C5469e {
        /* renamed from: a */
        void mo20091a();
    }

    /* renamed from: a */
    protected static String m23352a() {
        return "startapp_ads";
    }

    /* renamed from: a */
    private static boolean m23364a(C5105c cVar) {
        return true;
    }

    /* renamed from: a */
    protected static void m23359a(final Context context, final C5469e eVar) {
        C5554g.m23702a(C5558a.DEFAULT, (Runnable) new Runnable() {
            public void run() {
                try {
                    C5515e.m23545a(context, C5457i.m23352a());
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public void run() {
                            eVar.mo20091a();
                        }
                    });
                } catch (Exception e) {
                    C5378f.m23016a(context, C5376d.EXCEPTION, " DiskAdCacheManager.deleteDiskCacheAsync - Unexpected Thread Exception", e.getMessage(), "");
                }
            }
        });
    }

    /* renamed from: a */
    protected static void m23360a(Context context, Placement placement, AdPreferences adPreferences, String str, int i) {
        C5466b bVar = new C5466b(placement, adPreferences);
        bVar.mo20147a(i);
        C5515e.m23556b(context, m23365b(), str, (Serializable) bVar);
    }

    /* renamed from: a */
    protected static void m23357a(final Context context, final C5467c cVar) {
        C5554g.m23702a(C5558a.HIGH, (Runnable) new Runnable() {
            public void run() {
                try {
                    final List b = C5515e.m23554b(context, C5457i.m23365b(), C5466b.class);
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public void run() {
                            cVar.mo20090a(b);
                        }
                    });
                } catch (Exception e) {
                    C5378f.m23016a(context, C5376d.EXCEPTION, " DiskAdCacheManager.loadCacheKeysAsync - Unexpected Thread Exception", e.getMessage(), "");
                }
            }
        });
    }

    /* renamed from: a */
    protected static void m23356a(Context context, C5450g gVar, String str) {
        C5515e.m23556b(context, m23366c(), str, (Serializable) new C5468d(gVar.mo20119b()));
    }

    /* renamed from: a */
    protected static void m23361a(final Context context, final String str, final C5465a aVar, final AdEventListener adEventListener) {
        C5554g.m23702a(C5558a.HIGH, (Runnable) new Runnable() {
            public void run() {
                try {
                    final C5468d dVar = (C5468d) C5515e.m23551b(context, C5457i.m23366c(), str, C5468d.class);
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public void run() {
                            try {
                                if (dVar == null) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("File not found or error: ");
                                    sb.append(str);
                                    C5518g.m23563a("DiskAdCacheManager", 4, sb.toString());
                                    adEventListener.onFailedToReceiveAd(null);
                                    return;
                                }
                                if (dVar.mo20150a() != null) {
                                    if (dVar.mo20150a().isReady()) {
                                        if (dVar.mo20150a().hasAdCacheTtlPassed()) {
                                            C5518g.m23563a("DiskAdCacheManager", 3, "Disk ad TTL has passed");
                                            adEventListener.onFailedToReceiveAd(null);
                                            return;
                                        }
                                        C5457i.m23358a(context, dVar, aVar, adEventListener);
                                        return;
                                    }
                                }
                                C5518g.m23563a("DiskAdCacheManager", 3, "Disk ad is not ready or null");
                                adEventListener.onFailedToReceiveAd(null);
                            } catch (Exception e) {
                                C5378f.m23016a(context, C5376d.EXCEPTION, "DiskAdCacheManager.loadCachedAdAsync - Unexpected Thread Exception", e.getMessage(), "");
                                adEventListener.onFailedToReceiveAd(null);
                            }
                        }
                    });
                } catch (Exception e) {
                    C5378f.m23016a(context, C5376d.EXCEPTION, "DiskAdCacheManager.loadCachedAdAsync - Unexpected Thread Exception", e.getMessage(), "");
                    adEventListener.onFailedToReceiveAd(null);
                }
            }
        });
    }

    /* renamed from: b */
    protected static String m23365b() {
        return m23352a().concat(File.separator).concat("keys");
    }

    /* renamed from: c */
    protected static String m23366c() {
        return m23352a().concat(File.separator).concat("interstitials");
    }

    /* renamed from: a */
    protected static void m23358a(Context context, C5468d dVar, C5465a aVar, AdEventListener adEventListener) {
        C5382g a = dVar.mo20150a();
        a.setContext(context);
        if (C5307i.m22674a(2) && (a instanceof C5105c)) {
            m23354a(context, (C5105c) a, dVar.mo20151b(), aVar, adEventListener);
        } else if (!C5307i.m22674a(64) || !(a instanceof C5149b)) {
            C5518g.m23563a("DiskAdCacheManager", 4, "Unsupported disk ad type");
            adEventListener.onFailedToReceiveAd(null);
        } else {
            m23355a(context, (C5149b) a, aVar, adEventListener);
        }
    }

    /* renamed from: a */
    private static void m23355a(Context context, C5149b bVar, C5465a aVar, AdEventListener adEventListener) {
        List d = bVar.mo19940d();
        if (d == null) {
            C5518g.m23563a("DiskAdCacheManager", 4, "No ad details");
            adEventListener.onFailedToReceiveAd(null);
            return;
        }
        if (C5344b.m22784a().mo19753E()) {
            d = C5348c.m22841a(context, d, 0, new HashSet());
        }
        if (d == null || d.size() <= 0) {
            C5518g.m23563a("DiskAdCacheManager", 4, "App presence - no interstitials to display");
            adEventListener.onFailedToReceiveAd(null);
            return;
        }
        aVar.mo20133a(bVar);
        m23362a(bVar, adEventListener, d);
    }

    /* renamed from: a */
    private static void m23354a(Context context, C5105c cVar, String str, C5465a aVar, AdEventListener adEventListener) {
        if (str == null || str.equals("")) {
            C5518g.m23563a("DiskAdCacheManager", 3, "Missing Html");
            adEventListener.onFailedToReceiveAd(null);
        } else if (!m23364a(cVar)) {
            C5518g.m23563a("DiskAdCacheManager", 3, "Missing video file");
            adEventListener.onFailedToReceiveAd(null);
        } else if (!m23363a(context, str)) {
            C5518g.m23563a("DiskAdCacheManager", 3, "App is present");
            adEventListener.onFailedToReceiveAd(null);
        } else {
            C5436a.m23246a().mo20075a(str, cVar.mo19848g());
            aVar.mo20133a(cVar);
            m23353a(context, cVar, str, adEventListener);
        }
    }

    /* renamed from: a */
    private static void m23353a(Context context, final C5105c cVar, String str, final AdEventListener adEventListener) {
        C5307i.m22665a(context, str, (C5312a) new C5312a() {
            /* renamed from: a */
            public void mo19638a() {
                adEventListener.onReceiveAd(cVar);
            }

            /* renamed from: a */
            public void mo19639a(String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("Html Cache failed: ");
                sb.append(str);
                C5518g.m23563a("DiskAdCacheManager", 3, sb.toString());
                adEventListener.onFailedToReceiveAd(cVar);
            }
        });
    }

    /* renamed from: a */
    private static void m23362a(C5149b bVar, AdEventListener adEventListener, List<AdDetails> list) {
        C5168e a = C5169f.m22203a().mo19078a(bVar.mo18894a());
        a.mo19068a();
        for (AdDetails a2 : list) {
            a.mo19071a(a2);
        }
        adEventListener.onReceiveAd(bVar);
    }

    /* renamed from: a */
    private static boolean m23363a(Context context, String str) {
        if (C5344b.m22784a().mo19753E()) {
            List a = C5348c.m22843a(str, 0);
            if (a != null) {
                ArrayList arrayList = new ArrayList();
                if (C5348c.m22840a(context, a, 0, (Set<String>) new HashSet<String>(), (List<C5345a>) arrayList).booleanValue()) {
                    new C5346b(context, arrayList).mo19799a();
                    return false;
                }
            }
        }
        return true;
    }
}
