package mega.boicot;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.res.Configuration;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.p017v4.widget.DrawerLayout;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.MediaController.MediaPlayerControl;
import android.widget.TextView;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.banners.BannerAdRequest;
import com.appnext.banners.BannerSize;
import com.appnext.banners.BannerView;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdLoaded;
import com.appnext.core.callbacks.OnVideoEnded;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.C1514Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.android.exoplayer2.C2793C;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C2971c.C2972a;
import com.google.android.gms.ads.C2973d;
import com.google.android.gms.ads.C2997g;
import com.google.android.gms.ads.reward.C3165a;
import com.google.android.gms.ads.reward.C3166b;
import com.google.android.gms.ads.reward.C3167c;
import com.startapp.android.publish.ads.banner.Mrec;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.VideoListener;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Random;

public class t_radio extends Activity implements OnSharedPreferenceChangeListener, OnClickListener, MediaPlayerControl, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: A */
    boolean f19219A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public MediaController f19220B;

    /* renamed from: a */
    config f19221a;

    /* renamed from: b */
    Bundle f19222b;

    /* renamed from: c */
    C5602c f19223c;

    /* renamed from: d */
    C3166b f19224d;

    /* renamed from: e */
    RewardedVideo f19225e;

    /* renamed from: f */
    RewardedVideoAd f19226f;

    /* renamed from: g */
    StartAppAd f19227g;

    /* renamed from: h */
    boolean f19228h = false;

    /* renamed from: i */
    boolean f19229i = false;

    /* renamed from: j */
    boolean f19230j;

    /* renamed from: k */
    int f19231k;

    /* renamed from: l */
    String f19232l;

    /* renamed from: m */
    View f19233m;

    /* renamed from: n */
    ProgressDialog f19234n;

    /* renamed from: o */
    TextView f19235o;

    /* renamed from: p */
    TextView f19236p;

    /* renamed from: q */
    BannerView f19237q;

    /* renamed from: r */
    AdView f19238r;

    /* renamed from: s */
    com.facebook.ads.AdView f19239s;

    /* renamed from: t */
    SharedPreferences f19240t;

    /* renamed from: u */
    SharedPreferences f19241u;

    /* renamed from: v */
    ListView f19242v;

    /* renamed from: w */
    int f19243w;

    /* renamed from: x */
    boolean f19244x = false;

    /* renamed from: y */
    boolean f19245y = false;

    /* renamed from: z */
    boolean f19246z = false;

    /* renamed from: mega.boicot.t_radio$a */
    private class C5867a extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f19252a;

        /* renamed from: b */
        String f19253b;

        /* renamed from: c */
        String f19254c;

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }

        private C5867a() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x007c, code lost:
            return java.lang.Byte.valueOf(-1);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0078 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r0 = 0
                r1 = r6[r0]
                r5.f19252a = r1
                r1 = 1
                r2 = r6[r1]
                r5.f19253b = r2
                r2 = 2
                r6 = r6[r2]
                r5.f19254c = r6
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = "http://imgs1.e-droid.net/srv/imgs/radio/"
                r6.append(r2)
                java.lang.String r2 = r5.f19252a
                r6.append(r2)
                java.lang.String r2 = "_fondo.png?v="
                r6.append(r2)
                java.lang.String r2 = r5.f19254c
                r6.append(r2)
                java.lang.String r6 = r6.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "fondo_"
                r2.append(r3)
                java.lang.String r3 = r5.f19252a
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = -1
                java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0082 }
                r4.<init>(r6)     // Catch:{ MalformedURLException -> 0x0082 }
                java.net.URLConnection r6 = r4.openConnection()     // Catch:{ IOException -> 0x007d }
                java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x007d }
                r6.setDoInput(r1)     // Catch:{ IOException -> 0x007d }
                r1 = 5000(0x1388, float:7.006E-42)
                r6.setConnectTimeout(r1)     // Catch:{ IOException -> 0x007d }
                r1 = 7000(0x1b58, float:9.809E-42)
                r6.setReadTimeout(r1)     // Catch:{ IOException -> 0x007d }
                r6.connect()     // Catch:{ IOException -> 0x007d }
                java.io.InputStream r6 = r6.getInputStream()     // Catch:{ IOException -> 0x007d }
                android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6)     // Catch:{ IOException -> 0x007d }
                mega.boicot.t_radio r1 = mega.boicot.t_radio.this     // Catch:{ Exception -> 0x0078 }
                java.io.FileOutputStream r1 = r1.openFileOutput(r2, r0)     // Catch:{ Exception -> 0x0078 }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x0078 }
                r4 = 100
                r6.compress(r2, r4, r1)     // Catch:{ Exception -> 0x0078 }
                r1.close()     // Catch:{ Exception -> 0x0078 }
                java.lang.Byte r6 = java.lang.Byte.valueOf(r0)
                return r6
            L_0x0078:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r3)     // Catch:{ IOException -> 0x007d }
                return r6
            L_0x007d:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r3)
                return r6
            L_0x0082:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r3)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_radio.C5867a.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            if (b.byteValue() == 0) {
                try {
                    config config = t_radio.this.f19221a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("fondo_");
                    sb.append(this.f19252a);
                    config.mo20776a(sb.toString(), (ImageView) t_radio.this.findViewById(R.id.iv_radio));
                } catch (Exception unused) {
                }
                Editor edit = t_radio.this.getSharedPreferences("sh", 0).edit();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("s");
                sb2.append(this.f19252a);
                sb2.append("_fondo_modif");
                edit.putInt(sb2.toString(), 0);
                edit.commit();
                t_radio.this.f19221a.f17971bz[Integer.parseInt(this.f19253b)].f18242M = false;
            }
        }
    }

    /* renamed from: B_ */
    public void mo9672B_() {
    }

    /* renamed from: C_ */
    public void mo9673C_() {
    }

    public boolean canPause() {
        return true;
    }

    public boolean canSeekBackward() {
        return true;
    }

    public boolean canSeekForward() {
        return true;
    }

    public int getAudioSessionId() {
        return 0;
    }

    public void onAdClicked(C1514Ad ad) {
    }

    public void onLoggingImpression(C1514Ad ad) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:146:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0495  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.content.Context r2 = r17.getApplicationContext()
            mega.boicot.config r2 = (mega.boicot.config) r2
            r0.f19221a = r2
            mega.boicot.config r2 = r0.f19221a
            java.lang.String r2 = r2.f17881aN
            if (r2 != 0) goto L_0x0017
            mega.boicot.config r2 = r0.f19221a
            r2.mo20780b()
        L_0x0017:
            android.content.Intent r2 = r17.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            r0.f19222b = r2
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0043
            android.os.Bundle r4 = r0.f19222b
            if (r4 == 0) goto L_0x003f
            android.os.Bundle r4 = r0.f19222b
            java.lang.String r5 = "es_root"
            boolean r4 = r4.containsKey(r5)
            if (r4 == 0) goto L_0x003f
            android.os.Bundle r4 = r0.f19222b
            java.lang.String r5 = "es_root"
            boolean r4 = r4.getBoolean(r5, r3)
            if (r4 == 0) goto L_0x003f
            r4 = r2
            goto L_0x0040
        L_0x003f:
            r4 = r3
        L_0x0040:
            r0.f19219A = r4
            goto L_0x0058
        L_0x0043:
            java.lang.String r4 = "es_root"
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x0055
            java.lang.String r4 = "es_root"
            boolean r4 = r1.getBoolean(r4, r3)
            if (r4 == 0) goto L_0x0055
            r4 = r2
            goto L_0x0056
        L_0x0055:
            r4 = r3
        L_0x0056:
            r0.f19219A = r4
        L_0x0058:
            android.content.Intent r4 = r17.getIntent()
            android.os.Bundle r4 = r4.getExtras()
            r0.f19222b = r4
            android.os.Bundle r4 = r0.f19222b
            java.lang.String r5 = "ind"
            int r4 = r4.getInt(r5)
            r0.f19243w = r4
            mega.boicot.config r4 = r0.f19221a
            mega.boicot.i[] r4 = r4.f17971bz
            int r5 = r0.f19243w
            r4 = r4[r5]
            java.lang.String r4 = r4.f18314g
            mega.boicot.config r5 = r0.f19221a
            java.lang.String r5 = r5.f17890aW
            java.lang.String r4 = mega.boicot.config.m23831a(r4, r5)
            r0.f19232l = r4
            super.onCreate(r18)
            r4 = 2131361953(0x7f0a00a1, float:1.8343673E38)
            r0.setContentView(r4)
            r17.mo21324g()
            mega.boicot.config r4 = r0.f19221a
            int r4 = r4.f18080q
            if (r4 <= 0) goto L_0x00aa
            java.lang.String r4 = "search"
            java.lang.Object r4 = r0.getSystemService(r4)
            android.app.SearchManager r4 = (android.app.SearchManager) r4
            mega.boicot.t_radio$1 r5 = new mega.boicot.t_radio$1
            r5.<init>()
            r4.setOnCancelListener(r5)
            mega.boicot.t_radio$2 r5 = new mega.boicot.t_radio$2
            r5.<init>()
            r4.setOnDismissListener(r5)
        L_0x00aa:
            mega.boicot.config r4 = r0.f19221a
            int r4 = r4.f18045dm
            if (r4 != r2) goto L_0x00c1
            r4 = 2131230919(0x7f0800c7, float:1.8077904E38)
            android.view.View r4 = r0.findViewById(r4)
            android.support.v4.widget.DrawerLayout r4 = (android.support.p017v4.widget.DrawerLayout) r4
            mega.boicot.t_radio$3 r5 = new mega.boicot.t_radio$3
            r5.<init>()
            r4.mo2153a(r5)
        L_0x00c1:
            mega.boicot.config r4 = r0.f19221a
            android.os.Bundle r5 = r0.f19222b
            if (r5 == 0) goto L_0x00d3
            android.os.Bundle r5 = r0.f19222b
            java.lang.String r6 = "ad_entrar"
            boolean r5 = r5.containsKey(r6)
            if (r5 == 0) goto L_0x00d3
            r5 = r2
            goto L_0x00d4
        L_0x00d3:
            r5 = r3
        L_0x00d4:
            android.os.Bundle r6 = r0.f19222b
            if (r6 == 0) goto L_0x00e4
            android.os.Bundle r6 = r0.f19222b
            java.lang.String r7 = "fb_entrar"
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L_0x00e4
            r6 = r2
            goto L_0x00e5
        L_0x00e4:
            r6 = r3
        L_0x00e5:
            r4.mo20770a(r0, r5, r6)
            mega.boicot.config r4 = r0.f19221a
            java.lang.String r4 = r4.f17974cC
            java.lang.String r5 = ""
            if (r4 != r5) goto L_0x010b
            mega.boicot.config r4 = r0.f19221a
            java.lang.String r4 = r4.f17975cD
            java.lang.String r5 = ""
            if (r4 != r5) goto L_0x010b
            mega.boicot.config r4 = r0.f19221a
            java.lang.String r4 = r4.f17976cE
            java.lang.String r5 = ""
            if (r4 != r5) goto L_0x010b
            mega.boicot.config r4 = r0.f19221a
            java.lang.String r4 = r4.f17977cF
            java.lang.String r5 = ""
            if (r4 == r5) goto L_0x0109
            goto L_0x010b
        L_0x0109:
            r4 = r3
            goto L_0x010c
        L_0x010b:
            r4 = r2
        L_0x010c:
            r0.f19230j = r4
            boolean r4 = r0.f19230j
            if (r4 != 0) goto L_0x011b
            mega.boicot.config r4 = r0.f19221a
            mega.boicot.c r4 = r4.mo20760a(r0, r3)
            r0.f19223c = r4
            goto L_0x011e
        L_0x011b:
            r17.mo21323f()
        L_0x011e:
            mega.boicot.config r4 = r0.f19221a
            mega.boicot.config r5 = r0.f19221a
            int r5 = r5.f18075l
            java.lang.String r6 = r0.f19232l
            r4.mo20767a(r0, r5, r6, r1)
            mega.boicot.config r1 = r0.f19221a
            mega.boicot.i[] r1 = r1.f17971bz
            int r4 = r0.f19243w
            r1 = r1[r4]
            java.lang.String r1 = r1.f18314g
            java.lang.String r4 = ""
            boolean r1 = r1.equals(r4)
            r4 = 2
            if (r1 != 0) goto L_0x0191
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r5 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r6 = new int[r4]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19221a
            mega.boicot.i[] r8 = r8.f17971bz
            int r9 = r0.f19243w
            r8 = r8[r9]
            java.lang.String r8 = r8.f18314g
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            r6[r3] = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19221a
            mega.boicot.i[] r8 = r8.f17971bz
            int r9 = r0.f19243w
            r8 = r8[r9]
            java.lang.String r8 = r8.f18315h
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            r6[r2] = r7
            r1.<init>(r5, r6)
            r5 = 2131231221(0x7f0801f5, float:1.8078517E38)
            android.view.View r5 = r0.findViewById(r5)
            r5.setBackgroundDrawable(r1)
        L_0x0191:
            boolean r1 = r0.f19230j
            r5 = 3
            if (r1 != 0) goto L_0x0232
            mega.boicot.config r1 = r0.f19221a
            mega.boicot.i[] r1 = r1.f17971bz
            int r6 = r0.f19243w
            r1 = r1[r6]
            int r1 = r1.f18327t
            if (r1 <= 0) goto L_0x0232
            mega.boicot.config r1 = r0.f19221a
            mega.boicot.i[] r1 = r1.f17971bz
            int r6 = r0.f19243w
            r1 = r1[r6]
            boolean r1 = r1.f18242M
            if (r1 != 0) goto L_0x01d8
            mega.boicot.config r1 = r0.f19221a     // Catch:{ Exception -> 0x0232 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0232 }
            r6.<init>()     // Catch:{ Exception -> 0x0232 }
            java.lang.String r7 = "fondo_"
            r6.append(r7)     // Catch:{ Exception -> 0x0232 }
            mega.boicot.config r7 = r0.f19221a     // Catch:{ Exception -> 0x0232 }
            mega.boicot.i[] r7 = r7.f17971bz     // Catch:{ Exception -> 0x0232 }
            int r8 = r0.f19243w     // Catch:{ Exception -> 0x0232 }
            r7 = r7[r8]     // Catch:{ Exception -> 0x0232 }
            int r7 = r7.f18327t     // Catch:{ Exception -> 0x0232 }
            r6.append(r7)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0232 }
            r7 = 2131231118(0x7f08018e, float:1.8078308E38)
            android.view.View r7 = r0.findViewById(r7)     // Catch:{ Exception -> 0x0232 }
            android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0232 }
            r1.mo20776a(r6, r7)     // Catch:{ Exception -> 0x0232 }
            goto L_0x0232
        L_0x01d8:
            mega.boicot.t_radio$a r1 = new mega.boicot.t_radio$a
            r6 = 0
            r1.<init>()
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            mega.boicot.config r8 = r0.f19221a
            mega.boicot.i[] r8 = r8.f17971bz
            int r9 = r0.f19243w
            r8 = r8[r9]
            int r8 = r8.f18327t
            r7.append(r8)
            java.lang.String r8 = ""
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6[r3] = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r8 = r0.f19243w
            r7.append(r8)
            java.lang.String r8 = ""
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6[r2] = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            mega.boicot.config r8 = r0.f19221a
            mega.boicot.i[] r8 = r8.f17971bz
            int r9 = r0.f19243w
            r8 = r8[r9]
            int r8 = r8.f18328u
            r7.append(r8)
            java.lang.String r8 = ""
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6[r4] = r7
            r1.execute(r6)
        L_0x0232:
            java.lang.String r1 = "sh_mp"
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r1, r3)
            r0.f19240t = r1
            java.lang.String r1 = "sh_mc"
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r1, r3)
            r0.f19241u = r1
            mega.boicot.config r1 = r0.f19221a
            mega.boicot.i[] r1 = r1.f17971bz
            int r6 = r0.f19243w
            r1 = r1[r6]
            boolean r1 = r1.f18231B
            r0.f19245y = r1
            r0.f19231k = r3
            boolean r1 = r0.f19230j
            if (r1 != 0) goto L_0x0260
            mega.boicot.config r1 = r0.f19221a
            mega.boicot.i[] r1 = r1.f17971bz
            int r6 = r0.f19243w
            r1 = r1[r6]
            int r1 = r1.f18243N
            r0.f19231k = r1
        L_0x0260:
            int r1 = r0.f19231k
            if (r1 <= 0) goto L_0x04c5
            r1 = 2131231519(0x7f08031f, float:1.8079121E38)
            android.view.View r6 = r0.findViewById(r1)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0.f19235o = r6
            r6 = 2131231606(0x7f080376, float:1.8079298E38)
            android.view.View r7 = r0.findViewById(r6)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0.f19236p = r7
            android.content.SharedPreferences r7 = r0.f19241u
            r7.registerOnSharedPreferenceChangeListener(r0)
            android.content.SharedPreferences r7 = r0.f19241u
            android.content.SharedPreferences$Editor r7 = r7.edit()
            java.lang.String r8 = "t_radio_artist"
            r7.remove(r8)
            java.lang.String r8 = "t_radio_song"
            r7.remove(r8)
            r7.commit()
            mega.boicot.config r7 = r0.f19221a
            boolean r7 = r7.f17941bV
            if (r7 == 0) goto L_0x02a3
            android.widget.TextView r7 = r0.f19235o
            android.widget.TextView r8 = r0.f19235o
            android.graphics.Typeface r8 = r8.getTypeface()
            r7.setTypeface(r8, r2)
        L_0x02a3:
            mega.boicot.config r7 = r0.f19221a
            boolean r7 = r7.f17942bW
            if (r7 == 0) goto L_0x02b4
            android.widget.TextView r7 = r0.f19236p
            android.widget.TextView r8 = r0.f19236p
            android.graphics.Typeface r8 = r8.getTypeface()
            r7.setTypeface(r8, r2)
        L_0x02b4:
            mega.boicot.config r7 = r0.f19221a
            int r7 = r7.f17939bT
            if (r7 == 0) goto L_0x02c4
            android.widget.TextView r7 = r0.f19235o
            mega.boicot.config r8 = r0.f19221a
            int r8 = r8.f17939bT
            float r8 = (float) r8
            r7.setTextSize(r4, r8)
        L_0x02c4:
            mega.boicot.config r7 = r0.f19221a
            int r7 = r7.f17940bU
            if (r7 == 0) goto L_0x02d4
            android.widget.TextView r7 = r0.f19236p
            mega.boicot.config r8 = r0.f19221a
            int r8 = r8.f17940bU
            float r8 = (float) r8
            r7.setTextSize(r4, r8)
        L_0x02d4:
            r7 = 2131231200(0x7f0801e0, float:1.8078474E38)
            android.view.View r8 = r0.findViewById(r7)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            android.widget.RelativeLayout$LayoutParams r9 = new android.widget.RelativeLayout$LayoutParams
            r10 = -2
            r9.<init>(r10, r10)
            r10 = 1092616192(0x41200000, float:10.0)
            android.content.res.Resources r11 = r17.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r10 = r10 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 + r11
            int r10 = (int) r10
            r9.setMargins(r10, r10, r10, r10)
            mega.boicot.config r10 = r0.f19221a
            int r10 = r10.f17938bS
            r11 = 10
            if (r10 != r2) goto L_0x030c
            r9.addRule(r11)
            r10 = 14
            r9.addRule(r10)
            r8.setLayoutParams(r9)
            goto L_0x03c5
        L_0x030c:
            mega.boicot.config r10 = r0.f19221a
            int r10 = r10.f17938bS
            r12 = 11
            r13 = 21
            r14 = 17
            if (r10 != r4) goto L_0x032b
            r9.addRule(r11)
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r14) goto L_0x0323
            r9.addRule(r13)
            goto L_0x0326
        L_0x0323:
            r9.addRule(r12)
        L_0x0326:
            r8.setLayoutParams(r9)
            goto L_0x03c5
        L_0x032b:
            mega.boicot.config r10 = r0.f19221a
            int r10 = r10.f17938bS
            if (r10 != r5) goto L_0x0346
            r10 = 15
            r9.addRule(r10)
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r14) goto L_0x033e
            r9.addRule(r13)
            goto L_0x0341
        L_0x033e:
            r9.addRule(r12)
        L_0x0341:
            r8.setLayoutParams(r9)
            goto L_0x03c5
        L_0x0346:
            mega.boicot.config r10 = r0.f19221a
            int r10 = r10.f17938bS
            r15 = 4
            r7 = 12
            if (r10 != r15) goto L_0x0361
            r9.addRule(r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r14) goto L_0x035a
            r9.addRule(r13)
            goto L_0x035d
        L_0x035a:
            r9.addRule(r12)
        L_0x035d:
            r8.setLayoutParams(r9)
            goto L_0x03c5
        L_0x0361:
            mega.boicot.config r10 = r0.f19221a
            int r10 = r10.f17938bS
            r12 = 5
            if (r10 != r12) goto L_0x0374
            r9.addRule(r7)
            r7 = 14
            r9.addRule(r7)
            r8.setLayoutParams(r9)
            goto L_0x03c5
        L_0x0374:
            mega.boicot.config r10 = r0.f19221a
            int r10 = r10.f17938bS
            r12 = 6
            r13 = 9
            r15 = 20
            if (r10 != r12) goto L_0x0391
            r9.addRule(r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r14) goto L_0x038a
            r9.addRule(r15)
            goto L_0x038d
        L_0x038a:
            r9.addRule(r13)
        L_0x038d:
            r8.setLayoutParams(r9)
            goto L_0x03c5
        L_0x0391:
            mega.boicot.config r7 = r0.f19221a
            int r7 = r7.f17938bS
            r10 = 7
            if (r7 != r10) goto L_0x03ac
            r7 = 15
            r9.addRule(r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r14) goto L_0x03a5
            r9.addRule(r15)
            goto L_0x03a8
        L_0x03a5:
            r9.addRule(r13)
        L_0x03a8:
            r8.setLayoutParams(r9)
            goto L_0x03c5
        L_0x03ac:
            mega.boicot.config r7 = r0.f19221a
            int r7 = r7.f17938bS
            r10 = 8
            if (r7 != r10) goto L_0x03c5
            r9.addRule(r11)
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r14) goto L_0x03bf
            r9.addRule(r15)
            goto L_0x03c2
        L_0x03bf:
            r9.addRule(r13)
        L_0x03c2:
            r8.setLayoutParams(r9)
        L_0x03c5:
            mega.boicot.config r7 = r0.f19221a
            boolean r7 = r7.f17943bX
            if (r7 == 0) goto L_0x03ce
            r8.setGravity(r2)
        L_0x03ce:
            mega.boicot.config r7 = r0.f19221a
            java.lang.String r7 = r7.f17944bY
            java.lang.String r8 = ""
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0416
            mega.boicot.config r7 = r0.f19221a
            mega.boicot.i[] r7 = r7.f17971bz
            int r8 = r0.f19243w
            r7 = r7[r8]
            java.lang.String r7 = r7.f18314g
            java.lang.String r8 = ""
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0413
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19221a
            mega.boicot.i[] r8 = r8.f17971bz
            int r9 = r0.f19243w
            r8 = r8[r9]
            java.lang.String r8 = r8.f18314g
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            boolean r7 = mega.boicot.config.m23844a(r7)
            if (r7 == 0) goto L_0x0410
            int r7 = mega.boicot.config.f17813a
            goto L_0x042b
        L_0x0410:
            int r7 = mega.boicot.config.f17815c
            goto L_0x042b
        L_0x0413:
            r7 = r3
            r8 = r7
            goto L_0x042d
        L_0x0416:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "#"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            int r7 = android.graphics.Color.parseColor(r7)
        L_0x042b:
            r8 = r7
            r7 = r2
        L_0x042d:
            if (r7 == 0) goto L_0x0434
            android.widget.TextView r7 = r0.f19235o
            r7.setTextColor(r8)
        L_0x0434:
            mega.boicot.config r7 = r0.f19221a
            java.lang.String r7 = r7.f17945bZ
            java.lang.String r8 = ""
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x047c
            mega.boicot.config r7 = r0.f19221a
            mega.boicot.i[] r7 = r7.f17971bz
            int r8 = r0.f19243w
            r7 = r7[r8]
            java.lang.String r7 = r7.f18314g
            java.lang.String r8 = ""
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0479
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19221a
            mega.boicot.i[] r8 = r8.f17971bz
            int r9 = r0.f19243w
            r8 = r8[r9]
            java.lang.String r8 = r8.f18314g
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            boolean r7 = mega.boicot.config.m23844a(r7)
            if (r7 == 0) goto L_0x0476
            int r7 = mega.boicot.config.f17814b
            goto L_0x0491
        L_0x0476:
            int r7 = mega.boicot.config.f17824d
            goto L_0x0491
        L_0x0479:
            r7 = r3
            r8 = r7
            goto L_0x0493
        L_0x047c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "#"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            int r7 = android.graphics.Color.parseColor(r7)
        L_0x0491:
            r8 = r7
            r7 = r2
        L_0x0493:
            if (r7 == 0) goto L_0x049a
            android.widget.TextView r7 = r0.f19236p
            r7.setTextColor(r8)
        L_0x049a:
            int r7 = r0.f19231k
            if (r7 == r2) goto L_0x04a2
            int r7 = r0.f19231k
            if (r7 != r4) goto L_0x04a9
        L_0x04a2:
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r3)
        L_0x04a9:
            int r1 = r0.f19231k
            if (r1 == r2) goto L_0x04b6
            int r1 = r0.f19231k
            if (r1 != r5) goto L_0x04b2
            goto L_0x04b6
        L_0x04b2:
            r1 = 2131231200(0x7f0801e0, float:1.8078474E38)
            goto L_0x04be
        L_0x04b6:
            android.view.View r1 = r0.findViewById(r6)
            r1.setVisibility(r3)
            goto L_0x04b2
        L_0x04be:
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r3)
        L_0x04c5:
            boolean r1 = r0.f19245y
            if (r1 == 0) goto L_0x04d1
            android.widget.MediaController r1 = new android.widget.MediaController
            r1.<init>(r0, r3)
            r0.f19220B = r1
            goto L_0x04d8
        L_0x04d1:
            android.widget.MediaController r1 = new android.widget.MediaController
            r1.<init>(r0)
            r0.f19220B = r1
        L_0x04d8:
            android.widget.MediaController r1 = r0.f19220B
            r1.setMediaPlayer(r0)
            android.widget.MediaController r1 = r0.f19220B
            r2 = 2131231396(0x7f0802a4, float:1.8078872E38)
            android.view.View r2 = r0.findViewById(r2)
            r1.setAnchorView(r2)
            r1 = 2131231396(0x7f0802a4, float:1.8078872E38)
            android.view.View r1 = r0.findViewById(r1)
            mega.boicot.t_radio$4 r2 = new mega.boicot.t_radio$4
            r2.<init>()
            r1.setOnClickListener(r2)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<mega.boicot.s_mediaplayer_exo> r2 = mega.boicot.s_mediaplayer_exo.class
            r1.<init>(r0, r2)
            java.lang.String r2 = "url"
            mega.boicot.config r3 = r0.f19221a
            mega.boicot.i[] r3 = r3.f17971bz
            int r4 = r0.f19243w
            r3 = r3[r4]
            java.lang.String r3 = r3.f18312e
            r1.putExtra(r2, r3)
            java.lang.String r2 = "ua"
            mega.boicot.config r3 = r0.f19221a
            mega.boicot.i[] r3 = r3.f17971bz
            int r4 = r0.f19243w
            r3 = r3[r4]
            java.lang.String r3 = r3.f18317j
            r1.putExtra(r2, r3)
            java.lang.String r2 = "accion"
            java.lang.String r3 = "iniciar"
            r1.putExtra(r2, r3)
            java.lang.String r2 = "idsecc"
            mega.boicot.config r3 = r0.f19221a
            mega.boicot.i[] r3 = r3.f17971bz
            int r4 = r0.f19243w
            r3 = r3[r4]
            int r3 = r3.f18330w
            r1.putExtra(r2, r3)
            java.lang.String r2 = "radio_mostrar"
            int r3 = r0.f19231k
            r1.putExtra(r2, r3)
            java.lang.String r2 = "secc_tit"
            mega.boicot.config r3 = r0.f19221a
            mega.boicot.i[] r3 = r3.f17971bz
            int r4 = r0.f19243w
            r3 = r3[r4]
            java.lang.String r3 = r3.f18256a
            r1.putExtra(r2, r3)
            java.lang.String r2 = "esStream"
            boolean r3 = r0.f19245y
            r1.putExtra(r2, r3)
            r0.startService(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_radio.onCreate(android.os.Bundle):void");
    }

    /* renamed from: f */
    public void mo21323f() {
        ArrayList arrayList = new ArrayList();
        if (!this.f19221a.f17974cC.equals("")) {
            arrayList.add(Integer.valueOf(1));
        }
        if (!this.f19221a.f17975cD.equals("")) {
            arrayList.add(Integer.valueOf(2));
        }
        if (!this.f19221a.f17976cE.equals("") && getResources().getConfiguration().orientation == 1) {
            arrayList.add(Integer.valueOf(3));
        }
        if (!this.f19221a.f17977cF.equals("")) {
            arrayList.add(Integer.valueOf(4));
        }
        if (!arrayList.isEmpty()) {
            int intValue = ((Integer) arrayList.get(new Random().nextInt(((arrayList.size() - 1) - 0) + 1) + 0)).intValue();
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_ad_rad);
            linearLayout.removeAllViews();
            if (intValue == 1) {
                this.f19238r = new AdView(this);
                if (getResources().getConfiguration().orientation == 2) {
                    this.f19238r.setAdSize(C2973d.f8693c);
                } else {
                    this.f19238r.setAdSize(C2973d.f8695e);
                }
                this.f19238r.setAdUnitId(this.f19221a.f17974cC);
                linearLayout.addView(this.f19238r);
                if (!((DrawerLayout) findViewById(R.id.drawer_layout)).mo2179f(8388611)) {
                    linearLayout.setVisibility(0);
                }
                this.f19238r.mo12166a(new C2972a().mo12209a());
            } else if (intValue == 2) {
                this.f19237q = new BannerView(this);
                this.f19237q.setPlacementId(this.f19221a.f17975cD);
                if (getResources().getConfiguration().orientation == 2) {
                    this.f19237q.setBannerSize(BannerSize.LARGE_BANNER);
                } else {
                    this.f19237q.setBannerSize(BannerSize.MEDIUM_RECTANGLE);
                }
                linearLayout.addView(this.f19237q);
                if (!((DrawerLayout) findViewById(R.id.drawer_layout)).mo2179f(8388611)) {
                    linearLayout.setVisibility(0);
                }
                BannerAdRequest bannerAdRequest = new BannerAdRequest();
                bannerAdRequest.setMute(false).setCreativeType("static");
                this.f19237q.loadAd(bannerAdRequest);
            } else if (intValue == 3) {
                this.f19239s = new com.facebook.ads.AdView(this, this.f19221a.f17976cE, AdSize.RECTANGLE_HEIGHT_250);
                linearLayout.addView(this.f19239s);
                if (!((DrawerLayout) findViewById(R.id.drawer_layout)).mo2179f(8388611)) {
                    linearLayout.setVisibility(0);
                }
                this.f19239s.loadAd();
            } else if (intValue == 4) {
                Mrec mrec = new Mrec((Activity) this);
                mrec.setAdTag("AUDIO SECTION");
                linearLayout.addView(mrec);
                if (!((DrawerLayout) findViewById(R.id.drawer_layout)).mo2179f(8388611)) {
                    linearLayout.setVisibility(0);
                }
            }
        }
    }

    public void onClick(View view) {
        if ((this.f19221a.f17986cO == null || this.f19221a.f17986cO.equals("")) && ((this.f19221a.f17985cN == null || this.f19221a.f17985cN.equals("")) && ((this.f19221a.f17988cQ == null || this.f19221a.f17988cQ.equals("")) && (this.f19221a.f17989cR == null || this.f19221a.f17989cR.equals(""))))) {
            abrir_secc(view);
            return;
        }
        if (this.f19221a.f17986cO != null && !this.f19221a.f17986cO.equals("")) {
            this.f19225e = new RewardedVideo((Context) this, this.f19221a.f17986cO);
        }
        if (this.f19221a.f17985cN != null && !this.f19221a.f17985cN.equals("")) {
            this.f19224d = C2997g.m10716a(this);
        }
        if (this.f19221a.f17988cQ != null && !this.f19221a.f17988cQ.equals("")) {
            this.f19226f = new RewardedVideoAd(this, this.f19221a.f17988cQ);
        }
        if (this.f19221a.f17989cR != null && !this.f19221a.f17989cR.equals("")) {
            this.f19227g = new StartAppAd(this);
        }
        this.f19234n = new ProgressDialog(this);
        this.f19233m = view;
        if (!this.f19221a.mo20774a((Context) this, view, this.f19232l, this.f19234n, this.f19224d, this.f19225e, this.f19226f, this.f19227g)) {
            abrir_secc(view);
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f19221a.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f19244x = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f19221a.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f19219A = false;
            startActivity(a.f18226a);
        }
        if (this.f19244x && !this.f19229i) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f19219A = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo21324g() {
        int b = this.f19221a.mo20778b((Context) this);
        if (this.f19221a.f18045dm == 1) {
            this.f19242v = (ListView) findViewById(R.id.left_drawer);
            this.f19221a.mo20771a(this.f19242v);
        } else if (this.f19221a.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f19221a.f17971bz.length; i2++) {
                if (!this.f19221a.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f19221a.f17923bD.length; i3++) {
            if (this.f19221a.f17923bD[i3] > 0) {
                findViewById(this.f19221a.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public boolean onSearchRequested() {
        if (this.f19221a.f18080q == 0) {
            return false;
        }
        this.f19244x = true;
        this.f19229i = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
        try {
            this.f19220B.show(0);
        } catch (Exception unused) {
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals("t_radio_artist")) {
            String string = sharedPreferences.getString("t_radio_artist", "");
            if (string.contains("Ã")) {
                try {
                    string = new String(string.getBytes("ISO-8859-1"), C2793C.UTF8_NAME);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            this.f19235o.setText(string);
        } else if (str.equals("t_radio_song")) {
            String string2 = sharedPreferences.getString("t_radio_song", "");
            if (string2.contains("Ã")) {
                try {
                    string2 = new String(string2.getBytes("ISO-8859-1"), C2793C.UTF8_NAME);
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                }
            }
            this.f19236p.setText(string2);
        } else if (this.f19220B.isShowing()) {
            this.f19220B.show(0);
        }
    }

    public void onPause() {
        if (!(this.f19221a.f18013cx == 0 || this.f19223c == null || this.f19223c.f17768a == null)) {
            this.f19223c.f17768a.mo12167b();
        }
        super.onPause();
        this.f19241u.unregisterOnSharedPreferenceChangeListener(this);
    }

    public void onStop() {
        super.onStop();
        if (this.f19244x && !this.f19229i) {
            finish();
        }
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (!(this.f19221a.f18013cx == 0 || this.f19223c == null || this.f19223c.f17768a == null)) {
            this.f19223c.f17768a.mo12165a();
        }
        if (!(this.f19231k <= 0 || this.f19235o == null || this.f19236p == null || this.f19241u == null)) {
            String string = this.f19241u.getString("t_radio_artist", "");
            if (string.contains("Ã")) {
                try {
                    string = new String(string.getBytes("ISO-8859-1"), C2793C.UTF8_NAME);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            this.f19235o.setText(string);
            String string2 = this.f19241u.getString("t_radio_song", "");
            if (string2.contains("Ã")) {
                try {
                    string2 = new String(string2.getBytes("ISO-8859-1"), C2793C.UTF8_NAME);
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                }
            }
            this.f19236p.setText(string2);
        }
        this.f19241u.registerOnSharedPreferenceChangeListener(this);
    }

    public void onDestroy() {
        if (!(this.f19221a.f18013cx == 0 || this.f19223c == null || this.f19223c.f17768a == null)) {
            this.f19223c.f17768a.mo12168c();
        }
        if (!(this.f19221a.f18013cx == 0 || this.f19223c == null || this.f19223c.f17769b == null)) {
            this.f19223c.f17769b.destroy();
        }
        if (this.f19238r != null) {
            this.f19238r.mo12168c();
        }
        if (this.f19237q != null) {
            this.f19237q.destroy();
        }
        if (this.f19239s != null) {
            this.f19239s.destroy();
        }
        if (!this.f19219A || !isFinishing()) {
            boolean z = config.f17841i;
        }
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo21324g();
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f19223c == null || this.f19223c.f17768a == null)) {
            try {
                this.f19223c.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f19223c == null || this.f19223c.f17769b == null)) {
            try {
                this.f19223c.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        if (!this.f19230j) {
            this.f19223c = this.f19221a.mo20760a((Context) this, false);
        } else {
            mo21323f();
        }
    }

    public void onBackPressed() {
        if (!this.f19219A || this.f19246z || !this.f19221a.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f19246z = true;
        config.m23859l(this);
    }

    public int getBufferPercentage() {
        try {
            if (getDuration() > 0) {
                return (getCurrentPosition() * 100) / getDuration();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getCurrentPosition() {
        return this.f19240t.getInt("position", 0);
    }

    public int getDuration() {
        return this.f19240t.getInt("duration", -1);
    }

    public boolean isPlaying() {
        return this.f19240t.getBoolean("isPlaying", false);
    }

    public void pause() {
        Intent intent = new Intent(this, s_mediaplayer_exo.class);
        intent.putExtra("url", this.f19221a.f17971bz[this.f19243w].f18312e);
        intent.putExtra("ua", this.f19221a.f17971bz[this.f19243w].f18317j);
        intent.putExtra("accion", "pause");
        intent.putExtra("idsecc", this.f19221a.f17971bz[this.f19243w].f18330w);
        intent.putExtra("radio_mostrar", this.f19231k);
        intent.putExtra("secc_tit", this.f19221a.f17971bz[this.f19243w].f18256a);
        intent.putExtra("esStream", this.f19245y);
        startService(intent);
    }

    public void seekTo(int i) {
        Intent intent = new Intent(this, s_mediaplayer_exo.class);
        intent.putExtra("url", this.f19221a.f17971bz[this.f19243w].f18312e);
        intent.putExtra("ua", this.f19221a.f17971bz[this.f19243w].f18317j);
        intent.putExtra("accion", "seekto");
        intent.putExtra("valor", i);
        intent.putExtra("idsecc", this.f19221a.f17971bz[this.f19243w].f18330w);
        intent.putExtra("secc_tit", this.f19221a.f17971bz[this.f19243w].f18256a);
        intent.putExtra("esStream", this.f19245y);
        intent.putExtra("radio_mostrar", this.f19231k);
        startService(intent);
    }

    public void start() {
        Intent intent = new Intent(this, s_mediaplayer_exo.class);
        intent.putExtra("url", this.f19221a.f17971bz[this.f19243w].f18312e);
        intent.putExtra("ua", this.f19221a.f17971bz[this.f19243w].f18317j);
        intent.putExtra("accion", "play");
        intent.putExtra("idsecc", this.f19221a.f17971bz[this.f19243w].f18330w);
        intent.putExtra("radio_mostrar", this.f19231k);
        intent.putExtra("secc_tit", this.f19221a.f17971bz[this.f19243w].f18256a);
        intent.putExtra("esStream", this.f19245y);
        startService(intent);
    }

    public void adLoaded(String str) {
        this.f19234n.cancel();
        this.f19225e.showAd();
    }

    public void onAdClosed() {
        if (this.f19228h) {
            abrir_secc(this.f19233m);
        }
    }

    public void adError(String str) {
        this.f19234n.cancel();
        abrir_secc(this.f19233m);
    }

    public void videoEnded() {
        this.f19228h = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f19234n.cancel();
        this.f19224d.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f19228h = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f19228h) {
            abrir_secc(this.f19233m);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f19228h = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f19221a.mo20775a((Context) this, this.f19225e)) {
            this.f19234n.cancel();
            abrir_secc(this.f19233m);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f19234n.cancel();
        abrir_secc(this.f19233m);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f19234n.cancel();
        this.f19226f.show();
    }

    public void onRewardedVideoCompleted() {
        this.f19228h = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f19228h) {
            abrir_secc(this.f19233m);
        }
    }

    public void onVideoCompleted() {
        this.f19228h = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f19234n.cancel();
        this.f19227g.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_radio.this.f19228h) {
                    t_radio.this.abrir_secc(t_radio.this.f19233m);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f19234n.cancel();
        abrir_secc(this.f19233m);
    }
}
