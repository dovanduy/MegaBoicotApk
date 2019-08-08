package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.support.p017v4.view.C0595r;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.C3025aw;
import com.google.android.gms.ads.internal.C3050bu;
import com.google.android.gms.ads.internal.gmsg.C3062a;
import com.google.android.gms.ads.internal.gmsg.C3067ae;
import com.google.android.gms.ads.internal.gmsg.C3070ah;
import com.google.android.gms.ads.internal.gmsg.C3071ai;
import com.google.android.gms.ads.internal.gmsg.C3073c;
import com.google.android.gms.ads.internal.gmsg.C3074d;
import com.google.android.gms.ads.internal.gmsg.C3075e;
import com.google.android.gms.ads.internal.gmsg.C3081k;
import com.google.android.gms.ads.internal.gmsg.C3082l;
import com.google.android.gms.ads.internal.gmsg.C3083m;
import com.google.android.gms.ads.internal.gmsg.C3085o;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C3107c;
import com.google.android.gms.ads.internal.overlay.C3115k;
import com.google.android.gms.ads.internal.overlay.C3117m;
import com.google.android.gms.ads.internal.overlay.C3123s;
import com.google.android.gms.ads.internal.overlay.zzc;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map.Entry;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.rt */
public final class C4131rt extends azc<C4089qe> implements C4124rm, C4146sh, C4148sj, C4150sl, C4151sm {

    /* renamed from: A */
    private OnAttachStateChangeListener f13952A;

    /* renamed from: a */
    private C4089qe f13953a;

    /* renamed from: b */
    private final Object f13954b;

    /* renamed from: c */
    private anw f13955c;

    /* renamed from: d */
    private C3117m f13956d;

    /* renamed from: e */
    private C4125rn f13957e;

    /* renamed from: f */
    private C4126ro f13958f;

    /* renamed from: g */
    private C3081k f13959g;

    /* renamed from: h */
    private C3083m f13960h;

    /* renamed from: i */
    private C4127rp f13961i;

    /* renamed from: j */
    private boolean f13962j;

    /* renamed from: k */
    private C3071ai f13963k;

    /* renamed from: l */
    private boolean f13964l;

    /* renamed from: m */
    private boolean f13965m;

    /* renamed from: n */
    private OnGlobalLayoutListener f13966n;

    /* renamed from: o */
    private OnScrollChangedListener f13967o;

    /* renamed from: p */
    private boolean f13968p;

    /* renamed from: q */
    private C3123s f13969q;

    /* renamed from: r */
    private final C3976m f13970r;

    /* renamed from: s */
    private C3050bu f13971s;

    /* renamed from: t */
    private C3732d f13972t;

    /* renamed from: u */
    private C4030o f13973u;

    /* renamed from: v */
    private C4128rq f13974v;

    /* renamed from: w */
    private C3862hu f13975w;

    /* renamed from: x */
    private boolean f13976x;

    /* renamed from: y */
    private boolean f13977y;

    /* renamed from: z */
    private int f13978z;

    public C4131rt(C4089qe qeVar, boolean z) {
        this(qeVar, z, new C3976m(qeVar, qeVar.mo15908q(), new arf(qeVar.getContext())), null);
    }

    private C4131rt(C4089qe qeVar, boolean z, C3976m mVar, C3732d dVar) {
        this.f13954b = new Object();
        this.f13962j = false;
        this.f13953a = qeVar;
        this.f13964l = z;
        this.f13970r = mVar;
        this.f13972t = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17985a(View view, C3862hu huVar, int i) {
        if (huVar.mo15372b() && i > 0) {
            huVar.mo15367a(view);
            if (huVar.mo15372b()) {
                C3909jn.f13411a.postDelayed(new C4133rv(this, view, huVar, i), 100);
            }
        }
    }

    /* renamed from: a */
    private final void m17986a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean a = this.f13972t != null ? this.f13972t.mo15237a() : false;
        C3025aw.m10915c();
        Context context = this.f13953a.getContext();
        if (!a) {
            z = true;
        }
        C3115k.m11206a(context, adOverlayInfoParcel, z);
        if (this.f13975w != null) {
            String str = adOverlayInfoParcel.f9074l;
            if (str == null && adOverlayInfoParcel.f9063a != null) {
                str = adOverlayInfoParcel.f9063a.f9122a;
            }
            this.f13975w.mo15368a(str);
        }
    }

    /* renamed from: e */
    private final WebResourceResponse m17988e(C4143se seVar) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(seVar.f14046a);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Entry entry : seVar.f14048c.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                httpURLConnection = (HttpURLConnection) openConnection;
                C3025aw.m10917e().mo15517a(this.f13953a.getContext(), this.f13953a.mo15807k().f14505a, false, httpURLConnection);
                C3980md mdVar = new C3980md();
                mdVar.mo15630a(httpURLConnection, (byte[]) null);
                int responseCode = httpURLConnection.getResponseCode();
                mdVar.mo15629a(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    C3025aw.m10917e();
                } else {
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField == null) {
                        throw new IOException("Missing Location header in redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (protocol == null) {
                        C3900je.m17435e("Protocol is null");
                        return null;
                    } else if (protocol.equals("http") || protocol.equals("https")) {
                        String str = "Redirecting to ";
                        String valueOf = String.valueOf(headerField);
                        C3900je.m17429b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                        httpURLConnection.disconnect();
                        url = url2;
                    } else {
                        String str2 = "Unsupported scheme: ";
                        String valueOf2 = String.valueOf(protocol);
                        C3900je.m17435e(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
                        return null;
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Too many redirects (20)");
                throw new IOException(sb.toString());
            }
        }
        C3025aw.m10917e();
        return C3909jn.m17125a(httpURLConnection);
    }

    /* renamed from: q */
    private final void m17989q() {
        if (this.f13952A != null) {
            this.f13953a.getView().removeOnAttachStateChangeListener(this.f13952A);
        }
    }

    /* renamed from: r */
    private final void m17990r() {
        if (this.f13957e != null && ((this.f13976x && this.f13978z <= 0) || this.f13977y)) {
            this.f13957e.mo12684a(!this.f13977y);
            this.f13957e = null;
        }
        this.f13953a.mo15870G();
    }

    /* renamed from: a */
    public final C3050bu mo15925a() {
        return this.f13971s;
    }

    /* renamed from: a */
    public final void mo15926a(int i, int i2) {
        if (this.f13972t != null) {
            this.f13972t.mo15233a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo15927a(int i, int i2, boolean z) {
        this.f13970r.mo15625a(i, i2);
        if (this.f13972t != null) {
            this.f13972t.mo15234a(i, i2, z);
        }
    }

    /* renamed from: a */
    public final void mo15928a(OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f13954b) {
            this.f13965m = true;
            this.f13953a.mo15869F();
            this.f13966n = onGlobalLayoutListener;
            this.f13967o = onScrollChangedListener;
        }
    }

    /* renamed from: a */
    public final void mo16000a(zzc zzc) {
        boolean z = this.f13953a.mo15923z();
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(zzc, (!z || this.f13953a.mo15917t().mo15997d()) ? this.f13955c : null, z ? null : this.f13956d, this.f13969q, this.f13953a.mo15807k());
        m17986a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo15930a(anw anw, C3081k kVar, C3117m mVar, C3083m mVar2, C3123s sVar, boolean z, C3071ai aiVar, C3050bu buVar, C4030o oVar, C3862hu huVar) {
        C3081k kVar2 = kVar;
        C3083m mVar3 = mVar2;
        C3071ai aiVar2 = aiVar;
        C4030o oVar2 = oVar;
        C3862hu huVar2 = huVar;
        C3050bu buVar2 = buVar == null ? new C3050bu(this.f13953a.getContext(), huVar2, null) : buVar;
        this.f13972t = new C3732d(this.f13953a, oVar2);
        this.f13975w = huVar2;
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11781aF)).booleanValue()) {
            mo15009a("/adMetadata", (C3067ae<? super ReferenceT>) new C3062a<Object>(kVar2));
        }
        mo15009a("/appEvent", (C3067ae<? super ReferenceT>) new C3082l<Object>(mVar3));
        mo15009a("/backButton", C3085o.f8991j);
        mo15009a("/refresh", C3085o.f8992k);
        mo15009a("/canOpenURLs", C3085o.f8982a);
        mo15009a("/canOpenIntents", C3085o.f8983b);
        mo15009a("/click", C3085o.f8984c);
        mo15009a("/close", C3085o.f8985d);
        mo15009a("/customClose", C3085o.f8986e);
        mo15009a("/instrument", C3085o.f8995n);
        mo15009a("/delayPageLoaded", C3085o.f8997p);
        mo15009a("/delayPageClosed", C3085o.f8998q);
        mo15009a("/getLocationInfo", C3085o.f8999r);
        mo15009a("/httpTrack", C3085o.f8987f);
        mo15009a("/log", C3085o.f8988g);
        mo15009a("/mraid", (C3067ae<? super ReferenceT>) new C3074d<Object>(buVar2, this.f13972t, oVar2));
        mo15009a("/mraidLoaded", (C3067ae<? super ReferenceT>) this.f13970r);
        C3075e eVar = r1;
        C3050bu buVar3 = buVar2;
        C3075e eVar2 = new C3075e(this.f13953a.getContext(), this.f13953a.mo15807k(), this.f13953a.mo15922y(), sVar, anw, kVar2, mVar3, mVar, buVar2, this.f13972t);
        mo15009a("/open", (C3067ae<? super ReferenceT>) eVar);
        mo15009a("/precache", (C3067ae<? super ReferenceT>) new C4077pt<Object>());
        mo15009a("/touch", C3085o.f8990i);
        mo15009a("/video", C3085o.f8993l);
        mo15009a("/videoMeta", C3085o.f8994m);
        if (C3025aw.m10908B().mo15388a(this.f13953a.getContext())) {
            mo15009a("/logScionEvent", (C3067ae<? super ReferenceT>) new C3073c<Object>(this.f13953a.getContext()));
        }
        if (aiVar2 != null) {
            mo15009a("/setInterstitialProperties", (C3067ae<? super ReferenceT>) new C3070ah<Object>(aiVar2));
        }
        this.f13955c = anw;
        this.f13956d = mVar;
        this.f13959g = kVar2;
        this.f13960h = mVar2;
        this.f13969q = sVar;
        this.f13971s = buVar3;
        this.f13973u = oVar;
        this.f13963k = aiVar2;
        this.f13962j = z;
    }

    /* renamed from: a */
    public final void mo15931a(C4125rn rnVar) {
        this.f13957e = rnVar;
    }

    /* renamed from: a */
    public final void mo15932a(C4126ro roVar) {
        this.f13958f = roVar;
    }

    /* renamed from: a */
    public final void mo15933a(C4127rp rpVar) {
        this.f13961i = rpVar;
    }

    /* renamed from: a */
    public final void mo15934a(C4128rq rqVar) {
        this.f13974v = rqVar;
    }

    /* renamed from: a */
    public final void mo15005a(C4143se seVar) {
        this.f13976x = true;
        if (this.f13958f != null) {
            this.f13958f.mo15020a();
            this.f13958f = null;
        }
        m17990r();
    }

    /* renamed from: a */
    public final void mo16001a(boolean z) {
        this.f13962j = z;
    }

    /* renamed from: a */
    public final void mo16002a(boolean z, int i) {
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel((!this.f13953a.mo15923z() || this.f13953a.mo15917t().mo15997d()) ? this.f13955c : null, this.f13956d, this.f13969q, this.f13953a, z, i, this.f13953a.mo15807k());
        m17986a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo16003a(boolean z, int i, String str) {
        boolean z2 = this.f13953a.mo15923z();
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel((!z2 || this.f13953a.mo15917t().mo15997d()) ? this.f13955c : null, z2 ? null : new C4135rx(this.f13953a, this.f13956d), this.f13959g, this.f13960h, this.f13969q, this.f13953a, z, i, str, this.f13953a.mo15807k());
        m17986a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo16004a(boolean z, int i, String str, String str2) {
        boolean z2 = this.f13953a.mo15923z();
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel((!z2 || this.f13953a.mo15917t().mo15997d()) ? this.f13955c : null, z2 ? null : new C4135rx(this.f13953a, this.f13956d), this.f13959g, this.f13960h, this.f13969q, this.f13953a, z, i, str, str2, this.f13953a.mo15807k());
        m17986a(adOverlayInfoParcel);
    }

    /* renamed from: b */
    public final void mo15002b(C4143se seVar) {
        mo15011a(seVar.f14047b);
    }

    /* renamed from: b */
    public final boolean mo15942b() {
        boolean z;
        synchronized (this.f13954b) {
            z = this.f13964l;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo16005c() {
        boolean z;
        synchronized (this.f13954b) {
            z = this.f13965m;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo15001c(C4143se seVar) {
        String str = "AdWebView shouldOverrideUrlLoading: ";
        String valueOf = String.valueOf(seVar.f14046a);
        C3900je.m17043a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        Uri uri = seVar.f14047b;
        if (mo15011a(uri)) {
            return true;
        }
        if (this.f13962j) {
            String scheme = uri.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                if (this.f13955c != null) {
                    if (((Boolean) aoq.m14620f().mo14695a(aru.f11811aj)).booleanValue()) {
                        this.f13955c.mo9646e();
                        if (this.f13975w != null) {
                            this.f13975w.mo15368a(seVar.f14046a);
                        }
                        this.f13955c = null;
                    }
                }
                return false;
            }
        }
        if (!this.f13953a.getWebView().willNotDraw()) {
            try {
                agw y = this.f13953a.mo15922y();
                if (y != null && y.mo14288a(uri)) {
                    uri = y.mo14285a(uri, this.f13953a.getContext(), this.f13953a.getView(), this.f13953a.mo15801d());
                }
            } catch (agx unused) {
                String str2 = "Unable to append parameter to URL: ";
                String valueOf2 = String.valueOf(seVar.f14046a);
                C3900je.m17435e(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
            }
            if (this.f13971s == null || this.f13971s.mo12587b()) {
                zzc zzc = new zzc("android.intent.action.VIEW", uri.toString(), null, null, null, null, null);
                mo16000a(zzc);
                return true;
            }
            this.f13971s.mo12586a(seVar.f14046a);
            return true;
        }
        String str3 = "AdWebView unable to handle URL: ";
        String valueOf3 = String.valueOf(seVar.f14046a);
        C3900je.m17435e(valueOf3.length() != 0 ? str3.concat(valueOf3) : new String(str3));
        return true;
    }

    /* renamed from: d */
    public final OnGlobalLayoutListener mo16006d() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f13954b) {
            onGlobalLayoutListener = this.f13966n;
        }
        return onGlobalLayoutListener;
    }

    /* renamed from: d */
    public final WebResourceResponse mo16007d(C4143se seVar) {
        WebResourceResponse webResourceResponse;
        if (this.f13975w != null) {
            this.f13975w.mo15369a(seVar.f14046a, seVar.f14048c, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(seVar.f14046a).getName())) {
            webResourceResponse = null;
        } else {
            mo15954n();
            ark<String> ark = this.f13953a.mo15917t().mo15997d() ? aru.f11759K : this.f13953a.mo15923z() ? aru.f11758J : aru.f11757I;
            String str = (String) aoq.m14620f().mo14695a(ark);
            C3025aw.m10917e();
            webResourceResponse = C3909jn.m17157c(this.f13953a.getContext(), this.f13953a.mo15807k().f14505a, str);
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        try {
            if (!C3872id.m16944a(seVar.f14046a, this.f13953a.getContext()).equals(seVar.f14046a)) {
                return m17988e(seVar);
            }
            zzhl a = zzhl.m18799a(seVar.f14046a);
            if (a != null) {
                zzhi a2 = C3025aw.m10923k().mo14506a(a);
                if (a2 != null && a2.mo16260a()) {
                    return new WebResourceResponse("", "", a2.mo16261b());
                }
            }
            if (C3980md.m17412c()) {
                if (((Boolean) aoq.m14620f().mo14695a(aru.f11863bi)).booleanValue()) {
                    return m17988e(seVar);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            C3025aw.m10921i().mo15436a(e, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    /* renamed from: e */
    public final OnScrollChangedListener mo16008e() {
        OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f13954b) {
            onScrollChangedListener = this.f13967o;
        }
        return onScrollChangedListener;
    }

    /* renamed from: f */
    public final boolean mo15946f() {
        boolean z;
        synchronized (this.f13954b) {
            z = this.f13968p;
        }
        return z;
    }

    /* renamed from: g */
    public final void mo15947g() {
        C3862hu huVar = this.f13975w;
        if (huVar != null) {
            WebView webView = this.f13953a.getWebView();
            if (C0595r.m2276y(webView)) {
                m17985a((View) webView, huVar, 10);
                return;
            }
            m17989q();
            this.f13952A = new C4134rw(this, huVar);
            this.f13953a.getView().addOnAttachStateChangeListener(this.f13952A);
        }
    }

    /* renamed from: h */
    public final void mo15948h() {
        synchronized (this.f13954b) {
            this.f13968p = true;
        }
        this.f13978z++;
        m17990r();
    }

    /* renamed from: i */
    public final void mo15949i() {
        this.f13978z--;
        m17990r();
    }

    /* renamed from: j */
    public final void mo15950j() {
        this.f13977y = true;
        m17990r();
    }

    /* renamed from: k */
    public final void mo15013k() {
        if (this.f13975w != null) {
            this.f13975w.mo15375d();
            this.f13975w = null;
        }
        m17989q();
        super.mo15013k();
        synchronized (this.f13954b) {
            this.f13955c = null;
            this.f13956d = null;
            this.f13957e = null;
            this.f13958f = null;
            this.f13959g = null;
            this.f13960h = null;
            this.f13962j = false;
            this.f13964l = false;
            this.f13965m = false;
            this.f13968p = false;
            this.f13969q = null;
            this.f13961i = null;
            if (this.f13972t != null) {
                this.f13972t.mo15236a(true);
                this.f13972t = null;
            }
        }
    }

    /* renamed from: l */
    public final C4128rq mo16009l() {
        return this.f13974v;
    }

    /* renamed from: m */
    public final C3862hu mo15953m() {
        return this.f13975w;
    }

    /* renamed from: n */
    public final void mo15954n() {
        synchronized (this.f13954b) {
            this.f13962j = false;
            this.f13964l = true;
            C4014nk.f13617a.execute(new C4132ru(this));
        }
    }

    /* renamed from: o */
    public final /* synthetic */ Object mo15000o() {
        return this.f13953a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final /* synthetic */ void mo16010p() {
        this.f13953a.mo15869F();
        C3107c r = this.f13953a.mo15909r();
        if (r != null) {
            r.mo12679m();
        }
        if (this.f13961i != null) {
            this.f13961i.mo12541a();
            this.f13961i = null;
        }
    }
}
