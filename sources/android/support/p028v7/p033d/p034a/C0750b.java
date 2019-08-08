package android.support.p028v7.p033d.p034a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.support.p017v4.graphics.drawable.C0407a;
import android.util.SparseArray;

/* renamed from: android.support.v7.d.a.b */
/* compiled from: DrawableContainer */
class C0750b extends Drawable implements Callback {

    /* renamed from: a */
    private C0753b f2095a;

    /* renamed from: b */
    private Rect f2096b;

    /* renamed from: c */
    private Drawable f2097c;

    /* renamed from: d */
    private Drawable f2098d;

    /* renamed from: e */
    private int f2099e = 255;

    /* renamed from: f */
    private boolean f2100f;

    /* renamed from: g */
    private int f2101g = -1;

    /* renamed from: h */
    private int f2102h = -1;

    /* renamed from: i */
    private boolean f2103i;

    /* renamed from: j */
    private Runnable f2104j;

    /* renamed from: k */
    private long f2105k;

    /* renamed from: l */
    private long f2106l;

    /* renamed from: m */
    private C0752a f2107m;

    /* renamed from: android.support.v7.d.a.b$a */
    /* compiled from: DrawableContainer */
    static class C0752a implements Callback {

        /* renamed from: a */
        private Callback f2109a;

        public void invalidateDrawable(Drawable drawable) {
        }

        C0752a() {
        }

        /* renamed from: a */
        public C0752a mo2878a(Callback callback) {
            this.f2109a = callback;
            return this;
        }

        /* renamed from: a */
        public Callback mo2877a() {
            Callback callback = this.f2109a;
            this.f2109a = null;
            return callback;
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            if (this.f2109a != null) {
                this.f2109a.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            if (this.f2109a != null) {
                this.f2109a.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: android.support.v7.d.a.b$b */
    /* compiled from: DrawableContainer */
    static abstract class C0753b extends ConstantState {

        /* renamed from: A */
        boolean f2110A;

        /* renamed from: B */
        int f2111B;

        /* renamed from: C */
        int f2112C;

        /* renamed from: D */
        int f2113D;

        /* renamed from: E */
        boolean f2114E;

        /* renamed from: F */
        ColorFilter f2115F;

        /* renamed from: G */
        boolean f2116G;

        /* renamed from: H */
        ColorStateList f2117H;

        /* renamed from: I */
        Mode f2118I;

        /* renamed from: J */
        boolean f2119J;

        /* renamed from: K */
        boolean f2120K;

        /* renamed from: c */
        final C0750b f2121c;

        /* renamed from: d */
        Resources f2122d;

        /* renamed from: e */
        int f2123e = 160;

        /* renamed from: f */
        int f2124f;

        /* renamed from: g */
        int f2125g;

        /* renamed from: h */
        SparseArray<ConstantState> f2126h;

        /* renamed from: i */
        Drawable[] f2127i;

        /* renamed from: j */
        int f2128j;

        /* renamed from: k */
        boolean f2129k;

        /* renamed from: l */
        boolean f2130l;

        /* renamed from: m */
        Rect f2131m;

        /* renamed from: n */
        boolean f2132n;

        /* renamed from: o */
        boolean f2133o;

        /* renamed from: p */
        int f2134p;

        /* renamed from: q */
        int f2135q;

        /* renamed from: r */
        int f2136r;

        /* renamed from: s */
        int f2137s;

        /* renamed from: t */
        boolean f2138t;

        /* renamed from: u */
        int f2139u;

        /* renamed from: v */
        boolean f2140v;

        /* renamed from: w */
        boolean f2141w;

        /* renamed from: x */
        boolean f2142x;

        /* renamed from: y */
        boolean f2143y;

        /* renamed from: z */
        boolean f2144z;

        C0753b(C0753b bVar, C0750b bVar2, Resources resources) {
            this.f2129k = false;
            this.f2132n = false;
            this.f2144z = true;
            this.f2112C = 0;
            this.f2113D = 0;
            this.f2121c = bVar2;
            Resources resources2 = resources != null ? resources : bVar != null ? bVar.f2122d : null;
            this.f2122d = resources2;
            this.f2123e = C0750b.m3047a(resources, bVar != null ? bVar.f2123e : 0);
            if (bVar != null) {
                this.f2124f = bVar.f2124f;
                this.f2125g = bVar.f2125g;
                this.f2142x = true;
                this.f2143y = true;
                this.f2129k = bVar.f2129k;
                this.f2132n = bVar.f2132n;
                this.f2144z = bVar.f2144z;
                this.f2110A = bVar.f2110A;
                this.f2111B = bVar.f2111B;
                this.f2112C = bVar.f2112C;
                this.f2113D = bVar.f2113D;
                this.f2114E = bVar.f2114E;
                this.f2115F = bVar.f2115F;
                this.f2116G = bVar.f2116G;
                this.f2117H = bVar.f2117H;
                this.f2118I = bVar.f2118I;
                this.f2119J = bVar.f2119J;
                this.f2120K = bVar.f2120K;
                if (bVar.f2123e == this.f2123e) {
                    if (bVar.f2130l) {
                        this.f2131m = new Rect(bVar.f2131m);
                        this.f2130l = true;
                    }
                    if (bVar.f2133o) {
                        this.f2134p = bVar.f2134p;
                        this.f2135q = bVar.f2135q;
                        this.f2136r = bVar.f2136r;
                        this.f2137s = bVar.f2137s;
                        this.f2133o = true;
                    }
                }
                if (bVar.f2138t) {
                    this.f2139u = bVar.f2139u;
                    this.f2138t = true;
                }
                if (bVar.f2140v) {
                    this.f2141w = bVar.f2141w;
                    this.f2140v = true;
                }
                Drawable[] drawableArr = bVar.f2127i;
                this.f2127i = new Drawable[drawableArr.length];
                this.f2128j = bVar.f2128j;
                SparseArray<ConstantState> sparseArray = bVar.f2126h;
                if (sparseArray != null) {
                    this.f2126h = sparseArray.clone();
                } else {
                    this.f2126h = new SparseArray<>(this.f2128j);
                }
                int i = this.f2128j;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f2126h.put(i2, constantState);
                        } else {
                            this.f2127i[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f2127i = new Drawable[10];
            this.f2128j = 0;
        }

        public int getChangingConfigurations() {
            return this.f2124f | this.f2125g;
        }

        /* renamed from: a */
        public final int mo2882a(Drawable drawable) {
            int i = this.f2128j;
            if (i >= this.f2127i.length) {
                mo2896e(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f2121c);
            this.f2127i[i] = drawable;
            this.f2128j++;
            this.f2125g = drawable.getChangingConfigurations() | this.f2125g;
            mo2887b();
            this.f2131m = null;
            this.f2130l = false;
            this.f2133o = false;
            this.f2142x = false;
            return i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo2887b() {
            this.f2138t = false;
            this.f2140v = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final int mo2889c() {
            return this.f2127i.length;
        }

        /* renamed from: o */
        private void m3059o() {
            if (this.f2126h != null) {
                int size = this.f2126h.size();
                for (int i = 0; i < size; i++) {
                    this.f2127i[this.f2126h.keyAt(i)] = m3058b(((ConstantState) this.f2126h.valueAt(i)).newDrawable(this.f2122d));
                }
                this.f2126h = null;
            }
        }

        /* renamed from: b */
        private Drawable m3058b(Drawable drawable) {
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f2111B);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f2121c);
            return mutate;
        }

        /* renamed from: d */
        public final int mo2892d() {
            return this.f2128j;
        }

        /* renamed from: b */
        public final Drawable mo2886b(int i) {
            Drawable drawable = this.f2127i[i];
            if (drawable != null) {
                return drawable;
            }
            if (this.f2126h != null) {
                int indexOfKey = this.f2126h.indexOfKey(i);
                if (indexOfKey >= 0) {
                    Drawable b = m3058b(((ConstantState) this.f2126h.valueAt(indexOfKey)).newDrawable(this.f2122d));
                    this.f2127i[i] = b;
                    this.f2126h.removeAt(indexOfKey);
                    if (this.f2126h.size() == 0) {
                        this.f2126h = null;
                    }
                    return b;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final boolean mo2894d(int i, int i2) {
            int i3 = this.f2128j;
            Drawable[] drawableArr = this.f2127i;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f2111B = i;
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2884a(Resources resources) {
            if (resources != null) {
                this.f2122d = resources;
                int a = C0750b.m3047a(resources, this.f2123e);
                int i = this.f2123e;
                this.f2123e = a;
                if (i != a) {
                    this.f2133o = false;
                    this.f2130l = false;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2883a(Theme theme) {
            if (theme != null) {
                m3059o();
                int i = this.f2128j;
                Drawable[] drawableArr = this.f2127i;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f2125g |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo2884a(theme.getResources());
            }
        }

        public boolean canApplyTheme() {
            int i = this.f2128j;
            Drawable[] drawableArr = this.f2127i;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    ConstantState constantState = (ConstantState) this.f2126h.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2859a() {
            int i = this.f2128j;
            Drawable[] drawableArr = this.f2127i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    drawableArr[i2].mutate();
                }
            }
            this.f2110A = true;
        }

        /* renamed from: a */
        public final void mo2885a(boolean z) {
            this.f2129k = z;
        }

        /* renamed from: e */
        public final Rect mo2895e() {
            if (this.f2129k) {
                return null;
            }
            if (this.f2131m != null || this.f2130l) {
                return this.f2131m;
            }
            m3059o();
            Rect rect = new Rect();
            int i = this.f2128j;
            Drawable[] drawableArr = this.f2127i;
            Rect rect2 = null;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect)) {
                    if (rect2 == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    if (rect.left > rect2.left) {
                        rect2.left = rect.left;
                    }
                    if (rect.top > rect2.top) {
                        rect2.top = rect.top;
                    }
                    if (rect.right > rect2.right) {
                        rect2.right = rect.right;
                    }
                    if (rect.bottom > rect2.bottom) {
                        rect2.bottom = rect.bottom;
                    }
                }
            }
            this.f2130l = true;
            this.f2131m = rect2;
            return rect2;
        }

        /* renamed from: b */
        public final void mo2888b(boolean z) {
            this.f2132n = z;
        }

        /* renamed from: f */
        public final boolean mo2897f() {
            return this.f2132n;
        }

        /* renamed from: g */
        public final int mo2898g() {
            if (!this.f2133o) {
                mo2903k();
            }
            return this.f2134p;
        }

        /* renamed from: h */
        public final int mo2900h() {
            if (!this.f2133o) {
                mo2903k();
            }
            return this.f2135q;
        }

        /* renamed from: i */
        public final int mo2901i() {
            if (!this.f2133o) {
                mo2903k();
            }
            return this.f2136r;
        }

        /* renamed from: j */
        public final int mo2902j() {
            if (!this.f2133o) {
                mo2903k();
            }
            return this.f2137s;
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo2903k() {
            this.f2133o = true;
            m3059o();
            int i = this.f2128j;
            Drawable[] drawableArr = this.f2127i;
            this.f2135q = -1;
            this.f2134p = -1;
            this.f2137s = 0;
            this.f2136r = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f2134p) {
                    this.f2134p = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f2135q) {
                    this.f2135q = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f2136r) {
                    this.f2136r = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f2137s) {
                    this.f2137s = minimumHeight;
                }
            }
        }

        /* renamed from: c */
        public final void mo2890c(int i) {
            this.f2112C = i;
        }

        /* renamed from: d */
        public final void mo2893d(int i) {
            this.f2113D = i;
        }

        /* renamed from: l */
        public final int mo2904l() {
            if (this.f2138t) {
                return this.f2139u;
            }
            m3059o();
            int i = this.f2128j;
            Drawable[] drawableArr = this.f2127i;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f2139u = opacity;
            this.f2138t = true;
            return opacity;
        }

        /* renamed from: m */
        public final boolean mo2905m() {
            if (this.f2140v) {
                return this.f2141w;
            }
            m3059o();
            int i = this.f2128j;
            Drawable[] drawableArr = this.f2127i;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f2141w = z;
            this.f2140v = true;
            return z;
        }

        /* renamed from: e */
        public void mo2896e(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f2127i, 0, drawableArr, 0, i);
            this.f2127i = drawableArr;
        }

        /* renamed from: n */
        public synchronized boolean mo2906n() {
            if (this.f2142x) {
                return this.f2143y;
            }
            m3059o();
            this.f2142x = true;
            int i = this.f2128j;
            Drawable[] drawableArr = this.f2127i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f2143y = false;
                    return false;
                }
            }
            this.f2143y = true;
            return true;
        }
    }

    C0750b() {
    }

    public void draw(Canvas canvas) {
        if (this.f2097c != null) {
            this.f2097c.draw(canvas);
        }
        if (this.f2098d != null) {
            this.f2098d.draw(canvas);
        }
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f2095a.getChangingConfigurations();
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(23)
    /* renamed from: a */
    private boolean mo2815a() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect e = this.f2095a.mo2895e();
        if (e != null) {
            rect.set(e);
            z = (e.right | ((e.left | e.top) | e.bottom)) != 0;
        } else {
            z = this.f2097c != null ? this.f2097c.getPadding(rect) : super.getPadding(rect);
        }
        if (mo2815a()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    public void getOutline(Outline outline) {
        if (this.f2097c != null) {
            this.f2097c.getOutline(outline);
        }
    }

    public void setAlpha(int i) {
        if (!this.f2100f || this.f2099e != i) {
            this.f2100f = true;
            this.f2099e = i;
            if (this.f2097c == null) {
                return;
            }
            if (this.f2105k == 0) {
                this.f2097c.setAlpha(i);
            } else {
                mo2870a(false);
            }
        }
    }

    public int getAlpha() {
        return this.f2099e;
    }

    public void setDither(boolean z) {
        if (this.f2095a.f2144z != z) {
            this.f2095a.f2144z = z;
            if (this.f2097c != null) {
                this.f2097c.setDither(this.f2095a.f2144z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2095a.f2116G = true;
        if (this.f2095a.f2115F != colorFilter) {
            this.f2095a.f2115F = colorFilter;
            if (this.f2097c != null) {
                this.f2097c.setColorFilter(colorFilter);
            }
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2095a.f2119J = true;
        if (this.f2095a.f2117H != colorStateList) {
            this.f2095a.f2117H = colorStateList;
            C0407a.m1540a(this.f2097c, colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        this.f2095a.f2120K = true;
        if (this.f2095a.f2118I != mode) {
            this.f2095a.f2118I = mode;
            C0407a.m1543a(this.f2097c, mode);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f2098d != null) {
            this.f2098d.setBounds(rect);
        }
        if (this.f2097c != null) {
            this.f2097c.setBounds(rect);
        }
    }

    public boolean isStateful() {
        return this.f2095a.mo2905m();
    }

    public void setAutoMirrored(boolean z) {
        if (this.f2095a.f2114E != z) {
            this.f2095a.f2114E = z;
            if (this.f2097c != null) {
                C0407a.m1544a(this.f2097c, this.f2095a.f2114E);
            }
        }
    }

    public boolean isAutoMirrored() {
        return this.f2095a.f2114E;
    }

    public void jumpToCurrentState() {
        boolean z;
        if (this.f2098d != null) {
            this.f2098d.jumpToCurrentState();
            this.f2098d = null;
            this.f2102h = -1;
            z = true;
        } else {
            z = false;
        }
        if (this.f2097c != null) {
            this.f2097c.jumpToCurrentState();
            if (this.f2100f) {
                this.f2097c.setAlpha(this.f2099e);
            }
        }
        if (this.f2106l != 0) {
            this.f2106l = 0;
            z = true;
        }
        if (this.f2105k != 0) {
            this.f2105k = 0;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f2097c != null) {
            C0407a.m1537a(this.f2097c, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f2096b == null) {
            this.f2096b = new Rect(i, i2, i3, i4);
        } else {
            this.f2096b.set(i, i2, i3, i4);
        }
        if (this.f2097c != null) {
            C0407a.m1539a(this.f2097c, i, i2, i3, i4);
        }
    }

    public void getHotspotBounds(Rect rect) {
        if (this.f2096b != null) {
            rect.set(this.f2096b);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f2098d != null) {
            return this.f2098d.setState(iArr);
        }
        if (this.f2097c != null) {
            return this.f2097c.setState(iArr);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.f2098d != null) {
            return this.f2098d.setLevel(i);
        }
        if (this.f2097c != null) {
            return this.f2097c.setLevel(i);
        }
        return false;
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f2095a.mo2894d(i, mo2872d());
    }

    public int getIntrinsicWidth() {
        if (this.f2095a.mo2897f()) {
            return this.f2095a.mo2898g();
        }
        return this.f2097c != null ? this.f2097c.getIntrinsicWidth() : -1;
    }

    public int getIntrinsicHeight() {
        if (this.f2095a.mo2897f()) {
            return this.f2095a.mo2900h();
        }
        return this.f2097c != null ? this.f2097c.getIntrinsicHeight() : -1;
    }

    public int getMinimumWidth() {
        if (this.f2095a.mo2897f()) {
            return this.f2095a.mo2901i();
        }
        return this.f2097c != null ? this.f2097c.getMinimumWidth() : 0;
    }

    public int getMinimumHeight() {
        if (this.f2095a.mo2897f()) {
            return this.f2095a.mo2902j();
        }
        return this.f2097c != null ? this.f2097c.getMinimumHeight() : 0;
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.f2095a != null) {
            this.f2095a.mo2887b();
        }
        if (drawable == this.f2097c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f2097c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f2097c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f2098d != null) {
            this.f2098d.setVisible(z, z2);
        }
        if (this.f2097c != null) {
            this.f2097c.setVisible(z, z2);
        }
        return visible;
    }

    public int getOpacity() {
        if (this.f2097c == null || !this.f2097c.isVisible()) {
            return -2;
        }
        return this.f2095a.mo2904l();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo2872d() {
        return this.f2101g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2871a(int i) {
        if (i == this.f2101g) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f2095a.f2113D > 0) {
            if (this.f2098d != null) {
                this.f2098d.setVisible(false, false);
            }
            if (this.f2097c != null) {
                this.f2098d = this.f2097c;
                this.f2102h = this.f2101g;
                this.f2106l = uptimeMillis + ((long) this.f2095a.f2113D);
            } else {
                this.f2098d = null;
                this.f2102h = -1;
                this.f2106l = 0;
            }
        } else if (this.f2097c != null) {
            this.f2097c.setVisible(false, false);
        }
        if (i < 0 || i >= this.f2095a.f2128j) {
            this.f2097c = null;
            this.f2101g = -1;
        } else {
            Drawable b = this.f2095a.mo2886b(i);
            this.f2097c = b;
            this.f2101g = i;
            if (b != null) {
                if (this.f2095a.f2112C > 0) {
                    this.f2105k = uptimeMillis + ((long) this.f2095a.f2112C);
                }
                m3048a(b);
            }
        }
        if (!(this.f2105k == 0 && this.f2106l == 0)) {
            if (this.f2104j == null) {
                this.f2104j = new Runnable() {
                    public void run() {
                        C0750b.this.mo2870a(true);
                        C0750b.this.invalidateSelf();
                    }
                };
            } else {
                unscheduleSelf(this.f2104j);
            }
            mo2870a(true);
        }
        invalidateSelf();
        return true;
    }

    /* renamed from: a */
    private void m3048a(Drawable drawable) {
        if (this.f2107m == null) {
            this.f2107m = new C0752a();
        }
        drawable.setCallback(this.f2107m.mo2878a(drawable.getCallback()));
        try {
            if (this.f2095a.f2112C <= 0 && this.f2100f) {
                drawable.setAlpha(this.f2099e);
            }
            if (this.f2095a.f2116G) {
                drawable.setColorFilter(this.f2095a.f2115F);
            } else {
                if (this.f2095a.f2119J) {
                    C0407a.m1540a(drawable, this.f2095a.f2117H);
                }
                if (this.f2095a.f2120K) {
                    C0407a.m1543a(drawable, this.f2095a.f2118I);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f2095a.f2144z);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f2095a.f2114E);
            }
            Rect rect = this.f2096b;
            if (VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f2107m.mo2877a());
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2870a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f2100f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f2097c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x003f
            long r9 = r13.f2105k
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0041
            long r9 = r13.f2105k
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x0026
            android.graphics.drawable.Drawable r3 = r13.f2097c
            int r9 = r13.f2099e
            r3.setAlpha(r9)
            r13.f2105k = r7
            goto L_0x0041
        L_0x0026:
            long r9 = r13.f2105k
            long r11 = r9 - r1
            long r11 = r11 * r4
            int r3 = (int) r11
            android.support.v7.d.a.b$b r9 = r13.f2095a
            int r9 = r9.f2112C
            int r3 = r3 / r9
            android.graphics.drawable.Drawable r9 = r13.f2097c
            int r3 = 255 - r3
            int r10 = r13.f2099e
            int r3 = r3 * r10
            int r3 = r3 / 255
            r9.setAlpha(r3)
            r3 = r0
            goto L_0x0042
        L_0x003f:
            r13.f2105k = r7
        L_0x0041:
            r3 = r6
        L_0x0042:
            android.graphics.drawable.Drawable r9 = r13.f2098d
            if (r9 == 0) goto L_0x0076
            long r9 = r13.f2106l
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0078
            long r9 = r13.f2106l
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0060
            android.graphics.drawable.Drawable r0 = r13.f2098d
            r0.setVisible(r6, r6)
            r0 = 0
            r13.f2098d = r0
            r0 = -1
            r13.f2102h = r0
            r13.f2106l = r7
            goto L_0x0078
        L_0x0060:
            long r6 = r13.f2106l
            long r8 = r6 - r1
            long r8 = r8 * r4
            int r3 = (int) r8
            android.support.v7.d.a.b$b r4 = r13.f2095a
            int r4 = r4.f2113D
            int r3 = r3 / r4
            android.graphics.drawable.Drawable r4 = r13.f2098d
            int r5 = r13.f2099e
            int r3 = r3 * r5
            int r3 = r3 / 255
            r4.setAlpha(r3)
            goto L_0x0079
        L_0x0076:
            r13.f2106l = r7
        L_0x0078:
            r0 = r3
        L_0x0079:
            if (r14 == 0) goto L_0x0086
            if (r0 == 0) goto L_0x0086
            java.lang.Runnable r14 = r13.f2104j
            r3 = 16
            long r5 = r1 + r3
            r13.scheduleSelf(r14, r5)
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p028v7.p033d.p034a.C0750b.mo2870a(boolean):void");
    }

    public Drawable getCurrent() {
        return this.f2097c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2869a(Resources resources) {
        this.f2095a.mo2884a(resources);
    }

    public void applyTheme(Theme theme) {
        this.f2095a.mo2883a(theme);
    }

    public boolean canApplyTheme() {
        return this.f2095a.canApplyTheme();
    }

    public final ConstantState getConstantState() {
        if (!this.f2095a.mo2906n()) {
            return null;
        }
        this.f2095a.f2124f = getChangingConfigurations();
        return this.f2095a;
    }

    public Drawable mutate() {
        if (!this.f2103i && super.mutate() == this) {
            C0753b c = mo2820c();
            c.mo2859a();
            mo2816a(c);
            this.f2103i = true;
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C0753b mo2820c() {
        return this.f2095a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2816a(C0753b bVar) {
        this.f2095a = bVar;
        if (this.f2101g >= 0) {
            this.f2097c = bVar.mo2886b(this.f2101g);
            if (this.f2097c != null) {
                m3048a(this.f2097c);
            }
        }
        this.f2102h = -1;
        this.f2098d = null;
    }

    /* renamed from: a */
    static int m3047a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }
}
