package android.support.p028v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.al */
/* compiled from: RoundRectDrawable */
class C0956al extends Drawable {

    /* renamed from: a */
    private float f3123a;

    /* renamed from: b */
    private final Paint f3124b;

    /* renamed from: c */
    private final RectF f3125c;

    /* renamed from: d */
    private final Rect f3126d;

    /* renamed from: e */
    private float f3127e;

    /* renamed from: f */
    private boolean f3128f = false;

    /* renamed from: g */
    private boolean f3129g = true;

    /* renamed from: h */
    private ColorStateList f3130h;

    /* renamed from: i */
    private PorterDuffColorFilter f3131i;

    /* renamed from: j */
    private ColorStateList f3132j;

    /* renamed from: k */
    private Mode f3133k = Mode.SRC_IN;

    public int getOpacity() {
        return -3;
    }

    C0956al(ColorStateList colorStateList, float f) {
        this.f3123a = f;
        this.f3124b = new Paint(5);
        m4249b(colorStateList);
        this.f3125c = new RectF();
        this.f3126d = new Rect();
    }

    /* renamed from: b */
    private void m4249b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f3130h = colorStateList;
        this.f3124b.setColor(this.f3130h.getColorForState(getState(), this.f3130h.getDefaultColor()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4981a(float f, boolean z, boolean z2) {
        if (f != this.f3127e || this.f3128f != z || this.f3129g != z2) {
            this.f3127e = f;
            this.f3128f = z;
            this.f3129g = z2;
            m4248a((Rect) null);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo4979a() {
        return this.f3127e;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f3124b;
        if (this.f3131i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f3131i);
            z = true;
        }
        canvas.drawRoundRect(this.f3125c, this.f3123a, this.f3123a, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: a */
    private void m4248a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f3125c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f3126d.set(rect);
        if (this.f3128f) {
            float a = C0957am.m4256a(this.f3127e, this.f3123a, this.f3129g);
            this.f3126d.inset((int) Math.ceil((double) C0957am.m4259b(this.f3127e, this.f3123a, this.f3129g)), (int) Math.ceil((double) a));
            this.f3125c.set(this.f3126d);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m4248a(rect);
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f3126d, this.f3123a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4980a(float f) {
        if (f != this.f3123a) {
            this.f3123a = f;
            m4248a((Rect) null);
            invalidateSelf();
        }
    }

    public void setAlpha(int i) {
        this.f3124b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3124b.setColorFilter(colorFilter);
    }

    /* renamed from: b */
    public float mo4983b() {
        return this.f3123a;
    }

    /* renamed from: a */
    public void mo4982a(ColorStateList colorStateList) {
        m4249b(colorStateList);
        invalidateSelf();
    }

    /* renamed from: c */
    public ColorStateList mo4984c() {
        return this.f3130h;
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f3132j = colorStateList;
        this.f3131i = m4247a(this.f3132j, this.f3133k);
        invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        this.f3133k = mode;
        this.f3131i = m4247a(this.f3132j, this.f3133k);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.f3130h.getColorForState(iArr, this.f3130h.getDefaultColor());
        boolean z = colorForState != this.f3124b.getColor();
        if (z) {
            this.f3124b.setColor(colorForState);
        }
        if (this.f3132j == null || this.f3133k == null) {
            return z;
        }
        this.f3131i = m4247a(this.f3132j, this.f3133k);
        return true;
    }

    public boolean isStateful() {
        return (this.f3132j != null && this.f3132j.isStateful()) || (this.f3130h != null && this.f3130h.isStateful()) || super.isStateful();
    }

    /* renamed from: a */
    private PorterDuffColorFilter m4247a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
