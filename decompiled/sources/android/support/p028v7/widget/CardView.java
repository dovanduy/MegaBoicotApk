package android.support.p028v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p028v7.p030b.C0734a.C0735a;
import android.support.p028v7.p030b.C0734a.C0736b;
import android.support.p028v7.p030b.C0734a.C0738d;
import android.support.p028v7.p030b.C0734a.C0739e;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.widget.CardView */
public class CardView extends FrameLayout {

    /* renamed from: e */
    private static final int[] f2642e = {16842801};

    /* renamed from: f */
    private static final C1026r f2643f;

    /* renamed from: a */
    int f2644a;

    /* renamed from: b */
    int f2645b;

    /* renamed from: c */
    final Rect f2646c;

    /* renamed from: d */
    final Rect f2647d;

    /* renamed from: g */
    private boolean f2648g;

    /* renamed from: h */
    private boolean f2649h;

    /* renamed from: i */
    private final C1025q f2650i;

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f2643f = new C1022o();
        } else if (VERSION.SDK_INT >= 17) {
            f2643f = new C1020n();
        } else {
            f2643f = new C1023p();
        }
        f2643f.mo5289a();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0735a.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        ColorStateList valueOf;
        super(context, attributeSet, i);
        this.f2646c = new Rect();
        this.f2647d = new Rect();
        this.f2650i = new C1025q() {

            /* renamed from: b */
            private Drawable f2652b;

            /* renamed from: a */
            public void mo3784a(Drawable drawable) {
                this.f2652b = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }

            /* renamed from: a */
            public boolean mo3785a() {
                return CardView.this.getUseCompatPadding();
            }

            /* renamed from: b */
            public boolean mo3786b() {
                return CardView.this.getPreventCornerOverlap();
            }

            /* renamed from: a */
            public void mo3783a(int i, int i2, int i3, int i4) {
                CardView.this.f2647d.set(i, i2, i3, i4);
                CardView.super.setPadding(i + CardView.this.f2646c.left, i2 + CardView.this.f2646c.top, i3 + CardView.this.f2646c.right, i4 + CardView.this.f2646c.bottom);
            }

            /* renamed from: a */
            public void mo3782a(int i, int i2) {
                if (i > CardView.this.f2644a) {
                    CardView.super.setMinimumWidth(i);
                }
                if (i2 > CardView.this.f2645b) {
                    CardView.super.setMinimumHeight(i2);
                }
            }

            /* renamed from: c */
            public Drawable mo3787c() {
                return this.f2652b;
            }

            /* renamed from: d */
            public View mo3788d() {
                return CardView.this;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0739e.CardView, i, C0738d.CardView);
        if (obtainStyledAttributes.hasValue(C0739e.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(C0739e.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f2642e);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(C0736b.cardview_light_background);
            } else {
                i2 = getResources().getColor(C0736b.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C0739e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C0739e.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C0739e.CardView_cardMaxElevation, 0.0f);
        this.f2648g = obtainStyledAttributes.getBoolean(C0739e.CardView_cardUseCompatPadding, false);
        this.f2649h = obtainStyledAttributes.getBoolean(C0739e.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0739e.CardView_contentPadding, 0);
        this.f2646c.left = obtainStyledAttributes.getDimensionPixelSize(C0739e.CardView_contentPaddingLeft, dimensionPixelSize);
        this.f2646c.top = obtainStyledAttributes.getDimensionPixelSize(C0739e.CardView_contentPaddingTop, dimensionPixelSize);
        this.f2646c.right = obtainStyledAttributes.getDimensionPixelSize(C0739e.CardView_contentPaddingRight, dimensionPixelSize);
        this.f2646c.bottom = obtainStyledAttributes.getDimensionPixelSize(C0739e.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f2644a = obtainStyledAttributes.getDimensionPixelSize(C0739e.CardView_android_minWidth, 0);
        this.f2645b = obtainStyledAttributes.getDimensionPixelSize(C0739e.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f2643f.mo5292a(this.f2650i, context, colorStateList, dimension, dimension2, f);
    }

    public boolean getUseCompatPadding() {
        return this.f2648g;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f2648g != z) {
            this.f2648g = z;
            f2643f.mo5301g(this.f2650i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!(f2643f instanceof C1022o)) {
            int mode = MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f2643f.mo5294b(this.f2650i)), MeasureSpec.getSize(i)), mode);
            }
            int mode2 = MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f2643f.mo5296c(this.f2650i)), MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMinimumWidth(int i) {
        this.f2644a = i;
        super.setMinimumWidth(i);
    }

    public void setMinimumHeight(int i) {
        this.f2645b = i;
        super.setMinimumHeight(i);
    }

    public void setCardBackgroundColor(int i) {
        f2643f.mo5293a(this.f2650i, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f2643f.mo5293a(this.f2650i, colorStateList);
    }

    public ColorStateList getCardBackgroundColor() {
        return f2643f.mo5303i(this.f2650i);
    }

    public int getContentPaddingLeft() {
        return this.f2646c.left;
    }

    public int getContentPaddingRight() {
        return this.f2646c.right;
    }

    public int getContentPaddingTop() {
        return this.f2646c.top;
    }

    public int getContentPaddingBottom() {
        return this.f2646c.bottom;
    }

    public void setRadius(float f) {
        f2643f.mo5291a(this.f2650i, f);
    }

    public float getRadius() {
        return f2643f.mo5298d(this.f2650i);
    }

    public void setCardElevation(float f) {
        f2643f.mo5297c(this.f2650i, f);
    }

    public float getCardElevation() {
        return f2643f.mo5299e(this.f2650i);
    }

    public void setMaxCardElevation(float f) {
        f2643f.mo5295b(this.f2650i, f);
    }

    public float getMaxCardElevation() {
        return f2643f.mo5290a(this.f2650i);
    }

    public boolean getPreventCornerOverlap() {
        return this.f2649h;
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f2649h) {
            this.f2649h = z;
            f2643f.mo5302h(this.f2650i);
        }
    }
}
