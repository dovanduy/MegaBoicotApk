package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

final class ale implements Runnable {

    /* renamed from: a */
    final /* synthetic */ akw f11348a;

    /* renamed from: b */
    final /* synthetic */ WebView f11349b;

    /* renamed from: c */
    final /* synthetic */ boolean f11350c;

    /* renamed from: d */
    final /* synthetic */ alc f11351d;

    /* renamed from: e */
    private ValueCallback<String> f11352e = new alf(this);

    ale(alc alc, akw akw, WebView webView, boolean z) {
        this.f11351d = alc;
        this.f11348a = akw;
        this.f11349b = webView;
        this.f11350c = z;
    }

    public final void run() {
        if (this.f11349b.getSettings().getJavaScriptEnabled()) {
            try {
                this.f11349b.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f11352e);
            } catch (Throwable unused) {
                this.f11352e.onReceiveValue("");
            }
        }
    }
}
