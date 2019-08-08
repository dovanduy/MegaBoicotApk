package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(11)
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.rc */
public final class C4114rc extends C4115rd {
    public C4114rc(C4089qe qeVar, boolean z) {
        super(qeVar, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo15989a(webView, str, null);
    }
}
