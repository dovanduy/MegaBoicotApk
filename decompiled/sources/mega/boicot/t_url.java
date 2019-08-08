package mega.boicot;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p017v4.app.C0236a;
import android.support.p017v4.content.FileProvider;
import android.support.p017v4.widget.SwipeRefreshLayout;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.HttpAuthHandler;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebView;
import android.webkit.WebView.HitTestResult;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.appnext.ads.fullscreen.RewardedVideo;
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
import java.io.FileOutputStream;
import java.io.IOException;

public class t_url extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: A */
    RewardedVideoAd f19317A;

    /* renamed from: B */
    StartAppAd f19318B;

    /* renamed from: C */
    boolean f19319C = false;

    /* renamed from: D */
    boolean f19320D = false;

    /* renamed from: E */
    View f19321E;

    /* renamed from: F */
    ProgressDialog f19322F;

    /* renamed from: G */
    Builder f19323G;

    /* renamed from: H */
    String f19324H;

    /* renamed from: I */
    String f19325I;

    /* renamed from: J */
    String[] f19326J = {"doc", "docx", "xls", "xlsx", "ppt", "pptx", "pdf", "pages", "ai", "psd", "tiff", "dxf", "svg", "eps", "ps", "ttf", "otf", "xps", "zip", "rar"};

    /* renamed from: K */
    EditText f19327K;

    /* renamed from: L */
    EditText f19328L;

    /* renamed from: M */
    HttpAuthHandler f19329M;

    /* renamed from: N */
    ListView f19330N;

    /* renamed from: O */
    SwipeRefreshLayout f19331O;

    /* renamed from: P */
    private ValueCallback<Uri> f19332P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public ValueCallback<Uri[]> f19333Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public FrameLayout f19334R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public LinearLayout f19335S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public CustomViewCallback f19336T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public View f19337U;

    /* renamed from: V */
    private WebChromeClient f19338V;

    /* renamed from: a */
    config f19339a;

    /* renamed from: b */
    Bundle f19340b;

    /* renamed from: c */
    boolean f19341c = false;

    /* renamed from: d */
    boolean f19342d = true;

    /* renamed from: e */
    boolean f19343e = false;

    /* renamed from: f */
    boolean f19344f = true;

    /* renamed from: g */
    boolean f19345g = true;

    /* renamed from: h */
    boolean f19346h = false;

    /* renamed from: i */
    boolean f19347i = false;

    /* renamed from: j */
    boolean f19348j;

    /* renamed from: k */
    boolean f19349k = false;

    /* renamed from: l */
    boolean f19350l = false;

    /* renamed from: m */
    boolean f19351m = false;

    /* renamed from: n */
    int f19352n = 0;

    /* renamed from: o */
    int f19353o = -1;

    /* renamed from: p */
    int f19354p;

    /* renamed from: q */
    String f19355q;

    /* renamed from: r */
    String f19356r;

    /* renamed from: s */
    boolean f19357s = true;

    /* renamed from: t */
    boolean f19358t;

    /* renamed from: u */
    WebView f19359u;

    /* renamed from: v */
    Callback f19360v;

    /* renamed from: w */
    String f19361w;

    /* renamed from: x */
    C5602c f19362x;

    /* renamed from: y */
    C3166b f19363y;

    /* renamed from: z */
    RewardedVideo f19364z;

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

    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0681, code lost:
        if (r2.contains("docs.google.com") == false) goto L_0x0685;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            android.content.Context r0 = r12.getApplicationContext()
            mega.boicot.config r0 = (mega.boicot.config) r0
            r12.f19339a = r0
            mega.boicot.config r0 = r12.f19339a
            java.lang.String r0 = r0.f17881aN
            if (r0 != 0) goto L_0x0013
            mega.boicot.config r0 = r12.f19339a
            r0.mo20780b()
        L_0x0013:
            android.content.Intent r0 = r12.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            r12.f19340b = r0
            r0 = 1
            r1 = 0
            if (r13 != 0) goto L_0x003f
            android.os.Bundle r2 = r12.f19340b
            if (r2 == 0) goto L_0x003b
            android.os.Bundle r2 = r12.f19340b
            java.lang.String r3 = "es_root"
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x003b
            android.os.Bundle r2 = r12.f19340b
            java.lang.String r3 = "es_root"
            boolean r2 = r2.getBoolean(r3, r1)
            if (r2 == 0) goto L_0x003b
            r2 = r0
            goto L_0x003c
        L_0x003b:
            r2 = r1
        L_0x003c:
            r12.f19348j = r2
            goto L_0x0054
        L_0x003f:
            java.lang.String r2 = "es_root"
            boolean r2 = r13.containsKey(r2)
            if (r2 == 0) goto L_0x0051
            java.lang.String r2 = "es_root"
            boolean r2 = r13.getBoolean(r2, r1)
            if (r2 == 0) goto L_0x0051
            r2 = r0
            goto L_0x0052
        L_0x0051:
            r2 = r1
        L_0x0052:
            r12.f19348j = r2
        L_0x0054:
            mega.boicot.config r2 = r12.f19339a
            int r2 = r2.f18075l
            r3 = -1
            if (r2 == r3) goto L_0x008f
            mega.boicot.config r2 = r12.f19339a
            mega.boicot.i[] r2 = r2.f17971bz
            mega.boicot.config r4 = r12.f19339a
            int r4 = r4.f18075l
            r2 = r2[r4]
            java.lang.String r2 = r2.f18314g
            mega.boicot.config r4 = r12.f19339a
            java.lang.String r4 = r4.f17890aW
            java.lang.String r2 = mega.boicot.config.m23831a(r2, r4)
            r12.f19355q = r2
            android.os.Bundle r2 = r12.f19340b
            java.lang.String r4 = "url"
            boolean r2 = r2.containsKey(r4)
            if (r2 != 0) goto L_0x009d
            android.os.Bundle r2 = r12.f19340b
            java.lang.String r4 = "url"
            mega.boicot.config r5 = r12.f19339a
            mega.boicot.i[] r5 = r5.f17971bz
            mega.boicot.config r6 = r12.f19339a
            int r6 = r6.f18075l
            r5 = r5[r6]
            java.lang.String r5 = r5.f18312e
            r2.putString(r4, r5)
            goto L_0x009d
        L_0x008f:
            mega.boicot.config r2 = r12.f19339a
            java.lang.String r2 = r2.f17881aN
            mega.boicot.config r4 = r12.f19339a
            java.lang.String r4 = r4.f17890aW
            java.lang.String r2 = mega.boicot.config.m23831a(r2, r4)
            r12.f19355q = r2
        L_0x009d:
            super.onCreate(r13)
            android.os.Bundle r2 = r12.f19340b
            java.lang.String r4 = "url"
            java.lang.String r2 = r2.getString(r4)
            java.lang.String r4 = "forum.e-droid.net"
            boolean r2 = r2.contains(r4)
            r4 = 2
            if (r2 == 0) goto L_0x02a7
            java.lang.String r2 = "sh"
            android.content.SharedPreferences r2 = r12.getSharedPreferences(r2, r1)
            java.lang.String r5 = "idusu"
            int r5 = r2.getInt(r5, r1)
            r12.f19354p = r5
            java.lang.String r5 = "cod"
            java.lang.String r6 = ""
            java.lang.String r5 = r2.getString(r5, r6)
            r12.f19356r = r5
            mega.boicot.config r5 = r12.f19339a
            mega.boicot.i[] r5 = r5.f17971bz
            mega.boicot.config r6 = r12.f19339a
            int r6 = r6.f18075l
            r5 = r5[r6]
            int r5 = r5.f18306ax
            mega.boicot.config r6 = r12.f19339a
            mega.boicot.i[] r6 = r6.f17971bz
            mega.boicot.config r7 = r12.f19339a
            int r7 = r7.f18075l
            r6 = r6[r7]
            int r6 = r6.f18307ay
            mega.boicot.config r7 = r12.f19339a
            mega.boicot.i[] r7 = r7.f17971bz
            mega.boicot.config r8 = r12.f19339a
            int r8 = r8.f18075l
            r7 = r7[r8]
            int r7 = r7.f18308az
            mega.boicot.config r8 = r12.f19339a
            mega.boicot.i[] r8 = r8.f17971bz
            mega.boicot.config r9 = r12.f19339a
            int r9 = r9.f18075l
            r8 = r8[r9]
            int r8 = r8.f18305aw
            java.lang.String r9 = "nick"
            java.lang.String r10 = ""
            java.lang.String r9 = r2.getString(r9, r10)
            java.lang.String r10 = ""
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0280
            mega.boicot.config r9 = r12.f19339a
            int r9 = r9.f18062ed
            r10 = 3
            if (r9 != r10) goto L_0x011a
            java.lang.String r9 = "email_confirmado"
            boolean r9 = r2.getBoolean(r9, r1)
            if (r9 != 0) goto L_0x011a
            goto L_0x0280
        L_0x011a:
            if (r8 != r4) goto L_0x0128
            mega.boicot.config r8 = r12.f19339a
            java.io.File r8 = r8.mo20757a(r12, r0)
            boolean r8 = r8.exists()
            if (r8 == 0) goto L_0x015e
        L_0x0128:
            if (r5 != r4) goto L_0x0142
            java.lang.String r5 = "fnac_d"
            int r5 = r2.getInt(r5, r1)
            if (r5 == 0) goto L_0x015e
            java.lang.String r5 = "fnac_m"
            int r5 = r2.getInt(r5, r1)
            if (r5 == 0) goto L_0x015e
            java.lang.String r5 = "fnac_a"
            int r5 = r2.getInt(r5, r1)
            if (r5 == 0) goto L_0x015e
        L_0x0142:
            if (r6 != r4) goto L_0x014c
            java.lang.String r5 = "sexo"
            int r5 = r2.getInt(r5, r1)
            if (r5 == 0) goto L_0x015e
        L_0x014c:
            if (r7 != r4) goto L_0x0187
            java.lang.String r5 = "descr"
            java.lang.String r6 = ""
            java.lang.String r2 = r2.getString(r5, r6)
            java.lang.String r5 = ""
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0187
        L_0x015e:
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<mega.boicot.preperfil> r5 = mega.boicot.preperfil.class
            r2.<init>(r12, r5)
            java.lang.String r5 = "idsecc"
            mega.boicot.config r6 = r12.f19339a
            int r6 = r6.f18075l
            r2.putExtra(r5, r6)
            java.lang.String r5 = "desde_foro"
            r2.putExtra(r5, r0)
            boolean r5 = r12.f19348j
            if (r5 == 0) goto L_0x017e
            java.lang.String r5 = "es_root"
            boolean r6 = r12.f19348j
            r2.putExtra(r5, r6)
        L_0x017e:
            r12.f19348j = r1
            r12.f19341c = r0
            r12.startActivityForResult(r2, r1)
            goto L_0x02a7
        L_0x0187:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.os.Bundle r5 = r12.f19340b
            java.lang.String r6 = "url"
            java.lang.String r5 = r5.getString(r6)
            r2.append(r5)
            java.lang.String r5 = "&idusu="
            r2.append(r5)
            int r5 = r12.f19354p
            r2.append(r5)
            java.lang.String r5 = "&c="
            r2.append(r5)
            java.lang.String r5 = r12.f19356r
            r2.append(r5)
            java.lang.String r5 = "&idpais="
            r2.append(r5)
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.getCountry()
            r2.append(r5)
            java.lang.String r5 = "&idl="
            r2.append(r5)
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.getLanguage()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.os.Bundle r5 = r12.f19340b
            java.lang.String r6 = "abrir_idtema"
            boolean r5 = r5.containsKey(r6)
            if (r5 == 0) goto L_0x0278
            java.lang.String r5 = "/cats.php"
            java.lang.String r6 = "/tema.php"
            java.lang.String r2 = r2.replace(r5, r6)
            java.lang.String r5 = "/temas.php"
            java.lang.String r6 = "/tema.php"
            java.lang.String r2 = r2.replace(r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = "&idc="
            r5.append(r2)
            android.os.Bundle r2 = r12.f19340b
            java.lang.String r6 = "abrir_idcat"
            java.lang.String r2 = r2.getString(r6)
            r5.append(r2)
            java.lang.String r2 = "&idt="
            r5.append(r2)
            android.os.Bundle r2 = r12.f19340b
            java.lang.String r6 = "abrir_idtema"
            java.lang.String r2 = r2.getString(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            android.os.Bundle r5 = r12.f19340b
            java.lang.String r6 = "abrir_idresp"
            boolean r5 = r5.containsKey(r6)
            if (r5 == 0) goto L_0x024c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = "&idr_ir="
            r5.append(r2)
            android.os.Bundle r2 = r12.f19340b
            java.lang.String r6 = "abrir_idresp"
            java.lang.String r2 = r2.getString(r6)
            r5.append(r2)
            java.lang.String r2 = "#coment"
            r5.append(r2)
            android.os.Bundle r2 = r12.f19340b
            java.lang.String r6 = "idcoment_ir"
            java.lang.String r2 = r2.getString(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            goto L_0x0278
        L_0x024c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = "&idr_ir="
            r5.append(r2)
            android.os.Bundle r2 = r12.f19340b
            java.lang.String r6 = "idresp_ir"
            java.lang.String r2 = r2.getString(r6)
            r5.append(r2)
            java.lang.String r2 = "#resp"
            r5.append(r2)
            android.os.Bundle r2 = r12.f19340b
            java.lang.String r6 = "idresp_ir"
            java.lang.String r2 = r2.getString(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
        L_0x0278:
            android.os.Bundle r5 = r12.f19340b
            java.lang.String r6 = "url"
            r5.putString(r6, r2)
            goto L_0x02a7
        L_0x0280:
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<mega.boicot.chat_perfil> r5 = mega.boicot.chat_perfil.class
            r2.<init>(r12, r5)
            java.lang.String r5 = "idsecc"
            mega.boicot.config r6 = r12.f19339a
            int r6 = r6.f18075l
            r2.putExtra(r5, r6)
            java.lang.String r5 = "desde_foro"
            r2.putExtra(r5, r0)
            boolean r5 = r12.f19348j
            if (r5 == 0) goto L_0x02a0
            java.lang.String r5 = "es_root"
            boolean r6 = r12.f19348j
            r2.putExtra(r5, r6)
        L_0x02a0:
            r12.f19348j = r1
            r12.f19341c = r0
            r12.startActivityForResult(r2, r1)
        L_0x02a7:
            r2 = 2131361957(0x7f0a00a5, float:1.834368E38)
            r12.setContentView(r2)
            r12.mo21387f()
            mega.boicot.config r2 = r12.f19339a
            int r2 = r2.f18080q
            if (r2 <= 0) goto L_0x02ce
            java.lang.String r2 = "search"
            java.lang.Object r2 = r12.getSystemService(r2)
            android.app.SearchManager r2 = (android.app.SearchManager) r2
            mega.boicot.t_url$1 r5 = new mega.boicot.t_url$1
            r5.<init>()
            r2.setOnCancelListener(r5)
            mega.boicot.t_url$2 r5 = new mega.boicot.t_url$2
            r5.<init>()
            r2.setOnDismissListener(r5)
        L_0x02ce:
            mega.boicot.config r2 = r12.f19339a
            android.os.Bundle r5 = r12.f19340b
            java.lang.String r6 = "url"
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "youtube.com"
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x02f3
            android.os.Bundle r5 = r12.f19340b
            java.lang.String r6 = "url"
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "youtu.be"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x02f1
            goto L_0x02f3
        L_0x02f1:
            r5 = r1
            goto L_0x02f4
        L_0x02f3:
            r5 = r0
        L_0x02f4:
            mega.boicot.c r2 = r2.mo20760a(r12, r5)
            r12.f19362x = r2
            mega.boicot.config r2 = r12.f19339a
            mega.boicot.config r5 = r12.f19339a
            int r5 = r5.f18075l
            java.lang.String r6 = r12.f19355q
            r2.mo20767a(r12, r5, r6, r13)
            android.os.Bundle r2 = r12.f19340b
            java.lang.String r5 = "linksexternos"
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L_0x0335
            android.os.Bundle r2 = r12.f19340b
            java.lang.String r5 = "adaptar_ancho"
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L_0x0335
            android.os.Bundle r2 = r12.f19340b
            java.lang.String r5 = "linksexternos"
            boolean r2 = r2.getBoolean(r5)
            if (r2 == 0) goto L_0x0326
            r12.f19352n = r0
            goto L_0x0328
        L_0x0326:
            r12.f19352n = r1
        L_0x0328:
            android.os.Bundle r2 = r12.f19340b
            java.lang.String r5 = "adaptar_ancho"
            boolean r2 = r2.getBoolean(r5)
            r12.f19342d = r2
            r12.f19358t = r1
            goto L_0x036c
        L_0x0335:
            mega.boicot.config r2 = r12.f19339a
            int r2 = r2.f18075l
            if (r2 == r3) goto L_0x0366
            mega.boicot.config r2 = r12.f19339a
            mega.boicot.i[] r2 = r2.f17971bz
            mega.boicot.config r5 = r12.f19339a
            int r5 = r5.f18075l
            r2 = r2[r5]
            int r2 = r2.f18329v
            r12.f19352n = r2
            mega.boicot.config r2 = r12.f19339a
            mega.boicot.i[] r2 = r2.f17971bz
            mega.boicot.config r5 = r12.f19339a
            int r5 = r5.f18075l
            r2 = r2[r5]
            boolean r2 = r2.f18230A
            r12.f19342d = r2
            mega.boicot.config r2 = r12.f19339a
            mega.boicot.i[] r2 = r2.f17971bz
            mega.boicot.config r5 = r12.f19339a
            int r5 = r5.f18075l
            r2 = r2[r5]
            boolean r2 = r2.f18236G
            r12.f19358t = r2
            goto L_0x036c
        L_0x0366:
            r12.f19352n = r1
            r12.f19342d = r1
            r12.f19358t = r1
        L_0x036c:
            mega.boicot.config r2 = r12.f19339a
            int r2 = r2.f18075l
            if (r2 == r3) goto L_0x039d
            mega.boicot.config r2 = r12.f19339a
            mega.boicot.i[] r2 = r2.f17971bz
            mega.boicot.config r5 = r12.f19339a
            int r5 = r5.f18075l
            r2 = r2[r5]
            boolean r2 = r2.f18232C
            r12.f19344f = r2
            mega.boicot.config r2 = r12.f19339a
            mega.boicot.i[] r2 = r2.f17971bz
            mega.boicot.config r5 = r12.f19339a
            int r5 = r5.f18075l
            r2 = r2[r5]
            boolean r2 = r2.f18233D
            r12.f19345g = r2
            mega.boicot.config r2 = r12.f19339a
            mega.boicot.i[] r2 = r2.f17971bz
            mega.boicot.config r5 = r12.f19339a
            int r5 = r5.f18075l
            r2 = r2[r5]
            boolean r2 = r2.f18239J
            r12.f19346h = r2
            goto L_0x03a3
        L_0x039d:
            r12.f19344f = r0
            r12.f19345g = r0
            r12.f19346h = r1
        L_0x03a3:
            r2 = 2131231663(0x7f0803af, float:1.8079413E38)
            android.view.View r2 = r12.findViewById(r2)
            android.webkit.WebView r2 = (android.webkit.WebView) r2
            r12.f19359u = r2
            android.os.Bundle r2 = r12.f19340b
            java.lang.String r5 = "url"
            java.lang.String r2 = r2.getString(r5)
            java.lang.String r5 = "file://"
            boolean r2 = r2.startsWith(r5)
            r5 = 2131231221(0x7f0801f5, float:1.8078517E38)
            if (r2 == 0) goto L_0x0454
            r12.f19344f = r1
            r12.f19345g = r0
            r12.f19346h = r1
            r12.f19342d = r0
            r12.f19342d = r0
            java.lang.String r2 = ""
            java.lang.String r6 = ""
            android.os.Bundle r7 = r12.f19340b
            java.lang.String r8 = "bg1"
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto L_0x03ea
            android.os.Bundle r2 = r12.f19340b
            java.lang.String r6 = "bg1"
            java.lang.String r2 = r2.getString(r6)
            android.os.Bundle r6 = r12.f19340b
            java.lang.String r7 = "bg2"
            java.lang.String r6 = r6.getString(r7)
            goto L_0x0408
        L_0x03ea:
            mega.boicot.config r7 = r12.f19339a
            int r7 = r7.f18075l
            if (r7 == r3) goto L_0x0408
            mega.boicot.config r2 = r12.f19339a
            mega.boicot.i[] r2 = r2.f17971bz
            mega.boicot.config r6 = r12.f19339a
            int r6 = r6.f18075l
            r2 = r2[r6]
            java.lang.String r2 = r2.f18314g
            mega.boicot.config r6 = r12.f19339a
            mega.boicot.i[] r6 = r6.f17971bz
            mega.boicot.config r7 = r12.f19339a
            int r7 = r7.f18075l
            r6 = r6[r7]
            java.lang.String r6 = r6.f18315h
        L_0x0408:
            java.lang.String r7 = ""
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x048d
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r8 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r9 = new int[r4]
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "#"
            r10.append(r11)
            r10.append(r2)
            java.lang.String r2 = r10.toString()
            int r2 = android.graphics.Color.parseColor(r2)
            r9[r1] = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r10 = "#"
            r2.append(r10)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            int r2 = android.graphics.Color.parseColor(r2)
            r9[r0] = r2
            r7.<init>(r8, r9)
            android.view.View r2 = r12.findViewById(r5)
            r2.setBackgroundDrawable(r7)
            android.webkit.WebView r2 = r12.f19359u
            r2.setBackgroundColor(r1)
            goto L_0x048d
        L_0x0454:
            android.os.Bundle r2 = r12.f19340b
            java.lang.String r6 = "url"
            java.lang.String r2 = r2.getString(r6)
            java.lang.String r6 = "quiz.e-droid.net"
            boolean r2 = r2.contains(r6)
            if (r2 == 0) goto L_0x0471
            r12.f19349k = r0
            r12.f19344f = r1
            r12.f19345g = r1
            r12.f19346h = r1
            r12.f19342d = r1
            r12.f19358t = r1
            goto L_0x048d
        L_0x0471:
            android.os.Bundle r2 = r12.f19340b
            java.lang.String r6 = "url"
            java.lang.String r2 = r2.getString(r6)
            java.lang.String r6 = "forum.e-droid.net"
            boolean r2 = r2.contains(r6)
            if (r2 == 0) goto L_0x048d
            r12.f19350l = r0
            r12.f19344f = r1
            r12.f19345g = r1
            r12.f19346h = r1
            r12.f19342d = r1
            r12.f19358t = r1
        L_0x048d:
            boolean r2 = r12.f19349k
            if (r2 != 0) goto L_0x049a
            boolean r2 = r12.f19350l
            if (r2 != 0) goto L_0x049a
            android.webkit.WebView r2 = r12.f19359u
            r12.registerForContextMenu(r2)
        L_0x049a:
            r2 = 2131231442(0x7f0802d2, float:1.8078965E38)
            android.view.View r2 = r12.findViewById(r2)
            android.support.v4.widget.SwipeRefreshLayout r2 = (android.support.p017v4.widget.SwipeRefreshLayout) r2
            r12.f19331O = r2
            boolean r2 = r12.f19346h
            r6 = 20
            if (r2 == 0) goto L_0x04dc
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 <= r6) goto L_0x04d1
            android.support.v4.widget.SwipeRefreshLayout r2 = r12.f19331O
            int[] r7 = new int[r0]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "#"
            r8.append(r9)
            mega.boicot.config r9 = r12.f19339a
            java.lang.String r9 = r9.f17890aW
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r7[r1] = r8
            r2.setColorSchemeColors(r7)
        L_0x04d1:
            android.support.v4.widget.SwipeRefreshLayout r2 = r12.f19331O
            mega.boicot.t_url$3 r7 = new mega.boicot.t_url$3
            r7.<init>()
            r2.setOnRefreshListener(r7)
            goto L_0x04e1
        L_0x04dc:
            android.support.v4.widget.SwipeRefreshLayout r2 = r12.f19331O
            r2.setEnabled(r1)
        L_0x04e1:
            int r2 = r12.f19352n
            if (r2 != r4) goto L_0x04ee
            android.webkit.WebView r2 = r12.f19359u
            android.webkit.WebSettings r2 = r2.getSettings()
            r2.setSupportMultipleWindows(r0)
        L_0x04ee:
            android.webkit.WebView r2 = r12.f19359u
            mega.boicot.t_url$4 r7 = new mega.boicot.t_url$4
            r7.<init>()
            r12.f19338V = r7
            r2.setWebChromeClient(r7)
            r12.m24259g()
            android.webkit.WebView r2 = r12.f19359u
            android.webkit.WebSettings r2 = r2.getSettings()
            boolean r7 = r12.f19345g
            r2.setBuiltInZoomControls(r7)
            android.webkit.WebView r2 = r12.f19359u
            android.webkit.WebSettings r2 = r2.getSettings()
            boolean r7 = r12.f19345g
            r2.setSupportZoom(r7)
            android.webkit.WebView r2 = r12.f19359u
            android.webkit.WebSettings r2 = r2.getSettings()
            r2.setDomStorageEnabled(r0)
            android.webkit.WebView r2 = r12.f19359u
            mega.boicot.t_url$5 r7 = new mega.boicot.t_url$5
            r7.<init>()
            r2.setOnTouchListener(r7)
            android.webkit.WebView r2 = r12.f19359u
            mega.boicot.t_url$6 r7 = new mega.boicot.t_url$6
            r7.<init>()
            r2.setDownloadListener(r7)
            boolean r2 = r12.f19342d
            if (r2 == 0) goto L_0x0546
            android.webkit.WebView r2 = r12.f19359u
            android.webkit.WebSettings r2 = r2.getSettings()
            r2.setUseWideViewPort(r0)
            android.webkit.WebView r2 = r12.f19359u
            android.webkit.WebSettings r2 = r2.getSettings()
            r2.setLoadWithOverviewMode(r0)
        L_0x0546:
            r2 = 2131231328(0x7f080260, float:1.8078734E38)
            android.view.View r2 = r12.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 <= r6) goto L_0x055a
            mega.boicot.config r6 = r12.f19339a
            java.lang.String r6 = r6.f17890aW
            mega.boicot.config.m23838a(r2, r6)
        L_0x055a:
            android.webkit.WebView r6 = r12.f19359u
            mega.boicot.t_url$7 r7 = new mega.boicot.t_url$7
            r7.<init>(r2)
            r6.setWebViewClient(r7)
            android.webkit.WebView r2 = r12.f19359u
            android.webkit.WebSettings r2 = r2.getSettings()
            r2.setJavaScriptEnabled(r0)
            android.webkit.WebView r2 = r12.f19359u
            android.webkit.WebSettings r2 = r2.getSettings()
            android.webkit.WebSettings$PluginState r6 = android.webkit.WebSettings.PluginState.ON
            r2.setPluginState(r6)
            mega.boicot.config r2 = r12.f19339a
            boolean r2 = r2.f18033dR
            if (r2 == 0) goto L_0x0586
            boolean r2 = r12.f19349k
            if (r2 != 0) goto L_0x0586
            boolean r2 = r12.f19350l
            if (r2 == 0) goto L_0x059b
        L_0x0586:
            mega.boicot.config r2 = r12.f19339a
            boolean r2 = r2.f18034dS
            if (r2 != 0) goto L_0x059b
            boolean r2 = mega.boicot.config.m23858k(r12)
            if (r2 == 0) goto L_0x059b
            android.webkit.WebView r2 = r12.f19359u
            r2.clearCache(r0)
            mega.boicot.config r2 = r12.f19339a
            r2.f18034dS = r0
        L_0x059b:
            android.webkit.WebView r2 = r12.f19359u
            android.webkit.WebSettings r2 = r2.getSettings()
            android.content.Context r6 = r12.getApplicationContext()
            java.io.File r6 = r6.getCacheDir()
            java.lang.String r6 = r6.getAbsolutePath()
            r2.setAppCachePath(r6)
            android.webkit.WebView r2 = r12.f19359u
            android.webkit.WebSettings r2 = r2.getSettings()
            r2.setAppCacheEnabled(r0)
            android.webkit.WebView r2 = r12.f19359u
            android.webkit.WebSettings r2 = r2.getSettings()
            r2.setCacheMode(r3)
            boolean r2 = mega.boicot.config.m23858k(r12)
            if (r2 != 0) goto L_0x05e9
            mega.boicot.config r2 = r12.f19339a
            boolean r2 = r2.f18032dQ
            if (r2 == 0) goto L_0x05e0
            boolean r2 = r12.f19349k
            if (r2 != 0) goto L_0x05e0
            boolean r2 = r12.f19350l
            if (r2 != 0) goto L_0x05e0
            android.webkit.WebView r2 = r12.f19359u
            android.webkit.WebSettings r2 = r2.getSettings()
            r2.setCacheMode(r0)
            goto L_0x05e9
        L_0x05e0:
            android.webkit.WebView r2 = r12.f19359u
            android.webkit.WebSettings r2 = r2.getSettings()
            r2.setCacheMode(r4)
        L_0x05e9:
            java.lang.String r2 = ""
            mega.boicot.config r4 = r12.f19339a
            int r4 = r4.f18075l
            if (r4 == r3) goto L_0x0611
            mega.boicot.config r4 = r12.f19339a
            mega.boicot.i[] r4 = r4.f17971bz
            mega.boicot.config r6 = r12.f19339a
            int r6 = r6.f18075l
            r4 = r4[r6]
            java.lang.String r4 = r4.f18317j
            java.lang.String r6 = ""
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0611
            mega.boicot.config r2 = r12.f19339a
            mega.boicot.i[] r2 = r2.f17971bz
            mega.boicot.config r4 = r12.f19339a
            int r4 = r4.f18075l
            r2 = r2[r4]
            java.lang.String r2 = r2.f18317j
        L_0x0611:
            java.lang.String r4 = ""
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x063e
            android.webkit.WebView r2 = r12.f19359u
            android.webkit.WebSettings r2 = r2.getSettings()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.webkit.WebView r6 = r12.f19359u
            android.webkit.WebSettings r6 = r6.getSettings()
            java.lang.String r6 = r6.getUserAgentString()
            r4.append(r6)
            java.lang.String r6 = " Vinebre"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r2.setUserAgentString(r4)
            goto L_0x0647
        L_0x063e:
            android.webkit.WebView r4 = r12.f19359u
            android.webkit.WebSettings r4 = r4.getSettings()
            r4.setUserAgentString(r2)
        L_0x0647:
            if (r13 != 0) goto L_0x06bd
            android.os.Bundle r13 = r12.f19340b
            java.lang.String r2 = "url"
            java.lang.String r13 = r13.getString(r2)
            int r2 = r12.f19352n
            if (r2 == r0) goto L_0x0684
            java.lang.String r2 = r13.toLowerCase()
            java.lang.String r4 = ""
            java.lang.String r6 = "."
            int r6 = r2.lastIndexOf(r6)
            if (r6 == r3) goto L_0x0667
            java.lang.String r4 = r2.substring(r6)
        L_0x0667:
            java.lang.String r3 = "."
            java.lang.String r6 = ""
            java.lang.String r3 = r4.replace(r3, r6)
            java.lang.String[] r4 = r12.f19326J
            java.util.List r4 = java.util.Arrays.asList(r4)
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0684
            java.lang.String r3 = "docs.google.com"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0684
            goto L_0x0685
        L_0x0684:
            r0 = r1
        L_0x0685:
            if (r0 == 0) goto L_0x06a5
            java.lang.String r0 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r13, r0)     // Catch:{ Exception -> 0x068e }
            r13 = r0
        L_0x068e:
            android.webkit.WebView r0 = r12.f19359u
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "http://docs.google.com/viewer?embedded=true&url="
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.loadUrl(r13)
            goto L_0x06aa
        L_0x06a5:
            android.webkit.WebView r0 = r12.f19359u
            r0.loadUrl(r13)
        L_0x06aa:
            android.view.View r13 = r12.findViewById(r5)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r12.f19335S = r13
            r13 = 2131231479(0x7f0802f7, float:1.807904E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.FrameLayout r13 = (android.widget.FrameLayout) r13
            r12.f19334R = r13
        L_0x06bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_url.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21385a(int i, boolean z) {
        C5662h a = this.f19339a.mo20762a(Integer.valueOf(i), (Context) this);
        if (z) {
            this.f19341c = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", false);
            setResult(-1, intent);
            if (a.f18226a != null) {
                if (this.f19339a.f18045dm != 2) {
                    a.f18226a.putExtra("es_root", true);
                }
                this.f19348j = false;
                startActivity(a.f18226a);
            }
            finish();
            return;
        }
        startActivityForResult(a.f18226a, 0);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        getMenuInflater().inflate(R.menu.m3, contextMenu);
        HitTestResult hitTestResult = this.f19359u.getHitTestResult();
        if ((hitTestResult.getType() == 5 || hitTestResult.getType() == 8) && (config.m23853d() || !this.f19340b.getString("url").startsWith("file://"))) {
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
        boolean z = false;
        if (itemId == R.id.compartir) {
            if (this.f19340b.getString("url").startsWith("file://")) {
                Options options = new Options();
                options.inPreferredConfig = Config.ARGB_8888;
                Bitmap decodeFile = BitmapFactory.decodeFile(this.f19340b.getString("url").replace("file://", ""), options);
                try {
                    File file = new File(getCacheDir(), "images");
                    file.mkdirs();
                    StringBuilder sb = new StringBuilder();
                    sb.append(file);
                    sb.append("/temporal.png");
                    FileOutputStream fileOutputStream = new FileOutputStream(sb.toString());
                    decodeFile.compress(CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                    z = true;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (z) {
                    Uri a = FileProvider.m1223a(this, "mega.boicot.fileprovider", new File(new File(getCacheDir(), "images"), "temporal.png"));
                    if (a != null) {
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.SEND");
                        intent.addFlags(1);
                        intent.setType(getContentResolver().getType(a));
                        intent.putExtra("android.intent.extra.STREAM", a);
                        startActivity(Intent.createChooser(intent, getResources().getString(R.string.compartir)));
                    }
                }
            } else {
                String str = this.f19359u.getHitTestResult().getExtra().toString();
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", str);
                startActivity(Intent.createChooser(intent2, getResources().getString(R.string.compartir)));
            }
            return true;
        } else if (itemId != R.id.guardar) {
            return super.onContextItemSelected(menuItem);
        } else {
            if (!this.f19340b.getString("url").startsWith("file://")) {
                HitTestResult hitTestResult = this.f19359u.getHitTestResult();
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
                    this.f19339a.mo20773a(str2, str3, str4, (Context) this);
                }
            } else if (!config.m23853d() || getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", getPackageName()) != 0) {
                C0236a.m717a(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 104);
            } else {
                config.m23841a(this.f19340b.getString("url"), (Context) this);
            }
            return true;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.f19337U != null) {
                this.f19343e = false;
                this.f19338V.onHideCustomView();
                return true;
            } else if (this.f19359u.canGoBack() && !this.f19347i) {
                if (this.f19350l) {
                    try {
                        this.f19343e = false;
                        String url = this.f19359u.getUrl();
                        WebBackForwardList copyBackForwardList = this.f19359u.copyBackForwardList();
                        String url2 = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() - 1).getUrl();
                        if (!url2.contains("tema_nuevo.php") && !url2.contains("resp_nueva.php")) {
                            if (!url2.contains("coment_nuevo.php")) {
                                this.f19359u.goBack();
                            }
                        }
                        int i2 = 1;
                        while (true) {
                            if (!url2.contains("tema_nuevo.php") && !url2.contains("resp_nueva.php")) {
                                if (!url2.contains("coment_nuevo.php")) {
                                    if (!url.contains("tema_nuevo.php") && !url.contains("resp_nueva.php") && !url.contains("coment_nuevo.php")) {
                                        int i3 = i2 + 1;
                                        if (copyBackForwardList.getCurrentIndex() - i3 >= 0) {
                                            i2 = i3;
                                        }
                                    }
                                    url2 = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() - i2).getUrl();
                                    if (!url2.contains("tema_nuevo.php") && !url2.contains("resp_nueva.php") && !url2.contains("coment_nuevo.php")) {
                                        break;
                                    }
                                }
                            }
                            i2++;
                            url2 = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() - i2).getUrl();
                        }
                        this.f19359u.goBackOrForward(-i2);
                    } catch (Exception unused) {
                        this.f19343e = false;
                        this.f19359u.goBack();
                    }
                } else {
                    this.f19343e = false;
                    this.f19359u.goBack();
                }
                return true;
            } else if (this.f19348j && !this.f19343e && this.f19339a.f18059ea) {
                this.f19343e = true;
                config.m23859l(this);
                return true;
            } else if (this.f19348j && this.f19359u.getUrl() != null && (this.f19359u.getUrl().toLowerCase().contains("youtube.com") || this.f19359u.getUrl().toLowerCase().contains("youtu.be"))) {
                startActivity(new Intent(this, finalizar.class));
                finish();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onSearchRequested() {
        if (this.f19339a.f18080q == 0) {
            return false;
        }
        this.f19341c = true;
        this.f19320D = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onClick(View view) {
        if ((this.f19339a.f17986cO == null || this.f19339a.f17986cO.equals("")) && ((this.f19339a.f17985cN == null || this.f19339a.f17985cN.equals("")) && ((this.f19339a.f17988cQ == null || this.f19339a.f17988cQ.equals("")) && (this.f19339a.f17989cR == null || this.f19339a.f17989cR.equals(""))))) {
            abrir_secc(view);
            return;
        }
        if (this.f19339a.f17986cO != null && !this.f19339a.f17986cO.equals("")) {
            this.f19364z = new RewardedVideo((Context) this, this.f19339a.f17986cO);
        }
        if (this.f19339a.f17985cN != null && !this.f19339a.f17985cN.equals("")) {
            this.f19363y = C2997g.m10716a(this);
        }
        if (this.f19339a.f17988cQ != null && !this.f19339a.f17988cQ.equals("")) {
            this.f19317A = new RewardedVideoAd(this, this.f19339a.f17988cQ);
        }
        if (this.f19339a.f17989cR != null && !this.f19339a.f17989cR.equals("")) {
            this.f19318B = new StartAppAd(this);
        }
        this.f19322F = new ProgressDialog(this);
        this.f19321E = view;
        this.f19353o = -1;
        this.f19351m = false;
        if (!this.f19339a.mo20774a((Context) this, view, this.f19355q, this.f19322F, this.f19363y, this.f19364z, this.f19317A, this.f19318B)) {
            abrir_secc(view);
        }
    }

    public void abrir_secc(View view) {
        if (view != null) {
            C5662h a = this.f19339a.mo20761a(view, (Context) this);
            if (a.f18227b) {
                this.f19341c = true;
                Intent intent = new Intent();
                intent.putExtra("finalizar", true);
                intent.putExtra("finalizar_app", a.f18228c);
                setResult(-1, intent);
            }
            if (a.f18229d) {
                if (this.f19359u.getUrl() != null && (this.f19359u.getUrl().toLowerCase().contains("youtube.com") || this.f19359u.getUrl().toLowerCase().contains("youtu.be"))) {
                    this.f19359u.reload();
                }
                startActivityForResult(a.f18226a, 0);
            } else if (a.f18226a != null) {
                if (a.f18227b && this.f19339a.f18045dm != 2) {
                    a.f18226a.putExtra("es_root", true);
                }
                this.f19348j = false;
                startActivity(a.f18226a);
            }
            if (this.f19341c && !this.f19320D) {
                finish();
            }
        } else if (this.f19353o != -1) {
            mo21385a(this.f19353o, this.f19351m);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        switch (i) {
            case 102:
                if (config.m23853d() && iArr.length > 0 && strArr[0].equals("android.permission.WRITE_EXTERNAL_STORAGE") && iArr[0] == 0 && getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", getPackageName()) == 0) {
                    SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
                    this.f19339a.mo20773a(sharedPreferences.getString("descarga_url", ""), sharedPreferences.getString("descarga_mimetype", ""), sharedPreferences.getString("descarga_nombre", ""), (Context) this);
                }
                return;
            case 103:
                if (config.m23868u(this) && iArr.length > 0 && strArr[0].equals("android.permission.ACCESS_FINE_LOCATION") && iArr[0] == 0) {
                    this.f19360v.invoke(this.f19361w, true, false);
                }
                return;
            case 104:
                if (config.m23853d() && iArr.length > 0 && strArr[0].equals("android.permission.WRITE_EXTERNAL_STORAGE") && iArr[0] == 0 && getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", getPackageName()) == 0) {
                    config.m23841a(this.f19340b.getString("url"), (Context) this);
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
            if (this.f19332P != null || this.f19333Q != null) {
                if (this.f19332P != null) {
                    this.f19332P.onReceiveValue((intent == null || i2 != -1) ? null : intent.getData());
                    this.f19332P = null;
                } else if (this.f19333Q != null) {
                    if (intent != null) {
                        String dataString = intent.getDataString();
                        if (dataString != null) {
                            uriArr = new Uri[]{Uri.parse(dataString)};
                            this.f19333Q.onReceiveValue(uriArr);
                            this.f19333Q = null;
                        }
                    }
                    uriArr = null;
                    this.f19333Q.onReceiveValue(uriArr);
                    this.f19333Q = null;
                }
            }
        } else if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f19348j = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21387f() {
        int b = this.f19339a.mo20778b((Context) this);
        if (this.f19339a.f18045dm == 1) {
            this.f19330N = (ListView) findViewById(R.id.left_drawer);
            this.f19339a.mo20771a(this.f19330N);
        } else if (this.f19339a.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f19339a.f17971bz.length; i2++) {
                if (!this.f19339a.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f19339a.f17923bD.length; i3++) {
            if (this.f19339a.f17923bD[i3] > 0) {
                findViewById(this.f19339a.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f19359u.saveState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f19359u.restoreState(bundle);
    }

    public void onStop() {
        super.onStop();
        if (this.f19341c && !this.f19320D) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f19339a.f18013cx == 0 || this.f19362x == null || this.f19362x.f17768a == null)) {
            this.f19362x.f17768a.mo12167b();
        }
        if (this.f19337U != null) {
            this.f19338V.onHideCustomView();
        }
        super.onPause();
        this.f19359u.onPause();
        if (this.f19341c || isFinishing()) {
            try {
                this.f19359u.loadData("", AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING);
            } catch (Exception unused) {
            }
        }
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (!(this.f19339a.f18013cx == 0 || this.f19362x == null || this.f19362x.f17768a == null)) {
            this.f19362x.f17768a.mo12165a();
        }
        this.f19359u.onResume();
    }

    public void onDestroy() {
        if (!(this.f19339a.f18013cx == 0 || this.f19362x == null || this.f19362x.f17768a == null)) {
            this.f19362x.f17768a.mo12168c();
        }
        if (!(this.f19339a.f18013cx == 0 || this.f19362x == null || this.f19362x.f17769b == null)) {
            this.f19362x.f17769b.destroy();
        }
        if ((this.f19348j && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean z = false;
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo21387f();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f19362x == null || this.f19362x.f17768a == null)) {
            try {
                this.f19362x.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f19362x == null || this.f19362x.f17769b == null)) {
            try {
                this.f19362x.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        config config = this.f19339a;
        if (this.f19340b.getString("url").contains("youtube.com") || this.f19340b.getString("url").contains("youtu.be")) {
            z = true;
        }
        this.f19362x = config.mo20760a((Context) this, z);
    }

    @TargetApi(21)
    /* renamed from: g */
    private void m24259g() {
        if (VERSION.SDK_INT > 20) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f19359u, true);
        }
    }

    public void adLoaded(String str) {
        this.f19322F.cancel();
        this.f19364z.showAd();
    }

    public void onAdClosed() {
        if (this.f19319C) {
            abrir_secc(this.f19321E);
        }
    }

    public void adError(String str) {
        this.f19322F.cancel();
        abrir_secc(this.f19321E);
    }

    public void videoEnded() {
        this.f19319C = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f19322F.cancel();
        this.f19363y.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f19319C = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f19319C) {
            abrir_secc(this.f19321E);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f19319C = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f19339a.mo20775a((Context) this, this.f19364z)) {
            this.f19322F.cancel();
            abrir_secc(this.f19321E);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f19322F.cancel();
        abrir_secc(this.f19321E);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f19322F.cancel();
        this.f19317A.show();
    }

    public void onRewardedVideoCompleted() {
        this.f19319C = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f19319C) {
            abrir_secc(this.f19321E);
        }
    }

    public void onVideoCompleted() {
        this.f19319C = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f19322F.cancel();
        this.f19318B.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_url.this.f19319C) {
                    t_url.this.abrir_secc(t_url.this.f19321E);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f19322F.cancel();
        abrir_secc(this.f19321E);
    }
}
