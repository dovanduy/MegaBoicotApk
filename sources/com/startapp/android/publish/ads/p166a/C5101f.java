package com.startapp.android.publish.ads.p166a;

import android.os.Handler;
import android.webkit.WebView;

/* renamed from: com.startapp.android.publish.ads.a.f */
/* compiled from: StartAppSDK */
public class C5101f extends C5086c {
    /* renamed from: a */
    public void mo18739a(WebView webView) {
        super.mo18739a(webView);
        if (mo18714g().equals("interstitial")) {
            webView.setBackgroundColor(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo18744c(final WebView webView) {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                try {
                    webView.setBackgroundColor(0);
                } catch (Exception unused) {
                }
            }
        }, 1000);
    }
}
