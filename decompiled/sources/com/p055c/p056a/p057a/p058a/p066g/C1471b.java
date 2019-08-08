package com.p055c.p056a.p057a.p058a.p066g;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* renamed from: com.c.a.a.a.g.b */
public class C1471b extends C1469a {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C1471b(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo6561a(webView);
    }
}
