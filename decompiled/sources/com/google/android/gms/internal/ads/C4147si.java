package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebView;
import com.google.android.gms.common.util.C3563o;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.si */
final class C4147si {
    @GuardedBy("InvokeJavascriptWorkaround.class")

    /* renamed from: a */
    private static Boolean f14053a;

    private C4147si() {
    }

    @TargetApi(19)
    /* renamed from: a */
    static void m18123a(WebView webView, String str) {
        if (!C3563o.m12768g() || !m18124a(webView)) {
            String str2 = "javascript:";
            String valueOf = String.valueOf(str);
            webView.loadUrl(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return;
        }
        webView.evaluateJavascript(str, null);
    }

    @TargetApi(19)
    /* renamed from: a */
    private static boolean m18124a(WebView webView) {
        boolean booleanValue;
        synchronized (C4147si.class) {
            if (f14053a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    f14053a = Boolean.valueOf(true);
                } catch (IllegalStateException unused) {
                    f14053a = Boolean.valueOf(false);
                }
            }
            booleanValue = f14053a.booleanValue();
        }
        return booleanValue;
    }
}
