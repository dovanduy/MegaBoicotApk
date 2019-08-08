package com.startapp.android.publish.ads.splash;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.startapp.android.publish.ads.splash.SplashConfig.MaxAdDisplayTime;
import com.startapp.android.publish.ads.splash.SplashConfig.Orientation;
import com.startapp.android.publish.adsCommon.C5286Ad;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.adListeners.AdDisplayListener;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.p177a.C5319f;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.cache.C5445c;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5518g;

/* renamed from: com.startapp.android.publish.ads.splash.h */
/* compiled from: StartAppSDK */
public class C5196h {

    /* renamed from: a */
    Activity f16700a;

    /* renamed from: b */
    C5185c f16701b;

    /* renamed from: c */
    C5445c f16702c;

    /* renamed from: d */
    C5191d f16703d = null;

    /* renamed from: e */
    boolean f16704e = false;

    /* renamed from: f */
    C5206a f16705f;

    /* renamed from: g */
    Runnable f16706g = new Runnable() {
        public void run() {
            C5196h.this.f16701b.mo19176a(C5196h.this.f16703d, (C5193e) new C5193e() {
                /* renamed from: a */
                public void mo19194a() {
                    if (!C5196h.this.f16704e && C5196h.this.f16705f != null) {
                        C5518g.m23563a("Splash", 4, "Displaying Splash ad");
                        C5196h.this.f16705f.showAd((AdDisplayListener) new AdDisplayListener() {
                            public void adNotDisplayed(C5286Ad ad) {
                            }

                            public void adHidden(C5286Ad ad) {
                                C5196h.this.f16701b.mo19182c();
                            }

                            public void adDisplayed(C5286Ad ad) {
                                C5196h.this.f16701b.mo19184d();
                            }

                            public void adClicked(C5286Ad ad) {
                                C5196h.this.f16701b.mo19189i();
                            }
                        });
                        C5196h.this.mo19212f();
                        C5196h.this.f16700a.finish();
                    }
                }
            });
        }
    };

    /* renamed from: h */
    private SplashConfig f16707h;

    /* renamed from: i */
    private Handler f16708i = new Handler();

    /* renamed from: j */
    private AdPreferences f16709j;

    /* renamed from: k */
    private Runnable f16710k = new Runnable() {
        public void run() {
            if (C5196h.this.mo19209c()) {
                C5196h.this.mo19210d();
                C5196h.this.mo19211e();
                return;
            }
            C5196h.this.f16700a.finish();
        }
    };

    /* renamed from: l */
    private AdEventListener f16711l = new AdEventListener() {
        public void onReceiveAd(C5286Ad ad) {
            C5518g.m23563a("Splash", 4, "Splash ad received");
            C5196h.this.f16701b.mo19178a(C5196h.this.f16706g);
        }

        public void onFailedToReceiveAd(C5286Ad ad) {
            if (C5196h.this.f16705f != null) {
                C5196h.this.f16701b.mo19180b();
            }
        }
    };

    /* renamed from: com.startapp.android.publish.ads.splash.h$a */
    /* compiled from: StartAppSDK */
    private static class C5206a extends StartAppAd {
        private static final long serialVersionUID = 1;

        public C5206a(Context context) {
            super(context);
            this.placement = Placement.INAPP_SPLASH;
        }

        /* access modifiers changed from: protected */
        public C5319f shouldDisplayAd(String str, Placement placement) {
            return new C5319f(true);
        }
    }

    /* renamed from: a */
    public void mo19206a() {
    }

    public C5196h(Activity activity, SplashConfig splashConfig, AdPreferences adPreferences) {
        this.f16700a = activity;
        this.f16707h = splashConfig;
        this.f16709j = adPreferences;
        try {
            m22276h();
            this.f16701b = new C5185c(activity, this.f16703d);
        } catch (Exception e) {
            this.f16701b = new C5185c(activity);
            this.f16701b.mo19175a();
            this.f16701b.mo19180b();
            C5378f.m23016a(activity, C5376d.EXCEPTION, "SplashScreen.constructor - WebView failed", e.getMessage(), "");
        }
    }

    /* renamed from: h */
    private void m22276h() {
        this.f16707h.initSplashLogo(this.f16700a);
        if (!m22279k()) {
            this.f16703d = this.f16707h.initSplashHtml(this.f16700a);
        }
    }

    /* renamed from: a */
    public void mo19207a(Bundle bundle) {
        C5518g.m23563a("Splash", 4, "========= Splash Screen Feature =========");
        this.f16701b.mo19190j();
        if (!m22277i()) {
            this.f16708i.post(this.f16710k);
            return;
        }
        this.f16708i.postDelayed(this.f16710k, 100);
        C5518g.m23563a("Splash", 4, "Splash screen orientation is being modified");
    }

    /* renamed from: b */
    public void mo19208b() {
        this.f16708i.removeCallbacks(this.f16710k);
        this.f16701b.mo19185e();
    }

    /* renamed from: i */
    private boolean m22277i() {
        int i = this.f16700a.getResources().getConfiguration().orientation;
        if (this.f16707h.getOrientation() == Orientation.AUTO) {
            if (i == 2) {
                this.f16707h.setOrientation(Orientation.LANDSCAPE);
            } else {
                this.f16707h.setOrientation(Orientation.PORTRAIT);
            }
        }
        boolean z = false;
        switch (this.f16707h.getOrientation()) {
            case PORTRAIT:
                if (i == 2) {
                    z = true;
                }
                C5509c.m23505a(this.f16700a);
                break;
            case LANDSCAPE:
                if (i == 1) {
                    z = true;
                }
                C5509c.m23523b(this.f16700a);
                break;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Set Orientation: [");
        sb.append(this.f16707h.getOrientation().toString());
        sb.append("]");
        C5518g.m23563a("Splash", 4, sb.toString());
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo19209c() {
        C5518g.m23563a("Splash", 4, "Displaying Splash screen");
        if (!this.f16707h.validate(this.f16700a)) {
            throw new IllegalArgumentException(this.f16707h.getErrorMessage());
        }
        View j = m22278j();
        if (j == null) {
            return false;
        }
        this.f16700a.setContentView(j, new LayoutParams(-1, -1));
        return true;
    }

    /* renamed from: j */
    private View m22278j() {
        if (m22279k()) {
            return this.f16707h.getLayout(this.f16700a);
        }
        if (this.f16703d != null) {
            return this.f16703d.mo19201c();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo19210d() {
        C5518g.m23563a("Splash", 4, "Loading Splash Ad");
        this.f16705f = new C5206a(this.f16700a.getApplicationContext());
        this.f16702c = this.f16705f.loadSplash(this.f16709j, this.f16711l);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo19211e() {
        C5518g.m23563a("Splash", 4, "Started Splash Loading Timer");
        this.f16708i.postDelayed(new Runnable() {
            public void run() {
                if (C5196h.this.f16701b.mo19181b(C5196h.this.f16706g, C5196h.this.f16702c)) {
                    C5196h.this.f16705f = null;
                    C5196h.this.f16702c = null;
                }
            }
        }, this.f16707h.getMaxLoadAdTimeout().longValue());
        this.f16708i.postDelayed(new Runnable() {
            public void run() {
                C5196h.this.f16701b.mo19179a(C5196h.this.f16706g, C5196h.this.f16702c);
            }
        }, this.f16707h.getMinSplashTime().getIndex());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo19212f() {
        C5518g.m23563a("Splash", 4, "Started Splash Display Timer");
        if (this.f16707h.getMaxAdDisplayTime() != MaxAdDisplayTime.FOR_EVER) {
            this.f16708i.postDelayed(new Runnable() {
                public void run() {
                    C5196h.this.f16701b.mo19177a((StartAppAd) C5196h.this.f16705f);
                }
            }, this.f16707h.getMaxAdDisplayTime().getIndex());
        }
    }

    /* renamed from: g */
    public void mo19213g() {
        this.f16704e = true;
        this.f16701b.mo19188h();
    }

    /* renamed from: k */
    private boolean m22279k() {
        return !this.f16707h.isHtmlSplash() || this.f16707h.isUserDefinedSplash();
    }
}
