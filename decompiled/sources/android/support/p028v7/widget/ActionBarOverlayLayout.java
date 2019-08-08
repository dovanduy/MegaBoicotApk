package android.support.p028v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p017v4.view.C0589l;
import android.support.p017v4.view.C0591n;
import android.support.p017v4.view.C0595r;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p029a.C0672a.C0678f;
import android.support.p028v7.view.menu.C0806o.C0807a;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;

/* renamed from: android.support.v7.widget.ActionBarOverlayLayout */
public class ActionBarOverlayLayout extends ViewGroup implements C0589l, C1030t {

    /* renamed from: e */
    static final int[] f2478e = {C0673a.actionBarSize, 16842841};

    /* renamed from: A */
    private final Runnable f2479A;

    /* renamed from: B */
    private final C0591n f2480B;

    /* renamed from: a */
    ActionBarContainer f2481a;

    /* renamed from: b */
    boolean f2482b;

    /* renamed from: c */
    ViewPropertyAnimator f2483c;

    /* renamed from: d */
    final AnimatorListenerAdapter f2484d;

    /* renamed from: f */
    private int f2485f;

    /* renamed from: g */
    private int f2486g;

    /* renamed from: h */
    private ContentFrameLayout f2487h;

    /* renamed from: i */
    private C1031u f2488i;

    /* renamed from: j */
    private Drawable f2489j;

    /* renamed from: k */
    private boolean f2490k;

    /* renamed from: l */
    private boolean f2491l;

    /* renamed from: m */
    private boolean f2492m;

    /* renamed from: n */
    private boolean f2493n;

    /* renamed from: o */
    private int f2494o;

    /* renamed from: p */
    private int f2495p;

    /* renamed from: q */
    private final Rect f2496q;

    /* renamed from: r */
    private final Rect f2497r;

    /* renamed from: s */
    private final Rect f2498s;

    /* renamed from: t */
    private final Rect f2499t;

    /* renamed from: u */
    private final Rect f2500u;

    /* renamed from: v */
    private final Rect f2501v;

    /* renamed from: w */
    private final Rect f2502w;

    /* renamed from: x */
    private C0822a f2503x;

    /* renamed from: y */
    private OverScroller f2504y;

    /* renamed from: z */
    private final Runnable f2505z;

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$a */
    public interface C0822a {
        /* renamed from: a */
        void mo2787a(int i);

        /* renamed from: g */
        void mo2790g(boolean z);

        /* renamed from: j */
        void mo2795j();

        /* renamed from: k */
        void mo2797k();

        /* renamed from: l */
        void mo2798l();

        /* renamed from: m */
        void mo2799m();
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2486g = 0;
        this.f2496q = new Rect();
        this.f2497r = new Rect();
        this.f2498s = new Rect();
        this.f2499t = new Rect();
        this.f2500u = new Rect();
        this.f2501v = new Rect();
        this.f2502w = new Rect();
        this.f2484d = new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout.this.f2483c = null;
                ActionBarOverlayLayout.this.f2482b = false;
            }

            public void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout.this.f2483c = null;
                ActionBarOverlayLayout.this.f2482b = false;
            }
        };
        this.f2505z = new Runnable() {
            public void run() {
                ActionBarOverlayLayout.this.mo3470d();
                ActionBarOverlayLayout.this.f2483c = ActionBarOverlayLayout.this.f2481a.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f2484d);
            }
        };
        this.f2479A = new Runnable() {
            public void run() {
                ActionBarOverlayLayout.this.mo3470d();
                ActionBarOverlayLayout.this.f2483c = ActionBarOverlayLayout.this.f2481a.animate().translationY((float) (-ActionBarOverlayLayout.this.f2481a.getHeight())).setListener(ActionBarOverlayLayout.this.f2484d);
            }
        };
        m3469a(context);
        this.f2480B = new C0591n(this);
    }

    /* renamed from: a */
    private void m3469a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2478e);
        boolean z = false;
        this.f2485f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2489j = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f2489j == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f2490k = z;
        this.f2504y = new OverScroller(context);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo3470d();
    }

    public void setActionBarVisibilityCallback(C0822a aVar) {
        this.f2503x = aVar;
        if (getWindowToken() != null) {
            this.f2503x.mo2787a(this.f2486g);
            if (this.f2495p != 0) {
                onWindowSystemUiVisibilityChanged(this.f2495p);
                C0595r.m2267p(this);
            }
        }
    }

    public void setOverlayMode(boolean z) {
        this.f2491l = z;
        this.f2490k = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    /* renamed from: a */
    public boolean mo3466a() {
        return this.f2491l;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f2492m = z;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m3469a(getContext());
        C0595r.m2267p(this);
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo3468c();
        int i2 = this.f2495p ^ i;
        this.f2495p = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        if (this.f2503x != null) {
            this.f2503x.mo2790g(!z);
            if (z2 || !z) {
                this.f2503x.mo2795j();
            } else {
                this.f2503x.mo2797k();
            }
        }
        if ((i2 & 256) != 0 && this.f2503x != null) {
            C0595r.m2267p(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f2486g = i;
        if (this.f2503x != null) {
            this.f2503x.mo2787a(i);
        }
    }

    /* renamed from: a */
    private boolean m3471a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!z || layoutParams.leftMargin == rect.left) {
            z5 = false;
        } else {
            layoutParams.leftMargin = rect.left;
            z5 = true;
        }
        if (z2 && layoutParams.topMargin != rect.top) {
            layoutParams.topMargin = rect.top;
            z5 = true;
        }
        if (z4 && layoutParams.rightMargin != rect.right) {
            layoutParams.rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || layoutParams.bottomMargin == rect.bottom) {
            return z5;
        }
        layoutParams.bottomMargin = rect.bottom;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        mo3468c();
        int o = C0595r.m2266o(this) & 256;
        boolean a = m3471a(this.f2481a, rect, true, true, false, true);
        this.f2499t.set(rect);
        C0994bg.m4485a(this, this.f2499t, this.f2496q);
        if (!this.f2500u.equals(this.f2499t)) {
            this.f2500u.set(this.f2499t);
            a = true;
        }
        if (!this.f2497r.equals(this.f2496q)) {
            this.f2497r.set(this.f2496q);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        mo3468c();
        measureChildWithMargins(this.f2481a, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f2481a.getLayoutParams();
        int max = Math.max(0, this.f2481a.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, this.f2481a.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f2481a.getMeasuredState());
        boolean z = (C0595r.m2266o(this) & 256) != 0;
        if (z) {
            i3 = this.f2485f;
            if (this.f2492m && this.f2481a.getTabContainer() != null) {
                i3 += this.f2485f;
            }
        } else {
            i3 = this.f2481a.getVisibility() != 8 ? this.f2481a.getMeasuredHeight() : 0;
        }
        this.f2498s.set(this.f2496q);
        this.f2501v.set(this.f2499t);
        if (this.f2491l || z) {
            this.f2501v.top += i3;
            this.f2501v.bottom += 0;
        } else {
            this.f2498s.top += i3;
            this.f2498s.bottom += 0;
        }
        m3471a(this.f2487h, this.f2498s, true, true, true, true);
        if (!this.f2502w.equals(this.f2501v)) {
            this.f2502w.set(this.f2501v);
            this.f2487h.mo3790a(this.f2501v);
        }
        measureChildWithMargins(this.f2487h, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f2487h.getLayoutParams();
        int max3 = Math.max(max, this.f2487h.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, this.f2487h.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f2487h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i6 = layoutParams.leftMargin + paddingLeft;
                int i7 = layoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            }
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2489j != null && !this.f2490k) {
            int bottom = this.f2481a.getVisibility() == 0 ? (int) (((float) this.f2481a.getBottom()) + this.f2481a.getTranslationY() + 0.5f) : 0;
            this.f2489j.setBounds(0, bottom, getWidth(), this.f2489j.getIntrinsicHeight() + bottom);
            this.f2489j.draw(canvas);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f2481a.getVisibility() != 0) {
            return false;
        }
        return this.f2493n;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f2480B.mo2086a(view, view2, i);
        this.f2494o = getActionBarHideOffset();
        mo3470d();
        if (this.f2503x != null) {
            this.f2503x.mo2798l();
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f2494o += i2;
        setActionBarHideOffset(this.f2494o);
    }

    public void onStopNestedScroll(View view) {
        if (this.f2493n && !this.f2482b) {
            if (this.f2494o <= this.f2481a.getHeight()) {
                m3472l();
            } else {
                m3473m();
            }
        }
        if (this.f2503x != null) {
            this.f2503x.mo2799m();
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f2493n || !z) {
            return false;
        }
        if (m3470a(f, f2)) {
            m3475o();
        } else {
            m3474n();
        }
        this.f2482b = true;
        return true;
    }

    public int getNestedScrollAxes() {
        return this.f2480B.mo2083a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo3468c() {
        if (this.f2487h == null) {
            this.f2487h = (ContentFrameLayout) findViewById(C0678f.action_bar_activity_content);
            this.f2481a = (ActionBarContainer) findViewById(C0678f.action_bar_container);
            this.f2488i = m3468a(findViewById(C0678f.action_bar));
        }
    }

    /* renamed from: a */
    private C1031u m3468a(View view) {
        if (view instanceof C1031u) {
            return (C1031u) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f2493n) {
            this.f2493n = z;
            if (!z) {
                mo3470d();
                setActionBarHideOffset(0);
            }
        }
    }

    public int getActionBarHideOffset() {
        if (this.f2481a != null) {
            return -((int) this.f2481a.getTranslationY());
        }
        return 0;
    }

    public void setActionBarHideOffset(int i) {
        mo3470d();
        this.f2481a.setTranslationY((float) (-Math.max(0, Math.min(i, this.f2481a.getHeight()))));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo3470d() {
        removeCallbacks(this.f2505z);
        removeCallbacks(this.f2479A);
        if (this.f2483c != null) {
            this.f2483c.cancel();
        }
    }

    /* renamed from: l */
    private void m3472l() {
        mo3470d();
        postDelayed(this.f2505z, 600);
    }

    /* renamed from: m */
    private void m3473m() {
        mo3470d();
        postDelayed(this.f2479A, 600);
    }

    /* renamed from: n */
    private void m3474n() {
        mo3470d();
        this.f2505z.run();
    }

    /* renamed from: o */
    private void m3475o() {
        mo3470d();
        this.f2479A.run();
    }

    /* renamed from: a */
    private boolean m3470a(float f, float f2) {
        this.f2504y.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f2504y.getFinalY() > this.f2481a.getHeight();
    }

    public void setWindowCallback(Callback callback) {
        mo3468c();
        this.f2488i.mo5109a(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo3468c();
        this.f2488i.mo5110a(charSequence);
    }

    public CharSequence getTitle() {
        mo3468c();
        return this.f2488i.mo5124e();
    }

    /* renamed from: a */
    public void mo3464a(int i) {
        mo3468c();
        if (i == 2) {
            this.f2488i.mo5126f();
        } else if (i == 5) {
            this.f2488i.mo5128g();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    public void setIcon(int i) {
        mo3468c();
        this.f2488i.mo5103a(i);
    }

    public void setIcon(Drawable drawable) {
        mo3468c();
        this.f2488i.mo5104a(drawable);
    }

    public void setLogo(int i) {
        mo3468c();
        this.f2488i.mo5113b(i);
    }

    /* renamed from: e */
    public boolean mo3472e() {
        mo3468c();
        return this.f2488i.mo5129h();
    }

    /* renamed from: f */
    public boolean mo3473f() {
        mo3468c();
        return this.f2488i.mo5130i();
    }

    /* renamed from: g */
    public boolean mo3475g() {
        mo3468c();
        return this.f2488i.mo5131j();
    }

    /* renamed from: h */
    public boolean mo3482h() {
        mo3468c();
        return this.f2488i.mo5132k();
    }

    /* renamed from: i */
    public boolean mo3483i() {
        mo3468c();
        return this.f2488i.mo5133l();
    }

    /* renamed from: j */
    public void mo3484j() {
        mo3468c();
        this.f2488i.mo5134m();
    }

    /* renamed from: a */
    public void mo3465a(Menu menu, C0807a aVar) {
        mo3468c();
        this.f2488i.mo5107a(menu, aVar);
    }

    /* renamed from: k */
    public void mo3485k() {
        mo3468c();
        this.f2488i.mo5135n();
    }
}
