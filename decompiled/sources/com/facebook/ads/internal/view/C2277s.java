package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.BackButtonInterceptor;
import com.facebook.ads.internal.adapters.p072b.C1597h;
import com.facebook.ads.internal.adapters.p072b.C1608q;
import com.facebook.ads.internal.p079f.C1710a;
import com.facebook.ads.internal.p088o.C1777d;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.p091r.C1795a;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2323k;
import com.facebook.ads.internal.p115w.p117b.C2341w;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p125x.C2376a;
import com.facebook.ads.internal.p125x.C2376a.C2377a;
import com.facebook.ads.internal.view.C1910a.C1911a;
import com.facebook.ads.internal.view.C2098i.C2108a;
import com.facebook.ads.internal.view.C2098i.C2109b;
import com.facebook.ads.internal.view.p101c.C1980d;
import com.facebook.ads.internal.view.p107f.C2069b;
import com.facebook.ads.internal.view.p108g.C2079a;
import com.facebook.ads.internal.view.p108g.C2082c;
import com.facebook.ads.internal.view.p108g.C2082c.C2087a;
import com.facebook.ads.internal.view.p110i.C2110a;
import com.facebook.ads.internal.view.p110i.C2119b;
import com.facebook.ads.internal.view.p110i.p111a.C2116a;
import com.facebook.ads.internal.view.p110i.p111a.C2117b;
import com.facebook.ads.internal.view.p110i.p112b.C2133aa;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import com.facebook.ads.internal.view.p110i.p112b.C2136d;
import com.facebook.ads.internal.view.p110i.p112b.C2137e;
import com.facebook.ads.internal.view.p110i.p112b.C2138f;
import com.facebook.ads.internal.view.p110i.p112b.C2145m;
import com.facebook.ads.internal.view.p110i.p112b.C2146n;
import com.facebook.ads.internal.view.p110i.p112b.C2147o;
import com.facebook.ads.internal.view.p110i.p112b.C2148p;
import com.facebook.ads.internal.view.p110i.p113c.C2180d;
import com.facebook.ads.internal.view.p110i.p113c.C2180d.C2188a;
import com.facebook.ads.internal.view.p110i.p113c.C2191f;
import com.facebook.ads.internal.view.p110i.p113c.C2206j;
import com.facebook.ads.internal.view.p110i.p113c.C2206j.C2210a;
import com.facebook.ads.internal.view.p110i.p113c.C2211k;
import com.facebook.ads.internal.view.p110i.p113c.C2213l;
import com.facebook.ads.internal.view.p110i.p113c.C2224o;
import com.facebook.ads.internal.view.p110i.p114d.C2240d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.view.s */
public class C2277s extends RelativeLayout implements C1910a {

    /* renamed from: a */
    static final /* synthetic */ boolean f7168a = true;

    /* renamed from: b */
    private static final int f7169b = ((int) (12.0f * C2342x.f7369b));

    /* renamed from: c */
    private static final int f7170c = ((int) (18.0f * C2342x.f7369b));

    /* renamed from: d */
    private static final int f7171d = ((int) (16.0f * C2342x.f7369b));

    /* renamed from: e */
    private static final int f7172e = ((int) (72.0f * C2342x.f7369b));

    /* renamed from: f */
    private static final int f7173f = ((int) (C2342x.f7369b * 56.0f));

    /* renamed from: g */
    private static final int f7174g = ((int) (56.0f * C2342x.f7369b));

    /* renamed from: h */
    private static final int f7175h = ((int) (28.0f * C2342x.f7369b));

    /* renamed from: i */
    private static final int f7176i = ((int) (20.0f * C2342x.f7369b));

    /* renamed from: j */
    private static final LayoutParams f7177j = new LayoutParams(-1, -1);

    /* renamed from: A */
    private Context f7178A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C2110a f7179B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C1911a f7180C;

    /* renamed from: D */
    private C2079a f7181D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C2180d f7182E;

    /* renamed from: F */
    private C2213l f7183F;

    /* renamed from: G */
    private View f7184G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C2206j f7185H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C2098i f7186I;

    /* renamed from: J */
    private C2116a f7187J;

    /* renamed from: K */
    private Integer f7188K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C2082c f7189L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public boolean f7190M = false;

    /* renamed from: N */
    private boolean f7191N = false;

    /* renamed from: O */
    private WeakReference<AudienceNetworkActivity> f7192O;

    /* renamed from: k */
    private final BackButtonInterceptor f7193k = new BackButtonInterceptor() {
        public boolean interceptBackButton() {
            return !C2277s.this.f7190M;
        }
    };

    /* renamed from: l */
    private final C2136d f7194l = new C2136d() {
        /* renamed from: a */
        public void mo6895a(C2135c cVar) {
            if (C2277s.this.f7180C != null) {
                C2277s.this.f7189L.mo8344d();
                C2277s.m8952d(C2277s.this);
                C2277s.this.f7180C.mo6796a(C2133aa.REWARDED_VIDEO_COMPLETE.mo8442a(), (C1777d) cVar);
            }
        }
    };

    /* renamed from: m */
    private final C2138f f7195m = new C2138f() {
        /* renamed from: a */
        public void mo6895a(C2137e eVar) {
            if (C2277s.this.f7180C != null) {
                C2277s.this.f7180C.mo6795a(C2133aa.REWARDED_VIDEO_ERROR.mo8442a());
            }
            C2277s.this.mo8664a();
        }
    };

    /* renamed from: n */
    private final C2146n f7196n = new C2146n() {
        /* renamed from: a */
        public void mo6895a(C2145m mVar) {
            if (C2277s.this.f7179B != null) {
                C2277s.this.f7179B.mo8380a(C2116a.USER_STARTED);
                C2277s.this.f7200r.mo8777a();
                C2277s.this.f7208z.set(C2277s.this.f7179B.mo8406k());
                C2277s.this.m8950b();
            }
        }
    };

    /* renamed from: o */
    private final C2148p f7197o = new C2148p() {
        /* renamed from: a */
        public void mo6895a(C2147o oVar) {
            if (C2277s.this.f7179B != null && C2277s.this.f7182E != null && C2277s.this.f7179B.getDuration() - C2277s.this.f7179B.getCurrentPositionInMillis() <= 3000 && C2277s.this.f7182E.mo8484a()) {
                C2277s.this.f7182E.mo8485b();
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1608q f7198p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C1802c f7199q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C2376a f7200r;

    /* renamed from: s */
    private final C2377a f7201s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C2341w f7202t = new C2341w();

    /* renamed from: u */
    private final C2224o f7203u;

    /* renamed from: v */
    private final C2119b f7204v;

    /* renamed from: w */
    private final RelativeLayout f7205w;

    /* renamed from: x */
    private final C2191f f7206x;

    /* renamed from: y */
    private final C1597h f7207y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final AtomicBoolean f7208z = new AtomicBoolean(false);

    public C2277s(Context context, C1802c cVar, C2110a aVar, C1911a aVar2, C1608q qVar) {
        super(context);
        this.f7178A = context;
        this.f7180C = aVar2;
        this.f7179B = aVar;
        this.f7199q = cVar;
        this.f7198p = qVar;
        this.f7207y = this.f7198p.mo7234i().mo7120a();
        this.f7205w = new RelativeLayout(context);
        this.f7203u = new C2224o(this.f7178A);
        this.f7206x = new C2191f(this.f7178A);
        new C1980d(this.f7205w, f7176i).mo8114a().mo8117a(C1795a.m7454m(this.f7178A)).mo8118a(this.f7198p.mo7235j().mo7133g());
        this.f7201s = new C2377a() {
            /* renamed from: a */
            public void mo7108a() {
                if (!C2277s.this.f7202t.mo8740b()) {
                    C2277s.this.f7202t.mo8737a();
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(C2277s.this.f7198p.mo7113a())) {
                        C2277s.this.f7200r.mo8779a((Map<String, String>) hashMap);
                        hashMap.put("touch", C2323k.m9046a(C2277s.this.f7202t.mo8743e()));
                        if (C2277s.this.f7198p.mo7119d() != null) {
                            hashMap.put("extra_hints", C2277s.this.f7198p.mo7119d());
                        }
                        hashMap.put("is_cyoa", String.valueOf(C2277s.this.f7198p.mo7237l()));
                        C2277s.this.f7199q.mo7686a(C2277s.this.f7198p.mo7113a(), hashMap);
                    }
                    if (C2277s.this.f7180C != null) {
                        C2277s.this.f7180C.mo6795a(C2133aa.REWARDED_VIDEO_IMPRESSION.mo8442a());
                    }
                }
            }
        };
        this.f7200r = new C2376a(this, 1, this.f7201s);
        this.f7200r.mo8778a(250);
        this.f7204v = new C2119b(this.f7178A, this.f7199q, this.f7179B, this.f7198p.mo7113a());
        C2082c cVar2 = new C2082c(this.f7178A, this.f7199q, this.f7198p, this.f7180C, this.f7200r, this.f7202t);
        this.f7189L = cVar2;
        if (f7168a || this.f7179B != null) {
            this.f7179B.setVideoProgressReportIntervalMs(qVar.mo7116b());
            C2342x.m9082a((View) this.f7179B, -16777216);
            this.f7179B.getEventBus().mo7626a((T[]) new C1779f[]{this.f7194l, this.f7195m, this.f7196n, this.f7197o});
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m8950b() {
        this.f7206x.setVisibility(this.f7208z.get() ? 0 : 8);
    }

    /* renamed from: d */
    static /* synthetic */ void m8952d(C2277s sVar) {
        LayoutParams layoutParams;
        sVar.f7190M = true;
        if (sVar.f7178A != null) {
            FrameLayout frameLayout = new FrameLayout(sVar.f7178A);
            frameLayout.setLayoutParams(f7177j);
            C2342x.m9082a((View) frameLayout, -1509949440);
            sVar.f7205w.addView(frameLayout, 0);
        }
        C2342x.m9085a((ViewGroup) sVar.f7205w);
        if (sVar.f7179B != null) {
            sVar.f7179B.mo8385d();
            sVar.f7179B.setVisibility(4);
        }
        if (sVar.f7186I != null) {
            if (sVar.f7186I.mo8358a()) {
                sVar.f7186I.mo8359b();
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public void run() {
                        if (C2277s.this.f7186I != null) {
                            C2277s.this.f7186I.setCloseButtonStyle(C2108a.CROSS);
                            C2277s.this.f7186I.mo8357a(true);
                        }
                    }
                }, 1000);
            } else {
                sVar.f7186I.mo8357a(true);
                sVar.f7186I.setCloseButtonStyle(C2108a.CROSS);
            }
            sVar.f7186I.mo8362c();
        }
        C2342x.m9090a(sVar.f7179B, sVar.f7185H, sVar.f7206x, sVar.f7203u);
        Pair c = sVar.f7189L.mo8343c();
        switch ((C2087a) c.first) {
            case MARKUP:
                C2342x.m9090a(sVar.f7181D);
                sVar.f7205w.addView((View) c.second, f7177j);
                return;
            case SCREENSHOTS:
                if (sVar.f7181D != null) {
                    sVar.f7181D.setVisibility(0);
                    sVar.f7181D.mo8324a();
                }
                layoutParams = new LayoutParams(-1, -1);
                layoutParams.setMargins(0, f7174g, 0, 0);
                layoutParams.addRule(2, sVar.f7181D.getId());
                break;
            case INFO:
                C2342x.m9090a(sVar.f7181D);
                layoutParams = new LayoutParams(-1, -2);
                layoutParams.addRule(15);
                layoutParams.setMargins(f7171d, f7171d, f7171d, f7171d);
                break;
            case PLAYABLE:
                AudienceNetworkActivity audienceNetworkActivity = (AudienceNetworkActivity) sVar.f7192O.get();
                if (audienceNetworkActivity != null) {
                    sVar.f7188K = Integer.valueOf(audienceNetworkActivity.getRequestedOrientation());
                    audienceNetworkActivity.setRequestedOrientation(1);
                }
                sVar.f7205w.removeAllViews();
                C2342x.m9091b(sVar.f7186I);
                sVar.f7205w.addView((View) c.second, f7177j);
                ((C2069b) c.second).mo8308c();
                return;
            default:
                return;
        }
        sVar.f7205w.addView((View) c.second, layoutParams);
        sVar.f7202t.mo8737a();
    }

    private void setUpContentLayoutForVideo(int i) {
        this.f7205w.removeAllViews();
        this.f7205w.addView(this.f7179B, f7177j);
        if (this.f7181D != null) {
            C2342x.m9081a((View) this.f7181D);
            this.f7181D.mo8325a(i);
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.addRule(12);
            this.f7181D.setPadding(f7171d, f7171d, f7171d, f7171d);
            this.f7205w.addView(this.f7181D, layoutParams);
        }
        if (this.f7185H != null) {
            LayoutParams layoutParams2 = new LayoutParams(f7173f, f7173f);
            layoutParams2.addRule(10);
            layoutParams2.addRule(11);
            this.f7185H.setPadding(f7171d, f7171d, f7171d, f7171d);
            this.f7205w.addView(this.f7185H, layoutParams2);
        }
        LayoutParams layoutParams3 = new LayoutParams(f7175h, f7175h);
        layoutParams3.addRule(10);
        layoutParams3.addRule(11);
        layoutParams3.setMargins(f7169b, f7169b + f7174g, f7169b, f7170c);
        this.f7205w.addView(this.f7206x, layoutParams3);
        m8950b();
        LayoutParams layoutParams4 = new LayoutParams(-1, -2);
        layoutParams4.addRule(12);
        this.f7205w.addView(this.f7203u, layoutParams4);
    }

    /* renamed from: a */
    public void mo8664a() {
        if (this.f7179B != null) {
            this.f7179B.mo8388g();
            this.f7179B.mo8407l();
        }
        if (this.f7200r != null) {
            this.f7200r.mo8782c();
        }
    }

    /* renamed from: a */
    public void mo7268a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        C2110a aVar;
        C2117b bVar;
        if (this.f7179B != null && this.f7180C != null) {
            this.f7192O = new WeakReference<>(audienceNetworkActivity);
            if (this.f7179B != null) {
                this.f7179B.mo8385d();
                this.f7179B.mo8381a((C2117b) new C2211k(this.f7178A));
                this.f7179B.mo8381a((C2117b) this.f7206x);
                this.f7179B.mo8381a((C2117b) this.f7203u);
                this.f7183F = new C2213l(this.f7178A, true);
                this.f7184G = new View(this.f7178A);
                this.f7184G.setLayoutParams(f7177j);
                C2342x.m9082a(this.f7184G, -1509949440);
                C2180d dVar = new C2180d(this.f7184G, C2188a.FADE_OUT_ON_PLAY, true);
                this.f7179B.addView(this.f7184G);
                this.f7179B.mo8381a((C2117b) dVar);
                C2180d dVar2 = new C2180d(this.f7183F, C2188a.FADE_OUT_ON_PLAY, true);
                this.f7179B.mo8381a((C2117b) this.f7183F);
                this.f7179B.mo8381a((C2117b) dVar2);
                C2079a aVar2 = new C2079a(this.f7178A, f7172e, this.f7207y, this.f7199q, this.f7180C, this.f7189L.mo8342b() == C2087a.INFO, this.f7189L.mo8342b() == C2087a.INFO, this.f7200r, this.f7202t);
                this.f7181D = aVar2;
                this.f7181D.setInfo(this.f7198p);
                this.f7182E = new C2180d(this.f7181D, C2188a.FADE_OUT_ON_PLAY, true);
                this.f7179B.mo8381a((C2117b) this.f7182E);
                if (this.f7189L.mo8341a() && this.f7198p.mo7235j().mo7129c() > 0) {
                    this.f7185H = new C2206j(this.f7178A, this.f7198p.mo7235j().mo7129c(), -12286980);
                    this.f7185H.setButtonMode(C2210a.SKIP_BUTTON_MODE);
                    this.f7185H.setOnClickListener(new OnClickListener() {
                        public void onClick(View view) {
                            if (!(C2277s.this.f7185H == null || !C2277s.this.f7185H.mo8512a() || C2277s.this.f7185H.getSkipSeconds() == 0 || C2277s.this.f7179B == null)) {
                                C2277s.this.f7179B.mo8387f();
                            }
                        }
                    });
                    aVar = this.f7179B;
                    bVar = this.f7185H;
                } else if (!this.f7189L.mo8341a()) {
                    this.f7186I = new C2098i(this.f7178A, this.f7180C, C1795a.m7417K(this.f7178A) ? C2108a.ARROWS : C2108a.CROSS);
                    this.f7186I.mo8355a(this.f7198p.mo7231f(), this.f7198p.mo7113a(), this.f7198p.mo7235j().mo7129c());
                    if (this.f7198p.mo7235j().mo7129c() <= 0) {
                        this.f7186I.mo8359b();
                    }
                    if (this.f7189L.mo8342b() != C2087a.INFO) {
                        this.f7186I.mo8362c();
                    }
                    this.f7186I.setToolbarListener(new C2109b() {
                        /* renamed from: a */
                        public void mo8207a() {
                            if (C2277s.this.f7202t.mo8739a(C2277s.this.getContext())) {
                                HashMap hashMap = new HashMap();
                                C2277s.this.f7200r.mo8779a((Map<String, String>) hashMap);
                                hashMap.put("touch", C2323k.m9046a(C2277s.this.f7202t.mo8743e()));
                                C2277s.this.f7199q.mo7696i(C2277s.this.f7198p.mo7113a(), hashMap);
                            } else if (C2277s.this.f7190M || C2277s.this.f7179B == null) {
                                if (C2277s.this.f7190M && C2277s.this.f7180C != null) {
                                    C2277s.this.f7180C.mo6795a(C2133aa.REWARDED_VIDEO_END_ACTIVITY.mo8442a());
                                }
                            } else {
                                C2277s.this.f7190M = true;
                                C2277s.this.f7179B.mo8387f();
                            }
                        }
                    });
                    aVar = this.f7179B;
                    bVar = this.f7186I;
                }
                aVar.mo8381a(bVar);
            }
            audienceNetworkActivity.addBackButtonInterceptor(this.f7193k);
            this.f7179B.setVideoURI(!TextUtils.isEmpty(this.f7198p.mo7235j().mo7128b()) ? this.f7198p.mo7235j().mo7128b() : this.f7198p.mo7235j().mo7126a());
            setUpContentLayoutForVideo(audienceNetworkActivity.getResources().getConfiguration().orientation);
            addView(this.f7205w, f7177j);
            if (this.f7186I != null) {
                C2342x.m9081a((View) this.f7186I);
                this.f7186I.mo8353a(this.f7207y, true);
                if (C1710a.m7130a(getContext(), true)) {
                    this.f7186I.mo8354a(this.f7198p.mo7231f(), this.f7198p.mo7113a());
                }
                addView(this.f7186I, new LayoutParams(-1, f7174g));
            }
            setLayoutParams(f7177j);
            this.f7180C.mo6793a((View) this);
        }
    }

    /* renamed from: a */
    public void mo7270a(Bundle bundle) {
    }

    /* renamed from: a_ */
    public void mo7271a_(boolean z) {
        if (this.f7179B != null && !this.f7179B.mo8408m()) {
            this.f7187J = this.f7179B.getVideoStartReason();
            this.f7191N = z;
            this.f7179B.mo8383a(false);
        }
    }

    /* renamed from: b */
    public void mo7272b(boolean z) {
        if (!(this.f7179B == null || this.f7179B.mo8409n() || this.f7179B.getState() == C2240d.PLAYBACK_COMPLETED || this.f7187J == null || (this.f7191N && !z))) {
            this.f7179B.mo8380a(this.f7187J);
        }
    }

    public int getCurrentPosition() {
        if (this.f7179B != null) {
            return this.f7179B.getCurrentPositionInMillis();
        }
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.f7181D != null) {
            this.f7181D.mo8325a(configuration.orientation);
        }
    }

    public void onDestroy() {
        mo8664a();
        if (this.f7179B != null) {
            this.f7179B.getEventBus().mo7628b((T[]) new C1779f[]{this.f7194l, this.f7195m, this.f7196n, this.f7197o});
        }
        if (!TextUtils.isEmpty(this.f7198p.mo7113a())) {
            HashMap hashMap = new HashMap();
            this.f7200r.mo8779a((Map<String, String>) hashMap);
            hashMap.put("touch", C2323k.m9046a(this.f7202t.mo8743e()));
            this.f7199q.mo7699l(this.f7198p.mo7113a(), hashMap);
        }
        if (this.f7186I != null) {
            this.f7186I.setToolbarListener(null);
        }
        if (!(this.f7188K == null || this.f7192O.get() == null)) {
            ((AudienceNetworkActivity) this.f7192O.get()).setRequestedOrientation(this.f7188K.intValue());
        }
        this.f7204v.mo8428a();
        this.f7179B = null;
        this.f7189L.mo8345e();
        this.f7185H = null;
        this.f7181D = null;
        this.f7182E = null;
        this.f7180C = null;
        this.f7178A = null;
        this.f7203u.mo8530a();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f7202t.mo8738a(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: 0000 */
    public void setEndCardController(C2082c cVar) {
        this.f7189L = cVar;
    }

    public void setListener(C1911a aVar) {
    }
}
