package mega.boicot;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p017v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebSettings;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.appnext.base.p046b.C1245d;
import com.facebook.ads.AudienceNetworkActivity;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.source.hls.DefaultHlsExtractorFactory;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class t_rssdetalle_fr extends Fragment {

    /* renamed from: a */
    config f20689a;

    /* renamed from: ag */
    LinearLayout f20690ag;

    /* renamed from: ah */
    CustomViewCallback f20691ah;

    /* renamed from: ai */
    View f20692ai;

    /* renamed from: aj */
    WebChromeClient f20693aj;

    /* renamed from: b */
    boolean f20694b = false;

    /* renamed from: c */
    boolean f20695c = false;

    /* renamed from: d */
    boolean f20696d = true;

    /* renamed from: e */
    boolean f20697e = true;

    /* renamed from: f */
    WebView f20698f;

    /* renamed from: g */
    View f20699g;

    /* renamed from: h */
    Bundle f20700h;

    /* renamed from: i */
    FrameLayout f20701i;

    /* renamed from: a */
    public View mo555a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f20689a = (config) mo626m().getApplicationContext();
        if (this.f20689a.f17881aN == null) {
            this.f20689a.mo20780b();
        }
        boolean z = false;
        this.f20699g = layoutInflater.inflate(R.layout.rssdetalle, viewGroup, false);
        this.f20700h = mo626m().getIntent().getExtras();
        if (this.f20689a.f17971bz[this.f20689a.f18075l].f18329v == 1) {
            z = true;
        }
        this.f20695c = z;
        this.f20698f = (WebView) this.f20699g.findViewById(R.id.webview);
        WebView webView = this.f20698f;
        C62121 r4 = new WebChromeClient() {
            public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
                jsResult.confirm();
                return true;
            }

            @TargetApi(11)
            public void onShowCustomView(View view, CustomViewCallback customViewCallback) {
                t_rssdetalle_fr.this.f20691ah = customViewCallback;
                t_rssdetalle_fr.this.f20701i.addView(view);
                t_rssdetalle_fr.this.f20692ai = view;
                t_rssdetalle_fr.this.f20690ag.setVisibility(8);
                t_rssdetalle_fr.this.f20701i.setVisibility(0);
                if (VERSION.SDK_INT < 16) {
                    t_rssdetalle_fr.this.mo626m().getWindow().setFlags(C1245d.f3947iP, C1245d.f3947iP);
                } else {
                    t_rssdetalle_fr.this.mo626m().getWindow().getDecorView().setSystemUiVisibility(4);
                }
            }

            @TargetApi(11)
            public void onHideCustomView() {
                if (t_rssdetalle_fr.this.mo626m() != null) {
                    if (VERSION.SDK_INT < 16) {
                        t_rssdetalle_fr.this.mo626m().getWindow().clearFlags(C1245d.f3947iP);
                    } else {
                        t_rssdetalle_fr.this.mo626m().getWindow().getDecorView().setSystemUiVisibility(0);
                    }
                    if (t_rssdetalle_fr.this.f20692ai != null) {
                        t_rssdetalle_fr.this.f20692ai.setVisibility(8);
                        t_rssdetalle_fr.this.f20701i.removeView(t_rssdetalle_fr.this.f20692ai);
                        t_rssdetalle_fr.this.f20692ai = null;
                        t_rssdetalle_fr.this.f20701i.setVisibility(8);
                        t_rssdetalle_fr.this.f20691ah.onCustomViewHidden();
                        t_rssdetalle_fr.this.f20690ag.setVisibility(0);
                    }
                }
            }

            public void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
                callback.invoke(str, true, false);
            }
        };
        this.f20693aj = r4;
        webView.setWebChromeClient(r4);
        m24772c();
        this.f20698f.getSettings().setBuiltInZoomControls(true);
        this.f20698f.getSettings().setSupportZoom(true);
        this.f20698f.getSettings().setDomStorageEnabled(true);
        this.f20698f.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                    case 1:
                        if (!view.hasFocus()) {
                            view.requestFocus();
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        this.f20698f.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                t_rssdetalle_fr.this.mo567a(intent);
            }
        });
        if (this.f20689a.f17971bz[this.f20689a.f18075l].f18230A) {
            this.f20698f.getSettings().setUseWideViewPort(true);
            this.f20698f.getSettings().setLoadWithOverviewMode(true);
        }
        final ProgressBar progressBar = (ProgressBar) this.f20699g.findViewById(R.id.pb_url);
        if (VERSION.SDK_INT > 20) {
            config.m23838a(progressBar, this.f20689a.f17890aW);
        }
        this.f20698f.setWebViewClient(new WebViewClient() {
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                progressBar.setVisibility(0);
            }

            public void onPageFinished(WebView webView, String str) {
                progressBar.setVisibility(8);
                if (t_rssdetalle_fr.this.f20697e) {
                    webView.clearHistory();
                    t_rssdetalle_fr.this.f20697e = false;
                }
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                String str9;
                String str10 = str;
                String lowerCase = str.toLowerCase();
                String[] strArr = {"doc", "docx", "xls", "xlsx", "ppt", "pptx", "pdf", "pages", "ai", "psd", "tiff", "dxf", "svg", "eps", "ps", "ttf", "otf", "xps", "zip", "rar"};
                String str11 = "";
                int lastIndexOf = str10.lastIndexOf(".");
                if (lastIndexOf != -1) {
                    str11 = lowerCase.substring(lastIndexOf);
                }
                String replace = str11.replace(".", "");
                if (lowerCase.startsWith("tel:") || lowerCase.startsWith("http://tel:")) {
                    if (lowerCase.startsWith("tel:")) {
                        str2 = str10.substring(4);
                    } else {
                        str2 = str10.substring(11);
                    }
                    if (str2.endsWith("/")) {
                        str2 = str2.substring(0, str2.length() - 1);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("tel:");
                    sb.append(str2);
                    try {
                        t_rssdetalle_fr.this.mo567a(new Intent("android.intent.action.DIAL", Uri.parse(sb.toString())));
                    } catch (Exception unused) {
                    }
                    return true;
                } else if (lowerCase.startsWith("mailto:") || lowerCase.startsWith("http://mailto:")) {
                    String str12 = "";
                    String str13 = "";
                    if (lowerCase.startsWith("mailto:")) {
                        str3 = str10.substring(7).trim();
                    } else {
                        str3 = str10.substring(14).trim();
                    }
                    if (!str3.equals("")) {
                        int indexOf = str3.indexOf("?");
                        if (indexOf > 0) {
                            int indexOf2 = str3.indexOf("?subject=");
                            if (indexOf2 != -1) {
                                str12 = str3.substring(indexOf2 + 9).trim();
                                int indexOf3 = str12.indexOf("&body=");
                                if (indexOf3 != -1) {
                                    str13 = str12.substring(indexOf3 + 6).trim();
                                    str12 = str12.substring(0, indexOf3).trim();
                                }
                            }
                            str3 = str3.substring(0, indexOf).trim();
                        }
                        if (str3.endsWith("/")) {
                            str3 = str3.substring(0, str3.length() - 1);
                        }
                        Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", str3, null));
                        if (!str12.equals("")) {
                            try {
                                str5 = URLDecoder.decode(str12, C2793C.UTF8_NAME);
                            } catch (Exception unused2) {
                                str5 = str12;
                            }
                            intent.putExtra("android.intent.extra.SUBJECT", str5);
                        }
                        if (!str13.equals("")) {
                            try {
                                str4 = URLDecoder.decode(str13, C2793C.UTF8_NAME);
                            } catch (Exception unused3) {
                                str4 = str13;
                            }
                            intent.putExtra("android.intent.extra.TEXT", str4);
                        }
                        t_rssdetalle_fr.this.mo567a(Intent.createChooser(intent, t_rssdetalle_fr.this.mo628n().getString(R.string.enviar_email)));
                    }
                    return true;
                } else if (lowerCase.startsWith("smsto:") || lowerCase.startsWith("http://smsto:")) {
                    String str14 = "";
                    if (lowerCase.startsWith("smsto:")) {
                        str6 = str10.substring(6).trim();
                    } else {
                        str6 = str10.substring(13).trim();
                    }
                    if (!str6.equals("")) {
                        int indexOf4 = str6.indexOf("?");
                        if (indexOf4 > 0) {
                            int indexOf5 = str6.indexOf("?body=");
                            if (indexOf5 != -1) {
                                str14 = str6.substring(indexOf5 + 6).trim();
                            }
                            str6 = str6.substring(0, indexOf4).trim();
                        }
                        if (str6.endsWith("/")) {
                            str6 = str6.substring(0, str6.length() - 1);
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("smsto:");
                        sb2.append(str6);
                        Intent intent2 = new Intent("android.intent.action.SENDTO", Uri.parse(sb2.toString()));
                        if (!str14.equals("")) {
                            try {
                                str7 = URLDecoder.decode(str14, C2793C.UTF8_NAME);
                            } catch (Exception unused4) {
                                str7 = str14;
                            }
                            intent2.putExtra("sms_body", str7);
                        }
                        try {
                            t_rssdetalle_fr.this.mo567a(intent2);
                        } catch (Exception unused5) {
                        }
                    }
                    return true;
                } else if (lowerCase.startsWith("go:") || lowerCase.startsWith("http://go:")) {
                    if (lowerCase.startsWith("go:")) {
                        str8 = str10.substring(3);
                    } else {
                        str8 = str10.substring(10);
                    }
                    if (str8.endsWith("/")) {
                        str8 = str8.substring(0, str8.length() - 1);
                    }
                    try {
                        str8 = URLDecoder.decode(str8, C2793C.UTF8_NAME);
                    } catch (Exception unused6) {
                    }
                    for (int i = 0; i < t_rssdetalle_fr.this.f20689a.f17971bz.length; i++) {
                        if (t_rssdetalle_fr.this.f20689a.f17971bz[i].f18316i.equalsIgnoreCase(str8)) {
                            t_rssdetalle_fr.this.startActivityForResult(t_rssdetalle_fr.this.f20689a.mo20762a(Integer.valueOf(i), t_rssdetalle_fr.this.f20699g.getContext()).f18226a, 0);
                            return true;
                        }
                    }
                    t_rssdetalle_fr.this.f20696d = false;
                    return false;
                } else if (lowerCase.startsWith("vnd.youtube:")) {
                    int indexOf6 = str10.indexOf("?");
                    if (indexOf6 > 0) {
                        str9 = str10.substring(12, indexOf6);
                    } else {
                        str9 = str10.substring(12);
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("http://www.youtube.com/watch?v=");
                    sb3.append(str9);
                    String sb4 = sb3.toString();
                    if (t_rssdetalle_fr.this.f20695c) {
                        t_rssdetalle_fr.this.mo567a(new Intent("android.intent.action.VIEW", Uri.parse(sb4)));
                    } else {
                        t_rssdetalle_fr.this.f20696d = false;
                        t_rssdetalle_fr.this.f20698f.loadUrl(sb4);
                    }
                    return true;
                } else if (lowerCase.endsWith(DefaultHlsExtractorFactory.MP3_FILE_EXTENSION)) {
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    intent3.setDataAndType(Uri.parse(str), "audio/*");
                    webView.getContext().startActivity(intent3);
                    return true;
                } else if (lowerCase.endsWith(".mp4") || lowerCase.endsWith(".3gp")) {
                    Intent intent4 = new Intent("android.intent.action.VIEW");
                    intent4.setDataAndType(Uri.parse(str), "video/*");
                    webView.getContext().startActivity(intent4);
                    return true;
                } else if (t_rssdetalle_fr.this.f20695c || lowerCase.startsWith("rtsp://") || lowerCase.startsWith("rtmp://") || lowerCase.startsWith("market://") || lowerCase.endsWith(".apk") || lowerCase.startsWith("whatsapp://") || lowerCase.endsWith(".m3u") || lowerCase.endsWith(".m3u8")) {
                    try {
                        t_rssdetalle_fr.this.mo567a(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        return true;
                    } catch (Exception unused7) {
                        return false;
                    }
                } else if (!Arrays.asList(strArr).contains(replace) || lowerCase.contains("docs.google.com")) {
                    t_rssdetalle_fr.this.f20696d = false;
                    return false;
                } else if (!t_rssdetalle_fr.this.f20698f.getUrl().contains("docs.google.com")) {
                    try {
                        str10 = URLEncoder.encode(str10, AudienceNetworkActivity.WEBVIEW_ENCODING);
                    } catch (Exception unused8) {
                    }
                    WebView webView2 = t_rssdetalle_fr.this.f20698f;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("http://docs.google.com/viewer?embedded=true&url=");
                    sb5.append(str10);
                    webView2.loadUrl(sb5.toString());
                    t_rssdetalle_fr.this.f20696d = false;
                    return true;
                } else {
                    t_rssdetalle_fr.this.mo567a(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return true;
                }
            }
        });
        this.f20698f.getSettings().setJavaScriptEnabled(true);
        this.f20698f.getSettings().setPluginState(PluginState.ON);
        WebSettings settings = this.f20698f.getSettings();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20698f.getSettings().getUserAgentString());
        sb.append(" Vinebre");
        settings.setUserAgentString(sb.toString());
        return this.f20699g;
    }

    /* renamed from: d */
    public void mo598d(Bundle bundle) {
        super.mo598d(bundle);
        if (bundle != null) {
            this.f20698f.restoreState(bundle);
        } else if (!(this.f20700h == null || this.f20700h.getString("url") == null)) {
            this.f20698f.loadUrl(this.f20700h.getString("url"));
        }
        this.f20690ag = (LinearLayout) mo626m().findViewById(R.id.ll_princ);
        this.f20701i = (FrameLayout) mo626m().findViewById(R.id.target_view);
    }

    /* renamed from: a */
    public boolean mo22301a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.f20692ai != null) {
                this.f20693aj.onHideCustomView();
                return true;
            } else if (!this.f20696d && this.f20698f.canGoBack()) {
                this.f20698f.goBack();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo559a(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            mo626m().setResult(-1, intent);
            mo626m().finish();
        }
    }

    /* renamed from: e */
    public void mo603e(Bundle bundle) {
        super.mo603e(bundle);
        this.f20698f.saveState(bundle);
    }

    /* renamed from: b */
    public void mo22302b(String str) {
        if (this.f20699g != null) {
            this.f20696d = true;
            this.f20697e = true;
            this.f20698f.loadUrl(str);
        }
    }

    /* renamed from: z */
    public void mo646z() {
        super.mo646z();
        this.f20698f.onResume();
    }

    /* renamed from: A */
    public void mo528A() {
        if (this.f20692ai != null) {
            this.f20693aj.onHideCustomView();
        }
        super.mo528A();
        this.f20698f.onPause();
        if (this.f20694b || mo626m().isFinishing()) {
            try {
                this.f20698f.loadData("", AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING);
            } catch (Exception unused) {
            }
        }
    }

    @TargetApi(21)
    /* renamed from: c */
    private void m24772c() {
        if (VERSION.SDK_INT > 20) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f20698f, true);
        }
    }
}
