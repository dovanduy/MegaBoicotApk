package com.startapp.android.publish.adsCommon.adinformation;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.android.publish.adsCommon.C5414k;
import com.startapp.android.publish.adsCommon.C5416l;
import com.startapp.android.publish.adsCommon.Utils.C5306h;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.android.publish.adsCommon.adinformation.AdInformationConfig.ImageResourceType;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5377e;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.common.metaData.C5487h;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences.Placement;

/* renamed from: com.startapp.android.publish.adsCommon.adinformation.b */
/* compiled from: StartAppSDK */
public class C5330b implements OnClickListener {

    /* renamed from: a */
    Context f17092a;

    /* renamed from: b */
    RelativeLayout f17093b;

    /* renamed from: c */
    RelativeLayout f17094c;

    /* renamed from: d */
    AdInformationConfig f17095d;

    /* renamed from: e */
    C5487h f17096e;

    /* renamed from: f */
    private C5340d f17097f;

    /* renamed from: g */
    private WebView f17098g;

    /* renamed from: h */
    private Dialog f17099h = null;

    /* renamed from: i */
    private Placement f17100i;

    /* renamed from: j */
    private Handler f17101j = new Handler();

    /* renamed from: k */
    private C5337a f17102k = C5337a.REGULAR;

    /* renamed from: l */
    private boolean f17103l = false;

    /* renamed from: m */
    private C5339c f17104m;

    /* renamed from: n */
    private Runnable f17105n = new Runnable() {
        public void run() {
            try {
                C5330b.this.mo19717d();
                C5330b.this.f17096e.mo20291a(C5330b.this.f17092a, true);
                C5330b.this.f17095d.mo19683a(C5330b.this.f17092a, true);
                C5330b.this.mo19714a(false);
            } catch (Exception e) {
                C5378f.m23018a(C5330b.this.f17092a, new C5377e(C5376d.EXCEPTION, "AdInformationObject.acceptRunnable failed", e.getMessage()), "");
            }
        }
    };

    /* renamed from: o */
    private Runnable f17106o = new Runnable() {
        public void run() {
            try {
                C5330b.this.mo19717d();
                C5416l.m23121b();
                C5330b.this.f17096e.mo20291a(C5330b.this.f17092a, false);
                C5330b.this.f17095d.mo19683a(C5330b.this.f17092a, true);
                C5330b.this.mo19714a(false);
            } catch (Exception e) {
                C5378f.m23018a(C5330b.this.f17092a, new C5377e(C5376d.EXCEPTION, "AdInformationObject.declineRunnable failed", e.getMessage()), "");
            }
        }
    };

    /* renamed from: p */
    private Runnable f17107p = new Runnable() {
        public void run() {
            try {
                C5330b.this.mo19717d();
                C5330b.this.mo19716c();
                C5330b.this.mo19714a(false);
            } catch (Exception e) {
                C5378f.m23018a(C5330b.this.f17092a, new C5377e(C5376d.EXCEPTION, "AdInformationObject.fullPrivacyPolicy failed", e.getMessage()), "");
            }
        }
    };

    /* renamed from: com.startapp.android.publish.adsCommon.adinformation.b$a */
    /* compiled from: StartAppSDK */
    public enum C5337a {
        REGULAR,
        LAYOUT
    }

    /* renamed from: com.startapp.android.publish.adsCommon.adinformation.b$b */
    /* compiled from: StartAppSDK */
    public enum C5338b {
        SMALL(ImageResourceType.INFO_S, ImageResourceType.INFO_EX_S),
        LARGE(ImageResourceType.INFO_L, ImageResourceType.INFO_EX_L);
        
        private ImageResourceType infoExtendedType;
        private ImageResourceType infoType;

        private C5338b(ImageResourceType imageResourceType, ImageResourceType imageResourceType2) {
            this.infoType = imageResourceType;
            this.infoExtendedType = imageResourceType2;
        }

        /* renamed from: a */
        public ImageResourceType mo19724a() {
            return this.infoType;
        }
    }

    public C5330b(Context context, C5338b bVar, Placement placement, C5339c cVar) {
        this.f17092a = context;
        this.f17100i = placement;
        this.f17104m = cVar;
        this.f17095d = m22748e();
        this.f17096e = MetaData.getInstance().getSimpleTokenConfig();
        C5340d dVar = new C5340d(context, bVar, placement, cVar, this);
        this.f17097f = dVar;
    }

    /* renamed from: a */
    public void mo19713a(RelativeLayout relativeLayout) {
        boolean z;
        if (m22749f() == null || !m22749f().mo19730e()) {
            z = m22748e().mo19685a(this.f17092a);
        } else {
            z = m22749f().mo19727b();
        }
        if (z) {
            this.f17094c = relativeLayout;
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            if (m22749f() == null || !m22749f().mo19729d()) {
                m22748e().mo19681a(this.f17100i).addRules(layoutParams);
            } else {
                m22749f().mo19728c().addRules(layoutParams);
            }
            this.f17094c.addView(this.f17097f, layoutParams);
        }
    }

    /* renamed from: a */
    public View mo19712a() {
        return this.f17097f;
    }

    /* renamed from: b */
    public boolean mo19715b() {
        return this.f17103l;
    }

    /* renamed from: a */
    public static AdInformationConfig m22743a(Context context) {
        return C5329a.m22737b().mo19707a();
    }

    /* renamed from: e */
    private AdInformationConfig m22748e() {
        return C5329a.m22737b().mo19707a();
    }

    /* renamed from: f */
    private C5339c m22749f() {
        return this.f17104m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo19714a(boolean z) {
        if (!this.f17100i.isInterstitial() && (this.f17092a instanceof Activity)) {
            C5307i.m22662a((Activity) this.f17092a, z);
        }
    }

    public void onClick(View view) {
        if (!this.f17096e.mo20294b(this.f17092a) || !(this.f17092a instanceof Activity) || ((Activity) this.f17092a).isFinishing()) {
            mo19716c();
        } else {
            mo19714a(true);
            this.f17093b = new RelativeLayout(this.f17092a);
            try {
                this.f17098g = new WebView(this.f17092a);
                this.f17098g.setWebViewClient(new WebViewClient());
                this.f17098g.setWebChromeClient(new WebChromeClient());
                this.f17098g.getSettings().setJavaScriptEnabled(true);
                this.f17098g.setHorizontalScrollBarEnabled(false);
                this.f17098g.setVerticalScrollBarEnabled(false);
                this.f17098g.loadUrl(m22744a(this.f17095d.mo19691f()));
                this.f17098g.addJavascriptInterface(new AdInformationJsInterface(this.f17092a, this.f17105n, this.f17106o, this.f17107p), "startappwall");
                Point point = new Point(1, 1);
                try {
                    C5306h.m22648a((WindowManager) this.f17092a.getSystemService("window"), point);
                    LayoutParams layoutParams = new LayoutParams(-1, -1);
                    layoutParams.addRule(13);
                    this.f17098g.setPadding(0, 0, 0, 0);
                    layoutParams.setMargins(0, 0, 0, 0);
                    this.f17093b.addView(this.f17098g, layoutParams);
                    m22750g();
                    switch (this.f17102k) {
                        case LAYOUT:
                            m22746b(this.f17093b, point);
                            break;
                        case REGULAR:
                            m22745a(this.f17093b, point);
                            break;
                    }
                } catch (Exception e) {
                    C5378f.m23016a(this.f17092a, C5376d.EXCEPTION, "AdInformationObject.onClick - system service failed", e.getMessage(), "");
                    mo19714a(false);
                }
            } catch (Exception e2) {
                C5378f.m23016a(this.f17092a, C5376d.EXCEPTION, "AdInformationObject.onClick - webview instantiation failed", e2.getMessage(), "");
                mo19714a(false);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo19716c() {
        if (!C5307i.m22674a(256) || !MetaData.getInstance().isInAppBrowser()) {
            C5349c.m22879c(this.f17092a, this.f17095d.mo19686b());
        } else {
            C5349c.m22877b(this.f17092a, this.f17095d.mo19686b(), "");
        }
    }

    /* renamed from: d */
    public void mo19717d() {
        this.f17103l = false;
        switch (this.f17102k) {
            case LAYOUT:
                this.f17101j.post(new Runnable() {
                    public void run() {
                        C5330b.this.f17094c.removeView(C5330b.this.f17093b);
                    }
                });
                return;
            case REGULAR:
                this.f17099h.dismiss();
                return;
            default:
                return;
        }
    }

    /* renamed from: g */
    private void m22750g() {
        String a = C5349c.m22848a(this.f17092a, (String) null);
        if (a != null) {
            WebView webView = this.f17098g;
            StringBuilder sb = new StringBuilder();
            sb.append("javascript:window.onload=function(){document.getElementById('titlePlacement').innerText='");
            sb.append(a);
            sb.append("';}");
            webView.loadUrl(sb.toString());
        }
    }

    /* renamed from: a */
    private void m22745a(ViewGroup viewGroup, Point point) {
        this.f17103l = true;
        this.f17099h = new Dialog(this.f17092a);
        this.f17099h.requestWindowFeature(1);
        this.f17099h.setContentView(viewGroup);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(this.f17099h.getWindow().getAttributes());
        layoutParams.width = (int) (((float) point.x) * 0.9f);
        layoutParams.height = (int) (((float) point.y) * 0.85f);
        this.f17099h.show();
        this.f17099h.getWindow().setAttributes(layoutParams);
    }

    /* renamed from: b */
    private void m22746b(final ViewGroup viewGroup, Point point) {
        this.f17103l = true;
        final LayoutParams layoutParams = new LayoutParams((int) (((float) point.x) * 0.9f), (int) (((float) point.y) * 0.85f));
        layoutParams.addRule(13);
        this.f17101j.post(new Runnable() {
            public void run() {
                C5330b.this.f17094c.addView(viewGroup, layoutParams);
            }
        });
    }

    /* renamed from: a */
    private String m22744a(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (m22747b(this.f17092a)) {
            sb.append("?le=true");
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m22747b(Context context) {
        return C5414k.m23092a(context, "shared_prefs_using_location", Boolean.valueOf(false)).booleanValue();
    }
}
