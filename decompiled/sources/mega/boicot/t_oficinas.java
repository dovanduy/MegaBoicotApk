package mega.boicot;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
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

public class t_oficinas extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: a */
    config f19170a;

    /* renamed from: b */
    boolean f19171b = false;

    /* renamed from: c */
    boolean f19172c = false;

    /* renamed from: d */
    boolean f19173d;

    /* renamed from: e */
    Bitmap f19174e;

    /* renamed from: f */
    ImageView[] f19175f;

    /* renamed from: g */
    ProgressBar[] f19176g;

    /* renamed from: h */
    int[] f19177h;

    /* renamed from: i */
    int[][] f19178i;

    /* renamed from: j */
    int f19179j;

    /* renamed from: k */
    int f19180k;

    /* renamed from: l */
    Bundle f19181l;

    /* renamed from: m */
    C5661g f19182m;

    /* renamed from: n */
    File f19183n;

    /* renamed from: o */
    String f19184o;

    /* renamed from: p */
    C3166b f19185p;

    /* renamed from: q */
    RewardedVideo f19186q;

    /* renamed from: r */
    RewardedVideoAd f19187r;

    /* renamed from: s */
    StartAppAd f19188s;

    /* renamed from: t */
    boolean f19189t = false;

    /* renamed from: u */
    boolean f19190u = false;

    /* renamed from: v */
    View f19191v;

    /* renamed from: w */
    ProgressDialog f19192w;

    /* renamed from: x */
    ListView f19193x;

    /* renamed from: y */
    private C5602c f19194y;

    /* renamed from: mega.boicot.t_oficinas$a */
    private class C5860a extends AsyncTask<String, Void, Byte> {
        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }

        private C5860a() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0087, code lost:
            return java.lang.Byte.valueOf(-1);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0083 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Byte doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = -1
                java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x008d }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x008d }
                r1.<init>()     // Catch:{ MalformedURLException -> 0x008d }
                java.lang.String r2 = "http://imgs1.e-droid.net/srv/imgs/ofics/f"
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x008d }
                mega.boicot.t_oficinas r2 = mega.boicot.t_oficinas.this     // Catch:{ MalformedURLException -> 0x008d }
                int[] r2 = r2.f19177h     // Catch:{ MalformedURLException -> 0x008d }
                mega.boicot.t_oficinas r3 = mega.boicot.t_oficinas.this     // Catch:{ MalformedURLException -> 0x008d }
                int r3 = r3.f19179j     // Catch:{ MalformedURLException -> 0x008d }
                r2 = r2[r3]     // Catch:{ MalformedURLException -> 0x008d }
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x008d }
                java.lang.String r2 = ".png"
                r1.append(r2)     // Catch:{ MalformedURLException -> 0x008d }
                java.lang.String r1 = r1.toString()     // Catch:{ MalformedURLException -> 0x008d }
                r0.<init>(r1)     // Catch:{ MalformedURLException -> 0x008d }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x0088 }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x0088 }
                r1 = 1
                r0.setDoInput(r1)     // Catch:{ IOException -> 0x0088 }
                r1 = 5000(0x1388, float:7.006E-42)
                r0.setConnectTimeout(r1)     // Catch:{ IOException -> 0x0088 }
                r1 = 7000(0x1b58, float:9.809E-42)
                r0.setReadTimeout(r1)     // Catch:{ IOException -> 0x0088 }
                r0.connect()     // Catch:{ IOException -> 0x0088 }
                java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0088 }
                mega.boicot.t_oficinas r1 = mega.boicot.t_oficinas.this     // Catch:{ IOException -> 0x0088 }
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch:{ IOException -> 0x0088 }
                r1.f19174e = r0     // Catch:{ IOException -> 0x0088 }
                mega.boicot.t_oficinas r0 = mega.boicot.t_oficinas.this     // Catch:{ Exception -> 0x0083 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0083 }
                r1.<init>()     // Catch:{ Exception -> 0x0083 }
                java.lang.String r2 = "o_f"
                r1.append(r2)     // Catch:{ Exception -> 0x0083 }
                mega.boicot.t_oficinas r2 = mega.boicot.t_oficinas.this     // Catch:{ Exception -> 0x0083 }
                int[] r2 = r2.f19177h     // Catch:{ Exception -> 0x0083 }
                mega.boicot.t_oficinas r3 = mega.boicot.t_oficinas.this     // Catch:{ Exception -> 0x0083 }
                int r3 = r3.f19179j     // Catch:{ Exception -> 0x0083 }
                r2 = r2[r3]     // Catch:{ Exception -> 0x0083 }
                r1.append(r2)     // Catch:{ Exception -> 0x0083 }
                java.lang.String r2 = ".png"
                r1.append(r2)     // Catch:{ Exception -> 0x0083 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0083 }
                r2 = 0
                java.io.FileOutputStream r0 = r0.openFileOutput(r1, r2)     // Catch:{ Exception -> 0x0083 }
                mega.boicot.t_oficinas r1 = mega.boicot.t_oficinas.this     // Catch:{ Exception -> 0x0083 }
                android.graphics.Bitmap r1 = r1.f19174e     // Catch:{ Exception -> 0x0083 }
                android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x0083 }
                r4 = 100
                r1.compress(r3, r4, r0)     // Catch:{ Exception -> 0x0083 }
                r0.close()     // Catch:{ Exception -> 0x0083 }
                java.lang.Byte r6 = java.lang.Byte.valueOf(r2)
                return r6
            L_0x0083:
                java.lang.Byte r0 = java.lang.Byte.valueOf(r6)     // Catch:{ IOException -> 0x0088 }
                return r0
            L_0x0088:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            L_0x008d:
                java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_oficinas.C5860a.doInBackground(java.lang.String[]):java.lang.Byte");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Byte b) {
            if (b.byteValue() == 0) {
                t_oficinas.this.f19175f[t_oficinas.this.f19179j].setImageBitmap(t_oficinas.this.f19174e);
                t_oficinas.this.f19176g[t_oficinas.this.f19179j].setVisibility(8);
                t_oficinas.this.f19175f[t_oficinas.this.f19179j].setVisibility(0);
                Editor edit = t_oficinas.this.getSharedPreferences("sh", 0).edit();
                StringBuilder sb = new StringBuilder();
                sb.append("o_f");
                sb.append(t_oficinas.this.f19177h[t_oficinas.this.f19179j]);
                sb.append("_modif");
                edit.putBoolean(sb.toString(), false);
                edit.commit();
                int i = t_oficinas.this.f19178i[t_oficinas.this.f19179j][0];
                int i2 = t_oficinas.this.f19178i[t_oficinas.this.f19179j][1];
                if (i2 == 1) {
                    t_oficinas.this.f19170a.f17921bB[i].f18220u = false;
                } else if (i2 == 2) {
                    t_oficinas.this.f19170a.f17921bB[i].f18221v = false;
                } else if (i2 == 3) {
                    t_oficinas.this.f19170a.f17921bB[i].f18222w = false;
                } else if (i2 == 4) {
                    t_oficinas.this.f19170a.f17921bB[i].f18223x = false;
                }
            }
            t_oficinas.this.f19179j++;
            if (t_oficinas.this.f19179j < t_oficinas.this.f19180k) {
                new C5860a().execute(new String[0]);
            }
        }
    }

    /* renamed from: mega.boicot.t_oficinas$b */
    private class C5861b {

        /* renamed from: a */
        int f19209a;

        /* renamed from: b */
        int f19210b;

        /* renamed from: c */
        int f19211c;

        /* renamed from: d */
        String f19212d;

        /* renamed from: e */
        String f19213e;

        /* renamed from: f */
        String f19214f;

        /* renamed from: g */
        String f19215g;

        /* renamed from: h */
        String f19216h;

        /* renamed from: i */
        String f19217i;

        private C5861b() {
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

    /* JADX WARNING: Removed duplicated region for block: B:207:0x09e4  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0adb  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0bc9  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0cb7  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0da0  */
    @android.annotation.TargetApi(21)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.content.Context r2 = r17.getApplicationContext()
            mega.boicot.config r2 = (mega.boicot.config) r2
            r0.f19170a = r2
            mega.boicot.config r2 = r0.f19170a
            java.lang.String r2 = r2.f17881aN
            if (r2 != 0) goto L_0x0017
            mega.boicot.config r2 = r0.f19170a
            r2.mo20780b()
        L_0x0017:
            java.lang.String r2 = "FFFFFFFF"
            mega.boicot.config r3 = r0.f19170a
            java.lang.String r3 = r3.f17949bd
            java.lang.String r2 = mega.boicot.config.m23831a(r2, r3)
            r0.f19184o = r2
            android.content.Intent r2 = r17.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            r0.f19181l = r2
            r3 = 0
            if (r1 != 0) goto L_0x004e
            android.os.Bundle r4 = r0.f19181l
            if (r4 == 0) goto L_0x004a
            android.os.Bundle r4 = r0.f19181l
            java.lang.String r5 = "es_root"
            boolean r4 = r4.containsKey(r5)
            if (r4 == 0) goto L_0x004a
            android.os.Bundle r4 = r0.f19181l
            java.lang.String r5 = "es_root"
            boolean r4 = r4.getBoolean(r5, r3)
            if (r4 == 0) goto L_0x004a
            r4 = 1
            goto L_0x004b
        L_0x004a:
            r4 = r3
        L_0x004b:
            r0.f19173d = r4
            goto L_0x0063
        L_0x004e:
            java.lang.String r4 = "es_root"
            boolean r4 = r1.containsKey(r4)
            if (r4 == 0) goto L_0x0060
            java.lang.String r4 = "es_root"
            boolean r4 = r1.getBoolean(r4, r3)
            if (r4 == 0) goto L_0x0060
            r4 = 1
            goto L_0x0061
        L_0x0060:
            r4 = r3
        L_0x0061:
            r0.f19173d = r4
        L_0x0063:
            super.onCreate(r18)
            r4 = 2131361952(0x7f0a00a0, float:1.834367E38)
            r0.setContentView(r4)
            r17.mo21295f()
            mega.boicot.config r4 = r0.f19170a
            int r4 = r4.f18080q
            if (r4 <= 0) goto L_0x008d
            java.lang.String r4 = "search"
            java.lang.Object r4 = r0.getSystemService(r4)
            android.app.SearchManager r4 = (android.app.SearchManager) r4
            mega.boicot.t_oficinas$1 r5 = new mega.boicot.t_oficinas$1
            r5.<init>()
            r4.setOnCancelListener(r5)
            mega.boicot.t_oficinas$2 r5 = new mega.boicot.t_oficinas$2
            r5.<init>()
            r4.setOnDismissListener(r5)
        L_0x008d:
            mega.boicot.config r4 = r0.f19170a
            int r4 = r4.f18080q
            if (r4 <= 0) goto L_0x00ab
            java.lang.String r4 = "search"
            java.lang.Object r4 = r0.getSystemService(r4)
            android.app.SearchManager r4 = (android.app.SearchManager) r4
            mega.boicot.t_oficinas$3 r5 = new mega.boicot.t_oficinas$3
            r5.<init>()
            r4.setOnCancelListener(r5)
            mega.boicot.t_oficinas$4 r5 = new mega.boicot.t_oficinas$4
            r5.<init>()
            r4.setOnDismissListener(r5)
        L_0x00ab:
            if (r1 != 0) goto L_0x00d4
            mega.boicot.config r4 = r0.f19170a
            android.os.Bundle r5 = r0.f19181l
            if (r5 == 0) goto L_0x00bf
            android.os.Bundle r5 = r0.f19181l
            java.lang.String r6 = "ad_entrar"
            boolean r5 = r5.containsKey(r6)
            if (r5 == 0) goto L_0x00bf
            r5 = 1
            goto L_0x00c0
        L_0x00bf:
            r5 = r3
        L_0x00c0:
            android.os.Bundle r6 = r0.f19181l
            if (r6 == 0) goto L_0x00d0
            android.os.Bundle r6 = r0.f19181l
            java.lang.String r7 = "fb_entrar"
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto L_0x00d0
            r6 = 1
            goto L_0x00d1
        L_0x00d0:
            r6 = r3
        L_0x00d1:
            r4.mo20770a(r0, r5, r6)
        L_0x00d4:
            mega.boicot.config r4 = r0.f19170a
            mega.boicot.c r4 = r4.mo20760a(r0, r3)
            r0.f19194y = r4
            mega.boicot.config r4 = r0.f19170a
            mega.boicot.config r5 = r0.f19170a
            int r5 = r5.f18075l
            java.lang.String r6 = r0.f19184o
            r4.mo20767a(r0, r5, r6, r1)
            r1 = 2131231218(0x7f0801f2, float:1.807851E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            android.view.WindowManager r4 = r17.getWindowManager()
            android.view.Display r4 = r4.getDefaultDisplay()
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 13
            if (r5 < r6) goto L_0x0109
            android.graphics.Point r5 = new android.graphics.Point
            r5.<init>()
            r4.getSize(r5)
            int r4 = r5.x
            goto L_0x010d
        L_0x0109:
            int r4 = r4.getWidth()
        L_0x010d:
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r17)
            r0.f19180k = r3
            mega.boicot.config r6 = r0.f19170a
            mega.boicot.g[] r6 = r6.f17921bB
            r7 = 2
            r8 = 4
            int r6 = r6.length
            int r6 = r6 * r8
            int[] r6 = new int[r6]
            r0.f19177h = r6
            mega.boicot.config r6 = r0.f19170a
            mega.boicot.g[] r6 = r6.f17921bB
            int r6 = r6.length
            int r6 = r6 * r8
            android.widget.ImageView[] r6 = new android.widget.ImageView[r6]
            r0.f19175f = r6
            mega.boicot.config r6 = r0.f19170a
            mega.boicot.g[] r6 = r6.f17921bB
            int r6 = r6.length
            int r6 = r6 * r8
            android.widget.ProgressBar[] r6 = new android.widget.ProgressBar[r6]
            r0.f19176g = r6
            mega.boicot.config r6 = r0.f19170a
            mega.boicot.g[] r6 = r6.f17921bB
            int r6 = r6.length
            int r6 = r6 * r8
            int[] r6 = new int[]{r6, r7}
            java.lang.Class<int> r9 = int.class
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r9, r6)
            int[][] r6 = (int[][]) r6
            r0.f19178i = r6
            r6 = r3
        L_0x0148:
            mega.boicot.config r9 = r0.f19170a
            mega.boicot.g[] r9 = r9.f17921bB
            r10 = 0
            int r9 = r9.length
            if (r6 >= r9) goto L_0x0e24
            mega.boicot.config r9 = r0.f19170a
            mega.boicot.g[] r9 = r9.f17921bB
            r9 = r9[r6]
            r0.f19182m = r9
            android.content.res.Resources r9 = r17.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            r11 = 1140457472(0x43fa0000, float:500.0)
            float r9 = r9 * r11
            r12 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r12
            int r9 = (int) r9
            if (r4 >= r9) goto L_0x0173
            r9 = 2131361951(0x7f0a009f, float:1.8343669E38)
            android.view.View r9 = r5.inflate(r9, r10)
            goto L_0x017a
        L_0x0173:
            r9 = 2131361950(0x7f0a009e, float:1.8343667E38)
            android.view.View r9 = r5.inflate(r9, r10)
        L_0x017a:
            r13 = 2131231612(0x7f08037c, float:1.807931E38)
            android.view.View r13 = r9.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            mega.boicot.config r14 = r0.f19170a
            java.lang.String r14 = r14.f17892aY
            java.lang.String r15 = ""
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x01ab
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "#"
            r14.append(r15)
            mega.boicot.config r15 = r0.f19170a
            java.lang.String r15 = r15.f17892aY
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            int r14 = android.graphics.Color.parseColor(r14)
            r13.setTextColor(r14)
        L_0x01ab:
            mega.boicot.g r14 = r0.f19182m
            java.lang.String r14 = r14.f18200a
            r13.setText(r14)
            mega.boicot.config r13 = r0.f19170a
            java.lang.String r13 = r13.f17893aZ
            java.lang.String r14 = ""
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x01e1
            r13 = 2131231636(0x7f080394, float:1.8079359E38)
            android.view.View r13 = r9.findViewById(r13)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "#"
            r14.append(r15)
            mega.boicot.config r15 = r0.f19170a
            java.lang.String r15 = r15.f17893aZ
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            int r14 = android.graphics.Color.parseColor(r14)
            r13.setBackgroundColor(r14)
        L_0x01e1:
            mega.boicot.config r13 = r0.f19170a
            java.lang.String r13 = r13.f17946ba
            java.lang.String r14 = ""
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0222
            android.content.res.Resources r13 = r17.getResources()
            r14 = 2131165486(0x7f07012e, float:1.794519E38)
            android.graphics.drawable.Drawable r13 = r13.getDrawable(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "#"
            r14.append(r15)
            mega.boicot.config r15 = r0.f19170a
            java.lang.String r15 = r15.f17946ba
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            int r14 = android.graphics.Color.parseColor(r14)
            android.graphics.PorterDuff$Mode r15 = android.graphics.PorterDuff.Mode.MULTIPLY
            r13.setColorFilter(r14, r15)
            r14 = 2131231004(0x7f08011c, float:1.8078077E38)
            android.view.View r14 = r9.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r14.setImageDrawable(r13)
        L_0x0222:
            mega.boicot.g r13 = r0.f19182m
            java.lang.String r13 = r13.f18206g
            java.lang.String r14 = ""
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x026b
            r13 = 2131231552(0x7f080340, float:1.8079188E38)
            android.view.View r13 = r9.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            mega.boicot.config r14 = r0.f19170a
            java.lang.String r14 = r14.f17947bb
            java.lang.String r15 = ""
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x025f
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "#"
            r14.append(r15)
            mega.boicot.config r15 = r0.f19170a
            java.lang.String r15 = r15.f17947bb
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            int r14 = android.graphics.Color.parseColor(r14)
            r13.setTextColor(r14)
        L_0x025f:
            mega.boicot.g r14 = r0.f19182m
            java.lang.String r14 = r14.f18206g
            r13.setText(r14)
            r13.setVisibility(r3)
            r13 = 1
            goto L_0x026c
        L_0x026b:
            r13 = r3
        L_0x026c:
            mega.boicot.g r14 = r0.f19182m
            java.lang.String r14 = r14.f18207h
            java.lang.String r15 = ""
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x02b4
            r13 = 2131231553(0x7f080341, float:1.807919E38)
            android.view.View r13 = r9.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            mega.boicot.config r14 = r0.f19170a
            java.lang.String r14 = r14.f17947bb
            java.lang.String r15 = ""
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x02a9
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "#"
            r14.append(r15)
            mega.boicot.config r15 = r0.f19170a
            java.lang.String r15 = r15.f17947bb
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            int r14 = android.graphics.Color.parseColor(r14)
            r13.setTextColor(r14)
        L_0x02a9:
            mega.boicot.g r14 = r0.f19182m
            java.lang.String r14 = r14.f18207h
            r13.setText(r14)
            r13.setVisibility(r3)
            r13 = 1
        L_0x02b4:
            java.lang.String r14 = ""
            mega.boicot.g r15 = r0.f19182m
            java.lang.String r15 = r15.f18208i
            java.lang.String r8 = ""
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x02c6
            mega.boicot.g r8 = r0.f19182m
            java.lang.String r14 = r8.f18208i
        L_0x02c6:
            mega.boicot.g r8 = r0.f19182m
            java.lang.String r8 = r8.f18209j
            java.lang.String r15 = ""
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x02fe
            java.lang.String r8 = ""
            boolean r8 = r14.equals(r8)
            if (r8 != 0) goto L_0x02eb
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            java.lang.String r14 = " "
            r8.append(r14)
            java.lang.String r14 = r8.toString()
        L_0x02eb:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            mega.boicot.g r14 = r0.f19182m
            java.lang.String r14 = r14.f18209j
            r8.append(r14)
            java.lang.String r14 = r8.toString()
        L_0x02fe:
            java.lang.String r8 = ""
            boolean r8 = r14.equals(r8)
            if (r8 != 0) goto L_0x033e
            r8 = 2131231544(0x7f080338, float:1.8079172E38)
            android.view.View r8 = r9.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            mega.boicot.config r13 = r0.f19170a
            java.lang.String r13 = r13.f17947bb
            java.lang.String r15 = ""
            boolean r13 = r13.equals(r15)
            if (r13 != 0) goto L_0x0337
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "#"
            r13.append(r15)
            mega.boicot.config r15 = r0.f19170a
            java.lang.String r15 = r15.f17947bb
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            int r13 = android.graphics.Color.parseColor(r13)
            r8.setTextColor(r13)
        L_0x0337:
            r8.setText(r14)
            r8.setVisibility(r3)
            r13 = 1
        L_0x033e:
            mega.boicot.g r8 = r0.f19182m
            java.lang.String r8 = r8.f18210k
            java.lang.String r14 = ""
            boolean r8 = r8.equals(r14)
            if (r8 != 0) goto L_0x0386
            r8 = 2131231601(0x7f080371, float:1.8079288E38)
            android.view.View r8 = r9.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            mega.boicot.config r13 = r0.f19170a
            java.lang.String r13 = r13.f17947bb
            java.lang.String r14 = ""
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x037b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "#"
            r13.append(r14)
            mega.boicot.config r14 = r0.f19170a
            java.lang.String r14 = r14.f17947bb
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            int r13 = android.graphics.Color.parseColor(r13)
            r8.setTextColor(r13)
        L_0x037b:
            mega.boicot.g r13 = r0.f19182m
            java.lang.String r13 = r13.f18210k
            r8.setText(r13)
            r8.setVisibility(r3)
            r13 = 1
        L_0x0386:
            mega.boicot.g r8 = r0.f19182m
            java.lang.String r8 = r8.f18201b
            java.lang.String r14 = ""
            boolean r8 = r8.equals(r14)
            r14 = 2131165554(0x7f070172, float:1.7945328E38)
            r15 = 2131165477(0x7f070125, float:1.7945172E38)
            if (r8 != 0) goto L_0x045f
            r8 = 2131231609(0x7f080379, float:1.8079304E38)
            android.view.View r8 = r9.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            mega.boicot.config r7 = r0.f19170a
            java.lang.String r7 = r7.f17947bb
            java.lang.String r2 = ""
            boolean r2 = r7.equals(r2)
            if (r2 != 0) goto L_0x03c9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "#"
            r2.append(r7)
            mega.boicot.config r7 = r0.f19170a
            java.lang.String r7 = r7.f17947bb
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            int r2 = android.graphics.Color.parseColor(r2)
            r8.setTextColor(r2)
        L_0x03c9:
            mega.boicot.g r2 = r0.f19182m
            java.lang.String r2 = r2.f18201b
            r8.setText(r2)
            mega.boicot.config r2 = r0.f19170a
            java.lang.String r2 = r2.f17948bc
            java.lang.String r7 = ""
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x040e
            android.content.res.Resources r2 = r17.getResources()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r14)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19170a
            java.lang.String r8 = r8.f17948bc
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.MULTIPLY
            r2.setColorFilter(r7, r8)
            r7 = 2131231124(0x7f080194, float:1.807832E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r7.setImageDrawable(r2)
        L_0x040e:
            mega.boicot.config r2 = r0.f19170a
            java.lang.String r2 = r2.f17949bd
            java.lang.String r7 = ""
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x044c
            android.content.res.Resources r2 = r17.getResources()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r15)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19170a
            java.lang.String r8 = r8.f17949bd
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.MULTIPLY
            r2.setColorFilter(r7, r8)
            r7 = 2131231125(0x7f080195, float:1.8078322E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r7.setImageDrawable(r2)
        L_0x044c:
            r2 = 2131231225(0x7f0801f9, float:1.8078525E38)
            android.view.View r7 = r9.findViewById(r2)
            r7.setOnClickListener(r0)
            android.view.View r2 = r9.findViewById(r2)
            r2.setVisibility(r3)
            r2 = 1
            goto L_0x0460
        L_0x045f:
            r2 = r3
        L_0x0460:
            mega.boicot.g r7 = r0.f19182m
            java.lang.String r7 = r7.f18202c
            java.lang.String r8 = ""
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0532
            r2 = 2131231610(0x7f08037a, float:1.8079306E38)
            android.view.View r2 = r9.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            mega.boicot.config r7 = r0.f19170a
            java.lang.String r7 = r7.f17947bb
            java.lang.String r8 = ""
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x049d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19170a
            java.lang.String r8 = r8.f17947bb
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            r2.setTextColor(r7)
        L_0x049d:
            mega.boicot.g r7 = r0.f19182m
            java.lang.String r7 = r7.f18202c
            r2.setText(r7)
            mega.boicot.config r2 = r0.f19170a
            java.lang.String r2 = r2.f17948bc
            java.lang.String r7 = ""
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x04e2
            android.content.res.Resources r2 = r17.getResources()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r14)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19170a
            java.lang.String r8 = r8.f17948bc
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.MULTIPLY
            r2.setColorFilter(r7, r8)
            r7 = 2131231126(0x7f080196, float:1.8078324E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r7.setImageDrawable(r2)
        L_0x04e2:
            mega.boicot.config r2 = r0.f19170a
            java.lang.String r2 = r2.f17949bd
            java.lang.String r7 = ""
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0520
            android.content.res.Resources r2 = r17.getResources()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r15)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19170a
            java.lang.String r8 = r8.f17949bd
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.MULTIPLY
            r2.setColorFilter(r7, r8)
            r7 = 2131231127(0x7f080197, float:1.8078326E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r7.setImageDrawable(r2)
        L_0x0520:
            r2 = 2131231226(0x7f0801fa, float:1.8078527E38)
            android.view.View r7 = r9.findViewById(r2)
            r7.setOnClickListener(r0)
            android.view.View r2 = r9.findViewById(r2)
            r2.setVisibility(r3)
            r2 = 1
        L_0x0532:
            mega.boicot.g r7 = r0.f19182m
            java.lang.String r7 = r7.f18203d
            java.lang.String r8 = ""
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x05e3
            r2 = 2131231569(0x7f080351, float:1.8079223E38)
            android.view.View r2 = r9.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            mega.boicot.config r7 = r0.f19170a
            java.lang.String r7 = r7.f17947bb
            java.lang.String r8 = ""
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x056f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19170a
            java.lang.String r8 = r8.f17947bb
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            r2.setTextColor(r7)
        L_0x056f:
            mega.boicot.g r7 = r0.f19182m
            java.lang.String r7 = r7.f18203d
            r2.setText(r7)
            mega.boicot.config r2 = r0.f19170a
            java.lang.String r2 = r2.f17948bc
            java.lang.String r7 = ""
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x05d8
            mega.boicot.config r2 = r0.f19170a
            java.lang.String r2 = r2.f17948bc
            java.lang.String r7 = "FF000000"
            boolean r2 = r2.equals(r7)
            r7 = 2131231090(0x7f080172, float:1.8078251E38)
            if (r2 == 0) goto L_0x05a6
            android.view.View r2 = r9.findViewById(r7)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.res.Resources r7 = r17.getResources()
            r8 = 2131165525(0x7f070155, float:1.794527E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r8)
            r2.setImageDrawable(r7)
            goto L_0x05d8
        L_0x05a6:
            android.content.res.Resources r2 = r17.getResources()
            r8 = 2131165524(0x7f070154, float:1.7945268E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r14 = "#"
            r8.append(r14)
            mega.boicot.config r14 = r0.f19170a
            java.lang.String r14 = r14.f17948bc
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            android.graphics.PorterDuff$Mode r14 = android.graphics.PorterDuff.Mode.MULTIPLY
            r2.setColorFilter(r8, r14)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r7.setImageDrawable(r2)
        L_0x05d8:
            r2 = 2131231198(0x7f0801de, float:1.807847E38)
            android.view.View r2 = r9.findViewById(r2)
            r2.setVisibility(r3)
            r2 = 1
        L_0x05e3:
            mega.boicot.g r7 = r0.f19182m
            boolean r7 = r7.f18225z
            if (r7 == 0) goto L_0x06ba
            r2 = 2131231535(0x7f08032f, float:1.8079154E38)
            android.view.View r2 = r9.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            mega.boicot.config r7 = r0.f19170a
            java.lang.String r7 = r7.f17947bb
            java.lang.String r8 = ""
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x061a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19170a
            java.lang.String r8 = r8.f17947bb
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            r2.setTextColor(r7)
        L_0x061a:
            mega.boicot.config r2 = r0.f19170a
            java.lang.String r2 = r2.f17948bc
            java.lang.String r7 = ""
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x065b
            android.content.res.Resources r2 = r17.getResources()
            r7 = 2131165338(0x7f07009a, float:1.794489E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19170a
            java.lang.String r8 = r8.f17948bc
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.MULTIPLY
            r2.setColorFilter(r7, r8)
            r7 = 2131231064(0x7f080158, float:1.8078198E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r7.setImageDrawable(r2)
        L_0x065b:
            mega.boicot.config r2 = r0.f19170a
            java.lang.String r2 = r2.f17949bd
            java.lang.String r7 = ""
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0699
            android.content.res.Resources r2 = r17.getResources()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r15)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19170a
            java.lang.String r8 = r8.f17949bd
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.MULTIPLY
            r2.setColorFilter(r7, r8)
            r7 = 2131231063(0x7f080157, float:1.8078196E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r7.setImageDrawable(r2)
        L_0x0699:
            r2 = 2131231172(0x7f0801c4, float:1.8078418E38)
            android.view.View r7 = r9.findViewById(r2)
            mega.boicot.g r8 = r0.f19182m
            int r8 = r8.f18211l
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.setTag(r8)
            android.view.View r7 = r9.findViewById(r2)
            r7.setOnClickListener(r0)
            android.view.View r2 = r9.findViewById(r2)
            r2.setVisibility(r3)
            r2 = 1
        L_0x06ba:
            mega.boicot.g r7 = r0.f19182m
            boolean r7 = r7.f18224y
            if (r7 == 0) goto L_0x07d7
            r2 = 2131231554(0x7f080342, float:1.8079192E38)
            android.view.View r2 = r9.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            mega.boicot.config r7 = r0.f19170a
            java.lang.String r7 = r7.f17947bb
            java.lang.String r8 = ""
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x06f1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19170a
            java.lang.String r8 = r8.f17947bb
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            r2.setTextColor(r7)
        L_0x06f1:
            mega.boicot.g r7 = r0.f19182m
            java.lang.String r7 = r7.f18204e
            java.lang.String r8 = ""
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0705
            mega.boicot.g r7 = r0.f19182m
            java.lang.String r7 = r7.f18204e
            r2.setText(r7)
            goto L_0x0713
        L_0x0705:
            android.content.res.Resources r7 = r17.getResources()
            r8 = 2131558575(0x7f0d00af, float:1.874247E38)
            java.lang.String r7 = r7.getString(r8)
            r2.setText(r7)
        L_0x0713:
            mega.boicot.config r2 = r0.f19170a
            java.lang.String r2 = r2.f17948bc
            java.lang.String r7 = ""
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0778
            mega.boicot.config r2 = r0.f19170a
            java.lang.String r2 = r2.f17948bc
            java.lang.String r7 = "FF000000"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x0743
            r2 = 2131231069(0x7f08015d, float:1.8078209E38)
            android.view.View r2 = r9.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.res.Resources r7 = r17.getResources()
            r8 = 2131165391(0x7f0700cf, float:1.7944998E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r8)
            r2.setImageDrawable(r7)
            goto L_0x0778
        L_0x0743:
            android.content.res.Resources r2 = r17.getResources()
            r7 = 2131165389(0x7f0700cd, float:1.7944994E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19170a
            java.lang.String r8 = r8.f17948bc
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.MULTIPLY
            r2.setColorFilter(r7, r8)
            r7 = 2131231069(0x7f08015d, float:1.8078209E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r7.setImageDrawable(r2)
        L_0x0778:
            mega.boicot.config r2 = r0.f19170a
            java.lang.String r2 = r2.f17949bd
            java.lang.String r7 = ""
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x07b6
            android.content.res.Resources r2 = r17.getResources()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r15)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19170a
            java.lang.String r8 = r8.f17949bd
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.MULTIPLY
            r2.setColorFilter(r7, r8)
            r7 = 2131231070(0x7f08015e, float:1.807821E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r7.setImageDrawable(r2)
        L_0x07b6:
            r2 = 2131231187(0x7f0801d3, float:1.8078448E38)
            android.view.View r7 = r9.findViewById(r2)
            mega.boicot.g r8 = r0.f19182m
            int r8 = r8.f18211l
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.setTag(r8)
            android.view.View r7 = r9.findViewById(r2)
            r7.setOnClickListener(r0)
            android.view.View r2 = r9.findViewById(r2)
            r2.setVisibility(r3)
            r2 = 1
        L_0x07d7:
            mega.boicot.g r7 = r0.f19182m
            java.lang.String r7 = r7.f18205f
            java.lang.String r8 = ""
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x08e1
            r2 = 2131231617(0x7f080381, float:1.807932E38)
            android.view.View r2 = r9.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            mega.boicot.config r7 = r0.f19170a
            java.lang.String r7 = r7.f17947bb
            java.lang.String r8 = ""
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0814
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19170a
            java.lang.String r8 = r8.f17947bb
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            r2.setTextColor(r7)
        L_0x0814:
            mega.boicot.g r7 = r0.f19182m
            java.lang.String r7 = r7.f18205f
            r2.setText(r7)
            mega.boicot.g r7 = r0.f19182m
            boolean r7 = r7.f18199B
            if (r7 == 0) goto L_0x0824
            java.lang.String r7 = "1"
            goto L_0x0826
        L_0x0824:
            java.lang.String r7 = "0"
        L_0x0826:
            r2.setTag(r7)
            mega.boicot.config r2 = r0.f19170a
            java.lang.String r2 = r2.f17948bc
            java.lang.String r7 = ""
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x088e
            mega.boicot.config r2 = r0.f19170a
            java.lang.String r2 = r2.f17948bc
            java.lang.String r7 = "FF000000"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x0859
            r2 = 2131231128(0x7f080198, float:1.8078328E38)
            android.view.View r2 = r9.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.res.Resources r7 = r17.getResources()
            r8 = 2131165561(0x7f070179, float:1.7945343E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r8)
            r2.setImageDrawable(r7)
            goto L_0x088e
        L_0x0859:
            android.content.res.Resources r2 = r17.getResources()
            r7 = 2131165562(0x7f07017a, float:1.7945345E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19170a
            java.lang.String r8 = r8.f17948bc
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.MULTIPLY
            r2.setColorFilter(r7, r8)
            r7 = 2131231128(0x7f080198, float:1.8078328E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r7.setImageDrawable(r2)
        L_0x088e:
            mega.boicot.config r2 = r0.f19170a
            java.lang.String r2 = r2.f17949bd
            java.lang.String r7 = ""
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x08cc
            android.content.res.Resources r2 = r17.getResources()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r15)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19170a
            java.lang.String r8 = r8.f17949bd
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.MULTIPLY
            r2.setColorFilter(r7, r8)
            r7 = 2131231129(0x7f080199, float:1.807833E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r7.setImageDrawable(r2)
        L_0x08cc:
            r2 = 2131231230(0x7f0801fe, float:1.8078535E38)
            android.view.View r2 = r9.findViewById(r2)
            r2.setOnClickListener(r0)
            r2 = 2131231230(0x7f0801fe, float:1.8078535E38)
            android.view.View r2 = r9.findViewById(r2)
            r2.setVisibility(r3)
            r2 = 1
        L_0x08e1:
            mega.boicot.g r7 = r0.f19182m
            int r7 = r7.f18217r
            if (r7 == 0) goto L_0x097d
            r7 = 2131230818(0x7f080062, float:1.80777E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            mega.boicot.t_oficinas$b r8 = new mega.boicot.t_oficinas$b
            r8.<init>()
            mega.boicot.g r10 = r0.f19182m
            int r10 = r10.f18217r
            r8.f19209a = r10
            mega.boicot.g r10 = r0.f19182m
            int r10 = r10.f18218s
            r8.f19210b = r10
            mega.boicot.g r10 = r0.f19182m
            int r10 = r10.f18219t
            r8.f19211c = r10
            mega.boicot.g r10 = r0.f19182m
            java.lang.String r10 = r10.f18200a
            r8.f19212d = r10
            mega.boicot.g r10 = r0.f19182m
            java.lang.String r10 = r10.f18206g
            r8.f19213e = r10
            mega.boicot.g r10 = r0.f19182m
            java.lang.String r10 = r10.f18207h
            r8.f19214f = r10
            mega.boicot.g r10 = r0.f19182m
            java.lang.String r10 = r10.f18208i
            r8.f19215g = r10
            mega.boicot.g r10 = r0.f19182m
            java.lang.String r10 = r10.f18209j
            r8.f19216h = r10
            mega.boicot.g r10 = r0.f19182m
            java.lang.String r10 = r10.f18210k
            r8.f19217i = r10
            mega.boicot.config r10 = r0.f19170a
            java.lang.String r10 = r10.f17949bd
            java.lang.String r13 = ""
            boolean r10 = r10.equals(r13)
            if (r10 != 0) goto L_0x0973
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "#"
            r10.append(r13)
            mega.boicot.config r13 = r0.f19170a
            java.lang.String r13 = r13.f17949bd
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            int r10 = android.graphics.Color.parseColor(r10)
            r7.setBackgroundColor(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "#"
            r10.append(r13)
            mega.boicot.config r13 = r0.f19170a
            java.lang.String r13 = r13.f17949bd
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            boolean r10 = mega.boicot.config.m23844a(r10)
            if (r10 == 0) goto L_0x0973
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7.setTextColor(r10)
        L_0x0973:
            r7.setTag(r8)
            r7.setOnClickListener(r0)
            r7.setVisibility(r3)
            r13 = 1
        L_0x097d:
            if (r13 == 0) goto L_0x0989
            r7 = 2131231185(0x7f0801d1, float:1.8078444E38)
            android.view.View r7 = r9.findViewById(r7)
            r7.setVisibility(r3)
        L_0x0989:
            if (r2 == 0) goto L_0x0995
            r7 = 2131231177(0x7f0801c9, float:1.8078428E38)
            android.view.View r7 = r9.findViewById(r7)
            r7.setVisibility(r3)
        L_0x0995:
            if (r13 == 0) goto L_0x09b2
            if (r2 == 0) goto L_0x09b2
            android.content.res.Resources r2 = r17.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r11 = r11 * r2
            float r11 = r11 + r12
            int r2 = (int) r11
            if (r4 >= r2) goto L_0x09b2
            r2 = 2131231637(0x7f080395, float:1.807936E38)
            android.view.View r2 = r9.findViewById(r2)
            r2.setVisibility(r3)
        L_0x09b2:
            mega.boicot.config r2 = r0.f19170a
            java.lang.String r2 = r2.f17888aU
            java.lang.String r7 = ""
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x09db
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "#"
            r2.append(r7)
            mega.boicot.config r7 = r0.f19170a
            java.lang.String r7 = r7.f17888aU
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            boolean r2 = mega.boicot.config.m23844a(r2)
            if (r2 == 0) goto L_0x09db
            r2 = 1
            goto L_0x09dc
        L_0x09db:
            r2 = r3
        L_0x09dc:
            mega.boicot.g r7 = r0.f19182m
            int r7 = r7.f18212m
            r8 = 20
            if (r7 <= 0) goto L_0x0ad4
            r7 = 2131231193(0x7f0801d9, float:1.807846E38)
            android.view.View r7 = r9.findViewById(r7)
            r7.setVisibility(r3)
            r7 = 2131231113(0x7f080189, float:1.8078298E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            mega.boicot.g r10 = r0.f19182m
            boolean r10 = r10.f18198A
            if (r10 == 0) goto L_0x0a25
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "o_f"
            r10.append(r11)
            mega.boicot.g r11 = r0.f19182m
            int r11 = r11.f18213n
            r10.append(r11)
            java.lang.String r11 = ".png"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.io.File r10 = r0.getFileStreamPath(r10)
            r0.f19183n = r10
            mega.boicot.t_oficinas$5 r10 = new mega.boicot.t_oficinas$5
            r10.<init>()
            r7.setOnClickListener(r10)
        L_0x0a25:
            if (r2 == 0) goto L_0x0a31
            r10 = 2131231318(0x7f080256, float:1.8078714E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10
            goto L_0x0a3a
        L_0x0a31:
            r10 = 2131231317(0x7f080255, float:1.8078712E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10
        L_0x0a3a:
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 <= r8) goto L_0x0a45
            mega.boicot.config r11 = r0.f19170a
            java.lang.String r11 = r11.f17949bd
            mega.boicot.config.m23838a(r10, r11)
        L_0x0a45:
            mega.boicot.g r11 = r0.f19182m
            boolean r11 = r11.f18220u
            if (r11 == 0) goto L_0x0a7b
            int[] r11 = r0.f19177h
            int r12 = r0.f19180k
            mega.boicot.g r13 = r0.f19182m
            int r13 = r13.f18213n
            r11[r12] = r13
            android.widget.ImageView[] r11 = r0.f19175f
            int r12 = r0.f19180k
            r11[r12] = r7
            android.widget.ProgressBar[] r7 = r0.f19176g
            int r11 = r0.f19180k
            r7[r11] = r10
            int[][] r7 = r0.f19178i
            int r11 = r0.f19180k
            r7 = r7[r11]
            r7[r3] = r6
            int[][] r7 = r0.f19178i
            int r11 = r0.f19180k
            r7 = r7[r11]
            r11 = 1
            r7[r11] = r11
            int r7 = r0.f19180k
            int r7 = r7 + r11
            r0.f19180k = r7
            r10.setVisibility(r3)
            goto L_0x0ad4
        L_0x0a7b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "o_f"
            r10.append(r11)
            mega.boicot.g r11 = r0.f19182m
            int r11 = r11.f18213n
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            java.lang.String r12 = ".png"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.io.File r11 = r0.getFileStreamPath(r11)
            boolean r12 = r11.exists()
            if (r12 != 0) goto L_0x0ab2
            java.io.File r10 = r0.getFileStreamPath(r10)
            r10.renameTo(r11)
        L_0x0ab2:
            mega.boicot.config r10 = r0.f19170a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "o_f"
            r11.append(r12)
            mega.boicot.g r12 = r0.f19182m
            int r12 = r12.f18213n
            r11.append(r12)
            java.lang.String r12 = ".png"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.mo20776a(r11, r7)
            r7.setVisibility(r3)
        L_0x0ad4:
            mega.boicot.g r7 = r0.f19182m
            int r7 = r7.f18212m
            r10 = 1
            if (r7 <= r10) goto L_0x0bc2
            r7 = 2131231114(0x7f08018a, float:1.80783E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            mega.boicot.g r10 = r0.f19182m
            boolean r10 = r10.f18198A
            if (r10 == 0) goto L_0x0b12
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "o_f"
            r10.append(r11)
            mega.boicot.g r11 = r0.f19182m
            int r11 = r11.f18214o
            r10.append(r11)
            java.lang.String r11 = ".png"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.io.File r10 = r0.getFileStreamPath(r10)
            r0.f19183n = r10
            mega.boicot.t_oficinas$6 r10 = new mega.boicot.t_oficinas$6
            r10.<init>()
            r7.setOnClickListener(r10)
        L_0x0b12:
            if (r2 == 0) goto L_0x0b1e
            r10 = 2131231320(0x7f080258, float:1.8078718E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10
            goto L_0x0b27
        L_0x0b1e:
            r10 = 2131231319(0x7f080257, float:1.8078716E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10
        L_0x0b27:
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 <= r8) goto L_0x0b32
            mega.boicot.config r11 = r0.f19170a
            java.lang.String r11 = r11.f17949bd
            mega.boicot.config.m23838a(r10, r11)
        L_0x0b32:
            mega.boicot.g r11 = r0.f19182m
            boolean r11 = r11.f18221v
            if (r11 == 0) goto L_0x0b69
            int[] r11 = r0.f19177h
            int r12 = r0.f19180k
            mega.boicot.g r13 = r0.f19182m
            int r13 = r13.f18214o
            r11[r12] = r13
            android.widget.ImageView[] r11 = r0.f19175f
            int r12 = r0.f19180k
            r11[r12] = r7
            android.widget.ProgressBar[] r7 = r0.f19176g
            int r11 = r0.f19180k
            r7[r11] = r10
            int[][] r7 = r0.f19178i
            int r11 = r0.f19180k
            r7 = r7[r11]
            r7[r3] = r6
            int[][] r7 = r0.f19178i
            int r11 = r0.f19180k
            r7 = r7[r11]
            r11 = 1
            r12 = 2
            r7[r11] = r12
            int r7 = r0.f19180k
            int r7 = r7 + r11
            r0.f19180k = r7
            r10.setVisibility(r3)
            goto L_0x0bc2
        L_0x0b69:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "o_f"
            r10.append(r11)
            mega.boicot.g r11 = r0.f19182m
            int r11 = r11.f18214o
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            java.lang.String r12 = ".png"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.io.File r11 = r0.getFileStreamPath(r11)
            boolean r12 = r11.exists()
            if (r12 != 0) goto L_0x0ba0
            java.io.File r10 = r0.getFileStreamPath(r10)
            r10.renameTo(r11)
        L_0x0ba0:
            mega.boicot.config r10 = r0.f19170a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "o_f"
            r11.append(r12)
            mega.boicot.g r12 = r0.f19182m
            int r12 = r12.f18214o
            r11.append(r12)
            java.lang.String r12 = ".png"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.mo20776a(r11, r7)
            r7.setVisibility(r3)
        L_0x0bc2:
            mega.boicot.g r7 = r0.f19182m
            int r7 = r7.f18212m
            r10 = 2
            if (r7 <= r10) goto L_0x0cb0
            r7 = 2131231115(0x7f08018b, float:1.8078302E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            mega.boicot.g r10 = r0.f19182m
            boolean r10 = r10.f18198A
            if (r10 == 0) goto L_0x0c00
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "o_f"
            r10.append(r11)
            mega.boicot.g r11 = r0.f19182m
            int r11 = r11.f18215p
            r10.append(r11)
            java.lang.String r11 = ".png"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.io.File r10 = r0.getFileStreamPath(r10)
            r0.f19183n = r10
            mega.boicot.t_oficinas$7 r10 = new mega.boicot.t_oficinas$7
            r10.<init>()
            r7.setOnClickListener(r10)
        L_0x0c00:
            if (r2 == 0) goto L_0x0c0c
            r10 = 2131231322(0x7f08025a, float:1.8078722E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10
            goto L_0x0c15
        L_0x0c0c:
            r10 = 2131231321(0x7f080259, float:1.807872E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10
        L_0x0c15:
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 <= r8) goto L_0x0c20
            mega.boicot.config r11 = r0.f19170a
            java.lang.String r11 = r11.f17949bd
            mega.boicot.config.m23838a(r10, r11)
        L_0x0c20:
            mega.boicot.g r11 = r0.f19182m
            boolean r11 = r11.f18222w
            if (r11 == 0) goto L_0x0c57
            int[] r11 = r0.f19177h
            int r12 = r0.f19180k
            mega.boicot.g r13 = r0.f19182m
            int r13 = r13.f18215p
            r11[r12] = r13
            android.widget.ImageView[] r11 = r0.f19175f
            int r12 = r0.f19180k
            r11[r12] = r7
            android.widget.ProgressBar[] r7 = r0.f19176g
            int r11 = r0.f19180k
            r7[r11] = r10
            int[][] r7 = r0.f19178i
            int r11 = r0.f19180k
            r7 = r7[r11]
            r7[r3] = r6
            int[][] r7 = r0.f19178i
            int r11 = r0.f19180k
            r7 = r7[r11]
            r11 = 3
            r12 = 1
            r7[r12] = r11
            int r7 = r0.f19180k
            int r7 = r7 + r12
            r0.f19180k = r7
            r10.setVisibility(r3)
            goto L_0x0cb0
        L_0x0c57:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "o_f"
            r10.append(r11)
            mega.boicot.g r11 = r0.f19182m
            int r11 = r11.f18215p
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            java.lang.String r12 = ".png"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.io.File r11 = r0.getFileStreamPath(r11)
            boolean r12 = r11.exists()
            if (r12 != 0) goto L_0x0c8e
            java.io.File r10 = r0.getFileStreamPath(r10)
            r10.renameTo(r11)
        L_0x0c8e:
            mega.boicot.config r10 = r0.f19170a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "o_f"
            r11.append(r12)
            mega.boicot.g r12 = r0.f19182m
            int r12 = r12.f18215p
            r11.append(r12)
            java.lang.String r12 = ".png"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.mo20776a(r11, r7)
            r7.setVisibility(r3)
        L_0x0cb0:
            mega.boicot.g r7 = r0.f19182m
            int r7 = r7.f18212m
            r10 = 3
            if (r7 <= r10) goto L_0x0da0
            r7 = 2131231116(0x7f08018c, float:1.8078304E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            mega.boicot.g r10 = r0.f19182m
            boolean r10 = r10.f18198A
            if (r10 == 0) goto L_0x0cee
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "o_f"
            r10.append(r11)
            mega.boicot.g r11 = r0.f19182m
            int r11 = r11.f18216q
            r10.append(r11)
            java.lang.String r11 = ".png"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.io.File r10 = r0.getFileStreamPath(r10)
            r0.f19183n = r10
            mega.boicot.t_oficinas$8 r10 = new mega.boicot.t_oficinas$8
            r10.<init>()
            r7.setOnClickListener(r10)
        L_0x0cee:
            if (r2 == 0) goto L_0x0cfa
            r2 = 2131231324(0x7f08025c, float:1.8078726E38)
            android.view.View r2 = r9.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            goto L_0x0d03
        L_0x0cfa:
            r2 = 2131231323(0x7f08025b, float:1.8078724E38)
            android.view.View r2 = r9.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
        L_0x0d03:
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 <= r8) goto L_0x0d0e
            mega.boicot.config r8 = r0.f19170a
            java.lang.String r8 = r8.f17949bd
            mega.boicot.config.m23838a(r2, r8)
        L_0x0d0e:
            mega.boicot.g r8 = r0.f19182m
            boolean r8 = r8.f18223x
            if (r8 == 0) goto L_0x0d45
            int[] r8 = r0.f19177h
            int r10 = r0.f19180k
            mega.boicot.g r11 = r0.f19182m
            int r11 = r11.f18216q
            r8[r10] = r11
            android.widget.ImageView[] r8 = r0.f19175f
            int r10 = r0.f19180k
            r8[r10] = r7
            android.widget.ProgressBar[] r7 = r0.f19176g
            int r8 = r0.f19180k
            r7[r8] = r2
            int[][] r7 = r0.f19178i
            int r8 = r0.f19180k
            r7 = r7[r8]
            r7[r3] = r6
            int[][] r7 = r0.f19178i
            int r8 = r0.f19180k
            r7 = r7[r8]
            r8 = 1
            r11 = 4
            r7[r8] = r11
            int r7 = r0.f19180k
            int r7 = r7 + r8
            r0.f19180k = r7
            r2.setVisibility(r3)
            goto L_0x0da1
        L_0x0d45:
            r11 = 4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "o_f"
            r2.append(r8)
            mega.boicot.g r8 = r0.f19182m
            int r8 = r8.f18216q
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            java.lang.String r10 = ".png"
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.io.File r8 = r0.getFileStreamPath(r8)
            boolean r10 = r8.exists()
            if (r10 != 0) goto L_0x0d7d
            java.io.File r2 = r0.getFileStreamPath(r2)
            r2.renameTo(r8)
        L_0x0d7d:
            mega.boicot.config r2 = r0.f19170a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "o_f"
            r8.append(r10)
            mega.boicot.g r10 = r0.f19182m
            int r10 = r10.f18216q
            r8.append(r10)
            java.lang.String r10 = ".png"
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r2.mo20776a(r8, r7)
            r7.setVisibility(r3)
            goto L_0x0da1
        L_0x0da0:
            r11 = 4
        L_0x0da1:
            mega.boicot.config r2 = r0.f19170a
            int r2 = r2.f17845D
            r7 = 1
            if (r2 != r7) goto L_0x0e1b
            mega.boicot.config r2 = r0.f19170a
            java.lang.String r2 = r2.f17888aU
            java.lang.String r7 = ""
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0e1b
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r7 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r8 = 2
            int[] r10 = new int[r8]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r12 = "#"
            r8.append(r12)
            mega.boicot.config r12 = r0.f19170a
            java.lang.String r12 = r12.f17888aU
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r10[r3] = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r12 = "#"
            r8.append(r12)
            mega.boicot.config r12 = r0.f19170a
            java.lang.String r12 = r12.f17889aV
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            int r8 = android.graphics.Color.parseColor(r8)
            r12 = 1
            r10[r12] = r8
            r2.<init>(r7, r10)
            r9.setBackgroundDrawable(r2)
            r2 = 2131231221(0x7f0801f5, float:1.8078517E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#"
            r7.append(r8)
            mega.boicot.config r8 = r0.f19170a
            java.lang.String r8 = r8.f17889aV
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r7 = android.graphics.Color.parseColor(r7)
            r2.setBackgroundColor(r7)
        L_0x0e1b:
            r1.addView(r9)
            int r6 = r6 + 1
            r8 = r11
            r7 = 2
            goto L_0x0148
        L_0x0e24:
            mega.boicot.config r1 = r0.f19170a
            int r1 = r1.f17845D
            if (r1 != 0) goto L_0x0e81
            mega.boicot.config r1 = r0.f19170a
            java.lang.String r1 = r1.f17888aU
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0e81
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r4 = 2
            int[] r4 = new int[r4]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "#"
            r5.append(r6)
            mega.boicot.config r6 = r0.f19170a
            java.lang.String r6 = r6.f17888aU
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            int r5 = android.graphics.Color.parseColor(r5)
            r4[r3] = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "#"
            r5.append(r6)
            mega.boicot.config r6 = r0.f19170a
            java.lang.String r6 = r6.f17889aV
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            int r5 = android.graphics.Color.parseColor(r5)
            r6 = 1
            r4[r6] = r5
            r1.<init>(r2, r4)
            r2 = 2131231221(0x7f0801f5, float:1.8078517E38)
            android.view.View r2 = r0.findViewById(r2)
            r2.setBackgroundDrawable(r1)
        L_0x0e81:
            int r1 = r0.f19180k
            if (r1 <= 0) goto L_0x0e91
            r0.f19179j = r3
            mega.boicot.t_oficinas$a r1 = new mega.boicot.t_oficinas$a
            r1.<init>()
            java.lang.String[] r2 = new java.lang.String[r3]
            r1.execute(r2)
        L_0x0e91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_oficinas.onCreate(android.os.Bundle):void");
    }

    public void onClick(View view) {
        if (view.getId() == R.id.ll_tel1) {
            TextView textView = (TextView) view.findViewById(R.id.tv_tel1);
            StringBuilder sb = new StringBuilder();
            sb.append("tel:");
            sb.append(textView.getText());
            try {
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(sb.toString())));
            } catch (Exception unused) {
            }
        } else if (view.getId() == R.id.ll_tel2) {
            TextView textView2 = (TextView) view.findViewById(R.id.tv_tel2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("tel:");
            sb2.append(textView2.getText());
            startActivity(new Intent("android.intent.action.DIAL", Uri.parse(sb2.toString())));
        } else if (view.getId() == R.id.ll_chat) {
            startActivityForResult(new Intent(this, chat.class), 0);
        } else if (view.getId() == R.id.ll_email) {
            Intent intent = new Intent(this, contactar.class);
            intent.putExtra("idofic", (Integer) view.getTag());
            if (this.f19181l != null && this.f19181l.containsKey("msg_predefinido")) {
                intent.putExtra("msg_predefinido", this.f19181l.getString("msg_predefinido"));
            }
            startActivityForResult(intent, 0);
        } else if (view.getId() == R.id.ll_url) {
            TextView textView3 = (TextView) view.findViewById(R.id.tv_url);
            String str = (String) textView3.getText();
            if (textView3.getTag().equals("1")) {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse(str));
                startActivity(intent2);
                return;
            }
            Intent intent3 = new Intent(this, t_url.class);
            intent3.putExtra("url", str);
            startActivityForResult(intent3, 0);
        } else if (view.getId() == R.id.btn_vermapa) {
            C5861b bVar = (C5861b) view.getTag();
            Intent intent4 = new Intent(this, t_mapa_web.class);
            intent4.putExtra("x", bVar.f19209a);
            intent4.putExtra("y", bVar.f19210b);
            intent4.putExtra("z", bVar.f19211c);
            intent4.putExtra("titulo", bVar.f19212d);
            intent4.putExtra("dir1", bVar.f19213e);
            intent4.putExtra("dir2", bVar.f19214f);
            intent4.putExtra("cp", bVar.f19215g);
            intent4.putExtra("pob", bVar.f19216h);
            intent4.putExtra("prov", bVar.f19217i);
            startActivityForResult(intent4, 0);
        } else if ((this.f19170a.f17986cO == null || this.f19170a.f17986cO.equals("")) && ((this.f19170a.f17985cN == null || this.f19170a.f17985cN.equals("")) && ((this.f19170a.f17988cQ == null || this.f19170a.f17988cQ.equals("")) && (this.f19170a.f17989cR == null || this.f19170a.f17989cR.equals(""))))) {
            abrir_secc(view);
        } else {
            if (this.f19170a.f17986cO != null && !this.f19170a.f17986cO.equals("")) {
                this.f19186q = new RewardedVideo((Context) this, this.f19170a.f17986cO);
            }
            if (this.f19170a.f17985cN != null && !this.f19170a.f17985cN.equals("")) {
                this.f19185p = C2997g.m10716a(this);
            }
            if (this.f19170a.f17988cQ != null && !this.f19170a.f17988cQ.equals("")) {
                this.f19187r = new RewardedVideoAd(this, this.f19170a.f17988cQ);
            }
            if (this.f19170a.f17989cR != null && !this.f19170a.f17989cR.equals("")) {
                this.f19188s = new StartAppAd(this);
            }
            this.f19192w = new ProgressDialog(this);
            this.f19191v = view;
            if (!this.f19170a.mo20774a((Context) this, view, this.f19184o, this.f19192w, this.f19185p, this.f19186q, this.f19187r, this.f19188s)) {
                abrir_secc(view);
            }
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f19170a.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f19171b = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f19170a.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f19173d = false;
            startActivity(a.f18226a);
        }
        if (this.f19171b && !this.f19190u) {
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21295f() {
        int b = this.f19170a.mo20778b((Context) this);
        if (this.f19170a.f18045dm == 1) {
            this.f19193x = (ListView) findViewById(R.id.left_drawer);
            this.f19170a.mo20771a(this.f19193x);
        } else if (this.f19170a.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f19170a.f17971bz.length; i2++) {
                if (!this.f19170a.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f19170a.f17923bD.length; i3++) {
            if (this.f19170a.f17923bD[i3] > 0) {
                findViewById(this.f19170a.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("es_root", this.f19173d);
    }

    public void onStop() {
        super.onStop();
        if (this.f19171b && !this.f19190u) {
            finish();
        }
    }

    public void onPause() {
        if (!(this.f19170a.f18013cx == 0 || this.f19194y == null || this.f19194y.f17768a == null)) {
            this.f19194y.f17768a.mo12167b();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f19170a.f18013cx != 0 && this.f19194y != null && this.f19194y.f17768a != null) {
            this.f19194y.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f19170a.f18013cx == 0 || this.f19194y == null || this.f19194y.f17768a == null)) {
            this.f19194y.f17768a.mo12168c();
        }
        if (!(this.f19170a.f18013cx == 0 || this.f19194y == null || this.f19194y.f17769b == null)) {
            this.f19194y.f17769b.destroy();
        }
        if ((this.f19173d && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f19173d = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    public boolean onSearchRequested() {
        if (this.f19170a.f18080q == 0) {
            return false;
        }
        this.f19171b = true;
        this.f19190u = true;
        return super.onSearchRequested();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onBackPressed() {
        if (!this.f19173d || this.f19172c || !this.f19170a.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f19172c = true;
        config.m23859l(this);
    }

    public void adLoaded(String str) {
        this.f19192w.cancel();
        this.f19186q.showAd();
    }

    public void onAdClosed() {
        if (this.f19189t) {
            abrir_secc(this.f19191v);
        }
    }

    public void adError(String str) {
        this.f19192w.cancel();
        abrir_secc(this.f19191v);
    }

    public void videoEnded() {
        this.f19189t = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f19192w.cancel();
        this.f19185p.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f19189t = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f19189t) {
            abrir_secc(this.f19191v);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f19189t = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f19170a.mo20775a((Context) this, this.f19186q)) {
            this.f19192w.cancel();
            abrir_secc(this.f19191v);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f19192w.cancel();
        abrir_secc(this.f19191v);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f19192w.cancel();
        this.f19187r.show();
    }

    public void onRewardedVideoCompleted() {
        this.f19189t = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f19189t) {
            abrir_secc(this.f19191v);
        }
    }

    public void onVideoCompleted() {
        this.f19189t = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f19192w.cancel();
        this.f19188s.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_oficinas.this.f19189t) {
                    t_oficinas.this.abrir_secc(t_oficinas.this.f19191v);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f19192w.cancel();
        abrir_secc(this.f19191v);
    }
}
