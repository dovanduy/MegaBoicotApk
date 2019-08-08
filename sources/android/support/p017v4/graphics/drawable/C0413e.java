package android.support.p017v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.graphics.drawable.e */
/* compiled from: WrappedDrawableApi21 */
class C0413e extends C0410d {

    /* renamed from: d */
    private static Method f1044d;

    /* renamed from: android.support.v4.graphics.drawable.e$a */
    /* compiled from: WrappedDrawableApi21 */
    private static class C0414a extends C0411a {
        C0414a(C0411a aVar, Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0413e(this, resources);
        }
    }

    C0413e(Drawable drawable) {
        super(drawable);
        m1562d();
    }

    C0413e(C0411a aVar, Resources resources) {
        super(aVar, resources);
        m1562d();
    }

    public void setHotspot(float f, float f2) {
        this.f1035c.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f1035c.setHotspotBounds(i, i2, i3, i4);
    }

    public void getOutline(Outline outline) {
        this.f1035c.getOutline(outline);
    }

    public Rect getDirtyBounds() {
        return this.f1035c.getDirtyBounds();
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo1437c()) {
            super.setTintList(colorStateList);
        } else {
            this.f1035c.setTintList(colorStateList);
        }
    }

    public void setTint(int i) {
        if (mo1437c()) {
            super.setTint(i);
        } else {
            this.f1035c.setTint(i);
        }
    }

    public void setTintMode(Mode mode) {
        if (mo1437c()) {
            super.setTintMode(mode);
        } else {
            this.f1035c.setTintMode(mode);
        }
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1437c() {
        boolean z = false;
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f1035c;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0411a mo1436b() {
        return new C0414a(this.f1034b, null);
    }

    /* renamed from: d */
    private void m1562d() {
        if (f1044d == null) {
            try {
                f1044d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }
}
