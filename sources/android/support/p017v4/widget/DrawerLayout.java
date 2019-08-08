package android.support.p017v4.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.p017v4.content.C0356c;
import android.support.p017v4.graphics.drawable.C0407a;
import android.support.p017v4.view.AbsSavedState;
import android.support.p017v4.view.C0561a;
import android.support.p017v4.view.C0579c;
import android.support.p017v4.view.C0595r;
import android.support.p017v4.view.p026a.C0564b;
import android.support.p017v4.view.p026a.C0564b.C0565a;
import android.support.p017v4.widget.C0667s.C0670a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.widget.DrawerLayout */
public class DrawerLayout extends ViewGroup {

    /* renamed from: a */
    static final int[] f1470a = {16842931};

    /* renamed from: b */
    static final boolean f1471b = (VERSION.SDK_INT >= 19);

    /* renamed from: c */
    private static final int[] f1472c = {16843828};

    /* renamed from: d */
    private static final boolean f1473d;

    /* renamed from: A */
    private float f1474A;

    /* renamed from: B */
    private Drawable f1475B;

    /* renamed from: C */
    private Drawable f1476C;

    /* renamed from: D */
    private Drawable f1477D;

    /* renamed from: E */
    private CharSequence f1478E;

    /* renamed from: F */
    private CharSequence f1479F;

    /* renamed from: G */
    private Object f1480G;

    /* renamed from: H */
    private boolean f1481H;

    /* renamed from: I */
    private Drawable f1482I;

    /* renamed from: J */
    private Drawable f1483J;

    /* renamed from: K */
    private Drawable f1484K;

    /* renamed from: L */
    private Drawable f1485L;

    /* renamed from: M */
    private final ArrayList<View> f1486M;

    /* renamed from: N */
    private Rect f1487N;

    /* renamed from: O */
    private Matrix f1488O;

    /* renamed from: e */
    private final C0615b f1489e;

    /* renamed from: f */
    private float f1490f;

    /* renamed from: g */
    private int f1491g;

    /* renamed from: h */
    private int f1492h;

    /* renamed from: i */
    private float f1493i;

    /* renamed from: j */
    private Paint f1494j;

    /* renamed from: k */
    private final C0667s f1495k;

    /* renamed from: l */
    private final C0667s f1496l;

    /* renamed from: m */
    private final C0617d f1497m;

    /* renamed from: n */
    private final C0617d f1498n;

    /* renamed from: o */
    private int f1499o;

    /* renamed from: p */
    private boolean f1500p;

    /* renamed from: q */
    private boolean f1501q;

    /* renamed from: r */
    private int f1502r;

    /* renamed from: s */
    private int f1503s;

    /* renamed from: t */
    private int f1504t;

    /* renamed from: u */
    private int f1505u;

    /* renamed from: v */
    private boolean f1506v;

    /* renamed from: w */
    private boolean f1507w;

    /* renamed from: x */
    private C0616c f1508x;

    /* renamed from: y */
    private List<C0616c> f1509y;

    /* renamed from: z */
    private float f1510z;

    /* renamed from: android.support.v4.widget.DrawerLayout$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: a */
        public int f1512a = 0;

        /* renamed from: b */
        float f1513b;

        /* renamed from: c */
        boolean f1514c;

        /* renamed from: d */
        int f1515d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f1470a);
            this.f1512a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1512a = layoutParams.f1512a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$SavedState */
    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
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
        int f1516a = 0;

        /* renamed from: c */
        int f1517c;

        /* renamed from: d */
        int f1518d;

        /* renamed from: e */
        int f1519e;

        /* renamed from: f */
        int f1520f;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1516a = parcel.readInt();
            this.f1517c = parcel.readInt();
            this.f1518d = parcel.readInt();
            this.f1519e = parcel.readInt();
            this.f1520f = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1516a);
            parcel.writeInt(this.f1517c);
            parcel.writeInt(this.f1518d);
            parcel.writeInt(this.f1519e);
            parcel.writeInt(this.f1520f);
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$a */
    class C0614a extends C0561a {

        /* renamed from: b */
        private final Rect f1522b = new Rect();

        C0614a() {
        }

        /* renamed from: a */
        public void mo1969a(View view, C0564b bVar) {
            if (DrawerLayout.f1471b) {
                super.mo1969a(view, bVar);
            } else {
                C0564b a = C0564b.m2108a(bVar);
                super.mo1969a(view, a);
                bVar.mo1996a(view);
                ViewParent g = C0595r.m2258g(view);
                if (g instanceof View) {
                    bVar.mo2010c((View) g);
                }
                m2378a(bVar, a);
                a.mo2039t();
                m2379a(bVar, (ViewGroup) view);
            }
            bVar.mo2005b((CharSequence) DrawerLayout.class.getName());
            bVar.mo1999a(false);
            bVar.mo2007b(false);
            bVar.mo2000a(C0565a.f1380a);
            bVar.mo2000a(C0565a.f1381b);
        }

        /* renamed from: d */
        public void mo1971d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1971d(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        /* renamed from: b */
        public boolean mo1982b(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo1982b(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View c = DrawerLayout.this.mo2167c();
            if (c != null) {
                CharSequence b = DrawerLayout.this.mo2161b(DrawerLayout.this.mo2177e(c));
                if (b != null) {
                    text.add(b);
                }
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo1981a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f1471b || DrawerLayout.m2340l(view)) {
                return super.mo1981a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: a */
        private void m2379a(C0564b bVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m2340l(childAt)) {
                    bVar.mo2004b(childAt);
                }
            }
        }

        /* renamed from: a */
        private void m2378a(C0564b bVar, C0564b bVar2) {
            Rect rect = this.f1522b;
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
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$b */
    static final class C0615b extends C0561a {
        C0615b() {
        }

        /* renamed from: a */
        public void mo1969a(View view, C0564b bVar) {
            super.mo1969a(view, bVar);
            if (!DrawerLayout.m2340l(view)) {
                bVar.mo2010c((View) null);
            }
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$c */
    public interface C0616c {
        /* renamed from: a */
        void mo2219a(int i);

        /* renamed from: a */
        void mo2220a(View view);

        /* renamed from: a */
        void mo2221a(View view, float f);

        /* renamed from: b */
        void mo2222b(View view);
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$d */
    private class C0617d extends C0670a {

        /* renamed from: b */
        private final int f1524b;

        /* renamed from: c */
        private C0667s f1525c;

        /* renamed from: d */
        private final Runnable f1526d = new Runnable() {
            public void run() {
                C0617d.this.mo2225b();
            }
        };

        public boolean onEdgeLock(int i) {
            return false;
        }

        C0617d(int i) {
            this.f1524b = i;
        }

        /* renamed from: a */
        public void mo2224a(C0667s sVar) {
            this.f1525c = sVar;
        }

        /* renamed from: a */
        public void mo2223a() {
            DrawerLayout.this.removeCallbacks(this.f1526d);
        }

        public boolean tryCaptureView(View view, int i) {
            return DrawerLayout.this.mo2181g(view) && DrawerLayout.this.mo2158a(view, this.f1524b) && DrawerLayout.this.mo2148a(view) == 0;
        }

        public void onViewDragStateChanged(int i) {
            DrawerLayout.this.mo2151a(this.f1524b, i, this.f1525c.mo2559c());
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float f;
            int width = view.getWidth();
            if (DrawerLayout.this.mo2158a(view, 3)) {
                f = ((float) (i + width)) / ((float) width);
            } else {
                f = ((float) (DrawerLayout.this.getWidth() - i)) / ((float) width);
            }
            DrawerLayout.this.mo2165b(view, f);
            view.setVisibility(f == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        public void onViewCaptured(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).f1514c = false;
            m2389c();
        }

        /* renamed from: c */
        private void m2389c() {
            int i = 3;
            if (this.f1524b == 3) {
                i = 5;
            }
            View c = DrawerLayout.this.mo2168c(i);
            if (c != null) {
                DrawerLayout.this.mo2188i(c);
            }
        }

        public void onViewReleased(View view, float f, float f2) {
            int i;
            float d = DrawerLayout.this.mo2173d(view);
            int width = view.getWidth();
            if (DrawerLayout.this.mo2158a(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && d > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && d > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f1525c.mo2549a(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        public void onEdgeTouched(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f1526d, 160);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo2225b() {
            View view;
            int i;
            int b = this.f1525c.mo2553b();
            int i2 = 0;
            boolean z = this.f1524b == 3;
            if (z) {
                view = DrawerLayout.this.mo2168c(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + b;
            } else {
                view = DrawerLayout.this.mo2168c(5);
                i = DrawerLayout.this.getWidth() - b;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.mo2148a(view) == 0) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                this.f1525c.mo2551a(view, i, view.getTop());
                layoutParams.f1514c = true;
                DrawerLayout.this.invalidate();
                m2389c();
                DrawerLayout.this.mo2174d();
            }
        }

        public void onEdgeDragStarted(int i, int i2) {
            View view;
            if ((i & 1) == 1) {
                view = DrawerLayout.this.mo2168c(3);
            } else {
                view = DrawerLayout.this.mo2168c(5);
            }
            if (view != null && DrawerLayout.this.mo2148a(view) == 0) {
                this.f1525c.mo2548a(view, i2);
            }
        }

        public int getViewHorizontalDragRange(View view) {
            if (DrawerLayout.this.mo2181g(view)) {
                return view.getWidth();
            }
            return 0;
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            if (DrawerLayout.this.mo2158a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }
    }

    static {
        boolean z = true;
        if (VERSION.SDK_INT < 21) {
            z = false;
        }
        f1473d = z;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1489e = new C0615b();
        this.f1492h = -1728053248;
        this.f1494j = new Paint();
        this.f1501q = true;
        this.f1502r = 3;
        this.f1503s = 3;
        this.f1504t = 3;
        this.f1505u = 3;
        this.f1482I = null;
        this.f1483J = null;
        this.f1484K = null;
        this.f1485L = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f1491g = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f1497m = new C0617d(3);
        this.f1498n = new C0617d(5);
        this.f1495k = C0667s.m2640a((ViewGroup) this, 1.0f, (C0670a) this.f1497m);
        this.f1495k.mo2547a(1);
        this.f1495k.mo2546a(f2);
        this.f1497m.mo2224a(this.f1495k);
        this.f1496l = C0667s.m2640a((ViewGroup) this, 1.0f, (C0670a) this.f1498n);
        this.f1496l.mo2547a(2);
        this.f1496l.mo2546a(f2);
        this.f1498n.mo2224a(this.f1496l);
        setFocusableInTouchMode(true);
        C0595r.m2247b((View) this, 1);
        C0595r.m2240a((View) this, (C0561a) new C0614a());
        setMotionEventSplittingEnabled(false);
        if (C0595r.m2268q(this)) {
            if (VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener() {
                    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        ((DrawerLayout) view).mo2156a((Object) windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
                        return windowInsets.consumeSystemWindowInsets();
                    }
                });
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1472c);
                try {
                    this.f1475B = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f1475B = null;
            }
        }
        this.f1490f = 10.0f * f;
        this.f1486M = new ArrayList<>();
    }

    public void setDrawerElevation(float f) {
        this.f1490f = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (mo2181g(childAt)) {
                C0595r.m2232a(childAt, this.f1490f);
            }
        }
    }

    public float getDrawerElevation() {
        if (f1473d) {
            return this.f1490f;
        }
        return 0.0f;
    }

    /* renamed from: a */
    public void mo2156a(Object obj, boolean z) {
        this.f1480G = obj;
        this.f1481H = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setScrimColor(int i) {
        this.f1492h = i;
        invalidate();
    }

    @Deprecated
    public void setDrawerListener(C0616c cVar) {
        if (this.f1508x != null) {
            mo2163b(this.f1508x);
        }
        if (cVar != null) {
            mo2153a(cVar);
        }
        this.f1508x = cVar;
    }

    /* renamed from: a */
    public void mo2153a(C0616c cVar) {
        if (cVar != null) {
            if (this.f1509y == null) {
                this.f1509y = new ArrayList();
            }
            this.f1509y.add(cVar);
        }
    }

    /* renamed from: b */
    public void mo2163b(C0616c cVar) {
        if (cVar != null && this.f1509y != null) {
            this.f1509y.remove(cVar);
        }
    }

    public void setDrawerLockMode(int i) {
        mo2150a(i, 3);
        mo2150a(i, 5);
    }

    /* renamed from: a */
    public void mo2150a(int i, int i2) {
        int a = C0579c.m2179a(i2, C0595r.m2256f(this));
        if (i2 == 3) {
            this.f1502r = i;
        } else if (i2 == 5) {
            this.f1503s = i;
        } else if (i2 == 8388611) {
            this.f1504t = i;
        } else if (i2 == 8388613) {
            this.f1505u = i;
        }
        if (i != 0) {
            (a == 3 ? this.f1495k : this.f1496l).mo2565e();
        }
        switch (i) {
            case 1:
                View c = mo2168c(a);
                if (c != null) {
                    mo2188i(c);
                    return;
                }
                return;
            case 2:
                View c2 = mo2168c(a);
                if (c2 != null) {
                    mo2187h(c2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public int mo2147a(int i) {
        int i2;
        int i3;
        int i4;
        int f = C0595r.m2256f(this);
        if (i != 3) {
            if (i != 5) {
                if (i != 8388611) {
                    if (i == 8388613) {
                        if (this.f1505u != 3) {
                            return this.f1505u;
                        }
                        if (f == 0) {
                            i4 = this.f1503s;
                        } else {
                            i4 = this.f1502r;
                        }
                        if (i4 != 3) {
                            return i4;
                        }
                    }
                } else if (this.f1504t != 3) {
                    return this.f1504t;
                } else {
                    if (f == 0) {
                        i3 = this.f1502r;
                    } else {
                        i3 = this.f1503s;
                    }
                    if (i3 != 3) {
                        return i3;
                    }
                }
            } else if (this.f1503s != 3) {
                return this.f1503s;
            } else {
                if (f == 0) {
                    i2 = this.f1505u;
                } else {
                    i2 = this.f1504t;
                }
                if (i2 != 3) {
                    return i2;
                }
            }
        } else if (this.f1502r != 3) {
            return this.f1502r;
        } else {
            int i5 = f == 0 ? this.f1504t : this.f1505u;
            if (i5 != 3) {
                return i5;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public int mo2148a(View view) {
        if (mo2181g(view)) {
            return mo2147a(((LayoutParams) view.getLayoutParams()).f1512a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public CharSequence mo2161b(int i) {
        int a = C0579c.m2179a(i, C0595r.m2256f(this));
        if (a == 3) {
            return this.f1478E;
        }
        if (a == 5) {
            return this.f1479F;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m2329a(float f, float f2, View view) {
        if (this.f1487N == null) {
            this.f1487N = new Rect();
        }
        view.getHitRect(this.f1487N);
        return this.f1487N.contains((int) f, (int) f2);
    }

    /* renamed from: a */
    private boolean m2331a(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent b = m2332b(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(b);
            b.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* renamed from: b */
    private MotionEvent m2332b(MotionEvent motionEvent, View view) {
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f1488O == null) {
                this.f1488O = new Matrix();
            }
            matrix.invert(this.f1488O);
            obtain.transform(this.f1488O);
        }
        return obtain;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2151a(int i, int i2, View view) {
        int a = this.f1495k.mo2545a();
        int a2 = this.f1496l.mo2545a();
        int i3 = 2;
        if (a == 1 || a2 == 1) {
            i3 = 1;
        } else if (!(a == 2 || a2 == 2)) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.f1513b == 0.0f) {
                mo2164b(view);
            } else if (layoutParams.f1513b == 1.0f) {
                mo2169c(view);
            }
        }
        if (i3 != this.f1499o) {
            this.f1499o = i3;
            if (this.f1509y != null) {
                for (int size = this.f1509y.size() - 1; size >= 0; size--) {
                    ((C0616c) this.f1509y.get(size)).mo2219a(i3);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2164b(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f1515d & 1) == 1) {
            layoutParams.f1515d = 0;
            if (this.f1509y != null) {
                for (int size = this.f1509y.size() - 1; size >= 0; size--) {
                    ((C0616c) this.f1509y.get(size)).mo2222b(view);
                }
            }
            m2333c(view, false);
            if (hasWindowFocus()) {
                View rootView = getRootView();
                if (rootView != null) {
                    rootView.sendAccessibilityEvent(32);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2169c(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f1515d & 1) == 0) {
            layoutParams.f1515d = 1;
            if (this.f1509y != null) {
                for (int size = this.f1509y.size() - 1; size >= 0; size--) {
                    ((C0616c) this.f1509y.get(size)).mo2220a(view);
                }
            }
            m2333c(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: c */
    private void m2333c(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || mo2181g(childAt)) && (!z || childAt != view)) {
                C0595r.m2247b(childAt, 4);
            } else {
                C0595r.m2247b(childAt, 1);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2154a(View view, float f) {
        if (this.f1509y != null) {
            for (int size = this.f1509y.size() - 1; size >= 0; size--) {
                ((C0616c) this.f1509y.get(size)).mo2221a(view, f);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2165b(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.f1513b) {
            layoutParams.f1513b = f;
            mo2154a(view, f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo2173d(View view) {
        return ((LayoutParams) view.getLayoutParams()).f1513b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo2177e(View view) {
        return C0579c.m2179a(((LayoutParams) view.getLayoutParams()).f1512a, C0595r.m2256f(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2158a(View view, int i) {
        return (mo2177e(view) & i) == i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo2149a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).f1515d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2170c(View view, float f) {
        float width = (float) view.getWidth();
        int i = (int) (width * f);
        int d = i - ((int) (mo2173d(view) * width));
        if (!mo2158a(view, 3)) {
            d = -d;
        }
        view.offsetLeftAndRight(d);
        mo2165b(view, f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public View mo2168c(int i) {
        int a = C0579c.m2179a(i, C0595r.m2256f(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo2177e(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: d */
    static String m2334d(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1501q = true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1501q = true;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.f1480G != null && C0595r.m2268q(this);
        int f = C0595r.m2256f(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int a = C0579c.m2179a(layoutParams.f1512a, f);
                    if (C0595r.m2268q(childAt)) {
                        if (VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f1480G;
                            if (a == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (a == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f1480G;
                        if (a == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        layoutParams.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        layoutParams.topMargin = windowInsets2.getSystemWindowInsetTop();
                        layoutParams.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        layoutParams.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (mo2180f(childAt)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                } else if (mo2181g(childAt)) {
                    if (f1473d && C0595r.m2264m(childAt) != this.f1490f) {
                        C0595r.m2232a(childAt, this.f1490f);
                    }
                    int e = mo2177e(childAt) & 7;
                    int i5 = e == 3 ? 1 : i3;
                    if ((i5 == 0 || !z2) && (i5 != 0 || !z3)) {
                        if (i5 != 0) {
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        childAt.measure(getChildMeasureSpec(i, this.f1491g + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), getChildMeasureSpec(i2, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                        i4++;
                        i3 = 0;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Child drawer has absolute gravity ");
                        sb.append(m2334d(e));
                        sb.append(" but this ");
                        sb.append("DrawerLayout");
                        sb.append(" already has a ");
                        sb.append("drawer view along that edge");
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Child ");
                    sb2.append(childAt);
                    sb2.append(" at index ");
                    sb2.append(i4);
                    sb2.append(" does not have a valid layout_gravity - must be Gravity.LEFT, ");
                    sb2.append("Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            int i6 = i;
            int i7 = i2;
            i4++;
            i3 = 0;
        }
    }

    /* renamed from: e */
    private void m2335e() {
        if (!f1473d) {
            this.f1476C = m2336f();
            this.f1477D = m2337g();
        }
    }

    /* renamed from: f */
    private Drawable m2336f() {
        int f = C0595r.m2256f(this);
        if (f == 0) {
            if (this.f1482I != null) {
                m2330a(this.f1482I, f);
                return this.f1482I;
            }
        } else if (this.f1483J != null) {
            m2330a(this.f1483J, f);
            return this.f1483J;
        }
        return this.f1484K;
    }

    /* renamed from: g */
    private Drawable m2337g() {
        int f = C0595r.m2256f(this);
        if (f == 0) {
            if (this.f1483J != null) {
                m2330a(this.f1483J, f);
                return this.f1483J;
            }
        } else if (this.f1482I != null) {
            m2330a(this.f1482I, f);
            return this.f1482I;
        }
        return this.f1485L;
    }

    /* renamed from: a */
    private boolean m2330a(Drawable drawable, int i) {
        if (drawable == null || !C0407a.m1545b(drawable)) {
            return false;
        }
        C0407a.m1546b(drawable, i);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        boolean z2 = true;
        this.f1500p = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (mo2180f(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (mo2158a(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.f1513b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i8 = i6 - ((int) (layoutParams.f1513b * f3));
                        f = ((float) (i6 - i8)) / f3;
                        i5 = i8;
                    }
                    boolean z3 = f != layoutParams.f1513b ? z2 : false;
                    int i9 = layoutParams.f1512a & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        if (i11 < layoutParams.topMargin) {
                            i11 = layoutParams.topMargin;
                        } else if (i11 + measuredHeight > i10 - layoutParams.bottomMargin) {
                            i11 = (i10 - layoutParams.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                    } else if (i9 != 80) {
                        childAt.layout(i5, layoutParams.topMargin, measuredWidth + i5, layoutParams.topMargin + measuredHeight);
                    } else {
                        int i12 = i4 - i2;
                        childAt.layout(i5, (i12 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i12 - layoutParams.bottomMargin);
                    }
                    if (z3) {
                        mo2165b(childAt, f);
                    }
                    int i13 = layoutParams.f1513b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i13) {
                        childAt.setVisibility(i13);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        this.f1500p = false;
        this.f1501q = false;
    }

    public void requestLayout() {
        if (!this.f1500p) {
            super.requestLayout();
        }
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f1513b);
        }
        this.f1493i = f;
        boolean a = this.f1495k.mo2552a(true);
        boolean a2 = this.f1496l.mo2552a(true);
        if (a || a2) {
            C0595r.m2252d(this);
        }
    }

    /* renamed from: m */
    private static boolean m2341m(View view) {
        Drawable background = view.getBackground();
        boolean z = false;
        if (background == null) {
            return false;
        }
        if (background.getOpacity() == -1) {
            z = true;
        }
        return z;
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f1475B = drawable;
        invalidate();
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1475B;
    }

    public void setStatusBarBackground(int i) {
        this.f1475B = i != 0 ? C0356c.m1312a(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f1475B = new ColorDrawable(i);
        invalidate();
    }

    public void onRtlPropertiesChanged(int i) {
        m2335e();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1481H && this.f1475B != null) {
            int systemWindowInsetTop = (VERSION.SDK_INT < 21 || this.f1480G == null) ? 0 : ((WindowInsets) this.f1480G).getSystemWindowInsetTop();
            if (systemWindowInsetTop > 0) {
                this.f1475B.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f1475B.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int i2;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean f = mo2180f(view2);
        int width = getWidth();
        int save = canvas2.save();
        if (f) {
            int childCount = getChildCount();
            i = width;
            i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view2 && childAt.getVisibility() == 0 && m2341m(childAt) && mo2181g(childAt) && childAt.getHeight() >= height) {
                    if (mo2158a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < i) {
                            i = left;
                        }
                    }
                }
            }
            canvas2.clipRect(i2, 0, i, getHeight());
        } else {
            i = width;
            i2 = 0;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas2.restoreToCount(save);
        if (this.f1493i > 0.0f && f) {
            this.f1494j.setColor((((int) (((float) ((this.f1492h & -16777216) >>> 24)) * this.f1493i)) << 24) | (this.f1492h & 16777215));
            canvas2.drawRect((float) i2, 0.0f, (float) i, (float) getHeight(), this.f1494j);
        } else if (this.f1476C != null && mo2158a(view2, 3)) {
            int intrinsicWidth = this.f1476C.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f1495k.mo2553b()), 1.0f));
            this.f1476C.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f1476C.setAlpha((int) (255.0f * max));
            this.f1476C.draw(canvas2);
        } else if (this.f1477D != null && mo2158a(view2, 5)) {
            int intrinsicWidth2 = this.f1477D.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f1496l.mo2553b()), 1.0f));
            this.f1477D.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f1477D.setAlpha((int) (255.0f * max2));
            this.f1477D.draw(canvas2);
        }
        return drawChild;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo2180f(View view) {
        return ((LayoutParams) view.getLayoutParams()).f1512a == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo2181g(View view) {
        int a = C0579c.m2179a(((LayoutParams) view.getLayoutParams()).f1512a, C0595r.m2256f(view));
        return ((a & 3) == 0 && (a & 5) == 0) ? false : true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean a = this.f1495k.mo2550a(motionEvent) | this.f1496l.mo2550a(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f1510z = x;
                this.f1474A = y;
                if (this.f1493i > 0.0f) {
                    View d = this.f1495k.mo2563d((int) x, (int) y);
                    if (d != null && mo2180f(d)) {
                        z = true;
                        this.f1506v = false;
                        this.f1507w = false;
                        break;
                    }
                }
                z = false;
                this.f1506v = false;
                this.f1507w = false;
            case 1:
            case 3:
                mo2157a(true);
                this.f1506v = false;
                this.f1507w = false;
                break;
            case 2:
                if (this.f1495k.mo2564d(3)) {
                    this.f1497m.mo2223a();
                    this.f1498n.mo2223a();
                    break;
                }
                break;
        }
        z = false;
        if (a || z || m2338h() || this.f1507w) {
            return true;
        }
        return false;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f1493i <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            for (int i = childCount - 1; i >= 0; i--) {
                View childAt = getChildAt(i);
                if (m2329a(x, y, childAt) && !mo2180f(childAt) && m2331a(motionEvent, childAt)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        this.f1495k.mo2554b(motionEvent);
        this.f1496l.mo2554b(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 3) {
            switch (action) {
                case 0:
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.f1510z = x;
                    this.f1474A = y;
                    this.f1506v = false;
                    this.f1507w = false;
                    break;
                case 1:
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    View d = this.f1495k.mo2563d((int) x2, (int) y2);
                    if (d != null && mo2180f(d)) {
                        float f = x2 - this.f1510z;
                        float f2 = y2 - this.f1474A;
                        int d2 = this.f1495k.mo2562d();
                        if ((f * f) + (f2 * f2) < ((float) (d2 * d2))) {
                            View a = mo2149a();
                            if (!(a == null || mo2148a(a) == 2)) {
                                z = false;
                                mo2157a(z);
                                this.f1506v = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    mo2157a(z);
                    this.f1506v = false;
            }
        } else {
            mo2157a(true);
            this.f1506v = false;
            this.f1507w = false;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f1506v = z;
        if (z) {
            mo2157a(true);
        }
    }

    /* renamed from: b */
    public void mo2162b() {
        mo2157a(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2157a(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (mo2181g(childAt) && (!z || layoutParams.f1514c)) {
                int width = childAt.getWidth();
                if (mo2158a(childAt, 3)) {
                    z2 |= this.f1495k.mo2551a(childAt, -width, childAt.getTop());
                } else {
                    z2 |= this.f1496l.mo2551a(childAt, getWidth(), childAt.getTop());
                }
                layoutParams.f1514c = false;
            }
        }
        this.f1497m.mo2223a();
        this.f1498n.mo2223a();
        if (z2) {
            invalidate();
        }
    }

    /* renamed from: h */
    public void mo2187h(View view) {
        mo2155a(view, true);
    }

    /* renamed from: a */
    public void mo2155a(View view, boolean z) {
        if (!mo2181g(view)) {
            StringBuilder sb = new StringBuilder();
            sb.append("View ");
            sb.append(view);
            sb.append(" is not a sliding drawer");
            throw new IllegalArgumentException(sb.toString());
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f1501q) {
            layoutParams.f1513b = 1.0f;
            layoutParams.f1515d = 1;
            m2333c(view, true);
        } else if (z) {
            layoutParams.f1515d |= 2;
            if (mo2158a(view, 3)) {
                this.f1495k.mo2551a(view, 0, view.getTop());
            } else {
                this.f1496l.mo2551a(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            mo2170c(view, 1.0f);
            mo2151a(layoutParams.f1512a, 0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    /* renamed from: e */
    public void mo2178e(int i) {
        mo2152a(i, true);
    }

    /* renamed from: a */
    public void mo2152a(int i, boolean z) {
        View c = mo2168c(i);
        if (c == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No drawer view found with gravity ");
            sb.append(m2334d(i));
            throw new IllegalArgumentException(sb.toString());
        }
        mo2155a(c, z);
    }

    /* renamed from: i */
    public void mo2188i(View view) {
        mo2166b(view, true);
    }

    /* renamed from: b */
    public void mo2166b(View view, boolean z) {
        if (!mo2181g(view)) {
            StringBuilder sb = new StringBuilder();
            sb.append("View ");
            sb.append(view);
            sb.append(" is not a sliding drawer");
            throw new IllegalArgumentException(sb.toString());
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f1501q) {
            layoutParams.f1513b = 0.0f;
            layoutParams.f1515d = 0;
        } else if (z) {
            layoutParams.f1515d |= 4;
            if (mo2158a(view, 3)) {
                this.f1495k.mo2551a(view, -view.getWidth(), view.getTop());
            } else {
                this.f1496l.mo2551a(view, getWidth(), view.getTop());
            }
        } else {
            mo2170c(view, 0.0f);
            mo2151a(layoutParams.f1512a, 0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    /* renamed from: j */
    public boolean mo2189j(View view) {
        if (mo2181g(view)) {
            return (((LayoutParams) view.getLayoutParams()).f1515d & 1) == 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public boolean mo2179f(int i) {
        View c = mo2168c(i);
        if (c != null) {
            return mo2189j(c);
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo2190k(View view) {
        if (mo2181g(view)) {
            return ((LayoutParams) view.getLayoutParams()).f1513b > 0.0f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: h */
    private boolean m2338h() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).f1514c) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!mo2181g(childAt)) {
                    this.f1486M.add(childAt);
                } else if (mo2189j(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f1486M.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = (View) this.f1486M.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f1486M.clear();
        }
    }

    /* renamed from: i */
    private boolean m2339i() {
        return mo2167c() != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public View mo2167c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo2181g(childAt) && mo2190k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2174d() {
        if (!this.f1507w) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f1507w = true;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m2339i()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View c = mo2167c();
        if (c != null && mo2148a(c) == 0) {
            mo2162b();
        }
        return c != null;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo1845a());
        if (savedState.f1516a != 0) {
            View c = mo2168c(savedState.f1516a);
            if (c != null) {
                mo2187h(c);
            }
        }
        if (savedState.f1517c != 3) {
            mo2150a(savedState.f1517c, 3);
        }
        if (savedState.f1518d != 3) {
            mo2150a(savedState.f1518d, 5);
        }
        if (savedState.f1519e != 3) {
            mo2150a(savedState.f1519e, 8388611);
        }
        if (savedState.f1520f != 3) {
            mo2150a(savedState.f1520f, 8388613);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            boolean z = true;
            boolean z2 = layoutParams.f1515d == 1;
            if (layoutParams.f1515d != 2) {
                z = false;
            }
            if (z2 || z) {
                savedState.f1516a = layoutParams.f1512a;
            } else {
                i++;
            }
        }
        savedState.f1517c = this.f1502r;
        savedState.f1518d = this.f1503s;
        savedState.f1519e = this.f1504t;
        savedState.f1520f = this.f1505u;
        return savedState;
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (mo2149a() != null || mo2181g(view)) {
            C0595r.m2247b(view, 4);
        } else {
            C0595r.m2247b(view, 1);
        }
        if (!f1471b) {
            C0595r.m2240a(view, (C0561a) this.f1489e);
        }
    }

    /* renamed from: l */
    static boolean m2340l(View view) {
        return (C0595r.m2254e(view) == 4 || C0595r.m2254e(view) == 2) ? false : true;
    }
}
