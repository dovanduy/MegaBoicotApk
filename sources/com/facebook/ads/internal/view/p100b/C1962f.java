package com.facebook.ads.internal.view.p100b;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.ConsoleMessage.MessageLevel;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.p115w.p120e.C2354a;
import com.facebook.ads.internal.p115w.p120e.C2355b;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.b.f */
public class C1962f extends C2354a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f6164a = "f";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Set<String> f6165b = new HashSet(2);

    /* renamed from: c */
    private C1963a f6166c;

    /* renamed from: d */
    private C1960d f6167d;

    /* renamed from: e */
    private long f6168e = -1;

    /* renamed from: f */
    private long f6169f = -1;

    /* renamed from: g */
    private long f6170g = -1;

    /* renamed from: h */
    private long f6171h = -1;

    /* renamed from: com.facebook.ads.internal.view.b.f$a */
    public interface C1963a {
        /* renamed from: a */
        void mo8014a(int i);

        /* renamed from: a */
        void mo8015a(String str);

        /* renamed from: b */
        void mo8016b(String str);

        /* renamed from: c */
        void mo8017c(String str);
    }

    /* renamed from: com.facebook.ads.internal.view.b.f$b */
    static class C1964b extends WebChromeClient {

        /* renamed from: a */
        private final WeakReference<C1963a> f6172a;

        /* renamed from: b */
        private final WeakReference<C1960d> f6173b;

        C1964b(WeakReference<C1963a> weakReference, WeakReference<C1960d> weakReference2) {
            this.f6172a = weakReference;
            this.f6173b = weakReference2;
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String message = consoleMessage.message();
            if (!TextUtils.isEmpty(message) && consoleMessage.messageLevel() == MessageLevel.LOG && this.f6173b.get() != null) {
                ((C1960d) this.f6173b.get()).mo8037a(message);
            }
            return true;
        }

        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            if (this.f6173b.get() != null) {
                ((C1960d) this.f6173b.get()).mo8036a();
            }
            if (this.f6172a.get() != null) {
                ((C1963a) this.f6172a.get()).mo8014a(i);
            }
        }

        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (this.f6172a.get() != null) {
                ((C1963a) this.f6172a.get()).mo8016b(str);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.b.f$c */
    static class C1965c extends WebViewClient {

        /* renamed from: a */
        private final WeakReference<C1963a> f6174a;

        /* renamed from: b */
        private final WeakReference<Context> f6175b;

        C1965c(WeakReference<C1963a> weakReference, WeakReference<Context> weakReference2) {
            this.f6174a = weakReference;
            this.f6175b = weakReference2;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f6174a.get() != null) {
                ((C1963a) this.f6174a.get()).mo8017c(str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (this.f6174a.get() != null) {
                ((C1963a) this.f6174a.get()).mo8015a(str);
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri parse = Uri.parse(str);
            if (!C1962f.f6165b.contains(parse.getScheme()) && this.f6175b.get() != null) {
                try {
                    ((Context) this.f6175b.get()).startActivity(new Intent("android.intent.action.VIEW", parse));
                    return true;
                } catch (ActivityNotFoundException e) {
                    Log.w(C1962f.f6164a, "Activity not found to handle URI.", e);
                } catch (Exception e2) {
                    Log.e(C1962f.f6164a, "Unknown exception occurred when trying to handle URI.", e2);
                }
            }
            return false;
        }
    }

    static {
        f6165b.add("http");
        f6165b.add("https");
    }

    public C1962f(Context context) {
        super(context);
        m8098f();
    }

    public C1962f(Context context, C1963a aVar) {
        super(context);
        this.f6166c = aVar;
        setWebChromeClient(mo8041a());
        setWebViewClient(mo8044b());
        m8098f();
    }

    /* renamed from: f */
    private void m8098f() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        this.f6167d = new C1960d(this);
    }

    /* renamed from: g */
    private void m8099g() {
        if (this.f6169f > -1 && this.f6170g > -1 && this.f6171h > -1) {
            this.f6167d.mo8038a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public WebChromeClient mo8041a() {
        return new C1964b(new WeakReference(this.f6166c), new WeakReference(this.f6167d));
    }

    /* renamed from: a */
    public void mo8042a(long j) {
        if (this.f6168e < 0) {
            this.f6168e = j;
        }
    }

    /* renamed from: a */
    public void mo8043a(String str) {
        try {
            evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("javascript:");
            sb.append(str);
            loadUrl(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public WebViewClient mo8044b() {
        return new C1965c(new WeakReference(this.f6166c), new WeakReference(getContext()));
    }

    /* renamed from: b */
    public void mo8045b(long j) {
        if (this.f6169f < 0) {
            this.f6169f = j;
        }
        m8099g();
    }

    /* renamed from: c */
    public void mo8046c(long j) {
        if (this.f6171h < 0) {
            this.f6171h = j;
        }
        m8099g();
    }

    public void destroy() {
        this.f6166c = null;
        C2355b.m9114a(this);
        super.destroy();
    }

    public long getDomContentLoadedMs() {
        return this.f6169f;
    }

    public String getFirstUrl() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        return copyBackForwardList.getSize() > 0 ? copyBackForwardList.getItemAtIndex(0).getUrl() : getUrl();
    }

    public long getLoadFinishMs() {
        return this.f6171h;
    }

    public long getResponseEndMs() {
        return this.f6168e;
    }

    public long getScrollReadyMs() {
        return this.f6170g;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f6170g < 0 && computeVerticalScrollRange() > getHeight()) {
            this.f6170g = System.currentTimeMillis();
            m8099g();
        }
    }

    public void setListener(C1963a aVar) {
        this.f6166c = aVar;
    }
}
