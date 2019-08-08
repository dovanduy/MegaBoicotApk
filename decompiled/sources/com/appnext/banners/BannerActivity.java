package com.appnext.banners;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appnext.banners.C1205g.C1215a;
import com.appnext.core.AppnextAd;
import com.appnext.core.C1317e.C1324a;
import com.appnext.core.C1326f;
import com.appnext.core.C1349q;
import com.appnext.core.result.C1370b;

public class BannerActivity extends Activity {
    BannerAd bannerAd;

    /* renamed from: bi */
    String f3759bi;

    /* renamed from: bs */
    boolean f3760bs;

    /* renamed from: fs */
    BannerAdData f3761fs;

    /* renamed from: ft */
    String f3762ft;

    /* renamed from: fu */
    String f3763fu;

    /* renamed from: fv */
    String f3764fv;

    /* renamed from: fw */
    String f3765fw;

    /* renamed from: fx */
    C1203e f3766fx;

    /* renamed from: fy */
    Banner f3767fy;
    BannerAdData selectedAd;
    C1349q userAction;

    private class Banner extends BannerView {
        public Banner(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public C1203e getBannerAdapter() {
            return BannerActivity.this.f3766fx;
        }
    }

    /* renamed from: com.appnext.banners.BannerActivity$a */
    private class C1157a extends C1205g {

        /* renamed from: com.appnext.banners.BannerActivity$a$a */
        public class C1158a extends WebViewClient {
            public C1158a() {
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
                        final String b = C1326f.m5675b(C1157a.this.context, false);
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public final void run() {
                                try {
                                    C1157a aVar = C1157a.this;
                                    StringBuilder sb = new StringBuilder("javascript:(function() { try { Appnext.setParams(");
                                    sb.append(C1157a.this.getConfigParams().put("did", b).toString());
                                    sb.append("); } catch(err){ Appnext.jsError(err.message); }})()");
                                    aVar.loadJS(sb.toString());
                                } catch (Throwable unused) {
                                }
                                C1157a aVar2 = C1157a.this;
                                StringBuilder sb2 = new StringBuilder("javascript:(function() { try { Appnext.load(");
                                sb2.append(C1157a.this.getSelectedAd().getAdJSON());
                                sb2.append(",");
                                sb2.append(BannerActivity.this.f3765fw);
                                sb2.append(",");
                                sb2.append(BannerActivity.this.f3762ft);
                                sb2.append("); } catch(err){ Appnext.jsError(err.message); }})()");
                                aVar2.loadJS(sb2.toString());
                            }
                        });
                    }
                }).start();
            }
        }

        /* renamed from: com.appnext.banners.BannerActivity$a$b */
        public class C1161b extends C1215a {
            public C1161b() {
                super();
            }

            @JavascriptInterface
            public final void adClicked(String str, int i) {
                BannerActivity.this.f3761fs = new BannerAdData((AppnextAd) C1200b.m5130aH().parseAd(str));
                C1349q qVar = BannerActivity.this.userAction;
                BannerAdData bannerAdData = BannerActivity.this.f3761fs;
                StringBuilder sb = new StringBuilder();
                sb.append(BannerActivity.this.f3761fs.getAppURL());
                sb.append("&tem_id=");
                sb.append(C1157a.this.getBannerAd().getTemId(C1157a.this.getSelectedAd()));
                sb.append("1");
                qVar.mo6291a(bannerAdData, sb.toString(), C1157a.this.getPlacementId(), new C1324a() {
                    public final void error(String str) {
                    }

                    public final void onMarket(String str) {
                        if (BannerActivity.this.f3760bs) {
                            BannerActivity.this.finish();
                        }
                    }
                });
            }

            @JavascriptInterface
            public final void impression(String str) {
                BannerActivity.this.userAction.mo6295e((AppnextAd) C1200b.m5130aH().parseAd(str));
            }

            @JavascriptInterface
            public final void postView(String str) {
                BannerAdData bannerAdData = new BannerAdData((AppnextAd) C1200b.m5130aH().parseAd(str));
                C1349q qVar = BannerActivity.this.userAction;
                StringBuilder sb = new StringBuilder();
                sb.append(bannerAdData.getAppURL());
                sb.append("&tem_id=");
                sb.append(C1157a.this.getBannerAd().getTemId(C1157a.this.getSelectedAd()));
                sb.append("1");
                qVar.mo6290a(bannerAdData, sb.toString(), null);
            }

            @JavascriptInterface
            public final void openLink(String str) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.addFlags(268435456);
                BannerActivity.this.startActivity(intent);
            }
        }

        /* access modifiers changed from: protected */
        public final String getJSurl() {
            return "http://cdn.appnext.com/tools/sdk/banner/2.4.3/result.min.js";
        }

        private C1157a() {
        }

        /* access modifiers changed from: protected */
        public final String getFallbackScript() {
            new C1370b();
            return "var Appnext=function(e){var t=e;return t.css='html,body{font-family:sans-serif;-ms-text-size-adjust:100%;-webkit-text-size-adjust:100%;-moz-text-size-adjust:100%;height:100% !important;width:100% !important;padding:0 !important;margin:0 !important;overflow:hidden !important;font-size:85%;max-width:100%;min-width:100%;-moz-user-select:none;-webkit-user-select:none;user-select:none;position:fixed;text-align:left !important;line-height:normal}html>img,body>img{position:absolute;z-index:-1}.md-scroll-mask{position:initial}#appnext{direction:ltr !important;-webkit-font-smoothing:antialiased;overflow:hidden;width:100%;height:100%;font-family:sans-serif !important;position:absolute;top:0;left:0;margin:0;padding:0;-moz-transform:scale(1.01, 1.01);text-align:left !important}#appnext .center{position:absolute;top:50%;transform:translateY(-50%);-webkit-transform:translateY(-50%)}#appnext i{display:inline-block;font-style:normal}#appnext div{direction:ltr !important;text-align:left}#appnext .caption{background:transparent;margin:0;padding:0}#appnext .disclosure{-webkit-tap-highlight-color:none;color:#BDBDBD;z-index:10000;display:block;width:1.8em;height:1.8em;right:0;top:6px;position:absolute;background-repeat:no-repeat;background-size:71%;background-position:center;background-image:url(\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyhpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMTExIDc5LjE1ODMyNSwgMjAxNS8wOS8xMC0wMToxMDoyMCAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIDIwMTUgKE1hY2ludG9zaCkiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6RTJDQzA2RjkyOTYwMTFFNkE1MDVDRkVBNzkwQ0Q1ODkiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6RTJDQzA2RkEyOTYwMTFFNkE1MDVDRkVBNzkwQ0Q1ODkiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDpFMkNDMDZGNzI5NjAxMUU2QTUwNUNGRUE3OTBDRDU4OSIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDpFMkNDMDZGODI5NjAxMUU2QTUwNUNGRUE3OTBDRDU4OSIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PlU7OdUAAAKvSURBVHjaxJfPS1RRFMfnORUtxiAwWkiGqUVgqzLol+TQL/pBbdIpitzUUtpE1h/Q1C5cZwiBKbiJfgz9YAKLishVLqK0yNoVCOmmwHl9L30G3rzezLtv9DEHPt7Befd7ztxz73nnOq7rJmppy8yffD5fE+fpdPpfAJbmiD3iiNglWsVqvpsVU+KVeCBeCNd6BUKsTvSKKzgNsrVgArtEMFkxJAph4pWsWbwRgzifETfEQbFOrBT1YrM4xHdfeHaQuc3VBrBXvBUdOD4tNoh+8UR8F7/FvPggHvNdG8/OMNdodEYN4ACCDeR0i7grFixStsCz7cw1Gk9ZNasANokxsUIMiOPiVxWbfI65A2iNoV0xgKS4Q15HxcWwTRRiBTSMVgrtZKUAzpG3b+K8xVHaKi57jmOQuWgV90RvuQAcjlqCzTRn8QtNbq+LCxbp8Go7QQF0cny+smQ29jlCOkbRbvWeCm8AhxlHLHe7sf1iG+ff5nSM+HyVBLCT8XmEX3VS7KM+2FhRe0dQKW5jnKwigAnLdBS1NwatQHEn/4zxBfjD5yv0XRC7eQOYZWyI0d8an6+SAD4xtscYQFH7Y1AArxm7Ygygy+erJICHjBl/vV7CdGf4/CgogHE6mfWiJ4YAMmhP0bL9F4BLXU/QTqUsK6Gp689CnkuhmcBHodwxND3cO9EkbnlfGoswB60mCtZQpdexqddnabNMGm4uslbUodGD5hn/eyZI3PR33eKP6BP3xKoqnNcztw+tbrStesKcOEHUR8V7ccpyNZI8O8ncebRyUbviHB3MBPkbpuXO0rQ2iuXQyP+yFLRhT847yjm3uZiYJdtOG3VVtNDR9IfMmxbXbC4mNjcjI3Absd3iGL1Di+9qNs3V7L54advMRrkbFihW40tZnZxaX8//CjAAq56aKzL+/C8AAAAASUVORK5CYII=\")}#appnext .disclosure.gdpr{top:0;background-size:50%;background-position:top right;background-image:url(\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACcAAAAnCAMAAAC7faEHAAAAZlBMVEXNzMwArs1WusyTw8xEuM0Ir83Jy8zFy8y2yMxhvMwWsc2kxsx1v8wttM0dss0QsM2/ysyoxsyaxMyNwsyfxcyHwcyAwMxrvcxLucw3tsw+t80ytc0ks826ycyxx8yux8xovcxPucxOwgPRAAAA+0lEQVQ4y83Tx27DMBAE0CUpdvXuEpf//8lIngS+sOhmz4kQHiAsOUufje7UEXZvWD0ccJZtuYxZx9krxT3vEP6TdYhcdMYtJ0g3q6QTJK6QV5F2pGYHeeqSjkgvEnI1SUfUckBp24TTthC3ArIpVcThYQyNFWQ9xdy6HfYZhhqyGsOul+z8+psqG8izCTkyvSKktRjdtQHXOVb8Q/KAQ8A9t4PHN/0Akybg9ivpac/k/ibxlHC+gnITUdyZ9V2yuBMPCfZEaWMOCp2JOwTrl3GoQNahUlE382qmct/OW3bfvCr5eGAvh2N7ftEZZ9FeRZl4iavIxghNX5lfdnkJssV7DcsAAAAASUVORK5CYII=\")}#appnext .wrp{position:relative;height:100%;width:100%;margin:0;padding:0}#appnext .wrp .header{height:74px;background-size:cover;background-repeat:no-repeat;position:relative}#appnext .wrp .container{width:100%;top:0;left:0;margin:0;padding:0;height:100%}#appnext .wrp .container nav{position:relative;margin-top:16px;width:93%;height:30px;margin-left:4%;margin-bottom:2px}#appnext .wrp .container nav ul.tabs{width:100%;list-style:none;padding:0;margin:0;text-transform:uppercase;font-size:1.2em;font-style:italic;position:absolute;top:0;z-index:10}#appnext .wrp .container nav ul.tabs li{display:inline-block;margin:0;padding:0;padding-bottom:1%;margin-right:5%;color:#6f6f6f;position:relative;max-width:40%;white-space:nowrap;overflow:hidden;text-overflow:ellipsis}#appnext .wrp .container nav ul.tabs li.active{font-weight:bold}#appnext .wrp .container nav ul.tabs li.active span{display:block;width:100%;height:6px;background:#3499e7;position:absolute;bottom:-6px}#appnext .wrp .container nav .sep{background:#cecece;height:2px;position:absolute;bottom:6px;width:100%;z-index:1}#appnext .wrp .container .more_apps{width:100%;overflow:hidden;overflow-y:auto;height:100%}#appnext .wrp .container .more_apps .suggested_apps{height:100%;width:100%;margin:0 auto}#appnext .wrp .container .more_apps .suggested_apps>div.title{padding:2.5% 6%;background-color:rgba(76,93,128,0.8);letter-spacing:0.2px;color:#ffffff;font-size:1.3em;position:relative}#appnext .wrp .container .more_apps .suggested_apps>div.title:first-child{padding:3.5% 6%;font-size:1.5em;background-color:#4c5d80}#appnext .wrp .container .more_apps .suggested_apps>div.app_container{background:white;padding:3% 0;box-shadow:0 -3px 7px -1px rgba(0,0,0,0.1);position:relative;height:104px;display:table-row}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div{display:table-cell;vertical-align:middle}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.icon{width:25%;text-align:center;background:none}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.icon img{width:55%;height:auto;vertical-align:middle}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.caption{width:51%;font-size:12px;color:rgba(74,74,74,0.79);font-weight:300}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.caption .title{text-align:left;margin:0;padding:0;font-size:14px;font-weight:bold;line-height:1.5em}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.caption .dec{width:90%}#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.cta{padding-bottom:9px;padding-right:9px;vertical-align:bottom;width:auto;text-transform:uppercase;text-align:center;font-size:12px;color:rgba(76,93,128,0.8)}@media only screen and (orientation: landscape){#appnext .wrp .container .more_apps .suggested_apps>div.app_container>div.icon{width:13%}}template{display:none} ',t.build=\"1534333058941\",t.template='<div class=\"wrp\">   <div class=\"disclosure \"></div>    <div class=\"container\">              <div class=\"more_apps\">            <div class=\"suggested_apps\"></div>        </div>    </div>    \\x3c!--div class=\"close_button\"></div--\\x3e       <template id=\"app_template\">        <div class=\"app_container\">            <div class=\"icon\">              <img/>            </div>           <div class=\"caption\">              <div class=\"title\"></div>                          <div class=\"desc\"></div>           </div>          <div class=\"cta\">            Install          </div>       </div>    </template>    </div>',t.vid=t.vid||\"1\",t.tid=t.tid||\"301\",t.osid=t.osid||\"100\",t.ads_type=\"interstitial_tag\",t}(Appnext||{}),Appnext=function(e){function t(e,t){n.Layout.Disclosure.addEventListener(\"click\",function(t){t.stopPropagation();var i=e.country||\"\",a=e.zId,o=\"https://www.appnext.com/privacy_policy/index.html?z=\"+a+\"&geo=\"+i;1==e.gdpr&&(o+=\"&edda=1\"),n.redirect(o)},!1),1==e.gdpr&&n.Layout.Disclosure.classList.add(\"gdpr\"),t.appendChild(n.Layout.Disclosure)}var n=e;return n.id=n.android_id||n.id,n.timstamp=Date.now(),n.API=function(){function e(e,t,n){var i=new XMLHttpRequest;i.open(n,e,!0),i.onload=t;var a=new FormData;i.send(a)}function t(e,t,n,i){window.callback=function(e){return e||!0}(t);var a=document.createElement(\"script\");e+=~e.indexOf(\"?\")?\"&\":\"?\",a.src=e,a.className=\"appnext_cb\",a.type=void 0!==i&&i?i:\"text/javascript\",a.async=!0;try{document.body?document.body.appendChild(a):document.head.appendChild(a)}catch(e){return!!n&&n(e)}}var i={data:\"./data.json\",log:\"https://admin.appnext.com/tp12.aspx\",config:\"https://cdn.appnext.com/tools/sdk/config/2.4.0/result_banner/\"};return{buildUrl:function(e,t){var n=[];for(var i in t)n.push(encodeURIComponent(i)+\"=\"+encodeURIComponent(t[i]));return e+\"?\"+n.join(\"&\")},loadAds:function(t){if(n.client_call){var a=i.data;return void e(a,t,\"GET\")}t(n.data)},loadConfig:function(e){var a=\"en\";switch(n.lang){case\"zh\":a=\"zh\";break;case\"ru\":a=\"ru\";break;case\"de\":a=\"de\"}t(i.config+a+\"/result_config.json\",e,n.error,null)},log:function(e,a,o){if(e==n.API.TP12.Play||e==n.API.TP12.Ended){var p={tid:n.tid,vid:n.vid,osid:n.osid,auid:n.auid,pid:n.id,bid:o?o.bannerId:0,cid:o?o.campaignId:0,session_id:a?encodeURIComponent(a):null,ref:encodeURIComponent(e),ads_type:n.ads_type},r=i.log;t(this.buildUrl(r,p),function(e){return e},null,null)}},getRequest:function(e){t(e,null,null,null)},notifyImpression:function(e,t,i){if(!e.isImp){e.isImp=!0;(function(e,t,i){return function(){if(n.Layout.isVisible(t)){var a=JSON.stringify(e);n.postView(a),i&&i()}else e.isImp=!1}})(e,t,i)()}},getStyleUrl:function(){return i.css},TP12:{},Error:{NoAds:\"NO_ADS\",Other:\"NO_ADS\"}}}(),n.Layout=function(){var e=n.template,t={Close_Button:\".close_button\",More_Apps:\".more_apps\",More_Apps_Section:\".suggested_apps\",Small_App_Template:\"#app_template\",Footer:\".footer\",Header:\".header\",Disclosure:\".disclosure\"},i=document.createElement(\"div\");i.id=\"appnext\",i.className=\"appnext\";var a,o,p,r=(screen.width<screen.height?screen.height:screen.width,{isLoaded:!1,isVisible:function(e){var t=e.getBoundingClientRect(),n=Math.max(document.documentElement.clientHeight,window.innerHeight);return!(t.bottom<0||t.top-n>=0)&&this.isLoaded},calcHeight:function(){window.scrollTo(0,1)},resize:function(){n.Layout.calcHeight(),setTimeout(n.Layout.calcHeight.call(n.Layout),100)},setTemplate:function(){},loadStyle:function(){if(!this.isLoaded){this.isLoaded=!0,i.innerHTML=e;var t=document.createElement(\"meta\");t.name=\"viewport\",t.content=\"user-scalable=1\";var r=document.querySelectorAll(\"meta[name='viewport']\");p=r[r.length-1]||t,o=document.createElement(\"meta\"),o.name=\"viewport\",o.content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0\";var s=n.css||\"\";a=document.createElement(\"style\"),a.type=\"text/css\",a.innerHTML=s,document.head.appendChild(a),document.head.appendChild(o),this.setTemplate()}},destroy:function(e){if(this.isLoaded){this.isLoaded=!1,document.head.removeChild(o),document.body.removeChild(this.Container),document.head.removeChild(this.Style),document.head.appendChild(p);for(var t=document.querySelectorAll(\".appnext_cb\"),i=0;i<t.length;i++)document.body.removeChild(t[i]);return window.removeEventListener(\"resize\",n.Layout.resize),e}},get Container(){return i},get Style(){return a},set Style(e){a=e},getAppTemplate:function(){var e={},t=document.createElement(\"div\");t.innerHTML=r.Small_App_Template.innerHTML;var n={App_Image:\".icon img\",Title:\".title\",Rate_Number:\".rate\",Rating:\".rating\",Description:\".desc\",Click_Section:\".app_container\",Container:\".app_container\",CTA:\".cta\"};for(var i in n)!function(n,i){Object.defineProperty(e,n,{get:function(){return t.querySelector(i[n])||document.createElement(\"div\")},enumerable:!0})}(i,n);return e}});for(var s in t)!function(e){Object.defineProperty(r,e,{get:function(){return i.querySelector(t[e])||document.createElement(\"div\")},enumerable:!0})}(s);return r}(),n.redirect=n.openLink||function(e){window.open(e,\"_top\")},n.setParams=function(e){for(key in e)n[key]=decodeURIComponent(e[key])},n.parseApp=function(e,t,i){var a=n.Layout.getAppTemplate();a.App_Image.src=e.urlImg,a.Title.textContent=e.title||\"\";var o=e.desc.length>60?e.desc.slice(0,60)+\"...\":e.desc;if(a.Description.textContent=o,n.config.hasOwnProperty(t)){var p=n.config[t];a.CTA.textContent=p.cta,a.CTA.style.color=p.color}return i&&(a.CTA.textContent=\"\"),1==e.is_installed&&(a.CTA.textContent=n.config.cta_open_text||\"Open\"),a.Click_Section.addEventListener(\"click\",function(t){console.log(\"APP \"+e.title+\" \"+e.index),n.adClicked(JSON.stringify(e),e.index)}),a.App_Image.addEventListener(\"load\",function(){n.API.notifyImpression(e,this)}),function(t,i){e.imp=function(){n.API.notifyImpression(t,i)}}(e,a.App_Image),a.Container},n.parseTitle=function(e,t){var i=document.createElement(\"div\");return i.classList.add(\"title\"),i.innerText=e,n.config.hasOwnProperty(t)&&(i.style.background=n.config[t].color),i},n.setContent=function(e){n.setDisclosureIcon=!1;var i=n.action;n.Layout.More_Apps_Section.innerHTML=\"\";var a,o,p=parseInt(n.config.campaigns_amount)||6,r=0,s=0,d=[],c=[];if(r<e.length&&r<p){var l=n.config[i].title_main;a=n.parseTitle(l,i),n.Layout.More_Apps_Section.appendChild(a)}for(;r<e.length&&r<p;r++){var u=e[r];-1!=u.package_action.indexOf(i)?(u.index=s,function(e,i,a){var o=n.parseApp(e,i,!1);n.Layout.More_Apps_Section.appendChild(o),n.setDisclosureIcon||(n.setDisclosureIcon=!0,t(e,a))}(u,i,a),c.push(u),s++):d.push(u)}if(r=c.length,\"sapop\"!=i){if(r<d.length&&r<p){var l=n.config.sapop.title_main;o=n.parseTitle(l,\"sapop\"),n.Layout.More_Apps_Section.appendChild(o)}for(var g=0;g<d.length&&r<p;r++,g++){var u=d[g];u.index=s,function(e,i,a){var o=n.parseApp(e,i,!0);n.Layout.More_Apps_Section.appendChild(o),n.setDisclosureIcon||(n.setDisclosureIcon=!0,t(e,a))}(u,i,a),s++,c.push(u)}}n.Layout.More_Apps.onscroll=function(e){for(var t=0;t<c.length;t++)c[t].imp();n.isScrollEvent||(n.isScrollEvent=!0)}},n.parseAds=function(e){try{var t=n.client_call?JSON.parse(this.responseText):e;n.Layout.loadStyle(),document.body.appendChild(n.Layout.Container),n.setContent(t.apps)}catch(e){return n.error(e),!1}},n.error=n.error||function(e){console.log(e)},n.load=function(e,t,i){return console.log(\"banner\",e),console.log(\"data\",t),console.log(\"data_all\",i),n.banner=e,n.data=t,n.data_all=i,n.API.loadConfig(function(e){n.config=e,n.action=n.banner.package_action.shift(),n.API.loadAds(n.parseAds)}),!0},n}(Appnext);";
        }

        /* access modifiers changed from: protected */
        public final int getLayout() {
            return C1166R.layout.apnxt_full_screen;
        }

        /* access modifiers changed from: protected */
        public final BannerAd getBannerAd() {
            return BannerActivity.this.bannerAd;
        }

        /* access modifiers changed from: protected */
        public final BannerAdData getSelectedAd() {
            return BannerActivity.this.selectedAd;
        }

        public final void loadAd(BannerAdRequest bannerAdRequest) {
            inflateView(0, null);
        }

        /* access modifiers changed from: protected */
        public final BannerAdRequest getAdRequest() {
            return new BannerAdRequest();
        }

        /* access modifiers changed from: protected */
        public final C1215a getWebInterface() {
            return new C1161b();
        }

        /* access modifiers changed from: protected */
        public final WebViewClient getWebViewClient() {
            return new C1158a();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x016c, code lost:
        if (r2.equals("LARGE_BANNER") != false) goto L_0x0170;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0089 A[Catch:{ Throwable -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d A[Catch:{ Throwable -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0093 A[Catch:{ Throwable -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0099 A[Catch:{ Throwable -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f7 A[Catch:{ Throwable -> 0x01aa }, LOOP:0: B:23:0x00f1->B:25:0x00f7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r0 = 1
            r13.requestWindowFeature(r0)
            android.view.Window r1 = r13.getWindow()
            r2 = 1024(0x400, float:1.435E-42)
            r1.setFlags(r2, r2)
            super.onCreate(r14)
            com.appnext.banners.BannerActivity$a r14 = new com.appnext.banners.BannerActivity$a
            r1 = 0
            r14.<init>()
            r13.f3766fx = r14
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            r14.<init>(r13)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r14.setLayoutParams(r2)
            r13.setContentView(r14)
            com.appnext.core.q r2 = new com.appnext.core.q
            com.appnext.banners.BannerActivity$1 r4 = new com.appnext.banners.BannerActivity$1
            r4.<init>()
            r2.<init>(r13, r4)
            r13.userAction = r2
            android.content.Intent r2 = r13.getIntent()     // Catch:{ Throwable -> 0x01aa }
            android.os.Bundle r2 = r2.getExtras()     // Catch:{ Throwable -> 0x01aa }
            java.lang.String r4 = "placement"
            java.lang.String r4 = r2.getString(r4)     // Catch:{ Throwable -> 0x01aa }
            r13.f3759bi = r4     // Catch:{ Throwable -> 0x01aa }
            java.lang.String r4 = "size"
            java.lang.String r4 = r2.getString(r4)     // Catch:{ Throwable -> 0x01aa }
            r13.f3764fv = r4     // Catch:{ Throwable -> 0x01aa }
            java.lang.String r4 = r13.f3759bi     // Catch:{ Throwable -> 0x01aa }
            java.lang.String r5 = r13.f3764fv     // Catch:{ Throwable -> 0x01aa }
            int r6 = r5.hashCode()     // Catch:{ Throwable -> 0x01aa }
            r7 = 2
            r8 = 1951953708(0x7458732c, float:6.859571E31)
            r9 = -96588539(0xfffffffffa3e2d05, float:-2.4686238E35)
            r10 = -1966536496(0xffffffff8ac908d0, float:-1.9358911E-32)
            r11 = 0
            if (r6 == r10) goto L_0x007b
            if (r6 == r9) goto L_0x0071
            if (r6 == r8) goto L_0x0067
            goto L_0x0085
        L_0x0067:
            java.lang.String r6 = "BANNER"
            boolean r6 = r5.equals(r6)     // Catch:{ Throwable -> 0x01aa }
            if (r6 == 0) goto L_0x0085
            r6 = r11
            goto L_0x0086
        L_0x0071:
            java.lang.String r6 = "MEDIUM_RECTANGLE"
            boolean r6 = r5.equals(r6)     // Catch:{ Throwable -> 0x01aa }
            if (r6 == 0) goto L_0x0085
            r6 = r7
            goto L_0x0086
        L_0x007b:
            java.lang.String r6 = "LARGE_BANNER"
            boolean r6 = r5.equals(r6)     // Catch:{ Throwable -> 0x01aa }
            if (r6 == 0) goto L_0x0085
            r6 = r0
            goto L_0x0086
        L_0x0085:
            r6 = r3
        L_0x0086:
            switch(r6) {
                case 0: goto L_0x0099;
                case 1: goto L_0x0093;
                case 2: goto L_0x008d;
                default: goto L_0x0089;
            }     // Catch:{ Throwable -> 0x01aa }
        L_0x0089:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x01aa }
            goto L_0x0198
        L_0x008d:
            com.appnext.banners.MediumRectangleAd r5 = new com.appnext.banners.MediumRectangleAd     // Catch:{ Throwable -> 0x01aa }
            r5.<init>(r13, r4)     // Catch:{ Throwable -> 0x01aa }
            goto L_0x009e
        L_0x0093:
            com.appnext.banners.LargeBannerAd r5 = new com.appnext.banners.LargeBannerAd     // Catch:{ Throwable -> 0x01aa }
            r5.<init>(r13, r4)     // Catch:{ Throwable -> 0x01aa }
            goto L_0x009e
        L_0x0099:
            com.appnext.banners.SmallBannerAd r5 = new com.appnext.banners.SmallBannerAd     // Catch:{ Throwable -> 0x01aa }
            r5.<init>(r13, r4)     // Catch:{ Throwable -> 0x01aa }
        L_0x009e:
            com.appnext.banners.BannerAd r5 = (com.appnext.banners.BannerAd) r5     // Catch:{ Throwable -> 0x01aa }
            r13.bannerAd = r5     // Catch:{ Throwable -> 0x01aa }
            com.appnext.banners.BannerAd r4 = r13.bannerAd     // Catch:{ Throwable -> 0x01aa }
            java.lang.String r5 = "postback"
            java.lang.String r5 = r2.getString(r5)     // Catch:{ Throwable -> 0x01aa }
            r4.setPostback(r5)     // Catch:{ Throwable -> 0x01aa }
            com.appnext.banners.BannerAd r4 = r13.bannerAd     // Catch:{ Throwable -> 0x01aa }
            java.lang.String r5 = "category"
            java.lang.String r5 = r2.getString(r5)     // Catch:{ Throwable -> 0x01aa }
            r4.setCategories(r5)     // Catch:{ Throwable -> 0x01aa }
            java.lang.String r4 = "clicked"
            java.lang.String r4 = r2.getString(r4)     // Catch:{ Throwable -> 0x01aa }
            r13.f3763fu = r4     // Catch:{ Throwable -> 0x01aa }
            java.lang.String r4 = "shouldClose"
            boolean r4 = r2.getBoolean(r4, r11)     // Catch:{ Throwable -> 0x01aa }
            r13.f3760bs = r4     // Catch:{ Throwable -> 0x01aa }
            java.lang.String r4 = "selected"
            java.io.Serializable r2 = r2.getSerializable(r4)     // Catch:{ Throwable -> 0x01aa }
            com.appnext.banners.BannerAdData r2 = (com.appnext.banners.BannerAdData) r2     // Catch:{ Throwable -> 0x01aa }
            r13.selectedAd = r2     // Catch:{ Throwable -> 0x01aa }
            com.appnext.banners.b r2 = com.appnext.banners.C1200b.m5130aH()     // Catch:{ Throwable -> 0x01aa }
            com.appnext.banners.BannerAd r4 = r13.bannerAd     // Catch:{ Throwable -> 0x01aa }
            java.lang.String r2 = r2.mo6231l(r4)     // Catch:{ Throwable -> 0x01aa }
            r13.f3762ft = r2     // Catch:{ Throwable -> 0x01aa }
            com.appnext.banners.b r2 = com.appnext.banners.C1200b.m5130aH()     // Catch:{ Throwable -> 0x01aa }
            com.appnext.banners.BannerAd r4 = r13.bannerAd     // Catch:{ Throwable -> 0x01aa }
            java.util.ArrayList r2 = r2.mo5852f(r4)     // Catch:{ Throwable -> 0x01aa }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Throwable -> 0x01aa }
            r4.<init>()     // Catch:{ Throwable -> 0x01aa }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Throwable -> 0x01aa }
        L_0x00f1:
            boolean r5 = r2.hasNext()     // Catch:{ Throwable -> 0x01aa }
            if (r5 == 0) goto L_0x010f
            java.lang.Object r5 = r2.next()     // Catch:{ Throwable -> 0x01aa }
            com.appnext.core.AppnextAd r5 = (com.appnext.core.AppnextAd) r5     // Catch:{ Throwable -> 0x01aa }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x01aa }
            com.appnext.banners.BannerAdData r12 = new com.appnext.banners.BannerAdData     // Catch:{ Throwable -> 0x01aa }
            r12.<init>(r5)     // Catch:{ Throwable -> 0x01aa }
            java.lang.String r5 = r12.getAdJSON()     // Catch:{ Throwable -> 0x01aa }
            r6.<init>(r5)     // Catch:{ Throwable -> 0x01aa }
            r4.put(r6)     // Catch:{ Throwable -> 0x01aa }
            goto L_0x00f1
        L_0x010f:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x01aa }
            r2.<init>()     // Catch:{ Throwable -> 0x01aa }
            java.lang.String r5 = "apps"
            org.json.JSONObject r2 = r2.put(r5, r4)     // Catch:{ Throwable -> 0x01aa }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x01aa }
            r13.f3765fw = r2     // Catch:{ Throwable -> 0x01aa }
            com.appnext.banners.BannerActivity$Banner r2 = new com.appnext.banners.BannerActivity$Banner
            r2.<init>(r13)
            r13.f3767fy = r2
            com.appnext.banners.BannerActivity$Banner r2 = r13.f3767fy
            r14.addView(r2)
            com.appnext.banners.BannerActivity$Banner r14 = r13.f3767fy
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            r14.height = r3
            com.appnext.banners.BannerActivity$Banner r14 = r13.f3767fy
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            r14.width = r3
            com.appnext.banners.BannerActivity$Banner r14 = r13.f3767fy
            java.lang.String r2 = r13.f3759bi
            r14.setPlacementId(r2)
            com.appnext.banners.BannerActivity$Banner r14 = r13.f3767fy
            java.lang.String r2 = r13.f3764fv
            int r4 = r2.hashCode()
            if (r4 == r10) goto L_0x0166
            if (r4 == r9) goto L_0x015c
            if (r4 == r8) goto L_0x0152
            goto L_0x016f
        L_0x0152:
            java.lang.String r0 = "BANNER"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x016f
            r0 = r11
            goto L_0x0170
        L_0x015c:
            java.lang.String r0 = "MEDIUM_RECTANGLE"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x016f
            r0 = r7
            goto L_0x0170
        L_0x0166:
            java.lang.String r4 = "LARGE_BANNER"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x016f
            goto L_0x0170
        L_0x016f:
            r0 = r3
        L_0x0170:
            switch(r0) {
                case 0: goto L_0x018d;
                case 1: goto L_0x018a;
                case 2: goto L_0x0187;
                default: goto L_0x0173;
            }
        L_0x0173:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Wrong banner size "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L_0x0187:
            com.appnext.banners.BannerSize r0 = com.appnext.banners.BannerSize.MEDIUM_RECTANGLE
            goto L_0x018f
        L_0x018a:
            com.appnext.banners.BannerSize r0 = com.appnext.banners.BannerSize.LARGE_BANNER
            goto L_0x018f
        L_0x018d:
            com.appnext.banners.BannerSize r0 = com.appnext.banners.BannerSize.BANNER
        L_0x018f:
            r14.setBannerSize(r0)
            com.appnext.banners.BannerActivity$Banner r14 = r13.f3767fy
            r14.loadAd(r1)
            return
        L_0x0198:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01aa }
            java.lang.String r1 = "Wrong banner size "
            r0.<init>(r1)     // Catch:{ Throwable -> 0x01aa }
            r0.append(r5)     // Catch:{ Throwable -> 0x01aa }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x01aa }
            r14.<init>(r0)     // Catch:{ Throwable -> 0x01aa }
            throw r14     // Catch:{ Throwable -> 0x01aa }
        L_0x01aa:
            r13.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.BannerActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|7) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0008 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r1 = this;
            super.onDestroy()
            com.appnext.core.q r0 = r1.userAction     // Catch:{ Throwable -> 0x0008 }
            r0.destroy()     // Catch:{ Throwable -> 0x0008 }
        L_0x0008:
            com.appnext.banners.BannerAd r0 = r1.bannerAd     // Catch:{ Throwable -> 0x000d }
            r0.destroy()     // Catch:{ Throwable -> 0x000d }
        L_0x000d:
            com.appnext.banners.BannerActivity$Banner r0 = r1.f3767fy     // Catch:{ Throwable -> 0x0013 }
            r0.destroy()     // Catch:{ Throwable -> 0x0013 }
            return
        L_0x0013:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.BannerActivity.onDestroy():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.appnext.banners.BannerSize m5117W(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = -1966536496(0xffffffff8ac908d0, float:-1.9358911E-32)
            if (r0 == r1) goto L_0x0028
            r1 = -96588539(0xfffffffffa3e2d05, float:-2.4686238E35)
            if (r0 == r1) goto L_0x001e
            r1 = 1951953708(0x7458732c, float:6.859571E31)
            if (r0 == r1) goto L_0x0014
            goto L_0x0032
        L_0x0014:
            java.lang.String r0 = "BANNER"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0032
            r0 = 0
            goto L_0x0033
        L_0x001e:
            java.lang.String r0 = "MEDIUM_RECTANGLE"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0032
            r0 = 2
            goto L_0x0033
        L_0x0028:
            java.lang.String r0 = "LARGE_BANNER"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = -1
        L_0x0033:
            switch(r0) {
                case 0: goto L_0x0050;
                case 1: goto L_0x004d;
                case 2: goto L_0x004a;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrong banner size "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x004a:
            com.appnext.banners.BannerSize r3 = com.appnext.banners.BannerSize.MEDIUM_RECTANGLE
            return r3
        L_0x004d:
            com.appnext.banners.BannerSize r3 = com.appnext.banners.BannerSize.LARGE_BANNER
            return r3
        L_0x0050:
            com.appnext.banners.BannerSize r3 = com.appnext.banners.BannerSize.BANNER
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.BannerActivity.m5117W(java.lang.String):com.appnext.banners.BannerSize");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.appnext.core.C1286Ad mo5727d(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            int r0 = r4.hashCode()
            r1 = -1966536496(0xffffffff8ac908d0, float:-1.9358911E-32)
            if (r0 == r1) goto L_0x0028
            r1 = -96588539(0xfffffffffa3e2d05, float:-2.4686238E35)
            if (r0 == r1) goto L_0x001e
            r1 = 1951953708(0x7458732c, float:6.859571E31)
            if (r0 == r1) goto L_0x0014
            goto L_0x0032
        L_0x0014:
            java.lang.String r0 = "BANNER"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0032
            r0 = 0
            goto L_0x0033
        L_0x001e:
            java.lang.String r0 = "MEDIUM_RECTANGLE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0032
            r0 = 2
            goto L_0x0033
        L_0x0028:
            java.lang.String r0 = "LARGE_BANNER"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = -1
        L_0x0033:
            switch(r0) {
                case 0: goto L_0x0056;
                case 1: goto L_0x0050;
                case 2: goto L_0x004a;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Wrong banner size "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L_0x004a:
            com.appnext.banners.MediumRectangleAd r4 = new com.appnext.banners.MediumRectangleAd
            r4.<init>(r2, r3)
            return r4
        L_0x0050:
            com.appnext.banners.LargeBannerAd r4 = new com.appnext.banners.LargeBannerAd
            r4.<init>(r2, r3)
            return r4
        L_0x0056:
            com.appnext.banners.SmallBannerAd r4 = new com.appnext.banners.SmallBannerAd
            r4.<init>(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.BannerActivity.mo5727d(java.lang.String, java.lang.String):com.appnext.core.Ad");
    }
}
