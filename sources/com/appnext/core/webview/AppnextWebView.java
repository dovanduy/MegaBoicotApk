package com.appnext.core.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appnext.core.C1326f;
import com.google.android.exoplayer2.C2793C;
import java.io.IOException;
import java.net.HttpRetryException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class AppnextWebView {

    /* renamed from: mh */
    public static final int f4288mh = 1;

    /* renamed from: mi */
    public static final int f4289mi = 2;
    /* access modifiers changed from: private */

    /* renamed from: mj */
    public static AppnextWebView f4290mj;
    /* access modifiers changed from: private */

    /* renamed from: eR */
    public WebAppInterface f4291eR;
    /* access modifiers changed from: private */

    /* renamed from: mk */
    public final HashMap<String, C1375b> f4292mk = new HashMap<>();

    /* renamed from: ml */
    private HashMap<String, WebView> f4293ml;

    private class WebInterface extends WebAppInterface {
        public WebInterface() {
        }

        @JavascriptInterface
        public void destroy(String str) {
            super.destroy(str);
            if (AppnextWebView.f4290mj.f4291eR != null) {
                AppnextWebView.f4290mj.f4291eR.destroy(str);
            }
        }

        @JavascriptInterface
        public void postView(String str) {
            super.postView(str);
            if (AppnextWebView.f4290mj.f4291eR != null) {
                AppnextWebView.f4290mj.f4291eR.postView(str);
            }
        }

        @JavascriptInterface
        public void openStore(String str) {
            super.openStore(str);
            if (AppnextWebView.f4290mj.f4291eR != null) {
                AppnextWebView.f4290mj.f4291eR.openStore(str);
            }
        }

        @JavascriptInterface
        public void play() {
            super.play();
            if (AppnextWebView.f4290mj.f4291eR != null) {
                AppnextWebView.f4290mj.f4291eR.play();
            }
        }

        @JavascriptInterface
        public String filterAds(String str) {
            super.filterAds(str);
            return AppnextWebView.f4290mj.f4291eR != null ? AppnextWebView.f4290mj.f4291eR.filterAds(str) : str;
        }

        @JavascriptInterface
        public String loadAds() {
            super.loadAds();
            return AppnextWebView.f4290mj.f4291eR != null ? AppnextWebView.f4290mj.f4291eR.loadAds() : "";
        }

        @JavascriptInterface
        public void openLink(String str) {
            super.openLink(str);
            if (AppnextWebView.f4290mj.f4291eR != null) {
                AppnextWebView.f4290mj.f4291eR.openLink(str);
            }
        }

        @JavascriptInterface
        public void gotoAppWall() {
            super.gotoAppWall();
            if (AppnextWebView.f4290mj.f4291eR != null) {
                AppnextWebView.f4290mj.f4291eR.gotoAppWall();
            }
        }

        @JavascriptInterface
        public void videoPlayed() {
            super.videoPlayed();
            if (AppnextWebView.f4290mj.f4291eR != null) {
                AppnextWebView.f4290mj.f4291eR.videoPlayed();
            }
        }

        @JavascriptInterface
        public void notifyImpression(String str) {
            super.notifyImpression(str);
            if (AppnextWebView.f4290mj.f4291eR != null) {
                AppnextWebView.f4290mj.f4291eR.notifyImpression(str);
            }
        }

        @JavascriptInterface
        public void jsError(String str) {
            super.jsError(str);
            if (AppnextWebView.f4290mj.f4291eR != null) {
                AppnextWebView.f4290mj.f4291eR.jsError(str);
            }
        }

        @JavascriptInterface
        public void openResultPage(String str) {
            super.openResultPage(str);
            if (AppnextWebView.f4290mj.f4291eR != null) {
                AppnextWebView.f4290mj.f4291eR.openResultPage(str);
            }
        }

        @JavascriptInterface
        public void logSTP(String str, String str2) {
            super.logSTP(str, str2);
            if (AppnextWebView.f4290mj.f4291eR != null) {
                AppnextWebView.f4290mj.f4291eR.logSTP(str, str2);
            }
        }
    }

    /* renamed from: com.appnext.core.webview.AppnextWebView$a */
    private class C1374a extends AsyncTask<String, Void, String> {

        /* renamed from: mn */
        C1375b f4297mn;

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            String str = (String) obj;
            super.onPostExecute(str);
            if (str.startsWith("error:")) {
                this.f4297mn.state = 0;
                AppnextWebView.this.f4292mk.put(this.f4297mn.f4298bU, this.f4297mn);
                AppnextWebView.m5801a(AppnextWebView.this, this.f4297mn, str.substring(7));
                return;
            }
            this.f4297mn.state = 2;
            AppnextWebView.this.f4292mk.put(this.f4297mn.f4298bU, this.f4297mn);
            AppnextWebView.m5804b(AppnextWebView.this, this.f4297mn, str);
        }

        public C1374a(C1375b bVar) {
            this.f4297mn = bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final String doInBackground(String... strArr) {
            try {
                C1375b bVar = (C1375b) AppnextWebView.this.f4292mk.get(strArr[0]);
                bVar.f4301mo = C1326f.m5662a(strArr[0], null, true, 10000);
                AppnextWebView.this.f4292mk.put(strArr[0], bVar);
                return strArr[0];
            } catch (HttpRetryException e) {
                StringBuilder sb = new StringBuilder("error: ");
                sb.append(e.getReason());
                return sb.toString();
            } catch (IOException unused) {
                return "error: network problem";
            } catch (Throwable unused2) {
                return "error: unknown error";
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: aS */
        public final void mo6326aS(String str) {
            super.onPostExecute(str);
            if (str.startsWith("error:")) {
                this.f4297mn.state = 0;
                AppnextWebView.this.f4292mk.put(this.f4297mn.f4298bU, this.f4297mn);
                AppnextWebView.m5801a(AppnextWebView.this, this.f4297mn, str.substring(7));
                return;
            }
            this.f4297mn.state = 2;
            AppnextWebView.this.f4292mk.put(this.f4297mn.f4298bU, this.f4297mn);
            AppnextWebView.m5804b(AppnextWebView.this, this.f4297mn, str);
        }
    }

    /* renamed from: com.appnext.core.webview.AppnextWebView$b */
    private class C1375b {

        /* renamed from: bU */
        public String f4298bU;

        /* renamed from: lC */
        public ArrayList<C1376c> f4299lC;

        /* renamed from: mo */
        public String f4301mo;
        public int state;

        private C1375b() {
            this.state = 0;
            this.f4301mo = "";
            this.f4299lC = new ArrayList<>();
        }
    }

    /* renamed from: com.appnext.core.webview.AppnextWebView$c */
    public interface C1376c {
        /* renamed from: b */
        void mo5656b(String str);

        void error(String str);
    }

    /* renamed from: a */
    public final void mo6320a(WebAppInterface webAppInterface) {
        if (this.f4291eR == webAppInterface) {
            this.f4291eR = null;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: B */
    public static AppnextWebView m5797B(Context context) {
        if (f4290mj == null) {
            AppnextWebView appnextWebView = new AppnextWebView();
            f4290mj = appnextWebView;
            appnextWebView.f4293ml = new HashMap<>();
        }
        return f4290mj;
    }

    private AppnextWebView() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo6321a(java.lang.String r8, com.appnext.core.webview.AppnextWebView.C1376c r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.HashMap<java.lang.String, com.appnext.core.webview.AppnextWebView$b> r0 = r7.f4292mk     // Catch:{ all -> 0x004c }
            boolean r0 = r0.containsKey(r8)     // Catch:{ all -> 0x004c }
            r1 = 0
            if (r0 == 0) goto L_0x0013
            java.util.HashMap<java.lang.String, com.appnext.core.webview.AppnextWebView$b> r0 = r7.f4292mk     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x004c }
            com.appnext.core.webview.AppnextWebView$b r0 = (com.appnext.core.webview.AppnextWebView.C1375b) r0     // Catch:{ all -> 0x004c }
            goto L_0x001a
        L_0x0013:
            com.appnext.core.webview.AppnextWebView$b r0 = new com.appnext.core.webview.AppnextWebView$b     // Catch:{ all -> 0x004c }
            r0.<init>()     // Catch:{ all -> 0x004c }
            r0.f4298bU = r8     // Catch:{ all -> 0x004c }
        L_0x001a:
            int r2 = r0.state     // Catch:{ all -> 0x004c }
            r3 = 2
            if (r2 != r3) goto L_0x0026
            if (r9 == 0) goto L_0x004a
            r9.mo5656b(r8)     // Catch:{ all -> 0x004c }
            monitor-exit(r7)
            return
        L_0x0026:
            int r2 = r0.state     // Catch:{ all -> 0x004c }
            if (r2 != 0) goto L_0x003e
            r2 = 1
            r0.state = r2     // Catch:{ all -> 0x004c }
            com.appnext.core.webview.AppnextWebView$a r4 = new com.appnext.core.webview.AppnextWebView$a     // Catch:{ all -> 0x004c }
            r4.<init>(r0)     // Catch:{ all -> 0x004c }
            java.util.concurrent.Executor r5 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch:{ all -> 0x004c }
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x004c }
            r6 = 0
            r3[r6] = r8     // Catch:{ all -> 0x004c }
            r3[r2] = r1     // Catch:{ all -> 0x004c }
            r4.executeOnExecutor(r5, r3)     // Catch:{ all -> 0x004c }
        L_0x003e:
            if (r9 == 0) goto L_0x0045
            java.util.ArrayList<com.appnext.core.webview.AppnextWebView$c> r1 = r0.f4299lC     // Catch:{ all -> 0x004c }
            r1.add(r9)     // Catch:{ all -> 0x004c }
        L_0x0045:
            java.util.HashMap<java.lang.String, com.appnext.core.webview.AppnextWebView$b> r9 = r7.f4292mk     // Catch:{ all -> 0x004c }
            r9.put(r8, r0)     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r7)
            return
        L_0x004c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.webview.AppnextWebView.mo6321a(java.lang.String, com.appnext.core.webview.AppnextWebView$c):void");
    }

    @SuppressLint({"SetJavaScriptEnabled", "NewApi", "InlinedApi"})
    /* renamed from: C */
    private WebView m5798C(Context context) {
        WebView webView = new WebView(context.getApplicationContext());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setDatabaseEnabled(true);
        if (VERSION.SDK_INT >= 21) {
            webView.getSettings().setMixedContentMode(0);
        }
        if (VERSION.SDK_INT >= 17) {
            webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient() {
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str == null) {
                    return false;
                }
                if (!str.startsWith("http")) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                webView.loadUrl(str);
                return true;
            }
        });
        return webView;
    }

    @SuppressLint({"AddJavascriptInterface"})
    /* renamed from: a */
    public final WebView mo6319a(Context context, String str, WebAppInterface webAppInterface, C1377a aVar, String str2) {
        String str3;
        try {
            f4290mj.f4291eR = webAppInterface;
            WebView webView = (WebView) this.f4293ml.get(str2);
            if (!(webView == null || webView.getParent() == null)) {
                ((ViewGroup) webView.getParent()).removeView(webView);
            }
            URL url = new URL(str);
            StringBuilder sb = new StringBuilder();
            sb.append(url.getProtocol());
            sb.append("://");
            sb.append(url.getHost());
            String sb2 = sb.toString();
            WebView webView2 = new WebView(context.getApplicationContext());
            webView2.getSettings().setJavaScriptEnabled(true);
            webView2.getSettings().setAppCacheEnabled(true);
            webView2.getSettings().setDomStorageEnabled(true);
            webView2.getSettings().setDatabaseEnabled(true);
            if (VERSION.SDK_INT >= 21) {
                webView2.getSettings().setMixedContentMode(0);
            }
            if (VERSION.SDK_INT >= 17) {
                webView2.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            webView2.setWebChromeClient(new WebChromeClient());
            webView2.setWebViewClient(new WebViewClient() {
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (str == null) {
                        return false;
                    }
                    if (!str.startsWith("http")) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    webView.loadUrl(str);
                    return true;
                }
            });
            if (this.f4292mk.containsKey(str) && ((C1375b) this.f4292mk.get(str)).state == 2 && !((C1375b) this.f4292mk.get(str)).f4301mo.equals("")) {
                StringBuilder sb3 = new StringBuilder("<script>");
                sb3.append(((C1375b) this.f4292mk.get(str)).f4301mo);
                sb3.append("</script>");
                str3 = sb3.toString();
            } else if (aVar != null) {
                StringBuilder sb4 = new StringBuilder("<script>");
                sb4.append(aVar.mo5725d());
                sb4.append("</script>");
                str3 = sb4.toString();
            } else {
                StringBuilder sb5 = new StringBuilder("<script src='");
                sb5.append(str);
                sb5.append("'></script>");
                str3 = sb5.toString();
            }
            StringBuilder sb6 = new StringBuilder("<html><body>");
            sb6.append(str3);
            sb6.append("</body></html>");
            webView2.loadDataWithBaseURL(sb2, sb6.toString(), null, C2793C.UTF8_NAME, null);
            this.f4293ml.put(str2, webView2);
            webView2.addJavascriptInterface(new WebInterface(), "Appnext");
            return webView2;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: aT */
    public final boolean mo6322aT(String str) {
        return this.f4293ml.get(str) != null;
    }

    /* renamed from: aU */
    public final WebView mo6323aU(String str) {
        WebView webView = (WebView) this.f4293ml.get(str);
        if (!(webView == null || webView.getParent() == null)) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
        return webView;
    }

    /* renamed from: aV */
    public final String mo6324aV(String str) {
        C1375b bVar = (C1375b) this.f4292mk.get(str);
        if (bVar == null || bVar.state != 2) {
            return null;
        }
        return bVar.f4301mo;
    }

    /* renamed from: b */
    public static void m5805b(WebAppInterface webAppInterface) {
        f4290mj.f4291eR = webAppInterface;
    }

    /* renamed from: a */
    private void m5800a(C1375b bVar, String str) {
        new StringBuilder("webview error: ").append(str);
        synchronized (this.f4292mk) {
            Iterator it = bVar.f4299lC.iterator();
            while (it.hasNext()) {
                ((C1376c) it.next()).error(str);
            }
            bVar.f4299lC.clear();
            this.f4292mk.remove(bVar.f4298bU);
        }
    }

    /* renamed from: b */
    private void m5803b(C1375b bVar, String str) {
        new StringBuilder("downloaded ").append(str);
        synchronized (this.f4292mk) {
            Iterator it = bVar.f4299lC.iterator();
            while (it.hasNext()) {
                ((C1376c) it.next()).mo5656b(str);
            }
            bVar.f4299lC.clear();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m5801a(AppnextWebView appnextWebView, C1375b bVar, String str) {
        new StringBuilder("webview error: ").append(str);
        synchronized (appnextWebView.f4292mk) {
            Iterator it = bVar.f4299lC.iterator();
            while (it.hasNext()) {
                ((C1376c) it.next()).error(str);
            }
            bVar.f4299lC.clear();
            appnextWebView.f4292mk.remove(bVar.f4298bU);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m5804b(AppnextWebView appnextWebView, C1375b bVar, String str) {
        new StringBuilder("downloaded ").append(str);
        synchronized (appnextWebView.f4292mk) {
            Iterator it = bVar.f4299lC.iterator();
            while (it.hasNext()) {
                ((C1376c) it.next()).mo5656b(str);
            }
            bVar.f4299lC.clear();
        }
    }
}
