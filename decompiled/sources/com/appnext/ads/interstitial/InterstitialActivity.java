package com.appnext.ads.interstitial;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.graphics.Palette;
import android.support.v7.graphics.Palette.Swatch;
import android.util.Base64;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.appnext.C1062R;
import com.appnext.ads.AdsError;
import com.appnext.ads.C1066a;
import com.appnext.ads.C1067b;
import com.appnext.base.p042a.p045c.C1237d;
import com.appnext.core.AppnextActivity;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C1286Ad;
import com.appnext.core.C1317e.C1324a;
import com.appnext.core.C1326f;
import com.appnext.core.C1336k;
import com.appnext.core.C1345p;
import com.appnext.core.C1349q;
import com.appnext.core.C1349q.C1358a;
import com.appnext.core.p049a.C1305b;
import com.appnext.core.result.C1369a;
import com.appnext.core.result.C1371c;
import com.appnext.core.result.C1372d;
import com.appnext.core.result.ResultPageActivity;
import com.appnext.core.webview.AppnextWebView;
import com.appnext.core.webview.AppnextWebView.C1376c;
import com.appnext.core.webview.WebAppInterface;
import com.google.android.exoplayer2.C2793C;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class InterstitialActivity extends AppnextActivity {
    /* access modifiers changed from: private */
    public ArrayList<AppnextAd> ads;
    /* access modifiers changed from: private */
    public Boolean autoPlay;
    /* access modifiers changed from: private */

    /* renamed from: bs */
    public boolean f3709bs = false;
    private Boolean canClose;
    private boolean closed = false;
    /* access modifiers changed from: private */

    /* renamed from: dA */
    public AppnextAd f3710dA;

    /* renamed from: dB */
    private C1067b f3711dB;

    /* renamed from: eJ */
    protected WebView f3712eJ;

    /* renamed from: eK */
    private boolean f3713eK = false;
    /* access modifiers changed from: private */

    /* renamed from: eL */
    public Interstitial f3714eL;
    /* access modifiers changed from: private */

    /* renamed from: eM */
    public InterstitialAd f3715eM;

    /* renamed from: eN */
    private String f3716eN = "";
    /* access modifiers changed from: private */

    /* renamed from: eO */
    public int f3717eO = 0;
    /* access modifiers changed from: private */

    /* renamed from: eP */
    public Handler f3718eP;

    /* renamed from: eQ */
    private C1324a f3719eQ;

    /* renamed from: eR */
    private WebAppInterface f3720eR;

    /* renamed from: eS */
    private boolean f3721eS = false;

    /* renamed from: eT */
    private boolean f3722eT = false;
    /* access modifiers changed from: private */

    /* renamed from: eU */
    public String f3723eU;
    /* access modifiers changed from: private */

    /* renamed from: eV */
    public String f3724eV = "";
    /* access modifiers changed from: private */

    /* renamed from: eW */
    public Runnable f3725eW = new Runnable() {
        public final void run() {
            InterstitialActivity.m5056l(InterstitialActivity.this);
        }
    };
    private Boolean mute;

    protected class WebInterface extends WebAppInterface {
        @JavascriptInterface
        public String filterAds(String str) {
            return str;
        }

        @JavascriptInterface
        public void gotoAppWall() {
        }

        @JavascriptInterface
        public String loadAds() {
            return "";
        }

        @JavascriptInterface
        public void videoPlayed() {
        }

        public WebInterface() {
            super(InterstitialActivity.this);
        }

        @JavascriptInterface
        public void destroy(String str) {
            if (str.equals("c_close")) {
                InterstitialActivity.this.f3709bs = true;
                InterstitialActivity.this.runOnUiThread(new Runnable() {
                    public final void run() {
                        try {
                            JSONObject jSONObject = new JSONObject(InterstitialActivity.this.f3715eM.getAdJSON());
                            StringBuilder sb = new StringBuilder();
                            sb.append(jSONObject.getString("urlApp"));
                            sb.append("&tem_id=156");
                            jSONObject.put("urlApp", sb.toString());
                            InterstitialActivity.m5042b(InterstitialActivity.this, jSONObject.toString());
                        } catch (JSONException unused) {
                            InterstitialActivity.m5042b(InterstitialActivity.this, InterstitialActivity.this.f3715eM.getAdJSON());
                        }
                    }
                });
            } else if (str.equals("close")) {
                InterstitialActivity.this.runOnUiThread(new Runnable() {
                    public final void run() {
                        InterstitialActivity.this.onClose();
                        InterstitialActivity.this.finish();
                    }
                });
            } else {
                InterstitialActivity.this.runOnUiThread(new Runnable() {
                    public final void run() {
                        InterstitialActivity.this.onError(AdsError.AD_NOT_READY);
                        InterstitialActivity.this.finish();
                    }
                });
            }
        }

        @JavascriptInterface
        public void notifyImpression(String str) {
            super.notifyImpression(str);
            InterstitialActivity.this.f3715eM.setImpressionURL(str);
            InterstitialActivity.this.handler.postDelayed(new C1150a(str), Long.parseLong(InterstitialActivity.this.getConfig().get("postpone_impression_sec")) * 1000);
            if (InterstitialActivity.this.autoPlay != null && InterstitialActivity.this.autoPlay.booleanValue()) {
                play();
            }
        }

        @JavascriptInterface
        public void postView(String str) {
            if (Boolean.parseBoolean(InterstitialActivity.this.ads != null ? "false" : InterstitialActivity.this.m5034O("pview"))) {
                InterstitialActivity.this.handler.postDelayed(new C1152b(str), Long.parseLong(InterstitialActivity.this.getConfig().get("postpone_vta_sec")) * 1000);
            }
        }

        @JavascriptInterface
        public void openStore(final String str) {
            InterstitialActivity.this.runOnUiThread(new Runnable() {
                public final void run() {
                    InterstitialActivity.m5042b(InterstitialActivity.this, str);
                }
            });
        }

        @JavascriptInterface
        public void play() {
            InterstitialActivity.this.placementID;
            InterstitialActivity.this.loadJS("Appnext.Layout.Video.play();");
        }

        @JavascriptInterface
        public void openLink(String str) {
            InterstitialActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }

        @JavascriptInterface
        public void logSTP(String str, String str2) {
            C1326f.m5664a((C1286Ad) InterstitialActivity.this.f3714eL, (AppnextAd) InterstitialActivity.this.f3715eM, str, str2, InterstitialActivity.this.getConfig());
        }

        @JavascriptInterface
        public void jsError(String str) {
            if (!str.contains("is not a function") && !str.contains("has no method")) {
                new StringBuilder("jsError ").append(str);
                InterstitialActivity.this.onError(AppnextError.INTERNAL_ERROR);
                InterstitialActivity.this.finish();
            } else if (InterstitialActivity.this.f3717eO = InterstitialActivity.this.f3717eO + 1 < 5) {
                InterstitialActivity.this.f3718eP.postDelayed(InterstitialActivity.this.f3725eW, 500);
            } else {
                InterstitialActivity.this.onError(AppnextError.INTERNAL_ERROR);
                InterstitialActivity.this.finish();
            }
        }

        @JavascriptInterface
        public void openResultPage(String str) {
            C1372d.m5794cO().mo6317a(new C1371c() {
                /* renamed from: aq */
                public final String mo5684aq() {
                    return "160";
                }

                public final JSONObject getConfigParams() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("vid", "2.4.5.472");
                    jSONObject.put("tid", InterstitialActivity.this.f3714eL == null ? "" : InterstitialActivity.this.f3714eL.getTID());
                    jSONObject.put("auid", InterstitialActivity.this.f3714eL == null ? "" : InterstitialActivity.this.f3714eL.getAUID());
                    jSONObject.put("osid", "100");
                    jSONObject.put("tem_id", "1601");
                    jSONObject.put(TtmlNode.ATTR_ID, getPlacementId());
                    jSONObject.put("cat", InterstitialActivity.this.f3715eM.getCategories());
                    jSONObject.put("pview", InterstitialActivity.this.getConfig().get("pview"));
                    jSONObject.put("devn", C1326f.m5684cE());
                    jSONObject.put("dosv", VERSION.SDK_INT);
                    jSONObject.put("dds", "0");
                    jSONObject.put("ads_type", "banner");
                    jSONObject.put("country", InterstitialActivity.this.f3715eM.getCountry());
                    jSONObject.put("gdpr", C1336k.m5716a((AppnextAd) InterstitialActivity.this.f3715eM, InterstitialActivity.this.getConfig()));
                    return jSONObject;
                }

                public final AppnextAd getSelectedAd() {
                    return InterstitialActivity.this.f3715eM;
                }

                public final String getPlacementId() {
                    return InterstitialActivity.this.placementID;
                }

                /* renamed from: ar */
                public final String mo5685ar() {
                    return C1153a.m5095ax().mo6231l(InterstitialActivity.this.f3714eL);
                }

                /* renamed from: as */
                public final String mo5686as() {
                    return InterstitialActivity.this.f3723eU;
                }

                /* renamed from: at */
                public final C1345p mo5687at() {
                    return InterstitialActivity.this.getConfig();
                }

                /* renamed from: au */
                public final C1286Ad mo5688au() {
                    return InterstitialActivity.this.f3714eL;
                }

                /* renamed from: av */
                public final C1369a mo5689av() {
                    return new C1369a() {
                        /* renamed from: aw */
                        public final Object mo5693aw() {
                            return null;
                        }

                        public final String getFallbackScript() {
                            return null;
                        }

                        public final String getJSurl() {
                            return "http://cdn.appnext.com/tools/sdk/interstitial/v75/result.min.js";
                        }

                        public final WebViewClient getWebViewClient() {
                            return null;
                        }
                    };
                }
            });
            Intent intent = new Intent(InterstitialActivity.this, ResultPageActivity.class);
            intent.putExtra("shouldClose", false);
            intent.setFlags(C2793C.DEFAULT_BUFFER_SEGMENT_SIZE);
            InterstitialActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.appnext.ads.interstitial.InterstitialActivity$a */
    private class C1150a implements Runnable {

        /* renamed from: eZ */
        AppnextAd f3748eZ;

        C1150a(String str) {
            this.f3748eZ = new InterstitialAd(InterstitialActivity.this.f3715eM);
            ((InterstitialAd) this.f3748eZ).setImpressionURL(str);
        }

        public final void run() {
            try {
                if (InterstitialActivity.this.userAction != null) {
                    InterstitialActivity.this.userAction.mo6295e(this.f3748eZ);
                    InterstitialActivity.this.report(C1066a.f3524cJ);
                }
                if (Boolean.parseBoolean(InterstitialActivity.this.getConfig().get("fq_control")) && Interstitial.currentAd.fq_status) {
                    new Thread(new Runnable() {
                        public final void run() {
                            try {
                                StringBuilder sb = new StringBuilder("https://www.fqtag.com/pixel.cgi?org=TkBXEI5C3FBIr4zXwnmK&p=");
                                sb.append(InterstitialActivity.this.placementID);
                                sb.append("&a=");
                                sb.append(InterstitialActivity.this.f3715eM.getBannerID());
                                sb.append("&cmp=");
                                sb.append(InterstitialActivity.this.f3715eM.getCampaignID());
                                sb.append("&fmt=banner&dmn=");
                                sb.append(InterstitialActivity.this.f3715eM.getAdPackage());
                                sb.append("&ad=&rt=displayImg&gid=");
                                sb.append(C1326f.m5675b((Context) InterstitialActivity.this, true));
                                sb.append("&aid=&applng=");
                                sb.append(Locale.getDefault().toString());
                                sb.append("&app=");
                                sb.append(InterstitialActivity.this.getPackageName());
                                sb.append("&c1=100&c2=");
                                sb.append(Interstitial.currentAd.getTID());
                                sb.append("&c3=");
                                sb.append(Interstitial.currentAd.getAUID());
                                sb.append("&c4=");
                                sb.append(Interstitial.currentAd.getVID());
                                sb.append("&sl=1&fq=1");
                                C1326f.m5659a(sb.toString(), null);
                            } catch (Throwable unused) {
                            }
                        }
                    }).start();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.appnext.ads.interstitial.InterstitialActivity$b */
    private class C1152b implements Runnable {

        /* renamed from: eZ */
        AppnextAd f3751eZ;

        C1152b(String str) {
            try {
                this.f3751eZ = (AppnextAd) C1153a.m5095ax().parseAd(str);
            } catch (Throwable unused) {
            }
        }

        public final void run() {
            InterstitialActivity.this.mo5424a(this.f3751eZ, (C1324a) null);
        }
    }

    /* renamed from: b */
    protected static void m5043b(String str, String str2, String str3) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        setRequestedOrientation(7);
        super.onCreate(bundle);
        if (Interstitial.currentAd == null) {
            finish();
            return;
        }
        this.f3714eL = new Interstitial(Interstitial.currentAd);
        if (getRequestedOrientation() == 6) {
            report(C1066a.f3572dk);
        } else {
            report(C1066a.f3573dl);
        }
        this.f4106kr = new RelativeLayout(this);
        setContentView(this.f4106kr);
        this.f4106kr.getLayoutParams().width = -1;
        this.f4106kr.getLayoutParams().height = -1;
        this.f4106kr.setBackgroundColor(-1);
        try {
            this.placementID = getIntent().getExtras().getString(TtmlNode.ATTR_ID);
            if (getIntent().hasExtra("auto_play")) {
                this.autoPlay = Boolean.valueOf(getIntent().getBooleanExtra("auto_play", true));
                if (this.autoPlay.booleanValue()) {
                    report(C1066a.f3568dg);
                } else {
                    report(C1066a.f3569dh);
                }
            }
            if (getIntent().hasExtra("can_close")) {
                this.canClose = Boolean.valueOf(getIntent().getBooleanExtra("can_close", false));
            }
            if (getIntent().hasExtra("mute")) {
                this.mute = Boolean.valueOf(getIntent().getBooleanExtra("mute", true));
                if (this.mute.booleanValue()) {
                    report(C1066a.f3570di);
                } else {
                    report(C1066a.f3571dj);
                }
            }
            if (getIntent().hasExtra("pview")) {
                this.f4104kp = getIntent().getStringExtra("pview");
                this.banner = getIntent().getStringExtra("banner");
                this.guid = getIntent().getStringExtra("guid");
            }
            this.ads = (ArrayList) getIntent().getSerializableExtra("ads");
            this.f3718eP = new Handler();
            AppnextWebView.m5797B(this).mo6321a(this.f3714eL.getPageUrl(), (C1376c) new C1376c() {
                /* renamed from: b */
                public final void mo5656b(String str) {
                    InterstitialActivity.m5037a(InterstitialActivity.this);
                }

                public final void error(String str) {
                    InterstitialActivity.m5037a(InterstitialActivity.this);
                }
            });
            this.f3719eQ = new C1324a() {
                public final void onMarket(String str) {
                    new StringBuilder("marketUrl ").append(str);
                    if (InterstitialActivity.this.handler != null) {
                        InterstitialActivity.this.handler.removeCallbacks(null);
                    }
                    InterstitialActivity.this.mo6094cA();
                }

                public final void error(String str) {
                    if (InterstitialActivity.this.handler != null) {
                        InterstitialActivity.this.handler.removeCallbacks(null);
                    }
                    InterstitialActivity.this.mo6094cA();
                    InterstitialActivity.this.placementID;
                    StringBuilder sb = new StringBuilder();
                    sb.append(new InterstitialAd(InterstitialActivity.this.f3710dA).getAppURL());
                    sb.append(" ");
                    sb.append(str);
                }
            };
            this.userAction = new C1349q(this, new C1358a() {
                public final void report(String str) {
                }

                /* renamed from: Y */
                public final C1286Ad mo5458Y() {
                    return InterstitialActivity.this.f3714eL;
                }

                /* renamed from: Z */
                public final AppnextAd mo5459Z() {
                    return InterstitialActivity.this.f3710dA;
                }

                /* renamed from: aa */
                public final C1345p mo5460aa() {
                    return InterstitialActivity.this.getConfig();
                }
            });
            new Thread(new Runnable() {
                public final void run() {
                    InterstitialActivity.this.f3724eV = C1326f.m5675b((Context) InterstitialActivity.this, true);
                }
            }).start();
        } catch (Throwable unused) {
            finish();
        }
    }

    /* renamed from: am */
    private void m5040am() {
        try {
            AppnextWebView B = AppnextWebView.m5797B(this);
            this.f3712eJ = B.mo6323aU(this.ads != null ? "fullscreen" : "interstitial");
            this.f3712eJ = B.mo6319a(this, this.f3714eL.getPageUrl(), mo5650an(), this.f3714eL.getFallback(), this.ads != null ? "fullscreen" : "interstitial");
            this.f3712eJ.setWebViewClient(new WebViewClient() {
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

                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    InterstitialActivity.this.f3718eP.removeCallbacksAndMessages(null);
                    InterstitialActivity.m5056l(InterstitialActivity.this);
                }
            });
            this.f3712eJ.setWebChromeClient(new WebChromeClient() {
                public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                    new StringBuilder("console ").append(consoleMessage.message());
                    if (!consoleMessage.message().contains("pause") && (consoleMessage.message().contains("TypeError") || consoleMessage.message().contains("has no method") || consoleMessage.message().contains("is not a function"))) {
                        InterstitialActivity.this.onError(AppnextError.INTERNAL_ERROR);
                        InterstitialActivity.this.finish();
                    }
                    return true;
                }
            });
        } catch (Throwable unused) {
            onError(AppnextError.INTERNAL_ERROR);
            finish();
        }
    }

    private void pageFinished() {
        this.f3718eP.removeCallbacks(this.f3725eW);
        this.f3713eK = true;
        this.f3716eN = getIntent().getExtras().getString("creative");
        if (this.f3716eN == null || this.f3716eN.equals(Interstitial.TYPE_MANAGED)) {
            this.f3716eN = m5034O("creative");
        }
        new Thread(new Runnable() {
            public final void run() {
                InterstitialActivity.this.mo5651ao();
            }
        }).start();
        if (this.f3712eJ == null) {
            onError(AppnextError.INTERNAL_ERROR);
            finish();
            return;
        }
        if (this.f3712eJ.getParent() != null) {
            ((ViewGroup) this.f3712eJ.getParent()).removeView(this.f3712eJ);
        }
        this.f4106kr.addView(this.f3712eJ);
        this.f3712eJ.getLayoutParams().width = -1;
        this.f3712eJ.getLayoutParams().height = -1;
    }

    /* access modifiers changed from: protected */
    public final C1345p getConfig() {
        return C1155c.m5113aA();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f3709bs) {
            onClose();
            finish();
            return;
        }
        if (this.f3713eK && this.autoPlay != null && this.autoPlay.booleanValue()) {
            loadJS("Appnext.Layout.Video.play();");
        }
        try {
            this.f3712eJ.loadUrl("javascript:(function() { try{Appnext.countToClose();}catch(e){}})()");
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (!this.closed && this.f3712eJ != null) {
            this.f3712eJ.loadUrl("javascript:(function() { Appnext.Layout.Video.pause();})()");
        }
    }

    public void onBackPressed() {
        if (this.canClose != null) {
            if (!this.canClose.booleanValue()) {
                return;
            }
        } else if (!Boolean.parseBoolean(m5034O("can_close"))) {
            return;
        }
        loadJS("Appnext.Layout.destroy('internal');");
        this.closed = true;
        onClose();
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onError(final String str) {
        runOnUiThread(new Runnable() {
            public final void run() {
                if (InterstitialActivity.this.f3714eL != null && InterstitialActivity.this.f3714eL.getOnAdErrorCallback() != null) {
                    InterstitialActivity.this.f3714eL.getOnAdErrorCallback().adError(str);
                }
            }
        });
    }

    /* renamed from: P */
    private void m5035P(String str) {
        AppnextAd appnextAd = (AppnextAd) C1153a.m5095ax().parseAd(str);
        if (appnextAd != null) {
            this.f3710dA = new InterstitialAd(appnextAd);
            if (!(this.f3714eL == null || this.f3714eL.getOnAdClickedCallback() == null)) {
                this.f3714eL.getOnAdClickedCallback().adClicked();
            }
            mo5425b(this.f3710dA, this.f3719eQ);
            report(C1066a.f3539cY);
            if (this.f3710dA.getBannerID().equals(this.f3715eM != null ? this.f3715eM.getBannerID() : "")) {
                if (!this.f3721eS) {
                    this.f3721eS = true;
                    report(C1066a.f3575dn);
                }
            } else if (!this.f3722eT) {
                this.f3722eT = true;
                report(C1066a.f3574dm);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo5425b(AppnextAd appnextAd, C1324a aVar) {
        mo6093a((ViewGroup) this.f4106kr, getResources().getDrawable(C1062R.C1063drawable.apnxt_loader));
        super.mo5425b(appnextAd, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: an */
    public final WebAppInterface mo5650an() {
        if (this.f3720eR == null) {
            this.f3720eR = new WebInterface();
        }
        return this.f3720eR;
    }

    private void play() {
        loadJS("Appnext.Layout.Video.play();");
    }

    private void stop() {
        if (this.f3712eJ != null) {
            this.f3712eJ.loadUrl("javascript:(function() { Appnext.Layout.Video.pause();})()");
        }
    }

    /* access modifiers changed from: private */
    public void onClose() {
        if (this.f3714eL != null && this.f3714eL.getOnAdClosedCallback() != null) {
            this.f3714eL.getOnAdClosedCallback().onAdClosed();
        }
    }

    /* access modifiers changed from: private */
    public void report(String str) {
        if (this.f3714eL != null) {
            C1326f.m5665a(this.f3714eL.getTID(), this.f3714eL.getVID(), this.f3714eL.getAUID(), this.f3714eL.getPlacementID(), this.f3714eL.getSessionId(), str, "current_interstitial", this.f3715eM != null ? this.f3715eM.getBannerID() : "", this.f3715eM != null ? this.f3715eM.getCampaignID() : "");
        }
    }

    /* access modifiers changed from: private */
    public void loadJS(final String str) {
        runOnUiThread(new Runnable() {
            public final void run() {
                if (InterstitialActivity.this.f3712eJ != null) {
                    WebView webView = InterstitialActivity.this.f3712eJ;
                    StringBuilder sb = new StringBuilder("javascript:(function() { try { ");
                    sb.append(str);
                    sb.append("} catch(err){ Appnext.jsError(err.message); }})()");
                    webView.loadUrl(sb.toString());
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0098 A[Catch:{ Throwable -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8 A[Catch:{ Throwable -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d6 A[Catch:{ Throwable -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ee A[Catch:{ Throwable -> 0x0144 }] */
    /* renamed from: ao */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo5651ao() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.appnext.ads.interstitial.a r0 = com.appnext.ads.interstitial.C1153a.m5095ax()     // Catch:{ Throwable -> 0x0144 }
            com.appnext.ads.interstitial.Interstitial r1 = r8.f3714eL     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r2 = r8.f3716eN     // Catch:{ Throwable -> 0x0144 }
            java.util.ArrayList r0 = r0.mo5721b(r8, r1, r2)     // Catch:{ Throwable -> 0x0144 }
            if (r0 != 0) goto L_0x0019
            r8.finish()     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r0 = "No Ads"
            r8.onError(r0)     // Catch:{ Throwable -> 0x0144 }
            monitor-exit(r8)
            return
        L_0x0019:
            com.appnext.ads.interstitial.a r1 = com.appnext.ads.interstitial.C1153a.m5095ax()     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r1 = r1.mo5722d(r0)     // Catch:{ Throwable -> 0x0144 }
            if (r1 != 0) goto L_0x002d
            r8.finish()     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r0 = "No Ads"
            r8.onError(r0)     // Catch:{ Throwable -> 0x0144 }
            monitor-exit(r8)
            return
        L_0x002d:
            java.lang.String r2 = " "
            java.lang.String r3 = "\\u2028"
            java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r2 = " "
            java.lang.String r3 = "\\u2029"
            java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ Throwable -> 0x0144 }
            r8.f3723eU = r1     // Catch:{ Throwable -> 0x0144 }
            com.appnext.ads.interstitial.InterstitialAd r2 = new com.appnext.ads.interstitial.InterstitialAd     // Catch:{ Throwable -> 0x0144 }
            r3 = 0
            java.lang.Object r4 = r0.get(r3)     // Catch:{ Throwable -> 0x0144 }
            com.appnext.core.AppnextAd r4 = (com.appnext.core.AppnextAd) r4     // Catch:{ Throwable -> 0x0144 }
            r2.<init>(r4)     // Catch:{ Throwable -> 0x0144 }
            r8.f3715eM = r2     // Catch:{ Throwable -> 0x0144 }
            android.content.res.Resources r2 = r8.getResources()     // Catch:{ Throwable -> 0x0144 }
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch:{ Throwable -> 0x0144 }
            int r2 = r2.orientation     // Catch:{ Throwable -> 0x0144 }
            org.json.JSONObject r2 = r8.mo5652ap()     // Catch:{ Throwable -> 0x0144 }
            java.lang.Object r4 = r0.get(r3)     // Catch:{ Throwable -> 0x0144 }
            com.appnext.core.AppnextAd r4 = (com.appnext.core.AppnextAd) r4     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r5 = r4.getVideoUrl()     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r6 = ""
            boolean r5 = r5.equals(r6)     // Catch:{ Throwable -> 0x0144 }
            r6 = 1
            if (r5 == 0) goto L_0x0095
            java.lang.String r5 = r4.getVideoUrlHigh()     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r7 = ""
            boolean r5 = r5.equals(r7)     // Catch:{ Throwable -> 0x0144 }
            if (r5 == 0) goto L_0x0095
            java.lang.String r5 = r4.getVideoUrl30Sec()     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r7 = ""
            boolean r5 = r5.equals(r7)     // Catch:{ Throwable -> 0x0144 }
            if (r5 == 0) goto L_0x0095
            java.lang.String r4 = r4.getVideoUrlHigh30Sec()     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r5 = ""
            boolean r4 = r4.equals(r5)     // Catch:{ Throwable -> 0x0144 }
            if (r4 != 0) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r4 = r3
            goto L_0x0096
        L_0x0095:
            r4 = r6
        L_0x0096:
            if (r4 == 0) goto L_0x00b8
            java.lang.String r4 = "remote_auto_play"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0144 }
            r5.<init>()     // Catch:{ Throwable -> 0x0144 }
            java.lang.Boolean r7 = r8.autoPlay     // Catch:{ Throwable -> 0x0144 }
            if (r7 == 0) goto L_0x00ac
            java.lang.Boolean r7 = r8.autoPlay     // Catch:{ Throwable -> 0x0144 }
            boolean r7 = r7.booleanValue()     // Catch:{ Throwable -> 0x0144 }
            if (r7 == 0) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r6 = r3
        L_0x00ad:
            r5.append(r6)     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0144 }
            r2.put(r4, r5)     // Catch:{ Throwable -> 0x0144 }
            goto L_0x00bf
        L_0x00b8:
            java.lang.String r4 = "remote_auto_play"
            java.lang.String r5 = "false"
            r2.put(r4, r5)     // Catch:{ Throwable -> 0x0144 }
        L_0x00bf:
            com.appnext.ads.interstitial.InterstitialAd r4 = new com.appnext.ads.interstitial.InterstitialAd     // Catch:{ Throwable -> 0x0144 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Throwable -> 0x0144 }
            com.appnext.core.AppnextAd r0 = (com.appnext.core.AppnextAd) r0     // Catch:{ Throwable -> 0x0144 }
            r4.<init>(r0)     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r0 = r4.getButtonText()     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r3 = ""
            boolean r0 = r0.equals(r3)     // Catch:{ Throwable -> 0x0144 }
            if (r0 == 0) goto L_0x00ee
            java.lang.String r0 = r4.getAdPackage()     // Catch:{ Throwable -> 0x0144 }
            boolean r0 = com.appnext.core.C1326f.m5694i(r8, r0)     // Catch:{ Throwable -> 0x0144 }
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = "existing_button_text"
            java.lang.String r0 = r8.m5034O(r0)     // Catch:{ Throwable -> 0x0144 }
            goto L_0x00f2
        L_0x00e7:
            java.lang.String r0 = "new_button_text"
            java.lang.String r0 = r8.m5034O(r0)     // Catch:{ Throwable -> 0x0144 }
            goto L_0x00f2
        L_0x00ee:
            java.lang.String r0 = r4.getButtonText()     // Catch:{ Throwable -> 0x0144 }
        L_0x00f2:
            java.lang.String r3 = "b_title"
            r2.put(r3, r0)     // Catch:{ Throwable -> 0x0144 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r3 = "Appnext.setParams("
            r0.<init>(r3)     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0144 }
            r0.append(r2)     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r2 = ");"
            r0.append(r2)     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0144 }
            r8.loadJS(r0)     // Catch:{ Throwable -> 0x0144 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r2 = "Appnext.loadInterstitial("
            r0.<init>(r2)     // Catch:{ Throwable -> 0x0144 }
            r0.append(r1)     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r1 = ");"
            r0.append(r1)     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0144 }
            r8.loadJS(r0)     // Catch:{ Throwable -> 0x0144 }
            com.appnext.ads.interstitial.a r0 = com.appnext.ads.interstitial.C1153a.m5095ax()     // Catch:{ Throwable -> 0x0144 }
            com.appnext.ads.interstitial.InterstitialAd r1 = r8.f3715eM     // Catch:{ Throwable -> 0x0144 }
            java.lang.String r1 = r1.getBannerID()     // Catch:{ Throwable -> 0x0144 }
            com.appnext.ads.interstitial.Interstitial r2 = com.appnext.ads.interstitial.Interstitial.currentAd     // Catch:{ Throwable -> 0x0144 }
            r0.mo5557a(r1, r2)     // Catch:{ Throwable -> 0x0144 }
            android.os.Handler r0 = r8.handler     // Catch:{ Throwable -> 0x0144 }
            com.appnext.ads.interstitial.InterstitialActivity$3 r1 = new com.appnext.ads.interstitial.InterstitialActivity$3     // Catch:{ Throwable -> 0x0144 }
            r1.<init>()     // Catch:{ Throwable -> 0x0144 }
            r0.post(r1)     // Catch:{ Throwable -> 0x0144 }
            monitor-exit(r8)
            return
        L_0x0142:
            r0 = move-exception
            goto L_0x0152
        L_0x0144:
            r0 = move-exception
            r8.finish()     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = "Internal error"
            r8.onError(r1)     // Catch:{ all -> 0x0142 }
            com.appnext.core.C1326f.m5677b(r0)     // Catch:{ all -> 0x0142 }
            monitor-exit(r8)
            return
        L_0x0152:
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.ads.interstitial.InterstitialActivity.mo5651ao():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: ap */
    public final JSONObject mo5652ap() throws JSONException {
        String sb;
        String O = this.f3714eL.getButtonColor().equals("") ? m5034O("button_color") : this.f3714eL.getButtonColor();
        if (O.startsWith("#")) {
            O = O.substring(1);
        }
        if (this.autoPlay == null) {
            this.autoPlay = Boolean.valueOf(Boolean.parseBoolean(m5034O("auto_play")));
        }
        if (this.mute == null) {
            this.mute = Boolean.valueOf(Boolean.parseBoolean(m5034O("mute")));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TtmlNode.ATTR_ID, this.placementID);
        jSONObject.put("cat", this.f3714eL.getCategories());
        jSONObject.put("pbk", this.f3714eL.getPostback());
        jSONObject.put("b_color", O);
        if (this.ads == null) {
            jSONObject.put("skip_title", this.f3714eL.getSkipText().equals("") ? m5034O("skip_title") : this.f3714eL.getSkipText());
            jSONObject.put("pview", this.ads != null ? "false" : m5034O("pview"));
            jSONObject.put("video_length", m5034O("video_length"));
            jSONObject.put("min_internet_connection", m5034O("min_internet_connection"));
            jSONObject.put("min_internet_connection_video", m5034O("min_internet_connection_video"));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.mute);
            jSONObject.put("mute", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.autoPlay);
            jSONObject.put("auto_play", sb3.toString());
            jSONObject.put("remove_poster_on_auto_play", m5034O("remove_poster_on_auto_play"));
            jSONObject.put("show_rating", m5034O("show_rating"));
            jSONObject.put("show_desc", m5034O("show_desc"));
            jSONObject.put("creative", this.f3716eN);
            jSONObject.put("remote_auto_play", true);
        }
        jSONObject.put("stp_flag", m5034O("stp_flag"));
        jSONObject.put("ext", C1237d.COLUMN_TYPE);
        jSONObject.put("dct", C1326f.m5699v(this));
        jSONObject.put("did", this.f3724eV);
        jSONObject.put("devn", C1326f.m5684cE());
        jSONObject.put("dosv", VERSION.SDK_INT);
        jSONObject.put("dds", "0");
        jSONObject.put("urlApp_protection", m5034O("urlApp_protection"));
        jSONObject.put("vid", this.f3714eL.getVID());
        jSONObject.put("tid", this.f3714eL.getTID());
        jSONObject.put("auid", this.f3714eL.getAUID());
        jSONObject.put("osid", "100");
        jSONObject.put("ads_type", "interstitial");
        jSONObject.put("country", this.f3715eM.getCountry());
        jSONObject.put("gdpr", C1336k.m5716a((AppnextAd) this.f3715eM, (C1345p) C1155c.m5113aA()));
        jSONObject.put("lang_settings", new JSONObject(C1305b.m5595cN().getLang()).toString());
        String language = this.f3714eL.getLanguage();
        if (language == null || language.equals("")) {
            language = Locale.getDefault().getLanguage().toUpperCase();
        }
        jSONObject.put("lang", language);
        jSONObject.put("tem", new JSONArray(m5034O("S1")).toString());
        jSONObject.put("click_x", m5034O("clickType_A"));
        if (getIntent() != null && getIntent().hasExtra("show_desc")) {
            jSONObject.put("show_desc", getIntent().getStringExtra("show_desc"));
        }
        try {
            Bitmap aL = C1326f.m5671aL(this.f3715eM.getImageURL());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            aL.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            StringBuilder sb4 = new StringBuilder("data:image/");
            sb4.append(this.f3715eM.getImageURL().substring(this.f3715eM.getImageURL().lastIndexOf(46) + 1));
            sb4.append(";base64,");
            sb4.append(encodeToString);
            sb = sb4.toString();
            Swatch vibrantSwatch = Palette.from(aL).generate().getVibrantSwatch();
            if (vibrantSwatch != null) {
                jSONObject.put("icon_color", String.format("#%06X", new Object[]{Integer.valueOf(vibrantSwatch.getRgb() & 16777215)}));
            } else {
                jSONObject.put("icon_color", "");
            }
        } catch (Throwable unused) {
        }
        jSONObject.put("icon_src", sb);
        return jSONObject;
    }

    /* renamed from: d */
    private static String m5046d(int i) {
        return String.format("#%06X", new Object[]{Integer.valueOf(i & 16777215)});
    }

    private static boolean hasVideo(AppnextAd appnextAd) {
        return !appnextAd.getVideoUrl().equals("") || !appnextAd.getVideoUrlHigh().equals("") || !appnextAd.getVideoUrl30Sec().equals("") || !appnextAd.getVideoUrlHigh30Sec().equals("");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        try {
            C1153a.m5095ax().mo5724i(this.f3714eL);
            this.f3714eL.destroy();
            this.f3714eL = null;
            if (this.f3718eP != null) {
                this.f3718eP.removeCallbacksAndMessages(null);
            }
            this.f3718eP = null;
            this.f3725eW = null;
            this.f3715eM = null;
            if (this.f3712eJ != null) {
                this.f3712eJ.stopLoading();
                if (this.f3712eJ.getParent() != null) {
                    ((ViewGroup) this.f3712eJ.getParent()).removeView(this.f3712eJ);
                }
                this.f3712eJ.setWebChromeClient(null);
                this.f3712eJ.setWebViewClient(null);
                this.f3712eJ.destroy();
                this.f3712eJ = null;
            }
            AppnextWebView.m5797B(this).mo6320a(mo5650an());
            this.f3720eR = null;
            this.f3719eQ = null;
            if (this.f3711dB != null) {
                this.f3711dB.mo5410d(this);
                this.f3711dB = null;
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public String m5034O(String str) {
        String str2 = C1155c.m5113aA().get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: a */
    static /* synthetic */ void m5037a(InterstitialActivity interstitialActivity) {
        try {
            AppnextWebView B = AppnextWebView.m5797B(interstitialActivity);
            interstitialActivity.f3712eJ = B.mo6323aU(interstitialActivity.ads != null ? "fullscreen" : "interstitial");
            interstitialActivity.f3712eJ = B.mo6319a(interstitialActivity, interstitialActivity.f3714eL.getPageUrl(), interstitialActivity.mo5650an(), interstitialActivity.f3714eL.getFallback(), interstitialActivity.ads != null ? "fullscreen" : "interstitial");
            interstitialActivity.f3712eJ.setWebViewClient(new WebViewClient() {
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

                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    InterstitialActivity.this.f3718eP.removeCallbacksAndMessages(null);
                    InterstitialActivity.m5056l(InterstitialActivity.this);
                }
            });
            interstitialActivity.f3712eJ.setWebChromeClient(new WebChromeClient() {
                public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                    new StringBuilder("console ").append(consoleMessage.message());
                    if (!consoleMessage.message().contains("pause") && (consoleMessage.message().contains("TypeError") || consoleMessage.message().contains("has no method") || consoleMessage.message().contains("is not a function"))) {
                        InterstitialActivity.this.onError(AppnextError.INTERNAL_ERROR);
                        InterstitialActivity.this.finish();
                    }
                    return true;
                }
            });
        } catch (Throwable unused) {
            interstitialActivity.onError(AppnextError.INTERNAL_ERROR);
            interstitialActivity.finish();
        }
    }

    /* renamed from: l */
    static /* synthetic */ void m5056l(InterstitialActivity interstitialActivity) {
        interstitialActivity.f3718eP.removeCallbacks(interstitialActivity.f3725eW);
        interstitialActivity.f3713eK = true;
        interstitialActivity.f3716eN = interstitialActivity.getIntent().getExtras().getString("creative");
        if (interstitialActivity.f3716eN == null || interstitialActivity.f3716eN.equals(Interstitial.TYPE_MANAGED)) {
            interstitialActivity.f3716eN = interstitialActivity.m5034O("creative");
        }
        new Thread(new Runnable() {
            public final void run() {
                InterstitialActivity.this.mo5651ao();
            }
        }).start();
        if (interstitialActivity.f3712eJ == null) {
            interstitialActivity.onError(AppnextError.INTERNAL_ERROR);
            interstitialActivity.finish();
            return;
        }
        if (interstitialActivity.f3712eJ.getParent() != null) {
            ((ViewGroup) interstitialActivity.f3712eJ.getParent()).removeView(interstitialActivity.f3712eJ);
        }
        interstitialActivity.f4106kr.addView(interstitialActivity.f3712eJ);
        interstitialActivity.f3712eJ.getLayoutParams().width = -1;
        interstitialActivity.f3712eJ.getLayoutParams().height = -1;
    }

    /* renamed from: b */
    static /* synthetic */ void m5042b(InterstitialActivity interstitialActivity, String str) {
        AppnextAd appnextAd = (AppnextAd) C1153a.m5095ax().parseAd(str);
        if (appnextAd != null) {
            interstitialActivity.f3710dA = new InterstitialAd(appnextAd);
            if (!(interstitialActivity.f3714eL == null || interstitialActivity.f3714eL.getOnAdClickedCallback() == null)) {
                interstitialActivity.f3714eL.getOnAdClickedCallback().adClicked();
            }
            interstitialActivity.mo5425b(interstitialActivity.f3710dA, interstitialActivity.f3719eQ);
            interstitialActivity.report(C1066a.f3539cY);
            if (interstitialActivity.f3710dA.getBannerID().equals(interstitialActivity.f3715eM != null ? interstitialActivity.f3715eM.getBannerID() : "")) {
                if (!interstitialActivity.f3721eS) {
                    interstitialActivity.f3721eS = true;
                    interstitialActivity.report(C1066a.f3575dn);
                }
            } else if (!interstitialActivity.f3722eT) {
                interstitialActivity.f3722eT = true;
                interstitialActivity.report(C1066a.f3574dm);
            }
        }
    }
}
