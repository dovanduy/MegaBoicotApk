package android.support.p017v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: android.support.v4.graphics.drawable.d */
/* compiled from: WrappedDrawableApi14 */
class C0410d extends Drawable implements Callback, C0408b, C0409c {

    /* renamed from: a */
    static final Mode f1033a = Mode.SRC_IN;

    /* renamed from: b */
    C0411a f1034b;

    /* renamed from: c */
    Drawable f1035c;

    /* renamed from: d */
    private int f1036d;

    /* renamed from: e */
    private Mode f1037e;

    /* renamed from: f */
    private boolean f1038f;

    /* renamed from: g */
    private boolean f1039g;

    /* renamed from: android.support.v4.graphics.drawable.d$a */
    /* compiled from: WrappedDrawableApi14 */
    protected static abstract class C0411a extends ConstantState {

        /* renamed from: a */
        int f1040a;

        /* renamed from: b */
        ConstantState f1041b;

        /* renamed from: c */
        ColorStateList f1042c = null;

        /* renamed from: d */
        Mode f1043d = C0410d.f1033a;

        public abstract Drawable newDrawable(Resources resources);

        C0411a(C0411a aVar, Resources resources) {
            if (aVar != null) {
                this.f1040a = aVar.f1040a;
                this.f1041b = aVar.f1041b;
                this.f1042c = aVar.f1042c;
                this.f1043d = aVar.f1043d;
            }
        }

        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public int getChangingConfigurations() {
            return this.f1040a | (this.f1041b != null ? this.f1041b.getChangingConfigurations() : 0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo1467a() {
            return this.f1041b != null;
        }
    }

    /* renamed from: android.support.v4.graphics.drawable.d$b */
    /* compiled from: WrappedDrawableApi14 */
    private static class C0412b extends C0411a {
        C0412b(C0411a aVar, Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0410d(this, resources);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1437c() {
        return true;
    }

    C0410d(C0411a aVar, Resources resources) {
        this.f1034b = aVar;
        m1555a(resources);
    }

    C0410d(Drawable drawable) {
        this.f1034b = mo1436b();
        mo1435a(drawable);
    }

    /* renamed from: a */
    private void m1555a(Resources resources) {
        if (this.f1034b != null && this.f1034b.f1041b != null) {
            mo1435a(this.f1034b.f1041b.newDrawable(resources));
        }
    }

    public void jumpToCurrentState() {
        this.f1035c.jumpToCurrentState();
    }

    public void draw(Canvas canvas) {
        this.f1035c.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f1035c != null) {
            this.f1035c.setBounds(rect);
        }
    }

    public void setChangingConfigurations(int i) {
        this.f1035c.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | (this.f1034b != null ? this.f1034b.getChangingConfigurations() : 0) | this.f1035c.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.f1035c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1035c.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.f1035c.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1035c.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        ColorStateList colorStateList = (!mo1437c() || this.f1034b == null) ? null : this.f1034b.f1042c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f1035c.isStateful();
    }

    public boolean setState(int[] iArr) {
        return m1556a(iArr) || this.f1035c.setState(iArr);
    }

    public int[] getState() {
        return this.f1035c.getState();
    }

    public Drawable getCurrent() {
        return this.f1035c.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1035c.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.f1035c.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f1035c.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f1035c.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f1035c.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f1035c.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f1035c.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.f1035c.getPadding(rect);
    }

    public void setAutoMirrored(boolean z) {
        this.f1035c.setAutoMirrored(z);
    }

    public boolean isAutoMirrored() {
        return this.f1035c.isAutoMirrored();
    }

    public ConstantState getConstantState() {
        if (this.f1034b == null || !this.f1034b.mo1467a()) {
            return null;
        }
        this.f1034b.f1040a = getChangingConfigurations();
        return this.f1034b;
    }

    public Drawable mutate() {
        if (!this.f1039g && super.mutate() == this) {
            this.f1034b = mo1436b();
            if (this.f1035c != null) {
                this.f1035c.mutate();
            }
            if (this.f1034b != null) {
                this.f1034b.f1041b = this.f1035c != null ? this.f1035c.getConstantState() : null;
            }
            this.f1039g = true;
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0411a mo1436b() {
        return new C0412b(this.f1034b, null);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f1035c.setLevel(i);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1034b.f1042c = colorStateList;
        m1556a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f1034b.f1043d = mode;
        m1556a(getState());
    }

    /* renamed from: a */
    private boolean m1556a(int[] iArr) {
        if (!mo1437c()) {
            return false;
        }
        ColorStateList colorStateList = this.f1034b.f1042c;
        Mode mode = this.f1034b.f1043d;
        if (colorStateList == null || mode == null) {
            this.f1038f = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f1038f && colorForState == this.f1036d && mode == this.f1037e)) {
                setColorFilter(colorForState, mode);
                this.f1036d = colorForState;
                this.f1037e = mode;
                this.f1038f = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Drawable mo1434a() {
        return this.f1035c;
    }

    /* renamed from: a */
    public final void mo1435a(Drawable drawable) {
        if (this.f1035c != null) {
            this.f1035c.setCallback(null);
        }
        this.f1035c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f1034b != null) {
                this.f1034b.f1041b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
