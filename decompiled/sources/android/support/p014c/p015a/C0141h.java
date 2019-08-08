package android.support.p014c.p015a;

import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.p017v4.graphics.drawable.C0407a;
import android.support.p017v4.graphics.drawable.C0408b;

/* renamed from: android.support.c.a.h */
/* compiled from: VectorDrawableCommon */
abstract class C0141h extends Drawable implements C0408b {

    /* renamed from: c */
    Drawable f136c;

    C0141h() {
    }

    public void setColorFilter(int i, Mode mode) {
        if (this.f136c != null) {
            this.f136c.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public ColorFilter getColorFilter() {
        if (this.f136c != null) {
            return C0407a.m1549e(this.f136c);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.f136c != null) {
            return this.f136c.setLevel(i);
        }
        return super.onLevelChange(i);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f136c != null) {
            this.f136c.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f136c != null) {
            C0407a.m1537a(this.f136c, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f136c != null) {
            C0407a.m1539a(this.f136c, i, i2, i3, i4);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.f136c != null) {
            this.f136c.setFilterBitmap(z);
        }
    }

    public void jumpToCurrentState() {
        if (this.f136c != null) {
            C0407a.m1536a(this.f136c);
        }
    }

    public void applyTheme(Theme theme) {
        if (this.f136c != null) {
            C0407a.m1541a(this.f136c, theme);
        }
    }

    public void clearColorFilter() {
        if (this.f136c != null) {
            this.f136c.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        if (this.f136c != null) {
            return this.f136c.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumWidth() {
        if (this.f136c != null) {
            return this.f136c.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public int getMinimumHeight() {
        if (this.f136c != null) {
            return this.f136c.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        if (this.f136c != null) {
            return this.f136c.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public int[] getState() {
        if (this.f136c != null) {
            return this.f136c.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        if (this.f136c != null) {
            return this.f136c.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void setChangingConfigurations(int i) {
        if (this.f136c != null) {
            this.f136c.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public boolean setState(int[] iArr) {
        if (this.f136c != null) {
            return this.f136c.setState(iArr);
        }
        return super.setState(iArr);
    }
}
