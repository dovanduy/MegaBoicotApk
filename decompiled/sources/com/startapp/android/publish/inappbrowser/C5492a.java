package com.startapp.android.publish.inappbrowser;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.startapp.android.publish.ads.p166a.C5082b;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.android.publish.adsCommon.Utils.C5306h;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5518g;

/* renamed from: com.startapp.android.publish.inappbrowser.a */
/* compiled from: StartAppSDK */
public class C5492a extends C5082b implements OnClickListener {

    /* renamed from: j */
    protected static boolean f17500j = false;

    /* renamed from: d */
    protected RelativeLayout f17501d;

    /* renamed from: e */
    protected C5495b f17502e;

    /* renamed from: f */
    protected WebView f17503f;

    /* renamed from: g */
    protected AnimatingProgressBar f17504g;

    /* renamed from: h */
    protected FrameLayout f17505h;

    /* renamed from: i */
    protected String f17506i;

    /* renamed from: com.startapp.android.publish.inappbrowser.a$a */
    /* compiled from: StartAppSDK */
    private static class C5494a extends WebViewClient {

        /* renamed from: a */
        private Context f17508a;

        /* renamed from: b */
        private C5492a f17509b;

        /* renamed from: c */
        private C5495b f17510c;

        /* renamed from: d */
        private AnimatingProgressBar f17511d;

        /* renamed from: e */
        private int f17512e = 0;

        /* renamed from: f */
        private boolean f17513f = false;

        public C5494a(Context context, C5495b bVar, AnimatingProgressBar animatingProgressBar, C5492a aVar) {
            this.f17508a = context;
            this.f17511d = animatingProgressBar;
            this.f17510c = bVar;
            this.f17509b = aVar;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (!C5492a.f17500j) {
                StringBuilder sb = new StringBuilder();
                sb.append("IABWebViewClient::onPageStarted - [");
                sb.append(str);
                sb.append("]");
                sb.append("REDIRECTED  -> ");
                sb.append(this.f17512e);
                sb.append(" Can go back ");
                sb.append(webView.canGoBack());
                C5518g.m23563a("IABrowserMode", 3, sb.toString());
                if (this.f17513f) {
                    this.f17512e = 1;
                    this.f17511d.mo20439a();
                    this.f17510c.mo20453a(webView);
                } else {
                    this.f17512e = Math.max(this.f17512e, 1);
                }
                this.f17511d.setVisibility(0);
                this.f17510c.getUrlTxt().setText(str);
                this.f17510c.mo20453a(webView);
                super.onPageStarted(webView, str, bitmap);
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("IABWebViewClient::shouldOverrideUrlLoading - [");
            sb.append(str);
            sb.append("]");
            C5518g.m23563a("IABrowserMode", 3, sb.toString());
            if (!C5492a.f17500j) {
                if (!this.f17513f) {
                    this.f17513f = true;
                    this.f17511d.mo20439a();
                    this.f17512e = 0;
                }
                this.f17512e++;
                if (C5349c.m22884d(str) && !C5349c.m22878b(str)) {
                    return false;
                }
                this.f17512e = 1;
                C5349c.m22879c(this.f17508a, str);
                if (this.f17509b != null) {
                    this.f17509b.mo20445x();
                }
            }
            return true;
        }

        public void onPageFinished(WebView webView, String str) {
            if (!C5492a.f17500j) {
                StringBuilder sb = new StringBuilder();
                sb.append("IABWebViewClient::onPageFinished - [");
                sb.append(str);
                sb.append("]");
                C5518g.m23563a("IABrowserMode", 3, sb.toString());
                this.f17510c.mo20453a(webView);
                int i = this.f17512e - 1;
                this.f17512e = i;
                if (i == 0) {
                    this.f17513f = false;
                    this.f17511d.mo20439a();
                    if (this.f17511d.isShown()) {
                        this.f17511d.setVisibility(8);
                    }
                    this.f17510c.mo20453a(webView);
                }
                super.onPageFinished(webView, str);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append("IABWebViewClient::onReceivedError - [");
            sb.append(str);
            sb.append("], [");
            sb.append(str2);
            sb.append("]");
            C5518g.m23563a("IABrowserMode", 3, sb.toString());
            this.f17511d.mo20439a();
            super.onReceivedError(webView, i, str, str2);
        }
    }

    /* renamed from: s */
    public void mo18726s() {
    }

    /* renamed from: u */
    public void mo18728u() {
    }

    public C5492a(String str) {
        this.f17506i = str;
    }

    /* renamed from: a */
    public void mo18697a(Bundle bundle) {
        super.mo18697a(bundle);
        f17500j = false;
        this.f17501d = new RelativeLayout(mo18705b());
        m23437b(this.f17506i);
        if (bundle != null) {
            mo18710c(bundle);
        }
        mo18705b().setContentView(this.f17501d, new LayoutParams(-2, -2));
    }

    /* renamed from: b */
    private void m23437b(String str) {
        C5518g.m23563a("IABrowserMode", 3, "initUi");
        if (this.f17502e == null) {
            this.f17502e = new C5495b(mo18705b());
            this.f17502e.mo20452a();
            this.f17502e.mo20454b();
            this.f17502e.setButtonsListener(this);
        }
        this.f17501d.addView(this.f17502e);
        this.f17504g = new AnimatingProgressBar(mo18705b(), null, 16842872);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.parseColor("#45d200"));
        this.f17504g.setProgressDrawable(new ClipDrawable(shapeDrawable, 3, 1));
        this.f17504g.setBackgroundColor(-1);
        this.f17504g.setId(2108);
        LayoutParams layoutParams = new LayoutParams(-1, C5306h.m22641a((Context) mo18705b(), 4));
        layoutParams.addRule(3, 2101);
        this.f17501d.addView(this.f17504g, layoutParams);
        this.f17505h = new FrameLayout(mo18705b());
        if (this.f17503f == null) {
            try {
                m23438y();
                this.f17503f.loadUrl(str);
            } catch (Exception e) {
                this.f17502e.mo20456c();
                C5349c.m22879c(mo18705b(), str);
                C5378f.m23016a(mo18705b(), C5376d.EXCEPTION, "IABrowserMode.initUi - Webvie  failed", e.getMessage(), "");
                mo18705b().finish();
            }
        }
        this.f17505h.addView(this.f17503f);
        this.f17505h.setBackgroundColor(-1);
        LayoutParams layoutParams2 = new LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        layoutParams2.addRule(3, 2108);
        this.f17501d.addView(this.f17505h, layoutParams2);
    }

    /* renamed from: b */
    public void mo18707b(Bundle bundle) {
        this.f17503f.saveState(bundle);
    }

    /* renamed from: c */
    public void mo18710c(Bundle bundle) {
        this.f17503f.restoreState(bundle);
    }

    /* renamed from: y */
    private void m23438y() {
        this.f17503f = new WebView(mo18705b());
        m23439z();
        this.f17503f.setWebViewClient(new C5494a(mo18705b(), this.f17502e, this.f17504g, this));
        this.f17503f.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView webView, int i) {
                C5492a.this.f17504g.setProgress(i);
            }

            public void onReceivedTitle(WebView webView, String str) {
                if (str != null && !str.equals("")) {
                    C5492a.this.f17502e.getTitleTxt().setText(str);
                }
            }
        });
    }

    /* renamed from: z */
    private void m23439z() {
        this.f17503f.getSettings().setJavaScriptEnabled(true);
        this.f17503f.getSettings().setUseWideViewPort(true);
        this.f17503f.getSettings().setLoadWithOverviewMode(true);
        this.f17503f.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f17503f.getSettings().setBuiltInZoomControls(true);
        if (VERSION.SDK_INT >= 11) {
            this.f17503f.getSettings().setDisplayZoomControls(false);
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case 2103:
                mo20445x();
                return;
            case 2104:
                if (this.f17503f != null) {
                    C5349c.m22879c(mo18705b(), this.f17503f.getUrl());
                    mo20445x();
                    return;
                }
                return;
            case 2105:
                if (this.f17503f != null && this.f17503f.canGoBack()) {
                    this.f17504g.mo20439a();
                    this.f17503f.goBack();
                    return;
                }
                return;
            case 2106:
                if (this.f17503f != null && this.f17503f.canGoForward()) {
                    this.f17504g.mo20439a();
                    this.f17503f.goForward();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public boolean mo18704a(int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.mo18704a(i, keyEvent);
        }
        if (this.f17503f == null || !this.f17503f.canGoBack()) {
            C5518g.m23563a("IABrowserMode", 3, "IABWebViewClient::KEYCODE_BACK canT go back");
            mo20445x();
        } else {
            C5518g.m23563a("IABrowserMode", 3, "IABWebViewClient::KEYCODE_BACK can go back");
            this.f17504g.mo20439a();
            this.f17503f.goBack();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public void mo20445x() {
        m23436A();
        this.f17502e.mo20456c();
        mo18705b().finish();
    }

    /* renamed from: A */
    private void m23436A() {
        try {
            f17500j = true;
            this.f17503f.stopLoading();
            this.f17503f.removeAllViews();
            this.f17503f.postInvalidate();
            C5509c.m23524b(this.f17503f);
            this.f17503f.destroy();
            this.f17503f = null;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("IABrowserMode::destroyWebview error ");
            sb.append(e.getMessage());
            C5518g.m23563a("IABrowserMode", 6, sb.toString());
        }
    }
}
