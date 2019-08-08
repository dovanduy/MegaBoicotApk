package android.support.p028v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p017v4.graphics.drawable.C0407a;
import android.support.p017v4.view.C0595r;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: android.support.v7.widget.k */
/* compiled from: AppCompatSeekBarHelper */
class C1016k extends C1015j {

    /* renamed from: a */
    private final SeekBar f3356a;

    /* renamed from: b */
    private Drawable f3357b;

    /* renamed from: c */
    private ColorStateList f3358c = null;

    /* renamed from: d */
    private Mode f3359d = null;

    /* renamed from: e */
    private boolean f3360e = false;

    /* renamed from: f */
    private boolean f3361f = false;

    C1016k(SeekBar seekBar) {
        super(seekBar);
        this.f3356a = seekBar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5255a(AttributeSet attributeSet, int i) {
        super.mo5255a(attributeSet, i);
        C0977ay a = C0977ay.m4367a(this.f3356a.getContext(), attributeSet, C0682j.AppCompatSeekBar, i, 0);
        Drawable b = a.mo5090b(C0682j.AppCompatSeekBar_android_thumb);
        if (b != null) {
            this.f3356a.setThumb(b);
        }
        mo5257a(a.mo5086a(C0682j.AppCompatSeekBar_tickMark));
        if (a.mo5100g(C0682j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f3359d = C1043w.m4824a(a.mo5084a(C0682j.AppCompatSeekBar_tickMarkTintMode, -1), this.f3359d);
            this.f3361f = true;
        }
        if (a.mo5100g(C0682j.AppCompatSeekBar_tickMarkTint)) {
            this.f3358c = a.mo5096e(C0682j.AppCompatSeekBar_tickMarkTint);
            this.f3360e = true;
        }
        a.mo5087a();
        m4615d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5257a(Drawable drawable) {
        if (this.f3357b != null) {
            this.f3357b.setCallback(null);
        }
        this.f3357b = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f3356a);
            C0407a.m1546b(drawable, C0595r.m2256f(this.f3356a));
            if (drawable.isStateful()) {
                drawable.setState(this.f3356a.getDrawableState());
            }
            m4615d();
        }
        this.f3356a.invalidate();
    }

    /* renamed from: d */
    private void m4615d() {
        if (this.f3357b == null) {
            return;
        }
        if (this.f3360e || this.f3361f) {
            this.f3357b = C0407a.m1550f(this.f3357b.mutate());
            if (this.f3360e) {
                C0407a.m1540a(this.f3357b, this.f3358c);
            }
            if (this.f3361f) {
                C0407a.m1543a(this.f3357b, this.f3359d);
            }
            if (this.f3357b.isStateful()) {
                this.f3357b.setState(this.f3356a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5258b() {
        if (this.f3357b != null) {
            this.f3357b.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5259c() {
        Drawable drawable = this.f3357b;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f3356a.getDrawableState())) {
            this.f3356a.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5256a(Canvas canvas) {
        if (this.f3357b != null) {
            int max = this.f3356a.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f3357b.getIntrinsicWidth();
                int intrinsicHeight = this.f3357b.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f3357b.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f3356a.getWidth() - this.f3356a.getPaddingLeft()) - this.f3356a.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f3356a.getPaddingLeft(), (float) (this.f3356a.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f3357b.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
