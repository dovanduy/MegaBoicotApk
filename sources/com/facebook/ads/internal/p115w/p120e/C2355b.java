package com.facebook.ads.internal.p115w.p120e;

import android.text.TextUtils;
import android.webkit.WebView;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Locale;

/* renamed from: com.facebook.ads.internal.w.e.b */
public class C2355b {
    /* renamed from: a */
    public static String m9113a() {
        String urlPrefix = AdInternalSettings.getUrlPrefix();
        if (TextUtils.isEmpty(urlPrefix)) {
            return "https://www.facebook.com/";
        }
        return String.format(Locale.US, "https://www.%s.facebook.com", new Object[]{urlPrefix});
    }

    /* renamed from: a */
    public static void m9114a(WebView webView) {
        webView.loadUrl("about:blank");
        webView.clearCache(true);
    }
}
