package com.appnext.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.exoplayer2.C2793C;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ResultActivity extends Activity {

    /* renamed from: kA */
    private Intent f4113kA;
    private WebView webView;

    /* access modifiers changed from: protected */
    @SuppressLint({"SetJavaScriptEnabled"})
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        LinearLayout linearLayout = new LinearLayout(this);
        setContentView(linearLayout);
        linearLayout.setOrientation(1);
        this.webView = new WebView(getApplicationContext());
        this.webView.getSettings().setTextZoom(100);
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setAppCacheEnabled(true);
        this.webView.getSettings().setDomStorageEnabled(true);
        this.webView.getSettings().setDatabaseEnabled(true);
        if (VERSION.SDK_INT >= 21) {
            this.webView.getSettings().setMixedContentMode(0);
        }
        if (VERSION.SDK_INT >= 17) {
            this.webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        if (VERSION.SDK_INT >= 19) {
            this.webView.setLayerType(2, null);
        } else {
            this.webView.setLayerType(1, null);
        }
        this.webView.setWebViewClient(new WebViewClient() {
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                String str2;
                if (str == null) {
                    return false;
                }
                new StringBuilder("result page url ").append(str);
                if (str.startsWith("http")) {
                    if (ResultActivity.this.hasNewResolver(ResultActivity.m5575aH(str).setComponent(null))) {
                        ResultActivity.m5576b(ResultActivity.this, str);
                    } else {
                        webView.loadUrl(str);
                    }
                    return true;
                } else if (str.startsWith("intent://")) {
                    try {
                        Intent parseUri = Intent.parseUri(str, 1);
                        if (ResultActivity.this.getPackageManager().resolveActivity(parseUri, C2793C.DEFAULT_BUFFER_SEGMENT_SIZE) != null) {
                            ResultActivity.m5576b(ResultActivity.this, parseUri.getData().toString());
                            return true;
                        }
                        if (parseUri.getExtras() != null && parseUri.getExtras().containsKey("browser_fallback_url") && !parseUri.getExtras().getString("browser_fallback_url").equals("")) {
                            str2 = parseUri.getExtras().getString("browser_fallback_url");
                        } else if (!parseUri.getExtras().containsKey("market_referrer") || parseUri.getExtras().getString("market_referrer").equals("")) {
                            return true;
                        } else {
                            StringBuilder sb = new StringBuilder("market://details?id=");
                            sb.append(parseUri.getPackage());
                            sb.append("&referrer=");
                            sb.append(parseUri.getExtras().getString("market_referrer"));
                            str2 = sb.toString();
                        }
                        ResultActivity.m5576b(ResultActivity.this, str2);
                        return true;
                    } catch (Throwable unused) {
                        return false;
                    }
                } else {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str));
                    try {
                        if (ResultActivity.this.getPackageManager().queryIntentActivities(intent, 0).size() <= 0) {
                            return false;
                        }
                        ResultActivity.m5576b(ResultActivity.this, str);
                        return true;
                    } catch (Throwable unused2) {
                        return false;
                    }
                }
            }
        });
        linearLayout.addView(this.webView);
        this.webView.setLayoutParams(new LayoutParams(-1, 0));
        ((LayoutParams) this.webView.getLayoutParams()).weight = 1.0f;
        try {
            String string = getIntent().getExtras().getString("url");
            getIntent().getExtras().getString("title");
            new StringBuilder("loading result page ").append(string);
            this.f4113kA = new Intent(m5575aH(string)).setComponent(null);
            if (VERSION.SDK_INT >= 15) {
                Intent selector = this.f4113kA.getSelector();
                if (selector != null) {
                    selector.setComponent(null);
                }
            }
            this.webView.loadUrl(string);
        } catch (Throwable unused) {
            finish();
        }
    }

    /* renamed from: a */
    private static List m5574a(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            arrayList.add(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
        }
        return arrayList;
    }

    public final boolean hasNewResolver(Intent intent) {
        if (this.f4113kA == null) {
            return intent != null;
        }
        if (intent == null) {
            return false;
        }
        List<ComponentName> a = m5574a((Context) this, intent);
        HashSet hashSet = new HashSet();
        hashSet.addAll(m5574a((Context) this, this.f4113kA));
        for (ComponentName contains : a) {
            if (!hashSet.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: aH */
    public static Intent m5575aH(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        return intent;
    }

    /* renamed from: cK */
    private void m5577cK() {
        onBackPressed();
    }

    private void openLink(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        startActivity(intent);
    }

    public void onBackPressed() {
        try {
            if (this.webView == null || !this.webView.canGoBack()) {
                super.onBackPressed();
            } else {
                this.webView.goBack();
            }
        } catch (Throwable unused) {
            finish();
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m5576b(ResultActivity resultActivity, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        resultActivity.startActivity(intent);
    }
}
