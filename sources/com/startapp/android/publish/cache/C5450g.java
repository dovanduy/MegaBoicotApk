package com.startapp.android.publish.cache;

import android.app.Activity;
import android.content.Context;
import com.startapp.android.publish.ads.p167b.C5106d;
import com.startapp.android.publish.ads.p167b.C5107e;
import com.startapp.android.publish.ads.p168c.p169a.C5147b;
import com.startapp.android.publish.ads.p168c.p170b.C5149b;
import com.startapp.android.publish.ads.splash.C5184b;
import com.startapp.android.publish.ads.video.C5253e;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.C5313a;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.C5382g;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.adListeners.C5326b;
import com.startapp.android.publish.adsCommon.p178b.C5348c;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.common.p193a.C5518g;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.startapp.android.publish.cache.g */
/* compiled from: StartAppSDK */
public class C5450g {

    /* renamed from: h */
    public static boolean f17405h = false;

    /* renamed from: a */
    protected C5382g f17406a;

    /* renamed from: b */
    protected AtomicBoolean f17407b;

    /* renamed from: c */
    protected long f17408c;

    /* renamed from: d */
    protected C5449f f17409d;

    /* renamed from: e */
    protected C5444b f17410e;

    /* renamed from: f */
    protected Map<AdEventListener, List<StartAppAd>> f17411f;

    /* renamed from: g */
    protected C5455b f17412g;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Placement f17413i;

    /* renamed from: j */
    private Context f17414j;

    /* renamed from: k */
    private C5313a f17415k;

    /* renamed from: l */
    private AdPreferences f17416l;

    /* renamed from: m */
    private String f17417m;

    /* renamed from: n */
    private boolean f17418n;

    /* renamed from: o */
    private int f17419o;

    /* renamed from: p */
    private boolean f17420p;

    /* renamed from: com.startapp.android.publish.cache.g$a */
    /* compiled from: StartAppSDK */
    class C5454a implements AdEventListener {

        /* renamed from: b */
        private boolean f17426b = false;

        /* renamed from: c */
        private boolean f17427c = false;

        C5454a() {
        }

        public void onReceiveAd(C5286Ad ad) {
            boolean z = C5450g.this.f17406a != null && C5450g.this.f17406a.getVideoCancelCallBack();
            if (!this.f17426b && !z) {
                this.f17426b = true;
                synchronized (C5450g.this.f17411f) {
                    for (AdEventListener adEventListener : C5450g.this.f17411f.keySet()) {
                        if (adEventListener != null) {
                            List<StartAppAd> list = (List) C5450g.this.f17411f.get(adEventListener);
                            if (list != null) {
                                for (StartAppAd startAppAd : list) {
                                    startAppAd.setErrorMessage(ad.getErrorMessage());
                                    new C5326b(adEventListener).onReceiveAd(startAppAd);
                                }
                            }
                        }
                    }
                    C5450g.this.f17411f.clear();
                }
            }
            C5450g.this.f17409d.mo20107f();
            C5450g.this.f17410e.mo20094a();
            C5450g.this.f17407b.set(false);
        }

        public void onFailedToReceiveAd(C5286Ad ad) {
            ConcurrentHashMap concurrentHashMap;
            Map map = null;
            if (!this.f17427c) {
                synchronized (C5450g.this.f17411f) {
                    concurrentHashMap = new ConcurrentHashMap(C5450g.this.f17411f);
                    C5450g.this.f17406a = null;
                    C5450g.this.f17411f.clear();
                }
                map = concurrentHashMap;
            }
            if (map != null) {
                for (AdEventListener adEventListener : map.keySet()) {
                    if (adEventListener != null) {
                        List<StartAppAd> list = (List) map.get(adEventListener);
                        if (list != null) {
                            for (StartAppAd startAppAd : list) {
                                startAppAd.setErrorMessage(ad.getErrorMessage());
                                new C5326b(adEventListener).onFailedToReceiveAd(startAppAd);
                            }
                        }
                    }
                }
            }
            this.f17427c = true;
            C5450g.this.f17410e.mo20107f();
            C5450g.this.f17409d.mo20094a();
            C5450g.this.f17407b.set(false);
        }
    }

    /* renamed from: com.startapp.android.publish.cache.g$b */
    /* compiled from: StartAppSDK */
    public interface C5455b {
        /* renamed from: a */
        void mo20093a(C5450g gVar);
    }

    public C5450g(Context context, Placement placement, AdPreferences adPreferences) {
        this.f17406a = null;
        this.f17407b = new AtomicBoolean(false);
        this.f17417m = null;
        this.f17418n = false;
        this.f17409d = null;
        this.f17410e = null;
        this.f17411f = new ConcurrentHashMap();
        this.f17420p = true;
        this.f17413i = placement;
        this.f17416l = adPreferences;
        m23314a(context);
        m23316o();
    }

    public C5450g(Context context, Placement placement, AdPreferences adPreferences, boolean z) {
        this(context, placement, adPreferences);
        this.f17420p = z;
    }

    /* renamed from: a */
    private void m23314a(Context context) {
        if (context instanceof Activity) {
            this.f17414j = context.getApplicationContext();
            this.f17415k = new C5313a((Activity) context);
            return;
        }
        this.f17414j = context;
        this.f17415k = null;
    }

    /* renamed from: o */
    private void m23316o() {
        this.f17409d = new C5449f(this);
        this.f17410e = new C5444b(this);
    }

    /* renamed from: a */
    public AdPreferences mo20112a() {
        return this.f17416l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20116a(AdPreferences adPreferences) {
        this.f17416l = adPreferences;
    }

    /* renamed from: b */
    public C5382g mo20119b() {
        return this.f17406a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Placement mo20121c() {
        return this.f17413i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20117a(String str) {
        this.f17417m = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20118a(boolean z) {
        this.f17418n = z;
    }

    /* renamed from: a */
    public void mo20114a(StartAppAd startAppAd, AdEventListener adEventListener) {
        m23315a(startAppAd, adEventListener, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20120b(boolean z) {
        m23315a(null, null, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m23315a(com.startapp.android.publish.adsCommon.StartAppAd r6, com.startapp.android.publish.adsCommon.adListeners.AdEventListener r7, boolean r8) {
        /*
            r5 = this;
            java.util.Map<com.startapp.android.publish.adsCommon.adListeners.AdEventListener, java.util.List<com.startapp.android.publish.adsCommon.StartAppAd>> r0 = r5.f17411f
            monitor-enter(r0)
            boolean r1 = r5.mo20125g()     // Catch:{ all -> 0x008b }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0016
            boolean r1 = r5.m23322u()     // Catch:{ all -> 0x008b }
            if (r1 != 0) goto L_0x0016
            if (r8 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r8 = r3
            goto L_0x0017
        L_0x0016:
            r8 = r2
        L_0x0017:
            r1 = 3
            if (r8 == 0) goto L_0x0065
            if (r6 == 0) goto L_0x0035
            if (r7 == 0) goto L_0x0035
            java.util.Map<com.startapp.android.publish.adsCommon.adListeners.AdEventListener, java.util.List<com.startapp.android.publish.adsCommon.StartAppAd>> r8 = r5.f17411f     // Catch:{ all -> 0x008b }
            java.lang.Object r8 = r8.get(r7)     // Catch:{ all -> 0x008b }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x008b }
            if (r8 != 0) goto L_0x0032
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x008b }
            r8.<init>()     // Catch:{ all -> 0x008b }
            java.util.Map<com.startapp.android.publish.adsCommon.adListeners.AdEventListener, java.util.List<com.startapp.android.publish.adsCommon.StartAppAd>> r4 = r5.f17411f     // Catch:{ all -> 0x008b }
            r4.put(r7, r8)     // Catch:{ all -> 0x008b }
        L_0x0032:
            r8.add(r6)     // Catch:{ all -> 0x008b }
        L_0x0035:
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f17407b     // Catch:{ all -> 0x008b }
            boolean r6 = r6.compareAndSet(r3, r2)     // Catch:{ all -> 0x008b }
            if (r6 == 0) goto L_0x004b
            com.startapp.android.publish.cache.f r6 = r5.f17409d     // Catch:{ all -> 0x008b }
            r6.mo20108g()     // Catch:{ all -> 0x008b }
            com.startapp.android.publish.cache.b r6 = r5.f17410e     // Catch:{ all -> 0x008b }
            r6.mo20108g()     // Catch:{ all -> 0x008b }
            r5.m23317p()     // Catch:{ all -> 0x008b }
            goto L_0x0089
        L_0x004b:
            java.lang.String r6 = "CachedAd"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
            r7.<init>()     // Catch:{ all -> 0x008b }
            com.startapp.android.publish.common.model.AdPreferences$Placement r8 = r5.f17413i     // Catch:{ all -> 0x008b }
            r7.append(r8)     // Catch:{ all -> 0x008b }
            java.lang.String r8 = " ad is currently loading"
            r7.append(r8)     // Catch:{ all -> 0x008b }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x008b }
            com.startapp.common.p193a.C5518g.m23563a(r6, r1, r7)     // Catch:{ all -> 0x008b }
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            return
        L_0x0065:
            java.lang.String r8 = "CachedAd"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
            r2.<init>()     // Catch:{ all -> 0x008b }
            com.startapp.android.publish.common.model.AdPreferences$Placement r3 = r5.f17413i     // Catch:{ all -> 0x008b }
            r2.append(r3)     // Catch:{ all -> 0x008b }
            java.lang.String r3 = " ad already loaded"
            r2.append(r3)     // Catch:{ all -> 0x008b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008b }
            com.startapp.common.p193a.C5518g.m23563a(r8, r1, r2)     // Catch:{ all -> 0x008b }
            if (r6 == 0) goto L_0x0089
            if (r7 == 0) goto L_0x0089
            com.startapp.android.publish.adsCommon.adListeners.b r8 = new com.startapp.android.publish.adsCommon.adListeners.b     // Catch:{ all -> 0x008b }
            r8.<init>(r7)     // Catch:{ all -> 0x008b }
            r8.onReceiveAd(r6)     // Catch:{ all -> 0x008b }
        L_0x0089:
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            return
        L_0x008b:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.android.publish.cache.C5450g.m23315a(com.startapp.android.publish.adsCommon.StartAppAd, com.startapp.android.publish.adsCommon.adListeners.AdEventListener, boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo20122d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalidating: ");
        sb.append(this.f17413i);
        C5518g.m23563a("CachedAd", 4, sb.toString());
        if (mo20125g()) {
            if (C5348c.m22844a(this.f17414j, (C5286Ad) this.f17406a) || m23322u()) {
                C5518g.m23563a("CachedAd", 3, "App present or cache TTL passed, reloading");
                mo20120b(true);
            } else if (!this.f17407b.get()) {
                this.f17409d.mo20107f();
            }
        } else if (!this.f17407b.get()) {
            this.f17410e.mo20107f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo20123e() {
        this.f17410e.mo20109h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo20124f() {
        this.f17409d.mo20109h();
    }

    /* renamed from: g */
    public boolean mo20125g() {
        return this.f17406a != null && this.f17406a.isReady();
    }

    /* renamed from: h */
    public boolean mo20126h() {
        return this.f17420p;
    }

    /* renamed from: i */
    public C5382g mo20127i() {
        if (!mo20125g()) {
            return null;
        }
        C5382g gVar = this.f17406a;
        mo20131m();
        if (!AdsConstants.OVERRIDE_NETWORK.booleanValue() && mo20126h()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ad shown, reloading ");
            sb.append(this.f17413i);
            C5518g.m23563a("CachedAd", 3, sb.toString());
            mo20120b(true);
            return gVar;
        } else if (mo20126h()) {
            return gVar;
        } else {
            if (this.f17412g != null) {
                this.f17412g.mo20093a(this);
            }
            if (this.f17409d == null) {
                return gVar;
            }
            this.f17409d.mo20094a();
            return gVar;
        }
    }

    /* renamed from: j */
    public C5382g mo20128j() {
        C5382g gVar;
        C5307i.m22664a(this.f17414j, this.f17416l);
        switch (this.f17413i) {
            case INAPP_FULL_SCREEN:
                gVar = new C5106d(this.f17414j);
                break;
            case INAPP_OVERLAY:
                if (!C5307i.m22674a(4)) {
                    gVar = new C5106d(this.f17414j);
                    break;
                } else {
                    gVar = new C5253e(this.f17414j);
                    break;
                }
            case INAPP_OFFER_WALL:
                gVar = m23323v();
                break;
            case INAPP_RETURN:
                gVar = new C5107e(this.f17414j);
                break;
            case INAPP_SPLASH:
                gVar = new C5184b(this.f17414j);
                break;
            default:
                gVar = new C5106d(this.f17414j);
                break;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ad Type: [");
        sb.append(gVar.getClass().toString());
        sb.append("]");
        C5518g.m23563a("CachedAd", 4, sb.toString());
        return gVar;
    }

    /* renamed from: p */
    private void m23317p() {
        if (this.f17406a != null) {
            this.f17406a.setVideoCancelCallBack(false);
        }
        if (m23318q()) {
            mo20118a(false);
            m23319r();
            return;
        }
        mo20132n();
    }

    /* renamed from: q */
    private boolean m23318q() {
        return this.f17418n && this.f17417m != null;
    }

    /* renamed from: r */
    private void m23319r() {
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(this.f17413i);
        sb.append(" from disk ");
        sb.append("file name: ");
        sb.append(this.f17417m);
        C5518g.m23563a("CachedAd", 4, sb.toString());
        final C5454a aVar = new C5454a();
        C5457i.m23361a(this.f17414j, this.f17417m, (C5465a) new C5465a() {
            /* renamed from: a */
            public void mo20133a(C5382g gVar) {
                StringBuilder sb = new StringBuilder();
                sb.append("Success loading from disk: ");
                sb.append(C5450g.this.f17413i);
                C5518g.m23563a("CachedAd", 4, sb.toString());
                C5450g.this.f17406a = gVar;
            }
        }, (AdEventListener) new AdEventListener() {
            public void onReceiveAd(C5286Ad ad) {
                aVar.onReceiveAd(ad);
            }

            public void onFailedToReceiveAd(C5286Ad ad) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to load ");
                sb.append(C5450g.this.f17413i);
                sb.append(" from disk");
                C5518g.m23563a("CachedAd", 3, sb.toString());
                C5450g.this.f17406a = null;
                C5450g.this.mo20132n();
            }
        });
    }

    /* renamed from: a */
    public void mo20115a(C5455b bVar) {
        this.f17412g = bVar;
    }

    /* renamed from: k */
    public boolean mo20129k() {
        if (m23320s()) {
            mo20120b(true);
            m23321t();
            return true;
        }
        if (this.f17412g != null) {
            this.f17412g.mo20093a(this);
        }
        return false;
    }

    /* renamed from: s */
    private boolean m23320s() {
        return this.f17419o < MetaData.getInstance().getStopAutoLoadAmount();
    }

    /* renamed from: t */
    private void m23321t() {
        this.f17419o++;
    }

    /* renamed from: l */
    public int mo20130l() {
        return this.f17419o;
    }

    /* renamed from: a */
    public void mo20113a(int i) {
        this.f17419o = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo20131m() {
        this.f17419o = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo20132n() {
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(this.f17413i);
        sb.append(" from server");
        C5518g.m23563a("CachedAd", 4, sb.toString());
        this.f17406a = mo20128j();
        this.f17406a.setActivityExtra(this.f17415k);
        this.f17406a.load(this.f17416l, new C5454a());
        this.f17408c = System.currentTimeMillis();
    }

    /* renamed from: u */
    private boolean m23322u() {
        if (this.f17406a == null) {
            return false;
        }
        return this.f17406a.hasAdCacheTtlPassed();
    }

    /* renamed from: v */
    private C5382g m23323v() {
        boolean z = new Random().nextInt(100) < C5344b.m22784a().mo19766d();
        boolean a = C5307i.m22677a(this.f17416l, "forceOfferWall3D");
        boolean a2 = true ^ C5307i.m22677a(this.f17416l, "forceOfferWall2D");
        boolean a3 = C5307i.m22674a(64);
        if (m23324w() || (a3 && ((z || a) && a2))) {
            return new C5149b(this.f17414j);
        }
        return new C5147b(this.f17414j);
    }

    /* renamed from: w */
    private boolean m23324w() {
        return C5307i.m22674a(64) && !C5307i.m22674a(128);
    }
}
