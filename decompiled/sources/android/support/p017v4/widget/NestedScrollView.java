package android.support.p017v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p017v4.view.C0561a;
import android.support.p017v4.view.C0587j;
import android.support.p017v4.view.C0588k;
import android.support.p017v4.view.C0590m;
import android.support.p017v4.view.C0591n;
import android.support.p017v4.view.C0595r;
import android.support.p017v4.view.p026a.C0564b;
import android.support.p017v4.view.p026a.C0571d;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import com.google.android.exoplayer2.extractor.p132ts.TsExtractor;
import java.util.ArrayList;

/* renamed from: android.support.v4.widget.NestedScrollView */
public class NestedScrollView extends FrameLayout implements C0587j, C0590m {

    /* renamed from: w */
    private static final C0620a f1528w = new C0620a();

    /* renamed from: x */
    private static final int[] f1529x = {16843130};

    /* renamed from: A */
    private float f1530A;

    /* renamed from: B */
    private C0621b f1531B;

    /* renamed from: a */
    private long f1532a;

    /* renamed from: b */
    private final Rect f1533b;

    /* renamed from: c */
    private OverScroller f1534c;

    /* renamed from: d */
    private EdgeEffect f1535d;

    /* renamed from: e */
    private EdgeEffect f1536e;

    /* renamed from: f */
    private int f1537f;

    /* renamed from: g */
    private boolean f1538g;

    /* renamed from: h */
    private boolean f1539h;

    /* renamed from: i */
    private View f1540i;

    /* renamed from: j */
    private boolean f1541j;

    /* renamed from: k */
    private VelocityTracker f1542k;

    /* renamed from: l */
    private boolean f1543l;

    /* renamed from: m */
    private boolean f1544m;

    /* renamed from: n */
    private int f1545n;

    /* renamed from: o */
    private int f1546o;

    /* renamed from: p */
    private int f1547p;

    /* renamed from: q */
    private int f1548q;

    /* renamed from: r */
    private final int[] f1549r;

    /* renamed from: s */
    private final int[] f1550s;

    /* renamed from: t */
    private int f1551t;

    /* renamed from: u */
    private int f1552u;

    /* renamed from: v */
    private SavedState f1553v;

    /* renamed from: y */
    private final C0591n f1554y;

    /* renamed from: z */
    private final C0588k f1555z;

    /* renamed from: android.support.v4.widget.NestedScrollView$SavedState */
    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        public int f1556a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1556a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1556a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.f1556a);
            sb.append("}");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$a */
    static class C0620a extends C0561a {
        C0620a() {
        }

        /* renamed from: a */
        public boolean mo1970a(View view, int i, Bundle bundle) {
            if (super.mo1970a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo2251c(0, min);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo2251c(0, max);
                return true;
            }
        }

        /* renamed from: a */
        public void mo1969a(View view, C0564b bVar) {
            super.mo1969a(view, bVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.mo2005b((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    bVar.mo2026i(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        bVar.mo1994a(8192);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        bVar.mo1994a((int) MpegAudioHeader.MAX_FRAME_SIZE_BYTES);
                    }
                }
            }
        }

        /* renamed from: d */
        public void mo1971d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1971d(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0571d.m2164a(accessibilityEvent, nestedScrollView.getScrollX());
            C0571d.m2165b(accessibilityEvent, nestedScrollView.getScrollRange());
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$b */
    public interface C0621b {
        /* renamed from: a */
        void mo2306a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: b */
    private static int m2401b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: a */
    public boolean mo381a(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1533b = new Rect();
        this.f1538g = true;
        this.f1539h = false;
        this.f1540i = null;
        this.f1541j = false;
        this.f1544m = true;
        this.f1548q = -1;
        this.f1549r = new int[2];
        this.f1550s = new int[2];
        m2394a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1529x, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1554y = new C0591n(this);
        this.f1555z = new C0588k(this);
        setNestedScrollingEnabled(true);
        C0595r.m2240a((View) this, (C0561a) f1528w);
    }

    /* renamed from: a */
    public boolean mo2240a(int i, int i2) {
        return this.f1555z.mo2074a(i, i2);
    }

    /* renamed from: a */
    public void mo2239a(int i) {
        this.f1555z.mo2082c(i);
    }

    /* renamed from: b */
    public boolean mo2250b(int i) {
        return this.f1555z.mo2073a(i);
    }

    /* renamed from: a */
    public boolean mo2242a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f1555z.mo2076a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: a */
    public boolean mo2243a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f1555z.mo2078a(i, i2, iArr, iArr2, i3);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f1555z.mo2069a(z);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f1555z.mo2070a();
    }

    public boolean startNestedScroll(int i) {
        return mo2240a(i, 0);
    }

    public void stopNestedScroll() {
        mo2239a(0);
    }

    public boolean hasNestedScrollingParent() {
        return mo2250b(0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return mo2242a(i, i2, i3, i4, iArr, 0);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo2243a(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1555z.mo2072a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1555z.mo2071a(f, f2);
    }

    /* renamed from: b */
    public void mo385b(View view, View view2, int i, int i2) {
        this.f1554y.mo2087a(view, view2, i, i2);
        mo2240a(2, i2);
    }

    /* renamed from: c */
    public void mo387c(View view, int i) {
        this.f1554y.mo2085a(view, i);
        mo2239a(i);
    }

    /* renamed from: a */
    public void mo376a(View view, int i, int i2, int i3, int i4, int i5) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        mo2242a(0, scrollY2, 0, i4 - scrollY2, (int[]) null, i5);
    }

    /* renamed from: a */
    public void mo377a(View view, int i, int i2, int[] iArr, int i3) {
        mo2243a(i, i2, iArr, (int[]) null, i3);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo381a(view, view2, i, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo385b(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo387c(view, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo376a(view, i, i2, i3, i4, 0);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo377a(view, i, i2, iArr, 0);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m2411h((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public int getNestedScrollAxes() {
        return this.f1554y.mo2083a();
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (0.5f * ((float) getHeight()));
    }

    /* renamed from: a */
    private void m2394a() {
        this.f1534c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1545n = viewConfiguration.getScaledTouchSlop();
        this.f1546o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1547p = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    public void setOnScrollChangeListener(C0621b bVar) {
        this.f1531B = bVar;
    }

    /* renamed from: b */
    private boolean m2403b() {
        boolean z = false;
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            z = true;
        }
        return z;
    }

    public void setFillViewport(boolean z) {
        if (z != this.f1543l) {
            this.f1543l = z;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f1544m = z;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f1531B != null) {
            this.f1531B.mo2306a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1543l && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo2244a(keyEvent);
    }

    /* renamed from: a */
    public boolean mo2244a(KeyEvent keyEvent) {
        this.f1533b.setEmpty();
        boolean b = m2403b();
        boolean z = false;
        int i = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        if (b) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 62) {
                    switch (keyCode) {
                        case 19:
                            if (keyEvent.isAltPressed()) {
                                z = mo2260d(33);
                                break;
                            } else {
                                z = mo2267e(33);
                                break;
                            }
                        case 20:
                            if (keyEvent.isAltPressed()) {
                                z = mo2260d(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                                break;
                            } else {
                                z = mo2267e(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                                break;
                            }
                    }
                } else {
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    mo2252c(i);
                }
            }
            return z;
        } else if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        } else {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            if (!(findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(TsExtractor.TS_STREAM_TYPE_HDMV_DTS))) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: d */
    private boolean m2406d(int i, int i2) {
        boolean z = false;
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight()) {
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    private void m2404c() {
        if (this.f1542k == null) {
            this.f1542k = VelocityTracker.obtain();
        } else {
            this.f1542k.clear();
        }
    }

    /* renamed from: d */
    private void m2405d() {
        if (this.f1542k == null) {
            this.f1542k = VelocityTracker.obtain();
        }
    }

    /* renamed from: e */
    private void m2407e() {
        if (this.f1542k != null) {
            this.f1542k.recycle();
            this.f1542k = null;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m2407e();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f1541j) {
            return true;
        }
        int i = action & 255;
        if (i != 6) {
            switch (i) {
                case 0:
                    int y = (int) motionEvent.getY();
                    if (m2406d((int) motionEvent.getX(), y)) {
                        this.f1537f = y;
                        this.f1548q = motionEvent.getPointerId(0);
                        m2404c();
                        this.f1542k.addMovement(motionEvent);
                        this.f1534c.computeScrollOffset();
                        this.f1541j = !this.f1534c.isFinished();
                        mo2240a(2, 0);
                        break;
                    } else {
                        this.f1541j = false;
                        m2407e();
                        break;
                    }
                case 1:
                case 3:
                    this.f1541j = false;
                    this.f1548q = -1;
                    m2407e();
                    if (this.f1534c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        C0595r.m2252d(this);
                    }
                    mo2239a(0);
                    break;
                case 2:
                    int i2 = this.f1548q;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex != -1) {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f1537f) > this.f1545n && (2 & getNestedScrollAxes()) == 0) {
                                this.f1541j = true;
                                this.f1537f = y2;
                                m2405d();
                                this.f1542k.addMovement(motionEvent);
                                this.f1551t = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                    break;
                                }
                            }
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid pointerId=");
                            sb.append(i2);
                            sb.append(" in onInterceptTouchEvent");
                            Log.e("NestedScrollView", sb.toString());
                            break;
                        }
                    }
                    break;
            }
        } else {
            m2395a(motionEvent);
        }
        return this.f1541j;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        m2405d();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1551t = 0;
        }
        obtain.offsetLocation(0.0f, (float) this.f1551t);
        switch (actionMasked) {
            case 0:
                if (getChildCount() != 0) {
                    boolean z = !this.f1534c.isFinished();
                    this.f1541j = z;
                    if (z) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (!this.f1534c.isFinished()) {
                        this.f1534c.abortAnimation();
                    }
                    this.f1537f = (int) motionEvent.getY();
                    this.f1548q = motionEvent2.getPointerId(0);
                    mo2240a(2, 0);
                    break;
                } else {
                    return false;
                }
            case 1:
                VelocityTracker velocityTracker = this.f1542k;
                velocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, (float) this.f1547p);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1548q);
                if (Math.abs(yVelocity) > this.f1546o) {
                    m2411h(-yVelocity);
                } else if (this.f1534c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0595r.m2252d(this);
                }
                this.f1548q = -1;
                m2408f();
                break;
            case 2:
                int findPointerIndex = motionEvent2.findPointerIndex(this.f1548q);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i = this.f1537f - y;
                    if (mo2243a(0, i, this.f1550s, this.f1549r, 0)) {
                        i -= this.f1550s[1];
                        obtain.offsetLocation(0.0f, (float) this.f1549r[1]);
                        this.f1551t += this.f1549r[1];
                    }
                    if (!this.f1541j && Math.abs(i) > this.f1545n) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1541j = true;
                        if (i > 0) {
                            i -= this.f1545n;
                        } else {
                            i += this.f1545n;
                        }
                    }
                    int i2 = i;
                    if (this.f1541j) {
                        this.f1537f = y - this.f1549r[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        int i3 = scrollRange;
                        int i4 = i2;
                        int i5 = findPointerIndex;
                        if (mo2241a(0, i2, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !mo2250b(0)) {
                            this.f1542k.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (!mo2242a(0, scrollY2, 0, i4 - scrollY2, this.f1549r, 0)) {
                            if (z2) {
                                m2409g();
                                int i6 = scrollY + i4;
                                if (i6 < 0) {
                                    C0654i.m2595a(this.f1535d, ((float) i4) / ((float) getHeight()), motionEvent2.getX(i5) / ((float) getWidth()));
                                    if (!this.f1536e.isFinished()) {
                                        this.f1536e.onRelease();
                                    }
                                } else {
                                    int i7 = i5;
                                    if (i6 > i3) {
                                        C0654i.m2595a(this.f1536e, ((float) i4) / ((float) getHeight()), 1.0f - (motionEvent2.getX(i7) / ((float) getWidth())));
                                        if (!this.f1535d.isFinished()) {
                                            this.f1535d.onRelease();
                                        }
                                    }
                                }
                                if (this.f1535d != null && (!this.f1535d.isFinished() || !this.f1536e.isFinished())) {
                                    C0595r.m2252d(this);
                                    break;
                                }
                            }
                        } else {
                            this.f1537f -= this.f1549r[1];
                            obtain.offsetLocation(0.0f, (float) this.f1549r[1]);
                            this.f1551t += this.f1549r[1];
                            break;
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid pointerId=");
                    sb.append(this.f1548q);
                    sb.append(" in onTouchEvent");
                    Log.e("NestedScrollView", sb.toString());
                    break;
                }
                break;
            case 3:
                if (this.f1541j && getChildCount() > 0 && this.f1534c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0595r.m2252d(this);
                }
                this.f1548q = -1;
                m2408f();
                break;
            case 5:
                int actionIndex = motionEvent.getActionIndex();
                this.f1537f = (int) motionEvent2.getY(actionIndex);
                this.f1548q = motionEvent2.getPointerId(actionIndex);
                break;
            case 6:
                m2395a(motionEvent);
                this.f1537f = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.f1548q));
                break;
        }
        if (this.f1542k != null) {
            this.f1542k.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: a */
    private void m2395a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1548q) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1537f = (int) motionEvent.getY(i);
            this.f1548q = motionEvent.getPointerId(i);
            if (this.f1542k != null) {
                this.f1542k.clear();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f1541j) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    i = 0;
                } else if (i > scrollRange) {
                    i = scrollRange;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
            }
        }
        return false;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1530A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1530A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1530A;
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2241a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i9 = i3 + i;
        int i10 = !z6 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z7 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            z2 = true;
            i13 = i14;
        } else if (i9 < i13) {
            z2 = true;
        } else {
            i13 = i9;
            z2 = false;
        }
        if (i11 > i16) {
            i15 = i16;
        } else if (i11 >= i15) {
            i15 = i11;
            z3 = false;
            if (z3 && !mo2250b(1)) {
                this.f1534c.springBack(i13, i15, 0, 0, 0, getScrollRange());
            }
            onOverScrolled(i13, i15, z2, z3);
            if (!z2 || z3) {
                return true;
            }
            return false;
        }
        z3 = true;
        this.f1534c.springBack(i13, i15, 0, 0, 0, getScrollRange());
        onOverScrolled(i13, i15, z2, z3);
        if (!z2) {
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* renamed from: a */
    private View m2393a(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        boolean z2 = false;
        View view = null;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: c */
    public boolean mo2252c(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f1533b.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (this.f1533b.top + height > bottom) {
                    this.f1533b.top = bottom - height;
                }
            }
        } else {
            this.f1533b.top = getScrollY() - height;
            if (this.f1533b.top < 0) {
                this.f1533b.top = 0;
            }
        }
        this.f1533b.bottom = this.f1533b.top + height;
        return m2396a(i, this.f1533b.top, this.f1533b.bottom);
    }

    /* renamed from: d */
    public boolean mo2260d(int i) {
        boolean z = i == 130;
        int height = getHeight();
        this.f1533b.top = 0;
        this.f1533b.bottom = height;
        if (z) {
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                this.f1533b.bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                this.f1533b.top = this.f1533b.bottom - height;
            }
        }
        return m2396a(i, this.f1533b.top, this.f1533b.bottom);
    }

    /* renamed from: a */
    private boolean m2396a(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View a = m2393a(z2, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m2410g(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo2267e(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m2399a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2410g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1533b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1533b);
            m2410g(mo2238a(this.f1533b));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m2398a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* renamed from: a */
    private boolean m2398a(View view) {
        return !m2399a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m2399a(View view, int i, int i2) {
        view.getDrawingRect(this.f1533b);
        offsetDescendantRectToMyCoords(view, this.f1533b);
        return this.f1533b.bottom + i >= getScrollY() && this.f1533b.top - i <= getScrollY() + i2;
    }

    /* renamed from: g */
    private void m2410g(int i) {
        if (i == 0) {
            return;
        }
        if (this.f1544m) {
            mo2249b(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: b */
    public final void mo2249b(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1532a > 250) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                int max = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
                this.f1552u = getScrollY();
                this.f1534c.startScroll(getScrollX(), scrollY, 0, max);
                C0595r.m2252d(this);
            } else {
                if (!this.f1534c.isFinished()) {
                    this.f1534c.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f1532a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: c */
    public final void mo2251c(int i, int i2) {
        mo2249b(i - getScrollX(), i2 - getScrollY());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void computeScroll() {
        if (this.f1534c.computeScrollOffset()) {
            this.f1534c.getCurrX();
            int currY = this.f1534c.getCurrY();
            int i = currY - this.f1552u;
            if (mo2243a(0, i, this.f1550s, (int[]) null, 1)) {
                i -= this.f1550s[1];
            }
            int i2 = i;
            if (i2 != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i3 = scrollY;
                mo2241a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - i3;
                if (!mo2242a(0, scrollY2, 0, i2 - scrollY2, (int[]) null, 1)) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                        m2409g();
                        if (currY <= 0 && i3 > 0) {
                            this.f1535d.onAbsorb((int) this.f1534c.getCurrVelocity());
                        } else if (currY >= scrollRange && i3 < scrollRange) {
                            this.f1536e.onAbsorb((int) this.f1534c.getCurrVelocity());
                        }
                    }
                }
            }
            this.f1552u = currY;
            C0595r.m2252d(this);
            return;
        }
        if (mo2250b(1)) {
            mo2239a(1);
        }
        this.f1552u = 0;
    }

    /* renamed from: b */
    private void m2402b(View view) {
        view.getDrawingRect(this.f1533b);
        offsetDescendantRectToMyCoords(view, this.f1533b);
        int a = mo2238a(this.f1533b);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: a */
    private boolean m2397a(Rect rect, boolean z) {
        int a = mo2238a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                mo2249b(0, a);
            }
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo2238a(Rect rect) {
        int i;
        int i2;
        int i3 = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        if (rect.bottom > i5 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = 0 + (rect.top - scrollY);
            } else {
                i2 = 0 + (rect.bottom - i5);
            }
            i3 = Math.min(i2, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top < scrollY && rect.bottom < i5) {
            if (rect.height() > height) {
                i = 0 - (i5 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            i3 = Math.max(i, -getScrollY());
        }
        return i3;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f1538g) {
            m2402b(view2);
        } else {
            this.f1540i = view2;
        }
        super.requestChildFocus(view, view2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !m2398a(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m2397a(rect, z);
    }

    public void requestLayout() {
        this.f1538g = true;
        super.requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f1538g = false;
        if (this.f1540i != null && m2400a(this.f1540i, (View) this)) {
            m2402b(this.f1540i);
        }
        this.f1540i = null;
        if (!this.f1539h) {
            if (this.f1553v != null) {
                scrollTo(getScrollX(), this.f1553v.f1556a);
                this.f1553v = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int b = m2401b(scrollY, paddingTop, i5);
            if (b != scrollY) {
                scrollTo(getScrollX(), b);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1539h = true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1539h = false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (!(findFocus == null || this == findFocus || !m2399a(findFocus, 0, i4))) {
            findFocus.getDrawingRect(this.f1533b);
            offsetDescendantRectToMyCoords(findFocus, this.f1533b);
            m2410g(mo2238a(this.f1533b));
        }
    }

    /* renamed from: a */
    private static boolean m2400a(View view, View view2) {
        boolean z = true;
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m2400a((View) parent, view2)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public void mo2268f(int i) {
        if (getChildCount() > 0) {
            mo2240a(2, 1);
            this.f1534c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1552u = getScrollY();
            C0595r.m2252d(this);
        }
    }

    /* renamed from: h */
    private void m2411h(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        float f = (float) i;
        if (!dispatchNestedPreFling(0.0f, f)) {
            dispatchNestedFling(0.0f, f, z);
            mo2268f(i);
        }
    }

    /* renamed from: f */
    private void m2408f() {
        this.f1541j = false;
        m2407e();
        mo2239a(0);
        if (this.f1535d != null) {
            this.f1535d.onRelease();
            this.f1536e.onRelease();
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int width = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int b = m2401b(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), width);
            int b2 = m2401b(i2, height, height2);
            if (b != getScrollX() || b2 != getScrollY()) {
                super.scrollTo(b, b2);
            }
        }
    }

    /* renamed from: g */
    private void m2409g() {
        if (getOverScrollMode() == 2) {
            this.f1535d = null;
            this.f1536e = null;
        } else if (this.f1535d == null) {
            Context context = getContext();
            this.f1535d = new EdgeEffect(context);
            this.f1536e = new EdgeEffect(context);
        }
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1535d != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f1535d.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f1535d.setSize(width, height);
                if (this.f1535d.draw(canvas)) {
                    C0595r.m2252d(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f1536e.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f1536e.setSize(width2, height2);
                if (this.f1536e.draw(canvas)) {
                    C0595r.m2252d(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f1553v = savedState;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1556a = getScrollY();
        return savedState;
    }
}
