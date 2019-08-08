package mega.boicot;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.support.p017v4.app.C0301u.C0302a;
import android.support.p017v4.app.C0301u.C0302a.C0303a;
import android.support.p017v4.app.C0301u.C0305c;
import android.text.TextUtils;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.DefaultDashChunkSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.DefaultSsChunkSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.Factory;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.util.Timer;
import java.util.TimerTask;

public class s_mediaplayer_exo extends Service implements OnAudioFocusChangeListener, OnCompletionListener, OnErrorListener {

    /* renamed from: p */
    protected static final Handler f20198p = new Handler();

    /* renamed from: r */
    protected static final Handler f20199r = new Handler();

    /* renamed from: t */
    protected static final Handler f20200t = new Handler();

    /* renamed from: v */
    protected static final Handler f20201v = new Handler();

    /* renamed from: a */
    SimpleExoPlayer f20202a;

    /* renamed from: b */
    SharedPreferences f20203b;

    /* renamed from: c */
    SharedPreferences f20204c;

    /* renamed from: d */
    Editor f20205d;

    /* renamed from: e */
    Editor f20206e;

    /* renamed from: f */
    WifiLock f20207f;

    /* renamed from: g */
    boolean f20208g = true;

    /* renamed from: h */
    boolean f20209h = false;

    /* renamed from: i */
    String f20210i;

    /* renamed from: j */
    String f20211j;

    /* renamed from: k */
    String f20212k = "";

    /* renamed from: l */
    int f20213l = 0;

    /* renamed from: m */
    int f20214m = 0;

    /* renamed from: n */
    C5997f f20215n;

    /* renamed from: o */
    Timer f20216o;

    /* renamed from: q */
    protected Runnable f20217q = new Runnable() {
        public void run() {
            s_mediaplayer_exo.this.m24573e();
            s_mediaplayer_exo.f20198p.postDelayed(this, 200);
        }
    };

    /* renamed from: s */
    protected Runnable f20218s = new Runnable() {
        public void run() {
            s_mediaplayer_exo.this.m24574f();
        }
    };

    /* renamed from: u */
    protected Runnable f20219u = new Runnable() {
        public void run() {
            if (s_mediaplayer_exo.this.f20209h) {
                s_mediaplayer_exo.this.startForeground(4, s_mediaplayer_exo.this.m24560a(s_mediaplayer_exo.this.f20212k));
            }
        }
    };

    /* renamed from: w */
    protected Runnable f20220w = new Runnable() {
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r2 = this;
                mega.boicot.s_mediaplayer_exo r0 = mega.boicot.s_mediaplayer_exo.this
                r0.m24574f()
                mega.boicot.s_mediaplayer_exo r0 = mega.boicot.s_mediaplayer_exo.this     // Catch:{ Exception -> 0x000c }
                com.google.android.exoplayer2.SimpleExoPlayer r0 = r0.f20202a     // Catch:{ Exception -> 0x000c }
                r0.release()     // Catch:{ Exception -> 0x000c }
            L_0x000c:
                mega.boicot.s_mediaplayer_exo r0 = mega.boicot.s_mediaplayer_exo.this     // Catch:{ Exception -> 0x0011 }
                r1 = 0
                r0.f20202a = r1     // Catch:{ Exception -> 0x0011 }
            L_0x0011:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mega.boicot.s_mediaplayer_exo.C60925.run():void");
        }
    };

    /* renamed from: x */
    private AudioManager f20221x;

    public IBinder onBind(Intent intent) {
        return null;
    }

    /* renamed from: a */
    private void m24564a() {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) getSystemService("connectivity")).getNetworkInfo(1);
        } catch (Exception unused) {
            networkInfo = null;
        }
        int i = (networkInfo == null || !networkInfo.isConnected()) ? 10000 : 5000;
        this.f20216o = new Timer();
        this.f20216o.schedule(new TimerTask() {
            /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.String] */
            /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String] */
            /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.String] */
            /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.String] */
            /* JADX WARNING: type inference failed for: r0v18, types: [java.lang.String] */
            /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.String] */
            /* JADX WARNING: type inference failed for: r1v10 */
            /* JADX WARNING: type inference failed for: r1v11 */
            /* JADX WARNING: type inference failed for: r1v12, types: [java.lang.String] */
            /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.String] */
            /* JADX WARNING: type inference failed for: r1v15, types: [java.lang.String] */
            /* JADX WARNING: type inference failed for: r1v16 */
            /* JADX WARNING: type inference failed for: r4v7, types: [mega.boicot.s_mediaplayer_exo] */
            /* JADX WARNING: type inference failed for: r4v8 */
            /* JADX WARNING: type inference failed for: r8v0 */
            /* JADX WARNING: type inference failed for: r1v18 */
            /* JADX WARNING: type inference failed for: r4v10 */
            /* JADX WARNING: type inference failed for: r2v6 */
            /* JADX WARNING: type inference failed for: r1v19 */
            /* JADX WARNING: type inference failed for: r4v11 */
            /* JADX WARNING: type inference failed for: r4v13 */
            /* JADX WARNING: type inference failed for: r4v14 */
            /* JADX WARNING: type inference failed for: r4v16 */
            /* JADX WARNING: type inference failed for: r4v19, types: [java.lang.String] */
            /* JADX WARNING: type inference failed for: r1v28, types: [java.lang.String] */
            /* JADX WARNING: type inference failed for: r2v7 */
            /* JADX WARNING: type inference failed for: r1v29 */
            /* JADX WARNING: type inference failed for: r2v8 */
            /* JADX WARNING: type inference failed for: r2v9 */
            /* JADX WARNING: type inference failed for: r2v10 */
            /* JADX WARNING: type inference failed for: r1v30 */
            /* JADX WARNING: type inference failed for: r1v31 */
            /* JADX WARNING: type inference failed for: r1v32 */
            /* JADX WARNING: type inference failed for: r4v20 */
            /* JADX WARNING: type inference failed for: r2v11 */
            /* JADX WARNING: type inference failed for: r4v21 */
            /* JADX WARNING: type inference failed for: r4v22 */
            /* JADX WARNING: type inference failed for: r4v23 */
            /* JADX WARNING: type inference failed for: r4v24 */
            /* JADX WARNING: type inference failed for: r4v25 */
            /* JADX WARNING: type inference failed for: r4v26 */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v16
              assigns: []
              uses: []
              mth insns count: 132
            	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
            	at jadx.core.ProcessClass.process(ProcessClass.java:35)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
             */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x005d  */
            /* JADX WARNING: Removed duplicated region for block: B:57:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            /* JADX WARNING: Unknown variable types count: 16 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r9 = this;
                    mega.boicot.s_mediaplayer_exo r0 = mega.boicot.s_mediaplayer_exo.this
                    boolean r0 = r0.f20208g
                    if (r0 == 0) goto L_0x00f9
                    mega.boicot.s_mediaplayer_exo r0 = mega.boicot.s_mediaplayer_exo.this
                    boolean r0 = r0.f20209h
                    if (r0 == 0) goto L_0x00f9
                    mega.boicot.s_mediaplayer_exo r0 = mega.boicot.s_mediaplayer_exo.this
                    int r0 = r0.f20214m
                    if (r0 <= 0) goto L_0x00f9
                    r0 = 0
                    java.lang.String r1 = ""
                    java.lang.String r2 = ""
                    r3 = 1
                    mega.boicot.s_mediaplayer_exo r4 = mega.boicot.s_mediaplayer_exo.this     // Catch:{ MalformedURLException -> 0x0057 }
                    mega.boicot.f r5 = new mega.boicot.f     // Catch:{ MalformedURLException -> 0x0057 }
                    java.net.URL r6 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0057 }
                    mega.boicot.s_mediaplayer_exo r7 = mega.boicot.s_mediaplayer_exo.this     // Catch:{ MalformedURLException -> 0x0057 }
                    java.lang.String r7 = r7.f20210i     // Catch:{ MalformedURLException -> 0x0057 }
                    r6.<init>(r7)     // Catch:{ MalformedURLException -> 0x0057 }
                    r5.<init>(r6)     // Catch:{ MalformedURLException -> 0x0057 }
                    r4.f20215n = r5     // Catch:{ MalformedURLException -> 0x0057 }
                    mega.boicot.s_mediaplayer_exo r4 = mega.boicot.s_mediaplayer_exo.this     // Catch:{ IOException -> 0x0048, StringIndexOutOfBoundsException -> 0x0040 }
                    mega.boicot.f r4 = r4.f20215n     // Catch:{ IOException -> 0x0048, StringIndexOutOfBoundsException -> 0x0040 }
                    java.lang.String r4 = r4.mo21733a()     // Catch:{ IOException -> 0x0048, StringIndexOutOfBoundsException -> 0x0040 }
                    mega.boicot.s_mediaplayer_exo r1 = mega.boicot.s_mediaplayer_exo.this     // Catch:{ IOException -> 0x003e, StringIndexOutOfBoundsException -> 0x003c }
                    mega.boicot.f r1 = r1.f20215n     // Catch:{ IOException -> 0x003e, StringIndexOutOfBoundsException -> 0x003c }
                    java.lang.String r1 = r1.mo21735b()     // Catch:{ IOException -> 0x003e, StringIndexOutOfBoundsException -> 0x003c }
                    r2 = r1
                    goto L_0x004f
                L_0x003c:
                    r1 = move-exception
                    goto L_0x0044
                L_0x003e:
                    r1 = move-exception
                    goto L_0x004c
                L_0x0040:
                    r4 = move-exception
                    r8 = r4
                    r4 = r1
                    r1 = r8
                L_0x0044:
                    r1.printStackTrace()     // Catch:{ MalformedURLException -> 0x0052 }
                    goto L_0x004f
                L_0x0048:
                    r4 = move-exception
                    r8 = r4
                    r4 = r1
                    r1 = r8
                L_0x004c:
                    r1.printStackTrace()     // Catch:{ MalformedURLException -> 0x0052 }
                L_0x004f:
                    r0 = r3
                    r1 = r4
                    goto L_0x005b
                L_0x0052:
                    r1 = move-exception
                    r8 = r4
                    r4 = r1
                    r1 = r8
                    goto L_0x0058
                L_0x0057:
                    r4 = move-exception
                L_0x0058:
                    r4.printStackTrace()
                L_0x005b:
                    if (r0 == 0) goto L_0x00f9
                    mega.boicot.s_mediaplayer_exo r0 = mega.boicot.s_mediaplayer_exo.this
                    com.google.android.exoplayer2.SimpleExoPlayer r0 = r0.f20202a
                    if (r0 == 0) goto L_0x00f9
                    mega.boicot.s_mediaplayer_exo r0 = mega.boicot.s_mediaplayer_exo.this
                    boolean r0 = r0.m24568b()
                    if (r0 == 0) goto L_0x00f9
                    mega.boicot.s_mediaplayer_exo r0 = mega.boicot.s_mediaplayer_exo.this
                    android.content.SharedPreferences$Editor r0 = r0.f20206e
                    java.lang.String r4 = "t_radio_artist"
                    r0.putString(r4, r1)
                    mega.boicot.s_mediaplayer_exo r0 = mega.boicot.s_mediaplayer_exo.this
                    android.content.SharedPreferences$Editor r0 = r0.f20206e
                    java.lang.String r4 = "t_radio_song"
                    r0.putString(r4, r2)
                    mega.boicot.s_mediaplayer_exo r0 = mega.boicot.s_mediaplayer_exo.this
                    android.content.SharedPreferences$Editor r0 = r0.f20206e
                    r0.commit()
                    java.lang.String r0 = ""
                    mega.boicot.s_mediaplayer_exo r4 = mega.boicot.s_mediaplayer_exo.this
                    int r4 = r4.f20214m
                    if (r4 != r3) goto L_0x00bd
                    java.lang.String r0 = ""
                    boolean r0 = r1.equals(r0)
                    if (r0 != 0) goto L_0x00ad
                    java.lang.String r0 = ""
                    boolean r0 = r2.equals(r0)
                    if (r0 != 0) goto L_0x00ad
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    java.lang.String r1 = " - "
                    r0.append(r1)
                    java.lang.String r1 = r0.toString()
                L_0x00ad:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    r0.append(r2)
                    java.lang.String r1 = r0.toString()
                    goto L_0x00cf
                L_0x00bd:
                    mega.boicot.s_mediaplayer_exo r3 = mega.boicot.s_mediaplayer_exo.this
                    int r3 = r3.f20214m
                    r4 = 2
                    if (r3 != r4) goto L_0x00c5
                    goto L_0x00cf
                L_0x00c5:
                    mega.boicot.s_mediaplayer_exo r1 = mega.boicot.s_mediaplayer_exo.this
                    int r1 = r1.f20214m
                    r3 = 3
                    if (r1 != r3) goto L_0x00ce
                    r1 = r2
                    goto L_0x00cf
                L_0x00ce:
                    r1 = r0
                L_0x00cf:
                    java.lang.String r0 = r1.trim()
                    java.lang.String r1 = ""
                    boolean r1 = r0.equals(r1)
                    if (r1 == 0) goto L_0x00df
                    mega.boicot.s_mediaplayer_exo r0 = mega.boicot.s_mediaplayer_exo.this
                    java.lang.String r0 = r0.f20211j
                L_0x00df:
                    mega.boicot.s_mediaplayer_exo r1 = mega.boicot.s_mediaplayer_exo.this
                    java.lang.String r2 = "notification"
                    java.lang.Object r1 = r1.getSystemService(r2)
                    android.app.NotificationManager r1 = (android.app.NotificationManager) r1
                    mega.boicot.s_mediaplayer_exo r2 = mega.boicot.s_mediaplayer_exo.this
                    boolean r2 = r2.f20209h
                    if (r2 == 0) goto L_0x00f9
                    r2 = 4
                    mega.boicot.s_mediaplayer_exo r3 = mega.boicot.s_mediaplayer_exo.this
                    android.app.Notification r0 = r3.m24560a(r0)
                    r1.notify(r2, r0)
                L_0x00f9:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: mega.boicot.s_mediaplayer_exo.C60914.run():void");
            }
        }, 0, (long) i);
    }

    public void onCreate() {
        this.f20203b = getSharedPreferences("sh_mp", 0);
        this.f20204c = getSharedPreferences("sh_mc", 0);
        this.f20205d = this.f20203b.edit();
        this.f20206e = this.f20204c.edit();
        this.f20221x = (AudioManager) getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (VERSION.SDK_INT >= 12) {
            this.f20207f = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(3, "acwifilock");
        } else {
            this.f20207f = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(1, "acwifilock");
        }
        f20198p.postDelayed(this.f20217q, 200);
        m24564a();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            stopSelf();
        } else {
            String stringExtra = intent.getStringExtra("accion");
            String stringExtra2 = intent.getStringExtra("url");
            String stringExtra3 = intent.getStringExtra("ua");
            this.f20213l = intent.getIntExtra("idsecc", 0);
            this.f20214m = intent.getIntExtra("radio_mostrar", 0);
            this.f20211j = intent.getStringExtra("secc_tit");
            this.f20208g = intent.getBooleanExtra("esStream", true);
            if (stringExtra.equals("iniciar")) {
                m24565a(stringExtra2, stringExtra3);
            } else if (stringExtra.equals("play")) {
                if (!intent.hasExtra("desde_notif")) {
                    if (this.f20202a == null) {
                        m24565a(stringExtra2, stringExtra3);
                    } else {
                        try {
                            this.f20202a.setPlayWhenReady(true);
                            m24569c();
                        } catch (Exception unused) {
                        }
                        f20199r.postDelayed(this.f20218s, 200);
                    }
                } else if (this.f20202a != null) {
                    try {
                        this.f20202a.setPlayWhenReady(true);
                    } catch (Exception unused2) {
                    }
                    f20199r.postDelayed(this.f20218s, 200);
                    f20200t.postDelayed(this.f20219u, 200);
                }
            } else if (stringExtra.equals("pause")) {
                try {
                    this.f20202a.setPlayWhenReady(false);
                } catch (Exception unused3) {
                }
                if (!intent.hasExtra("desde_notif")) {
                    if (this.f20208g) {
                        f20201v.postDelayed(this.f20220w, 200);
                    } else {
                        f20199r.postDelayed(this.f20218s, 200);
                    }
                    m24571d();
                } else {
                    f20200t.postDelayed(this.f20219u, 200);
                    f20199r.postDelayed(this.f20218s, 200);
                }
            } else if (stringExtra.equals("stop")) {
                if (intent.hasExtra("desde_notif")) {
                    try {
                        this.f20202a.stop();
                    } catch (Exception unused4) {
                    }
                    if (this.f20208g) {
                        f20201v.postDelayed(this.f20220w, 200);
                    } else {
                        f20199r.postDelayed(this.f20218s, 200);
                    }
                    m24571d();
                }
            } else if (stringExtra.equals("seekto")) {
                try {
                    this.f20202a.seekTo((long) intent.getIntExtra("valor", 0));
                } catch (Exception unused5) {
                }
                f20199r.postDelayed(this.f20218s, 200);
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m24568b() {
        return this.f20202a.getPlayWhenReady() && this.f20202a.getPlaybackState() == 3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(1:7)|8|9) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24565a(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            com.google.android.exoplayer2.SimpleExoPlayer r0 = r8.f20202a
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = r8.f20210i     // Catch:{ Exception -> 0x0013 }
            boolean r0 = r9.equals(r0)     // Catch:{ Exception -> 0x0013 }
            if (r0 == 0) goto L_0x0013
            boolean r0 = r8.m24568b()     // Catch:{ Exception -> 0x0013 }
            if (r0 == 0) goto L_0x0013
            return
        L_0x0013:
            com.google.android.exoplayer2.SimpleExoPlayer r0 = r8.f20202a     // Catch:{ Exception -> 0x0018 }
            r0.release()     // Catch:{ Exception -> 0x0018 }
        L_0x0018:
            r8.f20210i = r9
            com.google.android.exoplayer2.upstream.DefaultBandwidthMeter r0 = new com.google.android.exoplayer2.upstream.DefaultBandwidthMeter
            r0.<init>()
            com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$Factory r1 = new com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$Factory
            r1.<init>(r0)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r0 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector
            r0.<init>(r1)
            com.google.android.exoplayer2.SimpleExoPlayer r0 = com.google.android.exoplayer2.ExoPlayerFactory.newSimpleInstance(r8, r0)
            r8.f20202a = r0
            android.os.Handler r0 = f20199r     // Catch:{ Exception -> 0x0038 }
            java.lang.Runnable r1 = r8.f20218s     // Catch:{ Exception -> 0x0038 }
            r2 = 200(0xc8, double:9.9E-322)
            r0.postDelayed(r1, r2)     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            com.google.android.exoplayer2.SimpleExoPlayer r0 = r8.f20202a
            mega.boicot.s_mediaplayer_exo$6 r1 = new mega.boicot.s_mediaplayer_exo$6
            r1.<init>()
            r0.addListener(r1)
            android.net.Uri r3 = android.net.Uri.parse(r9)
            java.lang.String r4 = ""
            r5 = 0
            r6 = 0
            r2 = r8
            r7 = r10
            com.google.android.exoplayer2.source.MediaSource r9 = r2.m24562a(r3, r4, r5, r6, r7)
            if (r9 == 0) goto L_0x005d
            com.google.android.exoplayer2.SimpleExoPlayer r10 = r8.f20202a
            r10.prepare(r9)
            com.google.android.exoplayer2.SimpleExoPlayer r9 = r8.f20202a
            r10 = 1
            r9.setPlayWhenReady(r10)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.s_mediaplayer_exo.m24565a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    private Factory m24563a(boolean z, String str) {
        DefaultBandwidthMeter defaultBandwidthMeter = new DefaultBandwidthMeter();
        StringBuilder sb = new StringBuilder();
        sb.append("stagefright/1.2 (Linux;Android ");
        sb.append(VERSION.RELEASE);
        sb.append(")");
        String sb2 = sb.toString();
        if (str == null || str.isEmpty()) {
            str = sb2;
        }
        return new DefaultDataSourceFactory((Context) this, str, (TransferListener<? super DataSource>) defaultBandwidthMeter);
    }

    /* renamed from: a */
    private MediaSource m24562a(Uri uri, String str, Handler handler, MediaSourceEventListener mediaSourceEventListener, String str2) {
        int i;
        if (TextUtils.isEmpty(str)) {
            i = Util.inferContentType(uri);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(".");
            sb.append(str);
            i = Util.inferContentType(sb.toString());
        }
        DefaultBandwidthMeter defaultBandwidthMeter = new DefaultBandwidthMeter();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("stagefright/1.2 (Linux;Android ");
        sb2.append(VERSION.RELEASE);
        sb2.append(")");
        String sb3 = sb2.toString();
        if (str2 != null && !str2.isEmpty()) {
            sb3 = str2;
        }
        DefaultDataSourceFactory defaultDataSourceFactory = new DefaultDataSourceFactory((Context) this, sb3, (TransferListener<? super DataSource>) defaultBandwidthMeter);
        switch (i) {
            case 0:
                return new DashMediaSource.Factory(new DefaultDashChunkSource.Factory(defaultDataSourceFactory), m24563a(false, str2)).createMediaSource(uri, handler, mediaSourceEventListener);
            case 1:
                return new SsMediaSource.Factory(new DefaultSsChunkSource.Factory(defaultDataSourceFactory), m24563a(false, str2)).createMediaSource(uri, handler, mediaSourceEventListener);
            case 2:
                return new HlsMediaSource.Factory((Factory) defaultDataSourceFactory).createMediaSource(uri, handler, mediaSourceEventListener);
            case 3:
                return new ExtractorMediaSource.Factory(defaultDataSourceFactory).createMediaSource(uri, handler, mediaSourceEventListener);
            default:
                return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Notification m24560a(String str) {
        C0305c cVar;
        Intent intent = new Intent(getApplicationContext(), preinicio.class);
        if (VERSION.SDK_INT >= 11) {
            intent.setFlags(268468224);
        }
        if (this.f20213l != 0) {
            intent.putExtra("notif_id", "0");
            intent.putExtra("notif_tipo", "1");
            StringBuilder sb = new StringBuilder();
            sb.append(this.f20213l);
            sb.append("");
            intent.putExtra("notif_idelem", sb.toString());
        }
        String str2 = "";
        try {
            str2 = mo21975a((Context) this);
        } catch (Exception unused) {
        }
        if (str2.equals("")) {
            str2 = "Playing";
        }
        PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), 0, intent, 134217728);
        if (VERSION.SDK_INT >= 26) {
            cVar = new C0305c(this, config.m23850c((Context) this, 0).getId());
        } else {
            cVar = new C0305c(this);
        }
        Intent intent2 = new Intent(this, s_mediaplayer_exo.class);
        intent2.putExtra("accion", "pause");
        intent2.putExtra("desde_notif", "1");
        C0302a a = new C0303a(R.drawable.pause, "Pause", PendingIntent.getService(this, 999995, intent2, 134217728)).mo1052a();
        Intent intent3 = new Intent(this, s_mediaplayer_exo.class);
        intent3.putExtra("accion", "play");
        intent3.putExtra("desde_notif", "1");
        C0302a a2 = new C0303a(R.drawable.play_audio, "Play", PendingIntent.getService(this, 999996, intent3, 134217728)).mo1052a();
        Intent intent4 = new Intent(this, s_mediaplayer_exo.class);
        intent4.putExtra("accion", "stop");
        intent4.putExtra("desde_notif", "1");
        C0302a a3 = new C0303a(R.drawable.cerrar_cruz, "Stop", PendingIntent.getService(this, 999997, intent4, 134217728)).mo1052a();
        cVar.mo1075c((CharSequence) str2).mo1065a((CharSequence) str2).mo1071b((CharSequence) str).mo1056a((int) R.drawable.play).mo1060a(activity).mo1076c(true);
        if (this.f20202a == null || !m24568b()) {
            cVar.mo1063a(a2);
        } else {
            cVar.mo1063a(a);
        }
        cVar.mo1063a(a3);
        Notification b = cVar.mo1068b();
        this.f20212k = str;
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m24569c() {
        this.f20221x.requestAudioFocus(this, 3, 1);
        startForeground(4, m24560a(this.f20211j));
        this.f20209h = true;
        this.f20207f.acquire();
    }

    /* renamed from: d */
    private void m24571d() {
        try {
            this.f20207f.release();
        } catch (Exception unused) {
        }
        stopForeground(true);
        this.f20209h = false;
        this.f20221x.abandonAudioFocus(this);
    }

    /* renamed from: a */
    public String mo21975a(Context context) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
        } catch (NameNotFoundException unused) {
            applicationInfo = null;
        }
        return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|(6:4|5|6|7|8|9)(1:10)|11|12|14) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|6|7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0024 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m24573e() {
        /*
            r4 = this;
            android.content.SharedPreferences$Editor r0 = r4.f20205d
            if (r0 == 0) goto L_0x003a
            com.google.android.exoplayer2.SimpleExoPlayer r0 = r4.f20202a
            if (r0 == 0) goto L_0x0030
            android.content.SharedPreferences$Editor r0 = r4.f20205d     // Catch:{ Exception -> 0x0016 }
            java.lang.String r1 = "position"
            com.google.android.exoplayer2.SimpleExoPlayer r2 = r4.f20202a     // Catch:{ Exception -> 0x0016 }
            long r2 = r2.getCurrentPosition()     // Catch:{ Exception -> 0x0016 }
            int r2 = (int) r2     // Catch:{ Exception -> 0x0016 }
            r0.putInt(r1, r2)     // Catch:{ Exception -> 0x0016 }
        L_0x0016:
            android.content.SharedPreferences$Editor r0 = r4.f20205d     // Catch:{ Exception -> 0x0024 }
            java.lang.String r1 = "duration"
            com.google.android.exoplayer2.SimpleExoPlayer r2 = r4.f20202a     // Catch:{ Exception -> 0x0024 }
            long r2 = r2.getDuration()     // Catch:{ Exception -> 0x0024 }
            int r2 = (int) r2     // Catch:{ Exception -> 0x0024 }
            r0.putInt(r1, r2)     // Catch:{ Exception -> 0x0024 }
        L_0x0024:
            android.content.SharedPreferences$Editor r0 = r4.f20205d     // Catch:{ Exception -> 0x0035 }
            java.lang.String r1 = "isPlaying"
            boolean r2 = r4.m24568b()     // Catch:{ Exception -> 0x0035 }
            r0.putBoolean(r1, r2)     // Catch:{ Exception -> 0x0035 }
            goto L_0x0035
        L_0x0030:
            android.content.SharedPreferences$Editor r0 = r4.f20205d     // Catch:{ Exception -> 0x0035 }
            r0.clear()     // Catch:{ Exception -> 0x0035 }
        L_0x0035:
            android.content.SharedPreferences$Editor r0 = r4.f20205d     // Catch:{ Exception -> 0x003a }
            r0.commit()     // Catch:{ Exception -> 0x003a }
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.s_mediaplayer_exo.m24573e():void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:19|20|21|22|23|24|25|26|27|(1:30)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0043 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004a */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0053  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m24574f() {
        /*
            r5 = this;
            android.content.SharedPreferences$Editor r0 = r5.f20206e
            r1 = 1
            if (r0 == 0) goto L_0x0016
            android.content.SharedPreferences$Editor r0 = r5.f20206e
            r0.clear()
            android.content.SharedPreferences$Editor r0 = r5.f20206e
            java.lang.String r2 = "act_mc"
            r0.putBoolean(r2, r1)
            android.content.SharedPreferences$Editor r0 = r5.f20206e
            r0.commit()
        L_0x0016:
            com.google.android.exoplayer2.SimpleExoPlayer r0 = r5.f20202a
            r2 = 0
            if (r0 == 0) goto L_0x0020
            boolean r0 = r5.m24568b()     // Catch:{ Exception -> 0x0020 }
            goto L_0x0021
        L_0x0020:
            r0 = r2
        L_0x0021:
            com.google.android.exoplayer2.SimpleExoPlayer r3 = r5.f20202a
            if (r3 == 0) goto L_0x0067
            if (r0 == 0) goto L_0x0067
            boolean r0 = r5.f20209h
            if (r0 != 0) goto L_0x0067
            com.google.android.exoplayer2.SimpleExoPlayer r0 = r5.f20202a     // Catch:{ Exception -> 0x0030 }
            r0.stop()     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            android.content.SharedPreferences$Editor r0 = r5.f20205d
            if (r0 == 0) goto L_0x0064
            android.content.SharedPreferences$Editor r0 = r5.f20205d     // Catch:{ Exception -> 0x003b }
            java.lang.String r3 = "position"
            r0.putInt(r3, r2)     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            android.content.SharedPreferences$Editor r0 = r5.f20205d     // Catch:{ Exception -> 0x0043 }
            java.lang.String r3 = "duration"
            r4 = -1
            r0.putInt(r3, r4)     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            android.content.SharedPreferences$Editor r0 = r5.f20205d     // Catch:{ Exception -> 0x004a }
            java.lang.String r3 = "isPlaying"
            r0.putBoolean(r3, r2)     // Catch:{ Exception -> 0x004a }
        L_0x004a:
            android.content.SharedPreferences$Editor r0 = r5.f20205d     // Catch:{ Exception -> 0x004f }
            r0.commit()     // Catch:{ Exception -> 0x004f }
        L_0x004f:
            android.content.SharedPreferences$Editor r0 = r5.f20206e
            if (r0 == 0) goto L_0x0064
            android.content.SharedPreferences$Editor r0 = r5.f20206e
            r0.clear()
            android.content.SharedPreferences$Editor r0 = r5.f20206e
            java.lang.String r2 = "act_mc"
            r0.putBoolean(r2, r1)
            android.content.SharedPreferences$Editor r0 = r5.f20206e
            r0.commit()
        L_0x0064:
            r5.stopSelf()
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.s_mediaplayer_exo.m24574f():void");
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        m24571d();
        return true;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        m24571d();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|5|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0007 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r2 = this;
            android.os.Handler r0 = f20198p     // Catch:{ Exception -> 0x0007 }
            java.lang.Runnable r1 = r2.f20217q     // Catch:{ Exception -> 0x0007 }
            r0.removeCallbacks(r1)     // Catch:{ Exception -> 0x0007 }
        L_0x0007:
            android.net.wifi.WifiManager$WifiLock r0 = r2.f20207f     // Catch:{ Exception -> 0x000c }
            r0.release()     // Catch:{ Exception -> 0x000c }
        L_0x000c:
            com.google.android.exoplayer2.SimpleExoPlayer r0 = r2.f20202a     // Catch:{ Exception -> 0x0011 }
            r0.release()     // Catch:{ Exception -> 0x0011 }
        L_0x0011:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mega.boicot.s_mediaplayer_exo.onDestroy():void");
    }

    public void onAudioFocusChange(int i) {
        if (i <= 0) {
            if (this.f20202a != null) {
                try {
                    this.f20202a.setVolume(0.0f);
                } catch (Exception unused) {
                }
            }
        } else if (this.f20202a != null) {
            this.f20202a.setVolume(1.0f);
        }
    }
}
