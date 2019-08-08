package com.startapp.android.publish.ads.p166a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.p055c.p056a.p057a.p058a.p060b.C1435a;
import com.p055c.p056a.p057a.p058a.p060b.C1437b;
import com.startapp.android.publish.ads.p167b.C5105c;
import com.startapp.android.publish.ads.splash.C5184b;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.android.publish.adsCommon.C5402i;
import com.startapp.android.publish.adsCommon.C5427m;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.p180d.C5362a;
import com.startapp.android.publish.adsCommon.p180d.C5363b;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.html.JsInterface;
import com.startapp.android.publish.omsdk.C5497a;
import com.startapp.common.C5523b;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5518g;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.android.publish.ads.a.c */
/* compiled from: StartAppSDK */
public class C5086c extends C5082b {

    /* renamed from: d */
    protected WebView f16448d;

    /* renamed from: e */
    protected C1437b f16449e;

    /* renamed from: f */
    protected RelativeLayout f16450f;

    /* renamed from: g */
    protected Runnable f16451g = new Runnable() {
        public void run() {
            C5086c.this.mo18733A();
            C5086c.this.mo18723p();
        }
    };

    /* renamed from: h */
    protected Runnable f16452h = new Runnable() {
        public void run() {
            C5086c.this.f16458n = true;
            C5086c.this.mo18742b(C5086c.this.f16448d);
        }
    };

    /* renamed from: i */
    private Long f16453i;

    /* renamed from: j */
    private Long f16454j;

    /* renamed from: k */
    private long f16455k = 0;

    /* renamed from: l */
    private long f16456l = 0;

    /* renamed from: m */
    private C5402i f16457m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f16458n = true;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f16459o = false;

    /* renamed from: com.startapp.android.publish.ads.a.c$a */
    /* compiled from: StartAppSDK */
    class C5093a extends WebViewClient {
        C5093a() {
        }

        public void onPageFinished(WebView webView, String str) {
            C5086c.this.mo18744c(webView);
            C5086c.this.mo18740a("gClientInterface.setMode", C5086c.this.mo18714g());
            C5086c.this.mo18740a("enableScheme", "externalLinks");
            C5086c.this.mo18738a((View) null);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("MyWebViewClient::shouldOverrideUrlLoading - [");
            sb.append(str);
            sb.append("]");
            C5518g.m23561a(2, sb.toString());
            if (!C5086c.this.f16459o || C5086c.this.f16458n) {
                return C5086c.this.mo18741a(str, false);
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo18744c(WebView webView) {
    }

    /* renamed from: a */
    public void mo18697a(Bundle bundle) {
        super.mo18697a(bundle);
        if (bundle == null) {
            if (mo18695a().hasExtra("lastLoadTime")) {
                this.f16453i = (Long) mo18695a().getSerializableExtra("lastLoadTime");
            }
            if (mo18695a().hasExtra("adCacheTtl")) {
                this.f16454j = (Long) mo18695a().getSerializableExtra("adCacheTtl");
                return;
            }
            return;
        }
        if (bundle.containsKey("postrollHtml")) {
            mo18700a(bundle.getString("postrollHtml"));
        }
        if (bundle.containsKey("lastLoadTime")) {
            this.f16453i = (Long) bundle.getSerializable("lastLoadTime");
        }
        if (bundle.containsKey("adCacheTtl")) {
            this.f16454j = (Long) bundle.getSerializable("adCacheTtl");
        }
    }

    /* renamed from: b */
    public void mo18707b(Bundle bundle) {
        super.mo18707b(bundle);
        if (mo18713f() != null) {
            bundle.putString("postrollHtml", mo18713f());
        }
        if (this.f16453i != null) {
            bundle.putLong("lastLoadTime", this.f16453i.longValue());
        }
        if (this.f16454j != null) {
            bundle.putLong("adCacheTtl", this.f16454j.longValue());
        }
    }

    /* renamed from: u */
    public void mo18728u() {
        if (mo18756F()) {
            C5518g.m23563a("InterstitialMode", 3, "Ad Cache TTL passed, finishing");
            mo18723p();
            return;
        }
        C5427m.m23145a().mo19990a(true);
        if (this.f16457m == null) {
            C5402i iVar = new C5402i(mo18705b(), mo18715h(), mo18735C(), mo18737E());
            this.f16457m = iVar;
        }
        if (this.f16448d == null) {
            this.f16450f = new RelativeLayout(mo18705b());
            this.f16450f.setContentDescription("StartApp Ad");
            this.f16450f.setId(AdsConstants.STARTAPP_AD_MAIN_LAYOUT_ID);
            mo18705b().setContentView(this.f16450f);
            try {
                this.f16448d = new WebView(mo18705b().getApplicationContext());
                this.f16448d.setBackgroundColor(-16777216);
                mo18705b().getWindow().getDecorView().findViewById(16908290).setBackgroundColor(7829367);
                this.f16448d.setVerticalScrollBarEnabled(false);
                this.f16448d.setHorizontalScrollBarEnabled(false);
                this.f16448d.getSettings().setJavaScriptEnabled(true);
                C5509c.m23512a(this.f16448d);
                if (this.f16427c) {
                    C5509c.m23513a(this.f16448d, (Paint) null);
                }
                this.f16448d.setOnLongClickListener(new OnLongClickListener() {
                    public boolean onLongClick(View view) {
                        return true;
                    }
                });
                this.f16448d.setLongClickable(false);
                this.f16448d.addJavascriptInterface(mo18746y(), "startappwall");
                mo18747z();
                mo18739a(this.f16448d);
                C5307i.m22663a((Context) mo18705b(), this.f16448d, mo18713f());
                this.f16459o = "true".equals(C5307i.m22659a(mo18713f(), "@jsTag@", "@jsTag@"));
                mo18745x();
                this.f16450f.addView(this.f16448d, new LayoutParams(-1, -1));
                mo18698a(this.f16450f);
            } catch (Exception e) {
                C5378f.m23016a(mo18705b(), C5376d.EXCEPTION, "InterstitialMode.onResume - WebView failed", e.getMessage(), "");
                mo18723p();
            }
        } else {
            C5509c.m23526c(this.f16448d);
            this.f16457m.mo19948a();
        }
        this.f16455k = System.currentTimeMillis();
    }

    /* renamed from: v */
    public void mo18729v() {
        super.mo18729v();
        if (this.f16449e != null) {
            this.f16449e.mo6486b();
            this.f16449e = null;
        }
        C5307i.m22672a((Object) this.f16448d, 1000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo18745x() {
        this.f16448d.setWebViewClient(new C5093a());
        this.f16448d.setWebChromeClient(new WebChromeClient());
    }

    /* renamed from: F */
    private boolean mo18756F() {
        if (mo18730w() instanceof C5105c) {
            return ((C5105c) mo18730w()).hasAdCacheTtlPassed();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public JsInterface mo18746y() {
        JsInterface jsInterface = new JsInterface(mo18705b(), this.f16451g, this.f16451g, this.f16452h, mo18734B(), mo18703a(0));
        return jsInterface;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo18747z() {
        this.f16457m.mo19948a();
    }

    /* renamed from: a */
    public void mo18739a(WebView webView) {
        this.f16458n = false;
        webView.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                C5086c.this.f16458n = true;
                if (motionEvent.getAction() == 2) {
                    return true;
                }
                return false;
            }
        });
    }

    /* renamed from: b */
    public void mo18742b(WebView webView) {
        if (webView != null) {
            webView.setOnTouchListener(null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18738a(View view) {
        if (MetaData.getInstance().isOmsdkEnabled() && this.f16449e == null) {
            this.f16449e = C5497a.m23461a(this.f16448d);
            if (this.f16449e != null && this.f16448d != null) {
                if (this.f16425a != null) {
                    View a = this.f16425a.mo19712a();
                    if (a != null) {
                        this.f16449e.mo6487b(a);
                    }
                }
                if (view != null) {
                    this.f16449e.mo6487b(view);
                }
                this.f16449e.mo6485a(this.f16448d);
                this.f16449e.mo6484a();
                C1435a.m5917a(this.f16449e).mo6473a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18740a(String str, Object... objArr) {
        C5307i.m22668a(this.f16448d, str, objArr);
    }

    /* renamed from: b */
    private boolean m21952b(C5286Ad ad) {
        return C5307i.m22674a(8) && (ad instanceof C5184b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18741a(String str, boolean z) {
        this.f16457m.mo19950a(true);
        boolean z2 = C5349c.m22870a(mo18705b().getApplicationContext(), this.f16426b) && !m21952b(mo18730w());
        if (mo18743b(str)) {
            try {
                int a = C5349c.m22845a(str);
                if (!mo18711d()[a] || z2) {
                    C5518g.m23561a(6, "forceExternal - interMode - redirect");
                    m21950b(str, a, z);
                } else {
                    C5518g.m23561a(6, "forceExternal -interMode - smartredirect");
                    m21947a(str, a, z);
                }
            } catch (Exception unused) {
                C5518g.m23561a(6, "Error while trying parsing index from url");
                return false;
            }
        } else if (!mo18711d()[0] || z2) {
            C5518g.m23561a(6, "forceExternal - interMode - smartredirect");
            m21950b(str, 0, z);
        } else {
            C5518g.m23561a(6, "forceExternal - interMode - redirectr");
            m21947a(str, 0, z);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo18743b(String str) {
        return !this.f16459o && str.contains("index=");
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo18733A() {
        String[] l = mo18719l();
        if (l != null && l.length > 0 && mo18719l()[0] != null) {
            C5349c.m22876b((Context) mo18705b(), mo18719l()[0], mo18734B());
        }
    }

    /* renamed from: a */
    private void m21947a(String str, int i, boolean z) {
        int i2 = i;
        Activity b = mo18705b();
        String str2 = null;
        String str3 = i2 < mo18716i().length ? mo18716i()[i2] : null;
        if (i2 < mo18717j().length) {
            str2 = mo18717j()[i2];
        }
        C5349c.m22860a(b, str, str3, str2, mo18734B(), C5344b.m22784a().mo19749A(), C5344b.m22784a().mo19750B(), mo18703a(i2), mo18706b(i2), z, new Runnable() {
            public void run() {
                C5086c.this.mo18723p();
            }
        });
    }

    /* renamed from: b */
    private void m21950b(String str, int i, boolean z) {
        C5523b.m23588a((Context) mo18705b()).mo20506a(new Intent("com.startapp.android.OnClickCallback"));
        C5349c.m22857a(mo18705b(), str, i < mo18716i().length ? mo18716i()[i] : null, mo18734B(), mo18703a(i) && !C5349c.m22870a(mo18705b().getApplicationContext(), this.f16426b), z);
        mo18723p();
    }

    /* renamed from: p */
    public void mo18723p() {
        super.mo18723p();
        C5427m.m23145a().mo19990a(false);
        if (this.f16457m != null) {
            this.f16457m.mo19950a(false);
        }
        mo18705b().runOnUiThread(new Runnable() {
            public void run() {
                if (C5086c.this.f16448d != null) {
                    C5509c.m23524b(C5086c.this.f16448d);
                }
            }
        });
    }

    /* renamed from: s */
    public void mo18726s() {
        if (this.f16457m != null) {
            this.f16457m.mo19951b();
        }
        if (this.f16425a != null && this.f16425a.mo19715b()) {
            this.f16425a.mo19717d();
        }
        if (this.f16448d != null) {
            C5509c.m23524b(this.f16448d);
        }
        if (mo18714g().equals("back")) {
            mo18723p();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public C5363b mo18734B() {
        return new C5362a(mo18736D(), mo18721n());
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C5363b mo18735C() {
        return new C5363b(mo18721n());
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public String mo18736D() {
        this.f16456l = System.currentTimeMillis();
        return String.valueOf(((double) (this.f16456l - this.f16455k)) / 1000.0d);
    }

    /* renamed from: r */
    public boolean mo18725r() {
        mo18733A();
        C5427m.m23145a().mo19990a(false);
        this.f16457m.mo19950a(false);
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public long mo18737E() {
        if (mo18722o() != null) {
            return TimeUnit.SECONDS.toMillis(mo18722o().longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.getInstance().getIABDisplayImpressionDelayInSeconds());
    }
}
