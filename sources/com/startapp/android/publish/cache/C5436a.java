package com.startapp.android.publish.cache;

import android.content.Context;
import com.appnext.base.p046b.C1245d;
import com.startapp.android.publish.ads.p167b.C5107e;
import com.startapp.android.publish.adsCommon.C5286Ad.AdType;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.android.publish.adsCommon.C5382g;
import com.startapp.android.publish.adsCommon.C5414k;
import com.startapp.android.publish.adsCommon.C5427m;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.StartAppAd.AdMode;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5377e;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.cache.C5450g.C5455b;
import com.startapp.android.publish.common.metaData.C5481d;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.common.C5554g;
import com.startapp.common.C5554g.C5558a;
import com.startapp.common.p193a.C5515e;
import com.startapp.common.p193a.C5518g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.startapp.android.publish.cache.a */
/* compiled from: StartAppSDK */
public class C5436a {

    /* renamed from: c */
    private static C5436a f17373c = new C5436a();

    /* renamed from: a */
    final Map<C5445c, C5450g> f17374a = new ConcurrentHashMap();

    /* renamed from: b */
    protected boolean f17375b = false;

    /* renamed from: d */
    private Map<String, String> f17376d = new WeakHashMap();

    /* renamed from: e */
    private boolean f17377e = false;

    /* renamed from: f */
    private Queue<C5443a> f17378f = new ConcurrentLinkedQueue();

    /* renamed from: g */
    private C5455b f17379g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Context f17380h;

    /* renamed from: com.startapp.android.publish.cache.a$a */
    /* compiled from: StartAppSDK */
    private class C5443a {

        /* renamed from: a */
        StartAppAd f17391a;

        /* renamed from: b */
        Placement f17392b;

        /* renamed from: c */
        AdPreferences f17393c;

        /* renamed from: d */
        AdEventListener f17394d;

        C5443a(StartAppAd startAppAd, Placement placement, AdPreferences adPreferences, AdEventListener adEventListener) {
            this.f17391a = startAppAd;
            this.f17392b = placement;
            this.f17393c = adPreferences;
            this.f17394d = adEventListener;
        }
    }

    private C5436a() {
    }

    /* renamed from: a */
    public static C5436a m23246a() {
        return f17373c;
    }

    /* renamed from: a */
    public C5445c mo20071a(Context context, StartAppAd startAppAd, AdPreferences adPreferences, AdEventListener adEventListener) {
        if (!m23253b(Placement.INAPP_SPLASH)) {
            return null;
        }
        C5518g.m23563a("AdCacheManager", 3, "Loading splash");
        return mo20069a(context, startAppAd, Placement.INAPP_SPLASH, adPreferences, adEventListener);
    }

    /* renamed from: a */
    public C5445c mo20072a(Context context, AdPreferences adPreferences) {
        if (!m23253b(Placement.INAPP_RETURN)) {
            return null;
        }
        C5518g.m23563a("AdCacheManager", 3, "Loading return ad");
        return mo20069a(context, (StartAppAd) null, Placement.INAPP_RETURN, adPreferences, (AdEventListener) null);
    }

    /* renamed from: a */
    public C5445c mo20068a(Context context, StartAppAd startAppAd, AdMode adMode, AdPreferences adPreferences, AdEventListener adEventListener) {
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        AdPreferences adPreferences2 = adPreferences;
        Placement b = m23252b(adMode, adPreferences2);
        m23248a(adMode, adPreferences2);
        return mo20070a(context, startAppAd, b, adPreferences2, adEventListener, false, 0);
    }

    /* renamed from: a */
    public void mo20077a(final Context context) {
        this.f17380h = context.getApplicationContext();
        if (m23255e()) {
            this.f17377e = true;
            C5457i.m23357a(context, (C5467c) new C5467c() {
                /* renamed from: a */
                public void mo20090a(List<C5466b> list) {
                    if (list != null) {
                        try {
                            for (C5466b bVar : list) {
                                if (C5436a.this.m23253b(bVar.placement)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Loading from disk: ");
                                    sb.append(bVar.placement);
                                    C5518g.m23563a("AdCacheManager", 4, sb.toString());
                                    C5436a.this.mo20070a(context, null, bVar.mo20146a(), bVar.mo20148b(), null, true, bVar.mo20149c());
                                }
                            }
                        } catch (Exception e) {
                            C5518g.m23564a("AdCacheManager", 6, "loadFromDisk - onCacheKeysLoaded failed", e);
                        }
                    }
                    C5436a.this.mo20089d(context);
                }
            });
        }
    }

    /* renamed from: b */
    public void mo20082b() {
        if (!this.f17377e) {
            synchronized (this.f17374a) {
                for (C5450g d : this.f17374a.values()) {
                    d.mo20122d();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo20078a(Context context, boolean z) {
        m23254e(context);
        m23250a(z);
    }

    /* renamed from: b */
    public void mo20083b(Context context) {
        this.f17375b = true;
        C5457i.m23359a(context, (C5469e) new C5469e() {
            /* renamed from: a */
            public void mo20091a() {
                C5436a.this.f17375b = false;
            }
        });
    }

    /* renamed from: c */
    public void mo20087c(final Context context) {
        C54393 r0 = new C5481d() {
            /* renamed from: a */
            public void mo19192a(boolean z) {
                StringBuilder sb = new StringBuilder();
                sb.append("preCacheAds: ");
                sb.append(z);
                C5518g.m23563a("AdCacheManager", 3, sb.toString());
                if (z) {
                    Set autoLoad = C5446d.m23293a().mo20103b().getAutoLoad();
                    if (autoLoad != null) {
                        for (AdMode adMode : C5436a.this.mo20076a(autoLoad)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("preCacheAds load ");
                            sb2.append(adMode.name());
                            C5518g.m23563a("preCache", 3, sb2.toString());
                            int b = C5344b.m22784a().mo19764b();
                            if (adMode == AdMode.FULLPAGE) {
                                if (b > 0) {
                                    C5436a.this.mo20068a(context, (StartAppAd) null, AdMode.FULLPAGE, new AdPreferences(), (AdEventListener) null);
                                }
                            } else if (adMode != AdMode.OFFERWALL) {
                                C5436a.this.mo20068a(context, (StartAppAd) null, adMode, new AdPreferences(), (AdEventListener) null);
                            } else if (b < 100) {
                                C5436a.this.mo20068a(context, (StartAppAd) null, AdMode.OFFERWALL, new AdPreferences(), (AdEventListener) null);
                            }
                            String a = C5436a.this.mo20073a(adMode);
                            if (a != null) {
                                C5414k.m23101b(context, a, Integer.valueOf(C5414k.m23094a(context, a, Integer.valueOf(0)).intValue() + 1));
                            }
                        }
                    }
                }
            }

            /* renamed from: a */
            public void mo19191a() {
                C5518g.m23563a("AdCacheManager", 3, "Failed loading metadata, unable to pre-cache.");
            }
        };
        synchronized (MetaData.getLock()) {
            MetaData.getInstance().addMetaDataListener(r0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Set<AdMode> mo20076a(Set<AdMode> set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AdMode adMode = (AdMode) it.next();
            boolean z = false;
            if (C5414k.m23094a(this.f17380h, mo20073a(adMode), Integer.valueOf(0)).intValue() >= MetaData.getInstance().getStopAutoLoadPreCacheAmount()) {
                z = true;
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("preCacheAds.remove ");
                sb.append(adMode.name());
                C5518g.m23563a("preCache", 3, sb.toString());
                it.remove();
            }
        }
        if (!C5307i.m22674a(128) && !C5307i.m22674a(64)) {
            set.remove(AdMode.OFFERWALL);
        }
        if (!C5307i.m22674a(2) && !C5307i.m22674a(4)) {
            set.remove(AdMode.FULLPAGE);
        }
        if (!C5307i.m22674a(4)) {
            set.remove(AdMode.REWARDED_VIDEO);
            set.remove(AdMode.VIDEO);
        }
        return set;
    }

    /* renamed from: c */
    public int mo20084c() {
        return this.f17374a.size();
    }

    /* renamed from: a */
    public C5382g mo20067a(C5445c cVar) {
        if (cVar == null) {
            C5518g.m23563a("AdCacheManager", 3, "Cache key is null");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Retrieving ad with ");
        sb.append(cVar);
        C5518g.m23563a("AdCacheManager", 3, sb.toString());
        C5450g gVar = (C5450g) this.f17374a.get(cVar);
        if (gVar != null) {
            return gVar.mo20127i();
        }
        return null;
    }

    /* renamed from: b */
    public C5382g mo20080b(C5445c cVar) {
        C5450g gVar = cVar != null ? (C5450g) this.f17374a.get(cVar) : null;
        if (gVar != null) {
            return gVar.mo20119b();
        }
        return null;
    }

    /* renamed from: d */
    public synchronized List<C5450g> mo20088d() {
        return new ArrayList(this.f17374a.values());
    }

    /* renamed from: a */
    public String mo20074a(String str) {
        return mo20075a(str, UUID.randomUUID().toString());
    }

    /* renamed from: a */
    public String mo20075a(String str, String str2) {
        this.f17376d.put(str2, str);
        return str2;
    }

    /* renamed from: b */
    public String mo20081b(String str) {
        return (String) this.f17376d.get(str);
    }

    /* renamed from: c */
    public String mo20086c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("cache size: ");
        sb.append(this.f17376d.size());
        sb.append(" - removing ");
        sb.append(str);
        C5518g.m23563a("AdCacheManager", 3, sb.toString());
        return (String) this.f17376d.remove(str);
    }

    /* renamed from: e */
    private boolean m23255e() {
        return !this.f17375b && C5446d.m23293a().mo20103b().isLocalCache();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo20089d(Context context) {
        this.f17377e = false;
        for (C5443a aVar : this.f17378f) {
            if (m23253b(aVar.f17392b)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Loading pending request for: ");
                sb.append(aVar.f17392b);
                C5518g.m23563a("AdCacheManager", 4, sb.toString());
                mo20069a(context, aVar.f17391a, aVar.f17392b, aVar.f17393c, aVar.f17394d);
            }
        }
        this.f17378f.clear();
    }

    /* renamed from: e */
    private void m23254e(final Context context) {
        C5518g.m23563a("AdCacheManager", 3, "Saving to disk: eneter save to disk ");
        if (m23255e()) {
            C5518g.m23563a("AdCacheManager", 3, "Saving to disk: cache to disk is enebaled ");
            C5554g.m23702a(C5558a.DEFAULT, (Runnable) new Runnable() {
                public void run() {
                    try {
                        C5515e.m23545a(context, C5457i.m23365b());
                        C5515e.m23545a(context, C5457i.m23366c());
                        C5445c cVar = null;
                        for (Entry entry : C5436a.this.f17374a.entrySet()) {
                            C5445c cVar2 = (C5445c) entry.getKey();
                            if (cVar2.mo20099a() == Placement.INAPP_SPLASH) {
                                cVar = cVar2;
                            } else {
                                C5450g gVar = (C5450g) entry.getValue();
                                StringBuilder sb = new StringBuilder();
                                sb.append("Saving to disk: ");
                                sb.append(cVar2.toString());
                                C5518g.m23563a("AdCacheManager", 3, sb.toString());
                                C5457i.m23360a(context, cVar2.mo20099a(), gVar.mo20112a(), C5436a.this.mo20085c(cVar2), gVar.mo20130l());
                                C5457i.m23356a(context, gVar, C5436a.this.mo20085c(cVar2));
                            }
                        }
                        if (cVar != null) {
                            C5436a.this.f17374a.remove(cVar);
                        }
                    } catch (Exception e) {
                        C5518g.m23563a("AdCacheManager", 3, "Saving to disk: exception caught");
                        C5378f.m23016a(context, C5376d.EXCEPTION, "AdCacheManager.saveToDisk - Unexpected Thread Exception", e.getMessage(), "");
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo20085c(C5445c cVar) {
        return String.valueOf(cVar.hashCode()).replace('-', '_');
    }

    /* renamed from: a */
    private void m23250a(boolean z) {
        for (C5450g gVar : this.f17374a.values()) {
            if (gVar.mo20119b() == null || !C5307i.m22674a(2) || !(gVar.mo20119b() instanceof C5107e) || z) {
                gVar.mo20124f();
            } else if (!C5446d.m23293a().mo20103b().shouldReturnAdLoadInBg()) {
                gVar.mo20124f();
            }
            gVar.mo20123e();
        }
    }

    /* renamed from: a */
    public C5445c mo20069a(Context context, StartAppAd startAppAd, Placement placement, AdPreferences adPreferences, AdEventListener adEventListener) {
        return mo20070a(context, startAppAd, placement, adPreferences, adEventListener, false, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5445c mo20070a(Context context, StartAppAd startAppAd, Placement placement, AdPreferences adPreferences, AdEventListener adEventListener, boolean z, int i) {
        C5450g gVar;
        this.f17380h = context.getApplicationContext();
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        AdPreferences adPreferences2 = adPreferences;
        C5445c cVar = new C5445c(placement, adPreferences2);
        if (!this.f17377e || z) {
            AdPreferences adPreferences3 = new AdPreferences(adPreferences2);
            synchronized (this.f17374a) {
                gVar = (C5450g) this.f17374a.get(cVar);
                if (gVar == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CachedAd for ");
                    sb.append(placement);
                    sb.append(" not found. Adding new CachedAd with ");
                    sb.append(cVar);
                    C5518g.m23563a("AdCacheManager", 3, sb.toString());
                    if (C54426.f17389a[placement.ordinal()] != 1) {
                        gVar = new C5450g(context, placement, adPreferences3);
                    } else {
                        gVar = new C5450g(context, placement, adPreferences3, false);
                    }
                    gVar.mo20115a(m23256f());
                    if (z) {
                        gVar.mo20117a(mo20085c(cVar));
                        gVar.mo20118a(true);
                        gVar.mo20113a(i);
                    }
                    m23249a(cVar, gVar, context);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CachedAd for ");
                    sb2.append(placement);
                    sb2.append(" already exists.");
                    C5518g.m23563a("AdCacheManager", 3, sb2.toString());
                    gVar.mo20116a(adPreferences3);
                }
            }
            gVar.mo20114a(startAppAd, adEventListener);
            return cVar;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Adding to pending queue: ");
        sb3.append(placement);
        C5518g.m23563a("AdCacheManager", 4, sb3.toString());
        Queue<C5443a> queue = this.f17378f;
        C5443a aVar = new C5443a(startAppAd, placement, adPreferences2, adEventListener);
        queue.add(aVar);
        return cVar;
    }

    /* renamed from: a */
    public void mo20079a(Placement placement) {
        synchronized (this.f17374a) {
            Iterator it = this.f17374a.entrySet().iterator();
            while (it.hasNext()) {
                if (((C5445c) ((Entry) it.next()).getKey()).mo20099a() == placement) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    private void m23249a(C5445c cVar, C5450g gVar, Context context) {
        synchronized (this.f17374a) {
            int maxCacheSize = C5446d.m23293a().mo20103b().getMaxCacheSize();
            if (maxCacheSize != 0 && mo20084c() >= maxCacheSize) {
                long j = Long.MAX_VALUE;
                Object obj = null;
                for (C5445c cVar2 : this.f17374a.keySet()) {
                    C5450g gVar2 = (C5450g) this.f17374a.get(cVar2);
                    if (gVar2.mo20121c() == gVar.mo20121c() && gVar2.f17408c < j) {
                        j = gVar2.f17408c;
                        obj = cVar2;
                    }
                }
                if (obj != null) {
                    this.f17374a.remove(obj);
                }
            }
            this.f17374a.put(cVar, gVar);
            if (Math.random() * 100.0d < ((double) C5446d.m23293a().mo20104c())) {
                C5378f.m23018a(context, new C5377e(C5376d.GENERAL, "Cache Size", String.valueOf(mo20084c())), "");
            }
        }
    }

    /* renamed from: a */
    private void m23248a(AdMode adMode, AdPreferences adPreferences) {
        if (adMode.equals(AdMode.REWARDED_VIDEO)) {
            C5349c.m22865a(adPreferences, C1245d.f3961jd, AdType.REWARDED_VIDEO);
        }
        if (adMode.equals(AdMode.VIDEO)) {
            C5349c.m22865a(adPreferences, C1245d.f3961jd, AdType.VIDEO);
        }
    }

    /* renamed from: b */
    private Placement m23252b(AdMode adMode, AdPreferences adPreferences) {
        boolean z = false;
        switch (adMode) {
            case OFFERWALL:
                if (C5307i.m22674a(128) || C5307i.m22674a(64)) {
                    z = true;
                }
                return z ? Placement.INAPP_OFFER_WALL : Placement.INAPP_FULL_SCREEN;
            case OVERLAY:
            case FULLPAGE:
            case VIDEO:
            case REWARDED_VIDEO:
                return Placement.INAPP_OVERLAY;
            case AUTOMATIC:
                if (C5307i.m22674a(128) || C5307i.m22674a(64)) {
                    z = true;
                }
                boolean a = C5307i.m22674a(4);
                boolean a2 = C5307i.m22674a(2);
                if (a && a2 && z) {
                    if (new Random().nextInt(100) < C5344b.m22784a().mo19764b()) {
                        return m23247a(adPreferences);
                    }
                    return Placement.INAPP_FULL_SCREEN;
                } else if (a || a2) {
                    return Placement.INAPP_OVERLAY;
                } else {
                    if (z) {
                        return Placement.INAPP_OFFER_WALL;
                    }
                }
                break;
        }
        return Placement.INAPP_FULL_SCREEN;
    }

    /* renamed from: a */
    private Placement m23247a(AdPreferences adPreferences) {
        if ((new Random().nextInt(100) < C5344b.m22784a().mo19765c() || C5307i.m22677a(adPreferences, "forceFullpage")) && !C5307i.m22677a(adPreferences, "forceOverlay")) {
            return Placement.INAPP_FULL_SCREEN;
        }
        return Placement.INAPP_OVERLAY;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m23253b(Placement placement) {
        boolean z = false;
        switch (placement) {
            case INAPP_SPLASH:
                if (C5427m.m23145a().mo20018k() && !C5344b.m22784a().mo19790z()) {
                    z = true;
                }
                return z;
            case INAPP_RETURN:
                if (C5427m.m23145a().mo20015h() && !C5344b.m22784a().mo19789y()) {
                    z = true;
                }
                return z;
            default:
                return true;
        }
    }

    /* renamed from: f */
    private C5455b m23256f() {
        if (this.f17379g == null) {
            this.f17379g = new C5455b() {
                /* renamed from: a */
                public void mo20093a(C5450g gVar) {
                    synchronized (C5436a.this.f17374a) {
                        C5445c cVar = null;
                        for (C5445c cVar2 : C5436a.this.f17374a.keySet()) {
                            if (((C5450g) C5436a.this.f17374a.get(cVar2)) == gVar) {
                                cVar = cVar2;
                            }
                        }
                        if (cVar != null) {
                            C5436a.this.f17374a.remove(cVar);
                            if (gVar.mo20121c() != Placement.INAPP_SPLASH) {
                                C5378f.m23016a(C5436a.this.f17380h, C5376d.STOP_RELOAD_IN_CACHE, "", cVar.toString(), "");
                            }
                        }
                    }
                }
            };
        }
        return this.f17379g;
    }

    /* renamed from: a */
    public String mo20073a(AdMode adMode) {
        if (adMode == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("autoLoadNotShownAdPrefix");
        sb.append(adMode.name());
        return sb.toString();
    }
}
