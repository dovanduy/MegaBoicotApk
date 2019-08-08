package com.facebook.ads.internal.adapters.p073c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.adapters.p072b.C1605n;
import com.facebook.ads.internal.adapters.p072b.C1606o;
import com.facebook.ads.internal.adapters.p072b.C1607p;
import com.facebook.ads.internal.p081h.C1723a;
import com.facebook.ads.internal.p081h.C1724b;
import com.facebook.ads.internal.p091r.C1795a;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.adapters.c.a */
public final class C1610a {

    /* renamed from: com.facebook.ads.internal.adapters.c.a$a */
    private static class C1612a implements C1723a {

        /* renamed from: a */
        final Context f4983a;

        /* renamed from: b */
        final WeakReference<C1613b> f4984b;

        /* renamed from: c */
        final C1724b f4985c;

        /* renamed from: d */
        final C1605n f4986d;

        /* renamed from: e */
        final boolean f4987e;

        private C1612a(Context context, C1613b bVar, C1724b bVar2, C1605n nVar, boolean z) {
            this.f4983a = context;
            this.f4984b = new WeakReference<>(bVar);
            this.f4985c = bVar2;
            this.f4986d = nVar;
            this.f4987e = z;
        }

        /* renamed from: a */
        private void m6726a(boolean z) {
            if (this.f4984b.get() != null) {
                if (this.f4986d.mo7220k() == C1607p.WEBVIEW_PRECACHE) {
                    WebView webView = new WebView(this.f4983a);
                    webView.getSettings().setCacheMode(1);
                    webView.setWebViewClient(new C1614c(this.f4986d, this.f4984b, this.f4987e));
                    webView.loadUrl(this.f4986d.mo7209a());
                    return;
                }
                String a = this.f4986d.mo7209a();
                if (z) {
                    a = this.f4986d.mo7220k() == C1607p.FILE_PRECACHE ? this.f4985c.mo7497d(this.f4986d.mo7209a()) : this.f4985c.mo7496c(this.f4986d.mo7209a());
                }
                this.f4986d.mo7210a(a);
                ((C1613b) this.f4984b.get()).mo7240a();
            }
        }

        /* renamed from: a */
        public void mo7016a() {
            m6726a(true);
        }

        /* renamed from: b */
        public void mo7017b() {
            if (this.f4984b.get() != null) {
                if (this.f4987e) {
                    ((C1613b) this.f4984b.get()).mo7241a(AdError.CACHE_ERROR);
                } else {
                    m6726a(false);
                }
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.adapters.c.a$b */
    public interface C1613b {
        /* renamed from: a */
        void mo7240a();

        /* renamed from: a */
        void mo7241a(AdError adError);
    }

    /* renamed from: com.facebook.ads.internal.adapters.c.a$c */
    private static class C1614c extends WebViewClient {

        /* renamed from: a */
        boolean f4988a = false;

        /* renamed from: b */
        final C1605n f4989b;

        /* renamed from: c */
        final WeakReference<C1613b> f4990c;

        /* renamed from: d */
        final boolean f4991d;

        C1614c(C1605n nVar, WeakReference<C1613b> weakReference, boolean z) {
            this.f4989b = nVar;
            this.f4990c = weakReference;
            this.f4991d = z;
        }

        /* renamed from: a */
        private void m6731a() {
            if (this.f4990c.get() != null) {
                ((C1613b) this.f4990c.get()).mo7240a();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m6732a(WebResourceError webResourceError) {
            if (this.f4990c.get() != null) {
                if (this.f4991d) {
                    ((C1613b) this.f4990c.get()).mo7241a(AdError.CACHE_ERROR);
                } else {
                    m6731a();
                }
            }
        }

        public void onPageFinished(WebView webView, String str) {
            this.f4988a = true;
            m6731a();
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    if (!C1614c.this.f4988a) {
                        C1614c.this.m6732a(null);
                    }
                }
            }, (long) this.f4989b.mo7216g());
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.f4988a = true;
            m6732a(webResourceError);
        }
    }

    /* renamed from: a */
    public static void m6725a(Context context, C1606o oVar, boolean z, C1613b bVar) {
        if (C1795a.m7455n(context)) {
            bVar.mo7240a();
            return;
        }
        C1605n j = oVar.mo7226f().mo7136j();
        C1724b bVar2 = new C1724b(context);
        if (j == null) {
            bVar.mo7241a(AdError.CACHE_ERROR);
            return;
        }
        switch (j.mo7220k()) {
            case PROXY_PRECACHE:
                bVar2.mo7493a(j.mo7209a());
                break;
            case FILE_PRECACHE:
                bVar2.mo7495b(j.mo7209a());
                break;
        }
        bVar2.mo7494a(oVar.mo7222b().mo7201b(), -1, -1);
        bVar2.mo7494a(j.mo7211b(), -1, -1);
        C1612a aVar = new C1612a(context, bVar, bVar2, j, z);
        bVar2.mo7492a((C1723a) aVar);
    }
}
