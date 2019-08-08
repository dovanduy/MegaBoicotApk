package mega.boicot;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.appnext.ads.interstitial.Interstitial;
import com.appnext.core.AppnextError;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.nativeads.NativeAd;
import com.appnext.nativeads.NativeAdListener;
import com.appnext.nativeads.NativeAdRequest;
import com.appnext.nativeads.NativeAdRequest.CachingPolicy;
import com.appnext.nativeads.NativeAdRequest.CreativeType;
import com.appnext.nativeads.NativeAdRequest.VideoLength;
import com.appnext.nativeads.NativeAdRequest.VideoQuality;
import com.facebook.ads.AudienceNetworkActivity;
import com.google.android.gms.common.C3405c;
import com.p051b.p052a.p053a.C1419a;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import mega.boicot.config.C5643e;
import org.apache.p199a.p202b.C6279d;
import org.apache.p199a.p202b.p203a.C6268a;
import org.apache.p199a.p202b.p204b.C6274e;
import org.apache.p199a.p218f.p220b.C6409h;
import org.apache.p199a.p226h.C6517l;

public class preinicio extends Activity {

    /* renamed from: A */
    ProgressDialog f18359A;

    /* renamed from: B */
    ProgressDialog f18360B;

    /* renamed from: C */
    Builder f18361C;

    /* renamed from: D */
    Bitmap f18362D = null;

    /* renamed from: E */
    Bitmap f18363E = null;

    /* renamed from: F */
    SharedPreferences f18364F;

    /* renamed from: G */
    Bundle f18365G;

    /* renamed from: H */
    Thread f18366H;

    /* renamed from: I */
    CheckBox f18367I;

    /* renamed from: J */
    EditText f18368J;

    /* renamed from: K */
    C1419a f18369K;

    /* renamed from: a */
    config f18370a;

    /* renamed from: b */
    String f18371b = "";

    /* renamed from: c */
    String f18372c = "";

    /* renamed from: d */
    String f18373d = "";

    /* renamed from: e */
    String f18374e;

    /* renamed from: f */
    String f18375f;

    /* renamed from: g */
    String f18376g;

    /* renamed from: h */
    String f18377h = "splash_ani.gif";

    /* renamed from: i */
    Map<String, String> f18378i;

    /* renamed from: j */
    int f18379j;

    /* renamed from: k */
    int f18380k;

    /* renamed from: l */
    int f18381l;

    /* renamed from: m */
    int f18382m;

    /* renamed from: n */
    int f18383n;

    /* renamed from: o */
    boolean f18384o = true;

    /* renamed from: p */
    boolean f18385p = false;

    /* renamed from: q */
    boolean f18386q = false;

    /* renamed from: r */
    boolean f18387r;

    /* renamed from: s */
    boolean f18388s;

    /* renamed from: t */
    boolean f18389t;

    /* renamed from: u */
    boolean f18390u = false;

    /* renamed from: v */
    boolean f18391v = false;

    /* renamed from: w */
    boolean f18392w = false;

    /* renamed from: x */
    boolean f18393x = false;

    /* renamed from: y */
    boolean f18394y = false;

    /* renamed from: z */
    ProgressDialog f18395z;

    /* renamed from: mega.boicot.preinicio$a */
    private class C5714a extends AsyncTask<String, Void, Byte> {
        private C5714a() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:41|40|44|45|(0)|48) */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x01c5, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x01c6, code lost:
            r2 = r9;
            r9 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x01cf, code lost:
            r9.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x01d5, code lost:
            r2.disconnect();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x01c9 */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x01cf  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x01d5  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r9) {
            /*
                r8 = this;
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                boolean r9 = r9.f18392w
                r0 = 0
                if (r9 == 0) goto L_0x000c
                java.lang.Byte r9 = java.lang.Byte.valueOf(r0)
                return r9
            L_0x000c:
                java.lang.String r9 = ""
                mega.boicot.preinicio r1 = mega.boicot.preinicio.this
                boolean r1 = r1.f18387r
                if (r1 == 0) goto L_0x0016
                java.lang.String r9 = "&recup_todo=1"
            L_0x0016:
                mega.boicot.preinicio r1 = mega.boicot.preinicio.this
                android.content.SharedPreferences r1 = r1.f18364F
                java.lang.String r2 = "fultsync"
                java.lang.String r3 = "010100000000"
                java.lang.String r1 = r1.getString(r2, r3)
                java.lang.String r2 = ""
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                android.os.Bundle r3 = r3.f18365G
                if (r3 == 0) goto L_0x0063
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                android.os.Bundle r3 = r3.f18365G
                java.lang.String r4 = "notif_id"
                java.lang.String r3 = r3.getString(r4)
                if (r3 == 0) goto L_0x0063
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                android.os.Bundle r3 = r3.f18365G
                java.lang.String r4 = "notif_id"
                java.lang.String r3 = r3.getString(r4)
                java.lang.String r4 = "0"
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L_0x0063
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "&notif="
                r2.append(r3)
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                android.os.Bundle r3 = r3.f18365G
                java.lang.String r4 = "notif_id"
                java.lang.String r3 = r3.getString(r4)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
            L_0x0063:
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                android.os.Bundle r3 = r3.f18365G
                r4 = 1
                if (r3 == 0) goto L_0x00ad
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                android.os.Bundle r3 = r3.f18365G
                java.lang.String r5 = "idnotif_marcar"
                boolean r3 = r3.containsKey(r5)
                if (r3 == 0) goto L_0x00ad
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                android.content.SharedPreferences r3 = r3.f18364F
                android.content.SharedPreferences$Editor r3 = r3.edit()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "notif_"
                r5.append(r6)
                mega.boicot.preinicio r6 = mega.boicot.preinicio.this
                android.os.Bundle r6 = r6.f18365G
                java.lang.String r7 = "idnotif_marcar"
                int r6 = r6.getInt(r7)
                r5.append(r6)
                java.lang.String r6 = "_leida"
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r3.putBoolean(r5, r4)
                r3.commit()
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                android.content.Context r3 = r3.getApplicationContext()
                mega.boicot.config.m23864q(r3)
            L_0x00ad:
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                android.content.ContentResolver r3 = r3.getContentResolver()
                java.lang.String r5 = "android_id"
                java.lang.String r3 = android.provider.Settings.Secure.getString(r3, r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "http://config.e-droid.net/srv/config.php?v=33&vname="
                r5.append(r6)
                mega.boicot.preinicio r6 = mega.boicot.preinicio.this
                java.lang.String r6 = mega.boicot.config.m23857j(r6)
                r5.append(r6)
                java.lang.String r6 = "&idapp="
                r5.append(r6)
                r6 = 718963(0xaf873, float:1.007482E-39)
                r5.append(r6)
                java.lang.String r6 = "&idusu="
                r5.append(r6)
                mega.boicot.preinicio r6 = mega.boicot.preinicio.this
                int r6 = r6.f18379j
                r5.append(r6)
                java.lang.String r6 = "&cod_g="
                r5.append(r6)
                mega.boicot.preinicio r6 = mega.boicot.preinicio.this
                java.lang.String r6 = r6.f18376g
                r5.append(r6)
                java.lang.String r6 = "&pw="
                r5.append(r6)
                boolean r6 = mega.boicot.config.m23853d()
                if (r6 == 0) goto L_0x00fd
                java.lang.String r6 = "1"
                goto L_0x00ff
            L_0x00fd:
                java.lang.String r6 = "0"
            L_0x00ff:
                r5.append(r6)
                java.lang.String r6 = "&gp="
                r5.append(r6)
                mega.boicot.preinicio r6 = mega.boicot.preinicio.this
                int r6 = r6.f18382m
                r5.append(r6)
                java.lang.String r6 = "&am="
                r5.append(r6)
                mega.boicot.preinicio r6 = mega.boicot.preinicio.this
                int r6 = r6.f18383n
                r5.append(r6)
                java.lang.String r6 = "&pa_env=1&pa="
                r5.append(r6)
                java.util.Locale r6 = java.util.Locale.getDefault()
                java.lang.String r6 = r6.getCountry()
                r5.append(r6)
                java.lang.String r6 = "&pn="
                r5.append(r6)
                mega.boicot.preinicio r6 = mega.boicot.preinicio.this
                java.lang.String r6 = r6.getPackageName()
                r5.append(r6)
                java.lang.String r6 = "&fus="
                r5.append(r6)
                r5.append(r1)
                r5.append(r9)
                r5.append(r2)
                java.lang.String r9 = "&aid="
                r5.append(r9)
                r5.append(r3)
                java.lang.String r9 = r5.toString()
                r1 = -1
                java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01d9 }
                r2.<init>(r9)     // Catch:{ MalformedURLException -> 0x01d9 }
                r9 = 0
                java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x01c9 }
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x01c9 }
                r2.setDoInput(r4)     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                r9 = 10000(0x2710, float:1.4013E-41)
                r2.setConnectTimeout(r9)     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                r2.setReadTimeout(r9)     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                java.lang.String r9 = "User-Agent"
                java.lang.String r3 = "Android Vinebre Software"
                r2.setRequestProperty(r9, r3)     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                java.io.InputStream r9 = r2.getInputStream()     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                r4.<init>(r9)     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                r9.<init>()     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
            L_0x0184:
                java.lang.String r4 = r3.readLine()     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                if (r4 == 0) goto L_0x019f
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                r5.<init>()     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                r5.append(r4)     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                java.lang.String r4 = "\n"
                r5.append(r4)     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                r9.append(r4)     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                goto L_0x0184
            L_0x019f:
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                r3.f18371b = r9     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                java.lang.String r3 = r3.f18371b     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                java.lang.String r4 = "@EURO@"
                java.lang.String r5 = "€"
                java.lang.String r3 = r3.replace(r4, r5)     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                r9.f18371b = r3     // Catch:{ Exception -> 0x01c3, all -> 0x01c1 }
                if (r2 == 0) goto L_0x01bc
                r2.disconnect()
            L_0x01bc:
                java.lang.Byte r9 = java.lang.Byte.valueOf(r0)
                return r9
            L_0x01c1:
                r9 = move-exception
                goto L_0x01d3
            L_0x01c3:
                r9 = r2
                goto L_0x01c9
            L_0x01c5:
                r0 = move-exception
                r2 = r9
                r9 = r0
                goto L_0x01d3
            L_0x01c9:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r1)     // Catch:{ all -> 0x01c5 }
                if (r9 == 0) goto L_0x01d2
                r9.disconnect()
            L_0x01d2:
                return r0
            L_0x01d3:
                if (r2 == 0) goto L_0x01d8
                r2.disconnect()
            L_0x01d8:
                throw r9
            L_0x01d9:
                java.lang.Byte r9 = java.lang.Byte.valueOf(r1)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.preinicio.C5714a.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (!preinicio.this.f18392w) {
                preinicio.this.mo20868a((int) R.string.inicializando);
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x026f, code lost:
            r8 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0268, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0269, code lost:
            r2 = r0;
            r8 = null;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0261 */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:278:0x1ebf  */
        /* JADX WARNING: Removed duplicated region for block: B:279:0x1ecb  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0268 A[ExcHandler: all (r0v0 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:76:0x01fa] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.Byte r18) {
            /*
                r17 = this;
                r1 = r17
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                r2.f18378i = r3
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                java.lang.String r2 = r2.f18371b
                java.lang.String r3 = "\\]"
                java.lang.String[] r2 = r2.split(r3)
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                r4 = 0
                r3.f18371b = r4
                r3 = 0
                r5 = r3
            L_0x001c:
                r6 = 2
                r7 = 1
                int r8 = r2.length
                if (r5 >= r8) goto L_0x0065
                r8 = r2[r5]
                java.lang.String r9 = "="
                java.lang.String[] r6 = r8.split(r9, r6)
                r2[r5] = r4
                int r8 = r6.length
                if (r8 <= 0) goto L_0x0062
                r8 = r6[r3]
                boolean r8 = r8.equals(r4)
                if (r8 != 0) goto L_0x0062
                r8 = r6[r3]
                int r8 = r8.length()
                if (r8 <= r7) goto L_0x0062
                r8 = r6[r3]
                java.lang.String r8 = r8.substring(r7)
                java.lang.String r9 = ""
                int r10 = r6.length
                if (r10 <= r7) goto L_0x005b
                r10 = r6[r7]
                boolean r10 = r10.equals(r4)
                if (r10 != 0) goto L_0x005b
                r10 = r6[r7]
                int r10 = r10.length()
                if (r10 <= 0) goto L_0x005b
                r9 = r6[r7]
            L_0x005b:
                mega.boicot.preinicio r6 = mega.boicot.preinicio.this
                java.util.Map<java.lang.String, java.lang.String> r6 = r6.f18378i
                r6.put(r8, r9)
            L_0x0062:
                int r5 = r5 + 1
                goto L_0x001c
            L_0x0065:
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                r2.mo20876h()
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                java.util.Map<java.lang.String, java.lang.String> r2 = r2.f18378i
                java.lang.String r5 = "FIN"
                boolean r2 = r2.containsKey(r5)
                if (r2 != 0) goto L_0x00a5
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                java.util.Map<java.lang.String, java.lang.String> r2 = r2.f18378i
                r2.clear()
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                r2.f18384o = r3
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                int r2 = r2.f18379j
                if (r2 == 0) goto L_0x008d
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                boolean r2 = r2.f18387r
                if (r2 == 0) goto L_0x00a5
            L_0x008d:
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                r4 = 2131558582(0x7f0d00b6, float:1.8742484E38)
                java.lang.String r3 = r3.getString(r4)
                mega.boicot.preinicio r4 = mega.boicot.preinicio.this
                r5 = 2131558581(0x7f0d00b5, float:1.8742482E38)
                java.lang.String r4 = r4.getString(r5)
                r2.mo20869a(r3, r4)
                return
            L_0x00a5:
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                java.util.Map<java.lang.String, java.lang.String> r2 = r2.f18378i
                java.lang.String r5 = "APLICNODISP"
                boolean r2 = r2.containsKey(r5)
                if (r2 == 0) goto L_0x00c2
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                java.lang.String r3 = ""
                mega.boicot.preinicio r4 = mega.boicot.preinicio.this
                r5 = 2131558580(0x7f0d00b4, float:1.874248E38)
                java.lang.String r4 = r4.getString(r5)
                r2.mo20869a(r3, r4)
                return
            L_0x00c2:
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                java.lang.String r5 = "msg_err"
                java.lang.String r2 = r2.mo20865a(r5)
                java.lang.String r5 = ""
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L_0x00e0
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                java.lang.String r4 = "msg_err_tit"
                java.lang.String r3 = r3.mo20865a(r4)
                mega.boicot.preinicio r4 = mega.boicot.preinicio.this
                r4.mo20869a(r3, r2)
                return
            L_0x00e0:
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                boolean r2 = r2.f18392w
                if (r2 != 0) goto L_0x019b
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                int r2 = r2.f18382m
                if (r2 != 0) goto L_0x019b
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                android.os.Bundle r2 = r2.f18365G
                if (r2 == 0) goto L_0x0116
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                android.os.Bundle r2 = r2.f18365G
                java.lang.String r5 = "notif_id"
                java.lang.String r2 = r2.getString(r5)
                if (r2 != 0) goto L_0x019b
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                android.os.Bundle r2 = r2.f18365G
                java.lang.String r5 = "notif_idtema"
                java.lang.String r2 = r2.getString(r5)
                if (r2 != 0) goto L_0x019b
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                android.os.Bundle r2 = r2.f18365G
                java.lang.String r5 = "id_remit"
                java.lang.String r2 = r2.getString(r5)
                if (r2 != 0) goto L_0x019b
            L_0x0116:
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                java.lang.String r5 = "v"
                java.lang.String r2 = r2.mo20865a(r5)
                java.lang.String r5 = ""
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L_0x019b
                int r5 = java.lang.Integer.parseInt(r2)
                r8 = -1
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this     // Catch:{ NameNotFoundException -> 0x013e }
                android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x013e }
                mega.boicot.preinicio r10 = mega.boicot.preinicio.this     // Catch:{ NameNotFoundException -> 0x013e }
                java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x013e }
                android.content.pm.PackageInfo r9 = r9.getPackageInfo(r10, r3)     // Catch:{ NameNotFoundException -> 0x013e }
                int r9 = r9.versionCode     // Catch:{ NameNotFoundException -> 0x013e }
                goto L_0x013f
            L_0x013e:
                r9 = r8
            L_0x013f:
                if (r9 == r8) goto L_0x019b
                if (r9 >= r5) goto L_0x019b
                android.app.AlertDialog$Builder r4 = new android.app.AlertDialog$Builder
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                r4.<init>(r5)
                android.app.AlertDialog$Builder r3 = r4.setCancelable(r3)
                mega.boicot.preinicio r4 = mega.boicot.preinicio.this
                r5 = 2131558565(0x7f0d00a5, float:1.874245E38)
                java.lang.String r4 = r4.getString(r5)
                mega.boicot.preinicio$a$1 r5 = new mega.boicot.preinicio$a$1
                r5.<init>(r2)
                android.app.AlertDialog$Builder r2 = r3.setPositiveButton(r4, r5)
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                android.content.res.Resources r3 = r3.getResources()
                r4 = 2131558680(0x7f0d0118, float:1.8742683E38)
                java.lang.String r3 = r3.getString(r4)
                android.app.AlertDialog$Builder r2 = r2.setMessage(r3)
                android.app.AlertDialog r2 = r2.create()
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                java.lang.String r3 = r3.f18375f
                java.lang.String r4 = ""
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L_0x0189
                mega.boicot.preinicio$a$2 r3 = new mega.boicot.preinicio$a$2
                r3.<init>(r2)
                r2.setOnShowListener(r3)
            L_0x0189:
                r2.show()     // Catch:{ Exception -> 0x018c }
            L_0x018c:
                r3 = 16908299(0x102000b, float:2.387726E-38)
                android.view.View r2 = r2.findViewById(r3)     // Catch:{ Exception -> 0x019a }
                android.widget.TextView r2 = (android.widget.TextView) r2     // Catch:{ Exception -> 0x019a }
                android.graphics.Typeface r3 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x019a }
                r2.setTypeface(r3)     // Catch:{ Exception -> 0x019a }
            L_0x019a:
                return
            L_0x019b:
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                android.content.SharedPreferences r2 = r2.f18364F
                android.content.SharedPreferences$Editor r2 = r2.edit()
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "idusu"
                java.lang.String r5 = r5.mo20865a(r8)
                java.lang.String r8 = ""
                boolean r8 = r5.equals(r8)
                if (r8 != 0) goto L_0x0271
                mega.boicot.preinicio r8 = mega.boicot.preinicio.this
                java.lang.String r9 = "cod"
                r8.mo20866a(r9, r6, r2)
                mega.boicot.preinicio r8 = mega.boicot.preinicio.this
                int r9 = java.lang.Integer.parseInt(r5)
                r8.f18379j = r9
                java.lang.String r8 = "idusu"
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                int r9 = r9.f18379j
                r2.putInt(r8, r9)
                mega.boicot.preinicio r8 = mega.boicot.preinicio.this
                java.lang.String r9 = "cod_g"
                java.lang.String r8 = r8.mo20865a(r9)
                java.lang.String r9 = ""
                boolean r9 = r8.equals(r9)
                if (r9 == 0) goto L_0x01df
                mega.boicot.preinicio r8 = mega.boicot.preinicio.this
                java.lang.String r8 = r8.f18376g
            L_0x01df:
                java.lang.String r9 = ""
                boolean r9 = r8.equals(r9)
                if (r9 != 0) goto L_0x01f4
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                r9.f18376g = r8
                java.lang.String r8 = "cod_g"
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.String r9 = r9.f18376g
                r2.putString(r8, r9)
            L_0x01f4:
                boolean r8 = mega.boicot.config.m23853d()
                if (r8 == 0) goto L_0x0271
                java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x026f, all -> 0x0268 }
                java.io.File r9 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x026f, all -> 0x0268 }
                mega.boicot.preinicio r10 = mega.boicot.preinicio.this     // Catch:{ Exception -> 0x026f, all -> 0x0268 }
                java.lang.String r10 = r10.getPackageName()     // Catch:{ Exception -> 0x026f, all -> 0x0268 }
                r8.<init>(r9, r10)     // Catch:{ Exception -> 0x026f, all -> 0x0268 }
                boolean r9 = r8.exists()     // Catch:{ Exception -> 0x026f, all -> 0x0268 }
                if (r9 != 0) goto L_0x0221
                r8.mkdir()     // Catch:{ Exception -> 0x026f, all -> 0x0268 }
                java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x026f, all -> 0x0268 }
                java.lang.String r10 = ".nomedia"
                r9.<init>(r8, r10)     // Catch:{ Exception -> 0x026f, all -> 0x0268 }
                r9.createNewFile()     // Catch:{ Exception -> 0x021d, all -> 0x0268 }
                goto L_0x0221
            L_0x021d:
                r0 = move-exception
                r0.printStackTrace()     // Catch:{ Exception -> 0x026f, all -> 0x0268 }
            L_0x0221:
                java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x026f, all -> 0x0268 }
                java.lang.String r10 = "vinebre_ac.txt"
                r9.<init>(r8, r10)     // Catch:{ Exception -> 0x026f, all -> 0x0268 }
                java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x026f, all -> 0x0268 }
                r8.<init>(r9)     // Catch:{ Exception -> 0x026f, all -> 0x0268 }
                java.io.BufferedWriter r9 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0261, all -> 0x0265 }
                java.io.OutputStreamWriter r10 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0261, all -> 0x0265 }
                r10.<init>(r8)     // Catch:{ Exception -> 0x0261, all -> 0x0265 }
                r9.<init>(r10)     // Catch:{ Exception -> 0x0261, all -> 0x0265 }
                mega.boicot.preinicio r10 = mega.boicot.preinicio.this     // Catch:{ Exception -> 0x0261, all -> 0x0265 }
                java.lang.String r10 = r10.f18376g     // Catch:{ Exception -> 0x0261, all -> 0x0265 }
                java.lang.String r11 = ""
                boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x0261, all -> 0x0265 }
                if (r10 != 0) goto L_0x025b
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0261, all -> 0x0265 }
                r10.<init>()     // Catch:{ Exception -> 0x0261, all -> 0x0265 }
                r10.append(r5)     // Catch:{ Exception -> 0x0261, all -> 0x0265 }
                java.lang.String r5 = "@"
                r10.append(r5)     // Catch:{ Exception -> 0x0261, all -> 0x0265 }
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this     // Catch:{ Exception -> 0x0261, all -> 0x0265 }
                java.lang.String r5 = r5.f18376g     // Catch:{ Exception -> 0x0261, all -> 0x0265 }
                r10.append(r5)     // Catch:{ Exception -> 0x0261, all -> 0x0265 }
                java.lang.String r5 = r10.toString()     // Catch:{ Exception -> 0x0261, all -> 0x0265 }
            L_0x025b:
                r9.write(r5)     // Catch:{ Exception -> 0x0261, all -> 0x0265 }
                r9.close()     // Catch:{ Exception -> 0x0261, all -> 0x0265 }
            L_0x0261:
                r8.close()     // Catch:{ Exception -> 0x0271 }
                goto L_0x0271
            L_0x0265:
                r0 = move-exception
                r2 = r0
                goto L_0x026b
            L_0x0268:
                r0 = move-exception
                r2 = r0
                r8 = r4
            L_0x026b:
                r8.close()     // Catch:{ Exception -> 0x026e }
            L_0x026e:
                throw r2
            L_0x026f:
                r8 = r4
                goto L_0x0261
            L_0x0271:
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                boolean r5 = r5.f18392w
                if (r5 != 0) goto L_0x02bd
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                boolean r5 = r5.m23960p()
                if (r5 == 0) goto L_0x02bc
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                android.content.SharedPreferences r5 = r5.f18364F
                java.lang.String r8 = "SENT_TOKEN_TO_SERVER"
                boolean r5 = r5.getBoolean(r8, r3)
                if (r5 != 0) goto L_0x0299
                android.content.Intent r5 = new android.content.Intent
                mega.boicot.preinicio r8 = mega.boicot.preinicio.this
                java.lang.Class<mega.boicot.RegistrationIntentService> r9 = mega.boicot.RegistrationIntentService.class
                r5.<init>(r8, r9)
                mega.boicot.preinicio r8 = mega.boicot.preinicio.this
                r8.startService(r5)
            L_0x0299:
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                android.content.pm.PackageManager r5 = r5.getPackageManager()
                java.lang.String r8 = "android.permission.ACCESS_FINE_LOCATION"
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.String r9 = r9.getPackageName()
                int r5 = r5.checkPermission(r8, r9)
                if (r5 != 0) goto L_0x02bd
                android.content.Intent r5 = new android.content.Intent
                mega.boicot.preinicio r8 = mega.boicot.preinicio.this
                java.lang.Class<mega.boicot.s_obtenerpos> r9 = mega.boicot.s_obtenerpos.class
                r5.<init>(r8, r9)
                mega.boicot.preinicio r8 = mega.boicot.preinicio.this
                r8.startService(r5)
                goto L_0x02bd
            L_0x02bc:
                return
            L_0x02bd:
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "f_p_elim"
                java.lang.String r5 = r5.mo20865a(r8)
                java.lang.String r8 = "1"
                boolean r5 = r5.equals(r8)
                if (r5 == 0) goto L_0x02e0
                boolean r5 = mega.boicot.config.m23853d()
                if (r5 == 0) goto L_0x02e0
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this     // Catch:{ Exception -> 0x02e0 }
                mega.boicot.config r5 = r5.f18370a     // Catch:{ Exception -> 0x02e0 }
                mega.boicot.preinicio r8 = mega.boicot.preinicio.this     // Catch:{ Exception -> 0x02e0 }
                java.io.File r5 = r5.mo20757a(r8, r7)     // Catch:{ Exception -> 0x02e0 }
                r5.delete()     // Catch:{ Exception -> 0x02e0 }
            L_0x02e0:
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "splash"
                java.lang.String r5 = r5.mo20865a(r8)
                java.lang.String r8 = ""
                boolean r5 = r5.equals(r8)
                if (r5 != 0) goto L_0x0305
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c1_sp"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c2_sp"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "sp_i"
                r5.mo20866a(r8, r6, r2)
            L_0x0305:
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.util.Map<java.lang.String, java.lang.String> r5 = r5.f18378i
                java.lang.String r8 = "adotro2_cod"
                boolean r5 = r5.containsKey(r8)
                if (r5 == 0) goto L_0x031f
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "adotro2_cod"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "adotro2_tipo"
                r5.mo20866a(r8, r7, r2)
            L_0x031f:
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ico_share_ord"
                java.lang.String r5 = r5.mo20865a(r8)
                java.lang.String r8 = ""
                boolean r5 = r5.equals(r8)
                if (r5 != 0) goto L_0x08b9
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "nd_t"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "nd_s"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "nd_u"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "nd_i"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ico_ofics_ord"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ico_share_ord"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ico_busc_ord"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ico_exit_ord"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ico_notif_ord"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ic_po"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ic_so"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "io1"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "io2"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "io3"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "io4"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ib1"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ib2"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ib3"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ib4"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "is1"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "is2"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "is3"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "is4"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ir1"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ir2"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ir3"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ir4"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ie1"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ie2"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ie3"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ie4"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "in1"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "in2"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "in3"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "in4"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ip1"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ip2"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ip3"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ip4"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ip5"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "share_subject"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "share_text"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "tcn"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "admob_cod"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "admob_pos"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "admob_sma"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "fbb"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "fbi"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "fbm"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "fbp"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "fbr"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "stb"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "sti"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "stm"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "stp"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "str"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "a_ra"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "n_ra"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "f_ra"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "st_ra"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "a_p_c"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "n_p_c"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "a_m_c"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "n_m_c"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "a_r_c"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "n_r_c"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "a_p_s"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "a_m_s"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "r_mo"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "r_ms"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.util.Map<java.lang.String, java.lang.String> r5 = r5.f18378i
                java.lang.String r8 = "ca_a"
                boolean r5 = r5.containsKey(r8)
                if (r5 == 0) goto L_0x0548
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                mega.boicot.config r5 = r5.f18370a
                r5.f18044dc = r7
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ca_a"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ca_n"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ca_f"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ca_s"
                r5.mo20866a(r8, r6, r2)
                goto L_0x054e
            L_0x0548:
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                mega.boicot.config r5 = r5.f18370a
                r5.f18044dc = r3
            L_0x054e:
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "fca"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "a"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "our"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "admob_int_cod"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "admob_int_v"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "admob_inte_v"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "admob_ch_v"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "b_c"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "l_c"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "fp"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "cvm"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "emo"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "i"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "i2"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "cb"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "vp"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "mv"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "r_p"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "r_t_c"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "r_a_s"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "r_s_s"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "r_a_b"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "r_s_b"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "r_a_c"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "r_s_c"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "apn_v"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "acad"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "appnext_ch_v"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "appnext_cod"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "appnext_cod_int_e"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "appnext_cod_int_ia"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "ap"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "mu"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "appnextb_cod"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "admob_int_exit_v"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "admob_int_exit_r"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "adotro_cod"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "mf_v"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "tipomenu"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "petic_ask_nombre"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "petic_ask_email"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "petic_ask_tel"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c1"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c2"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_icos"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_icos_t"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_secc_noactiv"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_secc_activ"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_linea"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "t_ind"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_ind"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "t_mas"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "sep_secc"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_sep_secc"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c1_ofic"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c2_ofic"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "m_ssl"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_tit_ofic"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_sep_ofic"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_ico_sep_ofic"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_txt_ofic"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_icos_ofic"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_ir_ofic"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c1_prods"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c2_prods"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_txt_prods"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_icos_prods"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_icos_2_prods"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_tit_prods"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_sep_prods"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_ico_sep_prods"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c1_prods_l"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c2_prods_l"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_perprod"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_tit_prods_l"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_precio_prods_l"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_antiguedad_prods_l"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "c_prods_det"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "splash_w"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "s_v"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "s_h"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "m_ncols"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "m_padding"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "m_txt_radius"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "m_mostrar_icos"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "m_mostrar_txt"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "m_icos_izq"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "m_anim"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "m_c"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "m_txt_c"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "m_txt_b"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "m_e"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "m_txt_bg"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "m_txt_col"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "m_c1"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "m_c2"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "msl_c"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "fm"
                java.lang.String r5 = r5.mo20866a(r8, r7, r2)
                java.lang.String r8 = "1"
                boolean r8 = r5.equals(r8)
                if (r8 == 0) goto L_0x080b
                java.lang.String r5 = "act_fm"
                r2.putBoolean(r5, r7)
                goto L_0x0818
            L_0x080b:
                java.lang.String r8 = "0"
                boolean r5 = r5.equals(r8)
                if (r5 == 0) goto L_0x0818
                java.lang.String r5 = "act_fm"
                r2.putBoolean(r5, r3)
            L_0x0818:
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "vf"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "dom"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "fb_m"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "vcn"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "hcn"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "conf_ex"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "pp"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "notif_int"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "bv_txt"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "bv_tit"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "bv_nomas_mostrar"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "bv_nomas_def"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "rt_tit"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "rt_txt"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "rt_ok"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "rt_ko"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "rt_1v"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "rt_int"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "pwd"
                java.lang.String r5 = r5.mo20866a(r8, r7, r2)
                java.lang.String r8 = "0"
                boolean r8 = r5.equals(r8)
                if (r8 == 0) goto L_0x08ac
                java.lang.String r5 = "pwd_validado"
                r2.putBoolean(r5, r7)
                goto L_0x08b9
            L_0x08ac:
                java.lang.String r8 = "1"
                boolean r5 = r5.equals(r8)
                if (r5 == 0) goto L_0x08b9
                java.lang.String r5 = "pwd_validado"
                r2.putBoolean(r5, r3)
            L_0x08b9:
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "busc_campos"
                java.lang.String r5 = r5.mo20865a(r8)
                java.lang.String r8 = ""
                boolean r5 = r5.equals(r8)
                if (r5 != 0) goto L_0x091d
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "divisa"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "busc_campos"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "busc_orden"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "busc_def"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "prods_tit"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "prods_masinfo"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "prods_comprar"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "prods_masinfo_mostrar"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "prods_linksexternos"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "prods_adaptar_ancho"
                r5.mo20866a(r8, r7, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "pp_email"
                r5.mo20866a(r8, r6, r2)
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                java.lang.String r8 = "pp_div"
                r5.mo20866a(r8, r6, r2)
            L_0x091d:
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                android.content.SharedPreferences r5 = r5.f18364F
                java.lang.String r8 = "nsecc"
                int r5 = r5.getInt(r8, r3)
                mega.boicot.preinicio r8 = mega.boicot.preinicio.this
                java.lang.String r9 = "nsecc"
                java.lang.String r8 = r8.mo20865a(r9)
                java.lang.String r9 = ""
                boolean r9 = r8.equals(r9)
                if (r9 != 0) goto L_0x0940
                int r5 = java.lang.Integer.parseInt(r8)
                java.lang.String r8 = "nsecc"
                r2.putInt(r8, r5)
            L_0x0940:
                if (r5 != 0) goto L_0x0953
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                java.lang.String r3 = ""
                mega.boicot.preinicio r4 = mega.boicot.preinicio.this
                r5 = 2131558583(0x7f0d00b7, float:1.8742486E38)
                java.lang.String r4 = r4.getString(r5)
                r2.mo20869a(r3, r4)
                return
            L_0x0953:
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                android.content.SharedPreferences r5 = r5.f18364F
                java.lang.String r8 = "idseccs"
                java.lang.String r9 = ""
                java.lang.String r5 = r5.getString(r8, r9)
                mega.boicot.preinicio r8 = mega.boicot.preinicio.this
                java.lang.String r9 = "idseccs"
                java.lang.String r8 = r8.mo20865a(r9)
                java.lang.String r9 = ""
                boolean r9 = r8.equals(r9)
                if (r9 != 0) goto L_0x0975
                java.lang.String r5 = "idseccs"
                r2.putString(r5, r8)
                r5 = r8
            L_0x0975:
                java.lang.String r8 = ","
                java.lang.String[] r5 = r5.split(r8)
                r8 = r3
                r9 = r8
            L_0x097d:
                int r10 = r5.length
                if (r8 >= r10) goto L_0x1986
                r10 = r5[r8]
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_ord"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                java.lang.String r11 = r11.mo20865a(r12)
                java.lang.String r12 = ""
                boolean r11 = r11.equals(r12)
                if (r11 != 0) goto L_0x1398
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_ord"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_tit"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_de"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_k"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_i"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_idgo"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_ocu"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_tp"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_r"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_d"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_r_m"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_ext"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_adapt"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_stream"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_idfondo"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_vf"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_fondo_modif"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_tipo"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_url"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_ua"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_html"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_pur"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_loa"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_zoo"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_i1"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_i2"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_c1"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_c2"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_c_peritem"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_c_tit"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_c_fecha"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_mostrar_img"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_mostrar_fecha"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_v"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_ptit"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_ptxt"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_pwd"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                java.lang.String r11 = r11.mo20866a(r12, r7, r2)
                java.lang.String r12 = "0"
                boolean r12 = r11.equals(r12)
                if (r12 == 0) goto L_0x0db0
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "chat"
                r11.append(r12)
                r11.append(r10)
                java.lang.String r12 = "_validado"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                r2.putBoolean(r11, r7)
                goto L_0x0dd1
            L_0x0db0:
                java.lang.String r12 = "1"
                boolean r11 = r11.equals(r12)
                if (r11 == 0) goto L_0x0dd1
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "chat"
                r11.append(r12)
                r11.append(r10)
                java.lang.String r12 = "_validado"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                r2.putBoolean(r11, r3)
            L_0x0dd1:
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_f_perfil"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_f_p_amp"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_f_chat"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_priv"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_accext"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_cat"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_sub"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_fnac"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_sexo"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_descr"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_dist"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_com"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_gal"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_fdist"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_fsexo"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_fn"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_fedad1"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_fedad2"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_fdist_d"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_fsexo_d"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_fedad1_d"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_fedad2_d"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_i16"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_t_di"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_t_mp"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_t_mv"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_t_de"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_t_fa"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_t_ul"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_t_pr"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_cats"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_ncols"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_padding"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_txt_radius"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_mostrar_icos"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_mostrar_txt"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_icos_izq"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_anim"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_c"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_txt_c"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_txt_b"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_e"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_txt_bg"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_txt_col"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_seccs"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r6, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_ico_id"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_v_ico"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_w_ico"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_h_ico"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_ico"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                java.lang.String r11 = r11.mo20866a(r12, r7, r2)
                java.lang.String r12 = "0"
                boolean r11 = r11.equals(r12)
                if (r11 == 0) goto L_0x1356
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "img_s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_ico"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.deleteFile(r12)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "img_s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_ico_g"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.deleteFile(r12)
            L_0x1356:
                if (r9 != 0) goto L_0x1398
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.String r11 = "wv_sc"
                r9.mo20866a(r11, r7, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.String r11 = "wv_sc_txt"
                r9.mo20866a(r11, r6, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.String r11 = "wv_c"
                r9.mo20866a(r11, r7, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.String r11 = "rss_i"
                r9.mo20866a(r11, r7, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.String r11 = "rss_n"
                r9.mo20866a(r11, r7, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.String r11 = "rss_t"
                r9.mo20866a(r11, r6, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.String r11 = "vfs"
                r9.mo20866a(r11, r7, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.String r11 = "vls"
                r9.mo20866a(r11, r7, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.String r11 = "vc"
                r9.mo20866a(r11, r7, r2)
                r9 = r7
            L_0x1398:
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.String r12 = "vcv"
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_ntemas"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                android.content.SharedPreferences r11 = r11.f18364F
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_idtemas"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                java.lang.String r13 = ""
                r11.getString(r12, r13)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_idtemas"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                java.lang.String r11 = r11.mo20865a(r12)
                java.lang.String r12 = ""
                boolean r12 = r11.equals(r12)
                if (r12 != 0) goto L_0x1416
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_idtemas"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r2.putString(r12, r11)
            L_0x1416:
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_nitems"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r11.mo20866a(r12, r7, r2)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                android.content.SharedPreferences r11 = r11.f18364F
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "s"
                r12.append(r13)
                r12.append(r10)
                java.lang.String r13 = "_iditems"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                java.lang.String r13 = ""
                java.lang.String r11 = r11.getString(r12, r13)
                mega.boicot.preinicio r12 = mega.boicot.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "s"
                r13.append(r14)
                r13.append(r10)
                java.lang.String r14 = "_iditems"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.String r12 = r12.mo20865a(r13)
                java.lang.String r13 = ""
                boolean r13 = r12.equals(r13)
                if (r13 != 0) goto L_0x148f
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r13 = "s"
                r11.append(r13)
                r11.append(r10)
                java.lang.String r10 = "_iditems"
                r11.append(r10)
                java.lang.String r10 = r11.toString()
                r2.putString(r10, r12)
                goto L_0x1490
            L_0x148f:
                r12 = r11
            L_0x1490:
                java.lang.String r10 = ""
                boolean r10 = r12.equals(r10)
                if (r10 != 0) goto L_0x1980
                java.lang.String r10 = ","
                java.lang.String[] r10 = r12.split(r10)
                r11 = r3
            L_0x149f:
                int r12 = r10.length
                if (r11 >= r12) goto L_0x1980
                r12 = r10[r11]
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_ord"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                java.lang.String r13 = r13.mo20865a(r14)
                java.lang.String r14 = ""
                boolean r13 = r13.equals(r14)
                if (r13 != 0) goto L_0x1879
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_ord"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_tit1"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r6, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_tit1_c"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_fcab_id"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_fcab_modif"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_fcab_c"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_fcab_url"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r6, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_tit2"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r6, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_tit2_c"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_txt"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r6, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_txt_c"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_txt_h"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_fotos_pos"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_fotos_c"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_fotos_h"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_fcab_z"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_fotos_z"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_tit1_b"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_tit1_i"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_tit1_f"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_tit1_col"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r6, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_tit1_u"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_tit1_s"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_tit2_b"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_tit2_i"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_tit2_f"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_tit2_col"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r6, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_tit2_u"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_tit2_s"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_txt_b"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_txt_i"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_txt_f"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_txt_col"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r6, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_txt_u"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_txt_s"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
            L_0x1879:
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_nfotos"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13.mo20866a(r14, r7, r2)
                mega.boicot.preinicio r13 = mega.boicot.preinicio.this
                android.content.SharedPreferences r13 = r13.f18364F
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "it"
                r14.append(r15)
                r14.append(r12)
                java.lang.String r15 = "_idfotos"
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                java.lang.String r15 = ""
                java.lang.String r13 = r13.getString(r14, r15)
                mega.boicot.preinicio r14 = mega.boicot.preinicio.this
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r4 = "it"
                r15.append(r4)
                r15.append(r12)
                java.lang.String r4 = "_idfotos"
                r15.append(r4)
                java.lang.String r4 = r15.toString()
                java.lang.String r4 = r14.mo20865a(r4)
                mega.boicot.preinicio r14 = mega.boicot.preinicio.this
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r3 = "it"
                r15.append(r3)
                r15.append(r12)
                java.lang.String r3 = "_nfotos"
                r15.append(r3)
                java.lang.String r3 = r15.toString()
                java.lang.String r3 = r14.mo20865a(r3)
                java.lang.String r14 = ""
                boolean r3 = r3.equals(r14)
                if (r3 != 0) goto L_0x190e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r13 = "it"
                r3.append(r13)
                r3.append(r12)
                java.lang.String r12 = "_idfotos"
                r3.append(r12)
                java.lang.String r3 = r3.toString()
                r2.putString(r3, r4)
                r13 = r4
            L_0x190e:
                java.lang.String r3 = ""
                boolean r3 = r13.equals(r3)
                if (r3 != 0) goto L_0x197a
                java.lang.String r3 = ","
                java.lang.String[] r3 = r13.split(r3)
                r4 = 0
            L_0x191d:
                int r12 = r3.length
                if (r4 >= r12) goto L_0x197a
                mega.boicot.preinicio r12 = mega.boicot.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "it_f"
                r13.append(r14)
                r14 = r3[r4]
                r13.append(r14)
                java.lang.String r14 = "_ord"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r12.mo20866a(r13, r7, r2)
                mega.boicot.preinicio r12 = mega.boicot.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "it_f"
                r13.append(r14)
                r14 = r3[r4]
                r13.append(r14)
                java.lang.String r14 = "_modif"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r12.mo20866a(r13, r7, r2)
                mega.boicot.preinicio r12 = mega.boicot.preinicio.this
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "it_f"
                r13.append(r14)
                r14 = r3[r4]
                r13.append(r14)
                java.lang.String r14 = "_url"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                r12.mo20866a(r13, r6, r2)
                int r4 = r4 + 1
                goto L_0x191d
            L_0x197a:
                int r11 = r11 + 1
                r3 = 0
                r4 = 0
                goto L_0x149f
            L_0x1980:
                int r8 = r8 + 1
                r3 = 0
                r4 = 0
                goto L_0x097d
            L_0x1986:
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                android.content.SharedPreferences r3 = r3.f18364F
                java.lang.String r4 = "noficc"
                r8 = 0
                r3.getInt(r4, r8)
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                java.lang.String r4 = "noficc"
                java.lang.String r3 = r3.mo20865a(r4)
                java.lang.String r4 = ""
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x19a9
                int r4 = java.lang.Integer.parseInt(r3)
                java.lang.String r8 = "noficc"
                r2.putInt(r8, r4)
            L_0x19a9:
                mega.boicot.preinicio r4 = mega.boicot.preinicio.this
                android.content.SharedPreferences r4 = r4.f18364F
                java.lang.String r8 = "idofics"
                java.lang.String r9 = ""
                java.lang.String r4 = r4.getString(r8, r9)
                mega.boicot.preinicio r8 = mega.boicot.preinicio.this
                java.lang.String r9 = "idofics"
                java.lang.String r8 = r8.mo20865a(r9)
                java.lang.String r9 = ""
                boolean r9 = r8.equals(r9)
                if (r9 == 0) goto L_0x19d0
                java.lang.String r9 = ""
                boolean r3 = r3.equals(r9)
                if (r3 != 0) goto L_0x19ce
                goto L_0x19d0
            L_0x19ce:
                r3 = 0
                goto L_0x19d7
            L_0x19d0:
                java.lang.String r3 = "idofics"
                r2.putString(r3, r8)
                r4 = r8
                goto L_0x19ce
            L_0x19d7:
                java.lang.String[] r8 = new java.lang.String[r3]
                java.lang.String r3 = ""
                boolean r3 = r4.equals(r3)
                if (r3 != 0) goto L_0x1cfc
                java.lang.String r3 = ","
                java.lang.String[] r8 = r4.split(r3)
                r3 = 0
            L_0x19e8:
                int r4 = r8.length
                if (r3 >= r4) goto L_0x1cfc
                r4 = r8[r3]
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_ord"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                java.lang.String r9 = r9.mo20865a(r10)
                java.lang.String r10 = ""
                boolean r9 = r9.equals(r10)
                if (r9 != 0) goto L_0x1c12
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_ord"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r7, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_tit"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r6, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_dir1"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r6, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_dir2"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r6, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_cp"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r6, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_pob"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r6, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_prov"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r6, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_tel1"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r6, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_tel2"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r6, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_horario"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r6, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_x"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r7, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_y"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r7, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_z"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r7, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_email"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r6, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_t_email"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r7, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_web"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r6, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_wp"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r7, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_chat"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r7, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_zoo"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r7, r2)
            L_0x1c12:
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_nfotos"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.mo20866a(r10, r7, r2)
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                android.content.SharedPreferences r9 = r9.f18364F
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "o"
                r10.append(r11)
                r10.append(r4)
                java.lang.String r11 = "_idfotos"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                java.lang.String r11 = ""
                java.lang.String r9 = r9.getString(r10, r11)
                mega.boicot.preinicio r10 = mega.boicot.preinicio.this
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "o"
                r11.append(r12)
                r11.append(r4)
                java.lang.String r12 = "_idfotos"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                java.lang.String r10 = r10.mo20865a(r11)
                mega.boicot.preinicio r11 = mega.boicot.preinicio.this
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "o"
                r12.append(r13)
                r12.append(r4)
                java.lang.String r13 = "_nfotos"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                java.lang.String r11 = r11.mo20865a(r12)
                java.lang.String r12 = ""
                boolean r11 = r11.equals(r12)
                if (r11 != 0) goto L_0x1ca7
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r11 = "o"
                r9.append(r11)
                r9.append(r4)
                java.lang.String r4 = "_idfotos"
                r9.append(r4)
                java.lang.String r4 = r9.toString()
                r2.putString(r4, r10)
                r9 = r10
            L_0x1ca7:
                java.lang.String r4 = ""
                boolean r4 = r9.equals(r4)
                if (r4 != 0) goto L_0x1cf8
                java.lang.String r4 = ","
                java.lang.String[] r4 = r9.split(r4)
                r9 = 0
            L_0x1cb6:
                int r10 = r4.length
                if (r9 >= r10) goto L_0x1cf8
                mega.boicot.preinicio r10 = mega.boicot.preinicio.this
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "o_f"
                r11.append(r12)
                r12 = r4[r9]
                r11.append(r12)
                java.lang.String r12 = "_ord"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                r10.mo20866a(r11, r7, r2)
                mega.boicot.preinicio r10 = mega.boicot.preinicio.this
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "o_f"
                r11.append(r12)
                r12 = r4[r9]
                r11.append(r12)
                java.lang.String r12 = "_modif"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                r12 = 10
                r10.mo20866a(r11, r12, r2)
                int r9 = r9 + 1
                goto L_0x1cb6
            L_0x1cf8:
                int r3 = r3 + 1
                goto L_0x19e8
            L_0x1cfc:
                r2.commit()
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                java.lang.String r4 = "cats"
                java.lang.String r3 = r3.mo20865a(r4)
                java.lang.String r4 = ""
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x1d7d
                mega.boicot.k r4 = new mega.boicot.k
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                android.content.Context r9 = r9.getApplicationContext()
                r4.<init>(r9)
                android.database.sqlite.SQLiteDatabase r4 = r4.getWritableDatabase()
                if (r4 == 0) goto L_0x1d7d
                java.lang.String r9 = "DELETE FROM cats"
                r4.execSQL(r9)
                java.lang.String r9 = "0"
                boolean r9 = r3.equals(r9)
                if (r9 != 0) goto L_0x1d7a
                java.lang.String r9 = ";"
                java.lang.String[] r3 = r3.split(r9)
                r9 = 0
            L_0x1d34:
                int r10 = r3.length
                if (r9 >= r10) goto L_0x1d7a
                r10 = r3[r9]
                java.lang.String r11 = "@"
                java.lang.String[] r10 = r10.split(r11)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "INSERT INTO cats(_id,idcat,descr)VALUES("
                r11.append(r12)
                r12 = 0
                r13 = r10[r12]
                r11.append(r13)
                java.lang.String r12 = ","
                r11.append(r12)
                r12 = r10[r7]
                r11.append(r12)
                java.lang.String r12 = ",'"
                r11.append(r12)
                r10 = r10[r6]
                java.lang.String r12 = "'"
                java.lang.String r13 = "''"
                java.lang.String r10 = r10.replace(r12, r13)
                r11.append(r10)
                java.lang.String r10 = "')"
                r11.append(r10)
                java.lang.String r10 = r11.toString()
                r4.execSQL(r10)
                int r9 = r9 + 1
                goto L_0x1d34
            L_0x1d7a:
                r4.close()
            L_0x1d7d:
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                mega.boicot.preinicio r4 = mega.boicot.preinicio.this
                mega.boicot.config r4 = r4.f18370a
                mega.boicot.preinicio r9 = mega.boicot.preinicio.this
                android.os.Bundle r9 = r9.f18365G
                mega.boicot.preinicio r10 = mega.boicot.preinicio.this
                android.content.Intent r10 = r10.getIntent()
                int r4 = r4.mo20755a(r5, r8, r9, r10)
                r3.f18380k = r4
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                mega.boicot.config r3 = r3.f18370a
                r3.mo20763a()
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 20
                if (r3 <= r4) goto L_0x1db9
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                mega.boicot.config r3 = r3.f18370a
                java.lang.String r3 = r3.f17881aN
                java.lang.String r4 = ""
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L_0x1db9
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                mega.boicot.preinicio r4 = mega.boicot.preinicio.this
                mega.boicot.config r4 = r4.f18370a
                java.lang.String r4 = r4.f17881aN
                mega.boicot.config.m23833a(r3, r4)
            L_0x1db9:
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                android.content.SharedPreferences r3 = r3.f18364F
                java.lang.String r4 = "hatenidonotif"
                r5 = 0
                boolean r3 = r3.getBoolean(r4, r5)
                if (r3 != 0) goto L_0x1e55
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                mega.boicot.config r3 = r3.f18370a
                java.lang.String r3 = r3.f18068ej
                java.lang.String r4 = ""
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L_0x1e55
                android.content.Intent r11 = new android.content.Intent
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                java.lang.Class<mega.boicot.preinicio> r4 = mega.boicot.preinicio.class
                r11.<init>(r3, r4)
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 11
                if (r3 < r4) goto L_0x1de9
                r3 = 268468224(0x10008000, float:2.5342157E-29)
                r11.setFlags(r3)
            L_0x1de9:
                java.lang.String r3 = "notif_id"
                java.lang.String r4 = "1"
                r11.putExtra(r3, r4)
                java.lang.String r3 = "0"
                java.lang.String r4 = "0"
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                mega.boicot.config r5 = r5.f18370a
                int r5 = r5.f18066eh
                if (r5 != 0) goto L_0x1e13
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                mega.boicot.config r5 = r5.f18370a
                java.lang.String r5 = r5.f18070el
                java.lang.String r8 = ""
                boolean r5 = r5.equals(r8)
                if (r5 != 0) goto L_0x1e13
                java.lang.String r3 = "2"
                mega.boicot.preinicio r4 = mega.boicot.preinicio.this
                mega.boicot.config r4 = r4.f18370a
                java.lang.String r4 = r4.f18070el
                goto L_0x1e34
            L_0x1e13:
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                mega.boicot.config r5 = r5.f18370a
                int r5 = r5.f18066eh
                if (r5 <= 0) goto L_0x1e34
                java.lang.String r3 = "1"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                mega.boicot.config r5 = r5.f18370a
                int r5 = r5.f18066eh
                r4.append(r5)
                java.lang.String r5 = ""
                r4.append(r5)
                java.lang.String r4 = r4.toString()
            L_0x1e34:
                java.lang.String r5 = "notif_idelem"
                r11.putExtra(r5, r4)
                java.lang.String r4 = "notif_tipo"
                r11.putExtra(r4, r3)
                mega.boicot.preinicio r8 = mega.boicot.preinicio.this
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                mega.boicot.config r3 = r3.f18370a
                java.lang.String r9 = r3.f18068ej
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                mega.boicot.config r3 = r3.f18370a
                java.lang.String r10 = r3.f18069ek
                r12 = 0
                r13 = 1
                java.lang.String r14 = "0"
                java.lang.String r15 = "0"
                mega.boicot.config.m23825a(r8, r9, r10, r11, r12, r13, r14, r15)
            L_0x1e55:
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                boolean r3 = r3.f18392w
                if (r3 == 0) goto L_0x1e62
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                r2.m23959o()
                goto L_0x1f82
            L_0x1e62:
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                java.lang.String r4 = "splash"
                java.lang.String r3 = r3.mo20865a(r4)
                java.lang.String r4 = "1"
                boolean r4 = r3.equals(r4)
                if (r4 == 0) goto L_0x1f42
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                java.lang.String r4 = "sa"
                java.lang.String r3 = r3.mo20865a(r4)
                java.lang.String r4 = ""
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x1ebc
                int r3 = java.lang.Integer.parseInt(r3)     // Catch:{  }
                java.lang.String r4 = "sa"
                r2.putInt(r4, r3)     // Catch:{  }
                r2.commit()     // Catch:{  }
                if (r3 <= 0) goto L_0x1ebc
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this     // Catch:{  }
                int r2 = mega.boicot.config.m23856i(r2)     // Catch:{  }
                if (r3 > r2) goto L_0x1ebc
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this     // Catch:{  }
                android.content.res.Resources r2 = r2.getResources()     // Catch:{  }
                android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{  }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1ebc }
                r3.<init>()     // Catch:{ Exception -> 0x1ebc }
                java.lang.String r4 = "altres/"
                r3.append(r4)     // Catch:{ Exception -> 0x1ebc }
                mega.boicot.preinicio r4 = mega.boicot.preinicio.this     // Catch:{ Exception -> 0x1ebc }
                java.lang.String r4 = r4.f18377h     // Catch:{ Exception -> 0x1ebc }
                r3.append(r4)     // Catch:{ Exception -> 0x1ebc }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x1ebc }
                r2.open(r3)     // Catch:{ Exception -> 0x1ebc }
                r3 = r7
                goto L_0x1ebd
            L_0x1ebc:
                r3 = 0
            L_0x1ebd:
                if (r3 == 0) goto L_0x1ecb
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                r2.mo20867a()
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                r2.mo20870b()
                goto L_0x1f82
            L_0x1ecb:
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                mega.boicot.config r2 = r2.f18370a
                java.lang.String r2 = r2.f17965bt
                java.lang.String r3 = ""
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x1f29
                android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
                android.graphics.drawable.GradientDrawable$Orientation r3 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
                int[] r4 = new int[r6]
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "#"
                r5.append(r6)
                mega.boicot.preinicio r6 = mega.boicot.preinicio.this
                mega.boicot.config r6 = r6.f18370a
                java.lang.String r6 = r6.f17965bt
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                int r5 = android.graphics.Color.parseColor(r5)
                r6 = 0
                r4[r6] = r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "#"
                r5.append(r6)
                mega.boicot.preinicio r6 = mega.boicot.preinicio.this
                mega.boicot.config r6 = r6.f18370a
                java.lang.String r6 = r6.f17966bu
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                int r5 = android.graphics.Color.parseColor(r5)
                r4[r7] = r5
                r2.<init>(r3, r4)
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                r4 = 2131230984(0x7f080108, float:1.8078036E38)
                android.view.View r3 = r3.findViewById(r4)
                r3.setBackgroundDrawable(r2)
            L_0x1f29:
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                java.lang.String r3 = "vsp"
                java.lang.String r2 = r2.mo20865a(r3)
                mega.boicot.preinicio$e r3 = new mega.boicot.preinicio$e
                mega.boicot.preinicio r4 = mega.boicot.preinicio.this
                r5 = 0
                r3.<init>()
                java.lang.String[] r4 = new java.lang.String[r7]
                r5 = 0
                r4[r5] = r2
                r3.execute(r4)
                goto L_0x1f82
            L_0x1f42:
                java.lang.String r4 = "2"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x1f7d
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                r4 = 2131231123(0x7f080193, float:1.8078318E38)
                android.view.View r3 = r3.findViewById(r4)
                android.widget.ImageView r3 = (android.widget.ImageView) r3
                r4 = 0
                r3.setImageBitmap(r4)
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this     // Catch:{ Exception -> 0x1f60 }
                java.lang.String r4 = "splash"
                r3.deleteFile(r4)     // Catch:{ Exception -> 0x1f60 }
            L_0x1f60:
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                r4 = 2131231668(0x7f0803b4, float:1.8079424E38)
                android.view.View r3 = r3.findViewById(r4)
                r4 = 8
                r3.setVisibility(r4)
                java.lang.String r3 = "sa"
                r4 = 0
                r2.putInt(r3, r4)
                r2.commit()
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                r2.mo20870b()
                goto L_0x1f82
            L_0x1f7d:
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this
                r2.mo20870b()
            L_0x1f82:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.preinicio.C5714a.onPostExecute(java.lang.Byte):void");
        }
    }

    /* renamed from: mega.boicot.preinicio$b */
    private class C5717b extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f18453a;

        private C5717b() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|15) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
            return java.lang.Byte.valueOf(-1);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x005a */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r0 = 0
                r6 = r6[r0]
                r5.f18453a = r6
                r6 = -1
                java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0064 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0064 }
                r2.<init>()     // Catch:{ MalformedURLException -> 0x0064 }
                java.lang.String r3 = "http://imgs1.e-droid.net/srv/imgs/fonts/app718963.ttf?v="
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0064 }
                java.lang.String r3 = r5.f18453a     // Catch:{ MalformedURLException -> 0x0064 }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0064 }
                java.lang.String r2 = r2.toString()     // Catch:{ MalformedURLException -> 0x0064 }
                r1.<init>(r2)     // Catch:{ MalformedURLException -> 0x0064 }
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ IOException -> 0x005f }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException -> 0x005f }
                r2 = 1
                r1.setDoInput(r2)     // Catch:{ IOException -> 0x005f }
                r2 = 5000(0x1388, float:7.006E-42)
                r1.setConnectTimeout(r2)     // Catch:{ IOException -> 0x005f }
                r2 = 7000(0x1b58, float:9.809E-42)
                r1.setReadTimeout(r2)     // Catch:{ IOException -> 0x005f }
                r1.connect()     // Catch:{ IOException -> 0x005f }
                java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x005f }
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this     // Catch:{ Exception -> 0x005a }
                java.lang.String r3 = "font"
                java.io.FileOutputStream r2 = r2.openFileOutput(r3, r0)     // Catch:{ Exception -> 0x005a }
                r3 = 1024(0x400, float:1.435E-42)
                byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x005a }
            L_0x0045:
                int r4 = r1.read(r3)     // Catch:{ Exception -> 0x005a }
                if (r4 <= 0) goto L_0x004f
                r2.write(r3, r0, r4)     // Catch:{ Exception -> 0x005a }
                goto L_0x0045
            L_0x004f:
                r2.close()     // Catch:{ Exception -> 0x005a }
                r1.close()     // Catch:{ Exception -> 0x005a }
                java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
                return r6
            L_0x005a:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r6)     // Catch:{ IOException -> 0x005f }
                return r0
            L_0x005f:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            L_0x0064:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.preinicio.C5717b.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            preinicio.this.mo20868a((int) R.string.cargando_recursos);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            preinicio.this.mo20876h();
            if (b.byteValue() == -1) {
                preinicio.this.f18384o = false;
            } else {
                Editor edit = preinicio.this.f18364F.edit();
                edit.putString("vfu_act", this.f18453a);
                edit.commit();
                preinicio.this.f18370a.mo20783c(1);
            }
            preinicio.this.mo20871c();
        }
    }

    /* renamed from: mega.boicot.preinicio$c */
    private class C5718c extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f18455a;

        private C5718c() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0060, code lost:
            return java.lang.Byte.valueOf(-1);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x005c */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r0 = 0
                r6 = r6[r0]
                r5.f18455a = r6
                r6 = -1
                java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0066 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0066 }
                r2.<init>()     // Catch:{ MalformedURLException -> 0x0066 }
                java.lang.String r3 = "http://imgs1.e-droid.net/srv/imgs/gen/718963_icohome.png?v="
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0066 }
                java.lang.String r3 = r5.f18455a     // Catch:{ MalformedURLException -> 0x0066 }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0066 }
                java.lang.String r2 = r2.toString()     // Catch:{ MalformedURLException -> 0x0066 }
                r1.<init>(r2)     // Catch:{ MalformedURLException -> 0x0066 }
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ IOException -> 0x0061 }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException -> 0x0061 }
                r2 = 1
                r1.setDoInput(r2)     // Catch:{ IOException -> 0x0061 }
                r2 = 5000(0x1388, float:7.006E-42)
                r1.setConnectTimeout(r2)     // Catch:{ IOException -> 0x0061 }
                r2 = 7000(0x1b58, float:9.809E-42)
                r1.setReadTimeout(r2)     // Catch:{ IOException -> 0x0061 }
                r1.connect()     // Catch:{ IOException -> 0x0061 }
                java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x0061 }
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this     // Catch:{ IOException -> 0x0061 }
                android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ IOException -> 0x0061 }
                r2.f18363E = r1     // Catch:{ IOException -> 0x0061 }
                mega.boicot.preinicio r1 = mega.boicot.preinicio.this     // Catch:{ Exception -> 0x005c }
                java.lang.String r2 = "icohome"
                java.io.FileOutputStream r1 = r1.openFileOutput(r2, r0)     // Catch:{ Exception -> 0x005c }
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this     // Catch:{ Exception -> 0x005c }
                android.graphics.Bitmap r2 = r2.f18363E     // Catch:{ Exception -> 0x005c }
                android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x005c }
                r4 = 100
                r2.compress(r3, r4, r1)     // Catch:{ Exception -> 0x005c }
                r1.close()     // Catch:{ Exception -> 0x005c }
                java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
                return r6
            L_0x005c:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r6)     // Catch:{ IOException -> 0x0061 }
                return r0
            L_0x0061:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            L_0x0066:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.preinicio.C5718c.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            preinicio.this.mo20868a((int) R.string.cargando_icohome);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            preinicio.this.mo20876h();
            if (b.byteValue() == -1) {
                preinicio.this.f18384o = false;
            }
            preinicio.this.mo20873e();
        }
    }

    /* renamed from: mega.boicot.preinicio$d */
    private class C5719d extends AsyncTask<String, Void, Byte> {
        private C5719d() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x01c7, code lost:
            return java.lang.Byte.valueOf(-1);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x01c3 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r13) {
            /*
                r12 = this;
                java.lang.String r13 = ""
                mega.boicot.preinicio r0 = mega.boicot.preinicio.this
                android.content.SharedPreferences r0 = r0.f18364F
                android.content.SharedPreferences$Editor r0 = r0.edit()
                r1 = 0
                r5 = r13
                r13 = r1
                r2 = r13
                r3 = r2
                r4 = r3
            L_0x0010:
                r6 = 7
                if (r13 >= r6) goto L_0x01d6
                r6 = 1
                if (r13 != 0) goto L_0x0044
                java.lang.String r2 = "ofics"
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                mega.boicot.config r3 = r3.f18370a
                boolean r3 = r3.f17865X
                mega.boicot.preinicio r4 = mega.boicot.preinicio.this
                mega.boicot.config r4 = r4.f18370a
                int r4 = r4.f17866Y
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                android.content.SharedPreferences r5 = r5.f18364F
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                java.lang.String r8 = "_imgperso_v_act"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                int r5 = r5.getInt(r7, r1)
            L_0x003d:
                r11 = r5
                r5 = r2
                r2 = r4
                r4 = r3
                r3 = r11
                goto L_0x0149
            L_0x0044:
                if (r13 != r6) goto L_0x006e
                java.lang.String r2 = "busc"
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                mega.boicot.config r3 = r3.f18370a
                boolean r3 = r3.f17861T
                mega.boicot.preinicio r4 = mega.boicot.preinicio.this
                mega.boicot.config r4 = r4.f18370a
                int r4 = r4.f17862U
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                android.content.SharedPreferences r5 = r5.f18364F
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                java.lang.String r8 = "_imgperso_v_act"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                int r5 = r5.getInt(r7, r1)
                goto L_0x003d
            L_0x006e:
                r7 = 2
                if (r13 != r7) goto L_0x0099
                java.lang.String r2 = "share"
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                mega.boicot.config r3 = r3.f18370a
                boolean r3 = r3.f17853L
                mega.boicot.preinicio r4 = mega.boicot.preinicio.this
                mega.boicot.config r4 = r4.f18370a
                int r4 = r4.f17854M
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                android.content.SharedPreferences r5 = r5.f18364F
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                java.lang.String r8 = "_imgperso_v_act"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                int r5 = r5.getInt(r7, r1)
                goto L_0x003d
            L_0x0099:
                r7 = 3
                if (r13 != r7) goto L_0x00c5
                java.lang.String r2 = "exit"
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                mega.boicot.config r3 = r3.f18370a
                boolean r3 = r3.f17895ab
                mega.boicot.preinicio r4 = mega.boicot.preinicio.this
                mega.boicot.config r4 = r4.f18370a
                int r4 = r4.f17896ac
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                android.content.SharedPreferences r5 = r5.f18364F
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                java.lang.String r8 = "_imgperso_v_act"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                int r5 = r5.getInt(r7, r1)
                goto L_0x003d
            L_0x00c5:
                r7 = 4
                if (r13 != r7) goto L_0x00f1
                java.lang.String r2 = "notif"
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                mega.boicot.config r3 = r3.f18370a
                boolean r3 = r3.f17899af
                mega.boicot.preinicio r4 = mega.boicot.preinicio.this
                mega.boicot.config r4 = r4.f18370a
                int r4 = r4.f17900ag
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                android.content.SharedPreferences r5 = r5.f18364F
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                java.lang.String r8 = "_imgperso_v_act"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                int r5 = r5.getInt(r7, r1)
                goto L_0x003d
            L_0x00f1:
                r7 = 5
                if (r13 != r7) goto L_0x011d
                java.lang.String r2 = "perfil"
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                mega.boicot.config r3 = r3.f18370a
                boolean r3 = r3.f17903aj
                mega.boicot.preinicio r4 = mega.boicot.preinicio.this
                mega.boicot.config r4 = r4.f18370a
                int r4 = r4.f17904ak
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                android.content.SharedPreferences r5 = r5.f18364F
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                java.lang.String r8 = "_imgperso_v_act"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                int r5 = r5.getInt(r7, r1)
                goto L_0x003d
            L_0x011d:
                r7 = 6
                if (r13 != r7) goto L_0x0149
                java.lang.String r2 = "search"
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this
                mega.boicot.config r3 = r3.f18370a
                boolean r3 = r3.f17857P
                mega.boicot.preinicio r4 = mega.boicot.preinicio.this
                mega.boicot.config r4 = r4.f18370a
                int r4 = r4.f17858Q
                mega.boicot.preinicio r5 = mega.boicot.preinicio.this
                android.content.SharedPreferences r5 = r5.f18364F
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r2)
                java.lang.String r8 = "_imgperso_v_act"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                int r5 = r5.getInt(r7, r1)
                goto L_0x003d
            L_0x0149:
                if (r4 == 0) goto L_0x01d2
                if (r2 <= r3) goto L_0x01d2
                r7 = -1
                java.net.URL r8 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01cd }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x01cd }
                r9.<init>()     // Catch:{ MalformedURLException -> 0x01cd }
                java.lang.String r10 = "http://imgs1.e-droid.net/srv/imgs/icos/app718963_"
                r9.append(r10)     // Catch:{ MalformedURLException -> 0x01cd }
                r9.append(r5)     // Catch:{ MalformedURLException -> 0x01cd }
                java.lang.String r10 = ".png?v="
                r9.append(r10)     // Catch:{ MalformedURLException -> 0x01cd }
                r9.append(r2)     // Catch:{ MalformedURLException -> 0x01cd }
                java.lang.String r9 = r9.toString()     // Catch:{ MalformedURLException -> 0x01cd }
                r8.<init>(r9)     // Catch:{ MalformedURLException -> 0x01cd }
                java.net.URLConnection r8 = r8.openConnection()     // Catch:{ IOException -> 0x01c8 }
                java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ IOException -> 0x01c8 }
                r8.setDoInput(r6)     // Catch:{ IOException -> 0x01c8 }
                r6 = 5000(0x1388, float:7.006E-42)
                r8.setConnectTimeout(r6)     // Catch:{ IOException -> 0x01c8 }
                r6 = 7000(0x1b58, float:9.809E-42)
                r8.setReadTimeout(r6)     // Catch:{ IOException -> 0x01c8 }
                r8.connect()     // Catch:{ IOException -> 0x01c8 }
                java.io.InputStream r6 = r8.getInputStream()     // Catch:{ IOException -> 0x01c8 }
                android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6)     // Catch:{ IOException -> 0x01c8 }
                mega.boicot.preinicio r8 = mega.boicot.preinicio.this     // Catch:{ Exception -> 0x01c3 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c3 }
                r9.<init>()     // Catch:{ Exception -> 0x01c3 }
                java.lang.String r10 = "ico_"
                r9.append(r10)     // Catch:{ Exception -> 0x01c3 }
                r9.append(r5)     // Catch:{ Exception -> 0x01c3 }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x01c3 }
                java.io.FileOutputStream r8 = r8.openFileOutput(r9, r1)     // Catch:{ Exception -> 0x01c3 }
                android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x01c3 }
                r10 = 100
                r6.compress(r9, r10, r8)     // Catch:{ Exception -> 0x01c3 }
                r8.close()     // Catch:{ Exception -> 0x01c3 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                java.lang.String r7 = "_imgperso_v_act"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r0.putInt(r6, r2)
                r0.commit()
                goto L_0x01d2
            L_0x01c3:
                java.lang.Byte r13 = java.lang.Byte.valueOf(r7)     // Catch:{ IOException -> 0x01c8 }
                return r13
            L_0x01c8:
                java.lang.Byte r13 = java.lang.Byte.valueOf(r7)
                return r13
            L_0x01cd:
                java.lang.Byte r13 = java.lang.Byte.valueOf(r7)
                return r13
            L_0x01d2:
                int r13 = r13 + 1
                goto L_0x0010
            L_0x01d6:
                java.lang.Byte r13 = java.lang.Byte.valueOf(r1)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.preinicio.C5719d.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            preinicio.this.mo20868a((int) R.string.cargando_recursos);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            preinicio.this.mo20876h();
            if (b.byteValue() == -1) {
                preinicio.this.f18384o = false;
            }
            preinicio.this.mo20872d();
        }
    }

    /* renamed from: mega.boicot.preinicio$e */
    private class C5720e extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f18458a;

        private C5720e() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0060, code lost:
            return java.lang.Byte.valueOf(-1);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x005c */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r0 = 0
                r6 = r6[r0]
                r5.f18458a = r6
                r6 = -1
                java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0066 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0066 }
                r2.<init>()     // Catch:{ MalformedURLException -> 0x0066 }
                java.lang.String r3 = "http://imgs1.e-droid.net/srv/imgs/gen/718963_splash.png?v="
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0066 }
                java.lang.String r3 = r5.f18458a     // Catch:{ MalformedURLException -> 0x0066 }
                r2.append(r3)     // Catch:{ MalformedURLException -> 0x0066 }
                java.lang.String r2 = r2.toString()     // Catch:{ MalformedURLException -> 0x0066 }
                r1.<init>(r2)     // Catch:{ MalformedURLException -> 0x0066 }
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ IOException -> 0x0061 }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException -> 0x0061 }
                r2 = 1
                r1.setDoInput(r2)     // Catch:{ IOException -> 0x0061 }
                r2 = 5000(0x1388, float:7.006E-42)
                r1.setConnectTimeout(r2)     // Catch:{ IOException -> 0x0061 }
                r2 = 7000(0x1b58, float:9.809E-42)
                r1.setReadTimeout(r2)     // Catch:{ IOException -> 0x0061 }
                r1.connect()     // Catch:{ IOException -> 0x0061 }
                java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x0061 }
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this     // Catch:{ IOException -> 0x0061 }
                android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ IOException -> 0x0061 }
                r2.f18362D = r1     // Catch:{ IOException -> 0x0061 }
                mega.boicot.preinicio r1 = mega.boicot.preinicio.this     // Catch:{ Exception -> 0x005c }
                java.lang.String r2 = "splash"
                java.io.FileOutputStream r1 = r1.openFileOutput(r2, r0)     // Catch:{ Exception -> 0x005c }
                mega.boicot.preinicio r2 = mega.boicot.preinicio.this     // Catch:{ Exception -> 0x005c }
                android.graphics.Bitmap r2 = r2.f18362D     // Catch:{ Exception -> 0x005c }
                android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x005c }
                r4 = 100
                r2.compress(r3, r4, r1)     // Catch:{ Exception -> 0x005c }
                r1.close()     // Catch:{ Exception -> 0x005c }
                java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
                return r6
            L_0x005c:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r6)     // Catch:{ IOException -> 0x0061 }
                return r0
            L_0x0061:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            L_0x0066:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.preinicio.C5720e.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            preinicio.this.mo20868a((int) R.string.cargando_splash);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            preinicio.this.mo20876h();
            if (b.byteValue() == -1) {
                preinicio.this.f18384o = false;
            } else {
                ((ImageView) preinicio.this.findViewById(R.id.iv_splash)).setImageBitmap(preinicio.this.f18362D);
                preinicio.this.findViewById(R.id.iv_splash).setVisibility(0);
            }
            preinicio.this.mo20870b();
        }
    }

    /* renamed from: mega.boicot.preinicio$f */
    class C5721f extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        int f18460a;

        C5721f(int i) {
            this.f18460a = i;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:23|22|26|27|(1:29)|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
            r1 = r8;
            r8 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
            r1.disconnect();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0094 */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r8) {
            /*
                r7 = this;
                int r8 = r7.f18460a
                if (r8 != 0) goto L_0x001c
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "http://imgs1.e-droid.net/srv/imgs/anun/"
                r8.append(r0)
                mega.boicot.preinicio r0 = mega.boicot.preinicio.this
                mega.boicot.config r0 = r0.f18370a
                java.lang.String r0 = r0.f18001cd
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                goto L_0x0033
            L_0x001c:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "http://imgs1.e-droid.net/srv/imgs/anun/"
                r8.append(r0)
                mega.boicot.preinicio r0 = mega.boicot.preinicio.this
                mega.boicot.config r0 = r0.f18370a
                java.lang.String r0 = r0.f18000cc
                r8.append(r0)
                java.lang.String r8 = r8.toString()
            L_0x0033:
                r0 = -1
                java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00a4 }
                r1.<init>(r8)     // Catch:{ MalformedURLException -> 0x00a4 }
                r8 = 0
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Exception -> 0x0094 }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x0094 }
                r8 = 1
                r1.setDoInput(r8)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r2 = 10000(0x2710, float:1.4013E-41)
                r1.setConnectTimeout(r2)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r1.setReadTimeout(r2)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r1.connect()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                java.io.InputStream r2 = r1.getInputStream()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                mega.boicot.preinicio r3 = mega.boicot.preinicio.this     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r4.<init>()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                java.lang.String r5 = "acad_temp_"
                r4.append(r5)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                int r5 = r7.f18460a     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r4.append(r5)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r5 = 0
                java.io.FileOutputStream r3 = r3.openFileOutput(r4, r5)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r4 = 256(0x100, float:3.59E-43)
                byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x008e, all -> 0x008c }
            L_0x0071:
                int r6 = r4.length     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                int r6 = r2.read(r4, r5, r6)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                if (r6 < 0) goto L_0x007c
                r3.write(r4, r5, r6)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                goto L_0x0071
            L_0x007c:
                r3.close()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                r2.close()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
                if (r1 == 0) goto L_0x0087
                r1.disconnect()
            L_0x0087:
                java.lang.Byte r8 = java.lang.Byte.valueOf(r8)
                return r8
            L_0x008c:
                r8 = move-exception
                goto L_0x009e
            L_0x008e:
                r8 = r1
                goto L_0x0094
            L_0x0090:
                r0 = move-exception
                r1 = r8
                r8 = r0
                goto L_0x009e
            L_0x0094:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x0090 }
                if (r8 == 0) goto L_0x009d
                r8.disconnect()
            L_0x009d:
                return r0
            L_0x009e:
                if (r1 == 0) goto L_0x00a3
                r1.disconnect()
            L_0x00a3:
                throw r8
            L_0x00a4:
                java.lang.Byte r8 = java.lang.Byte.valueOf(r0)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.preinicio.C5721f.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            ImageView imageView;
            if (b.byteValue() == 1) {
                try {
                    preinicio preinicio = preinicio.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("acad_temp_");
                    sb.append(this.f18460a);
                    FileInputStream openFileInput = preinicio.openFileInput(sb.toString());
                    if (this.f18460a == 0) {
                        imageView = (ImageView) preinicio.this.findViewById(R.id.acad_na_icon);
                    } else {
                        imageView = (ImageView) preinicio.this.findViewById(R.id.acad_na_media);
                    }
                    imageView.setImageBitmap(BitmapFactory.decodeStream(openFileInput));
                    openFileInput.close();
                } catch (FileNotFoundException | IOException | OutOfMemoryError unused) {
                }
            }
            if (this.f18460a == 0) {
                preinicio.this.f18393x = true;
            } else {
                preinicio.this.f18394y = true;
            }
            if (preinicio.this.f18393x && preinicio.this.f18394y) {
                preinicio.this.findViewById(R.id.progressBar).setVisibility(8);
                preinicio.this.findViewById(R.id.acad_na_view).setVisibility(0);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http://");
                sb2.append(config.f17839g);
                sb2.append("/srv/acad.php?idapp=");
                sb2.append(718963);
                sb2.append("&idusu=");
                sb2.append(preinicio.this.f18379j);
                sb2.append("&tipo=1&ref=");
                sb2.append(preinicio.this.f18370a.f18004cg);
                new C5643e(sb2.toString(), "Android Vinebre Software").execute(new String[0]);
            }
        }
    }

    /* renamed from: mega.boicot.preinicio$g */
    private class C5722g extends AsyncTask<String, Void, Byte> {
        private C5722g() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Byte doInBackground(String... strArr) {
            C6409h hVar = new C6409h();
            StringBuilder sb = new StringBuilder();
            sb.append("http://");
            sb.append(config.f17839g);
            sb.append("/srv/comprobar_contra_app.php?v=1&idapp=");
            sb.append(718963);
            sb.append("&idusu=");
            sb.append(preinicio.this.f18379j);
            C6274e eVar = new C6274e(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            try {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(new C6517l("contra", preinicio.this.f18374e));
                eVar.mo22444a(new C6268a(arrayList));
                eVar.mo22909b("User-Agent", "Android Vinebre Software");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(hVar.mo22459a(eVar).mo22939b().mo22473f()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                }
                if (sb2.indexOf("ANDROID:KO") != -1) {
                    return Byte.valueOf(2);
                }
                if (sb2.indexOf("ANDROID:OK") != -1) {
                    return Byte.valueOf(1);
                }
                return Byte.valueOf(0);
            } catch (C6279d unused) {
                return Byte.valueOf(0);
            } catch (IOException unused2) {
                return Byte.valueOf(0);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            try {
                preinicio.this.f18360B.dismiss();
            } catch (Exception unused) {
            }
            if (b.byteValue() == 1) {
                if (preinicio.this.f18364F.getBoolean("pwd_nomostrarmas_def", true)) {
                    Editor edit = preinicio.this.f18364F.edit();
                    edit.putBoolean("pwd_validado", true);
                    edit.commit();
                }
                preinicio.this.m23959o();
            } else if (b.byteValue() == 2) {
                preinicio.this.f18390u = true;
                preinicio.this.mo20877i();
            } else {
                preinicio.this.mo20869a(preinicio.this.getString(R.string.error_http_tit), preinicio.this.getString(R.string.error_http));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            java.lang.String r0 = "sh"
            r1 = 0
            android.content.SharedPreferences r0 = r9.getSharedPreferences(r0, r1)
            r9.f18364F = r0
            android.content.SharedPreferences r0 = r9.f18364F
            java.lang.String r2 = "c1_sp"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.getString(r2, r3)
            r9.f18372c = r0
            android.content.SharedPreferences r0 = r9.f18364F
            java.lang.String r2 = "c_icos"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.getString(r2, r3)
            r9.f18373d = r0
            android.content.Intent r0 = r9.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            r9.f18365G = r0
            java.lang.String r0 = r9.f18372c
            java.lang.String r2 = r9.f18373d
            java.lang.String r0 = mega.boicot.config.m23831a(r0, r2)
            r9.f18375f = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 12
            if (r0 <= r2) goto L_0x0064
            java.lang.String r0 = r9.f18372c
            java.lang.String r2 = ""
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0064
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "#"
            r0.append(r2)
            java.lang.String r2 = r9.f18372c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = mega.boicot.config.m23844a(r0)
            if (r0 != 0) goto L_0x0064
            r0 = 2131624309(0x7f0e0175, float:1.8875794E38)
            r9.setTheme(r0)
        L_0x0064:
            super.onCreate(r10)
            com.appnext.base.Appnext.init(r9)
            android.os.Bundle r10 = r9.f18365G
            r0 = 1
            if (r10 == 0) goto L_0x0085
            android.os.Bundle r10 = r9.f18365G
            java.lang.String r2 = "directo"
            boolean r10 = r10.containsKey(r2)
            if (r10 == 0) goto L_0x0085
            android.os.Bundle r10 = r9.f18365G
            java.lang.String r2 = "directo"
            boolean r10 = r10.getBoolean(r2, r1)
            if (r10 == 0) goto L_0x0085
            r9.f18392w = r0
        L_0x0085:
            r10 = 2131361902(0x7f0a006e, float:1.834357E38)
            r9.setContentView(r10)
            android.view.Window r10 = r9.getWindow()     // Catch:{ Exception -> 0x0094 }
            r2 = 128(0x80, float:1.794E-43)
            r10.setFlags(r2, r2)     // Catch:{ Exception -> 0x0094 }
        L_0x0094:
            android.content.Context r10 = r9.getApplicationContext()
            mega.boicot.config r10 = (mega.boicot.config) r10
            r9.f18370a = r10
            mega.boicot.config r10 = r9.f18370a
            android.content.SharedPreferences r2 = r9.f18364F
            java.lang.String r3 = "ft"
            java.lang.String r4 = "0"
            java.lang.String r2 = r2.getString(r3, r4)
            int r2 = java.lang.Integer.parseInt(r2)
            r10.mo20783c(r2)
            android.content.SharedPreferences r10 = r9.f18364F
            java.lang.String r2 = "prim_ejec"
            boolean r10 = r10.getBoolean(r2, r0)
            if (r10 == 0) goto L_0x00db
            android.content.SharedPreferences r10 = r9.f18364F
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r2 = "prim_ejec"
            r10.putBoolean(r2, r1)
            r10.commit()
            com.b.a.a.a$a r10 = com.p051b.p052a.p053a.C1419a.m5889a(r9)
            com.b.a.a.a r10 = r10.mo6459a()
            r9.f18369K = r10
            com.b.a.a.a r10 = r9.f18369K
            mega.boicot.preinicio$1 r2 = new mega.boicot.preinicio$1
            r2.<init>()
            r10.mo6458a(r2)
        L_0x00db:
            boolean r10 = mega.boicot.config.m23853d()
            if (r10 == 0) goto L_0x012e
            java.lang.String r10 = "mounted"
            java.lang.String r2 = android.os.Environment.getExternalStorageState()
            boolean r10 = r10.equals(r2)
            if (r10 != 0) goto L_0x012e
            android.app.AlertDialog$Builder r10 = new android.app.AlertDialog$Builder
            r10.<init>(r9)
            r0 = 2131558439(0x7f0d0027, float:1.8742194E38)
            mega.boicot.preinicio$12 r1 = new mega.boicot.preinicio$12
            r1.<init>()
            android.app.AlertDialog$Builder r10 = r10.setPositiveButton(r0, r1)
            r0 = 2131558677(0x7f0d0115, float:1.8742677E38)
            android.app.AlertDialog$Builder r10 = r10.setMessage(r0)
            android.app.AlertDialog r10 = r10.create()
            java.lang.String r0 = r9.f18375f
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x011b
            mega.boicot.preinicio$23 r0 = new mega.boicot.preinicio$23
            r0.<init>(r10)
            r10.setOnShowListener(r0)
        L_0x011b:
            r10.show()     // Catch:{ Exception -> 0x0306 }
            r0 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r10 = r10.findViewById(r0)     // Catch:{ Exception -> 0x0306 }
            android.widget.TextView r10 = (android.widget.TextView) r10     // Catch:{ Exception -> 0x0306 }
            android.graphics.Typeface r0 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x0306 }
            r10.setTypeface(r0)     // Catch:{ Exception -> 0x0306 }
            goto L_0x0306
        L_0x012e:
            boolean r10 = r9.f18392w
            if (r10 != 0) goto L_0x0150
            android.content.SharedPreferences r10 = r9.f18364F
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r2 = "n_opens"
            android.content.SharedPreferences r3 = r9.f18364F
            java.lang.String r4 = "n_opens"
            int r3 = r3.getInt(r4, r1)
            int r3 = r3 + r0
            r10.putInt(r2, r3)
            java.lang.String r2 = "f_ult_notif"
            r3 = 0
            r10.putLong(r2, r3)
            r10.commit()
        L_0x0150:
            android.content.SharedPreferences r10 = r9.f18364F
            java.lang.String r2 = "idusu"
            int r10 = r10.getInt(r2, r1)
            r9.f18379j = r10
            android.content.SharedPreferences r10 = r9.f18364F
            java.lang.String r2 = "cod_g"
            java.lang.String r3 = ""
            java.lang.String r10 = r10.getString(r2, r3)
            r9.f18376g = r10
            r9.f18387r = r1
            int r10 = r9.f18379j
            if (r10 != 0) goto L_0x01b9
            boolean r10 = mega.boicot.config.m23853d()
            if (r10 == 0) goto L_0x01b9
            java.io.File r10 = new java.io.File     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            java.lang.String r3 = r9.getPackageName()     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            r10.<init>(r2, r3)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            java.io.File r2 = new java.io.File     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            java.lang.String r3 = "vinebre_ac.txt"
            r2.<init>(r10, r3)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            boolean r10 = r2.exists()     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            if (r10 == 0) goto L_0x01b9
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            r10.<init>(r2)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            r3.<init>(r10)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            java.lang.String r2 = r2.readLine()     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            r10.close()     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            java.lang.String r10 = "@"
            java.lang.String[] r10 = r2.split(r10)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            r2 = r10[r1]     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            r9.f18379j = r2     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            int r2 = r10.length     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            if (r2 <= r0) goto L_0x01b7
            r10 = r10[r0]     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
            r9.f18376g = r10     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
        L_0x01b7:
            r9.f18387r = r0     // Catch:{ FileNotFoundException | IOException | Exception -> 0x01b9 }
        L_0x01b9:
            int r10 = r9.f18379j
            if (r10 <= 0) goto L_0x02ba
            int r10 = android.os.Build.VERSION.SDK_INT
            r2 = 20
            if (r10 <= r2) goto L_0x01e2
            android.content.SharedPreferences r10 = r9.f18364F
            java.lang.String r2 = "c1"
            java.lang.String r3 = ""
            java.lang.String r10 = r10.getString(r2, r3)
            java.lang.String r2 = ""
            boolean r10 = r10.equals(r2)
            if (r10 != 0) goto L_0x01e2
            android.content.SharedPreferences r10 = r9.f18364F
            java.lang.String r2 = "c1"
            java.lang.String r3 = ""
            java.lang.String r10 = r10.getString(r2, r3)
            mega.boicot.config.m23833a(r9, r10)
        L_0x01e2:
            boolean r10 = r9.f18392w
            if (r10 != 0) goto L_0x02ba
            android.content.SharedPreferences r10 = r9.f18364F
            java.lang.String r2 = "sa"
            int r10 = r10.getInt(r2, r1)
            if (r10 <= 0) goto L_0x021e
            android.content.SharedPreferences r10 = r9.f18364F
            java.lang.String r2 = "sa"
            int r10 = r10.getInt(r2, r1)
            int r2 = mega.boicot.config.m23856i(r9)
            if (r10 > r2) goto L_0x021e
            android.content.res.Resources r10 = r9.getResources()
            android.content.res.AssetManager r10 = r10.getAssets()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x021e }
            r2.<init>()     // Catch:{ IOException -> 0x021e }
            java.lang.String r3 = "altres/"
            r2.append(r3)     // Catch:{ IOException -> 0x021e }
            java.lang.String r3 = r9.f18377h     // Catch:{ IOException -> 0x021e }
            r2.append(r3)     // Catch:{ IOException -> 0x021e }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x021e }
            r10.open(r2)     // Catch:{ IOException -> 0x021e }
            r10 = r0
            goto L_0x021f
        L_0x021e:
            r10 = r1
        L_0x021f:
            if (r10 != 0) goto L_0x02b7
            r10 = 2131231123(0x7f080193, float:1.8078318E38)
            android.view.View r2 = r9.findViewById(r10)
            r2.setVisibility(r1)
            java.lang.String r2 = "splash"
            java.io.FileInputStream r2 = r9.openFileInput(r2)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x0240 }
            java.io.FileDescriptor r3 = r2.getFD()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x0240 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFileDescriptor(r3)     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x0240 }
            r9.f18362D = r3     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x0240 }
            r2.close()     // Catch:{ FileNotFoundException | IOException | OutOfMemoryError -> 0x0240 }
            r2 = r0
            goto L_0x0241
        L_0x0240:
            r2 = r1
        L_0x0241:
            if (r2 == 0) goto L_0x02ba
            android.content.SharedPreferences r2 = r9.f18364F
            java.lang.String r3 = "c1_sp"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.getString(r3, r4)
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x02ab
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r3 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r4 = 2
            int[] r4 = new int[r4]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "#"
            r5.append(r6)
            android.content.SharedPreferences r6 = r9.f18364F
            java.lang.String r7 = "c1_sp"
            java.lang.String r8 = ""
            java.lang.String r6 = r6.getString(r7, r8)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            int r5 = android.graphics.Color.parseColor(r5)
            r4[r1] = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "#"
            r5.append(r6)
            android.content.SharedPreferences r6 = r9.f18364F
            java.lang.String r7 = "c2_sp"
            java.lang.String r8 = ""
            java.lang.String r6 = r6.getString(r7, r8)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            int r5 = android.graphics.Color.parseColor(r5)
            r4[r0] = r5
            r2.<init>(r3, r4)
            r3 = 2131230984(0x7f080108, float:1.8078036E38)
            android.view.View r3 = r9.findViewById(r3)
            r3.setBackgroundDrawable(r2)
        L_0x02ab:
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            android.graphics.Bitmap r2 = r9.f18362D
            r10.setImageBitmap(r2)
            goto L_0x02ba
        L_0x02b7:
            r9.mo20867a()
        L_0x02ba:
            r9.f18382m = r1
            r9.f18383n = r1
            android.content.pm.PackageManager r10 = r9.getPackageManager()
            java.lang.String r2 = r9.getPackageName()     // Catch:{ Exception -> 0x02e7 }
            android.content.pm.ApplicationInfo r2 = r10.getApplicationInfo(r2, r1)     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r2 = r2.packageName     // Catch:{ Exception -> 0x02e7 }
            java.lang.String r10 = r10.getInstallerPackageName(r2)     // Catch:{ Exception -> 0x02e7 }
            if (r10 == 0) goto L_0x02e7
            java.lang.String r2 = "com.android.vending"
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x02e7 }
            if (r2 == 0) goto L_0x02dd
            r9.f18382m = r0     // Catch:{ Exception -> 0x02e7 }
            goto L_0x02e7
        L_0x02dd:
            java.lang.String r2 = "com.amazon.venezia"
            boolean r10 = r2.equals(r10)     // Catch:{ Exception -> 0x02e7 }
            if (r10 == 0) goto L_0x02e7
            r9.f18383n = r0     // Catch:{ Exception -> 0x02e7 }
        L_0x02e7:
            r10 = 0
            mega.boicot.config.f17825dd = r10
            mega.boicot.config.f17841i = r1
            mega.boicot.config.f17826de = r10
            mega.boicot.config.f17828dg = r10
            mega.boicot.config.f17827df = r10
            mega.boicot.config r0 = r9.f18370a
            r0.f18072eq = r10
            mega.boicot.config r0 = r9.f18370a
            java.lang.String r2 = ""
            r0.f17998ca = r2
            mega.boicot.preinicio$a r0 = new mega.boicot.preinicio$a
            r0.<init>()
            java.lang.String[] r10 = new java.lang.String[r1]
            r0.execute(r10)
        L_0x0306:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.preinicio.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo20866a(String str, int i, Editor editor) {
        String str2 = "";
        if (this.f18378i.containsKey(str)) {
            str2 = (String) this.f18378i.get(str);
            if (i == 1) {
                editor.putInt(str, Integer.parseInt(str2));
            } else if (i == 2) {
                editor.putString(str, str2);
            } else if (i == 3) {
                editor.putFloat(str, Float.parseFloat(str2));
            } else if (i == 10) {
                editor.putBoolean(str, true);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_g");
                editor.putBoolean(sb.toString(), true);
            }
        }
        return str2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo20867a() {
        Bitmap bitmap;
        int i;
        findViewById(R.id.iv_splash).setVisibility(8);
        WebView webView = (WebView) findViewById(R.id.wv_splash);
        int i2 = 0;
        webView.setVisibility(0);
        try {
            AssetManager assets = getResources().getAssets();
            StringBuilder sb = new StringBuilder();
            sb.append("altres/");
            sb.append(this.f18377h);
            InputStream open = assets.open(sb.toString());
            bitmap = BitmapFactory.decodeStream(open);
            try {
                open.close();
            } catch (Exception | OutOfMemoryError unused) {
            }
        } catch (Exception | OutOfMemoryError unused2) {
            bitmap = null;
        }
        if (bitmap != null) {
            Display defaultDisplay = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int b = config.m23845b((Context) this, 10) * 2;
            int i3 = point.x - b;
            int i4 = point.y - b;
            int b2 = config.m23845b((Context) this, 25);
            int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                b2 = getResources().getDimensionPixelSize(identifier);
            }
            i = i4 - b2;
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (width > i3) {
                height = (height * i3) / width;
                width = i3;
                i2 = 1;
            }
            if (height > i) {
                width = (width * i) / height;
                height = i;
                i2 = 1;
            }
            if (i2 == 0) {
                int i5 = (height * i3) / width;
                if (i5 <= i) {
                    i = i5;
                    i2 = i3;
                } else {
                    i2 = (width * i) / height;
                }
            } else {
                i2 = width;
                i = height;
            }
        } else {
            i = 0;
        }
        String str = "";
        if (!this.f18364F.getString("c1_sp", "").equals("")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("background: #");
            sb2.append(this.f18364F.getString("c1_sp", "").substring(2));
            sb2.append(";background: linear-gradient(#");
            sb2.append(this.f18364F.getString("c1_sp", "").substring(2));
            sb2.append(", #");
            sb2.append(this.f18364F.getString("c2_sp", "").substring(2));
            sb2.append(");");
            str = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("<html style='height:100%;margin:0;padding:0;'><head></head><body style='");
        sb3.append(str);
        sb3.append("height:100%;margin:0;padding:0;'><table style='border:0;width:100%;height:100%;'><tr><td align='center'><img style='padding:0;margin:0;width:");
        sb3.append(config.m23822a((Context) this, (float) i2));
        sb3.append("px;height:");
        sb3.append(config.m23822a((Context) this, (float) i));
        sb3.append("px;' src='");
        sb3.append(this.f18377h);
        sb3.append("'></td></tr></table></body></html>");
        webView.loadDataWithBaseURL("file:///android_asset/altres/", sb3.toString(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo20870b() {
        String a = mo20865a("ft");
        String a2 = mo20865a("vfu");
        if (a2.equals("")) {
            a2 = "0";
        }
        if (a.equals("")) {
            mo20871c();
            return;
        }
        Editor edit = this.f18364F.edit();
        edit.putString("ft", a);
        edit.putString("vfu", a2);
        edit.commit();
        if (a.equals("0")) {
            this.f18370a.mo20783c(0);
            mo20871c();
        } else if (a.equals("1")) {
            if (Integer.parseInt(a2) > Integer.parseInt(this.f18364F.getString("vfu_act", "0"))) {
                new C5717b().execute(new String[]{a2});
                return;
            }
            this.f18370a.mo20783c(1);
            mo20871c();
        } else {
            this.f18370a.mo20783c(Integer.parseInt(a));
            mo20871c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo20871c() {
        if ((!this.f18370a.f17865X || this.f18370a.f17866Y <= this.f18364F.getInt("ofics_imgperso_v_act", 0)) && ((!this.f18370a.f17861T || this.f18370a.f17862U <= this.f18364F.getInt("busc_imgperso_v_act", 0)) && ((!this.f18370a.f17853L || this.f18370a.f17854M <= this.f18364F.getInt("share_imgperso_v_act", 0)) && ((!this.f18370a.f17895ab || this.f18370a.f17896ac <= this.f18364F.getInt("exit_imgperso_v_act", 0)) && ((!this.f18370a.f17899af || this.f18370a.f17900ag <= this.f18364F.getInt("notif_imgperso_v_act", 0)) && ((!this.f18370a.f17903aj || this.f18370a.f17904ak <= this.f18364F.getInt("perfil_imgperso_v_act", 0)) && (!this.f18370a.f17857P || this.f18370a.f17858Q <= this.f18364F.getInt("search_imgperso_v_act", 0)))))))) {
            mo20872d();
        } else {
            new C5719d().execute(new String[0]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo20872d() {
        String a = mo20865a("icohome");
        if (a.equals("1")) {
            String a2 = mo20865a("vih");
            new C5718c().execute(new String[]{a2});
        } else if (a.equals("2")) {
            deleteFile("icohome");
            mo20873e();
        } else {
            mo20873e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo20873e() {
        if (this.f18370a.f18045dm != 2 || !this.f18370a.f17969bx) {
            if (this.f18370a.f18045dm == 1 && this.f18370a.f17847F > 0 && this.f18364F.getInt("slider_v_act", 0) != this.f18370a.f17847F) {
                startService(new Intent(this, s_cargar_sliderheader.class));
            }
            mo20874f();
            return;
        }
        startService(new Intent(this, s_cargar_icos.class));
        mo20874f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo20874f() {
        if (this.f18370a.f17849H == 2) {
            findViewById(R.id.pb_splash).setVisibility(8);
        }
        if (this.f18384o) {
            String a = mo20865a("fus");
            if (!a.equals("")) {
                Editor edit = this.f18364F.edit();
                edit.putString("fultsync", a);
                edit.commit();
            }
        }
        if (this.f18378i.containsKey("espera")) {
            this.f18381l = Integer.parseInt(mo20865a("espera"));
            this.f18359A = new ProgressDialog(this);
            this.f18359A.setCancelable(true);
            this.f18359A.setCanceledOnTouchOutside(false);
            this.f18359A.setTitle(getResources().getString(R.string.appnoreg));
            ProgressDialog progressDialog = this.f18359A;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f18381l);
            sb.append("s.");
            progressDialog.setMessage(sb.toString());
            this.f18359A.setIndeterminate(true);
            this.f18359A.setOnCancelListener(new OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    try {
                        preinicio.this.f18366H.interrupt();
                    } catch (Exception unused) {
                    }
                    preinicio.this.finish();
                }
            });
            try {
                this.f18359A.show();
            } catch (Exception unused) {
            }
            final C570335 r0 = new Handler() {
                public void handleMessage(Message message) {
                    super.handleMessage(message);
                    if (preinicio.this.f18381l > 0) {
                        preinicio.this.f18381l--;
                        try {
                            ProgressDialog progressDialog = preinicio.this.f18359A;
                            StringBuilder sb = new StringBuilder();
                            sb.append(preinicio.this.f18381l);
                            sb.append("s.");
                            progressDialog.setMessage(sb.toString());
                        } catch (Exception unused) {
                        }
                        if (preinicio.this.f18381l == 0) {
                            preinicio.this.m23954j();
                        }
                    }
                }
            };
            this.f18366H = new Thread(new Runnable() {
                public void run() {
                    while (preinicio.this.f18381l > 0) {
                        try {
                            Thread.sleep(1000);
                            r0.sendMessage(r0.obtainMessage());
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
            });
            this.f18366H.start();
            return;
        }
        m23954j();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m23954j() {
        boolean z;
        if (!this.f18370a.f17878aK || this.f18364F.getInt("a", 0) != 1 || this.f18364F.contains("cookies_aceptado")) {
            m23955k();
            return;
        }
        String country = Locale.getDefault().getCountry();
        if (country != null) {
            z = Arrays.asList(new String[]{"BE", "LT", "PT", "BG", "ES", "LU", "RO", "CZ", "FR", "HU", "SI", "DK", "MT", "SK", "DE", "IT", "NL", "FI", "EE", "CY", "AT", "SE", "IE", "LV", "PL", "CH", "NO", "IS", "LI", "HR", "GR", "GB", "UK"}).contains(country.toUpperCase());
        } else {
            z = false;
        }
        if (z) {
            Builder builder = new Builder(this);
            builder.setMessage(getString(R.string.cookies_txt)).setTitle(getString(R.string.aviso));
            builder.setCancelable(false);
            builder.setNegativeButton("No", new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    preinicio.this.finish();
                }
            });
            builder.setPositiveButton(R.string.si, new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Editor edit = preinicio.this.f18364F.edit();
                    edit.putBoolean("cookies_aceptado", true);
                    edit.commit();
                    preinicio.this.m23955k();
                }
            });
            final AlertDialog create = builder.create();
            if (!this.f18375f.equals("")) {
                create.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        Button button = create.getButton(-1);
                        StringBuilder sb = new StringBuilder();
                        sb.append("#");
                        sb.append(preinicio.this.f18375f);
                        button.setTextColor(Color.parseColor(sb.toString()));
                        Button button2 = create.getButton(-2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("#");
                        sb2.append(preinicio.this.f18375f);
                        button2.setTextColor(Color.parseColor(sb2.toString()));
                    }
                });
            }
            create.show();
            try {
                ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
            } catch (Exception unused) {
            }
        } else {
            m23955k();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0172, code lost:
        if (((android.graphics.drawable.BitmapDrawable) r0).getBitmap() != null) goto L_0x0176;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0181  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m23955k() {
        /*
            r6 = this;
            java.lang.String r0 = ""
            mega.boicot.config r1 = r6.f18370a
            java.lang.String r1 = mega.boicot.config.f17821cp
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0013
            mega.boicot.config r0 = r6.f18370a
            java.lang.String r0 = mega.boicot.config.f17821cp
            goto L_0x007e
        L_0x0013:
            mega.boicot.config r1 = r6.f18370a
            java.lang.String r1 = r1.f18012cw
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0024
            mega.boicot.config r0 = r6.f18370a
            java.lang.String r0 = r0.f18012cw
            goto L_0x007e
        L_0x0024:
            mega.boicot.config r1 = r6.f18370a
            java.lang.String r1 = r1.f17977cF
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0035
            mega.boicot.config r0 = r6.f18370a
            java.lang.String r0 = r0.f17977cF
            goto L_0x007e
        L_0x0035:
            mega.boicot.config r1 = r6.f18370a
            java.lang.String r1 = r1.f17983cL
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0046
            mega.boicot.config r0 = r6.f18370a
            java.lang.String r0 = r0.f17983cL
            goto L_0x007e
        L_0x0046:
            mega.boicot.config r1 = r6.f18370a
            java.lang.String r1 = r1.f17984cM
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0057
            mega.boicot.config r0 = r6.f18370a
            java.lang.String r0 = r0.f17984cM
            goto L_0x007e
        L_0x0057:
            mega.boicot.config r1 = r6.f18370a
            java.lang.String r1 = r1.f17989cR
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0068
            mega.boicot.config r0 = r6.f18370a
            java.lang.String r0 = r0.f17989cR
            goto L_0x007e
        L_0x0068:
            mega.boicot.config r1 = r6.f18370a
            boolean r1 = r1.f18044dc
            if (r1 == 0) goto L_0x007e
            mega.boicot.config r1 = r6.f18370a
            java.lang.String r1 = r1.f18043db
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x007e
            mega.boicot.config r0 = r6.f18370a
            java.lang.String r0 = r0.f18043db
        L_0x007e:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0097
            com.startapp.android.publish.adsCommon.StartAppSDK.init(r6, r0, r3)
            com.startapp.android.publish.adsCommon.StartAppAd.disableSplash()
            java.lang.String r0 = "pas"
            long r4 = java.lang.System.currentTimeMillis()
            com.startapp.android.publish.adsCommon.StartAppSDK.setUserConsent(r6, r0, r4, r2)
        L_0x0097:
            r6.f18385p = r3
            mega.boicot.config r0 = r6.f18370a
            java.lang.String r0 = r0.f18023dH
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0149
            android.content.SharedPreferences r0 = r6.f18364F
            java.lang.String r1 = "bienvenida_nomas"
            boolean r0 = r0.getBoolean(r1, r3)
            if (r0 != 0) goto L_0x0149
            r6.f18385p = r2
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r6)
            r6.f18361C = r0
            mega.boicot.config r0 = r6.f18370a
            java.lang.String r0 = r0.f18022dG
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00cd
            android.app.AlertDialog$Builder r0 = r6.f18361C
            mega.boicot.config r1 = r6.f18370a
            java.lang.String r1 = r1.f18022dG
            r0.setTitle(r1)
        L_0x00cd:
            mega.boicot.config r0 = r6.f18370a
            boolean r0 = r0.f18024dI
            if (r0 == 0) goto L_0x0126
            android.view.LayoutInflater r0 = r6.getLayoutInflater()
            r1 = 2131361841(0x7f0a0031, float:1.8343446E38)
            r4 = 0
            android.view.View r0 = r0.inflate(r1, r4)
            r1 = 2131231246(0x7f08020e, float:1.8078568E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.text.method.ScrollingMovementMethod r4 = new android.text.method.ScrollingMovementMethod
            r4.<init>()
            r1.setMovementMethod(r4)
            mega.boicot.config r4 = r6.f18370a
            java.lang.String r4 = r4.f18023dH
            android.text.Spanned r4 = android.text.Html.fromHtml(r4)
            r1.setText(r4)
            r1 = 2131231428(0x7f0802c4, float:1.8078937E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r6.f18367I = r1
            java.lang.String r1 = r6.f18375f
            java.lang.String r4 = ""
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0117
            android.widget.CheckBox r1 = r6.f18367I
            java.lang.String r4 = r6.f18375f
            mega.boicot.config.m23836a(r1, r4)
        L_0x0117:
            android.widget.CheckBox r1 = r6.f18367I
            mega.boicot.config r4 = r6.f18370a
            boolean r4 = r4.f18025dJ
            r1.setChecked(r4)
            android.app.AlertDialog$Builder r1 = r6.f18361C
            r1.setView(r0)
            goto L_0x0133
        L_0x0126:
            android.app.AlertDialog$Builder r0 = r6.f18361C
            mega.boicot.config r1 = r6.f18370a
            java.lang.String r1 = r1.f18023dH
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
            r0.setMessage(r1)
        L_0x0133:
            android.app.AlertDialog$Builder r0 = r6.f18361C
            r0.setCancelable(r3)
            android.app.AlertDialog$Builder r0 = r6.f18361C
            r1 = 2131558439(0x7f0d0027, float:1.8742194E38)
            java.lang.String r1 = r6.getString(r1)
            mega.boicot.preinicio$2 r4 = new mega.boicot.preinicio$2
            r4.<init>()
            r0.setPositiveButton(r1, r4)
        L_0x0149:
            mega.boicot.config r0 = r6.f18370a
            int r0 = r0.f17846E
            if (r0 <= 0) goto L_0x0175
            r0 = 2131231668(0x7f0803b4, float:1.8079424E38)
            android.view.View r0 = r6.findViewById(r0)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x015d
            goto L_0x0176
        L_0x015d:
            r0 = 2131231123(0x7f080193, float:1.8078318E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L_0x0175
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            if (r0 == 0) goto L_0x0175
            goto L_0x0176
        L_0x0175:
            r2 = r3
        L_0x0176:
            if (r2 == 0) goto L_0x0181
            mega.boicot.preinicio$3 r0 = new mega.boicot.preinicio$3
            r0.<init>()
            r0.start()
            goto L_0x01bc
        L_0x0181:
            boolean r0 = r6.f18385p
            if (r0 == 0) goto L_0x01b9
            android.app.AlertDialog$Builder r0 = r6.f18361C
            android.app.AlertDialog r0 = r0.create()
            java.lang.String r1 = r6.f18375f
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x019d
            mega.boicot.preinicio$4 r1 = new mega.boicot.preinicio$4
            r1.<init>(r0)
            r0.setOnShowListener(r1)
        L_0x019d:
            r0.show()     // Catch:{ Exception -> 0x01b5 }
            mega.boicot.config r1 = r6.f18370a     // Catch:{ Exception -> 0x01b5 }
            boolean r1 = r1.f18024dI     // Catch:{ Exception -> 0x01b5 }
            if (r1 != 0) goto L_0x01bc
            r1 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x01bc }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x01bc }
            android.graphics.Typeface r1 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x01bc }
            r0.setTypeface(r1)     // Catch:{ Exception -> 0x01bc }
            goto L_0x01bc
        L_0x01b5:
            r6.m23956l()
            goto L_0x01bc
        L_0x01b9:
            r6.m23956l()
        L_0x01bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.preinicio.m23955k():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m23956l() {
        if (this.f18370a.f18030dO > 0) {
            int i = this.f18364F.getInt("rt_n", 0);
            if (i == -1) {
                m23958n();
                return;
            }
            int i2 = i + 1;
            Editor edit = this.f18364F.edit();
            edit.putInt("rt_n", i2);
            edit.commit();
            if (i2 < this.f18370a.f18030dO) {
                m23958n();
            } else if (i2 == this.f18370a.f18030dO || (this.f18370a.f18031dP > 0 && (i2 - this.f18370a.f18030dO) % this.f18370a.f18031dP == 0)) {
                Builder builder = new Builder(this);
                builder.setCancelable(false);
                builder.setPositiveButton(this.f18370a.f18028dM.equals("") ? getResources().getString(R.string.aceptar) : this.f18370a.f18028dM, new OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("market://details?id=");
                        sb.append(preinicio.this.getPackageName());
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
                        intent.addFlags(1208483840);
                        Editor edit = preinicio.this.f18364F.edit();
                        edit.putInt("rt_n", -1);
                        edit.commit();
                        preinicio.this.f18391v = true;
                        try {
                            preinicio.this.startActivity(intent);
                        } catch (Exception unused) {
                            preinicio preinicio = preinicio.this;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("http://play.google.com/store/apps/details?id=");
                            sb2.append(preinicio.this.getPackageName());
                            preinicio.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb2.toString())));
                        }
                    }
                });
                builder.setNegativeButton(this.f18370a.f18029dN.equals("") ? getResources().getString(R.string.cancelar) : this.f18370a.f18029dN, new OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        preinicio.this.m23958n();
                    }
                });
                if (!this.f18370a.f18026dK.equals("")) {
                    builder.setTitle(this.f18370a.f18026dK);
                }
                if (!this.f18370a.f18027dL.equals("")) {
                    builder.setMessage(this.f18370a.f18027dL);
                }
                final AlertDialog create = builder.create();
                if (!this.f18375f.equals("")) {
                    create.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            Button button = create.getButton(-1);
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            sb.append(preinicio.this.f18375f);
                            button.setTextColor(Color.parseColor(sb.toString()));
                            Button button2 = create.getButton(-2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("#");
                            sb2.append(preinicio.this.f18375f);
                            button2.setTextColor(Color.parseColor(sb2.toString()));
                        }
                    });
                }
                try {
                    create.show();
                } catch (Exception unused) {
                }
                try {
                    ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
                } catch (Exception unused2) {
                }
            } else {
                m23958n();
            }
        } else {
            m23958n();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo20875g() {
        if (!this.f18364F.getBoolean("pwd_validado", true)) {
            mo20877i();
        } else {
            m23959o();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m23947b(String str) {
        boolean z = !this.f18370a.f17998ca.equals("");
        NativeAd nativeAd = !z ? new NativeAd(getApplicationContext(), str) : null;
        findViewById(R.id.iv_splash).setVisibility(8);
        findViewById(R.id.wv_splash).setVisibility(8);
        findViewById(R.id.v_anext).setVisibility(0);
        if (this.f18370a.f17849H == 1) {
            config.m23838a((ProgressBar) findViewById(R.id.progressBar), this.f18373d);
        } else if (this.f18370a.f17849H == 2) {
            config.m23838a((ProgressBar) findViewById(R.id.progressBar), this.f18370a.f17852K);
        }
        findViewById(R.id.rl_anext).setVisibility(0);
        if (!z) {
            findViewById(R.id.na_view).setVisibility(0);
            nativeAd.setPrivacyPolicyColor(0);
            nativeAd.setAdListener(new NativeAdListener() {
                public void onAdLoaded(NativeAd nativeAd) {
                    super.onAdLoaded(nativeAd);
                    preinicio.this.m23943a(Boolean.valueOf(false), nativeAd);
                }

                public void onAdClicked(NativeAd nativeAd) {
                    super.onAdClicked(nativeAd);
                }

                public void onError(NativeAd nativeAd, AppnextError appnextError) {
                    super.onError(nativeAd, appnextError);
                    preinicio.this.findViewById(R.id.progressBar).setVisibility(8);
                    if (!preinicio.this.f18386q) {
                        config.f17826de = null;
                        preinicio.this.f18386q = true;
                        preinicio.this.mo20875g();
                    }
                }

                public void adImpression(NativeAd nativeAd) {
                    super.adImpression(nativeAd);
                }
            });
            nativeAd.loadAd(new NativeAdRequest().setCachingPolicy(CachingPolicy.STATIC_ONLY).setCreativeType(CreativeType.STATIC_ONLY).setVideoLength(VideoLength.SHORT).setVideoQuality(VideoQuality.LOW));
            return;
        }
        m23943a(Boolean.valueOf(true), (NativeAd) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x034e */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02af  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m23943a(java.lang.Boolean r24, com.appnext.nativeads.NativeAd r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            boolean r2 = r24.booleanValue()
            r3 = 8
            if (r2 != 0) goto L_0x0016
            r2 = 2131231360(0x7f080280, float:1.8078799E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setVisibility(r3)
        L_0x0016:
            r2 = 2131231359(0x7f08027f, float:1.8078797E38)
            r4 = 3
            android.view.View r5 = r0.findViewById(r2)     // Catch:{ Exception -> 0x0025 }
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ Exception -> 0x0025 }
            android.graphics.Typeface r6 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x0025 }
            r5.setTypeface(r6, r4)     // Catch:{ Exception -> 0x0025 }
        L_0x0025:
            android.content.SharedPreferences r5 = r0.f18364F
            java.lang.String r6 = "c1_sp"
            java.lang.String r7 = ""
            java.lang.String r5 = r5.getString(r6, r7)
            java.lang.String r6 = ""
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0062
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "#"
            r5.append(r6)
            android.content.SharedPreferences r6 = r0.f18364F
            java.lang.String r7 = "c1_sp"
            java.lang.String r8 = ""
            java.lang.String r6 = r6.getString(r7, r8)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            boolean r5 = mega.boicot.config.m23844a(r5)
            if (r5 != 0) goto L_0x0062
            android.view.View r5 = r0.findViewById(r2)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = -1
            r5.setTextColor(r6)
        L_0x0062:
            android.view.View r2 = r0.findViewById(r2)
            r5 = 0
            r2.setVisibility(r5)
            boolean r2 = r24.booleanValue()
            r6 = 2131231254(0x7f080216, float:1.8078584E38)
            r7 = 1
            if (r2 == 0) goto L_0x0089
            mega.boicot.preinicio$f r2 = new mega.boicot.preinicio$f
            r2.<init>(r5)
            java.lang.String[] r8 = new java.lang.String[r5]
            r2.execute(r8)
            mega.boicot.preinicio$f r2 = new mega.boicot.preinicio$f
            r2.<init>(r7)
            java.lang.String[] r8 = new java.lang.String[r5]
            r2.execute(r8)
            goto L_0x0096
        L_0x0089:
            android.view.View r2 = r0.findViewById(r6)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            java.lang.String r8 = r25.getIconURL()
            r1.downloadAndDisplayImage(r2, r8)
        L_0x0096:
            boolean r2 = r24.booleanValue()
            r8 = 2131231256(0x7f080218, float:1.8078588E38)
            r9 = 2131230740(0x7f080014, float:1.8077541E38)
            if (r2 == 0) goto L_0x00b0
            android.view.View r2 = r0.findViewById(r9)
            android.widget.TextView r2 = (android.widget.TextView) r2
            mega.boicot.config r10 = r0.f18370a
            java.lang.String r10 = r10.f17998ca
            r2.setText(r10)
            goto L_0x00bd
        L_0x00b0:
            android.view.View r2 = r0.findViewById(r8)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r10 = r25.getAdTitle()
            r2.setText(r10)
        L_0x00bd:
            android.graphics.Typeface r10 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x00c2 }
            r2.setTypeface(r10, r7)     // Catch:{ Exception -> 0x00c2 }
        L_0x00c2:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 2130968579(0x7f040003, float:1.7545816E38)
            r12 = 17
            r13 = 4
            if (r10 < r12) goto L_0x00d9
            android.content.res.Resources r10 = r23.getResources()
            boolean r10 = r10.getBoolean(r11)
            if (r10 == 0) goto L_0x00d9
            r2.setTextDirection(r13)
        L_0x00d9:
            r2 = 0
            r10 = 0
            boolean r14 = r24.booleanValue()
            if (r14 == 0) goto L_0x00eb
            r10 = 2131230739(0x7f080013, float:1.807754E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            goto L_0x00f7
        L_0x00eb:
            r2 = 2131231255(0x7f080217, float:1.8078586E38)
            android.view.View r2 = r0.findViewById(r2)
            com.appnext.nativeads.MediaView r2 = (com.appnext.nativeads.MediaView) r2
            r1.setMediaView(r2)
        L_0x00f7:
            android.content.res.Resources r14 = r23.getResources()
            android.content.res.Configuration r14 = r14.getConfiguration()
            int r14 = r14.orientation
            r15 = 2
            if (r14 != r15) goto L_0x0106
        L_0x0104:
            r6 = r7
            goto L_0x0139
        L_0x0106:
            r14 = 372(0x174, float:5.21E-43)
            android.content.Context r8 = r23.getApplicationContext()
            int r8 = mega.boicot.config.m23845b(r8, r14)
            android.content.Context r14 = r23.getApplicationContext()
            java.lang.String r6 = "window"
            java.lang.Object r6 = r14.getSystemService(r6)
            android.view.WindowManager r6 = (android.view.WindowManager) r6
            android.view.Display r6 = r6.getDefaultDisplay()
            android.graphics.Point r14 = new android.graphics.Point
            r14.<init>()
            r6.getSize(r14)
            int r6 = r14.y
            double r11 = (double) r6
            r16 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r11 = r11 * r16
            double r13 = (double) r8
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x0138
            goto L_0x0104
        L_0x0138:
            r6 = r5
        L_0x0139:
            r8 = 2131230915(0x7f0800c3, float:1.8077896E38)
            r11 = 2131230735(0x7f08000f, float:1.8077531E38)
            if (r6 == 0) goto L_0x0160
            boolean r6 = r24.booleanValue()
            if (r6 == 0) goto L_0x0154
            r10.setVisibility(r3)
            android.view.View r3 = r0.findViewById(r11)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setMaxLines(r7)
            goto L_0x0160
        L_0x0154:
            r2.setVisibility(r3)
            android.view.View r3 = r0.findViewById(r8)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setMaxLines(r7)
        L_0x0160:
            boolean r3 = r24.booleanValue()
            if (r3 == 0) goto L_0x016b
            mega.boicot.config r3 = r0.f18370a
            java.lang.String r3 = r3.f18002ce
            goto L_0x016f
        L_0x016b:
            java.lang.String r3 = r25.getStoreRating()
        L_0x016f:
            if (r3 == 0) goto L_0x02c4
            int r6 = r3.length()
            if (r6 != r4) goto L_0x02c4
            boolean r6 = r24.booleanValue()
            if (r6 == 0) goto L_0x01df
            r6 = 2131230742(0x7f080016, float:1.8077545E38)
            android.view.View r6 = r0.findViewById(r6)
            r10 = 2131230745(0x7f080019, float:1.8077551E38)
            android.view.View r10 = r0.findViewById(r10)
            r12 = 2131230748(0x7f08001c, float:1.8077558E38)
            android.view.View r12 = r0.findViewById(r12)
            r13 = 2131230751(0x7f08001f, float:1.8077564E38)
            android.view.View r13 = r0.findViewById(r13)
            r14 = 2131230754(0x7f080022, float:1.807757E38)
            android.view.View r14 = r0.findViewById(r14)
            r9 = 2131230747(0x7f08001b, float:1.8077556E38)
            android.view.View r9 = r0.findViewById(r9)
            r8 = 2131230750(0x7f08001e, float:1.8077562E38)
            android.view.View r8 = r0.findViewById(r8)
            r11 = 2131230753(0x7f080021, float:1.8077568E38)
            android.view.View r11 = r0.findViewById(r11)
            r4 = 2131230756(0x7f080024, float:1.8077574E38)
            android.view.View r4 = r0.findViewById(r4)
            r15 = 2131230746(0x7f08001a, float:1.8077553E38)
            android.view.View r15 = r0.findViewById(r15)
            r5 = 2131230749(0x7f08001d, float:1.807756E38)
            android.view.View r5 = r0.findViewById(r5)
            r7 = 2131230752(0x7f080020, float:1.8077566E38)
            android.view.View r7 = r0.findViewById(r7)
            r18 = r4
            r4 = 2131230755(0x7f080023, float:1.8077572E38)
            android.view.View r4 = r0.findViewById(r4)
            r20 = r2
            r2 = r18
            goto L_0x0240
        L_0x01df:
            r4 = 2131231365(0x7f080285, float:1.8078809E38)
            android.view.View r6 = r0.findViewById(r4)
            r4 = 2131231368(0x7f080288, float:1.8078815E38)
            android.view.View r10 = r0.findViewById(r4)
            r4 = 2131231371(0x7f08028b, float:1.8078821E38)
            android.view.View r12 = r0.findViewById(r4)
            r4 = 2131231374(0x7f08028e, float:1.8078827E38)
            android.view.View r13 = r0.findViewById(r4)
            r4 = 2131231377(0x7f080291, float:1.8078833E38)
            android.view.View r14 = r0.findViewById(r4)
            r4 = 2131231370(0x7f08028a, float:1.807882E38)
            android.view.View r9 = r0.findViewById(r4)
            r4 = 2131231373(0x7f08028d, float:1.8078825E38)
            android.view.View r8 = r0.findViewById(r4)
            r4 = 2131231376(0x7f080290, float:1.8078831E38)
            android.view.View r11 = r0.findViewById(r4)
            r4 = 2131231379(0x7f080293, float:1.8078837E38)
            android.view.View r4 = r0.findViewById(r4)
            r5 = 2131231369(0x7f080289, float:1.8078817E38)
            android.view.View r15 = r0.findViewById(r5)
            r5 = 2131231372(0x7f08028c, float:1.8078823E38)
            android.view.View r5 = r0.findViewById(r5)
            r7 = 2131231375(0x7f08028f, float:1.807883E38)
            android.view.View r7 = r0.findViewById(r7)
            r19 = r4
            r4 = 2131231378(0x7f080292, float:1.8078835E38)
            android.view.View r4 = r0.findViewById(r4)
            r20 = r2
            r2 = r19
        L_0x0240:
            r21 = r15
            r0 = 1
            r1 = 0
            java.lang.String r15 = r3.substring(r1, r0)     // Catch:{ Exception -> 0x0257 }
            int r0 = java.lang.Integer.parseInt(r15)     // Catch:{ Exception -> 0x0257 }
            r1 = 3
            r15 = 2
            java.lang.String r3 = r3.substring(r15, r1)     // Catch:{ Exception -> 0x0259 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x0259 }
            goto L_0x025a
        L_0x0257:
            r1 = 3
            r0 = 0
        L_0x0259:
            r3 = 0
        L_0x025a:
            r15 = 5
            if (r3 >= r1) goto L_0x025f
        L_0x025d:
            r1 = 0
            goto L_0x0266
        L_0x025f:
            r1 = 7
            if (r3 <= r1) goto L_0x0265
            int r0 = r0 + 1
            goto L_0x025d
        L_0x0265:
            r1 = r15
        L_0x0266:
            if (r0 <= 0) goto L_0x02c6
            r3 = 6
            if (r0 >= r3) goto L_0x02c6
            r3 = 0
            r6.setVisibility(r3)
            r6 = 1
            if (r0 <= r6) goto L_0x02af
            r10.setVisibility(r3)
            r6 = 2
            if (r0 <= r6) goto L_0x029f
            r12.setVisibility(r3)
            r5 = 3
            if (r0 <= r5) goto L_0x0292
            r13.setVisibility(r3)
            r5 = 4
            if (r0 <= r5) goto L_0x0288
            r14.setVisibility(r3)
            goto L_0x02c6
        L_0x0288:
            if (r1 != r15) goto L_0x028e
            r2.setVisibility(r3)
            goto L_0x02c6
        L_0x028e:
            r4.setVisibility(r3)
            goto L_0x02c6
        L_0x0292:
            if (r1 != r15) goto L_0x0298
            r11.setVisibility(r3)
            goto L_0x029b
        L_0x0298:
            r7.setVisibility(r3)
        L_0x029b:
            r4.setVisibility(r3)
            goto L_0x02c6
        L_0x029f:
            if (r1 != r15) goto L_0x02a5
            r8.setVisibility(r3)
            goto L_0x02a8
        L_0x02a5:
            r5.setVisibility(r3)
        L_0x02a8:
            r7.setVisibility(r3)
            r4.setVisibility(r3)
            goto L_0x02c6
        L_0x02af:
            if (r1 != r15) goto L_0x02b5
            r9.setVisibility(r3)
            goto L_0x02ba
        L_0x02b5:
            r15 = r21
            r15.setVisibility(r3)
        L_0x02ba:
            r5.setVisibility(r3)
            r7.setVisibility(r3)
            r4.setVisibility(r3)
            goto L_0x02c6
        L_0x02c4:
            r20 = r2
        L_0x02c6:
            boolean r0 = r24.booleanValue()
            if (r0 == 0) goto L_0x02f4
            r0 = r23
            r1 = 2131230735(0x7f08000f, float:1.8077531E38)
            android.view.View r2 = r0.findViewById(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            mega.boicot.config r1 = r0.f18370a
            java.lang.String r1 = r1.f17999cb
            r2.setText(r1)
            r1 = 2131230734(0x7f08000e, float:1.807753E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3 = 2131230736(0x7f080010, float:1.8077533E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            r4 = r1
            r1 = r25
            goto L_0x031f
        L_0x02f4:
            r0 = r23
            r1 = 2131230915(0x7f0800c3, float:1.8077896E38)
            android.view.View r2 = r0.findViewById(r1)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1 = r25
            java.lang.String r3 = r25.getAdDescription()
            r2.setText(r3)
            r3 = 2131230901(0x7f0800b5, float:1.8077868E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 2131231033(0x7f080139, float:1.8078136E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.Button r4 = (android.widget.Button) r4
            r22 = r4
            r4 = r3
            r3 = r22
        L_0x031f:
            android.graphics.Typeface r5 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x0324 }
            r2.setTypeface(r5)     // Catch:{ Exception -> 0x0324 }
        L_0x0324:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 17
            if (r5 < r6) goto L_0x033b
            android.content.res.Resources r5 = r23.getResources()
            r6 = 2130968579(0x7f040003, float:1.7545816E38)
            boolean r5 = r5.getBoolean(r6)
            if (r5 == 0) goto L_0x033b
            r5 = 4
            r2.setTextDirection(r5)
        L_0x033b:
            android.content.res.Resources r2 = r23.getResources()
            r5 = 2131558441(0x7f0d0029, float:1.8742198E38)
            java.lang.String r2 = r2.getString(r5)
            r3.setText(r2)
            android.graphics.Typeface r2 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x034e }
            r3.setTypeface(r2)     // Catch:{ Exception -> 0x034e }
        L_0x034e:
            android.graphics.Typeface r2 = android.graphics.Typeface.MONOSPACE     // Catch:{ Exception -> 0x0353 }
            r4.setTypeface(r2)     // Catch:{ Exception -> 0x0353 }
        L_0x0353:
            mega.boicot.preinicio$9 r2 = new mega.boicot.preinicio$9
            r2.<init>()
            r4.setOnClickListener(r2)
            boolean r2 = r24.booleanValue()
            if (r2 == 0) goto L_0x03bc
            r1 = 2131230738(0x7f080012, float:1.8077537E38)
            android.view.View r1 = r0.findViewById(r1)
            mega.boicot.preinicio$10 r2 = new mega.boicot.preinicio$10
            r2.<init>()
            r1.setOnClickListener(r2)
            r1 = 2131230740(0x7f080014, float:1.8077541E38)
            android.view.View r1 = r0.findViewById(r1)
            mega.boicot.preinicio$11 r2 = new mega.boicot.preinicio$11
            r2.<init>()
            r1.setOnClickListener(r2)
            r1 = 2131230757(0x7f080025, float:1.8077576E38)
            android.view.View r1 = r0.findViewById(r1)
            mega.boicot.preinicio$13 r2 = new mega.boicot.preinicio$13
            r2.<init>()
            r1.setOnClickListener(r2)
            r1 = 2131230735(0x7f08000f, float:1.8077531E38)
            android.view.View r1 = r0.findViewById(r1)
            mega.boicot.preinicio$14 r2 = new mega.boicot.preinicio$14
            r2.<init>()
            r1.setOnClickListener(r2)
            r1 = 2131230736(0x7f080010, float:1.8077533E38)
            android.view.View r1 = r0.findViewById(r1)
            mega.boicot.preinicio$15 r2 = new mega.boicot.preinicio$15
            r2.<init>()
            r1.setOnClickListener(r2)
            r1 = 2131230739(0x7f080013, float:1.807754E38)
            android.view.View r1 = r0.findViewById(r1)
            mega.boicot.preinicio$16 r2 = new mega.boicot.preinicio$16
            r2.<init>()
            r1.setOnClickListener(r2)
            goto L_0x0400
        L_0x03bc:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4 = 2131231254(0x7f080216, float:1.8078584E38)
            android.view.View r4 = r0.findViewById(r4)
            r2.add(r4)
            r4 = 2131231256(0x7f080218, float:1.8078588E38)
            android.view.View r4 = r0.findViewById(r4)
            r2.add(r4)
            r4 = 2131231380(0x7f080294, float:1.807884E38)
            android.view.View r4 = r0.findViewById(r4)
            r2.add(r4)
            r4 = 2131230915(0x7f0800c3, float:1.8077896E38)
            android.view.View r4 = r0.findViewById(r4)
            r2.add(r4)
            r2.add(r3)
            r3 = r20
            r2.add(r3)
            r1.registerClickableViews(r2)
            r2 = 2131231257(0x7f080219, float:1.807859E38)
            android.view.View r2 = r0.findViewById(r2)
            com.appnext.nativeads.NativeAdView r2 = (com.appnext.nativeads.NativeAdView) r2
            r1.setNativeAdView(r2)
        L_0x0400:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.preinicio.m23943a(java.lang.Boolean, com.appnext.nativeads.NativeAd):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m23957m() {
        StringBuilder sb = new StringBuilder();
        sb.append("https://play.google.com/store/apps/details?id=");
        sb.append(this.f18370a.f18003cf);
        sb.append("&referrer=");
        sb.append(this.f18370a.f18004cg);
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("http://");
        sb2.append(config.f17839g);
        sb2.append("/srv/acad.php?idapp=");
        sb2.append(718963);
        sb2.append("&idusu=");
        sb2.append(this.f18379j);
        sb2.append("&tipo=2&ref=");
        sb2.append(this.f18370a.f18004cg);
        new C5643e(sb2.toString(), "Android Vinebre Software").execute(new String[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m23958n() {
        this.f18388s = false;
        this.f18389t = false;
        int c = this.f18370a.mo20781c();
        if (c == 2 || c == 5) {
            if (c != 5 && !config.m23862o(this) && !config.m23863p(this)) {
                config.f17826de = new Interstitial(getApplicationContext(), config.f17817cl);
                config.f17826de.setMute(true);
                if (!config.f17823cr.booleanValue()) {
                    config.f17826de.setAutoPlay(false);
                }
                config.f17826de.setBackButtonCanClose(true);
                config.f17826de.setSkipText(getResources().getString(R.string.ad_saltar));
                config.f17826de.setOnAdLoadedCallback(new OnAdLoaded() {
                    public void adLoaded(String str) {
                        config.f17826de.showAd();
                    }
                });
                config.f17826de.setOnAdClosedCallback(new OnAdClosed() {
                    public void onAdClosed() {
                        config.f17826de = null;
                    }
                });
                config.f17826de.setOnAdErrorCallback(new OnAdError() {
                    public void adError(String str) {
                        config.f17826de = null;
                    }
                });
                config.f17826de.loadAd();
                mo20875g();
            } else if (c == 5 || config.f17832dk == 1) {
                final String str = c == 2 ? config.f17817cl : null;
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.3f, 1.0f, 0.3f, 1, 0.5f, 1, 0.0f);
                scaleAnimation.setFillAfter(true);
                scaleAnimation.setDuration(500);
                scaleAnimation.setAnimationListener(new AnimationListener() {
                    public void onAnimationRepeat(Animation animation) {
                    }

                    public void onAnimationStart(Animation animation) {
                    }

                    public void onAnimationEnd(Animation animation) {
                        preinicio.this.m23947b(str);
                    }
                });
                ImageView imageView = (ImageView) findViewById(R.id.iv_splash);
                WebView webView = (WebView) findViewById(R.id.wv_splash);
                if (webView.getVisibility() == 0) {
                    webView.setVisibility(8);
                    findViewById(R.id.v_anext).setVisibility(8);
                    findViewById(R.id.rl_anext).setLayoutParams(new LayoutParams(-1, -1));
                    m23947b(str);
                } else if (imageView.getVisibility() == 0) {
                    imageView.startAnimation(scaleAnimation);
                } else {
                    findViewById(R.id.v_anext).setVisibility(8);
                    findViewById(R.id.rl_anext).setLayoutParams(new LayoutParams(-1, -1));
                    m23947b(str);
                }
            } else {
                config.f17826de = new Interstitial(getApplicationContext(), config.f17817cl);
                config.f17826de.setMute(true);
                if (!config.f17823cr.booleanValue()) {
                    config.f17826de.setAutoPlay(false);
                }
                config.f17826de.setBackButtonCanClose(true);
                config.f17826de.setSkipText(getResources().getString(R.string.ad_saltar));
                config.f17826de.setOnAdLoadedCallback(new OnAdLoaded() {
                    public void adLoaded(String str) {
                        config.f17826de.showAd();
                    }
                });
                config.f17826de.setOnAdClosedCallback(new OnAdClosed() {
                    public void onAdClosed() {
                        if (!preinicio.this.f18386q) {
                            config.f17826de = null;
                            preinicio.this.f18386q = true;
                            preinicio.this.mo20875g();
                        }
                    }
                });
                config.f17826de.setOnAdErrorCallback(new OnAdError() {
                    public void adError(String str) {
                        if (!preinicio.this.f18386q) {
                            config.f17826de = null;
                            preinicio.this.f18386q = true;
                            preinicio.this.mo20875g();
                        }
                    }
                });
                config.f17826de.loadAd();
            }
        } else if (c == 1) {
            this.f18388s = true;
            mo20875g();
        } else if (c == 3) {
            this.f18389t = true;
            mo20875g();
        } else if (c != 4) {
            mo20875g();
        } else if (config.m23862o(this) || config.m23863p(this)) {
            config.f17828dg = new StartAppAd(getApplicationContext());
            String str2 = "INTERSTITIAL";
            if (config.f17831dj == 1) {
                str2 = "Intersticial entrada";
            }
            config.f17828dg.showAd(str2, new AdDisplayListener() {
                public void adClicked(C5286Ad ad) {
                }

                public void adDisplayed(C5286Ad ad) {
                }

                public void adHidden(C5286Ad ad) {
                    config.f17828dg = null;
                    preinicio.this.mo20875g();
                }

                public void adNotDisplayed(C5286Ad ad) {
                    config.f17828dg = null;
                    preinicio.this.mo20875g();
                }
            });
        } else {
            config.f17828dg = new StartAppAd(getApplicationContext());
            config.f17828dg.loadAd((AdEventListener) new AdEventListener() {
                public void onReceiveAd(C5286Ad ad) {
                    String str = "INTERSTITIAL";
                    if (config.f17831dj == 1) {
                        str = "Intersticial entrada";
                    }
                    config.f17828dg.showAd(str, new AdDisplayListener() {
                        public void adClicked(C5286Ad ad) {
                        }

                        public void adDisplayed(C5286Ad ad) {
                        }

                        public void adHidden(C5286Ad ad) {
                            config.f17828dg = null;
                        }

                        public void adNotDisplayed(C5286Ad ad) {
                            config.f17828dg = null;
                        }
                    });
                }

                public void onFailedToReceiveAd(C5286Ad ad) {
                    config.f17828dg = null;
                }
            });
            mo20875g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m23959o() {
        Intent intent;
        if (this.f18365G != null && this.f18365G.getString("abrir_perfil") != null) {
            this.f18370a.f18074k = this.f18380k;
            this.f18370a.f18075l = this.f18380k;
            if (this.f18380k == 9997 || this.f18370a.f17971bz[this.f18380k].f18333z) {
                this.f18370a.f18074k = 900;
                if (this.f18380k == 9997) {
                    this.f18370a.f18075l = 0;
                }
            }
            Editor edit = this.f18364F.edit();
            edit.putInt("ind_secc_sel", this.f18370a.f18074k);
            edit.putInt("ind_secc_sel_2", this.f18370a.f18075l);
            edit.commit();
            String str = "";
            if (this.f18365G.containsKey("abrir_perfilv")) {
                if (this.f18365G.getString("abrir_perfilv_formato").equals("1")) {
                    str = "mp4";
                } else if (this.f18365G.getString("abrir_perfilv_formato").equals("2")) {
                    str = "3gp";
                } else if (this.f18365G.getString("abrir_perfilv_formato").equals("3")) {
                    str = "webm";
                }
            }
            if (!this.f18365G.containsKey("abrir_perfilv") || str.isEmpty()) {
                intent = new Intent(this, profile.class);
                intent.putExtra(TtmlNode.ATTR_ID, this.f18365G.getString("abrir_perfil"));
                intent.putExtra("privados", this.f18365G.getString("privados"));
                intent.putExtra("nombre", this.f18365G.getString("nombre"));
                intent.putExtra("coments", this.f18365G.getString("coments"));
                intent.putExtra("fnac_d", this.f18365G.getString("fnac_d"));
                intent.putExtra("fnac_m", this.f18365G.getString("fnac_m"));
                intent.putExtra("fnac_a", this.f18365G.getString("fnac_a"));
                intent.putExtra("sexo", this.f18365G.getString("sexo"));
                intent.putExtra("vfoto", this.f18365G.getString("vfoto"));
                intent.putExtra("p_fnac", this.f18365G.getInt("p_fnac"));
                intent.putExtra("p_sexo", this.f18365G.getInt("p_sexo"));
                intent.putExtra("p_descr", this.f18365G.getInt("p_descr"));
                intent.putExtra("p_dist", this.f18365G.getInt("p_dist"));
                intent.putExtra("coments_chat", this.f18365G.getBoolean("coments_chat"));
                intent.putExtra("galeria", this.f18365G.getBoolean("galeria"));
                intent.putExtra("privados_chat", this.f18365G.getBoolean("privados_chat"));
                intent.putExtra("fotos_perfil", this.f18365G.getInt("fotos_perfil"));
                intent.putExtra("fotos_chat", this.f18365G.getInt("fotos_chat"));
            } else {
                String string = this.f18365G.getString("abrir_perfil");
                String string2 = this.f18365G.getString("abrir_perfilv");
                intent = new Intent(this, t_video_pro.class);
                StringBuilder sb = new StringBuilder();
                sb.append("http://video.e-droid.net/files_pro/v");
                sb.append(string2);
                sb.append("_");
                sb.append(string);
                sb.append(".");
                sb.append(str);
                intent.putExtra("url", sb.toString());
                intent.putExtra("ind", this.f18370a.f18075l);
                intent.putExtra("idv", string2);
                intent.putExtra("indv", -1);
                intent.putExtra("idusu_profile", string);
                intent.putExtra("coments", this.f18365G.getString("coments"));
                intent.putExtra("p_fnac", this.f18365G.getInt("p_fnac"));
                intent.putExtra("p_sexo", this.f18365G.getInt("p_sexo"));
                intent.putExtra("p_descr", this.f18365G.getInt("p_descr"));
                intent.putExtra("p_dist", this.f18365G.getInt("p_dist"));
                intent.putExtra("coments_chat", this.f18365G.getBoolean("coments_chat"));
                intent.putExtra("galeria", this.f18365G.getBoolean("galeria"));
                intent.putExtra("privados_chat", this.f18365G.getBoolean("privados_chat"));
                intent.putExtra("fotos_perfil", this.f18365G.getInt("fotos_perfil"));
                intent.putExtra("fotos_chat", this.f18365G.getInt("fotos_chat"));
            }
            if (this.f18370a.f18045dm == 2) {
                Intent intent2 = new Intent(this, t_menugrid.class);
                intent2.putExtra("intent_abrir", intent);
                intent2.putExtra("es_root", true);
                startActivity(intent2);
            } else {
                intent.putExtra("es_root", true);
                startActivity(intent);
            }
        } else if (this.f18365G != null && this.f18365G.getString("notif_id") != null && this.f18365G.getString("notif_tipo").equals("2")) {
            Intent intent3 = new Intent(this, t_url.class);
            if (this.f18388s) {
                intent3.putExtra("ad_entrar", true);
            } else if (this.f18389t) {
                intent3.putExtra("fb_entrar", true);
            }
            intent3.putExtra("url", this.f18365G.getString("notif_idelem"));
            this.f18370a.f18074k = 900;
            Editor edit2 = getSharedPreferences("sh", 0).edit();
            edit2.putInt("ind_secc_sel", this.f18370a.f18074k);
            edit2.commit();
            if (this.f18370a.f18045dm == 2) {
                Intent intent4 = new Intent(this, t_menugrid.class);
                intent4.putExtra("intent_abrir", intent3);
                intent4.putExtra("es_root", true);
                startActivity(intent4);
            } else {
                intent3.putExtra("es_root", true);
                startActivity(intent3);
            }
        } else if (this.f18365G != null && this.f18365G.getString("notif_id") != null && this.f18365G.getString("notif_tipo").equals("3")) {
            Intent intent5 = new Intent(this, chat.class);
            if (this.f18388s) {
                intent5.putExtra("ad_entrar", true);
            } else if (this.f18389t) {
                intent5.putExtra("fb_entrar", true);
            }
            this.f18370a.f18074k = 900;
            Editor edit3 = this.f18364F.edit();
            edit3.putInt("ind_secc_sel", this.f18370a.f18074k);
            edit3.commit();
            if (this.f18370a.f18045dm == 2) {
                Intent intent6 = new Intent(this, t_menugrid.class);
                intent6.putExtra("intent_abrir", intent5);
                intent6.putExtra("es_root", true);
                startActivity(intent6);
            } else {
                intent5.putExtra("es_root", true);
                startActivity(intent5);
            }
        } else if (this.f18370a.f18045dm != 2 || (!((this.f18365G != null && this.f18365G.getString("notif_id") != null && this.f18365G.getString("notif_tipo").equals("0")) || this.f18365G == null || this.f18365G.getString("notif_id") == null) || (!(this.f18365G == null || (this.f18365G.getString("notif_idtema") == null && this.f18365G.getString("id_remit") == null)) || (!(this.f18365G == null || this.f18365G.getString("abrir_idtema") == null) || (getIntent().getDataString() != null && !getIntent().getDataString().endsWith("www.androidcreator.com/open718963/") && !getIntent().getDataString().endsWith("www.appcreator24.com/open718963/")))))) {
            if (this.f18380k == 9997 || this.f18370a.f17971bz[this.f18380k].f18333z) {
                this.f18370a.f18074k = 900;
                Editor edit4 = this.f18364F.edit();
                edit4.putInt("ind_secc_sel", this.f18370a.f18074k);
                edit4.commit();
            }
            C5662h a = this.f18370a.mo20762a(Integer.valueOf(this.f18380k), (Context) this);
            if (this.f18388s) {
                a.f18226a.putExtra("ad_entrar", true);
            } else if (this.f18389t) {
                a.f18226a.putExtra("fb_entrar", true);
            }
            if (this.f18365G != null && this.f18365G.getString("id_remit") != null) {
                a.f18226a.putExtra("id_remit", this.f18365G.getString("id_remit"));
                a.f18226a.putExtra("nombre_remit", this.f18365G.getString("nombre_remit"));
                if (this.f18392w) {
                    a.f18226a.putExtra("empezar_privado", true);
                }
            } else if (!(this.f18365G == null || this.f18365G.getString("abrir_idtema") == null)) {
                a.f18226a.putExtra("abrir_idcat", this.f18365G.getString("abrir_idcat"));
                a.f18226a.putExtra("abrir_idtema", this.f18365G.getString("abrir_idtema"));
                if (this.f18365G.getString("abrir_idresp") != null) {
                    a.f18226a.putExtra("abrir_idresp", this.f18365G.getString("abrir_idresp"));
                    a.f18226a.putExtra("idcoment_ir", this.f18365G.getString("idcoment_ir"));
                } else {
                    a.f18226a.putExtra("idresp_ir", this.f18365G.getString("idresp_ir"));
                }
            }
            if (!(this.f18380k != 9997 || this.f18365G == null || (this.f18365G.getString("id_remit") == null && this.f18365G.getString("notif_idtema") == null))) {
                a.f18226a.putExtra("externo", true);
                if (this.f18365G.getString("id_remit") != null) {
                    a.f18226a.putExtra("idchat", 0);
                    a.f18226a.putExtra("idtema", 0);
                    a.f18226a.putExtra("fotos_perfil", 1);
                    a.f18226a.putExtra("fnac", 1);
                    a.f18226a.putExtra("sexo", 1);
                    a.f18226a.putExtra("descr", 1);
                    a.f18226a.putExtra("dist", 1);
                    a.f18226a.putExtra("privados", true);
                    a.f18226a.putExtra("coments", true);
                    a.f18226a.putExtra("galeria", true);
                    a.f18226a.putExtra("fotos_chat", 1);
                    String str2 = this.f18370a.f17971bz[this.f18370a.f18075l].f18314g;
                    String str3 = this.f18370a.f17971bz[this.f18370a.f18075l].f18315h;
                    a.f18226a.putExtra("c1", str2.equals("") ? this.f18370a.f17881aN : str2);
                    Intent intent7 = a.f18226a;
                    String str4 = "c2";
                    if (str2.equals("")) {
                        str3 = this.f18370a.f17882aO;
                    }
                    intent7.putExtra(str4, str3);
                } else {
                    a.f18226a.putExtra("idchat", Integer.parseInt(this.f18365G.getString("notif_idsecc")));
                    a.f18226a.putExtra("idtema", Integer.parseInt(this.f18365G.getString("notif_idtema")));
                    a.f18226a.putExtra("fotos_perfil", this.f18365G.getInt("fotos_perfil"));
                    a.f18226a.putExtra("fnac", this.f18365G.getInt("fnac"));
                    a.f18226a.putExtra("sexo", this.f18365G.getInt("sexo"));
                    a.f18226a.putExtra("descr", this.f18365G.getInt("descr"));
                    a.f18226a.putExtra("dist", this.f18365G.getInt("dist"));
                    a.f18226a.putExtra("privados", this.f18365G.getBoolean("privados"));
                    a.f18226a.putExtra("coments", this.f18365G.getBoolean("coments"));
                    a.f18226a.putExtra("galeria", this.f18365G.getBoolean("galeria"));
                    a.f18226a.putExtra("fotos_chat", this.f18365G.getInt("fotos_chat"));
                    a.f18226a.putExtra("c1", this.f18365G.getString("c1"));
                    a.f18226a.putExtra("c2", this.f18365G.getString("c2"));
                }
            }
            if (this.f18370a.f18045dm == 2) {
                Intent intent8 = new Intent(this, t_menugrid.class);
                intent8.putExtra("intent_abrir", a.f18226a);
                intent8.putExtra("es_root", true);
                startActivity(intent8);
            } else {
                a.f18226a.putExtra("es_root", true);
                startActivity(a.f18226a);
            }
        } else {
            Intent intent9 = new Intent(this, t_menugrid.class);
            if (this.f18388s) {
                intent9.putExtra("ad_entrar", true);
            } else if (this.f18389t) {
                intent9.putExtra("fb_entrar", true);
            }
            this.f18370a.f18074k = 900;
            Editor edit5 = this.f18364F.edit();
            edit5.putInt("ind_secc_sel", this.f18370a.f18074k);
            edit5.commit();
            intent9.putExtra("es_root", true);
            startActivity(intent9);
        }
        finish();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo20865a(String str) {
        if (this.f18392w) {
            return "";
        }
        try {
            return this.f18378i.containsKey(str) ? (String) this.f18378i.get(str) : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo20869a(String str, String str2) {
        Builder builder = new Builder(this);
        builder.setCancelable(false).setPositiveButton(getString(R.string.cerrar), new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                preinicio.this.finish();
            }
        }).setMessage(str2);
        if (!str.equals("")) {
            builder.setTitle(str);
        }
        final AlertDialog create = builder.create();
        if (!this.f18375f.equals("")) {
            create.setOnShowListener(new OnShowListener() {
                public void onShow(DialogInterface dialogInterface) {
                    Button button = create.getButton(-1);
                    StringBuilder sb = new StringBuilder();
                    sb.append("#");
                    sb.append(preinicio.this.f18375f);
                    button.setTextColor(Color.parseColor(sb.toString()));
                }
            });
        }
        try {
            create.show();
        } catch (Exception unused) {
        }
        try {
            ((TextView) create.findViewById(16908299)).setTypeface(Typeface.MONOSPACE);
        } catch (Exception unused2) {
        }
    }

    public void onBackPressed() {
        if (findViewById(R.id.rl_anext).getVisibility() != 0) {
            super.onBackPressed();
        } else if (!this.f18386q) {
            this.f18386q = true;
            mo20875g();
        }
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f18391v) {
            m23958n();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (findViewById(R.id.rl_anext).getVisibility() == 0) {
            findViewById(R.id.v_anext).setVisibility(8);
            findViewById(R.id.iv_splash).setVisibility(8);
            ((ImageView) findViewById(R.id.iv_splash)).setImageBitmap(null);
            findViewById(R.id.wv_splash).setVisibility(8);
            findViewById(R.id.na_media).setVisibility(8);
            findViewById(R.id.acad_na_media).setVisibility(8);
        }
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public boolean m23960p() {
        C3405c a = C3405c.m12234a();
        int a2 = a.mo13397a((Context) this);
        if (a2 == 0) {
            return true;
        }
        if (a.mo13405a(a2)) {
            a.mo13398a((Activity) this, a2, 1972).show();
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo20868a(int i) {
        int i2;
        if (this.f18370a.f17849H == 1) {
            this.f18395z = new ProgressDialog(this);
            this.f18395z.setMessage(getString(i));
            this.f18395z.setIndeterminate(true);
            if (VERSION.SDK_INT > 20 && !this.f18373d.equals("")) {
                this.f18395z.setOnShowListener(new OnShowListener() {
                    public void onShow(DialogInterface dialogInterface) {
                        config.m23838a((ProgressBar) preinicio.this.f18395z.findViewById(16908301), preinicio.this.f18373d);
                    }
                });
            }
            try {
                this.f18395z.show();
            } catch (Exception unused) {
            }
        } else if (this.f18370a.f17849H == 2) {
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.pb_splash);
            if (progressBar.getVisibility() == 8) {
                if (this.f18370a.f17851J == 0) {
                    i2 = config.m23845b((Context) this, 40);
                } else if (this.f18370a.f17851J == 1) {
                    i2 = config.m23845b((Context) this, 80);
                } else {
                    i2 = config.m23845b((Context) this, 120);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
                if (this.f18370a.f17850I == 1) {
                    layoutParams.gravity = 49;
                } else if (this.f18370a.f17850I == 2) {
                    layoutParams.gravity = 8388661;
                } else if (this.f18370a.f17850I == 3) {
                    layoutParams.gravity = 8388629;
                } else if (this.f18370a.f17850I == 4) {
                    layoutParams.gravity = 8388693;
                } else if (this.f18370a.f17850I == 5) {
                    layoutParams.gravity = 81;
                } else if (this.f18370a.f17850I == 6) {
                    layoutParams.gravity = 8388691;
                } else if (this.f18370a.f17850I == 7) {
                    layoutParams.gravity = 8388627;
                } else if (this.f18370a.f17850I == 8) {
                    layoutParams.gravity = 8388659;
                } else {
                    layoutParams.gravity = 17;
                }
                int b = config.m23845b((Context) this, 40);
                layoutParams.setMargins(b, b, b, b);
                progressBar.setLayoutParams(layoutParams);
                if (VERSION.SDK_INT > 20 && !this.f18373d.equals("")) {
                    config.m23838a(progressBar, this.f18370a.f17852K);
                }
                progressBar.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo20876h() {
        if (this.f18370a.f17849H == 1) {
            try {
                this.f18395z.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo20877i() {
        this.f18361C = new Builder(this);
        this.f18361C.setTitle(getResources().getString(R.string.chat_acceso));
        View inflate = getLayoutInflater().inflate(R.layout.contra, null);
        ((TextView) inflate.findViewById(R.id.message)).setText(getResources().getString(R.string.chat_introduce_contra));
        this.f18368J = (EditText) inflate.findViewById(R.id.et_contra);
        if (this.f18390u) {
            inflate.findViewById(R.id.message_error).setVisibility(0);
        }
        this.f18367I = (CheckBox) inflate.findViewById(R.id.skip);
        if (!this.f18375f.equals("")) {
            EditText editText = this.f18368J;
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f18372c);
            config.m23837a(editText, Boolean.valueOf(!config.m23844a(sb.toString())), this.f18375f);
            config.m23836a(this.f18367I, this.f18375f);
        }
        this.f18367I.setChecked(this.f18364F.getBoolean("pwd_nomostrarmas_def", true));
        this.f18361C.setView(inflate);
        this.f18361C.setCancelable(true);
        this.f18361C.setPositiveButton(getString(R.string.aceptar), new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Editor edit = preinicio.this.f18364F.edit();
                if (preinicio.this.f18367I.isChecked()) {
                    edit.putBoolean("pwd_nomostrarmas_def", true);
                } else {
                    edit.putBoolean("pwd_nomostrarmas_def", false);
                }
                edit.commit();
                preinicio.this.f18360B = new ProgressDialog(preinicio.this);
                preinicio.this.f18360B.setMessage(preinicio.this.getString(R.string.comprobando));
                preinicio.this.f18360B.setIndeterminate(true);
                if (VERSION.SDK_INT > 20 && !preinicio.this.f18373d.equals("")) {
                    preinicio.this.f18360B.setOnShowListener(new OnShowListener() {
                        public void onShow(DialogInterface dialogInterface) {
                            config.m23838a((ProgressBar) preinicio.this.f18360B.findViewById(16908301), preinicio.this.f18373d);
                        }
                    });
                }
                try {
                    preinicio.this.f18360B.show();
                } catch (Exception unused) {
                }
                preinicio.this.f18374e = preinicio.this.f18368J.getText().toString();
                new C5722g().execute(new String[0]);
            }
        });
        this.f18361C.setNegativeButton(getString(R.string.cancelar), new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                preinicio.this.finish();
            }
        });
        this.f18361C.setOnCancelListener(new OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                preinicio.this.finish();
            }
        });
        final AlertDialog create = this.f18361C.create();
        if (!this.f18375f.equals("")) {
            create.setOnShowListener(new OnShowListener() {
                public void onShow(DialogInterface dialogInterface) {
                    Button button = create.getButton(-1);
                    StringBuilder sb = new StringBuilder();
                    sb.append("#");
                    sb.append(preinicio.this.f18375f);
                    button.setTextColor(Color.parseColor(sb.toString()));
                    Button button2 = create.getButton(-2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("#");
                    sb2.append(preinicio.this.f18375f);
                    button2.setTextColor(Color.parseColor(sb2.toString()));
                }
            });
        }
        try {
            create.show();
        } catch (Exception unused) {
        }
    }
}
