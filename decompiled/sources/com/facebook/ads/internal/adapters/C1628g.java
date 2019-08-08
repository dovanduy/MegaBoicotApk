package com.facebook.ads.internal.adapters;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import com.appnext.base.p042a.p045c.C1234a;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAdActivity;
import com.facebook.ads.internal.adapters.p072b.C1588d;
import com.facebook.ads.internal.adapters.p072b.C1600k;
import com.facebook.ads.internal.adapters.p072b.C1601l;
import com.facebook.ads.internal.adapters.p072b.C1605n;
import com.facebook.ads.internal.adapters.p072b.C1606o;
import com.facebook.ads.internal.adapters.p073c.C1610a;
import com.facebook.ads.internal.adapters.p073c.C1610a.C1613b;
import com.facebook.ads.internal.p070a.C1566e;
import com.facebook.ads.internal.p081h.C1723a;
import com.facebook.ads.internal.p081h.C1724b;
import com.facebook.ads.internal.p086m.C1765d;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p115w.p123h.C2370a;
import com.facebook.ads.internal.p115w.p123h.C2373b;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.C1810a.C1811a;
import com.facebook.ads.internal.view.C1910a;
import com.facebook.ads.internal.view.p101c.C1982f;
import com.facebook.ads.internal.view.p105e.C2057c;
import com.facebook.ads.p069a.C1557a;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.g */
public class C1628g implements AdAdapter {

    /* renamed from: a */
    private static final ConcurrentMap<String, C1910a> f5029a = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f5030b = UUID.randomUUID().toString();

    /* renamed from: c */
    private String f5031c;

    /* renamed from: d */
    private long f5032d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f5033e;

    /* renamed from: f */
    private C1649o f5034f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public InterstitialAdapterListener f5035g;

    /* renamed from: h */
    private C1613b f5036h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f5037i;

    /* renamed from: j */
    private C1645l f5038j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C1982f f5039k = C1982f.UNSPECIFIED;

    /* renamed from: l */
    private C1600k f5040l;

    /* renamed from: m */
    private C1811a f5041m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f5042n;

    /* renamed from: o */
    private String f5043o;

    /* renamed from: p */
    private String f5044p;

    /* renamed from: a */
    private static int m6774a(Context context, C1588d dVar) {
        return C1795a.m7425S(context) ? Math.min(C2342x.f7368a.widthPixels, dVar.mo7134h()) : dVar.mo7134h();
    }

    /* renamed from: a */
    public static C1910a m6776a(String str) {
        return (C1910a) f5029a.get(str);
    }

    /* renamed from: a */
    public static void m6778a(C1910a aVar) {
        for (Entry entry : f5029a.entrySet()) {
            if (entry.getValue() == aVar) {
                f5029a.remove(entry.getKey());
            }
        }
    }

    /* renamed from: b */
    private static int m6781b(Context context, C1588d dVar) {
        return C1795a.m7425S(context) ? Math.min(C2342x.f7368a.heightPixels, dVar.mo7135i()) : dVar.mo7135i();
    }

    /* renamed from: a */
    public void mo7266a(Context context, InterstitialAdapterListener interstitialAdapterListener, Map<String, Object> map, C1802c cVar, final EnumSet<CacheFlag> enumSet, String str) {
        C1724b bVar;
        C1723a r8;
        this.f5033e = context;
        this.f5035g = interstitialAdapterListener;
        this.f5031c = (String) map.get(AudienceNetworkActivity.PLACEMENT_ID);
        this.f5032d = ((Long) map.get(AudienceNetworkActivity.REQUEST_TIME)).longValue();
        this.f5043o = str;
        JSONObject jSONObject = (JSONObject) map.get("data");
        this.f5044p = jSONObject.optString(C1234a.f3911gK);
        C1765d dVar = (C1765d) map.get("definition");
        if (jSONObject.has("markup")) {
            this.f5041m = C1811a.INTERSTITIAL_WEB_VIEW;
            this.f5038j = C1645l.m6882a(jSONObject);
            if (C1566e.m6498a(this.f5033e, this.f5038j, cVar)) {
                interstitialAdapterListener.onInterstitialError(this, AdError.internalError(AdError.INTERNAL_ERROR_2006));
                return;
            }
            this.f5034f = new C1649o(this.f5033e, this.f5030b, this, this.f5035g);
            this.f5034f.mo7330a();
            Map e = this.f5038j.mo7323e();
            if (e.containsKey("orientation")) {
                this.f5039k = C1982f.m8155a(Integer.parseInt((String) e.get("orientation")));
            }
            this.f5037i = true;
            if (this.f5035g != null) {
                this.f5035g.onInterstitialAdLoaded(this);
            }
        } else if (jSONObject.has("video")) {
            this.f5041m = C1811a.INTERSTITIAL_OLD_NATIVE_VIDEO;
            this.f5034f = new C1649o(this.f5033e, this.f5030b, this, this.f5035g);
            this.f5034f.mo7330a();
            final C1634h hVar = new C1634h();
            hVar.mo7253a(this.f5033e, (C1557a) new C1557a() {
                /* renamed from: a */
                public void mo6821a(C1648n nVar) {
                    C1628g.this.f5037i = true;
                    if (C1628g.this.f5035g != null) {
                        C1628g.this.f5035g.onInterstitialAdLoaded(C1628g.this);
                    }
                }

                /* renamed from: a */
                public void mo6822a(C1648n nVar, View view) {
                    C1628g.this.f5039k = hVar.mo7274i();
                    C1628g.f5029a.put(C1628g.this.f5030b, hVar);
                }

                /* renamed from: a */
                public void mo6823a(C1648n nVar, AdError adError) {
                    hVar.mo7275j();
                    C1628g.this.f5035g.onInterstitialError(C1628g.this, adError);
                }

                /* renamed from: b */
                public void mo6824b(C1648n nVar) {
                    C1628g.this.f5035g.onInterstitialAdClicked(C1628g.this, "", true);
                }

                /* renamed from: c */
                public void mo6825c(C1648n nVar) {
                    C1628g.this.f5035g.onInterstitialLoggingImpression(C1628g.this);
                }

                /* renamed from: d */
                public void mo6826d(C1648n nVar) {
                }
            }, map, cVar, enumSet);
        } else {
            this.f5040l = C1600k.m6656a(jSONObject, this.f5033e);
            this.f5040l.mo7187a(this.f5043o);
            if (dVar != null) {
                this.f5040l.mo7186a(dVar.mo7615k());
            }
            if (this.f5040l.mo7190d().size() == 0) {
                this.f5035g.onInterstitialError(this, AdError.internalError(AdError.INTERNAL_ERROR_2006));
                C2370a.m9149b(this.f5033e, "api", C2373b.f7508j, new Exception("Internal Error 2006 without a valid AdInfo."));
                return;
            }
            this.f5034f = new C1649o(this.f5033e, this.f5030b, this, this.f5035g);
            this.f5034f.mo7330a();
            if (jSONObject.has("carousel")) {
                this.f5041m = C1811a.INTERSTITIAL_NATIVE_CAROUSEL;
                bVar = new C1724b(this.f5033e);
                bVar.mo7494a(this.f5040l.mo7185a().mo7201b(), C2057c.f6537a, C2057c.f6537a);
                List<C1601l> d = this.f5040l.mo7190d();
                boolean contains = enumSet.contains(CacheFlag.VIDEO);
                for (C1601l lVar : d) {
                    bVar.mo7494a(lVar.mo7198c().mo7133g(), m6781b(this.f5033e, lVar.mo7198c()), m6774a(this.f5033e, lVar.mo7198c()));
                    if (contains && !TextUtils.isEmpty(lVar.mo7198c().mo7126a())) {
                        bVar.mo7493a(lVar.mo7198c().mo7133g());
                    }
                }
                r8 = new C1723a() {
                    /* renamed from: a */
                    private void m6793a(boolean z) {
                        boolean z2 = !enumSet.contains(CacheFlag.NONE);
                        if (z || !C1795a.m7426T(C1628g.this.f5033e)) {
                            C1628g.this.f5042n = z && z2;
                            C1628g.this.f5037i = true;
                            C1628g.this.f5035g.onInterstitialAdLoaded(C1628g.this);
                            return;
                        }
                        C1628g.this.f5035g.onInterstitialError(C1628g.this, AdError.CACHE_ERROR);
                    }

                    /* renamed from: a */
                    public void mo7016a() {
                        m6793a(true);
                    }

                    /* renamed from: b */
                    public void mo7017b() {
                        if (C1795a.m7424R(C1628g.this.f5033e)) {
                            C2370a.m9149b(C1628g.this.f5033e, "cache", C2373b.f7485T, new Exception("Interstitial carousel cache failed"));
                        }
                        m6793a(false);
                    }
                };
            } else if (jSONObject.has("playable_data")) {
                this.f5041m = C1811a.INTERSTITIAL_NATIVE_PLAYABLE;
                C1606o a = C1606o.m6699a(this.f5040l);
                C1605n j = a.mo7226f().mo7136j();
                this.f5039k = j != null ? j.mo7215f() : C1982f.UNSPECIFIED;
                this.f5036h = new C1613b() {
                    /* renamed from: b */
                    private void m6796b() {
                        C1628g.this.f5037i = true;
                        C1628g.this.f5035g.onInterstitialAdLoaded(C1628g.this);
                    }

                    /* renamed from: a */
                    public void mo7240a() {
                        C1628g.this.f5042n = !enumSet.contains(CacheFlag.NONE);
                        m6796b();
                    }

                    /* renamed from: a */
                    public void mo7241a(AdError adError) {
                        if (!C1795a.m7426T(C1628g.this.f5033e)) {
                            m6796b();
                        } else {
                            C1628g.this.f5035g.onInterstitialError(C1628g.this, AdError.CACHE_ERROR);
                        }
                    }
                };
                C1610a.m6725a(this.f5033e, a, C1795a.m7426T(this.f5033e), this.f5036h);
                return;
            } else if (jSONObject.has("video_url")) {
                this.f5041m = C1811a.INTERSTITIAL_NATIVE_VIDEO;
                bVar = new C1724b(this.f5033e);
                C1588d c = ((C1601l) this.f5040l.mo7190d().get(0)).mo7198c();
                bVar.mo7494a(c.mo7133g(), m6781b(this.f5033e, c), m6774a(this.f5033e, c));
                bVar.mo7494a(this.f5040l.mo7185a().mo7201b(), C2057c.f6537a, C2057c.f6537a);
                if (enumSet.contains(CacheFlag.VIDEO)) {
                    bVar.mo7493a(c.mo7126a());
                }
                r8 = new C1723a() {
                    /* renamed from: a */
                    private void m6799a(boolean z) {
                        if (z || !C1795a.m7426T(C1628g.this.f5033e)) {
                            C1628g.this.f5042n = z && enumSet.contains(CacheFlag.VIDEO);
                            C1628g.this.f5037i = true;
                            C1628g.this.f5035g.onInterstitialAdLoaded(C1628g.this);
                            return;
                        }
                        C1628g.this.f5035g.onInterstitialError(C1628g.this, AdError.CACHE_ERROR);
                    }

                    /* renamed from: a */
                    public void mo7016a() {
                        m6799a(true);
                    }

                    /* renamed from: b */
                    public void mo7017b() {
                        if (C1795a.m7424R(C1628g.this.f5033e)) {
                            C2370a.m9149b(C1628g.this.f5033e, "cache", C2373b.f7487V, new Exception("Interstitial video cache failed"));
                        }
                        m6799a(false);
                    }
                };
            } else {
                this.f5041m = C1811a.INTERSTITIAL_NATIVE_IMAGE;
                bVar = new C1724b(this.f5033e);
                C1588d c2 = ((C1601l) this.f5040l.mo7190d().get(0)).mo7198c();
                bVar.mo7494a(c2.mo7133g(), m6781b(this.f5033e, c2), m6774a(this.f5033e, c2));
                bVar.mo7494a(this.f5040l.mo7185a().mo7201b(), C2057c.f6537a, C2057c.f6537a);
                r8 = new C1723a() {
                    /* renamed from: a */
                    private void m6802a(boolean z) {
                        if (z || !C1795a.m7426T(C1628g.this.f5033e)) {
                            C1628g.this.f5037i = true;
                            C1628g.this.f5035g.onInterstitialAdLoaded(C1628g.this);
                            return;
                        }
                        C1628g.this.f5035g.onInterstitialError(C1628g.this, AdError.CACHE_ERROR);
                    }

                    /* renamed from: a */
                    public void mo7016a() {
                        m6802a(true);
                    }

                    /* renamed from: b */
                    public void mo7017b() {
                        if (C1795a.m7424R(C1628g.this.f5033e)) {
                            C2370a.m9149b(C1628g.this.f5033e, "cache", C2373b.f7486U, new Exception("Interstitial image cache failed"));
                        }
                        m6802a(false);
                    }
                };
            }
            bVar.mo7492a(r8);
        }
    }

    /* renamed from: a */
    public boolean mo7267a() {
        int i = 0;
        if (!this.f5037i) {
            if (this.f5035g != null) {
                this.f5035g.onInterstitialError(this, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            }
            return false;
        }
        Intent intent = new Intent(this.f5033e, AudienceNetworkActivity.getAdActivity());
        String str = AudienceNetworkActivity.PREDEFINED_ORIENTATION_KEY;
        int rotation = ((WindowManager) this.f5033e.getSystemService("window")).getDefaultDisplay().getRotation();
        if (this.f5039k == C1982f.UNSPECIFIED) {
            i = -1;
        } else if (this.f5039k == C1982f.LANDSCAPE) {
            switch (rotation) {
                case 2:
                case 3:
                    i = 8;
                    break;
            }
        } else {
            i = rotation != 2 ? 1 : 9;
        }
        intent.putExtra(str, i);
        intent.putExtra(AudienceNetworkActivity.AUDIENCE_NETWORK_UNIQUE_ID_EXTRA, this.f5030b);
        intent.putExtra(AudienceNetworkActivity.PLACEMENT_ID, this.f5031c);
        intent.putExtra(AudienceNetworkActivity.REQUEST_TIME, this.f5032d);
        intent.putExtra(AudienceNetworkActivity.VIEW_TYPE, this.f5041m);
        intent.putExtra(AudienceNetworkActivity.USE_CACHE, this.f5042n);
        if (this.f5040l != null) {
            intent.putExtra("ad_data_bundle", this.f5040l);
        } else if (this.f5038j != null) {
            this.f5038j.mo7320a(intent);
        }
        intent.addFlags(268435456);
        try {
            this.f5033e.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            intent.setClass(this.f5033e, InterstitialAdActivity.class);
            this.f5033e.startActivity(intent);
            return true;
        }
    }

    public String getClientToken() {
        return this.f5044p;
    }

    public final AdPlacementType getPlacementType() {
        return AdPlacementType.INTERSTITIAL;
    }

    public void onDestroy() {
        if (this.f5034f != null) {
            this.f5034f.mo7331b();
        }
    }
}
