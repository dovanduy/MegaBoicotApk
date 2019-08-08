package android.support.p028v7.p033d.p034a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.p017v4.graphics.drawable.C0407a;

/* renamed from: android.support.v7.d.a.c */
/* compiled from: DrawableWrapper */
public class C0754c extends Drawable implements Callback {

    /* renamed from: a */
    private Drawable f2145a;

    public C0754c(Drawable drawable) {
        mo2908a(drawable);
    }

    public void draw(Canvas canvas) {
        this.f2145a.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f2145a.setBounds(rect);
    }

    public void setChangingConfigurations(int i) {
        this.f2145a.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return this.f2145a.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.f2145a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2145a.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.f2145a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2145a.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        return this.f2145a.isStateful();
    }

    public boolean setState(int[] iArr) {
        return this.f2145a.setState(iArr);
    }

    public int[] getState() {
        return this.f2145a.getState();
    }

    public void jumpToCurrentState() {
        C0407a.m1536a(this.f2145a);
    }

    public Drawable getCurrent() {
        return this.f2145a.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2145a.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.f2145a.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f2145a.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f2145a.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f2145a.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f2145a.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f2145a.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.f2145a.getPadding(rect);
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
        return this.f2145a.setLevel(i);
    }

    public void setAutoMirrored(boolean z) {
        C0407a.m1544a(this.f2145a, z);
    }

    public boolean isAutoMirrored() {
        return C0407a.m1545b(this.f2145a);
    }

    public void setTint(int i) {
        C0407a.m1538a(this.f2145a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0407a.m1540a(this.f2145a, colorStateList);
    }

    public void setTintMode(Mode mode) {
        C0407a.m1543a(this.f2145a, mode);
    }

    public void setHotspot(float f, float f2) {
        C0407a.m1537a(this.f2145a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0407a.m1539a(this.f2145a, i, i2, i3, i4);
    }

    /* renamed from: a */
    public Drawable mo2907a() {
        return this.f2145a;
    }

    /* renamed from: a */
    public void mo2908a(Drawable drawable) {
        if (this.f2145a != null) {
            this.f2145a.setCallback(null);
        }
        this.f2145a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }
}
