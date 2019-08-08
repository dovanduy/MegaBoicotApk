package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.p070a.C1563b;
import com.facebook.ads.internal.p070a.C1564c;
import com.facebook.ads.internal.p070a.C1566e;
import com.facebook.ads.internal.p086m.C1765d;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p120e.C2355b;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1786d;
import com.facebook.ads.internal.view.p101c.C1967a;
import com.facebook.ads.internal.view.p101c.C1967a.C1970b;
import com.facebook.ads.internal.view.p101c.C1967a.C1971c;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.e */
public class C1618e implements AdAdapter {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f4995a = "e";

    /* renamed from: b */
    private C1970b f4996b;

    /* renamed from: c */
    private C1967a f4997c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1646m f4998d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public BannerAdapterListener f4999e;

    /* renamed from: f */
    private Map<String, Object> f5000f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1802c f5001g;

    /* renamed from: h */
    private String f5002h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Context f5003i;

    /* renamed from: a */
    public void mo7247a(Context context, C1802c cVar, C1786d dVar, BannerAdapterListener bannerAdapterListener, Map<String, Object> map) {
        this.f5003i = context;
        this.f5001g = cVar;
        this.f4999e = bannerAdapterListener;
        this.f5000f = map;
        C1765d dVar2 = (C1765d) this.f5000f.get("definition");
        final C1645l a = C1645l.m6882a((JSONObject) this.f5000f.get("data"));
        this.f5002h = a.getClientToken();
        if (C1566e.m6498a(this.f5003i, a, this.f5001g)) {
            this.f4999e.onBannerError(this, AdError.internalError(AdError.INTERNAL_ERROR_2006));
            return;
        }
        this.f4996b = new C1971c() {
            /* renamed from: a */
            public void mo7248a() {
                C1618e.this.f4998d.mo7328b();
            }

            /* renamed from: a */
            public void mo7249a(String str, Map<String, String> map) {
                Uri parse = Uri.parse(str);
                if ("fbad".equals(parse.getScheme()) && C1564c.m6495a(parse.getAuthority()) && C1618e.this.f4999e != null) {
                    C1618e.this.f4999e.onBannerAdClicked(C1618e.this);
                }
                C1563b a = C1564c.m6493a(C1618e.this.f5003i, C1618e.this.f5001g, a.getClientToken(), parse, map);
                if (a != null) {
                    try {
                        a.mo7058a();
                    } catch (Exception e) {
                        Log.e(C1618e.f4995a, "Error executing action", e);
                    }
                }
            }

            /* renamed from: b */
            public void mo7250b() {
                if (C1618e.this.f4998d != null) {
                    C1618e.this.f4998d.mo7111a();
                }
            }
        };
        this.f4997c = new C1967a(this.f5003i, new WeakReference(this.f4996b), dVar2.mo7610f());
        this.f4997c.mo8067a(dVar2.mo7612h(), dVar2.mo7613i());
        C1646m mVar = new C1646m(this.f5003i, this.f5001g, this.f4997c, this.f4997c.getViewabilityChecker(), new C1609c() {
            /* renamed from: a */
            public void mo7238a() {
                if (C1618e.this.f4999e != null) {
                    C1618e.this.f4999e.onBannerLoggingImpression(C1618e.this);
                }
            }
        });
        this.f4998d = mVar;
        this.f4998d.mo7327a(a);
        this.f4997c.loadDataWithBaseURL(C2355b.m9113a(), a.mo7321c(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
        if (this.f4999e != null) {
            this.f4999e.onBannerAdLoaded(this, this.f4997c);
        }
    }

    public String getClientToken() {
        return this.f5002h;
    }

    public final AdPlacementType getPlacementType() {
        return AdPlacementType.BANNER;
    }

    public void onDestroy() {
        if (this.f4997c != null) {
            this.f4997c.destroy();
            this.f4997c = null;
            this.f4996b = null;
        }
    }
}
