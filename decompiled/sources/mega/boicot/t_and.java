package mega.boicot;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
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
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.source.hls.DefaultHlsExtractorFactory;
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
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class t_and extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: A */
    ProgressDialog f18495A;

    /* renamed from: B */
    ListView f18496B;

    /* renamed from: C */
    C5601b f18497C;

    /* renamed from: D */
    float f18498D;

    /* renamed from: a */
    config f18499a;

    /* renamed from: b */
    boolean f18500b = false;

    /* renamed from: c */
    boolean f18501c = false;

    /* renamed from: d */
    boolean f18502d;

    /* renamed from: e */
    String f18503e;

    /* renamed from: f */
    String f18504f;

    /* renamed from: g */
    int f18505g;

    /* renamed from: h */
    int f18506h;

    /* renamed from: i */
    int f18507i;

    /* renamed from: j */
    int f18508j = -1;

    /* renamed from: k */
    int[] f18509k;

    /* renamed from: l */
    ImageView[] f18510l;

    /* renamed from: m */
    ProgressBar[] f18511m;

    /* renamed from: n */
    int[][] f18512n;

    /* renamed from: o */
    Bitmap f18513o;

    /* renamed from: p */
    C5663i f18514p;

    /* renamed from: q */
    File f18515q;

    /* renamed from: r */
    Bundle f18516r;

    /* renamed from: s */
    C5602c f18517s;

    /* renamed from: t */
    C3166b f18518t;

    /* renamed from: u */
    RewardedVideo f18519u;

    /* renamed from: v */
    RewardedVideoAd f18520v;

    /* renamed from: w */
    StartAppAd f18521w;

    /* renamed from: x */
    boolean f18522x = false;

    /* renamed from: y */
    boolean f18523y = false;

    /* renamed from: z */
    View f18524z;

    /* renamed from: mega.boicot.t_and$a */
    private class C5737a extends AsyncTask<String, Void, Byte> {

        /* renamed from: a */
        String f18537a;

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }

        private C5737a() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|15) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00e6, code lost:
            return java.lang.Byte.valueOf(-1);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x00e2 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                mega.boicot.t_and r6 = mega.boicot.t_and.this
                int[][] r6 = r6.f18512n
                mega.boicot.t_and r0 = mega.boicot.t_and.this
                int r0 = r0.f18505g
                r6 = r6[r0]
                r0 = 1
                r6 = r6[r0]
                if (r6 != 0) goto L_0x005c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r1 = "http://"
                r6.append(r1)
                java.lang.String r1 = mega.boicot.config.f17839g
                r6.append(r1)
                java.lang.String r1 = "/srv/imgs/and_items/fcab"
                r6.append(r1)
                mega.boicot.t_and r1 = mega.boicot.t_and.this
                int[] r1 = r1.f18509k
                mega.boicot.t_and r2 = mega.boicot.t_and.this
                int r2 = r2.f18505g
                r1 = r1[r2]
                r6.append(r1)
                java.lang.String r1 = ".png"
                r6.append(r1)
                java.lang.String r6 = r6.toString()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "it_fcab"
                r1.append(r2)
                mega.boicot.t_and r2 = mega.boicot.t_and.this
                int[] r2 = r2.f18509k
                mega.boicot.t_and r3 = mega.boicot.t_and.this
                int r3 = r3.f18505g
                r2 = r2[r3]
                r1.append(r2)
                java.lang.String r2 = ".png"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r5.f18537a = r1
                goto L_0x009e
            L_0x005c:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r1 = "http://imgs1.e-droid.net/srv/imgs/and_items/f"
                r6.append(r1)
                mega.boicot.t_and r1 = mega.boicot.t_and.this
                int[] r1 = r1.f18509k
                mega.boicot.t_and r2 = mega.boicot.t_and.this
                int r2 = r2.f18505g
                r1 = r1[r2]
                r6.append(r1)
                java.lang.String r1 = ".png"
                r6.append(r1)
                java.lang.String r6 = r6.toString()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "it_f"
                r1.append(r2)
                mega.boicot.t_and r2 = mega.boicot.t_and.this
                int[] r2 = r2.f18509k
                mega.boicot.t_and r3 = mega.boicot.t_and.this
                int r3 = r3.f18505g
                r2 = r2[r3]
                r1.append(r2)
                java.lang.String r2 = ".png"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r5.f18537a = r1
            L_0x009e:
                r1 = -1
                java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00ec }
                r2.<init>(r6)     // Catch:{ MalformedURLException -> 0x00ec }
                java.net.URLConnection r6 = r2.openConnection()     // Catch:{ IOException -> 0x00e7 }
                java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x00e7 }
                r6.setDoInput(r0)     // Catch:{ IOException -> 0x00e7 }
                r0 = 5000(0x1388, float:7.006E-42)
                r6.setConnectTimeout(r0)     // Catch:{ IOException -> 0x00e7 }
                r0 = 7000(0x1b58, float:9.809E-42)
                r6.setReadTimeout(r0)     // Catch:{ IOException -> 0x00e7 }
                r6.connect()     // Catch:{ IOException -> 0x00e7 }
                java.io.InputStream r6 = r6.getInputStream()     // Catch:{ IOException -> 0x00e7 }
                mega.boicot.t_and r0 = mega.boicot.t_and.this     // Catch:{ IOException -> 0x00e7 }
                android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6)     // Catch:{ IOException -> 0x00e7 }
                r0.f18513o = r6     // Catch:{ IOException -> 0x00e7 }
                mega.boicot.t_and r6 = mega.boicot.t_and.this     // Catch:{ Exception -> 0x00e2 }
                java.lang.String r0 = r5.f18537a     // Catch:{ Exception -> 0x00e2 }
                r2 = 0
                java.io.FileOutputStream r6 = r6.openFileOutput(r0, r2)     // Catch:{ Exception -> 0x00e2 }
                mega.boicot.t_and r0 = mega.boicot.t_and.this     // Catch:{ Exception -> 0x00e2 }
                android.graphics.Bitmap r0 = r0.f18513o     // Catch:{ Exception -> 0x00e2 }
                android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x00e2 }
                r4 = 100
                r0.compress(r3, r4, r6)     // Catch:{ Exception -> 0x00e2 }
                r6.close()     // Catch:{ Exception -> 0x00e2 }
                java.lang.Byte r6 = java.lang.Byte.valueOf(r2)
                return r6
            L_0x00e2:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r1)     // Catch:{ IOException -> 0x00e7 }
                return r6
            L_0x00e7:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r1)
                return r6
            L_0x00ec:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_and.C5737a.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            if (b.byteValue() == 0) {
                int i = t_and.this.f18512n[t_and.this.f18505g][0];
                int i2 = t_and.this.f18512n[t_and.this.f18505g][1];
                int[] a = t_and.this.f18499a.mo20776a(this.f18537a, t_and.this.f18510l[t_and.this.f18505g]);
                if (i2 > 0 && a[0] > 0) {
                    if (a[0] > t_and.this.f18507i) {
                        a[1] = (a[1] * t_and.this.f18507i) / a[0];
                        a[0] = t_and.this.f18507i;
                    }
                    int i3 = (int) ((((float) a[0]) * t_and.this.f18498D) + 0.5f);
                    int i4 = (int) ((((float) a[1]) * t_and.this.f18498D) + 0.5f);
                    t_and.this.f18510l[t_and.this.f18505g].getLayoutParams().width = i3;
                    t_and.this.f18510l[t_and.this.f18505g].getLayoutParams().height = i4;
                }
                t_and.this.f18511m[t_and.this.f18505g].setVisibility(8);
                t_and.this.f18510l[t_and.this.f18505g].setVisibility(0);
                Editor edit = t_and.this.getSharedPreferences("sh", 0).edit();
                if (i2 == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("it");
                    sb.append(t_and.this.f18514p.f18261aE[i].f17742a);
                    sb.append("_fcab_modif");
                    edit.putInt(sb.toString(), 0);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("it_f");
                    sb2.append(t_and.this.f18509k[t_and.this.f18505g]);
                    sb2.append("_modif");
                    edit.putInt(sb2.toString(), 0);
                }
                edit.commit();
                if (i2 == 0) {
                    t_and.this.f18514p.f18261aE[i].f17744c = 0;
                } else {
                    t_and.this.f18514p.f18261aE[i].f17740J[i2 - 1][1] = 0;
                }
            }
            t_and.this.f18505g++;
            if (t_and.this.f18505g < t_and.this.f18506h) {
                new C5737a().execute(new String[0]);
            }
        }
    }

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

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0482  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r27) {
        /*
            r26 = this;
            r11 = r26
            r0 = r27
            android.content.Context r1 = r26.getApplicationContext()
            mega.boicot.config r1 = (mega.boicot.config) r1
            r11.f18499a = r1
            mega.boicot.config r1 = r11.f18499a
            java.lang.String r1 = r1.f17881aN
            if (r1 != 0) goto L_0x0017
            mega.boicot.config r1 = r11.f18499a
            r1.mo20780b()
        L_0x0017:
            android.content.Intent r1 = r26.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            r11.f18516r = r1
            r12 = 1
            r13 = 0
            if (r0 != 0) goto L_0x0043
            android.os.Bundle r1 = r11.f18516r
            if (r1 == 0) goto L_0x003f
            android.os.Bundle r1 = r11.f18516r
            java.lang.String r2 = "es_root"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x003f
            android.os.Bundle r1 = r11.f18516r
            java.lang.String r2 = "es_root"
            boolean r1 = r1.getBoolean(r2, r13)
            if (r1 == 0) goto L_0x003f
            r1 = r12
            goto L_0x0040
        L_0x003f:
            r1 = r13
        L_0x0040:
            r11.f18502d = r1
            goto L_0x0058
        L_0x0043:
            java.lang.String r1 = "es_root"
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L_0x0055
            java.lang.String r1 = "es_root"
            boolean r1 = r0.getBoolean(r1, r13)
            if (r1 == 0) goto L_0x0055
            r1 = r12
            goto L_0x0056
        L_0x0055:
            r1 = r13
        L_0x0056:
            r11.f18502d = r1
        L_0x0058:
            mega.boicot.config r1 = r11.f18499a
            mega.boicot.i[] r1 = r1.f17971bz
            mega.boicot.config r2 = r11.f18499a
            int r2 = r2.f18075l
            r1 = r1[r2]
            java.lang.String r1 = r1.f18314g
            mega.boicot.config r2 = r11.f18499a
            java.lang.String r2 = r2.f17890aW
            java.lang.String r1 = mega.boicot.config.m23831a(r1, r2)
            r11.f18504f = r1
            super.onCreate(r27)
            r1 = 2131361920(0x7f0a0080, float:1.8343606E38)
            r11.setContentView(r1)
            r26.mo20971f()
            mega.boicot.config r1 = r11.f18499a
            int r1 = r1.f18080q
            if (r1 <= 0) goto L_0x0098
            java.lang.String r1 = "search"
            java.lang.Object r1 = r11.getSystemService(r1)
            android.app.SearchManager r1 = (android.app.SearchManager) r1
            mega.boicot.t_and$1 r2 = new mega.boicot.t_and$1
            r2.<init>()
            r1.setOnCancelListener(r2)
            mega.boicot.t_and$2 r2 = new mega.boicot.t_and$2
            r2.<init>()
            r1.setOnDismissListener(r2)
        L_0x0098:
            if (r0 != 0) goto L_0x00c1
            mega.boicot.config r1 = r11.f18499a
            android.os.Bundle r2 = r11.f18516r
            if (r2 == 0) goto L_0x00ac
            android.os.Bundle r2 = r11.f18516r
            java.lang.String r3 = "ad_entrar"
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x00ac
            r2 = r12
            goto L_0x00ad
        L_0x00ac:
            r2 = r13
        L_0x00ad:
            android.os.Bundle r3 = r11.f18516r
            if (r3 == 0) goto L_0x00bd
            android.os.Bundle r3 = r11.f18516r
            java.lang.String r4 = "fb_entrar"
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L_0x00bd
            r3 = r12
            goto L_0x00be
        L_0x00bd:
            r3 = r13
        L_0x00be:
            r1.mo20770a(r11, r2, r3)
        L_0x00c1:
            mega.boicot.config r1 = r11.f18499a
            mega.boicot.c r1 = r1.mo20760a(r11, r13)
            r11.f18517s = r1
            mega.boicot.config r1 = r11.f18499a
            mega.boicot.config r2 = r11.f18499a
            int r2 = r2.f18075l
            java.lang.String r3 = r11.f18504f
            r1.mo20767a(r11, r2, r3, r0)
            android.content.Intent r0 = r26.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            mega.boicot.config r1 = r11.f18499a
            mega.boicot.i[] r1 = r1.f17971bz
            java.lang.String r2 = "idsecc"
            int r0 = r0.getInt(r2)
            r0 = r1[r0]
            r11.f18514p = r0
            android.content.res.Resources r0 = r26.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r11.f18498D = r0
            r14 = 2131231223(0x7f0801f7, float:1.807852E38)
            android.view.View r0 = r11.findViewById(r14)
            r15 = r0
            android.widget.ScrollView r15 = (android.widget.ScrollView) r15
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r26)
            mega.boicot.i r0 = r11.f18514p
            java.lang.String r0 = r0.f18314g
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            r1 = 2
            r9 = 0
            if (r0 != 0) goto L_0x0153
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r3 = new int[r1]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "#"
            r4.append(r5)
            mega.boicot.i r5 = r11.f18514p
            java.lang.String r5 = r5.f18314g
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            int r4 = android.graphics.Color.parseColor(r4)
            r3[r13] = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "#"
            r4.append(r5)
            mega.boicot.i r5 = r11.f18514p
            java.lang.String r5 = r5.f18315h
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            int r4 = android.graphics.Color.parseColor(r4)
            r3[r12] = r4
            r0.<init>(r2, r3)
            r8 = r0
            goto L_0x0154
        L_0x0153:
            r8 = r9
        L_0x0154:
            r0 = r13
            r2 = r0
        L_0x0156:
            mega.boicot.i r3 = r11.f18514p
            mega.boicot.b[] r3 = r3.f18261aE
            int r3 = r3.length
            if (r0 >= r3) goto L_0x016b
            mega.boicot.i r3 = r11.f18514p
            mega.boicot.b[] r3 = r3.f18261aE
            r3 = r3[r0]
            int[][] r3 = r3.f17740J
            int r3 = r3.length
            int r3 = r3 + r12
            int r2 = r2 + r3
            int r0 = r0 + 1
            goto L_0x0156
        L_0x016b:
            r11.f18506h = r13
            int[] r0 = new int[r2]
            r11.f18509k = r0
            android.widget.ImageView[] r0 = new android.widget.ImageView[r2]
            r11.f18510l = r0
            android.widget.ProgressBar[] r0 = new android.widget.ProgressBar[r2]
            r11.f18511m = r0
            int[] r0 = new int[]{r2, r1}
            java.lang.Class<int> r1 = int.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            int[][] r0 = (int[][]) r0
            r11.f18512n = r0
            r7 = r13
        L_0x0188:
            mega.boicot.i r0 = r11.f18514p
            mega.boicot.b[] r0 = r0.f18261aE
            int r0 = r0.length
            if (r7 >= r0) goto L_0x0659
            mega.boicot.i r0 = r11.f18514p
            mega.boicot.b[] r0 = r0.f18261aE
            r0 = r0[r7]
            r11.f18497C = r0
            r0 = 2131361921(0x7f0a0081, float:1.8343608E38)
            android.view.View r6 = r10.inflate(r0, r9)
            r0 = 125(0x7d, float:1.75E-43)
            r11.f18507i = r0
            mega.boicot.b r0 = r11.f18497C
            java.lang.String r0 = r0.f17735E
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01b2
            r0 = 250(0xfa, float:3.5E-43)
            r11.f18507i = r0
        L_0x01b2:
            mega.boicot.b r0 = r11.f18497C
            int r0 = r0.f17767z
            if (r0 != r12) goto L_0x01be
            mega.boicot.b r0 = r11.f18497C
            int r0 = r0.f17750i
            if (r0 == r12) goto L_0x01ca
        L_0x01be:
            mega.boicot.b r0 = r11.f18497C
            int r0 = r0.f17751j
            if (r0 != r12) goto L_0x01cd
            mega.boicot.b r0 = r11.f18497C
            int r0 = r0.f17748g
            if (r0 != r12) goto L_0x01cd
        L_0x01ca:
            r0 = 17
            goto L_0x01d0
        L_0x01cd:
            r0 = 8388611(0x800003, float:1.1754948E-38)
        L_0x01d0:
            mega.boicot.b r1 = r11.f18497C
            java.lang.String r1 = r1.f17733C
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x024f
            mega.boicot.b r1 = r11.f18497C
            int r1 = r1.f17767z
            if (r1 != 0) goto L_0x01f5
            mega.boicot.b r1 = r11.f18497C
            int r1 = r1.f17751j
            if (r1 != 0) goto L_0x01f5
            mega.boicot.b r0 = r11.f18497C
            int r0 = r0.f17746e
            if (r0 != 0) goto L_0x01f2
            r16 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x01f7
        L_0x01f2:
            r16 = 17
            goto L_0x01f7
        L_0x01f5:
            r16 = r0
        L_0x01f7:
            r0 = 2131230793(0x7f080049, float:1.8077649E38)
            android.view.View r0 = r6.findViewById(r0)
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            mega.boicot.b r0 = r11.f18497C
            java.lang.String r2 = r0.f17733C
            mega.boicot.b r0 = r11.f18497C
            int r1 = r0.f17746e
            mega.boicot.b r0 = r11.f18497C
            int r0 = r0.f17752k
            mega.boicot.b r4 = r11.f18497C
            int r4 = r4.f17753l
            mega.boicot.b r5 = r11.f18497C
            int r5 = r5.f17754m
            mega.boicot.b r9 = r11.f18497C
            java.lang.String r9 = r9.f17736F
            mega.boicot.b r14 = r11.f18497C
            int r14 = r14.f17755n
            mega.boicot.b r12 = r11.f18497C
            int r12 = r12.f17756o
            r19 = 0
            r20 = r0
            r0 = r11
            r21 = r1
            r1 = r3
            r13 = r3
            r3 = r21
            r17 = r4
            r4 = r20
            r18 = r5
            r5 = r17
            r22 = r6
            r6 = r18
            r17 = r7
            r7 = r9
            r9 = r8
            r8 = r14
            r14 = r9
            r23 = r15
            r15 = 0
            r9 = r12
            r12 = r10
            r10 = r19
            r0.m23998a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 0
            r13.setVisibility(r0)
            r5 = r16
            goto L_0x0259
        L_0x024f:
            r22 = r6
            r17 = r7
            r14 = r8
            r12 = r10
            r23 = r15
            r15 = r9
            r5 = r0
        L_0x0259:
            mega.boicot.b r0 = r11.f18497C
            int r0 = r0.f17743b
            if (r0 == 0) goto L_0x0277
            mega.boicot.b r0 = r11.f18497C
            int r0 = r0.f17767z
            if (r0 != 0) goto L_0x0277
            mega.boicot.b r0 = r11.f18497C
            int r0 = r0.f17751j
            if (r0 != 0) goto L_0x0277
            mega.boicot.b r0 = r11.f18497C
            int r0 = r0.f17745d
            if (r0 != 0) goto L_0x0275
            r5 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x0277
        L_0x0275:
            r5 = 17
        L_0x0277:
            mega.boicot.b r0 = r11.f18497C
            java.lang.String r0 = r0.f17734D
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02df
            mega.boicot.b r0 = r11.f18497C
            int r0 = r0.f17767z
            if (r0 != 0) goto L_0x029c
            mega.boicot.b r0 = r11.f18497C
            int r0 = r0.f17751j
            if (r0 != 0) goto L_0x029c
            mega.boicot.b r0 = r11.f18497C
            int r0 = r0.f17747f
            if (r0 != 0) goto L_0x0299
            r13 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x029d
        L_0x0299:
            r13 = 17
            goto L_0x029d
        L_0x029c:
            r13 = r5
        L_0x029d:
            r0 = 2131230794(0x7f08004a, float:1.807765E38)
            r10 = r22
            android.view.View r0 = r10.findViewById(r0)
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            mega.boicot.b r0 = r11.f18497C
            java.lang.String r2 = r0.f17734D
            mega.boicot.b r0 = r11.f18497C
            int r3 = r0.f17747f
            mega.boicot.b r0 = r11.f18497C
            int r4 = r0.f17757p
            mega.boicot.b r0 = r11.f18497C
            int r5 = r0.f17758q
            mega.boicot.b r0 = r11.f18497C
            int r6 = r0.f17759r
            mega.boicot.b r0 = r11.f18497C
            java.lang.String r7 = r0.f17737G
            mega.boicot.b r0 = r11.f18497C
            int r8 = r0.f17760s
            mega.boicot.b r0 = r11.f18497C
            int r1 = r0.f17761t
            r16 = 0
            r0 = r11
            r18 = r1
            r1 = r9
            r15 = r9
            r9 = r18
            r24 = r12
            r12 = r10
            r10 = r16
            r0.m23998a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 0
            r15.setVisibility(r0)
            goto L_0x02e4
        L_0x02df:
            r24 = r12
            r12 = r22
            r13 = r5
        L_0x02e4:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r15 = -2
            r0.<init>(r15, r15)
            r10 = 2131231157(0x7f0801b5, float:1.8078387E38)
            r9 = 8388611(0x800003, float:1.1754948E-38)
            if (r13 != r9) goto L_0x02fd
            r0.gravity = r13
            android.view.View r1 = r12.findViewById(r10)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setLayoutParams(r0)
        L_0x02fd:
            mega.boicot.b r0 = r11.f18497C
            java.lang.String r0 = r0.f17735E
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0349
            android.view.View r0 = r12.findViewById(r10)
            r1 = 0
            r0.setVisibility(r1)
            r0 = 2131230795(0x7f08004b, float:1.8077653E38)
            android.view.View r0 = r12.findViewById(r0)
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            mega.boicot.b r0 = r11.f18497C
            java.lang.String r2 = r0.f17735E
            r3 = 0
            mega.boicot.b r0 = r11.f18497C
            int r4 = r0.f17762u
            mega.boicot.b r0 = r11.f18497C
            int r5 = r0.f17763v
            mega.boicot.b r0 = r11.f18497C
            int r6 = r0.f17764w
            mega.boicot.b r0 = r11.f18497C
            java.lang.String r7 = r0.f17738H
            mega.boicot.b r0 = r11.f18497C
            int r8 = r0.f17765x
            mega.boicot.b r0 = r11.f18497C
            int r1 = r0.f17766y
            r16 = 1
            r0 = r11
            r18 = r1
            r1 = r13
            r9 = r18
            r10 = r16
            r0.m23998a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 0
            r13.setVisibility(r0)
        L_0x0349:
            mega.boicot.i r0 = r11.f18514p
            java.lang.String r0 = r0.f18314g
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0372
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "#"
            r0.append(r1)
            mega.boicot.i r1 = r11.f18514p
            java.lang.String r1 = r1.f18314g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = mega.boicot.config.m23844a(r0)
            if (r0 == 0) goto L_0x0372
            r0 = 1
            goto L_0x0373
        L_0x0372:
            r0 = 0
        L_0x0373:
            mega.boicot.b r1 = r11.f18497C
            int r1 = r1.f17743b
            if (r1 == 0) goto L_0x047b
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r15, r15)
            mega.boicot.b r2 = r11.f18497C
            int r2 = r2.f17745d
            if (r2 != 0) goto L_0x038a
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r1.gravity = r2
            goto L_0x0395
        L_0x038a:
            mega.boicot.b r2 = r11.f18497C
            int r2 = r2.f17745d
            r3 = 1
            if (r2 != r3) goto L_0x0395
            r2 = 17
            r1.gravity = r2
        L_0x0395:
            r2 = 2131230790(0x7f080046, float:1.8077643E38)
            android.view.View r2 = r12.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r0 == 0) goto L_0x03aa
            r3 = 2131230792(0x7f080048, float:1.8077647E38)
            android.view.View r3 = r12.findViewById(r3)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            goto L_0x03b3
        L_0x03aa:
            r3 = 2131230791(0x7f080047, float:1.8077645E38)
            android.view.View r3 = r12.findViewById(r3)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
        L_0x03b3:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 20
            if (r4 <= r5) goto L_0x03c0
            mega.boicot.config r4 = r11.f18499a
            java.lang.String r4 = r4.f17890aW
            mega.boicot.config.m23838a(r3, r4)
        L_0x03c0:
            r2.setLayoutParams(r1)
            r3.setLayoutParams(r1)
            mega.boicot.b r1 = r11.f18497C
            java.lang.String r1 = r1.f17739I
            java.lang.String r4 = ""
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x03db
            mega.boicot.t_and$3 r1 = new mega.boicot.t_and$3
            r1.<init>()
            r2.setOnClickListener(r1)
            goto L_0x03e9
        L_0x03db:
            mega.boicot.b r1 = r11.f18497C
            boolean r1 = r1.f17731A
            if (r1 == 0) goto L_0x03e9
            mega.boicot.t_and$4 r1 = new mega.boicot.t_and$4
            r1.<init>()
            r2.setOnClickListener(r1)
        L_0x03e9:
            mega.boicot.b r1 = r11.f18497C
            int r1 = r1.f17744c
            r4 = 1
            if (r1 != r4) goto L_0x0421
            int[] r1 = r11.f18509k
            int r4 = r11.f18506h
            mega.boicot.b r5 = r11.f18497C
            int r5 = r5.f17743b
            r1[r4] = r5
            android.widget.ImageView[] r1 = r11.f18510l
            int r4 = r11.f18506h
            r1[r4] = r2
            android.widget.ProgressBar[] r1 = r11.f18511m
            int r2 = r11.f18506h
            r1[r2] = r3
            int[][] r1 = r11.f18512n
            int r2 = r11.f18506h
            r1 = r1[r2]
            r2 = 0
            r1[r2] = r17
            int[][] r1 = r11.f18512n
            int r4 = r11.f18506h
            r1 = r1[r4]
            r4 = 1
            r1[r4] = r2
            int r1 = r11.f18506h
            int r1 = r1 + r4
            r11.f18506h = r1
            r3.setVisibility(r2)
            goto L_0x047b
        L_0x0421:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "it_fcab"
            r1.append(r3)
            mega.boicot.b r3 = r11.f18497C
            int r3 = r3.f17743b
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r4 = ".png"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.io.File r3 = r11.getFileStreamPath(r3)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L_0x0458
            java.io.File r1 = r11.getFileStreamPath(r1)
            r1.renameTo(r3)
        L_0x0458:
            mega.boicot.config r1 = r11.f18499a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "it_fcab"
            r3.append(r4)
            mega.boicot.b r4 = r11.f18497C
            int r4 = r4.f17743b
            r3.append(r4)
            java.lang.String r4 = ".png"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.mo20776a(r3, r2)
            r1 = 0
            r2.setVisibility(r1)
        L_0x047b:
            mega.boicot.b r1 = r11.f18497C
            int[][] r1 = r1.f17740J
            int r1 = r1.length
            if (r1 <= 0) goto L_0x0630
            mega.boicot.b r1 = r11.f18497C
            int r1 = r1.f17749h
            if (r1 != 0) goto L_0x0492
            r1 = 2131231158(0x7f0801b6, float:1.807839E38)
            android.view.View r1 = r12.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            goto L_0x049b
        L_0x0492:
            r1 = 2131231159(0x7f0801b7, float:1.8078391E38)
            android.view.View r1 = r12.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
        L_0x049b:
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r2.<init>(r15, r15)
            r3 = 0
        L_0x04a1:
            mega.boicot.b r4 = r11.f18497C
            int[][] r4 = r4.f17740J
            int r4 = r4.length
            if (r3 >= r4) goto L_0x0622
            android.widget.ImageView r4 = new android.widget.ImageView
            r4.<init>(r11)
            r5 = 1092616192(0x41200000, float:10.0)
            float r6 = r11.f18498D
            float r5 = r5 * r6
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r6
            int r5 = (int) r5
            r7 = 0
            r4.setPadding(r7, r7, r7, r5)
            r5 = 8
            r4.setVisibility(r5)
            r7 = 1
            r4.setAdjustViewBounds(r7)
            mega.boicot.b r7 = r11.f18497C
            java.lang.String[] r7 = r7.f17741K
            r7 = r7[r3]
            java.lang.String r8 = ""
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x04e2
            mega.boicot.b r7 = r11.f18497C
            java.lang.String[] r7 = r7.f17741K
            r7 = r7[r3]
            r11.f18503e = r7
            mega.boicot.t_and$5 r7 = new mega.boicot.t_and$5
            r7.<init>()
            r4.setOnClickListener(r7)
            goto L_0x0515
        L_0x04e2:
            mega.boicot.b r7 = r11.f18497C
            boolean r7 = r7.f17732B
            if (r7 == 0) goto L_0x0515
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "it_f"
            r7.append(r8)
            mega.boicot.b r8 = r11.f18497C
            int[][] r8 = r8.f17740J
            r8 = r8[r3]
            r9 = 0
            r8 = r8[r9]
            r7.append(r8)
            java.lang.String r8 = ".png"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.io.File r7 = r11.getFileStreamPath(r7)
            r11.f18515q = r7
            mega.boicot.t_and$6 r7 = new mega.boicot.t_and$6
            r7.<init>()
            r4.setOnClickListener(r7)
        L_0x0515:
            if (r0 == 0) goto L_0x0521
            android.widget.ProgressBar r7 = new android.widget.ProgressBar
            r8 = 16843399(0x1010287, float:2.369537E-38)
            r9 = 0
            r7.<init>(r11, r9, r8)
            goto L_0x0526
        L_0x0521:
            android.widget.ProgressBar r7 = new android.widget.ProgressBar
            r7.<init>(r11)
        L_0x0526:
            mega.boicot.config r8 = r11.f18499a
            java.lang.String r8 = r8.f17890aW
            mega.boicot.config.m23838a(r7, r8)
            r8 = 10
            r9 = 0
            r7.setPadding(r9, r9, r9, r8)
            r7.setVisibility(r5)
            r1.addView(r7, r2)
            r1.addView(r4, r2)
            mega.boicot.b r5 = r11.f18497C
            int[][] r5 = r5.f17740J
            r5 = r5[r3]
            r8 = 1
            r5 = r5[r8]
            if (r5 != r8) goto L_0x0580
            int[] r5 = r11.f18509k
            int r6 = r11.f18506h
            mega.boicot.b r8 = r11.f18497C
            int[][] r8 = r8.f17740J
            r8 = r8[r3]
            r9 = 0
            r8 = r8[r9]
            r5[r6] = r8
            android.widget.ImageView[] r5 = r11.f18510l
            int r6 = r11.f18506h
            r5[r6] = r4
            android.widget.ProgressBar[] r4 = r11.f18511m
            int r5 = r11.f18506h
            r4[r5] = r7
            int[][] r4 = r11.f18512n
            int r5 = r11.f18506h
            r4 = r4[r5]
            r4[r9] = r17
            int[][] r4 = r11.f18512n
            int r5 = r11.f18506h
            r4 = r4[r5]
            int r5 = r3 + 1
            r6 = 1
            r4[r6] = r5
            int r4 = r11.f18506h
            int r4 = r4 + r6
            r11.f18506h = r4
            r7.setVisibility(r9)
            r5 = r9
            goto L_0x061e
        L_0x0580:
            r9 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "it_f"
            r5.append(r7)
            mega.boicot.b r7 = r11.f18497C
            int[][] r7 = r7.f17740J
            r7 = r7[r3]
            r7 = r7[r9]
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r8 = ".png"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.io.File r7 = r11.getFileStreamPath(r7)
            boolean r8 = r7.exists()
            if (r8 != 0) goto L_0x05bc
            java.io.File r5 = r11.getFileStreamPath(r5)
            r5.renameTo(r7)
        L_0x05bc:
            mega.boicot.config r5 = r11.f18499a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "it_f"
            r7.append(r8)
            mega.boicot.b r8 = r11.f18497C
            int[][] r8 = r8.f17740J
            r8 = r8[r3]
            r9 = 0
            r8 = r8[r9]
            r7.append(r8)
            java.lang.String r8 = ".png"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int[] r5 = r5.mo20776a(r7, r4)
            r7 = r5[r9]
            if (r7 <= 0) goto L_0x061a
            r7 = r5[r9]
            int r8 = r11.f18507i
            if (r7 <= r8) goto L_0x05fb
            r7 = 1
            r8 = r5[r7]
            int r10 = r11.f18507i
            int r8 = r8 * r10
            r10 = r5[r9]
            int r8 = r8 / r10
            r5[r7] = r8
            int r8 = r11.f18507i
            r5[r9] = r8
            goto L_0x05fc
        L_0x05fb:
            r7 = 1
        L_0x05fc:
            r8 = r5[r9]
            float r8 = (float) r8
            float r9 = r11.f18498D
            float r8 = r8 * r9
            float r8 = r8 + r6
            int r8 = (int) r8
            r5 = r5[r7]
            float r5 = (float) r5
            float r7 = r11.f18498D
            float r5 = r5 * r7
            float r5 = r5 + r6
            int r5 = (int) r5
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            r6.width = r8
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            r6.height = r5
            r5 = 0
            goto L_0x061b
        L_0x061a:
            r5 = r9
        L_0x061b:
            r4.setVisibility(r5)
        L_0x061e:
            int r3 = r3 + 1
            goto L_0x04a1
        L_0x0622:
            r5 = 0
            r1.setVisibility(r5)
            r0 = 2131231157(0x7f0801b5, float:1.8078387E38)
            android.view.View r0 = r12.findViewById(r0)
            r0.setVisibility(r5)
        L_0x0630:
            mega.boicot.i r0 = r11.f18514p
            int r0 = r0.f18326s
            r1 = 1
            if (r0 != r1) goto L_0x0646
            mega.boicot.i r0 = r11.f18514p
            java.lang.String r0 = r0.f18314g
            java.lang.String r2 = ""
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0646
            r12.setBackgroundDrawable(r14)
        L_0x0646:
            r0 = r23
            r0.addView(r12)
            int r7 = r17 + 1
            r15 = r0
            r12 = r1
            r8 = r14
            r10 = r24
            r9 = 0
            r13 = 0
            r14 = 2131231223(0x7f0801f7, float:1.807852E38)
            goto L_0x0188
        L_0x0659:
            r14 = r8
            mega.boicot.i r0 = r11.f18514p
            int r0 = r0.f18326s
            if (r0 != 0) goto L_0x0676
            mega.boicot.i r0 = r11.f18514p
            java.lang.String r0 = r0.f18314g
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0676
            r0 = 2131231223(0x7f0801f7, float:1.807852E38)
            android.view.View r0 = r11.findViewById(r0)
            r0.setBackgroundDrawable(r14)
        L_0x0676:
            int r0 = r11.f18506h
            if (r0 <= 0) goto L_0x0688
            r0 = 0
            r11.f18505g = r0
            mega.boicot.t_and$a r1 = new mega.boicot.t_and$a
            r2 = 0
            r1.<init>()
            java.lang.String[] r0 = new java.lang.String[r0]
            r1.execute(r0)
        L_0x0688:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_and.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m23999a(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12 = str;
        String lowerCase = str.toLowerCase();
        boolean z = true;
        String[] strArr = {"doc", "docx", "xls", "xlsx", "ppt", "pptx", "pdf", "pages", "ai", "psd", "tiff", "dxf", "svg", "eps", "ps", "ttf", "otf", "xps", "zip", "rar"};
        String str13 = "";
        int lastIndexOf = str12.lastIndexOf(".");
        if (lastIndexOf != -1) {
            str13 = lowerCase.substring(lastIndexOf);
        }
        String replace = str13.replace(".", "");
        if (lowerCase.startsWith("tel:") || lowerCase.startsWith("http://tel:")) {
            if (lowerCase.startsWith("tel:")) {
                str2 = str12.substring(4);
            } else {
                str2 = str12.substring(11);
            }
            if (str2.endsWith("/")) {
                str2 = str2.substring(0, str2.length() - 1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("tel:");
            sb.append(str2);
            startActivity(new Intent("android.intent.action.DIAL", Uri.parse(sb.toString())));
        } else if (lowerCase.startsWith("mailto:") || lowerCase.startsWith("http://mailto:")) {
            String str14 = "";
            String str15 = "";
            if (lowerCase.startsWith("mailto:")) {
                str3 = str12.substring(7).trim();
            } else {
                str3 = str12.substring(14).trim();
            }
            if (!str3.equals("")) {
                int indexOf = str3.indexOf("?");
                if (indexOf > 0) {
                    int indexOf2 = str3.indexOf("?subject=");
                    if (indexOf2 != -1) {
                        str14 = str3.substring(indexOf2 + 9).trim();
                        int indexOf3 = str14.indexOf("&body=");
                        if (indexOf3 != -1) {
                            str15 = str14.substring(indexOf3 + 6).trim();
                            str14 = str14.substring(0, indexOf3).trim();
                        }
                    }
                    str3 = str3.substring(0, indexOf).trim();
                }
                if (str3.endsWith("/")) {
                    str3 = str3.substring(0, str3.length() - 1);
                }
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", str3, null));
                if (!str14.equals("")) {
                    try {
                        str5 = URLDecoder.decode(str14, C2793C.UTF8_NAME);
                    } catch (Exception unused) {
                        str5 = str14;
                    }
                    intent.putExtra("android.intent.extra.SUBJECT", str5);
                }
                if (!str15.equals("")) {
                    try {
                        str4 = URLDecoder.decode(str15, C2793C.UTF8_NAME);
                    } catch (Exception unused2) {
                        str4 = str15;
                    }
                    intent.putExtra("android.intent.extra.TEXT", str4);
                }
                startActivity(Intent.createChooser(intent, getResources().getString(R.string.enviar_email)));
            }
        } else if (lowerCase.startsWith("smsto:") || lowerCase.startsWith("http://smsto:")) {
            String str16 = "";
            if (lowerCase.startsWith("smsto:")) {
                str6 = str12.substring(6).trim();
            } else {
                str6 = str12.substring(13).trim();
            }
            if (!str6.equals("")) {
                int indexOf4 = str6.indexOf("?");
                if (indexOf4 > 0) {
                    int indexOf5 = str6.indexOf("?body=");
                    if (indexOf5 != -1) {
                        str16 = str6.substring(indexOf5 + 6).trim();
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
                if (!str16.equals("")) {
                    try {
                        str7 = URLDecoder.decode(str16, C2793C.UTF8_NAME);
                    } catch (Exception unused3) {
                        str7 = str16;
                    }
                    intent2.putExtra("sms_body", str7);
                }
                try {
                    startActivity(intent2);
                } catch (Exception unused4) {
                }
            }
        } else if (lowerCase.startsWith("go:") || lowerCase.startsWith("http://go:")) {
            if (lowerCase.startsWith("go:")) {
                str8 = str12.substring(3);
            } else {
                str8 = str12.substring(10);
            }
            if (str8.endsWith("/")) {
                str8 = str8.substring(0, str8.length() - 1);
            }
            try {
                str9 = URLDecoder.decode(str8, C2793C.UTF8_NAME);
            } catch (Exception unused5) {
                str9 = str8;
            }
            boolean z2 = false;
            for (int i = 0; i < this.f18499a.f17971bz.length; i++) {
                if (this.f18499a.f17971bz[i].f18316i.equalsIgnoreCase(str9)) {
                    if ((this.f18499a.f17986cO == null || this.f18499a.f17986cO.equals("")) && ((this.f18499a.f17985cN == null || this.f18499a.f17985cN.equals("")) && ((this.f18499a.f17988cQ == null || this.f18499a.f17988cQ.equals("")) && (this.f18499a.f17989cR == null || this.f18499a.f17989cR.equals(""))))) {
                        mo20970b(i);
                    } else {
                        if (this.f18499a.f17986cO != null && !this.f18499a.f17986cO.equals("")) {
                            this.f18519u = new RewardedVideo((Context) this, this.f18499a.f17986cO);
                        }
                        if (this.f18499a.f17985cN != null && !this.f18499a.f17985cN.equals("")) {
                            this.f18518t = C2997g.m10716a(this);
                        }
                        if (this.f18499a.f17988cQ != null && !this.f18499a.f17988cQ.equals("")) {
                            this.f18520v = new RewardedVideoAd(this, this.f18499a.f17988cQ);
                        }
                        if (this.f18499a.f17989cR != null && !this.f18499a.f17989cR.equals("")) {
                            this.f18521w = new StartAppAd(this);
                        }
                        this.f18495A = new ProgressDialog(this);
                        View view = new View(this);
                        view.setId(i);
                        view.setTag(R.id.TAG_IDSECC, Integer.valueOf(i));
                        this.f18524z = null;
                        this.f18508j = i;
                        if (!this.f18499a.mo20774a((Context) this, view, this.f18504f, this.f18495A, this.f18518t, this.f18519u, this.f18520v, this.f18521w)) {
                            mo20970b(i);
                        }
                    }
                    z2 = true;
                }
            }
            z = z2;
        } else if (lowerCase.startsWith("vnd.youtube:")) {
            int indexOf6 = str12.indexOf("?");
            if (indexOf6 > 0) {
                str11 = str12.substring(12, indexOf6);
            } else {
                str11 = str12.substring(12);
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("http://www.youtube.com/watch?v=");
            sb3.append(str11);
            String sb4 = sb3.toString();
            if (this.f18514p.f18329v == 1) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb4)));
            } else {
                Intent intent3 = new Intent(this, t_url.class);
                intent3.putExtra("url", sb4);
                startActivityForResult(intent3, 0);
            }
        } else if (lowerCase.endsWith(DefaultHlsExtractorFactory.MP3_FILE_EXTENSION)) {
            Intent intent4 = new Intent("android.intent.action.VIEW");
            intent4.setDataAndType(Uri.parse(str), "audio/*");
            startActivity(intent4);
        } else if (lowerCase.endsWith(".mp4") || lowerCase.endsWith(".3gp")) {
            Intent intent5 = new Intent("android.intent.action.VIEW");
            intent5.setDataAndType(Uri.parse(str), "video/*");
            startActivity(intent5);
        } else if (this.f18514p.f18329v == 1 || lowerCase.startsWith("rtsp://") || lowerCase.startsWith("rtmp://") || lowerCase.startsWith("market://") || lowerCase.endsWith(".apk") || lowerCase.startsWith("whatsapp://") || lowerCase.endsWith(".m3u") || lowerCase.endsWith(".m3u8")) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Exception unused6) {
            }
        } else {
            if (Arrays.asList(strArr).contains(replace) && !lowerCase.contains("docs.google.com")) {
                try {
                    str10 = URLEncoder.encode(str12, AudienceNetworkActivity.WEBVIEW_ENCODING);
                } catch (Exception unused7) {
                    str10 = str12;
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append("http://docs.google.com/viewer?embedded=true&url=");
                sb5.append(str10);
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb5.toString())));
            }
            z = false;
        }
        if (!z) {
            Intent intent6 = new Intent(this, t_url.class);
            intent6.putExtra("url", str12);
            startActivityForResult(intent6, 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo20970b(int i) {
        startActivityForResult(this.f18499a.mo20762a(Integer.valueOf(i), (Context) this).f18226a, 0);
    }

    /* renamed from: a */
    private void m23998a(TextView textView, String str, int i, int i2, int i3, int i4, String str2, int i5, int i6, boolean z) {
        Typeface typeface;
        int i7;
        int i8;
        if (i == 0) {
            textView.setGravity(8388611);
            if (VERSION.SDK_INT >= 17 && getResources().getBoolean(R.bool.es_rtl)) {
                textView.setTextDirection(4);
            }
        } else if (i == 1) {
            textView.setGravity(17);
        }
        if (i4 == 1) {
            typeface = config.f17837eo;
        } else if (i4 == 2) {
            typeface = config.f17835em;
        } else if (i4 == 3) {
            typeface = config.f17836en;
        } else {
            typeface = Typeface.DEFAULT;
        }
        if (i2 == 1 && i3 == 1) {
            textView.setTypeface(Typeface.create(typeface, 3));
        } else if (i2 == 1 && i3 == 0) {
            textView.setTypeface(Typeface.create(typeface, 1));
        } else if (i2 == 0 && i3 == 1) {
            textView.setTypeface(Typeface.create(typeface, 2));
        } else {
            textView.setTypeface(typeface);
        }
        if (!str2.equals("")) {
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(str2);
            textView.setTextColor(Color.parseColor(sb.toString()));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(str2);
            textView.setLinkTextColor(Color.parseColor(sb2.toString()));
        }
        if (z) {
            if (str.toUpperCase().indexOf("<BR") == -1) {
                str = str.replace("\n", "<br>");
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(str.replace("<a href", "@AHREF_INI@").replace("<A HREF", "@AHREF_INI@").replace("</a>", "@AHREF_FIN@").replace("</A>", "@AHREF_FIN@").replace("</ a>", "@AHREF_FIN@").replace("</ A>", "@AHREF_FIN@")));
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            int indexOf = spannableStringBuilder2.indexOf("@AHREF_INI@");
            while (indexOf != -1) {
                spannableStringBuilder.replace(indexOf, indexOf + 11, "<a href");
                spannableStringBuilder2 = spannableStringBuilder.toString();
                indexOf = spannableStringBuilder2.indexOf("@AHREF_INI@");
            }
            for (int indexOf2 = spannableStringBuilder2.indexOf("@AHREF_FIN@"); indexOf2 != -1; indexOf2 = spannableStringBuilder.toString().indexOf("@AHREF_FIN@")) {
                spannableStringBuilder.replace(indexOf2, indexOf2 + 11, "</a>");
            }
            if (i5 == 1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), 0, spannableStringBuilder.length(), 0);
            }
            String spannableStringBuilder3 = spannableStringBuilder.toString();
            String upperCase = spannableStringBuilder3.toUpperCase();
            for (int indexOf3 = upperCase.indexOf("<A HREF="); indexOf3 != -1; indexOf3 = upperCase.indexOf("<A HREF=", i7)) {
                i7 = indexOf3 + 8;
                int i9 = i7 + 1;
                String substring = spannableStringBuilder3.substring(i7, i9);
                if (substring.equals("\"") || substring.equals("'")) {
                    i7 = i9;
                }
                if (substring.equals("\"")) {
                    i8 = spannableStringBuilder3.indexOf("\"", i7);
                } else if (substring.equals("'")) {
                    i8 = spannableStringBuilder3.indexOf("'", i7);
                } else {
                    i8 = spannableStringBuilder3.indexOf(">", i7);
                }
                if (i8 != -1) {
                    this.f18503e = spannableStringBuilder3.substring(i7, i8).trim();
                    i8 = spannableStringBuilder3.indexOf(">", i8);
                    if (i8 != -1) {
                        int indexOf4 = upperCase.indexOf("</A>", i8);
                        if (indexOf4 == -1) {
                            indexOf4 = Integer.MAX_VALUE;
                        }
                        int indexOf5 = upperCase.indexOf("</ A>", i8);
                        if (indexOf5 == -1) {
                            indexOf5 = Integer.MAX_VALUE;
                        }
                        if (indexOf4 == -1 && indexOf5 == -1) {
                            i7 = i8;
                        } else {
                            int min = Math.min(indexOf4, indexOf5);
                            int indexOf6 = spannableStringBuilder3.indexOf(">", min);
                            spannableStringBuilder.setSpan(new ClickableSpan() {

                                /* renamed from: a */
                                String f18534a = t_and.this.f18503e;

                                public void onClick(View view) {
                                    t_and.this.m23999a(this.f18534a);
                                }
                            }, i8, min, 33);
                            int i10 = indexOf6 + 1;
                            spannableStringBuilder.delete(min, i10);
                            int i11 = min - (i10 - min);
                            int i12 = i8 + 1;
                            spannableStringBuilder.delete(indexOf3, i12);
                            int i13 = i11 - (i12 - indexOf3);
                            String spannableStringBuilder4 = spannableStringBuilder.toString();
                            i7 = i8;
                            i8 = i13;
                            spannableStringBuilder3 = spannableStringBuilder4;
                            upperCase = spannableStringBuilder4.toUpperCase();
                        }
                    }
                }
                if (i8 != -1) {
                    i7 = i8;
                }
            }
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        } else if (i5 == 1) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            textView.setText(spannableString);
        } else {
            textView.setText(str);
        }
        if (i6 != 0) {
            textView.setTextSize(0, textView.getTextSize() + ((float) (i6 * 2)));
        }
    }

    public void onClick(View view) {
        if ((this.f18499a.f17986cO == null || this.f18499a.f17986cO.equals("")) && ((this.f18499a.f17985cN == null || this.f18499a.f17985cN.equals("")) && ((this.f18499a.f17988cQ == null || this.f18499a.f17988cQ.equals("")) && (this.f18499a.f17989cR == null || this.f18499a.f17989cR.equals(""))))) {
            abrir_secc(view);
            return;
        }
        if (this.f18499a.f17986cO != null && !this.f18499a.f17986cO.equals("")) {
            this.f18519u = new RewardedVideo((Context) this, this.f18499a.f17986cO);
        }
        if (this.f18499a.f17985cN != null && !this.f18499a.f17985cN.equals("")) {
            this.f18518t = C2997g.m10716a(this);
        }
        if (this.f18499a.f17988cQ != null && !this.f18499a.f17988cQ.equals("")) {
            this.f18520v = new RewardedVideoAd(this, this.f18499a.f17988cQ);
        }
        if (this.f18499a.f17989cR != null && !this.f18499a.f17989cR.equals("")) {
            this.f18521w = new StartAppAd(this);
        }
        this.f18495A = new ProgressDialog(this);
        this.f18524z = view;
        this.f18508j = -1;
        if (!this.f18499a.mo20774a((Context) this, view, this.f18504f, this.f18495A, this.f18518t, this.f18519u, this.f18520v, this.f18521w)) {
            abrir_secc(view);
        }
    }

    public void abrir_secc(View view) {
        if (view != null) {
            C5662h a = this.f18499a.mo20761a(view, (Context) this);
            if (a.f18227b) {
                this.f18500b = true;
                Intent intent = new Intent();
                intent.putExtra("finalizar", true);
                intent.putExtra("finalizar_app", a.f18228c);
                setResult(-1, intent);
            }
            if (a.f18229d) {
                startActivityForResult(a.f18226a, 0);
            } else if (a.f18226a != null) {
                if (a.f18227b && this.f18499a.f18045dm != 2) {
                    a.f18226a.putExtra("es_root", true);
                }
                this.f18502d = false;
                startActivity(a.f18226a);
            }
            if (this.f18500b && !this.f18523y) {
                finish();
            }
        } else if (this.f18508j != -1) {
            mo20970b(this.f18508j);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f18502d = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo20971f() {
        int b = this.f18499a.mo20778b((Context) this);
        if (this.f18499a.f18045dm == 1) {
            this.f18496B = (ListView) findViewById(R.id.left_drawer);
            this.f18499a.mo20771a(this.f18496B);
        } else if (this.f18499a.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f18499a.f17971bz.length; i2++) {
                if (!this.f18499a.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f18499a.f17923bD.length; i3++) {
            if (this.f18499a.f17923bD[i3] > 0) {
                findViewById(this.f18499a.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("es_root", this.f18502d);
    }

    public void onStop() {
        super.onStop();
        if (this.f18500b && !this.f18523y) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f18499a.f18013cx == 0 || this.f18517s == null || this.f18517s.f17768a == null)) {
            this.f18517s.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f18499a.f18013cx != 0 && this.f18517s != null && this.f18517s.f17768a != null) {
            this.f18517s.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f18499a.f18013cx == 0 || this.f18517s == null || this.f18517s.f17768a == null)) {
            this.f18517s.f17768a.mo12168c();
        }
        if (!(this.f18499a.f18013cx == 0 || this.f18517s == null || this.f18517s.f17769b == null)) {
            this.f18517s.f17769b.destroy();
        }
        if ((this.f18502d && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public boolean onSearchRequested() {
        if (this.f18499a.f18080q == 0) {
            return false;
        }
        this.f18500b = true;
        this.f18523y = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onBackPressed() {
        if (!this.f18502d || this.f18501c || !this.f18499a.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f18501c = true;
        config.m23859l(this);
    }

    public void adLoaded(String str) {
        this.f18495A.cancel();
        this.f18519u.showAd();
    }

    public void onAdClosed() {
        if (this.f18522x) {
            abrir_secc(this.f18524z);
        }
    }

    public void adError(String str) {
        this.f18495A.cancel();
        abrir_secc(this.f18524z);
    }

    public void videoEnded() {
        this.f18522x = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f18495A.cancel();
        this.f18518t.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f18522x = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f18522x) {
            abrir_secc(this.f18524z);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f18522x = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f18499a.mo20775a((Context) this, this.f18519u)) {
            this.f18495A.cancel();
            abrir_secc(this.f18524z);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f18495A.cancel();
        abrir_secc(this.f18524z);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f18495A.cancel();
        this.f18520v.show();
    }

    public void onRewardedVideoCompleted() {
        this.f18522x = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f18522x) {
            abrir_secc(this.f18524z);
        }
    }

    public void onVideoCompleted() {
        this.f18522x = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f18495A.cancel();
        this.f18521w.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_and.this.f18522x) {
                    t_and.this.abrir_secc(t_and.this.f18524z);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f18495A.cancel();
        abrir_secc(this.f18524z);
    }
}
