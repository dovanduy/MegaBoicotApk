package android.support.p028v7.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.p028v7.p030b.C0734a.C0736b;
import android.support.p028v7.p030b.C0734a.C0737c;

/* renamed from: android.support.v7.widget.am */
/* compiled from: RoundRectDrawableWithShadow */
class C0957am extends Drawable {

    /* renamed from: a */
    static C0958a f3134a;

    /* renamed from: b */
    private static final double f3135b = Math.cos(Math.toRadians(45.0d));

    /* renamed from: c */
    private final int f3136c;

    /* renamed from: d */
    private Paint f3137d;

    /* renamed from: e */
    private Paint f3138e;

    /* renamed from: f */
    private Paint f3139f;

    /* renamed from: g */
    private final RectF f3140g;

    /* renamed from: h */
    private float f3141h;

    /* renamed from: i */
    private Path f3142i;

    /* renamed from: j */
    private float f3143j;

    /* renamed from: k */
    private float f3144k;

    /* renamed from: l */
    private float f3145l;

    /* renamed from: m */
    private ColorStateList f3146m;

    /* renamed from: n */
    private boolean f3147n = true;

    /* renamed from: o */
    private final int f3148o;

    /* renamed from: p */
    private final int f3149p;

    /* renamed from: q */
    private boolean f3150q = true;

    /* renamed from: r */
    private boolean f3151r = false;

    /* renamed from: android.support.v7.widget.am$a */
    /* compiled from: RoundRectDrawableWithShadow */
    interface C0958a {
        /* renamed from: a */
        void mo5015a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public int getOpacity() {
        return -3;
    }

    C0957am(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f3148o = resources.getColor(C0736b.cardview_shadow_start_color);
        this.f3149p = resources.getColor(C0736b.cardview_shadow_end_color);
        this.f3136c = resources.getDimensionPixelSize(C0737c.cardview_compat_inset_shadow);
        this.f3137d = new Paint(5);
        m4260b(colorStateList);
        this.f3138e = new Paint(5);
        this.f3138e.setStyle(Style.FILL);
        this.f3141h = (float) ((int) (f + 0.5f));
        this.f3140g = new RectF();
        this.f3139f = new Paint(this.f3138e);
        this.f3139f.setAntiAlias(false);
        m4257a(f2, f3);
    }

    /* renamed from: b */
    private void m4260b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f3146m = colorStateList;
        this.f3137d.setColor(this.f3146m.getColorForState(getState(), this.f3146m.getDefaultColor()));
    }

    /* renamed from: d */
    private int m4262d(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4999a(boolean z) {
        this.f3150q = z;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        this.f3137d.setAlpha(i);
        this.f3138e.setAlpha(i);
        this.f3139f.setAlpha(i);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3147n = true;
    }

    /* renamed from: a */
    private void m4257a(float f, float f2) {
        if (f < 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid shadow size ");
            sb.append(f);
            sb.append(". Must be >= 0");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 < 0.0f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid max shadow size ");
            sb2.append(f2);
            sb2.append(". Must be >= 0");
            throw new IllegalArgumentException(sb2.toString());
        } else {
            float d = (float) m4262d(f);
            float d2 = (float) m4262d(f2);
            if (d > d2) {
                if (!this.f3151r) {
                    this.f3151r = true;
                }
                d = d2;
            }
            if (this.f3145l != d || this.f3143j != d2) {
                this.f3145l = d;
                this.f3143j = d2;
                this.f3144k = (float) ((int) ((d * 1.5f) + ((float) this.f3136c) + 0.5f));
                this.f3147n = true;
                invalidateSelf();
            }
        }
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m4256a(this.f3143j, this.f3141h, this.f3150q));
        int ceil2 = (int) Math.ceil((double) m4259b(this.f3143j, this.f3141h, this.f3150q));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* renamed from: a */
    static float m4256a(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f3135b) * ((double) f2))) : f * 1.5f;
    }

    /* renamed from: b */
    static float m4259b(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f3135b) * ((double) f2))) : f;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.f3146m.getColorForState(iArr, this.f3146m.getDefaultColor());
        if (this.f3137d.getColor() == colorForState) {
            return false;
        }
        this.f3137d.setColor(colorForState);
        this.f3147n = true;
        invalidateSelf();
        return true;
    }

    public boolean isStateful() {
        return (this.f3146m != null && this.f3146m.isStateful()) || super.isStateful();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3137d.setColorFilter(colorFilter);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4996a(float f) {
        if (f < 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid radius ");
            sb.append(f);
            sb.append(". Must be >= 0");
            throw new IllegalArgumentException(sb.toString());
        }
        float f2 = (float) ((int) (f + 0.5f));
        if (this.f3141h != f2) {
            this.f3141h = f2;
            this.f3147n = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.f3147n) {
            m4261b(getBounds());
            this.f3147n = false;
        }
        canvas.translate(0.0f, this.f3145l / 2.0f);
        m4258a(canvas);
        canvas.translate(0.0f, (-this.f3145l) / 2.0f);
        f3134a.mo5015a(canvas, this.f3140g, this.f3141h, this.f3137d);
    }

    /* renamed from: a */
    private void m4258a(Canvas canvas) {
        float f = (-this.f3141h) - this.f3144k;
        float f2 = this.f3141h + ((float) this.f3136c) + (this.f3145l / 2.0f);
        float f3 = 2.0f * f2;
        boolean z = this.f3140g.width() - f3 > 0.0f;
        boolean z2 = this.f3140g.height() - f3 > 0.0f;
        int save = canvas.save();
        canvas.translate(this.f3140g.left + f2, this.f3140g.top + f2);
        canvas.drawPath(this.f3142i, this.f3138e);
        if (z) {
            canvas.drawRect(0.0f, f, this.f3140g.width() - f3, -this.f3141h, this.f3139f);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        canvas.translate(this.f3140g.right - f2, this.f3140g.bottom - f2);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f3142i, this.f3138e);
        if (z) {
            canvas.drawRect(0.0f, f, this.f3140g.width() - f3, (-this.f3141h) + this.f3144k, this.f3139f);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.f3140g.left + f2, this.f3140g.bottom - f2);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f3142i, this.f3138e);
        if (z2) {
            canvas.drawRect(0.0f, f, this.f3140g.height() - f3, -this.f3141h, this.f3139f);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(this.f3140g.right - f2, this.f3140g.top + f2);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f3142i, this.f3138e);
        if (z2) {
            canvas.drawRect(0.0f, f, this.f3140g.height() - f3, -this.f3141h, this.f3139f);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: g */
    private void m4263g() {
        RectF rectF = new RectF(-this.f3141h, -this.f3141h, this.f3141h, this.f3141h);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(-this.f3144k, -this.f3144k);
        if (this.f3142i == null) {
            this.f3142i = new Path();
        } else {
            this.f3142i.reset();
        }
        this.f3142i.setFillType(FillType.EVEN_ODD);
        this.f3142i.moveTo(-this.f3141h, 0.0f);
        this.f3142i.rLineTo(-this.f3144k, 0.0f);
        this.f3142i.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f3142i.arcTo(rectF, 270.0f, -90.0f, false);
        this.f3142i.close();
        float f = this.f3141h / (this.f3141h + this.f3144k);
        Paint paint = this.f3138e;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, this.f3141h + this.f3144k, new int[]{this.f3148o, this.f3148o, this.f3149p}, new float[]{0.0f, f, 1.0f}, TileMode.CLAMP);
        paint.setShader(radialGradient);
        Paint paint2 = this.f3139f;
        LinearGradient linearGradient = new LinearGradient(0.0f, (-this.f3141h) + this.f3144k, 0.0f, (-this.f3141h) - this.f3144k, new int[]{this.f3148o, this.f3148o, this.f3149p}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP);
        paint2.setShader(linearGradient);
        this.f3139f.setAntiAlias(false);
    }

    /* renamed from: b */
    private void m4261b(Rect rect) {
        float f = this.f3143j * 1.5f;
        this.f3140g.set(((float) rect.left) + this.f3143j, ((float) rect.top) + f, ((float) rect.right) - this.f3143j, ((float) rect.bottom) - f);
        m4263g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo4995a() {
        return this.f3141h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4998a(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5001b(float f) {
        m4257a(f, this.f3143j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5003c(float f) {
        m4257a(this.f3145l, f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo5000b() {
        return this.f3145l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo5002c() {
        return this.f3143j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo5004d() {
        return (Math.max(this.f3143j, this.f3141h + ((float) this.f3136c) + (this.f3143j / 2.0f)) * 2.0f) + ((this.f3143j + ((float) this.f3136c)) * 2.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public float mo5006e() {
        return (Math.max(this.f3143j, this.f3141h + ((float) this.f3136c) + ((this.f3143j * 1.5f) / 2.0f)) * 2.0f) + (((this.f3143j * 1.5f) + ((float) this.f3136c)) * 2.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4997a(ColorStateList colorStateList) {
        m4260b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public ColorStateList mo5007f() {
        return this.f3146m;
    }
}
