package android.support.p017v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p017v4.content.C0356c;
import android.support.p017v4.view.C0586i;
import android.support.p017v4.view.C0588k;
import android.support.p017v4.view.C0589l;
import android.support.p017v4.view.C0591n;
import android.support.p017v4.view.C0595r;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;

/* renamed from: android.support.v4.widget.SwipeRefreshLayout */
public class SwipeRefreshLayout extends ViewGroup implements C0586i, C0589l {

    /* renamed from: E */
    private static final int[] f1591E = {16842766};

    /* renamed from: n */
    private static final String f1592n = "SwipeRefreshLayout";

    /* renamed from: A */
    private boolean f1593A;

    /* renamed from: B */
    private int f1594B;

    /* renamed from: C */
    private boolean f1595C;

    /* renamed from: D */
    private final DecelerateInterpolator f1596D;

    /* renamed from: F */
    private int f1597F;

    /* renamed from: G */
    private Animation f1598G;

    /* renamed from: H */
    private Animation f1599H;

    /* renamed from: I */
    private Animation f1600I;

    /* renamed from: J */
    private Animation f1601J;

    /* renamed from: K */
    private Animation f1602K;

    /* renamed from: L */
    private int f1603L;

    /* renamed from: M */
    private C0635a f1604M;

    /* renamed from: N */
    private AnimationListener f1605N;

    /* renamed from: O */
    private final Animation f1606O;

    /* renamed from: P */
    private final Animation f1607P;

    /* renamed from: a */
    C0636b f1608a;

    /* renamed from: b */
    boolean f1609b;

    /* renamed from: c */
    int f1610c;

    /* renamed from: d */
    boolean f1611d;

    /* renamed from: e */
    C0641c f1612e;

    /* renamed from: f */
    protected int f1613f;

    /* renamed from: g */
    float f1614g;

    /* renamed from: h */
    protected int f1615h;

    /* renamed from: i */
    int f1616i;

    /* renamed from: j */
    int f1617j;

    /* renamed from: k */
    C0643d f1618k;

    /* renamed from: l */
    boolean f1619l;

    /* renamed from: m */
    boolean f1620m;

    /* renamed from: o */
    private View f1621o;

    /* renamed from: p */
    private int f1622p;

    /* renamed from: q */
    private float f1623q;

    /* renamed from: r */
    private float f1624r;

    /* renamed from: s */
    private final C0591n f1625s;

    /* renamed from: t */
    private final C0588k f1626t;

    /* renamed from: u */
    private final int[] f1627u;

    /* renamed from: v */
    private final int[] f1628v;

    /* renamed from: w */
    private boolean f1629w;

    /* renamed from: x */
    private int f1630x;

    /* renamed from: y */
    private float f1631y;

    /* renamed from: z */
    private float f1632z;

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$a */
    public interface C0635a {
        /* renamed from: a */
        boolean mo2414a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$b */
    public interface C0636b {
        /* renamed from: a */
        void mo2415a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2364a() {
        this.f1612e.clearAnimation();
        this.f1618k.stop();
        this.f1612e.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f1611d) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f1615h - this.f1610c);
        }
        this.f1610c = this.f1612e.getTop();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo2364a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo2364a();
    }

    private void setColorViewAlpha(int i) {
        this.f1612e.getBackground().setAlpha(i);
        this.f1618k.setAlpha(i);
    }

    public int getProgressViewStartOffset() {
        return this.f1615h;
    }

    public int getProgressViewEndOffset() {
        return this.f1616i;
    }

    public void setSlingshotDistance(int i) {
        this.f1617j = i;
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f1603L = (int) (56.0f * displayMetrics.density);
            } else {
                this.f1603L = (int) (40.0f * displayMetrics.density);
            }
            this.f1612e.setImageDrawable(null);
            this.f1618k.mo2455a(i);
            this.f1612e.setImageDrawable(this.f1618k);
        }
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1609b = false;
        this.f1623q = -1.0f;
        this.f1627u = new int[2];
        this.f1628v = new int[2];
        this.f1594B = -1;
        this.f1597F = -1;
        this.f1605N = new AnimationListener() {
            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                if (SwipeRefreshLayout.this.f1609b) {
                    SwipeRefreshLayout.this.f1618k.setAlpha(255);
                    SwipeRefreshLayout.this.f1618k.start();
                    if (SwipeRefreshLayout.this.f1619l && SwipeRefreshLayout.this.f1608a != null) {
                        SwipeRefreshLayout.this.f1608a.mo2415a();
                    }
                    SwipeRefreshLayout.this.f1610c = SwipeRefreshLayout.this.f1612e.getTop();
                    return;
                }
                SwipeRefreshLayout.this.mo2364a();
            }
        };
        this.f1606O = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                int i;
                if (!SwipeRefreshLayout.this.f1620m) {
                    i = SwipeRefreshLayout.this.f1616i - Math.abs(SwipeRefreshLayout.this.f1615h);
                } else {
                    i = SwipeRefreshLayout.this.f1616i;
                }
                SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((SwipeRefreshLayout.this.f1613f + ((int) (((float) (i - SwipeRefreshLayout.this.f1613f)) * f))) - SwipeRefreshLayout.this.f1612e.getTop());
                SwipeRefreshLayout.this.f1618k.mo2458b(1.0f - f);
            }
        };
        this.f1607P = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.mo2365a(f);
            }
        };
        this.f1622p = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f1630x = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f1596D = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f1603L = (int) (40.0f * displayMetrics.density);
        m2478d();
        setChildrenDrawingOrderEnabled(true);
        this.f1616i = (int) (64.0f * displayMetrics.density);
        this.f1623q = (float) this.f1616i;
        this.f1625s = new C0591n(this);
        this.f1626t = new C0588k(this);
        setNestedScrollingEnabled(true);
        int i = -this.f1603L;
        this.f1610c = i;
        this.f1615h = i;
        mo2365a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1591E);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f1597F < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return this.f1597F;
        }
        return i2 >= this.f1597F ? i2 + 1 : i2;
    }

    /* renamed from: d */
    private void m2478d() {
        this.f1612e = new C0641c(getContext(), -328966);
        this.f1618k = new C0643d(getContext());
        this.f1618k.mo2455a(1);
        this.f1612e.setImageDrawable(this.f1618k);
        this.f1612e.setVisibility(8);
        addView(this.f1612e);
    }

    public void setOnRefreshListener(C0636b bVar) {
        this.f1608a = bVar;
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.f1609b == z) {
            m2471a(z, false);
            return;
        }
        this.f1609b = z;
        if (!this.f1620m) {
            i = this.f1616i + this.f1615h;
        } else {
            i = this.f1616i;
        }
        setTargetOffsetTopAndBottom(i - this.f1610c);
        this.f1619l = false;
        m2475b(this.f1605N);
    }

    /* renamed from: b */
    private void m2475b(AnimationListener animationListener) {
        this.f1612e.setVisibility(0);
        this.f1618k.setAlpha(255);
        this.f1598G = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(f);
            }
        };
        this.f1598G.setDuration((long) this.f1630x);
        if (animationListener != null) {
            this.f1612e.mo2444a(animationListener);
        }
        this.f1612e.clearAnimation();
        this.f1612e.startAnimation(this.f1598G);
    }

    /* access modifiers changed from: 0000 */
    public void setAnimationProgress(float f) {
        this.f1612e.setScaleX(f);
        this.f1612e.setScaleY(f);
    }

    /* renamed from: a */
    private void m2471a(boolean z, boolean z2) {
        if (this.f1609b != z) {
            this.f1619l = z2;
            m2482g();
            this.f1609b = z;
            if (this.f1609b) {
                m2469a(this.f1610c, this.f1605N);
            } else {
                mo2366a(this.f1605N);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2366a(AnimationListener animationListener) {
        this.f1599H = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
            }
        };
        this.f1599H.setDuration(150);
        this.f1612e.mo2444a(animationListener);
        this.f1612e.clearAnimation();
        this.f1612e.startAnimation(this.f1599H);
    }

    /* renamed from: e */
    private void m2480e() {
        this.f1600I = m2468a(this.f1618k.getAlpha(), 76);
    }

    /* renamed from: f */
    private void m2481f() {
        this.f1601J = m2468a(this.f1618k.getAlpha(), 255);
    }

    /* renamed from: a */
    private Animation m2468a(final int i, final int i2) {
        C06304 r0 = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.f1618k.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f)));
            }
        };
        r0.setDuration(300);
        this.f1612e.mo2444a(null);
        this.f1612e.clearAnimation();
        this.f1612e.startAnimation(r0);
        return r0;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0356c.m1321c(getContext(), i));
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f1612e.setBackgroundColor(i);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0356c.m1321c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setColorSchemeColors(int... iArr) {
        m2482g();
        this.f1618k.mo2457a(iArr);
    }

    /* renamed from: b */
    public boolean mo2367b() {
        return this.f1609b;
    }

    /* renamed from: g */
    private void m2482g() {
        if (this.f1621o == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f1612e)) {
                    this.f1621o = childAt;
                    return;
                }
            }
        }
    }

    public void setDistanceToTriggerSync(int i) {
        this.f1623q = (float) i;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f1621o == null) {
                m2482g();
            }
            if (this.f1621o != null) {
                View view = this.f1621o;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f1612e.getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                this.f1612e.layout(i5 - i6, this.f1610c, i5 + i6, this.f1610c + this.f1612e.getMeasuredHeight());
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1621o == null) {
            m2482g();
        }
        if (this.f1621o != null) {
            this.f1621o.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f1612e.measure(MeasureSpec.makeMeasureSpec(this.f1603L, 1073741824), MeasureSpec.makeMeasureSpec(this.f1603L, 1073741824));
            this.f1597F = -1;
            int i3 = 0;
            while (true) {
                if (i3 >= getChildCount()) {
                    break;
                } else if (getChildAt(i3) == this.f1612e) {
                    this.f1597F = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
    }

    public int getProgressCircleDiameter() {
        return this.f1603L;
    }

    /* renamed from: c */
    public boolean mo2368c() {
        if (this.f1604M != null) {
            return this.f1604M.mo2414a(this, this.f1621o);
        }
        if (this.f1621o instanceof ListView) {
            return C0657l.m2604b((ListView) this.f1621o, -1);
        }
        return this.f1621o.canScrollVertically(-1);
    }

    public void setOnChildScrollUpCallback(C0635a aVar) {
        this.f1604M = aVar;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m2482g();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1595C && actionMasked == 0) {
            this.f1595C = false;
        }
        if (!isEnabled() || this.f1595C || mo2368c() || this.f1609b || this.f1629w) {
            return false;
        }
        if (actionMasked != 6) {
            switch (actionMasked) {
                case 0:
                    setTargetOffsetTopAndBottom(this.f1615h - this.f1612e.getTop());
                    this.f1594B = motionEvent.getPointerId(0);
                    this.f1593A = false;
                    int findPointerIndex = motionEvent.findPointerIndex(this.f1594B);
                    if (findPointerIndex >= 0) {
                        this.f1632z = motionEvent.getY(findPointerIndex);
                        break;
                    } else {
                        return false;
                    }
                case 1:
                case 3:
                    this.f1593A = false;
                    this.f1594B = -1;
                    break;
                case 2:
                    if (this.f1594B != -1) {
                        int findPointerIndex2 = motionEvent.findPointerIndex(this.f1594B);
                        if (findPointerIndex2 >= 0) {
                            m2479d(motionEvent.getY(findPointerIndex2));
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        Log.e(f1592n, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
            }
        } else {
            m2470a(motionEvent);
        }
        return this.f1593A;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (VERSION.SDK_INT < 21 && (this.f1621o instanceof AbsListView)) {
            return;
        }
        if (this.f1621o == null || C0595r.m2272u(this.f1621o)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f1595C && !this.f1609b && (i & 2) != 0;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1625s.mo2086a(view, view2, i);
        startNestedScroll(i & 2);
        this.f1624r = 0.0f;
        this.f1629w = true;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0 && this.f1624r > 0.0f) {
            float f = (float) i2;
            if (f > this.f1624r) {
                iArr[1] = i2 - ((int) this.f1624r);
                this.f1624r = 0.0f;
            } else {
                this.f1624r -= f;
                iArr[1] = i2;
            }
            m2473b(this.f1624r);
        }
        if (this.f1620m && i2 > 0 && this.f1624r == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f1612e.setVisibility(8);
        }
        int[] iArr2 = this.f1627u;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public int getNestedScrollAxes() {
        return this.f1625s.mo2083a();
    }

    public void onStopNestedScroll(View view) {
        this.f1625s.mo2084a(view);
        this.f1629w = false;
        if (this.f1624r > 0.0f) {
            m2476c(this.f1624r);
            this.f1624r = 0.0f;
        }
        stopNestedScroll();
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f1628v);
        int i5 = i4 + this.f1628v[1];
        if (i5 < 0 && !mo2368c()) {
            this.f1624r += (float) Math.abs(i5);
            m2473b(this.f1624r);
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f1626t.mo2069a(z);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f1626t.mo2070a();
    }

    public boolean startNestedScroll(int i) {
        return this.f1626t.mo2080b(i);
    }

    public void stopNestedScroll() {
        this.f1626t.mo2081c();
    }

    public boolean hasNestedScrollingParent() {
        return this.f1626t.mo2079b();
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1626t.mo2075a(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1626t.mo2077a(i, i2, iArr, iArr2);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1626t.mo2072a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1626t.mo2071a(f, f2);
    }

    /* renamed from: a */
    private boolean m2472a(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    /* renamed from: b */
    private void m2473b(float f) {
        this.f1618k.mo2456a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f1623q));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f1623q;
        int i = this.f1617j > 0 ? this.f1617j : this.f1620m ? this.f1616i - this.f1615h : this.f1616i;
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.f1615h + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f1612e.getVisibility() != 0) {
            this.f1612e.setVisibility(0);
        }
        if (!this.f1611d) {
            this.f1612e.setScaleX(1.0f);
            this.f1612e.setScaleY(1.0f);
        }
        if (this.f1611d) {
            setAnimationProgress(Math.min(1.0f, f / this.f1623q));
        }
        if (f < this.f1623q) {
            if (this.f1618k.getAlpha() > 76 && !m2472a(this.f1600I)) {
                m2480e();
            }
        } else if (this.f1618k.getAlpha() < 255 && !m2472a(this.f1601J)) {
            m2481f();
        }
        this.f1618k.mo2452a(0.0f, Math.min(0.8f, max * 0.8f));
        this.f1618k.mo2458b(Math.min(1.0f, max));
        this.f1618k.mo2459c((-0.25f + (0.4f * max) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.f1610c);
    }

    /* renamed from: c */
    private void m2476c(float f) {
        if (f > this.f1623q) {
            m2471a(true, true);
            return;
        }
        this.f1609b = false;
        this.f1618k.mo2452a(0.0f, 0.0f);
        C06315 r0 = null;
        if (!this.f1611d) {
            r0 = new AnimationListener() {
                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }

                public void onAnimationEnd(Animation animation) {
                    if (!SwipeRefreshLayout.this.f1611d) {
                        SwipeRefreshLayout.this.mo2366a((AnimationListener) null);
                    }
                }
            };
        }
        m2474b(this.f1610c, r0);
        this.f1618k.mo2456a(false);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1595C && actionMasked == 0) {
            this.f1595C = false;
        }
        if (!isEnabled() || this.f1595C || mo2368c() || this.f1609b || this.f1629w) {
            return false;
        }
        switch (actionMasked) {
            case 0:
                this.f1594B = motionEvent.getPointerId(0);
                this.f1593A = false;
                break;
            case 1:
                int findPointerIndex = motionEvent.findPointerIndex(this.f1594B);
                if (findPointerIndex < 0) {
                    Log.e(f1592n, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f1593A) {
                    float y = (motionEvent.getY(findPointerIndex) - this.f1631y) * 0.5f;
                    this.f1593A = false;
                    m2476c(y);
                }
                this.f1594B = -1;
                return false;
            case 2:
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f1594B);
                if (findPointerIndex2 < 0) {
                    Log.e(f1592n, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(findPointerIndex2);
                m2479d(y2);
                if (this.f1593A) {
                    float f = (y2 - this.f1631y) * 0.5f;
                    if (f > 0.0f) {
                        m2473b(f);
                        break;
                    } else {
                        return false;
                    }
                }
                break;
            case 3:
                return false;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex >= 0) {
                    this.f1594B = motionEvent.getPointerId(actionIndex);
                    break;
                } else {
                    Log.e(f1592n, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
            case 6:
                m2470a(motionEvent);
                break;
        }
        return true;
    }

    /* renamed from: d */
    private void m2479d(float f) {
        if (f - this.f1632z > ((float) this.f1622p) && !this.f1593A) {
            this.f1631y = this.f1632z + ((float) this.f1622p);
            this.f1593A = true;
            this.f1618k.setAlpha(76);
        }
    }

    /* renamed from: a */
    private void m2469a(int i, AnimationListener animationListener) {
        this.f1613f = i;
        this.f1606O.reset();
        this.f1606O.setDuration(200);
        this.f1606O.setInterpolator(this.f1596D);
        if (animationListener != null) {
            this.f1612e.mo2444a(animationListener);
        }
        this.f1612e.clearAnimation();
        this.f1612e.startAnimation(this.f1606O);
    }

    /* renamed from: b */
    private void m2474b(int i, AnimationListener animationListener) {
        if (this.f1611d) {
            m2477c(i, animationListener);
            return;
        }
        this.f1613f = i;
        this.f1607P.reset();
        this.f1607P.setDuration(200);
        this.f1607P.setInterpolator(this.f1596D);
        if (animationListener != null) {
            this.f1612e.mo2444a(animationListener);
        }
        this.f1612e.clearAnimation();
        this.f1612e.startAnimation(this.f1607P);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2365a(float f) {
        setTargetOffsetTopAndBottom((this.f1613f + ((int) (((float) (this.f1615h - this.f1613f)) * f))) - this.f1612e.getTop());
    }

    /* renamed from: c */
    private void m2477c(int i, AnimationListener animationListener) {
        this.f1613f = i;
        this.f1614g = this.f1612e.getScaleX();
        this.f1602K = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(SwipeRefreshLayout.this.f1614g + ((-SwipeRefreshLayout.this.f1614g) * f));
                SwipeRefreshLayout.this.mo2365a(f);
            }
        };
        this.f1602K.setDuration(150);
        if (animationListener != null) {
            this.f1612e.mo2444a(animationListener);
        }
        this.f1612e.clearAnimation();
        this.f1612e.startAnimation(this.f1602K);
    }

    /* access modifiers changed from: 0000 */
    public void setTargetOffsetTopAndBottom(int i) {
        this.f1612e.bringToFront();
        C0595r.m2250c(this.f1612e, i);
        this.f1610c = this.f1612e.getTop();
    }

    /* renamed from: a */
    private void m2470a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1594B) {
            this.f1594B = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }
}
