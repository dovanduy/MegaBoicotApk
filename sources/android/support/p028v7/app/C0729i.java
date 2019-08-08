package android.support.p028v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p017v4.view.C0595r;
import android.support.p017v4.view.C0602v;
import android.support.p017v4.view.C0606w;
import android.support.p017v4.view.C0607x;
import android.support.p017v4.view.C0608y;
import android.support.p028v7.app.ActionBar.C0683a;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p029a.C0672a.C0678f;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.support.p028v7.view.C0761a;
import android.support.p028v7.view.C0762b;
import android.support.p028v7.view.C0762b.C0763a;
import android.support.p028v7.view.C0769g;
import android.support.p028v7.view.C0772h;
import android.support.p028v7.view.menu.C0790h;
import android.support.p028v7.view.menu.C0790h.C0791a;
import android.support.p028v7.widget.ActionBarContainer;
import android.support.p028v7.widget.ActionBarContextView;
import android.support.p028v7.widget.ActionBarOverlayLayout;
import android.support.p028v7.widget.ActionBarOverlayLayout.C0822a;
import android.support.p028v7.widget.C0961ap;
import android.support.p028v7.widget.C1031u;
import android.support.p028v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.i */
/* compiled from: WindowDecorActionBar */
public class C0729i extends ActionBar implements C0822a {

    /* renamed from: s */
    static final /* synthetic */ boolean f2033s = true;

    /* renamed from: t */
    private static final Interpolator f2034t = new AccelerateInterpolator();

    /* renamed from: u */
    private static final Interpolator f2035u = new DecelerateInterpolator();

    /* renamed from: A */
    private boolean f2036A;

    /* renamed from: B */
    private boolean f2037B;

    /* renamed from: C */
    private ArrayList<C0683a> f2038C = new ArrayList<>();

    /* renamed from: D */
    private boolean f2039D;

    /* renamed from: E */
    private int f2040E = 0;

    /* renamed from: F */
    private boolean f2041F;

    /* renamed from: G */
    private boolean f2042G = true;

    /* renamed from: H */
    private boolean f2043H;

    /* renamed from: a */
    Context f2044a;

    /* renamed from: b */
    ActionBarOverlayLayout f2045b;

    /* renamed from: c */
    ActionBarContainer f2046c;

    /* renamed from: d */
    C1031u f2047d;

    /* renamed from: e */
    ActionBarContextView f2048e;

    /* renamed from: f */
    View f2049f;

    /* renamed from: g */
    C0961ap f2050g;

    /* renamed from: h */
    C0733a f2051h;

    /* renamed from: i */
    C0762b f2052i;

    /* renamed from: j */
    C0763a f2053j;

    /* renamed from: k */
    boolean f2054k = true;

    /* renamed from: l */
    boolean f2055l;

    /* renamed from: m */
    boolean f2056m;

    /* renamed from: n */
    C0772h f2057n;

    /* renamed from: o */
    boolean f2058o;

    /* renamed from: p */
    final C0606w f2059p = new C0607x() {
        /* renamed from: b */
        public void mo2132b(View view) {
            if (C0729i.this.f2054k && C0729i.this.f2049f != null) {
                C0729i.this.f2049f.setTranslationY(0.0f);
                C0729i.this.f2046c.setTranslationY(0.0f);
            }
            C0729i.this.f2046c.setVisibility(8);
            C0729i.this.f2046c.setTransitioning(false);
            C0729i.this.f2057n = null;
            C0729i.this.mo2791h();
            if (C0729i.this.f2045b != null) {
                C0595r.m2267p(C0729i.this.f2045b);
            }
        }
    };

    /* renamed from: q */
    final C0606w f2060q = new C0607x() {
        /* renamed from: b */
        public void mo2132b(View view) {
            C0729i.this.f2057n = null;
            C0729i.this.f2046c.requestLayout();
        }
    };

    /* renamed from: r */
    final C0608y f2061r = new C0608y() {
        /* renamed from: a */
        public void mo2134a(View view) {
            ((View) C0729i.this.f2046c.getParent()).invalidate();
        }
    };

    /* renamed from: v */
    private Context f2062v;

    /* renamed from: w */
    private Activity f2063w;

    /* renamed from: x */
    private Dialog f2064x;

    /* renamed from: y */
    private ArrayList<Object> f2065y = new ArrayList<>();

    /* renamed from: z */
    private int f2066z = -1;

    /* renamed from: android.support.v7.app.i$a */
    /* compiled from: WindowDecorActionBar */
    public class C0733a extends C0762b implements C0791a {

        /* renamed from: b */
        private final Context f2071b;

        /* renamed from: c */
        private final C0790h f2072c;

        /* renamed from: d */
        private C0763a f2073d;

        /* renamed from: e */
        private WeakReference<View> f2074e;

        public C0733a(Context context, C0763a aVar) {
            this.f2071b = context;
            this.f2073d = aVar;
            this.f2072c = new C0790h(context).mo3156a(1);
            this.f2072c.mo3164a((C0791a) this);
        }

        /* renamed from: a */
        public MenuInflater mo2800a() {
            return new C0769g(this.f2071b);
        }

        /* renamed from: b */
        public Menu mo2805b() {
            return this.f2072c;
        }

        /* renamed from: c */
        public void mo2808c() {
            if (C0729i.this.f2051h == this) {
                if (!C0729i.m2952a(C0729i.this.f2055l, C0729i.this.f2056m, false)) {
                    C0729i.this.f2052i = this;
                    C0729i.this.f2053j = this.f2073d;
                } else {
                    this.f2073d.mo2723a(this);
                }
                this.f2073d = null;
                C0729i.this.mo2796j(false);
                C0729i.this.f2048e.mo3440b();
                C0729i.this.f2047d.mo5102a().sendAccessibilityEvent(32);
                C0729i.this.f2045b.setHideOnContentScrollEnabled(C0729i.this.f2058o);
                C0729i.this.f2051h = null;
            }
        }

        /* renamed from: d */
        public void mo2809d() {
            if (C0729i.this.f2051h == this) {
                this.f2072c.mo3205h();
                try {
                    this.f2073d.mo2726b(this, this.f2072c);
                } finally {
                    this.f2072c.mo3207i();
                }
            }
        }

        /* renamed from: e */
        public boolean mo2810e() {
            this.f2072c.mo3205h();
            try {
                return this.f2073d.mo2724a((C0762b) this, (Menu) this.f2072c);
            } finally {
                this.f2072c.mo3207i();
            }
        }

        /* renamed from: a */
        public void mo2802a(View view) {
            C0729i.this.f2048e.setCustomView(view);
            this.f2074e = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo2803a(CharSequence charSequence) {
            C0729i.this.f2048e.setSubtitle(charSequence);
        }

        /* renamed from: b */
        public void mo2807b(CharSequence charSequence) {
            C0729i.this.f2048e.setTitle(charSequence);
        }

        /* renamed from: a */
        public void mo2801a(int i) {
            mo2807b((CharSequence) C0729i.this.f2044a.getResources().getString(i));
        }

        /* renamed from: b */
        public void mo2806b(int i) {
            mo2803a((CharSequence) C0729i.this.f2044a.getResources().getString(i));
        }

        /* renamed from: f */
        public CharSequence mo2811f() {
            return C0729i.this.f2048e.getTitle();
        }

        /* renamed from: g */
        public CharSequence mo2812g() {
            return C0729i.this.f2048e.getSubtitle();
        }

        /* renamed from: a */
        public void mo2804a(boolean z) {
            super.mo2804a(z);
            C0729i.this.f2048e.setTitleOptional(z);
        }

        /* renamed from: h */
        public boolean mo2813h() {
            return C0729i.this.f2048e.mo3442d();
        }

        /* renamed from: i */
        public View mo2814i() {
            if (this.f2074e != null) {
                return (View) this.f2074e.get();
            }
            return null;
        }

        /* renamed from: a */
        public boolean mo2667a(C0790h hVar, MenuItem menuItem) {
            if (this.f2073d != null) {
                return this.f2073d.mo2725a((C0762b) this, menuItem);
            }
            return false;
        }

        /* renamed from: a */
        public void mo2661a(C0790h hVar) {
            if (this.f2073d != null) {
                mo2809d();
                C0729i.this.f2048e.mo3439a();
            }
        }
    }

    /* renamed from: a */
    static boolean m2952a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: m */
    public void mo2799m() {
    }

    public C0729i(Activity activity, boolean z) {
        this.f2063w = activity;
        View decorView = activity.getWindow().getDecorView();
        m2951a(decorView);
        if (!z) {
            this.f2049f = decorView.findViewById(16908290);
        }
    }

    public C0729i(Dialog dialog) {
        this.f2064x = dialog;
        m2951a(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    private void m2951a(View view) {
        this.f2045b = (ActionBarOverlayLayout) view.findViewById(C0678f.decor_content_parent);
        if (this.f2045b != null) {
            this.f2045b.setActionBarVisibilityCallback(this);
        }
        this.f2047d = m2953b(view.findViewById(C0678f.action_bar));
        this.f2048e = (ActionBarContextView) view.findViewById(C0678f.action_context_bar);
        this.f2046c = (ActionBarContainer) view.findViewById(C0678f.action_bar_container);
        if (this.f2047d == null || this.f2048e == null || this.f2046c == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used ");
            sb.append("with a compatible window decor layout");
            throw new IllegalStateException(sb.toString());
        }
        this.f2044a = this.f2047d.mo5112b();
        boolean z = (this.f2047d.mo5136o() & 4) != 0;
        if (z) {
            this.f2036A = true;
        }
        C0761a a = C0761a.m3097a(this.f2044a);
        mo2576a(a.mo2951f() || z);
        m2954k(a.mo2949d());
        TypedArray obtainStyledAttributes = this.f2044a.obtainStyledAttributes(null, C0682j.ActionBar, C0673a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0682j.ActionBar_hideOnContentScroll, false)) {
            mo2580b(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0682j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo2573a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private C1031u m2953b(View view) {
        if (view instanceof C1031u) {
            return (C1031u) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public void mo2573a(float f) {
        C0595r.m2232a((View) this.f2046c, f);
    }

    /* renamed from: a */
    public void mo2574a(Configuration configuration) {
        m2954k(C0761a.m3097a(this.f2044a).mo2949d());
    }

    /* renamed from: k */
    private void m2954k(boolean z) {
        this.f2039D = z;
        if (!this.f2039D) {
            this.f2047d.mo5106a((C0961ap) null);
            this.f2046c.setTabContainer(this.f2050g);
        } else {
            this.f2046c.setTabContainer(null);
            this.f2047d.mo5106a(this.f2050g);
        }
        boolean z2 = true;
        boolean z3 = mo2793i() == 2;
        if (this.f2050g != null) {
            if (z3) {
                this.f2050g.setVisibility(0);
                if (this.f2045b != null) {
                    C0595r.m2267p(this.f2045b);
                }
            } else {
                this.f2050g.setVisibility(8);
            }
        }
        this.f2047d.mo5111a(!this.f2039D && z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2045b;
        if (this.f2039D || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo2791h() {
        if (this.f2053j != null) {
            this.f2053j.mo2723a(this.f2052i);
            this.f2052i = null;
            this.f2053j = null;
        }
    }

    /* renamed from: a */
    public void mo2787a(int i) {
        this.f2040E = i;
    }

    /* renamed from: d */
    public void mo2583d(boolean z) {
        this.f2043H = z;
        if (!z && this.f2057n != null) {
            this.f2057n.mo3000c();
        }
    }

    /* renamed from: e */
    public void mo2585e(boolean z) {
        if (z != this.f2037B) {
            this.f2037B = z;
            int size = this.f2038C.size();
            for (int i = 0; i < size; i++) {
                ((C0683a) this.f2038C.get(i)).mo2589a(z);
            }
        }
    }

    /* renamed from: f */
    public void mo2789f(boolean z) {
        mo2788a(z ? 4 : 0, 4);
    }

    /* renamed from: a */
    public void mo2576a(boolean z) {
        this.f2047d.mo5116b(z);
    }

    /* renamed from: a */
    public void mo2575a(CharSequence charSequence) {
        this.f2047d.mo5110a(charSequence);
    }

    /* renamed from: a */
    public void mo2788a(int i, int i2) {
        int o = this.f2047d.mo5136o();
        if ((i2 & 4) != 0) {
            this.f2036A = true;
        }
        this.f2047d.mo5117c((i & i2) | ((i2 ^ -1) & o));
    }

    /* renamed from: i */
    public int mo2793i() {
        return this.f2047d.mo5137p();
    }

    /* renamed from: a */
    public int mo2571a() {
        return this.f2047d.mo5136o();
    }

    /* renamed from: a */
    public C0762b mo2572a(C0763a aVar) {
        if (this.f2051h != null) {
            this.f2051h.mo2808c();
        }
        this.f2045b.setHideOnContentScrollEnabled(false);
        this.f2048e.mo3441c();
        C0733a aVar2 = new C0733a(this.f2048e.getContext(), aVar);
        if (!aVar2.mo2810e()) {
            return null;
        }
        this.f2051h = aVar2;
        aVar2.mo2809d();
        this.f2048e.mo3438a(aVar2);
        mo2796j(true);
        this.f2048e.sendAccessibilityEvent(32);
        return aVar2;
    }

    /* renamed from: g */
    public void mo2790g(boolean z) {
        this.f2054k = z;
    }

    /* renamed from: n */
    private void m2956n() {
        if (!this.f2041F) {
            this.f2041F = true;
            if (this.f2045b != null) {
                this.f2045b.setShowingForActionMode(true);
            }
            m2955l(false);
        }
    }

    /* renamed from: j */
    public void mo2795j() {
        if (this.f2056m) {
            this.f2056m = false;
            m2955l(true);
        }
    }

    /* renamed from: o */
    private void m2957o() {
        if (this.f2041F) {
            this.f2041F = false;
            if (this.f2045b != null) {
                this.f2045b.setShowingForActionMode(false);
            }
            m2955l(false);
        }
    }

    /* renamed from: k */
    public void mo2797k() {
        if (!this.f2056m) {
            this.f2056m = true;
            m2955l(true);
        }
    }

    /* renamed from: b */
    public void mo2580b(boolean z) {
        if (!z || this.f2045b.mo3466a()) {
            this.f2058o = z;
            this.f2045b.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: l */
    private void m2955l(boolean z) {
        if (m2952a(this.f2055l, this.f2056m, this.f2041F)) {
            if (!this.f2042G) {
                this.f2042G = true;
                mo2792h(z);
            }
        } else if (this.f2042G) {
            this.f2042G = false;
            mo2794i(z);
        }
    }

    /* renamed from: h */
    public void mo2792h(boolean z) {
        if (this.f2057n != null) {
            this.f2057n.mo3000c();
        }
        this.f2046c.setVisibility(0);
        if (this.f2040E != 0 || (!this.f2043H && !z)) {
            this.f2046c.setAlpha(1.0f);
            this.f2046c.setTranslationY(0.0f);
            if (this.f2054k && this.f2049f != null) {
                this.f2049f.setTranslationY(0.0f);
            }
            this.f2060q.mo2132b(null);
        } else {
            this.f2046c.setTranslationY(0.0f);
            float f = (float) (-this.f2046c.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f2046c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f2046c.setTranslationY(f);
            C0772h hVar = new C0772h();
            C0602v b = C0595r.m2263l(this.f2046c).mo2123b(0.0f);
            b.mo2121a(this.f2061r);
            hVar.mo2994a(b);
            if (this.f2054k && this.f2049f != null) {
                this.f2049f.setTranslationY(f);
                hVar.mo2994a(C0595r.m2263l(this.f2049f).mo2123b(0.0f));
            }
            hVar.mo2997a(f2035u);
            hVar.mo2993a(250);
            hVar.mo2996a(this.f2060q);
            this.f2057n = hVar;
            hVar.mo2998a();
        }
        if (this.f2045b != null) {
            C0595r.m2267p(this.f2045b);
        }
    }

    /* renamed from: i */
    public void mo2794i(boolean z) {
        if (this.f2057n != null) {
            this.f2057n.mo3000c();
        }
        if (this.f2040E != 0 || (!this.f2043H && !z)) {
            this.f2059p.mo2132b(null);
            return;
        }
        this.f2046c.setAlpha(1.0f);
        this.f2046c.setTransitioning(true);
        C0772h hVar = new C0772h();
        float f = (float) (-this.f2046c.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f2046c.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C0602v b = C0595r.m2263l(this.f2046c).mo2123b(f);
        b.mo2121a(this.f2061r);
        hVar.mo2994a(b);
        if (this.f2054k && this.f2049f != null) {
            hVar.mo2994a(C0595r.m2263l(this.f2049f).mo2123b(f));
        }
        hVar.mo2997a(f2034t);
        hVar.mo2993a(250);
        hVar.mo2996a(this.f2059p);
        this.f2057n = hVar;
        hVar.mo2998a();
    }

    /* renamed from: j */
    public void mo2796j(boolean z) {
        C0602v vVar;
        C0602v vVar2;
        if (z) {
            m2956n();
        } else {
            m2957o();
        }
        if (m2958p()) {
            if (z) {
                vVar = this.f2047d.mo5101a(4, 100);
                vVar2 = this.f2048e.mo3437a(0, 200);
            } else {
                vVar2 = this.f2047d.mo5101a(0, 200);
                vVar = this.f2048e.mo3437a(8, 100);
            }
            C0772h hVar = new C0772h();
            hVar.mo2995a(vVar, vVar2);
            hVar.mo2998a();
        } else if (z) {
            this.f2047d.mo5122d(4);
            this.f2048e.setVisibility(0);
        } else {
            this.f2047d.mo5122d(0);
            this.f2048e.setVisibility(8);
        }
    }

    /* renamed from: p */
    private boolean m2958p() {
        return C0595r.m2274w(this.f2046c);
    }

    /* renamed from: b */
    public Context mo2579b() {
        if (this.f2062v == null) {
            TypedValue typedValue = new TypedValue();
            this.f2044a.getTheme().resolveAttribute(C0673a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2062v = new ContextThemeWrapper(this.f2044a, i);
            } else {
                this.f2062v = this.f2044a;
            }
        }
        return this.f2062v;
    }

    /* renamed from: l */
    public void mo2798l() {
        if (this.f2057n != null) {
            this.f2057n.mo3000c();
            this.f2057n = null;
        }
    }

    /* renamed from: f */
    public boolean mo2587f() {
        if (this.f2047d == null || !this.f2047d.mo5120c()) {
            return false;
        }
        this.f2047d.mo5121d();
        return true;
    }

    /* renamed from: c */
    public void mo2581c(boolean z) {
        if (!this.f2036A) {
            mo2789f(z);
        }
    }

    /* renamed from: a */
    public boolean mo2577a(int i, KeyEvent keyEvent) {
        if (this.f2051h == null) {
            return false;
        }
        Menu b = this.f2051h.mo2805b();
        if (b == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        b.setQwertyMode(z);
        return b.performShortcut(i, keyEvent, 0);
    }
}
