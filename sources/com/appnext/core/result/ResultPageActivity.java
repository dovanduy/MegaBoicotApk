package com.appnext.core.result;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.appnext.core.AppnextAd;
import com.appnext.core.C1286Ad;
import com.appnext.core.C1317e.C1324a;
import com.appnext.core.C1326f;
import com.appnext.core.C1331g;
import com.appnext.core.C1340l;
import com.appnext.core.C1345p;
import com.appnext.core.C1349q;
import com.appnext.core.C1349q.C1358a;
import com.appnext.core.webview.AppnextWebView;
import com.appnext.core.webview.AppnextWebView.C1376c;
import com.google.android.exoplayer2.C2793C;
import java.net.URL;
import org.json.JSONObject;

public class ResultPageActivity extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: bs */
    public boolean f4271bs;
    /* access modifiers changed from: private */

    /* renamed from: dA */
    public AppnextAd f4272dA;
    /* access modifiers changed from: private */

    /* renamed from: eU */
    public String f4273eU;
    /* access modifiers changed from: private */

    /* renamed from: jS */
    public String f4274jS;
    /* access modifiers changed from: private */

    /* renamed from: lY */
    public AppnextAd f4275lY;
    /* access modifiers changed from: private */

    /* renamed from: lZ */
    public String f4276lZ;

    /* renamed from: ma */
    private C1369a f4277ma;
    /* access modifiers changed from: private */

    /* renamed from: mb */
    public C1371c f4278mb;
    /* access modifiers changed from: private */
    public String placementID;
    /* access modifiers changed from: private */
    public C1349q userAction;
    private WebView webView;

    private class CustomAd extends AppnextAd {
        CustomAd(AppnextAd appnextAd) {
            super(appnextAd);
        }

        /* access modifiers changed from: protected */
        public void setAdJSON(String str) {
            super.setAdJSON(str);
        }

        /* access modifiers changed from: protected */
        public String getAdJSON() {
            return super.getAdJSON();
        }

        /* access modifiers changed from: protected */
        public String getAppURL() {
            return super.getAppURL();
        }

        /* access modifiers changed from: protected */
        public void setStoreRating(String str) {
            super.setStoreRating(str);
        }
    }

    /* renamed from: com.appnext.core.result.ResultPageActivity$a */
    public class C1364a extends WebViewClient {
        public C1364a() {
        }

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
            new Thread(new Runnable() {
                public final void run() {
                    final String b = C1326f.m5675b((Context) ResultPageActivity.this, false);
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            try {
                                ResultPageActivity resultPageActivity = ResultPageActivity.this;
                                StringBuilder sb = new StringBuilder("Appnext.setParams(");
                                sb.append(C1372d.m5794cO().mo6318cP().getConfigParams().put("did", b).toString());
                                sb.append(");");
                                resultPageActivity.loadJS(sb.toString());
                            } catch (Throwable unused) {
                            }
                            ResultPageActivity resultPageActivity2 = ResultPageActivity.this;
                            StringBuilder sb2 = new StringBuilder("Appnext.load(");
                            sb2.append(ResultPageActivity.this.m5778g(ResultPageActivity.this.f4275lY).getAdJSON());
                            sb2.append(",");
                            sb2.append(ResultPageActivity.this.f4273eU);
                            sb2.append(",");
                            sb2.append(ResultPageActivity.this.f4274jS);
                            sb2.append(");");
                            resultPageActivity2.loadJS(sb2.toString());
                        }
                    });
                }
            }).start();
        }
    }

    /* renamed from: com.appnext.core.result.ResultPageActivity$b */
    public class C1367b {
        public C1367b() {
        }

        @JavascriptInterface
        public final void adClicked(String str, int i) {
            ResultPageActivity.this.f4272dA = (AppnextAd) ResultPageActivity.this.parseAd(str);
            C1349q g = ResultPageActivity.this.userAction;
            AppnextAd b = ResultPageActivity.this.f4272dA;
            StringBuilder sb = new StringBuilder();
            sb.append(ResultPageActivity.this.m5778g(ResultPageActivity.this.f4272dA).getAppURL());
            sb.append("&tem_id=");
            sb.append(ResultPageActivity.this.f4276lZ);
            sb.append("1");
            g.mo6291a(b, sb.toString(), ResultPageActivity.this.placementID, new C1324a() {
                public final void error(String str) {
                }

                public final void onMarket(String str) {
                    if (ResultPageActivity.this.f4271bs) {
                        ResultPageActivity.this.finish();
                    }
                }
            });
        }

        @JavascriptInterface
        public final void impression(String str) {
            ResultPageActivity.this.userAction.mo6295e((AppnextAd) ResultPageActivity.this.parseAd(str));
        }

        @JavascriptInterface
        public final void postView(String str) {
            AppnextAd appnextAd = (AppnextAd) ResultPageActivity.this.parseAd(str);
            C1349q g = ResultPageActivity.this.userAction;
            StringBuilder sb = new StringBuilder();
            sb.append(ResultPageActivity.this.m5778g(appnextAd).getAppURL());
            sb.append("&tem_id=");
            sb.append(ResultPageActivity.this.f4276lZ);
            sb.append("1");
            g.mo6290a(appnextAd, sb.toString(), null);
        }

        @JavascriptInterface
        public final void openLink(String str) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.addFlags(268435456);
            ResultPageActivity.this.startActivity(intent);
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"AddJavascriptInterface", "SetJavaScriptEnabled"})
    public void onCreate(Bundle bundle) {
        final String str;
        requestWindowFeature(1);
        super.onCreate(bundle);
        try {
            this.f4278mb = C1372d.m5794cO().mo6318cP();
            this.placementID = this.f4278mb.getPlacementId();
            this.f4276lZ = this.f4278mb.mo5684aq();
            this.f4271bs = getIntent().getExtras().getBoolean("shouldClose");
            this.f4275lY = this.f4278mb.getSelectedAd();
            this.f4274jS = this.f4278mb.mo5685ar();
            this.f4273eU = this.f4278mb.mo5686as();
            this.userAction = new C1349q(this, new C1358a() {
                public final void report(String str) {
                }

                /* renamed from: Y */
                public final C1286Ad mo5458Y() {
                    return ResultPageActivity.this.f4278mb.mo5688au();
                }

                /* renamed from: Z */
                public final AppnextAd mo5459Z() {
                    return ResultPageActivity.this.f4272dA;
                }

                /* renamed from: aa */
                public final C1345p mo5460aa() {
                    return ResultPageActivity.this.f4278mb.mo5687at();
                }
            });
            this.f4277ma = this.f4278mb.mo5689av();
            RelativeLayout relativeLayout = new RelativeLayout(this);
            setContentView(relativeLayout);
            relativeLayout.setLayoutParams(new LayoutParams(-1, -1));
            this.webView = new WebView(getApplicationContext());
            relativeLayout.addView(this.webView);
            this.webView.getLayoutParams().height = -1;
            this.webView.getLayoutParams().width = -1;
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
            this.webView.setWebChromeClient(new WebChromeClient() {
                public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                    StringBuilder sb = new StringBuilder("[");
                    sb.append(consoleMessage.messageLevel().name());
                    sb.append(":CONSOLE(");
                    sb.append(consoleMessage.lineNumber());
                    sb.append(")] \"");
                    sb.append(consoleMessage.message());
                    sb.append("\", source: ");
                    sb.append(consoleMessage.sourceId());
                    sb.append(" (");
                    sb.append(consoleMessage.lineNumber());
                    sb.append(")");
                    return true;
                }
            });
            this.webView.setWebViewClient(new C1364a());
            if (this.f4277ma != null) {
                this.f4277ma.getJSurl();
                str = this.f4277ma.getJSurl();
            } else {
                str = "http://cdn.appnext.com/tools/sdk/banner/2.4.3/result.min.js";
            }
            AppnextWebView.m5797B(this).mo6321a(str, (C1376c) new C1376c() {
                /* renamed from: b */
                public final void mo5656b(String str) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            ResultPageActivity.this.loadWebview(str, AppnextWebView.m5797B(ResultPageActivity.this).mo6324aV(str));
                        }
                    });
                }

                public final void error(String str) {
                    new StringBuilder("error loading script ").append(str);
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            ResultPageActivity.this.loadWebview(str, ResultPageActivity.m5773c(ResultPageActivity.this));
                        }
                    });
                }
            });
            this.webView.addJavascriptInterface(new C1367b(), "Appnext");
        } catch (Throwable unused) {
            finish();
        }
    }

    private String getJSurl() {
        if (this.f4277ma == null) {
            return "http://cdn.appnext.com/tools/sdk/banner/2.4.3/result.min.js";
        }
        this.f4277ma.getJSurl();
        return this.f4277ma.getJSurl();
    }

    private String getFallbackScript() {
        new C1370b();
        return "var Appnext=function(e){var t=e;return t.css='html,body{font-family:sans-serif;-ms-text-size-adjust:100%;-webkit-text-size-adjust:100%;-moz-text-size-adjust:100%;height:100% !important;width:100% !important;padding:0 !important;margin:0 !important;overflow:hidden !important;font-size:85%;max-width:100%;min-width:100%;-moz-user-select:none;-webkit-user-select:none;user-select:none;position:fixed;text-align:left !important;line-height:normal}html>img,body>img{position:absolute;z-index:-1}.md-scroll-mask{position:initial}#appnext{direction:ltr !important;-webkit-font-smoothing:antialiased;overflow:hidden;width:100%;height:100%;font-family:sans-serif !important;position:absolute;top:0;left:0;margin:0;padding:0;-moz-transform:scale(1.01, 1.01);text-align:left !important}#appnext .center{position:absolute;top:50%;transform:translateY(-50%);-webkit-transform:translateY(-50%)}#appnext i{display:inline-block;font-style:normal}#appnext div{direction:ltr !important;text-align:left}#appnext .caption{background:transparent;margin:0;padding:0}#appnext .disclosure{-webkit-tap-highlight-color:none;color:#BDBDBD;z-index:10000;display:block;width:1.8em;height:1.8em;right:0;top:6px;position:absolute;background-repeat:no-repeat;background-size:71%;background-position:center;background-image:url(\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyhpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMTExIDc5LjE1ODMyNSwgMjAxNS8wOS8xMC0wMToxMDoyMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIDIwMTUgKE1hY2ludG9zaCkiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6RTJDQzA2RjkyOTYwMTFFNkE1MDVDRkVBNzkwQ0Q1ODkiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6RTJDQzA2RkEyOTYwMTFFNkE1MDVDRkVBNzkwQ0Q1ODkiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDpFMkNDMDZGNzI5NjAxMUU2QTUwNUNGRUE3OTBDRDU4OSIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDpFMkNDMDZGODI5NjAxMUU2QTUwNUNGRUE3OTBDRDU4OSIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PlU7OdUAAAKvSURBVHjaxJfPS1RRFMfnORUtxiAwWkiGqUVgqzLol+TQL/pBbdIpitzUUtpE1h/Q1C5cZwiBKbiJfgz9YAKLishVLqK0yNoVCOmmwHl9L30G3rzezLtv9DEHPt7Befd7ztxz73nnOq7rJmppy8yffD5fE+fpdPpfAJbmiD3iiNglWsVqvpsVU+KVeCBeCNd6BUKsTvSKKzgNsrVgArtEMFkxJAph4pWsWbwRgzifETfEQbFOrBT1YrM4xHdfeHaQuc3VBrBXvBUdOD4tNoh+8UR8F7/FvPggHvNdG8/OMNdodEYN4ACCDeR0i7grFixStsCz7cw1Gk9ZNasANokxsUIMiOPiVxWbfI65A2iNoV0xgKS4Q15HxcWwTRRiBTSMVgrtZKUAzpG3b+K8xVHaKi57jmOQuWgV90RvuQAcjlqCzTRn8QtNbq+LCxbp8Go7QQF0cny+smQ29jlCOkbRbvWeCm8AhxlHLHe7sf1iG+ff5nSM+HyVBLCT8XmEX3VS7KM+2FhRe0dQKW5jnKwigAnLdBS1NwatQHEn/4zxBfjD5yv0XRC7eQOYZWyI0d8an6+SAD4xtscYQFH7Y1AArxm7Ygygy+erJICHjBl/vV7CdGf4/CgogHE6mfWiJ4YAMmhP0bL9F4BLXU/QTqUsK6Gp689CnkuhmcBHodwxND3cO9EkbnlfGoswB60mCtZQpdexqddnabNMGm4uslbUodGD5hn/eyZI3PR33eKP6BP3xKoqnNcztw+tbrStesKcOEHUR8V7ccpyNZI8O8ncebRyUbviHB3MBPkbpuXO0rQ2iuXQyP+yFLRhT847yjm3uZiYJdtOG3VVtNDR9IfMmxbXbC4mNjcjI3Absd3iGL1Di+9qNs3V7L54advMRrkbFihW40tZnZxaX8//CjAAq56aKzL+/C8AAAAASUVORK5CYII=\")}#appnext .disclosure.gdpr{top:0;background-size:50%;background-position:top right;background-image:url(\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACcAAAAnCAMAAAC7faEHAAAAZlBMVEXNzMwArs1WusyTw8xEuM0Ir83Jy8zFy8y2yMxhvMwWsc2kxsx1v8wttM0dss0QsM2/ysyoxsyaxMyNwsyfxcyHwcyAwMxrvcxLucw3tsw+t80ytc0ks826ycyxx8yux8xovcxPucxOwgPRAAAA+0lEQVQ4y83Tx27DMBAE0CUpdvXuEpf//8lIngS+sOhmz4kQHiAsOUufje7UEXZvWD0ccJZtuYxZx9krxT3vEP6TdYhcdMYtJ0g3q6QTJK6QV5F2pGYHeeqSjkgvEnI1SUfUckBp24TTthC3ArIpVcThYQyNFWQ9xdy6HfYZhhqyGsOul+z8+psqG8izCTkyvSKktRjdtQHXOVb8Q/KAQ8A9t4PHN/0Akybg9ivpac/k/ibxlHC+gnITUdyZ9V2yuBMPCfZEaWMOCp2JOwTrl3GoQNahUlE382qmct/OW3bfvCr5eGAvh2N7ftEZZ9FeRZl4iavIxghNX5lfdnkJssV7DcsAAAAASUVORK5CYII=\")}#appnext .wrp{position:relative;height:100%;width:100%;margin:0;padding:0}#appnext .wrp .header{height:74px;background-size:cover;background-repeat:no-repeat;position:relative}#appnext .wrp .container{width:100%;top:0;left:0;margin:0;padding:0;height:100%}#appnext .wrp .container nav{position:relative;margin-top:16px;width:93%;height:30px;margin-left:4%;margin-bottom:2px}#appnext .wrp .container nav ul.tabs{width:100%;list-style:none;padding:0;margin:0;text-transform:uppercase;font-size:1.2em;font-style:italic;position:absolute;top:0;z-index:10}#appnext .wrp .container nav ul.tabs li{display:inline-block;margin:0;padding:0;padding-bottom:1%;margin-right:5%;color:#6f6f6f;position:relative;max-width:40%;white-space:nowrap;overflow:hidden;text-overflow:ellipsis}#appnext .wrp .container nav ul.tabs li.active{font-weight:bold}#appnext .wrp .container nav ul.tabs li.active span{display:block;width:100%;height:6px;background:#3499e7;position:absolute;bottom:-6px}#appnext .wrp .container nav .sep{background:#cecece;height:2px;position:absolute;bottom:6px;width:100%;z-index:1}#appnext .wrp .container .more_apps{width:100%;overflow:hidden;overflow-y:auto;height:100%}#appnext .wrp .container .more_apps .suggested_apps{height:100%;width:100%;margin:0 auto}#appnext .wrp .container .more_apps .suggested_apps>div.title{padding:2.5% 6%;background-color:rgba(76,93,128,0.8);letter-spacing:0.2px;color:#ffffff;font-size:1.3em;position:relative}#appnext .wrp .container .more_apps .suggested_apps>div.title:first-child{padding:3.5% 6%;font-size:1.5em;background-color:#4c5d80}#appnext .wrp .container .more_apps .suggested_apps>div.app_container{background:white;padding:3% 0;box-shadow:0 -3px 7px -1px rgba(0,0,0,0.1);position:relative;height:104px;display:table-row}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div{display:table-cell;vertical-align:middle}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.icon{width:25%;text-align:center;background:none}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.icon img{width:55%;height:auto;vertical-align:middle}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.caption{width:51%;font-size:12px;color:rgba(74,74,74,0.79);font-weight:300}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.caption .title{text-align:left;margin:0;padding:0;font-size:14px;font-weight:bold;line-height:1.5em}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.caption .dec{width:90%}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.cta{padding-bottom:9px;padding-right:9px;vertical-align:bottom;width:auto;text-transform:uppercase;text-align:center;font-size:12px;color:rgba(76,93,128,0.8)}@media only screen and (orientation: landscape){#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.icon{width:13%}}template{display:none} ',t.build=\"1534333058941\",t.template='<div class=\"wrp\">   <div class=\"disclosure \"></div>    <div class=\"container\">              <div class=\"more_apps\">            <div class=\"suggested_apps\"></div>        </div>    </div>    \\x3c!--div class=\"close_button\"></div--\\x3e       <template id=\"app_template\">        <div class=\"app_container\">            <div class=\"icon\">              <img/>            </div>           <div class=\"caption\">              <div class=\"title\"></div>                          <div class=\"desc\"></div>           </div>          <div class=\"cta\">            Install          </div>       </div>    </template>    </div>',t.vid=t.vid||\"1\",t.tid=t.tid||\"301\",t.osid=t.osid||\"100\",t.ads_type=\"interstitial_tag\",t}(Appnext||{}),Appnext=function(e){function t(e,t){n.Layout.Disclosure.addEventListener(\"click\",function(t){t.stopPropagation();var i=e.country||\"\",a=e.zId,o=\"https://www.appnext.com/privacy_policy/index.html?z=\"+a+\"&geo=\"+i;1==e.gdpr&&(o+=\"&edda=1\"),n.redirect(o)},!1),1==e.gdpr&&n.Layout.Disclosure.classList.add(\"gdpr\"),t.appendChild(n.Layout.Disclosure)}var n=e;return n.id=n.android_id||n.id,n.timstamp=Date.now(),n.API=function(){function e(e,t,n){var i=new XMLHttpRequest;i.open(n,e,!0),i.onload=t;var a=new FormData;i.send(a)}function t(e,t,n,i){window.callback=function(e){return e||!0}(t);var a=document.createElement(\"script\");e+=~e.indexOf(\"?\")?\"&\":\"?\",a.src=e,a.className=\"appnext_cb\",a.type=void 0!==i&&i?i:\"text/javascript\",a.async=!0;try{document.body?document.body.appendChild(a):document.head.appendChild(a)}catch(e){return!!n&&n(e)}}var i={data:\"./data.json\",log:\"https://admin.appnext.com/tp12.aspx\",config:\"https://cdn.appnext.com/tools/sdk/config/2.4.0/result_banner/\"};return{buildUrl:function(e,t){var n=[];for(var i in t)n.push(encodeURIComponent(i)+\"=\"+encodeURIComponent(t[i]));return e+\"?\"+n.join(\"&\")},loadAds:function(t){if(n.client_call){var a=i.data;return void e(a,t,\"GET\")}t(n.data)},loadConfig:function(e){var a=\"en\";switch(n.lang){case\"zh\":a=\"zh\";break;case\"ru\":a=\"ru\";break;case\"de\":a=\"de\"}t(i.config+a+\"/result_config.json\",e,n.error,null)},log:function(e,a,o){if(e==n.API.TP12.Play||e==n.API.TP12.Ended){var p={tid:n.tid,vid:n.vid,osid:n.osid,auid:n.auid,pid:n.id,bid:o?o.bannerId:0,cid:o?o.campaignId:0,session_id:a?encodeURIComponent(a):null,ref:encodeURIComponent(e),ads_type:n.ads_type},r=i.log;t(this.buildUrl(r,p),function(e){return e},null,null)}},getRequest:function(e){t(e,null,null,null)},notifyImpression:function(e,t,i){if(!e.isImp){e.isImp=!0;(function(e,t,i){return function(){if(n.Layout.isVisible(t)){var a=JSON.stringify(e);n.postView(a),i&&i()}else e.isImp=!1}})(e,t,i)()}},getStyleUrl:function(){return i.css},TP12:{},Error:{NoAds:\"NO_ADS\",Other:\"NO_ADS\"}}}(),n.Layout=function(){var e=n.template,t={Close_Button:\".close_button\",More_Apps:\".more_apps\",More_Apps_Section:\".suggested_apps\",Small_App_Template:\"#app_template\",Footer:\".footer\",Header:\".header\",Disclosure:\".disclosure\"},i=document.createElement(\"div\");i.id=\"appnext\",i.className=\"appnext\";var a,o,p,r=(screen.width<screen.height?screen.height:screen.width,{isLoaded:!1,isVisible:function(e){var t=e.getBoundingClientRect(),n=Math.max(document.documentElement.clientHeight,window.innerHeight);return!(t.bottom<0||t.top-n>=0)&&this.isLoaded},calcHeight:function(){window.scrollTo(0,1)},resize:function(){n.Layout.calcHeight(),setTimeout(n.Layout.calcHeight.call(n.Layout),100)},setTemplate:function(){},loadStyle:function(){if(!this.isLoaded){this.isLoaded=!0,i.innerHTML=e;var t=document.createElement(\"meta\");t.name=\"viewport\",t.content=\"user-scalable=1\";var r=document.querySelectorAll(\"meta[name='viewport']\");p=r[r.length-1]||t,o=document.createElement(\"meta\"),o.name=\"viewport\",o.content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0\";var s=n.css||\"\";a=document.createElement(\"style\"),a.type=\"text/css\",a.innerHTML=s,document.head.appendChild(a),document.head.appendChild(o),this.setTemplate()}},destroy:function(e){if(this.isLoaded){this.isLoaded=!1,document.head.removeChild(o),document.body.removeChild(this.Container),document.head.removeChild(this.Style),document.head.appendChild(p);for(var t=document.querySelectorAll(\".appnext_cb\"),i=0;i<t.length;i++)document.body.removeChild(t[i]);return window.removeEventListener(\"resize\",n.Layout.resize),e}},get Container(){return i},get Style(){return a},set Style(e){a=e},getAppTemplate:function(){var e={},t=document.createElement(\"div\");t.innerHTML=r.Small_App_Template.innerHTML;var n={App_Image:\".icon img\",Title:\".title\",Rate_Number:\".rate\",Rating:\".rating\",Description:\".desc\",Click_Section:\".app_container\",Container:\".app_container\",CTA:\".cta\"};for(var i in n)!function(n,i){Object.defineProperty(e,n,{get:function(){return t.querySelector(i[n])||document.createElement(\"div\")},enumerable:!0})}(i,n);return e}});for(var s in t)!function(e){Object.defineProperty(r,e,{get:function(){return i.querySelector(t[e])||document.createElement(\"div\")},enumerable:!0})}(s);return r}(),n.redirect=n.openLink||function(e){window.open(e,\"_top\")},n.setParams=function(e){for(key in e)n[key]=decodeURIComponent(e[key])},n.parseApp=function(e,t,i){var a=n.Layout.getAppTemplate();a.App_Image.src=e.urlImg,a.Title.textContent=e.title||\"\";var o=e.desc.length>60?e.desc.slice(0,60)+\"...\":e.desc;if(a.Description.textContent=o,n.config.hasOwnProperty(t)){var p=n.config[t];a.CTA.textContent=p.cta,a.CTA.style.color=p.color}return i&&(a.CTA.textContent=\"\"),1==e.is_installed&&(a.CTA.textContent=n.config.cta_open_text||\"Open\"),a.Click_Section.addEventListener(\"click\",function(t){console.log(\"APP \"+e.title+\" \"+e.index),n.adClicked(JSON.stringify(e),e.index)}),a.App_Image.addEventListener(\"load\",function(){n.API.notifyImpression(e,this)}),function(t,i){e.imp=function(){n.API.notifyImpression(t,i)}}(e,a.App_Image),a.Container},n.parseTitle=function(e,t){var i=document.createElement(\"div\");return i.classList.add(\"title\"),i.innerText=e,n.config.hasOwnProperty(t)&&(i.style.background=n.config[t].color),i},n.setContent=function(e){n.setDisclosureIcon=!1;var i=n.action;n.Layout.More_Apps_Section.innerHTML=\"\";var a,o,p=parseInt(n.config.campaigns_amount)||6,r=0,s=0,d=[],c=[];if(r<e.length&&r<p){var l=n.config[i].title_main;a=n.parseTitle(l,i),n.Layout.More_Apps_Section.appendChild(a)}for(;r<e.length&&r<p;r++){var u=e[r];-1!=u.package_action.indexOf(i)?(u.index=s,function(e,i,a){var o=n.parseApp(e,i,!1);n.Layout.More_Apps_Section.appendChild(o),n.setDisclosureIcon||(n.setDisclosureIcon=!0,t(e,a))}(u,i,a),c.push(u),s++):d.push(u)}if(r=c.length,\"sapop\"!=i){if(r<d.length&&r<p){var l=n.config.sapop.title_main;o=n.parseTitle(l,\"sapop\"),n.Layout.More_Apps_Section.appendChild(o)}for(var g=0;g<d.length&&r<p;r++,g++){var u=d[g];u.index=s,function(e,i,a){var o=n.parseApp(e,i,!0);n.Layout.More_Apps_Section.appendChild(o),n.setDisclosureIcon||(n.setDisclosureIcon=!0,t(e,a))}(u,i,a),s++,c.push(u)}}n.Layout.More_Apps.onscroll=function(e){for(var t=0;t<c.length;t++)c[t].imp();n.isScrollEvent||(n.isScrollEvent=!0)}},n.parseAds=function(e){try{var t=n.client_call?JSON.parse(this.responseText):e;n.Layout.loadStyle(),document.body.appendChild(n.Layout.Container),n.setContent(t.apps)}catch(e){return n.error(e),!1}},n.error=n.error||function(e){console.log(e)},n.load=function(e,t,i){return console.log(\"banner\",e),console.log(\"data\",t),console.log(\"data_all\",i),n.banner=e,n.data=t,n.data_all=i,n.API.loadConfig(function(e){n.config=e,n.action=n.banner.package_action.shift(),n.API.loadAds(n.parseAds)}),!0},n}(Appnext);";
    }

    /* renamed from: aw */
    private Object m5770aw() {
        return new C1367b();
    }

    private WebViewClient getWebViewClient() {
        return new C1364a();
    }

    public C1331g parseAd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            AppnextAd appnextAd = (AppnextAd) C1340l.m5717a(AppnextAd.class, jSONObject);
            if (appnextAd != null) {
                m5778g(appnextAd).setAdJSON(jSONObject.toString());
                if (appnextAd.getStoreRating().equals("")) {
                    m5778g(appnextAd).setStoreRating("0");
                }
            }
            return appnextAd;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void loadJS(String str) {
        new StringBuilder("loading js ").append(str);
        if (this.webView != null) {
            WebView webView2 = this.webView;
            StringBuilder sb = new StringBuilder("javascript:(function() { try { ");
            sb.append(str);
            sb.append(" } catch(err){ Appnext.jsError(err.message); }})()");
            webView2.loadUrl(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void loadWebview(String str, String str2) {
        try {
            URL url = new URL(str);
            StringBuilder sb = new StringBuilder();
            sb.append(url.getProtocol());
            sb.append("://");
            sb.append(url.getHost());
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder("<html><body><script>");
            sb3.append(str2);
            sb3.append("</script></body></html>");
            this.webView.loadDataWithBaseURL(sb2, sb3.toString(), null, C2793C.UTF8_NAME, null);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r1 = this;
            super.onDestroy()
            android.webkit.WebView r0 = r1.webView     // Catch:{ Throwable -> 0x000f }
            if (r0 == 0) goto L_0x000f
            android.webkit.WebView r0 = r1.webView     // Catch:{ Throwable -> 0x000f }
            r0.destroy()     // Catch:{ Throwable -> 0x000f }
            r0 = 0
            r1.webView = r0     // Catch:{ Throwable -> 0x000f }
        L_0x000f:
            com.appnext.core.q r0 = r1.userAction     // Catch:{ Throwable -> 0x0015 }
            r0.destroy()     // Catch:{ Throwable -> 0x0015 }
            return
        L_0x0015:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.result.ResultPageActivity.onDestroy():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public CustomAd m5778g(AppnextAd appnextAd) {
        return new CustomAd(appnextAd);
    }

    /* renamed from: c */
    static /* synthetic */ String m5773c(ResultPageActivity resultPageActivity) {
        new C1370b();
        return "var Appnext=function(e){var t=e;return t.css='html,body{font-family:sans-serif;-ms-text-size-adjust:100%;-webkit-text-size-adjust:100%;-moz-text-size-adjust:100%;height:100% !important;width:100% !important;padding:0 !important;margin:0 !important;overflow:hidden !important;font-size:85%;max-width:100%;min-width:100%;-moz-user-select:none;-webkit-user-select:none;user-select:none;position:fixed;text-align:left !important;line-height:normal}html>img,body>img{position:absolute;z-index:-1}.md-scroll-mask{position:initial}#appnext{direction:ltr !important;-webkit-font-smoothing:antialiased;overflow:hidden;width:100%;height:100%;font-family:sans-serif !important;position:absolute;top:0;left:0;margin:0;padding:0;-moz-transform:scale(1.01, 1.01);text-align:left !important}#appnext .center{position:absolute;top:50%;transform:translateY(-50%);-webkit-transform:translateY(-50%)}#appnext i{display:inline-block;font-style:normal}#appnext div{direction:ltr !important;text-align:left}#appnext .caption{background:transparent;margin:0;padding:0}#appnext .disclosure{-webkit-tap-highlight-color:none;color:#BDBDBD;z-index:10000;display:block;width:1.8em;height:1.8em;right:0;top:6px;position:absolute;background-repeat:no-repeat;background-size:71%;background-position:center;background-image:url(\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyhpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMTExIDc5LjE1ODMyNSwgMjAxNS8wOS8xMC0wMToxMDoyMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIDIwMTUgKE1hY2ludG9zaCkiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6RTJDQzA2RjkyOTYwMTFFNkE1MDVDRkVBNzkwQ0Q1ODkiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6RTJDQzA2RkEyOTYwMTFFNkE1MDVDRkVBNzkwQ0Q1ODkiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDpFMkNDMDZGNzI5NjAxMUU2QTUwNUNGRUE3OTBDRDU4OSIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDpFMkNDMDZGODI5NjAxMUU2QTUwNUNGRUE3OTBDRDU4OSIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PlU7OdUAAAKvSURBVHjaxJfPS1RRFMfnORUtxiAwWkiGqUVgqzLol+TQL/pBbdIpitzUUtpE1h/Q1C5cZwiBKbiJfgz9YAKLishVLqK0yNoVCOmmwHl9L30G3rzezLtv9DEHPt7Befd7ztxz73nnOq7rJmppy8yffD5fE+fpdPpfAJbmiD3iiNglWsVqvpsVU+KVeCBeCNd6BUKsTvSKKzgNsrVgArtEMFkxJAph4pWsWbwRgzifETfEQbFOrBT1YrM4xHdfeHaQuc3VBrBXvBUdOD4tNoh+8UR8F7/FvPggHvNdG8/OMNdodEYN4ACCDeR0i7grFixStsCz7cw1Gk9ZNasANokxsUIMiOPiVxWbfI65A2iNoV0xgKS4Q15HxcWwTRRiBTSMVgrtZKUAzpG3b+K8xVHaKi57jmOQuWgV90RvuQAcjlqCzTRn8QtNbq+LCxbp8Go7QQF0cny+smQ29jlCOkbRbvWeCm8AhxlHLHe7sf1iG+ff5nSM+HyVBLCT8XmEX3VS7KM+2FhRe0dQKW5jnKwigAnLdBS1NwatQHEn/4zxBfjD5yv0XRC7eQOYZWyI0d8an6+SAD4xtscYQFH7Y1AArxm7Ygygy+erJICHjBl/vV7CdGf4/CgogHE6mfWiJ4YAMmhP0bL9F4BLXU/QTqUsK6Gp689CnkuhmcBHodwxND3cO9EkbnlfGoswB60mCtZQpdexqddnabNMGm4uslbUodGD5hn/eyZI3PR33eKP6BP3xKoqnNcztw+tbrStesKcOEHUR8V7ccpyNZI8O8ncebRyUbviHB3MBPkbpuXO0rQ2iuXQyP+yFLRhT847yjm3uZiYJdtOG3VVtNDR9IfMmxbXbC4mNjcjI3Absd3iGL1Di+9qNs3V7L54advMRrkbFihW40tZnZxaX8//CjAAq56aKzL+/C8AAAAASUVORK5CYII=\")}#appnext .disclosure.gdpr{top:0;background-size:50%;background-position:top right;background-image:url(\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACcAAAAnCAMAAAC7faEHAAAAZlBMVEXNzMwArs1WusyTw8xEuM0Ir83Jy8zFy8y2yMxhvMwWsc2kxsx1v8wttM0dss0QsM2/ysyoxsyaxMyNwsyfxcyHwcyAwMxrvcxLucw3tsw+t80ytc0ks826ycyxx8yux8xovcxPucxOwgPRAAAA+0lEQVQ4y83Tx27DMBAE0CUpdvXuEpf//8lIngS+sOhmz4kQHiAsOUufje7UEXZvWD0ccJZtuYxZx9krxT3vEP6TdYhcdMYtJ0g3q6QTJK6QV5F2pGYHeeqSjkgvEnI1SUfUckBp24TTthC3ArIpVcThYQyNFWQ9xdy6HfYZhhqyGsOul+z8+psqG8izCTkyvSKktRjdtQHXOVb8Q/KAQ8A9t4PHN/0Akybg9ivpac/k/ibxlHC+gnITUdyZ9V2yuBMPCfZEaWMOCp2JOwTrl3GoQNahUlE382qmct/OW3bfvCr5eGAvh2N7ftEZZ9FeRZl4iavIxghNX5lfdnkJssV7DcsAAAAASUVORK5CYII=\")}#appnext .wrp{position:relative;height:100%;width:100%;margin:0;padding:0}#appnext .wrp .header{height:74px;background-size:cover;background-repeat:no-repeat;position:relative}#appnext .wrp .container{width:100%;top:0;left:0;margin:0;padding:0;height:100%}#appnext .wrp .container nav{position:relative;margin-top:16px;width:93%;height:30px;margin-left:4%;margin-bottom:2px}#appnext .wrp .container nav ul.tabs{width:100%;list-style:none;padding:0;margin:0;text-transform:uppercase;font-size:1.2em;font-style:italic;position:absolute;top:0;z-index:10}#appnext .wrp .container nav ul.tabs li{display:inline-block;margin:0;padding:0;padding-bottom:1%;margin-right:5%;color:#6f6f6f;position:relative;max-width:40%;white-space:nowrap;overflow:hidden;text-overflow:ellipsis}#appnext .wrp .container nav ul.tabs li.active{font-weight:bold}#appnext .wrp .container nav ul.tabs li.active span{display:block;width:100%;height:6px;background:#3499e7;position:absolute;bottom:-6px}#appnext .wrp .container nav .sep{background:#cecece;height:2px;position:absolute;bottom:6px;width:100%;z-index:1}#appnext .wrp .container .more_apps{width:100%;overflow:hidden;overflow-y:auto;height:100%}#appnext .wrp .container .more_apps .suggested_apps{height:100%;width:100%;margin:0 auto}#appnext .wrp .container .more_apps .suggested_apps>div.title{padding:2.5% 6%;background-color:rgba(76,93,128,0.8);letter-spacing:0.2px;color:#ffffff;font-size:1.3em;position:relative}#appnext .wrp .container .more_apps .suggested_apps>div.title:first-child{padding:3.5% 6%;font-size:1.5em;background-color:#4c5d80}#appnext .wrp .container .more_apps .suggested_apps>div.app_container{background:white;padding:3% 0;box-shadow:0 -3px 7px -1px rgba(0,0,0,0.1);position:relative;height:104px;display:table-row}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div{display:table-cell;vertical-align:middle}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.icon{width:25%;text-align:center;background:none}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.icon img{width:55%;height:auto;vertical-align:middle}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.caption{width:51%;font-size:12px;color:rgba(74,74,74,0.79);font-weight:300}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.caption .title{text-align:left;margin:0;padding:0;font-size:14px;font-weight:bold;line-height:1.5em}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.caption .dec{width:90%}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.cta{padding-bottom:9px;padding-right:9px;vertical-align:bottom;width:auto;text-transform:uppercase;text-align:center;font-size:12px;color:rgba(76,93,128,0.8)}@media only screen and (orientation: landscape){#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.icon{width:13%}}template{display:none} ',t.build=\"1534333058941\",t.template='<div class=\"wrp\">   <div class=\"disclosure \"></div>    <div class=\"container\">              <div class=\"more_apps\">            <div class=\"suggested_apps\"></div>        </div>    </div>    \\x3c!--div class=\"close_button\"></div--\\x3e       <template id=\"app_template\">        <div class=\"app_container\">            <div class=\"icon\">              <img/>            </div>           <div class=\"caption\">              <div class=\"title\"></div>                          <div class=\"desc\"></div>           </div>          <div class=\"cta\">            Install          </div>       </div>    </template>    </div>',t.vid=t.vid||\"1\",t.tid=t.tid||\"301\",t.osid=t.osid||\"100\",t.ads_type=\"interstitial_tag\",t}(Appnext||{}),Appnext=function(e){function t(e,t){n.Layout.Disclosure.addEventListener(\"click\",function(t){t.stopPropagation();var i=e.country||\"\",a=e.zId,o=\"https://www.appnext.com/privacy_policy/index.html?z=\"+a+\"&geo=\"+i;1==e.gdpr&&(o+=\"&edda=1\"),n.redirect(o)},!1),1==e.gdpr&&n.Layout.Disclosure.classList.add(\"gdpr\"),t.appendChild(n.Layout.Disclosure)}var n=e;return n.id=n.android_id||n.id,n.timstamp=Date.now(),n.API=function(){function e(e,t,n){var i=new XMLHttpRequest;i.open(n,e,!0),i.onload=t;var a=new FormData;i.send(a)}function t(e,t,n,i){window.callback=function(e){return e||!0}(t);var a=document.createElement(\"script\");e+=~e.indexOf(\"?\")?\"&\":\"?\",a.src=e,a.className=\"appnext_cb\",a.type=void 0!==i&&i?i:\"text/javascript\",a.async=!0;try{document.body?document.body.appendChild(a):document.head.appendChild(a)}catch(e){return!!n&&n(e)}}var i={data:\"./data.json\",log:\"https://admin.appnext.com/tp12.aspx\",config:\"https://cdn.appnext.com/tools/sdk/config/2.4.0/result_banner/\"};return{buildUrl:function(e,t){var n=[];for(var i in t)n.push(encodeURIComponent(i)+\"=\"+encodeURIComponent(t[i]));return e+\"?\"+n.join(\"&\")},loadAds:function(t){if(n.client_call){var a=i.data;return void e(a,t,\"GET\")}t(n.data)},loadConfig:function(e){var a=\"en\";switch(n.lang){case\"zh\":a=\"zh\";break;case\"ru\":a=\"ru\";break;case\"de\":a=\"de\"}t(i.config+a+\"/result_config.json\",e,n.error,null)},log:function(e,a,o){if(e==n.API.TP12.Play||e==n.API.TP12.Ended){var p={tid:n.tid,vid:n.vid,osid:n.osid,auid:n.auid,pid:n.id,bid:o?o.bannerId:0,cid:o?o.campaignId:0,session_id:a?encodeURIComponent(a):null,ref:encodeURIComponent(e),ads_type:n.ads_type},r=i.log;t(this.buildUrl(r,p),function(e){return e},null,null)}},getRequest:function(e){t(e,null,null,null)},notifyImpression:function(e,t,i){if(!e.isImp){e.isImp=!0;(function(e,t,i){return function(){if(n.Layout.isVisible(t)){var a=JSON.stringify(e);n.postView(a),i&&i()}else e.isImp=!1}})(e,t,i)()}},getStyleUrl:function(){return i.css},TP12:{},Error:{NoAds:\"NO_ADS\",Other:\"NO_ADS\"}}}(),n.Layout=function(){var e=n.template,t={Close_Button:\".close_button\",More_Apps:\".more_apps\",More_Apps_Section:\".suggested_apps\",Small_App_Template:\"#app_template\",Footer:\".footer\",Header:\".header\",Disclosure:\".disclosure\"},i=document.createElement(\"div\");i.id=\"appnext\",i.className=\"appnext\";var a,o,p,r=(screen.width<screen.height?screen.height:screen.width,{isLoaded:!1,isVisible:function(e){var t=e.getBoundingClientRect(),n=Math.max(document.documentElement.clientHeight,window.innerHeight);return!(t.bottom<0||t.top-n>=0)&&this.isLoaded},calcHeight:function(){window.scrollTo(0,1)},resize:function(){n.Layout.calcHeight(),setTimeout(n.Layout.calcHeight.call(n.Layout),100)},setTemplate:function(){},loadStyle:function(){if(!this.isLoaded){this.isLoaded=!0,i.innerHTML=e;var t=document.createElement(\"meta\");t.name=\"viewport\",t.content=\"user-scalable=1\";var r=document.querySelectorAll(\"meta[name='viewport']\");p=r[r.length-1]||t,o=document.createElement(\"meta\"),o.name=\"viewport\",o.content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0\";var s=n.css||\"\";a=document.createElement(\"style\"),a.type=\"text/css\",a.innerHTML=s,document.head.appendChild(a),document.head.appendChild(o),this.setTemplate()}},destroy:function(e){if(this.isLoaded){this.isLoaded=!1,document.head.removeChild(o),document.body.removeChild(this.Container),document.head.removeChild(this.Style),document.head.appendChild(p);for(var t=document.querySelectorAll(\".appnext_cb\"),i=0;i<t.length;i++)document.body.removeChild(t[i]);return window.removeEventListener(\"resize\",n.Layout.resize),e}},get Container(){return i},get Style(){return a},set Style(e){a=e},getAppTemplate:function(){var e={},t=document.createElement(\"div\");t.innerHTML=r.Small_App_Template.innerHTML;var n={App_Image:\".icon img\",Title:\".title\",Rate_Number:\".rate\",Rating:\".rating\",Description:\".desc\",Click_Section:\".app_container\",Container:\".app_container\",CTA:\".cta\"};for(var i in n)!function(n,i){Object.defineProperty(e,n,{get:function(){return t.querySelector(i[n])||document.createElement(\"div\")},enumerable:!0})}(i,n);return e}});for(var s in t)!function(e){Object.defineProperty(r,e,{get:function(){return i.querySelector(t[e])||document.createElement(\"div\")},enumerable:!0})}(s);return r}(),n.redirect=n.openLink||function(e){window.open(e,\"_top\")},n.setParams=function(e){for(key in e)n[key]=decodeURIComponent(e[key])},n.parseApp=function(e,t,i){var a=n.Layout.getAppTemplate();a.App_Image.src=e.urlImg,a.Title.textContent=e.title||\"\";var o=e.desc.length>60?e.desc.slice(0,60)+\"...\":e.desc;if(a.Description.textContent=o,n.config.hasOwnProperty(t)){var p=n.config[t];a.CTA.textContent=p.cta,a.CTA.style.color=p.color}return i&&(a.CTA.textContent=\"\"),1==e.is_installed&&(a.CTA.textContent=n.config.cta_open_text||\"Open\"),a.Click_Section.addEventListener(\"click\",function(t){console.log(\"APP \"+e.title+\" \"+e.index),n.adClicked(JSON.stringify(e),e.index)}),a.App_Image.addEventListener(\"load\",function(){n.API.notifyImpression(e,this)}),function(t,i){e.imp=function(){n.API.notifyImpression(t,i)}}(e,a.App_Image),a.Container},n.parseTitle=function(e,t){var i=document.createElement(\"div\");return i.classList.add(\"title\"),i.innerText=e,n.config.hasOwnProperty(t)&&(i.style.background=n.config[t].color),i},n.setContent=function(e){n.setDisclosureIcon=!1;var i=n.action;n.Layout.More_Apps_Section.innerHTML=\"\";var a,o,p=parseInt(n.config.campaigns_amount)||6,r=0,s=0,d=[],c=[];if(r<e.length&&r<p){var l=n.config[i].title_main;a=n.parseTitle(l,i),n.Layout.More_Apps_Section.appendChild(a)}for(;r<e.length&&r<p;r++){var u=e[r];-1!=u.package_action.indexOf(i)?(u.index=s,function(e,i,a){var o=n.parseApp(e,i,!1);n.Layout.More_Apps_Section.appendChild(o),n.setDisclosureIcon||(n.setDisclosureIcon=!0,t(e,a))}(u,i,a),c.push(u),s++):d.push(u)}if(r=c.length,\"sapop\"!=i){if(r<d.length&&r<p){var l=n.config.sapop.title_main;o=n.parseTitle(l,\"sapop\"),n.Layout.More_Apps_Section.appendChild(o)}for(var g=0;g<d.length&&r<p;r++,g++){var u=d[g];u.index=s,function(e,i,a){var o=n.parseApp(e,i,!0);n.Layout.More_Apps_Section.appendChild(o),n.setDisclosureIcon||(n.setDisclosureIcon=!0,t(e,a))}(u,i,a),s++,c.push(u)}}n.Layout.More_Apps.onscroll=function(e){for(var t=0;t<c.length;t++)c[t].imp();n.isScrollEvent||(n.isScrollEvent=!0)}},n.parseAds=function(e){try{var t=n.client_call?JSON.parse(this.responseText):e;n.Layout.loadStyle(),document.body.appendChild(n.Layout.Container),n.setContent(t.apps)}catch(e){return n.error(e),!1}},n.error=n.error||function(e){console.log(e)},n.load=function(e,t,i){return console.log(\"banner\",e),console.log(\"data\",t),console.log(\"data_all\",i),n.banner=e,n.data=t,n.data_all=i,n.API.loadConfig(function(e){n.config=e,n.action=n.banner.package_action.shift(),n.API.loadAds(n.parseAds)}),!0},n}(Appnext);";
    }
}
