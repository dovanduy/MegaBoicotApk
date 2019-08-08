package mega.boicot;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.app.SearchManager.OnCancelListener;
import android.app.SearchManager.OnDismissListener;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.support.p017v4.app.C0236a;
import android.support.p017v4.content.C0356c;
import android.support.p017v4.widget.SwipeRefreshLayout;
import android.support.p017v4.widget.SwipeRefreshLayout.C0636b;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.HttpAuthHandler;
import android.webkit.JsResult;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebSettings;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.webkit.WebView.HitTestResult;
import android.webkit.WebView.WebViewTransport;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.base.p046b.C1245d;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnVideoEnded;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.C1514Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.android.gms.ads.C2997g;
import com.google.android.gms.ads.reward.C3165a;
import com.google.android.gms.ads.reward.C3166b;
import com.google.android.gms.ads.reward.C3167c;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.VideoListener;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import java.io.File;
import java.util.Locale;
import java.util.regex.Pattern;

public class t_html extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: A */
    int f19099A;

    /* renamed from: B */
    String f19100B;

    /* renamed from: C */
    String f19101C;

    /* renamed from: D */
    Builder f19102D;

    /* renamed from: E */
    String f19103E;

    /* renamed from: F */
    String f19104F;

    /* renamed from: G */
    EditText f19105G;

    /* renamed from: H */
    EditText f19106H;

    /* renamed from: I */
    HttpAuthHandler f19107I;

    /* renamed from: J */
    ListView f19108J;

    /* renamed from: K */
    SwipeRefreshLayout f19109K;

    /* renamed from: L */
    private ValueCallback<Uri> f19110L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public ValueCallback<Uri[]> f19111M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public FrameLayout f19112N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public LinearLayout f19113O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public CustomViewCallback f19114P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public View f19115Q;

    /* renamed from: R */
    private WebChromeClient f19116R;

    /* renamed from: a */
    config f19117a;

    /* renamed from: b */
    boolean f19118b = false;

    /* renamed from: c */
    boolean f19119c = false;

    /* renamed from: d */
    boolean f19120d = false;

    /* renamed from: e */
    boolean f19121e = true;

    /* renamed from: f */
    boolean f19122f = true;

    /* renamed from: g */
    boolean f19123g = false;

    /* renamed from: h */
    boolean f19124h = false;

    /* renamed from: i */
    boolean f19125i;

    /* renamed from: j */
    int f19126j = 0;

    /* renamed from: k */
    int f19127k = -1;

    /* renamed from: l */
    boolean f19128l = true;

    /* renamed from: m */
    boolean f19129m;

    /* renamed from: n */
    WebView f19130n;

    /* renamed from: o */
    Bundle f19131o;

    /* renamed from: p */
    Callback f19132p;

    /* renamed from: q */
    String f19133q;

    /* renamed from: r */
    C5602c f19134r;

    /* renamed from: s */
    C3166b f19135s;

    /* renamed from: t */
    RewardedVideo f19136t;

    /* renamed from: u */
    RewardedVideoAd f19137u;

    /* renamed from: v */
    StartAppAd f19138v;

    /* renamed from: w */
    boolean f19139w = false;

    /* renamed from: x */
    boolean f19140x = false;

    /* renamed from: y */
    View f19141y;

    /* renamed from: z */
    ProgressDialog f19142z;

    /* renamed from: B_ */
    public void mo9672B_() {
    }

    /* renamed from: C_ */
    public void mo9673C_() {
    }

    public void onAdClicked(C1514Ad ad) {
    }

    public void onLoggingImpression(C1514Ad ad) {
    }

    public void onCreate(Bundle bundle) {
        this.f19117a = (config) getApplicationContext();
        if (this.f19117a.f17881aN == null) {
            this.f19117a.mo20780b();
        }
        this.f19131o = getIntent().getExtras();
        this.f19099A = this.f19131o.getInt("idsecc");
        this.f19101C = config.m23831a(this.f19117a.f17971bz[this.f19099A].f18314g, this.f19117a.f17890aW);
        super.onCreate(bundle);
        setContentView(R.layout.t_url);
        if (bundle == null) {
            this.f19125i = this.f19131o != null && this.f19131o.containsKey("es_root") && this.f19131o.getBoolean("es_root", false);
        } else {
            this.f19125i = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        mo21255f();
        if (this.f19117a.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_html.this.f19118b = false;
                    t_html.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    t_html.this.f19140x = false;
                }
            });
        }
        this.f19100B = this.f19117a.f17971bz[this.f19099A].f18313f;
        this.f19134r = this.f19117a.mo20760a((Context) this, this.f19100B.contains("youtube.com") || this.f19100B.contains("youtu.be"));
        this.f19117a.mo20767a((Context) this, this.f19117a.f18075l, this.f19101C, bundle);
        if (this.f19117a.f18075l != -1) {
            this.f19126j = this.f19117a.f17971bz[this.f19117a.f18075l].f18329v;
            this.f19121e = this.f19117a.f17971bz[this.f19117a.f18075l].f18232C;
            this.f19122f = this.f19117a.f17971bz[this.f19117a.f18075l].f18233D;
            this.f19123g = this.f19117a.f17971bz[this.f19117a.f18075l].f18239J;
            this.f19129m = this.f19117a.f17971bz[this.f19117a.f18075l].f18236G;
        } else {
            this.f19126j = 0;
            this.f19121e = true;
            this.f19122f = true;
            this.f19123g = false;
            this.f19129m = false;
        }
        this.f19130n = (WebView) findViewById(R.id.webview);
        registerForContextMenu(this.f19130n);
        this.f19109K = (SwipeRefreshLayout) findViewById(R.id.srl);
        if (this.f19123g) {
            if (VERSION.SDK_INT > 20) {
                SwipeRefreshLayout swipeRefreshLayout = this.f19109K;
                StringBuilder sb = new StringBuilder();
                sb.append("#");
                sb.append(this.f19117a.f17890aW);
                swipeRefreshLayout.setColorSchemeColors(Color.parseColor(sb.toString()));
            }
            this.f19109K.setOnRefreshListener(new C0636b() {
                /* renamed from: a */
                public void mo2415a() {
                    t_html.this.f19130n.reload();
                }
            });
        } else {
            this.f19109K.setEnabled(false);
        }
        if (this.f19126j == 2) {
            this.f19130n.getSettings().setSupportMultipleWindows(true);
        }
        WebView webView = this.f19130n;
        C58414 r6 = new WebChromeClient() {
            public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
                jsResult.confirm();
                return true;
            }

            public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
                WebView webView2 = new WebView(t_html.this);
                webView2.setWebViewClient(new WebViewClient() {
                    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                        intent.addCategory("android.intent.category.BROWSABLE");
                        t_html.this.startActivity(intent);
                        return true;
                    }
                });
                ((WebViewTransport) message.obj).setWebView(webView2);
                message.sendToTarget();
                return true;
            }

            @TargetApi(11)
            public void onShowCustomView(View view, CustomViewCallback customViewCallback) {
                t_html.this.f19114P = customViewCallback;
                t_html.this.f19112N.addView(view);
                t_html.this.f19115Q = view;
                t_html.this.f19113O.setVisibility(8);
                t_html.this.f19112N.setVisibility(0);
                if (VERSION.SDK_INT < 16) {
                    t_html.this.getWindow().setFlags(C1245d.f3947iP, C1245d.f3947iP);
                } else {
                    t_html.this.getWindow().getDecorView().setSystemUiVisibility(4);
                }
            }

            @TargetApi(11)
            public void onHideCustomView() {
                if (VERSION.SDK_INT < 16) {
                    t_html.this.getWindow().clearFlags(C1245d.f3947iP);
                } else {
                    t_html.this.getWindow().getDecorView().setSystemUiVisibility(0);
                }
                if (t_html.this.f19115Q != null) {
                    t_html.this.f19115Q.setVisibility(8);
                    t_html.this.f19112N.removeView(t_html.this.f19115Q);
                    t_html.this.f19115Q = null;
                    t_html.this.f19112N.setVisibility(8);
                    t_html.this.f19114P.onCustomViewHidden();
                    t_html.this.f19113O.setVisibility(0);
                }
            }

            public void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
                if (!config.m23868u(t_html.this)) {
                    return;
                }
                if (C0356c.m1318b((Context) t_html.this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                    String[] strArr = {"android.permission.ACCESS_FINE_LOCATION"};
                    t_html.this.f19133q = str;
                    t_html.this.f19132p = callback;
                    C0236a.m717a(t_html.this, strArr, 103);
                    return;
                }
                callback.invoke(str, true, false);
            }

            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
                if (t_html.this.f19111M != null) {
                    t_html.this.f19111M.onReceiveValue(null);
                }
                t_html.this.f19111M = valueCallback;
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("*/*");
                t_html.this.startActivityForResult(Intent.createChooser(intent, t_html.this.getResources().getString(R.string.selecciona)), 10);
                return true;
            }
        };
        this.f19116R = r6;
        webView.setWebChromeClient(r6);
        m24185g();
        this.f19130n.getSettings().setBuiltInZoomControls(this.f19122f);
        this.f19130n.getSettings().setSupportZoom(this.f19122f);
        this.f19130n.getSettings().setDomStorageEnabled(true);
        this.f19130n.setOnTouchListener(new OnTouchListener() {
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
        this.f19130n.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                if (t_html.this.f19129m || str.endsWith(".apk")) {
                    String str5 = "";
                    try {
                        str5 = URLUtil.guessFileName(str, str3, str4);
                    } catch (Exception unused) {
                    }
                    t_html.this.f19117a.mo20773a(str, str4, str5, (Context) t_html.this);
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                t_html.this.startActivity(intent);
            }
        });
        if (this.f19117a.f18075l != -1 && this.f19117a.f17971bz[this.f19117a.f18075l].f18230A) {
            this.f19130n.getSettings().setUseWideViewPort(true);
            this.f19130n.getSettings().setLoadWithOverviewMode(true);
        }
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.pb_url);
        if (VERSION.SDK_INT > 20) {
            config.m23838a(progressBar, this.f19117a.f17890aW);
        }
        this.f19130n.setWebViewClient(new WebViewClient() {
            public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
                t_html.this.f19107I = httpAuthHandler;
                t_html.this.f19102D = new Builder(t_html.this);
                t_html.this.f19102D.setTitle(t_html.this.getResources().getString(R.string.chat_acceso));
                View inflate = t_html.this.getLayoutInflater().inflate(R.layout.usucontra, null);
                t_html.this.f19105G = (EditText) inflate.findViewById(R.id.et_usu);
                t_html.this.f19106H = (EditText) inflate.findViewById(R.id.et_contra);
                t_html.this.f19102D.setView(inflate);
                t_html.this.f19102D.setCancelable(true);
                t_html.this.f19102D.setPositiveButton(t_html.this.getString(R.string.aceptar), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        t_html.this.f19103E = t_html.this.f19105G.getText().toString();
                        t_html.this.f19104F = t_html.this.f19106H.getText().toString();
                        t_html.this.f19107I.proceed(t_html.this.f19103E, t_html.this.f19104F);
                    }
                });
                t_html.this.f19102D.setNegativeButton(t_html.this.getString(R.string.cancelar), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        t_html.this.f19107I.cancel();
                    }
                });
                t_html.this.f19102D.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    public void onCancel(DialogInterface dialogInterface) {
                        t_html.this.f19107I.cancel();
                    }
                });
                t_html.this.f19102D.create().show();
            }

            public void onReceivedError(WebView webView, int i, String str, String str2) {
                if (!config.m23858k(t_html.this)) {
                    if (!t_html.this.f19117a.f18035dT.equals("")) {
                        String str3 = t_html.this.f19117a.f18035dT;
                        if (!str3.toLowerCase(Locale.getDefault()).contains("<html")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("<html><head><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"></head><body>");
                            sb.append(str3);
                            sb.append("</body></html>");
                            str3 = sb.toString();
                        }
                        t_html.this.f19130n.loadData(str3, "text/html; charset=utf-8", AudienceNetworkActivity.WEBVIEW_ENCODING);
                    } else {
                        WebView webView2 = t_html.this.f19130n;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("<html><head><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"></head><body>");
                        sb2.append(t_html.this.getResources().getString(R.string.wv_sinconex));
                        sb2.append("</body></html>");
                        webView2.loadData(sb2.toString(), "text/html; charset=utf-8", AudienceNetworkActivity.WEBVIEW_ENCODING);
                    }
                    t_html.this.f19130n.clearHistory();
                    t_html.this.f19124h = true;
                }
            }

            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                boolean z;
                boolean z2;
                if (!t_html.this.f19118b && !t_html.this.isFinishing() && !t_html.this.f19100B.contains("youtube.com") && !t_html.this.f19100B.contains("youtu.be")) {
                    if (t_html.this.f19128l) {
                        z = true;
                        z2 = t_html.this.f19131o != null && t_html.this.f19131o.containsKey("ad_entrar");
                        if (t_html.this.f19131o == null || !t_html.this.f19131o.containsKey("fb_entrar")) {
                            z = false;
                        }
                        t_html.this.f19128l = false;
                    } else {
                        z2 = false;
                        z = false;
                    }
                    t_html.this.f19117a.mo20770a((Context) t_html.this, z2, z);
                }
                if (t_html.this.f19121e && !t_html.this.f19109K.mo2367b()) {
                    progressBar.setVisibility(0);
                }
            }

            public void onPageFinished(WebView webView, String str) {
                progressBar.setVisibility(8);
                t_html.this.f19109K.setRefreshing(false);
                if (t_html.this.f19119c) {
                    t_html.this.f19119c = false;
                    t_html.this.f19130n.clearHistory();
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:221:0x056c  */
            /* JADX WARNING: Removed duplicated region for block: B:224:0x058a  */
            /* JADX WARNING: Removed duplicated region for block: B:232:0x059f  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean shouldOverrideUrlLoading(android.webkit.WebView r23, java.lang.String r24) {
                /*
                    r22 = this;
                    r1 = r22
                    r2 = r24
                    java.lang.String r3 = r24.toLowerCase()
                    r4 = 20
                    java.lang.String[] r4 = new java.lang.String[r4]
                    java.lang.String r5 = "doc"
                    r6 = 0
                    r4[r6] = r5
                    java.lang.String r5 = "docx"
                    r7 = 1
                    r4[r7] = r5
                    java.lang.String r5 = "xls"
                    r8 = 2
                    r4[r8] = r5
                    java.lang.String r5 = "xlsx"
                    r8 = 3
                    r4[r8] = r5
                    java.lang.String r5 = "ppt"
                    r9 = 4
                    r4[r9] = r5
                    java.lang.String r5 = "pptx"
                    r10 = 5
                    r4[r10] = r5
                    java.lang.String r5 = "pdf"
                    r10 = 6
                    r4[r10] = r5
                    java.lang.String r5 = "pages"
                    r11 = 7
                    r4[r11] = r5
                    java.lang.String r5 = "ai"
                    r12 = 8
                    r4[r12] = r5
                    java.lang.String r5 = "psd"
                    r12 = 9
                    r4[r12] = r5
                    java.lang.String r5 = "tiff"
                    r13 = 10
                    r4[r13] = r5
                    java.lang.String r5 = "dxf"
                    r14 = 11
                    r4[r14] = r5
                    java.lang.String r5 = "svg"
                    r15 = 12
                    r4[r15] = r5
                    java.lang.String r5 = "eps"
                    r14 = 13
                    r4[r14] = r5
                    java.lang.String r5 = "ps"
                    r9 = 14
                    r4[r9] = r5
                    java.lang.String r5 = "ttf"
                    r18 = 15
                    r4[r18] = r5
                    java.lang.String r5 = "otf"
                    r18 = 16
                    r4[r18] = r5
                    java.lang.String r5 = "xps"
                    r18 = 17
                    r4[r18] = r5
                    java.lang.String r5 = "zip"
                    r18 = 18
                    r4[r18] = r5
                    java.lang.String r5 = "rar"
                    r18 = 19
                    r4[r18] = r5
                    java.lang.String r5 = ""
                    java.lang.String r12 = "."
                    int r12 = r2.lastIndexOf(r12)
                    r9 = -1
                    if (r12 == r9) goto L_0x008b
                    java.lang.String r5 = r3.substring(r12)
                L_0x008b:
                    java.lang.String r12 = "."
                    java.lang.String r11 = ""
                    java.lang.String r5 = r5.replace(r12, r11)
                    java.lang.String r11 = "tel:"
                    boolean r11 = r3.startsWith(r11)
                    if (r11 != 0) goto L_0x05e9
                    java.lang.String r11 = "http://tel:"
                    boolean r11 = r3.startsWith(r11)
                    if (r11 == 0) goto L_0x00a5
                    goto L_0x05e9
                L_0x00a5:
                    java.lang.String r11 = "mailto:"
                    boolean r11 = r3.startsWith(r11)
                    r12 = 0
                    if (r11 != 0) goto L_0x048e
                    java.lang.String r11 = "http://mailto:"
                    boolean r11 = r3.startsWith(r11)
                    if (r11 == 0) goto L_0x00b8
                    goto L_0x048e
                L_0x00b8:
                    java.lang.String r11 = "smsto:"
                    boolean r11 = r3.startsWith(r11)
                    if (r11 != 0) goto L_0x0402
                    java.lang.String r11 = "http://smsto:"
                    boolean r11 = r3.startsWith(r11)
                    if (r11 == 0) goto L_0x00ca
                    goto L_0x0402
                L_0x00ca:
                    java.lang.String r9 = "intent://"
                    boolean r9 = r3.startsWith(r9)
                    if (r9 == 0) goto L_0x00e8
                    android.content.Intent r2 = android.content.Intent.parseUri(r2, r7)     // Catch:{ Exception -> 0x00e7 }
                    java.lang.String r3 = "android.intent.category.BROWSABLE"
                    r2.addCategory(r3)     // Catch:{ Exception -> 0x00e7 }
                    r2.setComponent(r12)     // Catch:{ Exception -> 0x00e7 }
                    r2.setSelector(r12)     // Catch:{ Exception -> 0x00e7 }
                    mega.boicot.t_html r3 = mega.boicot.t_html.this     // Catch:{ Exception -> 0x00e7 }
                    r3.startActivity(r2)     // Catch:{ Exception -> 0x00e7 }
                    return r7
                L_0x00e7:
                    return r6
                L_0x00e8:
                    java.lang.String r9 = "go:"
                    boolean r9 = r3.startsWith(r9)
                    if (r9 != 0) goto L_0x026e
                    java.lang.String r9 = "http://go:"
                    boolean r9 = r3.startsWith(r9)
                    if (r9 == 0) goto L_0x00fa
                    goto L_0x026e
                L_0x00fa:
                    java.lang.String r8 = "vnd.youtube:"
                    boolean r8 = r3.startsWith(r8)
                    if (r8 == 0) goto L_0x0143
                    java.lang.String r3 = "?"
                    int r3 = r2.indexOf(r3)
                    if (r3 <= 0) goto L_0x010f
                    java.lang.String r2 = r2.substring(r15, r3)
                    goto L_0x0113
                L_0x010f:
                    java.lang.String r2 = r2.substring(r15)
                L_0x0113:
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "http://www.youtube.com/watch?v="
                    r3.append(r4)
                    r3.append(r2)
                    java.lang.String r2 = r3.toString()
                    mega.boicot.t_html r3 = mega.boicot.t_html.this
                    int r3 = r3.f19126j
                    if (r3 != r7) goto L_0x013b
                    android.net.Uri r2 = android.net.Uri.parse(r2)
                    android.content.Intent r3 = new android.content.Intent
                    java.lang.String r4 = "android.intent.action.VIEW"
                    r3.<init>(r4, r2)
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    r2.startActivity(r3)
                    goto L_0x0142
                L_0x013b:
                    mega.boicot.t_html r3 = mega.boicot.t_html.this
                    android.webkit.WebView r3 = r3.f19130n
                    r3.loadUrl(r2)
                L_0x0142:
                    return r7
                L_0x0143:
                    mega.boicot.t_html r8 = mega.boicot.t_html.this
                    boolean r8 = r8.f19129m
                    if (r8 == 0) goto L_0x0167
                    java.lang.String r8 = ".mp3"
                    boolean r8 = r3.endsWith(r8)
                    if (r8 != 0) goto L_0x0159
                    java.lang.String r8 = ".mp4"
                    boolean r8 = r3.endsWith(r8)
                    if (r8 == 0) goto L_0x0167
                L_0x0159:
                    mega.boicot.t_html r3 = mega.boicot.t_html.this
                    mega.boicot.config r3 = r3.f19117a
                    java.lang.String r4 = ""
                    java.lang.String r5 = ""
                    mega.boicot.t_html r6 = mega.boicot.t_html.this
                    r3.mo20773a(r2, r4, r5, r6)
                    return r7
                L_0x0167:
                    mega.boicot.t_html r8 = mega.boicot.t_html.this
                    boolean r8 = r8.f19129m
                    if (r8 != 0) goto L_0x018d
                    java.lang.String r8 = ".mp3"
                    boolean r8 = r3.endsWith(r8)
                    if (r8 == 0) goto L_0x018d
                    android.content.Intent r3 = new android.content.Intent
                    java.lang.String r4 = "android.intent.action.VIEW"
                    r3.<init>(r4)
                    android.net.Uri r2 = android.net.Uri.parse(r24)
                    java.lang.String r4 = "audio/*"
                    r3.setDataAndType(r2, r4)
                    android.content.Context r2 = r23.getContext()
                    r2.startActivity(r3)
                    return r7
                L_0x018d:
                    mega.boicot.t_html r8 = mega.boicot.t_html.this
                    boolean r8 = r8.f19129m
                    if (r8 != 0) goto L_0x01bb
                    java.lang.String r8 = ".mp4"
                    boolean r8 = r3.endsWith(r8)
                    if (r8 != 0) goto L_0x01a3
                    java.lang.String r8 = ".3gp"
                    boolean r8 = r3.endsWith(r8)
                    if (r8 == 0) goto L_0x01bb
                L_0x01a3:
                    android.content.Intent r3 = new android.content.Intent
                    java.lang.String r4 = "android.intent.action.VIEW"
                    r3.<init>(r4)
                    android.net.Uri r2 = android.net.Uri.parse(r24)
                    java.lang.String r4 = "video/*"
                    r3.setDataAndType(r2, r4)
                    android.content.Context r2 = r23.getContext()
                    r2.startActivity(r3)
                    return r7
                L_0x01bb:
                    mega.boicot.t_html r8 = mega.boicot.t_html.this
                    int r8 = r8.f19126j
                    if (r8 == r7) goto L_0x025c
                    java.lang.String r8 = "rtsp://"
                    boolean r8 = r3.startsWith(r8)
                    if (r8 != 0) goto L_0x025c
                    java.lang.String r8 = "rtmp://"
                    boolean r8 = r3.startsWith(r8)
                    if (r8 != 0) goto L_0x025c
                    java.lang.String r8 = "market://"
                    boolean r8 = r3.startsWith(r8)
                    if (r8 != 0) goto L_0x025c
                    java.lang.String r8 = "whatsapp://"
                    boolean r8 = r3.startsWith(r8)
                    if (r8 != 0) goto L_0x025c
                    java.lang.String r8 = ".m3u"
                    boolean r8 = r3.endsWith(r8)
                    if (r8 != 0) goto L_0x025c
                    java.lang.String r8 = ".m3u8"
                    boolean r8 = r3.endsWith(r8)
                    if (r8 != 0) goto L_0x025c
                    java.lang.String r8 = "http://www.androidcreator.com/open"
                    boolean r8 = r3.startsWith(r8)
                    if (r8 != 0) goto L_0x025c
                    java.lang.String r8 = "http://www.appcreator24.com/open"
                    boolean r8 = r3.startsWith(r8)
                    if (r8 == 0) goto L_0x0202
                    goto L_0x025c
                L_0x0202:
                    mega.boicot.t_html r8 = mega.boicot.t_html.this
                    boolean r8 = r8.f19129m
                    if (r8 != 0) goto L_0x025b
                    java.util.List r4 = java.util.Arrays.asList(r4)
                    boolean r4 = r4.contains(r5)
                    if (r4 == 0) goto L_0x025b
                    java.lang.String r4 = "docs.google.com"
                    boolean r3 = r3.contains(r4)
                    if (r3 != 0) goto L_0x025b
                    mega.boicot.t_html r3 = mega.boicot.t_html.this
                    android.webkit.WebView r3 = r3.f19130n
                    java.lang.String r3 = r3.getUrl()
                    java.lang.String r4 = "docs.google.com"
                    boolean r3 = r3.contains(r4)
                    if (r3 != 0) goto L_0x024a
                    java.lang.String r3 = "utf-8"
                    java.lang.String r3 = java.net.URLEncoder.encode(r2, r3)     // Catch:{ Exception -> 0x0231 }
                    r2 = r3
                L_0x0231:
                    mega.boicot.t_html r3 = mega.boicot.t_html.this
                    android.webkit.WebView r3 = r3.f19130n
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r5 = "http://docs.google.com/viewer?embedded=true&url="
                    r4.append(r5)
                    r4.append(r2)
                    java.lang.String r2 = r4.toString()
                    r3.loadUrl(r2)
                    return r7
                L_0x024a:
                    android.net.Uri r2 = android.net.Uri.parse(r24)
                    android.content.Intent r3 = new android.content.Intent
                    java.lang.String r4 = "android.intent.action.VIEW"
                    r3.<init>(r4, r2)
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    r2.startActivity(r3)
                    return r7
                L_0x025b:
                    return r6
                L_0x025c:
                    android.net.Uri r2 = android.net.Uri.parse(r24)
                    android.content.Intent r3 = new android.content.Intent
                    java.lang.String r4 = "android.intent.action.VIEW"
                    r3.<init>(r4, r2)
                    mega.boicot.t_html r2 = mega.boicot.t_html.this     // Catch:{ Exception -> 0x026d }
                    r2.startActivity(r3)     // Catch:{ Exception -> 0x026d }
                    return r7
                L_0x026d:
                    return r6
                L_0x026e:
                    java.lang.String r4 = "go:"
                    boolean r3 = r3.startsWith(r4)
                    if (r3 == 0) goto L_0x027b
                    java.lang.String r2 = r2.substring(r8)
                    goto L_0x027f
                L_0x027b:
                    java.lang.String r2 = r2.substring(r13)
                L_0x027f:
                    java.lang.String r3 = "/"
                    boolean r3 = r2.endsWith(r3)
                    if (r3 == 0) goto L_0x0290
                    int r3 = r2.length()
                    int r3 = r3 - r7
                    java.lang.String r2 = r2.substring(r6, r3)
                L_0x0290:
                    java.lang.String r3 = "UTF-8"
                    java.lang.String r3 = java.net.URLDecoder.decode(r2, r3)     // Catch:{ Exception -> 0x0297 }
                    r2 = r3
                L_0x0297:
                    r3 = r6
                L_0x0298:
                    mega.boicot.t_html r4 = mega.boicot.t_html.this
                    mega.boicot.config r4 = r4.f19117a
                    mega.boicot.i[] r4 = r4.f17971bz
                    int r4 = r4.length
                    if (r3 >= r4) goto L_0x0401
                    mega.boicot.t_html r4 = mega.boicot.t_html.this
                    mega.boicot.config r4 = r4.f19117a
                    mega.boicot.i[] r4 = r4.f17971bz
                    r4 = r4[r3]
                    java.lang.String r4 = r4.f18316i
                    boolean r4 = r4.equalsIgnoreCase(r2)
                    if (r4 == 0) goto L_0x03fd
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    mega.boicot.config r2 = r2.f19117a
                    java.lang.String r2 = r2.f17986cO
                    if (r2 == 0) goto L_0x02c7
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    mega.boicot.config r2 = r2.f19117a
                    java.lang.String r2 = r2.f17986cO
                    java.lang.String r4 = ""
                    boolean r2 = r2.equals(r4)
                    if (r2 == 0) goto L_0x030b
                L_0x02c7:
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    mega.boicot.config r2 = r2.f19117a
                    java.lang.String r2 = r2.f17985cN
                    if (r2 == 0) goto L_0x02dd
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    mega.boicot.config r2 = r2.f19117a
                    java.lang.String r2 = r2.f17985cN
                    java.lang.String r4 = ""
                    boolean r2 = r2.equals(r4)
                    if (r2 == 0) goto L_0x030b
                L_0x02dd:
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    mega.boicot.config r2 = r2.f19117a
                    java.lang.String r2 = r2.f17988cQ
                    if (r2 == 0) goto L_0x02f3
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    mega.boicot.config r2 = r2.f19117a
                    java.lang.String r2 = r2.f17988cQ
                    java.lang.String r4 = ""
                    boolean r2 = r2.equals(r4)
                    if (r2 == 0) goto L_0x030b
                L_0x02f3:
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    mega.boicot.config r2 = r2.f19117a
                    java.lang.String r2 = r2.f17989cR
                    if (r2 == 0) goto L_0x03f7
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    mega.boicot.config r2 = r2.f19117a
                    java.lang.String r2 = r2.f17989cR
                    java.lang.String r4 = ""
                    boolean r2 = r2.equals(r4)
                    if (r2 == 0) goto L_0x030b
                    goto L_0x03f7
                L_0x030b:
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    mega.boicot.config r2 = r2.f19117a
                    java.lang.String r2 = r2.f17986cO
                    if (r2 == 0) goto L_0x0332
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    mega.boicot.config r2 = r2.f19117a
                    java.lang.String r2 = r2.f17986cO
                    java.lang.String r4 = ""
                    boolean r2 = r2.equals(r4)
                    if (r2 != 0) goto L_0x0332
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    com.appnext.ads.fullscreen.RewardedVideo r4 = new com.appnext.ads.fullscreen.RewardedVideo
                    mega.boicot.t_html r5 = mega.boicot.t_html.this
                    mega.boicot.t_html r6 = mega.boicot.t_html.this
                    mega.boicot.config r6 = r6.f19117a
                    java.lang.String r6 = r6.f17986cO
                    r4.<init>(r5, r6)
                    r2.f19136t = r4
                L_0x0332:
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    mega.boicot.config r2 = r2.f19117a
                    java.lang.String r2 = r2.f17985cN
                    if (r2 == 0) goto L_0x0352
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    mega.boicot.config r2 = r2.f19117a
                    java.lang.String r2 = r2.f17985cN
                    java.lang.String r4 = ""
                    boolean r2 = r2.equals(r4)
                    if (r2 != 0) goto L_0x0352
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    mega.boicot.t_html r4 = mega.boicot.t_html.this
                    com.google.android.gms.ads.reward.b r4 = com.google.android.gms.ads.C2997g.m10716a(r4)
                    r2.f19135s = r4
                L_0x0352:
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    mega.boicot.config r2 = r2.f19117a
                    java.lang.String r2 = r2.f17988cQ
                    if (r2 == 0) goto L_0x0379
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    mega.boicot.config r2 = r2.f19117a
                    java.lang.String r2 = r2.f17988cQ
                    java.lang.String r4 = ""
                    boolean r2 = r2.equals(r4)
                    if (r2 != 0) goto L_0x0379
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    com.facebook.ads.RewardedVideoAd r4 = new com.facebook.ads.RewardedVideoAd
                    mega.boicot.t_html r5 = mega.boicot.t_html.this
                    mega.boicot.t_html r6 = mega.boicot.t_html.this
                    mega.boicot.config r6 = r6.f19117a
                    java.lang.String r6 = r6.f17988cQ
                    r4.<init>(r5, r6)
                    r2.f19137u = r4
                L_0x0379:
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    mega.boicot.config r2 = r2.f19117a
                    java.lang.String r2 = r2.f17989cR
                    if (r2 == 0) goto L_0x039a
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    mega.boicot.config r2 = r2.f19117a
                    java.lang.String r2 = r2.f17989cR
                    java.lang.String r4 = ""
                    boolean r2 = r2.equals(r4)
                    if (r2 != 0) goto L_0x039a
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    com.startapp.android.publish.adsCommon.StartAppAd r4 = new com.startapp.android.publish.adsCommon.StartAppAd
                    mega.boicot.t_html r5 = mega.boicot.t_html.this
                    r4.<init>(r5)
                    r2.f19138v = r4
                L_0x039a:
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    android.app.ProgressDialog r4 = new android.app.ProgressDialog
                    mega.boicot.t_html r5 = mega.boicot.t_html.this
                    r4.<init>(r5)
                    r2.f19142z = r4
                    android.view.View r15 = new android.view.View
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    r15.<init>(r2)
                    r15.setId(r3)
                    r2 = 2131230733(0x7f08000d, float:1.8077527E38)
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                    r15.setTag(r2, r4)
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    r2.f19141y = r12
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    r2.f19127k = r3
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    mega.boicot.config r13 = r2.f19117a
                    mega.boicot.t_html r14 = mega.boicot.t_html.this
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    java.lang.String r2 = r2.f19101C
                    mega.boicot.t_html r4 = mega.boicot.t_html.this
                    android.app.ProgressDialog r4 = r4.f19142z
                    mega.boicot.t_html r5 = mega.boicot.t_html.this
                    com.google.android.gms.ads.reward.b r5 = r5.f19135s
                    mega.boicot.t_html r6 = mega.boicot.t_html.this
                    com.appnext.ads.fullscreen.RewardedVideo r6 = r6.f19136t
                    mega.boicot.t_html r8 = mega.boicot.t_html.this
                    com.facebook.ads.RewardedVideoAd r8 = r8.f19137u
                    mega.boicot.t_html r9 = mega.boicot.t_html.this
                    com.startapp.android.publish.adsCommon.StartAppAd r9 = r9.f19138v
                    r16 = r2
                    r17 = r4
                    r18 = r5
                    r19 = r6
                    r20 = r8
                    r21 = r9
                    boolean r2 = r13.mo20774a(r14, r15, r16, r17, r18, r19, r20, r21)
                    if (r2 != 0) goto L_0x03fc
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    r2.mo21254b(r3)
                    goto L_0x03fc
                L_0x03f7:
                    mega.boicot.t_html r2 = mega.boicot.t_html.this
                    r2.mo21254b(r3)
                L_0x03fc:
                    return r7
                L_0x03fd:
                    int r3 = r3 + 1
                    goto L_0x0298
                L_0x0401:
                    return r6
                L_0x0402:
                    java.lang.String r4 = ""
                    java.lang.String r5 = "smsto:"
                    boolean r3 = r3.startsWith(r5)
                    if (r3 == 0) goto L_0x0415
                    java.lang.String r2 = r2.substring(r10)
                    java.lang.String r2 = r2.trim()
                    goto L_0x041d
                L_0x0415:
                    java.lang.String r2 = r2.substring(r14)
                    java.lang.String r2 = r2.trim()
                L_0x041d:
                    java.lang.String r3 = ""
                    boolean r3 = r2.equals(r3)
                    if (r3 != 0) goto L_0x048d
                    java.lang.String r3 = "?"
                    int r3 = r2.indexOf(r3)
                    if (r3 <= 0) goto L_0x0446
                    java.lang.String r5 = "?body="
                    int r5 = r2.indexOf(r5)
                    if (r5 == r9) goto L_0x043e
                    int r5 = r5 + r10
                    java.lang.String r4 = r2.substring(r5)
                    java.lang.String r4 = r4.trim()
                L_0x043e:
                    java.lang.String r2 = r2.substring(r6, r3)
                    java.lang.String r2 = r2.trim()
                L_0x0446:
                    java.lang.String r3 = "/"
                    boolean r3 = r2.endsWith(r3)
                    if (r3 == 0) goto L_0x0457
                    int r3 = r2.length()
                    int r3 = r3 - r7
                    java.lang.String r2 = r2.substring(r6, r3)
                L_0x0457:
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r5 = "smsto:"
                    r3.append(r5)
                    r3.append(r2)
                    java.lang.String r2 = r3.toString()
                    android.net.Uri r2 = android.net.Uri.parse(r2)
                    android.content.Intent r3 = new android.content.Intent
                    java.lang.String r5 = "android.intent.action.SENDTO"
                    r3.<init>(r5, r2)
                    java.lang.String r2 = ""
                    boolean r2 = r4.equals(r2)
                    if (r2 != 0) goto L_0x0488
                    java.lang.String r2 = "UTF-8"
                    java.lang.String r2 = java.net.URLDecoder.decode(r4, r2)     // Catch:{ Exception -> 0x0482 }
                    goto L_0x0483
                L_0x0482:
                    r2 = r4
                L_0x0483:
                    java.lang.String r4 = "sms_body"
                    r3.putExtra(r4, r2)
                L_0x0488:
                    mega.boicot.t_html r2 = mega.boicot.t_html.this     // Catch:{ Exception -> 0x048d }
                    r2.startActivity(r3)     // Catch:{ Exception -> 0x048d }
                L_0x048d:
                    return r7
                L_0x048e:
                    java.lang.String r4 = ""
                    java.lang.String r5 = ""
                    java.lang.String r8 = "mailto:"
                    boolean r3 = r3.startsWith(r8)
                    if (r3 == 0) goto L_0x04a4
                    r3 = 7
                    java.lang.String r3 = r2.substring(r3)
                    java.lang.String r3 = r3.trim()
                    goto L_0x04ae
                L_0x04a4:
                    r3 = 14
                    java.lang.String r3 = r2.substring(r3)
                    java.lang.String r3 = r3.trim()
                L_0x04ae:
                    java.lang.String r8 = ""
                    boolean r8 = r3.equals(r8)
                    if (r8 != 0) goto L_0x05e8
                    java.lang.String r8 = "?"
                    int r8 = r3.indexOf(r8)
                    if (r8 <= 0) goto L_0x0564
                    java.lang.String r10 = "?subject="
                    int r10 = r3.indexOf(r10)
                    if (r10 == r9) goto L_0x04eb
                    r11 = 9
                    int r10 = r10 + r11
                    java.lang.String r4 = r3.substring(r10)
                    java.lang.String r4 = r4.trim()
                    java.lang.String r10 = "&body="
                    int r10 = r4.indexOf(r10)
                    if (r10 == r9) goto L_0x04eb
                    int r5 = r10 + 6
                    java.lang.String r5 = r4.substring(r5)
                    java.lang.String r5 = r5.trim()
                    java.lang.String r4 = r4.substring(r6, r10)
                    java.lang.String r4 = r4.trim()
                L_0x04eb:
                    java.lang.String r3 = r3.substring(r6, r8)
                    java.lang.String r3 = r3.trim()
                    java.lang.String r8 = ""
                    boolean r8 = r5.equals(r8)
                    if (r8 == 0) goto L_0x0564
                    android.net.Uri r2 = android.net.Uri.parse(r24)     // Catch:{ Exception -> 0x055f }
                    java.lang.String r2 = r2.getQuery()     // Catch:{ Exception -> 0x055f }
                    java.lang.String r8 = "&"
                    java.lang.String[] r2 = r2.split(r8)     // Catch:{ Exception -> 0x055f }
                    int r8 = r2.length     // Catch:{ Exception -> 0x055f }
                    r9 = r5
                    r5 = r6
                L_0x050c:
                    if (r5 >= r8) goto L_0x055d
                    r10 = r2[r5]     // Catch:{ Exception -> 0x0559 }
                    java.lang.String r11 = "="
                    int r11 = r10.indexOf(r11)     // Catch:{ Exception -> 0x0559 }
                    java.lang.String r13 = r10.substring(r6, r11)     // Catch:{ Exception -> 0x0559 }
                    java.lang.String r14 = "UTF-8"
                    java.lang.String r13 = java.net.URLDecoder.decode(r13, r14)     // Catch:{ Exception -> 0x0559 }
                    int r11 = r11 + 1
                    java.lang.String r10 = r10.substring(r11)     // Catch:{ Exception -> 0x0559 }
                    java.lang.String r11 = "UTF-8"
                    java.lang.String r10 = java.net.URLDecoder.decode(r10, r11)     // Catch:{ Exception -> 0x0559 }
                    java.lang.String r11 = "subject"
                    boolean r11 = r13.equalsIgnoreCase(r11)     // Catch:{ Exception -> 0x0559 }
                    if (r11 != 0) goto L_0x0556
                    java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0559 }
                    r11.<init>()     // Catch:{ Exception -> 0x0559 }
                    r11.append(r9)     // Catch:{ Exception -> 0x0559 }
                    java.lang.String r14 = "<b>"
                    r11.append(r14)     // Catch:{ Exception -> 0x0559 }
                    r11.append(r13)     // Catch:{ Exception -> 0x0559 }
                    java.lang.String r13 = "</b>: "
                    r11.append(r13)     // Catch:{ Exception -> 0x0559 }
                    r11.append(r10)     // Catch:{ Exception -> 0x0559 }
                    java.lang.String r10 = "<br>"
                    r11.append(r10)     // Catch:{ Exception -> 0x0559 }
                    java.lang.String r10 = r11.toString()     // Catch:{ Exception -> 0x0559 }
                    r9 = r10
                L_0x0556:
                    int r5 = r5 + 1
                    goto L_0x050c
                L_0x0559:
                    r0 = move-exception
                    r2 = r0
                    r5 = r9
                    goto L_0x0561
                L_0x055d:
                    r5 = r9
                    goto L_0x0564
                L_0x055f:
                    r0 = move-exception
                    r2 = r0
                L_0x0561:
                    r2.printStackTrace()
                L_0x0564:
                    java.lang.String r2 = "/"
                    boolean r2 = r3.endsWith(r2)
                    if (r2 == 0) goto L_0x0575
                    int r2 = r3.length()
                    int r2 = r2 - r7
                    java.lang.String r3 = r3.substring(r6, r2)
                L_0x0575:
                    android.content.Intent r2 = new android.content.Intent
                    java.lang.String r6 = "android.intent.action.SENDTO"
                    java.lang.String r8 = "mailto"
                    android.net.Uri r3 = android.net.Uri.fromParts(r8, r3, r12)
                    r2.<init>(r6, r3)
                    java.lang.String r3 = ""
                    boolean r3 = r4.equals(r3)
                    if (r3 != 0) goto L_0x0597
                    java.lang.String r3 = "UTF-8"
                    java.lang.String r3 = java.net.URLDecoder.decode(r4, r3)     // Catch:{ Exception -> 0x0591 }
                    goto L_0x0592
                L_0x0591:
                    r3 = r4
                L_0x0592:
                    java.lang.String r4 = "android.intent.extra.SUBJECT"
                    r2.putExtra(r4, r3)
                L_0x0597:
                    java.lang.String r3 = ""
                    boolean r3 = r5.equals(r3)
                    if (r3 != 0) goto L_0x05d2
                    java.lang.String r3 = "UTF-8"
                    java.lang.String r3 = java.net.URLDecoder.decode(r5, r3)     // Catch:{ Exception -> 0x05a6 }
                    goto L_0x05a7
                L_0x05a6:
                    r3 = r5
                L_0x05a7:
                    java.lang.String r4 = "android.intent.extra.TEXT"
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r8 = "<p>"
                    r6.append(r8)
                    r6.append(r3)
                    java.lang.String r3 = "</p>"
                    r6.append(r3)
                    java.lang.String r3 = r6.toString()
                    r5.append(r3)
                    java.lang.String r3 = r5.toString()
                    android.text.Spanned r3 = android.text.Html.fromHtml(r3)
                    r2.putExtra(r4, r3)
                L_0x05d2:
                    mega.boicot.t_html r3 = mega.boicot.t_html.this
                    mega.boicot.t_html r4 = mega.boicot.t_html.this
                    android.content.res.Resources r4 = r4.getResources()
                    r5 = 2131558575(0x7f0d00af, float:1.874247E38)
                    java.lang.String r4 = r4.getString(r5)
                    android.content.Intent r2 = android.content.Intent.createChooser(r2, r4)
                    r3.startActivity(r2)
                L_0x05e8:
                    return r7
                L_0x05e9:
                    java.lang.String r4 = "tel:"
                    boolean r3 = r3.startsWith(r4)
                    if (r3 == 0) goto L_0x05f7
                    r3 = 4
                    java.lang.String r2 = r2.substring(r3)
                    goto L_0x05fd
                L_0x05f7:
                    r3 = 11
                    java.lang.String r2 = r2.substring(r3)
                L_0x05fd:
                    java.lang.String r3 = "/"
                    boolean r3 = r2.endsWith(r3)
                    if (r3 == 0) goto L_0x060e
                    int r3 = r2.length()
                    int r3 = r3 - r7
                    java.lang.String r2 = r2.substring(r6, r3)
                L_0x060e:
                    android.content.Intent r3 = new android.content.Intent
                    java.lang.String r4 = "android.intent.action.DIAL"
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r6 = "tel:"
                    r5.append(r6)
                    r5.append(r2)
                    java.lang.String r2 = r5.toString()
                    android.net.Uri r2 = android.net.Uri.parse(r2)
                    r3.<init>(r4, r2)
                    mega.boicot.t_html r2 = mega.boicot.t_html.this     // Catch:{ Exception -> 0x062f }
                    r2.startActivity(r3)     // Catch:{ Exception -> 0x062f }
                L_0x062f:
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_html.C58457.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
            }
        });
        this.f19130n.getSettings().setJavaScriptEnabled(true);
        this.f19130n.getSettings().setPluginState(PluginState.ON);
        if (!this.f19117a.f18033dR && !this.f19117a.f18034dS && config.m23858k(this)) {
            this.f19130n.clearCache(true);
            this.f19117a.f18034dS = true;
        }
        this.f19130n.getSettings().setAppCachePath(getApplicationContext().getCacheDir().getAbsolutePath());
        this.f19130n.getSettings().setAppCacheEnabled(true);
        this.f19130n.getSettings().setCacheMode(-1);
        if (!config.m23858k(this)) {
            if (this.f19117a.f18032dQ) {
                this.f19130n.getSettings().setCacheMode(1);
            } else {
                this.f19130n.getSettings().setCacheMode(2);
            }
        }
        String str = "";
        if (this.f19117a.f18075l != -1 && !this.f19117a.f17971bz[this.f19117a.f18075l].f18317j.equals("")) {
            str = this.f19117a.f17971bz[this.f19117a.f18075l].f18317j;
        }
        if (str.equals("")) {
            WebSettings settings = this.f19130n.getSettings();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f19130n.getSettings().getUserAgentString());
            sb2.append(" Vinebre");
            settings.setUserAgentString(sb2.toString());
        } else {
            this.f19130n.getSettings().setUserAgentString(str);
        }
        if (bundle == null) {
            String string = getSharedPreferences("sh", 0).getString("ft", "0");
            if (!this.f19117a.f17971bz[this.f19099A].f18234E && !string.equals("0") && !string.equals("")) {
                String str2 = "";
                if (!string.equals("1")) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("file:///android_asset/fonts/");
                    sb3.append(this.f19117a.mo20779b(Integer.parseInt(string)));
                    str2 = sb3.toString();
                } else if (new File(getFilesDir(), "font").exists()) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("file://");
                    sb4.append(getFilesDir().getAbsolutePath());
                    sb4.append("/font");
                    str2 = sb4.toString();
                }
                if (!str2.equals("")) {
                    String str3 = this.f19100B;
                    String quote = Pattern.quote("</head>");
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("<style type=\"text/css\">@font-face {font-family: fontAC;src: url(\"");
                    sb5.append(str2);
                    sb5.append("\")} body,input,textarea,select{font-family: fontAC;}</style></head>");
                    this.f19100B = str3.replaceFirst(quote, sb5.toString());
                }
            }
            this.f19130n.loadDataWithBaseURL("http://localhost/", this.f19100B.replace("@CCORCH@", "]"), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
            this.f19113O = (LinearLayout) findViewById(R.id.ll_princ);
            this.f19112N = (FrameLayout) findViewById(R.id.target_view);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21254b(int i) {
        startActivityForResult(this.f19117a.mo20762a(Integer.valueOf(i), (Context) this).f18226a, 0);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        getMenuInflater().inflate(R.menu.m3, contextMenu);
        HitTestResult hitTestResult = this.f19130n.getHitTestResult();
        if (hitTestResult.getType() == 5 || hitTestResult.getType() == 8) {
            MenuItem findItem = contextMenu.findItem(R.id.guardar);
            StringBuilder sb = new StringBuilder();
            sb.append(findItem.getTitle());
            sb.append("");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2.substring(0, 1).toUpperCase());
            sb3.append(sb2.substring(1).toLowerCase());
            findItem.setTitle(sb3.toString());
        } else {
            contextMenu.removeItem(R.id.guardar);
        }
        if (hitTestResult.getType() != 5 && hitTestResult.getType() != 8) {
            contextMenu.removeItem(R.id.compartir);
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.compartir) {
            String str = this.f19130n.getHitTestResult().getExtra().toString();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str);
            startActivity(Intent.createChooser(intent, getResources().getString(R.string.compartir)));
            return true;
        } else if (itemId != R.id.guardar) {
            return super.onContextItemSelected(menuItem);
        } else {
            HitTestResult hitTestResult = this.f19130n.getHitTestResult();
            String str2 = hitTestResult.getExtra().toString();
            if (str2 != null) {
                String str3 = "image/*";
                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(hitTestResult.getExtra().toString());
                if (fileExtensionFromUrl != null) {
                    str3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                }
                String str4 = "";
                try {
                    str4 = URLUtil.guessFileName(str2, null, str3);
                } catch (Exception unused) {
                }
                this.f19117a.mo20773a(str2, str3, str4, (Context) this);
            }
            return true;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.f19115Q != null) {
                this.f19120d = false;
                this.f19116R.onHideCustomView();
                return true;
            } else if (this.f19130n.canGoBack() && !this.f19124h) {
                this.f19120d = false;
                WebBackForwardList copyBackForwardList = this.f19130n.copyBackForwardList();
                String url = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() - 1).getUrl();
                if (url.equals("about:blank") || url.equals("data:text/html;charset=utf-8;base64,")) {
                    this.f19119c = true;
                    this.f19130n.clearHistory();
                    this.f19130n.loadDataWithBaseURL("http://localhost/", this.f19100B.replace("@CCORCH@", "]"), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
                    this.f19130n.clearHistory();
                } else {
                    this.f19130n.goBack();
                }
                return true;
            } else if (this.f19125i && !this.f19120d && this.f19117a.f18059ea) {
                this.f19120d = true;
                config.m23859l(this);
                return true;
            } else if (this.f19125i && this.f19130n.getUrl() != null && (this.f19130n.getUrl().toLowerCase(Locale.getDefault()).contains("youtube.com") || this.f19130n.getUrl().toLowerCase(Locale.getDefault()).contains("youtu.be"))) {
                startActivity(new Intent(this, finalizar.class));
                finish();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void abrir_secc(View view) {
        if (view != null) {
            C5662h a = this.f19117a.mo20761a(view, (Context) this);
            if (a.f18227b) {
                this.f19118b = true;
                Intent intent = new Intent();
                intent.putExtra("finalizar", true);
                intent.putExtra("finalizar_app", a.f18228c);
                setResult(-1, intent);
            }
            if (a.f18229d) {
                if (this.f19130n.getUrl() != null && (this.f19130n.getUrl().toLowerCase().contains("youtube.com") || this.f19130n.getUrl().toLowerCase().contains("youtu.be"))) {
                    this.f19130n.reload();
                }
                startActivityForResult(a.f18226a, 0);
            } else if (a.f18226a != null) {
                if (a.f18227b && this.f19117a.f18045dm != 2) {
                    a.f18226a.putExtra("es_root", true);
                }
                this.f19125i = false;
                startActivity(a.f18226a);
            }
            if (this.f19118b && !this.f19140x) {
                finish();
            }
        } else if (this.f19127k != -1) {
            mo21254b(this.f19127k);
        }
    }

    public void onClick(View view) {
        if ((this.f19117a.f17986cO == null || this.f19117a.f17986cO.equals("")) && ((this.f19117a.f17985cN == null || this.f19117a.f17985cN.equals("")) && ((this.f19117a.f17988cQ == null || this.f19117a.f17988cQ.equals("")) && (this.f19117a.f17989cR == null || this.f19117a.f17989cR.equals(""))))) {
            abrir_secc(view);
            return;
        }
        if (this.f19117a.f17986cO != null && !this.f19117a.f17986cO.equals("")) {
            this.f19136t = new RewardedVideo((Context) this, this.f19117a.f17986cO);
        }
        if (this.f19117a.f17985cN != null && !this.f19117a.f17985cN.equals("")) {
            this.f19135s = C2997g.m10716a(this);
        }
        if (this.f19117a.f17988cQ != null && !this.f19117a.f17988cQ.equals("")) {
            this.f19137u = new RewardedVideoAd(this, this.f19117a.f17988cQ);
        }
        if (this.f19117a.f17989cR != null && !this.f19117a.f17989cR.equals("")) {
            this.f19138v = new StartAppAd(this);
        }
        this.f19142z = new ProgressDialog(this);
        this.f19141y = view;
        this.f19127k = -1;
        if (!this.f19117a.mo20774a((Context) this, view, this.f19101C, this.f19142z, this.f19135s, this.f19136t, this.f19137u, this.f19138v)) {
            abrir_secc(view);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        switch (i) {
            case 102:
                if (config.m23853d() && iArr.length > 0 && strArr[0].equals("android.permission.WRITE_EXTERNAL_STORAGE") && iArr[0] == 0 && getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", getPackageName()) == 0) {
                    SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
                    this.f19117a.mo20773a(sharedPreferences.getString("descarga_url", ""), sharedPreferences.getString("descarga_mimetype", ""), sharedPreferences.getString("descarga_nombre", ""), (Context) this);
                }
                return;
            case 103:
                if (config.m23868u(this) && iArr.length > 0 && strArr[0].equals("android.permission.ACCESS_FINE_LOCATION") && iArr[0] == 0) {
                    this.f19132p.invoke(this.f19133q, true, false);
                }
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri[] uriArr;
        if (i == 10) {
            if (this.f19110L != null || this.f19111M != null) {
                if (this.f19110L != null) {
                    this.f19110L.onReceiveValue((intent == null || i2 != -1) ? null : intent.getData());
                    this.f19110L = null;
                } else if (this.f19111M != null) {
                    if (intent != null) {
                        String dataString = intent.getDataString();
                        if (dataString != null) {
                            uriArr = new Uri[]{Uri.parse(dataString)};
                            this.f19111M.onReceiveValue(uriArr);
                            this.f19111M = null;
                        }
                    }
                    uriArr = null;
                    this.f19111M.onReceiveValue(uriArr);
                    this.f19111M = null;
                }
            }
        } else if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f19125i = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21255f() {
        int b = this.f19117a.mo20778b((Context) this);
        if (this.f19117a.f18045dm == 1) {
            this.f19108J = (ListView) findViewById(R.id.left_drawer);
            this.f19117a.mo20771a(this.f19108J);
        } else if (this.f19117a.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f19117a.f17971bz.length; i2++) {
                if (!this.f19117a.f17971bz[i2].f18333z) {
                    findViewById(i2).setOnClickListener(this);
                    i++;
                    if (i == b) {
                        break;
                    }
                }
            }
            if (findViewById(R.id.idaux9999) != null && findViewById(R.id.idaux9999).getVisibility() == 0) {
                findViewById(R.id.idaux9999).setOnClickListener(this);
            }
        }
        for (int i3 = 0; i3 < this.f19117a.f17923bD.length; i3++) {
            if (this.f19117a.f17923bD[i3] > 0) {
                findViewById(this.f19117a.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public boolean onSearchRequested() {
        if (this.f19117a.f18080q == 0) {
            return false;
        }
        this.f19118b = true;
        this.f19140x = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f19130n.saveState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f19130n.restoreState(bundle);
        if (this.f19130n.copyBackForwardList().getCurrentIndex() == 0) {
            this.f19130n.loadDataWithBaseURL("http://localhost/", this.f19100B.replace("@CCORCH@", "]"), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f19118b && !this.f19140x) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f19117a.f18013cx == 0 || this.f19134r == null || this.f19134r.f17768a == null)) {
            this.f19134r.f17768a.mo12167b();
        }
        if (this.f19115Q != null) {
            this.f19116R.onHideCustomView();
        }
        super.onPause();
        this.f19130n.onPause();
        if (this.f19118b || isFinishing()) {
            try {
                this.f19130n.loadData("", AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING);
            } catch (Exception unused) {
            }
        }
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (!(this.f19117a.f18013cx == 0 || this.f19134r == null || this.f19134r.f17768a == null)) {
            this.f19134r.f17768a.mo12165a();
        }
        this.f19130n.onResume();
    }

    public void onDestroy() {
        if (!(this.f19117a.f18013cx == 0 || this.f19134r == null || this.f19134r.f17768a == null)) {
            this.f19134r.f17768a.mo12168c();
        }
        if (!(this.f19117a.f18013cx == 0 || this.f19134r == null || this.f19134r.f17769b == null)) {
            this.f19134r.f17769b.destroy();
        }
        if ((this.f19125i && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean z = false;
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo21255f();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f19134r == null || this.f19134r.f17768a == null)) {
            try {
                this.f19134r.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f19134r == null || this.f19134r.f17769b == null)) {
            try {
                this.f19134r.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        config config = this.f19117a;
        if (this.f19100B.contains("youtube.com") || this.f19100B.contains("youtu.be")) {
            z = true;
        }
        this.f19134r = config.mo20760a((Context) this, z);
    }

    @TargetApi(21)
    /* renamed from: g */
    private void m24185g() {
        if (VERSION.SDK_INT > 20) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f19130n, true);
        }
    }

    public void adLoaded(String str) {
        this.f19142z.cancel();
        this.f19136t.showAd();
    }

    public void onAdClosed() {
        if (this.f19139w) {
            abrir_secc(this.f19141y);
        }
    }

    public void adError(String str) {
        this.f19142z.cancel();
        abrir_secc(this.f19141y);
    }

    public void videoEnded() {
        this.f19139w = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f19142z.cancel();
        this.f19135s.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f19139w = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f19139w) {
            abrir_secc(this.f19141y);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f19139w = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f19117a.mo20775a((Context) this, this.f19136t)) {
            this.f19142z.cancel();
            abrir_secc(this.f19141y);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f19142z.cancel();
        abrir_secc(this.f19141y);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f19142z.cancel();
        this.f19137u.show();
    }

    public void onRewardedVideoCompleted() {
        this.f19139w = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f19139w) {
            abrir_secc(this.f19141y);
        }
    }

    public void onVideoCompleted() {
        this.f19139w = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f19142z.cancel();
        this.f19138v.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_html.this.f19139w) {
                    t_html.this.abrir_secc(t_html.this.f19141y);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f19142z.cancel();
        abrir_secc(this.f19141y);
    }
}
