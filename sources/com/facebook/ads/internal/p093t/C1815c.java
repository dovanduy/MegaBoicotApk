package com.facebook.ads.internal.p093t;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p115w.p117b.C2342x;
import com.facebook.ads.internal.p125x.C2376a;
import com.facebook.ads.internal.p125x.C2376a.C2377a;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.view.C2267p;
import com.facebook.ads.internal.view.p101c.C1981e;
import com.facebook.ads.internal.view.p110i.C2229d;
import com.facebook.ads.internal.view.p110i.C2229d.C2230a;
import com.facebook.ads.internal.view.p110i.p111a.C2116a;
import com.facebook.ads.internal.view.p110i.p111a.C2117b;
import com.facebook.ads.internal.view.p110i.p113c.C2194g;
import com.facebook.ads.internal.view.p110i.p113c.C2197h;
import com.facebook.ads.internal.view.p110i.p114d.C2240d;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.t.c */
public class C1815c {

    /* renamed from: a */
    private static final String f5758a = "c";

    /* renamed from: b */
    private final C2194g f5759b;

    /* renamed from: c */
    private final C2376a f5760c;

    /* renamed from: d */
    private final C2377a f5761d;

    /* renamed from: e */
    private final View f5762e;

    /* renamed from: f */
    private final C2230a f5763f = new C2230a() {
        /* renamed from: a */
        public void mo7727a() {
            C1815c.this.f5771n.set(true);
            if (C1815c.this.f5765h != null) {
                C1815c.this.f5765h.mo6808a(C1815c.this.f5770m.get());
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C2267p f5764g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1820a f5765h;

    /* renamed from: i */
    private Context f5766i;

    /* renamed from: j */
    private boolean f5767j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f5768k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f5769l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final AtomicBoolean f5770m = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final AtomicBoolean f5771n = new AtomicBoolean(false);

    /* renamed from: o */
    private C1839l f5772o = C1839l.DEFAULT;

    /* renamed from: com.facebook.ads.internal.t.c$a */
    public interface C1820a {
        /* renamed from: a */
        void mo6808a(boolean z);
    }

    public C1815c(Context context, View view) {
        this.f5766i = context;
        this.f5762e = view;
        this.f5759b = new C2194g(context);
        this.f5761d = new C2377a() {
            /* renamed from: a */
            public void mo7108a() {
                if (C1815c.this.f5764g != null) {
                    if (!C1815c.this.f5769l && (C1815c.this.f5768k || C1815c.m7596g(C1815c.this))) {
                        C1815c.m7587a(C1815c.this, C2116a.AUTO_STARTED);
                    }
                    C1815c.this.f5768k = false;
                    C1815c.this.f5769l = false;
                }
            }

            /* renamed from: b */
            public void mo7729b() {
                if (C1815c.this.f5764g != null) {
                    C1815c.this.f5764g.mo8386e();
                }
            }
        };
        this.f5760c = new C2376a(this.f5762e, 50, true, this.f5761d);
        m7595g();
    }

    /* renamed from: a */
    static /* synthetic */ void m7587a(C1815c cVar, C2116a aVar) {
        if (cVar.f5764g != null) {
            cVar.f5764g.mo8380a(aVar);
            return;
        }
        if (AdInternalSettings.isDebugBuild()) {
            Log.e(f5758a, "MediaViewVideo is null; unable to find it.");
        }
    }

    /* renamed from: g */
    private void m7595g() {
        float f = C2342x.f7369b;
        int i = (int) (2.0f * f);
        int i2 = (int) (25.0f * f);
        C2197h hVar = new C2197h(this.f5766i);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        hVar.setPadding(i, i2, i2, i);
        hVar.setLayoutParams(layoutParams);
        int i3 = 0;
        while (true) {
            if (i3 >= ((ViewGroup) this.f5762e).getChildCount()) {
                break;
            }
            View childAt = ((ViewGroup) this.f5762e).getChildAt(0);
            if (childAt instanceof C2267p) {
                this.f5764g = (C2267p) childAt;
                break;
            }
            i3++;
        }
        if (this.f5764g != null) {
            this.f5764g.mo8381a((C2117b) this.f5759b);
            this.f5764g.mo8381a((C2117b) hVar);
        } else if (AdInternalSettings.isDebugBuild()) {
            Log.e(f5758a, "Unable to find MediaViewVideo child.");
        }
        this.f5760c.mo8778a(0);
        this.f5760c.mo8780b(250);
    }

    /* renamed from: g */
    static /* synthetic */ boolean m7596g(C1815c cVar) {
        boolean z = false;
        if (cVar.f5764g != null) {
            if (cVar.f5764g.getState() == C2240d.PLAYBACK_COMPLETED) {
                return false;
            }
            if (cVar.f5772o == C1839l.ON) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    private void m7597h() {
        if (this.f5762e.getVisibility() != 0 || !this.f5767j || !this.f5762e.hasWindowFocus()) {
            if (this.f5764g != null && this.f5764g.getState() == C2240d.PAUSED) {
                this.f5769l = true;
            }
            this.f5760c.mo8782c();
            return;
        }
        this.f5760c.mo8777a();
    }

    /* renamed from: a */
    public void mo7719a() {
        this.f5772o = C1839l.DEFAULT;
        if (this.f5764g != null) {
            ((C2229d) this.f5764g.getVideoView()).setViewImplInflationListener(null);
        }
    }

    /* renamed from: a */
    public void mo7720a(C1822e eVar) {
        mo7721a(eVar, (C1820a) null);
    }

    /* renamed from: a */
    public void mo7721a(C1822e eVar, C1820a aVar) {
        this.f5768k = false;
        this.f5769l = false;
        this.f5765h = aVar;
        if (this.f5764g != null) {
            ((C2229d) this.f5764g.getVideoView()).setViewImplInflationListener(this.f5763f);
        }
        this.f5759b.mo8499a((eVar == null || eVar.mo7757j() == null) ? null : eVar.mo7757j().mo7780a(), new C1981e() {
            /* renamed from: a */
            public void mo6849a(boolean z) {
                C1815c.this.f5770m.set(z);
                if (C1815c.this.f5771n.get() && C1815c.this.f5765h != null) {
                    C1815c.this.f5765h.mo6808a(z);
                }
            }
        });
        this.f5772o = eVar.mo7767t();
        this.f5760c.mo8777a();
    }

    /* renamed from: b */
    public void mo7722b() {
        if (this.f5764g != null) {
            this.f5764g.getVideoView().setOnTouchListener(new OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (C1815c.this.f5764g != null && motionEvent.getAction() == 1) {
                        C1815c.this.f5764g.mo8650a();
                    }
                    return true;
                }
            });
        }
    }

    /* renamed from: c */
    public void mo7723c() {
        this.f5767j = true;
        m7597h();
    }

    /* renamed from: d */
    public void mo7724d() {
        this.f5767j = false;
        m7597h();
    }

    /* renamed from: e */
    public void mo7725e() {
        m7597h();
    }

    /* renamed from: f */
    public void mo7726f() {
        m7597h();
    }
}
