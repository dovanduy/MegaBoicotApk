package mega.boicot;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.app.SearchManager.OnCancelListener;
import android.app.SearchManager.OnDismissListener;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.p017v4.widget.DrawerLayout;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import com.facebook.ads.C1514Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.android.exoplayer2.C2793C;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.Player.DefaultEventListener;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.p133ui.PlaybackControlView;
import com.google.android.exoplayer2.p133ui.PlayerView;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.DefaultDashChunkSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.DefaultSsChunkSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelection.Factory;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.ads.C2997g;
import com.google.android.gms.ads.reward.C3165a;
import com.google.android.gms.ads.reward.C3166b;
import com.google.android.gms.ads.reward.C3167c;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.VideoListener;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import mega.boicot.config.C5643e;

public class t_video_exoplayer extends Activity implements OnClickListener, OnAdClosed, OnAdError, OnAdLoaded, OnVideoEnded, RewardedVideoAdListener, C3167c, VideoListener, AdEventListener, C5599a {

    /* renamed from: A */
    public boolean f19410A = false;

    /* renamed from: B */
    public String f19411B = "";

    /* renamed from: C */
    public String f19412C = "";

    /* renamed from: a */
    config f19413a;

    /* renamed from: b */
    Bundle f19414b;

    /* renamed from: c */
    C5602c f19415c;

    /* renamed from: d */
    C3166b f19416d;

    /* renamed from: e */
    RewardedVideo f19417e;

    /* renamed from: f */
    RewardedVideoAd f19418f;

    /* renamed from: g */
    StartAppAd f19419g;

    /* renamed from: h */
    boolean f19420h = false;

    /* renamed from: i */
    boolean f19421i = false;

    /* renamed from: j */
    String f19422j;

    /* renamed from: k */
    String f19423k;

    /* renamed from: l */
    View f19424l;

    /* renamed from: m */
    ProgressDialog f19425m;

    /* renamed from: n */
    ListView f19426n;

    /* renamed from: o */
    boolean f19427o = false;

    /* renamed from: p */
    boolean f19428p = false;

    /* renamed from: q */
    boolean f19429q = false;

    /* renamed from: r */
    boolean f19430r;

    /* renamed from: s */
    SimpleExoPlayer f19431s;

    /* renamed from: t */
    PlayerView f19432t;

    /* renamed from: u */
    int f19433u;

    /* renamed from: v */
    Boolean f19434v = Boolean.valueOf(false);

    /* renamed from: w */
    FrameLayout f19435w;

    /* renamed from: x */
    int f19436x = -1;

    /* renamed from: y */
    int f19437y;

    /* renamed from: z */
    Uri f19438z;

    /* renamed from: mega.boicot.t_video_exoplayer$a */
    private class C5915a extends AsyncTask<String, Void, String> {
        private C5915a() {
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
                mega.boicot.t_video_exoplayer r1 = mega.boicot.t_video_exoplayer.this     // Catch:{ Exception -> 0x007e }
                mega.boicot.config r1 = r1.f19413a     // Catch:{ Exception -> 0x007e }
                java.lang.String r1 = r1.f18005ch     // Catch:{ Exception -> 0x007e }
                r0.append(r1)     // Catch:{ Exception -> 0x007e }
                java.lang.String r1 = "&type=vast&vast_ver=3.0&duration=all&packageId="
                r0.append(r1)     // Catch:{ Exception -> 0x007e }
                mega.boicot.t_video_exoplayer r1 = mega.boicot.t_video_exoplayer.this     // Catch:{ Exception -> 0x007e }
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
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_video_exoplayer.C5915a.doInBackground(java.lang.String[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x008a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPostExecute(java.lang.String r7) {
            /*
                r6 = this;
                java.lang.String r0 = ""
                java.lang.String r1 = "<Ad id="
                boolean r1 = r7.contains(r1)
                r2 = 1
                if (r1 == 0) goto L_0x005a
                java.lang.String r1 = "<Impression><![CDATA["
                int r1 = r7.indexOf(r1)
                r3 = -1
                if (r1 == r3) goto L_0x005a
                int r1 = r1 + 21
                java.lang.String r4 = "]"
                int r4 = r7.indexOf(r4, r1)
                mega.boicot.t_video_exoplayer r5 = mega.boicot.t_video_exoplayer.this
                java.lang.String r1 = r7.substring(r1, r4)
                r5.f19411B = r1
                java.lang.String r1 = "<ClickThrough><![CDATA["
                int r1 = r7.indexOf(r1)
                if (r1 == r3) goto L_0x005a
                int r1 = r1 + 23
                java.lang.String r4 = "]"
                int r4 = r7.indexOf(r4, r1)
                mega.boicot.t_video_exoplayer r5 = mega.boicot.t_video_exoplayer.this
                java.lang.String r1 = r7.substring(r1, r4)
                r5.f19412C = r1
                java.lang.String r1 = "width=\"320\" height=\"180\""
                int r1 = r7.indexOf(r1)
                if (r1 == r3) goto L_0x005a
                java.lang.String r4 = "><![CDATA["
                int r1 = r7.indexOf(r4, r1)
                if (r1 == r3) goto L_0x005a
                int r1 = r1 + 10
                java.lang.String r0 = "]"
                int r0 = r7.indexOf(r0, r1)
                java.lang.String r0 = r7.substring(r1, r0)
                r7 = r2
                goto L_0x005b
            L_0x005a:
                r7 = 0
            L_0x005b:
                if (r7 == 0) goto L_0x008a
                android.net.Uri r7 = android.net.Uri.parse(r0)
                mega.boicot.t_video_exoplayer r0 = mega.boicot.t_video_exoplayer.this
                r1 = 2131230817(0x7f080061, float:1.8077697E38)
                android.view.View r0 = r0.findViewById(r1)
                mega.boicot.t_video_exoplayer$a$1 r1 = new mega.boicot.t_video_exoplayer$a$1
                r1.<init>()
                r0.setOnClickListener(r1)
                mega.boicot.t_video_exoplayer r0 = mega.boicot.t_video_exoplayer.this
                java.lang.String r1 = ""
                r3 = 0
                com.google.android.exoplayer2.source.MediaSource r7 = r0.m24282a(r7, r1, r3, r3)
                mega.boicot.t_video_exoplayer r0 = mega.boicot.t_video_exoplayer.this
                com.google.android.exoplayer2.SimpleExoPlayer r0 = r0.f19431s
                r0.prepare(r7)
                mega.boicot.t_video_exoplayer r7 = mega.boicot.t_video_exoplayer.this
                com.google.android.exoplayer2.SimpleExoPlayer r7 = r7.f19431s
                r7.setPlayWhenReady(r2)
                goto L_0x008f
            L_0x008a:
                mega.boicot.t_video_exoplayer r7 = mega.boicot.t_video_exoplayer.this
                r7.m24290g()
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.t_video_exoplayer.C5915a.onPostExecute(java.lang.String):void");
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
        this.f19413a = (config) getApplicationContext();
        if (this.f19413a.f17881aN == null) {
            this.f19413a.mo20780b();
        }
        this.f19414b = getIntent().getExtras();
        if (bundle == null) {
            this.f19430r = this.f19414b != null && this.f19414b.containsKey("es_root") && this.f19414b.getBoolean("es_root", false);
        } else {
            this.f19430r = bundle.containsKey("es_root") && bundle.getBoolean("es_root", false);
        }
        this.f19414b = getIntent().getExtras();
        this.f19433u = this.f19414b.getInt("ind");
        this.f19422j = config.m23831a(this.f19413a.f17971bz[this.f19433u].f18314g, this.f19413a.f17890aW);
        super.onCreate(bundle);
        setContentView(R.layout.t_video_exoplayer);
        mo21451f();
        if (this.f19413a.f18080q > 0) {
            SearchManager searchManager = (SearchManager) getSystemService("search");
            searchManager.setOnCancelListener(new OnCancelListener() {
                public void onCancel() {
                    t_video_exoplayer.this.f19427o = false;
                    t_video_exoplayer.this.setResult(0);
                }
            });
            searchManager.setOnDismissListener(new OnDismissListener() {
                public void onDismiss() {
                    t_video_exoplayer.this.f19421i = false;
                }
            });
        }
        if (this.f19413a.f18045dm == 1) {
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
        this.f19413a.mo20770a((Context) this, this.f19414b != null && this.f19414b.containsKey("ad_entrar"), this.f19414b != null && this.f19414b.containsKey("fb_entrar"));
        this.f19415c = this.f19413a.mo20760a((Context) this, false);
        this.f19413a.mo20767a((Context) this, this.f19413a.f18075l, this.f19422j, bundle);
        if (!this.f19413a.f17971bz[this.f19433u].f18314g.equals("")) {
            Orientation orientation = Orientation.TOP_BOTTOM;
            StringBuilder sb = new StringBuilder();
            sb.append("#");
            sb.append(this.f19413a.f17971bz[this.f19433u].f18314g);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#");
            sb2.append(this.f19413a.f17971bz[this.f19433u].f18315h);
            findViewById(R.id.ll_princ).setBackgroundDrawable(new GradientDrawable(orientation, new int[]{Color.parseColor(sb.toString()), Color.parseColor(sb2.toString())}));
        }
        this.f19428p = this.f19413a.f17971bz[this.f19433u].f18231B;
        this.f19423k = this.f19414b.getString("ua");
        if (this.f19423k.equals("")) {
            this.f19423k = Util.getUserAgent(this, "mega.boicot");
        }
        if (VERSION.SDK_INT > 20) {
            config.m23838a((ProgressBar) findViewById(R.id.pb_video), this.f19413a.f17890aW);
        }
        this.f19431s = ExoPlayerFactory.newSimpleInstance((Context) this, (TrackSelector) new DefaultTrackSelector((Factory) new AdaptiveTrackSelection.Factory(new DefaultBandwidthMeter())));
        this.f19432t = (PlayerView) findViewById(R.id.vv);
        this.f19432t.setPlayer(this.f19431s);
        this.f19432t.setControllerAutoShow(false);
        this.f19432t.hideController();
        this.f19432t.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!t_video_exoplayer.this.f19410A) {
                    return false;
                }
                if (t_video_exoplayer.this.f19412C != null && !t_video_exoplayer.this.f19412C.equals("")) {
                    t_video_exoplayer.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(t_video_exoplayer.this.f19412C)));
                }
                return true;
            }
        });
        if (VERSION.SDK_INT >= 16 && !ViewConfiguration.get(this).hasPermanentMenuKey()) {
            this.f19432t.setOnSystemUiVisibilityChangeListener(new OnSystemUiVisibilityChangeListener() {
                public void onSystemUiVisibilityChange(int i) {
                    if ((i & 2) == 0 && t_video_exoplayer.this.f19432t != null && t_video_exoplayer.this.f19434v.booleanValue()) {
                        t_video_exoplayer.this.m24294k();
                    }
                }
            });
        }
        if (this.f19428p) {
            this.f19432t.findViewById(R.id.exo_position).setVisibility(4);
            this.f19432t.findViewById(R.id.exo_progress).setVisibility(4);
            this.f19432t.findViewById(R.id.exo_duration).setVisibility(4);
        }
        m24292i();
        if (this.f19413a.f18040dY) {
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.exo_cast_button);
            frameLayout.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    t_video_exoplayer.this.m24291h();
                }
            });
            frameLayout.setVisibility(0);
        }
        if (this.f19413a.f17971bz[this.f19433u].f18236G) {
            FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.exo_download_button);
            frameLayout2.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    String str = "video/*";
                    String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(t_video_exoplayer.this.f19438z.toString());
                    if (fileExtensionFromUrl != null) {
                        str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                    }
                    String str2 = "";
                    try {
                        str2 = URLUtil.guessFileName(t_video_exoplayer.this.f19438z.toString(), null, str);
                    } catch (Exception unused) {
                    }
                    t_video_exoplayer.this.f19413a.mo20773a(t_video_exoplayer.this.f19438z.toString(), str, str2, (Context) t_video_exoplayer.this);
                }
            });
            frameLayout2.setVisibility(0);
        }
        this.f19431s.addListener(new DefaultEventListener() {
            public void onPlayerStateChanged(boolean z, int i) {
                if (z && i == 3) {
                    t_video_exoplayer.this.findViewById(R.id.pb_video).setVisibility(8);
                    if (t_video_exoplayer.this.f19410A) {
                        try {
                            LayoutParams layoutParams = t_video_exoplayer.this.findViewById(R.id.ll_btns).getLayoutParams();
                            layoutParams.width = t_video_exoplayer.this.f19432t.getVideoSurfaceView().getWidth();
                            layoutParams.height = t_video_exoplayer.this.f19432t.getVideoSurfaceView().getHeight();
                            ((LinearLayout) t_video_exoplayer.this.findViewById(R.id.ll_btns)).setLayoutParams(layoutParams);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        t_video_exoplayer.this.findViewById(R.id.ll_btns).setVisibility(0);
                        new C5643e(t_video_exoplayer.this.f19411B, null).execute(new String[0]);
                    }
                }
            }
        });
        SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
        int i = sharedPreferences.getInt("appnext_video_n", 0) + 1;
        Editor edit = sharedPreferences.edit();
        edit.putInt("appnext_video_n", i);
        edit.commit();
        if (this.f19413a.f18005ch.equals("") || i < this.f19413a.f18007cj || (i - this.f19413a.f18007cj) % this.f19413a.f18006ci != 0) {
            m24290g();
            return;
        }
        this.f19410A = true;
        new C5915a().execute(new String[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m24290g() {
        this.f19410A = false;
        this.f19432t.setControllerAutoShow(true);
        this.f19438z = Uri.parse(this.f19414b.getString("url"));
        if (this.f19413a.f18039dX) {
            setRequestedOrientation(0);
        }
        if (this.f19413a.f18038dW) {
            m24293j();
        }
        MediaSource a = m24282a(this.f19438z, "", null, null);
        findViewById(R.id.pb_video).setVisibility(0);
        this.f19431s.prepare(a);
        this.f19431s.setPlayWhenReady(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m24291h() {
        String encode = Uri.encode(this.f19438z.toString());
        try {
            encode = Base64.encodeToString(encode.getBytes(C2793C.UTF8_NAME), 0);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String str = "0";
        if (this.f19428p) {
            str = "1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("http://cast.e-droid.net/?st=");
        sb.append(encode);
        sb.append("&esstr=");
        sb.append(str);
        sb.append("&idl=");
        sb.append(Locale.getDefault().getLanguage());
        sb.append("&v=");
        sb.append(this.f19413a.f18041dZ);
        sb.append("&ts=");
        sb.append(TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis()));
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.setPackage("com.android.chrome");
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            intent.setPackage(null);
            startActivity(intent);
        }
    }

    /* renamed from: a */
    private void m24285a(boolean z) {
        int i = 0;
        if (z) {
            findViewById(R.id.ll_ad).setVisibility(8);
            ((ViewGroup) findViewById(R.id.ll_princ)).getChildAt(0).setVisibility(8);
            ((PlaybackControlView) this.f19432t.findViewById(R.id.exo_controller)).hide();
        } else {
            if (!(this.f19436x == -1 || this.f19437y == -1)) {
                findViewById(R.id.ll_ad).setVisibility(this.f19436x);
                ((ViewGroup) findViewById(R.id.ll_princ)).getChildAt(0).setVisibility(this.f19437y);
            }
            ((PlaybackControlView) this.f19432t.findViewById(R.id.exo_controller)).show();
        }
        boolean z2 = true;
        if (VERSION.SDK_INT >= 16) {
            z2 = ViewConfiguration.get(this).hasPermanentMenuKey();
        }
        if (!z2) {
            if (z) {
                i = 6;
            }
            getWindow().getDecorView().setSystemUiVisibility(i);
        } else if (z) {
            getWindow().setFlags(C1245d.f3947iP, C1245d.f3947iP);
        } else {
            getWindow().clearFlags(C1245d.f3947iP);
        }
    }

    /* renamed from: i */
    private void m24292i() {
        this.f19435w = (FrameLayout) ((PlaybackControlView) this.f19432t.findViewById(R.id.exo_controller)).findViewById(R.id.exo_fullscreen_button);
        this.f19435w.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!t_video_exoplayer.this.f19434v.booleanValue()) {
                    t_video_exoplayer.this.m24293j();
                } else {
                    t_video_exoplayer.this.m24294k();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m24293j() {
        if (!this.f19410A && !this.f19434v.booleanValue()) {
            this.f19434v = Boolean.valueOf(true);
            m24285a(this.f19434v.booleanValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m24294k() {
        if (!this.f19410A && this.f19434v.booleanValue()) {
            this.f19434v = Boolean.valueOf(false);
            m24285a(this.f19434v.booleanValue());
        }
    }

    /* renamed from: b */
    private DataSource.Factory m24286b(boolean z) {
        return new DefaultDataSourceFactory((Context) this, this.f19423k, (TransferListener<? super DataSource>) new DefaultBandwidthMeter<Object>());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public MediaSource m24282a(Uri uri, String str, Handler handler, MediaSourceEventListener mediaSourceEventListener) {
        int i;
        if (TextUtils.isEmpty(str)) {
            i = Util.inferContentType(uri);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(".");
            sb.append(str);
            i = Util.inferContentType(sb.toString());
        }
        DefaultDataSourceFactory defaultDataSourceFactory = new DefaultDataSourceFactory((Context) this, this.f19423k, (TransferListener<? super DataSource>) new DefaultBandwidthMeter<Object>());
        switch (i) {
            case 0:
                return new DashMediaSource.Factory(new DefaultDashChunkSource.Factory(defaultDataSourceFactory), m24286b(false)).createMediaSource(uri, handler, mediaSourceEventListener);
            case 1:
                return new SsMediaSource.Factory(new DefaultSsChunkSource.Factory(defaultDataSourceFactory), m24286b(false)).createMediaSource(uri, handler, mediaSourceEventListener);
            case 2:
                return new HlsMediaSource.Factory((DataSource.Factory) defaultDataSourceFactory).createMediaSource(uri, handler, mediaSourceEventListener);
            case 3:
                return new ExtractorMediaSource.Factory(defaultDataSourceFactory).createMediaSource(uri, handler, mediaSourceEventListener);
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unsupported type: ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
        }
    }

    public void onClick(View view) {
        if ((this.f19413a.f17986cO == null || this.f19413a.f17986cO.equals("")) && ((this.f19413a.f17985cN == null || this.f19413a.f17985cN.equals("")) && ((this.f19413a.f17988cQ == null || this.f19413a.f17988cQ.equals("")) && (this.f19413a.f17989cR == null || this.f19413a.f17989cR.equals(""))))) {
            abrir_secc(view);
            return;
        }
        if (this.f19413a.f17986cO != null && !this.f19413a.f17986cO.equals("")) {
            this.f19417e = new RewardedVideo((Context) this, this.f19413a.f17986cO);
        }
        if (this.f19413a.f17985cN != null && !this.f19413a.f17985cN.equals("")) {
            this.f19416d = C2997g.m10716a(this);
        }
        if (this.f19413a.f17988cQ != null && !this.f19413a.f17988cQ.equals("")) {
            this.f19418f = new RewardedVideoAd(this, this.f19413a.f17988cQ);
        }
        if (this.f19413a.f17989cR != null && !this.f19413a.f17989cR.equals("")) {
            this.f19419g = new StartAppAd(this);
        }
        this.f19425m = new ProgressDialog(this);
        this.f19424l = view;
        if (!this.f19413a.mo20774a((Context) this, view, this.f19422j, this.f19425m, this.f19416d, this.f19417e, this.f19418f, this.f19419g)) {
            abrir_secc(view);
        }
    }

    public void abrir_secc(View view) {
        C5662h a = this.f19413a.mo20761a(view, (Context) this);
        if (a.f18227b) {
            this.f19427o = true;
            Intent intent = new Intent();
            intent.putExtra("finalizar", true);
            intent.putExtra("finalizar_app", a.f18228c);
            setResult(-1, intent);
        }
        if (a.f18229d) {
            startActivityForResult(a.f18226a, 0);
        } else if (a.f18226a != null) {
            if (a.f18227b && this.f19413a.f18045dm != 2) {
                a.f18226a.putExtra("es_root", true);
            }
            this.f19430r = false;
            startActivity(a.f18226a);
        }
        if (this.f19427o && !this.f19421i) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && intent.hasExtra("finalizar") && intent.getExtras().getBoolean("finalizar")) {
            if (!intent.getExtras().getBoolean("finalizar_app")) {
                this.f19430r = false;
            }
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21451f() {
        int b = this.f19413a.mo20778b((Context) this);
        if (this.f19413a.f18045dm == 1) {
            this.f19426n = (ListView) findViewById(R.id.left_drawer);
            this.f19413a.mo20771a(this.f19426n);
        } else if (this.f19413a.f18045dm == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f19413a.f17971bz.length; i2++) {
                if (!this.f19413a.f17971bz[i2].f18333z) {
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
        for (int i3 = 0; i3 < this.f19413a.f17923bD.length; i3++) {
            if (this.f19413a.f17923bD[i3] > 0) {
                findViewById(this.f19413a.f17923bD[i3]).setOnClickListener(this);
            }
        }
    }

    public boolean onSearchRequested() {
        if (this.f19413a.f18080q == 0) {
            return false;
        }
        this.f19427o = true;
        this.f19421i = true;
        return super.onSearchRequested();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 102 && config.m23853d() && iArr.length > 0 && strArr[0].equals("android.permission.WRITE_EXTERNAL_STORAGE") && iArr[0] == 0 && getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", getPackageName()) == 0) {
            SharedPreferences sharedPreferences = getSharedPreferences("sh", 0);
            this.f19413a.mo20773a(sharedPreferences.getString("descarga_url", ""), sharedPreferences.getString("descarga_mimetype", ""), sharedPreferences.getString("descarga_nombre", ""), (Context) this);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }

    public void onPause() {
        if (!(this.f19413a.f18013cx == 0 || this.f19415c == null || this.f19415c.f17768a == null)) {
            this.f19415c.f17768a.mo12167b();
        }
        super.onPause();
        try {
            this.f19431s.setPlayWhenReady(false);
        } catch (Exception unused) {
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f19427o && !this.f19421i) {
            finish();
        }
    }

    public void onResume() {
        super.onResume();
        config.m23860m(this);
        try {
            this.f19431s.setPlayWhenReady(true);
        } catch (Exception unused) {
        }
        if (!(this.f19413a.f18013cx == 0 || this.f19415c == null || this.f19415c.f17768a == null)) {
            this.f19415c.f17768a.mo12165a();
        }
        if (this.f19436x == -1) {
            this.f19436x = findViewById(R.id.ll_ad).getVisibility();
            this.f19437y = ((ViewGroup) findViewById(R.id.ll_princ)).getChildAt(0).getVisibility();
            if (this.f19413a.f18038dW) {
                m24293j();
            }
        }
    }

    public void onDestroy() {
        if (!(this.f19413a.f18013cx == 0 || this.f19415c == null || this.f19415c.f17768a == null)) {
            this.f19415c.f17768a.mo12168c();
        }
        if (!(this.f19413a.f18013cx == 0 || this.f19415c == null || this.f19415c.f17769b == null)) {
            this.f19415c.f17769b.destroy();
        }
        try {
            this.f19431s.release();
        } catch (Exception unused) {
        }
        if ((this.f19430r && isFinishing()) || config.f17841i) {
            config.m23861n(this);
        }
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((LinearLayout) findViewById(R.id.ll_princ)).removeViewAt(0);
        mo21451f();
        if (this.f19413a.f18045dm == 1) {
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
        if (!(this.f19415c == null || this.f19415c.f17768a == null)) {
            try {
                this.f19415c.f17768a.mo12168c();
            } catch (Exception unused) {
            }
        }
        if (!(this.f19415c == null || this.f19415c.f17769b == null)) {
            try {
                this.f19415c.f17769b.destroy();
            } catch (Exception unused2) {
            }
        }
        this.f19415c = this.f19413a.mo20760a((Context) this, false);
        if (this.f19434v.booleanValue()) {
            findViewById(R.id.ll_ad).setVisibility(8);
            ((ViewGroup) findViewById(R.id.ll_princ)).getChildAt(0).setVisibility(8);
        }
        if (this.f19410A) {
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    try {
                        LayoutParams layoutParams = t_video_exoplayer.this.findViewById(R.id.ll_btns).getLayoutParams();
                        layoutParams.width = t_video_exoplayer.this.f19432t.getVideoSurfaceView().getWidth();
                        layoutParams.height = t_video_exoplayer.this.f19432t.getVideoSurfaceView().getHeight();
                        ((LinearLayout) t_video_exoplayer.this.findViewById(R.id.ll_btns)).setLayoutParams(layoutParams);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, 200);
        }
    }

    public void onBackPressed() {
        if (!this.f19430r || this.f19429q || !this.f19413a.f18059ea) {
            super.onBackPressed();
            return;
        }
        this.f19429q = true;
        config.m23859l(this);
    }

    public void adLoaded(String str) {
        this.f19425m.cancel();
        this.f19417e.showAd();
    }

    public void onAdClosed() {
        if (this.f19420h) {
            abrir_secc(this.f19424l);
        }
    }

    public void adError(String str) {
        this.f19425m.cancel();
        abrir_secc(this.f19424l);
    }

    public void videoEnded() {
        this.f19420h = true;
        config.m23867t(this);
    }

    /* renamed from: z_ */
    public void mo9678z_() {
        this.f19425m.cancel();
        this.f19416d.mo12836a();
    }

    /* renamed from: a */
    public void mo9675a(C3165a aVar) {
        this.f19420h = true;
        config.m23867t(this);
    }

    /* renamed from: A_ */
    public void mo9671A_() {
        if (this.f19420h) {
            abrir_secc(this.f19424l);
        }
    }

    /* renamed from: e */
    public void mo9676e() {
        this.f19420h = false;
    }

    /* renamed from: a */
    public void mo9674a(int i) {
        if (!this.f19413a.mo20775a((Context) this, this.f19417e)) {
            this.f19425m.cancel();
            abrir_secc(this.f19424l);
        }
    }

    public void onError(C1514Ad ad, AdError adError) {
        this.f19425m.cancel();
        abrir_secc(this.f19424l);
    }

    public void onAdLoaded(C1514Ad ad) {
        this.f19425m.cancel();
        this.f19418f.show();
    }

    public void onRewardedVideoCompleted() {
        this.f19420h = true;
        config.m23867t(this);
    }

    public void onRewardedVideoClosed() {
        if (this.f19420h) {
            abrir_secc(this.f19424l);
        }
    }

    public void onVideoCompleted() {
        this.f19420h = true;
        config.m23867t(this);
    }

    public void onReceiveAd(C5286Ad ad) {
        this.f19425m.cancel();
        this.f19419g.showAd("REWARDED VIDEO", new AdDisplayListener() {
            public void adClicked(C5286Ad ad) {
            }

            public void adDisplayed(C5286Ad ad) {
            }

            public void adNotDisplayed(C5286Ad ad) {
            }

            public void adHidden(C5286Ad ad) {
                if (t_video_exoplayer.this.f19420h) {
                    t_video_exoplayer.this.abrir_secc(t_video_exoplayer.this.f19424l);
                }
            }
        });
    }

    public void onFailedToReceiveAd(C5286Ad ad) {
        this.f19425m.cancel();
        abrir_secc(this.f19424l);
    }
}
