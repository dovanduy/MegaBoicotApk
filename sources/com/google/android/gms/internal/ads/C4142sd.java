package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.exoplayer2.extractor.p132ts.TsExtractor;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3718cm
/* renamed from: com.google.android.gms.internal.ads.sd */
final class C4142sd extends WebViewClient {

    /* renamed from: a */
    private final C4146sh f14041a;

    /* renamed from: b */
    private final C4151sm f14042b;

    /* renamed from: c */
    private final C4148sj f14043c;

    /* renamed from: d */
    private final C4150sl f14044d;

    /* renamed from: e */
    private final C4152sn f14045e = new C4152sn();

    C4142sd(C4146sh shVar, C4151sm smVar, C4148sj sjVar, C4150sl slVar) {
        this.f14041a = shVar;
        this.f14042b = smVar;
        this.f14043c = sjVar;
        this.f14044d = slVar;
    }

    /* renamed from: a */
    private final boolean m18114a(C4143se seVar) {
        return this.f14041a.mo15001c(seVar);
    }

    /* renamed from: b */
    private final WebResourceResponse m18115b(C4143se seVar) {
        return this.f14042b.mo16007d(seVar);
    }

    public final void onLoadResource(WebView webView, String str) {
        if (str != null) {
            String str2 = "Loading resource: ";
            String valueOf = String.valueOf(str);
            C3900je.m17043a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            this.f14043c.mo15002b(new C4143se(str));
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (str != null) {
            this.f14044d.mo15005a(new C4143se(str));
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f14045e.mo16053a(i, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f14045e.mo16054a(sslError);
    }

    @TargetApi(24)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return m18115b(new C4143se(webResourceRequest));
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str == null) {
            return null;
        }
        return m18115b(new C4143se(str));
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
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

    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return false;
        }
        return m18114a(new C4143se(webResourceRequest));
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        return m18114a(new C4143se(str));
    }
}
