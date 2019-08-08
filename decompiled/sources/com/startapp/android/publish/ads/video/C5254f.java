package com.startapp.android.publish.ads.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.VideoView;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.util.MimeTypes;
import com.p055c.p056a.p057a.p058a.p060b.C1435a;
import com.p055c.p056a.p057a.p058a.p060b.p061a.C1436a;
import com.startapp.android.publish.ads.p166a.C5086c;
import com.startapp.android.publish.ads.video.VideoAdDetails.PostRollType;
import com.startapp.android.publish.ads.video.p171a.C5211b;
import com.startapp.android.publish.ads.video.p172b.C5216b;
import com.startapp.android.publish.ads.video.p172b.C5216b.C5218a;
import com.startapp.android.publish.ads.video.p172b.C5220c;
import com.startapp.android.publish.ads.video.p172b.C5220c.C5221a;
import com.startapp.android.publish.ads.video.p172b.C5220c.C5222b;
import com.startapp.android.publish.ads.video.p172b.C5220c.C5223c;
import com.startapp.android.publish.ads.video.p172b.C5220c.C5224d;
import com.startapp.android.publish.ads.video.p172b.C5220c.C5225e;
import com.startapp.android.publish.ads.video.p172b.C5220c.C5226f;
import com.startapp.android.publish.ads.video.p172b.C5220c.C5227g;
import com.startapp.android.publish.ads.video.p172b.C5220c.C5228h;
import com.startapp.android.publish.ads.video.p173c.p174a.C5234a;
import com.startapp.android.publish.ads.video.tracking.AbsoluteTrackingLink;
import com.startapp.android.publish.ads.video.tracking.ActionTrackingLink;
import com.startapp.android.publish.ads.video.tracking.FractionTrackingLink;
import com.startapp.android.publish.ads.video.tracking.VideoClickedTrackingParams;
import com.startapp.android.publish.ads.video.tracking.VideoClickedTrackingParams.ClickOrigin;
import com.startapp.android.publish.ads.video.tracking.VideoPausedTrackingParams;
import com.startapp.android.publish.ads.video.tracking.VideoPausedTrackingParams.PauseOrigin;
import com.startapp.android.publish.ads.video.tracking.VideoProgressTrackingParams;
import com.startapp.android.publish.ads.video.tracking.VideoTrackingLink;
import com.startapp.android.publish.ads.video.tracking.VideoTrackingParams;
import com.startapp.android.publish.adsCommon.AdsConstants;
import com.startapp.android.publish.adsCommon.C5286Ad.AdType;
import com.startapp.android.publish.adsCommon.C5344b;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.android.publish.adsCommon.C5433n.C5434a;
import com.startapp.android.publish.adsCommon.Utils.C5306h;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener.NotDisplayedReason;
import com.startapp.android.publish.adsCommon.p180d.C5363b;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5377e;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.html.JsInterface;
import com.startapp.android.publish.omsdk.C5497a;
import com.startapp.common.C5523b;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5509c.C5512a;
import com.startapp.common.p193a.C5518g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.android.publish.ads.video.f */
/* compiled from: StartAppSDK */
public class C5254f extends C5086c {

    /* renamed from: A */
    protected int f16907A;

    /* renamed from: B */
    protected String f16908B = null;

    /* renamed from: C */
    protected Handler f16909C = new Handler();

    /* renamed from: D */
    protected Handler f16910D = new Handler();

    /* renamed from: E */
    protected Handler f16911E = new Handler();

    /* renamed from: F */
    protected Handler f16912F = new Handler();

    /* renamed from: G */
    private RelativeLayout f16913G;

    /* renamed from: H */
    private RelativeLayout f16914H;

    /* renamed from: I */
    private int f16915I = 0;

    /* renamed from: J */
    private int f16916J = 0;

    /* renamed from: K */
    private boolean f16917K = false;

    /* renamed from: L */
    private HashMap<Integer, Boolean> f16918L = new HashMap<>();

    /* renamed from: M */
    private HashMap<Integer, Boolean> f16919M = new HashMap<>();

    /* renamed from: N */
    private int f16920N = 1;

    /* renamed from: O */
    private boolean f16921O = false;

    /* renamed from: P */
    private boolean f16922P = false;

    /* renamed from: Q */
    private Map<Integer, List<FractionTrackingLink>> f16923Q = new HashMap();

    /* renamed from: R */
    private Map<Integer, List<AbsoluteTrackingLink>> f16924R = new HashMap();

    /* renamed from: S */
    private long f16925S;

    /* renamed from: T */
    private ClickOrigin f16926T;

    /* renamed from: U */
    private long f16927U;

    /* renamed from: V */
    private long f16928V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public C1436a f16929W;

    /* renamed from: X */
    private boolean f16930X = false;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public BroadcastReceiver f16931Y = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if (!C5254f.this.f16931Y.isInitialStickyBroadcast() && C5254f.this.f16935l != C5254f.this.m22505aa()) {
                C5254f.this.f16935l = !C5254f.this.f16935l;
                C5254f.this.mo19380V();
                C5254f.this.mo19386a(C5254f.this.f16935l);
            }
        }
    };

    /* renamed from: i */
    protected C5220c f16932i;

    /* renamed from: j */
    protected VideoView f16933j;

    /* renamed from: k */
    protected ProgressBar f16934k;

    /* renamed from: l */
    protected boolean f16935l = false;

    /* renamed from: m */
    protected int f16936m = 0;

    /* renamed from: n */
    protected int f16937n = 0;

    /* renamed from: o */
    protected boolean f16938o;

    /* renamed from: p */
    protected boolean f16939p = false;

    /* renamed from: q */
    protected boolean f16940q = false;

    /* renamed from: r */
    protected boolean f16941r = false;

    /* renamed from: s */
    protected boolean f16942s = false;

    /* renamed from: t */
    protected boolean f16943t = false;

    /* renamed from: u */
    protected int f16944u = 0;

    /* renamed from: v */
    protected boolean f16945v = false;

    /* renamed from: w */
    protected boolean f16946w = false;

    /* renamed from: x */
    protected boolean f16947x = false;

    /* renamed from: y */
    protected boolean f16948y = false;

    /* renamed from: z */
    protected int f16949z = 0;

    /* renamed from: com.startapp.android.publish.ads.video.f$a */
    /* compiled from: StartAppSDK */
    private enum C5278a {
        PLAYER,
        POST_ROLL
    }

    /* renamed from: com.startapp.android.publish.ads.video.f$b */
    /* compiled from: StartAppSDK */
    private enum C5279b {
        ON,
        OFF
    }

    /* renamed from: com.startapp.android.publish.ads.video.f$c */
    /* compiled from: StartAppSDK */
    private enum C5280c {
        COMPLETE,
        CLICKED,
        SKIPPED
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo18747z() {
    }

    /* renamed from: a */
    public void mo18697a(Bundle bundle) {
        super.mo18697a(bundle);
        try {
            this.f16925S = System.currentTimeMillis();
            this.f16907A = 100 / C5344b.m22784a().mo19756H().mo20043j();
            m22507ac();
            m22529ay();
            m22506ab();
            if (bundle != null && bundle.containsKey("currentPosition")) {
                this.f16937n = bundle.getInt("currentPosition");
                this.f16915I = bundle.getInt("latestPosition");
                this.f16918L = (HashMap) bundle.getSerializable("fractionProgressImpressionsSent");
                this.f16919M = (HashMap) bundle.getSerializable("absoluteProgressImpressionsSent");
                this.f16935l = bundle.getBoolean("isMuted");
                this.f16938o = bundle.getBoolean("shouldSetBg");
                this.f16936m = bundle.getInt("replayNum");
                this.f16917K = bundle.getBoolean("videoCompletedBroadcastSent", false);
                this.f16920N = bundle.getInt("pauseNum");
            }
        } catch (Exception unused) {
            m22525au();
            StringBuilder sb = new StringBuilder();
            sb.append("packages : ");
            sb.append(mo18717j());
            C5378f.m23016a(mo18705b().getApplicationContext(), C5376d.EXCEPTION, "VideoMode.onCreate", sb.toString(), "");
            mo18723p();
        }
    }

    /* renamed from: a */
    public void mo18739a(WebView webView) {
        super.mo18739a(webView);
        webView.setBackgroundColor(33554431);
        C5509c.m23513a(webView, (Paint) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18738a(View view) {
        this.f16939p = true;
        if (this.f16940q && mo19381W()) {
            mo18756F();
        } else if (mo19376R()) {
            m22532b((View) this.f16448d);
        }
        if (mo19382X()) {
            mo19368J();
        }
        if (mo19376R()) {
            m22509ae();
        }
        VideoAdDetails T = mo19378T();
        if (MetaData.getInstance().isOmsdkEnabled() && this.f16449e == null && T != null && T.getAdVerifications() != null && T.getAdVerifications().getAdVerification() != null) {
            this.f16449e = C5497a.m23460a(this.f16448d.getContext(), mo19378T().getAdVerifications());
            if (this.f16449e != null) {
                this.f16929W = C1436a.m5919a(this.f16449e);
                View a = this.f16425a.mo19712a();
                if (a != null) {
                    this.f16449e.mo6487b(a);
                }
                this.f16449e.mo6487b(this.f16448d);
                this.f16449e.mo6487b(this.f16914H);
                this.f16449e.mo6485a(this.f16933j);
                this.f16449e.mo6484a();
                C1435a.m5917a(this.f16449e).mo6473a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo18756F() {
        if (this.f16941r) {
            m22532b((View) this.f16933j);
            if (!mo19376R()) {
                m22510af();
            }
        }
    }

    /* renamed from: u */
    public void mo18728u() {
        super.mo18728u();
        mo18705b().registerReceiver(this.f16931Y, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.f16930X = true;
        if (!mo18705b().isFinishing()) {
            m22492Z();
        }
    }

    /* renamed from: Z */
    private void m22492Z() {
        if (this.f16933j == null) {
            m22494a(mo18705b().getApplicationContext());
        }
        if (this.f16932i == null) {
            this.f16932i = new C5216b(this.f16933j);
        }
        this.f16940q = false;
        this.f16913G.setBackgroundColor(-16777216);
        mo19365G();
        if (mo19376R()) {
            this.f16425a.mo19712a().setVisibility(0);
            this.f16933j.setVisibility(4);
        } else if (this.f16937n != 0) {
            this.f16932i.mo19265a(this.f16937n);
            m22534b(PauseOrigin.EXTERNAL);
        }
        this.f16932i.mo19262a((C5226f) new C5226f() {
            /* renamed from: a */
            public void mo19280a() {
                C5254f.this.f16946w = true;
                if (C5254f.this.f16939p && C5254f.this.f16940q) {
                    C5254f.this.mo18756F();
                }
                if (C5254f.this.mo19382X()) {
                    C5254f.this.mo19368J();
                }
            }
        });
        this.f16932i.mo19260a((C5224d) new C5224d() {
            /* renamed from: a */
            public void mo19278a() {
                if (!C5254f.this.mo19376R()) {
                    C5254f.this.mo19385a(C5280c.COMPLETE);
                }
                C5254f.this.f16932i.mo19268c();
            }
        });
        C526216 r0 = new C5223c() {
            /* renamed from: a */
            public void mo19277a(int i) {
                if (C5254f.this.f16945v && C5254f.this.f16946w && C5254f.this.f16932i != null && C5254f.this.f16932i.mo19270e() != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("buffered percent = [");
                    sb.append(i);
                    sb.append("]");
                    C5518g.m23563a("VideoMode", 3, sb.toString());
                    C5254f.this.f16944u = i;
                    int d = (C5254f.this.f16932i.mo19269d() * 100) / C5254f.this.f16932i.mo19270e();
                    if (C5254f.this.mo19371M()) {
                        if (!C5254f.this.f16947x && C5254f.this.mo19382X()) {
                            C5254f.this.mo19368J();
                        } else if (C5254f.this.f16944u == 100 || C5254f.this.f16944u - d > C5344b.m22784a().mo19756H().mo20043j()) {
                            C5254f.this.mo19366H();
                        }
                    } else if (C5254f.this.f16944u < 100 && C5254f.this.f16944u - d <= C5344b.m22784a().mo19756H().mo20044k()) {
                        C5254f.this.mo19367I();
                    }
                }
            }
        };
        this.f16932i.mo19261a((C5225e) new C5225e() {
            /* renamed from: a */
            public boolean mo19279a(C5227g gVar) {
                C5254f.this.f16946w = false;
                if (!C5254f.this.f16945v || C5254f.this.f16949z > C5254f.this.f16907A || gVar.mo19283c() <= 0 || !gVar.mo19282b().equals(C5218a.MEDIA_ERROR_IO.toString())) {
                    C5254f.this.mo19384a(gVar);
                } else {
                    C5254f.this.f16949z++;
                    C5254f.this.mo19369K();
                    C5254f.this.f16932i.mo19263a(C5254f.this.mo19378T().getLocalVideoPath());
                    C5254f.this.f16932i.mo19265a(gVar.mo19283c());
                }
                return true;
            }
        });
        this.f16932i.mo19258a((C5222b) new C5222b() {
        });
        this.f16932i.mo19259a((C5223c) r0);
        this.f16932i.mo19257a((C5221a) new C5221a() {
        });
        C5509c.m23510a((View) this.f16933j, (C5512a) new C5512a() {
            /* renamed from: a */
            public void mo19397a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C5254f.this.f16940q = true;
                if (C5254f.this.f16939p && C5254f.this.mo19381W()) {
                    C5254f.this.mo18756F();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo19365G() {
        boolean i = C5344b.m22784a().mo19756H().mo20042i();
        String localVideoPath = mo19378T().getLocalVideoPath();
        if (localVideoPath != null) {
            this.f16932i.mo19263a(localVideoPath);
            if (i && C5229c.m22374a().mo19287b(localVideoPath)) {
                C5518g.m23563a("VideoMode", 3, "progressive video from local file");
                this.f16945v = true;
                this.f16948y = true;
                this.f16944u = C5344b.m22784a().mo19756H().mo20044k();
            }
        } else if (i) {
            C5518g.m23563a("VideoMode", 3, "progressive video from url");
            String videoUrl = mo19378T().getVideoUrl();
            C5229c.m22374a().mo19286a(videoUrl);
            this.f16932i.mo19263a(videoUrl);
            this.f16945v = true;
            mo19369K();
        } else {
            mo19385a(C5280c.SKIPPED);
        }
        if (this.f16908B == null) {
            this.f16908B = this.f16945v ? "2" : "1";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo19366H() {
        StringBuilder sb = new StringBuilder();
        sb.append("progressive video resumed, buffered percent: [");
        sb.append(Integer.toString(this.f16944u));
        sb.append("]");
        C5518g.m23563a("VideoMode", 3, sb.toString());
        this.f16932i.mo19264a();
        mo19370L();
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo19367I() {
        StringBuilder sb = new StringBuilder();
        sb.append("progressive video paused, buffered percent: [");
        sb.append(Integer.toString(this.f16944u));
        sb.append("]");
        C5518g.m23563a("VideoMode", 3, sb.toString());
        this.f16932i.mo19267b();
        mo19369K();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo19368J() {
        this.f16947x = true;
        m22511ag();
        if (mo19376R()) {
            this.f16932i.mo19267b();
            return;
        }
        new Handler().postDelayed(new Runnable() {
            public void run() {
                if (C5254f.this.f16932i != null) {
                    C5254f.this.f16932i.mo19264a();
                    if (C5254f.this.f16929W != null) {
                        C5254f.this.f16929W.mo6476a((float) C5254f.this.f16932i.mo19270e(), C5254f.this.f16935l ? 0.0f : 1.0f);
                    }
                    C5254f.this.f16941r = true;
                    C5254f.this.mo19370L();
                    new Handler().post(new Runnable() {
                        public void run() {
                            C5254f.this.mo18756F();
                        }
                    });
                }
            }
        }, m22508ad());
        if (this.f16937n == 0) {
            this.f16909C.postDelayed(new Runnable() {
                public void run() {
                    try {
                        if (C5254f.this.f16932i == null) {
                            return;
                        }
                        if (C5254f.this.f16932i.mo19269d() > 0) {
                            C5254f.this.mo19390f(0);
                            C5254f.this.mo19391g(0);
                            if (C5254f.this.f16936m == 0) {
                                C5254f.this.mo19383Y();
                                C5523b.m23588a((Context) C5254f.this.mo18705b()).mo20506a(new Intent("com.startapp.android.ShowDisplayBroadcastListener"));
                            }
                        } else if (!C5254f.this.f16942s) {
                            C5254f.this.f16909C.postDelayed(this, 100);
                        }
                    } catch (Exception e) {
                        C5378f.m23018a(C5254f.this.mo18705b().getApplicationContext(), new C5377e(C5376d.EXCEPTION, "VideoMode.startVideoPlayback", e.getMessage()), C5254f.this.m22528ax());
                        C5254f.this.mo18723p();
                    }
                }
            }, 100);
        }
        m22517am();
        m22520ap();
        m22512ah();
        m22513ai();
        this.f16425a.mo19712a().setVisibility(4);
        mo19380V();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo19369K() {
        if (!mo19371M()) {
            this.f16943t = false;
            this.f16912F.postDelayed(new Runnable() {
                public void run() {
                    try {
                        C5254f.this.f16934k.setVisibility(0);
                        if (C5254f.this.f16929W != null) {
                            C5254f.this.f16929W.mo6481f();
                        }
                        C5254f.this.f16912F.postDelayed(new Runnable() {
                            public void run() {
                                C5518g.m23563a("VideoMode", 5, "Buffering timeout reached");
                                try {
                                    C5254f.this.mo19370L();
                                    C5254f.this.f16943t = true;
                                    C5254f.this.mo19384a(new C5227g(C5228h.BUFFERING_TIMEOUT, "Buffering timeout reached", C5254f.this.f16937n));
                                } catch (Exception e) {
                                    C5378f.m23018a(C5254f.this.mo18705b().getApplicationContext(), new C5377e(C5376d.EXCEPTION, "VideoMode.startBufferingIndicator", e.getMessage()), "");
                                }
                            }
                        }, C5344b.m22784a().mo19756H().mo20039g());
                    } catch (Exception e) {
                        C5254f.this.mo19370L();
                        C5378f.m23018a(C5254f.this.mo18705b().getApplicationContext(), new C5377e(C5376d.EXCEPTION, "VideoMode.startBufferingIndicator", e.getMessage()), C5254f.this.m22528ax());
                    }
                }
            }, C5344b.m22784a().mo19756H().mo20038f());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo19370L() {
        this.f16912F.removeCallbacksAndMessages(null);
        if (mo19371M()) {
            this.f16934k.setVisibility(8);
            if (this.f16929W != null) {
                this.f16929W.mo6482g();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public boolean mo19371M() {
        return this.f16934k != null && this.f16934k.isShown();
    }

    /* access modifiers changed from: private */
    /* renamed from: aa */
    public boolean m22505aa() {
        AudioManager audioManager = (AudioManager) mo18705b().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null || (audioManager.getRingerMode() != 0 && audioManager.getRingerMode() != 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: ab */
    private void m22506ab() {
        this.f16935l = m22505aa() || mo19378T().isVideoMuted() || C5344b.m22784a().mo19756H().mo20046m().equals("muted");
    }

    /* renamed from: ac */
    private void m22507ac() {
        if (!mo18714g().equals("back")) {
            return;
        }
        if (C5344b.m22784a().mo19756H().mo20032a().equals(C5434a.BOTH)) {
            this.f16921O = true;
            this.f16922P = true;
        } else if (C5344b.m22784a().mo19756H().mo20032a().equals(C5434a.SKIP)) {
            this.f16921O = true;
            this.f16922P = false;
        } else if (C5344b.m22784a().mo19756H().mo20032a().equals(C5434a.CLOSE)) {
            this.f16921O = false;
            this.f16922P = true;
        } else if (C5344b.m22784a().mo19756H().mo20032a().equals(C5434a.DISABLED)) {
            this.f16921O = false;
            this.f16922P = false;
        } else {
            this.f16921O = false;
            this.f16922P = false;
        }
    }

    /* renamed from: ad */
    private long m22508ad() {
        long currentTimeMillis = System.currentTimeMillis() - this.f16925S;
        if (this.f16937n == 0 && this.f16936m == 0 && currentTimeMillis < 500) {
            return Math.max(200, 500 - currentTimeMillis);
        }
        return 0;
    }

    /* renamed from: ae */
    private void m22509ae() {
        String str = "videoApi.setReplayEnabled";
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.f16932i != null);
        mo18740a(str, objArr);
        StringBuilder sb = new StringBuilder();
        sb.append(C5278a.POST_ROLL);
        sb.append("_");
        sb.append(mo19378T().getPostRollType());
        mo18740a("videoApi.setMode", sb.toString());
        mo18740a("videoApi.setCloseable", Boolean.valueOf(true));
    }

    /* renamed from: af */
    private void m22510af() {
        mo18740a("videoApi.setClickableVideo", Boolean.valueOf(mo19378T().isClickable()));
        mo18740a("videoApi.setMode", C5278a.PLAYER.toString());
        String str = "videoApi.setCloseable";
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(mo19378T().isCloseable() || this.f16922P);
        mo18740a(str, objArr);
        mo18740a("videoApi.setSkippable", Boolean.valueOf(m22527aw()));
    }

    /* renamed from: ag */
    private void m22511ag() {
        mo18740a("videoApi.setVideoDuration", Integer.valueOf(this.f16932i.mo19270e() / AdError.NETWORK_ERROR_CODE));
        mo19373O();
        m22514aj();
        mo18740a("videoApi.setVideoCurrentPosition", Integer.valueOf(this.f16937n / AdError.NETWORK_ERROR_CODE));
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo19372N() {
        mo18740a("videoApi.setVideoCurrentPosition", Integer.valueOf(0));
        mo18740a("videoApi.setSkipTimer", Integer.valueOf(0));
    }

    /* renamed from: b */
    private void m22532b(View view) {
        mo18740a("videoApi.setVideoFrame", Integer.valueOf(C5306h.m22650b(mo18705b(), view.getLeft())), Integer.valueOf(C5306h.m22650b(mo18705b(), view.getTop())), Integer.valueOf(C5306h.m22650b(mo18705b(), view.getWidth())), Integer.valueOf(C5306h.m22650b(mo18705b(), view.getHeight())));
    }

    /* renamed from: ah */
    private void m22512ah() {
        this.f16910D.post(new Runnable() {
            public void run() {
                int O = C5254f.this.mo19373O();
                if (O >= 1000) {
                    C5254f.this.f16910D.postDelayed(this, C5254f.this.mo19387c(O));
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public int mo19373O() {
        int ak = m22515ak();
        int i = ak / AdError.NETWORK_ERROR_CODE;
        if (i > 0 && ak % AdError.NETWORK_ERROR_CODE < 100) {
            i--;
        }
        mo18740a("videoApi.setVideoRemainingTimer", Integer.valueOf(i));
        return ak;
    }

    /* renamed from: ai */
    private void m22513ai() {
        m22514aj();
        this.f16910D.post(new Runnable() {

            /* renamed from: b */
            private boolean f16969b;

            /* renamed from: c */
            private final int f16970c = C5254f.this.mo19389e(C5344b.m22784a().mo19756H().mo20035d());

            public void run() {
                try {
                    int d = C5254f.this.mo19388d(C5254f.this.f16932i.mo19269d() + 50);
                    if (d >= 0 && !this.f16969b) {
                        if (d != 0) {
                            if (C5254f.this.f16937n < C5254f.this.mo19378T().getSkippableAfter() * AdError.NETWORK_ERROR_CODE) {
                                C5254f.this.mo18740a("videoApi.setSkipTimer", Integer.valueOf(d));
                            }
                        }
                        this.f16969b = true;
                        C5254f.this.mo18740a("videoApi.setSkipTimer", Integer.valueOf(0));
                    }
                    if (C5254f.this.f16945v && C5254f.this.f16932i.mo19269d() >= this.f16970c) {
                        C5254f.this.mo19377S();
                    }
                    int d2 = (C5254f.this.f16932i.mo19269d() + 50) / AdError.NETWORK_ERROR_CODE;
                    C5254f.this.mo18740a("videoApi.setVideoCurrentPosition", Integer.valueOf(d2));
                    if (d2 < C5254f.this.f16932i.mo19270e() / AdError.NETWORK_ERROR_CODE) {
                        C5254f.this.f16910D.postDelayed(this, C5254f.this.mo19374P());
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    /* renamed from: aj */
    private void m22514aj() {
        mo18740a("videoApi.setSkipTimer", Integer.valueOf(mo19388d(this.f16937n + 50)));
    }

    /* renamed from: ak */
    private int m22515ak() {
        if (this.f16932i.mo19269d() != this.f16932i.mo19270e() || mo19376R()) {
            return this.f16932i.mo19270e() - this.f16932i.mo19269d();
        }
        return this.f16932i.mo19270e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo19387c(int i) {
        int i2 = i % AdError.NETWORK_ERROR_CODE;
        if (i2 == 0) {
            i2 = 1000;
        }
        return (long) (i2 + 50);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public long mo19374P() {
        return (long) (1000 - (this.f16932i.mo19269d() % AdError.NETWORK_ERROR_CODE));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo19388d(int i) {
        if (this.f16921O || this.f16936m > 0) {
            return 0;
        }
        int skippableAfter = (mo19378T().getSkippableAfter() * AdError.NETWORK_ERROR_CODE) - i;
        if (skippableAfter <= 0) {
            return 0;
        }
        return (skippableAfter / AdError.NETWORK_ERROR_CODE) + 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19385a(C5280c cVar) {
        if (cVar == C5280c.COMPLETE && this.f16929W != null) {
            this.f16929W.mo6479d();
        }
        if (cVar == C5280c.SKIPPED && this.f16929W != null) {
            this.f16929W.mo6483h();
        }
        if (cVar == C5280c.SKIPPED || cVar == C5280c.CLICKED) {
            this.f16909C.removeCallbacksAndMessages(null);
            this.f16911E.removeCallbacksAndMessages(null);
            if (this.f16932i != null) {
                this.f16915I = this.f16932i.mo19269d();
                this.f16932i.mo19267b();
            }
        } else {
            this.f16915I = this.f16916J;
            mo19377S();
        }
        this.f16910D.removeCallbacksAndMessages(null);
        this.f16918L.clear();
        this.f16919M.clear();
        if (cVar == C5280c.CLICKED) {
            m22516al();
            return;
        }
        if (mo19378T().getPostRollType() != PostRollType.NONE) {
            m22509ae();
            this.f16425a.mo19712a().setVisibility(0);
        }
        if (mo19378T().getPostRollType() == PostRollType.IMAGE) {
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    if (!C5254f.this.f16943t) {
                        C5254f.this.f16933j.setVisibility(4);
                    }
                }
            }, 1000);
        } else if (mo19378T().getPostRollType() == PostRollType.NONE) {
            mo18723p();
        }
        m22516al();
        if (mo19378T().getPostRollType() != PostRollType.NONE) {
            m22530az();
        }
    }

    /* renamed from: al */
    private void m22516al() {
        this.f16937n = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo19375Q() {
        this.f16937n = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public boolean mo19376R() {
        return this.f16937n == -1;
    }

    /* renamed from: am */
    private void m22517am() {
        this.f16916J = this.f16932i.mo19270e();
        m22518an();
        m22519ao();
    }

    /* renamed from: an */
    private void m22518an() {
        for (Integer intValue : this.f16923Q.keySet()) {
            final int intValue2 = intValue.intValue();
            m22495a(mo19389e(intValue2), this.f16909C, (Runnable) new Runnable() {
                public void run() {
                    try {
                        C5254f.this.mo19390f(intValue2);
                    } catch (Exception e) {
                        C5378f.m23018a(C5254f.this.mo18705b().getApplicationContext(), new C5377e(C5376d.EXCEPTION, "VideoMode.scheduleFractionProgressEvents", e.getMessage()), C5254f.this.m22528ax());
                    }
                }
            });
        }
    }

    /* renamed from: ao */
    private void m22519ao() {
        for (Integer intValue : this.f16924R.keySet()) {
            final int intValue2 = intValue.intValue();
            m22495a(intValue2, this.f16909C, (Runnable) new Runnable() {
                public void run() {
                    try {
                        C5254f.this.mo19391g(intValue2);
                    } catch (Exception e) {
                        C5378f.m23018a(C5254f.this.mo18705b().getApplicationContext(), new C5377e(C5376d.EXCEPTION, "VideoMode.scheduleAbsoluteProgressEvents", e.getMessage()), C5254f.this.m22528ax());
                    }
                }
            });
        }
    }

    /* renamed from: ap */
    private void m22520ap() {
        if (!this.f16945v) {
            m22495a(mo19389e(C5344b.m22784a().mo19756H().mo20035d()), this.f16911E, (Runnable) new Runnable() {
                public void run() {
                    try {
                        C5254f.this.mo19377S();
                    } catch (Exception e) {
                        C5378f.m23018a(C5254f.this.mo18705b().getApplicationContext(), new C5377e(C5376d.EXCEPTION, "VideoMode.scheduleVideoListenerEvents", e.getMessage()), C5254f.this.m22528ax());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private void m22495a(int i, Handler handler, Runnable runnable) {
        if (this.f16937n < i) {
            handler.postDelayed(runnable, (long) (i - this.f16937n));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo19389e(int i) {
        return (this.f16916J * i) / 100;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo19377S() {
        if (m22521aq() && !this.f16917K && this.f16936m == 0) {
            this.f16917K = true;
            C5518g.m23563a("VideoMode", 3, "Sending rewarded video completion broadcast.");
            if (C5523b.m23588a((Context) mo18705b()).mo20506a(new Intent("com.startapp.android.OnVideoCompleted"))) {
                C5518g.m23563a("VideoMode", 3, "Rewarded video completion broadcast sent successfully.");
            }
            m22501aA();
        }
    }

    /* renamed from: aq */
    private boolean m22521aq() {
        return mo18730w().getType() == AdType.REWARDED_VIDEO;
    }

    /* renamed from: b */
    public void mo18707b(Bundle bundle) {
        super.mo18707b(bundle);
        bundle.putInt("currentPosition", this.f16937n);
        bundle.putInt("latestPosition", this.f16915I);
        bundle.putSerializable("fractionProgressImpressionsSent", this.f16918L);
        bundle.putSerializable("absoluteProgressImpressionsSent", this.f16919M);
        bundle.putBoolean("isMuted", this.f16935l);
        bundle.putBoolean("shouldSetBg", this.f16938o);
        bundle.putInt("replayNum", this.f16936m);
        bundle.putInt("pauseNum", this.f16920N);
        bundle.putBoolean("videoCompletedBroadcastSent", this.f16917K);
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public VideoAdDetails mo19378T() {
        return ((C5253e) mo18730w()).mo19363d();
    }

    /* renamed from: s */
    public void mo18726s() {
        if (!mo19376R() && !mo18705b().isFinishing() && !this.f16922P && !this.f16921O) {
            m22499a(PauseOrigin.EXTERNAL);
        }
        m22526av();
        this.f16909C.removeCallbacksAndMessages(null);
        this.f16910D.removeCallbacksAndMessages(null);
        this.f16911E.removeCallbacksAndMessages(null);
        mo19370L();
        this.f16938o = true;
        if (this.f16930X) {
            mo18705b().unregisterReceiver(this.f16931Y);
            this.f16930X = false;
        }
        super.mo18726s();
    }

    /* renamed from: p */
    public void mo18723p() {
        super.mo18723p();
        if (this.f16948y) {
            C5229c.m22374a().mo19288c(mo19378T().getLocalVideoPath());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public JsInterface mo18746y() {
        VideoJsInterface videoJsInterface = new VideoJsInterface(mo18705b(), this.f16451g, this.f16451g, m22524at(), m22523as(), m22522ar(), new C5363b(mo18721n()), mo18703a(0));
        return videoJsInterface;
    }

    /* renamed from: ar */
    private Runnable m22522ar() {
        return new Runnable() {
            public void run() {
                C5254f.this.f16935l = !C5254f.this.f16935l;
                C5254f.this.mo19380V();
                C5254f.this.mo19386a(C5254f.this.f16935l);
            }
        };
    }

    /* renamed from: as */
    private Runnable m22523as() {
        return new Runnable() {
            public void run() {
                C5254f.this.mo19379U();
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public void mo19379U() {
        if (mo19371M()) {
            mo19370L();
        }
        mo19385a(C5280c.SKIPPED);
        m22502aB();
    }

    /* renamed from: at */
    private Runnable m22524at() {
        return new Runnable() {
            public void run() {
                C5254f.this.f16936m++;
                C5254f.this.f16933j.setVisibility(0);
                C5254f.this.f16938o = false;
                C5254f.this.mo19375Q();
                C5254f.this.mo19372N();
                C5254f.this.mo19365G();
            }
        };
    }

    /* renamed from: a */
    private RelativeLayout m22494a(Context context) {
        this.f16927U = System.currentTimeMillis();
        this.f16914H = (RelativeLayout) mo18705b().findViewById(AdsConstants.STARTAPP_AD_MAIN_LAYOUT_ID);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        this.f16933j = new VideoView(context);
        this.f16933j.setId(100);
        LayoutParams layoutParams2 = new LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        this.f16934k = new ProgressBar(context, null, 16843399);
        this.f16934k.setVisibility(4);
        LayoutParams layoutParams3 = new LayoutParams(-2, -2);
        layoutParams3.addRule(14);
        layoutParams3.addRule(15);
        this.f16913G = new RelativeLayout(context);
        this.f16913G.setId(1475346436);
        mo18705b().setContentView(this.f16913G);
        this.f16913G.addView(this.f16933j, layoutParams2);
        this.f16913G.addView(this.f16914H, layoutParams);
        this.f16913G.addView(this.f16934k, layoutParams3);
        if (AdsConstants.m22604a().booleanValue()) {
            LayoutParams layoutParams4 = new LayoutParams(-2, -2);
            layoutParams4.addRule(12);
            layoutParams4.addRule(14);
            this.f16913G.addView(m22531b(context), layoutParams4);
        }
        this.f16425a.mo19712a().setVisibility(4);
        return this.f16913G;
    }

    /* renamed from: b */
    private View m22531b(Context context) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("url=");
        sb2.append(mo19378T().getVideoUrl());
        sb.append(sb2.toString());
        TextView textView = new TextView(context);
        textView.setBackgroundColor(-16777216);
        C5509c.m23508a((View) textView, 0.5f);
        textView.setTextColor(-7829368);
        textView.setSingleLine(false);
        textView.setText(sb.toString());
        return textView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public void mo19380V() {
        String str;
        if (this.f16932i != null) {
            try {
                if (this.f16935l) {
                    this.f16932i.mo19266a(true);
                } else {
                    this.f16932i.mo19266a(false);
                }
            } catch (IllegalStateException unused) {
            }
        }
        String str2 = "videoApi.setSound";
        Object[] objArr = new Object[1];
        if (this.f16935l) {
            str = C5279b.OFF.toString();
        } else {
            str = C5279b.ON.toString();
        }
        objArr[0] = str;
        mo18740a(str2, objArr);
    }

    /* renamed from: a */
    private void m22499a(PauseOrigin pauseOrigin) {
        if (this.f16932i != null) {
            int d = this.f16932i.mo19269d();
            this.f16937n = d;
            this.f16915I = d;
            this.f16932i.mo19267b();
            if (this.f16929W != null) {
                this.f16929W.mo6480e();
            }
        }
        m22538c(pauseOrigin);
    }

    /* renamed from: b */
    private void m22534b(PauseOrigin pauseOrigin) {
        m22540d(pauseOrigin);
        this.f16920N++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19384a(C5227g gVar) {
        C5234a aVar;
        C5378f.m23016a(mo18705b(), C5376d.VIDEO_MEDIA_PLAYER_ERROR, gVar.mo19281a().toString(), gVar.mo19282b(), m22528ax());
        switch (gVar.mo19281a()) {
            case SERVER_DIED:
                aVar = C5234a.GeneralLinearError;
                break;
            case BUFFERING_TIMEOUT:
                aVar = C5234a.TimeoutMediaFileURI;
                break;
            case PLAYER_CREATION:
                aVar = C5234a.MediaFileDisplayError;
                break;
            default:
                aVar = C5234a.UndefinedError;
                break;
        }
        m22496a(aVar);
        if ((this.f16945v ? this.f16932i.mo19269d() : this.f16937n) == 0) {
            C5349c.m22863a((Context) mo18705b(), mo18715h(), mo18721n(), this.f16936m, NotDisplayedReason.VIDEO_ERROR.toString());
            if (!this.f16945v) {
                C5284h.m22598b(mo18705b());
            } else if (!gVar.mo19281a().equals(C5228h.BUFFERING_TIMEOUT)) {
                C5284h.m22598b(mo18705b());
            }
        }
        if ((!m22521aq() || this.f16917K) && mo19378T().getPostRollType() != PostRollType.NONE) {
            mo19385a(C5280c.SKIPPED);
            return;
        }
        m22525au();
        mo18723p();
    }

    /* renamed from: au */
    private void m22525au() {
        Intent intent = new Intent("com.startapp.android.ShowFailedDisplayBroadcastListener");
        intent.putExtra("showFailedReason", NotDisplayedReason.VIDEO_ERROR);
        C5523b.m23588a((Context) mo18705b()).mo20506a(intent);
        this.f16942s = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public boolean mo19381W() {
        return this.f16932i != null && this.f16932i.mo19271f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public boolean mo19382X() {
        boolean z = false;
        if (!this.f16945v) {
            if (mo19381W() && this.f16939p) {
                z = true;
            }
            return z;
        }
        if (this.f16944u >= C5344b.m22784a().mo19756H().mo20044k() && mo19381W() && this.f16939p) {
            z = true;
        }
        return z;
    }

    /* renamed from: av */
    private void m22526av() {
        C5518g.m23563a("VideoMode", 3, "Releasing video player");
        if (this.f16932i != null) {
            this.f16932i.mo19272g();
            this.f16932i = null;
        }
    }

    /* renamed from: r */
    public boolean mo18725r() {
        if (mo19376R()) {
            mo18733A();
            return false;
        }
        int d = mo19388d(this.f16932i.mo19269d() + 50);
        if (m22527aw() && d == 0) {
            mo19379U();
            return true;
        } else if (!mo19378T().isCloseable() && !this.f16922P) {
            return true;
        } else {
            mo18733A();
            return false;
        }
    }

    /* renamed from: aw */
    private boolean m22527aw() {
        return this.f16936m > 0 || mo19378T().isSkippable() || this.f16921O;
    }

    /* renamed from: h */
    private int m22541h(int i) {
        if (this.f16916J > 0) {
            return (i * 100) / this.f16916J;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: ax */
    public String m22528ax() {
        try {
            String[] h = mo18715h();
            if (h != null && h.length > 0) {
                return C5349c.m22885e(h[0]);
            }
            C5518g.m23563a("VideoMode", 5, "dParam is not available.");
            return "";
        } catch (Exception unused) {
        }
    }

    /* renamed from: q */
    public void mo18724q() {
        if (!this.f16942s) {
            super.mo18724q();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18741a(String str, boolean z) {
        if (!TextUtils.isEmpty(mo19378T().getClickUrl())) {
            str = mo19378T().getClickUrl();
            z = true;
        }
        this.f16926T = mo19376R() ? ClickOrigin.POSTROLL : ClickOrigin.VIDEO;
        StringBuilder sb = new StringBuilder();
        sb.append("Video clicked from: ");
        sb.append(this.f16926T);
        C5518g.m23563a("VideoMode", 3, sb.toString());
        if (this.f16926T == ClickOrigin.VIDEO) {
            mo19385a(C5280c.CLICKED);
        }
        m22498a(this.f16926T);
        return super.mo18741a(str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo18733A() {
        if (this.f16942s) {
            C5518g.m23563a("VideoMode", 3, "Not sending close events due to media player error");
        } else if (mo19376R() || this.f16933j == null) {
            m22503aC();
            super.mo18733A();
        } else {
            m22504aD();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public String mo18736D() {
        this.f16928V = System.currentTimeMillis();
        return String.valueOf(((double) (this.f16928V - this.f16927U)) / 1000.0d);
    }

    /* renamed from: ay */
    private void m22529ay() {
        FractionTrackingLink[] fractionTrackingUrls = mo19378T().getVideoTrackingDetails().getFractionTrackingUrls();
        if (fractionTrackingUrls != null) {
            for (FractionTrackingLink fractionTrackingLink : fractionTrackingUrls) {
                List list = (List) this.f16923Q.get(Integer.valueOf(fractionTrackingLink.getFraction()));
                if (list == null) {
                    list = new ArrayList();
                    this.f16923Q.put(Integer.valueOf(fractionTrackingLink.getFraction()), list);
                }
                list.add(fractionTrackingLink);
            }
        }
        AbsoluteTrackingLink[] absoluteTrackingUrls = mo19378T().getVideoTrackingDetails().getAbsoluteTrackingUrls();
        if (absoluteTrackingUrls != null) {
            for (AbsoluteTrackingLink absoluteTrackingLink : absoluteTrackingUrls) {
                List list2 = (List) this.f16924R.get(Integer.valueOf(absoluteTrackingLink.getVideoOffsetMillis()));
                if (list2 == null) {
                    list2 = new ArrayList();
                    this.f16924R.put(Integer.valueOf(absoluteTrackingLink.getVideoOffsetMillis()), list2);
                }
                list2.add(absoluteTrackingLink);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C5363b mo18735C() {
        return new VideoTrackingParams(mo18721n(), 0, this.f16936m, this.f16908B);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public long mo18737E() {
        if (mo18722o() != null) {
            return TimeUnit.SECONDS.toMillis(mo18722o().longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.getInstance().getIABVideoImpressionDelayInSeconds());
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public void mo19383Y() {
        super.mo18747z();
        m22500a(mo19378T().getVideoTrackingDetails().getImpressionUrls(), new VideoTrackingParams(mo18721n(), 0, this.f16936m, this.f16908B), 0, "impression");
        m22500a(mo19378T().getVideoTrackingDetails().getCreativeViewUrls(), new VideoTrackingParams(mo18721n(), 0, this.f16936m, this.f16908B), 0, "creativeView");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo19390f(int i) {
        if (this.f16918L.get(Integer.valueOf(i)) == null) {
            if (this.f16923Q.containsKey(Integer.valueOf(i))) {
                List list = (List) this.f16923Q.get(Integer.valueOf(i));
                StringBuilder sb = new StringBuilder();
                sb.append("Sending fraction progress event with fraction: ");
                sb.append(i);
                sb.append(", total: ");
                sb.append(list.size());
                C5518g.m23563a("VideoMode", 3, sb.toString());
                m22500a((VideoTrackingLink[]) list.toArray(new FractionTrackingLink[list.size()]), new VideoProgressTrackingParams(mo18721n(), i, this.f16936m, this.f16908B), mo19389e(i), "fraction");
                if (this.f16929W != null) {
                    if (i == 25) {
                        this.f16929W.mo6474a();
                    } else if (i == 50) {
                        this.f16929W.mo6477b();
                    } else if (i == 75) {
                        this.f16929W.mo6478c();
                    }
                }
            }
            this.f16918L.put(Integer.valueOf(i), Boolean.valueOf(true));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fraction progress event already sent for fraction: ");
        sb2.append(i);
        C5518g.m23563a("VideoMode", 3, sb2.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo19391g(int i) {
        if (this.f16919M.get(Integer.valueOf(i)) == null) {
            if (this.f16924R.containsKey(Integer.valueOf(i))) {
                List list = (List) this.f16924R.get(Integer.valueOf(i));
                StringBuilder sb = new StringBuilder();
                sb.append("Sending absolute progress event with video progress: ");
                sb.append(i);
                sb.append(", total: ");
                sb.append(list.size());
                C5518g.m23563a("VideoMode", 3, sb.toString());
                m22500a((VideoTrackingLink[]) list.toArray(new AbsoluteTrackingLink[list.size()]), new VideoProgressTrackingParams(mo18721n(), i, this.f16936m, this.f16908B), i, "absolute");
            }
            this.f16919M.put(Integer.valueOf(i), Boolean.valueOf(true));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Absolute progress event already sent for video progress: ");
        sb2.append(i);
        C5518g.m23563a("VideoMode", 3, sb2.toString());
    }

    /* renamed from: az */
    private void m22530az() {
        C5518g.m23563a("VideoMode", 3, "Sending postroll impression event");
        m22500a(mo19378T().getVideoTrackingDetails().getVideoPostRollImpressionUrls(), new VideoTrackingParams(mo18721n(), m22541h(this.f16915I), this.f16936m, this.f16908B), this.f16915I, "postrollImression");
    }

    /* renamed from: aA */
    private void m22501aA() {
        C5518g.m23563a("VideoMode", 3, "Sending rewarded event");
        m22500a(mo19378T().getVideoTrackingDetails().getVideoRewardedUrls(), new VideoTrackingParams(mo18721n(), C5344b.m22784a().mo19756H().mo20035d(), this.f16936m, this.f16908B), mo19389e(C5344b.m22784a().mo19756H().mo20035d()), "rewarded");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19386a(boolean z) {
        ActionTrackingLink[] actionTrackingLinkArr;
        String str = "VideoMode";
        StringBuilder sb = new StringBuilder();
        sb.append("Sending sound ");
        sb.append(z ? "muted " : "unmuted ");
        sb.append("event");
        C5518g.m23563a(str, 3, sb.toString());
        if (z) {
            actionTrackingLinkArr = mo19378T().getVideoTrackingDetails().getSoundMuteUrls();
        } else {
            actionTrackingLinkArr = mo19378T().getVideoTrackingDetails().getSoundUnmuteUrls();
        }
        m22500a(actionTrackingLinkArr, new VideoTrackingParams(mo18721n(), m22541h(this.f16932i.mo19269d()), this.f16936m, this.f16908B), this.f16932i.mo19269d(), "sound");
        if (this.f16929W != null) {
            this.f16929W.mo6475a(z ? 0.0f : 1.0f);
        }
    }

    /* renamed from: aB */
    private void m22502aB() {
        C5518g.m23563a("VideoMode", 3, "Sending skip event");
        m22500a(mo19378T().getVideoTrackingDetails().getVideoSkippedUrls(), new VideoTrackingParams(mo18721n(), m22541h(this.f16915I), this.f16936m, this.f16908B), this.f16915I, "skipped");
    }

    /* renamed from: c */
    private void m22538c(PauseOrigin pauseOrigin) {
        StringBuilder sb = new StringBuilder();
        sb.append("Sending pause event with origin: ");
        sb.append(pauseOrigin);
        C5518g.m23563a("VideoMode", 3, sb.toString());
        ActionTrackingLink[] videoPausedUrls = mo19378T().getVideoTrackingDetails().getVideoPausedUrls();
        VideoPausedTrackingParams videoPausedTrackingParams = new VideoPausedTrackingParams(mo18721n(), m22541h(this.f16915I), this.f16936m, this.f16920N, pauseOrigin, this.f16908B);
        m22500a(videoPausedUrls, videoPausedTrackingParams, this.f16915I, "paused");
    }

    /* renamed from: d */
    private void m22540d(PauseOrigin pauseOrigin) {
        StringBuilder sb = new StringBuilder();
        sb.append("Sending resume event with pause origin: ");
        sb.append(pauseOrigin);
        C5518g.m23563a("VideoMode", 3, sb.toString());
        ActionTrackingLink[] videoResumedUrls = mo19378T().getVideoTrackingDetails().getVideoResumedUrls();
        VideoPausedTrackingParams videoPausedTrackingParams = new VideoPausedTrackingParams(mo18721n(), m22541h(this.f16915I), this.f16936m, this.f16920N, pauseOrigin, this.f16908B);
        m22500a(videoResumedUrls, videoPausedTrackingParams, this.f16915I, "resumed");
    }

    /* renamed from: aC */
    private void m22503aC() {
        C5518g.m23563a("VideoMode", 3, "Sending postroll closed event");
        m22500a(mo19378T().getVideoTrackingDetails().getVideoPostRollClosedUrls(), new VideoTrackingParams(mo18721n(), m22541h(this.f16915I), this.f16936m, this.f16908B), this.f16915I, "postrollClosed");
    }

    /* renamed from: aD */
    private void m22504aD() {
        C5518g.m23563a("VideoMode", 3, "Sending video closed event");
        m22500a(mo19378T().getVideoTrackingDetails().getVideoClosedUrls(), new VideoTrackingParams(mo18721n(), m22541h(this.f16932i.mo19269d()), this.f16936m, this.f16908B), this.f16932i.mo19269d(), "closed");
    }

    /* renamed from: a */
    private void m22498a(ClickOrigin clickOrigin) {
        StringBuilder sb = new StringBuilder();
        sb.append("Sending video clicked event with origin: ");
        sb.append(clickOrigin.toString());
        C5518g.m23563a("VideoMode", 3, sb.toString());
        ActionTrackingLink[] videoClickTrackingUrls = mo19378T().getVideoTrackingDetails().getVideoClickTrackingUrls();
        VideoClickedTrackingParams videoClickedTrackingParams = new VideoClickedTrackingParams(mo18721n(), m22541h(this.f16915I), this.f16936m, clickOrigin, this.f16908B);
        m22500a(videoClickTrackingUrls, videoClickedTrackingParams, this.f16915I, "clicked");
    }

    /* renamed from: a */
    private void m22500a(VideoTrackingLink[] videoTrackingLinkArr, VideoTrackingParams videoTrackingParams, int i, String str) {
        C5284h.m22596a((Context) mo18705b(), new C5211b(videoTrackingLinkArr, videoTrackingParams, mo19378T().getVideoUrl(), i).mo19251a(str).mo19249a());
    }

    /* renamed from: a */
    private void m22496a(C5234a aVar) {
        C5518g.m23563a("VideoMode", 3, "Sending internal video event");
        C5284h.m22596a((Context) mo18705b(), new C5211b(mo19378T().getVideoTrackingDetails().getInlineErrorTrackingUrls(), new VideoTrackingParams(mo18721n(), m22541h(this.f16915I), this.f16936m, this.f16908B), mo19378T().getVideoUrl(), this.f16915I).mo19250a(aVar).mo19251a("error").mo19249a());
    }
}
