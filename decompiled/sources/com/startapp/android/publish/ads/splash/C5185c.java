package com.startapp.android.publish.ads.splash;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.p177a.C5319f;
import com.startapp.android.publish.adsCommon.p177a.C5320g;
import com.startapp.android.publish.cache.C5436a;
import com.startapp.android.publish.cache.C5445c;
import com.startapp.android.publish.common.metaData.C5481d;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences.Placement;
import com.startapp.common.C5523b;
import com.startapp.common.Constants;
import com.startapp.common.p193a.C5518g;
import com.startapp.common.p193a.C5522i;

/* renamed from: com.startapp.android.publish.ads.splash.c */
/* compiled from: StartAppSDK */
public class C5185c {

    /* renamed from: a */
    Activity f16668a;

    /* renamed from: b */
    boolean f16669b;

    /* renamed from: c */
    C5190a f16670c;

    /* renamed from: d */
    private boolean f16671d;

    /* renamed from: e */
    private boolean f16672e;

    /* renamed from: f */
    private boolean f16673f;

    /* renamed from: g */
    private boolean f16674g;

    /* renamed from: h */
    private boolean f16675h;

    /* renamed from: i */
    private C5191d f16676i;

    /* renamed from: j */
    private BroadcastReceiver f16677j;

    /* renamed from: com.startapp.android.publish.ads.splash.c$a */
    /* compiled from: StartAppSDK */
    enum C5190a {
        LOADING,
        RECEIVED,
        DISPLAYED,
        HIDDEN,
        DO_NOT_DISPLAY
    }

    public C5185c(Activity activity) {
        this.f16671d = false;
        this.f16672e = true;
        this.f16673f = false;
        this.f16674g = false;
        this.f16675h = false;
        this.f16669b = false;
        this.f16670c = C5190a.LOADING;
        this.f16676i = null;
        this.f16677j = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                C5185c.this.mo19189i();
            }
        };
        this.f16668a = activity;
    }

    public C5185c(Activity activity, C5191d dVar) {
        this(activity);
        this.f16676i = dVar;
    }

    /* renamed from: a */
    public void mo19179a(final Runnable runnable, final C5445c cVar) {
        C5518g.m23563a("Splash", 4, "Minimum splash screen time has passed");
        this.f16671d = true;
        C51861 r0 = new C5481d() {

            /* renamed from: d */
            private Runnable f16681d = new Runnable() {
                public void run() {
                    C5185c.this.f16669b = true;
                    if (C5185c.this.f16670c != C5190a.DO_NOT_DISPLAY) {
                        C5185c.this.mo19183c(runnable, cVar);
                    }
                }
            };

            /* renamed from: a */
            public void mo19192a(boolean z) {
                C5518g.m23563a("Splash", 4, "MetaData received");
                C5185c.this.f16668a.runOnUiThread(this.f16681d);
            }

            /* renamed from: a */
            public void mo19191a() {
                C5518g.m23563a("Splash", 4, "MetaData failed to receive - proceeding with old MetaData");
                C5185c.this.f16668a.runOnUiThread(this.f16681d);
            }
        };
        if (this.f16670c != C5190a.DO_NOT_DISPLAY) {
            m22235a((C5481d) r0);
        } else {
            m22237k();
        }
    }

    /* renamed from: a */
    public void mo19175a() {
        this.f16671d = true;
    }

    /* renamed from: a */
    private void m22235a(C5481d dVar) {
        synchronized (MetaData.getLock()) {
            if (MetaData.getInstance().isReady()) {
                dVar.mo19192a(false);
            } else {
                MetaData.getInstance().addMetaDataListener(dVar);
            }
        }
    }

    /* renamed from: a */
    public void mo19178a(Runnable runnable) {
        C5518g.m23563a("Splash", 4, "Splash ad received");
        if (this.f16670c == C5190a.LOADING) {
            this.f16670c = C5190a.RECEIVED;
        }
        m22236b(runnable);
    }

    /* renamed from: b */
    public void mo19180b() {
        C5518g.m23563a("Splash", 4, "Error receiving Ad");
        this.f16670c = C5190a.DO_NOT_DISPLAY;
        m22236b(null);
    }

    /* renamed from: b */
    public boolean mo19181b(Runnable runnable, C5445c cVar) {
        if (!this.f16675h) {
            if (this.f16670c == C5190a.LOADING) {
                C5518g.m23563a("Splash", 4, "Splash Loading Timer Expired");
                this.f16672e = false;
                this.f16670c = C5190a.DO_NOT_DISPLAY;
                m22237k();
                return true;
            } else if (this.f16670c == C5190a.RECEIVED) {
                C5518g.m23563a("Splash", 4, "MetaData Loading Timer Expired - proceeding with old MetaData");
                this.f16669b = true;
                mo19183c(runnable, cVar);
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo19183c(Runnable runnable, C5445c cVar) {
        C5319f a = C5320g.m22714a().mo19663b().mo19655a(Placement.INAPP_SPLASH, null);
        StringBuilder sb = new StringBuilder();
        sb.append("checkAdRulesAndShowAd: shouldDisplayAd ");
        sb.append(a.mo19660a());
        C5518g.m23563a("Splash", 4, sb.toString());
        if (a.mo19660a()) {
            C5518g.m23563a("Splash", 4, "checkAdRulesAndShowAd: showAd");
            m22236b(runnable);
            return;
        }
        C5518g.m23563a("Splash", 4, "Should not display splash ad");
        this.f16670c = C5190a.DO_NOT_DISPLAY;
        if (cVar != null) {
            C5349c.m22864a((Context) this.f16668a, C5349c.m22871a(C5436a.m23246a().mo20080b(cVar)), (String) null, a.mo19662c());
        }
        if (Constants.m23468a().booleanValue()) {
            C5522i.m23586a().mo20502a(this.f16668a, a.mo19661b());
        }
        m22237k();
    }

    /* renamed from: c */
    public void mo19182c() {
        C5518g.m23563a("Splash", 4, "Splash Screen has been hidden");
        this.f16670c = C5190a.HIDDEN;
        mo19187g();
        if (!this.f16668a.isFinishing()) {
            this.f16668a.finish();
        }
    }

    /* renamed from: d */
    public void mo19184d() {
        this.f16670c = C5190a.DISPLAYED;
    }

    /* renamed from: b */
    private void m22236b(Runnable runnable) {
        if (!this.f16671d) {
            return;
        }
        if (!this.f16669b && runnable != null) {
            return;
        }
        if (this.f16670c == C5190a.RECEIVED && runnable != null) {
            this.f16672e = false;
            runnable.run();
        } else if (this.f16670c != C5190a.LOADING) {
            m22237k();
        }
    }

    /* renamed from: a */
    public void mo19177a(StartAppAd startAppAd) {
        if (this.f16670c == C5190a.DISPLAYED) {
            C5518g.m23563a("Splash", 4, "Splash Ad Display Timeout");
            if (!this.f16674g) {
                C5518g.m23563a("Splash", 4, "Closing Splash Ad");
                startAppAd.close();
                mo19182c();
            }
        }
    }

    /* renamed from: e */
    public void mo19185e() {
        if (this.f16670c != C5190a.DISPLAYED && this.f16670c != C5190a.DO_NOT_DISPLAY) {
            this.f16670c = C5190a.DO_NOT_DISPLAY;
            if (this.f16672e) {
                mo19186f();
            }
        }
    }

    /* renamed from: f */
    public void mo19186f() {
        C5518g.m23563a("Splash", 4, "User Canceled Splash Screen");
        mo19187g();
    }

    /* renamed from: k */
    private void m22237k() {
        mo19176a(this.f16676i, (C5193e) new C5193e() {
            /* renamed from: a */
            public void mo19194a() {
                C5518g.m23563a("Splash", 4, "Loading Main Activity");
                C5185c.this.mo19187g();
                if (!C5185c.this.f16668a.isFinishing()) {
                    C5185c.this.f16668a.finish();
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo19187g() {
        if (!this.f16673f) {
            this.f16673f = true;
            C5523b.m23588a((Context) this.f16668a).mo20506a(new Intent("com.startapp.android.splashHidden"));
        }
        if (this.f16677j != null) {
            try {
                Log.v("startapp", "unregistering receiver");
                C5523b.m23588a((Context) this.f16668a).mo20504a(this.f16677j);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: h */
    public void mo19188h() {
        this.f16675h = true;
    }

    /* renamed from: i */
    public void mo19189i() {
        this.f16674g = true;
    }

    /* renamed from: j */
    public void mo19190j() {
        C5523b.m23588a((Context) this.f16668a).mo20505a(this.f16677j, new IntentFilter("com.startapp.android.adInfoWasClickedBroadcastListener"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19176a(C5191d dVar, C5193e eVar) {
        if (dVar == null) {
            eVar.mo19194a();
            return;
        }
        dVar.mo19198a(eVar);
        dVar.mo19199b();
    }
}
