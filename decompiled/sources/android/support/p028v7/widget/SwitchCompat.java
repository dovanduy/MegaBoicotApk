package android.support.p028v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p017v4.graphics.drawable.C0407a;
import android.support.p017v4.view.C0595r;
import android.support.p017v4.widget.C0663p;
import android.support.p028v7.p029a.C0672a.C0673a;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.support.p028v7.p031c.p032a.C0740a;
import android.support.p028v7.p036f.C0760a;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.ads.AdError;

/* renamed from: android.support.v7.widget.SwitchCompat */
public class SwitchCompat extends CompoundButton {

    /* renamed from: N */
    private static final int[] f2965N = {16842912};

    /* renamed from: c */
    private static final Property<SwitchCompat, Float> f2966c = new Property<SwitchCompat, Float>(Float.class, "thumbPos") {
        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f2980a);
        }

        /* renamed from: a */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    };

    /* renamed from: A */
    private int f2967A;

    /* renamed from: B */
    private int f2968B;

    /* renamed from: C */
    private int f2969C;

    /* renamed from: D */
    private int f2970D;

    /* renamed from: E */
    private int f2971E;

    /* renamed from: F */
    private int f2972F;

    /* renamed from: G */
    private int f2973G;

    /* renamed from: H */
    private final TextPaint f2974H;

    /* renamed from: I */
    private ColorStateList f2975I;

    /* renamed from: J */
    private Layout f2976J;

    /* renamed from: K */
    private Layout f2977K;

    /* renamed from: L */
    private TransformationMethod f2978L;

    /* renamed from: M */
    private final Rect f2979M;

    /* renamed from: a */
    float f2980a;

    /* renamed from: b */
    ObjectAnimator f2981b;

    /* renamed from: d */
    private Drawable f2982d;

    /* renamed from: e */
    private ColorStateList f2983e;

    /* renamed from: f */
    private Mode f2984f;

    /* renamed from: g */
    private boolean f2985g;

    /* renamed from: h */
    private boolean f2986h;

    /* renamed from: i */
    private Drawable f2987i;

    /* renamed from: j */
    private ColorStateList f2988j;

    /* renamed from: k */
    private Mode f2989k;

    /* renamed from: l */
    private boolean f2990l;

    /* renamed from: m */
    private boolean f2991m;

    /* renamed from: n */
    private int f2992n;

    /* renamed from: o */
    private int f2993o;

    /* renamed from: p */
    private int f2994p;

    /* renamed from: q */
    private boolean f2995q;

    /* renamed from: r */
    private CharSequence f2996r;

    /* renamed from: s */
    private CharSequence f2997s;

    /* renamed from: t */
    private boolean f2998t;

    /* renamed from: u */
    private int f2999u;

    /* renamed from: v */
    private int f3000v;

    /* renamed from: w */
    private float f3001w;

    /* renamed from: x */
    private float f3002x;

    /* renamed from: y */
    private VelocityTracker f3003y;

    /* renamed from: z */
    private int f3004z;

    /* renamed from: a */
    private static float m4055a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0673a.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2983e = null;
        this.f2984f = null;
        this.f2985g = false;
        this.f2986h = false;
        this.f2988j = null;
        this.f2989k = null;
        this.f2990l = false;
        this.f2991m = false;
        this.f3003y = VelocityTracker.obtain();
        this.f2979M = new Rect();
        this.f2974H = new TextPaint(1);
        Resources resources = getResources();
        this.f2974H.density = resources.getDisplayMetrics().density;
        C0977ay a = C0977ay.m4367a(context, attributeSet, C0682j.SwitchCompat, i, 0);
        this.f2982d = a.mo5086a(C0682j.SwitchCompat_android_thumb);
        if (this.f2982d != null) {
            this.f2982d.setCallback(this);
        }
        this.f2987i = a.mo5086a(C0682j.SwitchCompat_track);
        if (this.f2987i != null) {
            this.f2987i.setCallback(this);
        }
        this.f2996r = a.mo5092c(C0682j.SwitchCompat_android_textOn);
        this.f2997s = a.mo5092c(C0682j.SwitchCompat_android_textOff);
        this.f2998t = a.mo5088a(C0682j.SwitchCompat_showText, true);
        this.f2992n = a.mo5095e(C0682j.SwitchCompat_thumbTextPadding, 0);
        this.f2993o = a.mo5095e(C0682j.SwitchCompat_switchMinWidth, 0);
        this.f2994p = a.mo5095e(C0682j.SwitchCompat_switchPadding, 0);
        this.f2995q = a.mo5088a(C0682j.SwitchCompat_splitTrack, false);
        ColorStateList e = a.mo5096e(C0682j.SwitchCompat_thumbTint);
        if (e != null) {
            this.f2983e = e;
            this.f2985g = true;
        }
        Mode a2 = C1043w.m4824a(a.mo5084a(C0682j.SwitchCompat_thumbTintMode, -1), null);
        if (this.f2984f != a2) {
            this.f2984f = a2;
            this.f2986h = true;
        }
        if (this.f2985g || this.f2986h) {
            m4062b();
        }
        ColorStateList e2 = a.mo5096e(C0682j.SwitchCompat_trackTint);
        if (e2 != null) {
            this.f2988j = e2;
            this.f2990l = true;
        }
        Mode a3 = C1043w.m4824a(a.mo5084a(C0682j.SwitchCompat_trackTintMode, -1), null);
        if (this.f2989k != a3) {
            this.f2989k = a3;
            this.f2991m = true;
        }
        if (this.f2990l || this.f2991m) {
            m4057a();
        }
        int g = a.mo5099g(C0682j.SwitchCompat_switchTextAppearance, 0);
        if (g != 0) {
            mo4700a(context, g);
        }
        a.mo5087a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3000v = viewConfiguration.getScaledTouchSlop();
        this.f3004z = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: a */
    public void mo4700a(Context context, int i) {
        C0977ay a = C0977ay.m4365a(context, i, C0682j.TextAppearance);
        ColorStateList e = a.mo5096e(C0682j.TextAppearance_android_textColor);
        if (e != null) {
            this.f2975I = e;
        } else {
            this.f2975I = getTextColors();
        }
        int e2 = a.mo5095e(C0682j.TextAppearance_android_textSize, 0);
        if (e2 != 0) {
            float f = (float) e2;
            if (f != this.f2974H.getTextSize()) {
                this.f2974H.setTextSize(f);
                requestLayout();
            }
        }
        m4058a(a.mo5084a(C0682j.TextAppearance_android_typeface, -1), a.mo5084a(C0682j.TextAppearance_android_textStyle, -1));
        if (a.mo5088a(C0682j.TextAppearance_textAllCaps, false)) {
            this.f2978L = new C0760a(getContext());
        } else {
            this.f2978L = null;
        }
        a.mo5087a();
    }

    /* renamed from: a */
    private void m4058a(int i, int i2) {
        Typeface typeface;
        switch (i) {
            case 1:
                typeface = Typeface.SANS_SERIF;
                break;
            case 2:
                typeface = Typeface.SERIF;
                break;
            case 3:
                typeface = Typeface.MONOSPACE;
                break;
            default:
                typeface = null;
                break;
        }
        mo4701a(typeface, i2);
    }

    /* renamed from: a */
    public void mo4701a(Typeface typeface, int i) {
        Typeface typeface2;
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i);
            } else {
                typeface2 = Typeface.create(typeface, i);
            }
            setSwitchTypeface(typeface2);
            int style = ((typeface2 != null ? typeface2.getStyle() : 0) ^ -1) & i;
            TextPaint textPaint = this.f2974H;
            if ((style & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f2974H;
            if ((style & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f2974H.setFakeBoldText(false);
        this.f2974H.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f2974H.getTypeface() != null && !this.f2974H.getTypeface().equals(typeface)) || (this.f2974H.getTypeface() == null && typeface != null)) {
            this.f2974H.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setSwitchPadding(int i) {
        this.f2994p = i;
        requestLayout();
    }

    public int getSwitchPadding() {
        return this.f2994p;
    }

    public void setSwitchMinWidth(int i) {
        this.f2993o = i;
        requestLayout();
    }

    public int getSwitchMinWidth() {
        return this.f2993o;
    }

    public void setThumbTextPadding(int i) {
        this.f2992n = i;
        requestLayout();
    }

    public int getThumbTextPadding() {
        return this.f2992n;
    }

    public void setTrackDrawable(Drawable drawable) {
        if (this.f2987i != null) {
            this.f2987i.setCallback(null);
        }
        this.f2987i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C0740a.m3008b(getContext(), i));
    }

    public Drawable getTrackDrawable() {
        return this.f2987i;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f2988j = colorStateList;
        this.f2990l = true;
        m4057a();
    }

    public ColorStateList getTrackTintList() {
        return this.f2988j;
    }

    public void setTrackTintMode(Mode mode) {
        this.f2989k = mode;
        this.f2991m = true;
        m4057a();
    }

    public Mode getTrackTintMode() {
        return this.f2989k;
    }

    /* renamed from: a */
    private void m4057a() {
        if (this.f2987i == null) {
            return;
        }
        if (this.f2990l || this.f2991m) {
            this.f2987i = this.f2987i.mutate();
            if (this.f2990l) {
                C0407a.m1540a(this.f2987i, this.f2988j);
            }
            if (this.f2991m) {
                C0407a.m1543a(this.f2987i, this.f2989k);
            }
            if (this.f2987i.isStateful()) {
                this.f2987i.setState(getDrawableState());
            }
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        if (this.f2982d != null) {
            this.f2982d.setCallback(null);
        }
        this.f2982d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C0740a.m3008b(getContext(), i));
    }

    public Drawable getThumbDrawable() {
        return this.f2982d;
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f2983e = colorStateList;
        this.f2985g = true;
        m4062b();
    }

    public ColorStateList getThumbTintList() {
        return this.f2983e;
    }

    public void setThumbTintMode(Mode mode) {
        this.f2984f = mode;
        this.f2986h = true;
        m4062b();
    }

    public Mode getThumbTintMode() {
        return this.f2984f;
    }

    /* renamed from: b */
    private void m4062b() {
        if (this.f2982d == null) {
            return;
        }
        if (this.f2985g || this.f2986h) {
            this.f2982d = this.f2982d.mutate();
            if (this.f2985g) {
                C0407a.m1540a(this.f2982d, this.f2983e);
            }
            if (this.f2986h) {
                C0407a.m1543a(this.f2982d, this.f2984f);
            }
            if (this.f2982d.isStateful()) {
                this.f2982d.setState(getDrawableState());
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f2995q = z;
        invalidate();
    }

    public boolean getSplitTrack() {
        return this.f2995q;
    }

    public CharSequence getTextOn() {
        return this.f2996r;
    }

    public void setTextOn(CharSequence charSequence) {
        this.f2996r = charSequence;
        requestLayout();
    }

    public CharSequence getTextOff() {
        return this.f2997s;
    }

    public void setTextOff(CharSequence charSequence) {
        this.f2997s = charSequence;
        requestLayout();
    }

    public void setShowText(boolean z) {
        if (this.f2998t != z) {
            this.f2998t = z;
            requestLayout();
        }
    }

    public boolean getShowText() {
        return this.f2998t;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f2998t) {
            if (this.f2976J == null) {
                this.f2976J = m4056a(this.f2996r);
            }
            if (this.f2977K == null) {
                this.f2977K = m4056a(this.f2997s);
            }
        }
        Rect rect = this.f2979M;
        int i5 = 0;
        if (this.f2982d != null) {
            this.f2982d.getPadding(rect);
            i4 = (this.f2982d.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f2982d.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f2969C = Math.max(this.f2998t ? Math.max(this.f2976J.getWidth(), this.f2977K.getWidth()) + (this.f2992n * 2) : 0, i4);
        if (this.f2987i != null) {
            this.f2987i.getPadding(rect);
            i5 = this.f2987i.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        if (this.f2982d != null) {
            Rect a = C1043w.m4825a(this.f2982d);
            i6 = Math.max(i6, a.left);
            i7 = Math.max(i7, a.right);
        }
        int max = Math.max(this.f2993o, (2 * this.f2969C) + i6 + i7);
        int max2 = Math.max(i5, i3);
        this.f2967A = max;
        this.f2968B = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f2996r : this.f2997s;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* renamed from: a */
    private Layout m4056a(CharSequence charSequence) {
        if (this.f2978L != null) {
            charSequence = this.f2978L.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        StaticLayout staticLayout = new StaticLayout(charSequence2, this.f2974H, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, this.f2974H)) : 0, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        return staticLayout;
    }

    /* renamed from: a */
    private boolean m4061a(float f, float f2) {
        boolean z = false;
        if (this.f2982d == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f2982d.getPadding(this.f2979M);
        int i = this.f2971E - this.f3000v;
        int i2 = (this.f2970D + thumbOffset) - this.f3000v;
        int i3 = this.f2969C + i2 + this.f2979M.left + this.f2979M.right + this.f3000v;
        int i4 = this.f2973G + this.f3000v;
        if (f > ((float) i2) && f < ((float) i3) && f2 > ((float) i) && f2 < ((float) i4)) {
            z = true;
        }
        return z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f3003y.addMovement(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (isEnabled() && m4061a(x, y)) {
                    this.f2999u = 1;
                    this.f3001w = x;
                    this.f3002x = y;
                    break;
                }
            case 1:
            case 3:
                if (this.f2999u != 2) {
                    this.f2999u = 0;
                    this.f3003y.clear();
                    break;
                } else {
                    m4063b(motionEvent);
                    super.onTouchEvent(motionEvent);
                    return true;
                }
            case 2:
                switch (this.f2999u) {
                    case 1:
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.abs(x2 - this.f3001w) > ((float) this.f3000v) || Math.abs(y2 - this.f3002x) > ((float) this.f3000v)) {
                            this.f2999u = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f3001w = x2;
                            this.f3002x = y2;
                            return true;
                        }
                    case 2:
                        float x3 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f = x3 - this.f3001w;
                        float f2 = thumbScrollRange != 0 ? f / ((float) thumbScrollRange) : f > 0.0f ? 1.0f : -1.0f;
                        if (C0994bg.m4486a(this)) {
                            f2 = -f2;
                        }
                        float a = m4055a(this.f2980a + f2, 0.0f, 1.0f);
                        if (a != this.f2980a) {
                            this.f3001w = x3;
                            setThumbPosition(a);
                        }
                        return true;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private void m4059a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: b */
    private void m4063b(MotionEvent motionEvent) {
        boolean z;
        this.f2999u = 0;
        boolean z2 = true;
        boolean z3 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z3) {
            this.f3003y.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE);
            float xVelocity = this.f3003y.getXVelocity();
            if (Math.abs(xVelocity) > ((float) this.f3004z)) {
                if (!C0994bg.m4486a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z2 = false;
                }
                z = z2;
            } else {
                z = getTargetCheckedState();
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m4059a(motionEvent);
    }

    /* renamed from: a */
    private void m4060a(boolean z) {
        this.f2981b = ObjectAnimator.ofFloat(this, f2966c, new float[]{z ? 1.0f : 0.0f});
        this.f2981b.setDuration(250);
        if (VERSION.SDK_INT >= 18) {
            this.f2981b.setAutoCancel(true);
        }
        this.f2981b.start();
    }

    /* renamed from: c */
    private void m4064c() {
        if (this.f2981b != null) {
            this.f2981b.cancel();
        }
    }

    private boolean getTargetCheckedState() {
        return this.f2980a > 0.5f;
    }

    /* access modifiers changed from: 0000 */
    public void setThumbPosition(float f) {
        this.f2980a = f;
        invalidate();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !C0595r.m2274w(this)) {
            m4064c();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        m4060a(isChecked);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.f2982d != null) {
            Rect rect = this.f2979M;
            if (this.f2987i != null) {
                this.f2987i.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect a = C1043w.m4825a(this.f2982d);
            int max = Math.max(0, a.left - rect.left);
            i5 = Math.max(0, a.right - rect.right);
            i10 = max;
        } else {
            i5 = 0;
        }
        if (C0994bg.m4486a(this)) {
            i7 = getPaddingLeft() + i10;
            i6 = ((this.f2967A + i7) - i10) - i5;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i5;
            i7 = (i6 - this.f2967A) + i10 + i5;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i9 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (this.f2968B / 2);
            i8 = this.f2968B + i9;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i8 = this.f2968B + i9;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f2968B;
        }
        this.f2970D = i7;
        this.f2971E = i9;
        this.f2973G = i8;
        this.f2972F = i6;
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f2979M;
        int i3 = this.f2970D;
        int i4 = this.f2971E;
        int i5 = this.f2972F;
        int i6 = this.f2973G;
        int thumbOffset = getThumbOffset() + i3;
        if (this.f2982d != null) {
            rect = C1043w.m4825a(this.f2982d);
        } else {
            rect = C1043w.f3446a;
        }
        if (this.f2987i != null) {
            this.f2987i.getPadding(rect2);
            thumbOffset += rect2.left;
            if (rect != null) {
                if (rect.left > rect2.left) {
                    i3 += rect.left - rect2.left;
                }
                i = rect.top > rect2.top ? (rect.top - rect2.top) + i4 : i4;
                if (rect.right > rect2.right) {
                    i5 -= rect.right - rect2.right;
                }
                if (rect.bottom > rect2.bottom) {
                    i2 = i6 - (rect.bottom - rect2.bottom);
                    this.f2987i.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f2987i.setBounds(i3, i, i5, i2);
        }
        if (this.f2982d != null) {
            this.f2982d.getPadding(rect2);
            int i7 = thumbOffset - rect2.left;
            int i8 = thumbOffset + this.f2969C + rect2.right;
            this.f2982d.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0407a.m1539a(background, i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f2979M;
        Drawable drawable = this.f2987i;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f2971E + rect.top;
        int i3 = this.f2973G - rect.bottom;
        Drawable drawable2 = this.f2982d;
        if (drawable != null) {
            if (!this.f2995q || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect a = C1043w.m4825a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a.left;
                rect.right -= a.right;
                int save = canvas.save();
                canvas.clipRect(rect, Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f2976J : this.f2977K;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            if (this.f2975I != null) {
                this.f2974H.setColor(this.f2975I.getColorForState(drawableState, 0));
            }
            this.f2974H.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i2 + i3) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public int getCompoundPaddingLeft() {
        if (!C0994bg.m4486a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f2967A;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingLeft += this.f2994p;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C0994bg.m4486a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f2967A;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingRight += this.f2994p;
        }
        return compoundPaddingRight;
    }

    private int getThumbOffset() {
        float f;
        if (C0994bg.m4486a(this)) {
            f = 1.0f - this.f2980a;
        } else {
            f = this.f2980a;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        if (this.f2987i == null) {
            return 0;
        }
        Rect rect2 = this.f2979M;
        this.f2987i.getPadding(rect2);
        if (this.f2982d != null) {
            rect = C1043w.m4825a(this.f2982d);
        } else {
            rect = C1043w.f3446a;
        }
        return ((((this.f2967A - this.f2969C) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f2965N);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2982d;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f2987i;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        if (this.f2982d != null) {
            C0407a.m1537a(this.f2982d, f, f2);
        }
        if (this.f2987i != null) {
            C0407a.m1537a(this.f2987i, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2982d || drawable == this.f2987i;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f2982d != null) {
            this.f2982d.jumpToCurrentState();
        }
        if (this.f2987i != null) {
            this.f2987i.jumpToCurrentState();
        }
        if (this.f2981b != null && this.f2981b.isStarted()) {
            this.f2981b.end();
            this.f2981b = null;
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f2996r : this.f2997s;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0663p.m2621a((TextView) this, callback));
    }
}
