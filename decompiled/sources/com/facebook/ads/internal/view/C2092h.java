package com.facebook.ads.internal.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.C1609c;
import com.facebook.ads.internal.adapters.C1645l;
import com.facebook.ads.internal.adapters.C1646m;
import com.facebook.ads.internal.p070a.C1563b;
import com.facebook.ads.internal.p070a.C1564c;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import com.facebook.ads.internal.p115w.p120e.C2355b;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.p101c.C1967a;
import com.facebook.ads.internal.view.p101c.C1967a.C1970b;
import com.facebook.ads.internal.view.p101c.C1967a.C1971c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.h */
public class C2092h implements C1910a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f6679a = "h";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1911a f6680b;

    /* renamed from: c */
    private final C1967a f6681c;

    /* renamed from: d */
    private final C1970b f6682d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1646m f6683e;

    /* renamed from: f */
    private final C1802c f6684f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1645l f6685g;

    public C2092h(final AudienceNetworkActivity audienceNetworkActivity, final C1802c cVar, C1911a aVar) {
        this.f6680b = aVar;
        this.f6684f = cVar;
        this.f6682d = new C1971c() {

            /* renamed from: d */
            private long f6689d = 0;

            /* renamed from: a */
            public void mo7248a() {
                C2092h.this.f6683e.mo7328b();
            }

            /* renamed from: a */
            public void mo7249a(String str, Map<String, String> map) {
                Uri parse = Uri.parse(str);
                if (!"fbad".equals(parse.getScheme()) || !"close".equals(parse.getAuthority())) {
                    long j = this.f6689d;
                    this.f6689d = System.currentTimeMillis();
                    if (this.f6689d - j >= 1000) {
                        if ("fbad".equals(parse.getScheme()) && C1564c.m6495a(parse.getAuthority())) {
                            C2092h.this.f6680b.mo6795a("com.facebook.ads.interstitial.clicked");
                        }
                        C1563b a = C1564c.m6493a(audienceNetworkActivity, cVar, C2092h.this.f6685g.getClientToken(), parse, map);
                        if (a != null) {
                            try {
                                a.mo7058a();
                                return;
                            } catch (Exception e) {
                                Log.e(C2092h.f6679a, "Error executing action", e);
                            }
                        }
                        return;
                    }
                    return;
                }
                audienceNetworkActivity.finish();
            }

            /* renamed from: b */
            public void mo7250b() {
                C2092h.this.f6683e.mo7111a();
            }
        };
        this.f6681c = new C1967a(audienceNetworkActivity, new WeakReference(this.f6682d), 1);
        this.f6681c.setLayoutParams(new LayoutParams(-1, -1));
        AudienceNetworkActivity audienceNetworkActivity2 = audienceNetworkActivity;
        C1802c cVar2 = cVar;
        C1646m mVar = new C1646m(audienceNetworkActivity2, cVar2, this.f6681c, this.f6681c.getViewabilityChecker(), new C1609c() {
            /* renamed from: a */
            public void mo7238a() {
                C2092h.this.f6680b.mo6795a("com.facebook.ads.interstitial.impression.logged");
            }
        });
        this.f6683e = mVar;
        aVar.mo6793a((View) this.f6681c);
    }

    /* renamed from: a */
    public void mo7268a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        if (bundle == null || !bundle.containsKey("dataModel")) {
            this.f6685g = C1645l.m6883b(intent);
            if (this.f6685g != null) {
                this.f6683e.mo7327a(this.f6685g);
                this.f6681c.loadDataWithBaseURL(C2355b.m9113a(), this.f6685g.mo7321c(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
                this.f6681c.mo8067a(this.f6685g.mo7324f(), this.f6685g.mo7325g());
            }
            return;
        }
        this.f6685g = C1645l.m6881a(bundle.getBundle("dataModel"));
        if (this.f6685g != null) {
            this.f6681c.loadDataWithBaseURL(C2355b.m9113a(), this.f6685g.mo7321c(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
            this.f6681c.mo8067a(this.f6685g.mo7324f(), this.f6685g.mo7325g());
        }
    }

    /* renamed from: a */
    public void mo7270a(Bundle bundle) {
        if (this.f6685g != null) {
            bundle.putBundle("dataModel", this.f6685g.mo7326h());
        }
    }

    /* renamed from: a_ */
    public void mo7271a_(boolean z) {
        this.f6681c.onPause();
    }

    /* renamed from: b */
    public void mo7272b(boolean z) {
        this.f6681c.onResume();
    }

    public void onDestroy() {
        if (this.f6685g != null && !TextUtils.isEmpty(this.f6685g.getClientToken())) {
            HashMap hashMap = new HashMap();
            this.f6681c.getViewabilityChecker().mo8779a((Map<String, String>) hashMap);
            hashMap.put("touch", C2323k.m9046a(this.f6681c.getTouchData()));
            this.f6684f.mo7699l(this.f6685g.getClientToken(), hashMap);
        }
        C2355b.m9114a(this.f6681c);
        this.f6681c.destroy();
    }

    public void setListener(C1911a aVar) {
    }
}
