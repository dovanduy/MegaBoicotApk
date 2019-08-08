package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.p013b.C0126a.C0127a;
import android.support.p013b.C0126a.C0128b;
import android.support.p013b.C0126a.C0129c;
import android.support.p017v4.content.C0356c;
import android.support.p017v4.graphics.drawable.C0407a;
import android.support.p017v4.p023d.C0391i;
import android.support.p017v4.p023d.C0393k.C0394a;
import android.support.p017v4.p023d.C0393k.C0396c;
import android.support.p017v4.view.AbsSavedState;
import android.support.p017v4.view.C0579c;
import android.support.p017v4.view.C0590m;
import android.support.p017v4.view.C0591n;
import android.support.p017v4.view.C0592o;
import android.support.p017v4.view.C0595r;
import android.support.p017v4.view.C0609z;
import android.support.p017v4.widget.C0653h;
import android.support.p017v4.widget.C0671t;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements C0590m {

    /* renamed from: a */
    static final String f251a;

    /* renamed from: b */
    static final Class<?>[] f252b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    static final ThreadLocal<Map<String, Constructor<Behavior>>> f253c = new ThreadLocal<>();

    /* renamed from: d */
    static final Comparator<View> f254d;

    /* renamed from: f */
    private static final C0394a<Rect> f255f = new C0396c(12);

    /* renamed from: e */
    OnHierarchyChangeListener f256e;

    /* renamed from: g */
    private final List<View> f257g;

    /* renamed from: h */
    private final C0653h<View> f258h;

    /* renamed from: i */
    private final List<View> f259i;

    /* renamed from: j */
    private final List<View> f260j;

    /* renamed from: k */
    private final int[] f261k;

    /* renamed from: l */
    private Paint f262l;

    /* renamed from: m */
    private boolean f263m;

    /* renamed from: n */
    private boolean f264n;

    /* renamed from: o */
    private int[] f265o;

    /* renamed from: p */
    private View f266p;

    /* renamed from: q */
    private View f267q;

    /* renamed from: r */
    private C0190e f268r;

    /* renamed from: s */
    private boolean f269s;

    /* renamed from: t */
    private C0609z f270t;

    /* renamed from: u */
    private boolean f271u;

    /* renamed from: v */
    private Drawable f272v;

    /* renamed from: w */
    private C0592o f273w;

    /* renamed from: x */
    private final C0591n f274x;

    public static abstract class Behavior<V extends View> {
        /* renamed from: a */
        public int mo428a(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: a */
        public C0609z mo429a(CoordinatorLayout coordinatorLayout, V v, C0609z zVar) {
            return zVar;
        }

        /* renamed from: a */
        public void mo430a() {
        }

        /* renamed from: a */
        public void mo431a(C0189d dVar) {
        }

        /* renamed from: a */
        public void mo432a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        @Deprecated
        /* renamed from: a */
        public void mo434a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: a */
        public void mo436a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: a */
        public boolean mo438a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo439a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: a */
        public boolean mo440a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: a */
        public boolean mo441a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: a */
        public boolean mo442a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo443a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo444a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo445a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        @Deprecated
        /* renamed from: a */
        public boolean mo446a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        /* renamed from: b */
        public float mo448b(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        @Deprecated
        /* renamed from: b */
        public void mo449b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: b */
        public boolean mo451b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo452b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: c */
        public void mo453c(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        @Deprecated
        /* renamed from: d */
        public void mo456d(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: c */
        public boolean mo454c(CoordinatorLayout coordinatorLayout, V v) {
            return mo448b(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: a */
        public boolean mo447a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo446a(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        /* renamed from: b */
        public void mo450b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                mo449b(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: a */
        public void mo433a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo456d(coordinatorLayout, v, view);
            }
        }

        /* renamed from: a */
        public void mo435a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo434a(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: a */
        public void mo437a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo436a(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        /* renamed from: d */
        public Parcelable mo455d(CoordinatorLayout coordinatorLayout, V v) {
            return BaseSavedState.EMPTY_STATE;
        }
    }

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
        SparseArray<Parcelable> f276a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f276a = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f276a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            int size = this.f276a != null ? this.f276a.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f276a.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f276a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$a */
    public interface C0186a {
        /* renamed from: a */
        Behavior mo464a();
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: android.support.design.widget.CoordinatorLayout$b */
    public @interface C0187b {
        /* renamed from: a */
        Class<? extends Behavior> mo465a();
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$c */
    private class C0188c implements OnHierarchyChangeListener {
        C0188c() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (CoordinatorLayout.this.f256e != null) {
                CoordinatorLayout.this.f256e.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo373a(2);
            if (CoordinatorLayout.this.f256e != null) {
                CoordinatorLayout.this.f256e.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$d */
    public static class C0189d extends MarginLayoutParams {

        /* renamed from: a */
        Behavior f278a;

        /* renamed from: b */
        boolean f279b = false;

        /* renamed from: c */
        public int f280c = 0;

        /* renamed from: d */
        public int f281d = 0;

        /* renamed from: e */
        public int f282e = -1;

        /* renamed from: f */
        int f283f = -1;

        /* renamed from: g */
        public int f284g = 0;

        /* renamed from: h */
        public int f285h = 0;

        /* renamed from: i */
        int f286i;

        /* renamed from: j */
        int f287j;

        /* renamed from: k */
        View f288k;

        /* renamed from: l */
        View f289l;

        /* renamed from: m */
        final Rect f290m = new Rect();

        /* renamed from: n */
        Object f291n;

        /* renamed from: o */
        private boolean f292o;

        /* renamed from: p */
        private boolean f293p;

        /* renamed from: q */
        private boolean f294q;

        /* renamed from: r */
        private boolean f295r;

        public C0189d(int i, int i2) {
            super(i, i2);
        }

        C0189d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0129c.CoordinatorLayout_Layout);
            this.f280c = obtainStyledAttributes.getInteger(C0129c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f283f = obtainStyledAttributes.getResourceId(C0129c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f281d = obtainStyledAttributes.getInteger(C0129c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f282e = obtainStyledAttributes.getInteger(C0129c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f284g = obtainStyledAttributes.getInt(C0129c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f285h = obtainStyledAttributes.getInt(C0129c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.f279b = obtainStyledAttributes.hasValue(C0129c.CoordinatorLayout_Layout_layout_behavior);
            if (this.f279b) {
                this.f278a = CoordinatorLayout.m353a(context, attributeSet, obtainStyledAttributes.getString(C0129c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            if (this.f278a != null) {
                this.f278a.mo431a(this);
            }
        }

        public C0189d(C0189d dVar) {
            super(dVar);
        }

        public C0189d(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0189d(LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public Behavior mo468a() {
            return this.f278a;
        }

        /* renamed from: a */
        public void mo472a(Behavior behavior) {
            if (this.f278a != behavior) {
                if (this.f278a != null) {
                    this.f278a.mo430a();
                }
                this.f278a = behavior;
                this.f291n = null;
                this.f279b = true;
                if (behavior != null) {
                    behavior.mo431a(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo471a(Rect rect) {
            this.f290m.set(rect);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Rect mo476b() {
            return this.f290m;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo479c() {
            return this.f288k == null && this.f283f != -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo480d() {
            if (this.f278a == null) {
                this.f292o = false;
            }
            return this.f292o;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo474a(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f292o) {
                return true;
            }
            boolean c = (this.f278a != null ? this.f278a.mo454c(coordinatorLayout, view) : false) | this.f292o;
            this.f292o = c;
            return c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo481e() {
            this.f292o = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo469a(int i) {
            mo470a(i, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo470a(int i, boolean z) {
            switch (i) {
                case 0:
                    this.f293p = z;
                    return;
                case 1:
                    this.f294q = z;
                    return;
                default:
                    return;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo478b(int i) {
            switch (i) {
                case 0:
                    return this.f293p;
                case 1:
                    return this.f294q;
                default:
                    return false;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo482f() {
            return this.f295r;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo473a(boolean z) {
            this.f295r = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo483g() {
            this.f295r = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo475a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 == this.f289l || m433a(view2, C0595r.m2256f(coordinatorLayout)) || (this.f278a != null && this.f278a.mo443a(coordinatorLayout, view, view2));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public View mo477b(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f283f == -1) {
                this.f289l = null;
                this.f288k = null;
                return null;
            }
            if (this.f288k == null || !m434b(view, coordinatorLayout)) {
                m432a(view, coordinatorLayout);
            }
            return this.f288k;
        }

        /* renamed from: a */
        private void m432a(View view, CoordinatorLayout coordinatorLayout) {
            this.f288k = coordinatorLayout.findViewById(this.f283f);
            if (this.f288k != null) {
                if (this.f288k != coordinatorLayout) {
                    View view2 = this.f288k;
                    ViewParent parent = this.f288k.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f289l = null;
                            this.f288k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f289l = view2;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f289l = null;
                    this.f288k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f289l = null;
                this.f288k = null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find CoordinatorLayout descendant view with id ");
                sb.append(coordinatorLayout.getResources().getResourceName(this.f283f));
                sb.append(" to anchor view ");
                sb.append(view);
                throw new IllegalStateException(sb.toString());
            }
        }

        /* renamed from: b */
        private boolean m434b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f288k.getId() != this.f283f) {
                return false;
            }
            View view2 = this.f288k;
            for (ViewParent parent = this.f288k.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f289l = null;
                    this.f288k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f289l = view2;
            return true;
        }

        /* renamed from: a */
        private boolean m433a(View view, int i) {
            int a = C0579c.m2179a(((C0189d) view.getLayoutParams()).f284g, i);
            return a != 0 && (C0579c.m2179a(this.f285h, i) & a) == a;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$e */
    class C0190e implements OnPreDrawListener {
        C0190e() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo373a(0);
            return true;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$f */
    static class C0191f implements Comparator<View> {
        C0191f() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float x = C0595r.m2275x(view);
            float x2 = C0595r.m2275x(view2);
            if (x > x2) {
                return -1;
            }
            return x < x2 ? 1 : 0;
        }
    }

    /* renamed from: a */
    private static int m352a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: c */
    private static int m366c(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static int m367d(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: e */
    private static int m369e(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        f251a = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            f254d = new C0191f();
        } else {
            f254d = null;
        }
    }

    /* renamed from: e */
    private static Rect m370e() {
        Rect rect = (Rect) f255f.mo1391a();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: a */
    private static void m354a(Rect rect) {
        rect.setEmpty();
        f255f.mo1392a(rect);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0127a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArray;
        super(context, attributeSet, i);
        this.f257g = new ArrayList();
        this.f258h = new C0653h<>();
        this.f259i = new ArrayList();
        this.f260j = new ArrayList();
        this.f261k = new int[2];
        this.f274x = new C0591n(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C0129c.CoordinatorLayout, 0, C0128b.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C0129c.CoordinatorLayout, i, 0);
        }
        int resourceId = typedArray.getResourceId(C0129c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f265o = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f265o.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f265o[i2] = (int) (((float) this.f265o[i2]) * f);
            }
        }
        this.f272v = typedArray.getDrawable(C0129c.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        m374g();
        super.setOnHierarchyChangeListener(new C0188c());
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f256e = onHierarchyChangeListener;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m361a(false);
        if (this.f269s) {
            if (this.f268r == null) {
                this.f268r = new C0190e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f268r);
        }
        if (this.f270t == null && C0595r.m2268q(this)) {
            C0595r.m2267p(this);
        }
        this.f264n = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m361a(false);
        if (this.f269s && this.f268r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f268r);
        }
        if (this.f267q != null) {
            onStopNestedScroll(this.f267q);
        }
        this.f264n = false;
    }

    public void setStatusBarBackground(Drawable drawable) {
        if (this.f272v != drawable) {
            Drawable drawable2 = null;
            if (this.f272v != null) {
                this.f272v.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.f272v = drawable2;
            if (this.f272v != null) {
                if (this.f272v.isStateful()) {
                    this.f272v.setState(getDrawableState());
                }
                C0407a.m1546b(this.f272v, C0595r.m2256f(this));
                this.f272v.setVisible(getVisibility() == 0, false);
                this.f272v.setCallback(this);
            }
            C0595r.m2252d(this);
        }
    }

    public Drawable getStatusBarBackground() {
        return this.f272v;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f272v;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f272v;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f272v != null && this.f272v.isVisible() != z) {
            this.f272v.setVisible(z, false);
        }
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0356c.m1312a(getContext(), i) : null);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0609z mo371a(C0609z zVar) {
        if (C0391i.m1460a(this.f270t, zVar)) {
            return zVar;
        }
        this.f270t = zVar;
        boolean z = false;
        this.f271u = zVar != null && zVar.mo2137b() > 0;
        if (!this.f271u && getBackground() == null) {
            z = true;
        }
        setWillNotDraw(z);
        C0609z b = m364b(zVar);
        requestLayout();
        return b;
    }

    public final C0609z getLastWindowInsets() {
        return this.f270t;
    }

    /* renamed from: a */
    private void m361a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior a = ((C0189d) childAt.getLayoutParams()).mo468a();
            if (a != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    a.mo442a(this, childAt, obtain);
                } else {
                    a.mo451b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0189d) getChildAt(i2).getLayoutParams()).mo481e();
        }
        this.f266p = null;
        this.f263m = false;
    }

    /* renamed from: a */
    private void m360a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i = childCount - 1;
        while (i >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
            i--;
        }
        if (f254d != null) {
            Collections.sort(list, f254d);
        }
    }

    /* renamed from: a */
    private boolean m362a(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f259i;
        m360a(list);
        int size = list.size();
        boolean z = false;
        boolean z2 = false;
        MotionEvent motionEvent3 = null;
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) list.get(i2);
            C0189d dVar = (C0189d) view.getLayoutParams();
            Behavior a = dVar.mo468a();
            if ((z || z2) && actionMasked != 0) {
                if (a != null) {
                    if (motionEvent3 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    switch (i) {
                        case 0:
                            a.mo442a(this, view, motionEvent3);
                            break;
                        case 1:
                            a.mo451b(this, view, motionEvent3);
                            break;
                    }
                }
            } else {
                if (!z && a != null) {
                    switch (i) {
                        case 0:
                            z = a.mo442a(this, view, motionEvent2);
                            break;
                        case 1:
                            z = a.mo451b(this, view, motionEvent2);
                            break;
                    }
                    if (z) {
                        this.f266p = view;
                    }
                }
                boolean d = dVar.mo480d();
                boolean a2 = dVar.mo474a(this, view);
                z2 = a2 && !d;
                if (a2 && !z2) {
                    list.clear();
                    return z;
                }
            }
        }
        list.clear();
        return z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m361a(true);
        }
        boolean a = m362a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m361a(true);
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f266p
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0017
            boolean r3 = r0.m362a(r1, r4)
            if (r3 == 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            r6 = r5
            goto L_0x002c
        L_0x0017:
            r3 = r5
        L_0x0018:
            android.view.View r6 = r0.f266p
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.design.widget.CoordinatorLayout$d r6 = (android.support.design.widget.CoordinatorLayout.C0189d) r6
            android.support.design.widget.CoordinatorLayout$Behavior r6 = r6.mo468a()
            if (r6 == 0) goto L_0x0015
            android.view.View r7 = r0.f266p
            boolean r6 = r6.mo451b(r0, r7, r1)
        L_0x002c:
            android.view.View r7 = r0.f266p
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m361a(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f263m) {
            m361a(false);
            this.f263m = true;
        }
    }

    /* renamed from: b */
    private int m363b(int i) {
        if (this.f265o == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
            Log.e("CoordinatorLayout", sb.toString());
            return 0;
        } else if (i >= 0 && i < this.f265o.length) {
            return this.f265o[i];
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Keyline index ");
            sb2.append(i);
            sb2.append(" out of range for ");
            sb2.append(this);
            Log.e("CoordinatorLayout", sb2.toString());
            return 0;
        }
    }

    /* renamed from: a */
    static Behavior m353a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f251a)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f251a);
            sb2.append('.');
            sb2.append(str);
            str = sb2.toString();
        }
        try {
            Map map = (Map) f253c.get();
            if (map == null) {
                map = new HashMap();
                f253c.set(map);
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f252b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not inflate Behavior subclass ");
            sb3.append(str);
            throw new RuntimeException(sb3.toString(), e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0189d mo369a(View view) {
        C0189d dVar = (C0189d) view.getLayoutParams();
        if (!dVar.f279b) {
            if (view instanceof C0186a) {
                Behavior a = ((C0186a) view).mo464a();
                if (a == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                dVar.mo472a(a);
                dVar.f279b = true;
            } else {
                C0187b bVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    bVar = (C0187b) cls.getAnnotation(C0187b.class);
                    if (bVar != null) {
                        break;
                    }
                }
                if (bVar != null) {
                    try {
                        dVar.mo472a((Behavior) bVar.mo465a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Default behavior class ");
                        sb.append(bVar.mo465a().getName());
                        sb.append(" could not be instantiated. Did you forget");
                        sb.append(" a default constructor?");
                        Log.e("CoordinatorLayout", sb.toString(), e);
                    }
                }
                dVar.f279b = true;
            }
        }
        return dVar;
    }

    /* renamed from: f */
    private void m372f() {
        this.f257g.clear();
        this.f258h.mo2524a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0189d a = mo369a(childAt);
            a.mo477b(this, childAt);
            this.f258h.mo2525a(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (a.mo475a(this, childAt, childAt2)) {
                        if (!this.f258h.mo2528b(childAt2)) {
                            this.f258h.mo2525a(childAt2);
                        }
                        this.f258h.mo2526a(childAt2, childAt);
                    }
                }
            }
        }
        this.f257g.addAll(this.f258h.mo2527b());
        Collections.reverse(this.f257g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo379a(View view, Rect rect) {
        C0671t.m2682b(this, view, rect);
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* renamed from: a */
    public void mo375a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0120, code lost:
        if (r0.mo439a(r7, r3, r23, r20, r25, 0) == false) goto L_0x0134;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r32, int r33) {
        /*
            r31 = this;
            r7 = r31
            r31.m372f()
            r31.mo372a()
            int r8 = r31.getPaddingLeft()
            int r0 = r31.getPaddingTop()
            int r9 = r31.getPaddingRight()
            int r1 = r31.getPaddingBottom()
            int r10 = android.support.p017v4.view.C0595r.m2256f(r31)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = r2
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r32)
            int r14 = android.view.View.MeasureSpec.getSize(r32)
            int r15 = android.view.View.MeasureSpec.getMode(r33)
            int r16 = android.view.View.MeasureSpec.getSize(r33)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r31.getSuggestedMinimumWidth()
            int r1 = r31.getSuggestedMinimumHeight()
            android.support.v4.view.z r3 = r7.f270t
            if (r3 == 0) goto L_0x004b
            boolean r3 = android.support.p017v4.view.C0595r.m2268q(r31)
            if (r3 == 0) goto L_0x004b
            r19 = r2
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f257g
            int r6 = r2.size()
            r4 = r0
            r2 = r1
            r3 = 0
            r5 = 0
        L_0x0057:
            if (r5 >= r6) goto L_0x0178
            java.util.List<android.view.View> r0 = r7.f257g
            java.lang.Object r0 = r0.get(r5)
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            int r0 = r1.getVisibility()
            r11 = 8
            if (r0 != r11) goto L_0x0072
            r22 = r5
            r24 = r6
            r21 = 0
            goto L_0x0172
        L_0x0072:
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            android.support.design.widget.CoordinatorLayout$d r11 = (android.support.design.widget.CoordinatorLayout.C0189d) r11
            int r0 = r11.f282e
            if (r0 < 0) goto L_0x00bd
            if (r13 == 0) goto L_0x00bd
            int r0 = r11.f282e
            int r0 = r7.m363b(r0)
            r21 = r2
            int r2 = r11.f280c
            int r2 = m367d(r2)
            int r2 = android.support.p017v4.view.C0579c.m2179a(r2, r10)
            r2 = r2 & 7
            r22 = r3
            r3 = 3
            if (r2 != r3) goto L_0x009a
            if (r12 == 0) goto L_0x009f
        L_0x009a:
            r3 = 5
            if (r2 != r3) goto L_0x00ab
            if (r12 == 0) goto L_0x00ab
        L_0x009f:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r3 = r0
            r20 = r2
            goto L_0x00c4
        L_0x00ab:
            if (r2 != r3) goto L_0x00af
            if (r12 == 0) goto L_0x00b4
        L_0x00af:
            r3 = 3
            if (r2 != r3) goto L_0x00c1
            if (r12 == 0) goto L_0x00c1
        L_0x00b4:
            int r0 = r0 - r8
            r3 = 0
            int r0 = java.lang.Math.max(r3, r0)
            r20 = r0
            goto L_0x00c4
        L_0x00bd:
            r21 = r2
            r22 = r3
        L_0x00c1:
            r3 = 0
            r20 = r3
        L_0x00c4:
            if (r19 == 0) goto L_0x00f7
            boolean r0 = android.support.p017v4.view.C0595r.m2268q(r1)
            if (r0 != 0) goto L_0x00f7
            android.support.v4.view.z r0 = r7.f270t
            int r0 = r0.mo2135a()
            android.support.v4.view.z r2 = r7.f270t
            int r2 = r2.mo2138c()
            int r0 = r0 + r2
            android.support.v4.view.z r2 = r7.f270t
            int r2 = r2.mo2137b()
            android.support.v4.view.z r3 = r7.f270t
            int r3 = r3.mo2139d()
            int r2 = r2 + r3
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r23 = r0
            r25 = r2
            goto L_0x00fb
        L_0x00f7:
            r23 = r32
            r25 = r33
        L_0x00fb:
            android.support.design.widget.CoordinatorLayout$Behavior r0 = r11.mo468a()
            if (r0 == 0) goto L_0x0126
            r26 = 0
            r3 = r1
            r1 = r7
            r27 = r21
            r2 = r3
            r28 = r3
            r29 = r22
            r21 = 0
            r3 = r23
            r30 = r4
            r4 = r20
            r22 = r5
            r5 = r25
            r24 = r6
            r6 = r26
            boolean r0 = r0.mo439a(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0123
            goto L_0x0134
        L_0x0123:
            r0 = r28
            goto L_0x0142
        L_0x0126:
            r28 = r1
            r30 = r4
            r24 = r6
            r27 = r21
            r29 = r22
            r21 = 0
            r22 = r5
        L_0x0134:
            r5 = 0
            r0 = r7
            r1 = r28
            r2 = r23
            r3 = r20
            r4 = r25
            r0.mo375a(r1, r2, r3, r4, r5)
            goto L_0x0123
        L_0x0142:
            int r1 = r0.getMeasuredWidth()
            int r1 = r17 + r1
            int r2 = r11.leftMargin
            int r1 = r1 + r2
            int r2 = r11.rightMargin
            int r1 = r1 + r2
            r2 = r30
            int r1 = java.lang.Math.max(r2, r1)
            int r2 = r0.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r11.topMargin
            int r2 = r2 + r3
            int r3 = r11.bottomMargin
            int r2 = r2 + r3
            r3 = r27
            int r2 = java.lang.Math.max(r3, r2)
            int r0 = r0.getMeasuredState()
            r11 = r29
            int r0 = android.view.View.combineMeasuredStates(r11, r0)
            r3 = r0
            r4 = r1
        L_0x0172:
            int r5 = r22 + 1
            r6 = r24
            goto L_0x0057
        L_0x0178:
            r11 = r3
            r3 = r2
            r2 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r1 = r32
            int r0 = android.view.View.resolveSizeAndState(r2, r1, r0)
            int r1 = r11 << 16
            r2 = r33
            int r1 = android.view.View.resolveSizeAndState(r3, r2, r1)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* renamed from: b */
    private C0609z m364b(C0609z zVar) {
        if (zVar.mo2140e()) {
            return zVar;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C0595r.m2268q(childAt)) {
                Behavior a = ((C0189d) childAt.getLayoutParams()).mo468a();
                if (a != null) {
                    zVar = a.mo429a(this, childAt, zVar);
                    if (zVar.mo2140e()) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return zVar;
    }

    /* renamed from: a */
    public void mo374a(View view, int i) {
        C0189d dVar = (C0189d) view.getLayoutParams();
        if (dVar.mo479c()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (dVar.f288k != null) {
            m359a(view, dVar.f288k, i);
        } else if (dVar.f282e >= 0) {
            m356a(view, dVar.f282e, i);
        } else {
            m368d(view, i);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int f = C0595r.m2256f(this);
        int size = this.f257g.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f257g.get(i5);
            if (view.getVisibility() != 8) {
                Behavior a = ((C0189d) view.getLayoutParams()).mo468a();
                if (a == null || !a.mo438a(this, view, f)) {
                    mo374a(view, f);
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f271u && this.f272v != null) {
            int b = this.f270t != null ? this.f270t.mo2137b() : 0;
            if (b > 0) {
                this.f272v.setBounds(0, 0, getWidth(), b);
                this.f272v.draw(canvas);
            }
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m374g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo384b(View view, Rect rect) {
        ((C0189d) view.getLayoutParams()).mo471a(rect);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo388c(View view, Rect rect) {
        rect.set(((C0189d) view.getLayoutParams()).mo476b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo380a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
            return;
        }
        if (z) {
            mo379a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a */
    private void m357a(View view, int i, Rect rect, Rect rect2, C0189d dVar, int i2, int i3) {
        int i4;
        int i5;
        int a = C0579c.m2179a(m369e(dVar.f280c), i);
        int a2 = C0579c.m2179a(m366c(dVar.f281d), i);
        int i6 = a & 7;
        int i7 = a & 112;
        int i8 = a2 & 7;
        int i9 = a2 & 112;
        if (i8 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i6 == 1) {
            i4 -= i2 / 2;
        } else if (i6 != 5) {
            i4 -= i2;
        }
        if (i7 == 16) {
            i5 -= i3 / 2;
        } else if (i7 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    /* renamed from: a */
    private void m355a(C0189d dVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + dVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - dVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - dVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo378a(View view, int i, Rect rect, Rect rect2) {
        C0189d dVar = (C0189d) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m357a(view, i, rect, rect2, dVar, measuredWidth, measuredHeight);
        m355a(dVar, rect2, measuredWidth, measuredHeight);
    }

    /* renamed from: a */
    private void m359a(View view, View view2, int i) {
        Rect e = m370e();
        Rect e2 = m370e();
        try {
            mo379a(view2, e);
            mo378a(view, i, e, e2);
            view.layout(e2.left, e2.top, e2.right, e2.bottom);
        } finally {
            m354a(e);
            m354a(e2);
        }
    }

    /* renamed from: a */
    private void m356a(View view, int i, int i2) {
        C0189d dVar = (C0189d) view.getLayoutParams();
        int a = C0579c.m2179a(m367d(dVar.f280c), i2);
        int i3 = a & 7;
        int i4 = a & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int b = m363b(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            b += measuredWidth / 2;
        } else if (i3 == 5) {
            b += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = 0 + measuredHeight;
        }
        int max = Math.max(getPaddingLeft() + dVar.leftMargin, Math.min(b, ((width - getPaddingRight()) - measuredWidth) - dVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + dVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - dVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: d */
    private void m368d(View view, int i) {
        C0189d dVar = (C0189d) view.getLayoutParams();
        Rect e = m370e();
        e.set(getPaddingLeft() + dVar.leftMargin, getPaddingTop() + dVar.topMargin, (getWidth() - getPaddingRight()) - dVar.rightMargin, (getHeight() - getPaddingBottom()) - dVar.bottomMargin);
        if (this.f270t != null && C0595r.m2268q(this) && !C0595r.m2268q(view)) {
            e.left += this.f270t.mo2135a();
            e.top += this.f270t.mo2137b();
            e.right -= this.f270t.mo2138c();
            e.bottom -= this.f270t.mo2139d();
        }
        Rect e2 = m370e();
        C0579c.m2180a(m366c(dVar.f280c), view.getMeasuredWidth(), view.getMeasuredHeight(), e, e2, i);
        view.layout(e2.left, e2.top, e2.right, e2.bottom);
        m354a(e);
        m354a(e2);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0189d dVar = (C0189d) view.getLayoutParams();
        if (dVar.f278a != null) {
            float b = dVar.f278a.mo448b(this, view);
            if (b > 0.0f) {
                if (this.f262l == null) {
                    this.f262l = new Paint();
                }
                this.f262l.setColor(dVar.f278a.mo428a(this, view));
                this.f262l.setAlpha(m352a(Math.round(255.0f * b), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f262l);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo373a(int i) {
        boolean z;
        int i2 = i;
        int f = C0595r.m2256f(this);
        int size = this.f257g.size();
        Rect e = m370e();
        Rect e2 = m370e();
        Rect e3 = m370e();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) this.f257g.get(i3);
            C0189d dVar = (C0189d) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (dVar.f289l == ((View) this.f257g.get(i4))) {
                        mo383b(view, f);
                    }
                }
                mo380a(view, true, e2);
                if (dVar.f284g != 0 && !e2.isEmpty()) {
                    int a = C0579c.m2179a(dVar.f284g, f);
                    int i5 = a & 112;
                    if (i5 == 48) {
                        e.top = Math.max(e.top, e2.bottom);
                    } else if (i5 == 80) {
                        e.bottom = Math.max(e.bottom, getHeight() - e2.top);
                    }
                    int i6 = a & 7;
                    if (i6 == 3) {
                        e.left = Math.max(e.left, e2.right);
                    } else if (i6 == 5) {
                        e.right = Math.max(e.right, getWidth() - e2.left);
                    }
                }
                if (dVar.f285h != 0 && view.getVisibility() == 0) {
                    m358a(view, e, f);
                }
                if (i2 != 2) {
                    mo388c(view, e3);
                    if (!e3.equals(e2)) {
                        mo384b(view, e2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = (View) this.f257g.get(i7);
                    C0189d dVar2 = (C0189d) view2.getLayoutParams();
                    Behavior a2 = dVar2.mo468a();
                    if (a2 != null && a2.mo443a(this, view2, view)) {
                        if (i2 != 0 || !dVar2.mo482f()) {
                            if (i2 != 2) {
                                z = a2.mo452b(this, view2, view);
                            } else {
                                a2.mo453c(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                dVar2.mo473a(z);
                            }
                        } else {
                            dVar2.mo483g();
                        }
                    }
                }
            }
        }
        m354a(e);
        m354a(e2);
        m354a(e3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m358a(android.view.View r9, android.graphics.Rect r10, int r11) {
        /*
            r8 = this;
            boolean r0 = android.support.p017v4.view.C0595r.m2274w(r9)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = r9.getWidth()
            if (r0 <= 0) goto L_0x0104
            int r0 = r9.getHeight()
            if (r0 > 0) goto L_0x0015
            goto L_0x0104
        L_0x0015:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            android.support.design.widget.CoordinatorLayout$d r0 = (android.support.design.widget.CoordinatorLayout.C0189d) r0
            android.support.design.widget.CoordinatorLayout$Behavior r1 = r0.mo468a()
            android.graphics.Rect r2 = m370e()
            android.graphics.Rect r3 = m370e()
            int r4 = r9.getLeft()
            int r5 = r9.getTop()
            int r6 = r9.getRight()
            int r7 = r9.getBottom()
            r3.set(r4, r5, r6, r7)
            if (r1 == 0) goto L_0x006f
            boolean r1 = r1.mo440a(r8, r9, r2)
            if (r1 == 0) goto L_0x006f
            boolean r1 = r3.contains(r2)
            if (r1 != 0) goto L_0x0072
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Rect should be within the child's bounds. Rect:"
            r10.append(r11)
            java.lang.String r11 = r2.toShortString()
            r10.append(r11)
            java.lang.String r11 = " | Bounds:"
            r10.append(r11)
            java.lang.String r11 = r3.toShortString()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x006f:
            r2.set(r3)
        L_0x0072:
            m354a(r3)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x007f
            m354a(r2)
            return
        L_0x007f:
            int r1 = r0.f285h
            int r11 = android.support.p017v4.view.C0579c.m2179a(r1, r11)
            r1 = r11 & 48
            r3 = 48
            r4 = 1
            r5 = 0
            if (r1 != r3) goto L_0x00a1
            int r1 = r2.top
            int r3 = r0.topMargin
            int r1 = r1 - r3
            int r3 = r0.f287j
            int r1 = r1 - r3
            int r3 = r10.top
            if (r1 >= r3) goto L_0x00a1
            int r3 = r10.top
            int r3 = r3 - r1
            r8.m373f(r9, r3)
            r1 = r4
            goto L_0x00a2
        L_0x00a1:
            r1 = r5
        L_0x00a2:
            r3 = r11 & 80
            r6 = 80
            if (r3 != r6) goto L_0x00c0
            int r3 = r8.getHeight()
            int r6 = r2.bottom
            int r3 = r3 - r6
            int r6 = r0.bottomMargin
            int r3 = r3 - r6
            int r6 = r0.f287j
            int r3 = r3 + r6
            int r6 = r10.bottom
            if (r3 >= r6) goto L_0x00c0
            int r1 = r10.bottom
            int r3 = r3 - r1
            r8.m373f(r9, r3)
            r1 = r4
        L_0x00c0:
            if (r1 != 0) goto L_0x00c5
            r8.m373f(r9, r5)
        L_0x00c5:
            r1 = r11 & 3
            r3 = 3
            if (r1 != r3) goto L_0x00de
            int r1 = r2.left
            int r3 = r0.leftMargin
            int r1 = r1 - r3
            int r3 = r0.f286i
            int r1 = r1 - r3
            int r3 = r10.left
            if (r1 >= r3) goto L_0x00de
            int r3 = r10.left
            int r3 = r3 - r1
            r8.m371e(r9, r3)
            r1 = r4
            goto L_0x00df
        L_0x00de:
            r1 = r5
        L_0x00df:
            r3 = 5
            r11 = r11 & r3
            if (r11 != r3) goto L_0x00fb
            int r11 = r8.getWidth()
            int r3 = r2.right
            int r11 = r11 - r3
            int r3 = r0.rightMargin
            int r11 = r11 - r3
            int r0 = r0.f286i
            int r11 = r11 + r0
            int r0 = r10.right
            if (r11 >= r0) goto L_0x00fb
            int r10 = r10.right
            int r11 = r11 - r10
            r8.m371e(r9, r11)
            r1 = r4
        L_0x00fb:
            if (r1 != 0) goto L_0x0100
            r8.m371e(r9, r5)
        L_0x0100:
            m354a(r2)
            return
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.m358a(android.view.View, android.graphics.Rect, int):void");
    }

    /* renamed from: e */
    private void m371e(View view, int i) {
        C0189d dVar = (C0189d) view.getLayoutParams();
        if (dVar.f286i != i) {
            C0595r.m2253d(view, i - dVar.f286i);
            dVar.f286i = i;
        }
    }

    /* renamed from: f */
    private void m373f(View view, int i) {
        C0189d dVar = (C0189d) view.getLayoutParams();
        if (dVar.f287j != i) {
            C0595r.m2250c(view, i - dVar.f287j);
            dVar.f287j = i;
        }
    }

    /* access modifiers changed from: 0000 */
    public final List<View> getDependencySortedChildren() {
        m372f();
        return Collections.unmodifiableList(this.f257g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo372a() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m365b(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f269s) {
            return;
        }
        if (z) {
            mo382b();
        } else {
            mo386c();
        }
    }

    /* renamed from: b */
    private boolean m365b(View view) {
        return this.f258h.mo2529c(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo382b() {
        if (this.f264n) {
            if (this.f268r == null) {
                this.f268r = new C0190e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f268r);
        }
        this.f269s = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo386c() {
        if (this.f264n && this.f268r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f268r);
        }
        this.f269s = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo383b(View view, int i) {
        View view2 = view;
        C0189d dVar = (C0189d) view.getLayoutParams();
        if (dVar.f288k != null) {
            Rect e = m370e();
            Rect e2 = m370e();
            Rect e3 = m370e();
            mo379a(dVar.f288k, e);
            boolean z = false;
            mo380a(view2, false, e2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m357a(view2, i, e, e3, dVar, measuredWidth, measuredHeight);
            if (!(e3.left == e2.left && e3.top == e2.top)) {
                z = true;
            }
            m355a(dVar, e3, measuredWidth, i2);
            int i3 = e3.left - e2.left;
            int i4 = e3.top - e2.top;
            if (i3 != 0) {
                C0595r.m2253d(view2, i3);
            }
            if (i4 != 0) {
                C0595r.m2250c(view2, i4);
            }
            if (z) {
                Behavior a = dVar.mo468a();
                if (a != null) {
                    a.mo452b(this, view2, dVar.f288k);
                }
            }
            m354a(e);
            m354a(e2);
            m354a(e3);
        }
    }

    /* renamed from: a */
    public C0189d generateLayoutParams(AttributeSet attributeSet) {
        return new C0189d(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0189d generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof C0189d) {
            return new C0189d((C0189d) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0189d((MarginLayoutParams) layoutParams);
        }
        return new C0189d(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0189d generateDefaultLayoutParams() {
        return new C0189d(-2, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0189d) && super.checkLayoutParams(layoutParams);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo381a(view, view2, i, 0);
    }

    /* renamed from: a */
    public boolean mo381a(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0189d dVar = (C0189d) childAt.getLayoutParams();
                Behavior a = dVar.mo468a();
                if (a != null) {
                    boolean a2 = a.mo447a(this, childAt, view, view2, i, i3);
                    boolean z2 = z | a2;
                    dVar.mo470a(i3, a2);
                    z = z2;
                } else {
                    dVar.mo470a(i3, false);
                }
            }
        }
        return z;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo385b(view, view2, i, 0);
    }

    /* renamed from: b */
    public void mo385b(View view, View view2, int i, int i2) {
        this.f274x.mo2087a(view, view2, i, i2);
        this.f267q = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0189d dVar = (C0189d) childAt.getLayoutParams();
            if (dVar.mo478b(i2)) {
                Behavior a = dVar.mo468a();
                if (a != null) {
                    a.mo450b(this, childAt, view, view2, i, i2);
                }
            }
        }
    }

    public void onStopNestedScroll(View view) {
        mo387c(view, 0);
    }

    /* renamed from: c */
    public void mo387c(View view, int i) {
        this.f274x.mo2085a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0189d dVar = (C0189d) childAt.getLayoutParams();
            if (dVar.mo478b(i)) {
                Behavior a = dVar.mo468a();
                if (a != null) {
                    a.mo433a(this, childAt, view, i);
                }
                dVar.mo469a(i);
                dVar.mo483g();
            }
        }
        this.f267q = null;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo376a(view, i, i2, i3, i4, 0);
    }

    /* renamed from: a */
    public void mo376a(View view, int i, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i5;
            } else {
                C0189d dVar = (C0189d) childAt.getLayoutParams();
                int i8 = i5;
                if (dVar.mo478b(i8)) {
                    Behavior a = dVar.mo468a();
                    if (a != null) {
                        a.mo435a(this, childAt, view, i, i2, i3, i4, i8);
                        z = true;
                    }
                }
            }
        }
        if (z) {
            mo373a(1);
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo377a(view, i, i2, iArr, 0);
    }

    /* renamed from: a */
    public void mo377a(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0189d dVar = (C0189d) childAt.getLayoutParams();
                if (dVar.mo478b(i3)) {
                    Behavior a = dVar.mo468a();
                    if (a != null) {
                        int[] iArr2 = this.f261k;
                        this.f261k[1] = 0;
                        iArr2[0] = 0;
                        a.mo437a(this, childAt, view, i, i2, this.f261k, i3);
                        if (i > 0) {
                            i4 = Math.max(i6, this.f261k[0]);
                        } else {
                            i4 = Math.min(i6, this.f261k[0]);
                        }
                        if (i2 > 0) {
                            i5 = Math.max(i7, this.f261k[1]);
                        } else {
                            i5 = Math.min(i7, this.f261k[1]);
                        }
                        i6 = i4;
                        i7 = i5;
                        z = true;
                    }
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo373a(1);
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0189d dVar = (C0189d) childAt.getLayoutParams();
                if (dVar.mo478b(0)) {
                    Behavior a = dVar.mo468a();
                    if (a != null) {
                        z2 |= a.mo445a(this, childAt, view, f, f2, z);
                    }
                }
            }
        }
        if (z2) {
            mo373a(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0189d dVar = (C0189d) childAt.getLayoutParams();
                if (dVar.mo478b(0)) {
                    Behavior a = dVar.mo468a();
                    if (a != null) {
                        z |= a.mo444a(this, childAt, view, f, f2);
                    }
                }
            }
        }
        return z;
    }

    public int getNestedScrollAxes() {
        return this.f274x.mo2083a();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo1845a());
        SparseArray<Parcelable> sparseArray = savedState.f276a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior a = mo369a(childAt).mo468a();
            if (!(id == -1 || a == null)) {
                Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                if (parcelable2 != null) {
                    a.mo432a(this, childAt, parcelable2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior a = ((C0189d) childAt.getLayoutParams()).mo468a();
            if (!(id == -1 || a == null)) {
                Parcelable d = a.mo455d(this, childAt);
                if (d != null) {
                    sparseArray.append(id, d);
                }
            }
        }
        savedState.f276a = sparseArray;
        return savedState;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior a = ((C0189d) view.getLayoutParams()).mo468a();
        if (a == null || !a.mo441a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    /* renamed from: g */
    private void m374g() {
        if (VERSION.SDK_INT >= 21) {
            if (C0595r.m2268q(this)) {
                if (this.f273w == null) {
                    this.f273w = new C0592o() {
                        /* renamed from: a */
                        public C0609z mo427a(View view, C0609z zVar) {
                            return CoordinatorLayout.this.mo371a(zVar);
                        }
                    };
                }
                C0595r.m2241a((View) this, this.f273w);
                setSystemUiVisibility(1280);
            } else {
                C0595r.m2241a((View) this, (C0592o) null);
            }
        }
    }
}
