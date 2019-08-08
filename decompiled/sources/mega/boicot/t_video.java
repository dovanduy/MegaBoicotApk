package mega.boicot;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.app.SearchManager.OnCancelListener;
import android.app.SearchManager.OnDismissListener;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p017v4.widget.DrawerLayout;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
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

public class t_video extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: a */
    config f19378a;

    /* renamed from: b */
    Bundle f19379b;

    /* renamed from: c */
    C5602c f19380c;

    /* renamed from: d */
    C3166b f19381d;

    /* renamed from: e */
    RewardedVideo f19382e;

    /* renamed from: f */
    RewardedVideoAd f19383f;

    /* renamed from: g */
    StartAppAd f19384g;

    /* renamed from: h */
    boolean f19385h = false;

    /* renamed from: i */
    boolean f19386i = false;

    /* renamed from: j */
    String f19387j;

    /* renamed from: k */
    View f19388k;

    /* renamed from: l */
    ProgressDialog f19389l;

    /* renamed from: m */
    ListView f19390m;

    /* renamed from: n */
    boolean f19391n = false;

    /* renamed from: o */
    boolean f19392o = false;

    /* renamed from: p */
    boolean f19393p = false;

    /* renamed from: q */
    boolean f19394q;

    /* renamed from: r */
    FullscreenVideoLayout f19395r;

    /* renamed from: s */
    int f19396s;

    /* renamed from: t */
    int f19397t = 0;

    /* renamed from: mega.boicot.t_video$a */
    private class C5899a extends AsyncTask<String, Void, String> {
        private C5899a() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0082  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r6 = 0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007e }
                r0.<init>()     // Catch:{ Exception -> 0x007e }
                java.lang.String r1 = "https://global.appnext.com/offerWallApi.aspx?id="
                r0.append(r1)     // Catch:{ Exception -> 0x007e }
                mega.boicot.t_video r1 = mega.boicot.t_video.this     // Catch:{ Exception -> 0x007e }
                mega.boicot.config r1 = r1.f19378a     // Catch:{ Exception -> 0x007e }
                java.lang.String r1 = r1.f18005ch     // Catch:{ Exception -> 0x007e }
                r0.append(r1)     // Catch:{ Exception -> 0x007e }
                java.lang.String r1 = "&type=vast&vast_ver=3.0&duration=all&packageId="
                r0.append(r1)     // Catch:{ Exception -> 0x007e }
                mega.boicot.t_video r1 = mega.boicot.t_video.this     // Catch:{ Exception -> 0x007e }
                java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x007e }
                r0.append(r1)     // Catch:{ Exception -> 0x007e }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x007e }
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x007e }
                r1.<init>(r0)     // Catch:{ Exception -> 0x007e }
                java.net.URLConnection r0 = r1.openConnection()     // Catch:{ Exception -> 0x007e }
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x007e }
                r6 = 1
                r0.setDoInput(r6)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                r6 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r6)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                r0.setReadTimeout(r6)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.io.InputStream r6 = r0.getInputStream()     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                r2.<init>(r6)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                r6.<init>()     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
            L_0x0050:
                java.lang.String r2 = r1.readLine()     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                if (r2 == 0) goto L_0x006b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                r3.<init>()     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                r3.append(r2)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.lang.String r2 = "\n"
                r3.append(r2)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                r6.append(r2)     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                goto L_0x0050
            L_0x006b:
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0077, all -> 0x0075 }
                if (r0 == 0) goto L_0x0074
                r0.disconnect()
            L_0x0074:
                return r6
            L_0x0075:
                r6 = move-exception
                goto L_0x0086
            L_0x0077:
                r6 = r0
                goto L_0x007e
            L_0x0079:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x0086
            L_0x007e:
                java.lang.String r0 = ""
                if (r6 == 0) goto L_0x0085
                r6.disconnect()
            L_0x0085:
                return r0
            L_0x0086:
                if (r0 == 0) goto L_0x008b
                r0.disconnect()
            L_0x008b:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_video.C5899a.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0091  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.String r7) {
            /*
                r6 = this;
                java.lang.String r0 = ""
                java.lang.String r1 = "<Ad id="
                boolean r1 = r7.contains(r1)
                r2 = 0
                if (r1 == 0) goto L_0x005e
                java.lang.String r1 = "<Impression><![CDATA["
                int r1 = r7.indexOf(r1)
                r3 = -1
                if (r1 == r3) goto L_0x005e
                int r1 = r1 + 21
                java.lang.String r4 = "]"
                int r4 = r7.indexOf(r4, r1)
                mega.boicot.t_video r5 = mega.boicot.t_video.this
                mega.boicot.FullscreenVideoLayout r5 = r5.f19395r
                java.lang.String r1 = r7.substring(r1, r4)
                r5.f19458b = r1
                java.lang.String r1 = "<ClickThrough><![CDATA["
                int r1 = r7.indexOf(r1)
                if (r1 == r3) goto L_0x005e
                int r1 = r1 + 23
                java.lang.String r4 = "]"
                int r4 = r7.indexOf(r4, r1)
                mega.boicot.t_video r5 = mega.boicot.t_video.this
                mega.boicot.FullscreenVideoLayout r5 = r5.f19395r
                java.lang.String r1 = r7.substring(r1, r4)
                r5.f19459c = r1
                java.lang.String r1 = "width=\"320\" height=\"180\""
                int r1 = r7.indexOf(r1)
                if (r1 == r3) goto L_0x005e
                java.lang.String r4 = "><![CDATA["
                int r1 = r7.indexOf(r4, r1)
                if (r1 == r3) goto L_0x005e
                int r1 = r1 + 10
                java.lang.String r0 = "]"
                int r0 = r7.indexOf(r0, r1)
                java.lang.String r0 = r7.substring(r1, r0)
                r7 = 1
                goto L_0x005f
            L_0x005e:
                r7 = r2
            L_0x005f:
                if (r7 == 0) goto L_0x0091
                android.net.Uri r7 = android.net.Uri.parse(r0)
                mega.boicot.t_video r0 = mega.boicot.t_video.this
                r1 = 2131230817(0x7f080061, float:1.8077697E38)
                android.view.View r0 = r0.findViewById(r1)
                mega.boicot.t_video$a$1 r1 = new mega.boicot.t_video$a$1
                r1.<init>()
                r0.setOnClickListener(r1)
                mega.boicot.t_video r0 = mega.boicot.t_video.this
                mega.boicot.FullscreenVideoLayout r0 = r0.f19395r
                r0.f19470o = r2
                mega.boicot.t_video r0 = mega.boicot.t_video.this
                mega.boicot.FullscreenVideoLayout r0 = r0.f19395r
                r0.mo21493m()
                mega.boicot.t_video r0 = mega.boicot.t_video.this     // Catch:{ IOException -> 0x008c }
                mega.boicot.FullscreenVideoLayout r0 = r0.f19395r     // Catch:{ IOException -> 0x008c }
                r1 = 0
                r0.mo21531a(r7, r1)     // Catch:{ IOException -> 0x008c }
                goto L_0x0096
            L_0x008c:
                r7 = move-exception
                r7.printStackTrace()
                goto L_0x0096
            L_0x0091:
                mega.boicot.t_video r7 = mega.boicot.t_video.this
                r7.m24271g()
            L_0x0096:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_video.C5899a.onPostExecute(java.lang.String):void");
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

    @TargetApi(14)
    public void onCreate(Bundle bundle) {
        this.f19378a = (config) getApplicationContext();
        if (this.f19378a.f17881aN == null) {
            this.f19378a.mo20780b();
        }
        this.f19379b = getIntent().getExtras();
        if (bundle == null) {
            this.f19394q = this.f19379b != null && this.f19379b.containsKey("es_root") && this.f19379b.getBoolean("es_root", false);
        } else {
            this.f19394q = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f19379b = getIntent().getExtras();
        this.f19396s = this.f19379b.getInt("ind");
        this.f19387j = config.m23831a(this.f19378a.f17971bz[this.f19396s].f18314g, this.f19378a.f17890aW);
        super.onCreate(bundle);
        setContentView(R.layout.t_video);
        mo21424f();
        if (this.f19378a.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_video.this.f19391n = false;
                    t_video.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    t_video.this.f19386i = false;
                }
            });
        }
        if (this.f19378a.f18045dm == 1) {
            ImageView imageView = (ImageView) findViewById(R.id.icohome);
            ((ImageView) findViewById(R.id.iv_drawer)).setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo2178e(8388611);
                }
            });
            imageView.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo2178e(8388611);
                }
            });
        }
        this.f19380c = this.f19378a.mo20760a((Context) this, false);
        this.f19378a.mo20767a((Context) this, this.f19378a.f18075l, this.f19387j, bundle);
        if (!this.f19378a.f17971bz[this.f19396s].f18314g.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f19378a.f17971bz[this.f19396s].f18314g);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(this.f19378a.f17971bz[this.f19396s].f18315h);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb.toString()), Color.parseColor(sb2.toString())}));
        }
        this.f19395r = (FullscreenVideoLayout) findViewById(R.id.vv);
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        int i = sharedPreferences.getInt("appnext_video_n", 0) + 1;
        Editor edit = sharedPreferences.edit();
        edit.putInt("appnext_video_n", i);
        edit.commit();
        if (this.f19378a.f18005ch.equals("") || i < this.f19378a.f18007cj || (i - this.f19378a.f18007cj) % this.f19378a.f18006ci != 0) {
            m24271g();
            return;
        }
        this.f19395r.f19457a = true;
        new C5899a().execute(new String[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m24271g() {
        this.f19395r.f19457a = false;
        if (VERSION.SDK_INT >= 16 && !ViewConfiguration.get(this).hasPermanentMenuKey()) {
            this.f19395r.setOnSystemUiVisibilityChangeListener(new OnSystemUiVisibilityChangeListener() {
                public void onSystemUiVisibilityChange(int i) {
                    if ((i & 2) == 0 && t_video.this.f19395r != null && t_video.this.f19395r.mo21545r()) {
                        t_video.this.f19395r.setFullscreen(false);
                        t_video.this.f19395r.mo21494n();
                    }
                }
            });
        }
        boolean z = this.f19379b.containsKey("desde_chat") && this.f19379b.getBoolean("desde_chat");
        if (z) {
            this.f19392o = false;
            this.f19395r.mo21481a(false, false);
        } else {
            this.f19392o = this.f19378a.f17971bz[this.f19396s].f18231B;
            this.f19395r.mo21481a(this.f19378a.f18040dY, this.f19378a.f17971bz[this.f19396s].f18236G);
        }
        this.f19395r.f19470o = this.f19392o;
        if (this.f19392o) {
            this.f19395r.mo21492l();
        }
        this.f19395r.setOnPreparedListener(new OnPreparedListener() {
            public void onPrepared(MediaPlayer mediaPlayer) {
            }
        });
        this.f19395r.setOnErrorListener(new OnErrorListener() {
            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                return false;
            }
        });
        try {
            this.f19395r.mo21531a(Uri.parse(this.f19379b.getString("url")), this.f19379b.getString("ua"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!z) {
            if (this.f19378a.f18039dX) {
                setRequestedOrientation(0);
            }
            if (this.f19378a.f18038dW) {
                this.f19395r.setFullscreen(true);
            }
        }
    }

    public void onClick(View view) {
        if ((this.f19378a.f17986cO == null || this.f19378a.f17986cO.equals("")) && ((this.f19378a.f17985cN == null || this.f19378a.f17985cN.equals("")) && ((this.f19378a.f17988cQ == null || this.f19378a.f17988cQ.equals("")) && (this.f19378a.f17989cR == null || this.f19378a.f17989cR.equals(""))))) {
            abrir_secc(view);
            return;
        }
        if (this.f19378a.f17986cO != null && !this.f19378a.f17986cO.equals("")) {
            this.f19382e = new RewardedVideo((Context) this, this.f19378a.f17986cO);
        }
        if (this.f19378a.f17985cN != null && !this.f19378a.f17985cN.equals("")) {
            this.f19381d = C2997g.m10716a(this);
        }
        if (this.f19378a.f17988cQ != null && !this.f19378a.f17988cQ.equals("")) {
            this.f19383f = new RewardedVideoAd(this, this.f19378a.f17988cQ);
        }
        if (this.f19378a.f17989cR != null && !this.f19378a.f17989cR.equals("")) {
            this.f19384g = new StartAppAd(this);
        }
        this.f19389l = new ProgressDialog(this);
        this.f19388k = view;
        if (!this.f19378a.mo20774a((Context) this, view, this.f19387j, this.f19389l, this.f19381d, this.f19382e, this.f19383f, this.f19384g)) {
            abrir_secc(view);
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f19378a.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f19391n = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f19378a.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f19394q = false;
            startActivity(a.f18226a);
        }
        if (this.f19391n && !this.f19386i) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f19394q = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21424f() {
        int b = this.f19378a.mo20778b((Context) this);
        if (this.f19378a.f18045dm == 1) {
            this.f19390m = (ListView) findViewById(R.id.left_drawer);
            this.f19378a.mo20771a(this.f19390m);
        } else if (this.f19378a.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f19378a.f17971bz.length; i2++) {
                if (!this.f19378a.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f19378a.f17923bD.length; i3++) {
            if (this.f19378a.f17923bD[i3] > 0) {
                findViewById(this.f19378a.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public boolean onSearchRequested() {
        if (this.f19378a.f18080q == 0) {
            return false;
        }
        this.f19391n = true;
        this.f19386i = true;
        return super.onSearchRequested();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 102 && config.m23853d() && iArr.length > 0 && strArr[0].equals("android.permission.WRITE_EXTERNAL_STORAGE") && iArr[0] == 0 && getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", getPackageName()) == 0) {
            SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
            this.f19378a.mo20773a(sharedPreferences.getString("descarga_url", ""), sharedPreferences.getString("descarga_mimetype", ""), sharedPreferences.getString("descarga_nombre", ""), (Context) this);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onPause() {
        if (!(this.f19378a.f18013cx == 0 || this.f19380c == null || this.f19380c.f17768a == null)) {
            this.f19380c.f17768a.mo12167b();
        }
        super.onPause();
        this.f19397t = this.f19395r.getCurrentPosition();
        this.f19395r.mo21489i();
    }

    public void onStop() {
        super.onStop();
        if (this.f19391n && !this.f19386i) {
            finish();
        }
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        if (this.f19395r != null && this.f19395r.f19502u) {
            this.f19395r.mo21530a(this.f19397t);
            this.f19395r.mo21488h();
        }
        if (this.f19378a.f18013cx != 0 && this.f19380c != null && this.f19380c.f17768a != null) {
            this.f19380c.f17768a.mo12165a();
        }
    }

    public void onDestroy() {
        if (!(this.f19378a.f18013cx == 0 || this.f19380c == null || this.f19380c.f17768a == null)) {
            this.f19380c.f17768a.mo12168c();
        }
        if (!(this.f19378a.f18013cx == 0 || this.f19380c == null || this.f19380c.f17769b == null)) {
            this.f19380c.f17769b.destroy();
        }
        if ((this.f19394q && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo21424f();
        if (this.f19378a.f18045dm == 1) {
            ImageView imageView = (ImageView) findViewById(R.id.icohome);
            ((ImageView) findViewById(R.id.iv_drawer)).setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo2178e(8388611);
                }
            });
            imageView.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    ((DrawerLayout) ((Activity) view.getContext()).findViewById(R.id.drawer_layout)).mo2178e(8388611);
                }
            });
        }
        ((LinearLayout) findViewById(R.id.ll_ad)).removeAllViews();
        if (!(this.f19380c == null || this.f19380c.f17768a == null)) {
            try {
                this.f19380c.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f19380c == null || this.f19380c.f17769b == null)) {
            try {
                this.f19380c.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f19380c = this.f19378a.mo20760a((Context) this, false);
    }

    public void onBackPressed() {
        if (!this.f19394q || this.f19393p || !this.f19378a.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f19393p = true;
        config.m23859l(this);
    }

    public void adLoaded(String str) {
        this.f19389l.cancel();
        this.f19382e.showAd();
    }

    public void onAdClosed() {
        if (this.f19385h) {
            abrir_secc(this.f19388k);
        }
    }

    public void adError(String str) {
        this.f19389l.cancel();
        abrir_secc(this.f19388k);
    }

    public void videoEnded() {
        this.f19385h = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f19389l.cancel();
        this.f19381d.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f19385h = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f19385h) {
            abrir_secc(this.f19388k);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f19385h = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f19378a.mo20775a((Context) this, this.f19382e)) {
            this.f19389l.cancel();
            abrir_secc(this.f19388k);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f19389l.cancel();
        abrir_secc(this.f19388k);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f19389l.cancel();
        this.f19383f.show();
    }

    public void onRewardedVideoCompleted() {
        this.f19385h = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f19385h) {
            abrir_secc(this.f19388k);
        }
    }

    public void onVideoCompleted() {
        this.f19385h = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f19389l.cancel();
        this.f19384g.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_video.this.f19385h) {
                    t_video.this.abrir_secc(t_video.this.f19388k);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f19389l.cancel();
        abrir_secc(this.f19388k);
    }
}
