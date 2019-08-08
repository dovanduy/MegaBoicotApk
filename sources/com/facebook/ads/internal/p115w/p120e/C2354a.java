package com.facebook.ads.internal.p115w.p120e;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.facebook.ads.internal.w.e.a */
public abstract class C2354a extends WebView {

    /* renamed from: a */
    private static final String f7422a = "a";

    /* renamed from: b */
    private boolean f7423b;

    public C2354a(Context context) {
        super(context);
        setWebChromeClient(mo8041a());
        setWebViewClient(mo8044b());
        WebSettings settings = getSettings();
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        } else {
            try {
                WebSettings.class.getMethod("setMixedContentMode", new Class[0]).invoke(settings, new Object[]{Integer.valueOf(0)});
            } catch (Exception unused) {
            }
        }
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        if (VERSION.SDK_INT >= 17) {
            getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        if (VERSION.SDK_INT >= 21) {
            try {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
            } catch (Exception unused2) {
                Log.w(f7422a, "Failed to initialize CookieManager.");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public WebChromeClient mo8041a() {
        return new WebChromeClient();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public WebViewClient mo8044b() {
        return new WebViewClient();
    }

    /* renamed from: c */
    public boolean mo8759c() {
        return this.f7423b;
    }

    public void destroy() {
        this.f7423b = true;
        super.destroy();
    }
}
