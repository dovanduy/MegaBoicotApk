package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C3025aw;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.sc */
public class C4141sc extends WebView implements C4146sh, C4148sj, C4150sl, C4151sm {

    /* renamed from: a */
    protected final WebViewClient f14035a;

    /* renamed from: b */
    private final List<C4146sh> f14036b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private final List<C4151sm> f14037c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private final List<C4148sj> f14038d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private final List<C4150sl> f14039e = new CopyOnWriteArrayList();

    /* renamed from: f */
    private final C4129rr f14040f;

    public C4141sc(C4129rr rrVar) {
        super(rrVar);
        this.f14040f = rrVar;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        C3025aw.m10919g().mo15543a(getContext(), settings);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        try {
            getSettings().setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            C3900je.m17430b("Unable to enable Javascript.", e);
        }
        setLayerType(1, null);
        this.f14035a = new C4142sd(this, this, this, this);
        super.setWebViewClient(this.f14035a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final C4129rr mo16026K() {
        return this.f14040f;
    }

    /* renamed from: a */
    public void mo15005a(C4143se seVar) {
        for (C4150sl a : this.f14039e) {
            a.mo15005a(seVar);
        }
    }

    /* renamed from: a */
    public final void mo16027a(C4146sh shVar) {
        this.f14036b.add(shVar);
    }

    /* renamed from: a */
    public final void mo16028a(C4148sj sjVar) {
        this.f14038d.add(sjVar);
    }

    /* renamed from: a */
    public final void mo16029a(C4150sl slVar) {
        this.f14039e.add(slVar);
    }

    /* renamed from: a */
    public final void mo16030a(C4151sm smVar) {
        this.f14037c.add(smVar);
    }

    public void addJavascriptInterface(Object obj, String str) {
        if (VERSION.SDK_INT >= 17) {
            super.addJavascriptInterface(obj, str);
        } else {
            C3900je.m17043a("Ignore addJavascriptInterface due to low Android version.");
        }
    }

    /* renamed from: b */
    public final void mo15002b(C4143se seVar) {
        for (C4148sj b : this.f14038d) {
            b.mo15002b(seVar);
        }
    }

    /* renamed from: b */
    public void mo14993b(String str) {
        C4147si.m18123a(this, str);
    }

    /* renamed from: c */
    public final boolean mo15001c(C4143se seVar) {
        for (C4146sh c : this.f14036b) {
            if (c.mo15001c(seVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final WebResourceResponse mo16007d(C4143se seVar) {
        for (C4151sm d : this.f14037c) {
            WebResourceResponse d2 = d.mo16007d(seVar);
            if (d2 != null) {
                return d2;
            }
        }
        return null;
    }

    public void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
            C3025aw.m10921i().mo15436a(e, "CoreWebView.loadUrl");
            C3900je.m17434d("#007 Could not call remote method.", e);
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
    }
}
