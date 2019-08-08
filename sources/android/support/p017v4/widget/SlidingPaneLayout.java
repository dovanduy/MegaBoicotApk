package android.support.p017v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.p017v4.content.C0356c;
import android.support.p017v4.view.AbsSavedState;
import android.support.p017v4.view.C0561a;
import android.support.p017v4.view.C0595r;
import android.support.p017v4.view.p026a.C0564b;
import android.support.p017v4.widget.C0667s.C0670a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: android.support.v4.widget.SlidingPaneLayout */
public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: a */
    View f1557a;

    /* renamed from: b */
    float f1558b;

    /* renamed from: c */
    int f1559c;

    /* renamed from: d */
    boolean f1560d;

    /* renamed from: e */
    final C0667s f1561e;

    /* renamed from: f */
    boolean f1562f;

    /* renamed from: g */
    final ArrayList<C0624b> f1563g;

    /* renamed from: h */
    private int f1564h;

    /* renamed from: i */
    private int f1565i;

    /* renamed from: j */
    private Drawable f1566j;

    /* renamed from: k */
    private Drawable f1567k;

    /* renamed from: l */
    private final int f1568l;

    /* renamed from: m */
    private boolean f1569m;

    /* renamed from: n */
    private float f1570n;

    /* renamed from: o */
    private int f1571o;

    /* renamed from: p */
    private float f1572p;

    /* renamed from: q */
    private float f1573q;

    /* renamed from: r */
    private C0626d f1574r;

    /* renamed from: s */
    private boolean f1575s;

    /* renamed from: t */
    private final Rect f1576t;

    /* renamed from: u */
    private Method f1577u;

    /* renamed from: v */
    private Field f1578v;

    /* renamed from: w */
    private boolean f1579w;

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: e */
        private static final int[] f1580e = {16843137};

        /* renamed from: a */
        public float f1581a = 0.0f;

        /* renamed from: b */
        boolean f1582b;

        /* renamed from: c */
        boolean f1583c;

        /* renamed from: d */
        Paint f1584d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1580e);
            this.f1581a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$SavedState */
    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        boolean f1585a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1585a = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1585a ? 1 : 0);
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$a */
    class C0623a extends C0561a {

        /* renamed from: b */
        private final Rect f1587b = new Rect();

        C0623a() {
        }

        /* renamed from: a */
        public void mo1969a(View view, C0564b bVar) {
            C0564b a = C0564b.m2108a(bVar);
            super.mo1969a(view, a);
            m2459a(bVar, a);
            a.mo2039t();
            bVar.mo2005b((CharSequence) SlidingPaneLayout.class.getName());
            bVar.mo1996a(view);
            ViewParent g = C0595r.m2258g(view);
            if (g instanceof View) {
                bVar.mo2010c((View) g);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!mo2357b(childAt) && childAt.getVisibility() == 0) {
                    C0595r.m2247b(childAt, 1);
                    bVar.mo2004b(childAt);
                }
            }
        }

        /* renamed from: d */
        public void mo1971d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1971d(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        /* renamed from: a */
        public boolean mo1981a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!mo2357b(view)) {
                return super.mo1981a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo2357b(View view) {
            return SlidingPaneLayout.this.mo2324f(view);
        }

        /* renamed from: a */
        private void m2459a(C0564b bVar, C0564b bVar2) {
            Rect rect = this.f1587b;
            bVar2.mo1995a(rect);
            bVar.mo2003b(rect);
            bVar2.mo2009c(rect);
            bVar.mo2013d(rect);
            bVar.mo2012c(bVar2.mo2024h());
            bVar.mo1997a(bVar2.mo2035p());
            bVar.mo2005b(bVar2.mo2036q());
            bVar.mo2011c(bVar2.mo2038s());
            bVar.mo2023h(bVar2.mo2032m());
            bVar.mo2019f(bVar2.mo2030k());
            bVar.mo1999a(bVar2.mo2020f());
            bVar.mo2007b(bVar2.mo2022g());
            bVar.mo2014d(bVar2.mo2027i());
            bVar.mo2016e(bVar2.mo2029j());
            bVar.mo2021g(bVar2.mo2031l());
            bVar.mo1994a(bVar2.mo2001b());
            bVar.mo2002b(bVar2.mo2008c());
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$b */
    private class C0624b implements Runnable {

        /* renamed from: a */
        final View f1588a;

        C0624b(View view) {
            this.f1588a = view;
        }

        public void run() {
            if (this.f1588a.getParent() == SlidingPaneLayout.this) {
                this.f1588a.setLayerType(0, null);
                SlidingPaneLayout.this.mo2321e(this.f1588a);
            }
            SlidingPaneLayout.this.f1563g.remove(this);
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$c */
    private class C0625c extends C0670a {
        C0625c() {
        }

        public boolean tryCaptureView(View view, int i) {
            if (SlidingPaneLayout.this.f1560d) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f1582b;
        }

        public void onViewDragStateChanged(int i) {
            if (SlidingPaneLayout.this.f1561e.mo2545a() != 0) {
                return;
            }
            if (SlidingPaneLayout.this.f1558b == 0.0f) {
                SlidingPaneLayout.this.mo2317d(SlidingPaneLayout.this.f1557a);
                SlidingPaneLayout.this.mo2313c(SlidingPaneLayout.this.f1557a);
                SlidingPaneLayout.this.f1562f = false;
                return;
            }
            SlidingPaneLayout.this.mo2311b(SlidingPaneLayout.this.f1557a);
            SlidingPaneLayout.this.f1562f = true;
        }

        public void onViewCaptured(View view, int i) {
            SlidingPaneLayout.this.mo2307a();
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.mo2308a(i);
            SlidingPaneLayout.this.invalidate();
        }

        public void onViewReleased(View view, float f, float f2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.mo2323f()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.f1558b > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f1559c;
                }
                i = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f1557a.getWidth();
            } else {
                i = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && SlidingPaneLayout.this.f1558b > 0.5f)) {
                    i += SlidingPaneLayout.this.f1559c;
                }
            }
            SlidingPaneLayout.this.f1561e.mo2549a(i, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        public int getViewHorizontalDragRange(View view) {
            return SlidingPaneLayout.this.f1559c;
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f1557a.getLayoutParams();
            if (SlidingPaneLayout.this.mo2323f()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin) + SlidingPaneLayout.this.f1557a.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f1559c);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + layoutParams.leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f1559c + paddingLeft);
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        public void onEdgeDragStarted(int i, int i2) {
            SlidingPaneLayout.this.f1561e.mo2548a(SlidingPaneLayout.this.f1557a, i2);
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$d */
    public interface C0626d {
        /* renamed from: a */
        void mo2359a(View view);

        /* renamed from: a */
        void mo2360a(View view, float f);

        /* renamed from: b */
        void mo2361b(View view);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1564h = -858993460;
        this.f1575s = true;
        this.f1576t = new Rect();
        this.f1563g = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f1568l = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        C0595r.m2240a((View) this, (C0561a) new C0623a());
        C0595r.m2247b((View) this, 1);
        this.f1561e = C0667s.m2640a((ViewGroup) this, 0.5f, (C0670a) new C0625c());
        this.f1561e.mo2546a(400.0f * f);
    }

    public void setParallaxDistance(int i) {
        this.f1571o = i;
        requestLayout();
    }

    public int getParallaxDistance() {
        return this.f1571o;
    }

    public void setSliderFadeColor(int i) {
        this.f1564h = i;
    }

    public int getSliderFadeColor() {
        return this.f1564h;
    }

    public void setCoveredFadeColor(int i) {
        this.f1565i = i;
    }

    public int getCoveredFadeColor() {
        return this.f1565i;
    }

    public void setPanelSlideListener(C0626d dVar) {
        this.f1574r = dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2309a(View view) {
        if (this.f1574r != null) {
            this.f1574r.mo2360a(view, this.f1558b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2311b(View view) {
        if (this.f1574r != null) {
            this.f1574r.mo2359a(view);
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2313c(View view) {
        if (this.f1574r != null) {
            this.f1574r.mo2361b(view);
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2317d(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        View view2 = view;
        boolean f = mo2323f();
        int width = f ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = f ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !m2441g(view)) {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        } else {
            i4 = view.getLeft();
            i3 = view.getRight();
            i2 = view.getTop();
            i = view.getBottom();
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            if (childAt != view2) {
                if (childAt.getVisibility() == 8) {
                    z = f;
                } else {
                    int max = Math.max(f ? paddingLeft : width, childAt.getLeft());
                    int max2 = Math.max(paddingTop, childAt.getTop());
                    if (f) {
                        z = f;
                        i5 = width;
                    } else {
                        z = f;
                        i5 = paddingLeft;
                    }
                    childAt.setVisibility((max < i4 || max2 < i2 || Math.min(i5, childAt.getRight()) > i3 || Math.min(height, childAt.getBottom()) > i) ? 0 : 4);
                }
                i6++;
                f = z;
                view2 = view;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2307a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: g */
    private static boolean m2441g(View view) {
        boolean z = true;
        if (view.isOpaque()) {
            return true;
        }
        if (VERSION.SDK_INT >= 18) {
            return false;
        }
        Drawable background = view.getBackground();
        if (background == null) {
            return false;
        }
        if (background.getOpacity() != -1) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1575s = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1575s = true;
        int size = this.f1563g.size();
        for (int i = 0; i < size; i++) {
            ((C0624b) this.f1563g.get(i)).run();
        }
        this.f1563g.clear();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x020b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            int r1 = android.view.View.MeasureSpec.getMode(r21)
            int r2 = android.view.View.MeasureSpec.getSize(r21)
            int r3 = android.view.View.MeasureSpec.getMode(r22)
            int r4 = android.view.View.MeasureSpec.getSize(r22)
            r5 = 300(0x12c, float:4.2E-43)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            if (r1 == r7) goto L_0x002f
            boolean r8 = r20.isInEditMode()
            if (r8 == 0) goto L_0x0027
            if (r1 != r6) goto L_0x0023
            goto L_0x0044
        L_0x0023:
            if (r1 != 0) goto L_0x0044
            r2 = r5
            goto L_0x0044
        L_0x0027:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Width must have an exact value or MATCH_PARENT"
            r1.<init>(r2)
            throw r1
        L_0x002f:
            if (r3 != 0) goto L_0x0044
            boolean r1 = r20.isInEditMode()
            if (r1 == 0) goto L_0x003c
            if (r3 != 0) goto L_0x0044
            r4 = r5
            r3 = r6
            goto L_0x0044
        L_0x003c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Height must not be UNSPECIFIED"
            r1.<init>(r2)
            throw r1
        L_0x0044:
            r1 = 0
            if (r3 == r6) goto L_0x0057
            if (r3 == r7) goto L_0x004c
            r4 = r1
        L_0x004a:
            r5 = r4
            goto L_0x0063
        L_0x004c:
            int r5 = r20.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r20.getPaddingBottom()
            int r4 = r4 - r5
            goto L_0x004a
        L_0x0057:
            int r5 = r20.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r20.getPaddingBottom()
            int r4 = r4 - r5
            r5 = r4
            r4 = r1
        L_0x0063:
            int r8 = r20.getPaddingLeft()
            int r8 = r2 - r8
            int r9 = r20.getPaddingRight()
            int r8 = r8 - r9
            int r9 = r20.getChildCount()
            r10 = 2
            if (r9 <= r10) goto L_0x007c
            java.lang.String r10 = "SlidingPaneLayout"
            java.lang.String r11 = "onMeasure: More than two child views are not supported."
            android.util.Log.e(r10, r11)
        L_0x007c:
            r10 = 0
            r0.f1557a = r10
            r11 = r1
            r13 = r4
            r14 = r8
            r12 = 0
            r4 = r11
        L_0x0084:
            r15 = 8
            r16 = 1
            if (r4 >= r9) goto L_0x012a
            android.view.View r6 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r18 = r6.getLayoutParams()
            r7 = r18
            android.support.v4.widget.SlidingPaneLayout$LayoutParams r7 = (android.support.p017v4.widget.SlidingPaneLayout.LayoutParams) r7
            int r10 = r6.getVisibility()
            if (r10 != r15) goto L_0x00a0
            r7.f1583c = r1
            goto L_0x0121
        L_0x00a0:
            float r10 = r7.f1581a
            r15 = 0
            int r10 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x00b0
            float r10 = r7.f1581a
            float r12 = r12 + r10
            int r10 = r7.width
            if (r10 != 0) goto L_0x00b0
            goto L_0x0121
        L_0x00b0:
            int r10 = r7.leftMargin
            int r15 = r7.rightMargin
            int r10 = r10 + r15
            int r15 = r7.width
            r1 = -2
            if (r15 != r1) goto L_0x00c5
            int r1 = r8 - r10
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x00db
        L_0x00c5:
            int r1 = r7.width
            r15 = -1
            if (r1 != r15) goto L_0x00d3
            int r1 = r8 - r10
            r10 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
            goto L_0x00db
        L_0x00d3:
            r10 = 1073741824(0x40000000, float:2.0)
            int r1 = r7.width
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
        L_0x00db:
            int r15 = r7.height
            r10 = -2
            if (r15 != r10) goto L_0x00e7
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            goto L_0x00fb
        L_0x00e7:
            int r10 = r7.height
            r15 = -1
            if (r10 != r15) goto L_0x00f3
            r10 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            goto L_0x00fb
        L_0x00f3:
            r10 = 1073741824(0x40000000, float:2.0)
            int r15 = r7.height
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
        L_0x00fb:
            r6.measure(r1, r15)
            int r1 = r6.getMeasuredWidth()
            int r10 = r6.getMeasuredHeight()
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r15) goto L_0x0110
            if (r10 <= r13) goto L_0x0110
            int r13 = java.lang.Math.min(r10, r5)
        L_0x0110:
            int r14 = r14 - r1
            if (r14 >= 0) goto L_0x0116
            r1 = r16
            goto L_0x0117
        L_0x0116:
            r1 = 0
        L_0x0117:
            r7.f1582b = r1
            r1 = r1 | r11
            boolean r7 = r7.f1582b
            if (r7 == 0) goto L_0x0120
            r0.f1557a = r6
        L_0x0120:
            r11 = r1
        L_0x0121:
            int r4 = r4 + 1
            r1 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x0084
        L_0x012a:
            if (r11 != 0) goto L_0x0131
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x022a
        L_0x0131:
            int r1 = r0.f1568l
            int r1 = r8 - r1
            r3 = 0
        L_0x0136:
            if (r3 >= r9) goto L_0x022a
            android.view.View r4 = r0.getChildAt(r3)
            int r6 = r4.getVisibility()
            if (r6 != r15) goto L_0x0149
        L_0x0142:
            r19 = r1
        L_0x0144:
            r1 = 0
            r6 = 1073741824(0x40000000, float:2.0)
            goto L_0x0222
        L_0x0149:
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            android.support.v4.widget.SlidingPaneLayout$LayoutParams r6 = (android.support.p017v4.widget.SlidingPaneLayout.LayoutParams) r6
            int r7 = r4.getVisibility()
            if (r7 != r15) goto L_0x0156
            goto L_0x0142
        L_0x0156:
            int r7 = r6.width
            if (r7 != 0) goto L_0x0164
            float r7 = r6.f1581a
            r10 = 0
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0164
            r7 = r16
            goto L_0x0165
        L_0x0164:
            r7 = 0
        L_0x0165:
            if (r7 == 0) goto L_0x0169
            r10 = 0
            goto L_0x016d
        L_0x0169:
            int r10 = r4.getMeasuredWidth()
        L_0x016d:
            if (r11 == 0) goto L_0x01b7
            android.view.View r15 = r0.f1557a
            if (r4 == r15) goto L_0x01b7
            int r15 = r6.width
            if (r15 >= 0) goto L_0x0142
            if (r10 > r1) goto L_0x0180
            float r10 = r6.f1581a
            r15 = 0
            int r10 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x0142
        L_0x0180:
            if (r7 == 0) goto L_0x01a5
            int r7 = r6.height
            r10 = -2
            if (r7 != r10) goto L_0x0190
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x01af
        L_0x0190:
            int r7 = r6.height
            r10 = -1
            if (r7 != r10) goto L_0x019c
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            goto L_0x01af
        L_0x019c:
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = r6.height
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            goto L_0x01af
        L_0x01a5:
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = r4.getMeasuredHeight()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
        L_0x01af:
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r7)
            r4.measure(r10, r6)
            goto L_0x0142
        L_0x01b7:
            float r7 = r6.f1581a
            r15 = 0
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 <= 0) goto L_0x0142
            int r7 = r6.width
            if (r7 != 0) goto L_0x01e7
            int r7 = r6.height
            r15 = -2
            if (r7 != r15) goto L_0x01d2
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            r15 = r17
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x01f3
        L_0x01d2:
            int r7 = r6.height
            r15 = -1
            if (r7 != r15) goto L_0x01de
            r7 = 1073741824(0x40000000, float:2.0)
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            goto L_0x01f1
        L_0x01de:
            r7 = 1073741824(0x40000000, float:2.0)
            int r15 = r6.height
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r7)
            goto L_0x01f1
        L_0x01e7:
            r7 = 1073741824(0x40000000, float:2.0)
            int r15 = r4.getMeasuredHeight()
            int r17 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r7)
        L_0x01f1:
            r15 = r17
        L_0x01f3:
            if (r11 == 0) goto L_0x020b
            int r7 = r6.leftMargin
            int r6 = r6.rightMargin
            int r7 = r7 + r6
            int r6 = r8 - r7
            r19 = r1
            r7 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            if (r10 == r6) goto L_0x0144
            r4.measure(r1, r15)
            goto L_0x0144
        L_0x020b:
            r19 = r1
            r1 = 0
            int r7 = java.lang.Math.max(r1, r14)
            float r6 = r6.f1581a
            float r7 = (float) r7
            float r6 = r6 * r7
            float r6 = r6 / r12
            int r6 = (int) r6
            int r10 = r10 + r6
            r6 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r6)
            r4.measure(r7, r15)
        L_0x0222:
            int r3 = r3 + 1
            r1 = r19
            r15 = 8
            goto L_0x0136
        L_0x022a:
            int r1 = r20.getPaddingTop()
            int r13 = r13 + r1
            int r1 = r20.getPaddingBottom()
            int r13 = r13 + r1
            r0.setMeasuredDimension(r2, r13)
            r0.f1569m = r11
            android.support.v4.widget.s r1 = r0.f1561e
            int r1 = r1.mo2545a()
            if (r1 == 0) goto L_0x0248
            if (r11 != 0) goto L_0x0248
            android.support.v4.widget.s r1 = r0.f1561e
            r1.mo2566f()
        L_0x0248:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            boolean r1 = r19.mo2323f()
            r2 = 1
            if (r1 == 0) goto L_0x0010
            android.support.v4.widget.s r3 = r0.f1561e
            r4 = 2
            r3.mo2547a(r4)
            goto L_0x0015
        L_0x0010:
            android.support.v4.widget.s r3 = r0.f1561e
            r3.mo2547a(r2)
        L_0x0015:
            int r3 = r23 - r21
            if (r1 == 0) goto L_0x001e
            int r4 = r19.getPaddingRight()
            goto L_0x0022
        L_0x001e:
            int r4 = r19.getPaddingLeft()
        L_0x0022:
            if (r1 == 0) goto L_0x0029
            int r5 = r19.getPaddingLeft()
            goto L_0x002d
        L_0x0029:
            int r5 = r19.getPaddingRight()
        L_0x002d:
            int r6 = r19.getPaddingTop()
            int r7 = r19.getChildCount()
            boolean r8 = r0.f1575s
            if (r8 == 0) goto L_0x0047
            boolean r8 = r0.f1569m
            if (r8 == 0) goto L_0x0044
            boolean r8 = r0.f1562f
            if (r8 == 0) goto L_0x0044
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0045
        L_0x0044:
            r8 = 0
        L_0x0045:
            r0.f1558b = r8
        L_0x0047:
            r11 = r4
            r12 = r11
            r4 = 0
        L_0x004a:
            if (r4 >= r7) goto L_0x00dd
            android.view.View r13 = r0.getChildAt(r4)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x005c
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00d8
        L_0x005c:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            android.support.v4.widget.SlidingPaneLayout$LayoutParams r14 = (android.support.p017v4.widget.SlidingPaneLayout.LayoutParams) r14
            int r15 = r13.getMeasuredWidth()
            boolean r2 = r14.f1582b
            if (r2 == 0) goto L_0x00a4
            int r2 = r14.leftMargin
            int r8 = r14.rightMargin
            int r2 = r2 + r8
            int r8 = r3 - r5
            int r9 = r0.f1568l
            int r9 = r8 - r9
            int r9 = java.lang.Math.min(r11, r9)
            int r9 = r9 - r12
            int r9 = r9 - r2
            r0.f1559c = r9
            if (r1 == 0) goto L_0x0082
            int r2 = r14.rightMargin
            goto L_0x0084
        L_0x0082:
            int r2 = r14.leftMargin
        L_0x0084:
            int r16 = r12 + r2
            int r16 = r16 + r9
            int r17 = r15 / 2
            int r10 = r16 + r17
            if (r10 <= r8) goto L_0x0090
            r8 = 1
            goto L_0x0091
        L_0x0090:
            r8 = 0
        L_0x0091:
            r14.f1583c = r8
            float r8 = (float) r9
            float r9 = r0.f1558b
            float r8 = r8 * r9
            int r8 = (int) r8
            int r2 = r2 + r8
            int r2 = r2 + r12
            float r8 = (float) r8
            int r9 = r0.f1559c
            float r9 = (float) r9
            float r8 = r8 / r9
            r0.f1558b = r8
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00bd
        L_0x00a4:
            boolean r2 = r0.f1569m
            if (r2 == 0) goto L_0x00ba
            int r2 = r0.f1571o
            if (r2 == 0) goto L_0x00ba
            float r2 = r0.f1558b
            r8 = 1065353216(0x3f800000, float:1.0)
            float r10 = r8 - r2
            int r2 = r0.f1571o
            float r2 = (float) r2
            float r10 = r10 * r2
            int r2 = (int) r10
            r9 = r2
            r2 = r11
            goto L_0x00be
        L_0x00ba:
            r8 = 1065353216(0x3f800000, float:1.0)
            r2 = r11
        L_0x00bd:
            r9 = 0
        L_0x00be:
            if (r1 == 0) goto L_0x00c6
            int r10 = r3 - r2
            int r10 = r10 + r9
            int r9 = r10 - r15
            goto L_0x00ca
        L_0x00c6:
            int r9 = r2 - r9
            int r10 = r9 + r15
        L_0x00ca:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r6
            r13.layout(r9, r6, r10, r12)
            int r9 = r13.getWidth()
            int r11 = r11 + r9
            r12 = r2
        L_0x00d8:
            int r4 = r4 + 1
            r2 = 1
            goto L_0x004a
        L_0x00dd:
            boolean r1 = r0.f1575s
            if (r1 == 0) goto L_0x0119
            boolean r1 = r0.f1569m
            if (r1 == 0) goto L_0x0104
            int r1 = r0.f1571o
            if (r1 == 0) goto L_0x00ee
            float r1 = r0.f1558b
            r0.m2437a(r1)
        L_0x00ee:
            android.view.View r1 = r0.f1557a
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v4.widget.SlidingPaneLayout$LayoutParams r1 = (android.support.p017v4.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r1 = r1.f1583c
            if (r1 == 0) goto L_0x0114
            android.view.View r1 = r0.f1557a
            float r2 = r0.f1558b
            int r3 = r0.f1564h
            r0.m2438a(r1, r2, r3)
            goto L_0x0114
        L_0x0104:
            r1 = 0
        L_0x0105:
            if (r1 >= r7) goto L_0x0114
            android.view.View r2 = r0.getChildAt(r1)
            int r3 = r0.f1564h
            r4 = 0
            r0.m2438a(r2, r4, r3)
            int r1 = r1 + 1
            goto L_0x0105
        L_0x0114:
            android.view.View r1 = r0.f1557a
            r0.mo2317d(r1)
        L_0x0119:
            r1 = 0
            r0.f1575s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.widget.SlidingPaneLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f1575s = true;
        }
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f1569m) {
            this.f1562f = view == this.f1557a;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (!this.f1569m && actionMasked == 0 && getChildCount() > 1) {
            View childAt = getChildAt(1);
            if (childAt != null) {
                this.f1562f = !this.f1561e.mo2558b(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
            }
        }
        if (!this.f1569m || (this.f1560d && actionMasked != 0)) {
            this.f1561e.mo2565e();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f1561e.mo2565e();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f1560d = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f1572p = x;
                this.f1573q = y;
                if (this.f1561e.mo2558b(this.f1557a, (int) x, (int) y) && mo2324f(this.f1557a)) {
                    z = true;
                    if (!this.f1561e.mo2550a(motionEvent) && !z) {
                        z2 = false;
                    }
                    return z2;
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.f1572p);
                float abs2 = Math.abs(y2 - this.f1573q);
                if (abs > ((float) this.f1561e.mo2562d()) && abs2 > abs) {
                    this.f1561e.mo2565e();
                    this.f1560d = true;
                    return false;
                }
            }
            z = false;
            z2 = false;
            return z2;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f1569m) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1561e.mo2554b(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f1572p = x;
                this.f1573q = y;
                break;
            case 1:
                if (mo2324f(this.f1557a)) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float f = x2 - this.f1572p;
                    float f2 = y2 - this.f1573q;
                    int d = this.f1561e.mo2562d();
                    if ((f * f) + (f2 * f2) < ((float) (d * d)) && this.f1561e.mo2558b(this.f1557a, (int) x2, (int) y2)) {
                        m2439a(this.f1557a, 0);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m2439a(View view, int i) {
        if (!this.f1575s && !mo2310a(0.0f, i)) {
            return false;
        }
        this.f1562f = false;
        return true;
    }

    /* renamed from: b */
    private boolean m2440b(View view, int i) {
        if (!this.f1575s && !mo2310a(1.0f, i)) {
            return false;
        }
        this.f1562f = true;
        return true;
    }

    /* renamed from: b */
    public boolean mo2312b() {
        return m2440b(this.f1557a, 0);
    }

    /* renamed from: c */
    public boolean mo2314c() {
        return m2439a(this.f1557a, 0);
    }

    /* renamed from: d */
    public boolean mo2318d() {
        return !this.f1569m || this.f1558b == 1.0f;
    }

    /* renamed from: e */
    public boolean mo2322e() {
        return this.f1569m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2308a(int i) {
        if (this.f1557a == null) {
            this.f1558b = 0.0f;
            return;
        }
        boolean f = mo2323f();
        LayoutParams layoutParams = (LayoutParams) this.f1557a.getLayoutParams();
        int width = this.f1557a.getWidth();
        if (f) {
            i = (getWidth() - i) - width;
        }
        this.f1558b = ((float) (i - ((f ? getPaddingRight() : getPaddingLeft()) + (f ? layoutParams.rightMargin : layoutParams.leftMargin)))) / ((float) this.f1559c);
        if (this.f1571o != 0) {
            m2437a(this.f1558b);
        }
        if (layoutParams.f1583c) {
            m2438a(this.f1557a, this.f1558b, this.f1564h);
        }
        mo2309a(this.f1557a);
    }

    /* renamed from: a */
    private void m2438a(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & 16777215);
            if (layoutParams.f1584d == null) {
                layoutParams.f1584d = new Paint();
            }
            layoutParams.f1584d.setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.f1584d);
            }
            mo2321e(view);
        } else if (view.getLayerType() != 0) {
            if (layoutParams.f1584d != null) {
                layoutParams.f1584d.setColorFilter(null);
            }
            C0624b bVar = new C0624b(view);
            this.f1563g.add(bVar);
            C0595r.m2242a((View) this, (Runnable) bVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f1569m && !layoutParams.f1582b && this.f1557a != null) {
            canvas.getClipBounds(this.f1576t);
            if (mo2323f()) {
                this.f1576t.left = Math.max(this.f1576t.left, this.f1557a.getRight());
            } else {
                this.f1576t.right = Math.min(this.f1576t.right, this.f1557a.getLeft());
            }
            canvas.clipRect(this.f1576t);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo2321e(View view) {
        if (VERSION.SDK_INT >= 17) {
            C0595r.m2237a(view, ((LayoutParams) view.getLayoutParams()).f1584d);
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            if (!this.f1579w) {
                try {
                    this.f1577u = View.class.getDeclaredMethod("getDisplayList", null);
                } catch (NoSuchMethodException e) {
                    Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", e);
                }
                try {
                    this.f1578v = View.class.getDeclaredField("mRecreateDisplayList");
                    this.f1578v.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e2);
                }
                this.f1579w = true;
            }
            if (this.f1577u == null || this.f1578v == null) {
                view.invalidate();
                return;
            }
            try {
                this.f1578v.setBoolean(view, true);
                this.f1577u.invoke(view, null);
            } catch (Exception e3) {
                Log.e("SlidingPaneLayout", "Error refreshing display list state", e3);
            }
        }
        C0595r.m2235a(this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2310a(float f, int i) {
        int i2;
        if (!this.f1569m) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) this.f1557a.getLayoutParams();
        if (mo2323f()) {
            i2 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + layoutParams.rightMargin)) + (f * ((float) this.f1559c))) + ((float) this.f1557a.getWidth())));
        } else {
            i2 = (int) (((float) (getPaddingLeft() + layoutParams.leftMargin)) + (f * ((float) this.f1559c)));
        }
        if (!this.f1561e.mo2551a(this.f1557a, i2, this.f1557a.getTop())) {
            return false;
        }
        mo2307a();
        C0595r.m2252d(this);
        return true;
    }

    public void computeScroll() {
        if (this.f1561e.mo2552a(true)) {
            if (!this.f1569m) {
                this.f1561e.mo2566f();
                return;
            }
            C0595r.m2252d(this);
        }
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f1566j = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f1567k = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C0356c.m1312a(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(C0356c.m1312a(getContext(), i));
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        int i;
        int i2;
        super.draw(canvas);
        if (mo2323f()) {
            drawable = this.f1567k;
        } else {
            drawable = this.f1566j;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (mo2323f()) {
                i2 = childAt.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = childAt.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2437a(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.mo2323f()
            android.view.View r1 = r9.f1557a
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v4.widget.SlidingPaneLayout$LayoutParams r1 = (android.support.p017v4.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.f1583c
            r3 = 0
            if (r2 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0016
            int r1 = r1.rightMargin
            goto L_0x0018
        L_0x0016:
            int r1 = r1.leftMargin
        L_0x0018:
            if (r1 > 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = r3
        L_0x001d:
            int r2 = r9.getChildCount()
        L_0x0021:
            if (r3 >= r2) goto L_0x005b
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.f1557a
            if (r4 != r5) goto L_0x002c
            goto L_0x0058
        L_0x002c:
            float r5 = r9.f1570n
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f1571o
            float r7 = (float) r7
            float r5 = r5 * r7
            int r5 = (int) r5
            r9.f1570n = r10
            float r7 = r6 - r10
            int r8 = r9.f1571o
            float r8 = (float) r8
            float r7 = r7 * r8
            int r7 = (int) r7
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0044
            int r5 = -r5
        L_0x0044:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L_0x0058
            if (r0 == 0) goto L_0x004f
            float r5 = r9.f1570n
            float r5 = r5 - r6
            goto L_0x0053
        L_0x004f:
            float r5 = r9.f1570n
            float r5 = r6 - r5
        L_0x0053:
            int r6 = r9.f1565i
            r9.m2438a(r4, r5, r6)
        L_0x0058:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017v4.widget.SlidingPaneLayout.m2437a(float):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo2324f(View view) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f1569m && layoutParams.f1583c && this.f1558b > 0.0f) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1585a = mo2322e() ? mo2318d() : this.f1562f;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo1845a());
        if (savedState.f1585a) {
            mo2312b();
        } else {
            mo2314c();
        }
        this.f1562f = savedState.f1585a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo2323f() {
        return C0595r.m2256f(this) == 1;
    }
}
