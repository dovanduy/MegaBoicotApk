package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.p017v4.view.C0595r;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.exoplayer2.extractor.p132ts.TsExtractor;
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
import com.google.android.gms.common.util.C3564p;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.qf */
public class C4090qf extends WebViewClient implements C4124rm {

    /* renamed from: b */
    private static final String[] f13815b = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: c */
    private static final String[] f13816c = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    /* renamed from: A */
    private boolean f13817A;

    /* renamed from: B */
    private boolean f13818B;

    /* renamed from: C */
    private int f13819C;

    /* renamed from: D */
    private OnAttachStateChangeListener f13820D;

    /* renamed from: a */
    protected C3862hu f13821a;

    /* renamed from: d */
    private C4089qe f13822d;

    /* renamed from: e */
    private final HashMap<String, List<C3067ae<? super C4089qe>>> f13823e;

    /* renamed from: f */
    private final Object f13824f;

    /* renamed from: g */
    private anw f13825g;

    /* renamed from: h */
    private C3117m f13826h;

    /* renamed from: i */
    private C4125rn f13827i;

    /* renamed from: j */
    private C4126ro f13828j;

    /* renamed from: k */
    private C3081k f13829k;

    /* renamed from: l */
    private C3083m f13830l;

    /* renamed from: m */
    private C4127rp f13831m;

    /* renamed from: n */
    private boolean f13832n;

    /* renamed from: o */
    private C3071ai f13833o;
    @GuardedBy("mLock")

    /* renamed from: p */
    private boolean f13834p;
    @GuardedBy("mLock")

    /* renamed from: q */
    private boolean f13835q;
    @GuardedBy("mLock")

    /* renamed from: r */
    private OnGlobalLayoutListener f13836r;
    @GuardedBy("mLock")

    /* renamed from: s */
    private OnScrollChangedListener f13837s;
    @GuardedBy("mLock")

    /* renamed from: t */
    private boolean f13838t;

    /* renamed from: u */
    private C3123s f13839u;

    /* renamed from: v */
    private final C3976m f13840v;

    /* renamed from: w */
    private C3050bu f13841w;

    /* renamed from: x */
    private C3732d f13842x;

    /* renamed from: y */
    private C4030o f13843y;

    /* renamed from: z */
    private C4128rq f13844z;

    public C4090qf(C4089qe qeVar, boolean z) {
        this(qeVar, z, new C3976m(qeVar, qeVar.mo15908q(), new arf(qeVar.getContext())), null);
    }

    private C4090qf(C4089qe qeVar, boolean z, C3976m mVar, C3732d dVar) {
        this.f13823e = new HashMap<>();
        this.f13824f = new Object();
        this.f13832n = false;
        this.f13822d = qeVar;
        this.f13834p = z;
        this.f13840v = mVar;
        this.f13842x = null;
    }

    /* renamed from: a */
    private final void m17714a(Context context, String str, String str2, String str3) {
        String str4;
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11873bs)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            String str5 = "host";
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str4 = parse.getHost();
                    bundle.putString(str5, str4);
                    C3025aw.m10917e().mo15516a(context, this.f13822d.mo15807k().f14505a, "gmob-apps", bundle, true);
                }
            }
            str4 = "";
            bundle.putString(str5, str4);
            C3025aw.m10917e().mo15516a(context, this.f13822d.mo15807k().f14505a, "gmob-apps", bundle, true);
        }
    }

    /* renamed from: a */
    private final void m17715a(Uri uri) {
        String path = uri.getPath();
        List<C3067ae> list = (List) this.f13823e.get(path);
        if (list != null) {
            C3025aw.m10917e();
            Map a = C3909jn.m17133a(uri);
            if (C3900je.m17428a(2)) {
                String str = "Received GMSG: ";
                String valueOf = String.valueOf(path);
                C3900je.m17043a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                for (String str2 : a.keySet()) {
                    String str3 = (String) a.get(str2);
                    StringBuilder sb = new StringBuilder(4 + String.valueOf(str2).length() + String.valueOf(str3).length());
                    sb.append("  ");
                    sb.append(str2);
                    sb.append(": ");
                    sb.append(str3);
                    C3900je.m17043a(sb.toString());
                }
            }
            for (C3067ae zza : list) {
                zza.zza(this.f13822d, a);
            }
            return;
        }
        String valueOf2 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(32 + String.valueOf(valueOf2).length());
        sb2.append("No GMSG handler found for GMSG: ");
        sb2.append(valueOf2);
        C3900je.m17043a(sb2.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17716a(View view, C3862hu huVar, int i) {
        if (huVar.mo15372b() && i > 0) {
            huVar.mo15367a(view);
            if (huVar.mo15372b()) {
                C3909jn.f13411a.postDelayed(new C4092qh(this, view, huVar, i), 100);
            }
        }
    }

    /* renamed from: a */
    private final void m17717a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean a = this.f13842x != null ? this.f13842x.mo15237a() : false;
        C3025aw.m10915c();
        Context context = this.f13822d.getContext();
        if (!a) {
            z = true;
        }
        C3115k.m11206a(context, adOverlayInfoParcel, z);
        if (this.f13821a != null) {
            String str = adOverlayInfoParcel.f9074l;
            if (str == null && adOverlayInfoParcel.f9063a != null) {
                str = adOverlayInfoParcel.f9063a.f9122a;
            }
            this.f13821a.mo15368a(str);
        }
    }

    /* renamed from: b */
    private final WebResourceResponse m17719b(String str, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                httpURLConnection = (HttpURLConnection) openConnection;
                C3025aw.m10917e().mo15517a(this.f13822d.getContext(), this.f13822d.mo15807k().f14505a, false, httpURLConnection);
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
                        String str2 = "Redirecting to ";
                        String valueOf = String.valueOf(headerField);
                        C3900je.m17429b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                        httpURLConnection.disconnect();
                        url = url2;
                    } else {
                        String str3 = "Unsupported scheme: ";
                        String valueOf2 = String.valueOf(protocol);
                        C3900je.m17435e(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
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

    /* renamed from: p */
    private final void m17720p() {
        if (this.f13820D != null) {
            this.f13822d.getView().removeOnAttachStateChangeListener(this.f13820D);
        }
    }

    /* renamed from: q */
    private final void m17721q() {
        if (this.f13827i != null && ((this.f13817A && this.f13819C <= 0) || this.f13818B)) {
            this.f13827i.mo12684a(!this.f13818B);
            this.f13827i = null;
        }
        this.f13822d.mo15870G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final WebResourceResponse mo15924a(String str, Map<String, String> map) {
        try {
            String a = C3872id.m16944a(str, this.f13822d.getContext());
            if (!a.equals(str)) {
                return m17719b(a, map);
            }
            zzhl a2 = zzhl.m18799a(str);
            if (a2 != null) {
                zzhi a3 = C3025aw.m10923k().mo14506a(a2);
                if (a3 != null && a3.mo16260a()) {
                    return new WebResourceResponse("", "", a3.mo16261b());
                }
            }
            if (C3980md.m17412c()) {
                if (((Boolean) aoq.m14620f().mo14695a(aru.f11863bi)).booleanValue()) {
                    return m17719b(str, map);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            C3025aw.m10921i().mo15436a(e, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    /* renamed from: a */
    public final C3050bu mo15925a() {
        return this.f13841w;
    }

    /* renamed from: a */
    public final void mo15926a(int i, int i2) {
        if (this.f13842x != null) {
            this.f13842x.mo15233a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo15927a(int i, int i2, boolean z) {
        this.f13840v.mo15625a(i, i2);
        if (this.f13842x != null) {
            this.f13842x.mo15234a(i, i2, z);
        }
    }

    /* renamed from: a */
    public final void mo15928a(OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f13824f) {
            this.f13835q = true;
            this.f13822d.mo15869F();
            this.f13836r = onGlobalLayoutListener;
            this.f13837s = onScrollChangedListener;
        }
    }

    /* renamed from: a */
    public final void mo15929a(zzc zzc) {
        boolean z = this.f13822d.mo15923z();
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(zzc, (!z || this.f13822d.mo15917t().mo15997d()) ? this.f13825g : null, z ? null : this.f13826h, this.f13839u, this.f13822d.mo15807k());
        m17717a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo15930a(anw anw, C3081k kVar, C3117m mVar, C3083m mVar2, C3123s sVar, boolean z, C3071ai aiVar, C3050bu buVar, C4030o oVar, C3862hu huVar) {
        C3081k kVar2 = kVar;
        C3083m mVar3 = mVar2;
        C3071ai aiVar2 = aiVar;
        C4030o oVar2 = oVar;
        C3862hu huVar2 = huVar;
        C3050bu buVar2 = buVar == null ? new C3050bu(this.f13822d.getContext(), huVar2, null) : buVar;
        this.f13842x = new C3732d(this.f13822d, oVar2);
        this.f13821a = huVar2;
        if (((Boolean) aoq.m14620f().mo14695a(aru.f11781aF)).booleanValue()) {
            mo15935a("/adMetadata", (C3067ae<? super C4089qe>) new C3062a<Object>(kVar2));
        }
        mo15935a("/appEvent", (C3067ae<? super C4089qe>) new C3082l<Object>(mVar3));
        mo15935a("/backButton", C3085o.f8991j);
        mo15935a("/refresh", C3085o.f8992k);
        mo15935a("/canOpenURLs", C3085o.f8982a);
        mo15935a("/canOpenIntents", C3085o.f8983b);
        mo15935a("/click", C3085o.f8984c);
        mo15935a("/close", C3085o.f8985d);
        mo15935a("/customClose", C3085o.f8986e);
        mo15935a("/instrument", C3085o.f8995n);
        mo15935a("/delayPageLoaded", C3085o.f8997p);
        mo15935a("/delayPageClosed", C3085o.f8998q);
        mo15935a("/getLocationInfo", C3085o.f8999r);
        mo15935a("/httpTrack", C3085o.f8987f);
        mo15935a("/log", C3085o.f8988g);
        mo15935a("/mraid", (C3067ae<? super C4089qe>) new C3074d<Object>(buVar2, this.f13842x, oVar2));
        mo15935a("/mraidLoaded", (C3067ae<? super C4089qe>) this.f13840v);
        C3075e eVar = r1;
        C3050bu buVar3 = buVar2;
        C3075e eVar2 = new C3075e(this.f13822d.getContext(), this.f13822d.mo15807k(), this.f13822d.mo15922y(), sVar, anw, kVar2, mVar3, mVar, buVar2, this.f13842x);
        mo15935a("/open", (C3067ae<? super C4089qe>) eVar);
        mo15935a("/precache", (C3067ae<? super C4089qe>) new C4077pt<Object>());
        mo15935a("/touch", C3085o.f8990i);
        mo15935a("/video", C3085o.f8993l);
        mo15935a("/videoMeta", C3085o.f8994m);
        if (C3025aw.m10908B().mo15388a(this.f13822d.getContext())) {
            mo15935a("/logScionEvent", (C3067ae<? super C4089qe>) new C3073c<Object>(this.f13822d.getContext()));
        }
        if (aiVar2 != null) {
            mo15935a("/setInterstitialProperties", (C3067ae<? super C4089qe>) new C3070ah<Object>(aiVar2));
        }
        this.f13825g = anw;
        this.f13826h = mVar;
        this.f13829k = kVar2;
        this.f13830l = mVar2;
        this.f13839u = sVar;
        this.f13841w = buVar3;
        this.f13843y = oVar;
        this.f13833o = aiVar2;
        this.f13832n = z;
    }

    /* renamed from: a */
    public final void mo15931a(C4125rn rnVar) {
        this.f13827i = rnVar;
    }

    /* renamed from: a */
    public final void mo15932a(C4126ro roVar) {
        this.f13828j = roVar;
    }

    /* renamed from: a */
    public final void mo15933a(C4127rp rpVar) {
        this.f13831m = rpVar;
    }

    /* renamed from: a */
    public final void mo15934a(C4128rq rqVar) {
        this.f13844z = rqVar;
    }

    /* renamed from: a */
    public final void mo15935a(String str, C3067ae<? super C4089qe> aeVar) {
        synchronized (this.f13824f) {
            List list = (List) this.f13823e.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f13823e.put(str, list);
            }
            list.add(aeVar);
        }
    }

    /* renamed from: a */
    public final void mo15936a(String str, C3564p<C3067ae<? super C4089qe>> pVar) {
        synchronized (this.f13824f) {
            List<C3067ae> list = (List) this.f13823e.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (C3067ae aeVar : list) {
                    if (pVar.mo13697a(aeVar)) {
                        arrayList.add(aeVar);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    /* renamed from: a */
    public final void mo15937a(boolean z) {
        this.f13832n = z;
    }

    /* renamed from: a */
    public final void mo15938a(boolean z, int i) {
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel((!this.f13822d.mo15923z() || this.f13822d.mo15917t().mo15997d()) ? this.f13825g : null, this.f13826h, this.f13839u, this.f13822d, z, i, this.f13822d.mo15807k());
        m17717a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo15939a(boolean z, int i, String str) {
        boolean z2 = this.f13822d.mo15923z();
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel((!z2 || this.f13822d.mo15917t().mo15997d()) ? this.f13825g : null, z2 ? null : new C4095qk(this.f13822d, this.f13826h), this.f13829k, this.f13830l, this.f13839u, this.f13822d, z, i, str, this.f13822d.mo15807k());
        m17717a(adOverlayInfoParcel);
    }

    /* renamed from: a */
    public final void mo15940a(boolean z, int i, String str, String str2) {
        boolean z2 = this.f13822d.mo15923z();
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel((!z2 || this.f13822d.mo15917t().mo15997d()) ? this.f13825g : null, z2 ? null : new C4095qk(this.f13822d, this.f13826h), this.f13829k, this.f13830l, this.f13839u, this.f13822d, z, i, str, str2, this.f13822d.mo15807k());
        m17717a(adOverlayInfoParcel);
    }

    /* renamed from: b */
    public final void mo15941b(String str, C3067ae<? super C4089qe> aeVar) {
        synchronized (this.f13824f) {
            List list = (List) this.f13823e.get(str);
            if (list != null) {
                list.remove(aeVar);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo15942b() {
        boolean z;
        synchronized (this.f13824f) {
            z = this.f13834p;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo15943c() {
        boolean z;
        synchronized (this.f13824f) {
            z = this.f13835q;
        }
        return z;
    }

    /* renamed from: d */
    public final OnGlobalLayoutListener mo15944d() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f13824f) {
            onGlobalLayoutListener = this.f13836r;
        }
        return onGlobalLayoutListener;
    }

    /* renamed from: e */
    public final OnScrollChangedListener mo15945e() {
        OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f13824f) {
            onScrollChangedListener = this.f13837s;
        }
        return onScrollChangedListener;
    }

    /* renamed from: f */
    public final boolean mo15946f() {
        boolean z;
        synchronized (this.f13824f) {
            z = this.f13838t;
        }
        return z;
    }

    /* renamed from: g */
    public final void mo15947g() {
        C3862hu huVar = this.f13821a;
        if (huVar != null) {
            WebView webView = this.f13822d.getWebView();
            if (C0595r.m2276y(webView)) {
                m17716a((View) webView, huVar, 10);
                return;
            }
            m17720p();
            this.f13820D = new C4094qj(this, huVar);
            this.f13822d.getView().addOnAttachStateChangeListener(this.f13820D);
        }
    }

    /* renamed from: h */
    public final void mo15948h() {
        synchronized (this.f13824f) {
            this.f13838t = true;
        }
        this.f13819C++;
        m17721q();
    }

    /* renamed from: i */
    public final void mo15949i() {
        this.f13819C--;
        m17721q();
    }

    /* renamed from: j */
    public final void mo15950j() {
        this.f13818B = true;
        m17721q();
    }

    /* renamed from: k */
    public final void mo15951k() {
        if (this.f13821a != null) {
            this.f13821a.mo15375d();
            this.f13821a = null;
        }
        m17720p();
        synchronized (this.f13824f) {
            this.f13823e.clear();
            this.f13825g = null;
            this.f13826h = null;
            this.f13827i = null;
            this.f13828j = null;
            this.f13829k = null;
            this.f13830l = null;
            this.f13832n = false;
            this.f13834p = false;
            this.f13835q = false;
            this.f13838t = false;
            this.f13839u = null;
            this.f13831m = null;
            if (this.f13842x != null) {
                this.f13842x.mo15236a(true);
                this.f13842x = null;
            }
        }
    }

    /* renamed from: l */
    public final C4128rq mo15952l() {
        return this.f13844z;
    }

    /* renamed from: m */
    public final C3862hu mo15953m() {
        return this.f13821a;
    }

    /* renamed from: n */
    public final void mo15954n() {
        synchronized (this.f13824f) {
            this.f13832n = false;
            this.f13834p = true;
            C4014nk.f13617a.execute(new C4091qg(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final /* synthetic */ void mo15955o() {
        this.f13822d.mo15869F();
        C3107c r = this.f13822d.mo15909r();
        if (r != null) {
            r.mo12679m();
        }
        if (this.f13831m != null) {
            this.f13831m.mo12541a();
            this.f13831m = null;
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        String str2 = "Loading resource: ";
        String valueOf = String.valueOf(str);
        C3900je.m17043a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m17715a(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r0.f13828j == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r0.f13828j.mo15020a();
        r0.f13828j = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        m17721q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.f13817A = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.f13824f
            monitor-enter(r1)
            com.google.android.gms.internal.ads.qe r2 = r0.f13822d     // Catch:{ all -> 0x002b }
            boolean r2 = r2.mo15864A()     // Catch:{ all -> 0x002b }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.internal.ads.C3900je.m17043a(r2)     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.ads.qe r2 = r0.f13822d     // Catch:{ all -> 0x002b }
            r2.mo15865B()     // Catch:{ all -> 0x002b }
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            r1 = 1
            r0.f13817A = r1
            com.google.android.gms.internal.ads.ro r1 = r0.f13828j
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.internal.ads.ro r1 = r0.f13828j
            r1.mo15020a()
            r1 = 0
            r0.f13828j = r1
        L_0x0027:
            r0.m17721q()
            return
        L_0x002b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4090qf.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String str3;
        if (i < 0) {
            int i2 = (-i) - 1;
            if (i2 < f13815b.length) {
                str3 = f13815b[i2];
                m17714a(this.f13822d.getContext(), "http_err", str3, str2);
                super.onReceivedError(webView, i, str, str2);
            }
        }
        str3 = String.valueOf(i);
        m17714a(this.f13822d.getContext(), "http_err", str3, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            m17714a(this.f13822d.getContext(), "ssl_err", (primaryError < 0 || primaryError >= f13816c.length) ? String.valueOf(primaryError) : f13816c[primaryError], C3025aw.m10919g().mo15538a(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo15924a(str, Collections.emptyMap());
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (!(keyCode == 79 || keyCode == 222)) {
            switch (keyCode) {
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                    break;
                default:
                    switch (keyCode) {
                        case 126:
                        case 127:
                        case 128:
                        case TsExtractor.TS_STREAM_TYPE_AC3 /*129*/:
                        case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /*130*/:
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2 = "AdWebView shouldOverrideUrlLoading: ";
        String valueOf = String.valueOf(str);
        C3900je.m17043a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.f13832n && webView == this.f13822d.getWebView()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    if (this.f13825g != null) {
                        if (((Boolean) aoq.m14620f().mo14695a(aru.f11811aj)).booleanValue()) {
                            this.f13825g.mo9646e();
                            if (this.f13821a != null) {
                                this.f13821a.mo15368a(str);
                            }
                            this.f13825g = null;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f13822d.getWebView().willNotDraw()) {
                try {
                    agw y = this.f13822d.mo15922y();
                    if (y != null && y.mo14288a(parse)) {
                        parse = y.mo14285a(parse, this.f13822d.getContext(), this.f13822d.getView(), this.f13822d.mo15801d());
                    }
                } catch (agx unused) {
                    String str3 = "Unable to append parameter to URL: ";
                    String valueOf2 = String.valueOf(str);
                    C3900je.m17435e(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
                }
                if (this.f13841w == null || this.f13841w.mo12587b()) {
                    zzc zzc = new zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null);
                    mo15929a(zzc);
                    return true;
                }
                this.f13841w.mo12586a(str);
                return true;
            }
            String str4 = "AdWebView unable to handle URL: ";
            String valueOf3 = String.valueOf(str);
            C3900je.m17435e(valueOf3.length() != 0 ? str4.concat(valueOf3) : new String(str4));
            return true;
        }
        m17715a(parse);
        return true;
    }
}
