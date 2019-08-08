package android.support.p028v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p028v7.p029a.C0672a.C0682j;
import android.support.p028v7.view.C0762b;
import android.support.p028v7.view.C0762b.C0763a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: android.support.v7.app.ActionBar */
public abstract class ActionBar {

    /* renamed from: android.support.v7.app.ActionBar$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: a */
        public int f1778a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1778a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0682j.ActionBarLayout);
            this.f1778a = obtainStyledAttributes.getInt(C0682j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f1778a = 0;
            this.f1778a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1778a = 0;
            this.f1778a = layoutParams.f1778a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1778a = 0;
        }
    }

    /* renamed from: android.support.v7.app.ActionBar$a */
    public interface C0683a {
        /* renamed from: a */
        void mo2589a(boolean z);
    }

    @Deprecated
    /* renamed from: android.support.v7.app.ActionBar$b */
    public static abstract class C0684b {
        /* renamed from: a */
        public abstract Drawable mo2590a();

        /* renamed from: b */
        public abstract CharSequence mo2591b();

        /* renamed from: c */
        public abstract View mo2592c();

        /* renamed from: d */
        public abstract void mo2593d();

        /* renamed from: e */
        public abstract CharSequence mo2594e();
    }

    /* renamed from: a */
    public abstract int mo2571a();

    /* renamed from: a */
    public C0762b mo2572a(C0763a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo2574a(Configuration configuration) {
    }

    /* renamed from: a */
    public void mo2575a(CharSequence charSequence) {
    }

    /* renamed from: a */
    public void mo2576a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo2577a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: a */
    public boolean mo2578a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public Context mo2579b() {
        return null;
    }

    /* renamed from: c */
    public void mo2581c(boolean z) {
    }

    /* renamed from: c */
    public boolean mo2582c() {
        return false;
    }

    /* renamed from: d */
    public void mo2583d(boolean z) {
    }

    /* renamed from: d */
    public boolean mo2584d() {
        return false;
    }

    /* renamed from: e */
    public void mo2585e(boolean z) {
    }

    /* renamed from: e */
    public boolean mo2586e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo2587f() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo2588g() {
    }

    /* renamed from: b */
    public void mo2580b(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    /* renamed from: a */
    public void mo2573a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }
}
