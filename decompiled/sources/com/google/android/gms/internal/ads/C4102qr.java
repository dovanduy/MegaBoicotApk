package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.facebook.ads.AudienceNetworkActivity;
import com.google.android.exoplayer2.C2793C;
import com.google.android.gms.ads.internal.C3018ap;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.C3049bt;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import com.google.android.gms.ads.internal.overlay.C3107c;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.common.util.C3563o;
import com.google.android.gms.common.util.C3564p;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.qr */
final class C4102qr extends WebView implements OnGlobalLayoutListener, DownloadListener, C4089qe {
    @GuardedBy("this")

    /* renamed from: A */
    private int f13873A;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: B */
    public int f13874B;

    /* renamed from: C */
    private asf f13875C;

    /* renamed from: D */
    private asf f13876D;

    /* renamed from: E */
    private asf f13877E;

    /* renamed from: F */
    private asg f13878F;

    /* renamed from: G */
    private WeakReference<OnClickListener> f13879G;
    @GuardedBy("this")

    /* renamed from: H */
    private C3107c f13880H;
    @GuardedBy("this")

    /* renamed from: I */
    private boolean f13881I;

    /* renamed from: J */
    private C3974ly f13882J;

    /* renamed from: K */
    private int f13883K = -1;

    /* renamed from: L */
    private int f13884L = -1;

    /* renamed from: M */
    private int f13885M = -1;

    /* renamed from: N */
    private int f13886N = -1;

    /* renamed from: O */
    private Map<String, C4073pp> f13887O;

    /* renamed from: P */
    private final WindowManager f13888P;

    /* renamed from: Q */
    private final amj f13889Q;

    /* renamed from: a */
    private final C4129rr f13890a;

    /* renamed from: b */
    private final agw f13891b;

    /* renamed from: c */
    private final zzang f13892c;

    /* renamed from: d */
    private final C3018ap f13893d;

    /* renamed from: e */
    private final C3049bt f13894e;

    /* renamed from: f */
    private final DisplayMetrics f13895f;

    /* renamed from: g */
    private final float f13896g;

    /* renamed from: h */
    private boolean f13897h = false;

    /* renamed from: i */
    private boolean f13898i = false;

    /* renamed from: j */
    private C4090qf f13899j;
    @GuardedBy("this")

    /* renamed from: k */
    private C3107c f13900k;
    @GuardedBy("this")

    /* renamed from: l */
    private C4130rs f13901l;
    @GuardedBy("this")

    /* renamed from: m */
    private String f13902m;
    @GuardedBy("this")

    /* renamed from: n */
    private boolean f13903n;
    @GuardedBy("this")

    /* renamed from: o */
    private boolean f13904o;
    @GuardedBy("this")

    /* renamed from: p */
    private boolean f13905p;
    @GuardedBy("this")

    /* renamed from: q */
    private boolean f13906q;
    @GuardedBy("this")

    /* renamed from: r */
    private Boolean f13907r;
    @GuardedBy("this")

    /* renamed from: s */
    private int f13908s;
    @GuardedBy("this")

    /* renamed from: t */
    private boolean f13909t = true;
    @GuardedBy("this")

    /* renamed from: u */
    private boolean f13910u = false;
    @GuardedBy("this")

    /* renamed from: v */
    private String f13911v = "";
    @GuardedBy("this")

    /* renamed from: w */
    private C4105qu f13912w;
    @GuardedBy("this")

    /* renamed from: x */
    private boolean f13913x;
    @GuardedBy("this")

    /* renamed from: y */
    private boolean f13914y;
    @GuardedBy("this")

    /* renamed from: z */
    private ati f13915z;

    private C4102qr(C4129rr rrVar, C4130rs rsVar, String str, boolean z, boolean z2, agw agw, zzang zzang, ash ash, C3018ap apVar, C3049bt btVar, amj amj) {
        super(rrVar);
        this.f13890a = rrVar;
        this.f13901l = rsVar;
        this.f13902m = str;
        this.f13905p = z;
        this.f13908s = -1;
        this.f13891b = agw;
        this.f13892c = zzang;
        this.f13893d = apVar;
        this.f13894e = btVar;
        this.f13888P = (WindowManager) getContext().getSystemService("window");
        C3025aw.m10917e();
        this.f13895f = C3909jn.m17124a(this.f13888P);
        this.f13896g = this.f13895f.density;
        this.f13889Q = amj;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            C3900je.m17430b("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        C3025aw.m10917e().mo15515a((Context) rrVar, zzang.f14505a, settings);
        C3025aw.m10919g().mo15543a(getContext(), settings);
        setDownloadListener(this);
        m17829O();
        if (C3563o.m12766e()) {
            addJavascriptInterface(C4108qx.m17924a(this), "googleAdsJsInterface");
        }
        if (C3563o.m12762a()) {
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        }
        this.f13882J = new C3974ly(this.f13890a.mo15991a(), this, this, null);
        m17834T();
        this.f13878F = new asg(new ash(true, "make_wv", this.f13902m));
        this.f13878F.mo14714a().mo14719a(ash);
        this.f13876D = asa.m15039a(this.f13878F.mo14714a());
        this.f13878F.mo14715a("native:view_create", this.f13876D);
        this.f13877E = null;
        this.f13875C = null;
        C3025aw.m10919g().mo15547b((Context) rrVar);
        C3025aw.m10921i().mo15446i();
    }

    /* renamed from: K */
    private final boolean m17825K() {
        int i;
        int i2;
        boolean z = false;
        if (!this.f13899j.mo15942b() && !this.f13899j.mo15943c()) {
            return false;
        }
        aoq.m14615a();
        int b = C3975lz.m17380b(this.f13895f, this.f13895f.widthPixels);
        aoq.m14615a();
        int b2 = C3975lz.m17380b(this.f13895f, this.f13895f.heightPixels);
        Activity a = this.f13890a.mo15991a();
        if (a == null || a.getWindow() == null) {
            i2 = b;
            i = b2;
        } else {
            C3025aw.m10917e();
            int[] a2 = C3909jn.m17150a(a);
            aoq.m14615a();
            int b3 = C3975lz.m17380b(this.f13895f, a2[0]);
            aoq.m14615a();
            i = C3975lz.m17380b(this.f13895f, a2[1]);
            i2 = b3;
        }
        if (this.f13884L == b && this.f13883K == b2 && this.f13885M == i2 && this.f13886N == i) {
            return false;
        }
        if (!(this.f13884L == b && this.f13883K == b2)) {
            z = true;
        }
        this.f13884L = b;
        this.f13883K = b2;
        this.f13885M = i2;
        this.f13886N = i;
        new C4003n(this).mo15651a(b, b2, i2, i, this.f13895f.density, this.f13888P.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: L */
    private final synchronized void m17826L() {
        this.f13907r = C3025aw.m10921i().mo15440c();
        if (this.f13907r == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                m17838a(Boolean.valueOf(true));
            } catch (IllegalStateException unused) {
                m17838a(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: M */
    private final synchronized Boolean m17827M() {
        return this.f13907r;
    }

    /* renamed from: N */
    private final void m17828N() {
        asa.m15040a(this.f13878F.mo14714a(), this.f13876D, "aeh2");
    }

    /* renamed from: O */
    private final synchronized void m17829O() {
        if (!this.f13905p) {
            if (!this.f13901l.mo15997d()) {
                if (VERSION.SDK_INT < 18) {
                    C3900je.m17429b("Disabling hardware acceleration on an AdView.");
                    m17830P();
                    return;
                }
                C3900je.m17429b("Enabling hardware acceleration on an AdView.");
                m17831Q();
                return;
            }
        }
        C3900je.m17429b("Enabling hardware acceleration on an overlay.");
        m17831Q();
    }

    /* renamed from: P */
    private final synchronized void m17830P() {
        if (!this.f13906q) {
            C3025aw.m10919g().mo15551c((View) this);
        }
        this.f13906q = true;
    }

    /* renamed from: Q */
    private final synchronized void m17831Q() {
        if (this.f13906q) {
            C3025aw.m10919g().mo15548b((View) this);
        }
        this.f13906q = false;
    }

    /* renamed from: R */
    private final synchronized void m17832R() {
        if (!this.f13881I) {
            this.f13881I = true;
            C3025aw.m10921i().mo15447j();
        }
    }

    /* renamed from: S */
    private final synchronized void m17833S() {
        this.f13887O = null;
    }

    /* renamed from: T */
    private final void m17834T() {
        if (this.f13878F != null) {
            ash a = this.f13878F.mo14714a();
            if (!(a == null || C3025aw.m10921i().mo15438b() == null)) {
                C3025aw.m10921i().mo15438b().mo14707a(a);
            }
        }
    }

    /* renamed from: a */
    static C4102qr m17837a(Context context, C4130rs rsVar, String str, boolean z, boolean z2, agw agw, zzang zzang, ash ash, C3018ap apVar, C3049bt btVar, amj amj) {
        C4102qr qrVar = new C4102qr(new C4129rr(context), rsVar, str, z, z2, agw, zzang, ash, apVar, btVar, amj);
        return qrVar;
    }

    /* renamed from: a */
    private final void m17838a(Boolean bool) {
        synchronized (this) {
            this.f13907r = bool;
        }
        C3025aw.m10921i().mo15435a(bool);
    }

    @TargetApi(19)
    /* renamed from: a */
    private final synchronized void m17839a(String str, ValueCallback<String> valueCallback) {
        if (!mo15864A()) {
            evaluateJavascript(str, null);
        } else {
            C3900je.m17435e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: c */
    private final synchronized void m17841c(String str) {
        if (!mo15864A()) {
            loadUrl(str);
        } else {
            C3900je.m17435e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: d */
    private final synchronized void m17842d(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e) {
            C3025aw.m10921i().mo15436a(e, "AdWebViewImpl.loadUrlUnsafe");
            C3900je.m17432c("Could not call loadUrl. ", e);
        }
    }

    /* renamed from: e */
    private final void m17843e(String str) {
        if (C3563o.m12768g()) {
            if (m17827M() == null) {
                m17826L();
            }
            if (m17827M().booleanValue()) {
                m17839a(str, null);
                return;
            }
            String str2 = "javascript:";
            String valueOf = String.valueOf(str);
            m17841c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return;
        }
        String str3 = "javascript:";
        String valueOf2 = String.valueOf(str);
        m17841c(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
    }

    /* renamed from: f */
    private final void m17844f(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        mo14986a("onAdVisibilityChanged", (Map<String, ?>) hashMap);
    }

    /* renamed from: A */
    public final synchronized boolean mo15864A() {
        return this.f13904o;
    }

    /* renamed from: B */
    public final synchronized void mo15865B() {
        C3900je.m17043a("Destroying WebView!");
        m17832R();
        C3909jn.f13411a.post(new C4104qt(this));
    }

    /* renamed from: C */
    public final synchronized boolean mo15866C() {
        return this.f13909t;
    }

    /* renamed from: D */
    public final synchronized boolean mo15867D() {
        return this.f13910u;
    }

    /* renamed from: E */
    public final synchronized boolean mo15868E() {
        return this.f13873A > 0;
    }

    /* renamed from: F */
    public final void mo15869F() {
        this.f13882J.mo15617a();
    }

    /* renamed from: G */
    public final void mo15870G() {
        if (this.f13877E == null) {
            this.f13877E = asa.m15039a(this.f13878F.mo14714a());
            this.f13878F.mo14715a("native:view_load", this.f13877E);
        }
    }

    /* renamed from: H */
    public final synchronized ati mo15871H() {
        return this.f13915z;
    }

    /* renamed from: I */
    public final void mo15872I() {
        setBackgroundColor(0);
    }

    /* renamed from: J */
    public final void mo15873J() {
        C3900je.m17043a("Cannot add text view to inner AdWebView");
    }

    /* renamed from: a */
    public final C4051ou mo15796a() {
        return null;
    }

    /* renamed from: a */
    public final void mo15874a(int i) {
        if (i == 0) {
            asa.m15040a(this.f13878F.mo14714a(), this.f13876D, "aebb2");
        }
        m17828N();
        if (this.f13878F.mo14714a() != null) {
            this.f13878F.mo14714a().mo14721a("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f13892c.f14505a);
        mo14986a("onhide", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo15875a(Context context) {
        this.f13890a.setBaseContext(context);
        this.f13882J.mo15618a(this.f13890a.mo15991a());
    }

    /* renamed from: a */
    public final synchronized void mo15876a(C3107c cVar) {
        this.f13900k = cVar;
    }

    /* renamed from: a */
    public final void mo15968a(zzc zzc) {
        this.f13899j.mo15929a(zzc);
    }

    /* renamed from: a */
    public final void mo14431a(akj akj) {
        synchronized (this) {
            this.f13913x = akj.f11271a;
        }
        m17844f(akj.f11271a);
    }

    /* renamed from: a */
    public final synchronized void mo15877a(ati ati) {
        this.f13915z = ati;
    }

    /* renamed from: a */
    public final synchronized void mo15797a(C4105qu quVar) {
        if (this.f13912w != null) {
            C3900je.m17431c("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f13912w = quVar;
        }
    }

    /* renamed from: a */
    public final synchronized void mo15878a(C4130rs rsVar) {
        this.f13901l = rsVar;
        requestLayout();
    }

    /* renamed from: a */
    public final synchronized void mo15879a(String str) {
        if (str == null) {
            str = "";
        }
        this.f13911v = str;
    }

    /* renamed from: a */
    public final void mo15880a(String str, C3067ae<? super C4089qe> aeVar) {
        if (this.f13899j != null) {
            this.f13899j.mo15935a(str, aeVar);
        }
    }

    /* renamed from: a */
    public final void mo15881a(String str, C3564p<C3067ae<? super C4089qe>> pVar) {
        if (this.f13899j != null) {
            this.f13899j.mo15936a(str, pVar);
        }
    }

    /* renamed from: a */
    public final synchronized void mo15882a(String str, String str2, String str3) {
        if (!mo15864A()) {
            if (((Boolean) aoq.m14620f().mo14695a(aru.f11777aB)).booleanValue()) {
                str2 = C4118rg.m17946a(str2, C4118rg.m17945a());
            }
            super.loadDataWithBaseURL(str, str2, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, C2793C.UTF8_NAME, str3);
            return;
        }
        C3900je.m17435e("#004 The webview is destroyed. Ignoring action.");
    }

    /* renamed from: a */
    public final void mo14986a(String str, Map<String, ?> map) {
        try {
            mo14987a(str, C3025aw.m10917e().mo15514a(map));
        } catch (JSONException unused) {
            C3900je.m17435e("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: a */
    public final void mo14987a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String str2 = "Dispatching AFMA event: ";
        String valueOf = String.valueOf(sb.toString());
        C3900je.m17429b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        m17843e(sb.toString());
    }

    /* renamed from: a */
    public final void mo15798a(boolean z) {
        this.f13899j.mo15937a(z);
    }

    /* renamed from: a */
    public final void mo15969a(boolean z, int i) {
        this.f13899j.mo15938a(z, i);
    }

    /* renamed from: a */
    public final void mo15970a(boolean z, int i, String str) {
        this.f13899j.mo15939a(z, i, str);
    }

    /* renamed from: a */
    public final void mo15971a(boolean z, int i, String str, String str2) {
        this.f13899j.mo15940a(z, i, str, str2);
    }

    /* renamed from: b */
    public final synchronized C4105qu mo15799b() {
        return this.f13912w;
    }

    /* renamed from: b */
    public final synchronized void mo15883b(C3107c cVar) {
        this.f13880H = cVar;
    }

    /* renamed from: b */
    public final void mo14993b(String str) {
        m17843e(str);
    }

    /* renamed from: b */
    public final void mo15884b(String str, C3067ae<? super C4089qe> aeVar) {
        if (this.f13899j != null) {
            this.f13899j.mo15941b(str, aeVar);
        }
    }

    /* renamed from: b */
    public final void mo14994b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(3 + String.valueOf(str).length() + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        m17843e(sb.toString());
    }

    /* renamed from: b */
    public final synchronized void mo15885b(boolean z) {
        boolean z2 = z != this.f13905p;
        this.f13905p = z;
        m17829O();
        if (z2) {
            new C4003n(this).mo15655c(z ? "expanded" : RewardedVideo.VIDEO_MODE_DEFAULT);
        }
    }

    /* renamed from: c */
    public final asf mo15800c() {
        return this.f13876D;
    }

    /* renamed from: c */
    public final synchronized void mo15886c(boolean z) {
        if (this.f13900k != null) {
            this.f13900k.mo12666a(this.f13899j.mo15942b(), z);
        } else {
            this.f13903n = z;
        }
    }

    /* renamed from: d */
    public final Activity mo15801d() {
        return this.f13890a.mo15991a();
    }

    /* renamed from: d */
    public final synchronized void mo15887d(boolean z) {
        this.f13909t = z;
    }

    public final synchronized void destroy() {
        m17834T();
        this.f13882J.mo15619b();
        if (this.f13900k != null) {
            this.f13900k.mo12660a();
            this.f13900k.mo12677k();
            this.f13900k = null;
        }
        this.f13899j.mo15951k();
        if (!this.f13904o) {
            C3025aw.m10938z();
            C4072po.m17647a((C4061pd) this);
            m17833S();
            this.f13904o = true;
            C3900je.m17043a("Initiating WebView self destruct sequence in 3...");
            C3900je.m17043a("Loading blank page in WebView, 2...");
            m17842d("about:blank");
        }
    }

    /* renamed from: e */
    public final C3049bt mo15802e() {
        return this.f13894e;
    }

    /* renamed from: e */
    public final synchronized void mo15889e(boolean z) {
        this.f13873A += z ? 1 : -1;
        if (this.f13873A <= 0 && this.f13900k != null) {
            this.f13900k.mo12683q();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mo15864A()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.C3900je.m17436f(r2)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0012
            r2 = 0
            r3.onReceiveValue(r2)     // Catch:{ all -> 0x0019 }
        L_0x0012:
            monitor-exit(r1)
            return
        L_0x0014:
            super.evaluateJavascript(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4102qr.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    /* renamed from: f */
    public final void mo15803f() {
        C3107c r = mo15909r();
        if (r != null) {
            r.mo12682p();
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.f13904o) {
                    this.f13899j.mo15951k();
                    C3025aw.m10938z();
                    C4072po.m17647a((C4061pd) this);
                    m17833S();
                    m17832R();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* renamed from: g */
    public final synchronized String mo15804g() {
        return this.f13911v;
    }

    public final OnClickListener getOnClickListener() {
        return (OnClickListener) this.f13879G.get();
    }

    public final synchronized int getRequestedOrientation() {
        return this.f13908s;
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    /* renamed from: j */
    public final asg mo15806j() {
        return this.f13878F;
    }

    /* renamed from: j_ */
    public final synchronized void mo12502j_() {
        this.f13910u = true;
        if (this.f13893d != null) {
            this.f13893d.mo12502j_();
        }
    }

    /* renamed from: k */
    public final zzang mo15807k() {
        return this.f13892c;
    }

    /* renamed from: k_ */
    public final synchronized void mo12503k_() {
        this.f13910u = false;
        if (this.f13893d != null) {
            this.f13893d.mo12503k_();
        }
    }

    /* renamed from: l */
    public final int mo15808l() {
        return getMeasuredHeight();
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!mo15864A()) {
            super.loadData(str, str2, str3);
        } else {
            C3900je.m17435e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo15864A()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            C3900je.m17435e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!mo15864A()) {
            try {
                super.loadUrl(str);
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                C3025aw.m10921i().mo15436a(e, "AdWebViewImpl.loadUrl");
                C3900je.m17432c("Could not call loadUrl. ", e);
            }
        } else {
            C3900je.m17435e("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: m */
    public final int mo15809m() {
        return getMeasuredWidth();
    }

    /* renamed from: n */
    public final void mo15903n() {
        m17828N();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f13892c.f14505a);
        mo14986a("onhide", (Map<String, ?>) hashMap);
    }

    /* renamed from: o */
    public final void mo15904o() {
        if (this.f13875C == null) {
            asa.m15040a(this.f13878F.mo14714a(), this.f13876D, "aes2");
            this.f13875C = asa.m15039a(this.f13878F.mo14714a());
            this.f13878F.mo14715a("native:view_show", this.f13875C);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f13892c.f14505a);
        mo14986a("onshow", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo15864A()) {
            this.f13882J.mo15620c();
        }
        boolean z = this.f13913x;
        if (this.f13899j != null && this.f13899j.mo15943c()) {
            if (!this.f13914y) {
                OnGlobalLayoutListener d = this.f13899j.mo15944d();
                if (d != null) {
                    C3025aw.m10907A();
                    if (this == null) {
                        throw null;
                    }
                    C4027nx.m17491a((View) this, d);
                }
                OnScrollChangedListener e = this.f13899j.mo15945e();
                if (e != null) {
                    C3025aw.m10907A();
                    if (this == null) {
                        throw null;
                    }
                    C4027nx.m17492a((View) this, e);
                }
                this.f13914y = true;
            }
            m17825K();
            z = true;
        }
        m17844f(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!mo15864A()) {
                this.f13882J.mo15621d();
            }
            super.onDetachedFromWindow();
            if (this.f13914y && this.f13899j != null && this.f13899j.mo15943c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                OnGlobalLayoutListener d = this.f13899j.mo15944d();
                if (d != null) {
                    C3025aw.m10919g().mo15541a(getViewTreeObserver(), d);
                }
                OnScrollChangedListener e = this.f13899j.mo15945e();
                if (e != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(e);
                }
                this.f13914y = false;
            }
        }
        m17844f(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            C3025aw.m10917e();
            C3909jn.m17136a(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(51 + String.valueOf(str).length() + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            C3900je.m17429b(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (!mo15864A()) {
            if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                if (!(this.f13899j == null || this.f13899j.mo15952l() == null)) {
                    this.f13899j.mo15952l().mo12592a();
                }
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11826ay)).booleanValue()) {
            float axisValue = motionEvent.getAxisValue(9);
            float axisValue2 = motionEvent.getAxisValue(10);
            if (motionEvent.getActionMasked() == 8 && ((axisValue > 0.0f && !canScrollVertically(-1)) || ((axisValue < 0.0f && !canScrollVertically(1)) || ((axisValue2 > 0.0f && !canScrollHorizontally(-1)) || (axisValue2 < 0.0f && !canScrollHorizontally(1)))))) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean K = m17825K();
        C3107c r = mo15909r();
        if (r != null && K) {
            r.mo12681o();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01d0, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ae A[SYNTHETIC, Splitter:B:100:0x01ae] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0143  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:110:0x01d1=Splitter:B:110:0x01d1, B:52:0x00b7=Splitter:B:52:0x00b7} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.mo15864A()     // Catch:{ all -> 0x01d6 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01d6 }
            if (r0 != 0) goto L_0x01d1
            boolean r0 = r7.f13905p     // Catch:{ all -> 0x01d6 }
            if (r0 != 0) goto L_0x01d1
            com.google.android.gms.internal.ads.rs r0 = r7.f13901l     // Catch:{ all -> 0x01d6 }
            boolean r0 = r0.mo15998e()     // Catch:{ all -> 0x01d6 }
            if (r0 == 0) goto L_0x0021
            goto L_0x01d1
        L_0x0021:
            com.google.android.gms.internal.ads.rs r0 = r7.f13901l     // Catch:{ all -> 0x01d6 }
            boolean r0 = r0.mo15999f()     // Catch:{ all -> 0x01d6 }
            if (r0 == 0) goto L_0x006b
            com.google.android.gms.internal.ads.qu r0 = r7.mo15799b()     // Catch:{ all -> 0x01d6 }
            r1 = 0
            if (r0 == 0) goto L_0x0035
            float r0 = r0.mo14570e()     // Catch:{ all -> 0x01d6 }
            goto L_0x0036
        L_0x0035:
            r0 = r1
        L_0x0036:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x003f
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r7)
            return
        L_0x003f:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01d6 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01d6 }
            float r1 = (float) r9     // Catch:{ all -> 0x01d6 }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01d6 }
            float r2 = (float) r8     // Catch:{ all -> 0x01d6 }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01d6 }
            if (r9 != 0) goto L_0x0056
            if (r2 == 0) goto L_0x0056
            float r9 = (float) r2     // Catch:{ all -> 0x01d6 }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01d6 }
            r9 = r2
            goto L_0x005e
        L_0x0056:
            if (r8 != 0) goto L_0x005e
            if (r1 == 0) goto L_0x005e
            float r8 = (float) r1     // Catch:{ all -> 0x01d6 }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01d6 }
            r8 = r1
        L_0x005e:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01d6 }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01d6 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r7)
            return
        L_0x006b:
            com.google.android.gms.internal.ads.rs r0 = r7.f13901l     // Catch:{ all -> 0x01d6 }
            boolean r0 = r0.mo15996c()     // Catch:{ all -> 0x01d6 }
            if (r0 == 0) goto L_0x00bc
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.aru.f11920cm     // Catch:{ all -> 0x01d6 }
            com.google.android.gms.internal.ads.ars r1 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x01d6 }
            java.lang.Object r0 = r1.mo14695a(r0)     // Catch:{ all -> 0x01d6 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01d6 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01d6 }
            if (r0 != 0) goto L_0x00b7
            boolean r0 = com.google.android.gms.common.util.C3563o.m12766e()     // Catch:{ all -> 0x01d6 }
            if (r0 != 0) goto L_0x008c
            goto L_0x00b7
        L_0x008c:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.qs r1 = new com.google.android.gms.internal.ads.qs     // Catch:{ all -> 0x01d6 }
            r1.<init>(r7)     // Catch:{ all -> 0x01d6 }
            r7.mo15880a(r0, r1)     // Catch:{ all -> 0x01d6 }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.m17843e(r0)     // Catch:{ all -> 0x01d6 }
            android.util.DisplayMetrics r0 = r7.f13895f     // Catch:{ all -> 0x01d6 }
            float r0 = r0.density     // Catch:{ all -> 0x01d6 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01d6 }
            int r1 = r7.f13874B     // Catch:{ all -> 0x01d6 }
            r2 = -1
            if (r1 == r2) goto L_0x00ae
            int r9 = r7.f13874B     // Catch:{ all -> 0x01d6 }
            float r9 = (float) r9     // Catch:{ all -> 0x01d6 }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01d6 }
            goto L_0x00b2
        L_0x00ae:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01d6 }
        L_0x00b2:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r7)
            return
        L_0x00b7:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r7)
            return
        L_0x00bc:
            com.google.android.gms.internal.ads.rs r0 = r7.f13901l     // Catch:{ all -> 0x01d6 }
            boolean r0 = r0.mo15997d()     // Catch:{ all -> 0x01d6 }
            if (r0 == 0) goto L_0x00d1
            android.util.DisplayMetrics r8 = r7.f13895f     // Catch:{ all -> 0x01d6 }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01d6 }
            android.util.DisplayMetrics r9 = r7.f13895f     // Catch:{ all -> 0x01d6 }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01d6 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r7)
            return
        L_0x00d1:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01d6 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01d6 }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01d6 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01d6 }
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r4) goto L_0x00ef
            if (r0 != r3) goto L_0x00ed
            goto L_0x00ef
        L_0x00ed:
            r0 = r5
            goto L_0x00f0
        L_0x00ef:
            r0 = r8
        L_0x00f0:
            if (r2 == r4) goto L_0x00f4
            if (r2 != r3) goto L_0x00f5
        L_0x00f4:
            r5 = r9
        L_0x00f5:
            com.google.android.gms.internal.ads.rs r2 = r7.f13901l     // Catch:{ all -> 0x01d6 }
            int r2 = r2.f13950b     // Catch:{ all -> 0x01d6 }
            r3 = 1
            if (r2 > r0) goto L_0x0105
            com.google.android.gms.internal.ads.rs r2 = r7.f13901l     // Catch:{ all -> 0x01d6 }
            int r2 = r2.f13949a     // Catch:{ all -> 0x01d6 }
            if (r2 <= r5) goto L_0x0103
            goto L_0x0105
        L_0x0103:
            r2 = r1
            goto L_0x0106
        L_0x0105:
            r2 = r3
        L_0x0106:
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.aru.f11968dh     // Catch:{ all -> 0x01d6 }
            com.google.android.gms.internal.ads.ars r6 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x01d6 }
            java.lang.Object r4 = r6.mo14695a(r4)     // Catch:{ all -> 0x01d6 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01d6 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01d6 }
            if (r4 == 0) goto L_0x013e
            com.google.android.gms.internal.ads.rs r4 = r7.f13901l     // Catch:{ all -> 0x01d6 }
            int r4 = r4.f13950b     // Catch:{ all -> 0x01d6 }
            float r4 = (float) r4     // Catch:{ all -> 0x01d6 }
            float r6 = r7.f13896g     // Catch:{ all -> 0x01d6 }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01d6 }
            float r6 = r7.f13896g     // Catch:{ all -> 0x01d6 }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x013a
            com.google.android.gms.internal.ads.rs r0 = r7.f13901l     // Catch:{ all -> 0x01d6 }
            int r0 = r0.f13949a     // Catch:{ all -> 0x01d6 }
            float r0 = (float) r0     // Catch:{ all -> 0x01d6 }
            float r4 = r7.f13896g     // Catch:{ all -> 0x01d6 }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01d6 }
            float r5 = r7.f13896g     // Catch:{ all -> 0x01d6 }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x013a
            r0 = r3
            goto L_0x013b
        L_0x013a:
            r0 = r1
        L_0x013b:
            if (r2 == 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r0 = r2
        L_0x013f:
            r2 = 8
            if (r0 == 0) goto L_0x01ae
            com.google.android.gms.internal.ads.rs r0 = r7.f13901l     // Catch:{ all -> 0x01d6 }
            int r0 = r0.f13950b     // Catch:{ all -> 0x01d6 }
            float r0 = (float) r0     // Catch:{ all -> 0x01d6 }
            float r4 = r7.f13896g     // Catch:{ all -> 0x01d6 }
            float r0 = r0 / r4
            int r0 = (int) r0     // Catch:{ all -> 0x01d6 }
            com.google.android.gms.internal.ads.rs r4 = r7.f13901l     // Catch:{ all -> 0x01d6 }
            int r4 = r4.f13949a     // Catch:{ all -> 0x01d6 }
            float r4 = (float) r4     // Catch:{ all -> 0x01d6 }
            float r5 = r7.f13896g     // Catch:{ all -> 0x01d6 }
            float r4 = r4 / r5
            int r4 = (int) r4     // Catch:{ all -> 0x01d6 }
            float r8 = (float) r8     // Catch:{ all -> 0x01d6 }
            float r5 = r7.f13896g     // Catch:{ all -> 0x01d6 }
            float r8 = r8 / r5
            int r8 = (int) r8     // Catch:{ all -> 0x01d6 }
            float r9 = (float) r9     // Catch:{ all -> 0x01d6 }
            float r5 = r7.f13896g     // Catch:{ all -> 0x01d6 }
            float r9 = r9 / r5
            int r9 = (int) r9     // Catch:{ all -> 0x01d6 }
            r5 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d6 }
            r6.<init>(r5)     // Catch:{ all -> 0x01d6 }
            java.lang.String r5 = "Not enough space to show ad. Needs "
            r6.append(r5)     // Catch:{ all -> 0x01d6 }
            r6.append(r0)     // Catch:{ all -> 0x01d6 }
            java.lang.String r0 = "x"
            r6.append(r0)     // Catch:{ all -> 0x01d6 }
            r6.append(r4)     // Catch:{ all -> 0x01d6 }
            java.lang.String r0 = " dp, but only has "
            r6.append(r0)     // Catch:{ all -> 0x01d6 }
            r6.append(r8)     // Catch:{ all -> 0x01d6 }
            java.lang.String r8 = "x"
            r6.append(r8)     // Catch:{ all -> 0x01d6 }
            r6.append(r9)     // Catch:{ all -> 0x01d6 }
            java.lang.String r8 = " dp."
            r6.append(r8)     // Catch:{ all -> 0x01d6 }
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x01d6 }
            com.google.android.gms.internal.ads.C3900je.m17435e(r8)     // Catch:{ all -> 0x01d6 }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01d6 }
            if (r8 == r2) goto L_0x019c
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01d6 }
        L_0x019c:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01d6 }
            boolean r8 = r7.f13897h     // Catch:{ all -> 0x01d6 }
            if (r8 != 0) goto L_0x01cf
            com.google.android.gms.internal.ads.amj r8 = r7.f13889Q     // Catch:{ all -> 0x01d6 }
            com.google.android.gms.internal.ads.aml$a$b r9 = com.google.android.gms.internal.ads.aml.C3658a.C3660b.BANNER_SIZE_INVALID     // Catch:{ all -> 0x01d6 }
            r8.mo14518a(r9)     // Catch:{ all -> 0x01d6 }
            r7.f13897h = r3     // Catch:{ all -> 0x01d6 }
            monitor-exit(r7)
            return
        L_0x01ae:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01d6 }
            if (r8 == r2) goto L_0x01b7
            r7.setVisibility(r1)     // Catch:{ all -> 0x01d6 }
        L_0x01b7:
            boolean r8 = r7.f13898i     // Catch:{ all -> 0x01d6 }
            if (r8 != 0) goto L_0x01c4
            com.google.android.gms.internal.ads.amj r8 = r7.f13889Q     // Catch:{ all -> 0x01d6 }
            com.google.android.gms.internal.ads.aml$a$b r9 = com.google.android.gms.internal.ads.aml.C3658a.C3660b.BANNER_SIZE_VALID     // Catch:{ all -> 0x01d6 }
            r8.mo14518a(r9)     // Catch:{ all -> 0x01d6 }
            r7.f13898i = r3     // Catch:{ all -> 0x01d6 }
        L_0x01c4:
            com.google.android.gms.internal.ads.rs r8 = r7.f13901l     // Catch:{ all -> 0x01d6 }
            int r8 = r8.f13950b     // Catch:{ all -> 0x01d6 }
            com.google.android.gms.internal.ads.rs r9 = r7.f13901l     // Catch:{ all -> 0x01d6 }
            int r9 = r9.f13949a     // Catch:{ all -> 0x01d6 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01d6 }
        L_0x01cf:
            monitor-exit(r7)
            return
        L_0x01d1:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r7)
            return
        L_0x01d6:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4102qr.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!mo15864A()) {
            try {
                if (C3563o.m12762a()) {
                    super.onPause();
                }
            } catch (Exception e) {
                C3900je.m17430b("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!mo15864A()) {
            try {
                if (C3563o.m12762a()) {
                    super.onResume();
                }
            } catch (Exception e) {
                C3900je.m17430b("Could not resume webview.", e);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f13899j.mo15943c()) {
            synchronized (this) {
                if (this.f13915z != null) {
                    this.f13915z.mo14807a(motionEvent);
                }
            }
        } else if (this.f13891b != null) {
            this.f13891b.mo14287a(motionEvent);
        }
        if (mo15864A()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final void mo15907p() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(C3025aw.m10910D().mo15559b()));
        hashMap.put("app_volume", String.valueOf(C3025aw.m10910D().mo15556a()));
        hashMap.put("device_volume", String.valueOf(C3928kf.m17246a(getContext())));
        mo14986a("volume", (Map<String, ?>) hashMap);
    }

    /* renamed from: q */
    public final Context mo15908q() {
        return this.f13890a.mo15992b();
    }

    /* renamed from: r */
    public final synchronized C3107c mo15909r() {
        return this.f13900k;
    }

    /* renamed from: s */
    public final synchronized C3107c mo15910s() {
        return this.f13880H;
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f13879G = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final synchronized void setRequestedOrientation(int i) {
        this.f13908s = i;
        if (this.f13900k != null) {
            this.f13900k.mo12661a(this.f13908s);
        }
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C4090qf) {
            this.f13899j = (C4090qf) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!mo15864A()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                C3900je.m17430b("Could not stop loading webview.", e);
            }
        }
    }

    /* renamed from: t */
    public final synchronized C4130rs mo15917t() {
        return this.f13901l;
    }

    /* renamed from: u */
    public final synchronized String mo15918u() {
        return this.f13902m;
    }

    /* renamed from: v */
    public final /* synthetic */ C4124rm mo15919v() {
        return this.f13899j;
    }

    /* renamed from: w */
    public final WebViewClient mo15920w() {
        return this.f13899j;
    }

    /* renamed from: x */
    public final synchronized boolean mo15921x() {
        return this.f13903n;
    }

    /* renamed from: y */
    public final agw mo15922y() {
        return this.f13891b;
    }

    /* renamed from: z */
    public final synchronized boolean mo15923z() {
        return this.f13905p;
    }
}
