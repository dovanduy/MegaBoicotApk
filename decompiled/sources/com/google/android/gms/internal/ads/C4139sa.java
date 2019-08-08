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
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.sa */
final class C4139sa extends C4144sf implements OnGlobalLayoutListener, DownloadListener, ayy, C4089qe {

    /* renamed from: A */
    private WeakReference<OnClickListener> f13999A;
    @GuardedBy("this")

    /* renamed from: B */
    private C3107c f14000B;

    /* renamed from: C */
    private C3974ly f14001C;

    /* renamed from: D */
    private int f14002D = -1;

    /* renamed from: E */
    private int f14003E = -1;

    /* renamed from: F */
    private int f14004F = -1;

    /* renamed from: G */
    private int f14005G = -1;

    /* renamed from: H */
    private float f14006H;

    /* renamed from: I */
    private Map<String, C4073pp> f14007I;

    /* renamed from: J */
    private final WindowManager f14008J;

    /* renamed from: b */
    private final agw f14009b;

    /* renamed from: c */
    private final zzang f14010c;

    /* renamed from: d */
    private final C3018ap f14011d;

    /* renamed from: e */
    private final C3049bt f14012e;

    /* renamed from: f */
    private C4131rt f14013f;
    @GuardedBy("this")

    /* renamed from: g */
    private C3107c f14014g;
    @GuardedBy("this")

    /* renamed from: h */
    private C4130rs f14015h;
    @GuardedBy("this")

    /* renamed from: i */
    private String f14016i;
    @GuardedBy("this")

    /* renamed from: j */
    private boolean f14017j;
    @GuardedBy("this")

    /* renamed from: k */
    private boolean f14018k;
    @GuardedBy("this")

    /* renamed from: l */
    private boolean f14019l;
    @GuardedBy("this")

    /* renamed from: m */
    private int f14020m;
    @GuardedBy("this")

    /* renamed from: n */
    private boolean f14021n = true;
    @GuardedBy("this")

    /* renamed from: o */
    private boolean f14022o = false;
    @GuardedBy("this")

    /* renamed from: p */
    private String f14023p = "";
    @GuardedBy("this")

    /* renamed from: q */
    private C4105qu f14024q;
    @GuardedBy("this")

    /* renamed from: r */
    private boolean f14025r;
    @GuardedBy("this")

    /* renamed from: s */
    private boolean f14026s;
    @GuardedBy("this")

    /* renamed from: t */
    private ati f14027t;
    @GuardedBy("this")

    /* renamed from: u */
    private int f14028u;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: v */
    public int f14029v;

    /* renamed from: w */
    private asf f14030w;

    /* renamed from: x */
    private asf f14031x;

    /* renamed from: y */
    private asf f14032y;

    /* renamed from: z */
    private asg f14033z;

    private C4139sa(C4129rr rrVar, C4130rs rsVar, String str, boolean z, boolean z2, agw agw, zzang zzang, ash ash, C3018ap apVar, C3049bt btVar, amj amj) {
        super(rrVar);
        this.f14015h = rsVar;
        this.f14016i = str;
        this.f14018k = z;
        this.f14020m = -1;
        this.f14009b = agw;
        this.f14010c = zzang;
        this.f14011d = apVar;
        this.f14012e = btVar;
        this.f14008J = (WindowManager) getContext().getSystemService("window");
        this.f14001C = new C3974ly(mo16026K().mo15991a(), this, this, null);
        C3025aw.m10917e().mo15515a((Context) rrVar, zzang.f14505a, getSettings());
        setDownloadListener(this);
        this.f14006H = mo16026K().getResources().getDisplayMetrics().density;
        m18032O();
        if (C3563o.m12766e()) {
            addJavascriptInterface(C4108qx.m17924a(this), "googleAdsJsInterface");
        }
        m18036S();
        this.f14033z = new asg(new ash(true, "make_wv", this.f14016i));
        this.f14033z.mo14714a().mo14719a(ash);
        this.f14031x = asa.m15039a(this.f14033z.mo14714a());
        this.f14033z.mo14715a("native:view_create", this.f14031x);
        this.f14032y = null;
        this.f14030w = null;
        C3025aw.m10919g().mo15547b((Context) rrVar);
    }

    /* renamed from: M */
    private final boolean m18030M() {
        int i;
        int i2;
        boolean z = false;
        if (!this.f14013f.mo15942b() && !this.f14013f.mo16005c()) {
            return false;
        }
        C3025aw.m10917e();
        DisplayMetrics a = C3909jn.m17124a(this.f14008J);
        aoq.m14615a();
        int b = C3975lz.m17380b(a, a.widthPixels);
        aoq.m14615a();
        int b2 = C3975lz.m17380b(a, a.heightPixels);
        Activity a2 = mo16026K().mo15991a();
        if (a2 == null || a2.getWindow() == null) {
            i2 = b;
            i = b2;
        } else {
            C3025aw.m10917e();
            int[] a3 = C3909jn.m17150a(a2);
            aoq.m14615a();
            i2 = C3975lz.m17380b(a, a3[0]);
            aoq.m14615a();
            i = C3975lz.m17380b(a, a3[1]);
        }
        if (this.f14003E == b && this.f14002D == b2 && this.f14004F == i2 && this.f14005G == i) {
            return false;
        }
        if (!(this.f14003E == b && this.f14002D == b2)) {
            z = true;
        }
        this.f14003E = b;
        this.f14002D = b2;
        this.f14004F = i2;
        this.f14005G = i;
        new C4003n(this).mo15651a(b, b2, i2, i, a.density, this.f14008J.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: N */
    private final void m18031N() {
        asa.m15040a(this.f14033z.mo14714a(), this.f14031x, "aeh2");
    }

    /* renamed from: O */
    private final synchronized void m18032O() {
        if (!this.f14018k) {
            if (!this.f14015h.mo15997d()) {
                if (VERSION.SDK_INT < 18) {
                    C3900je.m17429b("Disabling hardware acceleration on an AdView.");
                    m18033P();
                    return;
                }
                C3900je.m17429b("Enabling hardware acceleration on an AdView.");
                m18034Q();
                return;
            }
        }
        C3900je.m17429b("Enabling hardware acceleration on an overlay.");
        m18034Q();
    }

    /* renamed from: P */
    private final synchronized void m18033P() {
        if (!this.f14019l) {
            C3025aw.m10919g().mo15551c((View) this);
        }
        this.f14019l = true;
    }

    /* renamed from: Q */
    private final synchronized void m18034Q() {
        if (this.f14019l) {
            C3025aw.m10919g().mo15548b((View) this);
        }
        this.f14019l = false;
    }

    /* renamed from: R */
    private final synchronized void m18035R() {
        this.f14007I = null;
    }

    /* renamed from: S */
    private final void m18036S() {
        if (this.f14033z != null) {
            ash a = this.f14033z.mo14714a();
            if (!(a == null || C3025aw.m10921i().mo15438b() == null)) {
                C3025aw.m10921i().mo15438b().mo14707a(a);
            }
        }
    }

    /* renamed from: a */
    static C4139sa m18039a(Context context, C4130rs rsVar, String str, boolean z, boolean z2, agw agw, zzang zzang, ash ash, C3018ap apVar, C3049bt btVar, amj amj) {
        C4139sa saVar = new C4139sa(new C4129rr(context), rsVar, str, z, z2, agw, zzang, ash, apVar, btVar, amj);
        return saVar;
    }

    /* renamed from: g */
    private final void m18040g(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        ayz.m15802a((ayy) this, "onAdVisibilityChanged", (Map) hashMap);
    }

    /* renamed from: C */
    public final synchronized boolean mo15866C() {
        return this.f14021n;
    }

    /* renamed from: D */
    public final synchronized boolean mo15867D() {
        return this.f14022o;
    }

    /* renamed from: E */
    public final synchronized boolean mo15868E() {
        return this.f14028u > 0;
    }

    /* renamed from: F */
    public final void mo15869F() {
        this.f14001C.mo15617a();
    }

    /* renamed from: G */
    public final void mo15870G() {
        if (this.f14032y == null) {
            this.f14032y = asa.m15039a(this.f14033z.mo14714a());
            this.f14033z.mo14715a("native:view_load", this.f14032y);
        }
    }

    /* renamed from: H */
    public final synchronized ati mo15871H() {
        return this.f14027t;
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
            asa.m15040a(this.f14033z.mo14714a(), this.f14031x, "aebb2");
        }
        m18031N();
        if (this.f14033z.mo14714a() != null) {
            this.f14033z.mo14714a().mo14721a("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f14010c.f14505a);
        ayz.m15802a((ayy) this, "onhide", (Map) hashMap);
    }

    /* renamed from: a */
    public final void mo15875a(Context context) {
        mo16026K().setBaseContext(context);
        this.f14001C.mo15618a(mo16026K().mo15991a());
    }

    /* renamed from: a */
    public final synchronized void mo15876a(C3107c cVar) {
        this.f14014g = cVar;
    }

    /* renamed from: a */
    public final void mo15968a(zzc zzc) {
        this.f14013f.mo16000a(zzc);
    }

    /* renamed from: a */
    public final void mo14431a(akj akj) {
        synchronized (this) {
            this.f14025r = akj.f11271a;
        }
        m18040g(akj.f11271a);
    }

    /* renamed from: a */
    public final synchronized void mo15877a(ati ati) {
        this.f14027t = ati;
    }

    /* renamed from: a */
    public final synchronized void mo15797a(C4105qu quVar) {
        if (this.f14024q != null) {
            C3900je.m17431c("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f14024q = quVar;
        }
    }

    /* renamed from: a */
    public final synchronized void mo15878a(C4130rs rsVar) {
        this.f14015h = rsVar;
        requestLayout();
    }

    /* renamed from: a */
    public final void mo16016a(C4131rt rtVar) {
        this.f14013f = rtVar;
    }

    /* renamed from: a */
    public final synchronized void mo15879a(String str) {
        if (str == null) {
            str = "";
        }
        this.f14023p = str;
    }

    /* renamed from: a */
    public final void mo15880a(String str, C3067ae<? super C4089qe> aeVar) {
        if (this.f14013f != null) {
            this.f14013f.mo15009a(str, aeVar);
        }
    }

    /* renamed from: a */
    public final void mo15881a(String str, C3564p<C3067ae<? super C4089qe>> pVar) {
        if (this.f14013f != null) {
            this.f14013f.mo15010a(str, pVar);
        }
    }

    /* renamed from: a */
    public final void mo14991a(String str, String str2) {
        ayz.m15801a((ayy) this, str, str2);
    }

    /* renamed from: a */
    public final synchronized void mo15882a(String str, String str2, String str3) {
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11777aB)).booleanValue()) {
            str2 = C4118rg.m17946a(str2, C4118rg.m17945a());
        }
        super.loadDataWithBaseURL(str, str2, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, C2793C.UTF8_NAME, str3);
    }

    /* renamed from: a */
    public final void mo14986a(String str, Map map) {
        ayz.m15802a((ayy) this, str, map);
    }

    /* renamed from: a */
    public final void mo14987a(String str, JSONObject jSONObject) {
        ayz.m15804b(this, str, jSONObject);
    }

    /* renamed from: a */
    public final void mo15798a(boolean z) {
        this.f14013f.mo16001a(z);
    }

    /* renamed from: a */
    public final void mo15969a(boolean z, int i) {
        this.f14013f.mo16002a(z, i);
    }

    /* renamed from: a */
    public final void mo15970a(boolean z, int i, String str) {
        this.f14013f.mo16003a(z, i, str);
    }

    /* renamed from: a */
    public final void mo15971a(boolean z, int i, String str, String str2) {
        this.f14013f.mo16004a(z, i, str, str2);
    }

    /* renamed from: b */
    public final synchronized C4105qu mo15799b() {
        return this.f14024q;
    }

    /* renamed from: b */
    public final synchronized void mo15883b(C3107c cVar) {
        this.f14000B = cVar;
    }

    /* renamed from: b */
    public final synchronized void mo14993b(String str) {
        if (!mo16043A()) {
            super.mo14993b(str);
        } else {
            C3900je.m17435e("The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: b */
    public final void mo15884b(String str, C3067ae<? super C4089qe> aeVar) {
        if (this.f14013f != null) {
            this.f14013f.mo15012b(str, aeVar);
        }
    }

    /* renamed from: b */
    public final void mo14994b(String str, JSONObject jSONObject) {
        ayz.m15803a((ayy) this, str, jSONObject);
    }

    /* renamed from: b */
    public final synchronized void mo15885b(boolean z) {
        boolean z2 = z != this.f14018k;
        this.f14018k = z;
        m18032O();
        if (z2) {
            new C4003n(this).mo15655c(z ? "expanded" : RewardedVideo.VIDEO_MODE_DEFAULT);
        }
    }

    /* renamed from: c */
    public final asf mo15800c() {
        return this.f14031x;
    }

    /* renamed from: c */
    public final synchronized void mo15886c(boolean z) {
        if (this.f14014g != null) {
            this.f14014g.mo12666a(this.f14013f.mo15942b(), z);
        } else {
            this.f14017j = z;
        }
    }

    /* renamed from: d */
    public final Activity mo15801d() {
        return mo16026K().mo15991a();
    }

    /* renamed from: d */
    public final synchronized void mo15887d(boolean z) {
        this.f14021n = z;
    }

    /* renamed from: e */
    public final C3049bt mo15802e() {
        return this.f14012e;
    }

    /* renamed from: e */
    public final synchronized void mo15889e(boolean z) {
        this.f14028u += z ? 1 : -1;
        if (this.f14028u <= 0 && this.f14014g != null) {
            this.f14014g.mo12683q();
        }
    }

    /* renamed from: f */
    public final void mo15803f() {
        C3107c r = mo15909r();
        if (r != null) {
            r.mo12682p();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final synchronized void mo16017f(boolean z) {
        if (!z) {
            try {
                m18036S();
                this.f14001C.mo15619b();
                if (this.f14014g != null) {
                    this.f14014g.mo12660a();
                    this.f14014g.mo12677k();
                    this.f14014g = null;
                }
            } finally {
            }
        }
        this.f14013f.mo15013k();
        C3025aw.m10938z();
        C4072po.m17647a((C4061pd) this);
        m18035R();
    }

    /* renamed from: g */
    public final synchronized String mo15804g() {
        return this.f14023p;
    }

    public final OnClickListener getOnClickListener() {
        return (OnClickListener) this.f13999A.get();
    }

    public final synchronized int getRequestedOrientation() {
        return this.f14020m;
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    /* renamed from: j */
    public final asg mo15806j() {
        return this.f14033z;
    }

    /* renamed from: j_ */
    public final synchronized void mo12502j_() {
        this.f14022o = true;
        if (this.f14011d != null) {
            this.f14011d.mo12502j_();
        }
    }

    /* renamed from: k */
    public final zzang mo15807k() {
        return this.f14010c;
    }

    /* renamed from: k_ */
    public final synchronized void mo12503k_() {
        this.f14022o = false;
        if (this.f14011d != null) {
            this.f14011d.mo12503k_();
        }
    }

    /* renamed from: l */
    public final int mo15808l() {
        return getMeasuredHeight();
    }

    /* renamed from: m */
    public final int mo15809m() {
        return getMeasuredWidth();
    }

    /* renamed from: n */
    public final void mo15903n() {
        m18031N();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f14010c.f14505a);
        ayz.m15802a((ayy) this, "onhide", (Map) hashMap);
    }

    /* renamed from: o */
    public final void mo15904o() {
        if (this.f14030w == null) {
            asa.m15040a(this.f14033z.mo14714a(), this.f14031x, "aes2");
            this.f14030w = asa.m15039a(this.f14033z.mo14714a());
            this.f14033z.mo14715a("native:view_show", this.f14030w);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f14010c.f14505a);
        ayz.m15802a((ayy) this, "onshow", (Map) hashMap);
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo16043A()) {
            this.f14001C.mo15620c();
        }
        boolean z = this.f14025r;
        if (this.f14013f != null && this.f14013f.mo16005c()) {
            if (!this.f14026s) {
                OnGlobalLayoutListener d = this.f14013f.mo16006d();
                if (d != null) {
                    C3025aw.m10907A();
                    if (this == null) {
                        throw null;
                    }
                    C4027nx.m17491a((View) this, d);
                }
                OnScrollChangedListener e = this.f14013f.mo16008e();
                if (e != null) {
                    C3025aw.m10907A();
                    if (this == null) {
                        throw null;
                    }
                    C4027nx.m17492a((View) this, e);
                }
                this.f14026s = true;
            }
            m18030M();
            z = true;
        }
        m18040g(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!mo16043A()) {
                this.f14001C.mo15621d();
            }
            super.onDetachedFromWindow();
            if (this.f14026s && this.f14013f != null && this.f14013f.mo16005c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                OnGlobalLayoutListener d = this.f14013f.mo16006d();
                if (d != null) {
                    C3025aw.m10919g().mo15541a(getViewTreeObserver(), d);
                }
                OnScrollChangedListener e = this.f14013f.mo16008e();
                if (e != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(e);
                }
                this.f14026s = false;
            }
        }
        m18040g(false);
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
        if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
            super.onDraw(canvas);
            if (!(this.f14013f == null || this.f14013f.mo16009l() == null)) {
                this.f14013f.mo16009l().mo12592a();
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
        boolean M = m18030M();
        C3107c r = mo15909r();
        if (r != null && M) {
            r.mo12681o();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01a7 A[SYNTHETIC, Splitter:B:97:0x01a7] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:52:0x00b5=Splitter:B:52:0x00b5, B:104:0x01bd=Splitter:B:104:0x01bd} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.mo16043A()     // Catch:{ all -> 0x01c2 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x01bd
            boolean r0 = r7.f14018k     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x01bd
            com.google.android.gms.internal.ads.rs r0 = r7.f14015h     // Catch:{ all -> 0x01c2 }
            boolean r0 = r0.mo15998e()     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x0021
            goto L_0x01bd
        L_0x0021:
            com.google.android.gms.internal.ads.rs r0 = r7.f14015h     // Catch:{ all -> 0x01c2 }
            boolean r0 = r0.mo15999f()     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x006b
            com.google.android.gms.internal.ads.qu r0 = r7.mo15799b()     // Catch:{ all -> 0x01c2 }
            r1 = 0
            if (r0 == 0) goto L_0x0035
            float r0 = r0.mo14570e()     // Catch:{ all -> 0x01c2 }
            goto L_0x0036
        L_0x0035:
            r0 = r1
        L_0x0036:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x003f
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r7)
            return
        L_0x003f:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01c2 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01c2 }
            float r1 = (float) r9     // Catch:{ all -> 0x01c2 }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01c2 }
            float r2 = (float) r8     // Catch:{ all -> 0x01c2 }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01c2 }
            if (r9 != 0) goto L_0x0056
            if (r2 == 0) goto L_0x0056
            float r9 = (float) r2     // Catch:{ all -> 0x01c2 }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01c2 }
            r9 = r2
            goto L_0x005e
        L_0x0056:
            if (r8 != 0) goto L_0x005e
            if (r1 == 0) goto L_0x005e
            float r8 = (float) r1     // Catch:{ all -> 0x01c2 }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01c2 }
            r8 = r1
        L_0x005e:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01c2 }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01c2 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r7)
            return
        L_0x006b:
            com.google.android.gms.internal.ads.rs r0 = r7.f14015h     // Catch:{ all -> 0x01c2 }
            boolean r0 = r0.mo15996c()     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x00ba
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.aru.f11920cm     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.internal.ads.ars r1 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x01c2 }
            java.lang.Object r0 = r1.mo14695a(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01c2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x00b5
            boolean r0 = com.google.android.gms.common.util.C3563o.m12766e()     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x008c
            goto L_0x00b5
        L_0x008c:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.sb r1 = new com.google.android.gms.internal.ads.sb     // Catch:{ all -> 0x01c2 }
            r1.<init>(r7)     // Catch:{ all -> 0x01c2 }
            r7.mo15880a(r0, r1)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.mo14993b(r0)     // Catch:{ all -> 0x01c2 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01c2 }
            int r0 = r7.f14029v     // Catch:{ all -> 0x01c2 }
            r1 = -1
            if (r0 == r1) goto L_0x00ac
            int r9 = r7.f14029v     // Catch:{ all -> 0x01c2 }
            float r9 = (float) r9     // Catch:{ all -> 0x01c2 }
            float r0 = r7.f14006H     // Catch:{ all -> 0x01c2 }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01c2 }
            goto L_0x00b0
        L_0x00ac:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01c2 }
        L_0x00b0:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r7)
            return
        L_0x00b5:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r7)
            return
        L_0x00ba:
            com.google.android.gms.internal.ads.rs r0 = r7.f14015h     // Catch:{ all -> 0x01c2 }
            boolean r0 = r0.mo15997d()     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x00d9
            android.util.DisplayMetrics r8 = new android.util.DisplayMetrics     // Catch:{ all -> 0x01c2 }
            r8.<init>()     // Catch:{ all -> 0x01c2 }
            android.view.WindowManager r9 = r7.f14008J     // Catch:{ all -> 0x01c2 }
            android.view.Display r9 = r9.getDefaultDisplay()     // Catch:{ all -> 0x01c2 }
            r9.getMetrics(r8)     // Catch:{ all -> 0x01c2 }
            int r9 = r8.widthPixels     // Catch:{ all -> 0x01c2 }
            int r8 = r8.heightPixels     // Catch:{ all -> 0x01c2 }
            r7.setMeasuredDimension(r9, r8)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r7)
            return
        L_0x00d9:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01c2 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01c2 }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01c2 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01c2 }
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r4) goto L_0x00f7
            if (r0 != r3) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r0 = r5
            goto L_0x00f8
        L_0x00f7:
            r0 = r8
        L_0x00f8:
            if (r2 == r4) goto L_0x00fc
            if (r2 != r3) goto L_0x00fd
        L_0x00fc:
            r5 = r9
        L_0x00fd:
            com.google.android.gms.internal.ads.rs r2 = r7.f14015h     // Catch:{ all -> 0x01c2 }
            int r2 = r2.f13950b     // Catch:{ all -> 0x01c2 }
            r3 = 1
            if (r2 > r0) goto L_0x010d
            com.google.android.gms.internal.ads.rs r2 = r7.f14015h     // Catch:{ all -> 0x01c2 }
            int r2 = r2.f13949a     // Catch:{ all -> 0x01c2 }
            if (r2 <= r5) goto L_0x010b
            goto L_0x010d
        L_0x010b:
            r2 = r1
            goto L_0x010e
        L_0x010d:
            r2 = r3
        L_0x010e:
            com.google.android.gms.internal.ads.ark<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.aru.f11968dh     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.internal.ads.ars r6 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x01c2 }
            java.lang.Object r4 = r6.mo14695a(r4)     // Catch:{ all -> 0x01c2 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01c2 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01c2 }
            if (r4 == 0) goto L_0x0145
            com.google.android.gms.internal.ads.rs r4 = r7.f14015h     // Catch:{ all -> 0x01c2 }
            int r4 = r4.f13950b     // Catch:{ all -> 0x01c2 }
            float r4 = (float) r4     // Catch:{ all -> 0x01c2 }
            float r6 = r7.f14006H     // Catch:{ all -> 0x01c2 }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01c2 }
            float r6 = r7.f14006H     // Catch:{ all -> 0x01c2 }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0141
            com.google.android.gms.internal.ads.rs r0 = r7.f14015h     // Catch:{ all -> 0x01c2 }
            int r0 = r0.f13949a     // Catch:{ all -> 0x01c2 }
            float r0 = (float) r0     // Catch:{ all -> 0x01c2 }
            float r4 = r7.f14006H     // Catch:{ all -> 0x01c2 }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01c2 }
            float r5 = r7.f14006H     // Catch:{ all -> 0x01c2 }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0141
            goto L_0x0142
        L_0x0141:
            r3 = r1
        L_0x0142:
            if (r2 == 0) goto L_0x0145
            r2 = r3
        L_0x0145:
            r0 = 8
            if (r2 == 0) goto L_0x01a7
            com.google.android.gms.internal.ads.rs r2 = r7.f14015h     // Catch:{ all -> 0x01c2 }
            int r2 = r2.f13950b     // Catch:{ all -> 0x01c2 }
            float r2 = (float) r2     // Catch:{ all -> 0x01c2 }
            float r3 = r7.f14006H     // Catch:{ all -> 0x01c2 }
            float r2 = r2 / r3
            int r2 = (int) r2     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.internal.ads.rs r3 = r7.f14015h     // Catch:{ all -> 0x01c2 }
            int r3 = r3.f13949a     // Catch:{ all -> 0x01c2 }
            float r3 = (float) r3     // Catch:{ all -> 0x01c2 }
            float r4 = r7.f14006H     // Catch:{ all -> 0x01c2 }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01c2 }
            float r8 = (float) r8     // Catch:{ all -> 0x01c2 }
            float r4 = r7.f14006H     // Catch:{ all -> 0x01c2 }
            float r8 = r8 / r4
            int r8 = (int) r8     // Catch:{ all -> 0x01c2 }
            float r9 = (float) r9     // Catch:{ all -> 0x01c2 }
            float r4 = r7.f14006H     // Catch:{ all -> 0x01c2 }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01c2 }
            r4 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c2 }
            r5.<init>(r4)     // Catch:{ all -> 0x01c2 }
            java.lang.String r4 = "Not enough space to show ad. Needs "
            r5.append(r4)     // Catch:{ all -> 0x01c2 }
            r5.append(r2)     // Catch:{ all -> 0x01c2 }
            java.lang.String r2 = "x"
            r5.append(r2)     // Catch:{ all -> 0x01c2 }
            r5.append(r3)     // Catch:{ all -> 0x01c2 }
            java.lang.String r2 = " dp, but only has "
            r5.append(r2)     // Catch:{ all -> 0x01c2 }
            r5.append(r8)     // Catch:{ all -> 0x01c2 }
            java.lang.String r8 = "x"
            r5.append(r8)     // Catch:{ all -> 0x01c2 }
            r5.append(r9)     // Catch:{ all -> 0x01c2 }
            java.lang.String r8 = " dp."
            r5.append(r8)     // Catch:{ all -> 0x01c2 }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.internal.ads.C3900je.m17435e(r8)     // Catch:{ all -> 0x01c2 }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01c2 }
            if (r8 == r0) goto L_0x01a2
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01c2 }
        L_0x01a2:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r7)
            return
        L_0x01a7:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01c2 }
            if (r8 == r0) goto L_0x01b0
            r7.setVisibility(r1)     // Catch:{ all -> 0x01c2 }
        L_0x01b0:
            com.google.android.gms.internal.ads.rs r8 = r7.f14015h     // Catch:{ all -> 0x01c2 }
            int r8 = r8.f13950b     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.internal.ads.rs r9 = r7.f14015h     // Catch:{ all -> 0x01c2 }
            int r9 = r9.f13949a     // Catch:{ all -> 0x01c2 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r7)
            return
        L_0x01bd:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r7)
            return
        L_0x01c2:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4139sa.onMeasure(int, int):void");
    }

    public final void onPause() {
        try {
            if (C3563o.m12762a()) {
                super.onPause();
            }
        } catch (Exception e) {
            C3900je.m17430b("Could not pause webview.", e);
        }
    }

    public final void onResume() {
        try {
            if (C3563o.m12762a()) {
                super.onResume();
            }
        } catch (Exception e) {
            C3900je.m17430b("Could not resume webview.", e);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f14013f.mo16005c()) {
            synchronized (this) {
                if (this.f14027t != null) {
                    this.f14027t.mo14807a(motionEvent);
                }
            }
        } else if (this.f14009b != null) {
            this.f14009b.mo14287a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final void mo15907p() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(C3025aw.m10910D().mo15559b()));
        hashMap.put("app_volume", String.valueOf(C3025aw.m10910D().mo15556a()));
        hashMap.put("device_volume", String.valueOf(C3928kf.m17246a(getContext())));
        ayz.m15802a((ayy) this, "volume", (Map) hashMap);
    }

    /* renamed from: q */
    public final Context mo15908q() {
        return mo16026K().mo15992b();
    }

    /* renamed from: r */
    public final synchronized C3107c mo15909r() {
        return this.f14014g;
    }

    /* renamed from: s */
    public final synchronized C3107c mo15910s() {
        return this.f14000B;
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f13999A = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final synchronized void setRequestedOrientation(int i) {
        this.f14020m = i;
        if (this.f14014g != null) {
            this.f14014g.mo12661a(this.f14020m);
        }
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e) {
            C3900je.m17430b("Could not stop loading webview.", e);
        }
    }

    /* renamed from: t */
    public final synchronized C4130rs mo15917t() {
        return this.f14015h;
    }

    /* renamed from: u */
    public final synchronized String mo15918u() {
        return this.f14016i;
    }

    /* renamed from: v */
    public final /* synthetic */ C4124rm mo15919v() {
        return this.f14013f;
    }

    /* renamed from: w */
    public final WebViewClient mo15920w() {
        return this.f14035a;
    }

    /* renamed from: x */
    public final synchronized boolean mo15921x() {
        return this.f14017j;
    }

    /* renamed from: y */
    public final agw mo15922y() {
        return this.f14009b;
    }

    /* renamed from: z */
    public final synchronized boolean mo15923z() {
        return this.f14018k;
    }
}
