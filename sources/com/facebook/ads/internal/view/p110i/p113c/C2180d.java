package com.facebook.ads.internal.view.p110i.p113c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Handler;
import android.view.View;
import com.facebook.ads.internal.p088o.C1779f;
import com.facebook.ads.internal.view.p110i.C2110a;
import com.facebook.ads.internal.view.p110i.p111a.C2117b;
import com.facebook.ads.internal.view.p110i.p112b.C2135c;
import com.facebook.ads.internal.view.p110i.p112b.C2136d;
import com.facebook.ads.internal.view.p110i.p112b.C2141i;
import com.facebook.ads.internal.view.p110i.p112b.C2142j;
import com.facebook.ads.internal.view.p110i.p112b.C2143k;
import com.facebook.ads.internal.view.p110i.p112b.C2144l;
import com.facebook.ads.internal.view.p110i.p112b.C2153u;
import com.facebook.ads.internal.view.p110i.p112b.C2154v;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;

@TargetApi(12)
/* renamed from: com.facebook.ads.internal.view.i.c.d */
public class C2180d implements C2117b {

    /* renamed from: a */
    private final C2142j f6874a;

    /* renamed from: b */
    private final C2144l f6875b;

    /* renamed from: c */
    private final C2136d f6876c;

    /* renamed from: d */
    private final C2154v f6877d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Handler f6878e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final boolean f6879f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final boolean f6880g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public View f6881h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C2188a f6882i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C2110a f6883j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f6884k;

    /* renamed from: com.facebook.ads.internal.view.i.c.d$a */
    public enum C2188a {
        VISIBLE,
        INVSIBLE,
        FADE_OUT_ON_PLAY
    }

    public C2180d(View view, C2188a aVar) {
        this(view, aVar, false);
    }

    public C2180d(View view, C2188a aVar, boolean z) {
        this(view, aVar, z, false);
    }

    public C2180d(View view, C2188a aVar, boolean z, boolean z2) {
        this.f6874a = new C2142j() {
            /* renamed from: a */
            public void mo6895a(C2141i iVar) {
                C2180d.this.m8676a(1, 0);
            }
        };
        this.f6875b = new C2144l() {
            /* renamed from: a */
            public void mo6895a(C2143k kVar) {
                if (C2180d.this.f6884k) {
                    if (C2180d.this.f6882i == C2188a.FADE_OUT_ON_PLAY || C2180d.this.f6879f) {
                        C2180d.this.f6882i = null;
                        C2180d.this.f6881h.animate().alpha(0.0f).setDuration(500).setListener(new AnimatorListenerAdapter() {
                            public void onAnimationEnd(Animator animator) {
                                C2180d.this.f6881h.setVisibility(8);
                            }
                        });
                        return;
                    }
                    C2180d.this.m8676a(0, 8);
                }
            }
        };
        this.f6876c = new C2136d() {
            /* renamed from: a */
            public void mo6895a(C2135c cVar) {
                if (C2180d.this.f6882i != C2188a.INVSIBLE) {
                    C2180d.this.f6881h.setAlpha(1.0f);
                    C2180d.this.f6881h.setVisibility(0);
                }
            }
        };
        this.f6877d = new C2154v() {
            /* renamed from: a */
            public void mo6895a(C2153u uVar) {
                if (C2180d.this.f6883j != null && uVar.mo8447a().getAction() == 0) {
                    C2180d.this.f6878e.removeCallbacksAndMessages(null);
                    C2180d.this.m8677a((AnimatorListenerAdapter) new AnimatorListenerAdapter() {
                        public void onAnimationEnd(Animator animator) {
                            C2180d.this.f6878e.postDelayed(new Runnable() {
                                public void run() {
                                    if (!C2180d.this.f6880g && C2180d.this.f6884k) {
                                        C2180d.this.f6881h.animate().alpha(0.0f).setDuration(500).setListener(new AnimatorListenerAdapter() {
                                            public void onAnimationEnd(Animator animator) {
                                                C2180d.this.f6881h.setVisibility(8);
                                            }
                                        });
                                    }
                                }
                            }, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                        }
                    });
                }
            }
        };
        this.f6884k = true;
        this.f6878e = new Handler();
        this.f6879f = z;
        this.f6880g = z2;
        mo8483a(view, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8676a(int i, int i2) {
        this.f6878e.removeCallbacksAndMessages(null);
        this.f6881h.clearAnimation();
        this.f6881h.setAlpha((float) i);
        this.f6881h.setVisibility(i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8677a(AnimatorListenerAdapter animatorListenerAdapter) {
        this.f6881h.setVisibility(0);
        this.f6881h.animate().alpha(1.0f).setDuration(500).setListener(animatorListenerAdapter);
    }

    /* renamed from: a */
    public void mo8483a(View view, C2188a aVar) {
        View view2;
        int i;
        this.f6882i = aVar;
        this.f6881h = view;
        this.f6881h.clearAnimation();
        if (aVar == C2188a.INVSIBLE) {
            this.f6881h.setAlpha(0.0f);
            view2 = this.f6881h;
            i = 8;
        } else {
            this.f6881h.setAlpha(1.0f);
            view2 = this.f6881h;
            i = 0;
        }
        view2.setVisibility(i);
    }

    /* renamed from: a */
    public void mo8356a(C2110a aVar) {
        this.f6883j = aVar;
        aVar.getEventBus().mo7626a((T[]) new C1779f[]{this.f6874a, this.f6875b, this.f6877d, this.f6876c});
    }

    /* renamed from: a */
    public boolean mo8484a() {
        return this.f6884k;
    }

    /* renamed from: b */
    public void mo8485b() {
        this.f6884k = false;
        m8677a((AnimatorListenerAdapter) null);
    }

    /* renamed from: b */
    public void mo8360b(C2110a aVar) {
        m8676a(1, 0);
        aVar.getEventBus().mo7628b((T[]) new C1779f[]{this.f6876c, this.f6877d, this.f6875b, this.f6874a});
        this.f6883j = null;
    }
}
