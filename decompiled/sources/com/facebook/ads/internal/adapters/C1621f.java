package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.appnext.base.p042a.p045c.C1234a;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.internal.p077d.C1704b;
import com.facebook.ads.internal.p077d.C1705c;
import com.facebook.ads.internal.p081h.C1723a;
import com.facebook.ads.internal.p081h.C1724b;
import com.facebook.ads.internal.p086m.C1765d;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2331r;
import com.facebook.ads.internal.p115w.p117b.C2337u;
import com.facebook.ads.internal.p115w.p117b.C2337u.C2338a;
import com.facebook.ads.internal.view.p110i.C2110a;
import com.facebook.ads.internal.view.p110i.C2119b;
import com.facebook.ads.internal.view.p110i.C2159c;
import com.facebook.ads.internal.view.p110i.p111a.C2116a;
import com.facebook.ads.internal.view.p110i.p111a.C2117b;
import com.facebook.ads.internal.view.p110i.p112b.C2134b;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import com.facebook.ads.internal.view.p110i.p112b.C2137e;
import com.facebook.ads.internal.view.p110i.p112b.C2145m;
import com.facebook.ads.internal.view.p110i.p113c.C2164a;
import com.facebook.ads.internal.view.p110i.p113c.C2172b;
import com.facebook.ads.internal.view.p110i.p113c.C2178c;
import com.facebook.ads.internal.view.p110i.p113c.C2180d;
import com.facebook.ads.internal.view.p110i.p113c.C2180d.C2188a;
import com.facebook.ads.internal.view.p110i.p113c.C2189e;
import com.facebook.ads.internal.view.p110i.p113c.C2202i;
import com.facebook.ads.internal.view.p110i.p113c.C2211k;
import com.facebook.ads.internal.view.p110i.p113c.C2213l;
import com.facebook.ads.internal.view.p110i.p114d.C2240d;
import com.facebook.ads.p069a.C1557a;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.f */
public class C1621f extends C1648n implements C2331r<Bundle> {

    /* renamed from: e */
    static final /* synthetic */ boolean f5007e = true;

    /* renamed from: a */
    protected C1802c f5008a;

    /* renamed from: b */
    protected C2110a f5009b;

    /* renamed from: c */
    protected JSONObject f5010c;

    /* renamed from: d */
    protected Context f5011d;

    /* renamed from: f */
    private final C1779f<C2135c> f5012f = new C1779f<C2135c>() {
        /* renamed from: a */
        public Class<C2135c> mo7260a() {
            return C2135c.class;
        }

        /* renamed from: a */
        public void mo6895a(C2135c cVar) {
            if (C1621f.this.f5016j != null) {
                C1621f.this.f5016j.mo6826d(C1621f.this);
            }
        }
    };

    /* renamed from: g */
    private final C1779f<C2145m> f5013g = new C1779f<C2145m>() {
        /* renamed from: a */
        public Class<C2145m> mo7260a() {
            return C2145m.class;
        }

        /* renamed from: a */
        public void mo6895a(C2145m mVar) {
            C1621f.this.f5018l = true;
            if (C1621f.this.f5016j != null) {
                C1621f.this.f5016j.mo6821a(C1621f.this);
            }
        }
    };

    /* renamed from: h */
    private final C1779f<C2137e> f5014h = new C1779f<C2137e>() {
        /* renamed from: a */
        public Class<C2137e> mo7260a() {
            return C2137e.class;
        }

        /* renamed from: a */
        public void mo6895a(C2137e eVar) {
            if (C1621f.this.f5016j != null) {
                C1621f.this.f5016j.mo6823a((C1648n) C1621f.this, AdError.internalError(AdError.INTERNAL_ERROR_2003));
            }
        }
    };

    /* renamed from: i */
    private final C1779f<C2134b> f5015i = new C1779f<C2134b>() {
        /* renamed from: a */
        public Class<C2134b> mo7260a() {
            return C2134b.class;
        }

        /* renamed from: a */
        public void mo6895a(C2134b bVar) {
            if (C1621f.this.f5016j != null) {
                C1621f.this.f5016j.mo6824b(C1621f.this);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C1557a f5016j;

    /* renamed from: k */
    private String f5017k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f5018l = false;

    /* renamed from: m */
    private C2159c f5019m;

    /* renamed from: n */
    private String f5020n;

    /* renamed from: o */
    private boolean f5021o = false;

    /* renamed from: p */
    private C1724b f5022p;

    /* renamed from: a */
    private void m6746a(Context context, C1557a aVar, JSONObject jSONObject, C1802c cVar, Bundle bundle, EnumSet<CacheFlag> enumSet, int i) {
        Context context2 = context;
        JSONObject jSONObject2 = jSONObject;
        Bundle bundle2 = bundle;
        this.f5011d = context2;
        this.f5016j = aVar;
        C1802c cVar2 = cVar;
        this.f5008a = cVar2;
        this.f5010c = jSONObject2;
        this.f5018l = false;
        JSONObject jSONObject3 = jSONObject2.getJSONObject("video");
        this.f5020n = jSONObject2.optString(C1234a.f3911gK);
        this.f5009b = new C2110a(context2);
        this.f5009b.setVideoProgressReportIntervalMs(i);
        mo7251a();
        this.f5009b.getEventBus().mo7626a((T[]) new C1779f[]{this.f5012f, this.f5013g, this.f5014h, this.f5015i});
        ArrayList arrayList = new ArrayList();
        C16265 r0 = new C1704b(this, 1.0E-7d, -1.0d, 0.001d, false) {

            /* renamed from: a */
            final /* synthetic */ C1621f f5027a;

            {
                this.f5027a = r10;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo7265a(boolean z, boolean z2, C1705c cVar) {
                this.f5027a.mo7258f();
            }
        };
        arrayList.add(r0);
        if (bundle2 != null) {
            C2119b bVar = new C2119b(context2, cVar2, this.f5009b, arrayList, this.f5020n, bundle2.getBundle("logger"), null);
            this.f5019m = bVar;
        } else {
            C2119b bVar2 = new C2119b(context2, cVar2, this.f5009b, (List<C1704b>) arrayList, this.f5020n);
            this.f5019m = bVar2;
        }
        this.f5016j.mo6822a((C1648n) this, (View) this.f5009b);
        this.f5017k = jSONObject3.getString((C2337u.m9066a(context) != C2338a.f7342c || !jSONObject3.has("videoHDURL") || jSONObject3.isNull("videoHDURL")) ? AudienceNetworkActivity.VIDEO_URL : "videoHDURL");
        if (enumSet.contains(CacheFlag.VIDEO)) {
            this.f5022p = new C1724b(context2);
            this.f5022p.mo7493a(this.f5017k);
            this.f5022p.mo7492a((C1723a) new C1723a() {
                /* renamed from: a */
                public void mo7016a() {
                    C1621f.this.f5009b.setVideoURI(C1621f.this.mo7273h());
                }

                /* renamed from: b */
                public void mo7017b() {
                    C1621f.this.f5009b.setVideoURI(C1621f.this.mo7273h());
                }
            });
            return;
        }
        this.f5009b.setVideoURI(mo7273h());
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public String mo7273h() {
        String str = "";
        if (!(this.f5022p == null || this.f5017k == null)) {
            str = this.f5022p.mo7496c(this.f5017k);
        }
        return TextUtils.isEmpty(str) ? this.f5017k : str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7251a() {
        if (!f5007e && this.f5011d == null) {
            throw new AssertionError();
        } else if (f5007e || this.f5010c != null) {
            JSONObject optJSONObject = this.f5010c.optJSONObject(MimeTypes.BASE_TYPE_TEXT);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            this.f5009b.mo8381a((C2117b) new C2211k(this.f5011d));
            C2213l lVar = new C2213l(this.f5011d);
            this.f5009b.mo8381a((C2117b) lVar);
            this.f5009b.mo8381a((C2117b) new C2180d(lVar, C2188a.INVSIBLE));
            this.f5009b.mo8381a((C2117b) new C2172b(this.f5011d));
            String b = mo7254b();
            if (b != null) {
                C2178c cVar = new C2178c(this.f5011d, b);
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.addRule(12);
                layoutParams.addRule(9);
                cVar.setLayoutParams(layoutParams);
                cVar.setCountdownTextColor(-1);
                this.f5009b.mo8381a((C2117b) cVar);
            }
            if (this.f5010c.has("cta") && !this.f5010c.isNull("cta")) {
                JSONObject jSONObject = this.f5010c.getJSONObject("cta");
                C2189e eVar = new C2189e(this.f5011d, jSONObject.getString("url"), this.f5008a, this.f5020n, jSONObject.getString(MimeTypes.BASE_TYPE_TEXT));
                LayoutParams layoutParams2 = new LayoutParams(-2, -2);
                layoutParams2.addRule(10);
                layoutParams2.addRule(11);
                eVar.setLayoutParams(layoutParams2);
                this.f5009b.mo8381a((C2117b) eVar);
            }
            String d = mo7256d();
            if (!TextUtils.isEmpty(d)) {
                this.f5009b.mo8381a((C2117b) new C2164a(this.f5011d, d, this.f5020n, new float[]{0.0f, 0.0f, 8.0f, 0.0f}));
            }
            int c = mo7255c();
            if (c > 0) {
                C2202i iVar = new C2202i(this.f5011d, c, optJSONObject.optString("skipAdIn", "Skip Ad in"), optJSONObject.optString("skipAd", "Skip Ad"));
                LayoutParams layoutParams3 = new LayoutParams(-2, -2);
                layoutParams3.addRule(12);
                layoutParams3.addRule(11);
                iVar.setLayoutParams(layoutParams3);
                iVar.setPadding(0, 0, 0, 30);
                this.f5009b.mo8381a((C2117b) iVar);
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public void mo7252a(Context context, C1557a aVar, C1802c cVar, Bundle bundle, EnumSet<CacheFlag> enumSet) {
        try {
            JSONObject jSONObject = new JSONObject(bundle.getString("ad_response"));
            m6746a(context, aVar, jSONObject, cVar, bundle, enumSet, jSONObject.optInt("video_time_polling_interval", 200));
        } catch (JSONException unused) {
            aVar.mo6823a((C1648n) this, AdError.INTERNAL_ERROR);
        }
    }

    /* renamed from: a */
    public void mo7253a(Context context, C1557a aVar, Map<String, Object> map, C1802c cVar, EnumSet<CacheFlag> enumSet) {
        try {
            JSONObject jSONObject = (JSONObject) map.get("data");
            C1765d dVar = (C1765d) map.get("definition");
            m6746a(context, aVar, jSONObject, cVar, null, enumSet, dVar == null ? 200 : dVar.mo7615k());
        } catch (JSONException unused) {
            aVar.mo6823a((C1648n) this, AdError.INTERNAL_ERROR);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo7254b() {
        if (f5007e || this.f5010c != null) {
            try {
                JSONObject jSONObject = this.f5010c.getJSONObject("capabilities");
                if (!jSONObject.has("countdown") || jSONObject.isNull("countdown")) {
                    return null;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("countdown");
                if (jSONObject2.has("format")) {
                    return jSONObject2.optString("format");
                }
                return null;
            } catch (Exception e) {
                Log.w(String.valueOf(C1621f.class), "Invalid JSON", e);
                return null;
            }
        } else {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo7255c() {
        if (f5007e || this.f5010c != null) {
            try {
                JSONObject jSONObject = this.f5010c.getJSONObject("capabilities");
                if (!jSONObject.has("skipButton") || jSONObject.isNull("skipButton")) {
                    return -1;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("skipButton");
                if (jSONObject2.has("skippableSeconds")) {
                    return jSONObject2.getInt("skippableSeconds");
                }
                return -1;
            } catch (Exception e) {
                Log.w(String.valueOf(C1621f.class), "Invalid JSON", e);
                return -1;
            }
        } else {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7256d() {
        if (f5007e || this.f5010c != null) {
            try {
                JSONObject jSONObject = this.f5010c.getJSONObject("capabilities");
                if (!jSONObject.has("adChoices") || jSONObject.isNull("adChoices")) {
                    return null;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("adChoices");
                if (jSONObject2.has("url")) {
                    return jSONObject2.getString("url");
                }
                return null;
            } catch (Exception e) {
                Log.w(String.valueOf(C1621f.class), "Invalid JSON", e);
                return null;
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: e */
    public boolean mo7257e() {
        if (!this.f5018l || this.f5009b == null) {
            return false;
        }
        if (this.f5019m.mo8459j() > 0) {
            this.f5009b.mo8378a(this.f5019m.mo8459j());
        }
        this.f5009b.mo8380a(C2116a.AUTO_STARTED);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo7258f() {
        if (this.f5008a != null && !this.f5021o) {
            this.f5021o = true;
            this.f5008a.mo7686a(this.f5020n, new HashMap());
            if (this.f5016j != null) {
                this.f5016j.mo6825c(this);
            }
        }
    }

    /* renamed from: g */
    public Bundle mo7259g() {
        if (this.f5019m == null || this.f5010c == null || this.f5009b == null || this.f5009b.getState() == C2240d.IDLE) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("logger", this.f5019m.mo7259g());
        bundle.putString("ad_response", this.f5010c.toString());
        return bundle;
    }

    public String getClientToken() {
        return this.f5020n;
    }

    public void onDestroy() {
        if (this.f5009b != null) {
            this.f5009b.mo8388g();
            this.f5009b.mo8407l();
        }
        this.f5016j = null;
        this.f5008a = null;
        this.f5017k = null;
        this.f5018l = false;
        this.f5020n = null;
        this.f5009b = null;
        this.f5019m = null;
        this.f5010c = null;
        this.f5011d = null;
        this.f5021o = false;
    }
}
