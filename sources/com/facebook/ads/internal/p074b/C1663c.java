package com.facebook.ads.internal.p074b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.C1577a;
import com.facebook.ads.internal.adapters.C1616d;
import com.facebook.ads.internal.p086m.C1762a;
import com.facebook.ads.internal.p086m.C1764c;
import com.facebook.ads.internal.p086m.C1765d;
import com.facebook.ads.internal.p087n.C1767a;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p092s.C1803d;
import com.facebook.ads.internal.p094u.C1842b;
import com.facebook.ads.internal.p094u.C1843c;
import com.facebook.ads.internal.p094u.C1843c.C1848b;
import com.facebook.ads.internal.p094u.C1853f;
import com.facebook.ads.internal.p115w.p117b.C2308c;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.C1782a;
import com.facebook.ads.internal.protocol.C1783b;
import com.facebook.ads.internal.protocol.C1789g;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.b.c */
public abstract class C1663c implements C1848b {

    /* renamed from: i */
    private static final String f5212i = "c";

    /* renamed from: j */
    private static final Handler f5213j = new Handler(Looper.getMainLooper());
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: k */
    private static C1843c f5214k;

    /* renamed from: l */
    private static C1616d f5215l;

    /* renamed from: a */
    volatile boolean f5216a;

    /* renamed from: b */
    protected final Context f5217b;

    /* renamed from: c */
    protected C1577a f5218c;

    /* renamed from: d */
    View f5219d;

    /* renamed from: e */
    AdAdapter f5220e;

    /* renamed from: f */
    public AdAdapter f5221f;

    /* renamed from: g */
    public final C1802c f5222g;

    /* renamed from: h */
    public final C1659a f5223h;

    /* renamed from: m */
    private final C1843c f5224m;

    /* renamed from: n */
    private final C1616d f5225n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C1764c f5226o;

    /* renamed from: p */
    private C1842b f5227p;

    static {
        C2308c.m9019a();
    }

    public C1663c(Context context, C1659a aVar) {
        this.f5217b = context.getApplicationContext();
        this.f5223h = aVar;
        this.f5224m = f5214k != null ? f5214k : new C1843c(this.f5217b);
        this.f5224m.mo7821a((C1848b) this);
        this.f5225n = f5215l != null ? f5215l : new C1616d();
        try {
            CookieManager.getInstance();
            if (VERSION.SDK_INT < 21) {
                CookieSyncManager.createInstance(this.f5217b);
            }
        } catch (Exception e) {
            Log.w(f5212i, "Failed to initialize CookieManager.", e);
        }
        C1767a.m7338b(this.f5217b);
        this.f5222g = C1803d.m7531a(this.f5217b);
    }

    /* renamed from: a */
    static /* synthetic */ void m6950a(C1663c cVar) {
        C1782a a;
        C1577a aVar;
        AdErrorType adErrorType;
        cVar.f5220e = null;
        C1764c cVar2 = cVar.f5226o;
        C1762a e = cVar2.mo7601e();
        if (e == null) {
            aVar = cVar.f5218c;
            adErrorType = AdErrorType.NO_FILL;
        } else {
            String a2 = e.mo7590a();
            AdAdapter a3 = cVar.f5225n.mo7246a(cVar2.mo7596a().mo7606b());
            if (a3 == null) {
                String str = f5212i;
                StringBuilder sb = new StringBuilder();
                sb.append("Adapter does not exist: ");
                sb.append(a2);
                Log.e(str, sb.toString());
                cVar.mo7385i();
                return;
            } else if (cVar.f5223h.mo7364a() != a3.getPlacementType()) {
                aVar = cVar.f5218c;
                adErrorType = AdErrorType.INTERNAL_ERROR;
            } else {
                cVar.f5220e = a3;
                C1765d a4 = cVar2.mo7596a();
                HashMap hashMap = new HashMap();
                hashMap.put("data", e.mo7593c());
                hashMap.put("definition", a4);
                hashMap.put(AudienceNetworkActivity.PLACEMENT_ID, cVar.f5223h.f5198a);
                hashMap.put(AudienceNetworkActivity.REQUEST_TIME, Long.valueOf(a4.mo7605a()));
                hashMap.put("data_model_type", e.mo7592b());
                if (cVar.f5227p == null) {
                    a = C1782a.m7381a(AdErrorType.UNKNOWN_ERROR, "environment is empty");
                    aVar = cVar.f5218c;
                    aVar.mo6778a(a);
                }
                cVar.mo7371a(a3, cVar2, e, hashMap);
                return;
            }
        }
        a = C1782a.m7381a(adErrorType, "");
        aVar.mo6778a(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7370a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7374a(AdAdapter adAdapter) {
        if (adAdapter != null) {
            adAdapter.onDestroy();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7371a(AdAdapter adAdapter, C1764c cVar, C1762a aVar, Map<String, Object> map);

    /* renamed from: a */
    public void mo7375a(C1577a aVar) {
        this.f5218c = aVar;
    }

    /* renamed from: a */
    public synchronized void mo7048a(final C1782a aVar) {
        mo7386j().post(new Runnable() {
            public void run() {
                C1663c.this.f5218c.mo6778a(aVar);
            }
        });
    }

    /* renamed from: a */
    public synchronized void mo7049a(final C1853f fVar) {
        if (C1795a.m7427U(this.f5217b)) {
            C1782a c = mo7379c();
            if (c != null) {
                Log.e(AudienceNetworkAds.TAG, c.mo7636b());
                mo7048a(c);
                return;
            }
        }
        mo7386j().post(new Runnable() {
            public void run() {
                C1764c a = fVar.mo7829a();
                if (a == null || a.mo7596a() == null) {
                    throw new IllegalStateException("invalid placement in response");
                }
                C1663c.this.f5226o = a;
                C1663c.this.mo7385i();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7372a(String str) {
        try {
            this.f5227p = this.f5223h.mo7365a(this.f5217b, new C1789g(this.f5217b, str, this.f5223h.f5198a, this.f5223h.f5199b));
            this.f5224m.mo7819a(this.f5227p);
        } catch (C1783b e) {
            mo7048a(C1782a.m7382a(e));
        }
    }

    /* renamed from: a */
    public void mo7376a(boolean z) {
        if (z || this.f5216a) {
            mo7374a(this.f5221f);
            this.f5224m.mo7818a();
            this.f5219d = null;
            this.f5216a = false;
        }
    }

    /* renamed from: b */
    public C1765d mo7377b() {
        if (this.f5226o == null) {
            return null;
        }
        return this.f5226o.mo7596a();
    }

    /* renamed from: b */
    public void mo7378b(String str) {
        mo7372a(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C1782a mo7379c() {
        EnumSet<CacheFlag> enumSet = this.f5223h.f5201d;
        C1782a aVar = null;
        if (enumSet != null && !enumSet.contains(CacheFlag.NONE)) {
            if (mo7380d()) {
                return null;
            }
            aVar = new C1782a(AdErrorType.CLEAR_TEXT_SUPPORT_NOT_ALLOWED, "");
        }
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo7380d() {
        boolean z = VERSION.SDK_INT < 24 || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted("127.0.0.1");
        if (!z) {
            C2370a.m9149b(this.f5217b, "cache", C2373b.f7488W, new Exception("Cleartext http is not allowed."));
        }
        return z;
    }

    /* renamed from: e */
    public void mo7381e() {
        if (this.f5221f == null) {
            C2370a.m9149b(this.f5217b, "api", C2373b.f7503e, new C1783b(AdErrorType.NO_ADAPTER_ON_START, "Adapter is null on startAd"));
            this.f5218c.mo6778a(C1782a.m7381a(AdErrorType.INTERNAL_ERROR, AdErrorType.INTERNAL_ERROR.getDefaultErrorMessage()));
        } else if (this.f5216a) {
            C2370a.m9149b(this.f5217b, "api", C2373b.f7501c, new C1783b(AdErrorType.AD_ALREADY_STARTED, "ad already started"));
            this.f5218c.mo6778a(C1782a.m7381a(AdErrorType.AD_ALREADY_STARTED, AdErrorType.AD_ALREADY_STARTED.getDefaultErrorMessage()));
        } else {
            if (!TextUtils.isEmpty(this.f5221f.getClientToken())) {
                this.f5222g.mo7688b(this.f5221f.getClientToken());
            }
            this.f5216a = true;
            mo7370a();
        }
    }

    /* renamed from: f */
    public void mo7382f() {
        mo7376a(false);
    }

    /* renamed from: g */
    public boolean mo7383g() {
        return this.f5226o == null || this.f5226o.mo7603g();
    }

    /* renamed from: h */
    public long mo7384h() {
        if (this.f5226o != null) {
            return this.f5226o.mo7604h();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public synchronized void mo7385i() {
        f5213j.post(new Runnable() {
            public void run() {
                try {
                    C1663c.m6950a(C1663c.this);
                } catch (Exception e) {
                    C2370a.m9149b(C1663c.this.f5217b, "api", C2373b.f7515q, e);
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public Handler mo7386j() {
        return f5213j;
    }
}
