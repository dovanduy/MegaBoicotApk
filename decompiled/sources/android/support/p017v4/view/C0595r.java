package android.support.p017v4.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p012a.C0118a.C0122d;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: android.support.v4.view.r */
/* compiled from: ViewCompat */
public class C0595r {

    /* renamed from: a */
    private static final AtomicInteger f1433a = new AtomicInteger(1);

    /* renamed from: b */
    private static Field f1434b = null;

    /* renamed from: c */
    private static boolean f1435c = false;

    /* renamed from: d */
    private static Field f1436d = null;

    /* renamed from: e */
    private static boolean f1437e = false;

    /* renamed from: f */
    private static WeakHashMap<View, String> f1438f = null;

    /* renamed from: g */
    private static WeakHashMap<View, C0602v> f1439g = null;

    /* renamed from: h */
    private static Field f1440h = null;

    /* renamed from: i */
    private static boolean f1441i = false;

    /* renamed from: j */
    private static ThreadLocal<Rect> f1442j;

    /* renamed from: android.support.v4.view.r$a */
    /* compiled from: ViewCompat */
    public interface C0597a {
        /* renamed from: a */
        boolean mo2114a(View view, KeyEvent keyEvent);
    }

    /* renamed from: android.support.v4.view.r$b */
    /* compiled from: ViewCompat */
    static class C0598b {

        /* renamed from: a */
        private static final ArrayList<WeakReference<View>> f1444a = new ArrayList<>();

        /* renamed from: b */
        private WeakHashMap<View, Boolean> f1445b = null;

        /* renamed from: c */
        private SparseArray<WeakReference<View>> f1446c = null;

        /* renamed from: d */
        private WeakReference<KeyEvent> f1447d = null;

        C0598b() {
        }

        /* renamed from: a */
        private SparseArray<WeakReference<View>> m2280a() {
            if (this.f1446c == null) {
                this.f1446c = new SparseArray<>();
            }
            return this.f1446c;
        }

        /* renamed from: a */
        static C0598b m2279a(View view) {
            C0598b bVar = (C0598b) view.getTag(C0122d.tag_unhandled_key_event_manager);
            if (bVar != null) {
                return bVar;
            }
            C0598b bVar2 = new C0598b();
            view.setTag(C0122d.tag_unhandled_key_event_manager, bVar2);
            return bVar2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo2116a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m2282b();
            }
            View b = m2281b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b != null && !KeyEvent.isModifierKey(keyCode)) {
                    m2280a().put(keyCode, new WeakReference(b));
                }
            }
            return b != null;
        }

        /* renamed from: b */
        private View m2281b(View view, KeyEvent keyEvent) {
            if (this.f1445b == null || !this.f1445b.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View b = m2281b(viewGroup.getChildAt(childCount), keyEvent);
                    if (b != null) {
                        return b;
                    }
                }
            }
            if (m2283c(view, keyEvent)) {
                return view;
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo2115a(KeyEvent keyEvent) {
            if (this.f1447d != null && this.f1447d.get() == keyEvent) {
                return false;
            }
            this.f1447d = new WeakReference<>(keyEvent);
            WeakReference weakReference = null;
            SparseArray a = m2280a();
            if (keyEvent.getAction() == 1) {
                int indexOfKey = a.indexOfKey(keyEvent.getKeyCode());
                if (indexOfKey >= 0) {
                    weakReference = (WeakReference) a.valueAt(indexOfKey);
                    a.removeAt(indexOfKey);
                }
            }
            if (weakReference == null) {
                weakReference = (WeakReference) a.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && C0595r.m2276y(view)) {
                m2283c(view, keyEvent);
            }
            return true;
        }

        /* renamed from: c */
        private boolean m2283c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C0122d.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((C0597a) arrayList.get(size)).mo2114a(view, keyEvent)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: b */
        private void m2282b() {
            if (this.f1445b != null) {
                this.f1445b.clear();
            }
            if (!f1444a.isEmpty()) {
                synchronized (f1444a) {
                    if (this.f1445b == null) {
                        this.f1445b = new WeakHashMap<>();
                    }
                    for (int size = f1444a.size() - 1; size >= 0; size--) {
                        View view = (View) ((WeakReference) f1444a.get(size)).get();
                        if (view == null) {
                            f1444a.remove(size);
                        } else {
                            this.f1445b.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f1445b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static Rect m2230a() {
        if (f1442j == null) {
            f1442j = new ThreadLocal<>();
        }
        Rect rect = (Rect) f1442j.get();
        if (rect == null) {
            rect = new Rect();
            f1442j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: a */
    public static void m2240a(View view, C0561a aVar) {
        view.setAccessibilityDelegate(aVar == null ? null : aVar.mo1978a());
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public static int m2229a(View view) {
        if (VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: a */
    public static void m2233a(View view, int i) {
        if (VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    /* renamed from: b */
    public static boolean m2248b(View view) {
        boolean z = false;
        if (f1441i) {
            return false;
        }
        if (f1440h == null) {
            try {
                f1440h = View.class.getDeclaredField("mAccessibilityDelegate");
                f1440h.setAccessible(true);
            } catch (Throwable unused) {
                f1441i = true;
                return false;
            }
        }
        try {
            if (f1440h.get(view) != null) {
                z = true;
            }
            return z;
        } catch (Throwable unused2) {
            f1441i = true;
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m2251c(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: d */
    public static void m2252d(View view) {
        if (VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: a */
    public static void m2235a(View view, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        } else {
            view.postInvalidate(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m2242a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: a */
    public static void m2243a(View view, Runnable runnable, long j) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: e */
    public static int m2254e(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: b */
    public static void m2247b(View view, int i) {
        if (VERSION.SDK_INT >= 19) {
            view.setImportantForAccessibility(i);
        } else if (VERSION.SDK_INT >= 16) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: a */
    public static void m2237a(View view, Paint paint) {
        if (VERSION.SDK_INT >= 17) {
            view.setLayerPaint(paint);
            return;
        }
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }

    /* renamed from: f */
    public static int m2256f(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: g */
    public static ViewParent m2258g(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    /* renamed from: h */
    public static int m2259h(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    /* renamed from: i */
    public static int m2260i(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    /* renamed from: j */
    public static int m2261j(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f1435c) {
            try {
                f1434b = View.class.getDeclaredField("mMinWidth");
                f1434b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1435c = true;
        }
        if (f1434b != null) {
            try {
                return ((Integer) f1434b.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: k */
    public static int m2262k(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f1437e) {
            try {
                f1436d = View.class.getDeclaredField("mMinHeight");
                f1436d.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1437e = true;
        }
        if (f1436d != null) {
            try {
                return ((Integer) f1436d.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: l */
    public static C0602v m2263l(View view) {
        if (f1439g == null) {
            f1439g = new WeakHashMap<>();
        }
        C0602v vVar = (C0602v) f1439g.get(view);
        if (vVar != null) {
            return vVar;
        }
        C0602v vVar2 = new C0602v(view);
        f1439g.put(view, vVar2);
        return vVar2;
    }

    /* renamed from: a */
    public static void m2232a(View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: m */
    public static float m2264m(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: a */
    public static void m2244a(View view, String str) {
        if (VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f1438f == null) {
            f1438f = new WeakHashMap<>();
        }
        f1438f.put(view, str);
    }

    /* renamed from: n */
    public static String m2265n(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        if (f1438f == null) {
            return null;
        }
        return (String) f1438f.get(view);
    }

    /* renamed from: o */
    public static int m2266o(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: p */
    public static void m2267p(View view) {
        if (VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
        } else if (VERSION.SDK_INT >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: q */
    public static boolean m2268q(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: a */
    public static void m2241a(View view, final C0592o oVar) {
        if (VERSION.SDK_INT >= 21) {
            if (oVar == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            view.setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener() {
                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return (WindowInsets) C0609z.m2321a(oVar.mo427a(view, C0609z.m2320a((Object) windowInsets)));
                }
            });
        }
    }

    /* renamed from: a */
    public static C0609z m2231a(View view, C0609z zVar) {
        if (VERSION.SDK_INT < 21) {
            return zVar;
        }
        WindowInsets windowInsets = (WindowInsets) C0609z.m2321a(zVar);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C0609z.m2320a((Object) windowInsets);
    }

    /* renamed from: b */
    public static C0609z m2246b(View view, C0609z zVar) {
        if (VERSION.SDK_INT < 21) {
            return zVar;
        }
        WindowInsets windowInsets = (WindowInsets) C0609z.m2321a(zVar);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (dispatchApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return C0609z.m2320a((Object) windowInsets);
    }

    /* renamed from: r */
    public static boolean m2269r(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: a */
    public static void m2239a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: s */
    public static ColorStateList m2270s(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        return view instanceof C0594q ? ((C0594q) view).getSupportBackgroundTintList() : null;
    }

    /* renamed from: a */
    public static void m2236a(View view, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C0594q) {
            ((C0594q) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: t */
    public static Mode m2271t(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        return view instanceof C0594q ? ((C0594q) view).getSupportBackgroundTintMode() : null;
    }

    /* renamed from: a */
    public static void m2238a(View view, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C0594q) {
            ((C0594q) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: u */
    public static boolean m2272u(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof C0586i) {
            return ((C0586i) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: v */
    public static void m2273v(View view) {
        if (VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof C0586i) {
            ((C0586i) view).stopNestedScroll();
        }
    }

    /* renamed from: w */
    public static boolean m2274w(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: x */
    public static float m2275x(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static void m2250c(View view, int i) {
        if (VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
        } else if (VERSION.SDK_INT >= 21) {
            Rect a = m2230a();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m2255e(view, i);
            if (z && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        } else {
            m2255e(view, i);
        }
    }

    /* renamed from: e */
    private static void m2255e(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m2228B(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m2228B((View) parent);
            }
        }
    }

    /* renamed from: d */
    public static void m2253d(View view, int i) {
        if (VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
        } else if (VERSION.SDK_INT >= 21) {
            Rect a = m2230a();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m2257f(view, i);
            if (z && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        } else {
            m2257f(view, i);
        }
    }

    /* renamed from: f */
    private static void m2257f(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m2228B(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m2228B((View) parent);
            }
        }
    }

    /* renamed from: B */
    private static void m2228B(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: y */
    public static boolean m2276y(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: z */
    public static boolean m2277z(View view) {
        if (VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: a */
    public static void m2234a(View view, int i, int i2) {
        if (VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: A */
    public static Display m2227A(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m2276y(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: a */
    static boolean m2245a(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0598b.m2279a(view).mo2115a(keyEvent);
    }

    /* renamed from: b */
    static boolean m2249b(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0598b.m2279a(view).mo2116a(view, keyEvent);
    }
}
